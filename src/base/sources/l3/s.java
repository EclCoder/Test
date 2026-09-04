package l3;

import o2.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s implements o2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2.p f43877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f43878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f43879c;

    public s(o2.p pVar, r.a aVar) {
        this.f43877a = pVar;
        this.f43878b = aVar;
    }

    @Override // o2.p
    public int b(o2.q qVar, i0 i0Var) {
        return this.f43877a.b(qVar, i0Var);
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        t tVar = new t(rVar, this.f43878b);
        this.f43879c = tVar;
        this.f43877a.c(tVar);
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        return this.f43877a.d(qVar);
    }

    @Override // o2.p
    public o2.p e() {
        return this.f43877a;
    }

    @Override // o2.p
    public void release() {
        this.f43877a.release();
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        t tVar = this.f43879c;
        if (tVar != null) {
            tVar.a();
        }
        this.f43877a.seek(j10, j11);
    }
}
