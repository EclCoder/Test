package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.j;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwy implements j {
    final /* synthetic */ zzws zza;
    final /* synthetic */ j zzb;

    zzwy(zzws zzwsVar, j jVar) {
        this.zza = zzwsVar;
        this.zzb = jVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final ListenableFuture apply(Object obj) {
        zzws zzwsVar = this.zza;
        s.e(zzwsVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            ListenableFuture listenableFutureApply = this.zzb.apply(obj);
            if (listenableFutureApply == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
            return listenableFutureApply;
        } catch (Throwable th2) {
            try {
                zzvu.zza(th2);
                throw th2;
            } catch (Throwable th3) {
                zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
                throw th3;
            }
        }
    }

    public final String toString() {
        j jVar = this.zzb;
        StringBuilder sb2 = new StringBuilder(jVar.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(jVar);
        sb2.append("]");
        return sb2.toString();
    }
}
