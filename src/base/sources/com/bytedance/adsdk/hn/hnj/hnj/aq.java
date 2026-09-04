package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, sk {
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> apu;
    private final Paint aq;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> bug;
    private final com.bytedance.adsdk.hn.qor.hn.dse dnm;
    private final Path dse;
    private com.bytedance.adsdk.hn.hnj.hn.qor eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> f11978fc;
    private final com.bytedance.adsdk.hn.qor.qor.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f11979hn;
    float hnj;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> jip;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.ojm f11980oj;
    private final RectF ojm;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> orl;
    private final boolean qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final List<orl> f11982ta;
    private com.bytedance.adsdk.hn.hnj.hn.uua uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final int f11983xn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f11981sk = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> dkl = new LongSparseArray<>();

    public aq(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.sk skVar) {
        Path path = new Path();
        this.dse = path;
        this.aq = new com.bytedance.adsdk.hn.hnj.hnj(1);
        this.ojm = new RectF();
        this.f11982ta = new ArrayList();
        this.hnj = 0.0f;
        this.gjv = hnjVar;
        this.f11979hn = skVar.hnj();
        this.qor = skVar.aq();
        this.f11980oj = ojmVar;
        this.dnm = skVar.hn();
        path.setFillType(skVar.qor());
        this.f11983xn = (int) (dseVar.sk() / 32.0f);
        com.bytedance.adsdk.hn.hnj.hn.hnj<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> hnjVarHnj = skVar.gjv().hnj();
        this.bug = hnjVarHnj;
        hnjVarHnj.hnj(this);
        hnjVar.hnj(hnjVarHnj);
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj2 = skVar.sk().hnj();
        this.orl = hnjVarHnj2;
        hnjVarHnj2.hnj(this);
        hnjVar.hnj(hnjVarHnj2);
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj3 = skVar.dkl().hnj();
        this.mjg = hnjVarHnj3;
        hnjVarHnj3.hnj(this);
        hnjVar.hnj(hnjVarHnj3);
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj4 = skVar.dse().hnj();
        this.f11978fc = hnjVarHnj4;
        hnjVarHnj4.hnj(this);
        hnjVar.hnj(hnjVarHnj4);
        if (hnjVar.ta() != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj5 = hnjVar.ta().hnj().hnj();
            this.apu = hnjVarHnj5;
            hnjVarHnj5.hnj(this);
            hnjVar.hnj(this.apu);
        }
        if (hnjVar.dnm() != null) {
            this.eum = new com.bytedance.adsdk.hn.hnj.hn.qor(this, hnjVar, hnjVar.dnm());
        }
    }

    private int gjv() {
        int iRound = Math.round(this.mjg.aq() * this.f11983xn);
        int iRound2 = Math.round(this.f11978fc.aq() * this.f11983xn);
        int iRound3 = Math.round(this.bug.aq() * this.f11983xn);
        int i10 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient hn() {
        long jGjv = gjv();
        LinearGradient linearGradient = this.f11981sk.get(jGjv);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFDse = this.mjg.dse();
        PointF pointFDse2 = this.f11978fc.dse();
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVarDse = this.bug.dse();
        LinearGradient linearGradient2 = new LinearGradient(pointFDse.x, pointFDse.y, pointFDse2.x, pointFDse2.y, hnj(gjvVarDse.hn()), gjvVarDse.hnj(), Shader.TileMode.CLAMP);
        this.f11981sk.put(jGjv, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient qor() {
        long jGjv = gjv();
        RadialGradient radialGradient = this.dkl.get(jGjv);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFDse = this.mjg.dse();
        PointF pointFDse2 = this.f11978fc.dse();
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVarDse = this.bug.dse();
        int[] iArrHnj = hnj(gjvVarDse.hn());
        float[] fArrHnj = gjvVarDse.hnj();
        float f10 = pointFDse.x;
        float f11 = pointFDse.y;
        float fHypot = (float) Math.hypot(pointFDse2.x - f10, pointFDse2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArrHnj, fArrHnj, Shader.TileMode.CLAMP);
        this.dkl.put(jGjv, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.f11980oj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            qor qorVar = list2.get(i10);
            if (qorVar instanceof orl) {
                this.f11982ta.add((orl) qorVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        Shader shaderQor;
        if (this.qor) {
            return;
        }
        com.bytedance.adsdk.hn.sk.hnj("GradientFillContent#draw");
        this.dse.reset();
        for (int i11 = 0; i11 < this.f11982ta.size(); i11++) {
            this.dse.addPath(this.f11982ta.get(i11).gjv(), matrix);
        }
        this.dse.computeBounds(this.ojm, false);
        if (this.dnm == com.bytedance.adsdk.hn.qor.hn.dse.LINEAR) {
            shaderQor = hn();
        } else {
            shaderQor = qor();
        }
        shaderQor.setLocalMatrix(matrix);
        this.aq.setShader(shaderQor);
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.jip;
        if (hnjVar != null) {
            this.aq.setColorFilter(hnjVar.dse());
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar2 = this.apu;
        if (hnjVar2 != null) {
            float fFloatValue = hnjVar2.dse().floatValue();
            if (fFloatValue == 0.0f) {
                this.aq.setMaskFilter(null);
            } else if (fFloatValue != this.hnj) {
                this.aq.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.hnj = fFloatValue;
        }
        com.bytedance.adsdk.hn.hnj.hn.qor qorVar = this.eum;
        if (qorVar != null) {
            qorVar.hnj(this.aq);
        }
        this.aq.setAlpha(com.bytedance.adsdk.hn.dkl.sk.hnj((int) ((((i10 / 255.0f) * this.orl.dse().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.dse, this.aq);
        com.bytedance.adsdk.hn.sk.hn("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        this.dse.reset();
        for (int i10 = 0; i10 < this.f11982ta.size(); i10++) {
            this.dse.addPath(this.f11982ta.get(i10).gjv(), matrix);
        }
        this.dse.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] hnj(int[] iArr) {
        if (this.uua == null) {
            return iArr;
        }
        throw null;
    }
}
