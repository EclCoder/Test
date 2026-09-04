package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1521Pp A00;
    public final YU A01;

    public YS(C2198gi c2198gi, Executor executor, C1629Tw c1629Tw) {
        this.A01 = new YU(c2198gi);
        this.A00 = new C1521Pp(executor, c1629Tw, c2198gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2198gi c2198gi, Executor executor, C1629Tw c1629Tw) {
        if (!C1648Up.A1c(c2198gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c2198gi, executor, c1629Tw);
            A02.A00();
        } else {
            A02.A02(c1629Tw);
        }
    }

    private void A02(C1629Tw c1629Tw) {
        this.A00.A07(c1629Tw);
    }
}
