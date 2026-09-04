package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.google.common.collect.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f21773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ sc.q f21774d;

        a(Iterator it, sc.q qVar) {
            this.f21773c = it;
            this.f21774d = qVar;
        }

        @Override // com.google.common.collect.b
        protected Object a() {
            while (this.f21773c.hasNext()) {
                Object next = this.f21773c.next();
                if (this.f21774d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends com.google.common.collect.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final q1 f21775d = new b(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f21776c;

        b(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.f21776c = objArr;
        }

        @Override // com.google.common.collect.a
        protected Object a(int i10) {
            return this.f21776c[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            l.c(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends p1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Object f21779b = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f21780a;

        d(Object obj) {
            this.f21780a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21780a != f21779b;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f21780a;
            Object obj2 = f21779b;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.f21780a = obj2;
            return obj;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        sc.p.o(collection);
        sc.p.o(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, sc.q qVar) {
        return o(it, qVar) != -1;
    }

    static void c(Iterator it) {
        sc.p.o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !sc.l.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static p1 f() {
        return g();
    }

    static q1 g() {
        return b.f21775d;
    }

    static Iterator h() {
        return c.INSTANCE;
    }

    public static p1 i(Iterator it, sc.q qVar) {
        sc.p.o(it);
        sc.p.o(qVar);
        return new a(it, qVar);
    }

    public static Object j(Iterator it, sc.q qVar) {
        sc.p.o(it);
        sc.p.o(qVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (qVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterator it, Object obj) {
        return it.hasNext() ? k(it) : obj;
    }

    public static Object m(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object n(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int o(Iterator it, sc.q qVar) {
        sc.p.p(qVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static Object p(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean q(Iterator it, Collection collection) {
        sc.p.o(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean r(Iterator it, sc.q qVar) {
        sc.p.o(qVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static p1 s(Object obj) {
        return new d(obj);
    }
}
