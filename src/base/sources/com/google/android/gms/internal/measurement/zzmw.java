package com.google.android.gms.internal.measurement;

import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.n0;
import com.google.common.collect.p1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmw {
    private static final zzmw zza = new zzmw(h0.O());
    private final h0 zzb;

    zzmw(h0 h0Var) {
        this.zzb = h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    public static zzmw zza(zzmw zzmwVar, e0 e0Var) {
        long j10;
        if (e0Var.isEmpty()) {
            return zzmwVar;
        }
        HashMap mapF = n0.f(e0Var);
        h0 h0Var = zzmwVar.zzb;
        h0.a aVarN = h0.N();
        p1 it = h0Var.iterator();
        while (it.hasNext()) {
            zzmv zzmvVar = (zzmv) it.next();
            Object objRemove = mapF.remove(zzmvVar.zza());
            if (objRemove == null) {
                aVarN.a(zzmvVar);
            } else if (objRemove instanceof String) {
                aVarN.a(new zzmv(zzmvVar.zza, zzmvVar.zzb, 4, 0L, objRemove));
            } else if (objRemove instanceof byte[]) {
                aVarN.a(new zzmv(zzmvVar.zza, zzmvVar.zzb, 5, 0L, objRemove));
            } else if (objRemove instanceof Boolean) {
                aVarN.a(new zzmv(zzmvVar.zza, zzmvVar.zzb, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
            } else if (objRemove instanceof Long) {
                aVarN.a(new zzmv(zzmvVar.zza, zzmvVar.zzb, 2, ((Long) objRemove).longValue(), null));
            } else {
                if (!(objRemove instanceof Double)) {
                    String strZza = zzmvVar.zza();
                    String string = objRemove.toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 46 + string.length());
                    sb2.append("Cannot serialize override for existing flag ");
                    sb2.append(strZza);
                    sb2.append(": ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                aVarN.a(new zzmv(zzmvVar.zza, zzmvVar.zzb, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
            }
        }
        for (String str : mapF.keySet()) {
            Object obj = mapF.get(str);
            int length = str.length();
            if (length > 19 || length == 0) {
                j10 = 0;
                break;
            }
            boolean z10 = false;
            long jCharAt = str.charAt(0) - '0';
            if (jCharAt < 1 || jCharAt > 9) {
                j10 = 0;
                break;
            }
            int i10 = 1;
            while (true) {
                if (i10 >= length) {
                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                        j10 = jCharAt;
                        break;
                    }
                    break;
                }
                int iCharAt = str.charAt(i10) - '0';
                if (!((iCharAt > 9) | (iCharAt < 0 ? true : z10))) {
                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                    i10++;
                    z10 = false;
                }
                j10 = 0;
                break;
            }
            String str2 = j10 == 0 ? str : null;
            if (obj instanceof String) {
                aVarN.a(new zzmv(j10, str2, 4, 0L, obj));
            } else if (obj instanceof byte[]) {
                aVarN.a(new zzmv(j10, str2, 5, 0L, obj));
            } else if (obj instanceof Boolean) {
                aVarN.a(new zzmv(j10, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
            } else if (obj instanceof Long) {
                aVarN.a(new zzmv(j10, str2, 2, ((Long) obj).longValue(), null));
            } else {
                if (!(obj instanceof Double)) {
                    String strValueOf = String.valueOf(obj);
                    StringBuilder sb3 = new StringBuilder(str.length() + 28 + strValueOf.length());
                    sb3.append("Cannot serialize override ");
                    sb3.append(str);
                    sb3.append(": ");
                    sb3.append(strValueOf);
                    throw new IllegalStateException(sb3.toString());
                }
                aVarN.a(new zzmv(j10, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
            }
        }
        return new zzmw(aVarN.m());
    }

    public static zzmw zzb() {
        return zza;
    }

    public static zzmw zzd(zzacv zzacvVar) throws zzaeh {
        long j10;
        String strZzl;
        zzmv zzmvVar;
        int iZzx = zzacvVar.zzx();
        if (iZzx < 0) {
            throw new zzaeh("Negative number of flags");
        }
        h0.a aVarN = h0.N();
        long j11 = 0;
        for (int i10 = 0; i10 < iZzx; i10++) {
            long jZzz = zzacvVar.zzz();
            int i11 = (int) jZzz;
            long j12 = jZzz >>> 3;
            if (j12 == 0) {
                j10 = 0;
                strZzl = zzacvVar.zzl();
            } else {
                long j13 = j12 + j11;
                if (j13 > 2305843009213693951L) {
                    throw new zzaeh("Flag name larger than max size");
                }
                j10 = j13;
                strZzl = null;
            }
            int i12 = i11 & 7;
            if (i12 == 0 || i12 == 1) {
                zzmvVar = new zzmv(j10, strZzl, i12, 0L, null);
            } else if (i12 == 2) {
                zzmvVar = new zzmv(j10, strZzl, i12, zzacvVar.zzz(), null);
            } else if (i12 == 3) {
                zzmvVar = new zzmv(j10, strZzl, i12, Double.doubleToRawLongBits(zzacvVar.zzd()), null);
            } else if (i12 == 4) {
                zzmvVar = new zzmv(j10, strZzl, i12, 0L, zzacvVar.zzl());
            } else {
                if (i12 != 5) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 23);
                    sb2.append("Unrecognized flag type ");
                    sb2.append(i12);
                    throw new zzaeh(sb2.toString());
                }
                zzmvVar = new zzmv(j10, strZzl, i12, 0L, zzacvVar.zzo());
            }
            long j14 = zzmvVar.zza;
            if (j14 != 0) {
                j11 = j14;
            }
            aVarN.a(zzmvVar);
        }
        return new zzmw(aVarN.m());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmw) {
            return this.zzb.equals(((zzmw) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final void zzc(e0.a aVar) {
        p1 it = this.zzb.iterator();
        while (it.hasNext()) {
            zzmv zzmvVar = (zzmv) it.next();
            aVar.g(zzmvVar.zza(), zzmvVar.zzb());
        }
    }

    public final h0 zze() {
        return this.zzb;
    }

    public final int zzf() {
        return this.zzb.size();
    }
}
