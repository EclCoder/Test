package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class yo extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(String str, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(1, fVar);
        this.f27964b = str;
        this.f27965c = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new yo(this.f27964b, this.f27965c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new yo(this.f27964b, this.f27965c, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27963a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        Ao ao2 = Ao.f24492a;
        String str = this.f27964b;
        InterfaceC3322t9 interfaceC3322t9 = this.f27965c;
        this.f27963a = 1;
        em.v0 v0VarB = em.k.b(H9.f24931d, null, em.q0.UNDISPATCHED, new C3415wo(str, interfaceC3322t9, null), 1, null);
        return v0VarB == objF ? objF : v0VarB;
    }
}
