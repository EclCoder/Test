package nm;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import em.d3;
import em.k0;
import em.o;
import em.q;
import em.s;
import em.s0;
import fl.g0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jm.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f extends i implements nm.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47834i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function3 f47835h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements o, d3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f47836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f47837b;

        public a(q qVar, Object obj) {
            this.f47836a = qVar;
            this.f47837b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 e(f fVar, a aVar, Throwable th2) {
            fVar.f(aVar.f47837b);
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 j(f fVar, a aVar, Throwable th2, g0 g0Var, kl.j jVar) {
            f.A().set(fVar, aVar.f47837b);
            fVar.f(aVar.f47837b);
            return g0.f38750a;
        }

        @Override // em.d3
        public void a(a0 a0Var, int i10) {
            this.f47836a.a(a0Var, i10);
        }

        @Override // em.o
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void p(g0 g0Var, Function3 function3) {
            f.A().set(f.this, this.f47837b);
            q qVar = this.f47836a;
            final f fVar = f.this;
            qVar.S(g0Var, new Function1() { // from class: nm.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.e(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // em.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void u(k0 k0Var, g0 g0Var) {
            this.f47836a.u(k0Var, g0Var);
        }

        @Override // em.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object x(g0 g0Var, Object obj, Function3 function3) {
            final f fVar = f.this;
            Object objX = this.f47836a.x(g0Var, obj, new Function3() { // from class: nm.d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.j(fVar, this, (Throwable) obj2, (g0) obj3, (kl.j) obj4);
                }
            });
            if (objX != null) {
                f.A().set(f.this, this.f47837b);
            }
            return objX;
        }

        @Override // kl.f
        public kl.j getContext() {
            return this.f47836a.getContext();
        }

        @Override // em.o
        public boolean h() {
            return this.f47836a.h();
        }

        @Override // em.o
        public void i(Function1 function1) {
            this.f47836a.i(function1);
        }

        @Override // em.o
        public Object m(Throwable th2) {
            return this.f47836a.m(th2);
        }

        @Override // em.o
        public boolean n(Throwable th2) {
            return this.f47836a.n(th2);
        }

        @Override // kl.f
        public void resumeWith(Object obj) {
            this.f47836a.resumeWith(obj);
        }

        @Override // em.o
        public void z(Object obj) {
            this.f47836a.z(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f47839a;
        this.f47835h = new Function3() { // from class: nm.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                f fVar = this.f47827a;
                android.support.v4.media.session.b.a(obj);
                return f.E(fVar, null, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater A() {
        return f47834i;
    }

    private final int B(Object obj) {
        while (d()) {
            Object obj2 = f47834i.get(this);
            if (obj2 != g.f47839a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object C(f fVar, Object obj, kl.f fVar2) {
        if (fVar.c(obj)) {
            return g0.f38750a;
        }
        Object objD = fVar.D(obj, fVar2);
        return objD == ll.b.f() ? objD : g0.f38750a;
    }

    private final Object D(Object obj, kl.f fVar) {
        q qVarB = s.b(ll.b.c(fVar));
        try {
            i(new a(qVarB, obj));
            Object objB = qVarB.B();
            if (objB == ll.b.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objB == ll.b.f() ? objB : g0.f38750a;
        } catch (Throwable th2) {
            qVarB.Q();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 E(final f fVar, mm.a aVar, final Object obj, Object obj2) {
        return new Function3() { // from class: nm.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.F(this.f47828a, obj, (Throwable) obj3, obj4, (kl.j) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 F(f fVar, Object obj, Throwable th2, Object obj2, kl.j jVar) {
        fVar.f(obj);
        return g0.f38750a;
    }

    private final int G(Object obj) {
        while (!u()) {
            if (obj == null) {
                return 1;
            }
            int iB = B(obj);
            if (iB == 1) {
                return 2;
            }
            if (iB == 2) {
                return 1;
            }
        }
        f47834i.set(this, obj);
        return 0;
    }

    @Override // nm.a
    public boolean c(Object obj) {
        int iG = G(obj);
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // nm.a
    public boolean d() {
        return m() == 0;
    }

    @Override // nm.a
    public Object e(Object obj, kl.f fVar) {
        return C(this, obj, fVar);
    }

    public String toString() {
        return "Mutex@" + s0.b(this) + "[isLocked=" + d() + ",owner=" + f47834i.get(this) + ']';
    }

    @Override // nm.a
    public void f(Object obj) {
        while (d()) {
            Object obj2 = f47834i.get(this);
            if (obj2 != g.f47839a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException((PvZsvNiPV.deYdOTwwjWx + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f47834i, this, obj2, g.f47839a)) {
                    t();
                    return;
                }
            }
        }
        throw new IllegalStateException(giNWGaNAgVQoO.LkyCjpNwmuxa);
    }
}
