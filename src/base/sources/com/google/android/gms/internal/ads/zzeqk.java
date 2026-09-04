package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeqk extends zzcbz {
    final /* synthetic */ zzdfc zza;
    final /* synthetic */ zzdcp zzb;
    final /* synthetic */ zzddy zzc;
    final /* synthetic */ zzdlh zzd;

    zzeqk(zzeql zzeqlVar, zzdfc zzdfcVar, zzdcp zzdcpVar, zzddy zzddyVar, zzdlh zzdlhVar) {
        this.zza = zzdfcVar;
        this.zzb = zzdcpVar;
        this.zzc = zzddyVar;
        this.zzd = zzdlhVar;
        Objects.requireNonNull(zzeqlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzk(IObjectWrapper iObjectWrapper, zzccb zzccbVar) {
        this.zzd.zzb(zzccbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzf(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzm(IObjectWrapper iObjectWrapper, int i10) {
    }
}
