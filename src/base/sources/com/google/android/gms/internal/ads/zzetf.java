package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetf implements zzdfi {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfhl.zza(this.zza, new zzfhk() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }
}
