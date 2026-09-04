package nm;

import java.util.concurrent.atomic.AtomicReferenceArray;
import jm.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f47857e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f47857e = new AtomicReferenceArray(j.f47856f);
    }

    @Override // jm.a0
    public int r() {
        return j.f47856f;
    }

    @Override // jm.a0
    public void s(int i10, Throwable th2, kl.j jVar) {
        v().set(i10, j.f47855e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f42636c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f47857e;
    }
}
