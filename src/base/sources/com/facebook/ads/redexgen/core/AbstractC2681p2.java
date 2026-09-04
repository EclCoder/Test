package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2681p2 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T t10) {
        return (T) AbstractC2688p9.A06(iterable.iterator(), t10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A02(Iterable<T> iterable, InterfaceC2429kj<? super T> predicate) {
        return AbstractC2688p9.A0B(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A03(Iterable<T> removeFrom, InterfaceC2429kj<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? A04((List) removeFrom, (InterfaceC2429kj) AbstractC2428ki.A04(predicate)) : AbstractC2688p9.A0C(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(List<T> list, InterfaceC2429kj<? super T> predicate, int to2, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A4C(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n10 = from - 1; n10 >= to2; n10--) {
            list.remove(n10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> boolean A04(List<T> list, InterfaceC2429kj<? super T> predicate) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < from) {
            T t10 = list.get(i10);
            if (!predicate.A4C(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        A01(list, predicate, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        A01(list, predicate, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        int from = list.size();
        list.subList(i11, from).clear();
        return i10 != i11;
    }
}
