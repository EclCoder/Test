package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepx implements zzelu {
    private final Map zza = new HashMap();
    private final zzdxc zzb;

    public zzepx(zzdxc zzdxcVar) {
        this.zzb = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final zzelv zza(String str, JSONObject jSONObject) {
        zzelv zzelvVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzelvVar = (zzelv) map.get(str);
                if (zzelvVar == null) {
                    zzelvVar = new zzelv(this.zzb.zza(str, jSONObject), new zzeni(), str);
                    map.put(str, zzelvVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzelvVar;
    }
}
