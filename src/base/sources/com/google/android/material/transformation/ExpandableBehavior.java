package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21543a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ dc.a f21546c;

        a(View view, int i10, dc.a aVar) {
            this.f21544a = view;
            this.f21545b = i10;
            this.f21546c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f21544a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f21543a == this.f21545b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                dc.a aVar = this.f21546c;
                expandableBehavior.L((View) aVar, this.f21544a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f21543a = 0;
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f21543a == 1;
        }
        int i10 = this.f21543a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected dc.a K(CoordinatorLayout coordinatorLayout, View view) {
        List listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listR.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (dc.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        dc.a aVar = (dc.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f21543a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        dc.a aVarK;
        if (view.isLaidOut() || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i11 = aVarK.a() ? 1 : 2;
        this.f21543a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21543a = 0;
    }
}
