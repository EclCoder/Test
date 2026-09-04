package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f21050a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f21050a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, (e() - this.f21050a.d0()) - this.f21050a.k0());
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f21050a.n0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return this.f21050a.n0();
    }

    @Override // com.google.android.material.sidesheet.c
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.c
    int h(View view) {
        return view.getLeft() - this.f21050a.k0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f21050a.o0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean n(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f21050a.i0())) > this.f21050a.j0();
    }

    @Override // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f21050a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
