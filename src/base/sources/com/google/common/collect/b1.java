package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b1 extends h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b1 f21669f = new b1(c0.C(), w0.d());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient c0 f21670e;

    b1(c0 c0Var, Comparator comparator) {
        super(comparator);
        this.f21670e = c0Var;
    }

    private int b0(Object obj) {
        return Collections.binarySearch(this.f21670e, obj, e0());
    }

    @Override // com.google.common.collect.h0
    h0 H() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f21763c);
        return isEmpty() ? h0.J(comparatorReverseOrder) : new b1(this.f21670e.J(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.h0
    h0 M(Object obj, boolean z10) {
        return Y(0, Z(obj, z10));
    }

    @Override // com.google.common.collect.h0
    h0 R(Object obj, boolean z10, Object obj2, boolean z11) {
        return U(obj, z10).M(obj2, z11);
    }

    @Override // com.google.common.collect.h0
    h0 U(Object obj, boolean z10) {
        return Y(a0(obj, z10), size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public p1 descendingIterator() {
        return this.f21670e.J().iterator();
    }

    b1 Y(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 < i11 ? new b1(this.f21670e.subList(i10, i11), this.f21763c) : h0.J(this.f21763c);
    }

    int Z(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f21670e, sc.p.o(obj), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    int a0(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f21670e, sc.p.o(obj), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iA0 = a0(obj, true);
        if (iA0 == size()) {
            return null;
        }
        return this.f21670e.get(iA0);
    }

    @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (b0(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof r0) {
            collection = ((r0) collection).l();
        }
        if (!j1.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        p1 it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iV = V(next2, next);
                if (iV < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iV == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iV > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    public c0 d() {
        return this.f21670e;
    }

    @Override // com.google.common.collect.a0
    int e(Object[] objArr, int i10) {
        return this.f21670e.e(objArr, i10);
    }

    Comparator e0() {
        return this.f21763c;
    }

    @Override // com.google.common.collect.g0, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!j1.b(this.f21763c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            p1 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || V(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21670e.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int iZ = Z(obj, true) - 1;
        if (iZ == -1) {
            return null;
        }
        return this.f21670e.get(iZ);
    }

    @Override // com.google.common.collect.a0
    Object[] g() {
        return this.f21670e.g();
    }

    @Override // com.google.common.collect.a0
    int h() {
        return this.f21670e.h();
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int iA0 = a0(obj, false);
        if (iA0 == size()) {
            return null;
        }
        return this.f21670e.get(iA0);
    }

    @Override // com.google.common.collect.a0
    int k() {
        return this.f21670e.k();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21670e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int iZ = Z(obj, false) - 1;
        if (iZ == -1) {
            return null;
        }
        return this.f21670e.get(iZ);
    }

    @Override // com.google.common.collect.a0
    boolean m() {
        return this.f21670e.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: n */
    public p1 iterator() {
        return this.f21670e.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21670e.size();
    }

    @Override // com.google.common.collect.h0, com.google.common.collect.g0, com.google.common.collect.a0
    Object writeReplace() {
        return super.writeReplace();
    }
}
