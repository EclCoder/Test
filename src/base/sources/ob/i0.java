package ob;

import com.google.android.exoplayer2.w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f48390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1 f48394e = w1.f18938d;

    public i0(d dVar) {
        this.f48390a = dVar;
    }

    public void a(long j10) {
        this.f48392c = j10;
        if (this.f48391b) {
            this.f48393d = this.f48390a.elapsedRealtime();
        }
    }

    @Override // ob.w
    public void b(w1 w1Var) {
        if (this.f48391b) {
            a(getPositionUs());
        }
        this.f48394e = w1Var;
    }

    public void c() {
        if (this.f48391b) {
            return;
        }
        this.f48393d = this.f48390a.elapsedRealtime();
        this.f48391b = true;
    }

    public void d() {
        if (this.f48391b) {
            a(getPositionUs());
            this.f48391b = false;
        }
    }

    @Override // ob.w
    public w1 getPlaybackParameters() {
        return this.f48394e;
    }

    @Override // ob.w
    public long getPositionUs() {
        long j10 = this.f48392c;
        if (!this.f48391b) {
            return j10;
        }
        long jElapsedRealtime = this.f48390a.elapsedRealtime() - this.f48393d;
        w1 w1Var = this.f48394e;
        return j10 + (w1Var.f18942a == 1.0f ? r0.H0(jElapsedRealtime) : w1Var.b(jElapsedRealtime));
    }
}
