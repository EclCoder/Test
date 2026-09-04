package com.facebook.ads.redexgen.core;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2019dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C10074x A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC2019dn(C10074x c10074x) {
        this.A00 = c10074x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00 != null) {
                this.A00.A00.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
