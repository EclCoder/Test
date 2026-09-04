package com.bytedance.sdk.openadsdk.core.orl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    private final String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final URL f14150hn;
    private final String hnj;
    private final String qor;

    private ta(String str, String str2, String str3, String str4) {
        this.hnj = str2;
        this.f14150hn = new URL(str);
        this.qor = str3;
        this.gjv = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        if (hnj(this.hnj, taVar.hnj) && hnj(this.f14150hn, taVar.f14150hn) && hnj(this.qor, taVar.qor)) {
            return hnj(this.gjv, taVar.gjv);
        }
        return false;
    }

    public int hashCode() {
        String str = this.hnj;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f14150hn.hashCode()) * 31;
        String str2 = this.qor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.gjv;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String hn() {
        return this.qor;
    }

    public String hnj() {
        return this.hnj;
    }

    public URL qor() {
        return this.f14150hn;
    }

    private boolean hnj(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static ta hnj(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ta(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ta hnj(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new ta(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<ta> hnj(JSONArray jSONArray) {
        HashSet<ta> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(hnj(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
