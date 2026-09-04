package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1905bx implements Runnable {
    public final /* synthetic */ C1381Kc A00;

    public RunnableC1905bx(C1381Kc c1381Kc) {
        this.A00 = c1381Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1911c3) this.A00).A07.A0D() != null) {
                ((AbstractC1911c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
