package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, orl {
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, PointF> aq;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> bug;
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> dnm;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f12007fc;
    private final com.bytedance.adsdk.hn.qor.hn.ta.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f12008hn;
    private final Path hnj = new Path();
    private final hn mjg = new hn();
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> ojm;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> orl;
    private final com.bytedance.adsdk.hn.ojm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f12009sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> f12010ta;

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.hnj.hnj.mjg$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.adsdk.hn.qor.hn.ta.hnj.values().length];
            hnj = iArr;
            try {
                iArr[com.bytedance.adsdk.hn.qor.hn.ta.hnj.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.ta.hnj.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public mjg(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.ta taVar) {
        this.qor = ojmVar;
        this.f12008hn = taVar.hnj();
        com.bytedance.adsdk.hn.qor.hn.ta.hnj hnjVarHn = taVar.hn();
        this.gjv = hnjVarHn;
        this.f12009sk = taVar.ta();
        this.dkl = taVar.dnm();
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = taVar.qor().hnj();
        this.dse = hnjVarHnj;
        com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnjVarHnj2 = taVar.gjv().hnj();
        this.aq = hnjVarHnj2;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj3 = taVar.sk().hnj();
        this.ojm = hnjVarHnj3;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj4 = taVar.dse().hnj();
        this.dnm = hnjVarHnj4;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj5 = taVar.ojm().hnj();
        this.orl = hnjVarHnj5;
        com.bytedance.adsdk.hn.qor.hn.ta.hnj hnjVar2 = com.bytedance.adsdk.hn.qor.hn.ta.hnj.STAR;
        if (hnjVarHn == hnjVar2) {
            this.f12010ta = taVar.dkl().hnj();
            this.bug = taVar.aq().hnj();
        } else {
            this.f12010ta = null;
            this.bug = null;
        }
        hnjVar.hnj(hnjVarHnj);
        hnjVar.hnj(hnjVarHnj2);
        hnjVar.hnj(hnjVarHnj3);
        hnjVar.hnj(hnjVarHnj4);
        hnjVar.hnj(hnjVarHnj5);
        if (hnjVarHn == hnjVar2) {
            hnjVar.hnj(this.f12010ta);
            hnjVar.hnj(this.bug);
        }
        hnjVarHnj.hnj(this);
        hnjVarHnj2.hnj(this);
        hnjVarHnj3.hnj(this);
        hnjVarHnj4.hnj(this);
        hnjVarHnj5.hnj(this);
        if (hnjVarHn == hnjVar2) {
            this.f12010ta.hnj(this);
            this.bug.hnj(this);
        }
    }

    private void hn() {
        this.f12007fc = false;
        this.qor.invalidateSelf();
    }

    private void qor() {
        float f10;
        float f11;
        float fCos;
        float fSin;
        float f12;
        double d10;
        float f13;
        float f14;
        float f15;
        float fFloatValue = this.dse.dse().floatValue();
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar = this.ojm;
        double radians = Math.toRadians((hnjVar == null ? 0.0d : hnjVar.dse().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d11);
        if (this.dkl) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        if (f18 != 0.0f) {
            radians += (double) ((1.0f - f18) * f17);
        }
        float fFloatValue2 = this.dnm.dse().floatValue();
        float fFloatValue3 = this.f12010ta.dse().floatValue();
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar2 = this.bug;
        float fFloatValue4 = hnjVar2 != null ? hnjVar2.dse().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar3 = this.orl;
        float fFloatValue5 = hnjVar3 != null ? hnjVar3.dse().floatValue() / 100.0f : 0.0f;
        if (f18 != 0.0f) {
            f13 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            f11 = 0.0f;
            double d12 = f13;
            f10 = 2.0f;
            float fCos2 = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.hnj.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f16 * f18) / 2.0f));
            fCos = fCos2;
            f12 = f17;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.hnj.moveTo(fCos, fSin);
            f12 = f17;
            d10 = radians + ((double) f12);
            f13 = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        boolean z10 = false;
        double d14 = d10;
        float f19 = fSin;
        float f20 = fCos;
        double d15 = d14;
        while (true) {
            double d16 = i10;
            if (d16 >= dCeil) {
                PointF pointFDse = this.aq.dse();
                this.hnj.offset(pointFDse.x, pointFDse.y);
                this.hnj.close();
                return;
            }
            float f21 = z10 ? fFloatValue2 : fFloatValue3;
            float f22 = (f13 == f11 || d16 != dCeil - 2.0d) ? f12 : (f16 * f18) / f10;
            double d17 = (f13 == f11 || d16 != dCeil - 1.0d) ? f21 : f13;
            float fCos3 = (float) (d17 * Math.cos(d15));
            float f23 = f16;
            float fSin2 = (float) (d17 * Math.sin(d15));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.hnj.lineTo(fCos3, fSin2);
                f15 = fCos3;
                f14 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f19, f20) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f24 = f20;
                float f25 = f19;
                f14 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f26 = z10 ? fFloatValue4 : fFloatValue5;
                float f27 = z10 ? fFloatValue5 : fFloatValue4;
                float f28 = (z10 ? fFloatValue3 : fFloatValue2) * f26 * 0.47829f;
                float f29 = fCos4 * f28;
                float f30 = f28 * fSin3;
                float f31 = (z10 ? fFloatValue2 : fFloatValue3) * f27 * 0.47829f;
                float f32 = fCos5 * f31;
                float f33 = f31 * fSin4;
                if (f18 != 0.0f) {
                    if (i10 == 0) {
                        f29 *= f18;
                        f30 *= f18;
                    } else if (d16 == dCeil - 1.0d) {
                        f32 *= f18;
                        f33 *= f18;
                    }
                }
                f15 = fCos3;
                this.hnj.cubicTo(f24 - f29, f25 - f30, fCos3 + f32, f14 + f33, f15, f14);
            }
            d15 += (double) f22;
            z10 = !z10;
            i10++;
            f12 = f12;
            f20 = f15;
            f19 = f14;
            f16 = f23;
        }
    }

    private void sk() {
        int iFloor = (int) Math.floor(this.dse.dse().floatValue());
        com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> hnjVar = this.ojm;
        double radians = Math.toRadians((hnjVar == null ? 0.0d : hnjVar.dse().floatValue()) - 90.0d);
        double d10 = iFloor;
        float fFloatValue = this.orl.dse().floatValue() / 100.0f;
        float fFloatValue2 = this.dnm.dse().floatValue();
        double d11 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d11);
        float fSin = (float) (Math.sin(radians) * d11);
        this.hnj.moveTo(fCos, fSin);
        double d12 = (float) (6.283185307179586d / d10);
        double d13 = radians + d12;
        int i10 = 0;
        for (double dCeil = Math.ceil(d10); i10 < dCeil; dCeil = dCeil) {
            float fCos2 = (float) (Math.cos(d13) * d11);
            int i11 = i10;
            double d14 = d13;
            float fSin2 = (float) (d11 * Math.sin(d13));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f10 = fFloatValue2 * fFloatValue * 0.25f;
                this.hnj.cubicTo(fCos - (f10 * fCos3), fSin - (f10 * fSin3), fCos2 + (((float) Math.cos(dAtan3)) * f10), fSin2 + (f10 * ((float) Math.sin(dAtan3))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                fCos = fCos2;
                this.hnj.lineTo(fCos, fSin);
            }
            d13 = d14 + d12;
            i10 = i11 + 1;
        }
        PointF pointFDse = this.aq.dse();
        this.hnj.offset(pointFDse.x, pointFDse.y);
        this.hnj.close();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        if (this.f12007fc) {
            return this.hnj;
        }
        this.hnj.reset();
        if (this.f12009sk) {
            this.f12007fc = true;
            return this.hnj;
        }
        int i10 = AnonymousClass1.hnj[this.gjv.ordinal()];
        if (i10 == 1) {
            qor();
        } else if (i10 == 2) {
            sk();
        }
        this.hnj.close();
        this.mjg.hnj(this.hnj);
        this.f12007fc = true;
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        hn();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            qor qorVar = list.get(i10);
            if (qorVar instanceof eum) {
                eum eumVar = (eum) qorVar;
                if (eumVar.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.SIMULTANEOUSLY) {
                    this.mjg.hnj(eumVar);
                    eumVar.hnj(this);
                }
            }
        }
    }
}
