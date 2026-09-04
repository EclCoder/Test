package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1845az implements Runnable {
    public final /* synthetic */ C1846b0 A00;
    public final /* synthetic */ InterfaceC1847b1 A01;

    public RunnableC1845az(C1846b0 c1846b0, InterfaceC1847b1 interfaceC1847b1) {
        this.A00 = c1846b0;
        this.A01 = interfaceC1847b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
