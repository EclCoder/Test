package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ColorSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f23635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f23636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f23637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f23638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f23639j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void c(int i10);
    }

    public ColorSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23633d = -1.0f;
        this.f23634e = -1.0f;
        this.f23639j = context;
        f();
    }

    private void a(Canvas canvas) {
        g();
        canvas.drawCircle((getWidth() - getPaddingRight()) - this.f23631b, getHeight() / 2, this.f23631b, this.f23635f);
    }

    private void b(Canvas canvas) {
        g();
        canvas.drawCircle(getPaddingLeft() + this.f23630a, getHeight() / 2, this.f23630a, this.f23635f);
    }

    private void c(Canvas canvas) {
        if (this.f23636g == null) {
            Paint paint = new Paint();
            this.f23636g = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f23636g.setColor(-4473925);
            this.f23636g.setStrokeWidth(4.0f);
        }
        float height = getHeight() / 2;
        canvas.drawLine(getPaddingLeft() + (this.f23630a * 2.0f), height, (getWidth() - getPaddingRight()) - (this.f23631b * 2.0f), height, this.f23636g);
    }

    private void d(Canvas canvas) {
        h();
        float slideX = getSlideX();
        this.f23633d = slideX;
        if (slideX >= 0.0f) {
            if (isEnabled()) {
                this.f23637h.setColor(this.f23632c);
            } else {
                this.f23637h.setColor(-7500403);
            }
            canvas.drawCircle(getSlideX(), getHeight() / 2, this.f23634e, this.f23637h);
        }
    }

    private float e(float f10) {
        if (f10 < getPaddingLeft() + this.f23630a) {
            f10 = getPaddingLeft() + this.f23630a;
        }
        if (f10 > (getWidth() - getPaddingRight()) - this.f23631b) {
            f10 = (getWidth() - getPaddingRight()) - this.f23631b;
        }
        float f11 = this.f23630a;
        float paddingLeft = (f10 - getPaddingLeft()) - this.f23630a;
        float width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        float f12 = this.f23630a;
        float f13 = this.f23631b;
        return f11 + ((paddingLeft / ((width - f12) - f13)) * (f13 - f12));
    }

    private void f() {
        this.f23630a = nh.b.a(this.f23639j, 2);
        this.f23631b = nh.b.a(this.f23639j, 10);
        wp.a.a("SeekBar: %f - %f", Float.valueOf(this.f23630a), Float.valueOf(this.f23631b));
    }

    private void g() {
        if (this.f23635f == null) {
            Paint paint = new Paint();
            this.f23635f = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f23635f.setColor(-4473925);
            this.f23635f.setStrokeWidth(3.0f);
        }
    }

    private float getSlideX() {
        float f10 = this.f23634e;
        float f11 = this.f23630a;
        if (f10 < f11) {
            this.f23634e = f11;
        }
        float f12 = this.f23634e;
        float f13 = this.f23631b;
        if (f12 > f13) {
            this.f23634e = f13;
        }
        return ((((this.f23634e - f11) * 1.0f) / (f13 - f11)) * ((((getWidth() - getPaddingRight()) - getPaddingLeft()) - this.f23630a) - this.f23631b)) + getPaddingLeft() + this.f23630a;
    }

    private void h() {
        if (this.f23637h == null) {
            Paint paint = new Paint();
            this.f23637h = paint;
            paint.setStyle(Paint.Style.FILL);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b(canvas);
        a(canvas);
        c(canvas);
        d(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!isEnabled()) {
            return true;
        }
        float x10 = motionEvent.getX();
        this.f23633d = x10;
        if (x10 < getPaddingLeft() + this.f23630a) {
            this.f23633d = getPaddingLeft() + this.f23630a;
        }
        if (this.f23633d > (getWidth() - getPaddingRight()) - this.f23631b) {
            this.f23633d = (getWidth() - getPaddingRight()) - this.f23631b;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            aVar = this.f23638i;
            if (aVar != null) {
                aVar.c((int) (this.f23634e * 2.0f));
            }
        } else if (action == 2) {
            this.f23634e = e(this.f23633d);
        } else if (action == 3) {
            aVar = this.f23638i;
            if (aVar != null) {
                aVar.c((int) (this.f23634e * 2.0f));
            }
        }
        invalidate();
        return true;
    }

    public void setColor(int i10) {
        h();
        this.f23632c = i10;
        this.f23637h.setColor(i10);
        invalidate();
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.f23638i = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r0
      0x000a: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0008, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSize(float f10) {
        float f11 = this.f23630a;
        if (f10 < f11 * 2.0f) {
            f10 = f11 * 2.0f;
        } else {
            f11 = this.f23631b;
            if (f10 > f11 * 2.0f) {
                f10 = f11 * 2.0f;
            }
        }
        this.f23634e = f10 / 2.0f;
        invalidate();
    }

    public ColorSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23633d = -1.0f;
        this.f23634e = -1.0f;
        this.f23639j = context;
        f();
    }
}
