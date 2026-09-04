package com.bytedance.sdk.openadsdk.core.orl;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor {
    private long dnm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f14109ta;

    public hn(int i10, int i11, long j10, long j11, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar, String str, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list2, String str2) {
        super(i10, i11, enumC0231hnj, hnVar, str, list, list2, str2);
        this.f14109ta = j10;
        this.dnm = j11;
        this.ojm = "icon_click";
    }

    public static hn hnj(JSONObject jSONObject) {
        qor qorVarHn = qor.hn(jSONObject);
        if (qorVarHn == null) {
            return null;
        }
        return new hn(qorVarHn.hnj, qorVarHn.f14132hn, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), qorVarHn.qor, qorVarHn.gjv, qorVarHn.f14133sk, qorVarHn.dkl, qorVarHn.dse, qorVarHn.aq);
    }
}
