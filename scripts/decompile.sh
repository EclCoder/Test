#!/bin/bash
set -e

mkdir -p src/ res/

echo "=== Decompiling base.apk code ==="

jadx --no-res -d "src/base" base.apk || true

echo "=== Decompiling base.apk res ==="
apktool d base.apk -o "res/base" -f --no-src

for apk in split_config.en.apk split_config.vi.apk; do
  if [ -f "$apk" ]; then
    name="${apk%.apk}"

    echo "=== Decompiling $apk res ==="
    apktool d "$apk" -o "res/$name" -f --no-src
  fi
done

for apk in split_config.*dpi.apk; do
  [ -f "$apk" ] || continue

  name="${apk%.apk}"

  echo "=== Decompiling $apk res ==="
  apktool d "$apk" -o "res/$name" -f --no-src
done