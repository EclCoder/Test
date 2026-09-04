package n4;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import fl.q;
import fl.w;
import gl.l0;
import gl.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46835b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f46836a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: n4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0722b implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f46837a;

        public C0722b(g registry) {
            s.h(registry, "registry");
            this.f46837a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // n4.g.b
        public Bundle a() {
            q[] qVarArr;
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
            Bundle bundleA = j0.e.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
            k.r(k.a(bundleA), "classes_to_restore", r.I0(this.f46837a));
            return bundleA;
        }

        public final void b(String className) {
            s.h(className, "className");
            this.f46837a.add(className);
        }
    }

    public b(j owner) {
        s.h(owner, "owner");
        this.f46836a = owner;
    }

    private final void b(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(g.a.class);
            s.e(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    s.e(objNewInstance);
                    ((g.a) objNewInstance).a(this.f46836a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.y
    public void c(b0 source, androidx.lifecycle.s.a event) {
        s.h(source, "source");
        s.h(event, "event");
        if (event != androidx.lifecycle.s.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleA = this.f46836a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List listU = c.u(c.a(bundleA), "classes_to_restore");
        if (listU == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }
}
