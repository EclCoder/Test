package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_INDEX_URL_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C2198gi c2198gi, AbstractC2363jd abstractC2363jd, boolean z10, O3 o10) {
        if (!C1648Up.A2E(c2198gi)) {
            C1604Sx c1604Sx = new C1604Sx(c2198gi);
            C1470No c1470NoA07 = abstractC2363jd.A29().A0H().A07();
            c1604Sx.A0e(new VI(abstractC2363jd.A2E(), c2198gi.A0A()));
            if (c1470NoA07 == null) {
                o10.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c1470NoA07.A0Y()) {
                o10.AFG();
                return;
            }
            C1600St c1600St = new C1600St(c1470NoA07.A0L(), abstractC2363jd.A1D(), abstractC2363jd.A10());
            c1600St.A04 = true;
            c1600St.A03 = A00(0, 5, 86);
            switch (O2.A00[c1470NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1604Sx.A0Y(c1600St);
                    break;
            }
            c1604Sx.A0c(new C1602Sv(abstractC2363jd.A2C().A01(), -1, -1, abstractC2363jd.A1D(), abstractC2363jd.A10()));
            c1604Sx.A0c(new C1602Sv(c1470NoA07.A0K(), -1, -1, abstractC2363jd.A1D(), abstractC2363jd.A10()));
            O0.A00(abstractC2363jd, c1604Sx, A00(5, 12, 71));
            c1604Sx.A0X(new C2341jA(c2198gi, o10, c1604Sx, c1470NoA07, z10), new C1597Sq(abstractC2363jd.A1D(), abstractC2363jd.A10()));
            return;
        }
        o10.AFG();
    }
}
