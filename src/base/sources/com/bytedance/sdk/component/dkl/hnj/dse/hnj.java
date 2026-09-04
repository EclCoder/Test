package com.bytedance.sdk.component.dkl.hnj.dse;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.sk;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile Handler f12763hn = null;
    private static volatile HandlerThread hnj = null;
    private static int qor = 3000;

    static {
        qor();
    }

    public static int hn() {
        if (qor <= 0) {
            qor = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        }
        return qor;
    }

    public static Handler hnj() {
        if (hnj == null || !hnj.isAlive()) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null || !hnj.isAlive()) {
                        qor();
                        f12763hn = new Handler(hnj.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (f12763hn == null) {
            synchronized (hnj.class) {
                try {
                    if (f12763hn == null) {
                        f12763hn = new Handler(hnj.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f12763hn;
    }

    private static void qor() {
        HandlerThread handlerThreadHnj;
        sk skVarFc = dse.dkl().fc();
        if (skVarFc != null && (handlerThreadHnj = skVarFc.hnj("csj_ad_log", 10)) != null) {
            hnj = handlerThreadHnj;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        hnj = handlerThread;
        handlerThread.start();
    }
}
