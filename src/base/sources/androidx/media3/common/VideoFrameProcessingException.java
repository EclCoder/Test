package androidx.media3.common;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4622a;

    public VideoFrameProcessingException(Throwable th2, long j10) {
        super(th2);
        this.f4622a = j10;
    }

    public static VideoFrameProcessingException a(Exception exc) {
        return b(exc, C.TIME_UNSET);
    }

    public static VideoFrameProcessingException b(Exception exc, long j10) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j10);
    }
}
