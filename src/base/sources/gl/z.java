package gl;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z extends y {
    public static List O(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        return new r0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(List list, int i10) {
        if (i10 >= 0 && i10 <= t.n(list)) {
            return t.n(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new yl.f(0, t.n(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(List list, int i10) {
        return t.n(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new yl.f(0, list.size()) + "].");
    }
}
