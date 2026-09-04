package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC2086eu {
    public C1235Ek A00;

    public ED(C2198gi c2198gi) {
        super(c2198gi);
    }

    public ED(C2198gi c2198gi, AttributeSet attributeSet, int i10) {
        super(c2198gi, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2086eu
    public final void AAv(C1235Ek c1235Ek) {
        this.A00 = c1235Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2086eu
    public final void AKV(C1235Ek c1235Ek) {
        A08();
        this.A00 = null;
    }

    public C1235Ek getVideoView() {
        return this.A00;
    }
}
