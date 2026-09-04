package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f1973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f1974c = androidx.concurrent.futures.d.r();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1975d;

        a() {
        }

        private void e() {
            this.f1972a = null;
            this.f1973b = null;
            this.f1974c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d dVar = this.f1974c;
            if (dVar != null) {
                dVar.addListener(runnable, executor);
            }
        }

        void b() {
            this.f1972a = null;
            this.f1973b = null;
            this.f1974c.n(null);
        }

        public boolean c(Object obj) {
            this.f1975d = true;
            d dVar = this.f1973b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f1975d = true;
            d dVar = this.f1973b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th2) {
            this.f1975d = true;
            d dVar = this.f1973b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f1973b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1972a));
            }
            if (this.f1975d || (dVar = this.f1974c) == null) {
                return;
            }
            dVar.n(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0022c {
        Object attachCompleter(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements ListenableFuture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f1976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f1977b = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String k() {
                a aVar = (a) d.this.f1976a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1972a + "]";
            }
        }

        d(a aVar) {
            this.f1976a = new WeakReference(aVar);
        }

        boolean a(boolean z10) {
            return this.f1977b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f1977b.addListener(runnable, executor);
        }

        boolean b(Object obj) {
            return this.f1977b.n(obj);
        }

        boolean c(Throwable th2) {
            return this.f1977b.o(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f1976a.get();
            boolean zCancel = this.f1977b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f1977b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1977b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1977b.isDone();
        }

        public String toString() {
            return this.f1977b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f1977b.get(j10, timeUnit);
        }
    }

    public static ListenableFuture a(InterfaceC0022c interfaceC0022c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f1973b = dVar;
        aVar.f1972a = interfaceC0022c.getClass();
        try {
            Object objAttachCompleter = interfaceC0022c.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return dVar;
            }
            aVar.f1972a = objAttachCompleter;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
