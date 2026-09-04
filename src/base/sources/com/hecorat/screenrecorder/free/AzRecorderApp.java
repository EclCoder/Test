package com.hecorat.screenrecorder.free;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.mbridge.msdk.shake.hNcq.sYaE;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class AzRecorderApp extends x3.b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f22504d = "START_TRACK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AzRecorderApp f22505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static vf.a f22506f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22508b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22507a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f22509c = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements Thread.UncaughtExceptionHandler {
        public b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            AzRecorderApp.this.f22509c.uncaughtException(thread, th2);
        }
    }

    public AzRecorderApp() {
        Thread.setDefaultUncaughtExceptionHandler(new b());
    }

    public static /* synthetic */ void a(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            if (adapterStatus != null) {
                wp.a.g("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency()));
            }
        }
    }

    public static /* synthetic */ void b(AzRecorderApp azRecorderApp) {
        azRecorderApp.getClass();
        MobileAds.initialize(azRecorderApp, new OnInitializationCompleteListener() { // from class: ef.c
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                AzRecorderApp.a(initializationStatus);
            }
        });
    }

    public static vf.a d() {
        return f22506f;
    }

    public static AzRecorderApp e() {
        return f22505e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        new Thread(new Runnable() { // from class: ef.b
            @Override // java.lang.Runnable
            public final void run() {
                AzRecorderApp.b(this.f37731a);
            }
        }).start();
    }

    @Override // x3.b, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        x3.a.l(this);
    }

    public int f() {
        return this.f22508b;
    }

    public boolean h() {
        return this.f22507a > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        wp.a.h(f22504d).g("onActivityCreated: %s", activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        wp.a.h(f22504d).g("onActivityDestroyed: %s", activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        wp.a.h(f22504d).g("onActivityPaused: %s", activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f22507a++;
        wp.a.h(f22504d).g("onActivityStarted: %s", activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f22507a--;
        wp.a.h(f22504d).g("onActivityStopped: %s", activity.toString());
    }

    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, InvocationTargetException {
        sYaE.RJkTBYePRVA.invoke(null, this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        unregisterActivityLifecycleCallbacks(this);
        super.onTerminate();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        wp.a.h(f22504d).g(vHmGJpUTWNVV.pmBQUEmyJH, activity.toString());
    }
}
