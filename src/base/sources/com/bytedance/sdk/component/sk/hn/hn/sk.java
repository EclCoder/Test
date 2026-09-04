package com.bytedance.sdk.component.sk.hn.hn;

import com.bytedance.sdk.component.sk.xn;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements dkl {
    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, xn xnVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        List<com.bytedance.sdk.component.sk.hn.qor.qor> copyOnWriteArrayList;
        String strXn = qorVar.xn();
        Map<String, List<com.bytedance.sdk.component.sk.hn.qor.qor>> mapOjm = qorVar.jip().ojm();
        qorVar.dnm();
        qorVar.hnj();
        synchronized (mapOjm) {
            try {
                copyOnWriteArrayList = mapOjm.get(strXn);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapOjm.put(strXn, copyOnWriteArrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(qorVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            qorVar.dnm();
            qorVar.hnj();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public String hnj() {
        return "check_duplicate";
    }
}
