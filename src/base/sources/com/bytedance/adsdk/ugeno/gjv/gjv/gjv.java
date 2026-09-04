package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends qor implements com.bytedance.adsdk.ugeno.gjv.hnj.gjv {
    private com.bytedance.adsdk.ugeno.gjv.hnj.qor dnm;

    public gjv(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        com.bytedance.adsdk.ugeno.gjv.hnj.hnj hnjVarFf = this.f12243hn.ff();
        if (hnjVarFf == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.gjv.hnj.qor qorVarHnj = hnjVarFf.hnj(this.dkl);
        this.dnm = qorVarHnj;
        if (qorVarHnj != null) {
            qorVarHnj.hnj(this);
            return false;
        }
        hnjVarFf.hnj(this.dkl, new com.bytedance.adsdk.ugeno.gjv.hnj.hn());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hnj.gjv
    public void hnj(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.hnj.hnj(this.f12243hn, this.dkl, this.qor.hn());
    }
}
