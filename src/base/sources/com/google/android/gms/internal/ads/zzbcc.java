package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcc extends zzbdf {
    private final Activity zzh;
    private final View zzi;

    public zzbcc(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, View view, Activity activity) {
        super(zzbbsVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzaxmVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdy);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            try {
                zzaxmVar.zzS(((Long) objArr[0]).longValue());
                zzaxmVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzaxmVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
