package o4;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import fl.g0;
import fl.q;
import fl.w;
import gl.l0;
import j0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n4.g;
import n4.j;
import n4.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f48200i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f48201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.a f48202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f48203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f48204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f48206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48208h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(j owner, tl.a onAttach) {
        s.h(owner, "owner");
        s.h(onAttach, "onAttach");
        this.f48201a = owner;
        this.f48202b = onAttach;
        this.f48203c = new c();
        this.f48204d = new LinkedHashMap();
        this.f48208h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, b0 b0Var, androidx.lifecycle.s.a event) {
        s.h(b0Var, "<unused var>");
        s.h(event, "event");
        if (event == androidx.lifecycle.s.a.ON_START) {
            bVar.f48208h = true;
        } else if (event == androidx.lifecycle.s.a.ON_STOP) {
            bVar.f48208h = false;
        }
    }

    public final Bundle c(String key) {
        s.h(key, "key");
        if (!this.f48207g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f48206f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = n4.c.a(bundle);
        Bundle bundleO = n4.c.b(bundleA, key) ? n4.c.o(bundleA, key) : null;
        k.s(k.a(bundle), key);
        if (n4.c.v(n4.c.a(bundle))) {
            this.f48206f = null;
        }
        return bundleO;
    }

    public final g.b d(String key) {
        g.b bVar;
        s.h(key, "key");
        synchronized (this.f48203c) {
            Iterator it = this.f48204d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                g.b bVar2 = (g.b) entry.getValue();
                if (s.c(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f48208h;
    }

    public final void f() {
        if (this.f48201a.getLifecycle().b() != androidx.lifecycle.s.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f48205e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f48202b.invoke();
        this.f48201a.getLifecycle().a(new y() { // from class: o4.a
            @Override // androidx.lifecycle.y
            public final void c(b0 b0Var, androidx.lifecycle.s.a aVar) {
                b.g(this.f48199a, b0Var, aVar);
            }
        });
        this.f48205e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f48205e) {
            f();
        }
        if (this.f48201a.getLifecycle().b().e(androidx.lifecycle.s.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f48201a.getLifecycle().b()).toString());
        }
        if (this.f48207g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleO = null;
        if (bundle != null) {
            Bundle bundleA = n4.c.a(bundle);
            if (n4.c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleO = n4.c.o(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f48206f = bundleO;
        this.f48207g = true;
    }

    public final void i(Bundle outBundle) {
        q[] qVarArr;
        s.h(outBundle, "outBundle");
        Map mapH = l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (q[]) arrayList.toArray(new q[0]);
        }
        Bundle bundleA = e.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle bundleA2 = k.a(bundleA);
        Bundle bundle = this.f48206f;
        if (bundle != null) {
            k.b(bundleA2, bundle);
        }
        synchronized (this.f48203c) {
            try {
                for (Map.Entry entry2 : this.f48204d.entrySet()) {
                    k.n(bundleA2, (String) entry2.getKey(), ((g.b) entry2.getValue()).a());
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (n4.c.v(n4.c.a(bundleA))) {
            return;
        }
        k.n(k.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, g.b provider) {
        s.h(key, "key");
        s.h(provider, "provider");
        synchronized (this.f48203c) {
            if (this.f48204d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f48204d.put(key, provider);
            g0 g0Var = g0.f38750a;
        }
    }
}
