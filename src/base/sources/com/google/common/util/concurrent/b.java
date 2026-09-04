package com.google.common.util.concurrent;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends xc.a implements ListenableFuture {
    private static final AbstractC0327b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final c0 log;
    private volatile e listeners;
    private volatile Object value;
    private volatile l waiters;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class AbstractC0327b {
        private AbstractC0327b() {
        }

        abstract boolean a(b bVar, e eVar, e eVar2);

        abstract boolean b(b bVar, Object obj, Object obj2);

        abstract boolean c(b bVar, l lVar, l lVar2);

        abstract e d(b bVar, e eVar);

        abstract l e(b bVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f21937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f21938d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f21939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f21940b;

        static {
            if (b.GENERATE_CANCELLATION_CAUSES) {
                f21938d = null;
                f21937c = null;
            } else {
                f21938d = new c(false, null);
                f21937c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f21939a = z10;
            this.f21940b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f21941b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f21942a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f21942a = (Throwable) sc.p.o(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f extends AbstractC0327b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21951e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f21947a = atomicReferenceFieldUpdater;
            this.f21948b = atomicReferenceFieldUpdater2;
            this.f21949c = atomicReferenceFieldUpdater3;
            this.f21950d = atomicReferenceFieldUpdater4;
            this.f21951e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean a(b bVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f21950d, bVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean b(b bVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f21951e, bVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean c(b bVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f21949c, bVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        e d(b bVar, e eVar) {
            return (e) this.f21950d.getAndSet(bVar, eVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        l e(b bVar, l lVar) {
            return (l) this.f21949c.getAndSet(bVar, lVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void f(l lVar, l lVar2) {
            this.f21948b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void g(l lVar, Thread thread) {
            this.f21947a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f21952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture f21953b;

        g(b bVar, ListenableFuture listenableFuture) {
            this.f21952a = bVar;
            this.f21953b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21952a.value != this) {
                return;
            }
            if (b.ATOMIC_HELPER.b(this.f21952a, this, b.j(this.f21953b))) {
                b.g(this.f21952a, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h extends AbstractC0327b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean a(b bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.listeners != eVar) {
                        return false;
                    }
                    bVar.listeners = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean b(b bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.value != obj) {
                        return false;
                    }
                    bVar.value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean c(b bVar, l lVar, l lVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.waiters != lVar) {
                        return false;
                    }
                    bVar.waiters = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        e d(b bVar, e eVar) {
            e eVar2;
            synchronized (bVar) {
                try {
                    eVar2 = bVar.listeners;
                    if (eVar2 != eVar) {
                        bVar.listeners = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        l e(b bVar, l lVar) {
            l lVar2;
            synchronized (bVar) {
                try {
                    lVar2 = bVar.waiters;
                    if (lVar2 != lVar) {
                        bVar.waiters = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void f(l lVar, l lVar2) {
            lVar.f21962b = lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void g(l lVar, Thread thread) {
            lVar.f21961a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface i extends ListenableFuture {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class j extends b implements i {
        j() {
        }

        @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class k extends AbstractC0327b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f21954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f21955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f21956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f21957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f21958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f21959f;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements PrivilegedExceptionAction {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f21956c = unsafe.objectFieldOffset(b.class.getDeclaredField("waiters"));
                f21955b = unsafe.objectFieldOffset(b.class.getDeclaredField("listeners"));
                f21957d = unsafe.objectFieldOffset(b.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                f21958e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f21959f = unsafe.objectFieldOffset(l.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                f21954a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean a(b bVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.ads.i.a(f21954a, bVar, f21955b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean b(b bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.i.a(f21954a, bVar, f21957d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        boolean c(b bVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.ads.i.a(f21954a, bVar, f21956c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        e d(b bVar, e eVar) {
            e eVar2;
            do {
                eVar2 = bVar.listeners;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(bVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        l e(b bVar, l lVar) {
            l lVar2;
            do {
                lVar2 = bVar.waiters;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(bVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void f(l lVar, l lVar2) {
            f21954a.putObject(lVar, f21959f, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0327b
        void g(l lVar, Thread thread) {
            f21954a.putObject(lVar, f21958e, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f21960c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f21961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile l f21962b;

        l(boolean z10) {
        }

        void a(l lVar) {
            b.ATOMIC_HELPER.f(this, lVar);
        }

        void b() {
            Thread thread = this.f21961a;
            if (thread != null) {
                this.f21961a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            b.ATOMIC_HELPER.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.b$a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    static {
        boolean z10;
        Throwable th2;
        AbstractC0327b fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        GENERATE_CANCELLATION_CAUSES = z10;
        log = new c0(b.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            fVar = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(b.class, l.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | Exception e11) {
                h hVar = new h();
                r10 = e11;
                fVar = hVar;
            }
        }
        ATOMIC_HELPER = fVar;
        if (r10 != 0) {
            c0 c0Var = log;
            Logger loggerA = c0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            c0Var.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        NULL = new Object();
    }

    protected b() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objK = k(this);
            sb2.append("SUCCESS, result=[");
            c(sb2, objK);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void c(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void d(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    private static CancellationException e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e f(e eVar) {
        e eVar2 = eVar;
        e eVarD = ATOMIC_HELPER.d(this, e.f21943d);
        while (eVarD != null) {
            e eVar3 = eVarD.f21946c;
            eVarD.f21946c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, boolean z10) {
        e eVar = null;
        while (true) {
            bVar.l();
            if (z10) {
                bVar.interruptTask();
                z10 = false;
            }
            bVar.afterDone();
            e eVarF = bVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f21946c;
                Runnable runnable = eVarF.f21944a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    bVar = gVar.f21952a;
                    if (bVar.value == gVar) {
                        if (ATOMIC_HELPER.b(bVar, gVar, j(gVar.f21953b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarF.f21945b;
                    Objects.requireNonNull(executor);
                    h(runnable2, executor);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f21940b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f21942a);
        }
        return obj == NULL ? h0.b() : obj;
    }

    private static Object k(Future future) {
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
        for (l lVarE = ATOMIC_HELPER.e(this, l.f21960c); lVarE != null; lVarE = lVarE.f21962b) {
            lVarE.b();
        }
    }

    private void m(l lVar) {
        lVar.f21961a = null;
        while (true) {
            l lVar2 = this.waiters;
            if (lVar2 == l.f21960c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f21962b;
                if (lVar2.f21961a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f21962b = lVar4;
                    if (lVar3.f21961a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        sc.p.p(runnable, "Runnable was null.");
        sc.p.p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.listeners) != e.f21943d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f21946c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f21943d);
        }
        h(runnable, executor);
    }

    protected void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f21937c : c.f21938d;
            Objects.requireNonNull(cVar);
        }
        b bVar = this;
        boolean z11 = false;
        while (true) {
            if (ATOMIC_HELPER.b(bVar, obj, cVar)) {
                g(bVar, z10);
                if (obj instanceof g) {
                    ListenableFuture listenableFuture = ((g) obj).f21953b;
                    if (listenableFuture instanceof i) {
                        bVar = (b) listenableFuture;
                        obj = bVar.value;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        listenableFuture.cancel(z10);
                    }
                }
                return true;
            }
            obj = bVar.value;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.waiters;
            if (lVar != l.f21960c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            i0.a(this, nanos);
                            if (Thread.interrupted()) {
                                m(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(lVar2);
                        break;
                    }
                    lVar = this.waiters;
                    if (lVar == l.f21960c) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return i(obj4);
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

    protected void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    protected boolean setException(Throwable th2) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) sc.p.o(th2)))) {
            return false;
        }
        g(this, false);
        return true;
    }

    protected boolean setFuture(ListenableFuture listenableFuture) {
        d dVar;
        sc.p.o(listenableFuture);
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, j(listenableFuture))) {
                    return false;
                }
                g(this, false);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, n.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f21941b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f21939a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            b(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // xc.a
    protected final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).f21942a;
        }
        return null;
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f21939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(ListenableFuture listenableFuture) {
        Throwable thA;
        if (listenableFuture instanceof i) {
            Object cVar = ((b) listenableFuture).value;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f21939a) {
                    cVar = cVar2.f21940b != null ? new c(false, cVar2.f21940b) : c.f21938d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((listenableFuture instanceof xc.a) && (thA = xc.b.a((xc.a) listenableFuture)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            c cVar3 = c.f21938d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objK = k(listenableFuture);
            if (!zIsCancelled) {
                return objK == null ? NULL : objK;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException(PAFNPq.uffChsZUBu + listenableFuture, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f21943d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f21944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f21945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f21946c;

        e(Runnable runnable, Executor executor) {
            this.f21944a = runnable;
            this.f21945b = executor;
        }

        e() {
            this.f21944a = null;
            this.f21945b = null;
        }
    }

    private void b(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        boolean z10 = obj instanceof g;
        String str = dmHT.adNTXAk;
        if (z10) {
            sb2.append(", setFuture=[");
            d(sb2, ((g) obj).f21953b);
            sb2.append(str);
        } else {
            try {
                strA = sc.w.a(pendingToString());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append(str);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            a(sb2);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            l lVar = this.waiters;
            if (lVar != l.f21960c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    lVar = this.waiters;
                } while (lVar != l.f21960c);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
