package com.facebook.ads.redexgen.core;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1956cm implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1361Ji A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 37, 37, 38, 40, 43, 56};
    }

    public ViewOnClickListenerC1956cm(C1361Ji c1361Ji) {
        this.A00 = c1361Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 7, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
            if (this.A00.A0b.A0D() != null) {
                this.A00.A0b.A0D().ACQ();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
