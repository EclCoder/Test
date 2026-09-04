package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.google.android.material.internal.z;
import mc.i;
import sb.c;
import sb.e;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20021f = l.U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f20022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20026e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.G);
    }

    public int getDividerColor() {
        return this.f20024c;
    }

    public int getDividerInsetEnd() {
        return this.f20026e;
    }

    public int getDividerInsetStart() {
        return this.f20025d;
    }

    public int getDividerThickness() {
        return this.f20023b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f20026e : this.f20025d;
        if (z10) {
            width = getWidth();
            i10 = this.f20025d;
        } else {
            width = getWidth();
            i10 = this.f20026e;
        }
        this.f20022a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f20022a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f20023b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f20024c != i10) {
            this.f20024c = i10;
            this.f20022a.l0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(a.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f20026e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f20025d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f20023b != i10) {
            this.f20023b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20021f;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f20022a = new i();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.I6, i10, i11, new int[0]);
        this.f20023b = typedArrayI.getDimensionPixelSize(m.M6, getResources().getDimensionPixelSize(e.f51689i0));
        this.f20025d = typedArrayI.getDimensionPixelOffset(m.L6, 0);
        this.f20026e = typedArrayI.getDimensionPixelOffset(m.K6, 0);
        setDividerColor(jc.c.a(context2, typedArrayI, m.J6).getDefaultColor());
        typedArrayI.recycle();
    }
}
