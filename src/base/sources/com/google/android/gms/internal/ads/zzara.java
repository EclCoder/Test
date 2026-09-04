package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzara implements zzaqt {
    final /* synthetic */ zzard zza;
    private final zzes zzb;

    public zzara(zzard zzardVar) {
        Objects.requireNonNull(zzardVar);
        this.zza = zzardVar;
        this.zzb = new zzes(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(zzet zzetVar) {
        if (zzetVar.zzs() == 0 && (zzetVar.zzs() & 128) != 0) {
            zzetVar.zzk(6);
            int iZzd = zzetVar.zzd() / 4;
            for (int i10 = 0; i10 < iZzd; i10++) {
                zzes zzesVar = this.zzb;
                zzetVar.zzl(zzesVar, 4);
                int iZzj = zzesVar.zzj(16);
                zzesVar.zzh(3);
                if (iZzj == 0) {
                    zzesVar.zzh(13);
                } else {
                    int iZzj2 = zzesVar.zzj(13);
                    zzard zzardVar = this.zza;
                    if (zzardVar.zzj().get(iZzj2) == null) {
                        zzardVar.zzj().put(iZzj2, new zzaqu(new zzarb(zzardVar, iZzj2)));
                        zzardVar.zzo(zzardVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
    }
}
