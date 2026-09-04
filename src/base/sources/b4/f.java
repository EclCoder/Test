package b4;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.f0;
import androidx.lifecycle.h1;
import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import y3.d1;
import y3.t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y3.y f8328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f8329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d1 f8330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bundle f8331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.s.b f8332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1 f8333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f8335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n4.i f8336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fl.k f8338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f0 f8339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.lifecycle.s.b f8340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s1.c f8341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final fl.k f8342o;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends p1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z0 f8343b;

        public a(z0 handle) {
            kotlin.jvm.internal.s.h(handle, "handle");
            this.f8343b = handle;
        }

        public final z0 j() {
            return this.f8343b;
        }
    }

    public f(y3.y entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        this.f8328a = entry;
        this.f8329b = entry.c();
        this.f8330c = entry.d();
        this.f8331d = entry.g();
        this.f8332e = entry.e();
        this.f8333f = entry.j();
        this.f8334g = entry.f();
        this.f8335h = entry.i();
        this.f8336i = n4.i.f46841c.b(entry);
        this.f8338k = fl.l.b(new tl.a() { // from class: b4.c
            @Override // tl.a
            public final Object invoke() {
                return f.d();
            }
        });
        this.f8339l = new f0(entry);
        this.f8340m = androidx.lifecycle.s.b.INITIALIZED;
        this.f8341n = f();
        this.f8342o = fl.l.b(new tl.a() { // from class: b4.d
            @Override // tl.a
            public final Object invoke() {
                return f.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 d() {
        return new h1();
    }

    private final s1.c k() {
        return (s1.c) this.f8342o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.c p() {
        q1.c cVar = new q1.c();
        cVar.a(l0.b(a.class), new Function1() { // from class: b4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.q((q1.a) obj);
            }
        });
        return cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a q(q1.a initializer) {
        kotlin.jvm.internal.s.h(initializer, "$this$initializer");
        return new a(c1.b(initializer));
    }

    public final Bundle e() {
        fl.q[] qVarArr;
        if (this.f8331d == null) {
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
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.b(n4.k.a(bundleA), this.f8331d);
        return bundleA;
    }

    public final h1 f() {
        return (h1) this.f8338k.getValue();
    }

    public final q1.d g() {
        q1.d dVar = new q1.d(null, 1, null);
        dVar.c(c1.f4341a, this.f8328a);
        dVar.c(c1.f4342b, this.f8328a);
        Bundle bundleE = e();
        if (bundleE != null) {
            dVar.c(c1.f4343c, bundleE);
        }
        return dVar;
    }

    public final s1.c h() {
        return this.f8341n;
    }

    public final f0 i() {
        return this.f8339l;
    }

    public final androidx.lifecycle.s.b j() {
        return this.f8340m;
    }

    public final z0 l() {
        if (!this.f8337j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f8339l.b() != androidx.lifecycle.s.b.DESTROYED) {
            return ((a) s1.b.d(s1.f4482b, this.f8328a, k(), null, 4, null).c(l0.b(a.class))).j();
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
    }

    public final n4.g m() {
        return this.f8336i.b();
    }

    public final androidx.lifecycle.t1 n() {
        if (!this.f8337j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f8339l.b() == androidx.lifecycle.s.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        t1 t1Var = this.f8333f;
        if (t1Var != null) {
            return t1Var.b(this.f8334g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void o(androidx.lifecycle.s.a event) {
        kotlin.jvm.internal.s.h(event, "event");
        this.f8328a.o(event.g());
        this.f8332e = event.g();
        u();
    }

    public final void r(Bundle outBundle) {
        kotlin.jvm.internal.s.h(outBundle, "outBundle");
        this.f8336i.e(outBundle);
    }

    public final void s(androidx.lifecycle.s.b bVar) {
        kotlin.jvm.internal.s.h(bVar, "<set-?>");
        this.f8332e = bVar;
    }

    public final void t(androidx.lifecycle.s.b maxState) {
        kotlin.jvm.internal.s.h(maxState, "maxState");
        this.f8340m = maxState;
        u();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l0.b(this.f8328a.getClass()).k());
        sb2.append('(' + this.f8334g + ')');
        sb2.append(" destination=");
        sb2.append(this.f8330c);
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public final void u() {
        if (!this.f8337j) {
            this.f8336i.c();
            this.f8337j = true;
            if (this.f8333f != null) {
                c1.c(this.f8328a);
            }
            this.f8336i.d(this.f8335h);
        }
        if (this.f8332e.ordinal() < this.f8340m.ordinal()) {
            this.f8339l.p(this.f8332e);
        } else {
            this.f8339l.p(this.f8340m);
        }
    }
}
