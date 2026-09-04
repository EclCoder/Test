package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.o0;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import pc.a;
import sb.c;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f20521k0 = l.f51876t;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f20522l0 = {c.f51633s0};
    private Drawable U;
    private Drawable V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Drawable f20523a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Drawable f20524b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f20525c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private ColorStateList f20526d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private PorterDuff.Mode f20527e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f20528f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f20529g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private PorterDuff.Mode f20530h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int[] f20531i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int[] f20532j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20521k0;
        super(a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.W = -1;
        Context context2 = getContext();
        this.U = super.getThumbDrawable();
        this.f20525c0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f20523a0 = super.getTrackDrawable();
        this.f20528f0 = super.getTrackTintList();
        super.setTrackTintList(null);
        o0 o0VarJ = z.j(context2, attributeSet, m.Y6, i10, i11, new int[0]);
        this.V = o0VarJ.g(m.Z6);
        this.W = o0VarJ.f(m.f51891a7, -1);
        this.f20526d0 = o0VarJ.c(m.f51907b7);
        int iK = o0VarJ.k(m.f51923c7, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f20527e0 = c0.n(iK, mode);
        this.f20524b0 = o0VarJ.g(m.f51939d7);
        this.f20529g0 = o0VarJ.c(m.f51955e7);
        this.f20530h0 = c0.n(o0VarJ.k(m.f51970f7, -1), mode);
        o0VarJ.x();
        setEnforceSwitchWidth(false);
        r();
        s();
    }

    private void r() {
        this.U = com.google.android.material.drawable.c.c(this.U, this.f20525c0, getThumbTintMode());
        this.V = com.google.android.material.drawable.c.c(this.V, this.f20526d0, this.f20527e0);
        u();
        Drawable drawable = this.U;
        Drawable drawable2 = this.V;
        int i10 = this.W;
        super.setThumbDrawable(com.google.android.material.drawable.c.b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    private void s() {
        this.f20523a0 = com.google.android.material.drawable.c.c(this.f20523a0, this.f20528f0, getTrackTintMode());
        this.f20524b0 = com.google.android.material.drawable.c.c(this.f20524b0, this.f20529g0, this.f20530h0);
        u();
        Drawable layerDrawable = this.f20523a0;
        if (layerDrawable != null && this.f20524b0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f20523a0, this.f20524b0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f20524b0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void t(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(e0.a.c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    private void u() {
        if (this.f20525c0 == null && this.f20526d0 == null && this.f20528f0 == null && this.f20529g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f20525c0;
        if (colorStateList != null) {
            t(this.U, colorStateList, this.f20531i0, this.f20532j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f20526d0;
        if (colorStateList2 != null) {
            t(this.V, colorStateList2, this.f20531i0, this.f20532j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f20528f0;
        if (colorStateList3 != null) {
            t(this.f20523a0, colorStateList3, this.f20531i0, this.f20532j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f20529g0;
        if (colorStateList4 != null) {
            t(this.f20524b0, colorStateList4, this.f20531i0, this.f20532j0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.U;
    }

    public Drawable getThumbIconDrawable() {
        return this.V;
    }

    public int getThumbIconSize() {
        return this.W;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f20526d0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f20527e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f20525c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f20524b0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f20529g0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f20530h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f20523a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f20528f0;
    }

    @Override // android.view.View
    public void invalidate() {
        u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.V != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20522l0);
        }
        this.f20531i0 = com.google.android.material.drawable.c.j(iArrOnCreateDrawableState);
        this.f20532j0 = com.google.android.material.drawable.c.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FocusRingDrawable focusRingDrawableM;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f20523a0 == null || (focusRingDrawableM = FocusRingDrawable.m(getBackground())) == null) {
            return;
        }
        focusRingDrawableM.mutate();
        focusRingDrawableM.C(this.f20523a0.getBounds());
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.U = drawable;
        r();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.V = drawable;
        r();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(i.a.b(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.W != i10) {
            this.W = i10;
            r();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f20526d0 = colorStateList;
        r();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f20527e0 = mode;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f20525c0 = colorStateList;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f20524b0 = drawable;
        s();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(i.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f20529g0 = colorStateList;
        s();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f20530h0 = mode;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f20523a0 = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f20528f0 = colorStateList;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        s();
    }
}
