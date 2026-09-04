package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends GradientDrawable {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Paint f12539hn;
    protected Path hnj;

    public hn() {
        this.hnj = new Path();
        Paint paint = new Paint(1);
        this.f12539hn = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.hnj;
        if (path == null || path.isEmpty()) {
            hnj(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f12539hn, 31);
        hnj(canvas);
        this.f12539hn.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.hnj, this.f12539hn);
        this.f12539hn.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void hnj(Canvas canvas) {
        super.draw(canvas);
    }

    public void hnj(int i10, int i11, int i12, int i13) {
        this.hnj.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public hn(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.hnj = new Path();
        Paint paint = new Paint(1);
        this.f12539hn = paint;
        paint.setColor(-1);
    }
}
