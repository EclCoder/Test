package y3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57154b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f57155c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f57156a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class navigatorClass) {
            kotlin.jvm.internal.s.h(navigatorClass, "navigatorClass");
            String strValue = (String) a2.f57155c.get(navigatorClass);
            if (strValue == null) {
                z1.b bVar = (z1.b) navigatorClass.getAnnotation(z1.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                a2.f57155c.put(navigatorClass, strValue);
            }
            kotlin.jvm.internal.s.e(strValue);
            return strValue;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }

        private a() {
        }
    }

    public z1 b(String name, z1 navigator) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(navigator, "navigator");
        if (!f57154b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        z1 z1Var = (z1) this.f57156a.get(name);
        if (kotlin.jvm.internal.s.c(z1Var, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (z1Var != null && z1Var.e()) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + z1Var).toString());
        }
        if (!navigator.e()) {
            return (z1) this.f57156a.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final z1 c(z1 navigator) {
        kotlin.jvm.internal.s.h(navigator, "navigator");
        return b(f57154b.a(navigator.getClass()), navigator);
    }

    public z1 d(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        if (!f57154b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        z1 z1Var = (z1) this.f57156a.get(name);
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map e() {
        return gl.l0.t(this.f57156a);
    }
}
