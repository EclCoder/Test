package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.v;
import com.google.android.material.internal.z;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import gc.j;
import h.i;
import n0.b0;
import n0.k1;
import n0.q0;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int L = l.f51868l;
    private AppBarLayout.g A;
    int B;
    private int C;
    private int D;
    k1 E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f19271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f19272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f19273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f19279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final com.google.android.material.internal.b f19280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final com.google.android.material.internal.b f19281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final cc.a f19282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f19286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Drawable f19287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ValueAnimator f19290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TimeInterpolator f19292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TimeInterpolator f19293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19294z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b0 {
        a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            return CollapsingToolbarLayout.this.q(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements AppBarLayout.g {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.B = i10;
            k1 k1Var = collapsingToolbarLayout.E;
            int iN = k1Var != null ? k1Var.n() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                f fVarL = CollapsingToolbarLayout.l(childAt);
                int i12 = cVar.f19297a;
                if (i12 == 1) {
                    fVarL.f(h0.a.b(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    fVarL.f(Math.round((-i10) * cVar.f19298b));
                }
            }
            CollapsingToolbarLayout.this.x();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f19287s != null && iN > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - iN;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i13 = CollapsingToolbarLayout.this.B + minimumHeight;
            float f10 = minimumHeight;
            float fAbs = Math.abs(i10) / f10;
            float f11 = scrimVisibleHeightTrigger / f10;
            CollapsingToolbarLayout.this.f19280l.F0(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.f19280l.q0(i13);
            CollapsingToolbarLayout.this.f19280l.D0(fAbs);
            CollapsingToolbarLayout.this.f19281m.F0(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.f19281m.q0(i13);
            CollapsingToolbarLayout.this.f19281m.D0(fAbs);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e extends v {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51610h);
    }

    private void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f19290v;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f19290v = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f19288t ? this.f19292x : this.f19293y);
            this.f19290v.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f19290v.cancel();
        }
        this.f19290v.setDuration(this.f19291w);
        this.f19290v.setIntValues(this.f19288t, i10);
        this.f19290v.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        if (i10 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i10 != 1) {
            return i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void c(AppBarLayout appBarLayout) {
        if (m()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.f19269a) {
            ViewGroup viewGroup = null;
            this.f19271c = null;
            this.f19272d = null;
            int i10 = this.f19270b;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f19271c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f19272d = e(viewGroup2);
                }
            }
            if (this.f19271c == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (n(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f19271c = viewGroup;
            }
            w();
            this.f19269a = false;
        }
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListG = ac.a.g(getContext(), sb.c.f51622n);
        if (colorStateListG != null) {
            return colorStateListG.getDefaultColor();
        }
        return this.f19282n.d(getResources().getDimension(sb.e.f51670c));
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    private static CharSequence k(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static f l(View view) {
        int i10 = sb.g.A0;
        f fVar = (f) view.getTag(i10);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(view);
        view.setTag(i10, fVar2);
        return fVar2;
    }

    private boolean m() {
        return this.D == 1;
    }

    private static boolean n(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean o(View view) {
        View view2 = this.f19272d;
        if (view2 == null || view2 == this) {
            return view == this.f19271c;
        }
        return view == view2;
    }

    private void p() {
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.getPendingAction() == 0) {
                appBarLayout.setPendingAction(2);
            }
        }
    }

    private void s(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f19272d;
        if (view == null) {
            view = this.f19271c;
        }
        int i10 = i(view);
        com.google.android.material.internal.d.a(this, this.f19273e, this.f19279k);
        ViewGroup viewGroup = this.f19271c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        Rect rect = this.f19279k;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.right - (z10 ? titleMarginStart : titleMarginEnd);
        int i13 = rect.top + i10 + titleMarginTop;
        int i14 = (rect.bottom + i10) - titleMarginBottom;
        int iM = (int) (i14 - this.f19281m.m());
        int iM2 = (int) (i13 + this.f19280l.m());
        if (TextUtils.isEmpty(this.f19281m.P())) {
            this.f19280l.f0(i11, i13, i12, i14);
        } else {
            this.f19280l.f0(i11, i13, i12, iM);
            this.f19281m.f0(i11, iM2, i12, i14);
        }
        if (this.f19285q == 0) {
            com.google.android.material.internal.d.a(this, this, this.f19279k);
            Rect rect2 = this.f19279k;
            int i15 = rect2.left + (z10 ? titleMarginEnd : titleMarginStart);
            int i16 = rect2.right;
            if (!z10) {
                titleMarginStart = titleMarginEnd;
            }
            int i17 = i16 - titleMarginStart;
            if (TextUtils.isEmpty(this.f19281m.P())) {
                this.f19280l.h0(i15, i13, i17, i14);
            } else {
                this.f19280l.h0(i15, i13, i17, iM);
                this.f19281m.h0(i15, iM2, i17, i14);
            }
        }
    }

    private void t() {
        setContentDescription(getTitle());
    }

    private void u(Drawable drawable, int i10, int i11) {
        v(drawable, this.f19271c, i10, i11);
    }

    private void v(Drawable drawable, View view, int i10, int i11) {
        if (m() && view != null && this.f19283o) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void w() {
        View view;
        if (!this.f19283o && (view = this.f19273e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f19273e);
            }
        }
        if (!this.f19283o || this.f19271c == null) {
            return;
        }
        if (this.f19273e == null) {
            this.f19273e = new View(getContext());
        }
        if (this.f19273e.getParent() == null) {
            this.f19271c.addView(this.f19273e, -1, -1);
        }
    }

    private void y(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f19283o || (view = this.f19273e) == null) {
            return;
        }
        boolean z11 = view.isAttachedToWindow() && this.f19273e.getVisibility() == 0;
        this.f19284p = z11;
        if (z11 || z10) {
            boolean z12 = getLayoutDirection() == 1;
            s(z12);
            int i14 = z12 ? this.f19276h : this.f19274f;
            int i15 = this.f19279k.top + this.f19275g;
            int i16 = (i12 - i10) - (z12 ? this.f19274f : this.f19276h);
            int i17 = (i13 - i11) - this.f19277i;
            if (TextUtils.isEmpty(this.f19281m.P())) {
                this.f19280l.r0(i14, i15, i16, i17);
                this.f19280l.c0(z10);
            } else {
                this.f19280l.s0(i14, i15, i16, (int) ((i17 - (this.f19281m.B() + this.I)) - this.f19278j), false);
                this.f19281m.s0(i14, (int) (i15 + this.f19280l.B() + this.H + this.f19278j), i16, i17, false);
                this.f19280l.c0(z10);
                this.f19281m.c0(z10);
            }
        }
    }

    private void z() {
        ViewGroup viewGroup = this.f19271c;
        if (viewGroup == null || !this.f19283o) {
            return;
        }
        CharSequence charSequenceK = k(viewGroup);
        if (TextUtils.isEmpty(this.f19280l.P()) && !TextUtils.isEmpty(charSequenceK)) {
            setTitle(charSequenceK);
        }
        CharSequence charSequenceJ = j(this.f19271c);
        if (!TextUtils.isEmpty(this.f19281m.P()) || TextUtils.isEmpty(charSequenceJ)) {
            return;
        }
        setSubtitle(charSequenceJ);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f19271c == null && (drawable = this.f19286r) != null && this.f19288t > 0) {
            drawable.mutate().setAlpha(this.f19288t);
            this.f19286r.draw(canvas);
        }
        if (this.f19283o && this.f19284p) {
            if (this.f19271c == null || this.f19286r == null || this.f19288t <= 0 || !m() || this.f19280l.H() >= this.f19280l.I()) {
                this.f19280l.k(canvas);
                this.f19281m.k(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f19286r.getBounds(), Region.Op.DIFFERENCE);
                this.f19280l.k(canvas);
                this.f19281m.k(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f19287s == null || this.f19288t <= 0) {
            return;
        }
        k1 k1Var = this.E;
        int iN = k1Var != null ? k1Var.n() : 0;
        if (iN > 0) {
            this.f19287s.setBounds(0, -this.B, getWidth(), iN - this.B);
            this.f19287s.mutate().setAlpha(this.f19288t);
            this.f19287s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f19286r == null || this.f19288t <= 0 || !o(view)) {
            z10 = false;
        } else {
            v(this.f19286r, view, getWidth(), getHeight());
            this.f19286r.mutate().setAlpha(this.f19288t);
            this.f19286r.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f19287s;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f19286r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f19280l;
        if (bVar != null) {
            state |= bVar.M0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f19281m.u();
    }

    public Typeface getCollapsedSubtitleTypeface() {
        return this.f19281m.v();
    }

    public int getCollapsedTitleGravity() {
        return this.f19280l.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f19280l.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f19280l.v();
    }

    public Drawable getContentScrim() {
        return this.f19286r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f19281m.F();
    }

    public Typeface getExpandedSubtitleTypeface() {
        return this.f19281m.G();
    }

    public int getExpandedTitleGravity() {
        return this.f19280l.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f19277i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f19276h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f19274f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f19275g;
    }

    public int getExpandedTitleSpacing() {
        return this.f19278j;
    }

    public float getExpandedTitleTextSize() {
        return this.f19280l.F();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f19280l.G();
    }

    public int getHyphenationFrequency() {
        return this.f19280l.J();
    }

    public int getLineCount() {
        return this.f19280l.K();
    }

    public float getLineSpacingAdd() {
        return this.f19280l.L();
    }

    public float getLineSpacingMultiplier() {
        return this.f19280l.M();
    }

    public int getMaxLines() {
        return this.f19280l.A();
    }

    int getScrimAlpha() {
        return this.f19288t;
    }

    public long getScrimAnimationDuration() {
        return this.f19291w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f19294z;
        if (i10 >= 0) {
            return i10 + this.F + this.H + this.I + this.K;
        }
        k1 k1Var = this.E;
        int iN = k1Var != null ? k1Var.n() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iN, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f19287s;
    }

    public CharSequence getSubtitle() {
        if (this.f19283o) {
            return this.f19281m.P();
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.f19283o) {
            return this.f19280l.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.D;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f19280l.O();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f19280l.S();
    }

    final int i(View view) {
        return ((getHeight() - l(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.A == null) {
                this.A = new d();
            }
            appBarLayout.e(this.A);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f19280l.Z(configuration);
        if (this.C != configuration.orientation && this.J && this.f19280l.H() == 1.0f) {
            p();
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.A;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).A(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k1 k1Var = this.E;
        if (k1Var != null) {
            int iN = k1Var.n();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iN) {
                    q0.Y(childAt, iN);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            l(getChildAt(i15)).d();
        }
        y(i10, i11, i12, i13, false);
        z();
        x();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            l(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        k1 k1Var = this.E;
        int iN = k1Var != null ? k1Var.n() : 0;
        if ((mode == 0 || this.G) && iN > 0) {
            this.F = iN;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iN, 1073741824));
        }
        z();
        if (!this.f19283o || TextUtils.isEmpty(this.f19280l.P())) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.y(0, 0, getMeasuredWidth(), measuredHeight, true);
            int iB = (int) (collapsingToolbarLayout.F + collapsingToolbarLayout.f19275g + collapsingToolbarLayout.f19280l.B() + (TextUtils.isEmpty(collapsingToolbarLayout.f19281m.P()) ? 0.0f : collapsingToolbarLayout.f19278j + collapsingToolbarLayout.f19281m.B()) + collapsingToolbarLayout.f19277i);
            if (iB > measuredHeight) {
                collapsingToolbarLayout.K = iB - measuredHeight;
            } else {
                collapsingToolbarLayout.K = 0;
            }
            if (collapsingToolbarLayout.J) {
                if (collapsingToolbarLayout.f19280l.A() > 1) {
                    int iZ = collapsingToolbarLayout.f19280l.z();
                    if (iZ > 1) {
                        collapsingToolbarLayout.H = Math.round(collapsingToolbarLayout.f19280l.B()) * (iZ - 1);
                    } else {
                        collapsingToolbarLayout.H = 0;
                    }
                }
                if (collapsingToolbarLayout.f19281m.A() > 1) {
                    int iZ2 = collapsingToolbarLayout.f19281m.z();
                    if (iZ2 > 1) {
                        collapsingToolbarLayout.I = Math.round(collapsingToolbarLayout.f19281m.B()) * (iZ2 - 1);
                    } else {
                        collapsingToolbarLayout.I = 0;
                    }
                }
            }
            int i12 = collapsingToolbarLayout.K;
            int i13 = collapsingToolbarLayout.H;
            int i14 = collapsingToolbarLayout.I;
            if (i12 + i13 + i14 > 0) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight + i12 + i13 + i14, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f19271c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f19272d;
            if (view == null || view == collapsingToolbarLayout) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
        if (collapsingToolbarLayout.J && collapsingToolbarLayout.f19280l.A() > 1 && collapsingToolbarLayout.f19280l.H() == 1.0f) {
            p();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f19286r;
        if (drawable != null) {
            u(drawable, i10, i11);
        }
    }

    k1 q(k1 k1Var) {
        k1 k1Var2 = getFitsSystemWindows() ? k1Var : null;
        if (!m0.b.a(this.E, k1Var2)) {
            this.E = k1Var2;
            requestLayout();
        }
        return k1Var.c();
    }

    public void r(boolean z10, boolean z11) {
        if (this.f19289u != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f19289u = z10;
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i10) {
        this.f19281m.j0(i10);
    }

    public void setCollapsedSubtitleTextColor(int i10) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedSubtitleTextSize(float f10) {
        this.f19281m.n0(f10);
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        this.f19281m.o0(typeface);
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f19280l.m0(i10);
        this.f19281m.m0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f19280l.j0(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f19280l.n0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f19280l.o0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f19286r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f19286r = drawableMutate;
            if (drawableMutate != null) {
                u(drawableMutate, getWidth(), getHeight());
                this.f19286r.setCallback(this);
                this.f19286r.setAlpha(this.f19288t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(getContext().getDrawable(i10));
    }

    public void setExpandedSubtitleColor(int i10) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedSubtitleTextAppearance(int i10) {
        this.f19281m.w0(i10);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        this.f19281m.y0(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f10) {
        this.f19281m.A0(f10);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        this.f19281m.B0(typeface);
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f19280l.z0(i10);
        this.f19281m.z0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f19277i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f19276h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f19274f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f19275g = i10;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i10) {
        this.f19278j = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f19280l.w0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f19280l.y0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f19280l.A0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f19280l.B0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.J = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.G = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f19280l.G0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f19280l.I0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f19280l.J0(f10);
    }

    public void setMaxLines(int i10) {
        this.f19280l.v0(i10);
        this.f19281m.v0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f19280l.L0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f19288t) {
            if (this.f19286r != null && (viewGroup = this.f19271c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.f19288t = i10;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f19291w = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f19294z != i10) {
            this.f19294z = i10;
            x();
        }
    }

    public void setScrimsShown(boolean z10) {
        r(z10, isLaidOut() && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f19280l.N0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f19287s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f19287s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f19287s.setState(getDrawableState());
                }
                f0.a.m(this.f19287s, getLayoutDirection());
                this.f19287s.setVisible(getVisibility() == 0, false);
                this.f19287s.setCallback(this);
                this.f19287s.setAlpha(this.f19288t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(getContext().getDrawable(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f19281m.O0(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19280l.O0(charSequence);
        t();
    }

    public void setTitleCollapseMode(int i10) {
        this.D = i10;
        boolean zM = m();
        this.f19280l.E0(zM);
        this.f19281m.E0(zM);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zM && this.f19286r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f19280l.Q0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f19283o) {
            this.f19283o = z10;
            t();
            w();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f19280l.K0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f19287s;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f19287s.setVisible(z10, false);
        }
        Drawable drawable2 = this.f19286r;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f19286r.setVisible(z10, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f19286r || drawable == this.f19287s;
    }

    final void x() {
        if (this.f19286r == null && this.f19287s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = L;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19269a = true;
        this.f19279k = new Rect();
        this.f19294z = -1;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.K = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f19280l = bVar;
        TimeInterpolator timeInterpolator = tb.b.f53279e;
        bVar.P0(timeInterpolator);
        bVar.L0(false);
        this.f19282n = new cc.a(context2);
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52190u2, i10, i11, new int[0]);
        int i12 = typedArrayI.getInt(m.E2, 8388691);
        int i13 = typedArrayI.getInt(m.f52235x2, 8388627);
        this.f19285q = typedArrayI.getInt(m.f52250y2, 1);
        bVar.z0(i12);
        bVar.m0(i13);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.F2, 0);
        this.f19277i = dimensionPixelSize;
        this.f19276h = dimensionPixelSize;
        this.f19275g = dimensionPixelSize;
        this.f19274f = dimensionPixelSize;
        int i14 = m.I2;
        if (typedArrayI.hasValue(i14)) {
            this.f19274f = typedArrayI.getDimensionPixelSize(i14, 0);
        }
        int i15 = m.H2;
        if (typedArrayI.hasValue(i15)) {
            this.f19276h = typedArrayI.getDimensionPixelSize(i15, 0);
        }
        int i16 = m.J2;
        if (typedArrayI.hasValue(i16)) {
            this.f19275g = typedArrayI.getDimensionPixelSize(i16, 0);
        }
        int i17 = m.G2;
        if (typedArrayI.hasValue(i17)) {
            this.f19277i = typedArrayI.getDimensionPixelSize(i17, 0);
        }
        int i18 = m.K2;
        if (typedArrayI.hasValue(i18)) {
            this.f19278j = typedArrayI.getDimensionPixelSize(i18, 0);
        }
        this.f19283o = typedArrayI.getBoolean(m.X2, true);
        setTitle(typedArrayI.getText(m.V2));
        bVar.w0(l.f51861e);
        bVar.j0(i.f39990f);
        int i19 = m.L2;
        if (typedArrayI.hasValue(i19)) {
            bVar.w0(typedArrayI.getResourceId(i19, 0));
        }
        int i20 = m.f52265z2;
        if (typedArrayI.hasValue(i20)) {
            bVar.j0(typedArrayI.getResourceId(i20, 0));
        }
        int i21 = m.f51887a3;
        if (typedArrayI.hasValue(i21)) {
            setTitleEllipsize(b(typedArrayI.getInt(i21, -1)));
        }
        int i22 = m.M2;
        if (typedArrayI.hasValue(i22)) {
            bVar.y0(jc.c.a(context2, typedArrayI, i22));
        }
        int i23 = m.A2;
        if (typedArrayI.hasValue(i23)) {
            bVar.l0(jc.c.a(context2, typedArrayI, i23));
        }
        this.f19294z = typedArrayI.getDimensionPixelSize(m.R2, -1);
        int i24 = m.Y2;
        if (typedArrayI.hasValue(i24)) {
            bVar.v0(typedArrayI.getInt(i24, 1));
        } else {
            int i25 = m.P2;
            if (typedArrayI.hasValue(i25)) {
                bVar.v0(typedArrayI.getInt(i25, 1));
            }
        }
        int i26 = m.Z2;
        if (typedArrayI.hasValue(i26)) {
            bVar.K0(AnimationUtils.loadInterpolator(context2, typedArrayI.getResourceId(i26, 0)));
        }
        com.google.android.material.internal.b bVar2 = new com.google.android.material.internal.b(this);
        this.f19281m = bVar2;
        bVar2.P0(timeInterpolator);
        bVar2.L0(false);
        int i27 = m.T2;
        if (typedArrayI.hasValue(i27)) {
            setSubtitle(typedArrayI.getText(i27));
        }
        bVar2.z0(i12);
        bVar2.m0(i13);
        bVar2.w0(i.f39988d);
        bVar2.j0(i.f39989e);
        int i28 = m.C2;
        if (typedArrayI.hasValue(i28)) {
            bVar2.w0(typedArrayI.getResourceId(i28, 0));
        }
        int i29 = m.f52205v2;
        if (typedArrayI.hasValue(i29)) {
            bVar2.j0(typedArrayI.getResourceId(i29, 0));
        }
        int i30 = m.D2;
        if (typedArrayI.hasValue(i30)) {
            bVar2.y0(jc.c.a(context2, typedArrayI, i30));
        }
        int i31 = m.f52220w2;
        if (typedArrayI.hasValue(i31)) {
            bVar2.l0(jc.c.a(context2, typedArrayI, i31));
        }
        int i32 = m.U2;
        if (typedArrayI.hasValue(i32)) {
            bVar2.v0(typedArrayI.getInt(i32, 1));
        }
        if (typedArrayI.hasValue(i26)) {
            bVar2.K0(AnimationUtils.loadInterpolator(context2, typedArrayI.getResourceId(i26, 0)));
        }
        this.f19291w = typedArrayI.getInt(m.Q2, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
        int i33 = sb.c.Z;
        this.f19292x = j.g(context2, i33, tb.b.f53277c);
        this.f19293y = j.g(context2, i33, tb.b.f53278d);
        setContentScrim(typedArrayI.getDrawable(m.B2));
        setStatusBarScrim(typedArrayI.getDrawable(m.S2));
        setTitleCollapseMode(typedArrayI.getInt(m.W2, 0));
        this.f19270b = typedArrayI.getResourceId(m.f51903b3, -1);
        this.G = typedArrayI.getBoolean(m.O2, false);
        this.J = typedArrayI.getBoolean(m.N2, false);
        typedArrayI.recycle();
        setWillNotDraw(false);
        q0.w0(this, new a());
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.f19281m.l0(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f19280l.l0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f19298b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19297a = 0;
            this.f19298b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f51919c3);
            this.f19297a = typedArrayObtainStyledAttributes.getInt(m.f51935d3, 0);
            a(typedArrayObtainStyledAttributes.getFloat(m.f51951e3, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f19298b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f19297a = 0;
            this.f19298b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19297a = 0;
            this.f19298b = 0.5f;
        }
    }
}
