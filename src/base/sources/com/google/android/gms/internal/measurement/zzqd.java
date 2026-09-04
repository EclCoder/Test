package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzqd implements zzpm {
    final /* synthetic */ zzqe zza;
    private final zzqm zzb;

    zzqd(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.zza = zzqeVar;
        this.zzb = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zza(zzpl zzplVar) {
        Iterator it = this.zza.zzc().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).zza(zzplVar.zza()) && !z10) {
                this.zzb.zza();
                z10 = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zzb(Throwable th2) {
    }
}
