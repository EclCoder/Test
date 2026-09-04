package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tu implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene hnj;

    public tu(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.hnj = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        tgn.hnj(1, this.hnj, i10);
        return com.bytedance.sdk.component.utils.hnj.hnj(jSONObject);
    }
}
