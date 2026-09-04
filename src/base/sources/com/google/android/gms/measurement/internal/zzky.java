package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzky implements Application.ActivityLifecycleCallbacks, zzkw {
    final /* synthetic */ zzlj zza;

    zzky(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zza(com.google.android.gms.internal.measurement.zzdd.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdd.zza(activity), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zza(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) throws Throwable {
        zzky zzkyVar;
        zzic zzicVar;
        Uri uri;
        try {
            try {
                zzlj zzljVar = this.zza;
                zzic zzicVar2 = zzljVar.zzu;
                zzicVar2.zzaW().zzk().zza("onActivityCreated");
                Intent intent = zzddVar.zzc;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        String str = zzicVar2.zzk().zzj(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        zzkyVar = this;
                        try {
                            zzicVar2.zzaX().zzj(new zzkx(zzkyVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e10) {
                            e = e10;
                            zzkyVar.zza.zzu.zzaW().zzb().zzb("Throwable caught in onActivityCreated", e);
                        }
                        zzicVar = zzkyVar.zza.zzu;
                    }
                    zzicVar.zzs().zzn(zzddVar, bundle);
                }
                zzicVar = zzljVar.zzu;
            } catch (Throwable th2) {
                th = th2;
                zzkyVar.zza.zzu.zzs().zzn(zzddVar, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            zzkyVar = this;
        } catch (Throwable th3) {
            th = th3;
            zzkyVar = this;
            zzkyVar.zza.zzu.zzs().zzn(zzddVar, bundle);
            throw th;
        }
        zzicVar.zzs().zzn(zzddVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzb(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        this.zza.zzu.zzs().zzt(zzddVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzc(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzs().zzq(zzddVar);
        zzoc zzocVarZzh = zzicVar.zzh();
        zzic zzicVar2 = zzocVarZzh.zzu;
        zzicVar2.zzaX().zzj(new zznv(zzocVarZzh, zzicVar2.zzba().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzd(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.zza.zzu;
        zzoc zzocVarZzh = zzicVar.zzh();
        zzic zzicVar2 = zzocVarZzh.zzu;
        zzicVar2.zzaX().zzj(new zznu(zzocVarZzh, zzicVar2.zzba().elapsedRealtime()));
        zzicVar.zzs().zzp(zzddVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zze(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        this.zza.zzu.zzs().zzs(zzddVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
