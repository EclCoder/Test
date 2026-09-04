package al;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AtomicReferenceArray implements Runnable, Callable, rk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f388b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f389c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f390d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f391e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f392a;

    public h(Runnable runnable, uk.a aVar) {
        super(3);
        this.f392a = runnable;
        lazySet(0, aVar);
    }

    public void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f391e) {
                return;
            }
            if (obj == f389c) {
                future.cancel(false);
                return;
            } else if (obj == f390d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // rk.b
    public void d() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f391e || obj5 == (obj3 = f389c) || obj5 == (obj4 = f390d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z10);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f391e || obj == (obj2 = f388b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((uk.a) obj).a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f392a.run();
        } catch (Throwable th2) {
            try {
                cl.a.k(th2);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != f388b && compareAndSet(0, obj3, f391e) && obj3 != null) {
                    ((uk.a) obj3).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == f389c || obj == f390d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f391e));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != f388b && compareAndSet(0, obj4, f391e) && obj4 != null) {
            ((uk.a) obj4).a(this);
        }
        do {
            obj = get(1);
            Object obj5 = f389c;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!compareAndSet(1, obj, f391e));
    }
}
