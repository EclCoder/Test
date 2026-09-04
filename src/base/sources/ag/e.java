package ag;

import em.k0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends xf.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rf.b f270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rf.b repository, k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(repository, "repository");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f270b = repository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(g0 g0Var, kl.f fVar) {
        return this.f270b.c();
    }
}
