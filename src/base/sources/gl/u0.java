package gl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 extends t0 {
    public static Set d() {
        return f0.f39325a;
    }

    public static HashSet e(Object... elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return (HashSet) o.s0(elements, new HashSet(n0.e(elements.length)));
    }

    public static Set f(Object... elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return (Set) o.s0(elements, new LinkedHashSet(n0.e(elements.length)));
    }

    public static final Set g(Set set) {
        kotlin.jvm.internal.s.h(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : t0.c(set.iterator().next());
        }
        return d();
    }

    public static Set h(Object... elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return o.E0(elements);
    }
}
