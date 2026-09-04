package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.hecorat.screenrecorder.free.R;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CircularProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f23582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f23583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f23584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Paint f23585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f23586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f23587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final RectF f23588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f23589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f23590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f23591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f23592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f23593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f23594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f23595z;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressBarStyle);
    }

    private void a(int i10, int i11) {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f23571b, getLayoutDirection());
        int i12 = absoluteGravity & 7;
        if (i12 == 3) {
            this.f23572c = 0;
        } else if (i12 != 5) {
            this.f23572c = i10 / 2;
        } else {
            this.f23572c = i10;
        }
        int i13 = absoluteGravity & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i13 == 48) {
            this.f23576g = 0;
        } else if (i13 != 80) {
            this.f23576g = i11 / 2;
        } else {
            this.f23576g = i11;
        }
    }

    private void c() {
        Paint paint = new Paint(1);
        this.f23586q = paint;
        paint.setColor(this.f23573d);
        this.f23586q.setStyle(Paint.Style.STROKE);
        this.f23586q.setStrokeWidth(this.f23570a);
        invalidate();
    }

    private void d() {
        Paint paint = new Paint(1);
        this.f23582m = paint;
        paint.setColor(this.f23573d);
        this.f23582m.setStyle(Paint.Style.STROKE);
        this.f23582m.setStrokeWidth(this.f23570a / 2);
        invalidate();
    }

    private void e() {
        Paint paint = new Paint(1);
        this.f23584o = paint;
        paint.setColor(this.f23574e);
        this.f23584o.setStyle(Paint.Style.STROKE);
        this.f23584o.setStrokeWidth(this.f23570a);
        Paint paint2 = new Paint(1);
        this.f23585p = paint2;
        paint2.setColor(this.f23574e);
        this.f23585p.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f23585p.setStrokeWidth(this.f23570a);
        invalidate();
    }

    private float getCurrentRotation() {
        return this.f23590u * 360.0f;
    }

    private float getMarkerRotation() {
        return this.f23589t * 360.0f;
    }

    public boolean b() {
        return this.f23578i;
    }

    public int getCircleStrokeWidth() {
        return this.f23570a;
    }

    public float getMarkerProgress() {
        return this.f23589t;
    }

    public float getProgress() {
        return this.f23590u;
    }

    public int getProgressColor() {
        return this.f23574e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.translate(this.f23594y, this.f23595z);
        float currentRotation = getCurrentRotation();
        if (!this.f23580k) {
            canvas.drawArc(this.f23587r, 270.0f, -(360.0f - currentRotation), false, this.f23586q);
        }
        canvas.drawArc(this.f23587r, 270.0f, this.f23580k ? 360.0f : currentRotation, false, this.f23584o);
        if (this.f23578i) {
            float markerRotation = getMarkerRotation();
            canvas.save();
            canvas.rotate(markerRotation - 90.0f);
            float f10 = this.f23592w;
            int i10 = this.f23575f;
            float f11 = this.f23593x;
            canvas.drawLine((float) (((double) f10) + (((double) (i10 / 2)) * 1.4d)), f11, (float) (((double) f10) - (((double) (i10 / 2)) * 1.4d)), f11, this.f23582m);
            canvas.restore();
        }
        if (this.f23579j) {
            canvas.save();
            canvas.rotate(currentRotation - 90.0f);
            canvas.rotate(45.0f, this.f23592w, this.f23593x);
            RectF rectF = this.f23588s;
            float f12 = this.f23592w;
            int i11 = this.f23575f;
            rectF.left = f12 - (i11 / 3);
            rectF.right = f12 + (i11 / 3);
            float f13 = this.f23593x;
            rectF.top = f13 - (i11 / 3);
            rectF.bottom = f13 + (i11 / 3);
            canvas.drawRect(rectF, this.f23585p);
            canvas.restore();
        }
        if (this.f23581l) {
            String str = ((int) (this.f23590u * 100.0f)) + "%";
            this.f23583n.setTextSize(100.0f);
            this.f23583n.setColor(-1);
            canvas.drawText(str, -(this.f23583n.measureText(str) / 2.0f), ((this.f23583n.descent() - this.f23583n.ascent()) / 2.0f) - this.f23583n.descent(), this.f23583n);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        float f12;
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), i11);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), i10);
        if (i11 == 0) {
            a(0, 0);
            defaultSize = defaultSize2;
        } else if (i10 == 0) {
            a(0, 0);
        } else {
            int iMin = Math.min(defaultSize2, defaultSize);
            a(defaultSize2 - iMin, defaultSize - iMin);
            defaultSize = iMin;
        }
        setMeasuredDimension(defaultSize, defaultSize);
        float f13 = defaultSize * 0.5f;
        if (!this.f23579j) {
            if (b()) {
                f11 = this.f23570a;
                f12 = 1.4f;
            } else {
                f10 = this.f23570a / 2.0f;
            }
            float f14 = (f13 - f10) - 0.5f;
            this.f23591v = f14;
            this.f23587r.set(-f14, -f14, f14, f14);
            this.f23592w = (float) (((double) this.f23591v) * Math.cos(0.0d));
            this.f23593x = (float) (((double) this.f23591v) * Math.sin(0.0d));
            this.f23594y = this.f23572c + f13;
            this.f23595z = f13 + this.f23576g;
        }
        f11 = this.f23575f;
        f12 = 0.8333333f;
        f10 = f11 * f12;
        float f15 = (f13 - f10) - 0.5f;
        this.f23591v = f15;
        this.f23587r.set(-f15, -f15, f15, f15);
        this.f23592w = (float) (((double) this.f23591v) * Math.cos(0.0d));
        this.f23593x = (float) (((double) this.f23591v) * Math.sin(0.0d));
        this.f23594y = this.f23572c + f13;
        this.f23595z = f13 + this.f23576g;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setProgress(bundle.getFloat(NotificationCompat.CATEGORY_PROGRESS));
        setMarkerProgress(bundle.getFloat("marker_progress"));
        int i10 = bundle.getInt("progress_color");
        if (i10 != this.f23574e) {
            this.f23574e = i10;
            e();
        }
        int i11 = bundle.getInt("progress_background_color");
        if (i11 != this.f23573d) {
            this.f23573d = i11;
            c();
        }
        this.f23579j = bundle.getBoolean("thumb_visible");
        this.f23578i = bundle.getBoolean("marker_visible");
        super.onRestoreInstanceState(bundle.getParcelable("saved_state"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_state", super.onSaveInstanceState());
        bundle.putFloat(NotificationCompat.CATEGORY_PROGRESS, this.f23590u);
        bundle.putFloat("marker_progress", this.f23589t);
        bundle.putInt("progress_color", this.f23574e);
        bundle.putInt("progress_background_color", this.f23573d);
        bundle.putBoolean("thumb_visible", this.f23579j);
        bundle.putBoolean("marker_visible", this.f23578i);
        return bundle;
    }

    public void setMarkerEnabled(boolean z10) {
        this.f23578i = z10;
    }

    public void setMarkerProgress(float f10) {
        this.f23578i = true;
        this.f23589t = f10;
    }

    public void setProgress(float f10) {
        if (f10 == this.f23590u) {
            return;
        }
        if (f10 == 1.0f) {
            this.f23580k = false;
            this.f23590u = 1.0f;
        } else {
            this.f23580k = f10 >= 1.0f;
            this.f23590u = f10 % 1.0f;
        }
        if (this.f23577h) {
            return;
        }
        invalidate();
    }

    public void setProgressBackgroundColor(int i10) {
        this.f23573d = i10;
        d();
        c();
    }

    public void setProgressColor(int i10) {
        this.f23574e = i10;
        e();
    }

    public void setTextEnabled(boolean z10) {
        this.f23581l = z10;
    }

    public void setThumbEnabled(boolean z10) {
        this.f23579j = z10;
    }

    public void setWheelSize(int i10) {
        this.f23570a = i10;
        c();
        d();
        e();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23570a = 10;
        this.f23571b = 17;
        this.f23572c = 0;
        this.f23575f = 20;
        this.f23576g = 0;
        this.f23577h = true;
        this.f23578i = false;
        this.f23579j = true;
        this.f23580k = false;
        this.f23581l = false;
        this.f23583n = new Paint();
        this.f23585p = new Paint();
        this.f23586q = new Paint();
        this.f23587r = new RectF();
        this.f23588s = new RectF();
        this.f23589t = 0.0f;
        this.f23590u = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ef.d.P, i10, 0);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                setProgressColor(typedArrayObtainStyledAttributes.getColor(5, -16711681));
                setProgressBackgroundColor(typedArrayObtainStyledAttributes.getColor(4, -16711936));
                setProgress(typedArrayObtainStyledAttributes.getFloat(3, 0.0f));
                setMarkerProgress(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
                setWheelSize((int) typedArrayObtainStyledAttributes.getDimension(6, 10.0f));
                setThumbEnabled(typedArrayObtainStyledAttributes.getBoolean(8, true));
                setMarkerEnabled(typedArrayObtainStyledAttributes.getBoolean(2, true));
                setTextEnabled(typedArrayObtainStyledAttributes.getBoolean(7, false));
                this.f23571b = typedArrayObtainStyledAttributes.getInt(0, 17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f23575f = this.f23570a * 2;
        c();
        d();
        e();
        this.f23577h = false;
    }
}
