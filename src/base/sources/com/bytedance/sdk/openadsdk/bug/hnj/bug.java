package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.ua;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends com.bytedance.sdk.component.hnj.oj<JSONObject, JSONObject> {
    private static final HashSet<String> hnj = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ua f13263hn;

    public bug(ua uaVar) {
        this.f13263hn = uaVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj(hnj, new bug(uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.f13263hn.jip();
                return null;
            case "popupShow":
                this.f13263hn.fc();
                return null;
            case "getCurrentCountdownStatus":
                return this.f13263hn.uua();
            case "popupRenderDidFinish":
                this.f13263hn.oj();
                return null;
            case "changeCountdownStatus":
                this.f13263hn.dnm(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
