package com.bytedance.sdk.openadsdk.core.widget;

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
import b6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends com.bytedance.sdk.openadsdk.core.dkl.gjv {
    private BitmapShader dkl;
    private final Matrix gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14302hn;
    private final Paint hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final RectF f14303sk;

    public uua(Context context) {
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
        Bitmap bitmapHnj;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.dkl == null && (bitmapHnj = hnj(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.dkl = new BitmapShader(bitmapHnj, tileMode, tileMode);
            float fMax = (bitmapHnj.getWidth() == getWidth() && bitmapHnj.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapHnj.getWidth(), (getHeight() * 1.0f) / bitmapHnj.getHeight());
            this.gjv.setScale(fMax, fMax);
            this.dkl.setLocalMatrix(this.gjv);
        }
        BitmapShader bitmapShader = this.dkl;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.hnj.setShader(bitmapShader);
            canvas.drawRoundRect(this.f14303sk, this.f14302hn, this.qor, this.hnj);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14303sk.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.f14302hn = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.qor = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.dkl = null;
    }

    public uua(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uua(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14302hn = 25;
        this.qor = 25;
        this.f14303sk = new RectF();
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.gjv = new Matrix();
    }
}
