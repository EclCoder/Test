package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagr {
    private static final zzph zza;
    private static final zzom zzb;
    private static volatile String zzc;
    private static final zzog zzd;

    static {
        zzpj zzpjVar = new zzpj(zzagq.zza);
        zzpjVar.zza();
        zzph zzphVarZzb = zzpjVar.zzb();
        zza = zzphVarZzb;
        zzog zzogVar = new zzog("com.google.android.gms.measurement", zzphVarZzb);
        zzd = zzogVar;
        zzb = zzogVar.zzd("__phenotype_server_token", "");
        zzc = null;
    }

    private zzagr() {
    }

    public static String zza() {
        return (String) zzb.get();
    }

    public static String zzb(Context context) {
        String strZzb;
        String str = zzc;
        if (str != null) {
            return str;
        }
        synchronized (zzagr.class) {
            try {
                strZzb = zzc;
                if (strZzb == null) {
                    strZzb = zzlg.zzb(context, "com.google.android.gms.measurement", false);
                    zzc = strZzb;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strZzb;
    }

    public static zzog zzc() {
        return zzd;
    }
}
