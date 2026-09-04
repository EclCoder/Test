package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbqk implements zzbpq {
    private final Context zza;

    public zzbqk(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(CampaignEx.JSON_KEY_TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(CampaignEx.JSON_KEY_TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(this.zza, intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
