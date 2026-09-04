package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcb {
    private final Context zza;
    private final zzfky zzb;
    private final Bundle zzc;
    private final zzfkr zzd;
    private final zzdbu zze;
    private final zzelx zzf;

    /* synthetic */ zzdcb(zzdca zzdcaVar, byte[] bArr) {
        this.zza = zzdcaVar.zzh();
        this.zzb = zzdcaVar.zzi();
        this.zzc = zzdcaVar.zzj();
        this.zzd = zzdcaVar.zzk();
        this.zze = zzdcaVar.zzl();
        this.zzf = zzdcaVar.zzm();
    }

    final zzdca zza() {
        zzdca zzdcaVar = new zzdca();
        zzdcaVar.zza(this.zza);
        zzdcaVar.zzb(this.zzb);
        zzdcaVar.zzc(this.zzc);
        zzdcaVar.zzd(this.zze);
        zzdcaVar.zzg(this.zzf);
        return zzdcaVar;
    }

    final zzfky zzb() {
        return this.zzb;
    }

    final zzfkr zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzdbu zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzelx zzg(String str) {
        zzelx zzelxVar = this.zzf;
        return zzelxVar != null ? zzelxVar : new zzelx(str);
    }
}
