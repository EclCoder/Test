package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2400kE extends AbstractC1450Mt {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C2400kE.class.getSimpleName();
    }

    public C2400kE(C2198gi c2198gi, VA va2, String str, Uri uri) {
        super(c2198gi, va2, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1450Mt
    public final EnumC1447Mq A0G(String str) {
        try {
            X6.A0E(new X6(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC1447Mq.A09;
    }
}
