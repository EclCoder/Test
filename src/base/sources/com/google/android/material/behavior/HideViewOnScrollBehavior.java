package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import gc.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f19355q = sb.c.K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f19356r = sb.c.N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f19357s = sb.c.U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f19358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccessibilityManager f19359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f19360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f19362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimeInterpolator f19365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f19366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f19370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19373p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19375a;

        b(View view) {
            this.f19375a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f19370m = null;
            if (HideViewOnScrollBehavior.this.f19368k == 1 && this.f19375a.getVisibility() == 0) {
                this.f19375a.setVisibility(4);
            }
        }
    }

    public HideViewOnScrollBehavior() {
        this.f19361d = true;
        this.f19362e = new LinkedHashSet();
        this.f19367j = 0;
        this.f19368k = 2;
        this.f19369l = 0;
        this.f19371n = 0;
        this.f19372o = 0;
        this.f19373p = false;
    }

    public static /* synthetic */ void I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f19361d && z10 && hideViewOnScrollBehavior.T()) {
            hideViewOnScrollBehavior.W(view);
        }
    }

    private void O(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f19370m = this.f19358a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b(view));
    }

    private void P(final View view) {
        if (this.f19359b == null) {
            this.f19359b = (AccessibilityManager) androidx.core.content.a.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f19359b == null || this.f19360c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: vb.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.I(this.f55397a, view, z10);
            }
        };
        this.f19360c = touchExplorationStateChangeListener;
        this.f19359b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private boolean Q(int i10) {
        return i10 == 80 || i10 == 81;
    }

    private boolean R(int i10) {
        return i10 == 3 || i10 == 19;
    }

    private void U(View view, int i10) {
        if (this.f19373p) {
            return;
        }
        int i11 = ((CoordinatorLayout.f) view.getLayoutParams()).f3174c;
        if (Q(i11)) {
            V(1);
        } else {
            V(R(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    private void V(int i10) {
        d dVar = this.f19358a;
        if (dVar == null || dVar.c() != i10) {
            if (i10 == 0) {
                this.f19358a = new c();
                return;
            }
            if (i10 == 1) {
                this.f19358a = new com.google.android.material.behavior.a();
                return;
            }
            if (i10 == 2) {
                this.f19358a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    private void a0(View view, int i10) {
        this.f19368k = i10;
        b0(view, i10);
        Iterator it = this.f19362e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void b0(View view, int i10) {
        if (i10 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f19371n = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f19372o = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
            return;
        }
        if (i10 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f19371n);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f19372o);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean S() {
        return this.f19368k == 2;
    }

    public boolean T() {
        return this.f19368k == 1;
    }

    public void W(View view) {
        X(view, true);
    }

    public void X(View view, boolean z10) {
        if (S()) {
            return;
        }
        a0(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f19370m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        int iB = this.f19358a.b();
        if (z10) {
            O(view, iB, this.f19363f, this.f19365h);
        } else {
            this.f19358a.e(view, iB);
        }
    }

    public void Y(View view) {
        Z(view, true);
    }

    public void Z(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (T() || (this.f19361d && (accessibilityManager = this.f19359b) != null && accessibilityManager.isTouchExplorationEnabled())) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f19370m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        a0(view, 1);
        int i10 = this.f19367j + this.f19369l;
        if (z10) {
            O(view, i10, this.f19364g, this.f19366i);
            return;
        }
        this.f19358a.e(view, i10);
        if (view.getVisibility() == 0) {
            view.setVisibility(4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        P(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        U(view, i10);
        this.f19367j = this.f19358a.a(view, marginLayoutParams);
        this.f19363f = j.f(view.getContext(), f19355q, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f19364g = j.f(view.getContext(), f19356r, 175);
        Context context = view.getContext();
        int i11 = f19357s;
        this.f19365h = j.g(context, i11, tb.b.f53278d);
        this.f19366i = j.g(view.getContext(), i11, tb.b.f53277c);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            Y(view);
        } else if (i11 < 0) {
            W(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19361d = true;
        this.f19362e = new LinkedHashSet();
        this.f19367j = 0;
        this.f19368k = 2;
        this.f19369l = 0;
        this.f19371n = 0;
        this.f19372o = 0;
        this.f19373p = false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f19360c == null || HideViewOnScrollBehavior.this.f19359b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f19359b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f19360c);
            HideViewOnScrollBehavior.this.f19360c = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
