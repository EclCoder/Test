package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Mp4Arrays;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BetterFragmenter implements Fragmenter {
    private double targetDuration;

    public BetterFragmenter(double d10) {
        this.targetDuration = d10;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(Track track) {
        int i10;
        double timescale = track.getTrackMetaData().getTimescale();
        long j10 = (long) (this.targetDuration * timescale);
        int i11 = 0;
        long[] jArrCopyOfAndAppend = new long[0];
        long[] syncSamples = track.getSyncSamples();
        long[] sampleDurations = track.getSampleDurations();
        if (syncSamples == null) {
            long[] jArrCopyOfAndAppend2 = {1};
            double d10 = 0.0d;
            for (int i12 = 1; i12 < sampleDurations.length; i12++) {
                d10 += sampleDurations[i12] / timescale;
                if (d10 >= this.targetDuration) {
                    if (i12 > 0) {
                        jArrCopyOfAndAppend2 = Mp4Arrays.copyOfAndAppend(jArrCopyOfAndAppend2, i12 + 1);
                    }
                    d10 = 0.0d;
                }
            }
            if (d10 < this.targetDuration && jArrCopyOfAndAppend2.length > 1) {
                jArrCopyOfAndAppend2[jArrCopyOfAndAppend2.length - 1] = jArrCopyOfAndAppend2[jArrCopyOfAndAppend2.length - 2] + ((((long) (sampleDurations.length + 1)) - jArrCopyOfAndAppend2[jArrCopyOfAndAppend2.length - 2]) / 2);
            }
            return jArrCopyOfAndAppend2;
        }
        int length = syncSamples.length;
        long[] jArr = new long[length];
        long duration = track.getDuration();
        long j11 = 0;
        int i13 = 0;
        long j12 = 0;
        while (i13 < sampleDurations.length) {
            int i14 = i11;
            long[] jArr2 = jArrCopyOfAndAppend;
            int iBinarySearch = Arrays.binarySearch(syncSamples, ((long) i13) + 1);
            if (iBinarySearch >= 0) {
                jArr[iBinarySearch] = j12;
            }
            j12 += sampleDurations[i13];
            i13++;
            i11 = i14;
            jArrCopyOfAndAppend = jArr2;
        }
        int i15 = i11;
        while (true) {
            i10 = length - 1;
            if (i15 >= i10) {
                break;
            }
            long j13 = jArr[i15];
            int i16 = i15 + 1;
            long j14 = jArr[i16];
            if (j11 <= j14 && Math.abs(j13 - j11) < Math.abs(j14 - j11)) {
                long[] jArr3 = new long[1];
                jArr3[i11] = syncSamples[i15];
                jArrCopyOfAndAppend = Mp4Arrays.copyOfAndAppend(jArrCopyOfAndAppend, jArr3);
                j11 = jArr[i15] + j10;
            }
            i15 = i16;
        }
        if (duration - jArr[i10] <= j10 / 2) {
            return jArrCopyOfAndAppend;
        }
        long[] jArr4 = new long[1];
        jArr4[i11] = syncSamples[i10];
        return Mp4Arrays.copyOfAndAppend(jArrCopyOfAndAppend, jArr4);
    }
}
