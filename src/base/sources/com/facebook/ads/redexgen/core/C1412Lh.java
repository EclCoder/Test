package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1412Lh extends AbstractRunnableC1685Wc {
    public final WeakReference<C2143fp> A00;

    public C1412Lh(C2143fp c2143fp) {
        this.A00 = new WeakReference<>(c2143fp);
    }

    public C1412Lh(WeakReference<C2143fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        C2143fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
