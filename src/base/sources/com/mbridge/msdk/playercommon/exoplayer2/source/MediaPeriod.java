package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j10);

    long readDiscontinuity();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);

    long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10);
}
