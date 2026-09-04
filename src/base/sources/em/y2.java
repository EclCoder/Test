package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y2 extends jm.z implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38076e;

    public y2(long j10, kl.f fVar) {
        super(fVar.getContext(), fVar);
        this.f38076e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        x0 x0VarB = y0.b(getContext());
        android.support.v4.media.session.b.a(getContext().get(n0.f38034b));
        G(z2.a(this.f38076e, x0VarB, this, null));
    }

    @Override // em.a, em.e2
    public String s0() {
        return super.s0() + "(timeMillis=" + this.f38076e + ')';
    }
}
