package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2284i9 implements InterfaceC1502Ou {
    private C1503Ov A00(InterfaceC1501Ot interfaceC1501Ot) {
        return (C1503Ov) interfaceC1501Ot.A7E();
    }

    public final void A01(InterfaceC1501Ot interfaceC1501Ot) {
        if (!interfaceC1501Ot.A9R()) {
            interfaceC1501Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC1501Ot);
        float fA8r = A8r(interfaceC1501Ot);
        float elevation = AbstractC1505Ox.A00(fA8S, fA8r, interfaceC1501Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1505Ox.A01(fA8S, fA8r, interfaceC1501Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC1501Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final ColorStateList A71(InterfaceC1501Ot interfaceC1501Ot) {
        return A00(interfaceC1501Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final float A7v(InterfaceC1501Ot interfaceC1501Ot) {
        return interfaceC1501Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final float A8S(InterfaceC1501Ot interfaceC1501Ot) {
        return A00(interfaceC1501Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final float A8X(InterfaceC1501Ot interfaceC1501Ot) {
        return A8r(interfaceC1501Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final float A8Y(InterfaceC1501Ot interfaceC1501Ot) {
        return A8r(interfaceC1501Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final float A8r(InterfaceC1501Ot interfaceC1501Ot) {
        return A00(interfaceC1501Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AAG(InterfaceC1501Ot interfaceC1501Ot, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C1503Ov background = new C1503Ov(colorStateList, f10);
        interfaceC1501Ot.AJK(background);
        View view = interfaceC1501Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AJX(interfaceC1501Ot, f12);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void ADP(InterfaceC1501Ot interfaceC1501Ot) {
        AJX(interfaceC1501Ot, A8S(interfaceC1501Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AFT(InterfaceC1501Ot interfaceC1501Ot) {
        AJX(interfaceC1501Ot, A8S(interfaceC1501Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AJJ(InterfaceC1501Ot interfaceC1501Ot, ColorStateList colorStateList) {
        A00(interfaceC1501Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AJP(InterfaceC1501Ot interfaceC1501Ot, float f10) {
        interfaceC1501Ot.A7F().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AJX(InterfaceC1501Ot interfaceC1501Ot, float f10) {
        A00(interfaceC1501Ot).A07(f10, interfaceC1501Ot.A9R(), interfaceC1501Ot.A8q());
        A01(interfaceC1501Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Ou
    public final void AJj(InterfaceC1501Ot interfaceC1501Ot, float f10) {
        A00(interfaceC1501Ot).A06(f10);
    }
}
