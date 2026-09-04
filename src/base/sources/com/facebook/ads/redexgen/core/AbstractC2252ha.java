package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2252ha extends AbstractC1554Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(RK rk2);

    public abstract boolean A0Y(RK rk2);

    public abstract boolean A0Z(RK rk2, int i10, int i11, int i12, int i13);

    public abstract boolean A0a(RK rk2, RK rk3, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.core.AbstractC1554Qy
    public final boolean A0N(RK rk2) {
        return !this.A00 || rk2.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1554Qy
    public final boolean A0O(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        if (c1553Qx != null && (c1553Qx.A01 != c1553Qx2.A01 || c1553Qx.A03 != c1553Qx2.A03)) {
            return A0Z(rk2, c1553Qx.A01, c1553Qx.A03, c1553Qx2.A01, c1553Qx2.A03);
        }
        return A0X(rk2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1554Qy
    public final boolean A0P(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        int i10 = c1553Qx.A01;
        int oldLeft = c1553Qx.A03;
        View view = rk2.A0H;
        int oldTop = c1553Qx2 == null ? view.getLeft() : c1553Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c1553Qx2 == null ? view.getTop() : c1553Qx2.A03;
        if (!rk2.A0g() && (i10 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(rk2, i10, oldLeft, oldTop, top);
        }
        return A0Y(rk2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1554Qy
    public final boolean A0Q(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        if (c1553Qx.A01 != c1553Qx2.A01 || c1553Qx.A03 != c1553Qx2.A03) {
            return A0Z(rk2, c1553Qx.A01, c1553Qx.A03, c1553Qx2.A01, c1553Qx2.A03);
        }
        A0U(rk2);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1554Qy
    public final boolean A0R(RK rk2, RK rk3, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        int i10;
        int i11;
        int i12 = c1553Qx.A01;
        int i13 = c1553Qx.A03;
        if (rk3.A0l()) {
            i10 = c1553Qx.A01;
            i11 = c1553Qx.A03;
        } else {
            i10 = c1553Qx2.A01;
            i11 = c1553Qx2.A03;
        }
        return A0a(rk2, rk3, i12, i13, i10, i11);
    }

    public final void A0T(RK rk2) {
        A0K(rk2);
    }

    public final void A0U(RK rk2) {
        A0K(rk2);
    }

    public final void A0V(RK rk2) {
        A0K(rk2);
    }

    public final void A0W(RK rk2, boolean z10) {
        A0K(rk2);
    }
}
