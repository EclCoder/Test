package com.mbridge.msdk.videocommon.view;

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
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.MBImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class RoundImageView extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f35226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f35228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BitmapShader f35229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f35231j;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35228g = new Matrix();
        Paint paint = new Paint();
        this.f35226e = paint;
        paint.setAntiAlias(true);
        this.f35225d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f35224c = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("View", th2.getMessage());
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f35229h = new BitmapShader(bitmapA, tileMode, tileMode);
            int i10 = this.f35224c;
            float fMax = 1.0f;
            if (i10 == 0) {
                fMax = (this.f35230i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i10 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.f35228g.setScale(fMax, fMax);
            this.f35229h.setLocalMatrix(this.f35228g);
            this.f35226e.setShader(this.f35229h);
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f35224c != 1) {
                float f10 = this.f35227f;
                canvas.drawCircle(f10, f10, f10, this.f35226e);
            } else {
                RectF rectF = this.f35231j;
                float f11 = this.f35225d;
                canvas.drawRoundRect(rectF, f11, f11, this.f35226e);
            }
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f35224c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f35230i = iMin;
            this.f35227f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f35224c = bundle.getInt("state_type");
        this.f35225d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f35224c);
        bundle.putInt("state_border_radius", this.f35225d);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f35224c == 1) {
            this.f35231j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = v0.a(getContext(), i10);
        if (this.f35225d != iA) {
            this.f35225d = iA;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f35224c != i10) {
            this.f35224c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f35224c = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35228g = new Matrix();
        Paint paint = new Paint();
        this.f35226e = paint;
        paint.setAntiAlias(true);
        this.f35225d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f35224c = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f35228g = new Matrix();
        Paint paint = new Paint();
        this.f35226e = paint;
        paint.setAntiAlias(true);
        this.f35225d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f35224c = 1;
    }
}
