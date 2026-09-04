package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaku implements zzakt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaku(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j12;
        this.zze = i10;
    }

    public static zzaku zze(long j10, long j11, zzagv zzagvVar, zzet zzetVar) {
        int iZzs;
        zzet zzetVar2 = zzetVar;
        zzetVar2.zzk(6);
        int iZzB = zzetVar2.zzB();
        long j12 = zzagvVar.zzc;
        long j13 = iZzB;
        int iZzB2 = zzetVar2.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzt = zzfl.zzt((((long) iZzB2) * ((long) zzagvVar.zzg)) - 1, zzagvVar.zzd);
        int iZzt = zzetVar2.zzt();
        int iZzt2 = zzetVar2.zzt();
        int iZzt3 = zzetVar2.zzt();
        zzetVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i10 = 0;
        long j14 = j11 + ((long) zzagvVar.zzc);
        while (i10 < iZzt) {
            long j15 = j12;
            jArr[i10] = (((long) i10) * jZzt) / ((long) iZzt);
            jArr2[i10] = j14;
            if (iZzt3 == 1) {
                iZzs = zzetVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzetVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzetVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzetVar2.zzH();
            }
            j14 += ((long) iZzs) * ((long) iZzt2);
            i10++;
            zzetVar2 = zzetVar;
            iZzt = iZzt;
            j12 = j15;
        }
        long j16 = j11 + j12;
        long jMax = j16 + j13;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(jMax).length());
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(jMax);
            zzeg.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j14) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j14).length() + 28);
            sb3.append("VBRI bytes and ToC mismatch (using max): ");
            sb3.append(jMax);
            sb3.append(", ");
            sb3.append(j14);
            sb3.append("\nSeeking will be inaccurate.");
            zzeg.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j14);
        }
        return new zzaku(jArr, jArr2, jZzt, j16, jMax, zzagvVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        long[] jArr = this.zza;
        int iZzo = zzfl.zzo(jArr, j10, true, true);
        long j11 = jArr[iZzo];
        long[] jArr2 = this.zzb;
        zzahc zzahcVar = new zzahc(j11, jArr2[iZzo]);
        if (zzahcVar.zzb >= j10 || iZzo == jArr.length - 1) {
            return new zzagz(zzahcVar, zzahcVar);
        }
        int i10 = iZzo + 1;
        return new zzagz(zzahcVar, new zzahc(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j10) {
        return this.zza[zzfl.zzo(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return this.zze;
    }
}
