package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2126fY implements Runnable {
    public final /* synthetic */ C2129fb A00;

    public RunnableC2126fY(C2129fb c2129fb) {
        this.A00 = c2129fb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
