package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.ua;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends com.bytedance.sdk.component.hnj.oj<JSONObject, JSONObject> {
    public static final HashSet<String> hnj = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ua f13269hn;

    public ta(ua uaVar) {
        this.f13269hn = uaVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj(hnj, new ta(uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.f13269hn.ojm(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.f13269hn.ta(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.f13269hn.hnj(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.f13269hn.aq(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.f13269hn.dse(jSONObject);
        }
        return null;
    }
}
