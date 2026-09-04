package kn;

import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import fl.g0;
import hn.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f43536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kn.a f43539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f43540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43541f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kn.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ tl.a f43542e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, tl.a aVar) {
            super(str, z10);
            this.f43542e = aVar;
        }

        @Override // kn.a
        public long f() {
            this.f43542e.invoke();
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kn.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ tl.a f43543e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tl.a aVar) {
            super(str, false, 2, null);
            this.f43543e = aVar;
        }

        @Override // kn.a
        public long f() {
            return ((Number) this.f43543e.invoke()).longValue();
        }
    }

    public c(d taskRunner, String name) {
        s.h(taskRunner, "taskRunner");
        s.h(name, "name");
        this.f43536a = taskRunner;
        this.f43537b = name;
        this.f43540e = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j10, boolean z10, tl.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        cVar.c(str, j11, z10, aVar);
    }

    public static /* synthetic */ void m(c cVar, kn.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.l(aVar, j10);
    }

    public final void a() {
        d dVar = this.f43536a;
        if (p.f40722b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.f43536a) {
            try {
                if (b()) {
                    this.f43536a.j(this);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        kn.a aVar = this.f43539d;
        if (aVar != null) {
            s.e(aVar);
            if (aVar.a()) {
                this.f43541f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f43540e.size() - 1; -1 < size; size--) {
            if (((kn.a) this.f43540e.get(size)).a()) {
                Logger loggerI = this.f43536a.i();
                kn.a aVar2 = (kn.a) this.f43540e.get(size);
                if (loggerI.isLoggable(Level.FINE)) {
                    kn.b.c(loggerI, aVar2, this, "canceled");
                }
                this.f43540e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final kn.a e() {
        return this.f43539d;
    }

    public final boolean f() {
        return this.f43541f;
    }

    public final List g() {
        return this.f43540e;
    }

    public final String h() {
        return this.f43537b;
    }

    public final boolean i() {
        return this.f43538c;
    }

    public final d j() {
        return this.f43536a;
    }

    public final void k(String name, long j10, tl.a block) {
        s.h(name, "name");
        s.h(block, "block");
        l(new b(name, block), j10);
    }

    public final void l(kn.a task, long j10) {
        s.h(task, "task");
        synchronized (this.f43536a) {
            if (!this.f43538c) {
                if (n(task, j10, false)) {
                    this.f43536a.j(this);
                }
                g0 g0Var = g0.f38750a;
            } else if (task.a()) {
                Logger loggerI = this.f43536a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    kn.b.c(loggerI, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerI2 = this.f43536a.i();
                if (loggerI2.isLoggable(Level.FINE)) {
                    kn.b.c(loggerI2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void o(kn.a aVar) {
        this.f43539d = aVar;
    }

    public final void p(boolean z10) {
        this.f43541f = z10;
    }

    public final void q() {
        d dVar = this.f43536a;
        if (p.f40722b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.f43536a) {
            try {
                this.f43538c = true;
                if (b()) {
                    this.f43536a.j(this);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.f43537b;
    }

    public final void c(String str, long j10, boolean z10, tl.a block) {
        s.h(str, Lykgign.DiyTxUhWqbzH);
        s.h(block, "block");
        l(new a(str, z10, block), j10);
    }

    public final boolean n(kn.a aVar, long j10, boolean z10) {
        String str;
        s.h(aVar, KPtaxpyICj.FrTdVAxmC);
        aVar.e(this);
        long jNanoTime = this.f43536a.h().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f43540e.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.c() <= j11) {
                Logger loggerI = this.f43536a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    kn.b.c(loggerI, aVar, this, "already scheduled");
                }
                return false;
            }
            this.f43540e.remove(iIndexOf);
        }
        aVar.g(j11);
        Logger loggerI2 = this.f43536a.i();
        if (loggerI2.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + kn.b.b(j11 - jNanoTime);
            } else {
                str = "scheduled after " + kn.b.b(j11 - jNanoTime);
            }
            kn.b.c(loggerI2, aVar, this, str);
        }
        Iterator it = this.f43540e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((kn.a) it.next()).c() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f43540e.size();
        }
        this.f43540e.add(size, aVar);
        return size == 0;
    }
}
