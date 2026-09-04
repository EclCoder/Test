package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2072eg {
    public static byte[] A09;
    public final C1235Ek A02;
    public final C2302iS A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final E7 A04 = new E7() { // from class: com.facebook.ads.redexgen.X.4R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4F c4f) {
            C2303iT c2303iT = new C2303iT(this.A00.A06, c4f.A03(), c4f.A01(), c4f.A02());
            if (c4f.A00() >= 0.05d) {
                c2303iT.A06(c4f.A01());
            }
            C2072eg.A00(this.A00);
            this.A00.A05.A04(c2303iT);
        }
    };
    public final EA A03 = new EA() { // from class: com.facebook.ads.redexgen.X.4Q
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            if (this.A00.A08) {
                C2072eg c2072eg = this.A00;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c2072eg.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C2072eg(C1235Ek c1235Ek, String str, boolean z10, Map<String, String> map) {
        this.A06 = str;
        this.A02 = c1235Ek;
        this.A07 = map;
        this.A08 = z10;
        this.A05 = new C2302iS(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C2072eg c2072eg) {
        int i10 = c2072eg.A01;
        c2072eg.A01 = i10 + 1;
        return i10;
    }

    public final Map<String, String> A06() {
        String strA01 = C2302iS.A01(this.A05.A03());
        HashMap map = new HashMap();
        if (this.A07 != null) {
            map.putAll(this.A07);
        }
        if (strA01 == null) {
            strA01 = A02(0, 0, 25);
        }
        map.put(A02(22, 6, 33), strA01);
        map.put(A02(11, 11, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), String.valueOf(this.A01));
        int i10 = this.A00 + 1;
        this.A00 = i10;
        map.put(A02(0, 11, 8), String.valueOf(i10));
        return map;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
