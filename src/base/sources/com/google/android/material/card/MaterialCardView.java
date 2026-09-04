package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.z;
import mc.j;
import mc.p;
import mc.s;
import sb.c;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialCardView extends CardView implements Checkable, s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f19666n = {R.attr.state_checkable};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f19667o = {R.attr.state_checked};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f19668p = {c.f51621m0};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f19669q = {R.attr.state_hovered};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f19670r = l.J;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f19671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19674m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.E);
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f19671j.j();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f19671j.k().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f19671j.l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f19671j.m();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f19671j.n();
    }

    public int getCheckedIconGravity() {
        return this.f19671j.o();
    }

    public int getCheckedIconMargin() {
        return this.f19671j.p();
    }

    public int getCheckedIconSize() {
        return this.f19671j.q();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f19671j.r();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f19671j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f19671j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f19671j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f19671j.C().top;
    }

    public float getProgress() {
        return this.f19671j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f19671j.t();
    }

    public ColorStateList getRippleColor() {
        return this.f19671j.x();
    }

    public p getShapeAppearanceModel() {
        return this.f19671j.y().e();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f19671j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f19671j.A();
    }

    public int getStrokeWidth() {
        return this.f19671j.B();
    }

    public boolean h() {
        b bVar = this.f19671j;
        return bVar != null && bVar.F();
    }

    public boolean i() {
        return this.f19674m;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f19673l;
    }

    void j(int i10, int i11, int i12, int i13) {
        super.e(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19671j.f0();
        j.f(this, this.f19671j.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 8);
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f19666n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f19667o);
        }
        if (i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f19668p);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f19669q);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f19671j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f19672k) {
            if (!this.f19671j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f19671j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f19671j.L(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f19671j.h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f19671j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f19671j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f19673l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f19671j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f19671j.o() != i10) {
            this.f19671j.R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f19671j.S(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f19671j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f19671j.Q(i.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f19671j.T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f19671j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f19671j.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f19671j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f19674m != z10) {
            this.f19674m = z10;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f19671j.j0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f19671j.j0();
        this.f19671j.g0();
    }

    public void setProgress(float f10) {
        this.f19671j.W(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f19671j.V(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f19671j.X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f19671j.X(i.a.a(getContext(), i10));
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        setClipToOutline(pVar.E(getBoundsAsRectF()));
        this.f19671j.Y(pVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f19671j.a0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f19671j.j0();
        this.f19671j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.f19673l = !this.f19673l;
            refreshDrawableState();
            g();
            this.f19671j.P(this.f19673l, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19670r;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19673l = false;
        this.f19674m = false;
        this.f19672k = true;
        TypedArray typedArrayI = z.i(getContext(), attributeSet, m.f52029j6, i10, i11, new int[0]);
        b bVar = new b(this, attributeSet, i10, i11);
        this.f19671j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayI);
        typedArrayI.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f19671j.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f19671j.Z(colorStateList);
        invalidate();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
