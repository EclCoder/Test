package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuc implements zzbub {
    private final Context zza;
    private final zzben zzb;
    private final PowerManager zzc;

    public zzcuc(Context context, zzben zzbenVar) {
        this.zza = context;
        this.zzb = zzbenVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcuf zzcufVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbep zzbepVar = zzcufVar.zzf;
        if (zzbepVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzben zzbenVar = this.zzb;
            if (zzbenVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zzbepVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbenVar.zzb()).put("activeViewJSON", zzbenVar.zzc()).put(CampaignEx.JSON_KEY_TIMESTAMP, zzcufVar.zzd).put("adFormat", zzbenVar.zza()).put("hashCode", zzbenVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcufVar.zzb).put("isNative", zzbenVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            jSONObjectPut.put("deviceVolume", com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbepVar.zzb).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbepVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put(TtmlNode.LEFT, rect.left).put(TtmlNode.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbepVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbepVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put(TtmlNode.LEFT, rect3.left).put(TtmlNode.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zzbepVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbepVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put(TtmlNode.LEFT, rect4.left).put(TtmlNode.RIGHT, rect4.right)).put("localVisibleBoxVisible", zzbepVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbepVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put(TtmlNode.LEFT, rect5.left).put(TtmlNode.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcufVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcb)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbepVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put(TtmlNode.LEFT, rect6.left).put(TtmlNode.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcufVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
