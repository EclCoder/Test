package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.api.client.http.HttpStatusCodes;
import gc.j;
import mc.e;
import mc.f;
import mc.i;
import mc.n;
import mc.o;
import mc.p;
import mc.x;
import r.c;
import r.d;
import sb.g;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class b {
    private static final Drawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final double f19676z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialCardView f19677a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f19679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f19680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f19686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f19687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f19688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f19689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o f19690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f19691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f19692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayerDrawable f19693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private i f19694r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f19697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f19698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f19699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f19700x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f19678b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19695s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f19701y = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f19681e = -1.0f;
        this.f19677a = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, d.f50983a, i10, c.f50982a);
        i iVar = new i(materialCardView.getContext(), attributeSet, i10, i11);
        this.f19679c = iVar;
        iVar.Y(materialCardView.getContext());
        iVar.s0(-12303292);
        p.b bVarF = iVar.M().F();
        int i12 = d.f50987e;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(i12, 0.0f);
            this.f19681e = dimension;
            bVarF.o(dimension);
        }
        this.f19680d = new i();
        Y(bVarF.m());
        this.f19698v = j.g(materialCardView.getContext(), sb.c.V, tb.b.f53275a);
        this.f19699w = j.f(materialCardView.getContext(), sb.c.P, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        this.f19700x = j.f(materialCardView.getContext(), sb.c.O, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f19677a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f19684h & 80) == 80;
    }

    private boolean H() {
        return (this.f19684h & 8388613) == 8388613;
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f19687k.setAlpha((int) (255.0f * fFloatValue));
        bVar.f19701y = fFloatValue;
    }

    private float c() {
        float fMax = 0.0f;
        for (p pVar : this.f19690n.d()) {
            if (pVar != null) {
                fMax = Math.max(fMax, u(pVar));
            }
        }
        return fMax;
    }

    private boolean c0() {
        return this.f19677a.getPreventCornerOverlap() && !g();
    }

    private float d(e eVar, float f10) {
        if (eVar instanceof n) {
            return (float) ((1.0d - f19676z) * ((double) f10));
        }
        if (eVar instanceof f) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f19677a.getPreventCornerOverlap() && g() && this.f19677a.getUseCompatPadding();
    }

    private float e() {
        return this.f19677a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    private boolean e0() {
        if (this.f19677a.isClickable()) {
            return true;
        }
        View view = this.f19677a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private float f() {
        return (this.f19677a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    private boolean g() {
        return this.f19679c.c0();
    }

    private Drawable h() {
        this.f19694r = new i(this.f19690n);
        return new RippleDrawable(this.f19688l, null, this.f19694r);
    }

    private f1.i i(Context context) {
        return j.h(context, sb.c.f51597a0, l.f51859c);
    }

    private void i0(Drawable drawable) {
        if (this.f19677a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f19677a.getForeground()).setDrawable(drawable);
        } else {
            this.f19677a.setForeground(D(drawable));
        }
    }

    private void k0() {
        Drawable drawable = this.f19692p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f19688l);
        }
    }

    private Drawable s() {
        if (this.f19692p == null) {
            this.f19692p = h();
        }
        if (this.f19693q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f19692p, this.f19680d, this.f19687k});
            FocusRingDrawable.x(this.f19677a.getContext(), layerDrawable, this.f19694r);
            layerDrawable.setId(2, g.D);
            this.f19693q = layerDrawable;
        }
        return this.f19693q;
    }

    private float u(p pVar) {
        return Math.max(Math.max(d(pVar.z(), this.f19679c.R()), d(pVar.B(), this.f19679c.S())), Math.max(d(pVar.t(), this.f19679c.z()), d(pVar.r(), this.f19679c.y())));
    }

    private float v() {
        if (this.f19677a.getPreventCornerOverlap() && this.f19677a.getUseCompatPadding()) {
            return (float) ((1.0d - f19676z) * ((double) this.f19677a.getCardViewRadius()));
        }
        return 0.0f;
    }

    ColorStateList A() {
        return this.f19691o;
    }

    int B() {
        return this.f19685i;
    }

    Rect C() {
        return this.f19678b;
    }

    boolean E() {
        return this.f19695s;
    }

    boolean F() {
        return this.f19696t;
    }

    void I(TypedArray typedArray) {
        x xVarH;
        ColorStateList colorStateListA = jc.c.a(this.f19677a.getContext(), typedArray, m.f52179t6);
        this.f19691o = colorStateListA;
        if (colorStateListA == null) {
            this.f19691o = ColorStateList.valueOf(-1);
        }
        this.f19685i = typedArray.getDimensionPixelSize(m.f52194u6, 0);
        boolean z10 = typedArray.getBoolean(m.f52044k6, false);
        this.f19696t = z10;
        this.f19677a.setLongClickable(z10);
        this.f19689m = jc.c.a(this.f19677a.getContext(), typedArray, m.f52134q6);
        Q(jc.c.e(this.f19677a.getContext(), typedArray, m.f52074m6));
        T(typedArray.getDimensionPixelSize(m.f52119p6, 0));
        S(typedArray.getDimensionPixelSize(m.f52104o6, 0));
        this.f19684h = typedArray.getInteger(m.f52089n6, 8388661);
        ColorStateList colorStateListA2 = jc.c.a(this.f19677a.getContext(), typedArray, m.f52149r6);
        this.f19688l = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f19688l = ColorStateList.valueOf(ac.a.d(this.f19677a, h.a.f39867t));
        }
        M(jc.c.a(this.f19677a.getContext(), typedArray, m.f52059l6));
        k0();
        h0();
        l0();
        this.f19677a.setBackgroundInternal(D(this.f19679c));
        Drawable drawableS = e0() ? s() : this.f19680d;
        this.f19686j = drawableS;
        this.f19677a.setForeground(D(drawableS));
        if (this.f19681e != -1.0f || (xVarH = x.h(this.f19677a.getContext(), typedArray, m.f52164s6)) == null) {
            return;
        }
        f1.i iVarI = i(this.f19677a.getContext());
        this.f19679c.j0(iVarI);
        this.f19680d.j0(iVarI);
        i iVar = this.f19694r;
        if (iVar != null) {
            iVar.j0(iVarI);
        }
        Y(xVarH);
    }

    void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f19693q != null) {
            if (this.f19677a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f19682f) - this.f19683g) - iCeil2 : this.f19682f;
            int i15 = G() ? this.f19682f : ((i11 - this.f19682f) - this.f19683g) - iCeil;
            int i16 = H() ? this.f19682f : ((i10 - this.f19682f) - this.f19683g) - iCeil2;
            int i17 = G() ? ((i11 - this.f19682f) - this.f19683g) - iCeil : this.f19682f;
            if (this.f19677a.getLayoutDirection() == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f19693q.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void K(boolean z10) {
        this.f19695s = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f19679c.l0(colorStateList);
    }

    void M(ColorStateList colorStateList) {
        i iVar = this.f19680d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.l0(colorStateList);
    }

    void N(boolean z10) {
        this.f19696t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f19687k;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f19701y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = f0.a.r(drawable).mutate();
            this.f19687k = drawableMutate;
            drawableMutate.setTintList(this.f19689m);
            O(this.f19677a.isChecked());
        } else {
            this.f19687k = A;
        }
        LayerDrawable layerDrawable = this.f19693q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(g.D, this.f19687k);
        }
    }

    void R(int i10) {
        this.f19684h = i10;
        J(this.f19677a.getMeasuredWidth(), this.f19677a.getMeasuredHeight());
    }

    void S(int i10) {
        this.f19682f = i10;
    }

    void T(int i10) {
        this.f19683g = i10;
    }

    void U(ColorStateList colorStateList) {
        this.f19689m = colorStateList;
        Drawable drawable = this.f19687k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    void V(float f10) {
        this.f19681e = f10;
        Y(this.f19690n.e().a(f10));
        this.f19686j.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    void W(float f10) {
        this.f19679c.m0(f10);
        i iVar = this.f19680d;
        if (iVar != null) {
            iVar.m0(f10);
        }
        i iVar2 = this.f19694r;
        if (iVar2 != null) {
            iVar2.m0(f10);
        }
    }

    void X(ColorStateList colorStateList) {
        this.f19688l = colorStateList;
        k0();
    }

    void Y(o oVar) {
        this.f19690n = oVar;
        this.f19679c.u0(oVar);
        this.f19680d.u0(oVar);
        i iVar = this.f19694r;
        if (iVar != null) {
            iVar.u0(oVar);
        }
        i iVar2 = this.f19679c;
        iVar2.r0(!iVar2.c0());
    }

    void Z(ColorStateList colorStateList) {
        if (this.f19691o == colorStateList) {
            return;
        }
        this.f19691o = colorStateList;
        l0();
    }

    void a0(int i10) {
        if (i10 == this.f19685i) {
            return;
        }
        this.f19685i = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f19701y : this.f19701y;
        ValueAnimator valueAnimator = this.f19697u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19697u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f19701y, f10);
        this.f19697u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f19675a, valueAnimator2);
            }
        });
        this.f19697u.setInterpolator(this.f19698v);
        this.f19697u.setDuration((long) ((z10 ? this.f19699w : this.f19700x) * f11));
        this.f19697u.start();
    }

    void b0(int i10, int i11, int i12, int i13) {
        this.f19678b.set(i10, i11, i12, i13);
        g0();
    }

    void f0() {
        Drawable drawable = this.f19686j;
        Drawable drawableS = e0() ? s() : this.f19680d;
        this.f19686j = drawableS;
        if (drawable != drawableS) {
            i0(drawableS);
        }
    }

    void g0() {
        int iC = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f19677a;
        Rect rect = this.f19678b;
        materialCardView.j(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void h0() {
        this.f19679c.k0(this.f19677a.getCardElevation());
    }

    void j() {
        Drawable drawable = this.f19692p;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f19692p.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f19692p.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    void j0() {
        if (!E()) {
            this.f19677a.setBackgroundInternal(D(this.f19679c));
        }
        this.f19677a.setForeground(D(this.f19686j));
    }

    i k() {
        return this.f19679c;
    }

    ColorStateList l() {
        return this.f19679c.E();
    }

    void l0() {
        this.f19680d.x0(this.f19685i, this.f19691o);
    }

    ColorStateList m() {
        return this.f19680d.E();
    }

    Drawable n() {
        return this.f19687k;
    }

    int o() {
        return this.f19684h;
    }

    int p() {
        return this.f19682f;
    }

    int q() {
        return this.f19683g;
    }

    ColorStateList r() {
        return this.f19689m;
    }

    float t() {
        return this.f19679c.R();
    }

    float w() {
        return this.f19679c.F();
    }

    ColorStateList x() {
        return this.f19688l;
    }

    o y() {
        return this.f19690n;
    }

    int z() {
        ColorStateList colorStateList = this.f19691o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
