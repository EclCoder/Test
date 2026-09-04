package com.mbridge.msdk.playercommon.exoplayer2.drm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class UnsupportedDrmException extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    public UnsupportedDrmException(int i10) {
        this.reason = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.reason = i10;
    }
}
