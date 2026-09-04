package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbaj {
    protected volatile Boolean zzb;
    private final zzbbs zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfzc zza = null;
    private static volatile Random zze = null;

    public zzbaj(zzbbs zzbbsVar) {
        this.zzc = zzbbsVar;
        zzbbsVar.zzd().execute(new zzbai(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzbaj.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaws zzawsVarZza = zzaww.zza();
            zzawsVarZza.zza(this.zzc.zza.getPackageName());
            zzawsVarZza.zzb(j10);
            if (str != null) {
                zzawsVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzawsVarZza.zzc(stringWriter.toString());
                zzawsVarZza.zzd(exc.getClass().getName());
            }
            zzfzb zzfzbVarZza = zza.zza(((zzaww) zzawsVarZza.zzbu()).zzaN());
            zzfzbVarZza.zzc(i10);
            if (i11 != -1) {
                zzfzbVarZza.zzb(i11);
            }
            zzfzbVarZza.zza();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ zzbbs zzb() {
        return this.zzc;
    }
}
