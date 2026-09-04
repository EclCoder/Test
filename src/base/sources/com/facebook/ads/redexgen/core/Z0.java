package com.facebook.ads.redexgen.core;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class Z0 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ Z2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public Z0(Z2 z10) {
        this.A00 = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A07.getCTAButton().A0E(A00(0, 5, Sdk$SDKError.b.TPAT_ERROR_VALUE));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
