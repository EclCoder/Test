package androidx.lifecycle;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4496r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4497s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ s f4498t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ s.b f4499u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ tl.o f4500v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, s.b bVar, tl.o oVar, kl.f fVar) {
            super(2, fVar);
            this.f4498t = sVar;
            this.f4499u = bVar;
            this.f4500v = oVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f4498t, this.f4499u, this.f4500v, fVar);
            aVar.f4497s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u uVar;
            Object objF = ll.b.f();
            int i10 = this.f4496r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = (u) this.f4497s;
                try {
                    fl.s.b(obj);
                    uVar.b();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    uVar.b();
                    throw th;
                }
            }
            fl.s.b(obj);
            z1 z1Var = (z1) ((em.o0) this.f4497s).i0().get(z1.f38078x2);
            if (z1Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            s0 s0Var = new s0();
            u uVar2 = new u(this.f4498t, this.f4499u, s0Var.f4481c, z1Var);
            try {
                tl.o oVar = this.f4500v;
                this.f4497s = uVar2;
                this.f4496r = 1;
                obj = em.i.j(s0Var, oVar, this);
                if (obj == objF) {
                    return objF;
                }
                uVar = uVar2;
                uVar.b();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                uVar = uVar2;
                uVar.b();
                throw th;
            }
        }
    }

    public static final Object a(s sVar, tl.o oVar, kl.f fVar) {
        return b(sVar, s.b.STARTED, oVar, fVar);
    }

    public static final Object b(s sVar, s.b bVar, tl.o oVar, kl.f fVar) {
        return em.i.j(em.c1.c().X0(), new a(sVar, bVar, oVar, null), fVar);
    }
}
