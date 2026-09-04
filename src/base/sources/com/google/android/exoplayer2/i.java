package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements ob.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.i0 f17035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b2 f17037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ob.w f17038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17039e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17040f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void n(w1 w1Var);
    }

    public i(a aVar, ob.d dVar) {
        this.f17036b = aVar;
        this.f17035a = new ob.i0(dVar);
    }

    private boolean e(boolean z10) {
        b2 b2Var = this.f17037c;
        if (b2Var == null || b2Var.isEnded()) {
            return true;
        }
        if (this.f17037c.isReady()) {
            return false;
        }
        return z10 || this.f17037c.hasReadStreamToEnd();
    }

    private void i(boolean z10) {
        if (e(z10)) {
            this.f17039e = true;
            if (this.f17040f) {
                this.f17035a.c();
                return;
            }
            return;
        }
        ob.w wVar = (ob.w) ob.a.e(this.f17038d);
        long positionUs = wVar.getPositionUs();
        if (this.f17039e) {
            if (positionUs < this.f17035a.getPositionUs()) {
                this.f17035a.d();
                return;
            } else {
                this.f17039e = false;
                if (this.f17040f) {
                    this.f17035a.c();
                }
            }
        }
        this.f17035a.a(positionUs);
        w1 playbackParameters = wVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f17035a.getPlaybackParameters())) {
            return;
        }
        this.f17035a.b(playbackParameters);
        this.f17036b.n(playbackParameters);
    }

    public void a(b2 b2Var) {
        if (b2Var == this.f17037c) {
            this.f17038d = null;
            this.f17037c = null;
            this.f17039e = true;
        }
    }

    @Override // ob.w
    public void b(w1 w1Var) {
        ob.w wVar = this.f17038d;
        if (wVar != null) {
            wVar.b(w1Var);
            w1Var = this.f17038d.getPlaybackParameters();
        }
        this.f17035a.b(w1Var);
    }

    public void c(b2 b2Var) throws ExoPlaybackException {
        ob.w wVar;
        ob.w mediaClock = b2Var.getMediaClock();
        if (mediaClock == null || mediaClock == (wVar = this.f17038d)) {
            return;
        }
        if (wVar != null) {
            throw ExoPlaybackException.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f17038d = mediaClock;
        this.f17037c = b2Var;
        mediaClock.b(this.f17035a.getPlaybackParameters());
    }

    public void d(long j10) {
        this.f17035a.a(j10);
    }

    public void f() {
        this.f17040f = true;
        this.f17035a.c();
    }

    public void g() {
        this.f17040f = false;
        this.f17035a.d();
    }

    @Override // ob.w
    public w1 getPlaybackParameters() {
        ob.w wVar = this.f17038d;
        return wVar != null ? wVar.getPlaybackParameters() : this.f17035a.getPlaybackParameters();
    }

    @Override // ob.w
    public long getPositionUs() {
        return this.f17039e ? this.f17035a.getPositionUs() : ((ob.w) ob.a.e(this.f17038d)).getPositionUs();
    }

    public long h(boolean z10) {
        i(z10);
        return getPositionUs();
    }
}
