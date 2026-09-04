package com.google.android.gms.internal.ads;

import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbuw {
    public final List zza;

    public zzbuw(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                zzbuv zzbuvVar = new zzbuv(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(zzbuvVar.zzc);
                arrayList.add(zzbuvVar);
                if (i10 < 0) {
                    Iterator it = zzbuvVar.zza.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i10 = i11;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbux.zza(jSONObjectOptJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbux.zza(jSONObjectOptJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbux.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbux.zza(jSONObjectOptJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbux.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong(ToolBar.REFRESH, -1L);
            zzccb.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean(lkCBSIFlvmyGX.nenNPNcnTC, false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
