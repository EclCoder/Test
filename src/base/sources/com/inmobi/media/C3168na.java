package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3168na implements gn.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3168na f27047a = new C3168na();

    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) {
        kotlin.jvm.internal.s.h(chain, "chain");
        EnumC2931e6 enumC2931e6A = Ze.a();
        if (enumC2931e6A != null) {
            new gn.f0.a().q(chain.e()).o(gn.c0.HTTP_1_1).f(enumC2931e6A.f26471a).l(enumC2931e6A.toString()).b(gn.g0.create((gn.a0) null, "")).c();
        }
        gn.f0 f0VarC = chain.c(chain.e());
        kotlin.jvm.internal.s.g(f0VarC, "proceed(...)");
        return f0VarC;
    }
}
