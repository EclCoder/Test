package y3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b f57317q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final bm.o f57318r = new bm.o("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final bm.o f57319s = new bm.o("\\{(.+?)\\}");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final bm.o f57320t = new bm.o("http[s]?://");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final bm.o f57321u = new bm.o(".*");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final bm.o f57322v = new bm.o("([^/]*?|)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final bm.o f57323w = new bm.o("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f57326c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f57328e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fl.k f57331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f57332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fl.k f57333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fl.k f57334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final fl.k f57335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final fl.k f57336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f57337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final fl.k f57338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f57339p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f57327d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fl.k f57329f = fl.l.b(new tl.a() { // from class: y3.o0
        @Override // tl.a
        public final Object invoke() {
            return x0.W(this.f57268a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fl.k f57330g = fl.l.b(new tl.a() { // from class: y3.p0
        @Override // tl.a
        public final Object invoke() {
            return Boolean.valueOf(x0.J(this.f57269a));
        }
    });

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0877a f57340d = new C0877a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f57341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f57342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f57343c;

        /* JADX INFO: renamed from: y3.x0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0877a {
            public /* synthetic */ C0877a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0877a() {
            }
        }

        public final x0 a() {
            return new x0(this.f57341a, this.f57342b, this.f57343c);
        }

        public final a b(String action) {
            kotlin.jvm.internal.s.h(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f57342b = action;
            return this;
        }

        public final a c(String mimeType) {
            kotlin.jvm.internal.s.h(mimeType, "mimeType");
            this.f57343c = mimeType;
            return this;
        }

        public final a d(String uriPattern) {
            kotlin.jvm.internal.s.h(uriPattern, "uriPattern");
            this.f57341a = uriPattern;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f57344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f57345b;

        public c(String mimeType) {
            List listL;
            kotlin.jvm.internal.s.h(mimeType, "mimeType");
            List listJ = new bm.o("/").j(mimeType, 0);
            if (listJ.isEmpty()) {
                listL = gl.r.l();
            } else {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listL = gl.r.A0(listJ, listIterator.nextIndex() + 1);
                    }
                }
                listL = gl.r.l();
            }
            this.f57344a = (String) listL.get(0);
            this.f57345b = (String) listL.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            kotlin.jvm.internal.s.h(other, "other");
            int i10 = kotlin.jvm.internal.s.c(this.f57344a, other.f57344a) ? 2 : 0;
            return kotlin.jvm.internal.s.c(this.f57345b, other.f57345b) ? i10 + 1 : i10;
        }

        public final String b() {
            return this.f57345b;
        }

        public final String c() {
            return this.f57344a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f57346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f57347b = new ArrayList();

        public final void a(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            this.f57347b.add(name);
        }

        public final List b() {
            return this.f57347b;
        }

        public final String c() {
            return this.f57346a;
        }

        public final void d(String str) {
            this.f57346a = str;
        }
    }

    public x0(String str, String str2, String str3) {
        this.f57324a = str;
        this.f57325b = str2;
        this.f57326c = str3;
        fl.o oVar = fl.o.NONE;
        this.f57331h = fl.l.a(oVar, new tl.a() { // from class: y3.q0
            @Override // tl.a
            public final Object invoke() {
                return x0.X(this.f57294a);
            }
        });
        this.f57333j = fl.l.a(oVar, new tl.a() { // from class: y3.r0
            @Override // tl.a
            public final Object invoke() {
                return x0.l(this.f57295a);
            }
        });
        this.f57334k = fl.l.a(oVar, new tl.a() { // from class: y3.s0
            @Override // tl.a
            public final Object invoke() {
                return x0.m(this.f57296a);
            }
        });
        this.f57335l = fl.l.a(oVar, new tl.a() { // from class: y3.t0
            @Override // tl.a
            public final Object invoke() {
                return x0.o(this.f57298a);
            }
        });
        this.f57336m = fl.l.b(new tl.a() { // from class: y3.u0
            @Override // tl.a
            public final Object invoke() {
                return x0.n(this.f57302a);
            }
        });
        this.f57338o = fl.l.b(new tl.a() { // from class: y3.v0
            @Override // tl.a
            public final Object invoke() {
                return x0.O(this.f57313a);
            }
        });
        U();
        T();
    }

    private final void A(String str, Bundle bundle, Map map) {
        bm.l lVarG;
        String strA;
        bm.o oVarT = t();
        if (oVarT == null || (lVarG = oVarT.g(String.valueOf(str))) == null) {
            return;
        }
        List listR = r();
        ArrayList arrayList = new ArrayList(gl.r.v(listR, 10));
        int i10 = 0;
        for (Object obj : listR) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            String str2 = (String) obj;
            bm.j jVar = lVarG.c().get(i11);
            String strA2 = (jVar == null || (strA = jVar.a()) == null) ? null : s1.f57297a.a(strA);
            if (strA2 == null) {
                strA2 = "";
            }
            try {
                P(bundle, str2, strA2, (v) map.get(str2));
                arrayList.add(fl.g0.f38750a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final bm.o D() {
        return (bm.o) this.f57338o.getValue();
    }

    private final bm.o E() {
        return (bm.o) this.f57329f.getValue();
    }

    private final Map F() {
        return (Map) this.f57331h.getValue();
    }

    private final boolean I() {
        return ((Boolean) this.f57330g.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(x0 x0Var) {
        String str = x0Var.f57324a;
        return str != null && f57323w.h(str);
    }

    private final boolean K(String str) {
        String str2 = this.f57325b;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(str2, str);
    }

    private final boolean L(String str) {
        if (this.f57326c == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        bm.o oVarD = D();
        kotlin.jvm.internal.s.e(oVarD);
        return oVarD.h(str);
    }

    private final boolean M(Uri uri) {
        if (E() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        bm.o oVarE = E();
        kotlin.jvm.internal.s.e(oVarE);
        return oVarE.h(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm.o O(x0 x0Var) {
        String str = x0Var.f57337n;
        if (str != null) {
            return new bm.o(str);
        }
        return null;
    }

    private final void P(Bundle bundle, String str, String str2, v vVar) {
        if (vVar != null) {
            vVar.a().d(bundle, str, str2);
        } else {
            n4.k.p(n4.k.a(bundle), str, str2);
        }
    }

    private final boolean Q(Bundle bundle, String str, String str2, v vVar) {
        if (!n4.c.b(n4.c.a(bundle), str)) {
            return true;
        }
        if (vVar == null) {
            return false;
        }
        p1 p1VarA = vVar.a();
        p1VarA.e(bundle, str, str2, p1VarA.a(bundle, str));
        return false;
    }

    private final fl.q R() {
        String str = this.f57324a;
        if (str == null) {
            return null;
        }
        s1 s1Var = s1.f57297a;
        if (s1Var.d(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = s1Var.d(this.f57324a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.s.e(fragment);
        j(fragment, arrayList, sb2);
        return fl.w.a(arrayList, sb2.toString());
    }

    private final boolean S(List list, d dVar, Bundle bundle, Map map) {
        fl.q[] qVarArr;
        Object objValueOf;
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        Iterator it = dVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            v vVar = (v) map.get(str);
            p1 p1VarA = vVar != null ? vVar.a() : null;
            if ((p1VarA instanceof j) && !vVar.b()) {
                j jVar = (j) p1VarA;
                jVar.h(bundleA, str, jVar.k());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String strC = dVar.c();
            bm.l lVarG = strC != null ? new bm.o(strC).g(str2) : null;
            if (lVarG == null) {
                return false;
            }
            List listB = dVar.b();
            ArrayList arrayList2 = new ArrayList(gl.r.v(listB, 10));
            int i10 = 0;
            for (Object obj : listB) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.r.u();
                }
                String str3 = (String) obj;
                bm.j jVar2 = lVarG.c().get(i11);
                String strA = jVar2 != null ? jVar2.a() : null;
                if (strA == null) {
                    strA = "";
                }
                v vVar2 = (v) map.get(str3);
                try {
                    if (n4.c.b(n4.c.a(bundleA), str3)) {
                        objValueOf = Boolean.valueOf(Q(bundleA, str3, strA, vVar2));
                    } else {
                        P(bundleA, str3, strA, vVar2);
                        objValueOf = fl.g0.f38750a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = fl.g0.f38750a;
                }
                arrayList2.add(objValueOf);
                i10 = i11;
            }
        }
        n4.k.b(n4.k.a(bundle), bundleA);
        return true;
    }

    private final void T() {
        if (this.f57326c == null) {
            return;
        }
        if (!new bm.o("^[\\s\\S]+/[\\s\\S]+$").h(this.f57326c)) {
            throw new IllegalArgumentException(("The given mimeType " + this.f57326c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f57326c);
        this.f57337n = bm.r.I("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void U() {
        if (this.f57324a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f57318r.a(this.f57324a)) {
            sb2.append(f57320t.d());
        }
        boolean z10 = false;
        bm.l lVarC = bm.o.c(new bm.o("(\\?|#|$)"), this.f57324a, 0, 2, null);
        if (lVarC != null) {
            String strSubstring = this.f57324a.substring(0, lVarC.b().a());
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            j(strSubstring, this.f57327d, sb2);
            if (!f57321u.a(sb2) && !f57322v.a(sb2)) {
                z10 = true;
            }
            this.f57339p = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f57328e = Y(string);
    }

    private final Map V() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (I()) {
            s1 s1Var = s1.f57297a;
            String str = this.f57324a;
            kotlin.jvm.internal.s.e(str);
            Uri uriD = s1Var.d(str);
            for (String str2 : uriD.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParameters = uriD.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + str2 + " must only be present once in " + this.f57324a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) gl.r.d0(queryParameters);
                if (str3 == null) {
                    this.f57332i = true;
                    str3 = str2;
                }
                int iB = 0;
                d dVar = new d();
                for (bm.l lVarC = bm.o.c(f57319s, str3, 0, 2, null); lVarC != null; lVarC = lVarC.next()) {
                    bm.j jVar = lVarC.c().get(1);
                    kotlin.jvm.internal.s.e(jVar);
                    dVar.a(jVar.a());
                    if (lVarC.b().a() > iB) {
                        String strSubstring = str3.substring(iB, lVarC.b().a());
                        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                        sb2.append(bm.o.f9147b.c(strSubstring));
                    }
                    sb2.append("([\\s\\S]+?)?");
                    iB = lVarC.b().b() + 1;
                }
                if (iB < str3.length()) {
                    bm.o.a aVar = bm.o.f9147b;
                    String strSubstring2 = str3.substring(iB);
                    kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                    sb2.append(aVar.c(strSubstring2));
                }
                sb2.append("$");
                String string = sb2.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                dVar.d(Y(string));
                linkedHashMap.put(str2, dVar);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm.o W(x0 x0Var) {
        String str = x0Var.f57328e;
        if (str != null) {
            return new bm.o(str, bm.q.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map X(x0 x0Var) {
        return x0Var.V();
    }

    private final String Y(String str) {
        if (bm.r.T(str, "\\Q", false, 2, null) && bm.r.T(str, "\\E", false, 2, null)) {
            return bm.r.I(str, ".*", "\\E.*\\Q", false, 4, null);
        }
        return bm.r.T(str, "\\.\\*", false, 2, null) ? bm.r.I(str, "\\.\\*", ".*", false, 4, null) : str;
    }

    private final void j(String str, List list, StringBuilder sb2) {
        int iB = 0;
        for (bm.l lVarC = bm.o.c(f57319s, str, 0, 2, null); lVarC != null; lVarC = lVarC.next()) {
            bm.j jVar = lVarC.c().get(1);
            kotlin.jvm.internal.s.e(jVar);
            list.add(jVar.a());
            if (lVarC.b().a() > iB) {
                bm.o.a aVar = bm.o.f9147b;
                String strSubstring = str.substring(iB, lVarC.b().a());
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                sb2.append(aVar.c(strSubstring));
            }
            sb2.append(f57322v.d());
            iB = lVarC.b().b() + 1;
        }
        if (iB < str.length()) {
            bm.o.a aVar2 = bm.o.f9147b;
            String strSubstring2 = str.substring(iB);
            kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
            sb2.append(aVar2.c(strSubstring2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.q l(x0 x0Var) {
        return x0Var.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(x0 x0Var) {
        List list;
        fl.q qVarS = x0Var.s();
        return (qVarS == null || (list = (List) qVarS.h()) == null) ? new ArrayList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm.o n(x0 x0Var) {
        String strU = x0Var.u();
        if (strU != null) {
            return new bm.o(strU, bm.q.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(x0 x0Var) {
        fl.q qVarS = x0Var.s();
        if (qVarS != null) {
            return (String) qVarS.i();
        }
        return null;
    }

    private final List r() {
        return (List) this.f57334k.getValue();
    }

    private final fl.q s() {
        return (fl.q) this.f57333j.getValue();
    }

    private final bm.o t() {
        return (bm.o) this.f57336m.getValue();
    }

    private final String u() {
        return (String) this.f57335l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(Bundle bundle, String argName) {
        kotlin.jvm.internal.s.h(argName, "argName");
        return !n4.c.b(n4.c.a(bundle), argName);
    }

    private final boolean y(bm.l lVar, Bundle bundle, Map map) {
        String strA;
        List list = this.f57327d;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            String str = (String) obj;
            bm.j jVar = lVar.c().get(i11);
            String strA2 = (jVar == null || (strA = jVar.a()) == null) ? null : s1.f57297a.a(strA);
            if (strA2 == null) {
                strA2 = "";
            }
            try {
                P(bundle, str, strA2, (v) map.get(str));
                arrayList.add(fl.g0.f38750a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean z(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : F().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f57332i && (query = uri.getQuery()) != null && !kotlin.jvm.internal.s.c(query, uri.toString())) {
                queryParameters = gl.r.e(query);
            }
            if (!S(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final String B() {
        return this.f57326c;
    }

    public final int C(String mimeType) {
        kotlin.jvm.internal.s.h(mimeType, "mimeType");
        if (this.f57326c == null) {
            return -1;
        }
        bm.o oVarD = D();
        kotlin.jvm.internal.s.e(oVarD);
        if (oVarD.h(mimeType)) {
            return new c(this.f57326c).compareTo(new c(mimeType));
        }
        return -1;
    }

    public final String G() {
        return this.f57324a;
    }

    public final boolean H() {
        return this.f57339p;
    }

    public final boolean N(b1 deepLinkRequest) {
        kotlin.jvm.internal.s.h(deepLinkRequest, "deepLinkRequest");
        return M(deepLinkRequest.c()) && K(deepLinkRequest.a()) && L(deepLinkRequest.b());
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof x0)) {
            x0 x0Var = (x0) obj;
            if (kotlin.jvm.internal.s.c(this.f57324a, x0Var.f57324a) && kotlin.jvm.internal.s.c(this.f57325b, x0Var.f57325b) && kotlin.jvm.internal.s.c(this.f57326c, x0Var.f57326c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f57324a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57325b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f57326c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int k(Uri uri) {
        if (uri == null || this.f57324a == null) {
            return 0;
        }
        return gl.r.h0(uri.getPathSegments(), s1.f57297a.d(this.f57324a).getPathSegments()).size();
    }

    public final String p() {
        return this.f57325b;
    }

    public final List q() {
        List list = this.f57327d;
        Collection collectionValues = F().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            gl.r.z(arrayList, ((d) it.next()).b());
        }
        return gl.r.s0(gl.r.s0(list, arrayList), r());
    }

    public final Bundle v(Uri deepLink, Map arguments) {
        bm.l lVarG;
        fl.q[] qVarArr;
        kotlin.jvm.internal.s.h(deepLink, "deepLink");
        kotlin.jvm.internal.s.h(arguments, "arguments");
        bm.o oVarE = E();
        if (oVarE == null || (lVarG = oVarE.g(deepLink.toString())) == null) {
            return null;
        }
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        final Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        if (!y(lVarG, bundleA, arguments)) {
            return null;
        }
        if (I() && !z(deepLink, bundleA, arguments)) {
            return null;
        }
        A(deepLink.getFragment(), bundleA, arguments);
        if (w.a(arguments, new Function1() { // from class: y3.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x0.w(bundleA, (String) obj));
            }
        }).isEmpty()) {
            return bundleA;
        }
        return null;
    }

    public final Bundle x(Uri uri, Map arguments) {
        fl.q[] qVarArr;
        bm.o oVarE;
        bm.l lVarG;
        kotlin.jvm.internal.s.h(arguments, "arguments");
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        if (uri != null && (oVarE = E()) != null && (lVarG = oVarE.g(uri.toString())) != null) {
            y(lVarG, bundleA, arguments);
            if (I()) {
                z(uri, bundleA, arguments);
            }
        }
        return bundleA;
    }
}
