package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2894ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f26353a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2868bk f26354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f26355c;

    public static void a(String str) {
        Context context = Xi.f26021a;
        if (context != null) {
            B5.f24500a.getClass();
            if (!B5.r() || !kotlin.jvm.internal.s.c("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = f26353a;
                if (concurrentHashMap.get(str) == null) {
                    C2842ak c2842ak = new C2842ak();
                    concurrentHashMap.put(str, c2842ak);
                    J3.a(context, c2842ak, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                C2868bk c2868bk = new C2868bk();
                f26354b = c2868bk;
                connectivityManager.registerDefaultNetworkCallback(c2868bk);
            }
        }
    }

    public static void b() {
        kotlin.jvm.internal.s.g("ck", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        B5.f24500a.getClass();
        if (B5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (B5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = Xi.f26021a;
        if (context != null) {
            B5.f24500a.getClass();
            if (B5.r() && kotlin.jvm.internal.s.c("SYSTEM_CONNECTIVITY_CHANGE", str) && f26354b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    C2868bk c2868bk = f26354b;
                    kotlin.jvm.internal.s.e(c2868bk);
                    connectivityManager.unregisterNetworkCallback(c2868bk);
                    f26354b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f26353a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        kotlin.jvm.internal.s.g("ck", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        B5.f24500a.getClass();
        if (B5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (B5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f26353a.clear();
    }

    public static void a(Context context, Intent intent) {
        kotlin.jvm.internal.s.g("ck", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            kotlin.jvm.internal.s.g("ck", "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (kotlin.jvm.internal.s.c("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f26355c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f26355c = zIsDeviceIdleMode;
                        kotlin.jvm.internal.s.g("ck", "TAG");
                        ((Fc) Xi.f26025e.getValue()).b(new J2(10, 4, f26355c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (bm.r.A("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    B5.f24500a.getClass();
                    if (B5.y()) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                }
                if (zIsDeviceIdleMode != f26355c) {
                    B5.f24500a.getClass();
                    if (B5.y()) {
                        kotlin.jvm.internal.s.g("ck", "TAG");
                        ((Fc) Xi.f26025e.getValue()).b(new J2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.s.c("android.intent.action.USER_PRESENT", intent.getAction())) {
                kotlin.jvm.internal.s.g("ck", "TAG");
                ((Fc) Xi.f26025e.getValue()).b(new J2(100, 6, (String) null));
                return;
            }
            if (kotlin.jvm.internal.s.c("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                kotlin.jvm.internal.s.g("ck", "TAG");
                ((Fc) Xi.f26025e.getValue()).b(new J2(1, 6, (String) null));
                Iterator it = f26353a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f26353a.clear();
                f26354b = null;
                return;
            }
            if (kotlin.jvm.internal.s.c("android.intent.action.REBOOT", intent.getAction())) {
                kotlin.jvm.internal.s.g("ck", "TAG");
                ((Fc) Xi.f26025e.getValue()).b(new J2(2, 6, (String) null));
                Iterator it2 = f26353a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f26353a.clear();
                f26354b = null;
                return;
            }
            kotlin.jvm.internal.s.g("ck", "TAG");
            ((Fc) Xi.f26025e.getValue()).b(new J2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
