package fl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements Collection, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f38747a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f38748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38749b;

        public a(short[] array) {
            kotlin.jvm.internal.s.h(array, "array");
            this.f38748a = array;
        }

        public short a() {
            int i10 = this.f38749b;
            short[] sArr = this.f38748a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f38749b));
            }
            this.f38749b = i10 + 1;
            return e0.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38749b < this.f38748a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return e0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ f0(short[] sArr) {
        this.f38747a = sArr;
    }

    public static final /* synthetic */ f0 a(short[] sArr) {
        return new f0(sArr);
    }

    public static short[] b(int i10) {
        return d(new short[i10]);
    }

    public static short[] d(short[] storage) {
        kotlin.jvm.internal.s.h(storage, "storage");
        return storage;
    }

    public static boolean g(short[] sArr, short s10) {
        return gl.j.Q(sArr, s10);
    }

    public static boolean h(short[] sArr, Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof e0) || !gl.j.Q(sArr, ((e0) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof f0) && kotlin.jvm.internal.s.c(sArr, ((f0) obj).x());
    }

    public static final short m(short[] sArr, int i10) {
        return e0.b(sArr[i10]);
    }

    public static int o(short[] sArr) {
        return sArr.length;
    }

    public static int p(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean r(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator u(short[] sArr) {
        return new a(sArr);
    }

    public static final void v(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String w(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e0) {
            return f(((e0) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return h(this.f38747a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f38747a, obj);
    }

    public boolean f(short s10) {
        return g(this.f38747a, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return p(this.f38747a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f38747a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return u(this.f38747a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f38747a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return w(this.f38747a);
    }

    public final /* synthetic */ short[] x() {
        return this.f38747a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        return kotlin.jvm.internal.j.b(this, array);
    }
}
