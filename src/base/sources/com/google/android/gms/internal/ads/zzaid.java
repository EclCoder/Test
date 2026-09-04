package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaid implements zzafj {
    private final zzagl zza;
    private final int zzb;
    private final zzagf zzc = new zzagf();

    /* synthetic */ zzaid(zzagl zzaglVar, int i10, byte[] bArr) {
        this.zza = zzaglVar;
        this.zzb = i10;
    }

    private final long zzc(zzafz zzafzVar) {
        while (zzafzVar.zzm() < zzafzVar.zzo() - 6) {
            zzagl zzaglVar = this.zza;
            int i10 = this.zzb;
            zzagf zzagfVar = this.zzc;
            long jZzm = zzafzVar.zzm();
            zzet zzetVar = new zzet(17);
            zzafzVar.zzi(zzetVar.zzi(), 0, 2);
            if (zzetVar.zzo() != i10) {
                zzafzVar.zzl();
                zzafzVar.zzk((int) (jZzm - zzafzVar.zzn()));
            } else {
                zzetVar.zzf(zzagc.zzb(zzafzVar, zzetVar.zzi(), 2, 15) + 2);
                zzafzVar.zzl();
                zzafzVar.zzk((int) (jZzm - zzafzVar.zzn()));
                if (zzagg.zza(zzetVar, zzaglVar, i10, zzagfVar)) {
                    break;
                }
            }
            zzafzVar.zzk(1);
        }
        if (zzafzVar.zzm() < zzafzVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzafzVar.zzk((int) (zzafzVar.zzo() - zzafzVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final zzafi zza(zzafz zzafzVar, long j10) {
        long jZzn = zzafzVar.zzn();
        long jZzc = zzc(zzafzVar);
        long jZzm = zzafzVar.zzm();
        zzafzVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzafzVar);
        long jZzm2 = zzafzVar.zzm();
        if (jZzc > j10 || jZzc2 <= j10) {
            return jZzc2 <= j10 ? zzafi.zzb(jZzc2, jZzm2) : zzafi.zza(jZzc, jZzn);
        }
        return zzafi.zzc(jZzm);
    }
}
