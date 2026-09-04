package om;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import em.o;
import em.q;
import fl.g0;
import fl.r;
import fl.s;
import java.util.concurrent.CancellationException;
import kl.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f48999a;

        a(o oVar) {
            this.f48999a = oVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                o oVar = this.f48999a;
                r.a aVar = r.f38769b;
                oVar.resumeWith(r.b(s.a(exception)));
            } else {
                if (task.isCanceled()) {
                    o.v(this.f48999a, null, 1, null);
                    return;
                }
                o oVar2 = this.f48999a;
                r.a aVar2 = r.f38769b;
                oVar2.resumeWith(r.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: om.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0759b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f49000a;

        C0759b(CancellationTokenSource cancellationTokenSource) {
            this.f49000a = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f49000a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return g0.f38750a;
        }
    }

    public static final Object a(Task task, f fVar) {
        return b(task, null, fVar);
    }

    private static final Object b(Task task, CancellationTokenSource cancellationTokenSource, f fVar) throws Exception {
        if (!task.isComplete()) {
            q qVar = new q(ll.b.c(fVar), 1);
            qVar.H();
            task.addOnCompleteListener(om.a.f48998a, new a(qVar));
            if (cancellationTokenSource != null) {
                qVar.i(new C0759b(cancellationTokenSource));
            }
            Object objB = qVar.B();
            if (objB == ll.b.f()) {
                h.c(fVar);
            }
            return objB;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
