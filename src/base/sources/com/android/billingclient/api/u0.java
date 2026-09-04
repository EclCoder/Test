package com.android.billingclient.api;

import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10422a = 0;

    static {
        int i10 = v0.f10425a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbo.zzc(exc.getMessage());
            int i10 = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", vHmGJpUTWNVV.oeiQWgMV, th2);
            return null;
        }
    }

    public static zzjl b(zzjs zzjsVar, int i10, c cVar, String str, zzjz zzjzVar) {
        try {
            zzjq zzjqVarZza = zzju.zza();
            zzjqVarZza.zzp(cVar.c());
            zzjqVarZza.zzb(cVar.a());
            if (cVar.b() != 0) {
                zzjqVarZza.zzd(cVar.b());
            }
            if (zzjsVar != null) {
                zzjqVarZza.zze(zzjsVar);
            }
            if (str != null) {
                zzjqVarZza.zza(str);
            }
            zzjj zzjjVarZza = zzjl.zza();
            zzjjVarZza.zzb(zzjqVarZza);
            zzjjVarZza.zzp(i10);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjjVarZza.zza(zzjzVar);
            }
            return (zzjl) zzjjVarZza.zzi();
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static zzjp c(int i10, zzjz zzjzVar) {
        try {
            zzjn zzjnVarZza = zzjp.zza();
            zzjnVarZza.zze(i10);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjnVarZza.zza(zzjzVar);
            }
            return (zzjp) zzjnVarZza.zzi();
        } catch (Exception e10) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
