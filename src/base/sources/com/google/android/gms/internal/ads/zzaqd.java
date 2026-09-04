package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqd implements zzapt {
    private zzahk zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzet zzb = new zzet(10);
    private long zze = C.TIME_UNSET;

    public zzaqd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzd = false;
        this.zze = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 5);
        this.zzc = zzahkVarZzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzarhVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo(MimeTypes.APPLICATION_ID3);
        zzahkVarZzu.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j10;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzetVar.zzd();
            int i10 = this.zzg;
            if (i10 < 10) {
                int iMin = Math.min(iZzd, 10 - i10);
                byte[] bArrZzi = zzetVar.zzi();
                int iZzg = zzetVar.zzg();
                zzet zzetVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzetVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzetVar2.zzh(0);
                    if (zzetVar2.zzs() != 73 || zzetVar2.zzs() != 68 || zzetVar2.zzs() != 51) {
                        zzeg.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzetVar2.zzk(3);
                        this.zzf = zzetVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzc(zzetVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        int i10;
        this.zzc.getClass();
        if (this.zzd && (i10 = this.zzf) != 0 && this.zzg == i10) {
            zzgtj.zzi(this.zze != C.TIME_UNSET);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
