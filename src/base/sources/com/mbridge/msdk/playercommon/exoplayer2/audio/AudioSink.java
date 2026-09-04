package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th2) {
            super(th2);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i10, int i11, int i12, int i13) {
            super("AudioTrack init failed: " + i10 + ", Config(" + i11 + ", " + i12 + ", " + i13 + ")");
            this.audioTrackState = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Listener {
        void onAudioSessionId(int i10);

        void onPositionDiscontinuity();

        void onUnderrun(int i10, long j10, long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i10) {
            super("AudioTrack write failed: " + i10);
            this.errorCode = i10;
        }
    }

    void configure(int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15);

    void disableTunneling();

    void enableTunnelingV21(int i10);

    long getCurrentPositionUs(boolean z10);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i10);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i10);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f10);
}
