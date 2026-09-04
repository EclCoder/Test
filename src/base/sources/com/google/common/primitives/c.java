package com.google.common.primitives;

import com.inmobi.media.core.config.models.AdConfig;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static char a(long j10) {
        char c10 = (char) j10;
        p.i(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }
}
