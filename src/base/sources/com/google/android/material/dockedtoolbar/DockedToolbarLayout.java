package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import e0.b;
import mc.i;
import mc.p;
import n0.k1;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class DockedToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20036c = l.f51877u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f20037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f20038b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c0.d {
        a() {
        }

        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, c0.e eVar) {
            if (DockedToolbarLayout.this.f20037a != null && DockedToolbarLayout.this.f20038b != null && !DockedToolbarLayout.this.f20037a.booleanValue() && !DockedToolbarLayout.this.f20038b.booleanValue()) {
                return k1Var;
            }
            b bVarG = k1Var.g(k1.s.g() | k1.s.a() | k1.s.b());
            int i10 = bVarG.f37003d;
            int i11 = bVarG.f37001b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = (DockedToolbarLayout.this.d(layoutParams, 48) && DockedToolbarLayout.this.f20037a == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i11 : 0;
            int i13 = (DockedToolbarLayout.this.d(layoutParams, 80) && DockedToolbarLayout.this.f20038b == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i10 : 0;
            if (DockedToolbarLayout.this.f20038b != null) {
                if (!DockedToolbarLayout.this.f20038b.booleanValue()) {
                    i10 = 0;
                }
                i13 = i10;
            }
            if (DockedToolbarLayout.this.f20037a != null) {
                if (!DockedToolbarLayout.this.f20037a.booleanValue()) {
                    i11 = 0;
                }
                i12 = i11;
            }
            eVar.f20368b += i12;
            eVar.f20370d += i13;
            eVar.a(view);
            return k1Var;
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, f20036c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(ViewGroup.LayoutParams layoutParams, int i10) {
        if (layoutParams instanceof CoordinatorLayout.f) {
            return (((CoordinatorLayout.f) layoutParams).f3174c & i10) == i10;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i10) == i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
            for (int i12 = 0; i12 < childCount; i12++) {
                measureChild(getChildAt(i12), i10, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        o0 o0VarJ = z.j(context2, attributeSet, m.f51966f3, i10, i11, new int[0]);
        int i12 = m.f51981g3;
        if (o0VarJ.s(i12)) {
            int iB = o0VarJ.b(i12, 0);
            i iVar = new i(p.k(context2, attributeSet, i10, i11).m());
            iVar.l0(ColorStateList.valueOf(iB));
            setBackground(iVar);
        }
        int i13 = m.f52011i3;
        if (o0VarJ.s(i13)) {
            this.f20037a = Boolean.valueOf(o0VarJ.a(i13, true));
        }
        int i14 = m.f51996h3;
        if (o0VarJ.s(i14)) {
            this.f20038b = Boolean.valueOf(o0VarJ.a(i14, true));
        }
        c0.f(this, new a());
        setImportantForAccessibility(1);
        o0VarJ.x();
    }
}
