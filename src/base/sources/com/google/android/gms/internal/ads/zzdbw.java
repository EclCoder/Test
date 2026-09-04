package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbw {
    private final zzfpk zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzimo zzg;
    private final String zzh;
    private final zzfcn zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfky zzk;
    private final zzdik zzl;

    zzdbw(zzfpk zzfpkVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzimo zzimoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfcn zzfcnVar, zzfky zzfkyVar, zzdik zzdikVar) {
        this.zza = zzfpkVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzimoVar;
        this.zzh = str2;
        this.zzi = zzfcnVar;
        this.zzj = zzgVar;
        this.zzk = zzfkyVar;
        this.zzl = zzdikVar;
    }

    public final ListenableFuture zza(Bundle bundle) {
        this.zzl.zza();
        zzfpe zzfpeVar = zzfpe.SIGNALS;
        zzfpk zzfpkVar = this.zza;
        Objects.requireNonNull(zzfpkVar);
        return zzfov.zza(this.zzi.zza(new Bundle(), bundle), zzfpeVar, zzfpkVar).zzi();
    }

    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcN)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture listenableFutureZza = zza(bundle);
        return this.zza.zzb(zzfpe.REQUEST_PARCEL, listenableFutureZza, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureZza, bundle);
            }
        }).zzi();
    }

    final /* synthetic */ zzcbd zzc(ListenableFuture listenableFuture, Bundle bundle) {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhX)).booleanValue() && this.zzj.zzx()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzcbd(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z11, this.zzk.zza(), bundle);
    }
}
