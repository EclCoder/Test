package com.bytedance.sdk.component.sk.hn.hn;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.sk.xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj<T> implements dkl {
    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, xn xnVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        Bitmap bitmapHnj;
        String strAq = qorVar.aq();
        qorVar.hnj();
        com.bytedance.sdk.component.sk.hn hnVarUua = qorVar.uua();
        com.bytedance.sdk.component.sk.hn.qor.dkl dklVarJip = qorVar.jip();
        if (hnVarUua == null || dklVarJip == null || !hnVarUua.sk() || !hnj(qorVar) || (bitmapHnj = dklVarJip.hnj(hnVarUua).hnj(strAq)) == null) {
            return true;
        }
        qorVar.hnj();
        hnjVar.hnj(new com.bytedance.sdk.component.sk.hn.qor.gjv().hnj(qorVar, bitmapHnj, null, false));
        return false;
    }

    private boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar) {
        int iDnm = qorVar.dnm();
        return iDnm == 1 || iDnm == 2;
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public String hnj() {
        return "bitmap_cache";
    }
}
