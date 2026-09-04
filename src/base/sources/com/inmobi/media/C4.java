package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C4 {
    public static final Xe a() {
        Context context = Xi.f26021a;
        if (context == null) {
            return Xe.UNAVAILABLE;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Xe.SLOW;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService("wifi");
                    kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    if (linkSpeed >= 10) {
                        return Xe.FAST;
                    }
                    return linkSpeed >= 2 ? Xe.MEDIUM : Xe.SLOW;
                }
                kotlin.jvm.internal.s.h(context, "context");
                if (androidx.core.content.a.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Xe.UNAVAILABLE;
                }
                Object systemService3 = context.getSystemService("phone");
                kotlin.jvm.internal.s.f(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                if (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) {
                    return Xe.SLOW;
                }
                return (networkType == 18 || networkType == 20) ? Xe.FAST : Xe.MEDIUM;
            }
            return Xe.UNAVAILABLE;
        } catch (SecurityException unused) {
            return Xe.UNAVAILABLE;
        }
    }
}
