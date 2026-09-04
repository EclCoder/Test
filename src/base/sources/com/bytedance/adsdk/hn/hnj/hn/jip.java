package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip {
    private hnj<com.bytedance.adsdk.hn.dse.qor, com.bytedance.adsdk.hn.dse.qor> aq;
    private gjv bug;
    private hnj<PointF, PointF> dkl;
    private gjv dnm;
    private hnj<?, PointF> dse;
    private final Matrix gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Matrix f11968hn;
    private final Matrix hnj = new Matrix();
    private hnj<?, Float> mjg;
    private hnj<Float, Float> ojm;
    private hnj<?, Float> orl;
    private final Matrix qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final float[] f11969sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private hnj<Integer, Integer> f11970ta;

    public jip(com.bytedance.adsdk.hn.qor.hnj.bug bugVar) {
        this.dkl = bugVar.hnj() == null ? null : bugVar.hnj().hnj();
        this.dse = bugVar.hn() == null ? null : bugVar.hn().hnj();
        this.aq = bugVar.qor() == null ? null : bugVar.qor().hnj();
        this.ojm = bugVar.gjv() == null ? null : bugVar.gjv().hnj();
        gjv gjvVar = bugVar.aq() == null ? null : (gjv) bugVar.aq().hnj();
        this.dnm = gjvVar;
        if (gjvVar != null) {
            this.f11968hn = new Matrix();
            this.qor = new Matrix();
            this.gjv = new Matrix();
            this.f11969sk = new float[9];
        } else {
            this.f11968hn = null;
            this.qor = null;
            this.gjv = null;
            this.f11969sk = null;
        }
        this.bug = bugVar.ojm() == null ? null : (gjv) bugVar.ojm().hnj();
        if (bugVar.sk() != null) {
            this.f11970ta = bugVar.sk().hnj();
        }
        if (bugVar.dkl() != null) {
            this.orl = bugVar.dkl().hnj();
        } else {
            this.orl = null;
        }
        if (bugVar.dse() != null) {
            this.mjg = bugVar.dse().hnj();
        } else {
            this.mjg = null;
        }
    }

    private void sk() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f11969sk[i10] = 0.0f;
        }
    }

    public Matrix gjv() {
        PointF pointFDse;
        PointF pointFDse2;
        this.hnj.reset();
        hnj<?, PointF> hnjVar = this.dse;
        if (hnjVar != null && (pointFDse2 = hnjVar.dse()) != null) {
            float f10 = pointFDse2.x;
            if (f10 != 0.0f || pointFDse2.y != 0.0f) {
                this.hnj.preTranslate(f10, pointFDse2.y);
            }
        }
        hnj<Float, Float> hnjVar2 = this.ojm;
        if (hnjVar2 != null) {
            float fFloatValue = hnjVar2 instanceof uua ? hnjVar2.dse().floatValue() : ((gjv) hnjVar2).ojm();
            if (fFloatValue != 0.0f) {
                this.hnj.preRotate(fFloatValue);
            }
        }
        gjv gjvVar = this.dnm;
        if (gjvVar != null) {
            gjv gjvVar2 = this.bug;
            float fCos = gjvVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-gjvVar2.ojm()) + 90.0f));
            gjv gjvVar3 = this.bug;
            float fSin = gjvVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-gjvVar3.ojm()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(gjvVar.ojm()));
            sk();
            float[] fArr = this.f11969sk;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f11968hn.setValues(fArr);
            sk();
            float[] fArr2 = this.f11969sk;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.qor.setValues(fArr2);
            sk();
            float[] fArr3 = this.f11969sk;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.gjv.setValues(fArr3);
            this.qor.preConcat(this.f11968hn);
            this.gjv.preConcat(this.qor);
            this.hnj.preConcat(this.gjv);
        }
        hnj<com.bytedance.adsdk.hn.dse.qor, com.bytedance.adsdk.hn.dse.qor> hnjVar3 = this.aq;
        if (hnjVar3 != null) {
            com.bytedance.adsdk.hn.dse.qor qorVarDse = hnjVar3.dse();
            if (qorVarDse.hnj() != 1.0f || qorVarDse.hn() != 1.0f) {
                this.hnj.preScale(qorVarDse.hnj(), qorVarDse.hn());
            }
        }
        hnj<PointF, PointF> hnjVar4 = this.dkl;
        if (hnjVar4 != null && (((pointFDse = hnjVar4.dse()) != null && pointFDse.x != 0.0f) || pointFDse.y != 0.0f)) {
            this.hnj.preTranslate(-pointFDse.x, -pointFDse.y);
        }
        return this.hnj;
    }

    public hnj<?, Float> hn() {
        return this.orl;
    }

    public void hnj(com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        hnjVar.hnj(this.f11970ta);
        hnjVar.hnj(this.orl);
        hnjVar.hnj(this.mjg);
        hnjVar.hnj(this.dkl);
        hnjVar.hnj(this.dse);
        hnjVar.hnj(this.aq);
        hnjVar.hnj(this.ojm);
        hnjVar.hnj(this.dnm);
        hnjVar.hnj(this.bug);
    }

    public hnj<?, Float> qor() {
        return this.mjg;
    }

    public Matrix hn(float f10) {
        hnj<?, PointF> hnjVar = this.dse;
        PointF pointFDse = hnjVar == null ? null : hnjVar.dse();
        hnj<com.bytedance.adsdk.hn.dse.qor, com.bytedance.adsdk.hn.dse.qor> hnjVar2 = this.aq;
        com.bytedance.adsdk.hn.dse.qor qorVarDse = hnjVar2 == null ? null : hnjVar2.dse();
        this.hnj.reset();
        if (pointFDse != null) {
            this.hnj.preTranslate(pointFDse.x * f10, pointFDse.y * f10);
        }
        if (qorVarDse != null) {
            double d10 = f10;
            this.hnj.preScale((float) Math.pow(qorVarDse.hnj(), d10), (float) Math.pow(qorVarDse.hn(), d10));
        }
        hnj<Float, Float> hnjVar3 = this.ojm;
        if (hnjVar3 != null) {
            float fFloatValue = hnjVar3.dse().floatValue();
            hnj<PointF, PointF> hnjVar4 = this.dkl;
            PointF pointFDse2 = hnjVar4 != null ? hnjVar4.dse() : null;
            this.hnj.preRotate(fFloatValue * f10, pointFDse2 == null ? 0.0f : pointFDse2.x, pointFDse2 != null ? pointFDse2.y : 0.0f);
        }
        return this.hnj;
    }

    public void hnj(hnj.InterfaceC0162hnj interfaceC0162hnj) {
        hnj<Integer, Integer> hnjVar = this.f11970ta;
        if (hnjVar != null) {
            hnjVar.hnj(interfaceC0162hnj);
        }
        hnj<?, Float> hnjVar2 = this.orl;
        if (hnjVar2 != null) {
            hnjVar2.hnj(interfaceC0162hnj);
        }
        hnj<?, Float> hnjVar3 = this.mjg;
        if (hnjVar3 != null) {
            hnjVar3.hnj(interfaceC0162hnj);
        }
        hnj<PointF, PointF> hnjVar4 = this.dkl;
        if (hnjVar4 != null) {
            hnjVar4.hnj(interfaceC0162hnj);
        }
        hnj<?, PointF> hnjVar5 = this.dse;
        if (hnjVar5 != null) {
            hnjVar5.hnj(interfaceC0162hnj);
        }
        hnj<com.bytedance.adsdk.hn.dse.qor, com.bytedance.adsdk.hn.dse.qor> hnjVar6 = this.aq;
        if (hnjVar6 != null) {
            hnjVar6.hnj(interfaceC0162hnj);
        }
        hnj<Float, Float> hnjVar7 = this.ojm;
        if (hnjVar7 != null) {
            hnjVar7.hnj(interfaceC0162hnj);
        }
        gjv gjvVar = this.dnm;
        if (gjvVar != null) {
            gjvVar.hnj(interfaceC0162hnj);
        }
        gjv gjvVar2 = this.bug;
        if (gjvVar2 != null) {
            gjvVar2.hnj(interfaceC0162hnj);
        }
    }

    public void hnj(float f10) {
        hnj<Integer, Integer> hnjVar = this.f11970ta;
        if (hnjVar != null) {
            hnjVar.hnj(f10);
        }
        hnj<?, Float> hnjVar2 = this.orl;
        if (hnjVar2 != null) {
            hnjVar2.hnj(f10);
        }
        hnj<?, Float> hnjVar3 = this.mjg;
        if (hnjVar3 != null) {
            hnjVar3.hnj(f10);
        }
        hnj<PointF, PointF> hnjVar4 = this.dkl;
        if (hnjVar4 != null) {
            hnjVar4.hnj(f10);
        }
        hnj<?, PointF> hnjVar5 = this.dse;
        if (hnjVar5 != null) {
            hnjVar5.hnj(f10);
        }
        hnj<com.bytedance.adsdk.hn.dse.qor, com.bytedance.adsdk.hn.dse.qor> hnjVar6 = this.aq;
        if (hnjVar6 != null) {
            hnjVar6.hnj(f10);
        }
        hnj<Float, Float> hnjVar7 = this.ojm;
        if (hnjVar7 != null) {
            hnjVar7.hnj(f10);
        }
        gjv gjvVar = this.dnm;
        if (gjvVar != null) {
            gjvVar.hnj(f10);
        }
        gjv gjvVar2 = this.bug;
        if (gjvVar2 != null) {
            gjvVar2.hnj(f10);
        }
    }

    public hnj<?, Integer> hnj() {
        return this.f11970ta;
    }
}
