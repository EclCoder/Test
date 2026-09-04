package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeie implements zzbub {
    zzeie() {
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeif zzeifVar = (zzeif) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkH)).booleanValue()) {
            zzcbf zzcbfVar = zzeifVar.zzc;
            jSONObject2.put("ad_request_url", zzcbfVar.zze());
            jSONObject2.put("ad_request_post_body", zzcbfVar.zzd());
        }
        zzcbf zzcbfVar2 = zzeifVar.zzc;
        jSONObject2.put("base_url", zzcbfVar2.zzc());
        jSONObject2.put("signals", zzeifVar.zzb);
        zzeil zzeilVar = zzeifVar.zza;
        jSONObject3.put(TtmlNode.TAG_BODY, zzeilVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zza().zzm(zzeilVar.zzb));
        jSONObject3.put("response_code", zzeilVar.zza);
        jSONObject3.put("latency", zzeilVar.zzd);
        jSONObject.put(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcbfVar2.zzh());
        return jSONObject;
    }
}
