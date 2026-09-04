package gl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static List a(List builder) {
        kotlin.jvm.internal.s.h(builder, "builder");
        return ((hl.b) builder).y();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (z10 && kotlin.jvm.internal.s.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new hl.b(0, 1, null);
    }

    public static List d(int i10) {
        return new hl.b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.s.g(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i10, Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
