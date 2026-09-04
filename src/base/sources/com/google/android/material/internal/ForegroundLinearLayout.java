package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f20264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f20265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f20266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f20268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f20269u;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20265q = new Rect();
        this.f20266r = new Rect();
        this.f20267s = Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE;
        this.f20268t = true;
        this.f20269u = false;
        TypedArray typedArrayI = z.i(context, attributeSet, sb.m.f51952e4, i10, 0, new int[0]);
        this.f20267s = typedArrayI.getInt(sb.m.f51982g4, this.f20267s);
        Drawable drawable = typedArrayI.getDrawable(sb.m.f51967f4);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f20268t = typedArrayI.getBoolean(sb.m.f51997h4, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f20264p;
        if (drawable != null) {
            if (this.f20269u) {
                this.f20269u = false;
                Rect rect = this.f20265q;
                Rect rect2 = this.f20266r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f20268t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f20267s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f20264p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20264p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f20264p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f20264p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f20267s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20264p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f20269u = z10 | this.f20269u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f20269u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f20264p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f20264p);
            }
            this.f20264p = drawable;
            this.f20269u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f20267s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f20267s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) == 0) {
                i10 |= 48;
            }
            this.f20267s = i10;
            if (i10 == 119 && this.f20264p != null) {
                this.f20264p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20264p;
    }
}
