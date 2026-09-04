package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, dnm, orl, sk, ta {
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> aq;
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> dse;
    private final com.bytedance.adsdk.hn.qor.qor.hnj gjv;
    private final com.bytedance.adsdk.hn.hnj.hn.jip ojm;
    private final com.bytedance.adsdk.hn.ojm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f12005sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private gjv f12006ta;
    private final Matrix hnj = new Matrix();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Path f12004hn = new Path();

    public jip(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.bug bugVar) {
        this.qor = ojmVar;
        this.gjv = hnjVar;
        this.f12005sk = bugVar.hnj();
        this.dkl = bugVar.sk();
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = bugVar.hn().hnj();
        this.dse = hnjVarHnj;
        hnjVar.hnj(hnjVarHnj);
        hnjVarHnj.hnj(this);
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj2 = bugVar.qor().hnj();
        this.aq = hnjVarHnj2;
        hnjVar.hnj(hnjVarHnj2);
        hnjVarHnj2.hnj(this);
        com.bytedance.adsdk.hn.hnj.hn.jip jipVarTa = bugVar.gjv().ta();
        this.ojm = jipVarTa;
        jipVarTa.hnj(hnjVar);
        jipVarTa.hnj(this);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        Path pathGjv = this.f12006ta.gjv();
        this.f12004hn.reset();
        float fFloatValue = this.dse.dse().floatValue();
        float fFloatValue2 = this.aq.dse().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.hnj.set(this.ojm.hn(i10 + fFloatValue2));
            this.f12004hn.addPath(pathGjv, this.hnj);
        }
        return this.f12004hn;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.ta
    public void hnj(ListIterator<qor> listIterator) {
        if (this.f12006ta != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f12006ta = new gjv(this.qor, this.gjv, "Repeater", this.dkl, arrayList, null);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        this.f12006ta.hnj(list, list2);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.dse.dse().floatValue();
        float fFloatValue2 = this.aq.dse().floatValue();
        float fFloatValue3 = this.ojm.hn().dse().floatValue() / 100.0f;
        float fFloatValue4 = this.ojm.qor().dse().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.hnj.set(matrix);
            float f10 = i11;
            this.hnj.preConcat(this.ojm.hn(f10 + fFloatValue2));
            this.f12006ta.hnj(canvas, this.hnj, (int) (i10 * com.bytedance.adsdk.hn.dkl.sk.hnj(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        this.f12006ta.hnj(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.qor.invalidateSelf();
    }
}
