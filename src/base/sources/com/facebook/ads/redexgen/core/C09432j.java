package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09432j extends Q9<C2143fp> implements T4 {
    public C2198gi A00;
    public boolean A01;

    public C09432j(C2143fp c2143fp, C2198gi c2198gi) {
        super(c2143fp);
        this.A00 = c2198gi;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0F().A3v(i10);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        C2143fp c2143fpA08 = A08();
        int iIntValue = 0;
        if (c2143fpA08 == null) {
            A00(0);
            return;
        }
        View view = c2143fpA08.A0C;
        AbstractC2142fo abstractC2142fo = (AbstractC2142fo) c2143fpA08.A0E.get();
        int i10 = 1;
        boolean z10 = view == null;
        if (!z10 && abstractC2142fo != null) {
            C2144fq c2144fqA0E = C2143fp.A0E(view, c2143fpA08.A0A, this.A00);
            if (c2144fqA0E.A04()) {
                C2143fp.A05(c2143fpA08);
            } else {
                c2143fpA08.A00 = 0;
            }
            boolean z11 = c2143fpA08.A00 > c2143fpA08.A09;
            boolean wasViewable = c2143fpA08.A05 != null && c2143fpA08.A05.A04();
            if (z11 || !c2144fqA0E.A04()) {
                c2143fpA08.A05 = c2144fqA0E;
            }
            String strValueOf = String.valueOf(c2144fqA0E.A01());
            synchronized (c2143fpA08) {
                if (c2143fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c2143fpA08.A06.get(strValueOf)).intValue();
                }
                c2143fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                c2143fpA08.A03 = System.currentTimeMillis();
                if (c2143fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC2142fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c2143fpA08.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (c2143fpA08.A07) {
                    this.A00.A0F().A3S(c2144fqA0E.A02());
                }
                abstractC2142fo.A00();
            } else {
                abstractC2142fo.A02();
                if (!this.A01 && c2143fpA08.A07) {
                    this.A00.A0F().A3u(c2144fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c2143fpA08.A08 && c2143fpA08.A04 != null) {
                c2143fpA08.A0B.postDelayed(c2143fpA08.A04, c2143fpA08.A02);
                return;
            }
            return;
        }
        if (c2143fpA08.A07) {
            if (!z10) {
                i10 = 2;
            }
            A00(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final C2198gi A6m() {
        return this.A00;
    }
}
