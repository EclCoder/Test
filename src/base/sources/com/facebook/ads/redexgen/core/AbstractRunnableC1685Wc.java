package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC1685Wc implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<WS> A04;
    public final WQ A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC1685Wc() {
        if (A03.get()) {
            this.A00 = C1690Wh.A01(new C1689Wg(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z10) {
        A03.set(z10);
    }

    public static void A05(boolean z10, WS ws) {
        A02.set(z10);
        A04.set(ws);
    }

    public final WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C1690Wh.A03(this);
            }
            try {
                A07();
            } catch (Throwable th2) {
                if (A02.get()) {
                    AbstractC1692Wj.A00().AAx(3301, th2);
                    WS ws = A04.get();
                    if (ws != null) {
                        ws.AIZ(th2, this);
                    }
                } else {
                    throw th2;
                }
            }
            if (A03.get()) {
                C1690Wh.A04(this);
            }
        } catch (Throwable th3) {
            WU.A00(th3, this);
        }
    }
}
