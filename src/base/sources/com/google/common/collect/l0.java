package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends b implements RandomAccess {
        a(List list) {
            super(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends AbstractList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f21783a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements ListIterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f21784a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ListIterator f21785b;

            a(ListIterator listIterator) {
                this.f21785b = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                this.f21785b.add(obj);
                this.f21785b.previous();
                this.f21784a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f21785b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f21785b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f21784a = true;
                return this.f21785b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return b.this.e(this.f21785b.nextIndex());
            }

            @Override // java.util.ListIterator
            public Object previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f21784a = true;
                return this.f21785b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                l.c(this.f21784a);
                this.f21785b.remove();
                this.f21784a = false;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                sc.p.v(this.f21784a);
                this.f21785b.set(obj);
            }
        }

        b(List list) {
            this.f21783a = (List) sc.p.o(list);
        }

        private int d(int i10) {
            int size = size();
            sc.p.m(i10, size);
            return (size - 1) - i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e(int i10) {
            int size = size();
            sc.p.s(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            this.f21783a.add(e(i10), obj);
        }

        List b() {
            return this.f21783a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f21783a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f21783a.get(d(i10));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f21783a.listIterator(e(i10)));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            return this.f21783a.remove(d(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            return this.f21783a.set(d(i10), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21783a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            sc.p.u(i10, i11, size());
            return l0.l(this.f21783a.subList(e(i11), e(i10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f21787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final sc.g f21788b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends n1 {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.m1
            Object a(Object obj) {
                return c.this.f21788b.apply(obj);
            }
        }

        c(List list, sc.g gVar) {
            this.f21787a = (List) sc.p.o(list);
            this.f21788b = (sc.g) sc.p.o(gVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f21788b.apply(this.f21787a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f21787a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f21787a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            return this.f21788b.apply(this.f21787a.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f21787a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21787a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends AbstractSequentialList implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f21790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final sc.g f21791b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends n1 {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.m1
            Object a(Object obj) {
                return d.this.f21791b.apply(obj);
            }
        }

        d(List list, sc.g gVar) {
            this.f21790a = (List) sc.p.o(list);
            this.f21791b = (sc.g) sc.p.o(gVar);
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f21790a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f21790a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21790a.size();
        }
    }

    static List a(Iterable iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        l.b(i10, "arraySize");
        return com.google.common.primitives.g.m(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List list, Object obj) {
        if (obj == sc.p.o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return j0.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!sc.l.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (sc.l.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (sc.l.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterable iterable) {
        sc.p.o(iterable);
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : j(iterable.iterator());
    }

    public static ArrayList j(Iterator it) {
        ArrayList arrayListH = h();
        j0.a(arrayListH, it);
        return arrayListH;
    }

    public static ArrayList k(Object... objArr) {
        sc.p.o(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List l(List list) {
        if (list instanceof c0) {
            return ((c0) list).J();
        }
        if (list instanceof b) {
            return ((b) list).b();
        }
        return list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static List m(List list, sc.g gVar) {
        return list instanceof RandomAccess ? new c(list, gVar) : new d(list, gVar);
    }
}
