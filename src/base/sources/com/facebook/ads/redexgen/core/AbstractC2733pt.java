package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2733pt implements AnonymousClass24 {
    public static byte[] A00;
    public static String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", MBridgeConstans.API_REUQEST_CATEGORY_APP, "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final String A02;
    public static final AnonymousClass23<AbstractC2733pt> A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, 77, 127, -114, -95, -106, -101, -108, -127, -90, -99, -110, 103, 77};
    }

    static {
        A07();
        A02 = C5C.A0h(0);
        A03 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pu
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return AbstractC2733pt.A04(bundle);
            }
        };
    }

    public static AbstractC2733pt A04(Bundle bundle) {
        int i10 = bundle.getInt(A02, -1);
        switch (i10) {
            case 0:
                return (AbstractC2733pt) AX.A02.A6f(bundle);
            case 1:
                AbstractC2733pt abstractC2733pt = (AbstractC2733pt) AV.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    return abstractC2733pt;
                }
                break;
            case 2:
                return (AbstractC2733pt) AU.A04.A6f(bundle);
            case 3:
                AnonymousClass24 anonymousClass24A6f = AT.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                    return (AbstractC2733pt) anonymousClass24A6f;
                }
                break;
            default:
                throw new IllegalArgumentException(A06(0, 20, 36) + i10);
        }
        throw new RuntimeException();
    }
}
