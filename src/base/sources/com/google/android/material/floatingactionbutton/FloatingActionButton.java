package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import java.util.List;
import m0.g;
import mc.p;
import mc.s;
import n0.q0;
import sb.l;
import sb.m;
import tb.h;
import tb.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements dc.a, s, CoordinatorLayout.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f20077r = l.f51869m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f20078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f20079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f20080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f20081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f20082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f20088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Rect f20089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f20090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.appcompat.widget.l f20091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final dc.b f20092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f20093q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f20097a;

        a(b bVar) {
            this.f20097a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.e.g
        public void a() {
            this.f20097a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.e.g
        public void b() {
            this.f20097a.a(FloatingActionButton.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements lc.b {
        c() {
        }

        @Override // lc.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f20089m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f20086j, i11 + FloatingActionButton.this.f20086j, i12 + FloatingActionButton.this.f20086j, i13 + FloatingActionButton.this.f20086j);
        }

        @Override // lc.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // lc.b
        public boolean c() {
            return FloatingActionButton.this.f20088l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f20100a;

        d(k kVar) {
            this.f20100a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.e.f
        public void a() {
            this.f20100a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.e.f
        public void b() {
            this.f20100a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f20100a.equals(this.f20100a);
        }

        public int hashCode() {
            return this.f20100a.hashCode();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20077r;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20089m = new Rect();
        this.f20090n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52176t3, i10, i11, new int[0]);
        this.f20078b = jc.c.a(context2, typedArrayI, m.f52206v3);
        this.f20079c = c0.n(typedArrayI.getInt(m.f52221w3, -1), null);
        this.f20082f = jc.c.a(context2, typedArrayI, m.G3);
        this.f20084h = typedArrayI.getInt(m.B3, -1);
        this.f20085i = typedArrayI.getDimensionPixelSize(m.A3, 0);
        this.f20083g = typedArrayI.getDimensionPixelSize(m.f52236x3, 0);
        float dimension = typedArrayI.getDimension(m.f52251y3, 0.0f);
        float dimension2 = typedArrayI.getDimension(m.D3, 0.0f);
        float dimension3 = typedArrayI.getDimension(m.F3, 0.0f);
        this.f20088l = typedArrayI.getBoolean(m.I3, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(sb.e.R0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(m.E3, 0));
        h hVarC = h.c(context2, typedArrayI, m.H3);
        h hVarC2 = h.c(context2, typedArrayI, m.C3);
        p pVarM = p.m(context2, attributeSet, i10, i11, p.f45657m).m();
        boolean z10 = typedArrayI.getBoolean(m.f52266z3, false);
        setEnabled(typedArrayI.getBoolean(m.f52191u3, true));
        typedArrayI.recycle();
        androidx.appcompat.widget.l lVar = new androidx.appcompat.widget.l(this);
        this.f20091o = lVar;
        lVar.g(attributeSet, i10);
        this.f20092p = new dc.b(this);
        getImpl().W(pVarM);
        getImpl().A(this.f20078b, this.f20079c, this.f20082f, this.f20083g);
        getImpl().S(dimensionPixelSize);
        getImpl().M(dimension);
        getImpl().P(dimension2);
        getImpl().T(dimension3);
        getImpl().X(hVarC);
        getImpl().O(hVarC2);
        getImpl().N(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private e getImpl() {
        if (this.f20093q == null) {
            this.f20093q = new e(this, new c());
        }
        return this.f20093q;
    }

    private int i(int i10) {
        int i11 = this.f20085i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(sb.e.f51694k) : resources.getDimensionPixelSize(sb.e.f51691j);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? i(1) : i(0);
    }

    private void j(Rect rect) {
        h(rect);
        int i10 = -this.f20093q.x();
        rect.inset(i10, i10);
    }

    private void o(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f20089m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f20080d;
        if (colorStateList == null) {
            f0.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f20081e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.h.e(colorForState, mode));
    }

    private void s() {
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    private e.g t(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // dc.a
    public boolean a() {
        return this.f20092p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(k kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f20078b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f20079c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().p();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().s();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().u();
    }

    public Drawable getContentBackground() {
        return getImpl().o();
    }

    public int getCustomSize() {
        return this.f20085i;
    }

    public int getExpandedComponentIdHint() {
        return this.f20092p.b();
    }

    public h getHideMotionSpec() {
        return getImpl().r();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f20082f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f20082f;
    }

    public p getShapeAppearanceModel() {
        return (p) g.g(getImpl().v());
    }

    public h getShowMotionSpec() {
        return getImpl().w();
    }

    public int getSize() {
        return this.f20084h;
    }

    int getSizeDimension() {
        return i(this.f20084h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f20080d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f20081e;
    }

    public boolean getUseCompatPadding() {
        return this.f20088l;
    }

    public void h(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        o(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public void k(b bVar) {
        l(bVar, true);
    }

    void l(b bVar, boolean z10) {
        getImpl().y(t(bVar), z10);
    }

    public boolean m() {
        return getImpl().B();
    }

    public boolean n() {
        return getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().F();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f20086j = (sizeDimension - this.f20087k) / 2;
        getImpl().c0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f20089m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oc.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oc.a aVar = (oc.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f20092p.d((Bundle) g.g((Bundle) aVar.f48507c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        oc.a aVar = new oc.a(parcelableOnSaveInstanceState);
        aVar.f48507c.put("expandableWidgetHelper", this.f20092p.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j(this.f20090n);
            if (!this.f20090n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q(b bVar) {
        r(bVar, true);
    }

    void r(b bVar, boolean z10) {
        getImpl().a0(t(bVar), z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f20078b != colorStateList) {
            this.f20078b = colorStateList;
            getImpl().K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f20079c != mode) {
            this.f20079c = mode;
            getImpl().L(mode);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        s();
    }

    public void setCompatElevation(float f10) {
        getImpl().M(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().P(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().T(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        s();
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f20085i) {
            this.f20085i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().d0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().q()) {
            getImpl().N(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f20092p.f(i10);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().O(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.d(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.f20080d != null) {
                p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f20091o.i(i10);
        p();
    }

    public void setMaxImageSize(int i10) {
        this.f20087k = i10;
        getImpl().R(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().V(z10);
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        getImpl().W(pVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().X(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.d(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f20085i = 0;
        if (i10 != this.f20084h) {
            this.f20084h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f20080d != colorStateList) {
            this.f20080d = colorStateList;
            p();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f20081e != mode) {
            this.f20081e = mode;
            p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f20088l != z10) {
            this.f20088l = z10;
            getImpl().E();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f20094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f20095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20096c;

        public BaseBehavior() {
            this.f20096c = true;
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return (this.f20096c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f20089m;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                q0.Y(floatingActionButton, i11);
            }
            if (i10 != 0) {
                q0.X(floatingActionButton, i10);
            }
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f20094a == null) {
                this.f20094a = new Rect();
            }
            Rect rect = this.f20094a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.l(this.f20095b, false);
                return true;
            }
            floatingActionButton.r(this.f20095b, false);
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.l(this.f20095b, false);
                return true;
            }
            floatingActionButton.r(this.f20095b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f20089m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            L(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f3179h == 0) {
                fVar.f3179h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.J3);
            this.f20096c = typedArrayObtainStyledAttributes.getBoolean(m.K3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f20082f != colorStateList) {
            this.f20082f = colorStateList;
            getImpl().U(this.f20082f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }
}
