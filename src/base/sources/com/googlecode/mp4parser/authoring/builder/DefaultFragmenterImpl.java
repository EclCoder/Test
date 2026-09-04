package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Mp4Arrays;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultFragmenterImpl implements Fragmenter {
    private double fragmentLength;

    public DefaultFragmenterImpl(double d10) {
        this.fragmentLength = d10;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(Track track) {
        long[] jArrCopyOfAndAppend = {1};
        long[] sampleDurations = track.getSampleDurations();
        long[] syncSamples = track.getSyncSamples();
        long timescale = track.getTrackMetaData().getTimescale();
        double d10 = 0.0d;
        for (int i10 = 0; i10 < sampleDurations.length; i10++) {
            d10 += sampleDurations[i10] / timescale;
            if (d10 >= this.fragmentLength && (syncSamples == null || Arrays.binarySearch(syncSamples, i10 + 1) >= 0)) {
                if (i10 > 0) {
                    jArrCopyOfAndAppend = Mp4Arrays.copyOfAndAppend(jArrCopyOfAndAppend, i10 + 1);
                }
                d10 = 0.0d;
            }
        }
        if (d10 >= this.fragmentLength || jArrCopyOfAndAppend.length <= 1) {
            return jArrCopyOfAndAppend;
        }
        long[] jArr = new long[jArrCopyOfAndAppend.length - 1];
        System.arraycopy(jArrCopyOfAndAppend, 0, jArr, 0, jArrCopyOfAndAppend.length - 1);
        return jArr;
    }
}
