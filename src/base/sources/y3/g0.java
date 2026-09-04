package y3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f57204j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f57205k = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4.u f57207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4.h f57208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f57209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l1 f57210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f57211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.activity.d0 f57212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f57213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fl.k f57214i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public class b extends b2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final z1 f57215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g0 f57216h;

        public b(g0 g0Var, z1 navigator) {
            kotlin.jvm.internal.s.h(navigator, "navigator");
            this.f57216h = g0Var;
            this.f57215g = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fl.g0 s(b bVar, y yVar) {
            super.f(yVar);
            return fl.g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fl.g0 t(b bVar, y yVar, boolean z10) {
            super.i(yVar, z10);
            return fl.g0.f38750a;
        }

        @Override // y3.b2
        public y b(d1 destination, Bundle bundle) {
            kotlin.jvm.internal.s.h(destination, "destination");
            return this.f57216h.f57207b.r(destination, bundle);
        }

        @Override // y3.b2
        public void f(final y entry) {
            kotlin.jvm.internal.s.h(entry, "entry");
            this.f57216h.f57207b.X(this, entry, new tl.a() { // from class: y3.h0
                @Override // tl.a
                public final Object invoke() {
                    return g0.b.s(this.f57220a, entry);
                }
            });
        }

        @Override // y3.b2
        public void j(y popUpTo, boolean z10) {
            kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
            super.j(popUpTo, z10);
        }

        @Override // y3.b2
        public void k(y entry) {
            kotlin.jvm.internal.s.h(entry, "entry");
            super.k(entry);
            this.f57216h.f57207b.r0(entry);
        }

        @Override // y3.b2
        public void l(y backStackEntry) {
            kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
            this.f57216h.f57207b.s0(this, backStackEntry);
        }

        public final void q(y backStackEntry) {
            kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
            super.l(backStackEntry);
        }

        public final z1 r() {
            return this.f57215g;
        }

        @Override // y3.b2
        public void i(final y yVar, final boolean z10) {
            kotlin.jvm.internal.s.h(yVar, UHbHibBvYxKnPE.EcKnV);
            this.f57216h.f57207b.d0(this, yVar, z10, new tl.a() { // from class: y3.i0
                @Override // tl.a
                public final Object invoke() {
                    return g0.b.t(this.f57223a, yVar, z10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(g0 g0Var, d1 d1Var, Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends androidx.activity.d0 {
        d() {
            super(false);
        }

        @Override // androidx.activity.d0
        public void d() {
            g0.this.M();
        }
    }

    public g0(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f57206a = context;
        this.f57207b = new b4.u(this, new tl.a() { // from class: y3.a0
            @Override // tl.a
            public final Object invoke() {
                return g0.D(this.f57144a);
            }
        });
        this.f57208c = new b4.h(context);
        for (Object obj : am.j.g(context, new Function1() { // from class: y3.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return g0.h((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f57209d = (Activity) obj;
                this.f57212g = new d();
                this.f57213h = true;
                this.f57207b.R().c(new i1(this.f57207b.R()));
                this.f57207b.R().c(new e(this.f57206a));
                this.f57214i = fl.l.b(new tl.a() { // from class: y3.c0
                    @Override // tl.a
                    public final Object invoke() {
                        return g0.E(this.f57166a);
                    }
                });
            }
        }
        obj = null;
        this.f57209d = (Activity) obj;
        this.f57212g = new d();
        this.f57213h = true;
        this.f57207b.R().c(new i1(this.f57207b.R()));
        this.f57207b.R().c(new e(this.f57206a));
        this.f57214i = fl.l.b(new tl.a() { // from class: y3.c0
            @Override // tl.a
            public final Object invoke() {
                return g0.E(this.f57166a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A(d1 d1Var, g0 g0Var, n1 navOptions) {
        kotlin.jvm.internal.s.h(navOptions, "$this$navOptions");
        navOptions.a(new Function1() { // from class: y3.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.B((f) obj);
            }
        });
        if (d1Var instanceof g1) {
            for (d1 d1Var2 : d1.f57171f.e(d1Var)) {
                d1 d1VarS = g0Var.s();
                if (kotlin.jvm.internal.s.c(d1Var2, d1VarS != null ? d1VarS.w() : null)) {
                }
            }
            if (f57205k) {
                navOptions.c(g1.f57218i.d(g0Var.u()).p(), new Function1() { // from class: y3.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g0.C((c2) obj);
                    }
                });
            }
        }
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 B(f anim) {
        kotlin.jvm.internal.s.h(anim, "$this$anim");
        anim.e(0);
        anim.f(0);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 C(c2 popUpTo) {
        kotlin.jvm.internal.s.h(popUpTo, "$this$popUpTo");
        popUpTo.c(true);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 D(g0 g0Var) {
        g0Var.b0();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1 E(g0 g0Var) {
        l1 l1Var = g0Var.f57210e;
        return l1Var == null ? new l1(g0Var.f57206a, g0Var.f57207b.R()) : l1Var;
    }

    private final void J(d1 d1Var, Bundle bundle, m1 m1Var, z1.a aVar) {
        this.f57207b.Z(d1Var, bundle, m1Var, aVar);
    }

    public static /* synthetic */ boolean P(g0 g0Var, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return g0Var.O(str, z10, z11);
    }

    private final boolean Q(int i10, boolean z10, boolean z11) {
        return this.f57207b.k0(i10, z10, z11);
    }

    static /* synthetic */ boolean R(g0 g0Var, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return g0Var.Q(i10, z10, z11);
    }

    private final boolean Z() {
        fl.q[] qVarArr;
        int i10 = 0;
        if (!this.f57211f) {
            return false;
        }
        Activity activity = this.f57209d;
        kotlin.jvm.internal.s.e(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        kotlin.jvm.internal.s.e(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        kotlin.jvm.internal.s.e(intArray);
        List listA0 = gl.j.A0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (listA0.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) gl.r.H(listA0)).intValue();
        if (parcelableArrayList != null) {
        }
        d1 d1VarP = p(this, u(), iIntValue, false, null, 4, null);
        if (d1VarP instanceof g1) {
            iIntValue = g1.f57218i.d((g1) d1VarP).p();
        }
        d1 d1VarS = s();
        if (d1VarS == null || iIntValue != d1VarS.p()) {
            return false;
        }
        a1 a1VarK = k();
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
        Bundle bundleA2 = n4.k.a(bundleA);
        kotlin.jvm.internal.s.e(intent);
        n4.k.l(bundleA2, "android-support-nav:controller:deepLinkIntent", intent);
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            n4.k.b(bundleA2, bundle);
        }
        a1VarK.i(bundleA);
        for (Object obj : listA0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            a1VarK.e(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        a1VarK.f().k();
        Activity activity2 = this.f57209d;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean a0() {
        fl.q[] qVarArr;
        Bundle bundleD;
        d1 d1VarS = s();
        kotlin.jvm.internal.s.e(d1VarS);
        int iP = d1VarS.p();
        for (g1 g1VarW = d1VarS.w(); g1VarW != null; g1VarW = g1VarW.w()) {
            if (g1VarW.P() != iP) {
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
                Bundle bundleA2 = n4.k.a(bundleA);
                Activity activity = this.f57209d;
                if (activity != null) {
                    kotlin.jvm.internal.s.e(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f57209d;
                        kotlin.jvm.internal.s.e(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f57209d;
                            kotlin.jvm.internal.s.e(activity3);
                            Intent intent = activity3.getIntent();
                            kotlin.jvm.internal.s.g(intent, "getIntent(...)");
                            n4.k.l(bundleA2, "android-support-nav:controller:deepLinkIntent", intent);
                            g1 g1VarP = this.f57207b.P();
                            Activity activity4 = this.f57209d;
                            kotlin.jvm.internal.s.e(activity4);
                            Intent intent2 = activity4.getIntent();
                            kotlin.jvm.internal.s.g(intent2, "getIntent(...)");
                            d1.b bVarR = g1VarP.R(j0.a(intent2), true, true, g1VarP);
                            if ((bVarR != null ? bVarR.c() : null) != null && (bundleD = bVarR.b().d(bVarR.c())) != null) {
                                n4.k.b(bundleA2, bundleD);
                            }
                        }
                    }
                }
                a1.k(new a1(this), g1VarW.p(), null, 2, null).i(bundleA).f().k();
                Activity activity5 = this.f57209d;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            iP = g1VarW.p();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private final void b0() {
        boolean z10;
        androidx.activity.d0 d0Var = this.f57212g;
        if (this.f57213h) {
            z10 = t() > 1;
        }
        d0Var.i(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context h(Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ d1 n(g0 g0Var, int i10, d1 d1Var, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            d1Var = null;
        }
        return g0Var.m(i10, d1Var);
    }

    public static /* synthetic */ d1 p(g0 g0Var, d1 d1Var, int i10, boolean z10, d1 d1Var2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            d1Var2 = null;
        }
        return g0Var.o(d1Var, i10, z10, d1Var2);
    }

    private final String q(int[] iArr) {
        return this.f57207b.F(iArr);
    }

    private final int t() {
        gl.i iVarH = this.f57207b.H();
        int i10 = 0;
        if (iVarH != null && iVarH.isEmpty()) {
            return 0;
        }
        Iterator<E> it = iVarH.iterator();
        while (it.hasNext()) {
            if (!(((y) it.next()).d() instanceof g1) && (i10 = i10 + 1) < 0) {
                gl.r.t();
            }
        }
        return i10;
    }

    private final boolean z(int[] iArr, Bundle[] bundleArr, boolean z10) {
        d1 d1VarJ;
        g1 g1Var;
        int i10 = 0;
        if (z10) {
            if (!this.f57207b.H().isEmpty()) {
                g1 g1VarQ = this.f57207b.Q();
                kotlin.jvm.internal.s.e(g1VarQ);
                R(this, g1VarQ.p(), true, false, 4, null);
            }
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                int i12 = i10 + 1;
                Bundle bundle = bundleArr[i10];
                final d1 d1VarN = n(this, i11, null, 2, null);
                if (d1VarN == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + d1.f57171f.d(this.f57208c, i11) + " cannot be found from the current destination " + s());
                }
                J(d1VarN, bundle, o1.a(new Function1() { // from class: y3.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g0.A(d1VarN, this, (n1) obj);
                    }
                }), null);
                i10 = i12;
            }
            this.f57211f = true;
            return true;
        }
        g1 g1VarQ2 = this.f57207b.Q();
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            Bundle bundle2 = bundleArr[i13];
            if (i13 == 0) {
                d1VarJ = this.f57207b.Q();
            } else {
                kotlin.jvm.internal.s.e(g1VarQ2);
                d1VarJ = g1VarQ2.J(i14);
            }
            if (d1VarJ == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + d1.f57171f.d(this.f57208c, i14) + " cannot be found in graph " + g1VarQ2);
            }
            if (i13 == iArr.length - 1) {
                m1.a aVar = new m1.a();
                g1 g1VarQ3 = this.f57207b.Q();
                kotlin.jvm.internal.s.e(g1VarQ3);
                J(d1VarJ, bundle2, m1.a.k(aVar, g1VarQ3.p(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (d1VarJ instanceof g1) {
                while (true) {
                    g1Var = (g1) d1VarJ;
                    kotlin.jvm.internal.s.e(g1Var);
                    if (!(g1Var.J(g1Var.P()) instanceof g1)) {
                        break;
                    }
                    d1VarJ = g1Var.J(g1Var.P());
                }
                g1VarQ2 = g1Var;
            }
        }
        this.f57211f = true;
        return true;
    }

    public void F(int i10) {
        G(i10, null);
    }

    public void G(int i10, Bundle bundle) {
        H(i10, bundle, null);
    }

    public void H(int i10, Bundle bundle, m1 m1Var) {
        I(i10, bundle, m1Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[LOOP:0: B:30:0x00ba->B:32:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x016e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x018b, please report this as an issue */
    public void I(int i10, Bundle bundle, m1 m1Var, z1.a aVar) {
        int iB;
        Bundle bundleA;
        d1 d1VarN;
        d1.a aVar2;
        String strD;
        Map mapH;
        ArrayList arrayList;
        fl.q[] qVarArr;
        fl.q[] qVarArr2;
        d1 d1VarQ = this.f57207b.H().isEmpty() ? this.f57207b.Q() : ((y) this.f57207b.H().last()).d();
        if (d1VarQ == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        u uVarK = d1VarQ.k(i10);
        if (uVarK != null) {
            if (m1Var == null) {
                m1Var = uVarK.c();
            }
            iB = uVarK.b();
            Bundle bundleA2 = uVarK.a();
            if (bundleA2 != null) {
                Map mapH2 = gl.l0.h();
                if (mapH2.isEmpty()) {
                    qVarArr2 = new fl.q[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(mapH2.size());
                    for (Map.Entry entry : mapH2.entrySet()) {
                        arrayList2.add(fl.w.a((String) entry.getKey(), entry.getValue()));
                    }
                    qVarArr2 = (fl.q[]) arrayList2.toArray(new fl.q[0]);
                }
                bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr2, qVarArr2.length));
                n4.k.b(n4.k.a(bundleA), bundleA2);
            }
            if (bundle != null) {
                if (bundleA == null) {
                    mapH = gl.l0.h();
                    if (mapH.isEmpty()) {
                        qVarArr = new fl.q[0];
                    } else {
                        arrayList = new ArrayList(mapH.size());
                        for (Map.Entry entry2 : mapH.entrySet()) {
                            arrayList.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
                        }
                        qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
                    }
                    bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
                    n4.k.a(bundleA);
                }
                n4.k.b(n4.k.a(bundleA), bundle);
            }
            if (iB != 0 && m1Var != null && (m1Var.e() != -1 || m1Var.f() != null || m1Var.g() != null)) {
                if (m1Var.f() != null) {
                    String strF = m1Var.f();
                    kotlin.jvm.internal.s.e(strF);
                    P(this, strF, m1Var.i(), false, 4, null);
                    return;
                } else if (m1Var.g() != null) {
                    zl.c cVarG = m1Var.g();
                    kotlin.jvm.internal.s.e(cVarG);
                    N(c4.d.c(pm.t.c(cVarG)), m1Var.i());
                    return;
                } else {
                    if (m1Var.e() != -1) {
                        N(m1Var.e(), m1Var.i());
                        return;
                    }
                    return;
                }
            }
            if (iB != 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            d1VarN = n(this, iB, null, 2, null);
            if (d1VarN == null) {
                J(d1VarN, bundleA, m1Var, aVar);
                return;
            }
            aVar2 = d1.f57171f;
            strD = aVar2.d(this.f57208c, iB);
            if (uVarK == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strD + " cannot be found from the current destination " + d1VarQ);
            }
            throw new IllegalArgumentException(("Navigation destination " + strD + " referenced from action " + aVar2.d(this.f57208c, i10) + " cannot be found from the current destination " + d1VarQ).toString());
        }
        iB = i10;
        bundleA = null;
        if (bundle != null) {
            if (bundleA == null) {
                mapH = gl.l0.h();
                if (mapH.isEmpty()) {
                    qVarArr = new fl.q[0];
                } else {
                    arrayList = new ArrayList(mapH.size());
                    while (r5.hasNext()) {
                        arrayList.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
                    }
                    qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
                }
                bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
                n4.k.a(bundleA);
            }
            n4.k.b(n4.k.a(bundleA), bundle);
        }
        if (iB != 0) {
        }
        if (iB != 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        d1VarN = n(this, iB, null, 2, null);
        if (d1VarN == null) {
            J(d1VarN, bundleA, m1Var, aVar);
            return;
        }
        aVar2 = d1.f57171f;
        strD = aVar2.d(this.f57208c, iB);
        if (uVarK == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strD + " cannot be found from the current destination " + d1VarQ);
        }
        throw new IllegalArgumentException(("Navigation destination " + strD + " referenced from action " + aVar2.d(this.f57208c, i10) + " cannot be found from the current destination " + d1VarQ).toString());
    }

    public void K(e1 directions) {
        kotlin.jvm.internal.s.h(directions, "directions");
        H(directions.h(), directions.g(), null);
    }

    public boolean L() {
        Intent intent;
        if (t() != 1) {
            return M();
        }
        Activity activity = this.f57209d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) != null ? Z() : a0();
    }

    public boolean M() {
        return this.f57207b.e0();
    }

    public boolean N(int i10, boolean z10) {
        return this.f57207b.f0(i10, z10);
    }

    public final boolean O(String route, boolean z10, boolean z11) {
        kotlin.jvm.internal.s.h(route, "route");
        return this.f57207b.h0(route, z10, z11);
    }

    public void S(c listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f57207b.t0(listener);
    }

    public void T(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f57206a.getClassLoader());
        }
        this.f57207b.u0(bundle);
        if (bundle != null) {
            Boolean boolG = n4.c.g(n4.c.a(bundle), "android-support-nav:controller:deepLinkHandled");
            this.f57211f = boolG != null ? boolG.booleanValue() : false;
        }
    }

    public Bundle U() {
        fl.q[] qVarArr;
        Bundle bundleX0 = this.f57207b.x0();
        if (this.f57211f) {
            if (bundleX0 == null) {
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
                bundleX0 = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
                n4.k.a(bundleX0);
            }
            n4.k.c(n4.k.a(bundleX0), "android-support-nav:controller:deepLinkHandled", this.f57211f);
        }
        return bundleX0;
    }

    public void V(int i10) {
        this.f57207b.y0(w().b(i10), null);
    }

    public void W(int i10, Bundle bundle) {
        this.f57207b.y0(w().b(i10), bundle);
    }

    public void X(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        this.f57207b.z0(owner);
    }

    public void Y(androidx.lifecycle.t1 viewModelStore) {
        kotlin.jvm.internal.s.h(viewModelStore, "viewModelStore");
        this.f57207b.A0(viewModelStore);
    }

    public void i(c listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f57207b.o(listener);
    }

    public final boolean j() {
        Activity activity;
        if (this.f57211f || (activity = this.f57209d) == null) {
            return false;
        }
        kotlin.jvm.internal.s.e(activity);
        return y(activity.getIntent());
    }

    public a1 k() {
        return new a1(this);
    }

    public final b l(z1 navigator) {
        kotlin.jvm.internal.s.h(navigator, "navigator");
        return new b(this, navigator);
    }

    public final d1 m(int i10, d1 d1Var) {
        return this.f57207b.B(i10, d1Var);
    }

    public final d1 o(d1 d1Var, int i10, boolean z10, d1 d1Var2) {
        kotlin.jvm.internal.s.h(d1Var, "<this>");
        return this.f57207b.D(d1Var, i10, z10, d1Var2);
    }

    public final Context r() {
        return this.f57206a;
    }

    public d1 s() {
        return this.f57207b.K();
    }

    public g1 u() {
        return this.f57207b.L();
    }

    public final b4.h v() {
        return this.f57208c;
    }

    public l1 w() {
        return (l1) this.f57214i.getValue();
    }

    public a2 x() {
        return this.f57207b.O();
    }

    public boolean y(Intent intent) {
        int[] intArray;
        fl.q[] qVarArr;
        g1 g1VarP;
        d1.b bVarR;
        fl.q[] qVarArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
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
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            n4.k.b(n4.k.a(bundleA), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (bVarR = (g1VarP = this.f57207b.P()).R(j0.a(intent), true, true, g1VarP)) != null) {
            d1 d1VarB = bVarR.b();
            int[] iArrG = d1.g(d1VarB, null, 1, null);
            Bundle bundleD = d1VarB.d(bVarR.c());
            if (bundleD != null) {
                n4.k.b(n4.k.a(bundleA), bundleD);
            }
            intArray = iArrG;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strQ = q(intArray);
        if (strQ != null) {
            b4.b.f8327a.a("NavController", "Could not find destination " + strQ + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        n4.k.l(n4.k.a(bundleA), "android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapH2 = gl.l0.h();
            if (mapH2.isEmpty()) {
                qVarArr2 = new fl.q[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapH2.size());
                for (Map.Entry entry2 : mapH2.entrySet()) {
                    arrayList3.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
                }
                qVarArr2 = (fl.q[]) arrayList3.toArray(new fl.q[0]);
            }
            Bundle bundleA2 = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr2, qVarArr2.length));
            Bundle bundleA3 = n4.k.a(bundleA2);
            n4.k.b(bundleA3, bundleA);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i10)) != null) {
                n4.k.b(bundleA3, bundle);
            }
            bundleArr[i10] = bundleA2;
        }
        int flags = intent.getFlags();
        int i11 = 268435456 & flags;
        if (i11 == 0 || (flags & 32768) != 0) {
            return z(intArray, bundleArr, i11 != 0);
        }
        intent.addFlags(32768);
        androidx.core.app.a0 a0VarB = androidx.core.app.a0.f(this.f57206a).b(intent);
        kotlin.jvm.internal.s.g(a0VarB, "addNextIntentWithParentStack(...)");
        a0VarB.k();
        Activity activity = this.f57209d;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }
}
