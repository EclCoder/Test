package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2039e8 extends FrameLayout {
    public static final int A08 = XV.A0b;
    public C10406e A00;
    public C1245Eu A01;
    public C4L A02;
    public C1204Df A03;
    public C3S A04;
    public AnonymousClass34 A05;
    public final C2198gi A06;
    public final VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(VA va2, String str, Map<String, String> map) {
        A02();
        this.A02 = new C4L(this.A06, va2, this.A00, str, null, map);
        if (C1648Up.A20(this.A06)) {
            this.A01 = new C1245Eu(this.A06, va2, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C2039e8(C2198gi c2198gi, VI vi2) {
        super(c2198gi);
        this.A07 = vi2;
        this.A06 = c2198gi;
        setUpView(c2198gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(UN un2) {
        getEventBus().A05(un2);
    }

    public final void A05(EnumC2085et enumC2085et) {
        A0e(enumC2085et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C1235Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C2198gi c2198gi) {
        A0Y();
        this.A04 = new C3S(c2198gi);
        A0f(this.A04);
        this.A03 = new C1204Df(c2198gi, this.A07);
        A0f(new C09743q(c2198gi));
        A0f(this.A03);
        this.A05 = new AnonymousClass34(c2198gi, true, this.A07);
        A0f(this.A05);
        A0f(new C1206Dh(this.A05, EnumC2101f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C2198gi c2198gi) {
        this.A00 = new C1235Ek(c2198gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                int newWidthSpec = View.MeasureSpec.getMode(i10);
                if (newWidthSpec == 1073741824) {
                    i11 = i10;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i11);
                    if (newWidthSpec2 == 1073741824) {
                        i10 = i11;
                    }
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC2038e7(this));
    }

    private void setUpView(C2198gi c2198gi) {
        setUpVideo(c2198gi);
        setUpPlugins(c2198gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
