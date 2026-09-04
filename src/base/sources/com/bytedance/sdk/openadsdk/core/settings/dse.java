package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.apu;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private static final AtomicInteger hnj = new AtomicInteger(1);

    public static boolean hnj() {
        return hnj.get() == 1;
    }

    protected static void hnj(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = hnj;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th2) {
                        th = th2;
                        apu.qor("SdkSwitch", th.getMessage());
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            if (z10) {
                Log.e("SdkSwitch", "switch status changed: " + hnj());
                if (hnj()) {
                    com.bytedance.sdk.openadsdk.gjv.hnj.hn.hn();
                } else {
                    com.bytedance.sdk.openadsdk.gjv.hnj.hn.qor();
                }
            }
        }
    }
}
