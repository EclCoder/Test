package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QJ implements InterfaceC1723Xr {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC1723Xr A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public QJ(InterfaceC1723Xr interfaceC1723Xr) {
        this.A02 = interfaceC1723Xr;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AH8(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1723Xr
    public final void AH8(String str) {
        if (AbstractC1725Xt.A0A(str)) {
            A01();
            this.A02.AH8(str);
            return;
        }
        String strA04 = AbstractC1725Xt.A04(str);
        String filtered = this.A01;
        if (strA04.equals(filtered)) {
            this.A00++;
            return;
        }
        A01();
        this.A01 = strA04;
        this.A00 = 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1723Xr
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
