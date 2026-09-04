package qf;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.a0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o1;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s;
import com.android.billingclient.api.BillingClient;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j implements a0, l5.l, l5.c, l5.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static volatile j f50727x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BillingClient f50731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile List f50732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile List f50733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List f50734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f50735g;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f50725v = "Az:" + j.class.getSimpleName();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Handler f50726w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final p0 f50728y = new p0(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50729a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50730b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f50736h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f50737i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f50738j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f50739k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f50740l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f50741m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f50742n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p0 f50743o = new p0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f50744p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m f50745q = new m();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m f50746r = new m();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p0 f50747s = new p0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f50748t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f50749u = -14400000;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends p0 {
        a() {
        }

        @Override // androidx.lifecycle.k0
        protected void l() {
            if (SystemClock.elapsedRealtime() - j.this.f50749u > 14400000) {
                j.this.f50749u = SystemClock.elapsedRealtime();
                wp.a.h(j.f50725v).h("Products not fresh, requerying", new Object[0]);
                j.this.N();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum c {
        PRODUCT_STATE_UNPURCHASED,
        PRODUCT_STATE_PENDING,
        PRODUCT_STATE_PURCHASED,
        PRODUCT_STATE_PURCHASED_AND_ACKNOWLEDGED
    }

    private j(Application application, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.f50732d = strArr == null ? new ArrayList() : Arrays.asList(strArr);
        this.f50733e = strArr2 == null ? new ArrayList() : Arrays.asList(strArr2);
        HashSet hashSet = new HashSet();
        this.f50735g = hashSet;
        if (strArr3 != null) {
            hashSet.addAll(Arrays.asList(strArr3));
        }
        this.f50734f = strArr4 == null ? new ArrayList() : Arrays.asList(strArr4);
        BillingClient billingClientA = BillingClient.e(application).c(this).b(com.android.billingclient.api.f.c().b().a()).a();
        this.f50731c = billingClientA;
        billingClientA.i(this);
        D();
    }

    private void D() {
        t(this.f50732d);
        t(this.f50733e);
        this.f50747s.q(Boolean.FALSE);
    }

    public static boolean E() {
        return f50727x != null;
    }

    private boolean G(l5.j jVar) {
        return k.c(jVar.a(), jVar.e());
    }

    private void I(final b bVar, final boolean z10) {
        if (bVar != null) {
            f50726w.post(new Runnable() { // from class: qf.i
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.a(z10);
                }
            });
        }
    }

    public static k0 J() {
        return f50728y;
    }

    private void M(List list, List list2) {
        HashSet hashSet = new HashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final l5.j jVar = (l5.j) it.next();
                for (String str : jVar.b()) {
                    if (((p0) this.f50736h.get(str)) == null) {
                        wp.a.h(f50725v).a("No display state for %s; not in the current catalog.", str);
                    } else {
                        hashSet.add(str);
                    }
                }
                if (jVar.c() != 1) {
                    T(jVar);
                } else if (G(jVar)) {
                    T(jVar);
                    Iterator it2 = jVar.b().iterator();
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        if (!this.f50735g.contains((String) it2.next())) {
                            if (z10) {
                                wp.a.h(f50725v).d("Purchase cannot contain a mixture of consumableand non-consumable items: " + jVar.b(), new Object[0]);
                                z10 = false;
                                break;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        u(jVar);
                    } else if (!jVar.f()) {
                        this.f50731c.a(l5.a.b().b(jVar.d()).a(), new l5.b() { // from class: qf.e
                            @Override // l5.b
                            public final void a(com.android.billingclient.api.c cVar) {
                                j.j(this.f50713a, jVar, cVar);
                            }
                        });
                    }
                } else {
                    wp.a.h(f50725v).d("Invalid signature on purchase. Check to make sure your public key is correct.", new Object[0]);
                }
            }
        } else {
            wp.a.h(f50725v).a("Empty purchase list.", new Object[0]);
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                if (!hashSet.contains(str2)) {
                    S(str2, c.PRODUCT_STATE_UNPURCHASED);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.f50732d != null && !this.f50732d.isEmpty()) {
            this.f50731c.f(com.android.billingclient.api.h.a().b(v(this.f50732d, "inapp")).a(), this);
        }
        if (this.f50733e == null || this.f50733e.isEmpty()) {
            return;
        }
        this.f50731c.f(com.android.billingclient.api.h.a().b(v(this.f50733e, SubSampleInformationBox.TYPE)).a(), this);
    }

    private void Q(String str, List list) {
        HashSet hashSet = new HashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l5.j jVar = (l5.j) it.next();
                if (jVar.c() == 1) {
                    if (G(jVar)) {
                        hashSet.addAll(jVar.b());
                    } else {
                        wp.a.h(f50725v).d("Invalid signature on purchase, not granting entitlement.", new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f50740l) {
            try {
                if ("inapp".equals(str)) {
                    this.f50738j.clear();
                    this.f50738j.addAll(hashSet);
                    this.f50741m = true;
                } else {
                    this.f50739k.clear();
                    this.f50739k.addAll(hashSet);
                    this.f50742n = true;
                }
                if (this.f50741m && this.f50742n) {
                    HashSet hashSet2 = new HashSet(this.f50738j);
                    hashSet2.addAll(this.f50739k);
                    wp.a.h(f50725v).a("Owned products: %s", hashSet2);
                    this.f50743o.n(hashSet2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void R() {
        f50726w.postDelayed(new Runnable() { // from class: qf.d
            @Override // java.lang.Runnable
            public final void run() {
                j jVar = this.f50712a;
                jVar.f50731c.i(jVar);
            }
        }, this.f50748t);
        this.f50748t = Math.min(this.f50748t * 2, 900000L);
    }

    private void S(String str, c cVar) {
        p0 p0Var = (p0) this.f50736h.get(str);
        if (p0Var != null) {
            p0Var.n(cVar);
            return;
        }
        wp.a.h(f50725v).d("Unknown product " + str + ". Check to make sure product matches productS in the Play developer console.", new Object[0]);
    }

    private void T(l5.j jVar) {
        for (String str : jVar.b()) {
            p0 p0Var = (p0) this.f50736h.get(str);
            if (p0Var == null) {
                wp.a.h(f50725v).a("No display state for %s; not in the current catalog.", str);
            } else {
                int iC = jVar.c();
                if (iC == 0) {
                    p0Var.n(c.PRODUCT_STATE_UNPURCHASED);
                } else if (iC != 1) {
                    if (iC != 2) {
                        wp.a.h(f50725v).d("Purchase in unknown state: %s", Integer.valueOf(jVar.c()));
                    } else {
                        p0Var.n(c.PRODUCT_STATE_PENDING);
                    }
                } else if (jVar.f()) {
                    p0Var.n(c.PRODUCT_STATE_PURCHASED_AND_ACKNOWLEDGED);
                } else {
                    p0Var.n(c.PRODUCT_STATE_PURCHASED);
                }
            }
        }
    }

    public static /* synthetic */ void e(j jVar, String[] strArr, com.android.billingclient.api.g gVar, Activity activity, b bVar, com.android.billingclient.api.c cVar, List list) {
        jVar.getClass();
        LinkedList linkedList = new LinkedList();
        if (cVar.c() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l5.j jVar2 = (l5.j) it.next();
                for (String str : strArr) {
                    Iterator it2 = jVar2.b().iterator();
                    while (it2.hasNext()) {
                        if (((String) it2.next()).equals(str) && !linkedList.contains(jVar2)) {
                            linkedList.add(jVar2);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.android.billingclient.api.b.C0141b.b().c(gVar).b(((com.android.billingclient.api.g.e) gVar.f().get(0)).a()).a());
        com.android.billingclient.api.b.a aVarB = com.android.billingclient.api.b.b();
        aVarB.b(arrayList);
        int size = linkedList.size();
        if (size != 0) {
            if (size != 1) {
                wp.a.h(f50725v).d("%s subscriptions subscribed to. Upgrade not possible.", Integer.valueOf(linkedList.size()));
            } else {
                aVarB.c(com.android.billingclient.api.b.c.a().b(((l5.j) linkedList.get(0)).d()).a());
            }
        }
        com.android.billingclient.api.c cVarD = jVar.f50731c.d(activity, aVarB.a());
        if (cVarD.c() == 0) {
            jVar.f50747s.n(Boolean.TRUE);
            jVar.I(bVar, true);
        } else {
            wp.a.h(f50725v).d("Billing failed: + %s", cVarD.a());
            jVar.I(bVar, false);
        }
    }

    public static /* synthetic */ UpgradeActivity.c g(com.android.billingclient.api.g gVar) {
        long jC;
        String strA;
        int i10;
        String str;
        String strD;
        List listF = gVar.f();
        int i11 = 0;
        if (listF == null || listF.size() <= 0) {
            jC = gVar.b().c();
            String strD2 = gVar.b().d();
            strA = gVar.b().a();
            i10 = -1;
            str = "inapp";
            strD = strD2;
        } else {
            List listA = ((com.android.billingclient.api.g.e) listF.get(0)).b().a();
            int iD = ((com.android.billingclient.api.g.c) listA.get(0)).c() == 0 ? sp.a.i(((com.android.billingclient.api.g.c) listA.get(0)).a()).d() : -1;
            com.android.billingclient.api.g.c cVar = (com.android.billingclient.api.g.c) listA.get(iD == -1 ? 0 : 1);
            jC = cVar.c();
            strD = cVar.d();
            strA = cVar.b();
            String strA2 = cVar.a();
            if (sp.a.i(strA2).h() == 1) {
                i11 = 365;
            } else if (sp.a.i(strA2).g() == 3) {
                i11 = 90;
            } else if (sp.a.i(strA2).g() == 1) {
                i11 = 30;
            } else if (sp.a.i(strA2).d() == 7) {
                i11 = 7;
            }
            str = SubSampleInformationBox.TYPE;
            i10 = iD;
        }
        return new UpgradeActivity.c(gVar.d(), gVar.g(), gVar.a(), str, i11, jC, Currency.getInstance(strD), strA, i10, false);
    }

    public static /* synthetic */ void j(j jVar, l5.j jVar2, com.android.billingclient.api.c cVar) {
        jVar.getClass();
        if (cVar.c() == 0) {
            Iterator it = jVar2.b().iterator();
            while (it.hasNext()) {
                jVar.S((String) it.next(), c.PRODUCT_STATE_PURCHASED_AND_ACKNOWLEDGED);
            }
            jVar.f50745q.n(jVar2.b());
        }
    }

    public static /* synthetic */ void l(j jVar, l5.j jVar2, com.android.billingclient.api.c cVar, String str) {
        jVar.f50744p.remove(jVar2);
        if (cVar.c() == 0) {
            wp.a.h(f50725v).a("Consumption successful. Delivering entitlement.", new Object[0]);
            jVar.f50746r.n(jVar2.b());
            Iterator it = jVar2.b().iterator();
            while (it.hasNext()) {
                jVar.S((String) it.next(), c.PRODUCT_STATE_UNPURCHASED);
            }
            jVar.f50745q.n(jVar2.b());
        } else {
            wp.a.h(f50725v).d("Error while consuming: %s", cVar.a());
        }
        wp.a.h(f50725v).a("End consumption flow.", new Object[0]);
    }

    public static /* synthetic */ void m(j jVar, com.android.billingclient.api.c cVar, List list) {
        jVar.getClass();
        if (cVar.c() != 0) {
            wp.a.h(f50725v).d("Problem getting purchases: %s", cVar.a());
        } else {
            jVar.M(list, jVar.f50732d);
            jVar.Q("inapp", list);
        }
    }

    public static /* synthetic */ void n(j jVar, com.android.billingclient.api.e eVar) {
        jVar.getClass();
        if (eVar.a() == 1) {
            wp.a.h(f50725v).a("Subscription recovered via Play in-app message", new Object[0]);
            jVar.O();
        }
    }

    public static /* synthetic */ void o(j jVar, com.android.billingclient.api.c cVar, List list) {
        jVar.getClass();
        if (cVar.c() != 0) {
            wp.a.h(f50725v).d("Problem getting subscriptions: %s", cVar.a());
        } else {
            jVar.M(list, jVar.f50733e);
            jVar.Q(SubSampleInformationBox.TYPE, list);
        }
    }

    private void t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.f50736h.containsKey(str)) {
                p0 p0Var = new p0();
                a aVar = new a();
                this.f50736h.put(str, p0Var);
                this.f50737i.put(str, aVar);
            }
        }
    }

    private void u(final l5.j jVar) {
        if (this.f50744p.contains(jVar)) {
            return;
        }
        this.f50744p.add(jVar);
        this.f50731c.b(l5.d.b().b(jVar.d()).a(), new l5.e() { // from class: qf.f
            @Override // l5.e
            public final void a(com.android.billingclient.api.c cVar, String str) {
                j.l(this.f50715a, jVar, cVar, str);
            }
        });
    }

    private List v(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.h.b.b().b((String) it.next()).c(str).a());
        }
        return arrayList;
    }

    public static j x() {
        return f50727x;
    }

    public static j y(Application application, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        if (f50727x == null) {
            synchronized (j.class) {
                try {
                    if (f50727x == null) {
                        f50727x = new j(application, strArr, strArr2, strArr3, strArr4);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50727x;
    }

    public List A() {
        return this.f50733e;
    }

    public final k0 B(String str) {
        return o1.d((k0) this.f50737i.get(str), new Function1() { // from class: qf.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.g((com.android.billingclient.api.g) obj);
            }
        });
    }

    public List C() {
        return this.f50734f;
    }

    public boolean F(String str) {
        return this.f50732d.contains(str) || this.f50733e.contains(str);
    }

    public void H(final Activity activity, String str, final b bVar, final String... strArr) {
        final com.android.billingclient.api.g gVar = (com.android.billingclient.api.g) ((k0) this.f50737i.get(str)).f();
        if (gVar == null) {
            wp.a.h(f50725v).d("ProductDetails not found for: %s", str);
            I(bVar, false);
            return;
        }
        if (strArr != null && strArr.length > 0) {
            this.f50731c.g(l5.m.b().b(SubSampleInformationBox.TYPE).a(), new l5.k() { // from class: qf.h
                @Override // l5.k
                public final void a(com.android.billingclient.api.c cVar, List list) {
                    j.e(this.f50718a, strArr, gVar, activity, bVar, cVar, list);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.android.billingclient.api.b.C0141b.a aVarC = com.android.billingclient.api.b.C0141b.b().c(gVar);
        try {
            aVarC.b(((com.android.billingclient.api.g.e) gVar.f().get(0)).a());
        } catch (NullPointerException unused) {
        }
        arrayList.add(aVarC.a());
        com.android.billingclient.api.b.a aVarB = com.android.billingclient.api.b.b();
        aVarB.b(arrayList);
        com.android.billingclient.api.c cVarD = this.f50731c.d(activity, aVarB.a());
        if (cVarD.c() == 0) {
            this.f50747s.n(Boolean.TRUE);
            I(bVar, true);
        } else {
            wp.a.h(f50725v).d("Billing failed: + %s", cVarD.a());
            I(bVar, false);
        }
    }

    public final k0 K() {
        return this.f50745q;
    }

    public final k0 L() {
        return this.f50743o;
    }

    public void O() {
        this.f50731c.g(l5.m.b().b("inapp").a(), new l5.k() { // from class: qf.b
            @Override // l5.k
            public final void a(com.android.billingclient.api.c cVar, List list) {
                j.m(this.f50710a, cVar, list);
            }
        });
        this.f50731c.g(l5.m.b().b(SubSampleInformationBox.TYPE).a(), new l5.k() { // from class: qf.c
            @Override // l5.k
            public final void a(com.android.billingclient.api.c cVar, List list) {
                j.o(this.f50711a, cVar, list);
            }
        });
        wp.a.h(f50725v).a("Refreshing purchases started.", new Object[0]);
    }

    public void P() {
        this.f50731c.c();
        f50727x = null;
        f50728y.n(Boolean.FALSE);
    }

    public void U(Activity activity) {
        if (!this.f50729a || this.f50730b) {
            return;
        }
        this.f50730b = true;
        this.f50731c.h(activity, com.android.billingclient.api.d.a().a(2).b(), new l5.h() { // from class: qf.g
            @Override // l5.h
            public final void a(com.android.billingclient.api.e eVar) {
                j.n(this.f50717a, eVar);
            }
        });
    }

    public void V(String[] strArr, String[] strArr2, String[] strArr3) {
        List listAsList = strArr == null ? Collections.EMPTY_LIST : Arrays.asList(strArr);
        List listAsList2 = strArr2 == null ? Collections.EMPTY_LIST : Arrays.asList(strArr2);
        this.f50732d = listAsList;
        this.f50733e = listAsList2;
        this.f50734f = strArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(strArr3);
        t(listAsList);
        t(listAsList2);
        N();
        wp.a.h(f50725v).a("Catalog updated: inapp=%s subs=%s", listAsList, listAsList2);
    }

    @Override // l5.l
    public void b(com.android.billingclient.api.c cVar, List list) {
        int iC = cVar.c();
        if (iC != 0) {
            if (iC == 1) {
                wp.a.h(f50725v).g("onPurchasesUpdated: User canceled the purchase", new Object[0]);
            } else if (iC == 5) {
                wp.a.h(f50725v).d("onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The product product ID must match and the APK you are using must be signed with release keys.", new Object[0]);
            } else if (iC != 7) {
                wp.a.h(f50725v).a("BillingResult [" + cVar.c() + "]: " + cVar.a(), new Object[0]);
            } else {
                wp.a.h(f50725v).g("onPurchasesUpdated: The user already owns this item", new Object[0]);
            }
        } else if (list != null) {
            M(list, null);
            O();
        } else {
            wp.a.h(f50725v).a("Null Purchase List Returned from OK response!", new Object[0]);
        }
        this.f50747s.n(Boolean.FALSE);
    }

    @Override // l5.i
    public void d(com.android.billingclient.api.c cVar, com.android.billingclient.api.i iVar) {
        List<com.android.billingclient.api.g> listA = iVar.a();
        int iC = cVar.c();
        String strA = cVar.a();
        switch (iC) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                wp.a.h(f50725v).d("onProductDetailsResponse: " + iC + " " + strA, new Object[0]);
                break;
            case 0:
                String str = f50725v;
                wp.a.h(str).g("onProductDetailsResponse: " + iC + " " + strA, new Object[0]);
                if (listA.isEmpty()) {
                    wp.a.h(str).d("onProductDetailsResponse: Found null or empty productDetails. Check to see if the products you requested are correctly published in the Google Play Console.", new Object[0]);
                } else {
                    for (com.android.billingclient.api.g gVar : listA) {
                        String strD = gVar.d();
                        p0 p0Var = (p0) this.f50737i.get(strD);
                        if (p0Var != null) {
                            p0Var.n(gVar);
                        } else {
                            wp.a.h(f50725v).d("Unknown product: %s", strD);
                        }
                    }
                }
                break;
            case 1:
                wp.a.h(f50725v).g("onProductDetailsResponse: " + iC + " " + strA, new Object[0]);
                break;
            default:
                wp.a.h(f50725v).k("onProductDetailsResponse: " + iC + " " + strA, new Object[0]);
                break;
        }
        if (iC == 0) {
            this.f50749u = SystemClock.elapsedRealtime();
        } else {
            this.f50749u = -14400000L;
        }
    }

    @Override // l5.c
    public void onBillingServiceDisconnected() {
        this.f50729a = false;
        f50728y.n(Boolean.FALSE);
        R();
    }

    @Override // l5.c
    public void onBillingSetupFinished(com.android.billingclient.api.c cVar) {
        int iC = cVar.c();
        String strA = cVar.a();
        wp.a.h(f50725v).a("onBillingSetupFinished: " + iC + " " + strA, new Object[0]);
        if (iC != 0) {
            R();
            return;
        }
        this.f50748t = 1000L;
        this.f50729a = true;
        f50728y.n(Boolean.TRUE);
        N();
        O();
    }

    @r0(s.a.ON_RESUME)
    public void resume() {
        wp.a.h(f50725v).a("ON_RESUME", new Object[0]);
        Boolean bool = (Boolean) this.f50747s.f();
        if (this.f50729a) {
            if (bool == null || !bool.booleanValue()) {
                O();
            }
        }
    }

    public k0 w() {
        return this.f50747s;
    }

    public List z() {
        return this.f50732d;
    }
}
