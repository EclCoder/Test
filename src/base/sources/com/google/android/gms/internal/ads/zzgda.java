package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgda {
    private static final Object zza = new Object();
    private static zzgda zzb;
    private final zzgcy zzc;

    private zzgda(Context context, ExecutorService executorService, zzgdf zzgdfVar) {
        zzgdm zzgdmVar = new zzgdm(null);
        zzgdmVar.zzc(context);
        zzgdmVar.zzb(executorService);
        zzgdmVar.zzd(zzgdfVar);
        this.zzc = (zzgcy) ((zzgdl) zzgdmVar.zza()).zzI.zzb();
    }

    public static zzgda zza(Context context, ExecutorService executorService, zzgdf zzgdfVar) {
        zzgda zzgdaVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzgda(context, executorService, zzgdfVar);
                }
                zzgdaVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgdaVar;
    }

    public final ListenableFuture zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}
