package com.googlecode.mp4parser.authoring;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Edit {
    private double mediaRate;
    private long mediaTime;
    private double segmentDuration;
    private long timeScale;

    public Edit(long j10, long j11, double d10, double d11) {
        this.timeScale = j11;
        this.segmentDuration = d11;
        this.mediaTime = j10;
        this.mediaRate = d10;
    }

    public double getMediaRate() {
        return this.mediaRate;
    }

    public long getMediaTime() {
        return this.mediaTime;
    }

    public double getSegmentDuration() {
        return this.segmentDuration;
    }

    public long getTimeScale() {
        return this.timeScale;
    }
}
