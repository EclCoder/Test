package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f21049a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f21049a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, this.f21049a.m0() + this.f21049a.k0());
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return (-this.f21049a.d0()) - this.f21049a.k0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return this.f21049a.k0();
    }

    @Override // com.google.android.material.sidesheet.c
    int g() {
        return -this.f21049a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int h(View view) {
        return view.getRight() + this.f21049a.k0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.c
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f21049a.o0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean n(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f21049a.i0())) > this.f21049a.j0();
    }

    @Override // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f21049a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
