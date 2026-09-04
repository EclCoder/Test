package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass85 extends AbstractC2402kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public AnonymousClass85(C2198gi c2198gi, VA va2, String str, Uri uri, Map<String, String> mExtraData) {
        super(c2198gi, va2, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2402kH
    public final EnumC1447Mq A0H() {
        A0J(this.A00, null);
        return EnumC1447Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, Sdk$SDKError.b.TPAT_ERROR_VALUE);
        }
        return XB.A00(uri);
    }
}
