package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfak implements zzfck {
    private final zzhcg zza;
    private final zzfky zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzfak(zzhcg zzhcgVar, zzfky zzfkyVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzhcgVar;
        this.zzb = zzfkyVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 26;
    }

    final /* synthetic */ zzfal zzc() {
        return new zzfal(this.zzb, this.zzc, this.zzd);
    }
}
