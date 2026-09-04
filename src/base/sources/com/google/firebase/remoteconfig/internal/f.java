package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f22292d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f22293e = new androidx.privacysandbox.ads.adservices.measurement.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f22295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f22296c = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements OnSuccessListener, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f22297a;

        private b() {
            this.f22297a = new CountDownLatch(1);
        }

        public boolean a(long j10, TimeUnit timeUnit) {
            return this.f22297a.await(j10, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f22297a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f22297a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Object obj) {
            this.f22297a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f22294a = executor;
        this.f22295b = uVar;
    }

    public static /* synthetic */ Task a(f fVar, boolean z10, g gVar, Void r10) {
        if (z10) {
            fVar.k(gVar);
        } else {
            fVar.getClass();
        }
        return Tasks.forResult(gVar);
    }

    private static Object c(Task task, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f22293e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map map;
        try {
            strB = uVar.b();
            map = f22292d;
            if (!map.containsKey(strB)) {
                map.put(strB, new f(executor, uVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (f) map.get(strB);
    }

    private synchronized void k(g gVar) {
        this.f22296c = Tasks.forResult(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f22296c = Tasks.forResult(null);
        }
        this.f22295b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f22296c;
            if (task == null || (task.isComplete() && !this.f22296c.isSuccessful())) {
                Executor executor = this.f22294a;
                final u uVar = this.f22295b;
                Objects.requireNonNull(uVar);
                this.f22296c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f22296c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j10) {
        synchronized (this) {
            try {
                Task task = this.f22296c;
                if (task != null && task.isSuccessful()) {
                    return (g) this.f22296c.getResult();
                }
                try {
                    return (g) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Task i(g gVar) {
        return j(gVar, true);
    }

    public Task j(final g gVar, final boolean z10) {
        return Tasks.call(this.f22294a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22287a.f22295b.e(gVar);
            }
        }).onSuccessTask(this.f22294a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return f.a(this.f22289a, z10, gVar, (Void) obj);
            }
        });
    }
}
