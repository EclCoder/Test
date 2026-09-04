package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.x;
import java.util.concurrent.Executor;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zztx extends zzuw {
    private static final zzuw zza = new zztx();

    private zztx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final String zza(zzti zztiVar) {
        p.o(zztiVar);
        return "singleproc";
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final /* bridge */ /* synthetic */ zzuv zzb(zztr zztrVar, String str, Executor executor, zzru zzruVar, zzti zztiVar) {
        p.o(zztiVar);
        return new zzui(str, x.g(zztrVar.zza()), zzve.zzd(zztrVar.zzb(), zztrVar.zzf() ? zzadf.zzb() : zzadf.zza()), executor, zzruVar, zztrVar.zzc(), zzwb.zzb());
    }
}
