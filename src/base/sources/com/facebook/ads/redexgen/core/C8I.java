package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC2419kY<EnumC1422Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2419kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1430Lz A04(EnumC1422Lr enumC1422Lr) {
        return new C1430Lz(this, enumC1422Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC1422Lr.A03());
    }
}
