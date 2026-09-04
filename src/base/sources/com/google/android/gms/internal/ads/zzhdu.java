package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdu {
    private boolean zza;
    private final zzheh zzc;
    private final zzhds zzb = zzhds.zza;
    private zzhdv zzd = null;
    private zzhdw zze = null;

    /* synthetic */ zzhdu(zzheh zzhehVar, byte[] bArr) {
        this.zzc = zzhehVar;
    }

    public final zzhdu zza() {
        zzhdw zzhdwVar = this.zze;
        if (zzhdwVar != null) {
            zzhdwVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhdu zzb() {
        this.zzd = zzhdv.zza;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z10) {
        this.zza = false;
    }

    final /* synthetic */ zzhds zze() {
        return this.zzb;
    }

    final /* synthetic */ zzheh zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhdv zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhdw zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhdw zzhdwVar) {
        this.zze = zzhdwVar;
    }
}
