package com.bytedance.sdk.openadsdk.component.aq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class hnj {
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f13325hn;
    private float hnj;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f13326sk;

    public long gjv() {
        return this.qor;
    }

    public float hn() {
        return this.hnj;
    }

    public void hnj(boolean z10) {
        this.gjv = z10;
    }

    public long qor() {
        return this.f13325hn;
    }

    public void hn(long j10) {
        this.f13325hn = j10;
    }

    public long hnj() {
        return this.f13326sk;
    }

    public void qor(long j10) {
        this.qor = j10;
    }

    public void hnj(long j10) {
        this.f13326sk = j10;
    }

    public void hnj(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append("]");
        this.hnj = f10;
    }
}
