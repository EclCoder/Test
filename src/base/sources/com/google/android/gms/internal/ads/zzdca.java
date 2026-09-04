package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdca {
    private Context zza;
    private zzfky zzb;
    private Bundle zzc;
    private zzfkr zzd;
    private zzdbu zze;
    private zzelx zzf;

    public final zzdca zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdca zzb(zzfky zzfkyVar) {
        this.zzb = zzfkyVar;
        return this;
    }

    public final zzdca zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdca zzd(zzdbu zzdbuVar) {
        this.zze = zzdbuVar;
        return this;
    }

    public final zzdcb zze() {
        return new zzdcb(this, null);
    }

    public final zzdca zzf(zzfkr zzfkrVar) {
        this.zzd = zzfkrVar;
        return this;
    }

    public final zzdca zzg(zzelx zzelxVar) {
        this.zzf = zzelxVar;
        return this;
    }

    final /* synthetic */ Context zzh() {
        return this.zza;
    }

    final /* synthetic */ zzfky zzi() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzfkr zzk() {
        return this.zzd;
    }

    final /* synthetic */ zzdbu zzl() {
        return this.zze;
    }

    final /* synthetic */ zzelx zzm() {
        return this.zzf;
    }
}
