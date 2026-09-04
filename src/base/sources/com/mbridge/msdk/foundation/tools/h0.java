package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f30899a;

    public static synchronized ConnectivityManager a() {
        try {
            if (f30899a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                f30899a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        return f30899a;
    }
}
