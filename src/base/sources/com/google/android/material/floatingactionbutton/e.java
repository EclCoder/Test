package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.focus.FocusRingDrawable;
import gc.j;
import java.util.ArrayList;
import mc.i;
import mc.p;
import mc.s;
import tb.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class e {
    static final TimeInterpolator C = tb.b.f53277c;
    private static final int D = sb.c.K;
    private static final int E = sb.c.U;
    private static final int F = sb.c.L;
    private static final int G = sb.c.S;
    static final int[] H = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] J = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] K = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] L = {R.attr.state_enabled};
    static final int[] M = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    p f20136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    i f20137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f20138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.c f20139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f20140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f20141f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f20143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f20144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f20145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f20146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StateListAnimator f20147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animator f20148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f20149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h f20150o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20152q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f20154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f20155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f20156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final FloatingActionButton f20157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final lc.b f20158w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f20142g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f20151p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20153r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Rect f20159x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f20160y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f20161z = new RectF();
    private final Matrix A = new Matrix();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f20164c;

        a(boolean z10, g gVar) {
            this.f20163b = z10;
            this.f20164c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20162a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f20153r = 0;
            e.this.f20148m = null;
            if (this.f20162a) {
                return;
            }
            FloatingActionButton floatingActionButton = e.this.f20157v;
            boolean z10 = this.f20163b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            g gVar = this.f20164c;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.f20157v.b(0, this.f20163b);
            e.this.f20153r = 1;
            e.this.f20148m = animator;
            this.f20162a = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f20167b;

        b(boolean z10, g gVar) {
            this.f20166a = z10;
            this.f20167b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f20153r = 0;
            e.this.f20148m = null;
            g gVar = this.f20167b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.f20157v.b(0, this.f20166a);
            e.this.f20153r = 2;
            e.this.f20148m = animator;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends tb.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            e.this.f20151p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements TypeEvaluator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final FloatEvaluator f20170a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f20170a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0309e extends i {
        C0309e(p pVar) {
            super(pVar);
        }

        @Override // mc.i, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface f {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface g {
        void a();

        void b();
    }

    e(FloatingActionButton floatingActionButton, lc.b bVar) {
        this.f20157v = floatingActionButton;
        this.f20158w = bVar;
    }

    private boolean Z() {
        return this.f20157v.isLaidOut() && !this.f20157v.isInEditMode();
    }

    public static /* synthetic */ void a(e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix, ValueAnimator valueAnimator) {
        eVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eVar.f20157v.setAlpha(tb.b.b(f10, f11, 0.0f, 0.2f, fFloatValue));
        eVar.f20157v.setScaleX(tb.b.a(f12, f13, fFloatValue));
        eVar.f20157v.setScaleY(tb.b.a(f14, f13, fFloatValue));
        eVar.f20151p = tb.b.a(f15, f16, fFloatValue);
        eVar.h(tb.b.a(f15, f16, fFloatValue), matrix);
        eVar.f20157v.setImageMatrix(matrix);
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void h(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f20157v.getDrawable();
        if (drawable == null || this.f20152q == 0) {
            return;
        }
        RectF rectF = this.f20160y;
        RectF rectF2 = this.f20161z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f20152q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f20152q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet i(h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f20157v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f20157v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.h("scale").a(objectAnimatorOfFloat2);
        e0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f20157v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.h("scale").a(objectAnimatorOfFloat3);
        e0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f20157v, new tb.f(), new c(), new Matrix(this.A));
        hVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        tb.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet k(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f20157v.getAlpha();
        final float scaleX = this.f20157v.getScaleX();
        final float scaleY = this.f20157v.getScaleY();
        final float f13 = this.f20151p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.a(this.f20127a, alpha, f10, scaleX, f11, scaleY, f13, f12, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        tb.c.a(animatorSet, arrayList);
        animatorSet.setDuration(j.f(this.f20157v.getContext(), i10, this.f20157v.getContext().getResources().getInteger(sb.h.f51800b)));
        animatorSet.setInterpolator(j.g(this.f20157v.getContext(), i11, tb.b.f53276b));
        return animatorSet;
    }

    private StateListAnimator l(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(H, m(f10, f12));
        stateListAnimator.addState(I, m(f10, f11));
        stateListAnimator.addState(J, m(f10, f11));
        stateListAnimator.addState(K, m(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f20157v, "elevation", f10).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f20157v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f20157v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C);
        stateListAnimator.addState(L, animatorSet);
        stateListAnimator.addState(M, m(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator m(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f20157v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f20157v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C);
        return animatorSet;
    }

    void A(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        i iVarN = n();
        this.f20137b = iVarN;
        iVarN.setTintList(colorStateList);
        if (mode != null) {
            this.f20137b.setTintMode(mode);
        }
        this.f20137b.Y(this.f20157v.getContext());
        if (i10 > 0) {
            this.f20139d = j(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) m0.g.g(this.f20139d), (Drawable) m0.g.g(this.f20137b)});
        } else {
            this.f20139d = null;
            layerDrawable = this.f20137b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(colorStateList2), layerDrawable, null);
        this.f20138c = rippleDrawable;
        FocusRingDrawable.x(this.f20157v.getContext(), rippleDrawable, this.f20137b);
        this.f20140e = rippleDrawable;
    }

    boolean B() {
        if (this.f20157v.getVisibility() == 0) {
            return this.f20153r == 1;
        }
        return this.f20153r != 2;
    }

    boolean C() {
        if (this.f20157v.getVisibility() != 0) {
            return this.f20153r == 2;
        }
        return this.f20153r != 1;
    }

    void D() {
        i iVar = this.f20137b;
        if (iVar != null) {
            mc.j.f(this.f20157v, iVar);
        }
    }

    void E() {
        c0();
    }

    void F() {
        ViewTreeObserver viewTreeObserver = this.f20157v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    void G(float f10, float f11, float f12) {
        if (this.f20157v.getStateListAnimator() == this.f20147l) {
            StateListAnimator stateListAnimatorL = l(f10, f11, f12);
            this.f20147l = stateListAnimatorL;
            this.f20157v.setStateListAnimator(stateListAnimatorL);
        }
        if (Y()) {
            c0();
        }
    }

    void H(Rect rect) {
        m0.g.h(this.f20140e, "Didn't initialize content background");
        if (!Y()) {
            this.f20158w.b(this.f20140e);
        } else {
            this.f20158w.b(new InsetDrawable(this.f20140e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void I() {
        ArrayList arrayList = this.f20156u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f) obj).b();
            }
        }
    }

    void J() {
        ArrayList arrayList = this.f20156u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f) obj).a();
            }
        }
    }

    void K(ColorStateList colorStateList) {
        i iVar = this.f20137b;
        if (iVar != null) {
            iVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f20139d;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    void L(PorterDuff.Mode mode) {
        i iVar = this.f20137b;
        if (iVar != null) {
            iVar.setTintMode(mode);
        }
    }

    final void M(float f10) {
        if (this.f20143h != f10) {
            this.f20143h = f10;
            G(f10, this.f20144i, this.f20145j);
        }
    }

    void N(boolean z10) {
        this.f20141f = z10;
    }

    final void O(h hVar) {
        this.f20150o = hVar;
    }

    final void P(float f10) {
        if (this.f20144i != f10) {
            this.f20144i = f10;
            G(this.f20143h, f10, this.f20145j);
        }
    }

    final void Q(float f10) {
        this.f20151p = f10;
        Matrix matrix = this.A;
        h(f10, matrix);
        this.f20157v.setImageMatrix(matrix);
    }

    final void R(int i10) {
        if (this.f20152q != i10) {
            this.f20152q = i10;
            b0();
        }
    }

    void S(int i10) {
        this.f20146k = i10;
    }

    final void T(float f10) {
        if (this.f20145j != f10) {
            this.f20145j = f10;
            G(this.f20143h, this.f20144i, f10);
        }
    }

    void U(ColorStateList colorStateList) {
        Drawable drawable = this.f20138c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(kc.a.d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(kc.a.d(colorStateList));
        }
    }

    void V(boolean z10) {
        this.f20142g = z10;
        c0();
    }

    final void W(p pVar) {
        this.f20136a = pVar;
        i iVar = this.f20137b;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(pVar);
        }
        Object obj = this.f20138c;
        if (obj instanceof s) {
            ((s) obj).setShapeAppearanceModel(pVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f20139d;
        if (cVar != null) {
            cVar.f(pVar);
        }
    }

    final void X(h hVar) {
        this.f20149n = hVar;
    }

    boolean Y() {
        return this.f20158w.c() || z();
    }

    void a0(g gVar, boolean z10) {
        e eVar;
        AnimatorSet animatorSetK;
        if (C()) {
            return;
        }
        Animator animator = this.f20148m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f20149n == null;
        if (!Z()) {
            this.f20157v.b(0, z10);
            this.f20157v.setAlpha(1.0f);
            this.f20157v.setScaleY(1.0f);
            this.f20157v.setScaleX(1.0f);
            Q(1.0f);
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        if (this.f20157v.getVisibility() != 0) {
            this.f20157v.setAlpha(0.0f);
            this.f20157v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f20157v.setScaleX(z11 ? 0.4f : 0.0f);
            Q(z11 ? 0.4f : 0.0f);
        }
        h hVar = this.f20149n;
        if (hVar != null) {
            animatorSetK = i(hVar, 1.0f, 1.0f, 1.0f);
            eVar = this;
        } else {
            eVar = this;
            animatorSetK = eVar.k(1.0f, 1.0f, 1.0f, D, E);
        }
        animatorSetK.addListener(new b(z10, gVar));
        ArrayList arrayList = eVar.f20154s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetK.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetK.start();
    }

    final void b0() {
        Q(this.f20151p);
    }

    final void c0() {
        Rect rect = this.f20159x;
        t(rect);
        H(rect);
        this.f20158w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void d0(float f10) {
        i iVar = this.f20137b;
        if (iVar != null) {
            iVar.k0(f10);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f20155t == null) {
            this.f20155t = new ArrayList();
        }
        this.f20155t.add(animatorListener);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f20154s == null) {
            this.f20154s = new ArrayList();
        }
        this.f20154s.add(animatorListener);
    }

    void g(f fVar) {
        if (this.f20156u == null) {
            this.f20156u = new ArrayList();
        }
        this.f20156u.add(fVar);
    }

    com.google.android.material.floatingactionbutton.c j(int i10, ColorStateList colorStateList) {
        Context context = this.f20157v.getContext();
        com.google.android.material.floatingactionbutton.c cVar = new com.google.android.material.floatingactionbutton.c((p) m0.g.g(this.f20136a));
        cVar.e(androidx.core.content.a.getColor(context, sb.d.f51652e), androidx.core.content.a.getColor(context, sb.d.f51651d), androidx.core.content.a.getColor(context, sb.d.f51649b), androidx.core.content.a.getColor(context, sb.d.f51650c));
        cVar.d(i10);
        cVar.c(colorStateList);
        return cVar;
    }

    i n() {
        return new C0309e((p) m0.g.g(this.f20136a));
    }

    final Drawable o() {
        return this.f20140e;
    }

    float p() {
        return this.f20157v.getElevation();
    }

    boolean q() {
        return this.f20141f;
    }

    final h r() {
        return this.f20150o;
    }

    float s() {
        return this.f20144i;
    }

    void t(Rect rect) {
        if (this.f20158w.c()) {
            int iX = x();
            float fP = this.f20142g ? p() + this.f20145j : 0.0f;
            int iMax = Math.max(iX, (int) Math.ceil(fP));
            int iMax2 = Math.max(iX, (int) Math.ceil(fP * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!z()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f20146k - this.f20157v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    float u() {
        return this.f20145j;
    }

    final p v() {
        return this.f20136a;
    }

    final h w() {
        return this.f20149n;
    }

    int x() {
        if (this.f20141f) {
            return Math.max((this.f20146k - this.f20157v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void y(g gVar, boolean z10) {
        e eVar;
        AnimatorSet animatorSetK;
        if (B()) {
            return;
        }
        Animator animator = this.f20148m;
        if (animator != null) {
            animator.cancel();
        }
        if (!Z()) {
            this.f20157v.b(z10 ? 8 : 4, z10);
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        h hVar = this.f20150o;
        if (hVar != null) {
            animatorSetK = i(hVar, 0.0f, 0.0f, 0.0f);
            eVar = this;
        } else {
            eVar = this;
            animatorSetK = eVar.k(0.0f, 0.4f, 0.4f, F, G);
        }
        animatorSetK.addListener(new a(z10, gVar));
        ArrayList arrayList = eVar.f20155t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetK.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetK.start();
    }

    final boolean z() {
        return this.f20141f && this.f20157v.getSizeDimension() < this.f20146k;
    }
}
