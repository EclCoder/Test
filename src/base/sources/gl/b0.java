package gl;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import f8.Ygx.FuoITeVPeXAj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 extends a0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements am.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f39312a;

        public a(Iterable iterable) {
            this.f39312a = iterable;
        }

        @Override // am.g
        public Iterator iterator() {
            return this.f39312a.iterator();
        }
    }

    public static List A0(Iterable iterable, int i10) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.l();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return I0(iterable);
            }
            if (i10 == 1) {
                return s.e(a0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return t.r(arrayList);
    }

    public static List B0(List list, int i10) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.l();
        }
        int size = list.size();
        if (i10 >= size) {
            return I0(list);
        }
        if (i10 == 1) {
            return s.e(n0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] C0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] D0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final Collection E0(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static float[] F0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static HashSet G0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return (HashSet) E0(iterable, new HashSet(n0.e(u.v(iterable, 12))));
    }

    public static int[] H0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List I0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return t.r(K0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return t.l();
        }
        if (size != 1) {
            return L0(collection);
        }
        return s.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] J0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static final List K0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return iterable instanceof Collection ? L0((Collection) iterable) : (List) E0(iterable, new ArrayList());
    }

    public static List L0(Collection collection) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set N0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return u0.g((Set) E0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u0.d();
        }
        if (size != 1) {
            return (Set) E0(iterable, new LinkedHashSet(n0.e(collection.size())));
        }
        return t0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List O0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(u.v(iterable, 10), u.v(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(fl.w.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static am.g T(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean U(Iterable iterable, Object obj) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return f0(iterable, obj) >= 0;
    }

    public static List V(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return I0(M0(iterable));
    }

    public static List W(Iterable iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return I0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return t.l();
            }
            if (size == 1) {
                return s.e(m0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return t.r(arrayList);
    }

    public static List X(List list, int i10) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (i10 >= 0) {
            return A0(list, yl.g.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List Y(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        return (List) Z(iterable, new ArrayList());
    }

    public static final Collection Z(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object a0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return b0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object b0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object c0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object d0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object e0(List list, int i10) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int f0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                t.u();
            }
            if (kotlin.jvm.internal.s.c(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int g0(List list, Object obj) {
        kotlin.jvm.internal.s.h(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set h0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(other, "other");
        Set setM0 = M0(iterable);
        y.K(setM0, other);
        return setM0;
    }

    public static final Appendable i0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bm.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String l0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return k0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static final Object m0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return n0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object n0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(t.n(list));
    }

    public static Object o0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable p0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable q0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List r0(Iterable iterable, Iterable elements) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        if (iterable instanceof Collection) {
            return s0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        y.z(arrayList, iterable);
        y.z(arrayList, elements);
        return arrayList;
    }

    public static List s0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            y.z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List t0(Collection collection, Object obj) {
        kotlin.jvm.internal.s.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List u0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return I0(iterable);
        }
        List listK0 = K0(iterable);
        a0.S(listK0);
        return listK0;
    }

    public static Object v0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return w0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object w0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object x0(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List y0(List list, yl.f indices) {
        kotlin.jvm.internal.s.h(list, "<this>");
        kotlin.jvm.internal.s.h(indices, "indices");
        return indices.isEmpty() ? t.l() : I0(list.subList(indices.m().intValue(), indices.k().intValue() + 1));
    }

    public static List z0(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listK0 = K0(iterable);
            x.y(listK0, comparator);
            return listK0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return I0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.F(array, comparator);
        return m.e(array);
    }

    public static Set M0(Iterable iterable) {
        kotlin.jvm.internal.s.h(iterable, giNWGaNAgVQoO.XSxAQETVuIZXLV);
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) E0(iterable, new LinkedHashSet());
    }

    public static final String k0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence charSequence, int i10, CharSequence truncated, Function1 function1) {
        kotlin.jvm.internal.s.h(iterable, "<this>");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(charSequence, FuoITeVPeXAj.YmPefCLAtXUnQ);
        kotlin.jvm.internal.s.h(truncated, "truncated");
        return ((StringBuilder) i0(iterable, new StringBuilder(), separator, prefix, charSequence, i10, truncated, function1)).toString();
    }
}
