package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2801rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2800rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, 25, 56, 49, 60, 36};
    }

    public RunnableC2801rG(C2800rF c2800rF, int i10, Exception exc) {
        this.A01 = c2800rF;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (!C1138Ao.A07 || !this.A01.A0B()) {
                        this.A01.A08(this.A01.A05.ACf());
                        C2800rF.A03(this.A01);
                        if (0 == 0) {
                            int delay = this.A00;
                            this.A01.A04.postDelayed(this.A01.A0C, delay);
                            return;
                        } else {
                            C2800rF.A03(this.A01);
                            throw new NullPointerException(A00(0, 8, 12));
                        }
                    }
                    this.A01.A0F();
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
