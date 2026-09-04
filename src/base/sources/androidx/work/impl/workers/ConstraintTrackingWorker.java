package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import b5.i;
import com.google.common.util.concurrent.ListenableFuture;
import e5.c;
import e5.d;
import i5.p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7977f = l.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WorkerParameters f7978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f7979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f7980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f7981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListenableWorker f7982e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f7984a;

        b(ListenableFuture listenableFuture) {
            this.f7984a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f7979b) {
                try {
                    if (ConstraintTrackingWorker.this.f7980c) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.f7981d.q(this.f7984a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f7978a = workerParameters;
        this.f7979b = new Object();
        this.f7980c = false;
        this.f7981d = androidx.work.impl.utils.futures.c.s();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    @Override // e5.c
    public void b(List list) {
        l.c().a(f7977f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f7979b) {
            this.f7980c = true;
        }
    }

    void c() {
        this.f7981d.o(ListenableWorker.a.a());
    }

    void d() {
        this.f7981d.o(ListenableWorker.a.b());
    }

    void e() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            l.c().b(f7977f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f7978a);
        this.f7982e = listenableWorkerB;
        if (listenableWorkerB == null) {
            l.c().a(f7977f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p pVarG = a().B().g(getId().toString());
        if (pVarG == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(pVarG));
        if (!dVar.c(getId().toString())) {
            l.c().a(f7977f, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
            d();
            return;
        }
        l.c().a(f7977f, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
        try {
            ListenableFuture listenableFutureStartWork = this.f7982e.startWork();
            listenableFutureStartWork.addListener(new b(listenableFutureStartWork), getBackgroundExecutor());
        } catch (Throwable th2) {
            l lVarC = l.c();
            String str = f7977f;
            lVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th2);
            synchronized (this.f7979b) {
                try {
                    if (this.f7980c) {
                        l.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public k5.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f7982e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f7982e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f7982e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f7981d;
    }

    @Override // e5.c
    public void f(List list) {
    }
}
