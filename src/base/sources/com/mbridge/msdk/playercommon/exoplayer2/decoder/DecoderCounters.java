package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedToKeyframeCount;
    public int inputBufferCount;
    public int maxConsecutiveDroppedBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;

    public synchronized void ensureUpdated() {
    }

    public void merge(DecoderCounters decoderCounters) {
        this.decoderInitCount += decoderCounters.decoderInitCount;
        this.decoderReleaseCount += decoderCounters.decoderReleaseCount;
        this.inputBufferCount += decoderCounters.inputBufferCount;
        this.skippedInputBufferCount += decoderCounters.skippedInputBufferCount;
        this.renderedOutputBufferCount += decoderCounters.renderedOutputBufferCount;
        this.skippedOutputBufferCount += decoderCounters.skippedOutputBufferCount;
        this.droppedBufferCount += decoderCounters.droppedBufferCount;
        this.maxConsecutiveDroppedBufferCount = Math.max(this.maxConsecutiveDroppedBufferCount, decoderCounters.maxConsecutiveDroppedBufferCount);
        this.droppedToKeyframeCount += decoderCounters.droppedToKeyframeCount;
    }
}
