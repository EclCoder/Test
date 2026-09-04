package c5;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.l;
import androidx.work.u;
import b5.e;
import b5.i;
import e5.c;
import e5.d;
import i5.p;
import j5.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements e, c, b5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f9565i = l.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f9567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f9568c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f9570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9571f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Boolean f9573h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9569d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9572g = new Object();

    public b(Context context, androidx.work.b bVar, k5.a aVar, i iVar) {
        this.f9566a = context;
        this.f9567b = iVar;
        this.f9568c = new d(context, aVar, this);
        this.f9570e = new a(this, bVar.k());
    }

    private void g() {
        this.f9573h = Boolean.valueOf(g.b(this.f9566a, this.f9567b.i()));
    }

    private void h() {
        if (this.f9571f) {
            return;
        }
        this.f9567b.m().c(this);
        this.f9571f = true;
    }

    private void i(String str) {
        synchronized (this.f9572g) {
            try {
                for (p pVar : this.f9569d) {
                    if (pVar.f41040a.equals(str)) {
                        l.c().a(f9565i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f9569d.remove(pVar);
                        this.f9568c.d(this.f9569d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b5.e
    public void a(String str) {
        if (this.f9573h == null) {
            g();
        }
        if (!this.f9573h.booleanValue()) {
            l.c().d(f9565i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        l.c().a(f9565i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f9570e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f9567b.x(str);
    }

    @Override // e5.c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l.c().a(f9565i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f9567b.x(str);
        }
    }

    @Override // b5.e
    public boolean c() {
        return false;
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        i(str);
    }

    @Override // b5.e
    public void e(p... pVarArr) {
        if (this.f9573h == null) {
            g();
        }
        if (!this.f9573h.booleanValue()) {
            l.c().d(f9565i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f41041b == u.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f9570e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (!pVar.b()) {
                    l.c().a(f9565i, String.format("Starting work for %s", pVar.f41040a), new Throwable[0]);
                    this.f9567b.u(pVar.f41040a);
                } else if (pVar.f41049j.h()) {
                    l.c().a(f9565i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                } else if (pVar.f41049j.e()) {
                    l.c().a(f9565i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                } else {
                    hashSet.add(pVar);
                    hashSet2.add(pVar.f41040a);
                }
            }
        }
        synchronized (this.f9572g) {
            try {
                if (!hashSet.isEmpty()) {
                    l.c().a(f9565i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f9569d.addAll(hashSet);
                    this.f9568c.d(this.f9569d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e5.c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l.c().a(f9565i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f9567b.u(str);
        }
    }
}
