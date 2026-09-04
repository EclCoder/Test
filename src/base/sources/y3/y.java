package y3;

import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.lifecycle.b0, androidx.lifecycle.u1, androidx.lifecycle.q, n4.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f57350j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4.h f57351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d1 f57352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f57353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.s.b f57354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f57355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f57356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f57357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b4.f f57358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fl.k f57359i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ y b(a aVar, b4.h hVar, d1 d1Var, Bundle bundle, androidx.lifecycle.s.b bVar, t1 t1Var, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                bVar = androidx.lifecycle.s.b.CREATED;
            }
            if ((i10 & 16) != 0) {
                t1Var = null;
            }
            if ((i10 & 32) != 0) {
                str = aVar.c();
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return aVar.a(hVar, d1Var, bundle, bVar, t1Var, str, bundle2);
        }

        public final y a(b4.h hVar, d1 destination, Bundle bundle, androidx.lifecycle.s.b hostLifecycleState, t1 t1Var, String id2, Bundle bundle2) {
            kotlin.jvm.internal.s.h(destination, "destination");
            kotlin.jvm.internal.s.h(hostLifecycleState, "hostLifecycleState");
            kotlin.jvm.internal.s.h(id2, "id");
            return new y(hVar, destination, bundle, hostLifecycleState, t1Var, id2, bundle2, null);
        }

        public final String c() {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return string;
        }

        private a() {
        }
    }

    public /* synthetic */ y(b4.h hVar, d1 d1Var, Bundle bundle, androidx.lifecycle.s.b bVar, t1 t1Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, d1Var, bundle, bVar, t1Var, str, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.z0 m(y yVar) {
        return yVar.f57358h.l();
    }

    public final Bundle b() {
        return this.f57358h.e();
    }

    public final b4.h c() {
        return this.f57351a;
    }

    public final d1 d() {
        return this.f57352b;
    }

    public final androidx.lifecycle.s.b e() {
        return this.f57354d;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof y)) {
            y yVar = (y) obj;
            if (kotlin.jvm.internal.s.c(this.f57356f, yVar.f57356f) && kotlin.jvm.internal.s.c(this.f57352b, yVar.f57352b) && kotlin.jvm.internal.s.c(getLifecycle(), yVar.getLifecycle()) && kotlin.jvm.internal.s.c(getSavedStateRegistry(), yVar.getSavedStateRegistry())) {
                if (kotlin.jvm.internal.s.c(this.f57353c, yVar.f57353c)) {
                    return true;
                }
                Bundle bundle = this.f57353c;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    if (setKeySet.isEmpty()) {
                        return true;
                    }
                    for (String str : setKeySet) {
                        Object obj2 = this.f57353c.get(str);
                        Bundle bundle2 = yVar.f57353c;
                        if (!kotlin.jvm.internal.s.c(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f57356f;
    }

    public final Bundle g() {
        return this.f57353c;
    }

    @Override // androidx.lifecycle.q
    public q1.a getDefaultViewModelCreationExtras() {
        q1.d dVarG = this.f57358h.g();
        b4.h hVar = this.f57351a;
        Object objA = hVar != null ? hVar.a() : null;
        Application application = objA instanceof Application ? (Application) objA : null;
        if (application != null) {
            dVarG.c(androidx.lifecycle.s1.a.f4487h, application);
        }
        return dVarG;
    }

    @Override // androidx.lifecycle.q
    public androidx.lifecycle.s1.c getDefaultViewModelProviderFactory() {
        return this.f57358h.h();
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.s getLifecycle() {
        return this.f57358h.i();
    }

    @Override // n4.j
    public n4.g getSavedStateRegistry() {
        return this.f57358h.m();
    }

    @Override // androidx.lifecycle.u1
    public androidx.lifecycle.t1 getViewModelStore() {
        return this.f57358h.n();
    }

    public final androidx.lifecycle.s.b h() {
        return this.f57358h.j();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f57356f.hashCode() * 31) + this.f57352b.hashCode();
        Bundle bundle = this.f57353c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.f57353c.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final Bundle i() {
        return this.f57357g;
    }

    public final t1 j() {
        return this.f57355e;
    }

    public final void k(androidx.lifecycle.s.a event) {
        kotlin.jvm.internal.s.h(event, "event");
        this.f57358h.o(event);
    }

    public final void l(Bundle outBundle) {
        kotlin.jvm.internal.s.h(outBundle, "outBundle");
        this.f57358h.r(outBundle);
    }

    public final void n(d1 d1Var) {
        kotlin.jvm.internal.s.h(d1Var, "<set-?>");
        this.f57352b = d1Var;
    }

    public final void o(androidx.lifecycle.s.b bVar) {
        kotlin.jvm.internal.s.h(bVar, "<set-?>");
        this.f57354d = bVar;
    }

    public final void p(androidx.lifecycle.s.b value) {
        kotlin.jvm.internal.s.h(value, "value");
        this.f57358h.t(value);
    }

    public final void q() {
        this.f57358h.u();
    }

    public String toString() {
        return this.f57358h.toString();
    }

    private y(b4.h hVar, d1 d1Var, Bundle bundle, androidx.lifecycle.s.b bVar, t1 t1Var, String str, Bundle bundle2) {
        this.f57351a = hVar;
        this.f57352b = d1Var;
        this.f57353c = bundle;
        this.f57354d = bVar;
        this.f57355e = t1Var;
        this.f57356f = str;
        this.f57357g = bundle2;
        this.f57358h = new b4.f(this);
        this.f57359i = fl.l.b(new tl.a() { // from class: y3.x
            @Override // tl.a
            public final Object invoke() {
                return y.m(this.f57316a);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(y entry, Bundle bundle) {
        this(entry.f57351a, entry.f57352b, bundle, entry.f57354d, entry.f57355e, entry.f57356f, entry.f57357g);
        kotlin.jvm.internal.s.h(entry, "entry");
        this.f57358h.s(entry.f57354d);
        this.f57358h.t(entry.h());
    }
}
