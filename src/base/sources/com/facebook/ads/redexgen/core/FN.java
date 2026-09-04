package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FN implements Runnable {
    public final FM A00;

    public FN(FM fm2) {
        this.A00 = fm2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.AEj();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
