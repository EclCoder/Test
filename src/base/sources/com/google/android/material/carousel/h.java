package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f19782d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f19783e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19784c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(yb.a aVar, View view) {
        boolean z10;
        int iB = aVar.b();
        if (aVar.d()) {
            iB = aVar.a();
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (aVar.d()) {
            f10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iB;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fA = h0.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f19782d;
        float f13 = 2.0f * fD;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f19783e;
        if (aVar.c() == 1) {
            iArrA = c.a(iArrA);
            iArrA2 = c.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (d.i(iArr) * f12)) - (d.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.f19784c = aVarC.e();
        boolean zI = i(aVarC, aVar.getItemCount());
        int i12 = aVarC.f19738d;
        if (i12 == 0 && aVarC.f19737c == 0 && f11 > f13) {
            aVarC.f19737c = 1;
            z10 = true;
        } else {
            z10 = zI;
        }
        if (z10) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f19737c}, f12, new int[]{i12}, fMin, new int[]{aVarC.f19741g});
        }
        return d.d(view.getContext(), f14, iB, aVarC, aVar.c());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(yb.a aVar, int i10) {
        if (i10 >= this.f19784c || aVar.getItemCount() < this.f19784c) {
            return i10 >= this.f19784c && aVar.getItemCount() < this.f19784c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f19737c > 0 || aVar.f19738d > 1);
        while (iE > 0) {
            int i11 = aVar.f19737c;
            if (i11 > 0) {
                aVar.f19737c = i11 - 1;
            } else {
                int i12 = aVar.f19738d;
                if (i12 > 1) {
                    aVar.f19738d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
