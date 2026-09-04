package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Drawable f20276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Rect f20277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f20278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20282g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n0.b0 {
        a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f20277b == null) {
                scrimInsetsFrameLayout.f20277b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f20277b.set(k1Var.l(), k1Var.n(), k1Var.m(), k1Var.k());
            ScrimInsetsFrameLayout.this.e(k1Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!k1Var.o() || ScrimInsetsFrameLayout.this.f20276a == null);
            ScrimInsetsFrameLayout.this.postInvalidateOnAnimation();
            return k1Var.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20278c = new Rect();
        this.f20279d = true;
        this.f20280e = true;
        this.f20281f = true;
        this.f20282g = true;
        TypedArray typedArrayI = z.i(context, attributeSet, sb.m.f52197u9, i10, sb.l.f51871o, new int[0]);
        this.f20276a = typedArrayI.getDrawable(sb.m.f52212v9);
        typedArrayI.recycle();
        setWillNotDraw(true);
        q0.w0(this, new a());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f20277b == null || this.f20276a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f20279d) {
            this.f20278c.set(0, 0, width, this.f20277b.top);
            this.f20276a.setBounds(this.f20278c);
            this.f20276a.draw(canvas);
        }
        if (this.f20280e) {
            this.f20278c.set(0, height - this.f20277b.bottom, width, height);
            this.f20276a.setBounds(this.f20278c);
            this.f20276a.draw(canvas);
        }
        if (this.f20281f) {
            Rect rect = this.f20278c;
            Rect rect2 = this.f20277b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f20276a.setBounds(this.f20278c);
            this.f20276a.draw(canvas);
        }
        if (this.f20282g) {
            Rect rect3 = this.f20278c;
            Rect rect4 = this.f20277b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f20276a.setBounds(this.f20278c);
            this.f20276a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f20276a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f20276a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f20280e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f20281f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f20282g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f20279d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f20276a = drawable;
    }

    protected void e(k1 k1Var) {
    }
}
