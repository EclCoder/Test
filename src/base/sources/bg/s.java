package bg;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends zf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sf.e f8898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sf.e preferenceStorage, com.squareup.moshi.r moshi, k0 dispatcher) {
        super(moshi, dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(moshi, "moshi");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f8898c = preferenceStorage;
    }

    @Override // zf.b
    protected void e(String str) {
        kotlin.jvm.internal.s.h(str, "str");
        this.f8898c.C(str);
    }
}
