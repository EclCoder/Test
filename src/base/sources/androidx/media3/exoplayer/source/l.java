package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f6022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t1.r f6023i;

    @Override // androidx.media3.exoplayer.source.r
    public synchronized t1.r a() {
        return this.f6023i;
    }

    @Override // androidx.media3.exoplayer.source.r
    public q f(r.b bVar, l2.b bVar2, long j10) {
        t1.r rVarA = a();
        w1.a.e(rVarA.f52818b);
        w1.a.f(rVarA.f52818b.f52911b, "Externally loaded mediaItems require a MIME type.");
        t1.r.h hVar = rVarA.f52818b;
        return new k(hVar.f52910a, hVar.f52911b, null);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        ((k) qVar).i();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void k(t1.r rVar) {
        this.f6023i = rVar;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void x(z1.m mVar) {
        y(new i2.s(this.f6022h, true, false, false, null, a()));
    }

    private l(t1.r rVar, long j10, j jVar) {
        this.f6023i = rVar;
        this.f6022h = j10;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void z() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements r.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6024c;

        public b(long j10, j jVar) {
            this.f6024c = j10;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l d(t1.r rVar) {
            return new l(rVar, this.f6024c, null);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a c(e2.k kVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a e(androidx.media3.exoplayer.upstream.b bVar) {
            return this;
        }
    }
}
