package r1;

import em.c2;
import em.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AutoCloseable, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.j f50997a;

    public b(kl.j coroutineContext) {
        s.h(coroutineContext, "coroutineContext");
        this.f50997a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        c2.d(i0(), null, 1, null);
    }

    @Override // em.o0
    public kl.j i0() {
        return this.f50997a;
    }
}
