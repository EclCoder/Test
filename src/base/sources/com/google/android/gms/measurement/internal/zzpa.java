package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzpa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzpb zzd;

    zzpa(zzpb zzpbVar, String str, String str2, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        Objects.requireNonNull(zzpbVar);
        this.zzd = zzpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zzd.zza;
        zzpp zzppVarZzt = zzpgVar.zzt();
        long jCurrentTimeMillis = zzpgVar.zzba().currentTimeMillis();
        long jElapsedRealtime = zzpgVar.zzd().zzp(null, zzfy.zzbe) ? zzpgVar.zzba().elapsedRealtime() : 0L;
        Bundle bundle = this.zzc;
        String str = this.zzb;
        String str2 = this.zza;
        zzpgVar.zzD((zzbh) Preconditions.checkNotNull(zzppVarZzt.zzaf(str2, str, bundle, "auto", jCurrentTimeMillis, jElapsedRealtime, false, true)), str2);
    }
}
