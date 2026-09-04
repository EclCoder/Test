package ag;

import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import em.k0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends xf.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf.e f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.squareup.moshi.r f274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sf.e preferenceStorage, com.squareup.moshi.r moshi, k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(moshi, "moshi");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f273b = preferenceStorage;
        this.f274c = moshi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(g0 g0Var, kl.f fVar) {
        String strA = this.f273b.A();
        if (strA.length() == 0) {
            return null;
        }
        com.squareup.moshi.f fVarC = this.f274c.c(FBLiveDestination.class);
        kotlin.jvm.internal.s.g(fVarC, "adapter(...)");
        return fVarC.fromJson(strA);
    }
}
