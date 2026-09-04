package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class p extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f21411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f21412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f21413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f21414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f21415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f21420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f21421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f21422r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f21422r.start();
        }
    }

    p(t tVar) {
        super(tVar);
        this.f21413i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21405a.J();
            }
        };
        this.f21414j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f21406a, view, z10);
            }
        };
        this.f21415k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f21407a, z10);
            }
        };
        this.f21419o = Long.MAX_VALUE;
        Context context = tVar.getContext();
        int i10 = sb.c.Q;
        this.f21410f = gc.j.f(context, i10, 67);
        this.f21409e = gc.j.f(tVar.getContext(), i10, 50);
        this.f21411g = gc.j.g(tVar.getContext(), sb.c.V, tb.b.f53275a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21411g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f21402a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f21422r = E(this.f21410f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f21409e, 1.0f, 0.0f);
        this.f21421q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f21419o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f21418n != z10) {
            this.f21418n = z10;
            this.f21422r.cancel();
            this.f21421q.start();
        }
    }

    private void I() {
        this.f21412h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f21403a, view, motionEvent);
            }
        });
        this.f21412h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                p.A(this.f21404a);
            }
        });
        this.f21412h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f21412h == null) {
            return;
        }
        if (G()) {
            this.f21417m = false;
        }
        if (this.f21417m) {
            this.f21417m = false;
            return;
        }
        H(!this.f21418n);
        if (!this.f21418n) {
            this.f21412h.dismissDropDown();
        } else {
            this.f21412h.requestFocus();
            this.f21412h.showDropDown();
        }
    }

    private void K() {
        this.f21417m = true;
        this.f21419o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f21412h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f21417m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f21412h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        pVar.f21459d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f21459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f21416l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f21417m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f21417m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.u
    public void a(Editable editable) {
        if (this.f21420p.isTouchExplorationEnabled() && q.a(this.f21412h) && !this.f21459d.hasFocus()) {
            this.f21412h.dismissDropDown();
        }
        this.f21412h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f21408a);
            }
        });
    }

    @Override // com.google.android.material.textfield.u
    int c() {
        return sb.k.f51844p;
    }

    @Override // com.google.android.material.textfield.u
    int d() {
        return sb.f.f51743j;
    }

    @Override // com.google.android.material.textfield.u
    View.OnFocusChangeListener e() {
        return this.f21414j;
    }

    @Override // com.google.android.material.textfield.u
    View.OnClickListener f() {
        return this.f21413i;
    }

    @Override // com.google.android.material.textfield.u
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f21415k;
    }

    @Override // com.google.android.material.textfield.u
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.u
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.u
    boolean k() {
        return this.f21416l;
    }

    @Override // com.google.android.material.textfield.u
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.u
    boolean m() {
        return this.f21418n;
    }

    @Override // com.google.android.material.textfield.u
    public void n(EditText editText) {
        this.f21412h = D(editText);
        I();
        this.f21456a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f21420p.isTouchExplorationEnabled()) {
            this.f21459d.setImportantForAccessibility(2);
        }
        this.f21456a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.u
    public void o(View view, o0.p pVar) {
        if (!q.a(this.f21412h)) {
            pVar.u0(Spinner.class.getName());
        }
        if (pVar.d0()) {
            pVar.G0(null);
        }
    }

    @Override // com.google.android.material.textfield.u
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f21420p.isEnabled() || q.a(this.f21412h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f21418n && !this.f21412h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.u
    void s() {
        F();
        this.f21420p = (AccessibilityManager) this.f21458c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.u
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.u
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f21412h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f21412h.setOnDismissListener(null);
        }
    }
}
