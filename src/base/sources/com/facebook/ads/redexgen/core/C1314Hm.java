package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1314Hm extends AbstractRunnableC1685Wc {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass55 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, 63, 76};
    }

    public C1314Hm(AnonymousClass55 anonymousClass55, C4A c4a) {
        this.A00 = anonymousClass55;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        if (this.A00.A0b.getState() == EnumC2140fm.A02 && this.A00.A0b.getCurrentPositionInMillis() == A00()) {
            this.A00.A0s(A00(0, 22, 104));
        }
    }
}
