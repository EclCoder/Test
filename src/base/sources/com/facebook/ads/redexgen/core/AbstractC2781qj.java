package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2781qj {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(Set<?> s10) {
        int i10 = 0;
        Iterator<?> it = s10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC2429kj<? super E> predicate) {
        if (!(unfiltered instanceof C1145Av)) {
            return new AnonymousClass26((SortedSet) AbstractC2428ki.A04(unfiltered), (InterfaceC2429kj) AbstractC2428ki.A04(predicate));
        }
        C1145Av c1145Av = (C1145Av) unfiltered;
        return new AnonymousClass26((SortedSet) c1145Av.A01, AbstractC2431kl.A00(c1145Av.A00, predicate));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC2429kj<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return A03((SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof C1145Av)) {
            return new C1145Av((Set) AbstractC2428ki.A04(unfiltered), (InterfaceC2429kj) AbstractC2428ki.A04(predicate));
        }
        C1145Av c1145Av = (C1145Av) unfiltered;
        return new C1145Av((Set) c1145Av.A01, AbstractC2431kl.A00(c1145Av.A00, predicate));
    }

    public static void A08() {
        A00 = new byte[]{25, 16, 25, 17, 25, 18, 8, 47, 25, 8, 121, 111, 126, 59, 19, 5, 20, 82};
    }

    static {
        A08();
    }

    public static <E> AbstractC2779qh<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC2428ki.A05(set1, A04(10, 4, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE));
        AbstractC2428ki.A05(set2, A04(14, 4, 29));
        return new C1147Ax(set1, set2);
    }

    public static <E> AbstractC2779qh<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC2428ki.A05(set1, A04(10, 4, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE));
        AbstractC2428ki.A05(set2, A04(14, 4, 29));
        return new C1146Aw(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2728po.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s10, Object object) {
        if (s10 == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        if (A01[0].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "mkkUVP7U2mO33UgVMEf";
        strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
        Set set = (Set) object;
        try {
            return s10.size() == set.size() && s10.containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC2428ki.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC2688p9.A0E(set.iterator(), collection);
            }
        }
        Iterator<?> it = collection.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    public static boolean A0B(Set<?> set, Iterator<?> iterator) {
        boolean z10 = false;
        while (changed) {
            boolean changed = set.remove(iterator.next());
            z10 |= changed;
        }
        return z10;
    }
}
