package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int skipData(long j10) {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public void maybeThrowError() {
    }
}
