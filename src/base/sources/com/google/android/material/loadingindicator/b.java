package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.g;
import sb.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LoadingIndicatorSpec f20507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f20508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f20509e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f20511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f20512h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ic.a f20505a = new ic.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Paint f20510f = new Paint();

    b(Context context, LoadingIndicatorSpec loadingIndicatorSpec, c cVar, a aVar) {
        this.f20506b = context;
        this.f20507c = loadingIndicatorSpec;
        this.f20508d = cVar;
        this.f20509e = aVar;
        aVar.j(this);
        setAlpha(255);
    }

    public static b a(Context context, LoadingIndicatorSpec loadingIndicatorSpec) {
        b bVar = new b(context, loadingIndicatorSpec, new c(loadingIndicatorSpec), new a(loadingIndicatorSpec));
        bVar.e(g.b(context.getResources(), f.f51736c, null));
        return bVar;
    }

    private boolean d() {
        ic.a aVar = this.f20505a;
        return aVar != null && aVar.a(this.f20506b.getContentResolver()) == 0.0f;
    }

    a b() {
        return this.f20509e;
    }

    c c() {
        return this.f20508d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (d() && (drawable = this.f20512h) != null) {
                drawable.setBounds(bounds);
                this.f20512h.setTint(this.f20507c.f20492e[0]);
                this.f20512h.draw(canvas);
            } else {
                canvas.save();
                this.f20508d.a(canvas, bounds);
                this.f20508d.b(canvas, this.f20510f, this.f20507c.f20493f, getAlpha());
                this.f20508d.c(canvas, this.f20510f, this.f20509e.f20503h, getAlpha());
                canvas.restore();
            }
        }
    }

    public void e(Drawable drawable) {
        this.f20512h = drawable;
    }

    public boolean f(boolean z10, boolean z11, boolean z12) {
        boolean visible = super.setVisible(z10, z11);
        this.f20509e.e();
        if (z10 && z12 && !d()) {
            this.f20509e.n();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20511g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20508d.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20508d.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f20511g != i10) {
            this.f20511g = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20510f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return f(z10, z11, z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
