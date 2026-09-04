package bg;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends zf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sf.e f8879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sf.e preferenceStorage, com.squareup.moshi.r moshi, k0 dispatcher) {
        super(moshi, dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(moshi, "moshi");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f8879c = preferenceStorage;
    }

    @Override // zf.a
    public String e() {
        return this.f8879c.a();
    }
}
