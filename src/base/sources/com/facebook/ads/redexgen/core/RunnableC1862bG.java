package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1862bG implements Runnable {
    public final /* synthetic */ LK A00;

    public RunnableC1862bG(LK lk2) {
        this.A00 = lk2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() == 0) {
                this.A00.A0t(8);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
