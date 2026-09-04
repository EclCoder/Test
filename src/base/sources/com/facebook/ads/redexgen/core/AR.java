package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C2725pl> A00;
    public final BP<C2723pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public AR(BP<C2723pj> bp2, BP<C2725pl> bp3, int[] iArr) {
        AbstractC09823y.A07(bp2.size() == iArr.length);
        this.A01 = bp2;
        this.A00 = bp3;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i10 = 0; i10 < i; i10++) {
            int[] iArr2 = this.A03;
            int i11 = iArr[i10];
            iArr2[i11] = i10;
        }
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == A0C(z10)) {
            if (i11 == 2) {
                return A0B(z10);
            }
            return -1;
        }
        if (z10) {
            return this.A02[this.A03[i10] + 1];
        }
        return i10 + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z10) {
        if (A0N()) {
            return -1;
        }
        if (!z10) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z10) {
        if (A0N()) {
            return -1;
        }
        if (z10) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2725pl A0I(int i10, C2725pl p10, boolean z10) {
        C2725pl p11 = this.A00.get(i10);
        p10.A0G(p11.A03, p11.A04, p11.A00, p11.A01, p11.A02, p11.A06, p11.A05);
        return p10;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2723pj A0L(int i10, C2723pj c2723pj, long j10) {
        C2723pj c2723pj2 = this.A01.get(i10);
        c2723pj.A07(c2723pj2.A0C, c2723pj2.A09, c2723pj2.A0A, c2723pj2.A06, c2723pj2.A07, c2723pj2.A04, c2723pj2.A0G, c2723pj2.A0D, c2723pj2.A08, c2723pj2.A02, c2723pj2.A03, c2723pj2.A00, c2723pj2.A01, c2723pj2.A05);
        c2723pj.A0F = c2723pj2.A0F;
        return c2723pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i10) {
        throw new UnsupportedOperationException();
    }
}
