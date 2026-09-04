package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2263hm implements QP {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C2263hm(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A4K(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            if (rkA0F.A0i() || rkA0F.A0l()) {
                rkA0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + rkA0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A5w(int i10) {
        RK rkA0F;
        View view = A7H(i10);
        if (view != null && (rkA0F = C7M.A0F(view)) != null) {
            if (!rkA0F.A0i() || rkA0F.A0l()) {
                rkA0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + rkA0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i10);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final View A7H(int i10) {
        return this.A00.getChildAt(i10);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final RK A7L(View view) {
        return C7M.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int AA7(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void ADo(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            rkA0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AEa(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            rkA0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIQ() {
        int iA7I = A7I();
        for (int i10 = 0; i10 < iA7I; i10++) {
            View viewA7H = A7H(i10);
            this.A00.A1g(viewA7H);
            viewA7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIW(int i10) {
        View childAt = this.A00.getChildAt(i10);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i10);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void addView(View view, int i10) {
        this.A00.addView(view, i10);
        this.A00.A1f(view);
    }
}
