package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f21712d = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient g0 f21713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient g0 f21714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient a0 f21715c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f21716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f21717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f21719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0322a f21720e;

        /* JADX INFO: renamed from: com.google.common.collect.e0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0322a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f21721a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f21722b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f21723c;

            C0322a(Object obj, Object obj2, Object obj3) {
                this.f21721a = obj;
                this.f21722b = obj2;
                this.f21723c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f21721a + "=" + this.f21722b + " and " + this.f21721a + "=" + this.f21723c);
            }
        }

        public a() {
            this(4);
        }

        private e0 b(boolean z10) {
            Object[] objArrF;
            C0322a c0322a;
            C0322a c0322a2;
            if (z10 && (c0322a2 = this.f21720e) != null) {
                throw c0322a2.a();
            }
            int length = this.f21718c;
            if (this.f21716a == null) {
                objArrF = this.f21717b;
            } else {
                if (this.f21719d) {
                    this.f21717b = Arrays.copyOf(this.f21717b, length * 2);
                }
                objArrF = this.f21717b;
                if (!z10) {
                    objArrF = f(objArrF, this.f21718c);
                    if (objArrF.length < this.f21717b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f21716a);
            }
            this.f21719d = true;
            z0 z0VarY = z0.y(length, objArrF, this);
            if (!z10 || (c0322a = this.f21720e) == null) {
                return z0VarY;
            }
            throw c0322a.a();
        }

        private void e(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f21717b;
            if (i11 > objArr.length) {
                this.f21717b = Arrays.copyOf(objArr, a0.b.d(objArr.length, i11));
                this.f21719d = false;
            }
        }

        private Object[] f(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void k(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, w0.b(comparator).h(n0.m()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public e0 a() {
            return d();
        }

        public e0 c() {
            return b(false);
        }

        public e0 d() {
            return b(true);
        }

        public a g(Object obj, Object obj2) {
            e(this.f21718c + 1);
            l.a(obj, obj2);
            Object[] objArr = this.f21717b;
            int i10 = this.f21718c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f21718c = i10 + 1;
            return this;
        }

        public a h(Map.Entry entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a i(Iterable iterable) {
            if (iterable instanceof Collection) {
                e(this.f21718c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                h((Map.Entry) it.next());
            }
            return this;
        }

        public a j(Map map) {
            return i(map.entrySet());
        }

        a(int i10) {
            this.f21717b = new Object[i10 * 2];
            this.f21718c = 0;
            this.f21719d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f21725b;

        b(e0 e0Var) {
            Object[] objArr = new Object[e0Var.size()];
            Object[] objArr2 = new Object[e0Var.size()];
            p1 it = e0Var.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i10] = entry.getKey();
                objArr2[i10] = entry.getValue();
                i10++;
            }
            this.f21724a = objArr;
            this.f21725b = objArr2;
        }

        final Object d() {
            Object[] objArr = (Object[]) this.f21724a;
            Object[] objArr2 = (Object[]) this.f21725b;
            a aVarE = e(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                aVarE.g(objArr[i10], objArr2[i10]);
            }
            return aVarE.d();
        }

        a e(int i10) {
            return new a(i10);
        }

        final Object readResolve() {
            Object obj = this.f21724a;
            if (!(obj instanceof g0)) {
                return d();
            }
            g0 g0Var = (g0) obj;
            a0 a0Var = (a0) this.f21725b;
            a aVarE = e(g0Var.size());
            p1 it = g0Var.iterator();
            p1 it2 = a0Var.iterator();
            while (it.hasNext()) {
                aVarE.g(it.next(), it2.next());
            }
            return aVarE.d();
        }
    }

    e0() {
    }

    public static a g() {
        return new a();
    }

    public static a h(int i10) {
        l.b(i10, "expectedSize");
        return new a(i10);
    }

    public static e0 i(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static e0 j(Map map) {
        if ((map instanceof e0) && !(map instanceof SortedMap)) {
            e0 e0Var = (e0) map;
            if (!e0Var.o()) {
                return e0Var;
            }
        }
        return i(map.entrySet());
    }

    public static e0 q() {
        return z0.f21888h;
    }

    public static e0 r(Object obj, Object obj2) {
        l.a(obj, obj2);
        return z0.x(1, new Object[]{obj, obj2});
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static e0 s(Object obj, Object obj2, Object obj3, Object obj4) {
        l.a(obj, obj2);
        l.a(obj3, obj4);
        return z0.x(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static e0 t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        l.a(obj, obj2);
        l.a(obj3, obj4);
        l.a(obj5, obj6);
        l.a(obj7, obj8);
        return z0.x(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static e0 u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        l.a(obj, obj2);
        l.a(obj3, obj4);
        l.a(obj5, obj6);
        l.a(obj7, obj8);
        l.a(obj9, obj10);
        return z0.x(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static e0 v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        l.a(obj, obj2);
        l.a(obj3, obj4);
        l.a(obj5, obj6);
        l.a(obj7, obj8);
        l.a(obj9, obj10);
        l.a(obj11, obj12);
        l.a(obj13, obj14);
        return z0.x(7, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14});
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return n0.c(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return g1.d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract g0 k();

    abstract g0 l();

    abstract a0 m();

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g0 entrySet() {
        g0 g0Var = this.f21713a;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0VarK = k();
        this.f21713a = g0VarK;
        return g0VarK;
    }

    abstract boolean o();

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g0 keySet() {
        g0 g0Var = this.f21714b;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0VarL = l();
        this.f21714b = g0VarL;
        return g0VarL;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return n0.l(this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a0 values() {
        a0 a0Var = this.f21715c;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0VarM = m();
        this.f21715c = a0VarM;
        return a0VarM;
    }

    Object writeReplace() {
        return new b(this);
    }
}
