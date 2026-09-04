package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2025du implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C09884e A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 41, 36, 37, 47, 16, 44, 33, 57, 34, 33, 35, 43, 5, 50, 50, 47, 50};
    }

    public RunnableC2025du(C09884e c09884e) {
        this.A00 = c09884e;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0Q(A00(0, 18, 81));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
