#!/bin/bash
set -e
mkdir -p app/
for apk in *.apk; do
  [ -e "$apk" ] || continue

  name="${apk%.apk}"

  echo "=== Decompiling $apk code ==="
  jadx --no-res -d "app/" "$apk"

  echo "=== Decompiling $apk res ==="
  apktool d "$apk" -o "app/" -f --no-src
done

echo "=== Done ==="