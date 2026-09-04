package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5393l;

    private void b(long j10, int i10) {
        this.f5392k += j10;
        this.f5393l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return w1.c0.F("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f5382a), Integer.valueOf(this.f5383b), Integer.valueOf(this.f5384c), Integer.valueOf(this.f5385d), Integer.valueOf(this.f5386e), Integer.valueOf(this.f5387f), Integer.valueOf(this.f5388g), Integer.valueOf(this.f5389h), Integer.valueOf(this.f5390i), Integer.valueOf(this.f5391j), Long.valueOf(this.f5392k), Integer.valueOf(this.f5393l));
    }
}
