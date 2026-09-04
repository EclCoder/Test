package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f1947d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f1948e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f1949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f1950g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f1951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f1952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f1953c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f1954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f1955d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f1956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f1957b;

        static {
            if (a.f1947d) {
                f1955d = null;
                f1954c = null;
            } else {
                f1955d = new c(false, null);
                f1954c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f1956a = z10;
            this.f1957b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f1958b = new d(new C0021a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f1959a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0021a extends Throwable {
            C0021a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f1959a = (Throwable) a.d(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f1960d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f1961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f1962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f1963c;

        e(Runnable runnable, Executor executor) {
            this.f1961a = runnable;
            this.f1962b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1968e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f1964a = atomicReferenceFieldUpdater;
            this.f1965b = atomicReferenceFieldUpdater2;
            this.f1966c = atomicReferenceFieldUpdater3;
            this.f1967d = atomicReferenceFieldUpdater4;
            this.f1968e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1967d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1968e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1966c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1965b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1964a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements Runnable {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1952b != eVar) {
                        return false;
                    }
                    aVar.f1952b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1951a != obj) {
                        return false;
                    }
                    aVar.f1951a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1953c != iVar) {
                        return false;
                    }
                    aVar.f1953c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1971b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1970a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f1969c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f1970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f1971b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f1949f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1970a;
            if (thread != null) {
                this.f1970a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f1949f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f1949f = hVar;
        if (th != null) {
            f1948e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1950g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objI = i(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(p(objI));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1952b;
        } while (!f1949f.a(this, eVar2, e.f1960d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1963c;
            eVar4.f1963c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a aVar) {
        aVar.l();
        aVar.b();
        e eVarE = aVar.e(null);
        while (eVarE != null) {
            e eVar = eVarE.f1963c;
            Runnable runnable = eVarE.f1961a;
            if (runnable instanceof g) {
                android.support.v4.media.session.b.a(runnable);
                throw null;
            }
            g(runnable, eVarE.f1962b);
            eVarE = eVar;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f1948e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f1957b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1959a);
        }
        if (obj == f1950g) {
            return null;
        }
        return obj;
    }

    static Object i(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void l() {
        i iVar;
        do {
            iVar = this.f1953c;
        } while (!f1949f.c(this, iVar, i.f1969c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1971b;
        }
    }

    private void m(i iVar) {
        iVar.f1970a = null;
        while (true) {
            i iVar2 = this.f1953c;
            if (iVar2 == i.f1969c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1971b;
                if (iVar2.f1970a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1971b = iVar4;
                    if (iVar3.f1970a == null) {
                    }
                } else if (!f1949f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String p(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f1952b;
        if (eVar != e.f1960d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1963c = eVar;
                if (f1949f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1952b;
                }
            } while (eVar != e.f1960d);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f1951a;
        if (obj == null) {
            if (f1947d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z10 ? c.f1954c : c.f1955d;
            }
            if (f1949f.b(this, obj, cVar)) {
                if (z10) {
                    j();
                }
                f(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1951a;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1953c;
            if (iVar != i.f1969c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f1949f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1951a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(iVar2);
                        break;
                    }
                    iVar = this.f1953c;
                    if (iVar == i.f1969c) {
                    }
                }
            }
            return h(this.f1951a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1951a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1951a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1951a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean n(Object obj) {
        if (obj == null) {
            obj = f1950g;
        }
        if (!f1949f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean o(Throwable th2) {
        if (!f1949f.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected final boolean q() {
        Object obj = this.f1951a;
        return (obj instanceof c) && ((c) obj).f1956a;
    }

    public String toString() {
        String strK;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strK = k();
            } catch (RuntimeException e10) {
                strK = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strK != null && !strK.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strK);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void b() {
    }

    protected void j() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1951a;
            if (obj2 != null) {
                return h(obj2);
            }
            i iVar = this.f1953c;
            if (iVar != i.f1969c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1949f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1951a;
                            } else {
                                m(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return h(obj);
                    }
                    iVar = this.f1953c;
                } while (iVar != i.f1969c);
            }
            return h(this.f1951a);
        }
        throw new InterruptedException();
    }
}
