package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, sk {
    private final com.bytedance.adsdk.hn.ojm aq;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Integer> bug;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> dnm;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> f11999fc;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final Paint f12000hn;
    protected final com.bytedance.adsdk.hn.qor.qor.hnj hnj;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> jip;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> mjg;
    private final List<com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float>> orl;
    float qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final float[] f12002ta;
    private com.bytedance.adsdk.hn.hnj.hn.qor uua;
    private final PathMeasure gjv = new PathMeasure();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Path f12001sk = new Path();
    private final Path dkl = new Path();
    private final RectF dse = new RectF();
    private final List<C0163hnj> ojm = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.hnj.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0163hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final eum f12003hn;
        private final List<orl> hnj;

        private C0163hnj(eum eumVar) {
            this.hnj = new ArrayList();
            this.f12003hn = eumVar;
        }
    }

    hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, List<com.bytedance.adsdk.hn.qor.hnj.hn> list, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2) {
        com.bytedance.adsdk.hn.hnj.hnj hnjVar2 = new com.bytedance.adsdk.hn.hnj.hnj(1);
        this.f12000hn = hnjVar2;
        this.qor = 0.0f;
        this.aq = ojmVar;
        this.hnj = hnjVar;
        hnjVar2.setStyle(Paint.Style.STROKE);
        hnjVar2.setStrokeCap(cap);
        hnjVar2.setStrokeJoin(join);
        hnjVar2.setStrokeMiter(f10);
        this.bug = gjvVar.hnj();
        this.dnm = hnVar.hnj();
        if (hnVar2 == null) {
            this.mjg = null;
        } else {
            this.mjg = hnVar2.hnj();
        }
        this.orl = new ArrayList(list.size());
        this.f12002ta = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.orl.add(list.get(i10).hnj());
        }
        hnjVar.hnj(this.bug);
        hnjVar.hnj(this.dnm);
        for (int i11 = 0; i11 < this.orl.size(); i11++) {
            hnjVar.hnj(this.orl.get(i11));
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar3 = this.mjg;
        if (hnjVar3 != null) {
            hnjVar.hnj(hnjVar3);
        }
        this.bug.hnj(this);
        this.dnm.hnj(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.orl.get(i12).hnj(this);
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar4 = this.mjg;
        if (hnjVar4 != null) {
            hnjVar4.hnj(this);
        }
        if (hnjVar.ta() != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = hnjVar.ta().hnj().hnj();
            this.jip = hnjVarHnj;
            hnjVarHnj.hnj(this);
            hnjVar.hnj(this.jip);
        }
        if (hnjVar.dnm() != null) {
            this.uua = new com.bytedance.adsdk.hn.hnj.hn.qor(this, hnjVar, hnjVar.dnm());
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.aq.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        eum eumVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            qor qorVar = list.get(size);
            if (qorVar instanceof eum) {
                eum eumVar2 = (eum) qorVar;
                if (eumVar2.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.INDIVIDUALLY) {
                    eumVar = eumVar2;
                }
            }
        }
        if (eumVar != null) {
            eumVar.hnj(this);
        }
        C0163hnj c0163hnj = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            qor qorVar2 = list2.get(size2);
            if (qorVar2 instanceof eum) {
                eum eumVar3 = (eum) qorVar2;
                if (eumVar3.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.INDIVIDUALLY) {
                    if (c0163hnj != null) {
                        this.ojm.add(c0163hnj);
                    }
                    c0163hnj = new C0163hnj(eumVar3);
                    eumVar3.hnj(this);
                } else if (!(qorVar2 instanceof orl)) {
                    if (c0163hnj == null) {
                        c0163hnj = new C0163hnj(eumVar);
                    }
                    c0163hnj.hnj.add((orl) qorVar2);
                }
            } else if (!(qorVar2 instanceof orl)) {
                if (c0163hnj == null) {
                    c0163hnj = new C0163hnj(eumVar);
                }
                c0163hnj.hnj.add((orl) qorVar2);
            }
        }
        if (c0163hnj != null) {
            this.ojm.add(c0163hnj);
        }
    }

    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.hn.sk.hnj("StrokeContent#draw");
        if (com.bytedance.adsdk.hn.dkl.dkl.hn(matrix)) {
            com.bytedance.adsdk.hn.sk.hn("StrokeContent#draw");
            return;
        }
        this.f12000hn.setAlpha(com.bytedance.adsdk.hn.dkl.sk.hnj((int) ((((i10 / 255.0f) * ((com.bytedance.adsdk.hn.hnj.hn.dkl) this.bug).ojm()) / 100.0f) * 255.0f), 0, 255));
        this.f12000hn.setStrokeWidth(((com.bytedance.adsdk.hn.hnj.hn.gjv) this.dnm).ojm() * com.bytedance.adsdk.hn.dkl.dkl.hnj(matrix));
        if (this.f12000hn.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.hn.sk.hn("StrokeContent#draw");
            return;
        }
        hnj(matrix);
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.f11999fc;
        if (hnjVar != null) {
            this.f12000hn.setColorFilter(hnjVar.dse());
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar2 = this.jip;
        if (hnjVar2 != null) {
            float fFloatValue = hnjVar2.dse().floatValue();
            if (fFloatValue == 0.0f) {
                this.f12000hn.setMaskFilter(null);
            } else if (fFloatValue != this.qor) {
                this.f12000hn.setMaskFilter(this.hnj.hn(fFloatValue));
            }
            this.qor = fFloatValue;
        }
        com.bytedance.adsdk.hn.hnj.hn.qor qorVar = this.uua;
        if (qorVar != null) {
            qorVar.hnj(this.f12000hn);
        }
        for (int i11 = 0; i11 < this.ojm.size(); i11++) {
            C0163hnj c0163hnj = this.ojm.get(i11);
            if (c0163hnj.f12003hn != null) {
                hnj(canvas, c0163hnj, matrix);
            } else {
                com.bytedance.adsdk.hn.sk.hnj("StrokeContent#buildPath");
                this.f12001sk.reset();
                for (int size = c0163hnj.hnj.size() - 1; size >= 0; size--) {
                    this.f12001sk.addPath(((orl) c0163hnj.hnj.get(size)).gjv(), matrix);
                }
                com.bytedance.adsdk.hn.sk.hn("StrokeContent#buildPath");
                com.bytedance.adsdk.hn.sk.hnj("StrokeContent#drawPath");
                canvas.drawPath(this.f12001sk, this.f12000hn);
                com.bytedance.adsdk.hn.sk.hn("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.hn.sk.hn("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    private void hnj(Canvas canvas, C0163hnj c0163hnj, Matrix matrix) {
        float f10;
        float f11;
        float fMin;
        com.bytedance.adsdk.hn.sk.hnj("StrokeContent#applyTrimPath");
        if (c0163hnj.f12003hn == null) {
            com.bytedance.adsdk.hn.sk.hn("StrokeContent#applyTrimPath");
            return;
        }
        this.f12001sk.reset();
        for (int size = c0163hnj.hnj.size() - 1; size >= 0; size--) {
            this.f12001sk.addPath(((orl) c0163hnj.hnj.get(size)).gjv(), matrix);
        }
        float fFloatValue = c0163hnj.f12003hn.qor().dse().floatValue() / 100.0f;
        float fFloatValue2 = c0163hnj.f12003hn.gjv().dse().floatValue() / 100.0f;
        float fFloatValue3 = c0163hnj.f12003hn.sk().dse().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f12001sk, this.f12000hn);
            com.bytedance.adsdk.hn.sk.hn("StrokeContent#applyTrimPath");
            return;
        }
        this.gjv.setPath(this.f12001sk, false);
        float length = this.gjv.getLength();
        while (this.gjv.nextContour()) {
            length += this.gjv.getLength();
        }
        float f12 = fFloatValue3 * length;
        float f13 = (fFloatValue * length) + f12;
        float fMin2 = Math.min((fFloatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = c0163hnj.hnj.size() - 1; size2 >= 0; size2--) {
            this.dkl.set(((orl) c0163hnj.hnj.get(size2)).gjv());
            this.dkl.transform(matrix);
            this.gjv.setPath(this.dkl, false);
            float length2 = this.gjv.getLength();
            if (fMin2 > length) {
                float f15 = fMin2 - length;
                if (f15 >= f14 + length2 || f14 >= f15) {
                    f10 = f14 + length2;
                    if (f10 < f13 && f14 <= fMin2) {
                        if (f10 > fMin2 || f13 >= f14) {
                            f11 = f13 < f14 ? 0.0f : (f13 - f14) / length2;
                            fMin = fMin2 > f10 ? 1.0f : (fMin2 - f14) / length2;
                        } else {
                            canvas.drawPath(this.dkl, this.f12000hn);
                        }
                    }
                } else {
                    f11 = f13 > length ? (f13 - length) / length2 : 0.0f;
                    fMin = Math.min(f15 / length2, 1.0f);
                }
                com.bytedance.adsdk.hn.dkl.dkl.hnj(this.dkl, f11, fMin, 0.0f);
                canvas.drawPath(this.dkl, this.f12000hn);
            } else {
                f10 = f14 + length2;
                if (f10 < f13) {
                }
            }
            f14 += length2;
        }
        com.bytedance.adsdk.hn.sk.hn("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.hn.sk.hnj("StrokeContent#getBounds");
        this.f12001sk.reset();
        for (int i10 = 0; i10 < this.ojm.size(); i10++) {
            C0163hnj c0163hnj = this.ojm.get(i10);
            for (int i11 = 0; i11 < c0163hnj.hnj.size(); i11++) {
                this.f12001sk.addPath(((orl) c0163hnj.hnj.get(i11)).gjv(), matrix);
            }
        }
        this.f12001sk.computeBounds(this.dse, false);
        float fOjm = ((com.bytedance.adsdk.hn.hnj.hn.gjv) this.dnm).ojm();
        RectF rectF2 = this.dse;
        float f10 = fOjm / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.dse);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.hn.sk.hn("StrokeContent#getBounds");
    }

    private void hnj(Matrix matrix) {
        com.bytedance.adsdk.hn.sk.hnj("StrokeContent#applyDashPattern");
        if (this.orl.isEmpty()) {
            com.bytedance.adsdk.hn.sk.hn("StrokeContent#applyDashPattern");
            return;
        }
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj(matrix);
        for (int i10 = 0; i10 < this.orl.size(); i10++) {
            this.f12002ta[i10] = this.orl.get(i10).dse().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f12002ta;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f12002ta;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f12002ta;
            fArr3[i10] = fArr3[i10] * fHnj;
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar = this.mjg;
        this.f12000hn.setPathEffect(new DashPathEffect(this.f12002ta, hnjVar == null ? 0.0f : fHnj * hnjVar.dse().floatValue()));
        com.bytedance.adsdk.hn.sk.hn("StrokeContent#applyDashPattern");
    }
}
