package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f22071b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzez f22072a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzez zzezVar) {
        Preconditions.checkNotNull(zzezVar);
        this.f22072a = zzezVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f22071b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f22071b == null) {
                        f22071b = new FirebaseAnalytics(zzez.zza(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f22071b;
    }

    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzez zzezVarZza = zzez.zza(context, bundle);
        if (zzezVarZza == null) {
            return null;
        }
        return new com.google.firebase.analytics.a(zzezVarZza);
    }

    public void a(String str, Bundle bundle) {
        this.f22072a.zzh(str, bundle);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.p().getId(), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f22072a.zzp(zzdd.zza(activity), str, str2);
    }
}
