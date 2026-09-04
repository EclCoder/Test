package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hqh {
    private static volatile boolean gjv = true;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f14647hn;
    private static String hnj;
    private static String qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj extends com.bytedance.sdk.component.aq.hn.qor {
        public static AtomicBoolean hnj = new AtomicBoolean(false);

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private static final AtomicLong f14648hn = new AtomicLong(0);

        public hnj(String str, int i10) {
            super(str, i10);
        }

        public static void hnj() {
            if (hnj.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f14648hn;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            ua.qor((Runnable) new hnj("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            hnj.set(true);
            hqh.sk();
            hnj.set(false);
        }
    }

    public static String hn() {
        try {
            hnj.hnj();
            if (!gjv) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(gjv ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.apu.qor("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.oj.hnj().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : f14647hn;
            com.bytedance.sdk.component.utils.apu.qor("MCC", "config=" + configuration.mcc + ",sMCC=" + f14647hn);
            return strValueOf;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("SimUtils", th2.getMessage());
            return null;
        }
    }

    public static String hnj() {
        hnj.hnj();
        return hnj;
    }

    public static String qor() {
        hnj.hnj();
        return qor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sk() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.oj.hnj() == null) {
            return;
        }
        gjv = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    gjv = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("SimUtils", th2.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                hnj = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f14647hn = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            qor = strSubstring;
        } catch (Throwable unused4) {
        }
    }
}
