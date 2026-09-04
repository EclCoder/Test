package com.mbridge.msdk.foundation.download.utils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j10, long j11) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        if (j10 == j11) {
            return 100;
        }
        return (int) (((j11 * 1.0d) / (j10 * 1.0d)) * 100.0d);
    }
}
