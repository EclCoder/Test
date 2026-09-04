package ob;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f48443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f48444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f48446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f48447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f48448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f48449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48451i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(Object obj, o oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f48452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f48453b = new o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f48455d;

        public c(Object obj) {
            this.f48452a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f48455d) {
                return;
            }
            if (i10 != -1) {
                this.f48453b.a(i10);
            }
            this.f48454c = true;
            aVar.invoke(this.f48452a);
        }

        public void b(b bVar) {
            if (this.f48455d || !this.f48454c) {
                return;
            }
            o oVarE = this.f48453b.e();
            this.f48453b = new o.b();
            this.f48454c = false;
            bVar.a(this.f48452a, oVarE);
        }

        public void c(b bVar) {
            this.f48455d = true;
            if (this.f48454c) {
                this.f48454c = false;
                bVar.a(this.f48452a, this.f48453b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f48452a.equals(((c) obj).f48452a);
        }

        public int hashCode() {
            return this.f48452a.hashCode();
        }
    }

    public t(Looper looper, d dVar, b bVar) {
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
        Iterator it = this.f48446d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f48445c);
            if (this.f48444b.a(0)) {
                return true;
            }
        }
        return true;
    }

    private void l() {
        if (this.f48451i) {
            ob.a.g(Thread.currentThread() == this.f48444b.getLooper().getThread());
        }
    }

    public void c(Object obj) {
        ob.a.e(obj);
        synchronized (this.f48449g) {
            try {
                if (this.f48450h) {
                    return;
                }
                this.f48446d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t d(Looper looper, d dVar, b bVar) {
        return new t(this.f48446d, looper, dVar, bVar, this.f48451i);
    }

    public t e(Looper looper, b bVar) {
        return d(looper, this.f48443a, bVar);
    }

    public void f() {
        l();
        if (this.f48448f.isEmpty()) {
            return;
        }
        if (!this.f48444b.a(0)) {
            q qVar = this.f48444b;
            qVar.b(qVar.obtainMessage(0));
        }
        boolean zIsEmpty = this.f48447e.isEmpty();
        this.f48447e.addAll(this.f48448f);
        this.f48448f.clear();
        if (zIsEmpty) {
            while (!this.f48447e.isEmpty()) {
                ((Runnable) this.f48447e.peekFirst()).run();
                this.f48447e.removeFirst();
            }
        }
    }

    public void h(final int i10, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f48446d);
        this.f48448f.add(new Runnable() { // from class: ob.s
            @Override // java.lang.Runnable
            public final void run() {
                t.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f48449g) {
            this.f48450h = true;
        }
        Iterator it = this.f48446d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f48445c);
        }
        this.f48446d.clear();
    }

    public void j(Object obj) {
        l();
        for (c cVar : this.f48446d) {
            if (cVar.f48452a.equals(obj)) {
                cVar.c(this.f48445c);
                this.f48446d.remove(cVar);
            }
        }
    }

    public void k(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    private t(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, d dVar, b bVar, boolean z10) {
        this.f48443a = dVar;
        this.f48446d = copyOnWriteArraySet;
        this.f48445c = bVar;
        this.f48449g = new Object();
        this.f48447e = new ArrayDeque();
        this.f48448f = new ArrayDeque();
        this.f48444b = dVar.createHandler(looper, new Handler.Callback() { // from class: ob.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f48424a.g(message);
            }
        });
        this.f48451i = z10;
    }
}
