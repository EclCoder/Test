Java.perform(function () {
    try {
        var LicenseActivity = Java.use("com.pairip.licensecheck.LicenseActivity");
        LicenseActivity.onCreate.implementation = function (bundle) {
            console.log("[!] Intercepted LicenseActivity! Self-destroying activity...");
            this.finish();
        };
    } catch (e) {}

    try {
        var PackageManager = Java.use("android.app.ApplicationPackageManager");
        PackageManager.getPackageInfo.overload('java.lang.String', 'int').implementation = function (pkn, flags) {
            var packageInfo = this.getPackageInfo(pkn, flags);
            return packageInfo;
        };
    } catch (e) {}
});

var mmap = Module.findExportByName(null, "mmap");
if (mmap) {
    Interceptor.attach(mmap, {
        onLeave: function (retval) {
            try {
                if (retval.toInt32() !== -1) {
                    var magic = Memory.readUtf8String(retval, 4);
                    if (magic === "dex\n") {
                        var size = Memory.readU32(retval.add(32));
                        if (size > 200000) {
                            console.log("\n==================================================");
                            console.log("[+] [PAIRIP UNPACKED SUCCESS] Decrypted DEX in RAM!");
                            console.log("    -> Memory Address : " + retval);
                            console.log("    -> DEX File Size   : " + size + " bytes");
                            
                            var fileName = "/data/local/tmp/pairip_dump_" + retval + ".dex";
                            var file = new File(fileName, "wb");
                            file.write(Memory.readByteArray(retval, size));
                            file.close();
                            console.log("    -> Dumped File to : " + fileName);
                            console.log("==================================================\n");
                        }
                    }
                }
            } catch (e) {}
        }
    });
}
