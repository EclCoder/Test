package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f21648a = new Object[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f21649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f21651c;

        a(int i10) {
            l.b(i10, "initialCapacity");
            this.f21649a = new Object[i10];
            this.f21650b = 0;
        }

        private void h(int i10) {
            Object[] objArr = this.f21649a;
            if (objArr.length < i10) {
                this.f21649a = Arrays.copyOf(objArr, b.d(objArr.length, i10));
                this.f21651c = false;
            } else if (this.f21651c) {
                this.f21649a = (Object[]) objArr.clone();
                this.f21651c = false;
            }
        }

        @Override // com.google.common.collect.a0.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                h(this.f21650b + collection.size());
                if (collection instanceof a0) {
                    this.f21650b = ((a0) collection).e(this.f21649a, this.f21650b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a e(Object obj) {
            sc.p.o(obj);
            h(this.f21650b + 1);
            Object[] objArr = this.f21649a;
            int i10 = this.f21650b;
            this.f21650b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b f(Object... objArr) {
            g(objArr, objArr.length);
            return this;
        }

        final void g(Object[] objArr, int i10) {
            v0.c(objArr, i10);
            h(this.f21650b + i10);
            System.arraycopy(objArr, 0, this.f21649a, this.f21650b, i10);
            this.f21650b += i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {
        b() {
        }

        static int d(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b c(Iterator it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    a0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public c0 d() {
        return isEmpty() ? c0.C() : c0.o(toArray());
    }

    int e(Object[] objArr, int i10) {
        p1 it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    Object[] g() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    abstract boolean m();

    /* JADX INFO: renamed from: n */
    public abstract p1 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f21648a);
    }

    Object writeReplace() {
        return new c0.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        sc.p.o(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return x0.a(objArrG, k(), h(), objArr);
            }
            objArr = v0.e(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        e(objArr, 0);
        return objArr;
    }
}
