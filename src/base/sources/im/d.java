package im;

import em.o0;
import em.p0;
import em.q0;
import em.s0;
import fl.g0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl.j f41485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gm.a f41487c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41488r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f41489s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ hm.f f41490t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ d f41491u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hm.f fVar, d dVar, kl.f fVar2) {
            super(2, fVar2);
            this.f41490t = fVar;
            this.f41491u = dVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f41490t, this.f41491u, fVar);
            aVar.f41489s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o0 o0Var = (o0) this.f41489s;
            Object objF = ll.b.f();
            int i10 = this.f41488r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.f fVar = this.f41490t;
                gm.t tVarN = this.f41491u.n(o0Var);
                this.f41489s = kotlin.coroutines.jvm.internal.l.a(o0Var);
                this.f41488r = 1;
                if (hm.g.m(fVar, tVarN, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41492r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f41493s;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gm.s sVar, kl.f fVar) {
            return ((b) create(sVar, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = d.this.new b(fVar);
            bVar.f41493s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            gm.s sVar = (gm.s) this.f41493s;
            Object objF = ll.b.f();
            int i10 = this.f41492r;
            if (i10 == 0) {
                fl.s.b(obj);
                d dVar = d.this;
                this.f41493s = kotlin.coroutines.jvm.internal.l.a(sVar);
                this.f41492r = 1;
                if (dVar.h(sVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    public d(kl.j jVar, int i10, gm.a aVar) {
        this.f41485a = jVar;
        this.f41486b = i10;
        this.f41487c = aVar;
    }

    static /* synthetic */ Object f(d dVar, hm.f fVar, kl.f fVar2) {
        Object objD = p0.d(new a(fVar, dVar, null), fVar2);
        return objD == ll.b.f() ? objD : g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // im.k
    public hm.e a(kl.j jVar, int i10, gm.a aVar) {
        kl.j jVarPlus = jVar.plus(this.f41485a);
        if (aVar == gm.a.SUSPEND) {
            int i11 = this.f41486b;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = this.f41487c;
        }
        return (kotlin.jvm.internal.s.c(jVarPlus, this.f41485a) && i10 == this.f41486b && aVar == this.f41487c) ? this : i(jVarPlus, i10, aVar);
    }

    @Override // hm.e
    public Object collect(hm.f fVar, kl.f fVar2) {
        return f(this, fVar, fVar2);
    }

    protected String e() {
        return null;
    }

    protected abstract Object h(gm.s sVar, kl.f fVar);

    protected abstract d i(kl.j jVar, int i10, gm.a aVar);

    public hm.e k() {
        return null;
    }

    public final tl.o l() {
        return new b(null);
    }

    public final int m() {
        int i10 = this.f41486b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public gm.t n(o0 o0Var) {
        return gm.q.c(o0Var, this.f41485a, m(), this.f41487c, q0.ATOMIC, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        if (this.f41485a != kl.k.f43531a) {
            arrayList.add("context=" + this.f41485a);
        }
        if (this.f41486b != -3) {
            arrayList.add("capacity=" + this.f41486b);
        }
        if (this.f41487c != gm.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f41487c);
        }
        return s0.a(this) + '[' + gl.r.l0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
