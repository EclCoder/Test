package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements hnj.InterfaceC0162hnj {
    private final hnj<Float, Float> dkl;
    private boolean dse = true;
    private final hnj<Float, Float> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj<Integer, Integer> f11974hn;
    private final hnj.InterfaceC0162hnj hnj;
    private final hnj<Float, Float> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final hnj<Float, Float> f11975sk;

    public qor(hnj.InterfaceC0162hnj interfaceC0162hnj, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.sk.ta taVar) {
        this.hnj = interfaceC0162hnj;
        hnj<Integer, Integer> hnjVarHnj = taVar.hnj().hnj();
        this.f11974hn = hnjVarHnj;
        hnjVarHnj.hnj(this);
        hnjVar.hnj(hnjVarHnj);
        hnj<Float, Float> hnjVarHnj2 = taVar.hn().hnj();
        this.qor = hnjVarHnj2;
        hnjVarHnj2.hnj(this);
        hnjVar.hnj(hnjVarHnj2);
        hnj<Float, Float> hnjVarHnj3 = taVar.qor().hnj();
        this.gjv = hnjVarHnj3;
        hnjVarHnj3.hnj(this);
        hnjVar.hnj(hnjVarHnj3);
        hnj<Float, Float> hnjVarHnj4 = taVar.gjv().hnj();
        this.f11975sk = hnjVarHnj4;
        hnjVarHnj4.hnj(this);
        hnjVar.hnj(hnjVarHnj4);
        hnj<Float, Float> hnjVarHnj5 = taVar.sk().hnj();
        this.dkl = hnjVarHnj5;
        hnjVarHnj5.hnj(this);
        hnjVar.hnj(hnjVarHnj5);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.dse = true;
        this.hnj.hnj();
    }

    public void hnj(Paint paint) {
        if (this.dse) {
            this.dse = false;
            double dFloatValue = ((double) this.gjv.dse().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f11975sk.dse().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f11974hn.dse().intValue();
            paint.setShadowLayer(this.dkl.dse().floatValue(), fSin, fCos, Color.argb(Math.round(this.qor.dse().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
