package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Nd implements C8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C8 f25345a;

    public Nd(em.o0 scope, AbstractC2912dc mrC50Model, hm.w lifecycleObserver) {
        C8 rd2;
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(mrC50Model, "mrC50Model");
        kotlin.jvm.internal.s.h(lifecycleObserver, "lifecycleObserver");
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(mrC50Model, "mrC50Model");
        kotlin.jvm.internal.s.h(lifecycleObserver, "lifecycleObserver");
        if (mrC50Model instanceof O5) {
            rd2 = new Md(scope, (O5) mrC50Model, lifecycleObserver);
        } else {
            if (!(mrC50Model instanceof C2948en)) {
                throw new NoWhenBranchMatchedException();
            }
            rd2 = new Rd((C2948en) mrC50Model);
        }
        this.f25345a = rd2;
    }

    @Override // com.inmobi.media.C8
    public final void a() {
        this.f25345a.a();
    }

    @Override // com.inmobi.media.C8
    public final hm.e b() {
        return this.f25345a.b();
    }
}
