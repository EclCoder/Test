package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2416kV implements C5V {
    public MP A02;
    public long A01 = 5242880;
    public int A00 = CacheDataSink.DEFAULT_BUFFER_SIZE;

    public final C2416kV A00(MP mp2) {
        this.A02 = mp2;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5V
    public final C2415kU A5H() {
        return new C2415kU((MP) AbstractC09823y.A01(this.A02), this.A01, this.A00);
    }
}
