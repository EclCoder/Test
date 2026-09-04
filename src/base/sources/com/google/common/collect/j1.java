package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class j1 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? w0.d() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        sc.p.o(comparator);
        sc.p.o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof i1)) {
                return false;
            }
            comparator2 = ((i1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
