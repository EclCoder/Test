package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements n4.g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n4.g f4381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f4384d;

    public f1(n4.g savedStateRegistry, final u1 viewModelStoreOwner) {
        kotlin.jvm.internal.s.h(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.s.h(viewModelStoreOwner, "viewModelStoreOwner");
        this.f4381a = savedStateRegistry;
        this.f4384d = fl.l.b(new tl.a() { // from class: androidx.lifecycle.e1
            @Override // tl.a
            public final Object invoke() {
                return f1.f(viewModelStoreOwner);
            }
        });
    }

    private final g1 d() {
        return (g1) this.f4384d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 f(u1 u1Var) {
        return c1.e(u1Var);
    }

    @Override // n4.g.b
    public Bundle a() {
        fl.q[] qVarArr;
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
        Bundle bundle = this.f4383c;
        if (bundle != null) {
            n4.k.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().j().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((z0) entry2.getValue()).e().a();
            if (!n4.c.v(n4.c.a(bundleA3))) {
                n4.k.n(bundleA2, str, bundleA3);
            }
        }
        this.f4382b = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        fl.q[] qVarArr;
        kotlin.jvm.internal.s.h(key, "key");
        e();
        Bundle bundle = this.f4383c;
        if (bundle == null || !n4.c.b(n4.c.a(bundle), key)) {
            return null;
        }
        Bundle bundleQ = n4.c.q(n4.c.a(bundle), key);
        if (bundleQ == null) {
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
            bundleQ = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
            n4.k.a(bundleQ);
        }
        n4.k.s(n4.k.a(bundle), key);
        if (n4.c.v(n4.c.a(bundle))) {
            this.f4383c = null;
        }
        return bundleQ;
    }

    public final void e() {
        fl.q[] qVarArr;
        if (this.f4382b) {
            return;
        }
        Bundle bundleA = this.f4381a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle bundleA2 = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle bundleA3 = n4.k.a(bundleA2);
        Bundle bundle = this.f4383c;
        if (bundle != null) {
            n4.k.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            n4.k.b(bundleA3, bundleA);
        }
        this.f4383c = bundleA2;
        this.f4382b = true;
        d();
    }
}
