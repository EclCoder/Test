package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.internal.z;
import h.a;
import sb.c;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f20869g = l.O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f20870h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f20871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20872f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.H);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f20871e == null) {
            int iD = ac.a.d(this, a.f39866s);
            int iD2 = ac.a.d(this, c.f51614j);
            int iD3 = ac.a.d(this, c.f51620m);
            int[][] iArr = f20870h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ac.a.j(iD3, iD, 1.0f);
            iArr2[1] = ac.a.j(iD3, iD2, 0.54f);
            iArr2[2] = ac.a.j(iD3, iD2, 0.38f);
            iArr2[3] = ac.a.j(iD3, iD2, 0.38f);
            this.f20871e = new ColorStateList(iArr, iArr2);
        }
        return this.f20871e;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20872f && androidx.core.widget.c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f20872f = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20869g;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.O6, i10, i11, new int[0]);
        int i12 = m.P6;
        if (typedArrayI.hasValue(i12)) {
            androidx.core.widget.c.d(this, jc.c.a(context2, typedArrayI, i12));
        }
        int i13 = m.Q6;
        if (typedArrayI.hasValue(i13)) {
            setRippleColor(jc.c.a(context2, typedArrayI, i13));
        }
        this.f20872f = typedArrayI.getBoolean(m.R6, false);
        typedArrayI.recycle();
    }
}
