package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import mc.i;
import mc.p;
import n0.q0;
import o0.s;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements gc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f21017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f21019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f21020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f21021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f21022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f21023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v0.d f21027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f21029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f21034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f21035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f21037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private gc.i f21038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f21039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f21040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final v0.d.AbstractC0826d f21041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f21016z = k.Y;
    private static final int A = l.F;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends v0.d.AbstractC0826d {
        a() {
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            return h0.a.b(i10, SideSheetBehavior.this.f21017a.g(), SideSheetBehavior.this.f21017a.f());
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            return SideSheetBehavior.this.f21030n + SideSheetBehavior.this.k0();
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f21024h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f21017a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f21025i == 1 || SideSheetBehavior.this.f21034r == null || SideSheetBehavior.this.f21034r.get() != view) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f21034r == null || SideSheetBehavior.this.f21034r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f21034r.get()).requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f21047c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f21051a);
            }
        };

        d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.f21046b = false;
            if (SideSheetBehavior.this.f21027k != null && SideSheetBehavior.this.f21027k.o(true)) {
                dVar.b(dVar.f21045a);
            } else if (SideSheetBehavior.this.f21025i == 2) {
                SideSheetBehavior.this.G0(dVar.f21045a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f21034r == null || SideSheetBehavior.this.f21034r.get() == null) {
                return;
            }
            this.f21045a = i10;
            if (this.f21046b) {
                return;
            }
            ((View) SideSheetBehavior.this.f21034r.get()).postOnAnimation(this.f21047c);
            this.f21046b = true;
        }
    }

    public SideSheetBehavior() {
        this.f21022f = new d();
        this.f21024h = true;
        this.f21025i = 5;
        this.f21026j = 5;
        this.f21029m = 0.1f;
        this.f21036t = -1;
        this.f21040x = new LinkedHashSet();
        this.f21041y = new a();
    }

    private void A0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void D0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f21017a;
        if (cVar == null || cVar.j() != i10) {
            if (i10 == 0) {
                this.f21017a = new com.google.android.material.sidesheet.b(this);
                if (this.f21021e == null || s0()) {
                    return;
                }
                p.b bVarF = this.f21021e.F();
                bVarF.I(0.0f).z(0.0f);
                O0(bVarF.m());
                return;
            }
            if (i10 == 1) {
                this.f21017a = new com.google.android.material.sidesheet.a(this);
                if (this.f21021e == null || r0()) {
                    return;
                }
                p.b bVarF2 = this.f21021e.F();
                bVarF2.E(0.0f).v(0.0f);
                O0(bVarF2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void E0(View view, int i10) {
        D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) view.getLayoutParams()).f3174c, i10) == 3 ? 1 : 0);
    }

    private boolean H0() {
        if (this.f21027k != null) {
            return this.f21024h || this.f21025i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, s.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        WeakReference weakReference = sideSheetBehavior.f21034r;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            sideSheetBehavior.L0(view, i10, false);
        }
    }

    private boolean J0(View view) {
        return (view.isShown() || q0.q(view) != null) && this.f21024h;
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f21017a.o(marginLayoutParams, tb.b.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f21022f.b(i10);
        }
    }

    private void M0() {
        View view;
        WeakReference weakReference = this.f21034r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        q0.g0(view, MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        q0.g0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (this.f21025i != 5) {
            y0(view, o0.p.a.f47944y, 5);
        }
        if (this.f21025i != 3) {
            y0(view, o0.p.a.f47942w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f21034r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f21034r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f21017a.o(marginLayoutParams, (int) ((this.f21030n * view.getScaleX()) + this.f21033q));
        viewF0.requestLayout();
    }

    private void O0(p pVar) {
        i iVar = this.f21019c;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(pVar);
        }
    }

    private void P0(View view) {
        int i10 = this.f21025i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, View view) {
        int i11 = this.f21025i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f21017a.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f21017a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f21025i);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f21017a.m(f10, f11) || this.f21017a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && com.google.android.material.sidesheet.d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f21017a.e()) ? 3 : 5;
    }

    private void X() {
        WeakReference weakReference = this.f21035s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21035s = null;
    }

    private s Y(final int i10) {
        return new s() { // from class: nc.b
            @Override // o0.s
            public final boolean a(View view, s.a aVar) {
                return SideSheetBehavior.I(this.f47079a, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f21021e == null) {
            return;
        }
        i iVar = new i(this.f21021e);
        this.f21019c = iVar;
        iVar.Y(context);
        ColorStateList colorStateList = this.f21020d;
        if (colorStateList != null) {
            this.f21019c.l0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f21019c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (this.f21040x.isEmpty()) {
            return;
        }
        this.f21017a.b(i10);
        Iterator it = this.f21040x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void b0(View view) {
        if (q0.q(view) == null) {
            q0.o0(view, view.getResources().getString(f21016z));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
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

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f21017a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: nc.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f47081a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    private int h0() {
        com.google.android.material.sidesheet.c cVar = this.f21017a;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        View view;
        WeakReference weakReference = this.f21034r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return H0() && V((float) this.f21039w, motionEvent.getX()) > ((float) this.f21027k.C());
    }

    private boolean u0(float f10) {
        return this.f21017a.k(f10);
    }

    private boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        v0.d dVarP0 = p0();
        if (dVarP0 == null) {
            return false;
        }
        if (z10) {
            return dVarP0.S(iL0, view.getTop());
        }
        return dVarP0.U(view, iL0, view.getTop());
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f21035s != null || (i10 = this.f21036t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f21035s = new WeakReference(viewFindViewById);
    }

    private void y0(View view, o0.p.a aVar, int i10) {
        q0.i0(view, aVar, null, Y(i10));
    }

    private void z0() {
        VelocityTracker velocityTracker = this.f21037u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21037u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, view, cVar.a());
        }
        int i10 = cVar.f21044c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f21025i = i10;
        this.f21026j = i10;
    }

    public void B0(int i10) {
        this.f21036t = i10;
        X();
        WeakReference weakReference = this.f21034r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new c(super.C(coordinatorLayout, view), this);
    }

    public void C0(boolean z10) {
        this.f21024h = z10;
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f21034r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0((View) this.f21034r.get(), new Runnable() { // from class: nc.a
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f47077a, i10);
                }
            });
        }
    }

    void G0(int i10) {
        View view;
        if (this.f21025i == i10) {
            return;
        }
        this.f21025i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f21026j = i10;
        }
        WeakReference weakReference = this.f21034r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P0(view);
        Iterator it = this.f21040x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f21025i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f21027k.I(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f21037u == null) {
            this.f21037u = VelocityTracker.obtain();
        }
        this.f21037u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f21028l && t0(motionEvent)) {
            this.f21027k.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f21028l;
    }

    boolean I0(View view, float f10) {
        return this.f21017a.n(view, f10);
    }

    public boolean K0() {
        return true;
    }

    @Override // gc.b
    public void a() {
        gc.i iVar = this.f21038v;
        if (iVar == null) {
            return;
        }
        iVar.f();
    }

    @Override // gc.b
    public void b(androidx.activity.b bVar) {
        gc.i iVar = this.f21038v;
        if (iVar == null) {
            return;
        }
        iVar.j(bVar);
    }

    @Override // gc.b
    public void c(androidx.activity.b bVar) {
        gc.i iVar = this.f21038v;
        if (iVar == null) {
            return;
        }
        iVar.l(bVar, h0());
        N0();
    }

    @Override // gc.b
    public void d() {
        gc.i iVar = this.f21038v;
        if (iVar == null) {
            return;
        }
        androidx.activity.b bVarC = iVar.c();
        if (bVarC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f21038v.h(bVarC, h0(), new b(), e0());
        }
    }

    int d0() {
        return this.f21030n;
    }

    public View f0() {
        WeakReference weakReference = this.f21035s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f21017a.d();
    }

    public float i0() {
        return this.f21029m;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f21034r = null;
        this.f21027k = null;
        this.f21038v = null;
    }

    int k0() {
        return this.f21033q;
    }

    int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f21017a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int m0() {
        return this.f21032p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f21034r = null;
        this.f21027k = null;
        this.f21038v = null;
    }

    int n0() {
        return this.f21031o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        v0.d dVar;
        if (!J0(view)) {
            this.f21028l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f21037u == null) {
            this.f21037u = VelocityTracker.obtain();
        }
        this.f21037u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f21039w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f21028l) {
            this.f21028l = false;
            return false;
        }
        return (this.f21028l || (dVar = this.f21027k) == null || !dVar.T(motionEvent)) ? false : true;
    }

    int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f21034r == null) {
            this.f21034r = new WeakReference(view);
            this.f21038v = new gc.i(view);
            i iVar = this.f21019c;
            if (iVar != null) {
                view.setBackground(iVar);
                i iVar2 = this.f21019c;
                float elevation = this.f21023g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar2.k0(elevation);
            } else {
                ColorStateList colorStateList = this.f21020d;
                if (colorStateList != null) {
                    q0.q0(view, colorStateList);
                }
            }
            P0(view);
            M0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            b0(view);
        }
        E0(view, i10);
        if (this.f21027k == null) {
            this.f21027k = v0.d.q(coordinatorLayout, this.f21041y);
        }
        int iH = this.f21017a.h(view);
        coordinatorLayout.I(view, i10);
        this.f21031o = coordinatorLayout.getWidth();
        this.f21032p = this.f21017a.i(coordinatorLayout);
        this.f21030n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f21033q = marginLayoutParams != null ? this.f21017a.a(marginLayoutParams) : 0;
        q0.X(view, U(iH, view));
        x0(coordinatorLayout);
        Iterator it = this.f21040x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    v0.d p0() {
        return this.f21027k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class c extends u0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f21044c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
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
            this.f21044c = parcel.readInt();
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21044c);
        }

        public c(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f21044c = sideSheetBehavior.f21025i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21022f = new d();
        this.f21024h = true;
        this.f21025i = 5;
        this.f21026j = 5;
        this.f21029m = 0.1f;
        this.f21036t = -1;
        this.f21040x = new LinkedHashSet();
        this.f21041y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.Da);
        int i10 = m.Fa;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f21020d = jc.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.Ia)) {
            this.f21021e = p.k(context, attributeSet, 0, A).m();
        }
        int i11 = m.Ha;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f21023g = typedArrayObtainStyledAttributes.getDimension(m.Ea, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(m.Ga, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f21018b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
