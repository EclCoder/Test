package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3413wm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.e f27810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fm f27811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3413wm(hm.e eVar, kl.f fVar, Fm fm2) {
        super(2, fVar);
        this.f27810c = eVar;
        this.f27811d = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3413wm c3413wm = new C3413wm(this.f27810c, fVar, this.f27811d);
        c3413wm.f27809b = obj;
        return c3413wm;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3413wm) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27808a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27809b;
            hm.e eVar = this.f27810c;
            C3387vm c3387vm = new C3387vm(o0Var, this.f27811d);
            this.f27808a = 1;
            if (eVar.collect(c3387vm, this) == objF) {
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
