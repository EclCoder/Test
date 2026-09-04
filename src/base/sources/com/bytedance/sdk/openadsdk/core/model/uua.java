package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f14006hn;
    private hnj hnj;

    public uua(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.hnj = new hnj(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.f14006hn = new hnj(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static hnj hn(as asVar) {
        uua uuaVarDms;
        if (asVar == null || (uuaVarDms = asVar.dms()) == null) {
            return null;
        }
        return uuaVarDms.f14006hn;
    }

    public static boolean hnj(as asVar) {
        return hnj(asVar, false);
    }

    public static hnj qor(as asVar) {
        uua uuaVarDms;
        if (asVar == null || (uuaVarDms = asVar.dms()) == null) {
            return null;
        }
        return uuaVarDms.hnj;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        C0225hnj f14007hn;
        C0225hnj hnj;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.uua$hnj$hnj, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class C0225hnj {
            String hnj;

            public C0225hnj(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.hnj = jSONObject.optString("entry");
            }

            public boolean hnj() {
                return !TextUtils.isEmpty(this.hnj);
            }
        }

        public hnj(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.hnj = new C0225hnj(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.f14007hn = new C0225hnj(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean hnj() {
            C0225hnj c0225hnj = this.f14007hn;
            if (c0225hnj != null && c0225hnj.hnj()) {
                return true;
            }
            C0225hnj c0225hnj2 = this.hnj;
            return c0225hnj2 != null && c0225hnj2.hnj();
        }

        public String hnj(boolean z10) {
            if (z10) {
                C0225hnj c0225hnj = this.hnj;
                if (c0225hnj != null) {
                    return c0225hnj.hnj;
                }
                return "";
            }
            C0225hnj c0225hnj2 = this.f14007hn;
            if (c0225hnj2 != null) {
                return c0225hnj2.hnj;
            }
            return "";
        }
    }

    public static boolean hnj(as asVar, boolean z10) {
        uua uuaVarDms;
        if (asVar == null || (uuaVarDms = asVar.dms()) == null) {
            return false;
        }
        if (z10) {
            hnj hnjVar = uuaVarDms.f14006hn;
            return hnjVar != null && hnjVar.hnj();
        }
        hnj hnjVar2 = uuaVarDms.hnj;
        return hnjVar2 != null && hnjVar2.hnj();
    }
}
