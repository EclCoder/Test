package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, orl {
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> aq;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, PointF> dkl;
    private boolean dnm;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, PointF> dse;
    private final boolean gjv;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.ojm f11994sk;
    private final Path hnj = new Path();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final RectF f11993hn = new RectF();
    private final hn ojm = new hn();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> f11995ta = null;

    public fc(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.dnm dnmVar) {
        this.qor = dnmVar.hnj();
        this.gjv = dnmVar.sk();
        this.f11994sk = ojmVar;
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj = dnmVar.gjv().hnj();
        this.dkl = hnjVarHnj;
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj2 = dnmVar.qor().hnj();
        this.dse = hnjVarHnj2;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj3 = dnmVar.hn().hnj();
        this.aq = hnjVarHnj3;
        hnjVar.hnj(hnjVarHnj);
        hnjVar.hnj(hnjVarHnj2);
        hnjVar.hnj(hnjVarHnj3);
        hnjVarHnj.hnj(this);
        hnjVarHnj2.hnj(this);
        hnjVarHnj3.hnj(this);
    }

    private void hn() {
        this.dnm = false;
        this.f11994sk.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar;
        if (this.dnm) {
            return this.hnj;
        }
        this.hnj.reset();
        if (this.gjv) {
            this.dnm = true;
            return this.hnj;
        }
        PointF pointFDse = this.dse.dse();
        float f10 = pointFDse.x / 2.0f;
        float f11 = pointFDse.y / 2.0f;
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar2 = this.aq;
        float fOjm = hnjVar2 == null ? 0.0f : ((com.bytedance.adsdk.hn.hnj.hn.gjv) hnjVar2).ojm();
        if (fOjm == 0.0f && (hnjVar = this.f11995ta) != null) {
            fOjm = Math.min(hnjVar.dse().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fOjm > fMin) {
            fOjm = fMin;
        }
        PointF pointFDse2 = this.dkl.dse();
        this.hnj.moveTo(pointFDse2.x + f10, (pointFDse2.y - f11) + fOjm);
        this.hnj.lineTo(pointFDse2.x + f10, (pointFDse2.y + f11) - fOjm);
        if (fOjm > 0.0f) {
            RectF rectF = this.f11993hn;
            float f12 = pointFDse2.x;
            float f13 = fOjm * 2.0f;
            float f14 = pointFDse2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.hnj.arcTo(this.f11993hn, 0.0f, 90.0f, false);
        }
        this.hnj.lineTo((pointFDse2.x - f10) + fOjm, pointFDse2.y + f11);
        if (fOjm > 0.0f) {
            RectF rectF2 = this.f11993hn;
            float f15 = pointFDse2.x;
            float f16 = pointFDse2.y;
            float f17 = fOjm * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.hnj.arcTo(this.f11993hn, 90.0f, 90.0f, false);
        }
        this.hnj.lineTo(pointFDse2.x - f10, (pointFDse2.y - f11) + fOjm);
        if (fOjm > 0.0f) {
            RectF rectF3 = this.f11993hn;
            float f18 = pointFDse2.x;
            float f19 = pointFDse2.y;
            float f20 = fOjm * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.hnj.arcTo(this.f11993hn, 180.0f, 90.0f, false);
        }
        this.hnj.lineTo((pointFDse2.x + f10) - fOjm, pointFDse2.y - f11);
        if (fOjm > 0.0f) {
            RectF rectF4 = this.f11993hn;
            float f21 = pointFDse2.x;
            float f22 = fOjm * 2.0f;
            float f23 = pointFDse2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.hnj.arcTo(this.f11993hn, 270.0f, 90.0f, false);
        }
        this.hnj.close();
        this.ojm.hnj(this.hnj);
        this.dnm = true;
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        hn();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            qor qorVar = list.get(i10);
            if (qorVar instanceof eum) {
                eum eumVar = (eum) qorVar;
                if (eumVar.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.SIMULTANEOUSLY) {
                    this.ojm.hnj(eumVar);
                    eumVar.hnj(this);
                } else if (qorVar instanceof uua) {
                    this.f11995ta = ((uua) qorVar).hn();
                }
            } else if (qorVar instanceof uua) {
                this.f11995ta = ((uua) qorVar).hn();
            }
        }
    }
}
