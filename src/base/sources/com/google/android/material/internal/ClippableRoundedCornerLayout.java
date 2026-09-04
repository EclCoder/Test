package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f20259b;

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20259b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void a() {
        this.f20258a = null;
        this.f20259b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void b(float f10, float f11, float f12, float f13, float[] fArr) {
        d(new RectF(f10, f11, f12, f13), fArr);
    }

    public void c(Rect rect, float[] fArr) {
        b(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void d(RectF rectF, float[] fArr) {
        if (this.f20258a == null) {
            this.f20258a = new Path();
        }
        this.f20259b = fArr;
        this.f20258a.reset();
        this.f20258a.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.f20258a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f20258a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f20258a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void e(float[] fArr) {
        b(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public float[] getCornerRadii() {
        return this.f20259b;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20259b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
