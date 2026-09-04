package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile b f28762f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f28763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TelephonyManager f28764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28765c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28766d = "UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28767e = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        public a() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 1 || overrideNetworkType == 2) {
                b.this.f28765c = 4;
                return;
            }
            if (overrideNetworkType == 3) {
                b bVar = b.this;
                bVar.f28765c = 5;
                bVar.f28766d = "5G NSA";
            } else {
                if (overrideNetworkType != 5) {
                    return;
                }
                b bVar2 = b.this;
                bVar2.f28765c = 5;
                bVar2.f28766d = "5G+";
            }
        }
    }

    private b() {
        a();
    }

    public static b e() {
        if (f28762f == null) {
            synchronized (b.class) {
                try {
                    if (f28762f == null) {
                        f28762f = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28762f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        NetworkCapabilities networkCapabilities = this.f28763a.getNetworkCapabilities(this.f28763a.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                this.f28765c = 9;
                this.f28766d = "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                this.f28765c = c();
            }
            this.f28767e = networkCapabilities.hasTransport(4) ? 1 : g();
        }
    }

    public void b() {
        a();
        com.mbridge.msdk.foundation.same.threadpool.a.d().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f28778a.f();
            }
        });
    }

    public int c() {
        try {
            TelephonyManager telephonyManager = this.f28764b;
            if (telephonyManager == null) {
                return 0;
            }
            int dataNetworkType = telephonyManager.getDataNetworkType();
            this.f28766d = String.valueOf(dataNetworkType);
            return a(dataNetworkType);
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
            return 0;
        }
    }

    public int d() {
        try {
            TelephonyManager telephonyManager = this.f28764b;
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            this.f28766d = String.valueOf(networkType);
            return a(networkType);
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
            return 0;
        }
    }

    public int g() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? 0 : 2;
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
            return 0;
        }
    }

    private int a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    private void a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            this.f28765c = 0;
            this.f28766d = "UNKNOWN";
            this.f28767e = 0;
            return;
        }
        ConnectivityManager connectivityManager = this.f28763a;
        if (connectivityManager == null || this.f28764b == null) {
            if (connectivityManager == null) {
                this.f28763a = (ConnectivityManager) contextD.getSystemService("connectivity");
            }
            if (this.f28764b == null) {
                TelephonyManager telephonyManager = (TelephonyManager) contextD.getSystemService("phone");
                this.f28764b = telephonyManager;
                if (Build.VERSION.SDK_INT < 31 || telephonyManager == null) {
                    return;
                }
                this.f28764b.registerTelephonyCallback(com.mbridge.msdk.foundation.same.threadpool.a.d(), new a());
            }
        }
    }
}
