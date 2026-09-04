package hl;

import gl.r;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends gl.f implements List, RandomAccess, Serializable, ul.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0611b f40417d = new C0611b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f40418e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f40419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40421c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends gl.f implements List, RandomAccess, Serializable, ul.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f40422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f40425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f40426e;

        /* JADX INFO: renamed from: hl.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0610a implements ListIterator, ul.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f40427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f40428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f40429c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f40430d;

            public C0610a(a list, int i10) {
                s.h(list, "list");
                this.f40427a = list;
                this.f40428b = i10;
                this.f40429c = -1;
                this.f40430d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f40427a.f40426e).modCount != this.f40430d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f40427a;
                int i10 = this.f40428b;
                this.f40428b = i10 + 1;
                aVar.add(i10, obj);
                this.f40429c = -1;
                this.f40430d = ((AbstractList) this.f40427a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f40428b < this.f40427a.f40424c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f40428b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f40428b >= this.f40427a.f40424c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f40428b;
                this.f40428b = i10 + 1;
                this.f40429c = i10;
                return this.f40427a.f40422a[this.f40427a.f40423b + this.f40429c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f40428b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f40428b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f40428b = i11;
                this.f40429c = i11;
                return this.f40427a.f40422a[this.f40427a.f40423b + this.f40429c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f40428b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f40429c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f40427a.g(i10);
                this.f40428b = this.f40429c;
                this.f40429c = -1;
                this.f40430d = ((AbstractList) this.f40427a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f40429c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f40427a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            s.h(backing, "backing");
            s.h(root, "root");
            this.f40422a = backing;
            this.f40423b = i10;
            this.f40424c = i11;
            this.f40425d = aVar;
            this.f40426e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A(int i10, int i11) {
            if (i11 > 0) {
                y();
            }
            a aVar = this.f40425d;
            if (aVar != null) {
                aVar.A(i10, i11);
            } else {
                this.f40426e.G(i10, i11);
            }
            this.f40424c -= i11;
        }

        private final int B(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f40425d;
            int iB = aVar != null ? aVar.B(i10, i11, collection, z10) : this.f40426e.H(i10, i11, collection, z10);
            if (iB > 0) {
                y();
            }
            this.f40424c -= iB;
            return iB;
        }

        private final void p(int i10, Collection collection, int i11) {
            y();
            a aVar = this.f40425d;
            if (aVar != null) {
                aVar.p(i10, collection, i11);
            } else {
                this.f40426e.w(i10, collection, i11);
            }
            this.f40422a = this.f40426e.f40419a;
            this.f40424c += i11;
        }

        private final void r(int i10, Object obj) {
            y();
            a aVar = this.f40425d;
            if (aVar != null) {
                aVar.r(i10, obj);
            } else {
                this.f40426e.x(i10, obj);
            }
            this.f40422a = this.f40426e.f40419a;
            this.f40424c++;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void u() {
            if (((AbstractList) this.f40426e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void v() {
            if (x()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean w(List list) {
            return hl.c.h(this.f40422a, this.f40423b, this.f40424c, list);
        }

        private final Object writeReplace() throws NotSerializableException {
            if (x()) {
                return new h(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final boolean x() {
            return this.f40426e.f40421c;
        }

        private final void y() {
            ((AbstractList) this).modCount++;
        }

        private final Object z(int i10) {
            y();
            a aVar = this.f40425d;
            Object objZ = aVar != null ? aVar.z(i10) : this.f40426e.F(i10);
            this.f40424c--;
            return objZ;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            v();
            u();
            r(this.f40423b + this.f40424c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            s.h(elements, "elements");
            v();
            u();
            int size = elements.size();
            p(this.f40423b + this.f40424c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            v();
            u();
            A(this.f40423b, this.f40424c);
        }

        @Override // gl.f
        public int d() {
            u();
            return this.f40424c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            u();
            if (obj != this) {
                return (obj instanceof List) && w((List) obj);
            }
            return true;
        }

        @Override // gl.f
        public Object g(int i10) {
            v();
            u();
            gl.d.f39316a.b(i10, this.f40424c);
            return z(this.f40423b + i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            u();
            gl.d.f39316a.b(i10, this.f40424c);
            return this.f40422a[this.f40423b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            u();
            return hl.c.i(this.f40422a, this.f40423b, this.f40424c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            u();
            for (int i10 = 0; i10 < this.f40424c; i10++) {
                if (s.c(this.f40422a[this.f40423b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            u();
            return this.f40424c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            u();
            for (int i10 = this.f40424c - 1; i10 >= 0; i10--) {
                if (s.c(this.f40422a[this.f40423b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            v();
            u();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                g(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            s.h(elements, "elements");
            v();
            u();
            return B(this.f40423b, this.f40424c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            s.h(elements, "elements");
            v();
            u();
            return B(this.f40423b, this.f40424c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            v();
            u();
            gl.d.f39316a.b(i10, this.f40424c);
            Object[] objArr = this.f40422a;
            int i11 = this.f40423b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            gl.d.f39316a.d(i10, i11, this.f40424c);
            return new a(this.f40422a, this.f40423b + i10, i11 - i10, this, this.f40426e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            s.h(array, "array");
            u();
            int length = array.length;
            int i10 = this.f40424c;
            if (length >= i10) {
                Object[] objArr = this.f40422a;
                int i11 = this.f40423b;
                gl.j.k(objArr, array, 0, i11, i10 + i11);
                return r.f(this.f40424c, array);
            }
            Object[] objArr2 = this.f40422a;
            int i12 = this.f40423b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            s.g(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            u();
            return hl.c.j(this.f40422a, this.f40423b, this.f40424c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            u();
            gl.d.f39316a.c(i10, this.f40424c);
            return new C0610a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            v();
            u();
            gl.d.f39316a.c(i10, this.f40424c);
            r(this.f40423b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            s.h(elements, "elements");
            v();
            u();
            gl.d.f39316a.c(i10, this.f40424c);
            int size = elements.size();
            p(this.f40423b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            u();
            Object[] objArr = this.f40422a;
            int i10 = this.f40423b;
            return gl.j.q(objArr, i10, this.f40424c + i10);
        }
    }

    /* JADX INFO: renamed from: hl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0611b {
        public /* synthetic */ C0611b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0611b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements ListIterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f40431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40434d;

        public c(b list, int i10) {
            s.h(list, "list");
            this.f40431a = list;
            this.f40432b = i10;
            this.f40433c = -1;
            this.f40434d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f40431a).modCount != this.f40434d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f40431a;
            int i10 = this.f40432b;
            this.f40432b = i10 + 1;
            bVar.add(i10, obj);
            this.f40433c = -1;
            this.f40434d = ((AbstractList) this.f40431a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40432b < this.f40431a.f40420b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40432b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f40432b >= this.f40431a.f40420b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f40432b;
            this.f40432b = i10 + 1;
            this.f40433c = i10;
            return this.f40431a.f40419a[this.f40433c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f40432b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f40432b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f40432b = i11;
            this.f40433c = i11;
            return this.f40431a.f40419a[this.f40433c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f40432b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f40433c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f40431a.g(i10);
            this.f40432b = this.f40433c;
            this.f40433c = -1;
            this.f40434d = ((AbstractList) this.f40431a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f40433c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f40431a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f40421c = true;
        f40418e = bVar;
    }

    public b(int i10) {
        this.f40419a = hl.c.d(i10);
    }

    private final boolean A(List list) {
        return hl.c.h(this.f40419a, 0, this.f40420b, list);
    }

    private final void B(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f40419a;
        if (i10 > objArr.length) {
            this.f40419a = hl.c.e(this.f40419a, gl.d.f39316a.e(objArr.length, i10));
        }
    }

    private final void C(int i10) {
        B(this.f40420b + i10);
    }

    private final void D(int i10, int i11) {
        C(i11);
        Object[] objArr = this.f40419a;
        gl.j.k(objArr, objArr, i10 + i11, i10, this.f40420b);
        this.f40420b += i11;
    }

    private final void E() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(int i10) {
        E();
        Object[] objArr = this.f40419a;
        Object obj = objArr[i10];
        gl.j.k(objArr, objArr, i10, i10 + 1, this.f40420b);
        hl.c.f(this.f40419a, this.f40420b - 1);
        this.f40420b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i10, int i11) {
        if (i11 > 0) {
            E();
        }
        Object[] objArr = this.f40419a;
        gl.j.k(objArr, objArr, i10, i10 + i11, this.f40420b);
        Object[] objArr2 = this.f40419a;
        int i12 = this.f40420b;
        hl.c.g(objArr2, i12 - i11, i12);
        this.f40420b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f40419a[i14]) == z10) {
                Object[] objArr = this.f40419a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f40419a;
        gl.j.k(objArr2, objArr2, i10 + i13, i11 + i10, this.f40420b);
        Object[] objArr3 = this.f40419a;
        int i16 = this.f40420b;
        hl.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            E();
        }
        this.f40420b -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i10, Collection collection, int i11) {
        E();
        D(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f40419a[i10 + i12] = it.next();
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f40421c) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10, Object obj) {
        E();
        D(i10, 1);
        this.f40419a[i10] = obj;
    }

    private final void z() {
        if (this.f40421c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        z();
        x(this.f40420b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        s.h(elements, "elements");
        z();
        int size = elements.size();
        w(this.f40420b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        z();
        G(0, this.f40420b);
    }

    @Override // gl.f
    public int d() {
        return this.f40420b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && A((List) obj);
        }
        return true;
    }

    @Override // gl.f
    public Object g(int i10) {
        z();
        gl.d.f39316a.b(i10, this.f40420b);
        return F(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        gl.d.f39316a.b(i10, this.f40420b);
        return this.f40419a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return hl.c.i(this.f40419a, 0, this.f40420b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f40420b; i10++) {
            if (s.c(this.f40419a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f40420b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f40420b - 1; i10 >= 0; i10--) {
            if (s.c(this.f40419a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        z();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        s.h(elements, "elements");
        z();
        return H(0, this.f40420b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        s.h(elements, "elements");
        z();
        return H(0, this.f40420b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        z();
        gl.d.f39316a.b(i10, this.f40420b);
        Object[] objArr = this.f40419a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        gl.d.f39316a.d(i10, i11, this.f40420b);
        return new a(this.f40419a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        s.h(array, "array");
        int length = array.length;
        int i10 = this.f40420b;
        if (length >= i10) {
            gl.j.k(this.f40419a, array, 0, 0, i10);
            return r.f(this.f40420b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f40419a, 0, i10, array.getClass());
        s.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return hl.c.j(this.f40419a, 0, this.f40420b, this);
    }

    public final List y() {
        z();
        this.f40421c = true;
        return this.f40420b > 0 ? this : f40418e;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        gl.d.f39316a.c(i10, this.f40420b);
        return new c(this, i10);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        z();
        gl.d.f39316a.c(i10, this.f40420b);
        x(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        s.h(elements, "elements");
        z();
        gl.d.f39316a.c(i10, this.f40420b);
        int size = elements.size();
        w(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return gl.j.q(this.f40419a, 0, this.f40420b);
    }
}
