package com.google.android.gms.internal.ads;

import androidx.collection.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqc {
    zzbnc zza;
    zzbmz zzb;
    zzbnp zzc;
    zzbnm zzd;
    zzbsk zze;
    final u zzf = new u();
    final u zzg = new u();

    public final zzdqc zza(zzbnc zzbncVar) {
        this.zza = zzbncVar;
        return this;
    }

    public final zzdqc zzb(zzbmz zzbmzVar) {
        this.zzb = zzbmzVar;
        return this;
    }

    public final zzdqc zzc(zzbnp zzbnpVar) {
        this.zzc = zzbnpVar;
        return this;
    }

    public final zzdqc zzd(zzbnm zzbnmVar) {
        this.zzd = zzbnmVar;
        return this;
    }

    public final zzdqc zze(zzbsk zzbskVar) {
        this.zze = zzbskVar;
        return this;
    }

    public final zzdqc zzf(String str, zzbni zzbniVar, zzbnf zzbnfVar) {
        this.zzf.put(str, zzbniVar);
        if (zzbnfVar != null) {
            this.zzg.put(str, zzbnfVar);
        }
        return this;
    }

    public final zzdqd zzg() {
        return new zzdqd(this, null);
    }
}
