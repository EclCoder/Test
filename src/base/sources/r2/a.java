package r2;

import o2.i0;
import o2.l0;
import o2.p;
import o2.q;
import o2.r;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f51009a = new u(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f51010b = new l0(-1, -1, "image/avif");

    private boolean a(q qVar, int i10) {
        this.f51009a.P(4);
        qVar.peekFully(this.f51009a.e(), 0, 4);
        return this.f51009a.I() == ((long) i10);
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) {
        return this.f51010b.b(qVar, i0Var);
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f51010b.c(rVar);
    }

    @Override // o2.p
    public boolean d(q qVar) {
        qVar.advancePeekPosition(4);
        return a(qVar, 1718909296) && a(qVar, 1635150182);
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f51010b.seek(j10, j11);
    }

    @Override // o2.p
    public void release() {
    }
}
