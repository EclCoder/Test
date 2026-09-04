package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C1893bl {
    public final ImageView A00;
    public final C2198gi A01;

    public F9(C2198gi c2198gi) {
        super(c2198gi);
        this.A01 = c2198gi;
        setRadius(30);
        this.A00 = new ImageView(c2198gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1853b7 c1853b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        LM lm2 = new LM(this.A00, this.A01);
        lm2.A04();
        lm2.A07(str);
        lm2.A06(new InterfaceC1854b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.core.InterfaceC1854b8
            public final void AE7(C1853b7 c1853b7) {
                this.A00.A00(c1853b7);
            }
        });
    }
}
