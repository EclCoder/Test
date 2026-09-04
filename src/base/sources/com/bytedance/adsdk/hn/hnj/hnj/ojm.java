package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends hnj {
    private final RectF aq;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> bug;
    private final LongSparseArray<LinearGradient> dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> dnm;
    private final LongSparseArray<RadialGradient> dse;
    private final String gjv;
    private com.bytedance.adsdk.hn.hnj.hn.uua mjg;
    private final com.bytedance.adsdk.hn.qor.hn.dse ojm;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f12013sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final int f12014ta;

    public ojm(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.dkl dklVar) {
        super(ojmVar, hnjVar, dklVar.aq().hnj(), dklVar.ojm().hnj(), dklVar.bug(), dklVar.gjv(), dklVar.dse(), dklVar.ta(), dklVar.dnm());
        this.dkl = new LongSparseArray<>();
        this.dse = new LongSparseArray<>();
        this.aq = new RectF();
        this.gjv = dklVar.hnj();
        this.ojm = dklVar.hn();
        this.f12013sk = dklVar.orl();
        this.f12014ta = (int) (ojmVar.tgn().sk() / 32.0f);
        com.bytedance.adsdk.hn.hnj.hn.hnj<com.bytedance.adsdk.hn.qor.hn.gjv, com.bytedance.adsdk.hn.qor.hn.gjv> hnjVarHnj = dklVar.qor().hnj();
        this.dnm = hnjVarHnj;
        hnjVarHnj.hnj(this);
        hnjVar.hnj(hnjVarHnj);
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj2 = dklVar.sk().hnj();
        this.bug = hnjVarHnj2;
        hnjVarHnj2.hnj(this);
        hnjVar.hnj(hnjVarHnj2);
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj3 = dklVar.dkl().hnj();
        this.orl = hnjVarHnj3;
        hnjVarHnj3.hnj(this);
        hnjVar.hnj(hnjVarHnj3);
    }

    private int gjv() {
        int iRound = Math.round(this.bug.aq() * this.f12014ta);
        int iRound2 = Math.round(this.orl.aq() * this.f12014ta);
        int iRound3 = Math.round(this.dnm.aq() * this.f12014ta);
        int i10 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient hn() {
        long jGjv = gjv();
        LinearGradient linearGradient = this.dkl.get(jGjv);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFDse = this.bug.dse();
        PointF pointFDse2 = this.orl.dse();
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVarDse = this.dnm.dse();
        LinearGradient linearGradient2 = new LinearGradient(pointFDse.x, pointFDse.y, pointFDse2.x, pointFDse2.y, hnj(gjvVarDse.hn()), gjvVarDse.hnj(), Shader.TileMode.CLAMP);
        this.dkl.put(jGjv, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient qor() {
        long jGjv = gjv();
        RadialGradient radialGradient = this.dse.get(jGjv);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFDse = this.bug.dse();
        PointF pointFDse2 = this.orl.dse();
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVarDse = this.dnm.dse();
        int[] iArrHnj = hnj(gjvVarDse.hn());
        float[] fArrHnj = gjvVarDse.hnj();
        float f10 = pointFDse.x;
        float f11 = pointFDse.y;
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, (float) Math.hypot(pointFDse2.x - f10, pointFDse2.y - f11), iArrHnj, fArrHnj, Shader.TileMode.CLAMP);
        this.dse.put(jGjv, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12013sk) {
            return;
        }
        hnj(this.aq, matrix, false);
        Shader shaderHn = this.ojm == com.bytedance.adsdk.hn.qor.hn.dse.LINEAR ? hn() : qor();
        shaderHn.setLocalMatrix(matrix);
        this.f12000hn.setShader(shaderHn);
        super.hnj(canvas, matrix, i10);
    }

    private int[] hnj(int[] iArr) {
        if (this.mjg == null) {
            return iArr;
        }
        throw null;
    }
}
