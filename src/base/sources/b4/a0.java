package b4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y3.b1;
import y3.d1;
import y3.g1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f8319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.v f8320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8323e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8324a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8325b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f8325b = true;
            androidx.collection.v vVarH = a0.this.h();
            int i10 = this.f8324a + 1;
            this.f8324a = i10;
            return (d1) vVarH.p(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8324a + 1 < a0.this.h().o();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8325b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            androidx.collection.v vVarH = a0.this.h();
            ((d1) vVarH.p(this.f8324a)).F(null);
            vVarH.m(this.f8324a);
            this.f8324a--;
            this.f8325b = false;
        }
    }

    public a0(g1 graph) {
        kotlin.jvm.internal.s.h(graph, "graph");
        this.f8319a = graph;
        this.f8320b = new androidx.collection.v(0, 1, null);
    }

    public static /* synthetic */ d1 f(a0 a0Var, int i10, d1 d1Var, boolean z10, d1 d1Var2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            d1Var2 = null;
        }
        return a0Var.e(i10, d1Var, z10, d1Var2);
    }

    public final void a(d1 node) {
        kotlin.jvm.internal.s.h(node, "node");
        int iP = node.p();
        String strX = node.x();
        if (iP == 0 && strX == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.f8319a.x() != null && kotlin.jvm.internal.s.c(strX, this.f8319a.x())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this.f8319a).toString());
        }
        if (iP == this.f8319a.p()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this.f8319a).toString());
        }
        d1 d1Var = (d1) this.f8320b.f(iP);
        if (d1Var == node) {
            return;
        }
        if (node.w() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (d1Var != null) {
            d1Var.F(null);
        }
        node.F(this.f8319a);
        this.f8320b.l(node.p(), node);
    }

    public final d1 b(int i10) {
        return f(this, i10, this.f8319a, false, null, 8, null);
    }

    public final d1 c(String str) {
        if (str == null || bm.r.h0(str)) {
            return null;
        }
        return d(str, true);
    }

    public final d1 d(String route, boolean z10) {
        Object next;
        d1 d1Var;
        kotlin.jvm.internal.s.h(route, "route");
        Iterator it = am.j.e(androidx.collection.x.b(this.f8320b)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d1Var = (d1) next;
            if (bm.r.B(d1Var.x(), route, false, 2, null)) {
                break;
            }
        } while (d1Var.A(route) == null);
        d1 d1Var2 = (d1) next;
        if (d1Var2 != null) {
            return d1Var2;
        }
        if (!z10 || this.f8319a.w() == null) {
            return null;
        }
        g1 g1VarW = this.f8319a.w();
        kotlin.jvm.internal.s.e(g1VarW);
        return g1VarW.K(route);
    }

    public final d1 e(int i10, d1 d1Var, boolean z10, d1 d1Var2) {
        d1 d1Var3 = (d1) this.f8320b.f(i10);
        if (d1Var2 != null) {
            if (kotlin.jvm.internal.s.c(d1Var3, d1Var2) && kotlin.jvm.internal.s.c(d1Var3.w(), d1Var2.w())) {
                return d1Var3;
            }
            d1Var3 = null;
        } else if (d1Var3 != null) {
            return d1Var3;
        }
        if (z10) {
            Iterator it = am.j.e(androidx.collection.x.b(this.f8320b)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    d1Var3 = null;
                    break;
                }
                d1 d1Var4 = (d1) it.next();
                d1 d1VarM = (!(d1Var4 instanceof g1) || kotlin.jvm.internal.s.c(d1Var4, d1Var)) ? null : ((g1) d1Var4).M(i10, this.f8319a, true, d1Var2);
                if (d1VarM != null) {
                    d1Var3 = d1VarM;
                    break;
                }
            }
        }
        if (d1Var3 != null) {
            return d1Var3;
        }
        if (this.f8319a.w() == null || kotlin.jvm.internal.s.c(this.f8319a.w(), d1Var)) {
            return null;
        }
        g1 g1VarW = this.f8319a.w();
        kotlin.jvm.internal.s.e(g1VarW);
        return g1VarW.M(i10, this.f8319a, z10, d1Var2);
    }

    public final String g(String superName) {
        kotlin.jvm.internal.s.h(superName, "superName");
        return this.f8319a.p() != 0 ? superName : "the root navigation";
    }

    public final androidx.collection.v h() {
        return this.f8320b;
    }

    public final String i() {
        if (this.f8322d == null) {
            String strValueOf = this.f8323e;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f8321c);
            }
            this.f8322d = strValueOf;
        }
        String str = this.f8322d;
        kotlin.jvm.internal.s.e(str);
        return str;
    }

    public final int j() {
        return this.f8321c;
    }

    public final String k() {
        return this.f8322d;
    }

    public final int l() {
        return this.f8321c;
    }

    public final String m() {
        return this.f8323e;
    }

    public final Iterator n() {
        return new a();
    }

    public final d1.b o(d1.b bVar, b1 navDeepLinkRequest) {
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        return p(bVar, navDeepLinkRequest, true, false, this.f8319a);
    }

    public final d1.b p(d1.b bVar, b1 navDeepLinkRequest, boolean z10, boolean z11, d1 lastVisited) {
        d1.b bVar2;
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        kotlin.jvm.internal.s.h(lastVisited, "lastVisited");
        d1.b bVarR = null;
        if (z10) {
            g1<d1> g1Var = this.f8319a;
            ArrayList arrayList = new ArrayList();
            for (d1 d1Var : g1Var) {
                d1.b bVarZ = !kotlin.jvm.internal.s.c(d1Var, lastVisited) ? d1Var.z(navDeepLinkRequest) : null;
                if (bVarZ != null) {
                    arrayList.add(bVarZ);
                }
            }
            bVar2 = (d1.b) gl.r.p0(arrayList);
        } else {
            bVar2 = null;
        }
        g1 g1VarW = this.f8319a.w();
        if (g1VarW != null && z11 && !kotlin.jvm.internal.s.c(g1VarW, lastVisited)) {
            bVarR = g1VarW.R(navDeepLinkRequest, z10, true, this.f8319a);
        }
        return (d1.b) gl.r.p0(gl.r.p(bVar, bVar2, bVarR));
    }

    public final void q(String str) {
        this.f8322d = str;
    }

    public final void r(int i10) {
        if (i10 != this.f8319a.p()) {
            if (this.f8323e != null) {
                s(null);
            }
            this.f8321c = i10;
            this.f8322d = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this.f8319a).toString());
    }

    public final void s(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (kotlin.jvm.internal.s.c(str, this.f8319a.x())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this.f8319a).toString());
            }
            if (bm.r.h0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = d1.f57171f.c(str).hashCode();
        }
        this.f8321c = iHashCode;
        this.f8323e = str;
    }
}
