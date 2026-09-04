package com.bytedance.sdk.openadsdk.p000do.hnj;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.aq;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static HandlerThread f14331hn;
    private static Handler hnj;

    public static Handler hnj() {
        try {
            HandlerThread handlerThread = f14331hn;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (hnj.class) {
                    try {
                        HandlerThread handlerThread2 = f14331hn;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            f14331hn = aq.hnj(XTkUEXuiK.qYcyTOTR);
                            hnj = new Handler(f14331hn.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (hnj == null) {
                synchronized (hnj.class) {
                    try {
                        if (hnj == null) {
                            hnj = new Handler(f14331hn.getLooper());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hnj;
    }
}
