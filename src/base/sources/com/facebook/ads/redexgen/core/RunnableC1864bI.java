package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1864bI implements Runnable {
    public final /* synthetic */ LK A00;

    public RunnableC1864bI(LK lk2) {
        this.A00 = lk2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0r();
            this.A00.A0v(1000L);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
