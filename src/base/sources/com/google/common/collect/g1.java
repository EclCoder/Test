package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f21756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f21757b;

        /* JADX INFO: renamed from: com.google.common.collect.g1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0323a extends com.google.common.collect.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator f21758c;

            C0323a() {
                this.f21758c = a.this.f21756a.iterator();
            }

            @Override // com.google.common.collect.b
            protected Object a() {
                while (this.f21758c.hasNext()) {
                    Object next = this.f21758c.next();
                    if (a.this.f21757b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f21756a = set;
            this.f21757b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 iterator() {
            return new C0323a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f21756a.contains(obj) && this.f21757b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f21756a.containsAll(collection) && this.f21757b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f21757b, this.f21756a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f21756a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f21757b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends m.a implements Set {
        b(Set set, sc.q qVar) {
            super(set, qVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return g1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g1.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends b implements SortedSet {
        c(SortedSet sortedSet, sc.q qVar) {
            super(sortedSet, qVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f21794a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return j0.j(this.f21794a.iterator(), this.f21795b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new c(((SortedSet) this.f21794a).headSet(obj), this.f21795b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f21794a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f21795b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new c(((SortedSet) this.f21794a).subSet(obj, obj2), this.f21795b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new c(((SortedSet) this.f21794a).tailSet(obj), this.f21795b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return g1.j(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) sc.p.o(collection));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class e extends AbstractSet {
        /* synthetic */ e(f1 f1Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, sc.q qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) sc.p.o(set), (sc.q) sc.p.o(qVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f21794a, sc.r.b(bVar.f21795b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, sc.q qVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) sc.p.o(sortedSet), (sc.q) sc.p.o(qVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f21794a, sc.r.b(bVar.f21795b, qVar));
    }

    static int d(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static e e(Set set, Set set2) {
        sc.p.p(set, "set1");
        sc.p.p(set2, "set2");
        return new a(set, set2);
    }

    public static Set f() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static HashSet g() {
        return new HashSet();
    }

    public static HashSet h(int i10) {
        return new HashSet(n0.a(i10));
    }

    public static Set i() {
        return Collections.newSetFromMap(n0.h());
    }

    static boolean j(Set set, Collection collection) {
        sc.p.o(collection);
        if (collection instanceof r0) {
            collection = ((r0) collection).l();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? k(set, collection.iterator()) : j0.q(set.iterator(), collection);
    }

    static boolean k(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
