package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class BaseMediaChunkOutput implements ChunkExtractorWrapper.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i10 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i10 >= sampleQueueArr.length) {
                return iArr;
            }
            SampleQueue sampleQueue = sampleQueueArr[i10];
            if (sampleQueue != null) {
                iArr[i10] = sampleQueue.getWriteIndex();
            }
            i10++;
        }
    }

    public void setSampleOffsetUs(long j10) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue != null) {
                sampleQueue.setSampleOffsetUs(j10);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkExtractorWrapper.TrackOutputProvider
    public TrackOutput track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i12 >= iArr.length) {
                Log.e(TAG, "Unmatched track of type: " + i11);
                return new DummyTrackOutput();
            }
            if (i11 == iArr[i12]) {
                return this.sampleQueues[i12];
            }
            i12++;
        }
    }
}
