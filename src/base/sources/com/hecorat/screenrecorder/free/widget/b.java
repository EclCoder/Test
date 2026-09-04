package com.hecorat.screenrecorder.free.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f23742b = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f23743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f23744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f23747g;

    public b(int i10) {
        Paint paint = new Paint();
        this.f23743c = paint;
        Paint paint2 = new Paint();
        this.f23744d = paint2;
        this.f23741a = i10;
        paint.setColor(-1);
        paint2.setColor(-3421237);
    }

    private void a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f23747g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f23747g);
        Rect rect = new Rect();
        boolean z10 = true;
        for (int i10 = 0; i10 <= this.f23746f; i10++) {
            boolean z11 = z10;
            for (int i11 = 0; i11 <= this.f23745e; i11++) {
                int i12 = this.f23741a;
                int i13 = i10 * i12;
                rect.top = i13;
                int i14 = i11 * i12;
                rect.left = i14;
                rect.bottom = i13 + i12;
                rect.right = i14 + i12;
                canvas.drawRect(rect, z11 ? this.f23743c : this.f23744d);
                z11 = !z11;
            }
            z10 = !z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f23747g, (Rect) null, getBounds(), this.f23742b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f23745e = (int) Math.ceil(rect.width() / this.f23741a);
        this.f23746f = (int) Math.ceil(iHeight / this.f23741a);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
