package gl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends w {
    public static void x(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void y(List list, Comparator comparator) {
        kotlin.jvm.internal.s.h(list, "<this>");
        kotlin.jvm.internal.s.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
