package com.bytedance.sdk.openadsdk.core.dnm.hnj;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements Application.ActivityLifecycleCallbacks {
    private static volatile hnj hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hn f13706hn;

    private hnj(Application application) {
        this.f13706hn = hn.hnj(application);
    }

    public static hnj hnj(Application application) {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj(application);
                        application.registerActivityLifecycleCallbacks(hnj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        hn hnVar = this.f13706hn;
        if (hnVar != null) {
            hnVar.hnj(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        hn hnVar = this.f13706hn;
        if (hnVar != null) {
            hnVar.hn(activity);
        }
    }

    public String hnj(String str, long j10, int i10) {
        hn hnVar = this.f13706hn;
        if (hnVar != null) {
            return hnVar.hnj(str, j10, i10);
        }
        return "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
