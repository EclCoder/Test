package w1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f55803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f55804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f55805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f55806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f55807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f55808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f55809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55811i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(Object obj, t1.n nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f55812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t1.n.b f55813b = new t1.n.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f55814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f55815d;

        public c(Object obj) {
            this.f55812a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f55815d) {
                return;
            }
            if (i10 != -1) {
                this.f55813b.a(i10);
            }
            this.f55814c = true;
            aVar.invoke(this.f55812a);
        }

        public void b(b bVar) {
            if (this.f55815d || !this.f55814c) {
                return;
            }
            t1.n nVarE = this.f55813b.e();
            this.f55813b = new t1.n.b();
            this.f55814c = false;
            bVar.a(this.f55812a, nVarE);
        }

        public void c(b bVar) {
            this.f55815d = true;
            if (this.f55814c) {
                this.f55814c = false;
                bVar.a(this.f55812a, this.f55813b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f55812a.equals(((c) obj).f55812a);
        }

        public int hashCode() {
            return this.f55812a.hashCode();
        }
    }

    public m(Looper looper, d dVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f55806d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f55805c);
            if (this.f55804b.a(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f55811i) {
            w1.a.g(Thread.currentThread() == this.f55804b.getLooper().getThread());
        }
    }

    public void c(Object obj) {
        w1.a.e(obj);
        synchronized (this.f55809g) {
            try {
                if (this.f55810h) {
                    return;
                }
                this.f55806d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m d(Looper looper, d dVar, b bVar) {
        return new m(this.f55806d, looper, dVar, bVar, this.f55811i);
    }

    public m e(Looper looper, b bVar) {
        return d(looper, this.f55803a, bVar);
    }

    public void f() {
        l();
        if (this.f55808f.isEmpty()) {
            return;
        }
        if (!this.f55804b.a(1)) {
            j jVar = this.f55804b;
            jVar.b(jVar.obtainMessage(1));
        }
        boolean zIsEmpty = this.f55807e.isEmpty();
        this.f55807e.addAll(this.f55808f);
        this.f55808f.clear();
        if (zIsEmpty) {
            while (!this.f55807e.isEmpty()) {
                ((Runnable) this.f55807e.peekFirst()).run();
                this.f55807e.removeFirst();
            }
        }
    }

    public void h(final int i10, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f55806d);
        this.f55808f.add(new Runnable() { // from class: w1.l
            @Override // java.lang.Runnable
            public final void run() {
                m.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f55809g) {
            this.f55810h = true;
        }
        Iterator it = this.f55806d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f55805c);
        }
        this.f55806d.clear();
    }

    public void j(Object obj) {
        l();
        for (c cVar : this.f55806d) {
            if (cVar.f55812a.equals(obj)) {
                cVar.c(this.f55805c);
                this.f55806d.remove(cVar);
            }
        }
    }

    public void k(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    private m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, d dVar, b bVar, boolean z10) {
        this.f55803a = dVar;
        this.f55806d = copyOnWriteArraySet;
        this.f55805c = bVar;
        this.f55809g = new Object();
        this.f55807e = new ArrayDeque();
        this.f55808f = new ArrayDeque();
        this.f55804b = dVar.createHandler(looper, new Handler.Callback() { // from class: w1.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f55799a.g(message);
            }
        });
        this.f55811i = z10;
    }
}
