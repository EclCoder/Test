package com.bytedance.adsdk.hn.hnj.hnj;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, qor {
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> dse;
    private final com.bytedance.adsdk.hn.qor.hn.xn.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f11991hn;
    private final String hnj;
    private final List<com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj> qor = new ArrayList();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> f11992sk;

    public eum(com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.xn xnVar) {
        this.hnj = xnVar.hnj();
        this.f11991hn = xnVar.dkl();
        this.gjv = xnVar.hn();
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = xnVar.gjv().hnj();
        this.f11992sk = hnjVarHnj;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj2 = xnVar.qor().hnj();
        this.dkl = hnjVarHnj2;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj3 = xnVar.sk().hnj();
        this.dse = hnjVarHnj3;
        hnjVar.hnj(hnjVarHnj);
        hnjVar.hnj(hnjVarHnj2);
        hnjVar.hnj(hnjVarHnj3);
        hnjVarHnj.hnj(this);
        hnjVarHnj2.hnj(this);
        hnjVarHnj3.hnj(this);
    }

    public boolean dkl() {
        return this.f11991hn;
    }

    public com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> gjv() {
        return this.dkl;
    }

    com.bytedance.adsdk.hn.qor.hn.xn.hnj hn() {
        return this.gjv;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
    }

    public com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> qor() {
        return this.f11992sk;
    }

    public com.bytedance.adsdk.hn.hnj.hn.hnj<?, Float> sk() {
        return this.dse;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        for (int i10 = 0; i10 < this.qor.size(); i10++) {
            this.qor.get(i10).hnj();
        }
    }

    void hnj(com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj interfaceC0162hnj) {
        this.qor.add(interfaceC0162hnj);
    }
}
