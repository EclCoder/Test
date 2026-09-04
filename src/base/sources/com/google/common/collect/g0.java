package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 extends a0 implements Set {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c0 f21752b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends a0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f21753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21754e;

        public a() {
            super(4);
        }

        private void l(Object obj) {
            Objects.requireNonNull(this.f21753d);
            int length = this.f21753d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = z.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f21753d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f21754e += iHashCode;
                    super.e(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.a0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            sc.p.o(obj);
            if (this.f21753d != null && g0.r(this.f21650b) <= this.f21753d.length) {
                l(obj);
                return this;
            }
            this.f21753d = null;
            super.e(obj);
            return this;
        }

        public a j(Object... objArr) {
            if (this.f21753d == null) {
                super.f(objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public a k(Iterable iterable) {
            sc.p.o(iterable);
            if (this.f21753d == null) {
                super.b(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public g0 m() {
            g0 g0VarU;
            int i10 = this.f21650b;
            if (i10 == 0) {
                return g0.z();
            }
            if (i10 == 1) {
                Object obj = this.f21649a[0];
                Objects.requireNonNull(obj);
                return g0.A(obj);
            }
            if (this.f21753d == null || g0.r(i10) != this.f21753d.length) {
                g0VarU = g0.u(this.f21650b, this.f21649a);
                this.f21650b = g0VarU.size();
            } else {
                Object[] objArrCopyOf = g0.F(this.f21650b, this.f21649a.length) ? Arrays.copyOf(this.f21649a, this.f21650b) : this.f21649a;
                int i11 = this.f21754e;
                Object[] objArr = this.f21753d;
                g0VarU = new a1(objArrCopyOf, i11, objArr, objArr.length - 1, this.f21650b);
            }
            this.f21651c = true;
            this.f21753d = null;
            return g0VarU;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f21755a;

        b(Object[] objArr) {
            this.f21755a = objArr;
        }

        Object readResolve() {
            return g0.w(this.f21755a);
        }
    }

    g0() {
    }

    public static g0 A(Object obj) {
        return new h1(obj);
    }

    public static g0 B(Object obj, Object obj2) {
        return u(2, obj, obj2);
    }

    public static g0 C(Object obj, Object obj2, Object obj3) {
        return u(3, obj, obj2, obj3);
    }

    public static g0 D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return u(5, obj, obj2, obj3, obj4, obj5);
    }

    public static g0 E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        sc.p.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return u(length, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean F(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int r(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            sc.p.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 u(int i10, Object... objArr) {
        if (i10 == 0) {
            return z();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return A(obj);
        }
        int iR = r(i10);
        Object[] objArr2 = new Object[iR];
        int i11 = iR - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = v0.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = z.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new h1(obj3);
        }
        if (r(i13) < iR / 2) {
            return u(i13, objArr);
        }
        if (F(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new a1(objArr, i12, objArr2, i11, i13);
    }

    public static g0 v(Collection collection) {
        if ((collection instanceof g0) && !(collection instanceof SortedSet)) {
            g0 g0Var = (g0) collection;
            if (!g0Var.m()) {
                return g0Var;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    public static g0 w(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? u(objArr.length, (Object[]) objArr.clone()) : A(objArr[0]);
        }
        return z();
    }

    public static g0 z() {
        return a1.f21653i;
    }

    @Override // com.google.common.collect.a0
    public c0 d() {
        c0 c0Var = this.f21752b;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarX = x();
        this.f21752b = c0VarX;
        return c0VarX;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g0) && y() && ((g0) obj).y() && hashCode() != obj.hashCode()) {
            return false;
        }
        return g1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g1.d(this);
    }

    @Override // com.google.common.collect.a0
    /* JADX INFO: renamed from: n */
    public abstract p1 iterator();

    @Override // com.google.common.collect.a0
    Object writeReplace() {
        return new b(toArray());
    }

    c0 x() {
        return c0.o(toArray());
    }

    boolean y() {
        return false;
    }
}
