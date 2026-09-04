package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends im.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40501a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kl.f f40502b;

    @Override // im.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(a0 a0Var) {
        if (this.f40501a >= 0) {
            return false;
        }
        this.f40501a = a0Var.Y();
        return true;
    }

    @Override // im.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kl.f[] b(a0 a0Var) {
        long j10 = this.f40501a;
        this.f40501a = -1L;
        this.f40502b = null;
        return a0Var.X(j10);
    }
}
