package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m1 {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.m1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(r0.a aVar) {
            return aVar.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class b implements r0.a {
        b() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof r0.a) {
                r0.a aVar = (r0.a) obj;
                if (getCount() == aVar.getCount() && sc.l.a(d(), aVar.d())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object objD = d();
            return (objD == null ? 0 : objD.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.r0.a
        public String toString() {
            String strValueOf = String.valueOf(d());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class c extends g1.d {
        c() {
        }

        abstract r0 a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a().q(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().entrySet().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class d extends g1.d {
        d() {
        }

        abstract r0 a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof r0.a) {
                r0.a aVar = (r0.a) obj;
                if (aVar.getCount() > 0 && a().g0(aVar.d()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof r0.a) {
                r0.a aVar = (r0.a) obj;
                Object objD = aVar.d();
                int count = aVar.getCount();
                if (count != 0) {
                    return a().c0(objD, count, 0);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21869b;

        e(Object obj, int i10) {
            this.f21868a = obj;
            this.f21869b = i10;
            l.b(i10, "count");
        }

        @Override // com.google.common.collect.r0.a
        public final Object d() {
            return this.f21868a;
        }

        @Override // com.google.common.collect.r0.a
        public final int getCount() {
            return this.f21869b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0 f21870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f21871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r0.a f21872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21875f;

        f(r0 r0Var, Iterator it) {
            this.f21870a = r0Var;
            this.f21871b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21873d > 0 || this.f21871b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f21873d == 0) {
                r0.a aVar = (r0.a) this.f21871b.next();
                this.f21872c = aVar;
                int count = aVar.getCount();
                this.f21873d = count;
                this.f21874e = count;
            }
            this.f21873d--;
            this.f21875f = true;
            r0.a aVar2 = this.f21872c;
            Objects.requireNonNull(aVar2);
            return aVar2.d();
        }

        @Override // java.util.Iterator
        public void remove() {
            l.c(this.f21875f);
            if (this.f21874e == 1) {
                this.f21871b.remove();
            } else {
                r0 r0Var = this.f21870a;
                r0.a aVar = this.f21872c;
                Objects.requireNonNull(aVar);
                r0Var.remove(aVar.d());
            }
            this.f21874e--;
            this.f21875f = false;
        }
    }

    private static boolean a(r0 r0Var, r0 r0Var2) {
        if (r0Var2.isEmpty()) {
            return false;
        }
        for (r0.a aVar : r0Var2.entrySet()) {
            r0Var.s(aVar.d(), aVar.getCount());
        }
        return true;
    }

    static boolean b(r0 r0Var, Collection collection) {
        sc.p.o(r0Var);
        sc.p.o(collection);
        if (collection instanceof r0) {
            return a(r0Var, c(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return j0.a(r0Var, collection.iterator());
    }

    static r0 c(Iterable iterable) {
        return (r0) iterable;
    }

    static Iterator d(Iterator it) {
        return new a(it);
    }

    static boolean e(r0 r0Var, Object obj) {
        if (obj == r0Var) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var2 = (r0) obj;
            if (r0Var.size() == r0Var2.size() && r0Var.entrySet().size() == r0Var2.entrySet().size()) {
                for (r0.a aVar : r0Var2.entrySet()) {
                    if (r0Var.g0(aVar.d()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static r0.a f(Object obj, int i10) {
        return new e(obj, i10);
    }

    static Iterator g(r0 r0Var) {
        return new f(r0Var, r0Var.entrySet().iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean h(r0 r0Var, Collection collection) {
        if (collection instanceof r0) {
            collection = ((r0) collection).l();
        }
        return r0Var.l().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean i(r0 r0Var, Collection collection) {
        sc.p.o(collection);
        if (collection instanceof r0) {
            collection = ((r0) collection).l();
        }
        return r0Var.l().retainAll(collection);
    }
}
