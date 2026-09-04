package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzen {
    final /* synthetic */ zzer zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzen(zzer zzerVar, zzel zzelVar, Executor executor) {
        Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
        this.zzb = new WeakReference(zzelVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzel zzelVar = (zzel) this.zzb.get();
        if (zzelVar != null) {
            zzelVar.zza(this.zza.zzc());
        }
    }
}
