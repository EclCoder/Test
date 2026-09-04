package androidx.media3.exoplayer.drm;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.c0;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
abstract class a {
    public static byte[] a(byte[] bArr) {
        return c0.f55769a >= 27 ? bArr : c0.n0(c(c0.G(bArr)));
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] b(byte[] bArr) {
        if (c0.f55769a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(c0.G(bArr));
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
            return c0.n0(sb2.toString());
        } catch (JSONException e10) {
            w1.n.d(NpmRNZ.LJYAfpwFR, "Failed to adjust response data: " + c0.G(bArr), e10);
            return bArr;
        }
    }
}
