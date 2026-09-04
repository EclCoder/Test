package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2553mx implements HY {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public C2553mx(long j10, long j11, int i10, int i11, boolean z10) {
        this.A05 = j10;
        this.A04 = j11;
        this.A01 = i11 == -1 ? 1 : i11;
        this.A00 = i10;
        this.A06 = z10;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = C.TIME_UNSET;
        } else {
            this.A02 = j10 - j11;
            this.A03 = A01(j10, j11, i10);
        }
    }

    private long A00(long j10) {
        long j11 = (((long) this.A00) * j10) / 8000000;
        long positionOffset = this.A01;
        long j12 = j11 / positionOffset;
        long positionOffset2 = this.A01;
        long positionOffset3 = j12 * positionOffset2;
        if (this.A02 != -1) {
            positionOffset3 = Math.min(positionOffset3, this.A02 - ((long) this.A01));
        }
        long positionOffset4 = Math.max(positionOffset3, 0L);
        long positionOffset5 = this.A04;
        return positionOffset5 + positionOffset4;
    }

    public static long A01(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long A02(long j10) {
        return A01(j10, this.A04, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        if (this.A02 == -1 && !this.A06) {
            return new HX(new HZ(0L, this.A04));
        }
        long jA00 = A00(j10);
        long jA02 = A02(jA00);
        HZ seekPoint = new HZ(jA02, jA00);
        if (this.A02 == -1 || jA02 >= j10 || ((long) this.A01) + jA00 >= this.A05) {
            return new HX(seekPoint);
        }
        long seekTimeUs = ((long) this.A01) + jA00;
        long secondSeekPosition = A02(seekTimeUs);
        return new HX(seekPoint, new HZ(secondSeekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return this.A02 != -1 || this.A06;
    }
}
