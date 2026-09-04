package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyx {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfye zzd;
    private boolean zze;

    public zzfyx(Context context, zzbds zzbdsVar, zzfye zzfyeVar, boolean z10) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbdsVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfyeVar;
        this.zze = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(zzbdu zzbduVar) {
        zzbea zzbeaVarZzi = zzbeb.zzi();
        zzbeaVarZzi.zza(zzbduVar.zza().zza());
        zzbeaVarZzi.zzb(zzbduVar.zza().zzb());
        zzbeaVarZzi.zzd(zzbduVar.zza().zzd());
        zzbeaVarZzi.zze(zzbduVar.zza().zze());
        zzbeaVarZzi.zzc(zzbduVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbeb) zzbeaVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i10, long j10) {
        this.zzd.zza(i10, j10);
    }

    private final void zzj(int i10, long j10, String str) {
        this.zzd.zzb(i10, j10, str);
    }

    private final zzbeb zzk(int i10) {
        String string = i10 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzida zzidaVar = zzida.zza;
            return zzbeb.zzh(zzida.zzt(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zzido.zza() : zzido.zzb());
        } catch (zziet unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzbdu zzbduVar, zzfyw zzfywVar) {
        boolean z10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbeb zzbebVarZzk = zzk(1);
                String strZza = zzbduVar.zza().zza();
                if (zzbebVarZzk != null && zzbebVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    String str = true != fileZze.isDirectory() ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
                    String str2 = true != fileZze.isFile() ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
                    z10 = false;
                    StringBuilder sb2 = new StringBuilder(7);
                    sb2.append("d:");
                    sb2.append(str);
                    sb2.append(",f:");
                    sb2.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb2.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z10 = false;
                    if (!fileZze.mkdirs()) {
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1"));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfyr.zzb(file, zzbduVar.zzb().zzA())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z10;
                }
                if (!zzfyr.zzb(file2, zzbduVar.zzc().zzA())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z10;
                }
                if (zzfywVar != null && !zzfywVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfyr.zze(fileZze2);
                    return z10;
                }
                String strZzh = zzh(zzbduVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z10;
                }
                HashSet hashSet = new HashSet();
                zzbeb zzbebVarZzk2 = zzk(1);
                if (zzbebVarZzk2 != null) {
                    hashSet.add(zzbebVarZzk2.zza());
                }
                zzbeb zzbebVarZzk3 = zzk(2);
                if (zzbebVarZzk3 != null) {
                    hashSet.add(zzbebVarZzk3.zza());
                }
                boolean z11 = z10;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z11 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i10 = z11 ? 1 : 0; i10 < length; i10++) {
                    File file3 = fileArrListFiles[i10];
                    if (!hashSet.contains(file3.getName())) {
                        zzfyr.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(zzbdu zzbduVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfyr.zzb(new File(zze(zzbduVar.zza().zza()), "pcbc"), zzbduVar.zzc().zzA())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzbduVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzfyp zzc(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbeb zzbebVarZzk = zzk(1);
                if (zzbebVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzbebVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfyp(zzbebVarZzk, file, file2, file3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzd(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbeb zzbebVarZzk = zzk(1);
                if (zzbebVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzbebVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
