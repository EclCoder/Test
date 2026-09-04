package androidx.work.impl.utils.futures;

import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
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
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f7948d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f7949e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f7950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f7951g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f7952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f7953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f7954c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
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
    /* JADX INFO: loaded from: classes.dex */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f7955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f7956d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f7957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f7958b;

        static {
            if (a.f7948d) {
                f7956d = null;
                f7955c = null;
            } else {
                f7956d = new c(false, null);
                f7955c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f7957a = z10;
            this.f7958b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f7959b = new d(new C0105a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f7960a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0105a extends Throwable {
            C0105a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f7960a = (Throwable) a.d(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f7961d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f7962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f7963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f7964c;

        e(Runnable runnable, Executor executor) {
            this.f7962a = runnable;
            this.f7963b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7969e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f7965a = atomicReferenceFieldUpdater;
            this.f7966b = atomicReferenceFieldUpdater2;
            this.f7967c = atomicReferenceFieldUpdater3;
            this.f7968d = atomicReferenceFieldUpdater4;
            this.f7969e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f7968d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f7969e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f7967c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f7966b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f7965a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f7970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture f7971b;

        g(a aVar, ListenableFuture listenableFuture) {
            this.f7970a = aVar;
            this.f7971b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7970a.f7952a != this) {
                return;
            }
            if (a.f7950f.b(this.f7970a, this, a.i(this.f7971b))) {
                a.f(this.f7970a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f7953b != eVar) {
                        return false;
                    }
                    aVar.f7953b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f7952a != obj) {
                        return false;
                    }
                    aVar.f7952a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f7954c != iVar) {
                        return false;
                    }
                    aVar.f7954c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f7974b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f7973a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f7972c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f7973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f7974b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f7950f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f7973a;
            if (thread != null) {
                this.f7973a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f7950f.e(this, Thread.currentThread());
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
        f7950f = hVar;
        if (th != null) {
            f7949e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7951g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(objJ));
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
            eVar2 = this.f7953b;
        } while (!f7950f.a(this, eVar2, e.f7961d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f7964c;
            eVar4.f7964c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f7964c;
                Runnable runnable = eVarE.f7962a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f7970a;
                    if (aVar.f7952a == gVar) {
                        if (f7950f.b(aVar, gVar, i(gVar.f7971b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f7963b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7949e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f7958b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f7960a);
        }
        if (obj == f7951g) {
            return null;
        }
        return obj;
    }

    static Object i(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).f7952a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f7957a) {
                return cVar.f7958b != null ? new c(false, cVar.f7958b) : c.f7956d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f7948d) && zIsCancelled) {
            return c.f7956d;
        }
        try {
            Object objJ = j(listenableFuture);
            return objJ == null ? f7951g : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static Object j(Future future) {
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

    private void m() {
        i iVar;
        do {
            iVar = this.f7954c;
        } while (!f7950f.c(this, iVar, i.f7972c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f7974b;
        }
    }

    private void n(i iVar) {
        iVar.f7973a = null;
        while (true) {
            i iVar2 = this.f7954c;
            if (iVar2 == i.f7972c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f7974b;
                if (iVar2.f7973a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f7974b = iVar4;
                    if (iVar3.f7973a == null) {
                    }
                } else if (!f7950f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f7953b;
        if (eVar != e.f7961d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f7964c = eVar;
                if (f7950f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f7953b;
                }
            } while (eVar != e.f7961d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f7952a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f7948d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f7955c : c.f7956d;
        }
        a aVar = this;
        boolean z11 = false;
        while (true) {
            if (f7950f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.k();
                }
                f(aVar);
                if (obj instanceof g) {
                    ListenableFuture listenableFuture = ((g) obj).f7971b;
                    if (listenableFuture instanceof a) {
                        aVar = (a) listenableFuture;
                        obj = aVar.f7952a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        listenableFuture.cancel(z10);
                    }
                }
                return true;
            }
            obj = aVar.f7952a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7952a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f7954c;
            if (iVar != i.f7972c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f7950f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7952a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                        break;
                    }
                    iVar = this.f7954c;
                    if (iVar == i.f7972c) {
                    }
                }
            }
            return h(this.f7952a);
        }
        while (nanos > 0) {
            Object obj3 = this.f7952a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
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
        return this.f7952a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7952a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String l() {
        Object obj = this.f7952a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f7971b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean o(Object obj) {
        if (obj == null) {
            obj = f7951g;
        }
        if (!f7950f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean p(Throwable th2) {
        if (!f7950f.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(ListenableFuture listenableFuture) {
        d dVar;
        d(listenableFuture);
        Object obj = this.f7952a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f7950f.b(this, null, i(listenableFuture))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (f7950f.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f7959b;
                    }
                    f7950f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f7952a;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f7957a);
        }
        return false;
    }

    public String toString() {
        String strL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e10) {
                strL = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strL);
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

    private String r(Object obj) {
        return obj == this ? mDXVAtwcaFMHJ.nNGZJTd : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7952a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f7954c;
            if (iVar != i.f7972c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f7950f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7952a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f7954c;
                } while (iVar != i.f7972c);
            }
            return h(this.f7952a);
        }
        throw new InterruptedException();
    }
}
