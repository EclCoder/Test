package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenx implements zzelu {
    private final zzdxc zza;

    public zzenx(zzdxc zzdxcVar) {
        this.zza = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final zzelv zza(String str, JSONObject jSONObject) {
        return new zzelv(this.zza.zza(str, jSONObject), new zzenh(), str);
    }
}
