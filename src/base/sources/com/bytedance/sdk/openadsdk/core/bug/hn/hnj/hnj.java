package com.bytedance.sdk.openadsdk.core.bug.hn.hnj;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class hnj extends View {
    private ValueAnimator[] apu;
    private Paint aq;
    private final AccelerateDecelerateInterpolator as;
    private Camera bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private float f13653cm;
    private float dkl;
    private String[] dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final RectF f36do;
    private com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hn dse;
    private float dzo;
    private final Runnable eta;
    private float[] eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float[] f13654fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private int f13655ff;
    private long fvt;
    private int gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private final float[] f13656gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13657hn;
    private int hnj;
    private final Path hqh;
    private int jbd;
    private float[] jip;
    private hn[] lu;
    private String[] mjg;
    private final Path nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean[] f13658oj;
    private com.bytedance.adsdk.ugeno.ojm.dkl.hnj ojm;
    private Matrix orl;
    private int orp;
    private float pnz;
    private final Path pty;
    private float pv;
    private int qor;
    private C0211hnj[] rmr;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13659sk;
    private int sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Handler f13660ta;
    private final RectF tgn;
    private final RectF tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private Paint f13661ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private final float[] f13662ul;
    private boolean[] uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private final Path f13663vf;
    private float[] wu;
    private float xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private ValueAnimator[] f13664xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private float f13665xo;
    private final RectF xyo;

    public hnj(Context context) {
        super(context);
        this.f13660ta = new Handler(Looper.getMainLooper());
        this.dnm = new String[3];
        this.bug = new Camera();
        this.orl = new Matrix();
        this.mjg = new String[3];
        this.f13654fc = new float[3];
        this.jip = new float[3];
        this.uua = new boolean[3];
        this.f13658oj = new boolean[3];
        this.f13664xn = new ValueAnimator[3];
        this.apu = new ValueAnimator[3];
        this.eum = new float[3];
        this.wu = new float[3];
        this.as = new AccelerateDecelerateInterpolator();
        this.f36do = new RectF();
        this.tu = new RectF();
        this.tgn = new RectF();
        this.xyo = new RectF();
        this.f13663vf = new Path();
        this.hqh = new Path();
        this.nyv = new Path();
        this.pty = new Path();
        this.f13656gm = new float[8];
        this.f13662ul = new float[8];
        this.fvt = 0L;
        this.eta = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                hnj.hnj(hnj.this);
                hnj.this.invalidate();
                if (hnj.this.hnj > 0) {
                    hnj.this.f13660ta.postDelayed(this, 1000L);
                } else {
                    hnj.this.f13660ta.removeCallbacks(this);
                    hnj.this.hn();
                }
            }
        };
        gjv();
        sk();
        qor();
    }

    static /* synthetic */ int hnj(hnj hnjVar) {
        int i10 = hnjVar.hnj;
        hnjVar.hnj = i10 - 1;
        return i10;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.gjv <= 0 || this.f13659sk <= 0) {
            return;
        }
        this.f36do.set((getWidth() - this.gjv) / 2.0f, (getHeight() - this.f13659sk) / 2.0f, (getWidth() + this.gjv) / 2.0f, (getHeight() + this.f13659sk) / 2.0f);
        RectF rectF = this.f36do;
        float f10 = this.dkl;
        canvas.drawRoundRect(rectF, f10, f10, this.aq);
        int i10 = this.hnj;
        this.orp = i10 / 3600;
        int i11 = i10 % 3600;
        this.sq = i11;
        this.jbd = i11 / 60;
        this.f13655ff = i11 % 60;
        this.xad = this.gjv;
        this.f13653cm = this.f13659sk;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.dzo = width;
        float f11 = this.xad * 3.0f;
        this.pnz = f11;
        float f12 = width - f11;
        this.pv = f12;
        this.f13665xo = f12 > 0.0f ? f12 / 2.0f : 10.0f;
        hnj(this.orp, this.jbd, this.f13655ff);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.f36do.centerY();
        float f13 = this.f13653cm;
        hnj(canvas, paddingLeft, fCenterY - (f13 / 2.0f), this.xad, f13, String.format("%02d", Integer.valueOf(this.orp)), 0);
        float paddingLeft2 = this.f13665xo + getPaddingLeft() + this.xad;
        float fCenterY2 = this.f36do.centerY();
        float f14 = this.f13653cm;
        hnj(canvas, paddingLeft2, fCenterY2 - (f14 / 2.0f), this.xad, f14, String.format("%02d", Integer.valueOf(this.jbd)), 1);
        float paddingLeft3 = ((this.xad + this.f13665xo) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.f36do.centerY();
        float f15 = this.f13653cm;
        hnj(canvas, paddingLeft3, fCenterY3 - (f15 / 2.0f), this.xad, f15, String.format("%02d", Integer.valueOf(this.f13655ff)), 2);
        hnj(canvas, getPaddingLeft() + this.xad + (this.f13665xo / 2.0f), this.f36do.centerY());
        hnj(canvas, getPaddingLeft() + (this.xad * 2.0f) + ((this.f13665xo * 3.0f) / 2.0f), this.f36do.centerY());
        com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hn hnVar = this.dse;
        if (hnVar == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int[] iArrHnj = hnVar.hnj(i10, i11);
        if (this.f13659sk > 0) {
            int mode = View.MeasureSpec.getMode(iArrHnj[1]);
            int size = View.MeasureSpec.getSize(iArrHnj[1]);
            if (mode == 0 || size > this.f13659sk) {
                iArrHnj[1] = View.MeasureSpec.makeMeasureSpec(this.f13659sk, 1073741824);
            }
        }
        super.onMeasure(iArrHnj[0], iArrHnj[1]);
    }

    private void gjv() {
        Paint paint = new Paint();
        this.aq = paint;
        paint.setColor(this.f13657hn);
        this.aq.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hn(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f13654fc[i10] = fFloatValue;
        this.eum[i10] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.fvt >= 16) {
            invalidate();
            this.fvt = jCurrentTimeMillis;
        }
    }

    private void qor() {
        this.lu = new hn[3];
        this.rmr = new C0211hnj[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.lu[i10] = new hn(this, i10);
            this.rmr[i10] = new C0211hnj(this, i10);
        }
    }

    private void sk() {
        if (this.ojm == null) {
            com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.dkl.hnj(getContext());
            this.ojm = hnjVar;
            this.f13661ua = hnjVar.getPaint();
        }
    }

    public void hnj(int i10, int i11, int i12, int i13, int i14, float f10) {
        int iMin = Math.min(i10, 360060);
        this.f13657hn = i11;
        this.qor = i12;
        this.gjv = i13;
        this.f13659sk = i14;
        this.dkl = f10;
        this.hnj = iMin;
        this.f13660ta.post(this.eta);
        Paint paint = this.aq;
        if (paint != null) {
            paint.setColor(this.f13657hn);
        }
        float[] fArr = this.f13656gm;
        float f11 = this.dkl;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.f13662ul;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f11;
        fArr2[6] = f11;
        fArr2[5] = f11;
        fArr2[4] = f11;
        invalidate();
    }

    public void hn() {
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimator = this.f13664xn[i10];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13664xn[i10].cancel();
            }
            ValueAnimator valueAnimator2 = this.apu[i10];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.apu[i10].cancel();
            }
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hn hnVar) {
        this.dse = hnVar;
    }

    private void hnj(Canvas canvas, float f10, float f11, float f12, float f13, String str, int i10) {
        this.tu.set(f10, f11, f12 + f10, f13 + f11);
        float fCenterY = this.tu.centerY();
        float fCenterY2 = this.tu.centerY() - ((this.ojm.getPaint().descent() + this.ojm.getPaint().ascent()) / 2.0f);
        RectF rectF = this.tgn;
        RectF rectF2 = this.tu;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.f13663vf.reset();
        Path path = this.f13663vf;
        RectF rectF3 = this.tgn;
        float[] fArr = this.f13656gm;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.aq.setColor(this.f13657hn);
        canvas.drawPath(this.f13663vf, this.aq);
        this.f13661ua.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.tu.centerX(), fCenterY2, this.f13661ua);
        RectF rectF4 = this.xyo;
        RectF rectF5 = this.tu;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.hqh.reset();
        this.hqh.addRoundRect(this.xyo, this.f13662ul, direction);
        this.aq.setColor(this.qor);
        canvas.drawPath(this.hqh, this.aq);
        canvas.drawText(str, this.tu.centerX(), fCenterY2, this.ojm.getPaint());
        boolean z10 = this.uua[i10];
        if (z10 || this.f13658oj[i10]) {
            if (z10) {
                canvas.save();
                this.orl.reset();
                this.bug.save();
                this.bug.rotateX(this.f13654fc[i10]);
                this.bug.getMatrix(this.orl);
                this.orl.preTranslate(-this.tu.centerX(), -fCenterY);
                this.orl.postTranslate(this.tu.centerX(), fCenterY);
                canvas.concat(this.orl);
                this.nyv.reset();
                this.nyv.addRoundRect(this.tgn, this.f13656gm, direction);
                this.aq.setColor(this.f13657hn);
                canvas.drawPath(this.nyv, this.aq);
                int alpha = this.f13661ua.getAlpha();
                this.f13661ua.setAlpha((int) (this.eum[i10] * 255.0f));
                canvas.drawText(this.dnm[i10], this.tu.centerX(), fCenterY2, this.f13661ua);
                this.f13661ua.setAlpha(alpha);
                this.bug.restore();
                canvas.restore();
            }
            if (this.f13658oj[i10]) {
                canvas.save();
                this.orl.reset();
                this.bug.save();
                this.bug.rotateX(this.jip[i10]);
                this.bug.getMatrix(this.orl);
                this.orl.preTranslate(-this.tu.centerX(), -fCenterY);
                this.orl.postTranslate(this.tu.centerX(), fCenterY);
                canvas.concat(this.orl);
                this.pty.reset();
                this.pty.addRoundRect(this.xyo, this.f13662ul, direction);
                this.aq.setColor(this.qor);
                canvas.drawPath(this.pty, this.aq);
                int alpha2 = this.f13661ua.getAlpha();
                this.f13661ua.setAlpha((int) (this.wu[i10] * 255.0f));
                canvas.drawText(this.mjg[i10], this.tu.centerX(), fCenterY2, this.f13661ua);
                this.f13661ua.setAlpha(alpha2);
                this.bug.restore();
                canvas.restore();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final hnj f13666hn;
        private final int hnj;

        public hn(hnj hnjVar, int i10) {
            this.f13666hn = hnjVar;
            this.hnj = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13666hn.uua[this.hnj] = false;
            this.f13666hn.apu[this.hnj].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.hn.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0211hnj implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final hnj f13667hn;
        private final int hnj;

        public C0211hnj(hnj hnjVar, int i10) {
            this.f13667hn = hnjVar;
            this.hnj = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13667hn.f13658oj[this.hnj] = false;
            this.f13667hn.dnm[this.hnj] = this.f13667hn.mjg[this.hnj];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private void hnj(Canvas canvas, float f10, float f11) {
        canvas.drawText(":", f10, f11 - ((this.f13661ua.descent() + this.f13661ua.ascent()) / 2.0f), this.f13661ua);
    }

    private void hnj(int i10, int i11, int i12) {
        String str = this.dnm[0];
        String str2 = String.format("%02d", Integer.valueOf(i10));
        if (!str2.equals(str) && !this.uua[0] && !this.f13658oj[0] && str != null) {
            hnj(0, str, str2);
        }
        String str3 = this.dnm[1];
        String str4 = String.format("%02d", Integer.valueOf(i11));
        if (!str4.equals(str3) && !this.uua[1] && !this.f13658oj[1] && str3 != null) {
            hnj(1, str3, str4);
        }
        String str5 = this.dnm[2];
        String str6 = String.format("%02d", Integer.valueOf(i12));
        if (!str6.equals(str5) && !this.uua[2] && !this.f13658oj[2] && str5 != null) {
            hnj(2, str5, str6);
        }
        String[] strArr = this.dnm;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void hnj(final int i10, String str, String str2) {
        this.dnm[i10] = str;
        this.mjg[i10] = str2;
        this.uua[i10] = true;
        this.f13658oj[i10] = true;
        this.f13654fc[i10] = 0.0f;
        this.jip[i10] = 90.0f;
        this.eum[i10] = 1.0f;
        this.wu[i10] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.f13664xn;
        ValueAnimator valueAnimator = valueAnimatorArr[i10];
        if (valueAnimator == null) {
            valueAnimatorArr[i10] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.f13664xn[i10].setDuration(250L);
            this.f13664xn[i10].setInterpolator(this.as);
            this.f13664xn[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.hnj.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f13646a.hn(i10, valueAnimator2);
                }
            });
            this.f13664xn[i10].addListener(this.lu[i10]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.apu;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i10];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i10] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.apu[i10].setDuration(250L);
            this.apu[i10].setInterpolator(this.as);
            this.apu[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.hnj.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f13648a.hnj(i10, valueAnimator3);
                }
            });
            this.apu[i10].addListener(this.rmr[i10]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.f13664xn[i10].isRunning()) {
            this.f13664xn[i10].cancel();
        }
        if (this.apu[i10].isRunning()) {
            this.apu[i10].cancel();
        }
        this.f13664xn[i10].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hnj(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.jip[i10] = fFloatValue;
        this.wu[i10] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.fvt >= 16) {
            invalidate();
            this.fvt = jCurrentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnj() {
        return this.ojm;
    }

    public void hnj(com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar) {
        this.ojm = hnjVar;
    }
}
