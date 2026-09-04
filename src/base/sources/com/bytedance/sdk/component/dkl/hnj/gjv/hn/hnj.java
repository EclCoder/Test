package com.bytedance.sdk.component.dkl.hnj.gjv.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12765hn;
    private int hnj;

    hnj(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.hnj = i10;
        this.f12765hn = i11;
    }

    public static hnj gjv() {
        return new hnj(1, 100, -1L);
    }

    public static hnj qor() {
        return new hnj(1, 100, 172800000L);
    }

    public static hnj sk() {
        return new hnj(3, 100, 172800000L);
    }

    public int hn() {
        return this.f12765hn;
    }

    public int hnj() {
        return this.hnj;
    }
}
