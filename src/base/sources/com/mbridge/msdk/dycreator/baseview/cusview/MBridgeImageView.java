package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f29744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f29754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f29755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f29756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f29757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f29759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f29760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f29761r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f29752i, this.f29753j, this.f29757n, this.f29754k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f29754k == null || this.f29755l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f29754k;
                float f10 = this.f29748e;
                fArr[i13] = f10;
                this.f29755l[i13] = f10 - (this.f29752i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f29754k;
                float f11 = this.f29749f;
                fArr2[i10] = f11;
                this.f29755l[i10] = f11 - (this.f29752i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f29754k;
                float f12 = this.f29750g;
                fArr3[i11] = f12;
                this.f29755l[i11] = f12 - (this.f29752i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f29754k;
                float f13 = this.f29751h;
                fArr4[i12] = f13;
                this.f29755l[i12] = f13 - (this.f29752i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f29757n;
        if (rectF != null) {
            float f10 = this.f29752i / 2.0f;
            rectF.set(f10, f10, this.f29745b - f10, this.f29746c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f29756m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f29745b, this.f29746c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f29756m, null, 31);
            int i10 = this.f29745b;
            int i11 = this.f29752i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            int i12 = this.f29746c;
            float f12 = i12;
            canvas.scale(f10 / f11, ((i12 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f29761r;
            if (paint != null) {
                paint.reset();
                this.f29761r.setAntiAlias(true);
                this.f29761r.setStyle(Paint.Style.FILL);
                this.f29761r.setXfermode(this.f29744a);
            }
            Path path = this.f29760q;
            if (path != null) {
                path.reset();
                this.f29760q.addRoundRect(this.f29756m, this.f29755l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f29760q, this.f29761r);
            Paint paint2 = this.f29761r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f29758o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f29745b = i10;
        this.f29746c = i11;
        if (this.f29759p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f29758o = true;
        this.f29752i = i11;
        this.f29753j = i12;
        this.f29747d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f29747d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f29758o = true;
        this.f29759p = true;
        this.f29752i = i14;
        this.f29753j = i15;
        this.f29748e = i10;
        this.f29750g = i12;
        this.f29749f = i11;
        this.f29751h = i13;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f29760q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f29760q, this.f29761r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29760q = new Path();
        this.f29761r = new Paint();
        this.f29754k = new float[8];
        this.f29755l = new float[8];
        this.f29757n = new RectF();
        this.f29756m = new RectF();
        this.f29744a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f29760q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f29761r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f29761r.setColor(i11);
            this.f29761r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f29754k == null || this.f29755l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f29754k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f29747d;
                fArr[i10] = f10;
                this.f29755l[i10] = f10 - (this.f29752i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
