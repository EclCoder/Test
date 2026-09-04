package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    ABI_ARMV7A_NEON("armeabi-v7a-neon"),
    ABI_ARMV7A("armeabi-v7a"),
    ABI_ARM("armeabi"),
    ABI_X86("x86"),
    ABI_X86_64("x86_64"),
    ABI_ARM64_V8A("arm64-v8a"),
    ABI_UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11058a;

    a(String str) {
        this.f11058a = str;
    }

    public String g() {
        return this.f11058a;
    }
}
