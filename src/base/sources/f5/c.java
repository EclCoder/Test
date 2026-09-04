package f5;

import i5.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements e5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38244a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f38245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g5.d f38246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f38247d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(List list);

        void b(List list);
    }

    c(g5.d dVar) {
        this.f38246c = dVar;
    }

    private void h(a aVar, Object obj) {
        if (this.f38244a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f38244a);
        } else {
            aVar.a(this.f38244a);
        }
    }

    @Override // e5.a
    public void a(Object obj) {
        this.f38245b = obj;
        h(this.f38247d, obj);
    }

    abstract boolean b(p pVar);

    abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.f38245b;
        return obj != null && c(obj) && this.f38244a.contains(str);
    }

    public void e(Iterable iterable) {
        this.f38244a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f38244a.add(pVar.f41040a);
            }
        }
        if (this.f38244a.isEmpty()) {
            this.f38246c.c(this);
        } else {
            this.f38246c.a(this);
        }
        h(this.f38247d, this.f38245b);
    }

    public void f() {
        if (this.f38244a.isEmpty()) {
            return;
        }
        this.f38244a.clear();
        this.f38246c.c(this);
    }

    public void g(a aVar) {
        if (this.f38247d != aVar) {
            this.f38247d = aVar;
            h(aVar, this.f38245b);
        }
    }
}
