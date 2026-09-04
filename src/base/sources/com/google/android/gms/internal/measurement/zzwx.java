package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.i;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwx implements i {
    final /* synthetic */ zzws zza;
    final /* synthetic */ i zzb;

    zzwx(zzws zzwsVar, i iVar) {
        this.zza = zzwsVar;
        this.zzb = iVar;
    }

    @Override // com.google.common.util.concurrent.i
    public final ListenableFuture call() {
        zzws zzwsVar = this.zza;
        s.e(zzwsVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            ListenableFuture listenableFutureCall = this.zzb.call();
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
            s.g(listenableFutureCall, "wrapInTrace(...)");
            return listenableFutureCall;
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
        i iVar = this.zzb;
        StringBuilder sb2 = new StringBuilder(iVar.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(iVar);
        sb2.append("]");
        return sb2.toString();
    }
}
