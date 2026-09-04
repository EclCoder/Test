package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import b6.a;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dkl.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Cdo extends ImageView {
    private Matrix gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12472hn;
    private Paint hnj;
    private int qor;

    public Cdo(Context context) {
        this(context, null);
    }

    private Bitmap hnj(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapHnj = hnj(drawable);
        if (bitmapHnj == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapHnj, tileMode, tileMode);
        float fMax = (bitmapHnj.getWidth() == getWidth() && bitmapHnj.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapHnj.getWidth(), (getHeight() * 1.0f) / bitmapHnj.getHeight());
        this.gjv.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.gjv);
        this.hnj.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f12472hn, this.qor, this.hnj);
    }

    public void setXRound(int i10) {
        this.f12472hn = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.qor = i10;
        postInvalidate();
    }

    public Cdo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Cdo(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12472hn = 25;
        this.qor = 25;
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setAntiAlias(true);
        this.hnj.setFilterBitmap(true);
        this.gjv = new Matrix();
    }
}
