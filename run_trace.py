import time
import sys
import os
import subprocess
import frida

PACKAGE_NAME = "com.hecorat.screenrecorder.free"
SCRIPT_FILE = "trace_pairip_advanced.js"

def setup_adb_forward():
    """Chuyển tiếp cổng ADB để kết nối trực tiếp tới Frida Server."""
    print("[*] Forwarding Frida port via ADB...")
    try:
        subprocess.run(["adb", "forward", "tcp:27042", "tcp:27042"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"[-] Failed to setup adb forward: {e}")
        sys.exit(1)

def on_message(message, data):
    """Xử lý các thông điệp trả về từ Frida script."""
    if message['type'] == 'send':
        print(f"[Frida Log] {message['payload']}")
    elif message['type'] == 'error':
        print(f"[Frida Error] {message['stack']}")

def main():
    setup_adb_forward()

    if not os.path.exists(SCRIPT_FILE):
        print(f"[-] Script file '{SCRIPT_FILE}' not found!")
        sys.exit(1)

    with open(SCRIPT_FILE, "r", encoding="utf-8") as f:
        script_code = f.read()

    try:
        print("[*] Connecting to Frida Server on device...")
        device_manager = frida.get_device_manager()
        device = device_manager.add_remote_device("127.0.0.1:27042")

        print(f"[*] Spawning process: {PACKAGE_NAME}...")
        pid = device.spawn([PACKAGE_NAME])
        session = device.attach(pid)

        print("[*] Injecting trace script...")
        script = session.create_script(script_code)
        script.on('message', on_message)
        script.load()

        print("[*] Resuming main thread...")
        device.resume(pid)

        print("[*] Process running. Waiting 30 seconds for PairIP memory decryption...")
        time.sleep(30)

        print("[*] Time elapsed. Detaching session cleanly...")
        session.detach()
        print("[+] Execution finished successfully.")

    except Exception as e:
        print(f"[-] Unexpected Error: {e}")
        sys.exit(1)

if __name__ == "__main__":
    main()
