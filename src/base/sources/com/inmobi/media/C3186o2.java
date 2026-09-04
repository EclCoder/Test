package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3186o2 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.w f27111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3315t2 f27112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3186o2(hm.w wVar, kl.f fVar, AbstractC3315t2 abstractC3315t2) {
        super(2, fVar);
        this.f27111c = wVar;
        this.f27112d = abstractC3315t2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3186o2 c3186o2 = new C3186o2(this.f27111c, fVar, this.f27112d);
        c3186o2.f27110b = obj;
        return c3186o2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3186o2) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27109a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27110b;
            hm.w wVar = this.f27111c;
            C3160n2 c3160n2 = new C3160n2(o0Var, this.f27112d);
            this.f27109a = 1;
            if (wVar.collect(c3160n2, this) == objF) {
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
