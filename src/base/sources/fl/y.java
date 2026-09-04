package fl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements Collection, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f38785a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f38786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38787b;

        public a(byte[] array) {
            kotlin.jvm.internal.s.h(array, "array");
            this.f38786a = array;
        }

        public byte a() {
            int i10 = this.f38787b;
            byte[] bArr = this.f38786a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f38787b));
            }
            this.f38787b = i10 + 1;
            return x.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38787b < this.f38786a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return x.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ y(byte[] bArr) {
        this.f38785a = bArr;
    }

    public static final /* synthetic */ y a(byte[] bArr) {
        return new y(bArr);
    }

    public static byte[] b(int i10) {
        return d(new byte[i10]);
    }

    public static byte[] d(byte[] storage) {
        kotlin.jvm.internal.s.h(storage, "storage");
        return storage;
    }

    public static boolean g(byte[] bArr, byte b10) {
        return gl.j.L(bArr, b10);
    }

    public static boolean h(byte[] bArr, Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof x) || !gl.j.L(bArr, ((x) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.s.c(bArr, ((y) obj).x());
    }

    public static final byte m(byte[] bArr, int i10) {
        return x.b(bArr[i10]);
    }

    public static int o(byte[] bArr) {
        return bArr.length;
    }

    public static int p(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean r(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator u(byte[] bArr) {
        return new a(bArr);
    }

    public static final void v(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String w(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof x) {
            return f(((x) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        return h(this.f38785a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f38785a, obj);
    }

    public boolean f(byte b10) {
        return g(this.f38785a, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return p(this.f38785a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f38785a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return u(this.f38785a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f38785a);
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
        return w(this.f38785a);
    }

    public final /* synthetic */ byte[] x() {
        return this.f38785a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        return kotlin.jvm.internal.j.b(this, array);
    }
}
