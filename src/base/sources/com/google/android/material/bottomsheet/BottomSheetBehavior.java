package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.c0;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.p;
import n0.k1;
import n0.q0;
import o0.s;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements gc.b {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f19460r0 = l.f51867k;
    private p A;
    private boolean B;
    private final i C;
    private ValueAnimator D;
    int E;
    int F;
    int G;
    float H;
    int I;
    float J;
    boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    int Q;
    int R;
    v0.d S;
    private boolean T;
    private int U;
    private boolean V;
    private float W;
    private int X;
    int Y;
    int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19461a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference f19462a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19463b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference f19464b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19465c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    WeakReference f19466c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f19467d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    final List f19468d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19469e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final ArrayList f19470e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19471f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private VelocityTracker f19472f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19473g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    gc.e f19474g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19475h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f19476h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19477i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f19478i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19479j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private WeakReference f19480j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private mc.i f19481k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f19482k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f19483l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Map f19484l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19485m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    final SparseIntArray f19486m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19487n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    final SparseIntArray f19488n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19489o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    final SparseIntArray f19490o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19491p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Rect f19492p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19493q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final v0.d.AbstractC0826d f19494q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19503z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19505b;

        a(View view, int i10) {
            this.f19504a = view;
            this.f19505b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.t1(this.f19504a, this.f19505b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.m1(5);
            WeakReference weakReference = BottomSheetBehavior.this.f19462a0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f19462a0.get()).requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f19481k != null) {
                BottomSheetBehavior.this.f19481k.m0(fFloatValue);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements c0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f19509a;

        d(boolean z10) {
            this.f19509a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, c0.e eVar) {
            boolean z10;
            e0.b bVarG = k1Var.g(k1.s.g());
            e0.b bVarG2 = k1Var.g(k1.s.d());
            BottomSheetBehavior.this.f19502y = bVarG.f37001b;
            boolean zM = c0.m(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f19493q) {
                BottomSheetBehavior.this.f19501x = k1Var.k();
                paddingBottom = eVar.f20370d + BottomSheetBehavior.this.f19501x;
            }
            if (BottomSheetBehavior.this.f19495r) {
                paddingLeft = (zM ? eVar.f20369c : eVar.f20367a) + bVarG.f37000a;
            }
            if (BottomSheetBehavior.this.f19496s) {
                paddingRight = (zM ? eVar.f20367a : eVar.f20369c) + bVarG.f37002c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f19498u) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = bVarG.f37000a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (BottomSheetBehavior.this.f19499v) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = bVarG.f37002c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f19500w) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = bVarG.f37001b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f19509a) {
                BottomSheetBehavior.this.f19489o = bVarG2.f37003d;
            }
            if (!BottomSheetBehavior.this.f19493q && !this.f19509a) {
                return k1Var;
            }
            BottomSheetBehavior.this.y1(false);
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends v0.d.AbstractC0826d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f19511a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.Z + bottomSheetBehavior.x0()) / 2;
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            return h0.a.b(i10, BottomSheetBehavior.this.x0(), e(view));
        }

        @Override // v0.d.AbstractC0826d
        public int e(View view) {
            return BottomSheetBehavior.this.m0() ? BottomSheetBehavior.this.Z : BottomSheetBehavior.this.I;
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.M) {
                BottomSheetBehavior.this.m1(1);
            }
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.s0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K && bottomSheetBehavior.q1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f19469e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f19463b || Math.abs(view.getTop() - BottomSheetBehavior.this.x0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.G)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f19463b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.G;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.I)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.r1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.I) || BottomSheetBehavior.this.r1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.F) < Math.abs(top - BottomSheetBehavior.this.I)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f19463b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.G) >= Math.abs(top2 - BottomSheetBehavior.this.I) || BottomSheetBehavior.this.r1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f19463b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f19511a;
                if (BottomSheetBehavior.this.r1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.o1(jUptimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.Z)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.G) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.t1(view, i10, bottomSheetBehavior4.s1());
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            View viewZ0;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.Q;
            if (i11 == 1 || bottomSheetBehavior.f19482k0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f19476h0 == i10) {
                if (bottomSheetBehavior.f19471f) {
                    viewZ0 = BottomSheetBehavior.this.f19480j0 != null ? (View) BottomSheetBehavior.this.f19480j0.get() : null;
                } else {
                    viewZ0 = BottomSheetBehavior.this.z0();
                }
                if (viewZ0 != null && viewZ0.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f19511a = SystemClock.uptimeMillis();
            WeakReference weakReference = BottomSheetBehavior.this.f19462a0;
            return weakReference != null && weakReference.get() == view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19513a;

        f(int i10) {
            this.f19513a = i10;
        }

        @Override // o0.s
        public boolean a(View view, s.a aVar) {
            BottomSheetBehavior.this.l1(this.f19513a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f19461a = 0;
        this.f19463b = true;
        this.f19465c = false;
        this.f19485m = -1;
        this.f19487n = -1;
        this.C = new i(this, null);
        this.H = 0.5f;
        this.J = -1.0f;
        this.M = true;
        this.N = true;
        this.P = true;
        this.Q = 4;
        this.R = 4;
        this.W = 0.1f;
        this.f19468d0 = new ArrayList();
        this.f19470e0 = new ArrayList();
        this.f19478i0 = -1;
        this.f19486m0 = new SparseIntArray();
        this.f19488n0 = new SparseIntArray();
        this.f19490o0 = new SparseIntArray();
        this.f19492p0 = new Rect();
        this.f19494q0 = new e();
    }

    private int B0(int i10) {
        if (i10 == 3) {
            return x0();
        }
        if (i10 == 4) {
            return this.I;
        }
        if (i10 == 5) {
            return this.Z;
        }
        if (i10 == 6) {
            return this.G;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float C0() {
        VelocityTracker velocityTracker = this.f19472f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f19467d);
        return this.f19472f0.getYVelocity(this.f19476h0);
    }

    private boolean D0() {
        Iterator it = this.f19468d0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean E0() {
        WeakReference weakReference = this.f19462a0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f19462a0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean F0() {
        if (this.Q == 3) {
            return this.f19503z || E0();
        }
        return false;
    }

    private boolean K0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean M0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f19466c0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i10, i11);
    }

    private boolean N0(CoordinatorLayout coordinatorLayout, MotionEvent motionEvent) {
        if (this.f19471f) {
            WeakReference weakReference = this.f19480j0;
            return (weakReference == null || weakReference.get() == null) ? false : true;
        }
        View viewZ0 = z0();
        return viewZ0 != null && coordinatorLayout.B(viewZ0, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private boolean O0(View view) {
        Iterator it = this.f19468d0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private void R0(View view, o0.p.a aVar, int i10) {
        q0.i0(view, aVar, null, p0(i10));
    }

    private void S0() {
        this.f19476h0 = -1;
        this.f19478i0 = -1;
        this.f19480j0 = null;
        VelocityTracker velocityTracker = this.f19472f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19472f0 = null;
        }
    }

    private void T0(h hVar) {
        int i10 = this.f19461a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f19473g = hVar.f19516d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f19463b = hVar.f19517e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.K = hVar.f19518f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.L = hVar.f19519g;
        }
    }

    private void U0(View view, Runnable runnable) {
        if (K0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int e0(View view, int i10, int i11) {
        return q0.c(view, view.getResources().getString(i10), p0(i11));
    }

    private void g0() {
        int iK0 = k0();
        if (this.f19463b) {
            this.I = Math.max(this.Z - iK0, this.F);
        } else {
            this.I = this.Z - iK0;
        }
    }

    private float h0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void i0() {
        this.G = (int) (this.Z * (1.0f - this.H));
    }

    private float j0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f19481k == null || (weakReference = this.f19462a0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f19462a0.get();
        if (!E0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(h0(this.f19481k.R(), rootWindowInsets.getRoundedCorner(0)), h0(this.f19481k.S(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int k0() {
        int i10;
        if (this.f19475h) {
            return Math.min(Math.max(this.f19477i, this.Z - ((this.Y * 9) / 16)), this.X) + this.f19501x;
        }
        return (this.f19491p || this.f19493q || (i10 = this.f19489o) <= 0) ? this.f19473g + this.f19501x : Math.max(this.f19473g, i10 + this.f19479j);
    }

    private float l0(int i10) {
        float f10;
        float fX0;
        int i11 = this.I;
        if (i10 > i11 || i11 == x0()) {
            int i12 = this.I;
            f10 = i12 - i10;
            fX0 = this.Z - i12;
        } else {
            int i13 = this.I;
            f10 = i13 - i10;
            fX0 = i13 - x0();
        }
        return f10 / fX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0() {
        return I0() && J0();
    }

    private void n1(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || H0() || this.f19475h) ? false : true;
        if (this.f19493q || this.f19495r || this.f19496s || this.f19498u || this.f19499v || this.f19500w || z10) {
            c0.f(view, new d(z10));
        }
    }

    private void o0(View view, int i10) {
        if (view == null) {
            return;
        }
        q0.g0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        q0.g0(view, 524288);
        q0.g0(view, MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        int i11 = this.f19488n0.get(i10, -1);
        if (i11 != -1) {
            q0.g0(view, i11);
            this.f19488n0.delete(i10);
        }
        int i12 = this.f19486m0.get(i10, -1);
        if (i12 != -1) {
            q0.g0(view, i12);
            this.f19486m0.delete(i10);
        }
        int i13 = this.f19490o0.get(i10, -1);
        if (i13 != -1) {
            q0.g0(view, i13);
            this.f19490o0.delete(i10);
        }
    }

    private s p0(int i10) {
        return new f(i10);
    }

    private boolean p1() {
        if (this.S != null) {
            return this.M || this.Q == 1;
        }
        return false;
    }

    private void q0(Context context) {
        if (this.A == null) {
            return;
        }
        mc.i iVar = new mc.i(this.A);
        this.f19481k = iVar;
        iVar.Y(context);
        ColorStateList colorStateList = this.f19483l;
        if (colorStateList != null) {
            this.f19481k.l0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f19481k.setTint(typedValue.data);
    }

    private void r0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(j0(), 1.0f);
        this.D = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.D.addUpdateListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(View view, int i10, boolean z10) {
        int iB0 = B0(i10);
        v0.d dVar = this.S;
        if (dVar == null || (!z10 ? dVar.U(view, view.getLeft(), iB0) : dVar.S(view.getLeft(), iB0))) {
            m1(i10);
            return;
        }
        m1(2);
        w1(i10, true);
        this.C.c(i10);
    }

    private View u0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        if (this.f19468d0.isEmpty()) {
            return null;
        }
        Iterator it = this.f19468d0.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null && coordinatorLayout.B(view, i10, i11)) {
                return view;
            }
        }
        return null;
    }

    private void u1() {
        WeakReference weakReference = this.f19462a0;
        if (weakReference != null) {
            v1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f19464b0;
        if (weakReference2 != null) {
            v1((View) weakReference2.get(), 1);
        }
    }

    public static BottomSheetBehavior v0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private void v1(View view, int i10) {
        if (view == null) {
            return;
        }
        o0(view, i10);
        if (!this.f19463b && this.Q != 6) {
            this.f19486m0.put(i10, e0(view, k.f51833e, 6));
        }
        if (this.K && J0() && this.Q != 5) {
            R0(view, o0.p.a.f47944y, 5);
        }
        int i11 = this.Q;
        if (i11 == 3) {
            if (n0()) {
                this.f19490o0.put(i10, e0(view, k.f51829a, 4));
            }
        } else if (i11 == 4) {
            this.f19488n0.put(i10, e0(view, k.f51831c, 3));
        } else {
            if (i11 != 6) {
                return;
            }
            if (n0()) {
                this.f19490o0.put(i10, e0(view, k.f51829a, 4));
            }
            this.f19488n0.put(i10, e0(view, k.f51831c, 3));
        }
    }

    private int w0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private void w1(int i10, boolean z10) {
        boolean zF0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.B == (zF0 = F0()) || this.f19481k == null) {
            return;
        }
        this.B = zF0;
        if (!z10 || (valueAnimator = this.D) == null) {
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.D.cancel();
            }
            this.f19481k.m0(this.B ? j0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.D.reverse();
        } else {
            this.D.setFloatValues(this.f19481k.F(), zF0 ? j0() : 1.0f);
            this.D.start();
        }
    }

    private void x1(boolean z10) {
        Map map;
        WeakReference weakReference = this.f19462a0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f19484l0 != null) {
                    return;
                } else {
                    this.f19484l0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f19462a0.get()) {
                    if (z10) {
                        this.f19484l0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f19465c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f19465c && (map = this.f19484l0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f19484l0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f19484l0 = null;
            } else if (this.f19465c) {
                ((View) this.f19462a0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(boolean z10) {
        View view;
        if (this.f19462a0 != null) {
            g0();
            if (this.Q != 4 || (view = (View) this.f19462a0.get()) == null) {
                return;
            }
            if (z10) {
                l1(4);
            } else {
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View z0() {
        if (this.f19468d0.isEmpty()) {
            return null;
        }
        return (View) ((WeakReference) this.f19468d0.get(0)).get();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
        if (!this.P || view.isInTouchMode()) {
            return false;
        }
        int i10 = this.Q;
        if (i10 != 4 && i10 != 6) {
            return false;
        }
        if (view.getLocalVisibleRect(this.f19492p0)) {
            k1 k1VarI = q0.I(view);
            if (k1VarI != null) {
                this.f19492p0.bottom -= k1VarI.g(k1.s.g()).f37003d;
            }
            int i11 = rect.top;
            Rect rect2 = this.f19492p0;
            if (i11 >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        l1(3);
        return true;
    }

    public int A0() {
        return this.Q;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, view, hVar.a());
        T0(hVar);
        int i10 = hVar.f19515c;
        if (i10 == 1 || i10 == 2) {
            this.Q = 4;
            this.R = 4;
        } else {
            this.Q = i10;
            this.R = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new h(super.C(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.U = 0;
        this.V = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        int i11 = 3;
        if (view.getTop() == x0()) {
            m1(3);
            return;
        }
        if (!L0() || (O0(view2) && this.V)) {
            if (this.U > 0) {
                if (!this.f19463b && view.getTop() > this.G) {
                    i11 = 6;
                }
            } else if (this.K && q1(view, C0())) {
                i11 = 5;
            } else if (this.U == 0) {
                int top = view.getTop();
                if (!this.f19463b) {
                    int i12 = this.G;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.I)) {
                            if (r1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.I)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.F) >= Math.abs(top - this.I)) {
                    i11 = 4;
                }
            } else {
                if (!this.f19463b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.G) < Math.abs(top2 - this.I)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            t1(view, i11, false);
            this.V = false;
        }
    }

    public boolean G0() {
        return this.f19463b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.Q == 1 && actionMasked == 0) {
            return true;
        }
        if (p1()) {
            this.S.I(motionEvent);
        }
        if (actionMasked == 0) {
            S0();
        }
        if (this.f19472f0 == null) {
            this.f19472f0 = VelocityTracker.obtain();
        }
        this.f19472f0.addMovement(motionEvent);
        if (p1() && actionMasked == 2 && !this.T && Math.abs(this.f19478i0 - motionEvent.getY()) > this.S.C()) {
            this.S.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.T;
    }

    public boolean H0() {
        return this.f19491p;
    }

    public boolean I0() {
        return this.K;
    }

    public boolean J0() {
        return true;
    }

    public boolean L0() {
        return true;
    }

    void P0(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f19468d0.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                P0(viewGroup.getChildAt(i10));
            }
        }
    }

    public void Q0(g gVar) {
        this.f19470e0.remove(gVar);
    }

    void V0(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.f19464b0) == null) {
            this.f19464b0 = new WeakReference(view);
            v1(view, 1);
        } else {
            o0((View) weakReference.get(), 1);
            this.f19464b0 = null;
        }
    }

    void W0(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.f19466c0 = bottomSheetDragHandleView != null ? new WeakReference(bottomSheetDragHandleView) : null;
    }

    public void X0(boolean z10) {
        this.M = z10;
    }

    public void Y0(boolean z10) {
        this.N = z10;
    }

    public void Z0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.E = i10;
        w1(this.Q, true);
    }

    @Override // gc.b
    public void a() {
        gc.e eVar = this.f19474g0;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    public void a1(boolean z10) {
        if (this.f19463b == z10) {
            return;
        }
        this.f19463b = z10;
        if (this.f19462a0 != null) {
            g0();
        }
        m1((this.f19463b && this.Q == 6) ? 3 : this.Q);
        w1(this.Q, true);
        u1();
    }

    @Override // gc.b
    public void b(androidx.activity.b bVar) {
        gc.e eVar = this.f19474g0;
        if (eVar == null) {
            return;
        }
        eVar.j(bVar);
    }

    public void b1(boolean z10) {
        this.f19491p = z10;
    }

    @Override // gc.b
    public void c(androidx.activity.b bVar) {
        gc.e eVar = this.f19474g0;
        if (eVar == null) {
            return;
        }
        eVar.l(bVar);
    }

    public void c1(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.H = f10;
        if (this.f19462a0 != null) {
            i0();
        }
    }

    @Override // gc.b
    public void d() {
        gc.e eVar = this.f19474g0;
        if (eVar == null) {
            return;
        }
        androidx.activity.b bVarC = eVar.c();
        if (bVarC == null || Build.VERSION.SDK_INT < 34) {
            l1(this.K ? 5 : 4);
        } else if (this.K) {
            this.f19474g0.h(bVarC, new b());
        } else {
            this.f19474g0.i(bVarC, null);
            l1(4);
        }
    }

    public void d1(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            if (!z10 && this.Q == 5) {
                l1(4);
            }
            u1();
        }
    }

    public void e1(int i10) {
        this.f19487n = i10;
    }

    public void f0(g gVar) {
        if (this.f19470e0.contains(gVar)) {
            return;
        }
        this.f19470e0.add(gVar);
    }

    public void f1(int i10) {
        this.f19485m = i10;
    }

    public void g1(int i10) {
        h1(i10, false);
    }

    public final void h1(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f19475h) {
                return;
            } else {
                this.f19475h = true;
            }
        } else {
            if (!this.f19475h && this.f19473g == i10) {
                return;
            }
            this.f19475h = false;
            this.f19473g = Math.max(0, i10);
        }
        y1(z10);
    }

    public void i1(int i10) {
        this.f19461a = i10;
    }

    public void j1(int i10) {
        this.f19469e = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f19462a0 = null;
        this.S = null;
        this.f19474g0 = null;
    }

    public void k1(boolean z10) {
        this.L = z10;
    }

    public void l1(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.K && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f19463b && B0(i10) <= this.F) ? 3 : i10;
        WeakReference weakReference = this.f19462a0;
        if (weakReference == null || weakReference.get() == null) {
            m1(i10);
        } else {
            View view = (View) this.f19462a0.get();
            U0(view, new a(view, i11));
        }
    }

    void m1(int i10) {
        View view;
        if (this.Q == i10) {
            return;
        }
        this.Q = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.K && i10 == 5)) {
            this.R = i10;
        }
        WeakReference weakReference = this.f19462a0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            x1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            x1(false);
        }
        w1(i10, true);
        for (int i11 = 0; i11 < this.f19470e0.size(); i11++) {
            ((g) this.f19470e0.get(i11)).c(view, i10);
        }
        u1();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f19462a0 = null;
        this.S = null;
        this.f19474g0 = null;
    }

    boolean n0() {
        return (this.L && this.K) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        v0.d dVar;
        if (!view.isShown() || !this.M) {
            this.T = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            S0();
        }
        if (this.f19472f0 == null) {
            this.f19472f0 = VelocityTracker.obtain();
        }
        this.f19472f0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f19478i0 = (int) motionEvent.getY();
            WeakReference weakReference = new WeakReference(u0(coordinatorLayout, (int) motionEvent.getX(), (int) motionEvent.getY()));
            this.f19480j0 = weakReference;
            if (this.Q != 2 && weakReference.get() != null) {
                this.f19476h0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!M0(coordinatorLayout, x10, this.f19478i0)) {
                    this.f19482k0 = true;
                }
            }
            this.T = this.f19476h0 == -1 && !coordinatorLayout.B(view, x10, this.f19478i0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f19482k0 = false;
            this.f19480j0 = null;
            this.f19476h0 = -1;
            if (this.T) {
                this.T = false;
                return false;
            }
        }
        if (this.T || (dVar = this.S) == null || !dVar.T(motionEvent)) {
            return (actionMasked != 2 || !D0() || this.T || this.Q == 1 || N0(coordinatorLayout, motionEvent) || this.S == null || (i10 = this.f19478i0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.S.C())) ? false : true;
        }
        return true;
    }

    public boolean o1(long j10, float f10) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f19462a0 == null) {
            this.f19477i = coordinatorLayout.getResources().getDimensionPixelSize(sb.e.f51688i);
            n1(view);
            q0.E0(view, new com.google.android.material.bottomsheet.c(view));
            this.f19462a0 = new WeakReference(view);
            this.f19474g0 = new gc.e(view);
            mc.i iVar = this.f19481k;
            if (iVar != null) {
                view.setBackground(iVar);
                mc.i iVar2 = this.f19481k;
                float elevation = this.J;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar2.k0(elevation);
            } else {
                ColorStateList colorStateList = this.f19483l;
                if (colorStateList != null) {
                    q0.q0(view, colorStateList);
                }
            }
            u1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.S == null) {
            this.S = v0.d.q(coordinatorLayout, this.f19494q0);
        }
        int top = view.getTop();
        coordinatorLayout.I(view, i10);
        this.Y = coordinatorLayout.getWidth();
        this.Z = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.X = height;
        int iMin = this.Z;
        int i11 = iMin - height;
        int i12 = this.f19502y;
        if (i11 < i12) {
            if (this.f19497t) {
                int i13 = this.f19487n;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.X = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f19487n;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.X = iMin2;
            }
        }
        this.F = Math.max(0, this.Z - this.X);
        i0();
        g0();
        int i15 = this.Q;
        if (i15 == 3) {
            q0.Y(view, x0());
        } else if (i15 == 6) {
            q0.Y(view, this.G);
        } else if (this.K && i15 == 5) {
            q0.Y(view, this.Z);
        } else if (i15 == 4) {
            q0.Y(view, this.I);
        } else if (i15 == 1 || i15 == 2) {
            q0.Y(view, top - view.getTop());
        }
        w1(this.Q, false);
        this.f19468d0.clear();
        if (this.f19471f) {
            P0(view);
        } else {
            this.f19468d0.add(new WeakReference(t0(view)));
        }
        for (int i16 = 0; i16 < this.f19470e0.size(); i16++) {
            ((g) this.f19470e0.get(i16)).a(view);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f19485m, marginLayoutParams.width), w0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f19487n, marginLayoutParams.height));
        return true;
    }

    boolean q1(View view, float f10) {
        if (this.L) {
            return true;
        }
        if (J0() && view.getTop() >= this.I) {
            return Math.abs((((float) view.getTop()) + (f10 * this.W)) - ((float) this.I)) / ((float) k0()) > 0.5f;
        }
        return false;
    }

    public boolean r1() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        return L0() && D0() && O0(view2) && (!(this.Q == 3 || this.O) || super.s(coordinatorLayout, view, view2, f10, f11));
    }

    void s0(int i10) {
        View view = (View) this.f19462a0.get();
        if (view == null || this.f19470e0.isEmpty()) {
            return;
        }
        float fL0 = l0(i10);
        for (int i11 = 0; i11 < this.f19470e0.size(); i11++) {
            ((g) this.f19470e0.get(i11)).b(view, fL0);
        }
    }

    public boolean s1() {
        return true;
    }

    View t0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewT0 = t0(viewGroup.getChildAt(i10));
                if (viewT0 != null) {
                    return viewT0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        boolean zO0 = O0(view2);
        if (!L0() || zO0) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.V && !this.N && zO0 && view2.canScrollVertically(1)) {
                    this.O = true;
                    return;
                }
                if (i13 < x0()) {
                    int iX0 = top - x0();
                    iArr[1] = iX0;
                    q0.Y(view, -iX0);
                    m1(3);
                } else {
                    if (!this.M) {
                        return;
                    }
                    iArr[1] = i11;
                    q0.Y(view, -i11);
                    m1(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.V && !this.N && zO0 && zCanScrollVertically) {
                    this.O = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.I && !m0()) {
                        int i14 = top - this.I;
                        iArr[1] = i14;
                        q0.Y(view, -i14);
                        m1(4);
                    } else {
                        if (!this.M) {
                            return;
                        }
                        iArr[1] = i11;
                        q0.Y(view, -i11);
                        m1(1);
                    }
                }
            }
            s0(view.getTop());
            this.U = i11;
            this.V = true;
            this.O = false;
        }
    }

    public int x0() {
        if (this.f19463b) {
            return this.F;
        }
        return Math.max(this.E, this.f19497t ? 0 : this.f19502y);
    }

    mc.i y0() {
        return this.f19481k;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f19522c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f19521b = false;
                v0.d dVar = BottomSheetBehavior.this.S;
                if (dVar != null && dVar.o(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f19520a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.Q == 2) {
                    bottomSheetBehavior.m1(iVar2.f19520a);
                }
            }
        }

        private i() {
            this.f19522c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f19462a0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f19520a = i10;
            if (this.f19521b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f19462a0.get()).postOnAnimation(this.f19522c);
            this.f19521b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class h extends u0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f19515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f19517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f19518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f19519g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19515c = parcel.readInt();
            this.f19516d = parcel.readInt();
            this.f19517e = parcel.readInt() == 1;
            this.f19518f = parcel.readInt() == 1;
            this.f19519g = parcel.readInt() == 1;
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19515c);
            parcel.writeInt(this.f19516d);
            parcel.writeInt(this.f19517e ? 1 : 0);
            parcel.writeInt(this.f19518f ? 1 : 0);
            parcel.writeInt(this.f19519g ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f19515c = bottomSheetBehavior.Q;
            this.f19516d = bottomSheetBehavior.f19473g;
            this.f19517e = bottomSheetBehavior.f19463b;
            this.f19518f = bottomSheetBehavior.K;
            this.f19519g = bottomSheetBehavior.L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class g {
        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);

        void a(View view) {
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f19461a = 0;
        this.f19463b = true;
        this.f19465c = false;
        this.f19485m = -1;
        this.f19487n = -1;
        this.C = new i(this, null);
        this.H = 0.5f;
        this.J = -1.0f;
        this.M = true;
        this.N = true;
        this.P = true;
        this.Q = 4;
        this.R = 4;
        this.W = 0.1f;
        this.f19468d0 = new ArrayList();
        this.f19470e0 = new ArrayList();
        this.f19478i0 = -1;
        this.f19486m0 = new SparseIntArray();
        this.f19488n0 = new SparseIntArray();
        this.f19490o0 = new SparseIntArray();
        this.f19492p0 = new Rect();
        this.f19494q0 = new e();
        this.f19479j = context.getResources().getDimensionPixelSize(sb.e.V0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.F0);
        int i11 = m.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f19483l = jc.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f51949e1)) {
            this.A = p.k(context, attributeSet, sb.c.f51602d, f19460r0).m();
        }
        q0(context);
        r0();
        this.J = typedArrayObtainStyledAttributes.getDimension(m.I0, -1.0f);
        int i12 = m.G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            f1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = m.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = m.S0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            g1(i10);
        } else {
            g1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        d1(typedArrayObtainStyledAttributes.getBoolean(m.Q0, false));
        b1(typedArrayObtainStyledAttributes.getBoolean(m.W0, false));
        a1(typedArrayObtainStyledAttributes.getBoolean(m.O0, true));
        k1(typedArrayObtainStyledAttributes.getBoolean(m.V0, false));
        X0(typedArrayObtainStyledAttributes.getBoolean(m.L0, true));
        Y0(typedArrayObtainStyledAttributes.getBoolean(m.M0, true));
        i1(typedArrayObtainStyledAttributes.getInt(m.T0, 0));
        c1(typedArrayObtainStyledAttributes.getFloat(m.P0, 0.5f));
        int i15 = m.N0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            Z0(typedValuePeekValue2.data);
        } else {
            Z0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        j1(typedArrayObtainStyledAttributes.getInt(m.U0, 500));
        this.f19471f = typedArrayObtainStyledAttributes.getBoolean(m.R0, false);
        this.P = typedArrayObtainStyledAttributes.getBoolean(m.K0, true);
        this.f19493q = typedArrayObtainStyledAttributes.getBoolean(m.f51885a1, false);
        this.f19495r = typedArrayObtainStyledAttributes.getBoolean(m.f51901b1, false);
        this.f19496s = typedArrayObtainStyledAttributes.getBoolean(m.f51917c1, false);
        this.f19497t = typedArrayObtainStyledAttributes.getBoolean(m.f51933d1, true);
        this.f19498u = typedArrayObtainStyledAttributes.getBoolean(m.X0, false);
        this.f19499v = typedArrayObtainStyledAttributes.getBoolean(m.Y0, false);
        this.f19500w = typedArrayObtainStyledAttributes.getBoolean(m.Z0, false);
        this.f19503z = typedArrayObtainStyledAttributes.getBoolean(m.f51964f1, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f19467d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
