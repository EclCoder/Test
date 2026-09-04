package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcl implements Callable {
    private final zzbbs zza;
    private final zzaxm zzb;

    public zzbcl(zzbbs zzbbsVar, zzaxm zzaxmVar) {
        this.zza = zzbbsVar;
        this.zzb = zzaxmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        zzbbs zzbbsVar = this.zza;
        if (zzbbsVar.zzm() != null) {
            zzbbsVar.zzm().get();
        }
        zzaym zzaymVarZzl = zzbbsVar.zzl();
        if (zzaymVarZzl == null) {
            return null;
        }
        try {
            zzaxm zzaxmVar = this.zzb;
            synchronized (zzaxmVar) {
                try {
                    zzaxmVar.zzaY(zzaymVarZzl.zzaN(), zzido.zza());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        } catch (zziet | NullPointerException unused) {
            return null;
        }
    }
}
