package gl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends x {
    public static boolean A(Collection collection, Object[] elements) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        return collection.addAll(m.e(elements));
    }

    public static final Collection B(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : b0.I0(iterable);
    }

    private static final boolean C(Iterable iterable, Function1 function1, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean D(List list, Function1 function1, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.s.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return C(kotlin.jvm.internal.p0.b(list), function1, z10);
        }
        int iN = t.n(list);
        if (iN >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) function1.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iN) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iN2 = t.n(list);
        if (i10 > iN2) {
            return true;
        }
        while (true) {
            list.remove(iN2);
            if (iN2 == i10) {
                return true;
            }
            iN2--;
        }
    }

    public static boolean E(Iterable iterable, Function1 predicate) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return C(iterable, predicate, true);
    }

    public static boolean F(List list, Function1 predicate) {
        kotlin.jvm.internal.s.h(list, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return D(list, predicate, true);
    }

    public static Object G(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object H(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(t.n(list));
    }

    public static Object I(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(t.n(list));
    }

    public static boolean J(Iterable iterable, Function1 predicate) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return C(iterable, predicate, false);
    }

    public static final boolean K(Collection collection, Iterable elements) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        return collection.retainAll(B(elements));
    }

    public static boolean z(Collection collection, Iterable elements) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
