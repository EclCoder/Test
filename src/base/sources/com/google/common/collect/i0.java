package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {
    public static boolean a(Iterable iterable, sc.q qVar) {
        return j0.b(iterable.iterator(), qVar);
    }

    private static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : l0.j(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return j0.m(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return j0.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(l0.a(iterable));
            }
        }
        return j0.l(iterable.iterator(), obj);
    }

    private static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return j0.n(iterable.iterator());
    }

    public static boolean h(Iterable iterable, sc.q qVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (sc.q) sc.p.o(qVar)) : j0.r(iterable.iterator(), qVar);
    }

    private static boolean i(List list, sc.q qVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!qVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, qVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, qVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void j(List list, sc.q qVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (qVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
