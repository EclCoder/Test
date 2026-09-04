package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import gc.j;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mc.i;
import n0.q0;
import o0.p;
import sb.k;
import sb.l;
import sb.m;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a, T> extends View {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final String f21052h1 = "BaseSlider";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    static final int f21053i1 = l.Y;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f21054j1 = sb.c.N;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f21055k1 = sb.c.Q;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f21056l1 = sb.c.U;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f21057m1 = sb.c.S;
    private int A;
    private int A0;
    private int B;
    private int B0;
    private int C;
    private boolean C0;
    private int D;
    private boolean D0;
    private int E;
    private boolean E0;
    private int F;
    private ColorStateList F0;
    private int G;
    private ColorStateList G0;
    private int H;
    private ColorStateList H0;
    private int I;
    private ColorStateList I0;
    private int J;
    private ColorStateList J0;
    private int K;
    private final Path K0;
    private int L;
    private final RectF L0;
    private int M;
    private final RectF M0;
    private int N;
    private final RectF N0;
    private int O;
    private final RectF O0;
    private int P;
    private final Rect P0;
    private int Q;
    private final RectF Q0;
    private boolean R;
    private final Rect R0;
    private Drawable S;
    private final Matrix S0;
    private boolean T;
    private final List T0;
    private Drawable U;
    private Drawable U0;
    private boolean V;
    private List V0;
    private ColorStateList W;
    private float W0;
    private float X0;
    private ColorStateList Y0;
    private ColorStateList Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f21058a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Drawable f21059a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private float f21060a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f21061b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f21062b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f21063b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f21064c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Drawable f21065c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final int f21066c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f21067d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f21068d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f21069d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f21070e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private ColorStateList f21071e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f21072e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f21073f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f21074f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private final Runnable f21075f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f21076g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f21077g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private boolean f21078g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f21079h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f21080h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f21081i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f21082i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f21083j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f21084j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21085k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private MotionEvent f21086k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f21087l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Rect f21088l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f21089m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    List f21090m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f21091n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private List f21092n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21093o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private f f21094o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueAnimator f21095p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f21096p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f21097q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f21098q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f21099r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f21100r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f21101s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ArrayList f21102s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21103t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f21104t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f21105u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f21106u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f21107v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f21108v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f21109w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f21110w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f21111x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private float[] f21112x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f21113y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f21114y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21115z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f21116z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlay viewOverlayA0 = BaseSlider.this.a0();
            if (viewOverlayA0 == null) {
                return;
            }
            Iterator it = BaseSlider.this.f21087l.iterator();
            while (it.hasNext()) {
                viewOverlayA0.remove((qc.a) it.next());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends v0.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final BaseSlider f21120q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Rect f21121r;

        c(BaseSlider baseSlider) {
            super(baseSlider);
            this.f21121r = new Rect();
            this.f21120q = baseSlider;
        }

        private String Z(int i10) {
            if (i10 == this.f21120q.getValues().size() - 1) {
                return this.f21120q.getContext().getString(k.f51849u);
            }
            return i10 == 0 ? this.f21120q.getContext().getString(k.f51850v) : "";
        }

        @Override // v0.a
        protected int B(float f10, float f11) {
            for (int i10 = 0; i10 < this.f21120q.getValues().size(); i10++) {
                this.f21120q.b1(i10, this.f21121r);
                if (this.f21121r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // v0.a
        protected void C(List list) {
            for (int i10 = 0; i10 < this.f21120q.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        @Override // v0.a
        protected boolean L(int i10, int i11, Bundle bundle) {
            if (!this.f21120q.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f21120q.Z0(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f21120q.e1();
                        this.f21120q.postInvalidate();
                        return true;
                    }
                }
                return false;
            }
            float fW = this.f21120q.w(20);
            if (i11 == 8192) {
                fW = -fW;
            }
            if (this.f21120q.w0()) {
                fW = -fW;
            }
            if (!this.f21120q.Z0(i10, h0.a.a(this.f21120q.getValues().get(i10).floatValue() + fW, this.f21120q.getValueFrom(), this.f21120q.getValueTo()))) {
                return false;
            }
            this.f21120q.setActiveThumbIndex(i10);
            this.f21120q.Q0();
            this.f21120q.e1();
            this.f21120q.postInvalidate();
            return true;
        }

        @Override // v0.a
        protected void P(int i10, p pVar) {
            pVar.b(p.a.L);
            List<Float> values = this.f21120q.getValues();
            Float f10 = values.get(i10);
            float fFloatValue = f10.floatValue();
            float valueFrom = this.f21120q.getValueFrom();
            float valueTo = this.f21120q.getValueTo();
            if (this.f21120q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    pVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    pVar.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.f21052h1, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f10, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            pVar.P0(p.i.a(1, valueFrom, valueTo, fFloatValue));
            pVar.u0(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f21120q.getContentDescription() != null) {
                sb2.append(this.f21120q.getContentDescription());
                sb2.append(",");
            }
            String strU = this.f21120q.U(fFloatValue);
            String string = this.f21120q.getContext().getString(k.f51851w);
            if (values.size() > 1) {
                string = Z(i10);
            }
            CharSequence charSequenceJ = q0.J(this.f21120q);
            if (TextUtils.isEmpty(charSequenceJ)) {
                sb2.append(String.format(Locale.getDefault(), "%s, %s", string, strU));
            } else {
                pVar.X0(charSequenceJ);
            }
            pVar.y0(sb2.toString());
            this.f21120q.b1(i10, this.f21121r);
            pVar.p0(this.f21121r);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum d {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f21127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ArrayList f21129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f21130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f21131e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f21127a);
            parcel.writeFloat(this.f21128b);
            parcel.writeList(this.f21129c);
            parcel.writeFloat(this.f21130d);
            parcel.writeBooleanArray(new boolean[]{this.f21131e});
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.f21127a = parcel.readFloat();
            this.f21128b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f21129c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f21130d = parcel.readFloat();
            this.f21131e = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) {
        super(pc.a.d(context, attributeSet, i10, f21053i1), attributeSet, i10);
        this.f21087l = new ArrayList();
        this.f21089m = new ArrayList();
        this.f21091n = new ArrayList();
        this.f21093o = false;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.R = false;
        this.T = false;
        this.V = false;
        this.f21062b0 = false;
        this.f21068d0 = false;
        this.f21088l0 = new Rect();
        this.f21090m0 = new ArrayList();
        this.f21092n0 = new ArrayList();
        this.f21096p0 = false;
        this.f21102s0 = new ArrayList();
        this.f21104t0 = -1;
        this.f21106u0 = -1;
        this.f21108v0 = 0.0f;
        this.f21110w0 = 0;
        this.D0 = false;
        this.K0 = new Path();
        this.L0 = new RectF();
        this.M0 = new RectF();
        this.N0 = new RectF();
        this.O0 = new RectF();
        this.P0 = new Rect();
        this.Q0 = new RectF();
        this.R0 = new Rect();
        this.S0 = new Matrix();
        this.T0 = new ArrayList();
        this.V0 = Collections.EMPTY_LIST;
        this.f21063b1 = 0;
        this.f21069d1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f21137a.g1();
            }
        };
        this.f21072e1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f21138a.g1();
            }
        };
        this.f21075f1 = new Runnable() { // from class: com.google.android.material.slider.e
            @Override // java.lang.Runnable
            public final void run() {
                BaseSlider.a(this.f21139a);
            }
        };
        Context context2 = getContext();
        this.f21078g1 = isShown();
        this.f21058a = new Paint();
        this.f21061b = new Paint();
        Paint paint = new Paint(1);
        this.f21064c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f21067d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f21070e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f21073f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f21076g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.f21101s = context2.getResources().getDimensionPixelSize(sb.e.f51671c0);
        A0(context2.getResources());
        N0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        this.f21099r = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f21079h = cVar;
        q0.m0(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f21081i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21066c1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.f21066c1 = 120000;
        }
    }

    private int A(boolean z10) {
        return z10 ? 0 : 2;
    }

    private void A0(Resources resources) {
        this.C = resources.getDimensionPixelSize(sb.e.f51696k1);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(sb.e.f51693j1);
        this.f21103t = dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        this.f21105u = resources.getDimensionPixelSize(sb.e.f51681f1);
        this.f21107v = resources.getDimensionPixelSize(sb.e.f51690i1);
        int i10 = sb.e.f51687h1;
        this.f21109w = resources.getDimensionPixelSize(i10);
        this.f21111x = resources.getDimensionPixelSize(i10);
        this.f21113y = resources.getDimensionPixelSize(sb.e.f51684g1);
        this.f21080h0 = resources.getDimensionPixelSize(sb.e.f51678e1);
        this.f21077g0 = resources.getDimensionPixelOffset(sb.e.f51674d0);
        this.A = resources.getDimensionPixelSize(sb.e.V0);
    }

    private ValueAnimator B(boolean z10) {
        int iF;
        TimeInterpolator timeInterpolatorG;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(W(z10 ? this.f21097q : this.f21095p, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            iF = j.f(getContext(), f21054j1, 83);
            timeInterpolatorG = j.g(getContext(), f21056l1, tb.b.f53279e);
        } else {
            iF = j.f(getContext(), f21055k1, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE);
            timeInterpolatorG = j.g(getContext(), f21057m1, tb.b.f53277c);
        }
        valueAnimatorOfFloat.setDuration(iF);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorG);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSlider.b(this.f21136a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void B0(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        if (V0()) {
            float[] fArr = {this.G + (I0(((Float) this.f21102s0.get(this.f21106u0)).floatValue()) * i10), i11};
            if (z0()) {
                this.S0.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f10 = fArr[0];
                int i12 = this.J;
                float f11 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f10 - i12, f11 - i12, f10 + i12, f11 + i12, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.J, this.f21067d);
        }
    }

    private void C() {
        if (this.f21087l.size() > this.f21102s0.size()) {
            List<qc.a> listSubList = this.f21087l.subList(this.f21102s0.size(), this.f21087l.size());
            for (qc.a aVar : listSubList) {
                if (isAttachedToWindow()) {
                    E(aVar);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f21087l.size() >= this.f21102s0.size()) {
                break;
            }
            qc.a aVarM0 = qc.a.M0(getContext(), null, 0, this.f21085k);
            this.f21087l.add(aVarM0);
            if (isAttachedToWindow()) {
                p(aVarM0);
            }
        }
        int i10 = this.f21087l.size() != 1 ? 1 : 0;
        Iterator it = this.f21087l.iterator();
        while (it.hasNext()) {
            ((qc.a) it.next()).A0(i10);
        }
    }

    private void C0(Canvas canvas, int i10) {
        if (this.O <= 0 || this.f21102s0.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f21102s0;
        float fFloatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f10 = this.f21100r0;
        if (fFloatValue < f10) {
            L(canvas, x1(f10), i10);
        }
        if (m0() || (this.f21102s0.size() > 1 && ((Float) this.f21102s0.get(0)).floatValue() > this.f21098q0)) {
            L(canvas, x1(this.f21098q0), i10);
        }
    }

    private i D() {
        i iVar = new i();
        iVar.t0(2);
        iVar.l0(getThumbTintList());
        iVar.setShapeAppearanceModel(mc.p.g().q(0, this.H / 2.0f).m());
        iVar.setBounds(0, 0, this.H, this.I);
        iVar.k0(getThumbElevation());
        iVar.A0(getThumbStrokeWidth());
        iVar.z0(getThumbStrokeColor());
        iVar.setState(getDrawableState());
        return iVar;
    }

    private void D0(Canvas canvas) {
        float[] fArr = this.f21112x0;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] fArrV = V();
        int iCeil = (int) Math.ceil(fArrV[0] * ((this.f21112x0.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(fArrV[1] * ((this.f21112x0.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            O(0, iCeil * 2, canvas, this.f21070e);
        }
        if (iCeil <= iFloor) {
            O(iCeil * 2, (iFloor + 1) * 2, canvas, this.f21073f);
        }
        int i10 = (iFloor + 1) * 2;
        float[] fArr2 = this.f21112x0;
        if (i10 < fArr2.length) {
            O(i10, fArr2.length, canvas, this.f21070e);
        }
    }

    private void E(qc.a aVar) {
        ViewGroup viewGroupI = c0.i(this);
        if (viewGroupI == null) {
            return;
        }
        viewGroupI.getOverlay().remove(aVar);
        aVar.O0(viewGroupI);
    }

    private boolean E0() {
        int iMax = this.f21103t + Math.max(Math.max(Math.max((this.H / 2) - this.f21105u, 0), Math.max((this.F - this.f21107v) / 2, 0)), Math.max(Math.max(this.f21116z0 - this.f21109w, 0), Math.max(this.A0 - this.f21111x, 0)));
        if (this.G == iMax) {
            return false;
        }
        this.G = iMax;
        if (!isLaidOut()) {
            return true;
        }
        q1(z0() ? getHeight() : getWidth());
        return true;
    }

    private float F(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.G) / this.B0;
        float f12 = this.f21098q0;
        return (f11 * (f12 - this.f21100r0)) + f12;
    }

    private boolean F0() {
        int paddingTop;
        int paddingBottom;
        if (z0()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i10 = paddingTop + paddingBottom;
        int iMax = Math.max(this.C, Math.max(this.F + i10, this.I + i10));
        if (iMax == this.D) {
            return false;
        }
        this.D = iMax;
        return true;
    }

    private void G(int i10) {
        Iterator it = this.f21089m.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.a) it.next()).a(this, ((Float) this.f21102s0.get(i10)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f21081i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        P0(i10);
        this.f21079h.E(i10);
    }

    private boolean G0(int i10) {
        int i11 = this.f21106u0;
        int iC = (int) h0.a.c(((long) i11) + ((long) i10), 0L, this.f21102s0.size() - 1);
        this.f21106u0 = iC;
        if (iC == i11) {
            return false;
        }
        this.f21104t0 = iC;
        i1();
        e1();
        postInvalidate();
        return true;
    }

    private void H() {
        for (com.google.android.material.slider.a aVar : this.f21089m) {
            ArrayList arrayList = this.f21102s0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                aVar.a(this, ((Float) obj).floatValue(), false);
            }
        }
    }

    private boolean H0(int i10) {
        if (w0() || z0()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return G0(i10);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    private void I(Canvas canvas, int i10, int i11) {
        int iX;
        float f10;
        float f11;
        BaseSlider<S, L, T> baseSlider = this;
        float[] fArrV = baseSlider.V();
        int i12 = baseSlider.G;
        float f12 = i10;
        float fX1 = i12 + (fArrV[1] * f12);
        float fX = i12 + (fArrV[0] * f12);
        if (fX >= fX1) {
            baseSlider.L0.setEmpty();
            return;
        }
        d dVar = d.NONE;
        if (baseSlider.f21102s0.size() == 1 && !baseSlider.m0()) {
            dVar = (baseSlider.w0() || baseSlider.z0()) ? d.RIGHT : d.LEFT;
        }
        d dVar2 = dVar;
        int i13 = 0;
        while (i13 < baseSlider.f21102s0.size()) {
            if (baseSlider.f21102s0.size() > 1) {
                if (i13 > 0) {
                    fX = baseSlider.x1(((Float) baseSlider.f21102s0.get(i13 - 1)).floatValue());
                }
                fX1 = baseSlider.x1(((Float) baseSlider.f21102s0.get(i13)).floatValue());
                if (baseSlider.w0() || baseSlider.z0()) {
                    fX1 = fX;
                    fX = fX1;
                }
            }
            int trackCornerSize = baseSlider.getTrackCornerSize();
            int iOrdinal = dVar2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fX += baseSlider.x(i13);
                    fX1 += trackCornerSize;
                } else if (iOrdinal == 3) {
                    if (i13 > 0) {
                        fX += baseSlider.x(i13 - 1);
                        iX = baseSlider.x(i13);
                    } else if (fArrV[1] == 0.5f) {
                        fX += baseSlider.x(i13);
                    } else if (fArrV[0] == 0.5f) {
                        iX = baseSlider.x(i13);
                    }
                }
                f10 = fX;
                f11 = fX1;
                if (f10 >= f11) {
                    baseSlider.L0.setEmpty();
                } else {
                    RectF rectF = baseSlider.L0;
                    float f13 = i11;
                    int i14 = baseSlider.F;
                    rectF.set(f10, f13 - (i14 / 2.0f), f11, f13 + (i14 / 2.0f));
                    baseSlider.l1(canvas, baseSlider.f21061b, baseSlider.L0, trackCornerSize, dVar2);
                }
                i13++;
                baseSlider = this;
                fX = f10;
                fX1 = f11;
            } else {
                fX -= trackCornerSize;
                iX = baseSlider.x(i13);
            }
            fX1 -= iX;
            f10 = fX;
            f11 = fX1;
            if (f10 >= f11) {
                baseSlider.L0.setEmpty();
            } else {
                RectF rectF2 = baseSlider.L0;
                float f14 = i11;
                int i15 = baseSlider.F;
                rectF2.set(f10, f14 - (i15 / 2.0f), f11, f14 + (i15 / 2.0f));
                baseSlider.l1(canvas, baseSlider.f21061b, baseSlider.L0, trackCornerSize, dVar2);
            }
            i13++;
            baseSlider = this;
            fX = f10;
            fX1 = f11;
        }
    }

    private float I0(float f10) {
        float f11 = this.f21098q0;
        float f12 = (f10 - f11) / (this.f21100r0 - f11);
        return (w0() || z0()) ? 1.0f - f12 : f12;
    }

    private void J(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF, d dVar, int i10) {
        if (f11 - f10 > getTrackCornerSize() - i10) {
            rectF.set(f10, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        l1(canvas, this.f21058a, rectF, getTrackCornerSize(), dVar);
    }

    private void J0() {
        Iterator it = this.f21091n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void K(Canvas canvas, int i10, int i11) {
        int iX;
        int iX2;
        float[] fArrV = V();
        float f10 = i11;
        int i12 = this.F;
        float f11 = f10 - (i12 / 2.0f);
        float f12 = f10 + (i12 / 2.0f);
        int size = 0;
        if (m0() && fArrV[0] == 0.5f) {
            iX = this.K;
        } else {
            iX = x((w0() || z0()) ? this.f21102s0.size() - 1 : 0);
        }
        int i13 = iX;
        float f13 = i10;
        J(this.G - getTrackCornerSize(), (this.G + (fArrV[0] * f13)) - i13, f11, f12, canvas, this.M0, d.LEFT, i13);
        if (m0() && fArrV[1] == 0.5f) {
            iX2 = this.K;
        } else {
            if (!w0() && !z0()) {
                size = this.f21102s0.size() - 1;
            }
            iX2 = x(size);
        }
        int i14 = iX2;
        int i15 = this.G;
        J(i15 + (fArrV[1] * f13) + i14, i15 + i10 + getTrackCornerSize(), f11, f12, canvas, this.N0, d.RIGHT, i14);
    }

    private void K0() {
        Iterator it = this.f21091n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void L(Canvas canvas, float f10, float f11) {
        for (int i10 = 0; i10 < this.f21102s0.size(); i10++) {
            float fX1 = x1(((Float) this.f21102s0.get(i10)).floatValue());
            float fX = x(i10) + (this.H / 2.0f);
            if (f10 >= fX1 - fX && f10 <= fX1 + fX) {
                return;
            }
        }
        if (z0()) {
            canvas.drawPoint(f11, f10, this.f21076g);
        } else {
            canvas.drawPoint(f10, f11, this.f21076g);
        }
    }

    private void M(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        if (z0()) {
            canvas.concat(this.S0);
        }
        canvas.translate((this.G + ((int) (I0(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void M0(qc.a aVar, float f10) {
        t(aVar, f10);
        if (z0()) {
            RectF rectF = new RectF(this.P0);
            this.S0.mapRect(rectF);
            rectF.round(this.P0);
        }
        com.google.android.material.internal.d.c(c0.i(this), this, this.P0);
        aVar.setBounds(this.P0);
    }

    private void N(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f21102s0.size()) {
            float fFloatValue = ((Float) this.f21102s0.get(i14)).floatValue();
            Drawable drawable = this.U0;
            if (drawable != null) {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                M(canvas2, i12, i13, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                if (i14 < this.V0.size()) {
                    M(canvas2, i12, i13, fFloatValue, (Drawable) this.V0.get(i14));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.G + (I0(fFloatValue) * i12), i13, getThumbRadius(), this.f21064c);
                    }
                    M(canvas2, i12, i13, fFloatValue, (Drawable) this.T0.get(i14));
                }
            }
            i14++;
            canvas = canvas2;
            i10 = i12;
            i11 = i13;
        }
    }

    private void N0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = z.i(context, attributeSet, m.Ja, i10, f21053i1, new int[0]);
        setOrientation(typedArrayI.getInt(m.La, 0));
        this.f21085k = typedArrayI.getResourceId(m.Ua, l.f51858b0);
        this.f21098q0 = typedArrayI.getFloat(m.Na, 0.0f);
        this.f21100r0 = typedArrayI.getFloat(m.Oa, 1.0f);
        setCentered(typedArrayI.getBoolean(m.Pa, false));
        this.f21108v0 = typedArrayI.getFloat(m.Ma, 0.0f);
        this.f21110w0 = typedArrayI.getInt(m.Qa, 0);
        this.f21115z = (int) Math.ceil(typedArrayI.getDimension(m.Va, jc.b.i(context)));
        int i11 = m.f52064lb;
        boolean zHasValue = typedArrayI.hasValue(i11);
        int i12 = zHasValue ? i11 : m.f52094nb;
        if (!zHasValue) {
            i11 = m.f52079mb;
        }
        ColorStateList colorStateListA = jc.c.a(context, typedArrayI, i12);
        if (colorStateListA == null) {
            colorStateListA = i.a.a(context, sb.d.f51657j);
        }
        setTrackInactiveTintList(colorStateListA);
        ColorStateList colorStateListA2 = jc.c.a(context, typedArrayI, i11);
        if (colorStateListA2 == null) {
            colorStateListA2 = i.a.a(context, sb.d.f51654g);
        }
        setTrackActiveTintList(colorStateListA2);
        ColorStateList colorStateListA3 = jc.c.a(context, typedArrayI, m.Wa);
        if (colorStateListA3 == null) {
            colorStateListA3 = i.a.a(context, sb.d.f51658k);
        }
        setThumbTintList(colorStateListA3);
        int i13 = m.f51895ab;
        if (typedArrayI.hasValue(i13)) {
            setThumbStrokeColor(jc.c.a(context, typedArrayI, i13));
        }
        setThumbStrokeWidth(typedArrayI.getDimension(m.f51911bb, 0.0f));
        ColorStateList colorStateListA4 = jc.c.a(context, typedArrayI, m.Ra);
        if (colorStateListA4 == null) {
            colorStateListA4 = i.a.a(context, sb.d.f51655h);
        }
        setHaloTintList(colorStateListA4);
        int i14 = m.f52034jb;
        this.f21114y0 = typedArrayI.hasValue(i14) ? typedArrayI.getInt(i14, -1) : A(typedArrayI.getBoolean(m.f52049kb, true));
        int i15 = m.f51959eb;
        boolean zHasValue2 = typedArrayI.hasValue(i15);
        int i16 = zHasValue2 ? i15 : m.f51989gb;
        if (!zHasValue2) {
            i15 = m.f51974fb;
        }
        ColorStateList colorStateListA5 = jc.c.a(context, typedArrayI, i16);
        if (colorStateListA5 == null) {
            colorStateListA5 = i.a.a(context, sb.d.f51656i);
        }
        setTickInactiveTintList(colorStateListA5);
        ColorStateList colorStateListA6 = jc.c.a(context, typedArrayI, i15);
        if (colorStateListA6 == null) {
            colorStateListA6 = i.a.a(context, sb.d.f51653f);
        }
        setTickActiveTintList(colorStateListA6);
        setThumbTrackGapSize(typedArrayI.getDimensionPixelSize(m.f51927cb, 0));
        setTrackStopIndicatorSize(typedArrayI.getDimensionPixelSize(m.f52259yb, 0));
        setTrackCornerSize(typedArrayI.getDimensionPixelSize(m.f52109ob, -1));
        setTrackInsideCornerSize(typedArrayI.getDimensionPixelSize(m.f52244xb, 0));
        setTrackIconActiveStart(jc.c.e(context, typedArrayI, m.f52169sb));
        setTrackIconActiveEnd(jc.c.e(context, typedArrayI, m.f52154rb));
        setTrackIconActiveColor(jc.c.a(context, typedArrayI, m.f52139qb));
        setTrackIconInactiveStart(jc.c.e(context, typedArrayI, m.f52214vb));
        setTrackIconInactiveEnd(jc.c.e(context, typedArrayI, m.f52199ub));
        setTrackIconInactiveColor(jc.c.a(context, typedArrayI, m.f52184tb));
        setTrackIconSize(typedArrayI.getDimensionPixelSize(m.f52229wb, 0));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.Za, 0) * 2;
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(m.f51943db, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(m.Ya, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayI.getDimensionPixelSize(m.Sa, 0));
        setThumbElevation(typedArrayI.getDimension(m.Xa, 0.0f));
        setTrackHeight(typedArrayI.getDimensionPixelSize(m.f52124pb, 0));
        setTickActiveRadius(typedArrayI.getDimensionPixelSize(m.f52004hb, this.O / 2));
        setTickInactiveRadius(typedArrayI.getDimensionPixelSize(m.f52019ib, this.O / 2));
        setLabelBehavior(typedArrayI.getInt(m.Ta, 0));
        if (!typedArrayI.getBoolean(m.Ka, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.f21098q0));
        typedArrayI.recycle();
    }

    private void O(int i10, int i11, Canvas canvas, Paint paint) {
        while (i10 < i11) {
            float f10 = z0() ? this.f21112x0[i10 + 1] : this.f21112x0[i10];
            if (!t0(f10) && (!m0() || !s0(f10))) {
                float[] fArr = this.f21112x0;
                canvas.drawPoint(fArr[i10], fArr[i10 + 1], paint);
            }
            i10 += 2;
        }
    }

    private void O0() {
        int i10;
        if (!h0() || (i10 = this.L) == -1 || this.M == -1) {
            return;
        }
        R0(i10, this.N, Integer.valueOf(this.f21104t0));
    }

    private void P(Canvas canvas, RectF rectF, Drawable drawable) {
        if (z0()) {
            this.S0.mapRect(rectF);
        }
        rectF.round(this.R0);
        drawable.setBounds(this.R0);
        drawable.draw(canvas);
    }

    private void P0(int i10) {
        b bVar = this.f21083j;
        if (bVar == null) {
            this.f21083j = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.f21083j.a(i10);
        postDelayed(this.f21083j, 200L);
    }

    private void Q(Canvas canvas, RectF rectF, RectF rectF2) {
        if (j0()) {
            if (this.f21102s0.size() > 1) {
                Log.w(f21052h1, "Track icons can only be used when only 1 thumb is present.");
            }
            q(canvas, rectF, this.S, true);
            q(canvas, rectF2, this.f21059a0, true);
            q(canvas, rectF, this.U, false);
            q(canvas, rectF2, this.f21065c0, false);
        }
    }

    private void R0(int i10, int i11, Integer num) {
        for (int i12 = 0; i12 < this.T0.size(); i12++) {
            if (num == null || i12 == num.intValue()) {
                ((i) this.T0.get(i12)).setShapeAppearanceModel(mc.p.g().q(0, i10 / 2.0f).m());
                ((i) this.T0.get(i12)).setBounds(0, 0, i10, i11 >= 0 ? i11 : this.I);
            }
        }
        r1(false);
    }

    private void S() {
        if (this.f21093o) {
            this.f21093o = false;
            ValueAnimator valueAnimatorB = B(false);
            this.f21097q = valueAnimatorB;
            this.f21095p = null;
            valueAnimatorB.addListener(new a());
            this.f21097q.start();
        }
    }

    private void S0(qc.a aVar, float f10) {
        aVar.V0(U(f10));
        M0(aVar, f10);
        ViewOverlay viewOverlayA0 = a0();
        if (viewOverlayA0 == null) {
            return;
        }
        viewOverlayA0.add(aVar);
    }

    private void T(int i10) {
        if (i10 == 1) {
            G0(Integer.MAX_VALUE);
            return;
        }
        if (i10 == 2) {
            G0(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            H0(Integer.MAX_VALUE);
        } else {
            if (i10 != 66) {
                return;
            }
            H0(Integer.MIN_VALUE);
        }
    }

    private void T0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f21102s0.size() == arrayList.size() && this.f21102s0.equals(arrayList)) {
            return;
        }
        this.f21102s0 = arrayList;
        this.E0 = true;
        c1();
        this.f21106u0 = 0;
        e1();
        C();
        H();
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String U(float f10) {
        if (i0()) {
            return this.f21094o0.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    private boolean U0() {
        return this.E == 3;
    }

    private float[] V() {
        float fFloatValue = ((Float) this.f21102s0.get(0)).floatValue();
        ArrayList arrayList = this.f21102s0;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f21102s0.size() == 1) {
            fFloatValue = this.f21098q0;
        }
        float fI0 = I0(fFloatValue);
        float fI1 = I0(fFloatValue2);
        if (m0()) {
            float fMin = Math.min(0.5f, fI1);
            fI1 = Math.max(0.5f, fI1);
            fI0 = fMin;
        }
        return (m0() || !(w0() || z0())) ? new float[]{fI0, fI1} : new float[]{fI1, fI0};
    }

    private boolean V0() {
        return this.C0 || X() == null;
    }

    private static float W(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private boolean W0(float f10) {
        return Z0(this.f21104t0, f10);
    }

    private RippleDrawable X() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    private double X0(float f10) {
        float f11 = this.f21108v0;
        if (f11 <= 0.0f) {
            return f10;
        }
        int i10 = (int) ((this.f21100r0 - this.f21098q0) / f11);
        return ((double) Math.round(f10 * i10)) / ((double) i10);
    }

    private float Y(int i10, float f10) {
        float minSeparation = getMinSeparation();
        if (this.f21063b1 == 0) {
            minSeparation = F(minSeparation);
        }
        if (w0() || z0()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return h0.a.a(f10, i12 < 0 ? this.f21098q0 : ((Float) this.f21102s0.get(i12)).floatValue() + minSeparation, i11 >= this.f21102s0.size() ? this.f21100r0 : ((Float) this.f21102s0.get(i11)).floatValue() - minSeparation);
    }

    private void Y0() {
        if (this.f21104t0 == -1 || this.f21092n0.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.f21102s0.size(); i10++) {
            if (i10 == this.f21104t0) {
                Z0(i10, ((Float) this.f21092n0.get(i10)).floatValue());
                return;
            }
        }
    }

    private int Z(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z0(int i10, float f10) {
        this.f21106u0 = i10;
        if (Math.abs(f10 - ((Float) this.f21102s0.get(i10)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f21102s0.set(i10, Float.valueOf(Y(i10, f10)));
        G(i10);
        return true;
    }

    public static /* synthetic */ void a(BaseSlider baseSlider) {
        baseSlider.setActiveThumbIndex(-1);
        baseSlider.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewOverlay a0() {
        ViewGroup viewGroupI = c0.i(this);
        if (viewGroupI == null) {
            return null;
        }
        return viewGroupI.getOverlay();
    }

    private boolean a1() {
        return W0(f0());
    }

    public static /* synthetic */ void b(BaseSlider baseSlider, ValueAnimator valueAnimator) {
        baseSlider.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = baseSlider.f21087l.iterator();
        while (it.hasNext()) {
            ((qc.a) it.next()).U0(fFloatValue);
        }
        baseSlider.postInvalidateOnAnimation();
    }

    private float[] b0(float f10, float f11) {
        return z0() ? new float[]{f10, f10, f10, f10, f11, f11, f11, f11} : new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    private int c0() {
        return (int) (((this.f21100r0 - this.f21098q0) / this.f21108v0) + 1.0f);
    }

    private void c1() {
        if (this.T0.size() != this.f21102s0.size()) {
            this.T0.clear();
            for (int i10 = 0; i10 < this.f21102s0.size(); i10++) {
                this.T0.add(D());
            }
        }
    }

    private FocusRingDrawable d0() {
        return FocusRingDrawable.m(getBackground());
    }

    private void d1(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        FocusRingDrawable focusRingDrawableD0 = d0();
        if (focusRingDrawableD0 != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(sb.e.f51668b0);
            float f16 = (this.H / 2.0f) + (dimensionPixelOffset * 2.0f);
            float f17 = (this.I / 2.0f) + dimensionPixelOffset;
            if (z0()) {
                f12 = f11 - f17;
                float f18 = f11 + f17;
                float f19 = f10 - f16;
                f13 = f10 + f16;
                f14 = f18;
                f15 = f19;
            } else {
                f12 = f10 - f16;
                f14 = f10 + f16;
                f15 = f11 - f17;
                f13 = f11 + f17;
            }
            focusRingDrawableD0.mutate();
            focusRingDrawableD0.B((int) f12, (int) f15, (int) f14, (int) f13);
        }
    }

    private int e0() {
        return (this.B0 / this.f21113y) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        RippleDrawable rippleDrawableX;
        float fI0 = (I0(((Float) this.f21102s0.get(this.f21106u0)).floatValue()) * this.B0) + this.G;
        int iY = y();
        if (!V0() && getMeasuredWidth() > 0 && (rippleDrawableX = X()) != null) {
            int i10 = this.J;
            float[] fArr = {fI0 - i10, iY - i10, i10 + fI0, i10 + iY};
            if (z0()) {
                this.S0.mapPoints(fArr);
            }
            rippleDrawableX.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        d1(fI0, iY);
    }

    private float f0() {
        double dX0 = X0(this.f21060a1);
        if (w0() || z0()) {
            dX0 = 1.0d - dX0;
        }
        float f10 = this.f21100r0;
        float f11 = this.f21098q0;
        return (float) ((dX0 * ((double) (f10 - f11))) + ((double) f11));
    }

    private void f1() {
        float f10;
        boolean zZ0 = z0();
        boolean zW0 = w0();
        float f11 = 0.5f;
        if (zZ0 && zW0) {
            f10 = 0.5f;
            f11 = -0.2f;
        } else {
            f10 = 1.2f;
            if (zZ0) {
                f11 = 1.2f;
                f10 = 0.5f;
            }
        }
        Iterator it = this.f21087l.iterator();
        while (it.hasNext()) {
            ((qc.a) it.next()).S0(f11, f10);
        }
    }

    private float g0() {
        float f10 = this.f21060a1;
        if (w0() || z0()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.f21100r0;
        float f12 = this.f21098q0;
        return (f10 * (f11 - f12)) + f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        f1();
        int i10 = this.E;
        if (i10 == 0 || i10 == 1) {
            if (this.f21104t0 == -1 || !isEnabled()) {
                S();
                return;
            } else {
                R(false);
                return;
            }
        }
        if (i10 == 2) {
            S();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.E);
        }
        if (isEnabled() && x0()) {
            R(true);
        } else {
            S();
        }
    }

    private boolean h0() {
        return this.K > 0;
    }

    private void h1() {
        float fY = y();
        this.S0.reset();
        this.S0.setRotate(90.0f, fY, fY);
    }

    private void i1() {
        if (h0() && this.U0 == null && this.V0.isEmpty()) {
            int i10 = this.H;
            this.L = i10;
            this.N = this.I;
            this.M = this.K;
            R0(Math.round(i10 * 0.5f), n0() ? this.I - this.f21101s : -1, Integer.valueOf(this.f21104t0));
        }
    }

    private boolean j0() {
        return (this.S == null && this.U == null && this.f21059a0 == null && this.f21065c0 == null) ? false : true;
    }

    private void j1() {
        int iMin;
        s1();
        if (this.f21108v0 <= 0.0f) {
            k1(this.f21110w0);
            return;
        }
        int i10 = this.f21114y0;
        if (i10 != 0) {
            iMin = 0;
            if (i10 == 1) {
                int iC0 = c0();
                if (iC0 <= e0()) {
                    iMin = iC0;
                }
            } else if (i10 != 2) {
                throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f21114y0);
            }
        } else {
            iMin = Math.min(c0(), e0());
        }
        k1(iMin);
    }

    private Drawable k0(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        o(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void k1(int i10) {
        if (i10 == 0) {
            this.f21112x0 = null;
            return;
        }
        float[] fArr = this.f21112x0;
        if (fArr == null || fArr.length != i10 * 2) {
            this.f21112x0 = new float[i10 * 2];
        }
        float f10 = this.B0 / (i10 - 1);
        float fY = y();
        for (int i11 = 0; i11 < i10 * 2; i11 += 2) {
            float[] fArr2 = this.f21112x0;
            fArr2[i11] = this.G + ((i11 / 2.0f) * f10);
            fArr2[i11 + 1] = fY;
        }
        if (z0()) {
            this.S0.mapPoints(this.f21112x0);
        }
    }

    private void l0() {
        this.f21058a.setStrokeWidth(this.F);
        this.f21061b.setStrokeWidth(this.F);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    private void l1(Canvas canvas, Paint paint, RectF rectF, float f10, d dVar) {
        int i10;
        RectF rectF2;
        float fMax;
        int iOrdinal;
        if (rectF.isEmpty()) {
            return;
        }
        float fU = u(f10);
        float fR = r(f10);
        int iOrdinal2 = dVar.ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 == 2) {
                fU = this.Q;
            } else if (iOrdinal2 == 3) {
                i10 = this.Q;
                fU = i10;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (h0()) {
                paint.setAntiAlias(true);
            }
            rectF2 = new RectF(rectF);
            if (z0()) {
                this.S0.mapRect(rectF2);
            }
            this.K0.reset();
            if (rectF.width() >= fU + fR) {
                this.K0.addRoundRect(rectF2, b0(fU, fR), Path.Direction.CW);
                canvas.drawPath(this.K0, paint);
                return;
            }
            float fMin = Math.min(fU, fR);
            fMax = Math.max(fU, fR);
            canvas.save();
            this.K0.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.K0);
            iOrdinal = dVar.ordinal();
            if (iOrdinal != 1) {
                RectF rectF3 = this.O0;
                float f11 = rectF.left;
                rectF3.set(f11, rectF.top, (2.0f * fMax) + f11, rectF.bottom);
            } else if (iOrdinal != 2) {
                this.O0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF4 = this.O0;
                float f12 = rectF.right;
                rectF4.set(f12 - (2.0f * fMax), rectF.top, f12, rectF.bottom);
            }
            if (z0()) {
                this.S0.mapRect(this.O0);
            }
            canvas.drawRoundRect(this.O0, fMax, fMax, paint);
            canvas.restore();
        }
        i10 = this.Q;
        fR = i10;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (h0()) {
            paint.setAntiAlias(true);
        }
        rectF2 = new RectF(rectF);
        if (z0()) {
            this.S0.mapRect(rectF2);
        }
        this.K0.reset();
        if (rectF.width() >= fU + fR) {
            this.K0.addRoundRect(rectF2, b0(fU, fR), Path.Direction.CW);
            canvas.drawPath(this.K0, paint);
            return;
        }
        float fMin2 = Math.min(fU, fR);
        fMax = Math.max(fU, fR);
        canvas.save();
        this.K0.addRoundRect(rectF2, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.K0);
        iOrdinal = dVar.ordinal();
        if (iOrdinal != 1) {
            RectF rectF5 = this.O0;
            float f13 = rectF.left;
            rectF5.set(f13, rectF.top, (2.0f * fMax) + f13, rectF.bottom);
        } else if (iOrdinal != 2) {
            this.O0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF6 = this.O0;
            float f14 = rectF.right;
            rectF6.set(f14 - (2.0f * fMax), rectF.top, f14, rectF.bottom);
        }
        if (z0()) {
            this.S0.mapRect(this.O0);
        }
        canvas.drawRoundRect(this.O0, fMax, fMax, paint);
        canvas.restore();
    }

    private void m1() {
        Drawable drawable = this.U;
        if (drawable != null) {
            if (!this.V && this.W != null) {
                this.U = f0.a.r(drawable).mutate();
                this.V = true;
            }
            if (this.V) {
                this.U.setTintList(this.W);
            }
        }
    }

    private void n(int i10, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, this.I);
        } else {
            float fMax = Math.max(i10, this.I) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private boolean n0() {
        FocusRingDrawable focusRingDrawableD0 = d0();
        return focusRingDrawableD0 != null && focusRingDrawableD0.v();
    }

    private void n1() {
        Drawable drawable = this.S;
        if (drawable != null) {
            if (!this.T && this.W != null) {
                this.S = f0.a.r(drawable).mutate();
                this.T = true;
            }
            if (this.T) {
                this.S.setTintList(this.W);
            }
        }
    }

    private void o(Drawable drawable) {
        n(this.H, drawable);
    }

    private boolean o0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void o1() {
        Drawable drawable = this.f21065c0;
        if (drawable != null) {
            if (!this.f21068d0 && this.f21071e0 != null) {
                this.f21065c0 = f0.a.r(drawable).mutate();
                this.f21068d0 = true;
            }
            if (this.f21068d0) {
                this.f21065c0.setTintList(this.f21071e0);
            }
        }
    }

    private void p(qc.a aVar) {
        aVar.T0(c0.i(this));
    }

    private boolean p0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void p1() {
        Drawable drawable = this.f21059a0;
        if (drawable != null) {
            if (!this.f21062b0 && this.f21071e0 != null) {
                this.f21059a0 = f0.a.r(drawable).mutate();
                this.f21062b0 = true;
            }
            if (this.f21062b0) {
                this.f21059a0.setTintList(this.f21071e0);
            }
        }
    }

    private void q(Canvas canvas, RectF rectF, Drawable drawable, boolean z10) {
        if (drawable != null) {
            z(rectF, this.Q0, this.f21074f0, this.f21077g0, z10);
            if (this.Q0.isEmpty()) {
                return;
            }
            P(canvas, this.Q0, drawable);
        }
    }

    private static boolean q0(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private void q1(int i10) {
        this.B0 = Math.max(i10 - (this.G * 2), 0);
        j1();
    }

    private float r(float f10) {
        if (this.f21102s0.isEmpty() || !h0()) {
            return f10;
        }
        float fX1 = x1(((Float) this.f21102s0.get((w0() || z0()) ? 0 : this.f21102s0.size() - 1)).floatValue()) - this.G;
        int i10 = this.B0;
        return fX1 > ((float) i10) - f10 ? Math.max(i10 - fX1, this.Q) : f10;
    }

    private boolean r0(double d10) {
        double dDoubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.f21108v0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private void r1(boolean z10) {
        boolean zF0 = F0();
        boolean zE0 = E0();
        if (z0()) {
            h1();
        }
        if (zF0 || z10) {
            requestLayout();
        } else if (zE0) {
            postInvalidate();
        }
    }

    private Float s(int i10) {
        float fW = this.D0 ? w(20) : v();
        if (i10 == 21) {
            if (!w0()) {
                fW = -fW;
            }
            return Float.valueOf(fW);
        }
        if (i10 == 22) {
            if (w0()) {
                fW = -fW;
            }
            return Float.valueOf(fW);
        }
        if (i10 == 69) {
            return Float.valueOf(-fW);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(fW);
        }
        return null;
    }

    private boolean s0(float f10) {
        float f11 = (this.B0 + (this.G * 2)) / 2.0f;
        int i10 = this.K;
        return f10 >= f11 - ((float) i10) && f10 <= f11 + ((float) i10);
    }

    private void s1() {
        if (this.E0) {
            v1();
            u1();
            t1();
            y1();
            this.E0 = false;
        }
    }

    private void t(qc.a aVar, float f10) {
        int iI0;
        int intrinsicWidth;
        int iY;
        int intrinsicHeight;
        int i10;
        if (z0()) {
            iI0 = (this.G + ((int) (I0(f10) * this.B0))) - (aVar.getIntrinsicHeight() / 2);
            intrinsicWidth = aVar.getIntrinsicHeight() + iI0;
            if (w0()) {
                iY = y() - (this.f21080h0 + (this.I / 2));
                intrinsicHeight = aVar.getIntrinsicWidth();
            } else {
                int iY2 = y() + this.f21080h0 + (this.I / 2);
                iY = aVar.getIntrinsicWidth() + iY2;
                i10 = iY2;
            }
            this.P0.set(iI0, i10, intrinsicWidth, iY);
        }
        iI0 = (this.G + ((int) (I0(f10) * this.B0))) - (aVar.getIntrinsicWidth() / 2);
        intrinsicWidth = aVar.getIntrinsicWidth() + iI0;
        iY = y() - (this.f21080h0 + (this.I / 2));
        intrinsicHeight = aVar.getIntrinsicHeight();
        i10 = iY - intrinsicHeight;
        this.P0.set(iI0, i10, intrinsicWidth, iY);
    }

    private boolean t0(float f10) {
        for (int i10 = 0; i10 < this.f21102s0.size(); i10++) {
            float fX1 = x1(((Float) this.f21102s0.get(i10)).floatValue());
            float fX = x(i10) + (this.H / 2.0f);
            if (f10 >= fX1 - fX && f10 <= fX1 + fX) {
                return true;
            }
        }
        return false;
    }

    private void t1() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f10 = this.f21108v0;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f21063b1 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f21108v0)));
        }
        if (minSeparation < f10 || !r0(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f21108v0), Float.valueOf(this.f21108v0)));
        }
    }

    private float u(float f10) {
        if (this.f21102s0.isEmpty() || !h0()) {
            return f10;
        }
        float fX1 = x1(((Float) this.f21102s0.get((w0() || z0()) ? this.f21102s0.size() - 1 : 0)).floatValue()) - this.G;
        return fX1 < f10 ? Math.max(fX1, this.Q) : f10;
    }

    private boolean u0(MotionEvent motionEvent) {
        return !q0(motionEvent) && o0();
    }

    private void u1() {
        if (this.f21108v0 > 0.0f && !w1(this.f21100r0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f21108v0), Float.valueOf(this.f21098q0), Float.valueOf(this.f21100r0)));
        }
    }

    private float v() {
        float f10 = this.f21108v0;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private boolean v0(MotionEvent motionEvent) {
        return !q0(motionEvent) && p0();
    }

    private void v1() {
        if (this.f21098q0 >= this.f21100r0) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f21098q0), Float.valueOf(this.f21100r0)));
        }
        ArrayList arrayList = this.f21102s0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Float f10 = (Float) obj;
            if (f10.floatValue() < this.f21098q0 || f10.floatValue() > this.f21100r0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f10, Float.valueOf(this.f21098q0), Float.valueOf(this.f21100r0)));
            }
            if (this.f21108v0 > 0.0f && !w1(f10.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f10, Float.valueOf(this.f21098q0), Float.valueOf(this.f21108v0), Float.valueOf(this.f21108v0)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float w(int i10) {
        float fV = v();
        float f10 = (this.f21100r0 - this.f21098q0) / fV;
        float f11 = i10;
        return f10 <= f11 ? fV : Math.round(f10 / f11) * fV;
    }

    private boolean w1(float f10) {
        return r0(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f21098q0)), MathContext.DECIMAL64).doubleValue());
    }

    private int x(int i10) {
        if (!this.f21096p0 || i10 != this.f21104t0 || this.U0 != null || !this.V0.isEmpty()) {
            return this.K;
        }
        return this.K - ((this.H - Math.round(this.H * 0.5f)) / 2);
    }

    private boolean x0() {
        Rect rect = new Rect();
        c0.i(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && y0();
    }

    private float x1(float f10) {
        return (I0(f10) * this.B0) + this.G;
    }

    private int y() {
        int i10 = this.D / 2;
        int intrinsicHeight = 0;
        if ((this.E == 1 || U0()) && !this.f21087l.isEmpty()) {
            intrinsicHeight = ((qc.a) this.f21087l.get(0)).getIntrinsicHeight();
        }
        return i10 + intrinsicHeight;
    }

    private boolean y0() {
        return this.f21078g1;
    }

    private void y1() {
        float f10 = this.f21108v0;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            Log.w(f21052h1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f10)));
        }
        float f11 = this.f21098q0;
        if (((int) f11) != f11) {
            Log.w(f21052h1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f11)));
        }
        float f12 = this.f21100r0;
        if (((int) f12) != f12) {
            Log.w(f21052h1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f12)));
        }
    }

    private void z(RectF rectF, RectF rectF2, int i10, int i11, boolean z10) {
        if (rectF.right - rectF.left < (i11 * 2) + i10) {
            rectF2.setEmpty();
            return;
        }
        float f10 = z10 ^ (w0() || z0()) ? rectF.left + i11 : (rectF.right - i11) - i10;
        float f11 = i10;
        float fY = y() - (f11 / 2.0f);
        rectF2.set(f10, fY, f10 + f11, f11 + fY);
    }

    protected boolean L0() {
        if (this.f21104t0 != -1) {
            return true;
        }
        float fG0 = g0();
        float fX1 = x1(fG0);
        this.f21104t0 = 0;
        float fAbs = Math.abs(((Float) this.f21102s0.get(0)).floatValue() - fG0);
        for (int i10 = 1; i10 < this.f21102s0.size(); i10++) {
            float fAbs2 = Math.abs(((Float) this.f21102s0.get(i10)).floatValue() - fG0);
            float fX2 = x1(((Float) this.f21102s0.get(i10)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = w0() || z0() ? fX2 - fX1 > 0.0f : fX2 - fX1 < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f21104t0 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fX2 - fX1) < this.f21099r) {
                        this.f21104t0 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f21104t0 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f21104t0 != -1;
    }

    public void Q0() {
        removeCallbacks(this.f21075f1);
        postDelayed(this.f21075f1, this.f21066c1);
    }

    void b1(int i10, Rect rect) {
        int iI0 = this.G + ((int) (I0(getValues().get(i10).floatValue()) * this.B0));
        int iY = y();
        int iMax = Math.max(this.f21115z, this.A) / 2;
        int iMax2 = Math.max(this.H / 2, iMax);
        int iMax3 = Math.max(this.I / 2, iMax);
        RectF rectF = new RectF(iI0 - iMax2, iY - iMax3, iI0 + iMax2, iY + iMax3);
        if (z0()) {
            this.S0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f21079h.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f21058a.setColor(Z(this.J0));
        this.f21061b.setColor(Z(this.I0));
        this.f21070e.setColor(Z(this.H0));
        this.f21073f.setColor(Z(this.G0));
        this.f21076g.setColor(Z(this.H0));
        for (qc.a aVar : this.f21087l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            if (((i) this.T0.get(i10)).isStateful()) {
                ((i) this.T0.get(i10)).setState(getDrawableState());
            }
        }
        this.f21067d.setColor(Z(this.F0));
        this.f21067d.setAlpha(63);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.f21079h.x();
    }

    public int getActiveThumbIndex() {
        return this.f21104t0;
    }

    public int getContinuousModeTickCount() {
        return this.f21110w0;
    }

    public int getFocusedThumbIndex() {
        return this.f21106u0;
    }

    public int getHaloRadius() {
        return this.J;
    }

    public ColorStateList getHaloTintList() {
        return this.F0;
    }

    public int getLabelBehavior() {
        return this.E;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f21108v0;
    }

    public float getThumbElevation() {
        return this.W0;
    }

    public int getThumbHeight() {
        return this.I;
    }

    public int getThumbRadius() {
        return this.H / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.Y0;
    }

    public float getThumbStrokeWidth() {
        return this.X0;
    }

    public ColorStateList getThumbTintList() {
        return this.Z0;
    }

    public int getThumbTrackGapSize() {
        return this.K;
    }

    public int getThumbWidth() {
        return this.H;
    }

    public int getTickActiveRadius() {
        return this.f21116z0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.G0;
    }

    public int getTickInactiveRadius() {
        return this.A0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.H0;
    }

    public ColorStateList getTickTintList() {
        if (this.H0.equals(this.G0)) {
            return this.G0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f21114y0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.I0;
    }

    public int getTrackCornerSize() {
        int i10 = this.P;
        return i10 == -1 ? this.F / 2 : i10;
    }

    public int getTrackHeight() {
        return this.F;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.W;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.U;
    }

    public Drawable getTrackIconActiveStart() {
        return this.S;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f21071e0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f21065c0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f21059a0;
    }

    public int getTrackIconSize() {
        return this.f21074f0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.J0;
    }

    public int getTrackInsideCornerSize() {
        return this.Q;
    }

    public int getTrackSidePadding() {
        return this.G;
    }

    public int getTrackStopIndicatorSize() {
        return this.O;
    }

    public ColorStateList getTrackTintList() {
        if (this.J0.equals(this.I0)) {
            return this.I0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.B0;
    }

    public float getValueFrom() {
        return this.f21098q0;
    }

    public float getValueTo() {
        return this.f21100r0;
    }

    List<Float> getValues() {
        return new ArrayList(this.f21102s0);
    }

    public boolean i0() {
        return this.f21094o0 != null;
    }

    public void m(com.google.android.material.slider.a aVar) {
        this.f21089m.add(aVar);
    }

    public boolean m0() {
        return this.R;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21078g1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f21069d1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f21072e1);
        Iterator it = this.f21087l.iterator();
        while (it.hasNext()) {
            p((qc.a) it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        b bVar = this.f21083j;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f21093o = false;
        Iterator it = this.f21087l.iterator();
        while (it.hasNext()) {
            E((qc.a) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f21069d1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f21072e1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.E0) {
            s1();
            j1();
        }
        super.onDraw(canvas);
        int iY = y();
        K(canvas, this.B0, iY);
        I(canvas, this.B0, iY);
        if (w0() || z0()) {
            Q(canvas, this.L0, this.M0);
        } else {
            Q(canvas, this.L0, this.N0);
        }
        D0(canvas);
        C0(canvas, iY);
        if ((this.f21096p0 || isFocused()) && isEnabled()) {
            B0(canvas, this.B0, iY);
        }
        g1();
        N(canvas, this.B0, iY);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            O0();
            this.f21104t0 = -1;
            this.f21079h.o(this.f21106u0);
        } else {
            if (this.f21104t0 == -1) {
                T(i10);
                this.f21104t0 = this.f21106u0;
            }
            O0();
            i1();
            this.f21079h.V(this.f21106u0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f21104t0 = this.f21106u0;
        this.D0 |= keyEvent.isLongPress();
        Float fS = s(i10);
        if (fS != null) {
            if (W0(((Float) this.f21102s0.get(this.f21104t0)).floatValue() + fS.floatValue())) {
                e1();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 61) {
            return super.onKeyDown(i10, keyEvent);
        }
        O0();
        if (keyEvent.hasNoModifiers()) {
            return G0(1);
        }
        if (keyEvent.isShiftPressed()) {
            return G0(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.D0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.f21088l0;
        rect.left = 0;
        rect.top = 0;
        rect.right = i12 - i10;
        rect.bottom = i13 - i11;
        if (!this.f21090m0.contains(rect)) {
            this.f21090m0.add(this.f21088l0);
        }
        q0.B0(this, this.f21090m0);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.D + ((this.E == 1 || U0()) ? ((qc.a) this.f21087l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (z0()) {
            super.onMeasure(iMakeMeasureSpec, i11);
        } else {
            super.onMeasure(i10, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f21098q0 = eVar.f21127a;
        this.f21100r0 = eVar.f21128b;
        T0(eVar.f21129c);
        this.f21108v0 = eVar.f21130d;
        if (eVar.f21131e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f21127a = this.f21098q0;
        eVar.f21128b = this.f21100r0;
        eVar.f21129c = new ArrayList(this.f21102s0);
        eVar.f21130d = this.f21108v0;
        eVar.f21131e = hasFocus();
        return eVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (z0()) {
            i10 = i11;
        }
        q1(i10);
        e1();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float y10 = z0() ? motionEvent.getY() : motionEvent.getX();
        float x10 = z0() ? motionEvent.getX() : motionEvent.getY();
        float f10 = (y10 - this.G) / this.B0;
        this.f21060a1 = f10;
        float fMax = Math.max(0.0f, f10);
        this.f21060a1 = fMax;
        this.f21060a1 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21082i0 = y10;
            this.f21084j0 = x10;
            this.f21092n0.clear();
            this.f21092n0 = getValues();
            if ((z0() || !v0(motionEvent)) && (!z0() || !u0(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (L0()) {
                    requestFocus();
                    this.f21096p0 = true;
                    i1();
                    J0();
                    a1();
                    e1();
                    invalidate();
                }
            }
        } else if (actionMasked == 1) {
            this.f21096p0 = false;
            MotionEvent motionEvent2 = this.f21086k0;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f21086k0.getX() - motionEvent.getX()) <= this.f21099r && Math.abs(this.f21086k0.getY() - motionEvent.getY()) <= this.f21099r && L0()) {
                J0();
            }
            if (this.f21104t0 != -1) {
                a1();
                e1();
                O0();
                this.f21104t0 = -1;
                K0();
            }
            invalidate();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f21096p0 = false;
                Y0();
                e1();
                O0();
                this.f21104t0 = -1;
                K0();
                invalidate();
            }
        } else if (this.f21096p0) {
            a1();
            e1();
            invalidate();
        } else {
            if (!z0() && v0(motionEvent) && Math.abs(y10 - this.f21082i0) < this.f21099r) {
                return false;
            }
            if (z0() && u0(motionEvent) && Math.abs(x10 - this.f21084j0) < this.f21099r * 0.8f) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (L0()) {
                this.f21096p0 = true;
                i1();
                J0();
                a1();
                e1();
                invalidate();
            }
        }
        setPressed(this.f21096p0);
        this.f21086k0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        this.f21078g1 = z10;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        ViewOverlay viewOverlayA0;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (viewOverlayA0 = a0()) == null) {
            return;
        }
        Iterator it = this.f21087l.iterator();
        while (it.hasNext()) {
            viewOverlayA0.remove((qc.a) it.next());
        }
    }

    protected void setActiveThumbIndex(int i10) {
        this.f21104t0 = i10;
    }

    public void setCentered(boolean z10) {
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        if (z10) {
            setValues(Float.valueOf((this.f21098q0 + this.f21100r0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f21098q0));
        }
        r1(true);
    }

    public void setContinuousModeTickCount(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("The continuousModeTickCount(%s) must be greater than or equal to 0", Integer.valueOf(i10)));
        }
        if (this.f21110w0 != i10) {
            this.f21110w0 = i10;
            this.E0 = true;
            postInvalidate();
        }
    }

    void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f21102s0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f21106u0 = i10;
        this.f21079h.V(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.J = i10;
        RippleDrawable rippleDrawableX = X();
        if (V0() || rippleDrawableX == null) {
            postInvalidate();
        } else {
            com.google.android.material.drawable.c.m(rippleDrawableX, this.J);
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.F0)) {
            return;
        }
        this.F0 = colorStateList;
        RippleDrawable rippleDrawableX = X();
        if (!V0() && rippleDrawableX != null) {
            rippleDrawableX.setColor(colorStateList);
            return;
        }
        this.f21067d.setColor(Z(colorStateList));
        this.f21067d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.E != i10) {
            this.E = i10;
            r1(true);
        }
    }

    public void setLabelFormatter(f fVar) {
        this.f21094o0 = fVar;
    }

    public void setOrientation(int i10) {
        if (this.B == i10) {
            return;
        }
        this.B = i10;
        r1(true);
    }

    protected void setSeparationUnit(int i10) {
        this.f21063b1 = i10;
        this.E0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.f21098q0), Float.valueOf(this.f21100r0)));
        }
        if (this.f21108v0 != f10) {
            this.f21108v0 = f10;
            this.E0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        if (f10 == this.W0) {
            return;
        }
        this.W0 = f10;
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            ((i) this.T0.get(i10)).k0(this.W0);
        }
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeight(int i10) {
        if (i10 == this.I) {
            return;
        }
        this.I = i10;
        for (int i11 = 0; i11 < this.T0.size(); i11++) {
            ((i) this.T0.get(i11)).setBounds(0, 0, this.H, this.I);
        }
        Drawable drawable = this.U0;
        if (drawable != null) {
            o(drawable);
        }
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            o((Drawable) it.next());
        }
        r1(false);
    }

    public void setThumbHeightResource(int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        if (colorStateList == this.Y0) {
            return;
        }
        this.Y0 = colorStateList;
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            ((i) this.T0.get(i10)).y0(colorStateList);
        }
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(i.a.a(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        if (f10 == this.X0) {
            return;
        }
        this.X0 = f10;
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            ((i) this.T0.get(i10)).A0(f10);
        }
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.Z0)) {
            return;
        }
        this.Z0 = colorStateList;
        for (int i10 = 0; i10 < this.T0.size(); i10++) {
            ((i) this.T0.get(i10)).l0(this.Z0);
        }
        invalidate();
    }

    public void setThumbTrackGapSize(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
        invalidate();
    }

    public void setThumbWidth(int i10) {
        if (i10 == this.H) {
            return;
        }
        this.H = i10;
        Drawable drawable = this.U0;
        if (drawable != null) {
            n(i10, drawable);
        }
        for (int i11 = 0; i11 < this.V0.size(); i11++) {
            n(i10, (Drawable) this.V0.get(i11));
        }
        R0(i10, -1, null);
    }

    public void setThumbWidthResource(int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickActiveRadius(int i10) {
        if (this.f21116z0 != i10) {
            this.f21116z0 = i10;
            this.f21073f.setStrokeWidth(i10 * 2);
            r1(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.G0)) {
            return;
        }
        this.G0 = colorStateList;
        this.f21073f.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            this.f21070e.setStrokeWidth(i10 * 2);
            r1(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.H0)) {
            return;
        }
        this.H0 = colorStateList;
        this.f21070e.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i10) {
        if (this.f21114y0 != i10) {
            this.f21114y0 = i10;
            postInvalidate();
        }
    }

    public void setTickVisible(boolean z10) {
        setTickVisibilityMode(A(z10));
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.I0)) {
            return;
        }
        this.I0 = colorStateList;
        this.f21061b.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i10) {
        if (this.P == i10) {
            return;
        }
        this.P = i10;
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            l0();
            r1(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.W) {
            return;
        }
        this.W = colorStateList;
        n1();
        m1();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.U) {
            return;
        }
        this.U = drawable;
        this.V = false;
        m1();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.S) {
            return;
        }
        this.S = drawable;
        this.T = false;
        n1();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f21071e0) {
            return;
        }
        this.f21071e0 = colorStateList;
        p1();
        o1();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f21065c0) {
            return;
        }
        this.f21065c0 = drawable;
        this.f21068d0 = false;
        o1();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f21059a0) {
            return;
        }
        this.f21059a0 = drawable;
        this.f21062b0 = false;
        p1();
        invalidate();
    }

    public void setTrackIconSize(int i10) {
        if (this.f21074f0 == i10) {
            return;
        }
        this.f21074f0 = i10;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.J0)) {
            return;
        }
        this.J0 = colorStateList;
        this.f21058a.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i10) {
        if (this.Q == i10) {
            return;
        }
        this.Q = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        if (this.O == i10) {
            return;
        }
        this.O = i10;
        this.f21076g.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.f21098q0 = f10;
        this.E0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f21100r0 = f10;
        this.E0 = true;
        postInvalidate();
    }

    void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        T0(arrayList);
    }

    final boolean w0() {
        return getLayoutDirection() == 1;
    }

    public boolean z0() {
        return this.B == 1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21118a;

        private b() {
            this.f21118a = -1;
        }

        void a(int i10) {
            this.f21118a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f21079h.W(this.f21118a, 4);
        }

        /* synthetic */ b(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    private void R(boolean z10) {
        if (!this.f21093o) {
            this.f21093o = true;
            ValueAnimator valueAnimatorB = B(true);
            this.f21095p = valueAnimatorB;
            this.f21097q = null;
            valueAnimatorB.start();
        }
        Iterator it = this.f21087l.iterator();
        if (z10) {
            for (int i10 = 0; i10 < this.f21102s0.size() && it.hasNext(); i10++) {
                if (i10 != this.f21106u0) {
                    S0((qc.a) it.next(), ((Float) this.f21102s0.get(i10)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format(WwUgngZLNA.ZdsdjNNvvAHHr, Integer.valueOf(this.f21087l.size()), Integer.valueOf(this.f21102s0.size())));
        }
        S0((qc.a) it.next(), ((Float) this.f21102s0.get(this.f21106u0)).floatValue());
    }

    void setCustomThumbDrawable(Drawable drawable) {
        this.U0 = k0(drawable);
        this.V0.clear();
        postInvalidate();
    }

    void setValues(List<Float> list) {
        T0(new ArrayList(list));
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.U0 = null;
        this.V0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.V0.add(k0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i10) {
        setTrackIconActiveEnd(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setTrackIconActiveStart(int i10) {
        setTrackIconActiveStart(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setTrackIconInactiveEnd(int i10) {
        setTrackIconInactiveEnd(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setTrackIconInactiveStart(int i10) {
        setTrackIconInactiveStart(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }
}
