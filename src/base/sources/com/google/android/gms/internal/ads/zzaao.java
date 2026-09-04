package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaao extends zzaaq implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaao(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12, String str, String str2) {
        int iZzj;
        super(i10, zzbgVar, i11);
        int i13 = 0;
        this.zzf = zznc.zzac(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzaamVar.zzC;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzgwm zzgwmVarZzj = str2 != null ? zzgwm.zzj(str2) : zzaamVar.zzy.isEmpty() ? zzgwm.zzj("") : zzaamVar.zzy;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgwmVarZzj.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaay.zzj(this.zzd, (String) zzgwmVarZzj.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzj;
        int iZzm = zzaay.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzaay.zzn(zzvVar, zzaamVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaay.zzj(this.zzd, str, zzaay.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z10 = iZzj > 0 || (zzaamVar.zzy.isEmpty() && iZzm > 0) || ((zzaamVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (zznc.zzac(i12, zzaamVar.zzV) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaao zzaaoVar) {
        zzgvz zzgvzVarZza = zzgvz.zzg().zzd(this.zzf, zzaaoVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaaoVar.zzi), zzgyg.zzb().zza());
        int i10 = this.zzj;
        zzgvz zzgvzVarZzb = zzgvzVarZza.zzb(i10, zzaaoVar.zzj);
        int i11 = this.zzk;
        zzgvz zzgvzVarZzb2 = zzgvzVarZzb.zzb(i11, zzaaoVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaaoVar.zzl), zzgyg.zzb().zza()).zzd(this.zzg, zzaaoVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaaoVar.zzh), i10 == 0 ? zzgyg.zzb() : zzgyg.zzb().zza()).zzb(this.zzm, zzaaoVar.zzm);
        if (i11 == 0) {
            zzgvzVarZzb2 = zzgvzVarZzb2.zzc(this.zzn, zzaaoVar.zzn);
        }
        return zzgvzVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        return false;
    }
}
