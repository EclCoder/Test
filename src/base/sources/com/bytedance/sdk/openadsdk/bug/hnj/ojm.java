package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13268hn;
    private final ua hnj;

    public ojm(ua uaVar, String str) {
        this.hnj = uaVar;
        this.f13268hn = str;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj("endcardDynamicCreatives", new ojm(uaVar, "endcardDynamicCreatives"));
        fcVar.hnj("multiOpenCovert", new ojm(uaVar, "multiOpenCovert"));
        fcVar.hnj("skipToNextAd", new ojm(uaVar, "skipToNextAd"));
        fcVar.hnj("speedVideoOrTimer", new ojm(uaVar, "speedVideoOrTimer"));
        fcVar.hnj("openPlayable", new ojm(uaVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        if ("endcardDynamicCreatives".equals(this.f13268hn)) {
            return this.hnj.ojm(jSONObject);
        }
        if ("multiOpenCovert".equals(this.f13268hn)) {
            this.hnj.ta(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.f13268hn)) {
            this.hnj.hnj(jSONObject, this.f13268hn);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.f13268hn)) {
            return this.hnj.aq(jSONObject);
        }
        if ("openPlayable".equals(this.f13268hn)) {
            return this.hnj.dse(jSONObject);
        }
        return null;
    }
}
