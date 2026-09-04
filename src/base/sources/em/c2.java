package em;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c2 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1 {
        a(Object obj) {
            super(1, obj, d2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void b(Throwable th2) {
            ((d2) this.receiver).w(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return fl.g0.f38750a;
        }
    }

    public static final b0 a(z1 z1Var) {
        return new a2(z1Var);
    }

    public static /* synthetic */ b0 b(z1 z1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z1Var = null;
        }
        return b2.a(z1Var);
    }

    public static final void c(kl.j jVar, CancellationException cancellationException) {
        z1 z1Var = (z1) jVar.get(z1.f38078x2);
        if (z1Var != null) {
            z1Var.a(cancellationException);
        }
    }

    public static /* synthetic */ void d(kl.j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b2.c(jVar, cancellationException);
    }

    public static final Object e(z1 z1Var, kl.f fVar) {
        z1.c0(z1Var, null, 1, null);
        Object objC = z1Var.c(fVar);
        return objC == ll.b.f() ? objC : fl.g0.f38750a;
    }

    public static final e1 f(z1 z1Var, e1 e1Var) {
        return k(z1Var, false, new g1(e1Var), 1, null);
    }

    public static final void g(z1 z1Var) {
        if (!z1Var.isActive()) {
            throw z1Var.l();
        }
    }

    public static final void h(kl.j jVar) {
        z1 z1Var = (z1) jVar.get(z1.f38078x2);
        if (z1Var != null) {
            b2.g(z1Var);
        }
    }

    public static final z1 i(kl.j jVar) {
        z1 z1Var = (z1) jVar.get(z1.f38078x2);
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + jVar).toString());
    }

    public static final e1 j(z1 z1Var, boolean z10, d2 d2Var) {
        return z1Var instanceof e2 ? ((e2) z1Var).j0(z10, d2Var) : z1Var.j(d2Var.v(), z10, new a(d2Var));
    }

    public static /* synthetic */ e1 k(z1 z1Var, boolean z10, d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b2.j(z1Var, z10, d2Var);
    }
}
