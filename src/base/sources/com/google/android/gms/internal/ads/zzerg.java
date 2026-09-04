package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzerg implements zzels {
    private final zzbjl zza;
    private final zzhcg zzb;
    private final zzfpk zzc;
    private final zzerp zzd;

    public zzerg(zzfpk zzfpkVar, zzhcg zzhcgVar, zzbjl zzbjlVar, zzerp zzerpVar) {
        this.zzc = zzfpkVar;
        this.zzb = zzhcgVar;
        this.zza = zzbjlVar;
        this.zzd = zzerpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(zzfkq zzfkqVar, zzfkf zzfkfVar) {
        zzfkk zzfkkVar;
        return (this.zza == null || (zzfkkVar = zzfkfVar.zzs) == null || zzfkkVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final ListenableFuture zzb(zzfkq zzfkqVar, zzfkf zzfkfVar) {
        zzcfw zzcfwVar = new zzcfw();
        zzerl zzerlVar = new zzerl();
        zzerlVar.zzd(new zzere(this, zzcfwVar, zzfkqVar, zzfkfVar, zzerlVar));
        zzfkk zzfkkVar = zzfkfVar.zzs;
        final zzbjg zzbjgVar = new zzbjg(zzerlVar, zzfkkVar.zzb, zzfkkVar.zza);
        zzfpe zzfpeVar = zzfpe.CUSTOM_RENDER_SYN;
        zzfpk zzfpkVar = this.zzc;
        Objects.requireNonNull(zzfpkVar);
        return zzfov.zzd(new zzfoq() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // com.google.android.gms.internal.ads.zzfoq
            public final /* synthetic */ void zza() {
                this.zza.zzc(zzbjgVar);
            }
        }, this.zzb, zzfpeVar, zzfpkVar).zzj(zzfpe.CUSTOM_RENDER_ACK).zze(zzcfwVar).zzi();
    }

    final /* synthetic */ void zzc(zzbjg zzbjgVar) {
        this.zza.zze(zzbjgVar);
    }

    final /* synthetic */ zzerp zzd() {
        return this.zzd;
    }
}
