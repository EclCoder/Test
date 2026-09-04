package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC2419kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2419kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1430Lz A04(M5 m10) {
        return new C1430Lz(this, m10 == null ? A00(0, 4, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE) : m10.A03());
    }
}
