package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzir {
    private static final zzir zza = new zzir(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzir(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzir zzc() {
        return zza;
    }

    static zzir zze(zzir zzirVar, zzir zzirVar2) {
        int i10 = zzirVar.zzb + zzirVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzirVar.zzc, i10);
        System.arraycopy(zzirVar2.zzc, 0, iArrCopyOf, zzirVar.zzb, zzirVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzirVar.zzd, i10);
        System.arraycopy(zzirVar2.zzd, 0, objArrCopyOf, zzirVar.zzb, zzirVar2.zzb);
        return new zzir(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static zzir zzf() {
        return new zzir(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzir)) {
            return false;
        }
        zzir zzirVar = (zzir) obj;
        int i10 = this.zzb;
        if (i10 == zzirVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzirVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzirVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzz;
        int iZzy2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).getClass();
                    iZzy2 = zzfx.zzy(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzfp zzfpVar = (zzfp) this.zzd[i12];
                    int iZzy3 = zzfx.zzy(i16);
                    int iZzd = zzfpVar.zzd();
                    iZzy2 = iZzy3 + zzfx.zzy(iZzd) + iZzd;
                } else if (i15 == 3) {
                    int iZzy4 = zzfx.zzy(i14 << 3);
                    iZzy = iZzy4 + iZzy4;
                    iZzz = ((zzir) this.zzd[i12]).zza();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzha("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).getClass();
                    iZzy2 = zzfx.zzy(i14 << 3) + 4;
                }
                i11 += iZzy2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzy = zzfx.zzy(i17);
                iZzz = zzfx.zzz(jLongValue);
            }
            iZzy2 = iZzy + iZzz;
            i11 += iZzy2;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzy = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzfp zzfpVar = (zzfp) this.zzd[i11];
            int iZzy2 = zzfx.zzy(8);
            int iZzy3 = zzfx.zzy(16) + zzfx.zzy(i12);
            int iZzy4 = zzfx.zzy(24);
            int iZzd = zzfpVar.zzd();
            iZzy += iZzy2 + iZzy2 + iZzy3 + iZzy4 + zzfx.zzy(iZzd) + iZzd;
        }
        this.zze = iZzy;
        return iZzy;
    }

    final zzir zzd(zzir zzirVar) {
        if (zzirVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzirVar.zzb;
        zzm(i10);
        System.arraycopy(zzirVar.zzc, 0, this.zzc, this.zzb, zzirVar.zzb);
        System.arraycopy(zzirVar.zzd, 0, this.zzd, this.zzb, zzirVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzht.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final void zzk(zzji zzjiVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzjiVar.zzx(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzji zzjiVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzjiVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzjiVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzjiVar.zzd(i12, (zzfp) obj);
                } else if (i13 == 3) {
                    zzjiVar.zzG(i12);
                    ((zzir) obj).zzl(zzjiVar);
                    zzjiVar.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzha("Protocol message tag had invalid wire type."));
                    }
                    zzjiVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzir() {
        this(0, new int[8], new Object[8], true);
    }
}
