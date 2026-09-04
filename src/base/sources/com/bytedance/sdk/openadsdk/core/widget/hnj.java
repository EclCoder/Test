package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.openadsdk.core.dkl.gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14269hn;
    private int hnj;

    public hnj(Context context) {
        super(context);
        this.hnj = 0;
        this.f14269hn = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.hnj == 0) {
            this.hnj = getWidth();
        }
        if (this.f14269hn == 0) {
            this.f14269hn = getHeight();
        }
        int i10 = this.hnj;
        int i11 = this.f14269hn;
        if (i10 >= i11) {
            i10 = i11;
        }
        return i10 / 2;
    }

    private boolean hn() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            return (getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    private boolean hnj() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapHnj;
        if (hnj()) {
            return;
        }
        measure(0, 0);
        if (hn()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        try {
            bitmapHnj = hnj(bitmapCopy, radius);
        } catch (Throwable unused2) {
            bitmapHnj = null;
        }
        if (bitmapHnj == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapHnj, (this.hnj / 2) - radius, (this.f14269hn / 2) - radius, (Paint) null);
        }
    }

    private Bitmap hnj(Bitmap bitmap, int i10) {
        Bitmap bitmapCreateBitmap;
        int i11 = i10 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            bitmapCreateBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i11) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }
}
