package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdln extends zzdip {
    zzdln(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdlk) obj).zzd(zzbcVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdlk) obj).zze(str);
            }
        });
    }
}
