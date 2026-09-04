package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzigi {
    public static final /* synthetic */ int zza = 0;
    private static final zzigt zzb;

    static {
        int i10 = zzicn.zza;
        zzb = new zzigv();
    }

    static int zzA(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzidj.zzF(i10 << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzidj.zzF(i10 << 3) + 8);
    }

    static int zzD(int i10, Object obj, zzigh zzighVar) {
        int iZzF;
        int iZzaT;
        int iZzF2;
        int i11 = i10 << 3;
        if (obj instanceof zziez) {
            iZzF = zzidj.zzF(i11);
            iZzaT = ((zziez) obj).zzb();
            iZzF2 = zzidj.zzF(iZzaT);
        } else {
            iZzF = zzidj.zzF(i11);
            iZzaT = ((zzicj) obj).zzaT(zzighVar);
            iZzF2 = zzidj.zzF(iZzaT);
        }
        return iZzF + iZzF2 + iZzaT;
    }

    @Deprecated
    static int zzE(int i10, zzifp zzifpVar, zzigh zzighVar) {
        int iZzF = zzidj.zzF(i10 << 3);
        return iZzF + iZzF + ((zzicj) zzifpVar).zzaT(zzighVar);
    }

    public static zzigt zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzidp zzidpVar, Object obj, Object obj2) {
        if (((zziea) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzigt zzigtVar, Object obj, Object obj2) {
        zziee zzieeVar = (zziee) obj;
        zzigu zziguVarZzc = zzieeVar.zzt;
        zzigu zziguVar = ((zziee) obj2).zzt;
        if (!zzigu.zza().equals(zziguVar)) {
            if (zzigu.zza().equals(zziguVarZzc)) {
                zziguVarZzc = zzigu.zzc(zziguVarZzc, zziguVar);
            } else {
                zziguVarZzc.zzm(zziguVar);
            }
        }
        zzieeVar.zzt = zziguVarZzc;
    }

    static Object zzJ(Object obj, int i10, List list, zziek zziekVar, Object obj2, zzigt zzigtVar) {
        if (zziekVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zziekVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i10, iIntValue, obj2, zzigtVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zziekVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzK(obj, i10, iIntValue2, obj2, zzigtVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i10, int i11, Object obj2, zzigt zzigtVar) {
        if (obj2 == null) {
            obj2 = zzigtVar.zzh(obj);
        }
        zzigtVar.zza(obj2, i10, i11);
        return obj2;
    }

    public static void zza(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzihi zzihiVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzE(i10, list, z10);
    }

    public static void zzo(int i10, List list, zzihi zzihiVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzF(i10, list);
    }

    public static void zzp(int i10, List list, zzihi zzihiVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzG(i10, list);
    }

    public static void zzq(int i10, List list, zzihi zzihiVar, zzigh zzighVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzidk) zzihiVar).zzr(i10, list.get(i11), zzighVar);
        }
    }

    public static void zzr(int i10, List list, zzihi zzihiVar, zzigh zzighVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzidk) zzihiVar).zzs(i10, list.get(i11), zzighVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifd)) {
            int iZzG = 0;
            while (i10 < size) {
                iZzG += zzidj.zzG(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzG;
        }
        zzifd zzifdVar = (zzifd) list;
        int iZzG2 = 0;
        while (i10 < size) {
            iZzG2 += zzidj.zzG(zzifdVar.zzc(i10));
            i10++;
        }
        return iZzG2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifd)) {
            int iZzG = 0;
            while (i10 < size) {
                iZzG += zzidj.zzG(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzG;
        }
        zzifd zzifdVar = (zzifd) list;
        int iZzG2 = 0;
        while (i10 < size) {
            iZzG2 += zzidj.zzG(zzifdVar.zzc(i10));
            i10++;
        }
        return iZzG2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifd)) {
            int iZzG = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzG += zzidj.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzG;
        }
        zzifd zzifdVar = (zzifd) list;
        int iZzG2 = 0;
        while (i10 < size) {
            long jZzc = zzifdVar.zzc(i10);
            iZzG2 += zzidj.zzG((jZzc >> 63) ^ (jZzc + jZzc));
            i10++;
        }
        return iZzG2;
    }

    static int zzv(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzief)) {
            int iZzG = 0;
            while (i10 < size) {
                iZzG += zzidj.zzG(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzG;
        }
        zzief zziefVar = (zzief) list;
        int iZzG2 = 0;
        while (i10 < size) {
            iZzG2 += zzidj.zzG(zziefVar.zzf(i10));
            i10++;
        }
        return iZzG2;
    }

    static int zzw(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzief)) {
            int iZzG = 0;
            while (i10 < size) {
                iZzG += zzidj.zzG(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzG;
        }
        zzief zziefVar = (zzief) list;
        int iZzG2 = 0;
        while (i10 < size) {
            iZzG2 += zzidj.zzG(zziefVar.zzf(i10));
            i10++;
        }
        return iZzG2;
    }

    static int zzx(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzief)) {
            int iZzF = 0;
            while (i10 < size) {
                iZzF += zzidj.zzF(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzF;
        }
        zzief zziefVar = (zzief) list;
        int iZzF2 = 0;
        while (i10 < size) {
            iZzF2 += zzidj.zzF(zziefVar.zzf(i10));
            i10++;
        }
        return iZzF2;
    }

    static int zzy(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzief)) {
            int iZzF = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzF += zzidj.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzF;
        }
        zzief zziefVar = (zzief) list;
        int iZzF2 = 0;
        while (i10 < size) {
            int iZzf = zziefVar.zzf(i10);
            iZzF2 += zzidj.zzF((iZzf >> 31) ^ (iZzf + iZzf));
            i10++;
        }
        return iZzF2;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
