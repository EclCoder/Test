package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends qor {
    private int bug;
    private int dnm;
    private int orl;

    public aq(Context context) {
        super(context);
        this.dnm = -1;
        this.bug = -1;
        this.orl = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[0]), -1);
            int iHnj2 = com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[1]), -1);
            int iHnj3 = com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.f12244sk;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                map2.put("fromIndex", Integer.valueOf(iHnj));
                map2.put("toIndex", Integer.valueOf(iHnj2));
                map2.put("type", Integer.valueOf(iHnj3));
                Iterator<com.bytedance.adsdk.ugeno.gjv.dkl.hnj> it = this.qor.hn().iterator();
                while (it.hasNext()) {
                    it.next().hn(map2);
                }
                this.hnj.hnj(this.f12243hn, this.dkl, this.qor.hn());
            } else {
                this.dnm = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("fromIndex"), -1);
                this.bug = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("toIndex"), -1);
                int iHnj4 = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("type"), -1);
                this.orl = iHnj4;
                if (iHnj == this.dnm && iHnj2 == this.bug && iHnj3 == iHnj4) {
                    this.hnj.hnj(this.f12243hn, this.dkl, this.qor.hn());
                }
            }
        }
        return false;
    }
}
