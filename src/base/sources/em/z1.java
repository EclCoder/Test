package em;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface z1 extends kl.j.b {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final b f38078x2 = b.f38079a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static Object b(z1 z1Var, Object obj, tl.o oVar) {
            return kl.j.b.a.a(z1Var, obj, oVar);
        }

        public static kl.j.b c(z1 z1Var, kl.j.c cVar) {
            return kl.j.b.a.b(z1Var, cVar);
        }

        public static kl.j d(z1 z1Var, kl.j.c cVar) {
            return kl.j.b.a.c(z1Var, cVar);
        }

        public static kl.j e(z1 z1Var, kl.j jVar) {
            return kl.j.b.a.d(z1Var, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements kl.j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f38079a = new b();

        private b() {
        }
    }

    static /* synthetic */ void c0(z1 z1Var, CancellationException cancellationException, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z1Var.a(cancellationException);
    }

    v K0(x xVar);

    void a(CancellationException cancellationException);

    Object c(kl.f fVar);

    boolean h();

    boolean isActive();

    boolean isCancelled();

    e1 j(boolean z10, boolean z11, Function1 function1);

    CancellationException l();

    e1 q(Function1 function1);

    boolean start();
}
