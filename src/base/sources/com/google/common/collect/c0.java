package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends a0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q1 f21671b = new b(y0.f21885e, 0);
    private static final long serialVersionUID = -889275714;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends a0.a {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.a0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.e(obj);
            return this;
        }

        public a j(Object... objArr) {
            super.f(objArr);
            return this;
        }

        public a k(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public a l(Iterator it) {
            super.c(it);
            return this;
        }

        public c0 m() {
            this.f21651c = true;
            return c0.p(this.f21649a, this.f21650b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends com.google.common.collect.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0 f21672c;

        b(c0 c0Var, int i10) {
            super(c0Var.size(), i10);
            this.f21672c = c0Var;
        }

        @Override // com.google.common.collect.a
        protected Object a(int i10) {
            return this.f21672c.get(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient c0 f21673c;

        c(c0 c0Var) {
            this.f21673c = c0Var;
        }

        private int N(int i10) {
            return (size() - 1) - i10;
        }

        private int O(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.c0
        public c0 J() {
            return this.f21673c;
        }

        @Override // com.google.common.collect.c0, java.util.List
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c0 subList(int i10, int i11) {
            sc.p.u(i10, i11, size());
            return this.f21673c.subList(O(i11), O(i10)).J();
        }

        @Override // com.google.common.collect.c0, com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f21673c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i10) {
            sc.p.m(i10, size());
            return this.f21673c.get(N(i10));
        }

        @Override // com.google.common.collect.c0, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f21673c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return N(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.c0, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f21673c.indexOf(obj);
            if (iIndexOf >= 0) {
                return N(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.c0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.a0
        boolean m() {
            return this.f21673c.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21673c.size();
        }

        @Override // com.google.common.collect.c0, com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.c0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f21674a;

        d(Object[] objArr) {
            this.f21674a = objArr;
        }

        Object readResolve() {
            return c0.z(this.f21674a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f21675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f21676d;

        e(int i10, int i11) {
            this.f21675c = i10;
            this.f21676d = i11;
        }

        @Override // com.google.common.collect.c0, java.util.List
        /* JADX INFO: renamed from: L */
        public c0 subList(int i10, int i11) {
            sc.p.u(i10, i11, this.f21676d);
            c0 c0Var = c0.this;
            int i12 = this.f21675c;
            return c0Var.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.a0
        Object[] g() {
            return c0.this.g();
        }

        @Override // java.util.List
        public Object get(int i10) {
            sc.p.m(i10, this.f21676d);
            return c0.this.get(i10 + this.f21675c);
        }

        @Override // com.google.common.collect.a0
        int h() {
            return c0.this.k() + this.f21675c + this.f21676d;
        }

        @Override // com.google.common.collect.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.a0
        int k() {
            return c0.this.k() + this.f21675c;
        }

        @Override // com.google.common.collect.c0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.a0
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21676d;
        }

        @Override // com.google.common.collect.c0, com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.c0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    c0() {
    }

    public static c0 C() {
        return y0.f21885e;
    }

    public static c0 D(Object obj) {
        return v(obj);
    }

    public static c0 E(Object obj, Object obj2) {
        return v(obj, obj2);
    }

    public static c0 F(Object obj, Object obj2, Object obj3) {
        return v(obj, obj2, obj3);
    }

    public static c0 G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v(obj, obj2, obj3, obj4, obj5);
    }

    public static c0 H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return v(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static c0 I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        sc.p.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return v(objArr2);
    }

    public static c0 K(Comparator comparator, Iterable iterable) {
        sc.p.o(comparator);
        Object[] objArrK = i0.k(iterable);
        v0.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return o(objArrK);
    }

    static c0 o(Object[] objArr) {
        return p(objArr, objArr.length);
    }

    static c0 p(Object[] objArr, int i10) {
        return i10 == 0 ? C() : new y0(objArr, i10);
    }

    public static a r() {
        return new a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static a u(int i10) {
        l.b(i10, "expectedSize");
        return new a(i10);
    }

    private static c0 v(Object... objArr) {
        return o(v0.b(objArr));
    }

    public static c0 w(Iterable iterable) {
        sc.p.o(iterable);
        return iterable instanceof Collection ? x((Collection) iterable) : y(iterable.iterator());
    }

    public static c0 x(Collection collection) {
        if (!(collection instanceof a0)) {
            return v(collection.toArray());
        }
        c0 c0VarD = ((a0) collection).d();
        return c0VarD.m() ? o(c0VarD.toArray()) : c0VarD;
    }

    public static c0 y(Iterator it) {
        if (!it.hasNext()) {
            return C();
        }
        Object next = it.next();
        return !it.hasNext() ? D(next) : new a().a(next).l(it).m();
    }

    public static c0 z(Object[] objArr) {
        return objArr.length == 0 ? C() : v((Object[]) objArr.clone());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public q1 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public q1 listIterator(int i10) {
        sc.p.s(i10, size());
        return isEmpty() ? f21671b : new b(this, i10);
    }

    public c0 J() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: L */
    public c0 subList(int i10, int i11) {
        sc.p.u(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C() : M(i10, i11);
    }

    c0 M(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.a0
    int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return l0.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return l0.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return l0.f(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public p1 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a0
    Object writeReplace() {
        return new d(toArray());
    }

    @Override // com.google.common.collect.a0
    public final c0 d() {
        return this;
    }
}
