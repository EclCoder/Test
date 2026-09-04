package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20263d;

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20262c = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sb.m.R3, 0, 0);
        this.f20260a = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.T3, 0);
        this.f20261b = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.S3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(sb.g.f51772m0);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f20262c;
    }

    protected int getItemSpacing() {
        return this.f20261b;
    }

    protected int getLineSpacing() {
        return this.f20260a;
    }

    protected int getRowCount() {
        return this.f20263d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f20263d = 0;
            return;
        }
        boolean z11 = true;
        this.f20263d = 1;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = 0;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        while (i14 < getChildCount()) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(sb.g.f51772m0, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i16 = i12 - i10;
                int i17 = i16 - paddingLeft;
                if (!this.f20262c && measuredWidth2 > i17) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i15 = paddingTop + this.f20260a;
                    this.f20263d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(sb.g.f51772m0, Integer.valueOf(this.f20263d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z12) {
                    childAt.layout(i16 - measuredWidth2, i15, (i16 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i15, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f20261b;
                paddingTop = measuredHeight;
            }
            i14++;
            z11 = z11;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f20260a + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f20261b;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f20261b = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f20260a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f20262c = z10;
    }
}
