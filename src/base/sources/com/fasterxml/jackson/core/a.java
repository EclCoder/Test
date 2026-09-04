package com.fasterxml.jackson.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    UTF8(C.UTF8_NAME, false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16131c;

    a(String str, boolean z10, int i10) {
        this.f16129a = str;
        this.f16130b = z10;
        this.f16131c = i10;
    }

    public int d() {
        return this.f16131c;
    }

    public String g() {
        return this.f16129a;
    }

    public boolean h() {
        return this.f16130b;
    }
}
