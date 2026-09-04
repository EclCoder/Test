package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzic {
    public static final /* synthetic */ int zza = 0;
    private static final zziq zzb;

    static {
        int i10 = zzfc.zza;
        zzb = new zzis();
    }

    public static void zzA(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzD(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzF(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzK(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzM(i10, list, z10);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i10, zzhr zzhrVar, zzib zzibVar) {
        int iZzy = zzfx.zzy(i10 << 3);
        return iZzy + iZzy + ((zzfa) zzhrVar).zzi(zzibVar);
    }

    static int zzb(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgq)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzfx.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzz;
        }
        zzgq zzgqVar = (zzgq) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzfx.zzz(zzgqVar.zze(i10));
            i10++;
        }
        return iZzz2;
    }

    static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfx.zzy(i10 << 3) + 4);
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfx.zzy(i10 << 3) + 8);
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgq)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzfx.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzz;
        }
        zzgq zzgqVar = (zzgq) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzfx.zzz(zzgqVar.zze(i10));
            i10++;
        }
        return iZzz2;
    }

    static int zzh(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhj)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzfx.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzz;
        }
        zzhj zzhjVar = (zzhj) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzfx.zzz(zzhjVar.zze(i10));
            i10++;
        }
        return iZzz2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgq)) {
            int iZzy = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzy += zzfx.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzy;
        }
        zzgq zzgqVar = (zzgq) list;
        int iZzy2 = 0;
        while (i10 < size) {
            int iZze = zzgqVar.zze(i10);
            iZzy2 += zzfx.zzy((iZze >> 31) ^ (iZze + iZze));
            i10++;
        }
        return iZzy2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhj)) {
            int iZzz = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzz += zzfx.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzz;
        }
        zzhj zzhjVar = (zzhj) list;
        int iZzz2 = 0;
        while (i10 < size) {
            long jZze = zzhjVar.zze(i10);
            iZzz2 += zzfx.zzz((jZze >> 63) ^ (jZze + jZze));
            i10++;
        }
        return iZzz2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgq)) {
            int iZzy = 0;
            while (i10 < size) {
                iZzy += zzfx.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzy;
        }
        zzgq zzgqVar = (zzgq) list;
        int iZzy2 = 0;
        while (i10 < size) {
            iZzy2 += zzfx.zzy(zzgqVar.zze(i10));
            i10++;
        }
        return iZzy2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhj)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzfx.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzz;
        }
        zzhj zzhjVar = (zzhj) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzfx.zzz(zzhjVar.zze(i10));
            i10++;
        }
        return iZzz2;
    }

    public static zziq zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i10, int i11, Object obj2, zziq zziqVar) {
        if (obj2 == null) {
            obj2 = zzis.zza(obj);
        }
        ((zzir) obj2).zzj(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    static void zzo(zzgd zzgdVar, Object obj, Object obj2) {
        if (((zzgm) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zziq zziqVar, Object obj, Object obj2) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVarZze = zzgpVar.zzc;
        zzir zzirVar = ((zzgp) obj2).zzc;
        if (!zzir.zzc().equals(zzirVar)) {
            if (zzir.zzc().equals(zzirVarZze)) {
                zzirVarZze = zzir.zze(zzirVarZze, zzirVar);
            } else {
                zzirVarZze.zzd(zzirVar);
            }
        }
        zzgpVar.zzc = zzirVarZze;
    }

    public static void zzq(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzc(i10, list, z10);
    }

    public static void zzr(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzg(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzj(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzl(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzn(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzp(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzs(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzu(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzz(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzji zzjiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzB(i10, list, z10);
    }
}
