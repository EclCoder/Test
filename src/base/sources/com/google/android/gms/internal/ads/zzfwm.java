package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwm {
    private JSONObject zza;
    private final zzfwv zzb;

    public zzfwm(zzfwv zzfwvVar) {
        this.zzb = zzfwvVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfwy(this, hashSet, jSONObject, j10));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfwx(this, hashSet, jSONObject, j10));
    }

    public final void zzc() {
        this.zzb.zza(new zzfww(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
