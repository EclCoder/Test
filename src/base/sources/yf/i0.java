package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends xf.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf.e f57557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(sf.e preferenceStorage, k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f57557b = preferenceStorage;
    }

    @Override // xf.c
    public /* bridge */ /* synthetic */ Object a(Object obj, kl.f fVar) {
        return c(((Boolean) obj).booleanValue(), fVar);
    }

    protected Object c(boolean z10, kl.f fVar) {
        this.f57557b.k(z10);
        return fl.g0.f38750a;
    }
}
