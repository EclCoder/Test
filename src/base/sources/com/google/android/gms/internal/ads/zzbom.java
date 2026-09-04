package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbom implements zzbpq {
    zzbom() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcku zzckuVar = (zzcku) obj;
        zzblr zzblrVarZzar = zzckuVar.zzar();
        if (zzblrVarZzar == null || (jSONObjectZzd = zzblrVarZzar.zzd()) == null) {
            zzckuVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzckuVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
