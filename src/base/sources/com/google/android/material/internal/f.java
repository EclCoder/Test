package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f20373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f20374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f20375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20376d;

    public f(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new b();
        this.f20373a = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new b();
        this.f20374b = drawableMutate2;
        int iF = drawable != null ? f0.a.f(drawable) : 3;
        int iF2 = drawable2 != null ? f0.a.f(drawable2) : 3;
        f0.a.m(drawableMutate, iF);
        f0.a.m(drawableMutate2, iF2);
        drawableMutate2.setAlpha(0);
        this.f20375c = new float[2];
    }

    public void a(float f10) {
        if (this.f20376d != f10) {
            this.f20376d = f10;
            h.a(f10, this.f20375c);
            this.f20373a.setAlpha((int) (this.f20375c[0] * 255.0f));
            this.f20374b.setAlpha((int) (this.f20375c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f20373a.draw(canvas);
        this.f20374b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f20373a.getIntrinsicHeight(), this.f20374b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f20373a.getIntrinsicWidth(), this.f20374b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f20373a.getMinimumHeight(), this.f20374b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f20373a.getMinimumWidth(), this.f20374b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f20373a.isStateful() || this.f20374b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f20376d <= 0.5f) {
            this.f20373a.setAlpha(i10);
            this.f20374b.setAlpha(0);
        } else {
            this.f20373a.setAlpha(0);
            this.f20374b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f20373a.setBounds(i10, i11, i12, i13);
        this.f20374b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20373a.setColorFilter(colorFilter);
        this.f20374b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f20373a.setState(iArr) || this.f20374b.setState(iArr);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends Drawable {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
