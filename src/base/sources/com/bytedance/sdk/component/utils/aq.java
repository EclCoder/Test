package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static HandlerThread f12997hn;
    public static volatile boolean hnj;

    public static void hnj(HandlerThread handlerThread) {
        f12997hn = handlerThread;
    }

    public static HandlerThread hnj(String str) {
        return hnj(str, 0);
    }

    public static HandlerThread hnj(String str, int i10) {
        if (hnj) {
            return f12997hn;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i10) { // from class: com.bytedance.sdk.component.utils.aq.1
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
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th2) {
            apu.hnj("HandlerThreadUtils", "new handlerThread error", th2);
            return f12997hn;
        }
    }
}
