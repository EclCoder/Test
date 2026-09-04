package s9;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f51531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51532l;

    private void b(long j10, int i10) {
        this.f51531k += j10;
        this.f51532l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return r0.D("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f51521a), Integer.valueOf(this.f51522b), Integer.valueOf(this.f51523c), Integer.valueOf(this.f51524d), Integer.valueOf(this.f51525e), Integer.valueOf(this.f51526f), Integer.valueOf(this.f51527g), Integer.valueOf(this.f51528h), Integer.valueOf(this.f51529i), Integer.valueOf(this.f51530j), Long.valueOf(this.f51531k), Integer.valueOf(this.f51532l));
    }
}
