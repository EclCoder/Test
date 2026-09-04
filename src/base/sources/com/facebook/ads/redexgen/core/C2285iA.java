package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2285iA implements InterfaceC1501Ot {
    public Drawable A00;
    public final /* synthetic */ C1500Os A01;

    public C2285iA(C1500Os c1500Os) {
        this.A01 = c1500Os;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final C1500Os A7F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1501Ot
    public final void AJl(int i10, int i11, int i12, int i13) {
        this.A01.A05.set(i10, i11, i12, i13);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i10, this.A01.A04.top + i11, this.A01.A04.right + i12, this.A01.A04.bottom + i13);
    }
}
