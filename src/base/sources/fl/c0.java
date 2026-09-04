package fl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements Collection, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f38737a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f38738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38739b;

        public a(long[] array) {
            kotlin.jvm.internal.s.h(array, "array");
            this.f38738a = array;
        }

        public long a() {
            int i10 = this.f38739b;
            long[] jArr = this.f38738a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f38739b));
            }
            this.f38739b = i10 + 1;
            return b0.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38739b < this.f38738a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ c0(long[] jArr) {
        this.f38737a = jArr;
    }

    public static final /* synthetic */ c0 a(long[] jArr) {
        return new c0(jArr);
    }

    public static long[] b(int i10) {
        return d(new long[i10]);
    }

    public static long[] d(long[] storage) {
        kotlin.jvm.internal.s.h(storage, "storage");
        return storage;
    }

    public static boolean g(long[] jArr, long j10) {
        return gl.j.O(jArr, j10);
    }

    public static boolean h(long[] jArr, Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof b0) || !gl.j.O(jArr, ((b0) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof c0) && kotlin.jvm.internal.s.c(jArr, ((c0) obj).x());
    }

    public static final long m(long[] jArr, int i10) {
        return b0.b(jArr[i10]);
    }

    public static int o(long[] jArr) {
        return jArr.length;
    }

    public static int p(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean r(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator u(long[] jArr) {
        return new a(jArr);
    }

    public static final void v(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String w(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof b0) {
            return f(((b0) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return h(this.f38737a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f38737a, obj);
    }

    public boolean f(long j10) {
        return g(this.f38737a, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return p(this.f38737a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f38737a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return u(this.f38737a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f38737a);
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
        return w(this.f38737a);
    }

    public final /* synthetic */ long[] x() {
        return this.f38737a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        return kotlin.jvm.internal.j.b(this, array);
    }
}
