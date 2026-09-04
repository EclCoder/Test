package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public final float pitch;
    private final int scaledUsPerMs;
    public final boolean skipSilence;
    public final float speed;

    public PlaybackParameters(float f10) {
        this(f10, 1.0f, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch && this.skipSilence == playbackParameters.skipSilence) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return ((((Float.floatToRawIntBits(this.speed) + 527) * 31) + Float.floatToRawIntBits(this.pitch)) * 31) + (this.skipSilence ? 1 : 0);
    }

    public PlaybackParameters(float f10, float f11) {
        this(f10, f11, false);
    }

    public PlaybackParameters(float f10, float f11, boolean z10) {
        Assertions.checkArgument(f10 > 0.0f);
        Assertions.checkArgument(f11 > 0.0f);
        this.speed = f10;
        this.pitch = f11;
        this.skipSilence = z10;
        this.scaledUsPerMs = Math.round(f10 * 1000.0f);
    }
}
