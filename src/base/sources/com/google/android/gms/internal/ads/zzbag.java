package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbag implements Runnable {
    final /* synthetic */ zzbah zza;

    zzbag(zzbah zzbahVar) {
        Objects.requireNonNull(zzbahVar);
        this.zza = zzbahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar = this.zza;
        synchronized (zzbahVar.zzp()) {
            if (zzbahVar.zzq()) {
                return;
            }
            zzbahVar.zzr(true);
            try {
                zzbahVar.zzn();
            } catch (Exception e10) {
                this.zza.zzo().zzc(2023, -1L, e10);
            }
            zzbah zzbahVar2 = this.zza;
            synchronized (zzbahVar2.zzp()) {
                zzbahVar2.zzr(false);
            }
        }
    }
}
