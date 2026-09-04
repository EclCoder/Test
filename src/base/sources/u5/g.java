package u5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f54140a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f54141b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f54142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f54143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f54144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f54145d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f54143b == null) {
                this.f54143b = new ArrayList();
            }
            this.f54143b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f54143b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f54143b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f54145d = this;
            this.f54144c = this;
            this.f54142a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f54140a;
        aVar.f54145d = aVar2;
        aVar.f54144c = aVar2.f54144c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f54140a;
        aVar.f54145d = aVar2.f54145d;
        aVar.f54144c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f54145d;
        aVar2.f54144c = aVar.f54144c;
        aVar.f54144c.f54145d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f54144c.f54145d = aVar;
        aVar.f54145d.f54144c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f54141b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f54141b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f54141b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f54141b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f54140a.f54145d; !aVar.equals(this.f54140a); aVar = aVar.f54145d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f54141b.remove(aVar.f54142a);
            ((m) aVar.f54142a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f54140a.f54144c;
        boolean z10 = false;
        while (!aVar.equals(this.f54140a)) {
            sb2.append('{');
            sb2.append(aVar.f54142a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f54144c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
