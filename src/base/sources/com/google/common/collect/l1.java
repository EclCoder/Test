package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class l1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends s0.c implements SortedSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1 f21793a;

        a(k1 k1Var) {
            this.f21793a = k1Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.s0.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k1 a() {
            return this.f21793a;
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return l1.d(a().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return a().d0(obj, j.OPEN).l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return s0.d(a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Object last() {
            return l1.d(a().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return a().i(obj, j.CLOSED, obj2, j.OPEN).l();
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return a().i0(obj, j.CLOSED).l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends a implements NavigableSet {
        b(k1 k1Var) {
            super(k1Var);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return l1.c(a().i0(obj, j.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new b(a().t());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return l1.c(a().d0(obj, j.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return new b(a().d0(obj, j.e(z10)));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return l1.c(a().i0(obj, j.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return l1.c(a().d0(obj, j.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return l1.c(a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return l1.c(a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new b(a().i(obj, j.e(z10), obj2, j.e(z11)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return new b(a().i0(obj, j.e(z10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object c(r0.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object d(r0.a aVar) {
        if (aVar != null) {
            return aVar.d();
        }
        throw new NoSuchElementException();
    }
}
