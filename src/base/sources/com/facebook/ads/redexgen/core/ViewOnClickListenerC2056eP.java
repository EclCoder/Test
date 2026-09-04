package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2056eP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2059eS A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, 15, 5, 2, 0, 19, 5, 18};
    }

    public ViewOnClickListenerC2056eP(C2059eS c2059eS) {
        this.A00 = c2059eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0l == null) {
                return;
            }
            this.A00.A0l.A0E(A00(0, 8, 44));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
