package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class e extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f19324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19326c;

    public e() {
        this.f19325b = 0;
        this.f19326c = 0;
    }

    public int I() {
        f fVar = this.f19324a;
        if (fVar != null) {
            return fVar.c();
        }
        return 0;
    }

    protected void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.I(view, i10);
    }

    public boolean K(int i10) {
        f fVar = this.f19324a;
        if (fVar != null) {
            return fVar.f(i10);
        }
        this.f19325b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        J(coordinatorLayout, view, i10);
        if (this.f19324a == null) {
            this.f19324a = new f(view);
        }
        this.f19324a.d();
        this.f19324a.a();
        int i11 = this.f19325b;
        if (i11 != 0) {
            this.f19324a.f(i11);
            this.f19325b = 0;
        }
        int i12 = this.f19326c;
        if (i12 == 0) {
            return true;
        }
        this.f19324a.e(i12);
        this.f19326c = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19325b = 0;
        this.f19326c = 0;
    }
}
