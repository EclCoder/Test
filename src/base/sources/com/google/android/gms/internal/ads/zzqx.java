package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqx {
    private final zzv zza;
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqx(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzqx zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqx zzb(AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqx zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzqx zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzqx zze(int i10) {
        this.zzf = -1;
        return this;
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ int zzj() {
        return this.zze;
    }

    final /* synthetic */ int zzk() {
        return this.zzf;
    }
}
