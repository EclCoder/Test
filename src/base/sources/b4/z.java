package b4;

import android.net.Uri;
import android.os.Bundle;
import gl.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import y3.b1;
import y3.d1;
import y3.r1;
import y3.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f8399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f8402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fl.k f8405g;

    public z(d1 destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        this.f8399a = destination;
        this.f8401c = new ArrayList();
        this.f8402d = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(x0 x0Var, String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return !x0Var.q().contains(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 f(String str) {
        return new x0.a().d(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(x0 x0Var, String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return !x0Var.q().contains(key);
    }

    private final boolean p(x0 x0Var, Uri uri, Map map) {
        final Bundle bundleX = x0Var.x(uri, map);
        return y3.w.a(map, new Function1() { // from class: b4.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z.q(bundleX, (String) obj));
            }
        }).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return !n4.c.b(n4.c.a(bundle), key);
    }

    public final void g(String argumentName, y3.v argument) {
        kotlin.jvm.internal.s.h(argumentName, "argumentName");
        kotlin.jvm.internal.s.h(argument, "argument");
        this.f8402d.put(argumentName, argument);
    }

    public final void i(final x0 navDeepLink) {
        kotlin.jvm.internal.s.h(navDeepLink, "navDeepLink");
        List listA = y3.w.a(this.f8402d, new Function1() { // from class: b4.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z.h(navDeepLink, (String) obj));
            }
        });
        if (listA.isEmpty()) {
            this.f8401c.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.G() + " can't be used to open destination " + this.f8399a + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public final Bundle j(Bundle bundle) {
        fl.q[] qVarArr;
        if (bundle == null && this.f8402d.isEmpty()) {
            return null;
        }
        Map mapH = l0.h();
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
        for (Map.Entry entry2 : this.f8402d.entrySet()) {
            ((y3.v) entry2.getValue()).e((String) entry2.getKey(), bundleA);
        }
        if (bundle != null) {
            n4.k.b(n4.k.a(bundleA), bundle);
            for (Map.Entry entry3 : this.f8402d.entrySet()) {
                String str = (String) entry3.getKey();
                y3.v vVar = (y3.v) entry3.getValue();
                if (!vVar.c() && !vVar.f(str, bundleA)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument savedState. " + vVar.a().b() + " expected.").toString());
                }
            }
        }
        return bundleA;
    }

    public final Map k() {
        return this.f8402d;
    }

    public final List l() {
        return this.f8401c;
    }

    public final int m() {
        return this.f8403e;
    }

    public final String n() {
        return this.f8400b;
    }

    public final String o() {
        return this.f8404f;
    }

    public final boolean r(String route, Bundle bundle) {
        kotlin.jvm.internal.s.h(route, "route");
        if (kotlin.jvm.internal.s.c(this.f8404f, route)) {
            return true;
        }
        d1.b bVarT = t(route);
        if (kotlin.jvm.internal.s.c(this.f8399a, bVarT != null ? bVarT.b() : null)) {
            return bVarT.d(bundle);
        }
        return false;
    }

    public final d1.b s(b1 navDeepLinkRequest) {
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f8401c.isEmpty()) {
            return null;
        }
        d1.b bVar = null;
        for (x0 x0Var : this.f8401c) {
            Uri uriC = navDeepLinkRequest.c();
            if (x0Var.N(navDeepLinkRequest)) {
                Bundle bundleV = uriC != null ? x0Var.v(uriC, this.f8402d) : null;
                int iK = x0Var.k(uriC);
                String strA = navDeepLinkRequest.a();
                boolean z10 = strA != null && kotlin.jvm.internal.s.c(strA, x0Var.p());
                String strB = navDeepLinkRequest.b();
                int iC = strB != null ? x0Var.C(strB) : -1;
                if (bundleV == null) {
                    if (z10 || iC > -1) {
                        if (p(x0Var, uriC, this.f8402d)) {
                        }
                    }
                }
                d1.b bVar2 = new d1.b(this.f8399a, bundleV, x0Var.H(), iK, z10, iC);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public final d1.b t(String route) {
        x0 x0Var;
        Uri uriA;
        Bundle bundleV;
        kotlin.jvm.internal.s.h(route, "route");
        fl.k kVar = this.f8405g;
        if (kVar == null || (x0Var = (x0) kVar.getValue()) == null || (bundleV = x0Var.v((uriA = r1.a(d1.f57171f.c(route))), this.f8402d)) == null) {
            return null;
        }
        return new d1.b(this.f8399a, bundleV, x0Var.H(), x0Var.k(uriA), false, -1);
    }

    public final void u(int i10) {
        this.f8403e = i10;
        this.f8400b = null;
    }

    public final void v(String str) {
        this.f8400b = str;
    }

    public final void w(String str) {
        if (str == null) {
            u(0);
        } else {
            if (bm.r.h0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strC = d1.f57171f.c(str);
            final x0 x0VarA = new x0.a().d(strC).a();
            List listA = y3.w.a(this.f8402d, new Function1() { // from class: b4.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(z.e(x0VarA, (String) obj));
                }
            });
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this.f8399a + ". Following required arguments are missing: " + listA).toString());
            }
            this.f8405g = fl.l.b(new tl.a() { // from class: b4.x
                @Override // tl.a
                public final Object invoke() {
                    return z.f(strC);
                }
            });
            u(strC.hashCode());
        }
        this.f8404f = str;
    }
}
