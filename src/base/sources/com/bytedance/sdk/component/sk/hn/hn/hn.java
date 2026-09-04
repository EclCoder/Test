package com.bytedance.sdk.component.sk.hn.hn;

import android.text.TextUtils;
import com.bytedance.sdk.component.sk.xn;
import com.bytedance.sdk.component.utils.jip;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements dkl {
    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, xn xnVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        if (TextUtils.isEmpty(qorVar.aq())) {
            String strHnj = hnj(qorVar);
            qorVar.hn(strHnj);
            qorVar.hnj(strHnj);
        }
        qorVar.hnj();
        return true;
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public String hnj() {
        return "generate_key";
    }

    private String hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar) {
        return jip.hnj(qorVar.hnj());
    }
}
