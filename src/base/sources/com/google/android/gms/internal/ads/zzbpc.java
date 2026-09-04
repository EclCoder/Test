package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbpc implements zzbpq {
    zzbpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcku zzckuVar = (zzcku) obj;
        String str = (String) map.get("action");
        if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
            zzckuVar.zzdk();
        } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str)) {
            zzckuVar.zzdl();
        }
    }
}
