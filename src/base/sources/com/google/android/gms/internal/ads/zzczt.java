package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczt implements com.google.android.gms.ads.internal.client.zza {
    private final zzczx zza;
    private final zzfky zzb;

    zzczt(zzczx zzczxVar, zzfky zzfkyVar) {
        this.zza = zzczxVar;
        this.zzb = zzfkyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
