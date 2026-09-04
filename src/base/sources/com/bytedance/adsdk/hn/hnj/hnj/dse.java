package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, sk {
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> aq;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> bug;
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.ojm dnm;
    private final List<orl> dse;
    private final com.bytedance.adsdk.hn.qor.qor.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Path f11988hn;
    float hnj;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> ojm;
    private com.bytedance.adsdk.hn.hnj.hn.qor orl;
    private final Paint qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f11989sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> f11990ta;

    public dse(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.fc fcVar) {
        Path path = new Path();
        this.f11988hn = path;
        this.qor = new com.bytedance.adsdk.hn.hnj.hnj(1);
        this.dse = new ArrayList();
        this.gjv = hnjVar;
        this.f11989sk = fcVar.hnj();
        this.dkl = fcVar.sk();
        this.dnm = ojmVar;
        if (hnjVar.ta() != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = hnjVar.ta().hnj().hnj();
            this.bug = hnjVarHnj;
            hnjVarHnj.hnj(this);
            hnjVar.hnj(this.bug);
        }
        if (hnjVar.dnm() != null) {
            this.orl = new com.bytedance.adsdk.hn.hnj.hn.qor(this, hnjVar, hnjVar.dnm());
        }
        if (fcVar.hn() == null || fcVar.qor() == null) {
            this.aq = null;
            this.ojm = null;
            return;
        }
        path.setFillType(fcVar.gjv());
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj2 = fcVar.hn().hnj();
        this.aq = hnjVarHnj2;
        hnjVarHnj2.hnj(this);
        hnjVar.hnj(hnjVarHnj2);
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj3 = fcVar.qor().hnj();
        this.ojm = hnjVarHnj3;
        hnjVarHnj3.hnj(this);
        hnjVar.hnj(hnjVarHnj3);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.dnm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            qor qorVar = list2.get(i10);
            if (qorVar instanceof orl) {
                this.dse.add((orl) qorVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        if (this.dkl) {
            return;
        }
        com.bytedance.adsdk.hn.sk.hnj("FillContent#draw");
        this.qor.setColor((com.bytedance.adsdk.hn.dkl.sk.hnj((int) ((((i10 / 255.0f) * this.ojm.dse().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.hn.hnj.hn.hn) this.aq).ojm() & 16777215));
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.f11990ta;
        if (hnjVar != null) {
            this.qor.setColorFilter(hnjVar.dse());
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar2 = this.bug;
        if (hnjVar2 != null) {
            float fFloatValue = hnjVar2.dse().floatValue();
            if (fFloatValue == 0.0f) {
                this.qor.setMaskFilter(null);
            } else if (fFloatValue != this.hnj) {
                this.qor.setMaskFilter(this.gjv.hn(fFloatValue));
            }
            this.hnj = fFloatValue;
        }
        com.bytedance.adsdk.hn.hnj.hn.qor qorVar = this.orl;
        if (qorVar != null) {
            qorVar.hnj(this.qor);
        }
        this.f11988hn.reset();
        for (int i11 = 0; i11 < this.dse.size(); i11++) {
            this.f11988hn.addPath(this.dse.get(i11).gjv(), matrix);
        }
        canvas.drawPath(this.f11988hn, this.qor);
        com.bytedance.adsdk.hn.sk.hn("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        this.f11988hn.reset();
        for (int i10 = 0; i10 < this.dse.size(); i10++) {
            this.f11988hn.addPath(this.dse.get(i10).gjv(), matrix);
        }
        this.f11988hn.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
