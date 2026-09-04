package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    private static boolean S = false;
    private f.c D;
    private f.c E;
    private f.c F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private i0 P;
    private j1.b.c Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4073b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f4075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f4076e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.activity.i0 f4078g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f4084m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x f4093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private u f4094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Fragment f4095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Fragment f4096y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f4072a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f4074c = new n0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f4077f = new y(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.d0 f4079h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f4080i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f4081j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f4082k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f4083l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z f4085n = new z(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f4086o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m0.a f4087p = new m0.a() { // from class: androidx.fragment.app.a0
        @Override // m0.a
        public final void accept(Object obj) {
            f0.e(this.f4042a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0.a f4088q = new m0.a() { // from class: androidx.fragment.app.b0
        @Override // m0.a
        public final void accept(Object obj) {
            f0.a(this.f4057a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m0.a f4089r = new m0.a() { // from class: androidx.fragment.app.c0
        @Override // m0.a
        public final void accept(Object obj) {
            f0.d(this.f4060a, (androidx.core.app.j) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final m0.a f4090s = new m0.a() { // from class: androidx.fragment.app.d0
        @Override // m0.a
        public final void accept(Object obj) {
            f0.c(this.f4064a, (androidx.core.app.u) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n0.u f4091t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f4092u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f4097z = null;
    private w A = new d();
    private z0 B = null;
    private z0 C = new e();
    ArrayDeque G = new ArrayDeque();
    private Runnable R = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f.b {
        a() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m mVar = (m) f0.this.G.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = mVar.f4112a;
            int i11 = mVar.f4113b;
            Fragment fragmentI = f0.this.f4074c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends androidx.activity.d0 {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            f0.this.J0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements n0.u {
        c() {
        }

        @Override // n0.u
        public void a(Menu menu) {
            f0.this.N(menu);
        }

        @Override // n0.u
        public void b(Menu menu) {
            f0.this.R(menu);
        }

        @Override // n0.u
        public boolean c(MenuItem menuItem) {
            return f0.this.M(menuItem);
        }

        @Override // n0.u
        public void d(Menu menu, MenuInflater menuInflater) {
            f0.this.F(menu, menuInflater);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends w {
        d() {
        }

        @Override // androidx.fragment.app.w
        public Fragment a(ClassLoader classLoader, String str) {
            return f0.this.A0().b(f0.this.A0().f(), str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements z0 {
        e() {
        }

        @Override // androidx.fragment.app.z0
        public x0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.k(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.d0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements androidx.lifecycle.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f4105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.s f4106c;

        g(String str, k0 k0Var, androidx.lifecycle.s sVar) {
            this.f4104a = str;
            this.f4105b = k0Var;
            this.f4106c = sVar;
        }

        @Override // androidx.lifecycle.y
        public void c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
            Bundle bundle;
            if (aVar == androidx.lifecycle.s.a.ON_START && (bundle = (Bundle) f0.this.f4082k.get(this.f4104a)) != null) {
                this.f4105b.a(this.f4104a, bundle);
                f0.this.v(this.f4104a);
            }
            if (aVar == androidx.lifecycle.s.a.ON_DESTROY) {
                this.f4106c.d(this);
                f0.this.f4083l.remove(this.f4104a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f4108a;

        h(Fragment fragment) {
            this.f4108a = fragment;
        }

        @Override // androidx.fragment.app.j0
        public void a(f0 f0Var, Fragment fragment) {
            this.f4108a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements f.b {
        i() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f.a aVar) {
            m mVar = (m) f0.this.G.pollLast();
            if (mVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVar.f4112a;
            int i10 = mVar.f4113b;
            Fragment fragmentI = f0.this.f4074c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements f.b {
        j() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f.a aVar) {
            m mVar = (m) f0.this.G.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVar.f4112a;
            int i10 = mVar.f4113b;
            Fragment fragmentI = f0.this.f4074c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k extends g.a {
        k() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, f.h hVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = hVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new f.h.a(hVar.e()).b(null).c(hVar.c(), hVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (f0.N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public f.a c(int i10, Intent intent) {
            return new f.a(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class n implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.s f4114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f4115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.lifecycle.y f4116c;

        n(androidx.lifecycle.s sVar, k0 k0Var, androidx.lifecycle.y yVar) {
            this.f4114a = sVar;
            this.f4115b = k0Var;
            this.f4116c = yVar;
        }

        @Override // androidx.fragment.app.k0
        public void a(String str, Bundle bundle) {
            this.f4115b.a(str, bundle);
        }

        public boolean b(androidx.lifecycle.s.b bVar) {
            return this.f4114a.b().e(bVar);
        }

        public void c() {
            this.f4114a.d(this.f4116c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface o {
        void a(Fragment fragment, boolean z10);

        void b(Fragment fragment, boolean z10);

        void onBackStackChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface p {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f4117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4119c;

        q(String str, int i10, int i11) {
            this.f4117a = str;
            this.f4118b = i10;
            this.f4119c = i11;
        }

        @Override // androidx.fragment.app.f0.p
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = f0.this.f4096y;
            if (fragment == null || this.f4118b >= 0 || this.f4117a != null || !fragment.getChildFragmentManager().e1()) {
                return f0.this.h1(arrayList, arrayList2, this.f4117a, this.f4118b, this.f4119c);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class r implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4121a;

        r(String str) {
            this.f4121a = str;
        }

        @Override // androidx.fragment.app.f0.p
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return f0.this.p1(arrayList, arrayList2, this.f4121a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class s implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4123a;

        s(String str) {
            this.f4123a = str;
        }

        @Override // androidx.fragment.app.f0.p
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return f0.this.u1(arrayList, arrayList2, this.f4123a);
        }
    }

    private void C1(Fragment fragment) {
        ViewGroup viewGroupW0 = w0(fragment);
        if (viewGroupW0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = i1.b.f40741c;
        if (viewGroupW0.getTag(i10) == null) {
            viewGroupW0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupW0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    private void E1() {
        Iterator it = this.f4074c.k().iterator();
        while (it.hasNext()) {
            b1((m0) it.next());
        }
    }

    private void F1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u0("FragmentManager"));
        x xVar = this.f4093v;
        if (xVar != null) {
            try {
                xVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            Z("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    static Fragment H0(View view) {
        Object tag = view.getTag(i1.b.f40739a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void H1() {
        synchronized (this.f4072a) {
            try {
                if (this.f4072a.isEmpty()) {
                    this.f4079h.i(s0() > 0 && S0(this.f4095x));
                } else {
                    this.f4079h.i(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean N0(int i10) {
        return S || Log.isLoggable("FragmentManager", i10);
    }

    private void O(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean O0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.r();
    }

    private boolean P0() {
        Fragment fragment = this.f4095x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f4095x.getParentFragmentManager().P0();
    }

    private void V(int i10) {
        try {
            this.f4073b = true;
            this.f4074c.d(i10);
            Y0(i10, false);
            Iterator it = w().iterator();
            while (it.hasNext()) {
                ((x0) it.next()).n();
            }
            this.f4073b = false;
            d0(true);
        } catch (Throwable th2) {
            this.f4073b = false;
            throw th2;
        }
    }

    private void Y() {
        if (this.L) {
            this.L = false;
            E1();
        }
    }

    public static /* synthetic */ void a(f0 f0Var, Integer num) {
        if (f0Var.P0() && num.intValue() == 80) {
            f0Var.I(false);
        }
    }

    private void a0() {
        Iterator it = w().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).n();
        }
    }

    public static /* synthetic */ void c(f0 f0Var, androidx.core.app.u uVar) {
        if (f0Var.P0()) {
            f0Var.Q(uVar.a(), false);
        }
    }

    private void c0(boolean z10) {
        if (this.f4073b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4093v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4093v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            s();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public static /* synthetic */ void d(f0 f0Var, androidx.core.app.j jVar) {
        if (f0Var.P0()) {
            f0Var.J(jVar.a(), false);
        }
    }

    public static /* synthetic */ void e(f0 f0Var, Configuration configuration) {
        if (f0Var.P0()) {
            f0Var.C(configuration, false);
        }
    }

    private static void f0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.u(-1);
                aVar.A();
            } else {
                aVar.u(1);
                aVar.z();
            }
            i10++;
        }
    }

    private void g0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        boolean z10 = ((androidx.fragment.app.a) arrayList.get(i10)).f4223r;
        ArrayList arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.f4074c.o());
        Fragment fragmentE0 = E0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i12);
            fragmentE0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? aVar.B(this.O, fragmentE0) : aVar.E(this.O, fragmentE0);
            z11 = z11 || aVar.f4214i;
        }
        this.O.clear();
        if (!z10 && this.f4092u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList arrayList5 = ((androidx.fragment.app.a) arrayList.get(i13)).f4208c;
                int size = arrayList5.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList5.get(i14);
                    i14++;
                    Fragment fragment = ((o0.a) obj).f4226b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f4074c.r(y(fragment));
                    }
                }
            }
        }
        f0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && (arrayList3 = this.f4084m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(p0((androidx.fragment.app.a) obj2));
            }
            ArrayList arrayList6 = this.f4084m;
            int size3 = arrayList6.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList6.get(i16);
                i16++;
                o oVar = (o) obj3;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    oVar.b((Fragment) it.next(), zBooleanValue);
                }
            }
            ArrayList arrayList7 = this.f4084m;
            int size4 = arrayList7.size();
            int i17 = 0;
            while (i17 < size4) {
                Object obj4 = arrayList7.get(i17);
                i17++;
                o oVar2 = (o) obj4;
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    oVar2.a((Fragment) it2.next(), zBooleanValue);
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = aVar2.f4208c.size() - 1; size5 >= 0; size5--) {
                    Fragment fragment2 = ((o0.a) aVar2.f4208c.get(size5)).f4226b;
                    if (fragment2 != null) {
                        y(fragment2).m();
                    }
                }
            } else {
                ArrayList arrayList8 = aVar2.f4208c;
                int size6 = arrayList8.size();
                int i19 = 0;
                while (i19 < size6) {
                    Object obj5 = arrayList8.get(i19);
                    i19++;
                    Fragment fragment3 = ((o0.a) obj5).f4226b;
                    if (fragment3 != null) {
                        y(fragment3).m();
                    }
                }
            }
        }
        Y0(this.f4092u, true);
        for (x0 x0Var : x(arrayList, i10, i11)) {
            x0Var.v(zBooleanValue);
            x0Var.t();
            x0Var.k();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && aVar3.f4040v >= 0) {
                aVar3.f4040v = -1;
            }
            aVar3.D();
            i10++;
        }
        if (z11) {
            n1();
        }
    }

    private boolean g1(String str, int i10, int i11) {
        d0(false);
        c0(true);
        Fragment fragment = this.f4096y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().e1()) {
            return true;
        }
        boolean zH1 = h1(this.M, this.N, str, i10, i11);
        if (zH1) {
            this.f4073b = true;
            try {
                l1(this.M, this.N);
                t();
            } catch (Throwable th2) {
                t();
                throw th2;
            }
        }
        H1();
        Y();
        this.f4074c.b();
        return zH1;
    }

    private int i0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f4075d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f4075d.size() - 1;
        }
        int size = this.f4075d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f4075d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f4040v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f4075d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f4075d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f4040v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private void l1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i10)).f4223r) {
                if (i11 != i10) {
                    g0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i11)).f4223r) {
                        i11++;
                    }
                }
                g0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            g0(arrayList, arrayList2, i11, size);
        }
    }

    static f0 m0(View view) {
        androidx.fragment.app.s sVar;
        Fragment fragmentN0 = n0(view);
        if (fragmentN0 != null) {
            if (fragmentN0.isAdded()) {
                return fragmentN0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentN0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                sVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.s) {
                sVar = (androidx.fragment.app.s) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (sVar != null) {
            return sVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment n0(View view) {
        while (view != null) {
            Fragment fragmentH0 = H0(view);
            if (fragmentH0 != null) {
                return fragmentH0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n1() {
        if (this.f4084m != null) {
            for (int i10 = 0; i10 < this.f4084m.size(); i10++) {
                ((o) this.f4084m.get(i10)).onBackStackChanged();
            }
        }
    }

    private void o0() {
        Iterator it = w().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).o();
        }
    }

    private Set p0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f4208c.size(); i10++) {
            Fragment fragment = ((o0.a) aVar.f4208c.get(i10)).f4226b;
            if (fragment != null && aVar.f4214i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean q0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f4072a) {
            if (this.f4072a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f4072a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((p) this.f4072a.get(i10)).a(arrayList, arrayList2);
                }
                this.f4072a.clear();
                this.f4093v.g().removeCallbacks(this.R);
                return zA;
            } catch (Throwable th2) {
                this.f4072a.clear();
                this.f4093v.g().removeCallbacks(this.R);
                throw th2;
            }
        }
    }

    static int r1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private void s() {
        if (U0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void t() {
        this.f4073b = false;
        this.N.clear();
        this.M.clear();
    }

    private i0 t0(Fragment fragment) {
        return this.P.o(fragment);
    }

    private void u() {
        boolean zS;
        x xVar = this.f4093v;
        if (xVar instanceof u1) {
            zS = this.f4074c.p().s();
        } else {
            zS = xVar.f() instanceof Activity ? !((Activity) this.f4093v.f()).isChangingConfigurations() : true;
        }
        if (zS) {
            Iterator it = this.f4081j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((androidx.fragment.app.c) it.next()).f4058a.iterator();
                while (it2.hasNext()) {
                    this.f4074c.p().l((String) it2.next(), false);
                }
            }
        }
    }

    private Set w() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f4074c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((m0) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(x0.s(viewGroup, F0()));
            }
        }
        return hashSet;
    }

    private ViewGroup w0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4094w.d()) {
            View viewC = this.f4094w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private Set x(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((androidx.fragment.app.a) arrayList.get(i10)).f4208c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                Fragment fragment = ((o0.a) obj).f4226b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(x0.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    void A() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        V(4);
    }

    public x A0() {
        return this.f4093v;
    }

    void A1(Fragment fragment, androidx.lifecycle.s.b bVar) {
        if (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void B() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        V(0);
    }

    LayoutInflater.Factory2 B0() {
        return this.f4077f;
    }

    void B1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4096y;
            this.f4096y = fragment;
            O(fragment2);
            O(this.f4096y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void C(Configuration configuration, boolean z10) {
        if (z10 && (this.f4093v instanceof androidx.core.content.d)) {
            F1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.C(configuration, true);
                }
            }
        }
    }

    z C0() {
        return this.f4085n;
    }

    boolean D(MenuItem menuItem) {
        if (this.f4092u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    Fragment D0() {
        return this.f4095x;
    }

    void D1(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void E() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        V(1);
    }

    public Fragment E0() {
        return this.f4096y;
    }

    boolean F(Menu menu, MenuInflater menuInflater) {
        if (this.f4092u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null && R0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f4076e != null) {
            for (int i10 = 0; i10 < this.f4076e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f4076e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4076e = arrayList;
        return z10;
    }

    z0 F0() {
        z0 z0Var = this.B;
        if (z0Var != null) {
            return z0Var;
        }
        Fragment fragment = this.f4095x;
        return fragment != null ? fragment.mFragmentManager.F0() : this.C;
    }

    void G() {
        this.K = true;
        d0(true);
        a0();
        u();
        V(-1);
        Object obj = this.f4093v;
        if (obj instanceof androidx.core.content.e) {
            ((androidx.core.content.e) obj).removeOnTrimMemoryListener(this.f4088q);
        }
        Object obj2 = this.f4093v;
        if (obj2 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj2).removeOnConfigurationChangedListener(this.f4087p);
        }
        Object obj3 = this.f4093v;
        if (obj3 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj3).removeOnMultiWindowModeChangedListener(this.f4089r);
        }
        Object obj4 = this.f4093v;
        if (obj4 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj4).removeOnPictureInPictureModeChangedListener(this.f4090s);
        }
        Object obj5 = this.f4093v;
        if ((obj5 instanceof n0.p) && this.f4095x == null) {
            ((n0.p) obj5).removeMenuProvider(this.f4091t);
        }
        this.f4093v = null;
        this.f4094w = null;
        this.f4095x = null;
        if (this.f4078g != null) {
            this.f4079h.h();
            this.f4078g = null;
        }
        f.c cVar = this.D;
        if (cVar != null) {
            cVar.d();
            this.E.d();
            this.F.d();
        }
    }

    public j1.b.c G0() {
        return this.Q;
    }

    public void G1(l lVar) {
        this.f4085n.p(lVar);
    }

    void H() {
        V(1);
    }

    void I(boolean z10) {
        if (z10 && (this.f4093v instanceof androidx.core.content.e)) {
            F1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.I(true);
                }
            }
        }
    }

    t1 I0(Fragment fragment) {
        return this.P.r(fragment);
    }

    void J(boolean z10, boolean z11) {
        if (z11 && (this.f4093v instanceof androidx.core.app.q)) {
            F1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.J(z10, true);
                }
            }
        }
    }

    void J0() {
        d0(true);
        if (this.f4079h.g()) {
            e1();
        } else {
            this.f4078g.l();
        }
    }

    void K(Fragment fragment) {
        Iterator it = this.f4086o.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).a(this, fragment);
        }
    }

    void K0(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        C1(fragment);
    }

    void L() {
        for (Fragment fragment : this.f4074c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.L();
            }
        }
    }

    void L0(Fragment fragment) {
        if (fragment.mAdded && O0(fragment)) {
            this.H = true;
        }
    }

    boolean M(MenuItem menuItem) {
        if (this.f4092u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean M0() {
        return this.K;
    }

    void N(Menu menu) {
        if (this.f4092u < 1) {
            return;
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void P() {
        V(5);
    }

    void Q(boolean z10, boolean z11) {
        if (z11 && (this.f4093v instanceof androidx.core.app.r)) {
            F1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.Q(z10, true);
                }
            }
        }
    }

    boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    boolean R(Menu menu) {
        boolean z10 = false;
        if (this.f4092u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null && R0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void S() {
        H1();
        O(this.f4096y);
    }

    boolean S0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        f0 f0Var = fragment.mFragmentManager;
        return fragment.equals(f0Var.E0()) && S0(f0Var.f4095x);
    }

    void T() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        V(7);
    }

    boolean T0(int i10) {
        return this.f4092u >= i10;
    }

    void U() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        V(5);
    }

    public boolean U0() {
        return this.I || this.J;
    }

    void V0(Fragment fragment, String[] strArr, int i10) {
        if (this.F == null) {
            this.f4093v.k(fragment, strArr, i10);
            return;
        }
        this.G.addLast(new m(fragment.mWho, i10));
        this.F.b(strArr);
    }

    void W() {
        this.J = true;
        this.P.u(true);
        V(4);
    }

    void W0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.D == null) {
            this.f4093v.m(fragment, intent, i10, bundle);
            return;
        }
        this.G.addLast(new m(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.b(intent);
    }

    void X() {
        V(2);
    }

    void X0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.E == null) {
            this.f4093v.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (N0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        f.h hVarA = new f.h.a(intentSender).b(intent).c(i12, i11).a();
        this.G.addLast(new m(fragment.mWho, i10));
        if (N0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.E.b(hVarA);
    }

    void Y0(int i10, boolean z10) {
        x xVar;
        if (this.f4093v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f4092u) {
            this.f4092u = i10;
            this.f4074c.t();
            E1();
            if (this.H && (xVar = this.f4093v) != null && this.f4092u == 7) {
                xVar.o();
                this.H = false;
            }
        }
    }

    public void Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4074c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f4076e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f4076e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f4075d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f4075d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4080i.get());
        synchronized (this.f4072a) {
            try {
                int size3 = this.f4072a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        p pVar = (p) this.f4072a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4093v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4094w);
        if (this.f4095x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4095x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4092u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    void Z0() {
        if (this.f4093v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.u(false);
        for (Fragment fragment : this.f4074c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void a1(FragmentContainerView fragmentContainerView) {
        View view;
        for (m0 m0Var : this.f4074c.k()) {
            Fragment fragmentK = m0Var.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                m0Var.b();
            }
        }
    }

    void b0(p pVar, boolean z10) {
        if (!z10) {
            if (this.f4093v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            s();
        }
        synchronized (this.f4072a) {
            try {
                if (this.f4093v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4072a.add(pVar);
                    w1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b1(m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (fragmentK.mDeferStart) {
            if (this.f4073b) {
                this.L = true;
            } else {
                fragmentK.mDeferStart = false;
                m0Var.m();
            }
        }
    }

    void c1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            b0(new q(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean d0(boolean z10) {
        c0(z10);
        boolean z11 = false;
        while (q0(this.M, this.N)) {
            z11 = true;
            this.f4073b = true;
            try {
                l1(this.M, this.N);
                t();
            } catch (Throwable th2) {
                t();
                throw th2;
            }
        }
        H1();
        Y();
        this.f4074c.b();
        return z11;
    }

    public void d1(String str, int i10) {
        b0(new q(str, -1, i10), false);
    }

    void e0(p pVar, boolean z10) {
        if (z10 && (this.f4093v == null || this.K)) {
            return;
        }
        c0(z10);
        if (pVar.a(this.M, this.N)) {
            this.f4073b = true;
            try {
                l1(this.M, this.N);
                t();
            } catch (Throwable th2) {
                t();
                throw th2;
            }
        }
        H1();
        Y();
        this.f4074c.b();
    }

    public boolean e1() {
        return g1(null, -1, 0);
    }

    public boolean f1(int i10, int i11) {
        if (i10 >= 0) {
            return g1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    Fragment h0(String str) {
        return this.f4074c.f(str);
    }

    boolean h1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iI0 = i0(str, i10, (i11 & 1) != 0);
        if (iI0 < 0) {
            return false;
        }
        for (int size = this.f4075d.size() - 1; size >= iI0; size--) {
            arrayList.add((androidx.fragment.app.a) this.f4075d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void i(androidx.fragment.app.a aVar) {
        if (this.f4075d == null) {
            this.f4075d = new ArrayList();
        }
        this.f4075d.add(aVar);
    }

    public void i1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            F1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    m0 j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            j1.b.f(fragment, str);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m0 m0VarY = y(fragment);
        fragment.mFragmentManager = this;
        this.f4074c.r(m0VarY);
        if (!fragment.mDetached) {
            this.f4074c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (O0(fragment)) {
                this.H = true;
            }
        }
        return m0VarY;
    }

    public Fragment j0(int i10) {
        return this.f4074c.g(i10);
    }

    public void j1(l lVar, boolean z10) {
        this.f4085n.o(lVar, z10);
    }

    public void k(j0 j0Var) {
        this.f4086o.add(j0Var);
    }

    public Fragment k0(String str) {
        return this.f4074c.h(str);
    }

    void k1(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f4074c.u(fragment);
        if (O0(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        C1(fragment);
    }

    public void l(o oVar) {
        if (this.f4084m == null) {
            this.f4084m = new ArrayList();
        }
        this.f4084m.add(oVar);
    }

    Fragment l0(String str) {
        return this.f4074c.i(str);
    }

    void m(Fragment fragment) {
        this.P.j(fragment);
    }

    void m1(Fragment fragment) {
        this.P.t(fragment);
    }

    int n() {
        return this.f4080i.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void o(x xVar, u uVar, Fragment fragment) {
        String str;
        androidx.lifecycle.b0 b0Var;
        if (this.f4093v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4093v = xVar;
        this.f4094w = uVar;
        this.f4095x = fragment;
        if (fragment != null) {
            k(new h(fragment));
        } else if (xVar instanceof j0) {
            k((j0) xVar);
        }
        if (this.f4095x != null) {
            H1();
        }
        if (xVar instanceof androidx.activity.j0) {
            androidx.activity.j0 j0Var = (androidx.activity.j0) xVar;
            androidx.activity.i0 onBackPressedDispatcher = j0Var.getOnBackPressedDispatcher();
            this.f4078g = onBackPressedDispatcher;
            if (fragment != null) {
                b0Var = j0Var;
                b0Var = fragment;
            }
            b0Var = j0Var;
            onBackPressedDispatcher.g(b0Var, this.f4079h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.t0(fragment);
        } else if (xVar instanceof u1) {
            this.P = i0.p(((u1) xVar).getViewModelStore());
        } else {
            this.P = new i0(false);
        }
        this.P.u(U0());
        this.f4074c.A(this.P);
        Object obj = this.f4093v;
        if ((obj instanceof n4.j) && fragment == null) {
            n4.g savedStateRegistry = ((n4.j) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new n4.g.b() { // from class: androidx.fragment.app.e0
                @Override // n4.g.b
                public final Bundle a() {
                    return this.f4067a.s1();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                q1(bundleA);
            }
        }
        Object obj2 = this.f4093v;
        if (obj2 instanceof f.g) {
            f.f activityResultRegistry = ((f.g) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = activityResultRegistry.o(str2 + "StartActivityForResult", new g.f(), new i());
            this.E = activityResultRegistry.o(str2 + "StartIntentSenderForResult", new k(), new j());
            this.F = activityResultRegistry.o(str2 + "RequestPermissions", new g.e(), new a());
        }
        Object obj3 = this.f4093v;
        if (obj3 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj3).addOnConfigurationChangedListener(this.f4087p);
        }
        Object obj4 = this.f4093v;
        if (obj4 instanceof androidx.core.content.e) {
            ((androidx.core.content.e) obj4).addOnTrimMemoryListener(this.f4088q);
        }
        Object obj5 = this.f4093v;
        if (obj5 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj5).addOnMultiWindowModeChangedListener(this.f4089r);
        }
        Object obj6 = this.f4093v;
        if (obj6 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj6).addOnPictureInPictureModeChangedListener(this.f4090s);
        }
        Object obj7 = this.f4093v;
        if ((obj7 instanceof n0.p) && fragment == null) {
            ((n0.p) obj7).addMenuProvider(this.f4091t);
        }
    }

    public void o1(String str) {
        b0(new r(str), false);
    }

    void p(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4074c.a(fragment);
            if (N0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (O0(fragment)) {
                this.H = true;
            }
        }
    }

    boolean p1(ArrayList arrayList, ArrayList arrayList2, String str) {
        androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.f4081j.remove(str);
        if (cVar == null) {
            return false;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) obj;
            if (aVar.f4041w) {
                ArrayList arrayList3 = aVar.f4208c;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Fragment fragment = ((o0.a) obj2).f4226b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator it = cVar.a(this, map).iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (((androidx.fragment.app.a) it.next()).a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public o0 q() {
        return new androidx.fragment.app.a(this);
    }

    void q1(Parcelable parcelable) {
        m0 m0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4093v.f().getClassLoader());
                this.f4082k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4093v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f4074c.x(map);
        h0 h0Var = (h0) bundle3.getParcelable("state");
        if (h0Var == null) {
            return;
        }
        this.f4074c.v();
        ArrayList arrayList = h0Var.f4132a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bundle bundleB = this.f4074c.B((String) obj, null);
            if (bundleB != null) {
                Fragment fragmentN = this.P.n(((l0) bundleB.getParcelable("state")).f4173b);
                if (fragmentN != null) {
                    if (N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentN);
                    }
                    m0Var = new m0(this.f4085n, this.f4074c, fragmentN, bundleB);
                } else {
                    m0Var = new m0(this.f4085n, this.f4074c, this.f4093v.f().getClassLoader(), x0(), bundleB);
                }
                Fragment fragmentK = m0Var.k();
                fragmentK.mSavedFragmentState = bundleB;
                fragmentK.mFragmentManager = this;
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                m0Var.o(this.f4093v.f().getClassLoader());
                this.f4074c.r(m0Var);
                m0Var.t(this.f4092u);
            }
        }
        for (Fragment fragment : this.P.q()) {
            if (!this.f4074c.c(fragment.mWho)) {
                if (N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + h0Var.f4132a);
                }
                this.P.t(fragment);
                fragment.mFragmentManager = this;
                m0 m0Var2 = new m0(this.f4085n, this.f4074c, fragment);
                m0Var2.t(1);
                m0Var2.m();
                fragment.mRemoving = true;
                m0Var2.m();
            }
        }
        this.f4074c.w(h0Var.f4133b);
        if (h0Var.f4134c != null) {
            this.f4075d = new ArrayList(h0Var.f4134c.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = h0Var.f4134c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = bVarArr[i11].b(this);
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVarB.f4040v + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new u0("FragmentManager"));
                    aVarB.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4075d.add(aVarB);
                i11++;
            }
        } else {
            this.f4075d = null;
        }
        this.f4080i.set(h0Var.f4135d);
        String str3 = h0Var.f4136e;
        if (str3 != null) {
            Fragment fragmentH0 = h0(str3);
            this.f4096y = fragmentH0;
            O(fragmentH0);
        }
        ArrayList arrayList2 = h0Var.f4137f;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                this.f4081j.put((String) arrayList2.get(i12), (androidx.fragment.app.c) h0Var.f4138g.get(i12));
            }
        }
        this.G = new ArrayDeque(h0Var.f4139h);
    }

    boolean r() {
        boolean zO0 = false;
        for (Fragment fragment : this.f4074c.l()) {
            if (fragment != null) {
                zO0 = O0(fragment);
            }
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    List r0() {
        return this.f4074c.l();
    }

    public int s0() {
        ArrayList arrayList = this.f4075d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle s1() {
        androidx.fragment.app.b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        o0();
        a0();
        d0(true);
        this.I = true;
        this.P.u(true);
        ArrayList arrayListY = this.f4074c.y();
        HashMap mapM = this.f4074c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f4074c.z();
            ArrayList arrayList = this.f4075d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f4075d.get(i10));
                    if (N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f4075d.get(i10));
                    }
                }
            }
            h0 h0Var = new h0();
            h0Var.f4132a = arrayListY;
            h0Var.f4133b = arrayListZ;
            h0Var.f4134c = bVarArr;
            h0Var.f4135d = this.f4080i.get();
            Fragment fragment = this.f4096y;
            if (fragment != null) {
                h0Var.f4136e = fragment.mWho;
            }
            h0Var.f4137f.addAll(this.f4081j.keySet());
            h0Var.f4138g.addAll(this.f4081j.values());
            h0Var.f4139h = new ArrayList(this.G);
            bundle.putParcelable("state", h0Var);
            for (String str : this.f4082k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f4082k.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (N0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void t1(String str) {
        b0(new s(str), false);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4095x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4095x)));
            sb2.append("}");
        } else {
            x xVar = this.f4093v;
            if (xVar != null) {
                sb2.append(xVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4093v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    u u0() {
        return this.f4094w;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    boolean u1(ArrayList arrayList, ArrayList arrayList2, String str) {
        int i10;
        int i11;
        int iI0 = i0(str, -1, true);
        int i12 = 0;
        if (iI0 < 0) {
            return false;
        }
        for (int i13 = iI0; i13 < this.f4075d.size(); i13++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f4075d.get(i13);
            if (!aVar.f4223r) {
                F1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        int i14 = iI0;
        while (i14 < this.f4075d.size()) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f4075d.get(i14);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = aVar2.f4208c;
            int size = arrayList3.size();
            int i15 = i12;
            while (i15 < size) {
                Object obj = arrayList3.get(i15);
                i15++;
                o0.a aVar3 = (o0.a) obj;
                Fragment fragment = aVar3.f4226b;
                if (fragment != null) {
                    if (aVar3.f4227c) {
                        int i16 = aVar3.f4225a;
                        i10 = i14;
                        if (i16 == 1 || i16 == 2 || i16 == 8) {
                        }
                        i11 = aVar3.f4225a;
                        if (i11 != 1 || i11 == 2) {
                            hashSet3.add(fragment);
                        }
                        i14 = i10;
                    } else {
                        i10 = i14;
                    }
                    hashSet.add(fragment);
                    hashSet2.add(fragment);
                    i11 = aVar3.f4225a;
                    if (i11 != 1) {
                        hashSet3.add(fragment);
                    } else {
                        hashSet3.add(fragment);
                    }
                    i14 = i10;
                }
            }
            int i17 = i14;
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb2.append(" in ");
                sb2.append(aVar2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                F1(new IllegalArgumentException(sb2.toString()));
            }
            i14 = i17 + 1;
            i12 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                F1(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.r0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList4.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList5 = new ArrayList(this.f4075d.size() - iI0);
        for (int i18 = iI0; i18 < this.f4075d.size(); i18++) {
            arrayList5.add(null);
        }
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(arrayList4, arrayList5);
        for (int size2 = this.f4075d.size() - 1; size2 >= iI0; size2--) {
            androidx.fragment.app.a aVar4 = (androidx.fragment.app.a) this.f4075d.remove(size2);
            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(aVar4);
            aVar5.v();
            arrayList5.set(size2 - iI0, new androidx.fragment.app.b(aVar5));
            aVar4.f4041w = true;
            arrayList.add(aVar4);
            arrayList2.add(Boolean.TRUE);
        }
        this.f4081j.put(str, cVar);
        return true;
    }

    public final void v(String str) {
        this.f4082k.remove(str);
        if (N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public Fragment v0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentH0 = h0(string);
        if (fragmentH0 == null) {
            F1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentH0;
    }

    public Fragment.n v1(Fragment fragment) {
        m0 m0VarN = this.f4074c.n(fragment.mWho);
        if (m0VarN == null || !m0VarN.k().equals(fragment)) {
            F1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m0VarN.q();
    }

    void w1() {
        synchronized (this.f4072a) {
            try {
                if (this.f4072a.size() == 1) {
                    this.f4093v.g().removeCallbacks(this.R);
                    this.f4093v.g().post(this.R);
                    H1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w x0() {
        w wVar = this.f4097z;
        if (wVar != null) {
            return wVar;
        }
        Fragment fragment = this.f4095x;
        return fragment != null ? fragment.mFragmentManager.x0() : this.A;
    }

    void x1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupW0 = w0(fragment);
        if (viewGroupW0 == null || !(viewGroupW0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupW0).setDrawDisappearingViewsLast(!z10);
    }

    m0 y(Fragment fragment) {
        m0 m0VarN = this.f4074c.n(fragment.mWho);
        if (m0VarN != null) {
            return m0VarN;
        }
        m0 m0Var = new m0(this.f4085n, this.f4074c, fragment);
        m0Var.o(this.f4093v.f().getClassLoader());
        m0Var.t(this.f4092u);
        return m0Var;
    }

    n0 y0() {
        return this.f4074c;
    }

    public final void y1(String str, Bundle bundle) {
        n nVar = (n) this.f4083l.get(str);
        if (nVar == null || !nVar.b(androidx.lifecycle.s.b.STARTED)) {
            this.f4082k.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    void z(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (N0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4074c.u(fragment);
            if (O0(fragment)) {
                this.H = true;
            }
            C1(fragment);
        }
    }

    public List z0() {
        return this.f4074c.o();
    }

    public final void z1(String str, androidx.lifecycle.b0 b0Var, k0 k0Var) {
        androidx.lifecycle.s lifecycle = b0Var.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.s.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, k0Var, lifecycle);
        n nVar = (n) this.f4083l.put(str, new n(lifecycle, k0Var, gVar));
        if (nVar != null) {
            nVar.c();
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + k0Var);
        }
        lifecycle.a(gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f4112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4113b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f4112a = str;
            this.f4113b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4112a);
            parcel.writeInt(this.f4113b);
        }

        m(Parcel parcel) {
            this.f4112a = parcel.readString();
            this.f4113b = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class l {
        public abstract void m(f0 f0Var, Fragment fragment, View view, Bundle bundle);

        public void d(f0 f0Var, Fragment fragment) {
        }

        public void e(f0 f0Var, Fragment fragment) {
        }

        public void f(f0 f0Var, Fragment fragment) {
        }

        public void i(f0 f0Var, Fragment fragment) {
        }

        public void k(f0 f0Var, Fragment fragment) {
        }

        public void l(f0 f0Var, Fragment fragment) {
        }

        public void n(f0 f0Var, Fragment fragment) {
        }

        public void a(f0 f0Var, Fragment fragment, Bundle bundle) {
        }

        public void b(f0 f0Var, Fragment fragment, Context context) {
        }

        public void c(f0 f0Var, Fragment fragment, Bundle bundle) {
        }

        public void g(f0 f0Var, Fragment fragment, Context context) {
        }

        public void h(f0 f0Var, Fragment fragment, Bundle bundle) {
        }

        public void j(f0 f0Var, Fragment fragment, Bundle bundle) {
        }
    }
}
