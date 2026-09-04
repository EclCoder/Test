package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ke implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25119a;

    public Ke(em.o0 o0Var, Function1 function1) {
        this.f25119a = function1;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        this.f25119a.invoke(kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue()));
        return fl.g0.f38750a;
    }
}
