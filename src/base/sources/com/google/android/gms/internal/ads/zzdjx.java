package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdjx extends zzdip implements zzdjz {
    public zzdjx(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zza(final String str) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjz) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzb(final String str) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjz) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzc(final String str, final String str2) {
        zzs(new zzdio() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjz) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdio(str2) { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjz) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zze() {
        zzs(zzdju.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzf() {
        zzs(zzdjv.zza);
    }
}
