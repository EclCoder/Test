package lm;

import em.p1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f44687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f44688h = X0();

    public f(int i10, int i11, long j10, String str) {
        this.f44684d = i10;
        this.f44685e = i11;
        this.f44686f = j10;
        this.f44687g = str;
    }

    private final a X0() {
        return new a(this.f44684d, this.f44685e, this.f44686f, this.f44687g);
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        a.s(this.f44688h, runnable, false, false, 6, null);
    }

    public final void Y0(Runnable runnable, boolean z10, boolean z11) {
        this.f44688h.r(runnable, z10, z11);
    }
}
