package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends hnj {
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> aq;
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> dse;
    private final com.bytedance.adsdk.hn.qor.qor.hnj gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f11977sk;

    public apu(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.oj ojVar) {
        super(ojmVar, hnjVar, ojVar.dse().hnj(), ojVar.aq().hnj(), ojVar.ojm(), ojVar.qor(), ojVar.gjv(), ojVar.sk(), ojVar.dkl());
        this.gjv = hnjVar;
        this.f11977sk = ojVar.hnj();
        this.dkl = ojVar.ta();
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj = ojVar.hn().hnj();
        this.dse = hnjVarHnj;
        hnjVarHnj.hnj(this);
        hnjVar.hnj(hnjVarHnj);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        if (this.dkl) {
            return;
        }
        this.f12000hn.setColor(((com.bytedance.adsdk.hn.hnj.hn.hn) this.dse).ojm());
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.aq;
        if (hnjVar != null) {
            this.f12000hn.setColorFilter(hnjVar.dse());
        }
        super.hnj(canvas, matrix, i10);
    }
}
