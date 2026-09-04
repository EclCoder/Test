package com.google.android.gms.internal.measurement;

import fl.g0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwz implements Runnable {
    final /* synthetic */ k0 zza;
    final /* synthetic */ zzws zzb;
    final /* synthetic */ Runnable zzc;

    zzwz(k0 k0Var, zzws zzwsVar, Runnable runnable) {
        this.zza = k0Var;
        this.zzb = zzwsVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.zza.f43597a) != null) {
            throw null;
        }
        zzws zzwsVar = this.zzb;
        s.f(zzwsVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.zzc;
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            runnable.run();
            g0 g0Var = g0.f38750a;
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
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
        Runnable runnable = this.zzc;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
