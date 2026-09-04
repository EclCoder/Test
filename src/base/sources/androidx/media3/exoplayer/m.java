package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class m implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f5495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f2 f5497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f5498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5499e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5500f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void onPlaybackParametersChanged(t1.w wVar);
    }

    public m(a aVar, w1.d dVar) {
        this.f5496b = aVar;
        this.f5495a = new k2(dVar);
    }

    private boolean d(boolean z10) {
        f2 f2Var = this.f5497c;
        if (f2Var == null || f2Var.isEnded()) {
            return true;
        }
        if (z10 && this.f5497c.getState() != 2) {
            return true;
        }
        if (this.f5497c.isReady()) {
            return false;
        }
        return z10 || this.f5497c.hasReadStreamToEnd();
    }

    private void h(boolean z10) {
        if (d(z10)) {
            this.f5499e = true;
            if (this.f5500f) {
                this.f5495a.b();
                return;
            }
            return;
        }
        j1 j1Var = (j1) w1.a.e(this.f5498d);
        long positionUs = j1Var.getPositionUs();
        if (this.f5499e) {
            if (positionUs < this.f5495a.getPositionUs()) {
                this.f5495a.c();
                return;
            } else {
                this.f5499e = false;
                if (this.f5500f) {
                    this.f5495a.b();
                }
            }
        }
        this.f5495a.a(positionUs);
        t1.w playbackParameters = j1Var.getPlaybackParameters();
        if (playbackParameters.equals(this.f5495a.getPlaybackParameters())) {
            return;
        }
        this.f5495a.i(playbackParameters);
        this.f5496b.onPlaybackParametersChanged(playbackParameters);
    }

    public void a(f2 f2Var) {
        if (f2Var == this.f5497c) {
            this.f5498d = null;
            this.f5497c = null;
            this.f5499e = true;
        }
    }

    public void b(f2 f2Var) throws ExoPlaybackException {
        j1 j1Var;
        j1 mediaClock = f2Var.getMediaClock();
        if (mediaClock == null || mediaClock == (j1Var = this.f5498d)) {
            return;
        }
        if (j1Var != null) {
            throw ExoPlaybackException.j(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f5498d = mediaClock;
        this.f5497c = f2Var;
        mediaClock.i(this.f5495a.getPlaybackParameters());
    }

    public void c(long j10) {
        this.f5495a.a(j10);
    }

    public void e() {
        this.f5500f = true;
        this.f5495a.b();
    }

    public void f() {
        this.f5500f = false;
        this.f5495a.c();
    }

    public long g(boolean z10) {
        h(z10);
        return getPositionUs();
    }

    @Override // androidx.media3.exoplayer.j1
    public t1.w getPlaybackParameters() {
        j1 j1Var = this.f5498d;
        return j1Var != null ? j1Var.getPlaybackParameters() : this.f5495a.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.j1
    public long getPositionUs() {
        return this.f5499e ? this.f5495a.getPositionUs() : ((j1) w1.a.e(this.f5498d)).getPositionUs();
    }

    @Override // androidx.media3.exoplayer.j1
    public void i(t1.w wVar) {
        j1 j1Var = this.f5498d;
        if (j1Var != null) {
            j1Var.i(wVar);
            wVar = this.f5498d.getPlaybackParameters();
        }
        this.f5495a.i(wVar);
    }

    @Override // androidx.media3.exoplayer.j1
    public boolean q() {
        return this.f5499e ? this.f5495a.q() : ((j1) w1.a.e(this.f5498d)).q();
    }
}
