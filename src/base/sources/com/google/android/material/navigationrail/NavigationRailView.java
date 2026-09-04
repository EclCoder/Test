package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.o0;
import androidx.transition.m;
import androidx.transition.t;
import androidx.transition.v;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.android.material.navigation.f;
import com.google.android.material.navigation.n;
import n0.k1;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class NavigationRailView extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final TimeInterpolator f20659y = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f20664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f20666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f20667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f20668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f20669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f20679x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c0.d {
        a() {
        }

        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, c0.e eVar) {
            e0.b bVarG = k1Var.g(k1.s.g());
            e0.b bVarG2 = k1Var.g(k1.s.a());
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.t(navigationRailView.f20667l)) {
                eVar.f20368b += bVarG.f37001b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.t(navigationRailView2.f20668m)) {
                eVar.f20370d += bVarG.f37003d;
            }
            NavigationRailView navigationRailView3 = NavigationRailView.this;
            if (navigationRailView3.t(navigationRailView3.f20669n)) {
                if (c0.m(view)) {
                    eVar.f20367a += Math.max(bVarG.f37002c, bVarG2.f37002c);
                } else {
                    eVar.f20367a += Math.max(bVarG.f37000a, bVarG2.f37000a);
                }
            }
            eVar.a(view);
            return k1Var;
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.V);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getNavigationRailMenuView().getChildAt(i10);
            if (childAt.getVisibility() != 8 && !(childAt instanceof com.google.android.material.navigation.d)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private e getNavigationRailMenuView() {
        return (e) getMenuView();
    }

    private void l() {
        View view = (View) getMenuView();
        c cVar = new c(getContext());
        this.f20679x = cVar;
        cVar.setPaddingTop(this.f20660e);
        this.f20679x.setScrollingEnabled(this.f20664i);
        this.f20679x.setClipChildren(false);
        this.f20679x.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f20679x.addView(view);
        if (!this.f20664i) {
            addView(this.f20679x);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.f20679x);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    private void o() {
        c0.f(this, new a());
    }

    private int q(int i10, int i11) {
        int iMin = Math.min(this.f20662g, View.MeasureSpec.getSize(i10));
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            return i10;
        }
        int iMax = Math.max(i11, iMin);
        View view = this.f20666k;
        if (view != null) {
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.f20663h)), 1073741824);
    }

    private int r(int i10) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    private void setExpanded(boolean z10) {
        if (this.f20670o == z10) {
            return;
        }
        u();
        this.f20670o = z10;
        int i10 = this.f20673r;
        int i11 = this.f20671p;
        int i12 = this.f20672q;
        int i13 = this.f20674s;
        if (z10) {
            i10 = this.f20676u;
            i11 = this.f20678w;
            i12 = this.f20675t;
            i13 = this.f20677v;
        }
        getNavigationRailMenuView().setItemGravity(i13);
        super.setItemIconGravity(i10);
        getNavigationRailMenuView().setItemSpacing(i11);
        getNavigationRailMenuView().setItemMinimumHeight(i12);
        getNavigationRailMenuView().setExpanded(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    private void u() {
        if (isLaidOut()) {
            m mVarE0 = new androidx.transition.b().c0(500L).e0(f20659y);
            m mVarC0 = new androidx.transition.c().c0(100L);
            m mVarC1 = new androidx.transition.c().c0(100L);
            b bVar = new b();
            m mVarC2 = new androidx.transition.c().c0(100L);
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getNavigationRailMenuView().getChildAt(i10);
                if (childAt instanceof f) {
                    f fVar = (f) childAt;
                    mVarE0.q(fVar.getLabelGroup(), true);
                    mVarE0.q(fVar.getExpandedLabelGroup(), true);
                    if (this.f20670o) {
                        mVarC1.c(fVar.getExpandedLabelGroup());
                        mVarC0.c(fVar.getLabelGroup());
                    } else {
                        mVarC1.c(fVar.getLabelGroup());
                        mVarC0.c(fVar.getExpandedLabelGroup());
                    }
                    bVar.c(fVar.getExpandedLabelGroup());
                }
                mVarC2.c(childAt);
            }
            v vVar = new v();
            vVar.u0(0);
            vVar.m0(mVarE0).m0(mVarC0).m0(bVar);
            if (!this.f20670o) {
                vVar.m0(mVarC2);
            }
            v vVar2 = new v();
            vVar2.u0(0);
            vVar2.m0(mVarC1);
            if (this.f20670o) {
                vVar2.m0(mVarC2);
            }
            v vVar3 = new v();
            vVar3.u0(1);
            vVar3.m0(vVar2).m0(vVar);
            t.b((ViewGroup) getParent(), vVar3);
        }
    }

    @Override // com.google.android.material.navigation.n
    protected boolean e() {
        return true;
    }

    @Override // com.google.android.material.navigation.n
    public boolean g() {
        return true;
    }

    public int getCollapsedItemMinimumHeight() {
        return this.f20672q;
    }

    @Override // com.google.android.material.navigation.n
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.f20675t;
    }

    public View getHeaderView() {
        return this.f20666k;
    }

    @Override // com.google.android.material.navigation.n
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.n
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.n
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.f20665j;
    }

    public void m(int i10) {
        n(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, false));
    }

    public void n(View view) {
        s();
        this.f20666k = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.f20661f;
        this.f20679x.addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iR = r(i10);
        if (this.f20670o) {
            measureChild(getNavigationRailMenuView(), i10, i11);
            View view = this.f20666k;
            if (view != null) {
                measureChild(view, i10, i11);
            }
            iR = q(i10, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().q(View.MeasureSpec.getSize(iR));
            }
        }
        super.onMeasure(iR, i11);
        if (this.f20679x.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.f20679x, iR, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.n
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public e c(Context context) {
        return new e(context);
    }

    public void s() {
        View view = this.f20666k;
        if (view != null) {
            this.f20679x.removeView(view);
            this.f20666k = null;
        }
    }

    public void setCollapsedItemMinimumHeight(int i10) {
        this.f20672q = i10;
        if (this.f20670o) {
            return;
        }
        ((e) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setCollapsedItemSpacing(int i10) {
        this.f20671p = i10;
        if (this.f20670o) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i10);
    }

    public void setExpandedItemMinimumHeight(int i10) {
        this.f20675t = i10;
        if (this.f20670o) {
            ((e) getMenuView()).setItemMinimumHeight(i10);
        }
    }

    @Override // com.google.android.material.navigation.n
    public void setItemGravity(int i10) {
        this.f20674s = i10;
        this.f20677v = i10;
        super.setItemGravity(i10);
    }

    @Override // com.google.android.material.navigation.n
    public void setItemIconGravity(int i10) {
        this.f20673r = i10;
        this.f20676u = i10;
        super.setItemIconGravity(i10);
    }

    public void setItemMinimumHeight(int i10) {
        this.f20672q = i10;
        this.f20675t = i10;
        ((e) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setItemSpacing(int i10) {
        this.f20671p = i10;
        this.f20678w = i10;
        getNavigationRailMenuView().setItemSpacing(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f20665j == z10) {
            return;
        }
        this.f20665j = z10;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z10);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f20667l = null;
        this.f20668m = null;
        this.f20669n = null;
        this.f20670o = false;
        this.f20672q = -1;
        this.f20673r = 0;
        this.f20674s = 49;
        Context context2 = getContext();
        this.f20678w = getContext().getResources().getDimensionPixelSize(sb.e.R);
        this.f20677v = 8388627;
        this.f20676u = 1;
        o0 o0VarJ = z.j(context2, attributeSet, sb.m.f52031j8, i10, i11, new int[0]);
        int i12 = sb.m.f52061l8;
        Resources resources = getResources();
        int i13 = sb.e.Z0;
        this.f20660e = o0VarJ.f(i12, resources.getDimensionPixelSize(i13));
        this.f20661f = o0VarJ.f(sb.m.f52151r8, getResources().getDimensionPixelSize(i13));
        this.f20664i = o0VarJ.a(sb.m.f52256y8, false);
        setSubmenuDividersEnabled(o0VarJ.a(sb.m.f52271z8, false));
        l();
        int iN = o0VarJ.n(sb.m.f52136q8, 0);
        if (iN != 0) {
            m(iN);
        }
        setMenuGravity(o0VarJ.k(sb.m.f52196u8, 49));
        int i14 = sb.m.f52166s8;
        int iF = o0VarJ.f(i14, -1);
        int iF2 = o0VarJ.f(i14, -1);
        int i15 = sb.m.f52046k8;
        iF = o0VarJ.s(i15) ? o0VarJ.f(i15, -1) : iF;
        int i16 = sb.m.f52091n8;
        iF2 = o0VarJ.s(i16) ? o0VarJ.f(i16, -1) : iF2;
        setCollapsedItemMinimumHeight(iF);
        setExpandedItemMinimumHeight(iF2);
        this.f20662g = o0VarJ.f(sb.m.f52121p8, context2.getResources().getDimensionPixelSize(sb.e.V));
        this.f20663h = o0VarJ.f(sb.m.f52106o8, context2.getResources().getDimensionPixelSize(sb.e.U));
        int i17 = sb.m.f52241x8;
        if (o0VarJ.s(i17)) {
            this.f20667l = Boolean.valueOf(o0VarJ.a(i17, false));
        }
        int i18 = sb.m.f52211v8;
        if (o0VarJ.s(i18)) {
            this.f20668m = Boolean.valueOf(o0VarJ.a(i18, false));
        }
        int i19 = sb.m.f52226w8;
        if (o0VarJ.s(i19)) {
            this.f20669n = Boolean.valueOf(o0VarJ.a(i19, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(sb.e.T);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(sb.e.S);
        float fB = tb.b.b(0.0f, 1.0f, 0.3f, 1.0f, jc.c.f(context2) - 1.0f);
        float fC = tb.b.c(getItemPaddingTop(), dimensionPixelOffset, fB);
        float fC2 = tb.b.c(getItemPaddingBottom(), dimensionPixelOffset2, fB);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        setCollapsedItemSpacing(o0VarJ.f(sb.m.f52181t8, 0));
        setExpanded(o0VarJ.a(sb.m.f52076m8, false));
        o0VarJ.x();
        o();
    }
}
