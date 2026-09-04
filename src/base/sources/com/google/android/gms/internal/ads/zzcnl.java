package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnl {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcnl(zzcnk zzcnkVar, byte[] bArr) {
        this.zza = zzcnkVar.zzd();
        this.zzb = zzcnkVar.zze();
        this.zzd = zzcnkVar.zzg();
        this.zzc = zzcnkVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final VersionInfoParcel zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    final zzcni zzf() {
        return new zzcni(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final zzblk zzh() {
        return new zzblk(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
