package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.z;
import mc.i;
import mc.j;
import mc.p;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f19300c0 = l.f51856a0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f19301d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer U;
    private boolean V;
    private boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ImageView.ScaleType f19302a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Boolean f19303b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.P);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context, p pVar) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.c.g(background);
        if (colorStateListValueOf != null) {
            i iVar = new i(pVar);
            iVar.l0(colorStateListValueOf);
            iVar.Y(context);
            iVar.k0(getElevation());
            setBackground(iVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.V || this.W) {
            TextView textViewG = a0.g(this);
            TextView textViewE = a0.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair pairS = S(textViewG, textViewE);
            if (this.V && textViewG != null) {
                U(textViewG, pairS);
            }
            if (!this.W || textViewE == null) {
                return;
            }
            U(textViewE, pairS);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable drawableR = f0.a.r(drawable.mutate());
        drawableR.setTint(this.U.intValue());
        return drawableR;
    }

    private void X() {
        ImageView imageViewC = a0.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f19303b0;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f19302a0;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f19302a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        j.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f19303b0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f19303b0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f19302a0 != scaleType) {
            this.f19302a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19300c0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52150r7, i10, i11, new int[0]);
        int i12 = m.f52195u7;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.V = typedArrayI.getBoolean(m.f52225w7, false);
        this.W = typedArrayI.getBoolean(m.f52210v7, false);
        int i13 = typedArrayI.getInt(m.f52180t7, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f19301d0;
            if (i13 < scaleTypeArr.length) {
                this.f19302a0 = scaleTypeArr[i13];
            }
        }
        int i14 = m.f52165s7;
        if (typedArrayI.hasValue(i14)) {
            this.f19303b0 = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        T(context2, p.k(context2, attributeSet, i10, i11).m());
    }
}
