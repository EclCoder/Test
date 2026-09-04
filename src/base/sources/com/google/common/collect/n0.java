package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m1 {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.m1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class b implements sc.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21820a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21821b = new C0324b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f21822c = d();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // sc.g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.n0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum C0324b extends b {
            C0324b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // sc.g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ b[] d() {
            return new b[]{f21820a, f21821b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f21822c.clone();
        }

        /* synthetic */ b(String str, int i10, m0 m0Var) {
            this(str, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class c extends g1.d {
        c() {
        }

        abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.google.common.collect.g1.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) sc.p.o(collection));
            } catch (UnsupportedOperationException unused) {
                return g1.k(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.g1.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) sc.p.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetH = g1.h(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetH.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetH);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends g1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f21823a;

        d(Map map) {
            this.f21823a = (Map) sc.p.o(map);
        }

        Map a() {
            return this.f21823a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f21824a;

        e(Map map) {
            this.f21824a = (Map) sc.p.o(map);
        }

        final Map a() {
            return this.f21824a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return n0.n(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (sc.l.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) sc.p.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = g1.g();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetG.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) sc.p.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = g1.g();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetG.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class f extends AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set f21825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection f21826b;

        f() {
        }

        abstract Set a();

        Collection c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f21825a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f21825a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f21826b;
            if (collection != null) {
                return collection;
            }
            Collection collectionC = c();
            this.f21826b = collectionC;
            return collectionC;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            l.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map map, Object obj) {
        return j0.d(n(map.entrySet().iterator()), obj);
    }

    static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new b0(obj, obj2);
    }

    static sc.g e() {
        return b.f21820a;
    }

    public static HashMap f(Map map) {
        return new HashMap(map);
    }

    public static HashMap g(int i10) {
        return new HashMap(a(i10));
    }

    public static IdentityHashMap h() {
        return new IdentityHashMap();
    }

    static boolean i(Map map, Object obj) {
        sc.p.o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object j(Map map, Object obj) {
        sc.p.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object k(Map map, Object obj) {
        sc.p.o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String l(Map map) {
        StringBuilder sbB = m.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    static sc.g m() {
        return b.f21821b;
    }

    static Iterator n(Iterator it) {
        return new a(it);
    }
}
