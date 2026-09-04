package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10687g extends AbstractC2333j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C10687g(C2198gi c2198gi, O7 o10) {
        super(c2198gi, o10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean zIsEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC2169gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0P() {
        C2380ju c2380ju = (C2380ju) this.A01;
        if (c2380ju.A0R()) {
            N2 n10 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n10 != null) {
                this.A07.A0B(c2380ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0R(N1 n10, C1629Tw c1629Tw, C1627Tu c1627Tu, O8 o10) {
        C2380ju c2380ju = (C2380ju) n10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2330ix c2330ix = new C2330ix(this, o10, c2380ju, jCurrentTimeMillis, c1627Tu);
        A0H().postDelayed(c2330ix, c1629Tw.A05().A05());
        c2380ju.A0L(this.A0B, new C2329iw(this, c2330ix, jCurrentTimeMillis, c1627Tu), this.A09, o10, UK.A0K());
    }
}
