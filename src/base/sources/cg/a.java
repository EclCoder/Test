package cg;

import em.k0;
import fl.g0;
import kl.f;
import kotlin.jvm.internal.s;
import sf.e;
import xf.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f9986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e preferenceStorage, k0 dispatcher) {
        super(dispatcher);
        s.h(preferenceStorage, "preferenceStorage");
        s.h(dispatcher, "dispatcher");
        this.f9986b = preferenceStorage;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(g0 g0Var, f fVar) {
        return kotlin.coroutines.jvm.internal.b.a(this.f9986b.i());
    }
}
