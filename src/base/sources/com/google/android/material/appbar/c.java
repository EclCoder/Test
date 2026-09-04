package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f19310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f19311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f19316j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f19317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f19318b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f19317a = coordinatorLayout;
            this.f19318b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f19318b == null || (overScroller = c.this.f19311e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.R(this.f19317a, this.f19318b);
                return;
            }
            c cVar = c.this;
            cVar.T(this.f19317a, this.f19318b, cVar.f19311e.getCurrY());
            this.f19318b.postOnAnimation(this);
        }
    }

    public c() {
        this.f19313g = -1;
        this.f19315i = -1;
    }

    private void M() {
        if (this.f19316j == null) {
            this.f19316j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f19316j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f19316j.computeCurrentVelocity(1000);
                N(coordinatorLayout, view, -P(view), 0, this.f19316j.getYVelocity(this.f19313g));
                z10 = true;
            }
            this.f19312f = false;
            this.f19313g = -1;
            velocityTracker = this.f19316j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19316j = null;
            }
            velocityTracker2 = this.f19316j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f19312f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f19313g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f19314h - y10;
            this.f19314h = y10;
            S(coordinatorLayout, view, i10, O(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f19313g = motionEvent.getPointerId(i11);
                this.f19314h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f19316j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f19312f || z10;
        z10 = false;
        this.f19312f = false;
        this.f19313g = -1;
        velocityTracker = this.f19316j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19316j = null;
        }
        velocityTracker2 = this.f19316j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f19312f) {
        }
    }

    abstract boolean L(View view);

    final boolean N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f19310d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f19310d = null;
        }
        if (this.f19311e == null) {
            this.f19311e = new OverScroller(view.getContext());
        }
        this.f19311e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f19311e.computeScrollOffset()) {
            R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f19310d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    abstract int O(View view);

    abstract int P(View view);

    abstract int Q();

    abstract void R(CoordinatorLayout coordinatorLayout, View view);

    final int S(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return U(coordinatorLayout, view, Q() - i10, i11, i12);
    }

    int T(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return U(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int U(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f19315i < 0) {
            this.f19315i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f19312f) {
            int i10 = this.f19313g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f19314h) > this.f19315i) {
                this.f19314h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f19313g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(view) && coordinatorLayout.B(view, x10, y11);
            this.f19312f = z10;
            if (z10) {
                this.f19314h = y11;
                this.f19313g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f19311e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f19311e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f19316j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19313g = -1;
        this.f19315i = -1;
    }
}
