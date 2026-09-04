package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.t0;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f extends FrameLayout implements i {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int[] f20566j0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final c f20567k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final c f20568l0;
    private BaselineLayout A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private ColorStateList G;
    private boolean H;
    private androidx.appcompat.view.menu.g I;
    private ColorStateList J;
    private Drawable K;
    private Drawable L;
    private ValueAnimator M;
    private c N;
    private float O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20569a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ub.a f20570a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f20571b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f20572b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f20573c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f20574c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20575d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f20576d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20577e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f20578e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20579f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f20580f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20581g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f20582g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20583h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f20584h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20585i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Rect f20586i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f20588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f20589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f20590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinearLayout f20593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinearLayout f20594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f20595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FrameLayout f20596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f20597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final BaselineLayout f20598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextView f20599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextView f20600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BaselineLayout f20601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f20602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f20603z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20604a;

        a(int i10) {
            this.f20604a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.A(this.f20604a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f20606a;

        b(float f10) {
            this.f20606a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f20606a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {
        private c() {
        }

        protected float a(float f10, float f11) {
            return tb.b.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10) {
            return tb.b.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends c {
        private d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.f.c
        protected float c(float f10) {
            return b(f10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f20567k0 = new c(aVar);
        f20568l0 = new d(aVar);
    }

    public f(Context context) {
        super(context);
        this.f20569a = false;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.H = false;
        this.N = f20567k0;
        this.O = 0.0f;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = -2;
        this.T = 0;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.f20574c0 = 0;
        this.f20576d0 = 49;
        this.f20578e0 = false;
        this.f20580f0 = false;
        this.f20582g0 = false;
        this.f20584h0 = false;
        this.f20586i0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f20593p = (LinearLayout) findViewById(sb.g.L);
        LinearLayout linearLayout = (LinearLayout) findViewById(sb.g.O);
        this.f20594q = linearLayout;
        this.f20595r = findViewById(sb.g.K);
        this.f20596s = (FrameLayout) findViewById(sb.g.M);
        this.f20597t = (ImageView) findViewById(sb.g.N);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(sb.g.P);
        this.f20598u = baselineLayout;
        TextView textView = (TextView) findViewById(sb.g.R);
        this.f20599v = textView;
        TextView textView2 = (TextView) findViewById(sb.g.Q);
        this.f20600w = textView2;
        j();
        this.A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f20575d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f20577e = baselineLayout.getPaddingBottom();
        this.f20579f = 0;
        this.f20581g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f20602y.setImportantForAccessibility(2);
        this.f20603z.setImportantForAccessibility(2);
        setFocusable(true);
        f();
        this.T = getResources().getDimensionPixelSize(sb.e.P);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                f.a(this.f20565a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    private void B() {
        if (k()) {
            this.N = f20568l0;
        } else {
            this.N = f20567k0;
        }
    }

    private void C() {
        TextView textView = this.f20600w;
        textView.setTypeface(textView.getTypeface(), this.H ? 1 : 0);
        TextView textView2 = this.f20603z;
        textView2.setTypeface(textView2.getTypeface(), this.H ? 1 : 0);
    }

    private void D(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(jc.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        C();
    }

    private void E(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(jc.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void F() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f20574c0 = 0;
        this.A = this.f20598u;
        int i16 = 8;
        if (this.f20572b0 == 1) {
            if (this.f20601x.getParent() == null) {
                e();
            }
            Rect rect = this.f20586i0;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f20574c0 = 1;
            int i20 = this.W;
            this.A = this.f20601x;
            i14 = i19;
            i13 = i18;
            i12 = i17;
            i11 = i20;
            i15 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 8;
            i16 = 0;
        }
        this.f20598u.setVisibility(i16);
        this.f20601x.setVisibility(i15);
        ((FrameLayout.LayoutParams) this.f20593p.getLayoutParams()).gravity = this.f20576d0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20594q.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i10;
        setPadding(i11, 0, i11, 0);
        A(getWidth());
    }

    private static void G(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void H() {
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f20578e0 && this.f20580f0)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(f fVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (fVar.f20597t.getVisibility() == 0) {
            fVar.z(fVar.f20597t);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fVar.f20594q.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (fVar.f20572b0 == 1 && fVar.S == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fVar.f20595r.getLayoutParams();
            if (fVar.S != -2 || fVar.f20595r.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(fVar.Q, fVar.getMeasuredWidth() - (fVar.V * 2)));
                z10 = true;
            }
            if (fVar.f20595r.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                fVar.f20595r.setLayoutParams(layoutParams2);
            }
        }
    }

    private void e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f20594q.addView(this.f20601x, layoutParams);
        q();
    }

    private void f() {
        float textSize = this.f20599v.getTextSize();
        float textSize2 = this.f20600w.getTextSize();
        this.f20583h = textSize - textSize2;
        this.f20585i = (textSize2 * 1.0f) / textSize;
        this.f20587j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f20602y.getTextSize();
        float textSize4 = this.f20603z.getTextSize();
        this.f20588k = textSize3 - textSize4;
        this.f20589l = (textSize4 * 1.0f) / textSize3;
        this.f20590m = (textSize3 * 1.0f) / textSize4;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof f) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        ub.a aVar = this.f20570a0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f20570a0.m();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20596s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f20597t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private Drawable h(ColorStateList colorStateList) {
        return FocusRingDrawable.P(getContext(), new RippleDrawable(kc.a.a(colorStateList), null, null));
    }

    private boolean i() {
        return this.f20570a0 != null;
    }

    private void j() {
        float dimension = getResources().getDimension(sb.e.f51667b);
        float dimension2 = getResources().getDimension(sb.e.f51664a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f20601x = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f20601x.setDuplicateParentStateEnabled(true);
        this.f20601x.setMeasurePaddingFromBaseline(this.f20582g0);
        TextView textView = new TextView(getContext());
        this.f20602y = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f20602y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f20602y.setDuplicateParentStateEnabled(true);
        this.f20602y.setIncludeFontPadding(false);
        this.f20602y.setGravity(16);
        this.f20602y.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.f20603z = textView3;
        textView3.setMaxLines(1);
        this.f20603z.setEllipsize(truncateAt);
        this.f20603z.setDuplicateParentStateEnabled(true);
        this.f20603z.setVisibility(4);
        this.f20603z.setIncludeFontPadding(false);
        this.f20603z.setGravity(16);
        this.f20603z.setTextSize(dimension2);
        this.f20601x.addView(this.f20602y);
        this.f20601x.addView(this.f20603z);
    }

    private boolean k() {
        return this.U && this.f20591n == 2;
    }

    private void l(float f10) {
        if (!this.P || !this.f20569a || !isAttachedToWindow()) {
            p(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.O, f10);
        this.M = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b(f10));
        this.M.setInterpolator(gc.j.g(getContext(), sb.c.U, tb.b.f53276b));
        this.M.setDuration(gc.j.f(getContext(), sb.c.K, getResources().getInteger(sb.h.f51800b)));
        this.M.start();
    }

    private void m() {
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void n() {
        Drawable drawableH = this.f20573c;
        Drawable drawable = null;
        drawable = null;
        drawable = null;
        boolean z10 = true;
        if (this.f20571b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.P && activeIndicatorDrawable != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(this.f20571b), null, activeIndicatorDrawable);
                FocusRingDrawable.x(getContext(), rippleDrawable, activeIndicatorDrawable instanceof mc.i ? (mc.i) activeIndicatorDrawable : null);
                drawable = rippleDrawable;
                z10 = false;
            } else if (drawableH == null) {
                drawableH = h(this.f20571b);
            }
        }
        this.f20596s.setPadding(0, 0, 0, 0);
        this.f20596s.setForeground(drawable);
        setBackground(drawableH);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float f10, float f11) {
        this.N.d(f10, f11, this.f20595r);
        this.O = f10;
    }

    private void q() {
        int i10 = this.f20597t.getLayoutParams().width > 0 ? this.f20581g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20601x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    private void r(View view, View view2, float f10, float f11) {
        v(this.f20593p, this.f20572b0 == 0 ? (int) (this.f20575d + f11) : 0, 0, this.f20576d0);
        LinearLayout linearLayout = this.f20594q;
        int i10 = this.f20572b0;
        v(linearLayout, i10 == 0 ? 0 : this.f20586i0.top, i10 == 0 ? 0 : this.f20586i0.bottom, i10 == 0 ? 17 : 8388627);
        G(this.f20598u, this.f20577e);
        this.A.setVisibility(0);
        w(view, 1.0f, 1.0f, 0);
        w(view2, f10, f10, 4);
    }

    private void s() {
        LinearLayout linearLayout = this.f20593p;
        int i10 = this.f20575d;
        v(linearLayout, i10, i10, this.f20572b0 == 0 ? 17 : this.f20576d0);
        v(this.f20594q, 0, 0, 17);
        G(this.f20598u, 0);
        this.A.setVisibility(8);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private void t(TextView textView, int i10) {
        if (this.f20584h0) {
            androidx.core.widget.i.m(textView, i10);
        } else {
            u(textView, i10);
        }
    }

    private static void u(TextView textView, int i10) {
        androidx.core.widget.i.m(textView, i10);
        int iJ = jc.c.j(textView.getContext(), i10, 0);
        if (iJ != 0) {
            textView.setTextSize(0, iJ);
        }
    }

    private static void v(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private static void w(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private void x(View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ub.c.a(this.f20570a0, view);
        }
    }

    private void y(View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ub.c.e(this.f20570a0, view);
            }
            this.f20570a0 = null;
        }
    }

    private void z(View view) {
        if (i()) {
            ub.c.f(this.f20570a0, view, null);
        }
    }

    public void A(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.Q, i10 - (this.V * 2));
            int iMax = this.R;
            if (this.f20572b0 == 1) {
                int measuredWidth = i10 - (this.W * 2);
                int i11 = this.S;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.f20593p.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.T, this.f20594q.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20595r.getLayoutParams();
            if (k()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.f20595r.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.I = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        t0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        H();
        this.f20569a = true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.P) {
            this.f20596s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    void g() {
        o();
        this.I = null;
        this.O = 0.0f;
        this.f20569a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f20595r.getBackground();
    }

    public ub.a getBadge() {
        return this.f20570a0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f20601x;
    }

    protected int getItemBackgroundResId() {
        return sb.f.f51745l;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.I;
    }

    protected int getItemDefaultMarginResId() {
        return sb.e.X0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.B;
    }

    public BaselineLayout getLabelGroup() {
        return this.f20598u;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20593p.getLayoutParams();
        return this.f20593p.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f20572b0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20594q.getLayoutParams();
            return this.f20594q.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f20598u.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f20598u.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    void o() {
        y(this.f20597t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar != null && gVar.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20566j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ub.a aVar = this.f20570a0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.I.getTitle();
            if (!TextUtils.isEmpty(this.I.getContentDescription())) {
                title = this.I.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f20570a0.j()));
        }
        o0.p pVarC1 = o0.p.c1(accessibilityNodeInfo);
        pVarC1.x0(o0.p.h.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            pVarC1.v0(false);
            pVarC1.l0(o0.p.a.f47928i);
        }
        pVarC1.Q0(getResources().getString(sb.k.f51845q));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f20595r.setBackground(drawable);
        n();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.P = z10;
        n();
        this.f20595r.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.T = i10;
        A(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.W = i10;
        if (this.f20572b0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        A(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f20586i0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.S = i10;
        A(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.R = i10;
        A(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f20579f != i10) {
            this.f20579f = i10;
            ((LinearLayout.LayoutParams) this.f20598u.getLayoutParams()).topMargin = i10;
            if (this.f20601x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20601x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.V = i10;
        A(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.U = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.Q = i10;
        A(getWidth());
    }

    void setBadge(ub.a aVar) {
        if (this.f20570a0 == aVar) {
            return;
        }
        if (i() && this.f20597t != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            y(this.f20597t);
        }
        this.f20570a0 = aVar;
        aVar.O(this.f20574c0);
        ImageView imageView = this.f20597t;
        if (imageView != null) {
            x(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        setLabelPivots(this.f20600w);
        setLabelPivots(this.f20599v);
        setLabelPivots(this.f20603z);
        setLabelPivots(this.f20602y);
        l(z10 ? 1.0f : 0.0f);
        TextView textView = this.f20600w;
        TextView textView2 = this.f20599v;
        float f10 = this.f20583h;
        float f11 = this.f20585i;
        float f12 = this.f20587j;
        if (this.f20572b0 == 1) {
            textView = this.f20603z;
            textView2 = this.f20602y;
            f10 = this.f20588k;
            f11 = this.f20589l;
            f12 = this.f20590m;
        }
        int i10 = this.f20591n;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        s();
                    }
                } else if (z10) {
                    r(textView, textView2, f11, f10);
                } else {
                    r(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (this.f20592o) {
            if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (z10) {
            r(textView, textView2, f11, f10);
        } else {
            r(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f20599v.setEnabled(z10);
        this.f20600w.setEnabled(z10);
        this.f20602y.setEnabled(z10);
        this.f20603z.setEnabled(z10);
        this.f20597t.setEnabled(z10);
    }

    @Override // com.google.android.material.navigation.i
    public void setExpanded(boolean z10) {
        this.f20578e0 = z10;
        H();
    }

    public void setHorizontalTextAppearanceActive(int i10) {
        this.E = i10;
        TextView textView = this.f20603z;
        if (i10 == 0) {
            i10 = this.C;
        }
        D(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) {
        this.F = i10;
        TextView textView = this.f20602y;
        if (i10 == 0) {
            i10 = this.D;
        }
        E(textView, i10);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.K) {
            return;
        }
        this.K = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = f0.a.r(drawable).mutate();
            this.L = drawable;
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f20597t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f20581g != i10) {
            this.f20581g = i10;
            q();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20597t.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f20597t.setLayoutParams(layoutParams);
        q();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.J = colorStateList;
        if (this.I == null || (drawable = this.L) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.L.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f20576d0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f20572b0 != i10) {
            this.f20572b0 = i10;
            F();
            n();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f20577e != i10) {
            this.f20577e = i10;
            m();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f20575d != i10) {
            this.f20575d = i10;
            m();
        }
    }

    public void setItemPosition(int i10) {
        this.B = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f20571b = colorStateList;
        n();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f20584h0 = z10;
        setTextAppearanceActive(this.C);
        setTextAppearanceInactive(this.D);
        setHorizontalTextAppearanceActive(this.E);
        setHorizontalTextAppearanceInactive(this.F);
    }

    public void setLabelMaxLines(int i10) {
        this.f20599v.setMaxLines(i10);
        this.f20600w.setMaxLines(i10);
        this.f20602y.setMaxLines(i10);
        this.f20603z.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.f20599v.setGravity(17);
            this.f20600w.setGravity(17);
        } else if (i10 > 1) {
            this.f20599v.setEllipsize(null);
            this.f20600w.setEllipsize(null);
            this.f20599v.setGravity(17);
            this.f20600w.setGravity(17);
        } else {
            this.f20599v.setGravity(16);
            this.f20600w.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f20591n != i10) {
            this.f20591n = i10;
            B();
            A(getWidth());
            m();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f20582g0 = z10;
        this.f20598u.setMeasurePaddingFromBaseline(z10);
        this.f20599v.setIncludeFontPadding(z10);
        this.f20600w.setIncludeFontPadding(z10);
        this.f20601x.setMeasurePaddingFromBaseline(z10);
        this.f20602y.setIncludeFontPadding(z10);
        this.f20603z.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.i
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f20580f0 = z10;
        H();
    }

    public void setShifting(boolean z10) {
        if (this.f20592o != z10) {
            this.f20592o = z10;
            m();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.C = i10;
        D(this.f20600w, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.H = z10;
        setTextAppearanceActive(this.C);
        setHorizontalTextAppearanceActive(this.E);
        C();
    }

    public void setTextAppearanceInactive(int i10) {
        this.D = i10;
        E(this.f20599v, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (colorStateList != null) {
            this.f20599v.setTextColor(colorStateList);
            this.f20600w.setTextColor(colorStateList);
            this.f20602y.setTextColor(colorStateList);
            this.f20603z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f20599v.setText(charSequence);
        this.f20600w.setText(charSequence);
        this.f20602y.setText(charSequence);
        this.f20603z.setText(charSequence);
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.g gVar2 = this.I;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.I.getTooltipText();
        }
        t0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f20573c = drawable;
        n();
    }
}
