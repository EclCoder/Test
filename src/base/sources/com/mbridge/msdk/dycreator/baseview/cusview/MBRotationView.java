package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f29703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f29704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f29713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f29714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Runnable f29718p;

    public MBRotationView(Context context) {
        super(context);
        this.f29707e = 40;
        this.f29708f = 20;
        this.f29709g = 0;
        this.f29710h = 0;
        this.f29712j = 0;
        this.f29713k = 0.5f;
        this.f29714l = 0.9f;
        this.f29715m = true;
        this.f29716n = false;
        this.f29717o = false;
        this.f29718p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f29709g * this.f29705c) / 2) / this.f29707e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f29709g) > this.f29707e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f29717o ? this.f29710h - 2 : this.f29710h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f29710h;
            } else if (this.f29717o) {
                i12 = this.f29710h;
                i11 = i12 - 1;
            } else {
                i13 = this.f29710h;
                i11 = i13 + 1;
            }
        } else if (this.f29717o) {
            i13 = this.f29710h;
            i11 = i13 + 1;
        } else {
            i12 = this.f29710h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f29716n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f29713k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f29714l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f29705c = (int) (f12 * f13);
        this.f29706d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f29706d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f29705c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f29718p, 1000 / this.f29708f);
        }
        this.f29715m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f29714l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f29716n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f29713k = f10;
    }

    private void a() {
        this.f29703a = new Camera();
        this.f29704b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f29709g * this.f29706d) / 2) / this.f29707e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f29709g) > this.f29707e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f29703a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f29703a.rotateX(f11);
            this.f29703a.translate(0.0f, f10, 0.0f);
            this.f29703a.translate(0.0f, f10, 0.0f);
            this.f29703a.rotateX(f11);
            this.f29703a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f29703a.translate(0.0f, f10, 0.0f);
            this.f29703a.rotateX(i11);
            this.f29703a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f29703a.rotateX(0.0f);
        } else {
            this.f29703a.translate(0.0f, f10, 0.0f);
            this.f29703a.rotateX(-i11);
            this.f29703a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29707e = 40;
        this.f29708f = 20;
        this.f29709g = 0;
        this.f29710h = 0;
        this.f29712j = 0;
        this.f29713k = 0.5f;
        this.f29714l = 0.9f;
        this.f29715m = true;
        this.f29716n = false;
        this.f29717o = false;
        this.f29718p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f29703a.save();
        this.f29704b.reset();
        float f10 = i10;
        this.f29703a.translate(0.0f, f10, 0.0f);
        this.f29703a.rotateX(this.f29709g);
        this.f29703a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f29717o) {
                b(this.f29705c, this.f29707e, i12);
            } else {
                b(-this.f29705c, -this.f29707e, i12);
            }
        } else if (i10 > 0) {
            b(this.f29705c, this.f29707e, i12);
        } else if (i10 < 0) {
            b(-this.f29705c, -this.f29707e, i12);
        }
        this.f29703a.getMatrix(this.f29704b);
        this.f29703a.restore();
        this.f29704b.preTranslate((-getWidth()) / 2, -i11);
        this.f29704b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f29704b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f29709g - 1;
        this.f29709g = i10;
        this.f29711i = this.f29710h;
        a(i10);
        if (this.f29715m) {
            postDelayed(this.f29718p, 1000 / this.f29708f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29707e = 40;
        this.f29708f = 20;
        this.f29709g = 0;
        this.f29710h = 0;
        this.f29712j = 0;
        this.f29713k = 0.5f;
        this.f29714l = 0.9f;
        this.f29715m = true;
        this.f29716n = false;
        this.f29717o = false;
        this.f29718p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f29703a.save();
        this.f29704b.reset();
        float f10 = i10;
        this.f29703a.translate(f10, 0.0f, 0.0f);
        this.f29703a.rotateY(this.f29709g);
        this.f29703a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f29717o) {
                a(this.f29706d, this.f29707e, i12);
            } else {
                a(-this.f29706d, -this.f29707e, i12);
            }
        } else if (i10 > 0) {
            a(this.f29706d, this.f29707e, i12);
        } else if (i10 < 0) {
            a(-this.f29706d, -this.f29707e, i12);
        }
        this.f29703a.getMatrix(this.f29704b);
        this.f29703a.restore();
        this.f29704b.preTranslate(-i11, (-getHeight()) / 2);
        this.f29704b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f29704b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f29707e;
        int i12 = this.f29711i - (i10 / i11);
        this.f29709g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f29703a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f29703a.rotateY(f11);
            this.f29703a.translate(f10, 0.0f, 0.0f);
            this.f29703a.translate(f10, 0.0f, 0.0f);
            this.f29703a.rotateY(f11);
            this.f29703a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f29703a.translate(f12, 0.0f, 0.0f);
            this.f29703a.rotateY(i11);
            this.f29703a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f29703a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f29703a.translate(f13, 0.0f, 0.0f);
            this.f29703a.rotateY(-i11);
            this.f29703a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f29710h = i10;
        if (Math.abs(this.f29709g) > this.f29707e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f29712j != iC) {
            this.f29712j = iC;
        }
    }
}
