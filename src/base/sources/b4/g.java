package b4;

import android.os.Bundle;
import gl.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8344e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f8347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bundle f8348d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(y3.y entry, int i10) {
        fl.q[] qVarArr;
        kotlin.jvm.internal.s.h(entry, "entry");
        this.f8345a = entry.f();
        this.f8346b = i10;
        this.f8347c = entry.b();
        Map mapH = l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry2 : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        this.f8348d = bundleA;
        entry.l(bundleA);
    }

    public final Bundle a() {
        return this.f8347c;
    }

    public final int b() {
        return this.f8346b;
    }

    public final String c() {
        return this.f8345a;
    }

    public final y3.y d(h context, d1 destination, Bundle bundle, androidx.lifecycle.s.b hostLifecycleState, y3.l0 l0Var) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(destination, "destination");
        kotlin.jvm.internal.s.h(hostLifecycleState, "hostLifecycleState");
        return y3.y.f57350j.a(context, destination, bundle, hostLifecycleState, l0Var, this.f8345a, this.f8348d);
    }

    public final Bundle e() {
        fl.q[] qVarArr;
        fl.q[] qVarArr2;
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
        Bundle bundleA2 = n4.k.a(bundleA);
        n4.k.p(bundleA2, "nav-entry-state:id", this.f8345a);
        n4.k.g(bundleA2, "nav-entry-state:destination-id", this.f8346b);
        Bundle bundleA3 = this.f8347c;
        if (bundleA3 == null) {
            Map mapH2 = l0.h();
            if (mapH2.isEmpty()) {
                qVarArr2 = new fl.q[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapH2.size());
                for (Map.Entry entry2 : mapH2.entrySet()) {
                    arrayList2.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
                }
                qVarArr2 = (fl.q[]) arrayList2.toArray(new fl.q[0]);
            }
            bundleA3 = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr2, qVarArr2.length));
            n4.k.a(bundleA3);
        }
        n4.k.n(bundleA2, "nav-entry-state:args", bundleA3);
        n4.k.n(bundleA2, "nav-entry-state:saved-state", this.f8348d);
        return bundleA;
    }

    public g(Bundle state) {
        kotlin.jvm.internal.s.h(state, "state");
        this.f8345a = n4.c.r(n4.c.a(state), "nav-entry-state:id");
        this.f8346b = n4.c.j(n4.c.a(state), "nav-entry-state:destination-id");
        this.f8347c = n4.c.o(n4.c.a(state), "nav-entry-state:args");
        this.f8348d = n4.c.o(n4.c.a(state), "nav-entry-state:saved-state");
    }
}
