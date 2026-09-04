package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import f8.Ygx.FuoITeVPeXAj;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgjc extends zzgix {
    private final DisplayMetrics zza;
    private final View zzb;

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzayk zzaykVarZza = zzayl.zza();
        zzaykVarZza.zzb(lArr[2].longValue());
        zzaykVarZza.zzc(lArr[1].longValue());
        zzaykVarZza.zzd(lArr[0].longValue());
        zzaykVarZza.zza(lArr[3].longValue());
        zzaykVarZza.zze(lArr[4].longValue());
        zzaxmVar.zzM((zzayl) zzaykVarZza.zzbu());
    }

    zzgjc(zzaxm zzaxmVar, zzght zzghtVar, DisplayMetrics displayMetrics, View view, zzgqh zzgqhVar) {
        super("vv376EC8RwpMxMmfATqMVweHyPhjqO5Qlm7WPZKD2npMq6jNCymiQXlS7PGFwNKe", FuoITeVPeXAj.mLKBoVxHIf, zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.zza = displayMetrics;
        this.zzb = view;
    }
}
