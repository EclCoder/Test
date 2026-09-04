package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f24689a;

    public static void a(boolean z10) {
        LinkedHashSet linkedHashSet;
        if (Xi.f26021a == null || (linkedHashSet = f24689a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C3075jl) it.next()).getClass();
                C3075jl.a(z10);
            } catch (Exception e10) {
                String TAG = NpmRNZ.yMtfF;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                e10.getMessage();
            }
        }
    }

    public static void b(Context context) {
        C3075jl listener = C3231pl.f27280c;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(listener, "listener");
        if (f24689a == null) {
            f24689a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new D1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f24689a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("E1", "TAG");
            e10.getMessage();
            return false;
        }
    }
}
