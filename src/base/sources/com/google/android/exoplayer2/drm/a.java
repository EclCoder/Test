package com.google.android.exoplayer2.drm;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import ob.r0;
import ob.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class a {
    public static byte[] a(byte[] bArr) {
        return r0.f48425a >= 27 ? bArr : r0.q0(c(r0.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (r0.f48425a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(r0.E(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return r0.q0(sb2.toString());
        } catch (JSONException e10) {
            u.d("ClearKeyUtil", "Failed to adjust response data: " + r0.E(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
