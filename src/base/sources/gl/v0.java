package gl;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 extends u0 {
    public static Set i(Set set, Object obj) {
        kotlin.jvm.internal.s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(n0.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.s.c(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set j(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.s.h(set, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        Integer numW = u.w(elements);
        if (numW != null) {
            size = set.size() + numW.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(n0.e(size));
        linkedHashSet.addAll(set);
        y.z(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set k(Set set, Object obj) {
        kotlin.jvm.internal.s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(n0.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
