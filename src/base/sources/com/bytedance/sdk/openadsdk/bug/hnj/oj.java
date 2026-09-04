package com.bytedance.sdk.openadsdk.bug.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.sq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj extends com.bytedance.sdk.component.hnj.oj<JSONObject, JSONObject> {
    public static final HashSet<String> hnj = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f13267hn;

    public oj(as asVar) {
        this.f13267hn = asVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, as asVar) {
        fcVar.hnj(hnj, new oj(asVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) throws JSONException {
        String strTmb;
        as asVar = this.f13267hn;
        if (asVar == null || (strTmb = asVar.tmb()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b10 = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b10 = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b10 = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
                String strOptString = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString) && sq.hnj().hn(strTmb, strOptString)) {
                    jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, sq.hnj().hnj(strTmb, strOptString));
                    jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case 1:
                sq.hnj().hnj(strTmb);
                jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (strOptString2 != null) {
                    sq.hnj().hnj(strTmb, strOptString2, strOptString3);
                    jSONObject2.put("code", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", sq.hnj().qor(strTmb, strOptString4) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
