package e4;

import hm.i0;
import hm.k0;
import hm.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f37123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f37124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f37125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f37126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gl.i f37127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gl.i f37128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f37129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f37131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f37132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f37133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f37134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37137o;

    public i() {
        w wVarA = k0.a(j.b.f37139b);
        this.f37123a = wVarA;
        this.f37124b = hm.g.a(wVarA);
        w wVarA2 = k0.a(new f());
        this.f37125c = wVarA2;
        this.f37126d = hm.g.a(wVarA2);
        this.f37127e = new gl.i();
        this.f37128f = new gl.i();
        this.f37132j = new LinkedHashSet();
        this.f37133k = new LinkedHashSet();
        this.f37134l = new LinkedHashSet();
    }

    private final List i() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f37127e) {
            if (eVar.m() && !eVar.i().isEmpty()) {
                arrayList.addAll(eVar.i());
            }
        }
        for (e eVar2 : this.f37128f) {
            if (eVar2.m() && !eVar2.i().isEmpty()) {
                arrayList.addAll(eVar2.i());
            }
        }
        return arrayList;
    }

    private final e j(int i10) {
        Object next;
        Object next2;
        e eVar;
        Object next3;
        Object obj = null;
        if (i10 == -1) {
            Iterator<E> it = this.f37127e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((e) next).m());
            e eVar2 = (e) next;
            if (eVar2 != null) {
                return eVar2;
            }
            for (Object obj2 : this.f37128f) {
                if (((e) obj2).m()) {
                    obj = obj2;
                    break;
                }
            }
            return (e) obj;
        }
        if (i10 == 0) {
            Iterator<E> it2 = this.f37127e.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                eVar = (e) next2;
                if (eVar.m()) {
                    break;
                }
            } while (!eVar.n());
            e eVar3 = (e) next2;
            if (eVar3 != null) {
                return eVar3;
            }
            for (Object obj3 : this.f37128f) {
                e eVar4 = (e) obj3;
                if (eVar4.m() || eVar4.n()) {
                    obj = obj3;
                    break;
                }
            }
            return (e) obj;
        }
        if (i10 != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i10 + "'.").toString());
        }
        Iterator<E> it3 = this.f37127e.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!((e) next3).n());
        e eVar5 = (e) next3;
        if (eVar5 != null) {
            return eVar5;
        }
        for (Object obj4 : this.f37128f) {
            if (((e) obj4).n()) {
                obj = obj4;
                break;
            }
        }
        return (e) obj;
    }

    static /* synthetic */ e k(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return iVar.j(i10);
    }

    public final void a(c dispatcher, e handler, int i10) {
        s.h(dispatcher, "dispatcher");
        s.h(handler, "handler");
        if (handler.k() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (i10 == 0) {
            this.f37127e.addFirst(handler);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + i10);
            }
            this.f37128f.addFirst(handler);
        }
        handler.y(dispatcher);
        g();
    }

    public final void b(c dispatcher, h input, int i10) {
        Set set;
        boolean z10;
        s.h(dispatcher, "dispatcher");
        s.h(input, "input");
        if (input.h() != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.h() + '.').toString());
        }
        if (i10 != 0) {
            set = i10 != 1 ? this.f37132j : this.f37133k;
        } else {
            set = this.f37134l;
        }
        set.add(input);
        input.l(dispatcher);
        input.e(dispatcher);
        input.g((f) this.f37126d.getValue());
        if (i10 != 0) {
            z10 = i10 != 1 ? this.f37137o : this.f37135m;
        } else {
            z10 = this.f37136n;
        }
        input.f(z10);
    }

    public final void c(h input, int i10) {
        s.h(input, "input");
        if (s.c(input, this.f37131i) && i10 == this.f37130h) {
            e eVarJ = this.f37129g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            this.f37129g = null;
            this.f37130h = 0;
            this.f37131i = null;
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.e();
                }
            } else if (eVarJ != null) {
                eVarJ.a();
            }
            this.f37123a.setValue(j.b.f37139b);
        }
    }

    public final void d(h input, int i10, l lVar) {
        s.h(input, "input");
        if (s.c(input, this.f37131i) && i10 == this.f37130h) {
            e eVarJ = this.f37129g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            this.f37129g = null;
            this.f37130h = 0;
            this.f37131i = null;
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.f();
                }
            } else if (eVarJ != null) {
                eVarJ.b();
            } else if (lVar != null) {
                lVar.a();
            }
            this.f37123a.setValue(j.b.f37139b);
        }
    }

    public final void e(h input, int i10, b event) {
        s.h(input, "input");
        s.h(event, "event");
        if (s.c(input, this.f37131i) && i10 == this.f37130h) {
            e eVarJ = this.f37129g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.g(event);
                }
            } else if (eVarJ != null) {
                eVarJ.c(event);
            }
            this.f37123a.setValue(new j.c(event, i10));
        }
    }

    public final void f(h input, int i10, b bVar) {
        s.h(input, "input");
        if (this.f37130h != 0) {
            return;
        }
        e eVarJ = j(i10);
        this.f37129g = eVarJ;
        this.f37130h = i10;
        this.f37131i = input;
        if (bVar != null) {
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.h(bVar);
                }
            } else if (eVarJ != null) {
                eVarJ.d(bVar);
            }
            this.f37123a.setValue(new j.c(bVar, i10));
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        gl.i iVar = this.f37127e;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<E> it = iVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.m() || eVar.n()) {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        gl.i iVar2 = this.f37128f;
        if (iVar2 == null || !iVar2.isEmpty()) {
            Iterator<E> it2 = iVar2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    e eVar2 = (e) it2.next();
                    if (eVar2.m() || eVar2.n()) {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            }
        } else {
            z11 = false;
        }
        boolean z12 = z10 || z11;
        boolean z13 = this.f37136n != z10;
        boolean z14 = this.f37135m != z11;
        boolean z15 = this.f37137o != z12;
        if (z13) {
            Iterator it3 = this.f37134l.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).f(z10);
            }
        }
        if (z14) {
            Iterator it4 = this.f37133k.iterator();
            while (it4.hasNext()) {
                ((h) it4.next()).f(z11);
            }
        }
        if (z15) {
            Iterator it5 = this.f37132j.iterator();
            while (it5.hasNext()) {
                ((h) it5.next()).f(z12);
            }
        }
        this.f37136n = z10;
        this.f37135m = z11;
        this.f37137o = z12;
        e eVarK = this.f37129g;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        l(eVarK);
    }

    public final void h(e handler) {
        s.h(handler, "handler");
        if (s.c(handler, this.f37129g)) {
            int i10 = this.f37130h;
            if (i10 == -1) {
                handler.a();
            } else if (i10 == 1) {
                handler.e();
            }
            this.f37129g = null;
            this.f37130h = 0;
            this.f37131i = null;
        }
        this.f37127e.remove(handler);
        this.f37128f.remove(handler);
        handler.y(null);
        g();
    }

    public final void l(e eVar) {
        f fVar;
        e eVarK = this.f37129g;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        if (s.c(eVarK, eVar)) {
            if (eVarK == null) {
                fVar = new f();
            } else {
                fVar = new f(eVarK.j(), i(), eVarK.l());
            }
            if (s.c((f) this.f37125c.getValue(), fVar)) {
                return;
            }
            this.f37125c.setValue(fVar);
            Iterator it = this.f37134l.iterator();
            while (it.hasNext()) {
                ((h) it.next()).g(fVar);
            }
            Iterator it2 = this.f37133k.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).g(fVar);
            }
            Iterator it3 = this.f37132j.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).g(fVar);
            }
        }
    }
}
