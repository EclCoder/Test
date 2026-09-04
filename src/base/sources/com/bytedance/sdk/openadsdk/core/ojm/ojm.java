package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.sq;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.sdk.openadsdk.core.qor.hn {
    public ojm(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, int i10) {
        super(context, asVar, str, i10);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // com.bytedance.sdk.openadsdk.core.qor.hn
    protected com.bytedance.sdk.openadsdk.core.model.bug hnj(float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        float fHn;
        float fHn2;
        long j12;
        long j13;
        int[] iArrHnj = sq.hnj(view);
        if (iArrHnj == null || iArrHnj.length != 2) {
            fHn = f12;
            fHn2 = f13;
        } else {
            int i12 = iArrHnj[0];
            int i13 = iArrHnj[1];
            if (this.f14165xn == 0) {
                f10 = (sq.hn(((com.bytedance.sdk.openadsdk.core.qor.hn) this).gjv, f10) + i12) - 0.5f;
                f11 = (sq.hn(((com.bytedance.sdk.openadsdk.core.qor.hn) this).gjv, f11) + i13) - 0.5f;
                fHn = (sq.hn(((com.bytedance.sdk.openadsdk.core.qor.hn) this).gjv, f12) + i12) - 0.5f;
                fHn2 = (sq.hn(((com.bytedance.sdk.openadsdk.core.qor.hn) this).gjv, f13) + i13) - 0.5f;
            } else {
                fHn = f12;
                fHn2 = f13;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.jip jipVar = ((com.bytedance.sdk.openadsdk.core.qor.hn) this).f14163sk;
        if (jipVar != null) {
            j12 = jipVar.f13976sk;
            j13 = jipVar.dkl;
        } else {
            j12 = j10;
            j13 = j11;
        }
        this.f14165xn = 0;
        return new com.bytedance.sdk.openadsdk.core.model.bug.hnj().dkl(f10).sk(f11).gjv(fHn).qor(fHn2).hn(j12).hnj(j13).hnj(iArrHnj).hn(sq.qor(view)).gjv(this.tgn).sk(this.xyo).dkl(this.f14172vf).hn(com.bytedance.sdk.openadsdk.core.ta.hn().hnj() ? 1 : 2).hnj(sparseArray).hnj(str).hnj(i11).hnj(jSONObject).hn(jSONObject2).hnj();
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.jip jipVar) {
        ((com.bytedance.sdk.openadsdk.core.qor.hn) this).f14163sk = jipVar;
    }
}
