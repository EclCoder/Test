package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import rc.a;
import rc.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    final zzcl zzc(Activity activity, d dVar) {
        a aVarA = dVar.a();
        if (aVarA == null) {
            aVarA = new a.C0791a(this.zza).a();
        }
        return zzp.zza(new zzp(this, activity, aVarA, dVar, null));
    }
}
