package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fm f24568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bm(Fm fm2, kl.f fVar) {
        super(2, fVar);
        this.f24568c = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Bm bm2 = new Bm(this.f24568c, fVar);
        bm2.f24567b = obj;
        return bm2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Bm bm2 = new Bm(this.f24568c, (kl.f) obj2);
        bm2.f24567b = (AbstractC3050im) obj;
        return bm2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object objF = ll.b.f();
        int i10 = this.f24566a;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3050im abstractC3050im = (AbstractC3050im) this.f24567b;
            Fm fm2 = this.f24568c;
            this.f24566a = 1;
            if (fm2.f24802c.f24885b.isEmpty()) {
                C3348u9 c3348u9 = fm2.f24804e;
                if (c3348u9 != null) {
                    c3348u9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                objJ = fl.g0.f38750a;
            } else {
                if (fm2.f24808i == null) {
                    fm2.f24808i = new O3(fm2.f26834a, fm2.f24801b, fm2.f24802c.f24891h, fm2.f24804e);
                    fm2.c();
                }
                O3 o10 = fm2.f24808i;
                if ((o10 == null || !kotlin.jvm.internal.s.c(o10.f25391i, Q3.f25535a)) ? false : abstractC3050im instanceof C3490zn) {
                    O3 o11 = fm2.f24808i;
                    if (o11 != null) {
                        o11.a(fm2.f24802c.f24885b);
                    }
                } else if (abstractC3050im instanceof C2999gm) {
                    O3 o12 = fm2.f24808i;
                    if (o12 == null) {
                        objJ = fl.g0.f38750a;
                    } else if (kotlin.jvm.internal.s.c(o12.f25391i, P3.f25452a)) {
                        objJ = em.i.j(em.c1.c(), new Dm(fm2, o12, null), this);
                        if (objJ != ll.b.f()) {
                            objJ = fl.g0.f38750a;
                        }
                    } else {
                        C3348u9 c3348u10 = fm2.f24804e;
                        if (c3348u10 != null) {
                            c3348u10.a("VideoExperienceManager", "Companion Ad is not Available");
                        }
                        Map mapA = AbstractC3487zk.a(fm2.f24802c.f24891h.f26112a);
                        C3178nk c3178nk = C3178nk.f27064a;
                        C3178nk.b("CompanionAdDropped", mapA, EnumC3281rk.SDK);
                        objJ = em.i.j(em.c1.c(), new Cm(o12, null), this);
                        if (objJ != ll.b.f()) {
                            objJ = fl.g0.f38750a;
                        }
                    }
                    if (objJ != ll.b.f()) {
                        objJ = fl.g0.f38750a;
                    }
                }
                objJ = fl.g0.f38750a;
            }
            if (objJ == objF) {
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
