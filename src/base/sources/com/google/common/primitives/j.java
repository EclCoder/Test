package com.google.common.primitives;

import com.inmobi.media.core.config.models.AdConfig;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static byte a(long j10) {
        p.i((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
