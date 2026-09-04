package lm;

import em.s0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f44691c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f44691c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f44691c.run();
    }

    public String toString() {
        return "Task[" + s0.a(this.f44691c) + '@' + s0.b(this.f44691c) + ", " + this.f44689a + ", " + j.c(this.f44690b) + ']';
    }
}
