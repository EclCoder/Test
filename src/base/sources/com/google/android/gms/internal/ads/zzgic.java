package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgic implements zzgiw {
    private final Map zza;
    private final zzaxm zzb;
    private final zzgqf zzc;
    private final long zzd;

    zzgic(zzaxm zzaxmVar, Map map, zzgdf zzgdfVar, zzgqh zzgqhVar) {
        this.zza = map;
        this.zzb = zzaxmVar;
        this.zzc = zzgqhVar.zza(Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
        this.zzd = zzgdfVar.zzl();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zza();
        return null;
    }

    public final Void zza() {
        zzaym zzaymVar;
        try {
            try {
                this.zzc.zza();
                ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzaymVar = (zzaym) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzaxm zzaxmVar = this.zzb;
                    synchronized (zzaxmVar) {
                        zzaxmVar.zzad(zzaymVar.zzh());
                        zzaxmVar.zzN(zzaymVar.zzd());
                    }
                }
            } catch (Throwable th2) {
                this.zzc.zzc();
                throw th2;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e10) {
            this.zzc.zzb(e10);
        }
        this.zzc.zzc();
        return null;
    }
}
