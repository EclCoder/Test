package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1160Bk {
    public final C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C1160Bk(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new C6());
    }

    public C1160Bk(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, C6 c10) {
        AbstractC09823y.A01(c10);
        AbstractC09823y.A07((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            AbstractC09823y.A07((i10 == 2 || i10 == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i10;
        this.A05 = j10;
        this.A06 = j11;
        this.A04 = j12;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = c10;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
