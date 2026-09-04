package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Bitmap f51333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f51334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f51335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f51336d;

    public a(Bitmap bitmap) {
        this.f51333a = bitmap;
        if (bitmap != null) {
            this.f51335c = bitmap.getWidth();
            this.f51336d = this.f51333a.getHeight();
        } else {
            this.f51335c = 0;
            this.f51336d = 0;
        }
        Paint paint = new Paint();
        this.f51334b = paint;
        paint.setDither(true);
        this.f51334b.setFilterBitmap(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f51333a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            canvas.drawBitmap(this.f51333a, 0.0f, 0.0f, this.f51334b);
        } else {
            canvas.drawBitmap(this.f51333a, (Rect) null, bounds, this.f51334b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f51336d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f51335c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f51336d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f51335c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f51334b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f51334b.setColorFilter(colorFilter);
    }
}
