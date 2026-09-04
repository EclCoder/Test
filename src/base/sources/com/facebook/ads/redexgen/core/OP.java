package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C2194ge c2194ge) {
        if (A00 == null) {
            A00 = new OO(c2194ge);
        }
        return A00;
    }

    public static void A01(C2194ge c2194ge) {
        if (AbstractC1651Us.A0F(c2194ge)) {
            A03(c2194ge);
        }
    }

    public static void A02(C2194ge c2194ge) {
        if (AbstractC1651Us.A0E(c2194ge)) {
            A03(c2194ge);
        }
    }

    public static void A03(C2194ge c2194ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C2297iN(c2194ge));
        }
    }
}
