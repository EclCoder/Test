package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc {
    private static final Runnable aq;
    private static volatile HandlerThread dkl = null;
    public static long gjv = 0;
    public static volatile boolean hnj = false;
    public static long qor;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static AtomicBoolean f13727hn = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile int f13728sk = 0;
    private static volatile Handler dse = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.fc.1
            boolean hnj = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.hnj) {
                    return;
                }
                this.hnj = true;
                super.start();
            }
        };
        dkl = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.aq.hnj(dkl);
        gjv = System.currentTimeMillis();
        aq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fc.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.dnm.hn().znr()) {
                    fc.dkl();
                    return;
                }
                String strHn = com.bytedance.sdk.openadsdk.core.settings.dnm.hn(oj.hnj());
                int iHnj = com.bytedance.sdk.openadsdk.core.settings.dnm.hnj(oj.hnj());
                if (!TextUtils.equals(strHn, com.bytedance.sdk.openadsdk.core.settings.dnm.gjv) || iHnj != com.bytedance.sdk.openadsdk.core.settings.dnm.f14178sk) {
                    com.bytedance.sdk.openadsdk.core.settings.dnm.hn().hnj(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.dnm.gjv = strHn;
                    com.bytedance.sdk.openadsdk.core.settings.dnm.f14178sk = iHnj;
                }
                fc.dkl();
            }
        };
    }

    public static void dkl() {
        Handler handlerHn = hn();
        Runnable runnable = aq;
        handlerHn.removeCallbacks(runnable);
        hn().postDelayed(runnable, 10000L);
    }

    public static void dse() {
        hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.fc.3.1
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("init");
                            return hnjVar;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.qor("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static int gjv() {
        return f13728sk;
    }

    public static Handler hn() {
        if (dkl == null || !dkl.isAlive()) {
            synchronized (fc.class) {
                try {
                    if (dkl == null || !dkl.isAlive()) {
                        dkl = com.bytedance.sdk.component.utils.aq.hnj("pag_init_handle", -1);
                        dse = new Handler(dkl.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (dse == null) {
            synchronized (fc.class) {
                try {
                    if (dse == null) {
                        dse = new Handler(dkl.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return dse;
    }

    public static void hnj(long j10) {
        gjv = j10;
    }

    public static Handler qor() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean sk() {
        return gjv() == 1;
    }

    public static long hnj() {
        return gjv;
    }

    public static void hnj(int i10) {
        f13728sk = i10;
    }

    public static void hnj(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    ta.hn().hn(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("InitHelper", th2.getMessage());
        }
    }
}
