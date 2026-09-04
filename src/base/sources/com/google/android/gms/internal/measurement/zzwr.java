package com.google.android.gms.internal.measurement;

import android.os.Trace;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwr {
    static void zza(zzws zzwsVar, zzws zzwsVar2) {
        if (zzwsVar != null) {
            if (zzwsVar2 != null) {
                if (zzwsVar.zzb() == zzwsVar2 && !zzd(zzwsVar)) {
                    Trace.endSection();
                    return;
                } else if (zzwsVar == zzwsVar2.zzb() && !zzd(zzwsVar2)) {
                    zze(zzwsVar2);
                    return;
                }
            }
            zzc(zzwsVar);
        }
        if (zzwsVar2 != null) {
            zzb(zzwsVar2);
        }
    }

    static void zzb(zzws zzwsVar) {
        if (zzd(zzwsVar) || zzwsVar.zzb() == null) {
            Trace.beginSection(zzwsVar.zzd());
            zze(zzwsVar);
        } else {
            zzb(zzwsVar.zzb());
            zze(zzwsVar);
        }
    }

    static void zzc(zzws zzwsVar) {
        if (zzd(zzwsVar) || zzwsVar.zzb() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            zzc(zzwsVar.zzb());
        }
    }

    private static boolean zzd(zzws zzwsVar) {
        return zzwsVar.zza() != Thread.currentThread();
    }

    private static void zze(zzws zzwsVar) {
        String strZze = zzwsVar.zze();
        int i10 = zzvy.zzb;
        if (strZze.length() > 127) {
            strZze = strZze.substring(0, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        Trace.beginSection(strZze);
    }
}
