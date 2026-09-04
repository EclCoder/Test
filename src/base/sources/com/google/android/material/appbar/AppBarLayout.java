package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.z;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import mc.i;
import mc.j;
import n0.b0;
import n0.k1;
import n0.q0;
import n0.w;
import o0.p;
import sb.h;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int B = l.f51865i;
    private Behavior A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k1 f19227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f19228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f19233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakReference f19235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueAnimator f19236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f19237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f19238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinkedHashSet f19239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f19240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TimeInterpolator f19241u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f19242v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f19244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Integer f19245y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f19246z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f19247k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19248l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f19249m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f19250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f19251o;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f19252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f19253b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f19252a = coordinatorLayout;
                this.f19253b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f19252a, this.f19253b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b extends n0.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f19255d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f19256e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f19255d = appBarLayout;
                this.f19256e = coordinatorLayout;
            }

            @Override // n0.a
            public void g(View view, p pVar) {
                View viewJ0;
                super.g(view, pVar);
                pVar.u0(ScrollView.class.getName());
                if (this.f19255d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f19256e)) == null || !BaseBehavior.this.f0(this.f19255d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f19255d.getTotalScrollRange())) {
                    pVar.b(p.a.f47936q);
                    pVar.S0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        pVar.b(p.a.f47937r);
                        pVar.S0(true);
                    } else if ((-this.f19255d.getDownNestedPreScrollRange()) != 0) {
                        pVar.b(p.a.f47937r);
                        pVar.S0(true);
                    }
                }
            }

            @Override // n0.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f19255d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f19256e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f19255d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f19255d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f19256e, this.f19255d, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(appBarLayout, iQ);
            if (iI0 >= 0) {
                View childAt = appBarLayout.getChildAt(iI0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iI0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (e0(iC, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iQ < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, h0.a.b(b0(iQ, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewH0 = h0(appBarLayout, i10);
            boolean zI = false;
            if (viewH0 != null) {
                int iC = ((e) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int minimumHeight = viewH0.getMinimumHeight();
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zI = true;
                    }
                }
            }
            if (appBarLayout.r()) {
                zI = appBarLayout.I(g0(coordinatorLayout));
            }
            boolean zF = appBarLayout.F(zI);
            if (z10 || (zF && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (q0.P(coordinatorLayout)) {
                return;
            }
            q0.m0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            a0(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f19249m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f19249m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f19249m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f19249m = valueAnimator3;
                valueAnimator3.setInterpolator(tb.b.f53279e);
                this.f19249m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f19249m.setDuration(Math.min(i11, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE));
            this.f19249m.setIntValues(iQ, i10);
            this.f19249m.start();
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.n() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f19266a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof w) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listS = coordinatorLayout.s(appBarLayout);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) ((View) listS.get(i10)).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.c
        int Q() {
            return I() + this.f19247k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f19251o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.r()) {
                appBarLayout.F(appBarLayout.I(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zP = super.p(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            c cVar = this.f19250n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f19258c) {
                T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (cVar.f19259d) {
                T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cVar.f19260e);
                T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f19250n.f19262g ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f19250n.f19261f)));
            }
            appBarLayout.B();
            this.f19250n = null;
            K(h0.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            B0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.w(I());
            Y(coordinatorLayout, appBarLayout);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.J(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = S(coordinatorLayout, appBarLayout2, i11, i14, i15);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.r()) {
                appBarLayout2.F(appBarLayout2.I(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.f19250n.a());
            } else {
                super.B(coordinatorLayout, appBarLayout, parcelable);
                this.f19250n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableC = super.C(coordinatorLayout, appBarLayout);
            c cVarX0 = x0(parcelableC, appBarLayout);
            return cVarX0 == null ? parcelableC : cVarX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.r() || appBarLayout.t() || d0(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f19249m) != null) {
                valueAnimator.cancel();
            }
            this.f19251o = null;
            this.f19248l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f19248l == 0 || i10 == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.r()) {
                    appBarLayout.F(appBarLayout.I(view));
                }
            }
            this.f19251o = new WeakReference(view);
        }

        void w0(c cVar, boolean z10) {
            if (this.f19250n == null || z10) {
                this.f19250n = cVar;
            }
        }

        c x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = u0.a.f53733b;
                    }
                    c cVar = new c(parcelable);
                    boolean z10 = I == 0;
                    cVar.f19259d = z10;
                    cVar.f19258c = !z10 && (-I) >= appBarLayout.getTotalScrollRange();
                    cVar.f19260e = i10;
                    cVar.f19262g = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    cVar.f19261f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iQ = Q();
            int i13 = 0;
            if (i11 == 0 || iQ < i11 || iQ > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f19247k = 0;
            } else {
                int iB = h0.a.b(i10, i11, i12);
                if (iQ != iB) {
                    int iM0 = appBarLayout.l() ? m0(appBarLayout, iB) : iB;
                    boolean zK = K(iM0);
                    int i14 = iQ - iB;
                    this.f19247k = iB - iM0;
                    if (zK) {
                        while (i13 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i13).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(appBarLayout, appBarLayout.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && appBarLayout.l()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.w(I());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    B0(coordinatorLayout2, appBarLayout2, iB, iB < iQ ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            Y(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        protected static class c extends u0.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f19258c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f19259d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f19260e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f19261f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f19262g;

            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f19258c = parcel.readByte() != 0;
                this.f19259d = parcel.readByte() != 0;
                this.f19260e = parcel.readInt();
                this.f19261f = parcel.readFloat();
                this.f19262g = parcel.readByte() != 0;
            }

            @Override // u0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f19258c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f19259d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f19260e);
                parcel.writeFloat(this.f19261f);
                parcel.writeByte(this.f19262g ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                q0.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f19247k) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.r()) {
                    appBarLayout.F(appBarLayout.I(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.r(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f19320d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.C(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                q0.m0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52227w9);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52242x9, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b0 {
        a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            return AppBarLayout.this.x(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(AppBarLayout appBarLayout, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f19264a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f19265b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f19264a, appBarLayout, view);
            float fAbs = this.f19264a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fA = 1.0f - h0.a.a(Math.abs(fAbs / this.f19264a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f19264a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f19265b);
            this.f19265b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f19265b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f19265b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {
        public abstract void a(float f10, int i10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g extends b {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51596a);
    }

    private void D(boolean z10, boolean z11, boolean z12) {
        this.f19226f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean E(boolean z10) {
        if (this.f19230j == z10) {
            return false;
        }
        this.f19230j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean H() {
        return this.f19244x != null && getTopInset() > 0;
    }

    private boolean J() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void K(float f10, float f11) {
        ValueAnimator valueAnimator = this.f19236p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f19236p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f19240t);
        this.f19236p.setInterpolator(this.f19241u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f19237q;
        if (animatorUpdateListener != null) {
            this.f19236p.addUpdateListener(animatorUpdateListener);
        }
        this.f19236p.start();
    }

    private void L() {
        setWillNotDraw(!H());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, i iVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        iVar.k0(fFloatValue);
        Drawable drawable = appBarLayout.f19244x;
        if (drawable instanceof i) {
            ((i) drawable).k0(fFloatValue);
        }
        Iterator it = appBarLayout.f19238r.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            iVar.I();
            throw null;
        }
        Iterator it2 = appBarLayout.f19239s.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).a(fFloatValue, iVar.I(), fFloatValue / appBarLayout.f19246z);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, i iVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int iJ = ac.a.j(appBarLayout.f19243w, colorStateList.getDefaultColor(), fFloatValue);
        iVar.l0(ColorStateList.valueOf(iJ));
        if (appBarLayout.f19244x != null && (num2 = appBarLayout.f19245y) != null && num2.equals(num)) {
            appBarLayout.f19244x.setTint(iJ);
        }
        if (!appBarLayout.f19238r.isEmpty()) {
            Iterator it = appBarLayout.f19238r.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                if (iVar.E() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f19239s.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f19239s.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).a(0.0f, iJ, fFloatValue);
        }
    }

    private void f() {
        WeakReference weakReference = this.f19235o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f19235o = null;
    }

    private Integer g() {
        Drawable drawable = this.f19244x;
        if (drawable instanceof i) {
            return Integer.valueOf(((i) drawable).I());
        }
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(drawable);
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    private View h(View view) {
        int i10;
        if (this.f19235o == null && (i10 = this.f19234n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f19234n);
            }
            if (viewFindViewById != null) {
                this.f19235o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f19235o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean m() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void o(final i iVar, final ColorStateList colorStateList) {
        final Integer numF = ac.a.f(getContext(), sb.c.f51620m);
        this.f19237q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f19304a, colorStateList, iVar, numF, valueAnimator);
            }
        };
    }

    private void p(Context context, final i iVar) {
        iVar.Y(context);
        this.f19237q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f19308a, iVar, valueAnimator);
            }
        };
    }

    private void q() {
        Behavior behavior = this.A;
        BaseBehavior.c cVarX0 = (behavior == null || this.f19222b == -1 || this.f19226f != 0) ? null : behavior.x0(u0.a.f53733b, this);
        this.f19222b = -1;
        this.f19223c = -1;
        this.f19224d = -1;
        if (cVarX0 != null) {
            this.A.w0(cVarX0, false);
        }
    }

    private boolean s() {
        return getBackground() instanceof i;
    }

    private i u(Drawable drawable) {
        if (drawable instanceof i) {
            return (i) drawable;
        }
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(drawable);
        if (colorStateListG == null) {
            return null;
        }
        i iVar = new i();
        iVar.l0(colorStateListG);
        return iVar;
    }

    private Drawable v(Context context, Drawable drawable) {
        i iVarU = u(drawable);
        if (iVarU == null || iVarU.E() == null) {
            return drawable;
        }
        this.f19243w = iVarU.E().getDefaultColor();
        ColorStateList colorStateList = this.f19233m;
        if (colorStateList != null) {
            o(iVarU, colorStateList);
            return iVarU;
        }
        p(context, iVarU);
        return iVarU;
    }

    public void A(g gVar) {
        z(gVar);
    }

    void B() {
        this.f19226f = 0;
    }

    public void C(boolean z10, boolean z11) {
        D(z10, z11, true);
    }

    boolean F(boolean z10) {
        return G(z10, !this.f19229i);
    }

    boolean G(boolean z10, boolean z11) {
        if (!z11 || this.f19231k == z10) {
            return false;
        }
        this.f19231k = z10;
        refreshDrawableState();
        if (!s()) {
            return true;
        }
        if (this.f19233m != null) {
            K(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f19232l) {
            return true;
        }
        K(z10 ? 0.0f : this.f19246z, z10 ? this.f19246z : 0.0f);
        return true;
    }

    boolean I(View view) {
        View viewH = h(view);
        if (viewH != null) {
            view = viewH;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public void c(f fVar) {
        this.f19239s.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(b bVar) {
        if (this.f19228h == null) {
            this.f19228h = new ArrayList();
        }
        if (bVar == null || this.f19228h.contains(bVar)) {
            return;
        }
        this.f19228h.add(bVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (H()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f19221a);
            this.f19244x.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f19244x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(g gVar) {
        d(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f19223c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f19266a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i12 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f19223c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f19224d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i12 = eVar.f19266a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f19224d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f19234n;
    }

    public i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof i) {
            return (i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f19226f;
    }

    public Drawable getStatusBarForeground() {
        return this.f19244x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        k1 k1Var = this.f19227g;
        if (k1Var != null) {
            return k1Var.n();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f19222b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f19266a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f19222b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean l() {
        return this.f19225e;
    }

    boolean n() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f19242v == null) {
            this.f19242v = new int[4];
        }
        int[] iArr = this.f19242v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f19230j;
        int i11 = sb.c.f51627p0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f19231k) ? sb.c.f51629q0 : -sb.c.f51629q0;
        int i12 = sb.c.f51619l0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f19231k) ? sb.c.f51617k0 : -sb.c.f51617k0;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && J()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                q0.Y(getChildAt(childCount), topInset);
            }
        }
        q();
        this.f19225e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f19225e = true;
                break;
            }
        }
        Drawable drawable = this.f19244x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f19229i) {
            return;
        }
        if (!this.f19232l && !m()) {
            z11 = false;
        }
        E(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && J()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = h0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        q();
    }

    public boolean r() {
        return this.f19232l;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(v(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        j.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        C(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f19232l = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f19233m != colorStateList) {
            this.f19233m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f19234n = -1;
        if (view == null) {
            f();
        } else {
            this.f19235o = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f19234n = i10;
        f();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f19229i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    void setPendingAction(int i10) {
        this.f19226f = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f19244x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f19244x = drawable != null ? drawable.mutate() : null;
            this.f19245y = g();
            Drawable drawable3 = this.f19244x;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f19244x.setState(getDrawableState());
                }
                f0.a.m(this.f19244x, getLayoutDirection());
                this.f19244x.setVisible(getVisibility() == 0, false);
                this.f19244x.setCallback(this);
            }
            L();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(i.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        com.google.android.material.appbar.g.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f19244x;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public boolean t() {
        return this.f19231k;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f19244x;
    }

    void w(int i10) {
        this.f19221a = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f19228h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f19228h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    k1 x(k1 k1Var) {
        k1 k1Var2 = getFitsSystemWindows() ? k1Var : null;
        if (!m0.b.a(this.f19227g, k1Var2)) {
            this.f19227g = k1Var2;
            L();
            requestLayout();
        }
        return k1Var;
    }

    public boolean y(f fVar) {
        return this.f19239s.remove(fVar);
    }

    public void z(b bVar) {
        List list = this.f19228h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = B;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19222b = -1;
        this.f19223c = -1;
        this.f19224d = -1;
        this.f19226f = 0;
        this.f19238r = new ArrayList();
        this.f19239s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            com.google.android.material.appbar.g.a(this);
        }
        com.google.android.material.appbar.g.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f51883a, i10, i11, new int[0]);
        this.f19233m = jc.c.a(context2, typedArrayI, m.f51992h);
        this.f19240t = gc.j.f(context2, sb.c.M, getResources().getInteger(h.f51799a));
        this.f19241u = gc.j.g(context2, sb.c.Z, tb.b.f53275a);
        int i12 = m.f51962f;
        if (typedArrayI.hasValue(i12)) {
            D(typedArrayI.getBoolean(i12, false), false, false);
        }
        int i13 = m.f51947e;
        if (typedArrayI.hasValue(i13)) {
            com.google.android.material.appbar.g.b(this, typedArrayI.getDimensionPixelSize(i13, 0));
        }
        setBackground(typedArrayI.getDrawable(m.f51899b));
        if (Build.VERSION.SDK_INT >= 26) {
            int i14 = m.f51931d;
            if (typedArrayI.hasValue(i14)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(i14, false));
            }
            int i15 = m.f51915c;
            if (typedArrayI.hasValue(i15)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(i15, false));
            }
        }
        this.f19246z = getResources().getDimension(sb.e.f51670c);
        this.f19232l = typedArrayI.getBoolean(m.f51977g, false);
        this.f19234n = typedArrayI.getResourceId(m.f52007i, -1);
        setStatusBarForeground(typedArrayI.getDrawable(m.f52022j));
        typedArrayI.recycle();
        q0.w0(this, new a());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f19267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f19268c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19266a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52052l);
            this.f19266a = typedArrayObtainStyledAttributes.getInt(m.f52082n, 0);
            f(typedArrayObtainStyledAttributes.getInt(m.f52067m, 0));
            int i10 = m.f52097o;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f19268c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f19267b;
        }

        public int c() {
            return this.f19266a;
        }

        public Interpolator d() {
            return this.f19268c;
        }

        boolean e() {
            int i10 = this.f19266a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f19267b = a(i10);
        }

        public void g(int i10) {
            this.f19266a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f19266a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19266a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19266a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19266a = 1;
        }
    }
}
