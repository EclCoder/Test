package com.bytedance.sdk.openadsdk.oj.gjv;

import com.vungle.ads.internal.signals.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static long hnj() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % b.TWENTY_FOUR_HOURS_MILLIS);
    }

    public static boolean hnj(long j10) {
        return j10 - (j10 % b.TWENTY_FOUR_HOURS_MILLIS) == hnj();
    }
}
