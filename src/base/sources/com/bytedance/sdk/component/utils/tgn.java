package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tgn {
    private static final Object hnj = new Object();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final Map<hnj, Object> f13002hn = new ConcurrentHashMap();
    private static final AtomicInteger qor = new AtomicInteger();
    private static AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile int f13003sk = -1;
    private static volatile long dkl = 0;
    private static volatile int dse = 60000;
    private static xn aq = null;
    private static final AtomicBoolean ojm = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn extends BroadcastReceiver {
        private hn() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                tgn.hn(context, intent, tgn.qor.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(Context context, Intent intent, boolean z10, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            f13003sk = 0;
        } else if (ojm.compareAndSet(false, true)) {
            com.bytedance.sdk.component.aq.hnj.hnj(new Runnable() { // from class: com.bytedance.sdk.component.utils.tgn.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = tgn.f13003sk = z11 ? 0 : tgn.hn(context);
                    tgn.ojm.set(false);
                    boolean z12 = tgn.f13003sk == 0;
                    boolean z13 = z10;
                    if ((z13 || !z12) && z13) {
                        tgn.hn(context, intent, tgn.f13003sk, z11);
                    }
                }
            });
        }
    }

    private static int qor(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
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
                        xn xnVar = aq;
                        return (xnVar == null || !xnVar.hnj(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(Context context, Intent intent, int i10, boolean z10) {
        Map<hnj, Object> map = f13002hn;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (hnj hnjVar : map.keySet()) {
            if (hnjVar != null) {
                try {
                    hnjVar.hnj(context, intent, !z10, i10);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int hnj(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (dkl + j10 <= jElapsedRealtime) {
            return hn(context);
        }
        if (f13003sk == -1) {
            return hn(context);
        }
        if (jElapsedRealtime - dkl >= dse) {
            hn(context, (Intent) null, false, false);
        }
        return f13003sk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hn(Context context) {
        f13003sk = qor(context);
        dkl = SystemClock.elapsedRealtime();
        return f13003sk;
    }

    public static void hnj(hnj hnjVar, Context context) {
        if (hnjVar == null) {
            return;
        }
        if (!gjv.get()) {
            try {
                context.registerReceiver(new hn(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                gjv.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<hnj, Object> map = f13002hn;
        map.put(hnjVar, hnj);
        qor.set(map.size());
    }

    public static void hnj(hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        Map<hnj, Object> map = f13002hn;
        map.remove(hnjVar);
        qor.set(map.size());
    }
}
