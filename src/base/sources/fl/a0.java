package fl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Collection, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f38731a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f38732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38733b;

        public a(int[] array) {
            kotlin.jvm.internal.s.h(array, "array");
            this.f38732a = array;
        }

        public int a() {
            int i10 = this.f38733b;
            int[] iArr = this.f38732a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f38733b));
            }
            this.f38733b = i10 + 1;
            return z.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38733b < this.f38732a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return z.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ a0(int[] iArr) {
        this.f38731a = iArr;
    }

    public static final /* synthetic */ a0 a(int[] iArr) {
        return new a0(iArr);
    }

    public static int[] b(int i10) {
        return d(new int[i10]);
    }

    public static int[] d(int[] storage) {
        kotlin.jvm.internal.s.h(storage, "storage");
        return storage;
    }

    public static boolean g(int[] iArr, int i10) {
        return gl.j.N(iArr, i10);
    }

    public static boolean h(int[] iArr, Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof z) || !gl.j.N(iArr, ((z) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.s.c(iArr, ((a0) obj).x());
    }

    public static final int m(int[] iArr, int i10) {
        return z.b(iArr[i10]);
    }

    public static int o(int[] iArr) {
        return iArr.length;
    }

    public static int p(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean r(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator u(int[] iArr) {
        return new a(iArr);
    }

    public static final void v(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String w(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof z) {
            return f(((z) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return h(this.f38731a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f38731a, obj);
    }

    public boolean f(int i10) {
        return g(this.f38731a, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return p(this.f38731a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f38731a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return u(this.f38731a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f38731a);
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
        return w(this.f38731a);
    }

    public final /* synthetic */ int[] x() {
        return this.f38731a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        return kotlin.jvm.internal.j.b(this, array);
    }
}
