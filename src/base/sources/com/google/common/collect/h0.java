package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 extends g0 implements NavigableSet, i1 {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Comparator f21763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient h0 f21764d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends g0.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Comparator f21765f;

        public a(Comparator comparator) {
            this.f21765f = (Comparator) sc.p.o(comparator);
        }

        @Override // com.google.common.collect.g0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.g0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a j(Object... objArr) {
            super.j(objArr);
            return this;
        }

        @Override // com.google.common.collect.g0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a k(Iterable iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.g0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public h0 m() {
            h0 h0VarG = h0.G(this.f21765f, this.f21650b, this.f21649a);
            this.f21650b = h0VarG.size();
            this.f21651c = true;
            return h0VarG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator f21766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f21767b;

        public b(Comparator comparator, Object[] objArr) {
            this.f21766a = comparator;
            this.f21767b = objArr;
        }

        Object readResolve() {
            return new a(this.f21766a).j(this.f21767b).m();
        }
    }

    h0(Comparator comparator) {
        this.f21763c = comparator;
    }

    static h0 G(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return J(comparator);
        }
        v0.c(objArr, i10);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new b1(c0.p(objArr, i11), comparator);
    }

    static b1 J(Comparator comparator) {
        return w0.d().equals(comparator) ? b1.f21669f : new b1(c0.C(), comparator);
    }

    public static a N() {
        return new a(w0.d());
    }

    public static h0 O() {
        return b1.f21669f;
    }

    static int W(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract h0 H();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public h0 descendingSet() {
        h0 h0Var = this.f21764d;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarH = H();
        this.f21764d = h0VarH;
        h0VarH.f21764d = this;
        return h0VarH;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public h0 headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public h0 headSet(Object obj, boolean z10) {
        return M(sc.p.o(obj), z10);
    }

    abstract h0 M(Object obj, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public h0 subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public h0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        sc.p.o(obj);
        sc.p.o(obj2);
        sc.p.d(this.f21763c.compare(obj, obj2) <= 0);
        return R(obj, z10, obj2, z11);
    }

    abstract h0 R(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public h0 tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public h0 tailSet(Object obj, boolean z10) {
        return U(sc.p.o(obj), z10);
    }

    abstract h0 U(Object obj, boolean z10);

    int V(Object obj, Object obj2) {
        return W(this.f21763c, obj, obj2);
    }

    @Override // java.util.SortedSet, com.google.common.collect.i1
    public Comparator comparator() {
        return this.f21763c;
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    /* JADX INFO: renamed from: n */
    public abstract p1 iterator();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    Object writeReplace() {
        return new b(this.f21763c, toArray());
    }
}
