package fp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f38801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Condition f38802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f38803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f38804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f38805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedList f38806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedList f38807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f38808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f38809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f38810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f38811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f38812l;

    /* JADX INFO: renamed from: fp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0581a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f38813e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0581a(Object obj, Object obj2) {
            super(obj);
            this.f38813e = obj2;
        }
    }

    public a(b bVar, int i10, int i11) {
        this.f38803c = (b) ip.a.h(bVar, "Connection factory");
        this.f38810j = ip.a.i(i10, "Max per route value");
        this.f38811k = ip.a.i(i11, "Max total value");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f38801a = reentrantLock;
        this.f38802b = reentrantLock.newCondition();
        this.f38804d = new HashMap();
        this.f38805e = new HashSet();
        this.f38806f = new LinkedList();
        this.f38807g = new LinkedList();
        this.f38808h = new HashMap();
    }

    private d a(Object obj) {
        d dVar = (d) this.f38804d.get(obj);
        if (dVar != null) {
            return dVar;
        }
        C0581a c0581a = new C0581a(obj, obj);
        this.f38804d.put(obj, c0581a);
        return c0581a;
    }

    public void c(c cVar, boolean z10) {
        this.f38801a.lock();
        try {
            if (this.f38805e.remove(cVar)) {
                d dVarA = a(cVar.c());
                dVarA.a(cVar, z10);
                if (!z10 || this.f38809i) {
                    cVar.a();
                } else {
                    this.f38806f.addFirst(cVar);
                }
                b(cVar);
                Future futureB = dVarA.b();
                if (futureB != null) {
                    this.f38807g.remove(futureB);
                } else {
                    futureB = (Future) this.f38807g.poll();
                }
                if (futureB != null) {
                    this.f38802b.signalAll();
                }
            }
        } finally {
            this.f38801a.unlock();
        }
    }

    public void d(int i10) {
        ip.a.i(i10, "Max per route value");
        this.f38801a.lock();
        try {
            this.f38810j = i10;
        } finally {
            this.f38801a.unlock();
        }
    }

    public void e(int i10) {
        ip.a.i(i10, "Max value");
        this.f38801a.lock();
        try {
            this.f38811k = i10;
        } finally {
            this.f38801a.unlock();
        }
    }

    public void f(int i10) {
        this.f38812l = i10;
    }

    public String toString() {
        this.f38801a.lock();
        try {
            return "[leased: " + this.f38805e + "][available: " + this.f38806f + "][pending: " + this.f38807g + "]";
        } finally {
            this.f38801a.unlock();
        }
    }

    protected void b(c cVar) {
    }
}
