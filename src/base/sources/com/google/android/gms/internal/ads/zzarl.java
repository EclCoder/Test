package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzarl {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzahk[] zzc;
    private final zzgz zzd;

    public zzarl(List list, String str) {
        this.zza = list;
        this.zzc = new zzahk[list.size()];
        zzgz zzgzVar = new zzgz(new zzgy() { // from class: com.google.android.gms.internal.ads.zzark
            @Override // com.google.android.gms.internal.ads.zzgy
            public final /* synthetic */ void zza(long j10, zzet zzetVar) {
                this.zza.zzc(j10, zzetVar);
            }
        });
        this.zzd = zzgzVar;
        zzgzVar.zza(3);
    }

    public final void zza(zzagb zzagbVar, zzarh zzarhVar) {
        int i10 = 0;
        while (true) {
            zzahk[] zzahkVarArr = this.zzc;
            if (i10 >= zzahkVarArr.length) {
                return;
            }
            zzarhVar.zza();
            zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i10);
            String str = zzvVar.zzp;
            boolean z10 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z10 = false;
            }
            zzgtj.zzf(z10, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzarhVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzr(zzvVar.zzs);
            zzahkVarZzu.zzA(zztVar.zzO());
            zzahkVarArr[i10] = zzahkVarZzu;
            i10++;
        }
    }

    public final void zzb(long j10, zzet zzetVar) {
        if (zzetVar.zzd() < 9) {
            return;
        }
        int iZzB = zzetVar.zzB();
        int iZzB2 = zzetVar.zzB();
        int iZzs = zzetVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j10, zzetVar);
        }
    }

    final /* synthetic */ void zzc(long j10, zzet zzetVar) {
        zzafl.zzb(j10, zzetVar, this.zzc);
    }
}
