package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3172ne extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.v f27055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Be f27056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3172ne(hm.v vVar, kl.f fVar, Be be2) {
        super(2, fVar);
        this.f27055c = vVar;
        this.f27056d = be2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3172ne c3172ne = new C3172ne(this.f27055c, fVar, this.f27056d);
        c3172ne.f27054b = obj;
        return c3172ne;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3172ne) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27053a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27054b;
            hm.v vVar = this.f27055c;
            C3146me c3146me = new C3146me(o0Var, this.f27056d);
            this.f27053a = 1;
            if (vVar.collect(c3146me, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
