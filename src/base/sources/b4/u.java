package b4;

import android.os.Bundle;
import androidx.lifecycle.t1;
import c1.pGX.geAgcEazw;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import hm.i0;
import hm.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p0;
import y3.a2;
import y3.d1;
import y3.g0;
import y3.g1;
import y3.l0;
import y3.m1;
import y3.n1;
import y3.o1;
import y3.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class u {
    public static final a B = new a(null);
    private final hm.v A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f8369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tl.a f8370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g1 f8371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bundle[] f8373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gl.i f8374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hm.w f8375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i0 f8376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final hm.w f8377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i0 f8378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f8379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f8380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f8381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f8382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.lifecycle.b0 f8383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l0 f8384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f8385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.lifecycle.s.b f8386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.lifecycle.a0 f8387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a2 f8388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map f8389u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Function1 f8390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Function1 f8391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map f8392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f8393y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f8394z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u(g0 navController, tl.a updateOnBackPressedCallbackEnabledCallback) {
        kotlin.jvm.internal.s.h(navController, "navController");
        kotlin.jvm.internal.s.h(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.f8369a = navController;
        this.f8370b = updateOnBackPressedCallbackEnabledCallback;
        this.f8374f = new gl.i();
        hm.w wVarA = k0.a(gl.r.l());
        this.f8375g = wVarA;
        this.f8376h = hm.g.a(wVarA);
        hm.w wVarA2 = k0.a(gl.r.l());
        this.f8377i = wVarA2;
        this.f8378j = hm.g.a(wVarA2);
        this.f8379k = new LinkedHashMap();
        this.f8380l = new LinkedHashMap();
        this.f8381m = new LinkedHashMap();
        this.f8382n = new LinkedHashMap();
        this.f8385q = new ArrayList();
        this.f8386r = androidx.lifecycle.s.b.INITIALIZED;
        this.f8387s = new androidx.lifecycle.y() { // from class: b4.l
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
                u.V(this.f8359a, b0Var, aVar);
            }
        };
        this.f8388t = new a2();
        this.f8389u = new LinkedHashMap();
        this.f8392x = new LinkedHashMap();
        this.f8394z = new ArrayList();
        this.A = hm.b0.b(1, 0, gm.a.DROP_OLDEST, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A(kotlin.jvm.internal.g0 g0Var, List list, kotlin.jvm.internal.i0 i0Var, u uVar, Bundle bundle, y3.y entry) {
        List listL;
        kotlin.jvm.internal.s.h(entry, "entry");
        g0Var.f43588a = true;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            listL = list.subList(i0Var.f43593a, i10);
            i0Var.f43593a = i10;
        } else {
            listL = gl.r.l();
        }
        uVar.m(entry.d(), bundle, entry, listL);
        return fl.g0.f38750a;
    }

    public static /* synthetic */ d1 C(u uVar, int i10, d1 d1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d1Var = null;
        }
        return uVar.B(i10, d1Var);
    }

    public static /* synthetic */ d1 E(u uVar, d1 d1Var, int i10, boolean z10, d1 d1Var2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            d1Var2 = null;
        }
        return uVar.D(d1Var, i10, z10, d1Var2);
    }

    private final List S(gl.i iVar) {
        d1 d1VarL;
        ArrayList arrayList = new ArrayList();
        y3.y yVar = (y3.y) this.f8374f.r();
        if (yVar == null || (d1VarL = yVar.d()) == null) {
            d1VarL = L();
        }
        if (iVar != null) {
            Iterator<E> it = iVar.iterator();
            d1 d1Var = d1VarL;
            while (it.hasNext()) {
                y3.z zVar = (y3.z) it.next();
                d1 d1VarE = E(this, d1Var, zVar.b(), true, null, 8, null);
                if (d1VarE == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + d1.f57171f.d(N(), zVar.b()) + " cannot be found from the current destination " + d1Var).toString());
                }
                arrayList.add(zVar.d(N(), d1VarE, M(), this.f8384p));
                d1Var = d1VarE;
            }
        }
        return arrayList;
    }

    private final boolean T(d1 d1Var, Bundle bundle) {
        int iNextIndex;
        d1 d1VarD;
        y3.y yVarJ = J();
        gl.i iVar = this.f8374f;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((y3.y) listIterator.previous()).d() == d1Var) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (d1Var instanceof g1) {
            List listB = am.j.B(am.j.y(g1.f57218i.b((g1) d1Var), new Function1() { // from class: b4.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(u.U((d1) obj));
                }
            }));
            if (this.f8374f.size() - iNextIndex != listB.size()) {
                return false;
            }
            gl.i iVar2 = this.f8374f;
            List listSubList = iVar2.subList(iNextIndex, iVar2.size());
            ArrayList arrayList = new ArrayList(gl.r.v(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((y3.y) it.next()).d().p()));
            }
            if (!kotlin.jvm.internal.s.c(arrayList, listB)) {
                return false;
            }
        } else if (yVarJ == null || (d1VarD = yVarJ.d()) == null || d1Var.p() != d1VarD.p()) {
            return false;
        }
        gl.i<y3.y> iVar3 = new gl.i();
        while (gl.r.n(this.f8374f) >= iNextIndex) {
            y3.y yVar = (y3.y) gl.r.H(this.f8374f);
            B0(yVar);
            iVar3.addFirst(new y3.y(yVar, yVar.d().d(bundle)));
        }
        for (y3.y yVar2 : iVar3) {
            g1 g1VarW = yVar2.d().w();
            if (g1VarW != null) {
                W(yVar2, I(g1VarW.p()));
            }
            this.f8374f.add(yVar2);
        }
        for (y3.y yVar3 : iVar3) {
            this.f8388t.d(yVar3.d().v()).j(yVar3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(d1 it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(u uVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a event) {
        kotlin.jvm.internal.s.h(b0Var, "<unused var>");
        kotlin.jvm.internal.s.h(event, "event");
        uVar.f8386r = event.g();
        if (uVar.f8371c != null) {
            Iterator it = gl.r.L0(uVar.f8374f).iterator();
            while (it.hasNext()) {
                ((y3.y) it.next()).k(event);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 Y(kotlin.jvm.internal.g0 g0Var, u uVar, d1 d1Var, Bundle bundle, y3.y it) {
        kotlin.jvm.internal.s.h(it, "it");
        g0Var.f43588a = true;
        n(uVar, d1Var, bundle, it, null, 8, null);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 c0(tl.a aVar) {
        aVar.invoke();
        return fl.g0.f38750a;
    }

    private final void m(d1 d1Var, Bundle bundle, y3.y yVar, List list) {
        Bundle bundle2;
        gl.i<y3.y> iVar;
        d1 d1VarD;
        List list2;
        g1 g1Var;
        Object objPrevious;
        Object objPrevious2;
        List list3 = list;
        d1 d1VarD2 = yVar.d();
        if (!(d1VarD2 instanceof y3.n)) {
            while (!this.f8374f.isEmpty() && (((y3.y) this.f8374f.last()).d() instanceof y3.n) && n0(this, ((y3.y) this.f8374f.last()).d().p(), true, false, 4, null)) {
            }
        }
        gl.i iVar2 = new gl.i();
        Object obj = null;
        if (d1Var instanceof g1) {
            d1 d1Var2 = d1VarD2;
            while (true) {
                kotlin.jvm.internal.s.e(d1Var2);
                g1 g1VarW = d1Var2.w();
                if (g1VarW != null) {
                    ListIterator listIterator = list3.listIterator(list3.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!kotlin.jvm.internal.s.c(((y3.y) objPrevious2).d(), g1VarW));
                    y3.y yVarB = (y3.y) objPrevious2;
                    if (yVarB == null) {
                        bundle2 = bundle;
                        d1VarD = d1VarD2;
                        yVarB = y3.y.a.b(y3.y.f57350j, N(), g1VarW, bundle2, M(), this.f8384p, null, null, 96, null);
                    } else {
                        bundle2 = bundle;
                        d1VarD = d1VarD2;
                    }
                    iVar2.addFirst(yVarB);
                    if (this.f8374f.isEmpty() || ((y3.y) this.f8374f.last()).d() != g1VarW) {
                        list2 = list;
                        iVar = iVar2;
                    } else {
                        list2 = list;
                        iVar = iVar2;
                        p0(this, (y3.y) this.f8374f.last(), false, null, 6, null);
                    }
                } else {
                    bundle2 = bundle;
                    iVar = iVar2;
                    d1VarD = d1VarD2;
                    list2 = list3;
                }
                if (g1VarW == null || g1VarW == d1Var) {
                    break;
                }
                list3 = list2;
                d1Var2 = g1VarW;
                iVar2 = iVar;
                d1VarD2 = d1VarD;
            }
        } else {
            bundle2 = bundle;
            iVar = iVar2;
            d1VarD = d1VarD2;
            list2 = list3;
            yVar = yVar;
        }
        d1 d1VarD3 = iVar.isEmpty() ? d1VarD : ((y3.y) iVar.first()).d();
        while (d1VarD3 != null && B(d1VarD3.p(), d1VarD3) != d1VarD3) {
            g1 g1VarW2 = d1VarD3.w();
            if (g1VarW2 != null) {
                Bundle bundle3 = (bundle2 == null || !n4.c.v(n4.c.a(bundle2))) ? bundle2 : null;
                ListIterator listIterator2 = list2.listIterator(list2.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!kotlin.jvm.internal.s.c(((y3.y) objPrevious).d(), g1VarW2));
                y3.y yVarB2 = (y3.y) objPrevious;
                if (yVarB2 == null) {
                    g1Var = g1VarW2;
                    yVarB2 = y3.y.a.b(y3.y.f57350j, N(), g1Var, g1VarW2.d(bundle3), M(), this.f8384p, null, null, 96, null);
                } else {
                    g1Var = g1VarW2;
                }
                iVar.addFirst(yVarB2);
            } else {
                g1Var = g1VarW2;
            }
            d1VarD3 = g1Var;
        }
        if (!iVar.isEmpty()) {
            d1VarD = ((y3.y) iVar.first()).d();
        }
        while (!this.f8374f.isEmpty() && (((y3.y) this.f8374f.last()).d() instanceof g1)) {
            d1 d1VarD4 = ((y3.y) this.f8374f.last()).d();
            kotlin.jvm.internal.s.f(d1VarD4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((g1) d1VarD4).N().f(d1VarD.p()) != null) {
                break;
            } else {
                p0(this, (y3.y) this.f8374f.last(), false, null, 6, null);
            }
        }
        y3.y yVar2 = (y3.y) this.f8374f.o();
        if (yVar2 == null) {
            yVar2 = (y3.y) iVar.o();
        }
        if (!kotlin.jvm.internal.s.c(yVar2 != null ? yVar2.d() : null, this.f8371c)) {
            ListIterator listIterator3 = list2.listIterator(list2.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                d1 d1VarD5 = ((y3.y) objPrevious3).d();
                g1 g1Var2 = this.f8371c;
                kotlin.jvm.internal.s.e(g1Var2);
                if (kotlin.jvm.internal.s.c(d1VarD5, g1Var2)) {
                    obj = objPrevious3;
                    break;
                }
            }
            y3.y yVarB3 = (y3.y) obj;
            if (yVarB3 == null) {
                y3.y.a aVar = y3.y.f57350j;
                h hVarN = N();
                g1 g1Var3 = this.f8371c;
                kotlin.jvm.internal.s.e(g1Var3);
                g1 g1Var4 = this.f8371c;
                kotlin.jvm.internal.s.e(g1Var4);
                yVarB3 = y3.y.a.b(aVar, hVarN, g1Var3, g1Var4.d(bundle2), M(), this.f8384p, null, null, 96, null);
            }
            iVar.addFirst(yVarB3);
        }
        for (y3.y yVar3 : iVar) {
            Object obj2 = this.f8389u.get(this.f8388t.d(yVar3.d().v()));
            if (obj2 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + d1Var.v() + " should already be created").toString());
            }
            ((g0.b) obj2).q(yVar3);
        }
        this.f8374f.addAll(iVar);
        this.f8374f.add(yVar);
        for (y3.y yVar4 : gl.r.t0(iVar, yVar)) {
            g1 g1VarW3 = yVar4.d().w();
            if (g1VarW3 != null) {
                W(yVar4, I(g1VarW3.p()));
            }
        }
    }

    static /* synthetic */ void n(u uVar, d1 d1Var, Bundle bundle, y3.y yVar, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = gl.r.l();
        }
        uVar.m(d1Var, bundle, yVar, list);
    }

    public static /* synthetic */ boolean n0(u uVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return uVar.k0(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 p(n1 navOptions) {
        kotlin.jvm.internal.s.h(navOptions, "$this$navOptions");
        navOptions.g(true);
        return fl.g0.f38750a;
    }

    public static /* synthetic */ void p0(u uVar, y3.y yVar, boolean z10, gl.i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            iVar = new gl.i();
        }
        uVar.o0(yVar, z10, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 t(kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, u uVar, boolean z10, gl.i iVar, y3.y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        g0Var.f43588a = true;
        g0Var2.f43588a = true;
        uVar.o0(entry, z10, iVar);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d1 u(d1 destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        g1 g1VarW = destination.w();
        if (g1VarW == null || g1VarW.P() != destination.p()) {
            return null;
        }
        return destination.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(u uVar, d1 destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        return !uVar.f8381m.containsKey(Integer.valueOf(destination.p()));
    }

    private final boolean v0(int i10, Bundle bundle, m1 m1Var, z1.a aVar) {
        if (!this.f8381m.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        final String str = (String) this.f8381m.get(Integer.valueOf(i10));
        gl.r.E(this.f8381m.values(), new Function1() { // from class: b4.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u.w0(str, (String) obj));
            }
        });
        return z(S((gl.i) p0.d(this.f8382n).remove(str)), bundle, m1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d1 w(d1 destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        g1 g1VarW = destination.w();
        if (g1VarW == null || g1VarW.P() != destination.p()) {
            return null;
        }
        return destination.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w0(String str, String str2) {
        return kotlin.jvm.internal.s.c(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(u uVar, d1 destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        return !uVar.f8381m.containsKey(Integer.valueOf(destination.p()));
    }

    private final boolean z(final List list, final Bundle bundle, m1 m1Var, z1.a aVar) {
        y3.y yVar;
        d1 d1VarD;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((y3.y) obj).d() instanceof g1)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            y3.y yVar2 = (y3.y) obj2;
            List list2 = (List) gl.r.o0(arrayList);
            if (kotlin.jvm.internal.s.c((list2 == null || (yVar = (y3.y) gl.r.n0(list2)) == null || (d1VarD = yVar.d()) == null) ? null : d1VarD.v(), yVar2.d().v())) {
                list2.add(yVar2);
            } else {
                arrayList.add(gl.r.q(yVar2));
            }
        }
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            List list3 = (List) obj3;
            z1 z1VarD = this.f8388t.d(((y3.y) gl.r.b0(list3)).d().v());
            final kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
            a0(z1VarD, list3, m1Var, aVar, new Function1() { // from class: b4.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return u.A(g0Var, list, i0Var, this, bundle, (y3.y) obj4);
                }
            });
        }
        return g0Var.f43588a;
    }

    public final void A0(t1 viewModelStore) {
        kotlin.jvm.internal.s.h(viewModelStore, "viewModelStore");
        l0 l0Var = this.f8384p;
        l0.a aVar = l0.f57228c;
        if (kotlin.jvm.internal.s.c(l0Var, aVar.a(viewModelStore))) {
            return;
        }
        if (!this.f8374f.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f8384p = aVar.a(viewModelStore);
    }

    public final d1 B(int i10, d1 d1Var) {
        d1 d1VarD;
        g1 g1Var = this.f8371c;
        if (g1Var == null) {
            return null;
        }
        kotlin.jvm.internal.s.e(g1Var);
        if (g1Var.p() == i10) {
            if (d1Var == null) {
                return this.f8371c;
            }
            if (kotlin.jvm.internal.s.c(this.f8371c, d1Var) && d1Var.w() == null) {
                return this.f8371c;
            }
        }
        y3.y yVar = (y3.y) this.f8374f.r();
        if (yVar == null || (d1VarD = yVar.d()) == null) {
            d1VarD = this.f8371c;
            kotlin.jvm.internal.s.e(d1VarD);
        }
        return D(d1VarD, i10, false, d1Var);
    }

    public final y3.y B0(y3.y child) {
        kotlin.jvm.internal.s.h(child, "child");
        y3.y yVar = (y3.y) this.f8379k.remove(child);
        if (yVar == null) {
            return null;
        }
        b4.a aVar = (b4.a) this.f8380l.get(yVar);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            g0.b bVar = (g0.b) this.f8389u.get(this.f8388t.d(yVar.d().v()));
            if (bVar != null) {
                bVar.f(yVar);
            }
            this.f8380l.remove(yVar);
        }
        return yVar;
    }

    public final void C0() {
        b4.a aVar;
        i0 i0VarD;
        Set set;
        List<y3.y> listL0 = gl.r.L0(this.f8374f);
        if (listL0.isEmpty()) {
            return;
        }
        List listQ = gl.r.q(((y3.y) gl.r.n0(listL0)).d());
        ArrayList arrayList = new ArrayList();
        if (gl.r.n0(listQ) instanceof y3.n) {
            Iterator it = gl.r.u0(listL0).iterator();
            while (it.hasNext()) {
                d1 d1VarD = ((y3.y) it.next()).d();
                arrayList.add(d1VarD);
                if (!(d1VarD instanceof y3.n) && !(d1VarD instanceof g1)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (y3.y yVar : gl.r.u0(listL0)) {
            androidx.lifecycle.s.b bVarH = yVar.h();
            d1 d1VarD2 = yVar.d();
            d1 d1Var = (d1) gl.r.d0(listQ);
            if (d1Var != null && d1Var.p() == d1VarD2.p()) {
                androidx.lifecycle.s.b bVar = androidx.lifecycle.s.b.RESUMED;
                if (bVarH != bVar) {
                    g0.b bVar2 = (g0.b) this.f8389u.get(O().d(yVar.d().v()));
                    if (kotlin.jvm.internal.s.c((bVar2 == null || (i0VarD = bVar2.d()) == null || (set = (Set) i0VarD.getValue()) == null) ? null : Boolean.valueOf(set.contains(yVar)), Boolean.TRUE) || ((aVar = (b4.a) this.f8380l.get(yVar)) != null && aVar.b() == 0)) {
                        map.put(yVar, androidx.lifecycle.s.b.STARTED);
                    } else {
                        map.put(yVar, bVar);
                    }
                }
                d1 d1Var2 = (d1) gl.r.d0(arrayList);
                if (d1Var2 != null && d1Var2.p() == d1VarD2.p()) {
                    gl.r.G(arrayList);
                }
                gl.r.G(listQ);
                g1 g1VarW = d1VarD2.w();
                if (g1VarW != null) {
                    listQ.add(g1VarW);
                }
            } else if (arrayList.isEmpty() || d1VarD2.p() != ((d1) gl.r.b0(arrayList)).p()) {
                yVar.p(androidx.lifecycle.s.b.CREATED);
            } else {
                d1 d1Var3 = (d1) gl.r.G(arrayList);
                if (bVarH == androidx.lifecycle.s.b.RESUMED) {
                    yVar.p(androidx.lifecycle.s.b.STARTED);
                } else {
                    androidx.lifecycle.s.b bVar3 = androidx.lifecycle.s.b.STARTED;
                    if (bVarH != bVar3) {
                        map.put(yVar, bVar3);
                    }
                }
                g1 g1VarW2 = d1Var3.w();
                if (g1VarW2 != null && !arrayList.contains(g1VarW2)) {
                    arrayList.add(g1VarW2);
                }
            }
        }
        for (y3.y yVar2 : listL0) {
            androidx.lifecycle.s.b bVar4 = (androidx.lifecycle.s.b) map.get(yVar2);
            if (bVar4 != null) {
                yVar2.p(bVar4);
            } else {
                yVar2.q();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [y3.d1, y3.g1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, y3.g1] */
    public final d1 D(d1 destination, int i10, boolean z10, d1 d1Var) {
        ?? W;
        g1 g1Var;
        kotlin.jvm.internal.s.h(destination, "destination");
        if (destination.p() == i10 && (d1Var == null || (kotlin.jvm.internal.s.c(destination, d1Var) && kotlin.jvm.internal.s.c(destination.w(), d1Var.w())))) {
            return destination;
        }
        if (destination instanceof g1) {
            g1Var = (g1) destination;
        } else {
            W = 0;
        }
        if (W == 0) {
            W = g1Var;
            W = destination.w();
            kotlin.jvm.internal.s.e(W);
        }
        W = g1Var;
        return W.M(i10, W, z10, d1Var);
    }

    public final String F(int[] deepLink) {
        g1 g1Var;
        kotlin.jvm.internal.s.h(deepLink, "deepLink");
        g1 g1Var2 = this.f8371c;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            d1 d1VarJ = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                g1 g1Var3 = this.f8371c;
                kotlin.jvm.internal.s.e(g1Var3);
                if (g1Var3.p() == i11) {
                    d1VarJ = this.f8371c;
                }
            } else {
                kotlin.jvm.internal.s.e(g1Var2);
                d1VarJ = g1Var2.J(i11);
            }
            if (d1VarJ == null) {
                return d1.f57171f.d(N(), i11);
            }
            if (i10 != deepLink.length - 1 && (d1VarJ instanceof g1)) {
                while (true) {
                    g1Var = (g1) d1VarJ;
                    kotlin.jvm.internal.s.e(g1Var);
                    if (!(g1Var.J(g1Var.P()) instanceof g1)) {
                        break;
                    }
                    d1VarJ = g1Var.J(g1Var.P());
                }
                g1Var2 = g1Var;
            }
            i10++;
        }
    }

    public final String G(Object route) {
        kotlin.jvm.internal.s.h(route, "route");
        d1 d1VarE = E(this, L(), c4.d.c(pm.t.c(kotlin.jvm.internal.l0.b(route.getClass()))), true, null, 8, null);
        if (d1VarE == null) {
            throw new IllegalArgumentException(("Destination with route " + kotlin.jvm.internal.l0.b(route.getClass()).k() + " cannot be found in navigation graph " + this.f8371c).toString());
        }
        Map mapM = d1VarE.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gl.l0.e(mapM.size()));
        for (Map.Entry entry : mapM.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((y3.v) entry.getValue()).a());
        }
        return c4.d.d(route, linkedHashMap);
    }

    public final gl.i H() {
        return this.f8374f;
    }

    public final y3.y I(int i10) {
        Object objPrevious;
        gl.i iVar = this.f8374f;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((y3.y) objPrevious).d().p() != i10);
        y3.y yVar = (y3.y) objPrevious;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + K()).toString());
    }

    public final y3.y J() {
        return (y3.y) this.f8374f.r();
    }

    public final d1 K() {
        y3.y yVarJ = J();
        if (yVarJ != null) {
            return yVarJ.d();
        }
        return null;
    }

    public final g1 L() {
        g1 g1Var = this.f8371c;
        if (g1Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.s.f(g1Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return g1Var;
    }

    public final androidx.lifecycle.s.b M() {
        return this.f8383o == null ? androidx.lifecycle.s.b.CREATED : this.f8386r;
    }

    public final h N() {
        return this.f8369a.v();
    }

    public final a2 O() {
        return this.f8388t;
    }

    public final g1 P() {
        d1 d1VarD;
        y3.y yVar = (y3.y) this.f8374f.r();
        if (yVar == null || (d1VarD = yVar.d()) == null) {
            d1VarD = this.f8371c;
            kotlin.jvm.internal.s.e(d1VarD);
        }
        g1 g1Var = d1VarD instanceof g1 ? (g1) d1VarD : null;
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1VarW = d1VarD.w();
        kotlin.jvm.internal.s.e(g1VarW);
        return g1VarW;
    }

    public final g1 Q() {
        return this.f8371c;
    }

    public final a2 R() {
        return this.f8388t;
    }

    public final void W(y3.y child, y3.y parent) {
        kotlin.jvm.internal.s.h(child, "child");
        kotlin.jvm.internal.s.h(parent, "parent");
        this.f8379k.put(child, parent);
        if (this.f8380l.get(parent) == null) {
            this.f8380l.put(parent, new b4.a(0));
        }
        Object obj = this.f8380l.get(parent);
        kotlin.jvm.internal.s.e(obj);
        ((b4.a) obj).c();
    }

    public final void X(g0.b state, y3.y entry, tl.a superCallback) {
        l0 l0Var;
        kotlin.jvm.internal.s.h(state, "state");
        kotlin.jvm.internal.s.h(entry, "entry");
        kotlin.jvm.internal.s.h(superCallback, "superCallback");
        boolean zC = kotlin.jvm.internal.s.c(this.f8392x.get(entry), Boolean.TRUE);
        superCallback.invoke();
        this.f8392x.remove(entry);
        if (this.f8374f.contains(entry)) {
            if (state.e()) {
                return;
            }
            C0();
            this.f8375g.b(gl.r.L0(this.f8374f));
            this.f8377i.b(q0());
            return;
        }
        B0(entry);
        if (entry.getLifecycle().b().e(androidx.lifecycle.s.b.CREATED)) {
            entry.p(androidx.lifecycle.s.b.DESTROYED);
        }
        gl.i iVar = this.f8374f;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<E> it = iVar.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.s.c(((y3.y) it.next()).f(), entry.f())) {
                }
            }
            if (!zC && (l0Var = this.f8384p) != null) {
                l0Var.j(entry.f());
            }
        } else if (!zC) {
            l0Var.j(entry.f());
        }
        C0();
        this.f8377i.b(q0());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
    public final void Z(final d1 node, Bundle bundle, m1 m1Var, z1.a aVar) {
        boolean z10;
        boolean z11;
        boolean zK0;
        kotlin.jvm.internal.s.h(node, "node");
        Iterator it = this.f8389u.values().iterator();
        while (it.hasNext()) {
            ((g0.b) it.next()).n(true);
        }
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        if (m1Var == null) {
            z10 = false;
        } else {
            if (m1Var.f() != null) {
                String strF = m1Var.f();
                kotlin.jvm.internal.s.e(strF);
                zK0 = m0(strF, m1Var.i(), m1Var.k());
            } else if (m1Var.g() != null) {
                zl.c cVarG = m1Var.g();
                kotlin.jvm.internal.s.e(cVarG);
                zK0 = k0(c4.d.c(pm.t.c(cVarG)), m1Var.i(), m1Var.k());
            } else if (m1Var.h() != null) {
                Object objH = m1Var.h();
                kotlin.jvm.internal.s.e(objH);
                zK0 = l0(objH, m1Var.i(), m1Var.k());
            } else if (m1Var.e() != -1) {
                zK0 = k0(m1Var.e(), m1Var.i(), m1Var.k());
            } else {
                z10 = false;
            }
            z10 = zK0;
        }
        final Bundle bundleD = node.d(bundle);
        if (m1Var != null && m1Var.l() && this.f8381m.containsKey(Integer.valueOf(node.p()))) {
            g0Var.f43588a = v0(node.p(), bundleD, m1Var, aVar);
            z11 = false;
        } else {
            z11 = m1Var != null && m1Var.j() && T(node, bundle);
            if (!z11) {
                a0(this.f8388t.d(node.v()), gl.r.e(y3.y.a.b(y3.y.f57350j, N(), node, bundleD, M(), this.f8384p, null, null, 96, null)), m1Var, aVar, new Function1() { // from class: b4.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u.Y(g0Var, this, node, bundleD, (y3.y) obj);
                    }
                });
            }
        }
        this.f8370b.invoke();
        Iterator it2 = this.f8389u.values().iterator();
        while (it2.hasNext()) {
            ((g0.b) it2.next()).n(false);
        }
        if (z10 || g0Var.f43588a || z11) {
            s();
        } else {
            C0();
        }
    }

    public final void a0(z1 navigator, List entries, m1 m1Var, z1.a aVar, Function1 handler) {
        kotlin.jvm.internal.s.h(navigator, "navigator");
        kotlin.jvm.internal.s.h(entries, "entries");
        kotlin.jvm.internal.s.h(handler, "handler");
        this.f8390v = handler;
        navigator.g(entries, m1Var, aVar);
        this.f8390v = null;
    }

    public final void b0(Bundle bundle) {
        Bundle bundle2 = this.f8372d;
        if (bundle2 != null) {
            Bundle bundleA = n4.c.a(bundle2);
            if (n4.c.b(bundleA, "android-support-nav:controller:navigatorState:names")) {
                for (String str : n4.c.t(bundleA, "android-support-nav:controller:navigatorState:names")) {
                    z1 z1VarD = this.f8388t.d(str);
                    if (n4.c.b(bundleA, str)) {
                        z1VarD.l(n4.c.o(bundleA, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.f8373e;
        int i10 = 0;
        if (bundleArr != null) {
            for (Bundle bundle3 : bundleArr) {
                y3.z zVar = new y3.z(bundle3);
                d1 d1VarC = C(this, zVar.b(), null, 2, null);
                if (d1VarC == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + d1.f57171f.d(N(), zVar.b()) + " cannot be found from the current destination " + K());
                }
                y3.y yVarD = zVar.d(N(), d1VarC, M(), this.f8384p);
                z1 z1VarD2 = this.f8388t.d(d1VarC.v());
                Map map = this.f8389u;
                Object objL = map.get(z1VarD2);
                if (objL == null) {
                    objL = this.f8369a.l(z1VarD2);
                    map.put(z1VarD2, objL);
                }
                this.f8374f.add(yVarD);
                ((g0.b) objL).q(yVarD);
                g1 g1VarW = yVarD.d().w();
                if (g1VarW != null) {
                    W(yVarD, I(g1VarW.p()));
                }
            }
            this.f8370b.invoke();
            this.f8373e = null;
        }
        Collection collectionValues = this.f8388t.e().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((z1) obj).e()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj2;
            Map map2 = this.f8389u;
            Object objL2 = map2.get(z1Var);
            if (objL2 == null) {
                objL2 = this.f8369a.l(z1Var);
                map2.put(z1Var, objL2);
            }
            z1Var.i((g0.b) objL2);
        }
        if (this.f8371c == null || !this.f8374f.isEmpty()) {
            s();
        } else {
            if (this.f8369a.j()) {
                return;
            }
            g1 g1Var = this.f8371c;
            kotlin.jvm.internal.s.e(g1Var);
            Z(g1Var, bundle, null, null);
        }
    }

    public final void d0(g0.b state, y3.y popUpTo, boolean z10, final tl.a superCallback) {
        kotlin.jvm.internal.s.h(state, "state");
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        kotlin.jvm.internal.s.h(superCallback, "superCallback");
        z1 z1VarD = this.f8388t.d(popUpTo.d().v());
        this.f8392x.put(popUpTo, Boolean.valueOf(z10));
        if (!kotlin.jvm.internal.s.c(z1VarD, state.r())) {
            Object obj = this.f8389u.get(z1VarD);
            kotlin.jvm.internal.s.e(obj);
            ((g0.b) obj).i(popUpTo, z10);
        } else {
            Function1 function1 = this.f8391w;
            if (function1 == null) {
                i0(popUpTo, new tl.a() { // from class: b4.s
                    @Override // tl.a
                    public final Object invoke() {
                        return u.c0(superCallback);
                    }
                });
            } else {
                function1.invoke(popUpTo);
                superCallback.invoke();
            }
        }
    }

    public final boolean e0() {
        if (this.f8374f.isEmpty()) {
            return false;
        }
        d1 d1VarK = K();
        kotlin.jvm.internal.s.e(d1VarK);
        return f0(d1VarK.p(), true);
    }

    public final boolean f0(int i10, boolean z10) {
        return g0(i10, z10, false);
    }

    public final boolean g0(int i10, boolean z10, boolean z11) {
        return k0(i10, z10, z11) && s();
    }

    public final boolean h0(String route, boolean z10, boolean z11) {
        kotlin.jvm.internal.s.h(route, "route");
        return m0(route, z10, z11) && s();
    }

    public final void j0(z1 navigator, y3.y popUpTo, boolean z10, Function1 handler) {
        kotlin.jvm.internal.s.h(navigator, "navigator");
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        kotlin.jvm.internal.s.h(handler, "handler");
        this.f8391w = handler;
        navigator.n(popUpTo, z10);
        this.f8391w = null;
    }

    public final boolean k0(int i10, boolean z10, boolean z11) {
        d1 d1VarD;
        if (this.f8374f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = gl.r.u0(this.f8374f).iterator();
        do {
            if (!it.hasNext()) {
                d1VarD = null;
                break;
            }
            d1VarD = ((y3.y) it.next()).d();
            z1 z1VarD = this.f8388t.d(d1VarD.v());
            if (z10 || d1VarD.p() != i10) {
                arrayList.add(z1VarD);
            }
        } while (d1VarD.p() != i10);
        if (d1VarD != null) {
            return y(arrayList, d1VarD, z10, z11);
        }
        String strD = d1.f57171f.d(N(), i10);
        b.f8327a.a("NavController", "Ignoring popBackStack to destination " + strD + " as it was not found on the current back stack");
        return false;
    }

    public final boolean l0(Object route, boolean z10, boolean z11) {
        kotlin.jvm.internal.s.h(route, "route");
        return m0(G(route), z10, z11);
    }

    public final boolean m0(String route, boolean z10, boolean z11) {
        Object objPrevious;
        boolean zY;
        kotlin.jvm.internal.s.h(route, "route");
        if (this.f8374f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        gl.i iVar = this.f8374f;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            y3.y yVar = (y3.y) objPrevious;
            zY = yVar.d().y(route, yVar.b());
            if (z10 || !zY) {
                arrayList.add(this.f8388t.d(yVar.d().v()));
            }
        } while (!zY);
        y3.y yVar2 = (y3.y) objPrevious;
        d1 d1VarD = yVar2 != null ? yVar2.d() : null;
        if (d1VarD != null) {
            return y(arrayList, d1VarD, z10, z11);
        }
        b.f8327a.a("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    public final void o(g0.c listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f8385q.add(listener);
        if (this.f8374f.isEmpty()) {
            return;
        }
        y3.y yVar = (y3.y) this.f8374f.last();
        listener.a(this.f8369a, yVar.d(), yVar.b());
    }

    public final void o0(y3.y popUpTo, boolean z10, gl.i savedState) {
        l0 l0Var;
        i0 i0VarD;
        Set set;
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        kotlin.jvm.internal.s.h(savedState, "savedState");
        y3.y yVar = (y3.y) this.f8374f.last();
        if (!kotlin.jvm.internal.s.c(yVar, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.d() + ", which is not the top of the back stack (" + yVar.d() + ')').toString());
        }
        gl.r.H(this.f8374f);
        g0.b bVar = (g0.b) this.f8389u.get(O().d(yVar.d().v()));
        boolean z11 = true;
        if ((bVar == null || (i0VarD = bVar.d()) == null || (set = (Set) i0VarD.getValue()) == null || !set.contains(yVar)) && !this.f8380l.containsKey(yVar)) {
            z11 = false;
        }
        androidx.lifecycle.s.b bVarB = yVar.getLifecycle().b();
        androidx.lifecycle.s.b bVar2 = androidx.lifecycle.s.b.CREATED;
        if (bVarB.e(bVar2)) {
            if (z10) {
                yVar.p(bVar2);
                savedState.addFirst(new y3.z(yVar));
            }
            if (z11) {
                yVar.p(bVar2);
            } else {
                yVar.p(androidx.lifecycle.s.b.DESTROYED);
                B0(yVar);
            }
        }
        if (z10 || z11 || (l0Var = this.f8384p) == null) {
            return;
        }
        l0Var.j(yVar.f());
    }

    public final boolean q(int i10) {
        Iterator it = this.f8389u.values().iterator();
        while (it.hasNext()) {
            ((g0.b) it.next()).n(true);
        }
        boolean zV0 = v0(i10, null, o1.a(new Function1() { // from class: b4.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.p((n1) obj);
            }
        }), null);
        Iterator it2 = this.f8389u.values().iterator();
        while (it2.hasNext()) {
            ((g0.b) it2.next()).n(false);
        }
        return zV0 && k0(i10, true, false);
    }

    public final List q0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8389u.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((g0.b) it.next()).d().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                y3.y yVar = (y3.y) obj;
                if (!arrayList.contains(yVar) && !yVar.h().e(androidx.lifecycle.s.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            gl.r.z(arrayList, arrayList2);
        }
        gl.i iVar = this.f8374f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : iVar) {
            y3.y yVar2 = (y3.y) obj2;
            if (!arrayList.contains(yVar2) && yVar2.h().e(androidx.lifecycle.s.b.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        gl.r.z(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList.get(i10);
            i10++;
            if (!(((y3.y) obj3).d() instanceof g1)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final y3.y r(d1 destination, Bundle bundle) {
        kotlin.jvm.internal.s.h(destination, "destination");
        return y3.y.a.b(y3.y.f57350j, N(), destination, bundle, M(), this.f8384p, null, null, 96, null);
    }

    public final void r0(y3.y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        if (!this.f8374f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.p(androidx.lifecycle.s.b.STARTED);
    }

    public final boolean s() {
        while (!this.f8374f.isEmpty() && (((y3.y) this.f8374f.last()).d() instanceof g1)) {
            p0(this, (y3.y) this.f8374f.last(), false, null, 6, null);
        }
        y3.y yVar = (y3.y) this.f8374f.r();
        if (yVar != null) {
            this.f8394z.add(yVar);
        }
        this.f8393y++;
        C0();
        int i10 = this.f8393y - 1;
        this.f8393y = i10;
        if (i10 == 0) {
            List<y3.y> listL0 = gl.r.L0(this.f8394z);
            this.f8394z.clear();
            for (y3.y yVar2 : listL0) {
                Iterator it = gl.r.I0(this.f8385q).iterator();
                while (it.hasNext()) {
                    ((g0.c) it.next()).a(this.f8369a, yVar2.d(), yVar2.b());
                }
                this.A.b(yVar2);
            }
            this.f8375g.b(gl.r.L0(this.f8374f));
            this.f8377i.b(q0());
        }
        return yVar != null;
    }

    public final void s0(g0.b state, y3.y backStackEntry) {
        kotlin.jvm.internal.s.h(state, "state");
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        z1 z1VarD = this.f8388t.d(backStackEntry.d().v());
        if (!kotlin.jvm.internal.s.c(z1VarD, state.r())) {
            Object obj = this.f8389u.get(z1VarD);
            if (obj != null) {
                ((g0.b) obj).l(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.d().v() + " should already be created").toString());
        }
        Function1 function1 = this.f8390v;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            state.q(backStackEntry);
            return;
        }
        b.f8327a.a("NavController", "Ignoring add of destination " + backStackEntry.d() + " outside of the call to navigate(). ");
    }

    public final void t0(g0.c listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f8385q.remove(listener);
    }

    public final void u0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundleA = n4.c.a(bundle);
        this.f8372d = n4.c.b(bundleA, "android-support-nav:controller:navigatorState") ? n4.c.o(bundleA, "android-support-nav:controller:navigatorState") : null;
        int i10 = 0;
        this.f8373e = n4.c.b(bundleA, "android-support-nav:controller:backStack") ? (Bundle[]) n4.c.p(bundleA, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
        this.f8382n.clear();
        if (n4.c.b(bundleA, "android-support-nav:controller:backStackDestIds") && n4.c.b(bundleA, "android-support-nav:controller:backStackIds")) {
            int[] iArrK = n4.c.k(bundleA, "android-support-nav:controller:backStackDestIds");
            List listT = n4.c.t(bundleA, "android-support-nav:controller:backStackIds");
            int length = iArrK.length;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                this.f8381m.put(Integer.valueOf(iArrK[i10]), !kotlin.jvm.internal.s.c(listT.get(i11), "") ? (String) listT.get(i11) : null);
                i10++;
                i11 = i12;
            }
        }
        if (n4.c.b(bundleA, "android-support-nav:controller:backStackStates")) {
            for (String str : n4.c.t(bundleA, "android-support-nav:controller:backStackStates")) {
                if (n4.c.b(bundleA, "android-support-nav:controller:backStackStates:" + str)) {
                    List listP = n4.c.p(bundleA, "android-support-nav:controller:backStackStates:" + str);
                    Map map = this.f8382n;
                    gl.i iVar = new gl.i(listP.size());
                    Iterator it = listP.iterator();
                    while (it.hasNext()) {
                        iVar.add(new y3.z((Bundle) it.next()));
                    }
                    map.put(str, iVar);
                }
            }
        }
    }

    public final Bundle x0() {
        fl.q[] qVarArr;
        Bundle bundleA;
        fl.q[] qVarArr2;
        fl.q[] qVarArr3;
        fl.q[] qVarArr4;
        fl.q[] qVarArr5;
        ArrayList arrayList = new ArrayList();
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList2.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList2.toArray(new fl.q[0]);
        }
        Bundle bundleA2 = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA2);
        for (Map.Entry entry2 : this.f8388t.e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleM = ((z1) entry2.getValue()).m();
            if (bundleM != null) {
                arrayList.add(str);
                n4.k.n(n4.k.a(bundleA2), str, bundleM);
            }
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            Map mapH2 = gl.l0.h();
            if (mapH2.isEmpty()) {
                qVarArr5 = new fl.q[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapH2.size());
                for (Map.Entry entry3 : mapH2.entrySet()) {
                    arrayList3.add(fl.w.a((String) entry3.getKey(), entry3.getValue()));
                }
                qVarArr5 = (fl.q[]) arrayList3.toArray(new fl.q[0]);
            }
            bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr5, qVarArr5.length));
            Bundle bundleA3 = n4.k.a(bundleA);
            n4.k.r(n4.k.a(bundleA2), "android-support-nav:controller:navigatorState:names", arrayList);
            n4.k.n(bundleA3, "android-support-nav:controller:navigatorState", bundleA2);
        }
        if (!this.f8374f.isEmpty()) {
            if (bundleA == null) {
                Map mapH3 = gl.l0.h();
                if (mapH3.isEmpty()) {
                    qVarArr4 = new fl.q[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapH3.size());
                    for (Map.Entry entry4 : mapH3.entrySet()) {
                        arrayList4.add(fl.w.a((String) entry4.getKey(), entry4.getValue()));
                    }
                    qVarArr4 = (fl.q[]) arrayList4.toArray(new fl.q[0]);
                }
                bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr4, qVarArr4.length));
                n4.k.a(bundleA);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<E> it = this.f8374f.iterator();
            while (it.hasNext()) {
                arrayList5.add(new y3.z((y3.y) it.next()).f());
            }
            n4.k.o(n4.k.a(bundleA), "android-support-nav:controller:backStack", arrayList5);
        }
        if (!this.f8381m.isEmpty()) {
            if (bundleA == null) {
                Map mapH4 = gl.l0.h();
                if (mapH4.isEmpty()) {
                    qVarArr3 = new fl.q[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapH4.size());
                    for (Map.Entry entry5 : mapH4.entrySet()) {
                        arrayList6.add(fl.w.a((String) entry5.getKey(), entry5.getValue()));
                    }
                    qVarArr3 = (fl.q[]) arrayList6.toArray(new fl.q[0]);
                }
                bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr3, qVarArr3.length));
                n4.k.a(bundleA);
            }
            int[] iArr = new int[this.f8381m.size()];
            ArrayList arrayList7 = new ArrayList();
            int i10 = 0;
            for (Map.Entry entry6 : this.f8381m.entrySet()) {
                int iIntValue = ((Number) entry6.getKey()).intValue();
                String str2 = (String) entry6.getValue();
                int i11 = i10 + 1;
                iArr[i10] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList7.add(str2);
                i10 = i11;
            }
            Bundle bundleA4 = n4.k.a(bundleA);
            n4.k.h(bundleA4, "android-support-nav:controller:backStackDestIds", iArr);
            n4.k.r(bundleA4, "android-support-nav:controller:backStackIds", arrayList7);
        }
        if (!this.f8382n.isEmpty()) {
            if (bundleA == null) {
                Map mapH5 = gl.l0.h();
                if (mapH5.isEmpty()) {
                    qVarArr2 = new fl.q[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapH5.size());
                    for (Map.Entry entry7 : mapH5.entrySet()) {
                        arrayList8.add(fl.w.a((String) entry7.getKey(), entry7.getValue()));
                    }
                    qVarArr2 = (fl.q[]) arrayList8.toArray(new fl.q[0]);
                }
                bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr2, qVarArr2.length));
                n4.k.a(bundleA);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry entry8 : this.f8382n.entrySet()) {
                String str3 = (String) entry8.getKey();
                gl.i iVar = (gl.i) entry8.getValue();
                arrayList9.add(str3);
                ArrayList arrayList10 = new ArrayList();
                Iterator<E> it2 = iVar.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(((y3.z) it2.next()).f());
                }
                n4.k.o(n4.k.a(bundleA), "android-support-nav:controller:backStackStates:" + str3, arrayList10);
            }
            n4.k.r(n4.k.a(bundleA), "android-support-nav:controller:backStackStates", arrayList9);
        }
        return bundleA;
    }

    public final boolean y(List popOperations, d1 foundDestination, boolean z10, boolean z11) {
        final u uVar;
        final boolean z12;
        kotlin.jvm.internal.s.h(popOperations, "popOperations");
        kotlin.jvm.internal.s.h(foundDestination, "foundDestination");
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        final gl.i iVar = new gl.i();
        Iterator it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                uVar = this;
                z12 = z11;
                break;
            }
            z1 z1Var = (z1) it.next();
            final kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            uVar = this;
            z12 = z11;
            j0(z1Var, (y3.y) this.f8374f.last(), z12, new Function1() { // from class: b4.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.t(g0Var2, g0Var, uVar, z12, iVar, (y3.y) obj);
                }
            });
            if (!g0Var2.f43588a) {
                break;
            }
            z11 = z12;
        }
        if (z12) {
            if (!z10) {
                for (d1 d1Var : am.j.A(am.j.g(foundDestination, new Function1() { // from class: b4.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u.u((d1) obj);
                    }
                }), new Function1() { // from class: b4.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(u.v(this.f8365a, (d1) obj));
                    }
                })) {
                    Map map = uVar.f8381m;
                    Integer numValueOf = Integer.valueOf(d1Var.p());
                    y3.z zVar = (y3.z) iVar.o();
                    map.put(numValueOf, zVar != null ? zVar.c() : null);
                }
            }
            if (!iVar.isEmpty()) {
                y3.z zVar2 = (y3.z) iVar.first();
                Iterator it2 = am.j.A(am.j.g(C(this, zVar2.b(), null, 2, null), new Function1() { // from class: b4.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u.w((d1) obj);
                    }
                }), new Function1() { // from class: b4.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(u.x(this.f8366a, (d1) obj));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    uVar.f8381m.put(Integer.valueOf(((d1) it2.next()).p()), zVar2.c());
                }
                if (uVar.f8381m.values().contains(zVar2.c())) {
                    uVar.f8382n.put(zVar2.c(), iVar);
                }
            }
        }
        uVar.f8370b.invoke();
        return g0Var.f43588a;
    }

    public final void y0(g1 graph, Bundle bundle) {
        u uVar;
        kotlin.jvm.internal.s.h(graph, "graph");
        if (!this.f8374f.isEmpty() && M() == androidx.lifecycle.s.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        int i10 = 0;
        if (!kotlin.jvm.internal.s.c(this.f8371c, graph)) {
            g1 g1Var = this.f8371c;
            if (g1Var != null) {
                ArrayList arrayList = new ArrayList(this.f8381m.keySet());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Integer num = (Integer) obj;
                    kotlin.jvm.internal.s.e(num);
                    q(num.intValue());
                }
                uVar = this;
                n0(uVar, g1Var.p(), true, false, 4, null);
            } else {
                uVar = this;
            }
            uVar.f8371c = graph;
            b0(bundle);
            return;
        }
        int iO = graph.N().o();
        while (i10 < iO) {
            d1 d1Var = (d1) graph.N().p(i10);
            g1 g1Var2 = this.f8371c;
            kotlin.jvm.internal.s.e(g1Var2);
            int iK = g1Var2.N().k(i10);
            g1 g1Var3 = this.f8371c;
            kotlin.jvm.internal.s.e(g1Var3);
            g1Var3.N().n(iK, d1Var);
            i10++;
        }
        for (y3.y yVar : this.f8374f) {
            List<d1> listO = gl.r.O(am.j.B(d1.f57171f.e(yVar.d())));
            d1 d1VarJ = this.f8371c;
            kotlin.jvm.internal.s.e(d1VarJ);
            for (d1 d1Var2 : listO) {
                if (!kotlin.jvm.internal.s.c(d1Var2, this.f8371c) || !kotlin.jvm.internal.s.c(d1VarJ, graph)) {
                    if (d1VarJ instanceof g1) {
                        d1VarJ = ((g1) d1VarJ).J(d1Var2.p());
                        kotlin.jvm.internal.s.e(d1VarJ);
                    }
                }
            }
            yVar.n(d1VarJ);
        }
    }

    public final void i0(y3.y popUpTo, tl.a onComplete) {
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        kotlin.jvm.internal.s.h(onComplete, "onComplete");
        int iIndexOf = this.f8374f.indexOf(popUpTo);
        if (iIndexOf < 0) {
            b.f8327a.a(obFGmWgqyy.cuHOF, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.f8374f.size()) {
            k0(((y3.y) this.f8374f.get(i10)).d().p(), true, false);
        }
        p0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        this.f8370b.invoke();
        s();
    }

    public final void z0(androidx.lifecycle.b0 b0Var) {
        androidx.lifecycle.s lifecycle;
        kotlin.jvm.internal.s.h(b0Var, geAgcEazw.WQkYDjLdQ);
        if (kotlin.jvm.internal.s.c(b0Var, this.f8383o)) {
            return;
        }
        androidx.lifecycle.b0 b0Var2 = this.f8383o;
        if (b0Var2 != null && (lifecycle = b0Var2.getLifecycle()) != null) {
            lifecycle.d(this.f8387s);
        }
        this.f8383o = b0Var;
        b0Var.getLifecycle().a(this.f8387s);
    }
}
