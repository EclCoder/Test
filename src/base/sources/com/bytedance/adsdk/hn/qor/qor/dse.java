package com.bytedance.adsdk.hn.qor.qor;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.hn.qor.hn.jip;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends hnj {
    private final hn aq;
    private final com.bytedance.adsdk.hn.hnj.hnj.gjv dse;

    dse(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar, hn hnVar, com.bytedance.adsdk.hn.dse dseVar) {
        super(ojmVar, skVar);
        this.aq = hnVar;
        com.bytedance.adsdk.hn.hnj.hnj.gjv gjvVar = new com.bytedance.adsdk.hn.hnj.hnj.gjv(ojmVar, this, new jip("__container", skVar.mjg(), false), dseVar);
        this.dse = gjvVar;
        List<com.bytedance.adsdk.hn.hnj.hnj.qor> list = Collections.EMPTY_LIST;
        gjvVar.hnj(list, list);
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public com.bytedance.adsdk.hn.sk.ta dnm() {
        com.bytedance.adsdk.hn.sk.ta taVarDnm = super.dnm();
        return taVarDnm != null ? taVarDnm : this.aq.dnm();
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        super.hn(canvas, matrix, i10);
        this.dse.hnj(canvas, matrix, i10);
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        super.hnj(rectF, matrix, z10);
        this.dse.hnj(rectF, this.hnj, z10);
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public com.bytedance.adsdk.hn.qor.hn.hnj ta() {
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVarTa = super.ta();
        return hnjVarTa != null ? hnjVarTa : this.aq.ta();
    }
}
