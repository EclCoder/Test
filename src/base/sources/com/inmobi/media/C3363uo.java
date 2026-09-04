package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.uo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3363uo extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3363uo(String str, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(2, fVar);
        this.f27653b = str;
        this.f27654c = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3363uo(this.f27653b, this.f27654c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3363uo(this.f27653b, this.f27654c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = ll.b.f();
        int i10 = this.f27652a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        Ao ao2 = Ao.f24492a;
        String str = this.f27653b;
        InterfaceC3322t9 interfaceC3322t9 = this.f27654c;
        this.f27652a = 1;
        Object objA = ao2.a(str, interfaceC3322t9, this);
        return objA == objF ? objF : objA;
    }
}
