package gm;

import em.e2;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends em.a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f39390d;

    public h(kl.j jVar, g gVar, boolean z10, boolean z11) {
        super(jVar, z10, z11);
        this.f39390d = gVar;
    }

    @Override // em.e2
    public void I(Throwable th2) {
        CancellationException cancellationExceptionH0 = e2.H0(this, th2, null, 1, null);
        this.f39390d.a(cancellationExceptionH0);
        G(cancellationExceptionH0);
    }

    protected final g U0() {
        return this.f39390d;
    }

    @Override // em.e2, em.z1
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(L(), null, this);
        }
        I(cancellationException);
    }

    @Override // gm.t
    public Object b(kl.f fVar) {
        return this.f39390d.b(fVar);
    }

    @Override // gm.u
    public void d(Function1 function1) {
        this.f39390d.d(function1);
    }

    @Override // gm.u
    public Object e(Object obj) {
        return this.f39390d.e(obj);
    }

    @Override // gm.t
    public Object g() {
        return this.f39390d.g();
    }

    @Override // gm.t
    public i iterator() {
        return this.f39390d.iterator();
    }

    @Override // gm.u
    public Object o(Object obj, kl.f fVar) {
        return this.f39390d.o(obj, fVar);
    }

    @Override // gm.u
    public boolean w(Throwable th2) {
        return this.f39390d.w(th2);
    }

    @Override // gm.u
    public boolean y() {
        return this.f39390d.y();
    }
}
