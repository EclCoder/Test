package w2;

import o2.i0;
import o2.l0;
import o2.p;
import o2.q;
import o2.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f55863a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f55863a = new l0(65496, 2, "image/jpeg");
        } else {
            this.f55863a = new b();
        }
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) {
        return this.f55863a.b(qVar, i0Var);
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f55863a.c(rVar);
    }

    @Override // o2.p
    public boolean d(q qVar) {
        return this.f55863a.d(qVar);
    }

    @Override // o2.p
    public void release() {
        this.f55863a.release();
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f55863a.seek(j10, j11);
    }
}
