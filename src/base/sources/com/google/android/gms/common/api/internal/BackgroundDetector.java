package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zza = new BackgroundDetector();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicBoolean zzc = new AtomicBoolean();
    private final ArrayList zzd = new ArrayList();
    private boolean zze = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z10);
    }

    private BackgroundDetector() {
    }

    public static BackgroundDetector getInstance() {
        return zza;
    }

    public static void initialize(Application application) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.zze) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.zze = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zza(boolean z10) {
        synchronized (zza) {
            try {
                ArrayList arrayList = this.zzd;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((BackgroundStateChangeListener) obj).onBackgroundStateChanged(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zza) {
            this.zzd.add(backgroundStateChangeListener);
        }
    }

    public boolean isInBackground() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    public boolean readCurrentStateIfPossible(boolean z10) {
        AtomicBoolean atomicBoolean = this.zzc;
        if (!atomicBoolean.get()) {
            if (ProcessUtils.zza()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
