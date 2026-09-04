package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.dkl.gjv;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class NiceImageView extends gjv {
    private RectF apu;
    private int aq;
    private final Path as;
    private int bug;
    private int dkl;
    private int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private Path f28do;
    private int dse;
    private final RectF eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f13213fc;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13214hn;
    private final Context hnj;
    private int jip;
    private final Xfermode mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final float[] f13215oj;
    private int ojm;
    private int orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13216sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f13217ta;
    private float uua;
    private final Paint wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final float[] f13218xn;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void gjv() {
        if (this.f13214hn) {
            return;
        }
        this.dkl = 0;
    }

    private void hn() {
        if (!this.f13214hn) {
            this.apu.set(0.0f, 0.0f, this.f13213fc, this.jip);
            if (this.qor) {
                this.apu = this.eum;
                return;
            }
            return;
        }
        float fMin = Math.min(this.f13213fc, this.jip) / 2.0f;
        this.uua = fMin;
        RectF rectF = this.apu;
        int i10 = this.f13213fc;
        int i11 = this.jip;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    private void hnj(Canvas canvas) {
        if (!this.f13214hn) {
            int i10 = this.gjv;
            if (i10 > 0) {
                hnj(canvas, i10, this.f13216sk, this.eum, this.f13215oj);
                return;
            }
            return;
        }
        int i11 = this.gjv;
        if (i11 > 0) {
            hnj(canvas, i11, this.f13216sk, this.uua - (i11 / 2.0f));
        }
        int i12 = this.dkl;
        if (i12 > 0) {
            hnj(canvas, i12, this.dse, (this.uua - this.gjv) - (i12 / 2.0f));
        }
    }

    private void qor() {
        if (this.f13214hn) {
            return;
        }
        int i10 = 0;
        if (this.aq <= 0) {
            float[] fArr = this.f13215oj;
            int i11 = this.ojm;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.f13217ta;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.bug;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.dnm;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.f13218xn;
            int i15 = this.gjv;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.f13215oj;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.aq;
            fArr3[i10] = i16;
            this.f13218xn[i10] = i16 - (this.gjv / 2.0f);
            i10++;
        }
    }

    public void isCircle(boolean z10) {
        this.f13214hn = z10;
        gjv();
        hn();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.qor = z10;
        hn();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.apu, null, 31);
        if (!this.qor) {
            int i10 = this.f13213fc;
            int i11 = this.gjv;
            int i12 = this.dkl;
            int i13 = this.jip;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.wu.reset();
        this.as.reset();
        if (this.f13214hn) {
            this.as.addCircle(this.f13213fc / 2.0f, this.jip / 2.0f, this.uua, Path.Direction.CCW);
        } else {
            this.as.addRoundRect(this.apu, this.f13218xn, Path.Direction.CCW);
        }
        this.wu.setAntiAlias(true);
        this.wu.setStyle(Paint.Style.FILL);
        this.wu.setXfermode(this.mjg);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.as, this.wu);
        } else {
            this.f28do.addRect(this.apu, Path.Direction.CCW);
            this.f28do.op(this.as, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f28do, this.wu);
        }
        this.wu.setXfermode(null);
        int i14 = this.orl;
        if (i14 != 0) {
            this.wu.setColor(i14);
            canvas.drawPath(this.as, this.wu);
        }
        canvas.restore();
        hnj(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13213fc = i10;
        this.jip = i11;
        hnj();
        hn();
    }

    public void setBorderColor(int i10) {
        this.f13216sk = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.gjv = sq.hn(this.hnj, i10);
        hnj(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.dnm = sq.hn(this.hnj, i10);
        hnj(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.bug = sq.hn(this.hnj, i10);
        hnj(true);
    }

    public void setCornerRadius(int i10) {
        this.aq = sq.hn(this.hnj, i10);
        hnj(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.ojm = sq.hn(this.hnj, i10);
        hnj(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.f13217ta = sq.hn(this.hnj, i10);
        hnj(true);
    }

    public void setInnerBorderColor(int i10) {
        this.dse = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.dkl = sq.hn(this.hnj, i10);
        gjv();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.orl = i10;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13216sk = -1;
        this.dse = -1;
        this.hnj = context;
        this.aq = sq.hn(context, 10.0f);
        this.f13215oj = new float[8];
        this.f13218xn = new float[8];
        this.eum = new RectF();
        this.apu = new RectF();
        this.wu = new Paint();
        this.as = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.mjg = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.mjg = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f28do = new Path();
        }
        qor();
        gjv();
    }

    private void hnj(Canvas canvas, int i10, int i11, float f10) {
        hnj(i10, i11);
        this.as.addCircle(this.f13213fc / 2.0f, this.jip / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.as, this.wu);
    }

    private void hnj(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        hnj(i10, i11);
        this.as.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.as, this.wu);
    }

    private void hnj(int i10, int i11) {
        this.as.reset();
        this.wu.setStrokeWidth(i10);
        this.wu.setColor(i11);
        this.wu.setStyle(Paint.Style.STROKE);
    }

    private void hnj() {
        if (this.f13214hn) {
            return;
        }
        RectF rectF = this.eum;
        int i10 = this.gjv;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.f13213fc - (i10 / 2.0f), this.jip - (i10 / 2.0f));
    }

    private void hnj(boolean z10) {
        if (z10) {
            this.aq = 0;
        }
        qor();
        hnj();
        invalidate();
    }
}
