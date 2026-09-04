package bg;

import em.k0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class u extends xf.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf.e f8902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sf.e preferenceStorage, k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f8902b = preferenceStorage;
    }

    @Override // xf.c
    public /* bridge */ /* synthetic */ Object a(Object obj, kl.f fVar) {
        return c(((Number) obj).intValue(), fVar);
    }

    protected Object c(int i10, kl.f fVar) {
        this.f8902b.s(i10);
        return g0.f38750a;
    }
}
