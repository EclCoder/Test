package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import gc.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f19335o = sb.c.K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f19336p = sb.c.N;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f19337q = sb.c.U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f19338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f19341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f19342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AccessibilityManager f19344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f19345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimator f19349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19351n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19353a;

        b(View view) {
            this.f19353a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f19349l = null;
            if (HideBottomViewOnScrollBehavior.this.f19347j == 1 && this.f19353a.getVisibility() == 0) {
                this.f19353a.setVisibility(4);
            }
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f19338a = new LinkedHashSet();
        this.f19343f = 0;
        this.f19346i = true;
        this.f19347j = 2;
        this.f19348k = 0;
        this.f19350m = 0;
        this.f19351n = 0;
    }

    public static /* synthetic */ void I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.Q()) {
            hideBottomViewOnScrollBehavior.V(view);
        }
    }

    private void O(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f19349l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b(view));
    }

    private void P(final View view) {
        if (this.f19344g == null) {
            this.f19344g = (AccessibilityManager) androidx.core.content.a.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f19344g == null || this.f19345h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: vb.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.I(this.f55395a, view, z10);
            }
        };
        this.f19345h = touchExplorationStateChangeListener;
        this.f19344g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void X(View view, int i10) {
        this.f19347j = i10;
        Y(view, i10);
        Iterator it = this.f19338a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void Y(View view, int i10) {
        if (i10 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f19350m = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f19351n = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
            return;
        }
        if (i10 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f19350m);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f19351n);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean Q() {
        return this.f19347j == 1;
    }

    public boolean R() {
        return this.f19347j == 2;
    }

    public void S(View view, int i10) {
        this.f19348k = i10;
        if (this.f19347j == 1) {
            view.setTranslationY(this.f19343f + i10);
        }
    }

    public void T(View view) {
        U(view, true);
    }

    public void U(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (Q()) {
            return;
        }
        if (this.f19346i && (accessibilityManager = this.f19344g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f19349l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        X(view, 1);
        int i10 = this.f19343f + this.f19348k;
        if (z10) {
            O(view, i10, this.f19340c, this.f19342e);
            return;
        }
        view.setTranslationY(i10);
        if (view.getVisibility() == 0) {
            view.setVisibility(4);
        }
    }

    public void V(View view) {
        W(view, true);
    }

    public void W(View view, boolean z10) {
        if (R()) {
            return;
        }
        X(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f19349l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        if (z10) {
            O(view, 0, this.f19339b, this.f19341d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f19343f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f19339b = j.f(view.getContext(), f19335o, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f19340c = j.f(view.getContext(), f19336p, 175);
        Context context = view.getContext();
        int i11 = f19337q;
        this.f19341d = j.g(context, i11, tb.b.f53278d);
        this.f19342e = j.g(view.getContext(), i11, tb.b.f53277c);
        P(view);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            T(view);
        } else if (i11 < 0) {
            V(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19338a = new LinkedHashSet();
        this.f19343f = 0;
        this.f19346i = true;
        this.f19347j = 2;
        this.f19348k = 0;
        this.f19350m = 0;
        this.f19351n = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f19345h == null || HideBottomViewOnScrollBehavior.this.f19344g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f19344g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f19345h);
            HideBottomViewOnScrollBehavior.this.f19345h = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
