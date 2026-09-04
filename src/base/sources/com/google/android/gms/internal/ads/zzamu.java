package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamu {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzet zzg = new zzet(255);

    zzamu() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzafz zzafzVar, long j10) {
        zzgtj.zza(zzafzVar.zzn() == zzafzVar.zzm());
        zzet zzetVar = this.zzg;
        zzetVar.zza(4);
        while (true) {
            if ((j10 != -1 && zzafzVar.zzn() + 4 >= j10) || !zzagc.zze(zzafzVar, zzetVar.zzi(), 0, 4, true)) {
                break;
            }
            zzetVar.zzh(0);
            if (zzetVar.zzz() == 1332176723) {
                zzafzVar.zzl();
                return true;
            }
            zzafzVar.zzf(1);
        }
        do {
            if (j10 != -1 && zzafzVar.zzn() >= j10) {
                break;
            }
        } while (zzafzVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzafz zzafzVar, boolean z10) throws zzat {
        zza();
        zzet zzetVar = this.zzg;
        zzetVar.zza(27);
        if (zzagc.zze(zzafzVar, zzetVar.zzi(), 0, 27, z10) && zzetVar.zzz() == 1332176723) {
            if (zzetVar.zzs() != 0) {
                if (z10) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzetVar.zzs();
            this.zzb = zzetVar.zzE();
            zzetVar.zzA();
            zzetVar.zzA();
            zzetVar.zzA();
            int iZzs = zzetVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzetVar.zza(iZzs);
            if (zzagc.zze(zzafzVar, zzetVar.zzi(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzetVar.zzs();
                    iArr[i10] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
