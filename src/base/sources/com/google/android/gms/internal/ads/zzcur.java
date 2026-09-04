package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcur implements zzimu {
    private final zzind zza;

    private zzcur(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzcur zza(zzind zzindVar) {
        return new zzcur(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcyk) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
