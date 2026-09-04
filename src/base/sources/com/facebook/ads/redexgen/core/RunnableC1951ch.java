package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1951ch implements Runnable {
    public final /* synthetic */ C1361Ji A00;

    public RunnableC1951ch(C1361Ji c1361Ji) {
        this.A00 = c1361Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A09 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A09.A0A();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
