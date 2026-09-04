package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahl {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzafz zzafzVar) {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzafzVar.zzi(bArr, 0, 10);
        zzafzVar.zzl();
        int i10 = zzaey.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzahk zzahkVar, long j10, int i10, int i11, int i12, zzahj zzahjVar) {
        zzgtj.zzj(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zzd(zzahkVar, zzahjVar);
            }
        }
    }

    public final void zzd(zzahk zzahkVar, zzahj zzahjVar) {
        if (this.zzc > 0) {
            zzahkVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahjVar);
            this.zzc = 0;
        }
    }
}
