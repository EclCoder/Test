package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamo implements zzamv {
    private final zzamu zza;
    private final long zzb;
    private final long zzc;
    private final zzamz zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamo(zzamz zzamzVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzgtj.zza(j10 >= 0 && j11 > j10);
        this.zzd = zzamzVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzamu();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzamv
    public final long zza(zzafz zzafzVar) throws IOException {
        long j10;
        long j11;
        long jMax;
        int i10 = this.zze;
        if (i10 == 0) {
            long jZzn = zzafzVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j12 = this.zzc - 65307;
            if (j12 > jZzn) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j13 = this.zzi;
                long j14 = this.zzj;
                if (j13 == j14) {
                    jMax = -1;
                    j11 = -1;
                } else {
                    long jZzn2 = zzafzVar.zzn();
                    zzamu zzamuVar = this.zza;
                    if (zzamuVar.zzb(zzafzVar, j14)) {
                        zzamuVar.zzc(zzafzVar, false);
                        zzafzVar.zzl();
                        long j15 = this.zzh;
                        j10 = 2;
                        long j16 = zzamuVar.zzb;
                        long j17 = j15 - j16;
                        int i11 = zzamuVar.zzd + zzamuVar.zze;
                        if (j17 < 0 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j16;
                            } else {
                                this.zzi = zzafzVar.zzn() + ((long) i11);
                                this.zzk = j16;
                            }
                            long j18 = this.zzj;
                            long j19 = this.zzi;
                            long j20 = j18 - j19;
                            if (j20 < 100000) {
                                this.zzj = j19;
                                j11 = -1;
                                jMax = j19;
                            } else {
                                long jZzn3 = zzafzVar.zzn() - (((long) i11) * (j17 <= 0 ? 2L : 1L));
                                j11 = -1;
                                String str = zzfl.zza;
                                jMax = Math.max(j19, Math.min(jZzn3 + ((j17 * j20) / (this.zzl - this.zzk)), j18 - 1));
                            }
                        } else {
                            jMax = -1;
                            j11 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j11 = -1;
                    }
                    if (jMax != j11) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j10 = 2;
                if (jMax != j11) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i10 != 3) {
                    return -1L;
                }
                j11 = -1;
                j10 = 2;
            }
            while (true) {
                zzamu zzamuVar2 = this.zza;
                zzamuVar2.zzb(zzafzVar, j11);
                zzamuVar2.zzc(zzafzVar, false);
                if (zzamuVar2.zzb > this.zzh) {
                    zzafzVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j10);
                }
                zzafzVar.zzf(zzamuVar2.zzd + zzamuVar2.zze);
                this.zzi = zzafzVar.zzn();
                this.zzk = zzamuVar2.zzb;
                j11 = -1;
            }
        }
        zzamu zzamuVar3 = this.zza;
        zzamuVar3.zza();
        if (!zzamuVar3.zzb(zzafzVar, -1L)) {
            throw new EOFException();
        }
        zzamuVar3.zzc(zzafzVar, false);
        zzafzVar.zzf(zzamuVar3.zzd + zzamuVar3.zze);
        long j21 = zzamuVar3.zzb;
        while ((zzamuVar3.zza & 4) != 4 && zzamuVar3.zzb(zzafzVar, -1L) && zzafzVar.zzn() < this.zzc && zzamuVar3.zzc(zzafzVar, true) && zzagc.zzd(zzafzVar, zzamuVar3.zzd + zzamuVar3.zze)) {
            j21 = zzamuVar3.zzb;
        }
        this.zzf = j21;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(long j10) {
        long j11 = this.zzf - 1;
        String str = zzfl.zza;
        this.zzh = Math.max(0L, Math.min(j10, j11));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final /* bridge */ /* synthetic */ zzahb zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzamn(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzamz zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
