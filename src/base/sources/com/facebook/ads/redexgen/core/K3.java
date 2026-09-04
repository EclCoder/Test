package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC1854b8 {
    public final /* synthetic */ C1361Ji A00;

    public K3(C1361Ji c1361Ji) {
        this.A00 = c1361Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854b8
    public final void AE7(C1853b7 c1853b7) {
        if (this.A00.A02 != null && c1853b7.A00() != null) {
            this.A00.A02.setImageBitmap(c1853b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
