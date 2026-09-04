package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    private static volatile Handler hnj;

    public static Handler hn() {
        if (hnj == null) {
            synchronized (ojm.class) {
                try {
                    if (hnj == null) {
                        hnj = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public static Handler hnj() {
        return com.bytedance.sdk.component.aq.hnj.hnj.hnj().hn();
    }
}
