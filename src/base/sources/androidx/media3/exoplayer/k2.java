package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.d f5456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t1.w f5460e = t1.w.f53027d;

    public k2(w1.d dVar) {
        this.f5456a = dVar;
    }

    public void a(long j10) {
        this.f5458c = j10;
        if (this.f5457b) {
            this.f5459d = this.f5456a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f5457b) {
            return;
        }
        this.f5459d = this.f5456a.elapsedRealtime();
        this.f5457b = true;
    }

    public void c() {
        if (this.f5457b) {
            a(getPositionUs());
            this.f5457b = false;
        }
    }

    @Override // androidx.media3.exoplayer.j1
    public t1.w getPlaybackParameters() {
        return this.f5460e;
    }

    @Override // androidx.media3.exoplayer.j1
    public long getPositionUs() {
        long j10 = this.f5458c;
        if (!this.f5457b) {
            return j10;
        }
        long jElapsedRealtime = this.f5456a.elapsedRealtime() - this.f5459d;
        t1.w wVar = this.f5460e;
        return j10 + (wVar.f53030a == 1.0f ? w1.c0.E0(jElapsedRealtime) : wVar.a(jElapsedRealtime));
    }

    @Override // androidx.media3.exoplayer.j1
    public void i(t1.w wVar) {
        if (this.f5457b) {
            a(getPositionUs());
        }
        this.f5460e = wVar;
    }
}
