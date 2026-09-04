package b5;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import i5.p;
import i5.q;
import i5.t;
import j5.m;
import j5.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f8450t = l.f("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f8451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f8454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p f8455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ListenableWorker f8456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    k5.a f8457g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.b f8459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h5.a f8460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkDatabase f8461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f8462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i5.b f8463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f8464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f8465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f8466p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f8469s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ListenableWorker.a f8458h = ListenableWorker.a.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f8467q = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ListenableFuture f8468r = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f8470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f8471b;

        a(ListenableFuture listenableFuture, androidx.work.impl.utils.futures.c cVar) {
            this.f8470a = listenableFuture;
            this.f8471b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8470a.get();
                l.c().a(j.f8450t, String.format("Starting work for %s", j.this.f8455e.f41042c), new Throwable[0]);
                j jVar = j.this;
                jVar.f8468r = jVar.f8456f.startWork();
                this.f8471b.q(j.this.f8468r);
            } catch (Throwable th2) {
                this.f8471b.p(th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f8473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8474b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f8473a = cVar;
            this.f8474b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f8473a.get();
                    if (aVar == null) {
                        l.c().b(j.f8450t, String.format("%s returned a null result. Treating it as a failure.", j.this.f8455e.f41042c), new Throwable[0]);
                    } else {
                        l.c().a(j.f8450t, String.format("%s returned a %s result.", j.this.f8455e.f41042c, aVar), new Throwable[0]);
                        j.this.f8458h = aVar;
                    }
                    j.this.f();
                } catch (InterruptedException e10) {
                    e = e10;
                    l.c().b(j.f8450t, String.format("%s failed because it threw an exception/error", this.f8474b), e);
                    j.this.f();
                } catch (CancellationException e11) {
                    l.c().d(j.f8450t, String.format("%s was cancelled", this.f8474b), e11);
                    j.this.f();
                } catch (ExecutionException e12) {
                    e = e12;
                    l.c().b(j.f8450t, String.format("%s failed because it threw an exception/error", this.f8474b), e);
                    j.this.f();
                }
            } catch (Throwable th2) {
                j.this.f();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f8476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListenableWorker f8477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h5.a f8478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        k5.a f8479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.b f8480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        WorkDatabase f8481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f8482g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f8483h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        WorkerParameters.a f8484i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, k5.a aVar, h5.a aVar2, WorkDatabase workDatabase, String str) {
            this.f8476a = context.getApplicationContext();
            this.f8479d = aVar;
            this.f8478c = aVar2;
            this.f8480e = bVar;
            this.f8481f = workDatabase;
            this.f8482g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f8484i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.f8483h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f8451a = cVar.f8476a;
        this.f8457g = cVar.f8479d;
        this.f8460j = cVar.f8478c;
        this.f8452b = cVar.f8482g;
        this.f8453c = cVar.f8483h;
        this.f8454d = cVar.f8484i;
        this.f8456f = cVar.f8477b;
        this.f8459i = cVar.f8480e;
        WorkDatabase workDatabase = cVar.f8481f;
        this.f8461k = workDatabase;
        this.f8462l = workDatabase.B();
        this.f8463m = this.f8461k.t();
        this.f8464n = this.f8461k.C();
    }

    private String a(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f8452b);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            l.c().d(f8450t, String.format("Worker result SUCCESS for %s", this.f8466p), new Throwable[0]);
            if (this.f8455e.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            l.c().d(f8450t, String.format("Worker result RETRY for %s", this.f8466p), new Throwable[0]);
            g();
            return;
        }
        l.c().d(f8450t, String.format("Worker result FAILURE for %s", this.f8466p), new Throwable[0]);
        if (this.f8455e.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f8462l.f(str2) != u.CANCELLED) {
                this.f8462l.a(u.FAILED, str2);
            }
            linkedList.addAll(this.f8463m.a(str2));
        }
    }

    private void g() {
        this.f8461k.c();
        try {
            this.f8462l.a(u.ENQUEUED, this.f8452b);
            this.f8462l.t(this.f8452b, System.currentTimeMillis());
            this.f8462l.l(this.f8452b, -1L);
            this.f8461k.r();
        } finally {
            this.f8461k.g();
            i(true);
        }
    }

    private void h() {
        this.f8461k.c();
        try {
            this.f8462l.t(this.f8452b, System.currentTimeMillis());
            this.f8462l.a(u.ENQUEUED, this.f8452b);
            this.f8462l.r(this.f8452b);
            this.f8462l.l(this.f8452b, -1L);
            this.f8461k.r();
        } finally {
            this.f8461k.g();
            i(false);
        }
    }

    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f8461k.c();
        try {
            if (!this.f8461k.B().q()) {
                j5.e.a(this.f8451a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f8462l.a(u.ENQUEUED, this.f8452b);
                this.f8462l.l(this.f8452b, -1L);
            }
            if (this.f8455e != null && (listenableWorker = this.f8456f) != null && listenableWorker.isRunInForeground()) {
                this.f8460j.a(this.f8452b);
            }
            this.f8461k.r();
            this.f8461k.g();
            this.f8467q.o(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f8461k.g();
            throw th2;
        }
    }

    private void j() {
        u uVarF = this.f8462l.f(this.f8452b);
        if (uVarF == u.RUNNING) {
            l.c().a(f8450t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f8452b), new Throwable[0]);
            i(true);
        } else {
            l.c().a(f8450t, String.format("Status for %s is %s; not doing any work", this.f8452b, uVarF), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.e eVarB;
        if (n()) {
            return;
        }
        this.f8461k.c();
        try {
            p pVarG = this.f8462l.g(this.f8452b);
            this.f8455e = pVarG;
            if (pVarG == null) {
                l.c().b(f8450t, String.format("Didn't find WorkSpec for id %s", this.f8452b), new Throwable[0]);
                i(false);
                this.f8461k.r();
                this.f8461k.g();
                return;
            }
            if (pVarG.f41041b != u.ENQUEUED) {
                j();
                this.f8461k.r();
                l.c().a(f8450t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f8455e.f41042c), new Throwable[0]);
                this.f8461k.g();
                return;
            }
            if (pVarG.d() || this.f8455e.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = this.f8455e;
                if (pVar.f41053n != 0 && jCurrentTimeMillis < pVar.a()) {
                    l.c().a(f8450t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f8455e.f41042c), new Throwable[0]);
                    i(true);
                    this.f8461k.r();
                    this.f8461k.g();
                    return;
                }
            }
            this.f8461k.r();
            this.f8461k.g();
            if (this.f8455e.d()) {
                eVarB = this.f8455e.f41044e;
            } else {
                androidx.work.j jVarB = this.f8459i.f().b(this.f8455e.f41043d);
                if (jVarB == null) {
                    l.c().b(f8450t, String.format("Could not create Input Merger %s", this.f8455e.f41043d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f8455e.f41044e);
                    arrayList.addAll(this.f8462l.i(this.f8452b));
                    eVarB = jVarB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f8452b), eVarB, this.f8465o, this.f8454d, this.f8455e.f41050k, this.f8459i.e(), this.f8457g, this.f8459i.m(), new n(this.f8461k, this.f8457g), new m(this.f8461k, this.f8460j, this.f8457g));
            if (this.f8456f == null) {
                this.f8456f = this.f8459i.m().b(this.f8451a, this.f8455e.f41042c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f8456f;
            if (listenableWorker == null) {
                l.c().b(f8450t, String.format("Could not create Worker %s", this.f8455e.f41042c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                l.c().b(f8450t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f8455e.f41042c), new Throwable[0]);
                l();
                return;
            }
            this.f8456f.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
            j5.l lVar = new j5.l(this.f8451a, this.f8455e, this.f8456f, workerParameters.b(), this.f8457g);
            this.f8457g.a().execute(lVar);
            ListenableFuture listenableFutureA = lVar.a();
            listenableFutureA.addListener(new a(listenableFutureA, cVarS), this.f8457g.a());
            cVarS.addListener(new b(cVarS, this.f8466p), this.f8457g.getBackgroundExecutor());
        } catch (Throwable th2) {
            this.f8461k.g();
            throw th2;
        }
    }

    private void m() {
        this.f8461k.c();
        try {
            this.f8462l.a(u.SUCCEEDED, this.f8452b);
            this.f8462l.o(this.f8452b, ((ListenableWorker.a.c) this.f8458h).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f8463m.a(this.f8452b)) {
                if (this.f8462l.f(str) == u.BLOCKED && this.f8463m.b(str)) {
                    l.c().d(f8450t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f8462l.a(u.ENQUEUED, str);
                    this.f8462l.t(str, jCurrentTimeMillis);
                }
            }
            this.f8461k.r();
        } finally {
            this.f8461k.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f8469s) {
            return false;
        }
        l.c().a(f8450t, String.format("Work interrupted for %s", this.f8466p), new Throwable[0]);
        u uVarF = this.f8462l.f(this.f8452b);
        if (uVarF == null) {
            i(false);
        } else {
            i(!uVarF.d());
        }
        return true;
    }

    private boolean o() {
        boolean z10;
        this.f8461k.c();
        try {
            if (this.f8462l.f(this.f8452b) == u.ENQUEUED) {
                this.f8462l.a(u.RUNNING, this.f8452b);
                this.f8462l.s(this.f8452b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8461k.r();
            return z10;
        } finally {
            this.f8461k.g();
        }
    }

    public ListenableFuture b() {
        return this.f8467q;
    }

    public void d() {
        boolean zIsDone;
        this.f8469s = true;
        n();
        ListenableFuture listenableFuture = this.f8468r;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            this.f8468r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f8456f;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            l.c().a(f8450t, String.format("WorkSpec %s is already done. Not interrupting.", this.f8455e), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.f8461k.c();
            try {
                u uVarF = this.f8462l.f(this.f8452b);
                this.f8461k.A().delete(this.f8452b);
                if (uVarF == null) {
                    i(false);
                } else if (uVarF == u.RUNNING) {
                    c(this.f8458h);
                } else if (!uVarF.d()) {
                    g();
                }
                this.f8461k.r();
                this.f8461k.g();
            } catch (Throwable th2) {
                this.f8461k.g();
                throw th2;
            }
        }
        List list = this.f8453c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(this.f8452b);
            }
            f.b(this.f8459i, this.f8461k, this.f8453c);
        }
    }

    void l() {
        this.f8461k.c();
        try {
            e(this.f8452b);
            this.f8462l.o(this.f8452b, ((ListenableWorker.a.C0100a) this.f8458h).e());
            this.f8461k.r();
        } finally {
            this.f8461k.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List listB = this.f8464n.b(this.f8452b);
        this.f8465o = listB;
        this.f8466p = a(listB);
        k();
    }
}
