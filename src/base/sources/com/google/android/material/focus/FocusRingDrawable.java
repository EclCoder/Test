package com.google.android.material.focus;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import mc.i;
import mc.o;
import mc.p;
import mc.q;
import mc.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sb.e;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Drawable f20184p = new ColorDrawable(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f20185q = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final TimeInterpolator f20186r = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final FloatProperty f20187s = new a("interpolation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f20188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f20189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f20190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Path f20191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f20192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f20193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f20194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f20195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ObjectAnimator f20197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f20198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f20202o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(FocusRingDrawable focusRingDrawable) {
            return Float.valueOf(focusRingDrawable.f20198k);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(FocusRingDrawable focusRingDrawable, float f10) {
            focusRingDrawable.f20198k = f10;
            focusRingDrawable.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FocusRingDrawable.this.f20198k = 1.0f;
            FocusRingDrawable.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Drawable.ConstantState f20204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f20208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f20209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f20211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f20213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f20214k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f20215l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f20216m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f20217n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f20218o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private float f20219p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f20220q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f20221r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f20222s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private o f20223t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f20224u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f20225v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Rect f20226w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int[] f20227x;

        c(c cVar) {
            this.f20205b = 0;
            this.f20206c = false;
            this.f20207d = Integer.MIN_VALUE;
            this.f20208e = false;
            this.f20209f = Integer.MIN_VALUE;
            this.f20210g = Integer.MIN_VALUE;
            this.f20211h = Integer.MIN_VALUE;
            this.f20212i = Integer.MIN_VALUE;
            this.f20213j = Float.NaN;
            this.f20214k = Integer.MIN_VALUE;
            this.f20215l = Float.NaN;
            this.f20216m = Integer.MIN_VALUE;
            this.f20217n = Float.NaN;
            this.f20218o = Integer.MIN_VALUE;
            this.f20219p = Float.NaN;
            this.f20220q = Integer.MIN_VALUE;
            this.f20221r = Float.NaN;
            this.f20222s = Integer.MIN_VALUE;
            this.f20223t = null;
            this.f20224u = Integer.MIN_VALUE;
            this.f20225v = Integer.MIN_VALUE;
            this.f20226w = null;
            this.f20227x = FocusRingDrawable.f20185q;
            if (cVar != null) {
                this.f20204a = cVar.f20204a;
                this.f20205b = cVar.f20205b;
                this.f20206c = cVar.f20206c;
                this.f20207d = cVar.f20207d;
                this.f20208e = cVar.f20208e;
                this.f20209f = cVar.f20209f;
                this.f20210g = cVar.f20210g;
                this.f20211h = cVar.f20211h;
                this.f20212i = cVar.f20212i;
                this.f20213j = cVar.f20213j;
                this.f20214k = cVar.f20214k;
                this.f20215l = cVar.f20215l;
                this.f20216m = cVar.f20216m;
                this.f20217n = cVar.f20217n;
                this.f20218o = cVar.f20218o;
                this.f20219p = cVar.f20219p;
                this.f20220q = cVar.f20220q;
                this.f20221r = cVar.f20221r;
                this.f20222s = cVar.f20222s;
                this.f20224u = cVar.f20224u;
                this.f20225v = cVar.f20225v;
                o oVar = cVar.f20223t;
                if (oVar instanceof p) {
                    this.f20223t = ((p) oVar).F().m();
                } else if (oVar instanceof x) {
                    this.f20223t = ((x) oVar).m().j();
                } else {
                    this.f20223t = oVar;
                }
                if (cVar.f20226w != null) {
                    this.f20226w = new Rect(cVar.f20226w);
                }
                int[] iArr = cVar.f20227x;
                this.f20227x = Arrays.copyOf(iArr, iArr.length);
            }
        }

        boolean S() {
            return this.f20204a != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f20204a;
            return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f20205b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources, null);
        }
    }

    /* synthetic */ FocusRingDrawable(c cVar, Resources resources, a aVar) {
        this(cVar, resources);
    }

    private float A(float f10, Resources.Theme theme, int i10, TypedArray typedArray, int i11, int i12) {
        if (!Float.isNaN(f10)) {
            return f10;
        }
        Resources resources = theme.getResources();
        if (i10 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i10, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i11, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i12 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i12);
    }

    private static boolean G(Context context) {
        return jc.b.d(context.getTheme(), sb.c.f51636u, false);
    }

    private o H(Drawable drawable) {
        if (drawable instanceof ShapeDrawable) {
            return J((ShapeDrawable) drawable);
        }
        if (drawable instanceof GradientDrawable) {
            return I((GradientDrawable) drawable);
        }
        return null;
    }

    private o I(GradientDrawable gradientDrawable) {
        float[] fArrO = o(gradientDrawable);
        if (fArrO != null) {
            return p.g().E(Math.min(fArrO[0], fArrO[1])).I(Math.min(fArrO[2], fArrO[3])).z(Math.min(fArrO[4], fArrO[5])).v(Math.min(fArrO[6], fArrO[7])).m();
        }
        float fP = p(gradientDrawable);
        if (fP > 0.0f) {
            return p.g().o(fP).m();
        }
        return null;
    }

    private o J(ShapeDrawable shapeDrawable) {
        Outline outline = new Outline();
        shapeDrawable.getOutline(outline);
        if (outline.getRadius() > 0.0f) {
            return p.g().o(outline.getRadius()).m();
        }
        return null;
    }

    private void L() {
        this.f20188a.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f20202o.f20213j)) {
            return;
        }
        this.f20188a.setStrokeWidth(this.f20202o.f20213j);
    }

    private void M(o oVar) {
        d(this.f20189b);
        p pVarB = oVar.b(f20185q);
        if (!pVarB.E(this.f20189b)) {
            this.f20194g.f(pVarB, null, 1.0f, this.f20189b, null, this.f20192e);
            this.f20196i = -1.0f;
        } else {
            float fG = g();
            this.f20189b.inset(fG, fG);
            this.f20196i = pVarB.A().a(this.f20189b);
            this.f20192e.reset();
        }
    }

    private void N(TypedArray typedArray, Resources.Theme theme) {
        TypedValue typedValueB;
        if (this.f20202o.f20207d != Integer.MIN_VALUE && (typedValueB = jc.b.b(theme, this.f20202o.f20207d)) != null) {
            this.f20202o.f20206c = typedValueB.data != 0;
            this.f20202o.f20208e = true;
        }
        if (!this.f20202o.f20208e) {
            c cVar = this.f20202o;
            cVar.f20206c = jc.b.d(theme, sb.c.f51636u, cVar.f20206c);
        }
        if (this.f20202o.f20206c) {
            c cVar2 = this.f20202o;
            cVar2.f20209f = z(cVar2.f20209f, theme, this.f20202o.f20210g, typedArray, m.f51888a4, -16777216);
            c cVar3 = this.f20202o;
            cVar3.f20211h = z(cVar3.f20211h, theme, this.f20202o.f20212i, typedArray, m.W3, -1);
            c cVar4 = this.f20202o;
            cVar4.f20213j = A(cVar4.f20213j, theme, this.f20202o.f20214k, typedArray, m.f51904b4, e.U0);
            c cVar5 = this.f20202o;
            cVar5.f20215l = A(cVar5.f20215l, theme, this.f20202o.f20216m, typedArray, m.Y3, e.T0);
            c cVar6 = this.f20202o;
            cVar6.f20217n = A(cVar6.f20217n, theme, this.f20202o.f20218o, typedArray, m.f51920c4, 0);
            c cVar7 = this.f20202o;
            cVar7.f20219p = A(cVar7.f20219p, theme, this.f20202o.f20220q, typedArray, m.Z3, 0);
            if (Float.isNaN(this.f20202o.f20219p)) {
                this.f20202o.f20219p = 0.0f;
            }
            c cVar8 = this.f20202o;
            cVar8.f20221r = A(cVar8.f20221r, theme, this.f20202o.f20222s, typedArray, m.X3, e.S0);
            if (this.f20202o.f20224u != Integer.MIN_VALUE) {
                c cVar9 = this.f20202o;
                cVar9.f20223t = p.n(theme, cVar9.f20224u).m();
            } else {
                TypedValue typedValueB2 = jc.b.b(theme, this.f20202o.f20225v != Integer.MIN_VALUE ? this.f20202o.f20225v : sb.c.f51638v);
                if (typedValueB2 != null) {
                    this.f20202o.f20223t = p.n(theme, typedValueB2.resourceId).m();
                }
            }
        }
    }

    private void O(TypedArray typedArray) {
        c cVar = this.f20202o;
        int i10 = m.V3;
        cVar.f20207d = s(typedArray, i10);
        if (this.f20202o.f20207d == Integer.MIN_VALUE && typedArray.hasValue(i10)) {
            c cVar2 = this.f20202o;
            cVar2.f20206c = typedArray.getBoolean(i10, cVar2.f20206c);
            this.f20202o.f20208e = true;
        }
        c cVar3 = this.f20202o;
        int i11 = m.f51888a4;
        cVar3.f20210g = s(typedArray, i11);
        if (this.f20202o.f20210g == Integer.MIN_VALUE) {
            this.f20202o.f20209f = typedArray.getColor(i11, Integer.MIN_VALUE);
        }
        c cVar4 = this.f20202o;
        int i12 = m.W3;
        cVar4.f20212i = s(typedArray, i12);
        if (this.f20202o.f20212i == Integer.MIN_VALUE) {
            this.f20202o.f20211h = typedArray.getColor(i12, Integer.MIN_VALUE);
        }
        c cVar5 = this.f20202o;
        int i13 = m.f51904b4;
        cVar5.f20214k = s(typedArray, i13);
        if (this.f20202o.f20214k == Integer.MIN_VALUE) {
            this.f20202o.f20213j = typedArray.getDimension(i13, Float.NaN);
        }
        c cVar6 = this.f20202o;
        int i14 = m.Y3;
        cVar6.f20216m = s(typedArray, i14);
        if (this.f20202o.f20216m == Integer.MIN_VALUE) {
            this.f20202o.f20215l = typedArray.getDimension(i14, Float.NaN);
        }
        this.f20202o.f20216m = s(typedArray, i14);
        if (this.f20202o.f20216m == Integer.MIN_VALUE) {
            this.f20202o.f20215l = typedArray.getDimension(i14, Float.NaN);
        }
        c cVar7 = this.f20202o;
        int i15 = m.f51920c4;
        cVar7.f20218o = s(typedArray, i15);
        if (this.f20202o.f20218o == Integer.MIN_VALUE) {
            this.f20202o.f20217n = typedArray.getDimension(i15, Float.NaN);
        }
        c cVar8 = this.f20202o;
        int i16 = m.Z3;
        cVar8.f20220q = s(typedArray, i16);
        if (this.f20202o.f20220q == Integer.MIN_VALUE) {
            this.f20202o.f20219p = typedArray.getDimension(i16, Float.NaN);
        }
        c cVar9 = this.f20202o;
        int i17 = m.X3;
        cVar9.f20222s = s(typedArray, i17);
        if (this.f20202o.f20222s == Integer.MIN_VALUE) {
            this.f20202o.f20221r = typedArray.getDimension(i17, Float.NaN);
        }
        c cVar10 = this.f20202o;
        int i18 = m.f51936d4;
        cVar10.f20225v = s(typedArray, i18);
        this.f20202o.f20224u = r(typedArray, i18);
    }

    public static Drawable P(Context context, Drawable drawable) {
        return !G(context) ? drawable : new FocusRingDrawable(context, drawable);
    }

    private void d(RectF rectF) {
        if (this.f20202o.f20226w != null) {
            rectF.set(this.f20202o.f20226w);
            return;
        }
        WeakReference weakReference = this.f20195h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((i) this.f20195h.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        rippleDrawable.getHotspotBounds(this.f20190c);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            this.f20190c.inset(Math.max(0, (this.f20190c.width() / 2) - radius), Math.max(0, (this.f20190c.height() / 2) - radius));
        }
        rectF.set(this.f20190c);
    }

    private float e() {
        return this.f20202o.f20219p + this.f20202o.f20221r + ((this.f20202o.f20215l / 2.0f) * this.f20198k);
    }

    private float f(float f10) {
        return Math.max(0.0f, f10 - (this.f20202o.f20213j / 2.0f));
    }

    private float g() {
        return this.f20202o.f20219p + ((this.f20202o.f20213j / 2.0f) * this.f20198k);
    }

    private float h() {
        int radius;
        if (!Float.isNaN(this.f20202o.f20217n)) {
            return this.f20202o.f20217n;
        }
        float f10 = this.f20196i;
        if (f10 >= 0.0f) {
            return f10;
        }
        WeakReference weakReference = this.f20195h;
        if (weakReference != null && weakReference.get() != null) {
            float fM = ((i) this.f20195h.get()).m();
            if (fM >= 0.0f) {
                return Math.max(0.0f, fM - (this.f20202o.f20213j / 2.0f));
            }
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
            return 0.0f;
        }
        return radius;
    }

    private void i() {
        if (this.f20202o.f20223t != null) {
            M(this.f20202o.f20223t);
        } else {
            if (K()) {
                return;
            }
            this.f20196i = -1.0f;
            this.f20192e.reset();
        }
    }

    private ObjectAnimator j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20187s, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(f20186r);
        objectAnimatorOfFloat.addListener(new b());
        return objectAnimatorOfFloat;
    }

    private void k(Canvas canvas, Path path, float f10, float f11, int i10) {
        d(this.f20189b);
        float f12 = f10 * 2.0f;
        float fWidth = 1.0f - (f12 / this.f20189b.width());
        float fHeight = 1.0f - (f12 / this.f20189b.height());
        this.f20193f.reset();
        this.f20193f.postScale(fWidth, fHeight, this.f20189b.centerX(), this.f20189b.centerY());
        path.transform(this.f20193f, this.f20191d);
        this.f20188a.setStrokeWidth(f11 * this.f20198k);
        this.f20188a.setColor(i10);
        canvas.drawPath(this.f20191d, this.f20188a);
    }

    private void l(Canvas canvas, float f10, float f11, float f12, int i10) {
        d(this.f20189b);
        this.f20189b.inset(f11, f11);
        this.f20188a.setStrokeWidth(f12 * this.f20198k);
        this.f20188a.setColor(i10);
        canvas.drawRoundRect(this.f20189b, f10, f10, this.f20188a);
    }

    public static FocusRingDrawable m(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i10 = 0; i10 < layerDrawable.getNumberOfLayers(); i10++) {
            Drawable drawable3 = layerDrawable.getDrawable(i10);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static FocusRingDrawable n(Drawable drawable) {
        if (drawable == null || m(drawable) == null) {
            return null;
        }
        drawable.mutate();
        return m(drawable);
    }

    private float[] o(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadii();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private float p(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadius();
        } catch (NullPointerException unused) {
            return -1.0f;
        }
    }

    private Path q() {
        if (!this.f20192e.isEmpty()) {
            return this.f20192e;
        }
        WeakReference weakReference = this.f20195h;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        Path pathH = ((i) this.f20195h.get()).H();
        if (pathH.isEmpty()) {
            return null;
        }
        return pathH;
    }

    private int r(TypedArray typedArray, int i10) {
        if (typedArray.getType(i10) == 1) {
            return typedArray.getResourceId(i10, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private int s(TypedArray typedArray, int i10) {
        if (typedArray.getType(i10) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private void t(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f20202o.f20204a = drawableCreateFromXmlInner.getConstantState();
        } else {
            Drawable drawable = f20184p;
            setDrawable(drawable);
            this.f20202o.f20204a = drawable.getConstantState();
        }
    }

    private void u(Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(m.U3);
        N(typedArrayObtainStyledAttributes, theme);
        typedArrayObtainStyledAttributes.recycle();
        L();
    }

    public static FocusRingDrawable w(Context context, LayerDrawable layerDrawable) {
        return x(context, layerDrawable, null);
    }

    public static FocusRingDrawable x(Context context, LayerDrawable layerDrawable, i iVar) {
        if (!G(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f20184p);
        if (iVar != null) {
            focusRingDrawable.D(iVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private void y(boolean z10) {
        ObjectAnimator objectAnimator = this.f20197j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f20197j = null;
        }
        if (!z10) {
            this.f20198k = 1.0f;
            return;
        }
        ObjectAnimator objectAnimatorJ = j();
        this.f20197j = objectAnimatorJ;
        objectAnimatorJ.start();
    }

    private int z(int i10, Resources.Theme theme, int i11, TypedArray typedArray, int i12, int i13) {
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i11, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i12, i13);
    }

    public void B(int i10, int i11, int i12, int i13) {
        if (this.f20202o.f20226w == null) {
            this.f20202o.f20226w = new Rect();
        }
        this.f20202o.f20226w.set(i10, i11, i12, i13);
    }

    public void C(Rect rect) {
        this.f20202o.f20226w = rect;
    }

    public void D(i iVar) {
        this.f20195h = new WeakReference(iVar);
    }

    public void E(o oVar) {
        this.f20202o.f20223t = oVar;
    }

    public void F(int[] iArr) {
        this.f20202o.f20227x = iArr;
    }

    public boolean K() {
        o oVarH = H(getDrawable());
        if (oVarH == null) {
            return false;
        }
        M(oVarH);
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        u(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f20202o.f20206c && this.f20200m) {
            float fG = g();
            float fE = e();
            Path pathQ = q();
            if (pathQ != null) {
                k(canvas, pathQ, fE, this.f20202o.f20215l, this.f20202o.f20211h);
                k(canvas, pathQ, fG, this.f20202o.f20213j, this.f20202o.f20209f);
            } else {
                float fH = h();
                l(canvas, f(fH), fE, this.f20202o.f20215l, this.f20202o.f20211h);
                l(canvas, fH, fG, this.f20202o.f20213j, this.f20202o.f20209f);
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (!this.f20202o.S()) {
            return null;
        }
        this.f20202o.f20205b = getChangingConfigurations();
        return this.f20202o;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.f20202o.f20206c;
        } catch (NoSuchMethodError unused) {
            return this.f20202o.f20206c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || this.f20202o.f20206c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f20197j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f20197j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f20201n && super.mutate() == this) {
            this.f20202o = new c(this.f20202o);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f20202o.f20204a = drawable.getConstantState();
            }
            this.f20201n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f20202o.f20206c) {
            i();
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (!this.f20202o.f20206c) {
            this.f20200m = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(this.f20202o.f20227x, iArr);
        boolean z10 = this.f20200m != zStateSetMatches;
        this.f20200m = zStateSetMatches;
        if (z10 && iArr.length > 0 && !this.f20199l) {
            y(zStateSetMatches);
        }
        this.f20199l = iArr.length == 0;
        return super.onStateChange(iArr) || z10;
    }

    public boolean v() {
        return this.f20202o.f20206c;
    }

    public FocusRingDrawable() {
        super(null);
        this.f20188a = new Paint(1);
        this.f20189b = new RectF();
        this.f20190c = new Rect();
        this.f20191d = new Path();
        this.f20192e = new Path();
        this.f20193f = new Matrix();
        this.f20194g = q.m();
        this.f20196i = -1.0f;
        this.f20198k = 1.0f;
        this.f20200m = false;
        this.f20201n = false;
        this.f20202o = new c(null);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, m.U3, 0, 0) : resources.obtainAttributes(attributeSet, m.U3);
        O(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        t(resources, xmlPullParser, attributeSet, theme);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f20188a = new Paint(1);
        this.f20189b = new RectF();
        this.f20190c = new Rect();
        this.f20191d = new Path();
        this.f20192e = new Path();
        this.f20193f = new Matrix();
        this.f20194g = q.m();
        this.f20196i = -1.0f;
        this.f20198k = 1.0f;
        this.f20200m = false;
        this.f20201n = false;
        c cVar = new c(null);
        this.f20202o = cVar;
        if (drawable != null) {
            cVar.f20204a = drawable.getConstantState();
        }
        u(context.getTheme());
    }

    private FocusRingDrawable(c cVar, Resources resources) {
        Drawable drawableNewDrawable;
        super(null);
        this.f20188a = new Paint(1);
        this.f20189b = new RectF();
        this.f20190c = new Rect();
        this.f20191d = new Path();
        this.f20192e = new Path();
        this.f20193f = new Matrix();
        this.f20194g = q.m();
        this.f20196i = -1.0f;
        this.f20198k = 1.0f;
        this.f20200m = false;
        this.f20201n = false;
        c cVar2 = new c(cVar);
        this.f20202o = cVar2;
        Drawable.ConstantState constantState = cVar2.f20204a;
        if (constantState != null) {
            if (resources != null) {
                drawableNewDrawable = constantState.newDrawable(resources);
            } else {
                drawableNewDrawable = constantState.newDrawable();
            }
            setDrawable(drawableNewDrawable);
        }
        L();
    }
}
