package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzgu zzf;

    zzgr(zzgu zzguVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        Objects.requireNonNull(zzguVar);
        this.zzf = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgu zzguVar = this.zzf;
        zzhh zzhhVarZzd = zzguVar.zzu.zzd();
        if (!zzhhVarZzd.zzv()) {
            Log.println(6, zzguVar.zzn(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzguVar.zzr() == 0) {
            zzic zzicVar = zzguVar.zzu;
            if (zzicVar.zzc().zzj()) {
                zzicVar.zzaV();
                zzguVar.zzs('C');
            } else {
                zzicVar.zzaV();
                zzguVar.zzs('c');
            }
        }
        if (zzguVar.zzt() < 0) {
            zzguVar.zzu.zzc().zzi();
            zzguVar.zzu(161000L);
        }
        int i10 = this.zza;
        char cZzr = zzguVar.zzr();
        long jZzt = zzguVar.zzt();
        String str = this.zzb;
        Object obj = this.zzc;
        Object obj2 = this.zzd;
        Object obj3 = this.zze;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strZzo = zzgu.zzo(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cZzr).length() + String.valueOf(jZzt).length() + 1 + strZzo.length());
        sb2.append(MBridgeConstans.API_REUQEST_CATEGORY_APP);
        sb2.append(cCharAt);
        sb2.append(cZzr);
        sb2.append(jZzt);
        sb2.append(":");
        sb2.append(strZzo);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
        }
        zzhf zzhfVar = zzhhVarZzd.zzb;
        if (zzhfVar != null) {
            zzhfVar.zza(string, 1L);
        }
    }
}
