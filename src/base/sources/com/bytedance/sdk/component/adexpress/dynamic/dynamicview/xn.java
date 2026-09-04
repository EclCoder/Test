package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn extends Drawable {
    private RectF gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12557hn;
    private Paint hnj;
    private int qor;

    public xn(int i10, int i11) {
        this.qor = i10;
        this.f12557hn = i11;
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setColor(0);
        this.hnj.setAntiAlias(true);
        this.hnj.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.hnj.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.gjv;
        int i10 = this.qor;
        canvas.drawRoundRect(rectF, i10, i10, this.hnj);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.hnj.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.f12557hn;
        this.gjv = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.hnj.setColorFilter(colorFilter);
    }
}
