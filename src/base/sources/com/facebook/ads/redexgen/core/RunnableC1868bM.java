package com.facebook.ads.redexgen.core;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1868bM implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C6U A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{12, 1, 29, 5, 12};
    }

    public RunnableC1868bM(C6U c6u) {
        this.A00 = c6u;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA00 = A00(0, 5, 64);
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0U.A0F().AKi();
            ObjectAnimator.ofFloat(this.A00.A0Q, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC1861bF) this.A00).A09, strA00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C1867bL(this));
            duration.start();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
