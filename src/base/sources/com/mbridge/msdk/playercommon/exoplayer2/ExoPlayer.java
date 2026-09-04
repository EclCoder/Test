package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public static final int REPEAT_MODE_ALL = 2;

    @Deprecated
    public static final int REPEAT_MODE_OFF = 0;

    @Deprecated
    public static final int REPEAT_MODE_ONE = 1;

    @Deprecated
    public static final int STATE_BUFFERING = 2;

    @Deprecated
    public static final int STATE_ENDED = 4;

    @Deprecated
    public static final int STATE_IDLE = 1;

    @Deprecated
    public static final int STATE_READY = 3;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Deprecated
    public interface EventListener extends Player.EventListener {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Deprecated
    public interface ExoPlayerComponent extends PlayerMessage.Target {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Deprecated
    public static final class ExoPlayerMessage {
        public final Object message;
        public final int messageType;
        public final PlayerMessage.Target target;

        @Deprecated
        public ExoPlayerMessage(PlayerMessage.Target target, int i10, Object obj) {
            this.target = target;
            this.messageType = i10;
            this.message = obj;
        }
    }

    @Deprecated
    void blockingSendMessages(ExoPlayerMessage... exoPlayerMessageArr);

    PlayerMessage createMessage(PlayerMessage.Target target);

    Looper getPlaybackLooper();

    void prepare(MediaSource mediaSource);

    void prepare(MediaSource mediaSource, boolean z10, boolean z11);

    @Deprecated
    void sendMessages(ExoPlayerMessage... exoPlayerMessageArr);

    void setSeekParameters(SeekParameters seekParameters);
}
