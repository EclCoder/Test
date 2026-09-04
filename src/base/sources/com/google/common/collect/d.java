package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class d extends com.google.common.collect.f implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map f21679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f21680f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AbstractC0321d {
        b(d dVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.AbstractC0321d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return n0.d(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends n0.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient Map f21681c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends n0.c {
            a() {
            }

            @Override // com.google.common.collect.n0.c
            Map a() {
                return c.this;
            }

            @Override // com.google.common.collect.n0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return m.c(c.this.f21681c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.B(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator f21684a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Collection f21685b;

            b() {
                this.f21684a = c.this.f21681c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f21684a.next();
                this.f21685b = (Collection) entry.getValue();
                return c.this.h(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21684a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                sc.p.w(this.f21685b != null, "no calls to next() since the last call to remove()");
                this.f21684a.remove();
                d.t(d.this, this.f21685b.size());
                this.f21685b.clear();
                this.f21685b = null;
            }
        }

        c(Map map) {
            this.f21681c = map;
        }

        @Override // com.google.common.collect.n0.f
        protected Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f21681c == d.this.f21679e) {
                d.this.clear();
            } else {
                j0.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return n0.i(this.f21681c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f21681c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) n0.j(this.f21681c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.E(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f21681c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionW = d.this.w();
            collectionW.addAll(collection);
            d.t(d.this, collection.size());
            collection.clear();
            return collectionW;
        }

        Map.Entry h(Map.Entry entry) {
            Object key = entry.getKey();
            return n0.d(key, d.this.E(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f21681c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21681c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f21681c.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class AbstractC0321d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f21687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21688b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection f21689c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator f21690d = j0.h();

        AbstractC0321d() {
            this.f21687a = d.this.f21679e.entrySet().iterator();
        }

        abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21687a.hasNext() || this.f21690d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21690d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f21687a.next();
                this.f21688b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f21689c = collection;
                this.f21690d = collection.iterator();
            }
            return a(u0.a(this.f21688b), this.f21690d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21690d.remove();
            Collection collection = this.f21689c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f21687a.remove();
            }
            d.r(d.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends n0.d {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Map.Entry f21693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f21694b;

            a(Iterator it) {
                this.f21694b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21694b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f21694b.next();
                this.f21693a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                sc.p.w(this.f21693a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f21693a.getValue();
                this.f21694b.remove();
                d.t(d.this, collection.size());
                collection.clear();
                this.f21693a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j0.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                d.t(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = k().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return h(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return k().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return d.this.new f(k().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = k().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return h(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = k().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return h(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return k().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = k().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return h(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return k().higherKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet i() {
            return d.this.new g(k());
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = k().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return h(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = k().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return h(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return k().lowerKey(obj);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.d.i, com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return j();
        }

        Map.Entry o(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionW = d.this.w();
            collectionW.addAll((Collection) entry.getValue());
            it.remove();
            return n0.d(entry.getKey(), d.this.D(collectionW));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap k() {
            return (NavigableMap) super.k();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return o(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return o(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return d.this.new f(k().headMap(obj, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return d.this.new f(k().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return d.this.new f(k().tailMap(obj, z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return d.this.new g(b().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return j0.p(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return j0.p(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return d.this.new g(b().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return d.this.new g(b().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return d.this.new g(b().tailMap(obj, z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h extends l implements RandomAccess {
        h(d dVar, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i extends c implements SortedMap {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        SortedSet f21698e;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return k().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return d.this.new i(k().headMap(obj));
        }

        SortedSet i() {
            return d.this.new j(k());
        }

        @Override // com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: j */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f21698e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetI = i();
            this.f21698e = sortedSetI;
            return sortedSetI;
        }

        SortedMap k() {
            return (SortedMap) this.f21681c;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return k().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return d.this.new i(k().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return d.this.new i(k().tailMap(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return d.this.new j(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return d.this.new j(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return d.this.new j(b().tailMap(obj));
        }
    }

    protected d(Map map) {
        sc.p.d(map.isEmpty());
        this.f21679e = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator A(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj) {
        Collection collection = (Collection) n0.k(this.f21679e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f21680f -= size;
        }
    }

    static /* synthetic */ int q(d dVar) {
        int i10 = dVar.f21680f;
        dVar.f21680f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int r(d dVar) {
        int i10 = dVar.f21680f;
        dVar.f21680f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int s(d dVar, int i10) {
        int i11 = dVar.f21680f + i10;
        dVar.f21680f = i11;
        return i11;
    }

    static /* synthetic */ int t(d dVar, int i10) {
        int i11 = dVar.f21680f - i10;
        dVar.f21680f = i11;
        return i11;
    }

    final void C(Map map) {
        this.f21679e = map;
        this.f21680f = 0;
        for (Collection collection : map.values()) {
            sc.p.d(!collection.isEmpty());
            this.f21680f += collection.size();
        }
    }

    abstract Collection D(Collection collection);

    abstract Collection E(Object obj, Collection collection);

    final List F(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, kVar) : new l(obj, list, kVar);
    }

    @Override // com.google.common.collect.o0
    public void clear() {
        Iterator it = this.f21679e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f21679e.clear();
        this.f21680f = 0;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    public Collection d() {
        return super.d();
    }

    @Override // com.google.common.collect.o0
    public Collection get(Object obj) {
        Collection collectionX = (Collection) this.f21679e.get(obj);
        if (collectionX == null) {
            collectionX = x(obj);
        }
        return E(obj, collectionX);
    }

    @Override // com.google.common.collect.f
    Collection j() {
        return new com.google.common.collect.f.a();
    }

    @Override // com.google.common.collect.f
    Collection l() {
        return new com.google.common.collect.f.b();
    }

    @Override // com.google.common.collect.f
    Iterator m() {
        return new b(this);
    }

    @Override // com.google.common.collect.f
    Iterator n() {
        return new a(this);
    }

    @Override // com.google.common.collect.o0
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f21679e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f21680f++;
            return true;
        }
        Collection collectionX = x(obj);
        if (!collectionX.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f21680f++;
        this.f21679e.put(obj, collectionX);
        return true;
    }

    @Override // com.google.common.collect.o0
    public int size() {
        return this.f21680f;
    }

    Map v() {
        return this.f21679e;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    public Collection values() {
        return super.values();
    }

    abstract Collection w();

    Collection x(Object obj) {
        return w();
    }

    final Map y() {
        Map map = this.f21679e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f21679e);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f21679e) : new c(this.f21679e);
    }

    final Set z() {
        Map map = this.f21679e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f21679e);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f21679e) : new e(this.f21679e);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f21701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection f21702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final k f21703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f21704d;

        k(Object obj, Collection collection, k kVar) {
            this.f21701a = obj;
            this.f21702b = collection;
            this.f21703c = kVar;
            this.f21704d = kVar == null ? null : kVar.d();
        }

        void a() {
            k kVar = this.f21703c;
            if (kVar != null) {
                kVar.a();
            } else {
                d.this.f21679e.put(this.f21701a, this.f21702b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            f();
            boolean zIsEmpty = this.f21702b.isEmpty();
            boolean zAdd = this.f21702b.add(obj);
            if (zAdd) {
                d.q(d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f21702b.addAll(collection);
            if (zAddAll) {
                d.s(d.this, this.f21702b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        k b() {
            return this.f21703c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f21702b.clear();
            d.t(d.this, size);
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f21702b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            f();
            return this.f21702b.containsAll(collection);
        }

        Collection d() {
            return this.f21702b;
        }

        Object e() {
            return this.f21701a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f21702b.equals(obj);
        }

        void f() {
            Collection collection;
            k kVar = this.f21703c;
            if (kVar != null) {
                kVar.f();
                if (this.f21703c.d() != this.f21704d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f21702b.isEmpty() || (collection = (Collection) d.this.f21679e.get(this.f21701a)) == null) {
                    return;
                }
                this.f21702b = collection;
            }
        }

        void g() {
            k kVar = this.f21703c;
            if (kVar != null) {
                kVar.g();
            } else if (this.f21702b.isEmpty()) {
                d.this.f21679e.remove(this.f21701a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f21702b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f21702b.remove(obj);
            if (zRemove) {
                d.r(d.this);
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f21702b.removeAll(collection);
            if (zRemoveAll) {
                d.s(d.this, this.f21702b.size() - size);
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            sc.p.o(collection);
            int size = size();
            boolean zRetainAll = this.f21702b.retainAll(collection);
            if (zRetainAll) {
                d.s(d.this, this.f21702b.size() - size);
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f21702b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f21702b.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator f21706a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection f21707b;

            a() {
                Collection collection = k.this.f21702b;
                this.f21707b = collection;
                this.f21706a = d.A(collection);
            }

            Iterator a() {
                b();
                return this.f21706a;
            }

            void b() {
                k.this.f();
                if (k.this.f21702b != this.f21707b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f21706a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f21706a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f21706a.remove();
                d.r(d.this);
                k.this.g();
            }

            a(Iterator it) {
                this.f21707b = k.this.f21702b;
                this.f21706a = it;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l extends k implements List {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(obj);
                d.q(d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(l.this.h().listIterator(i10));
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            f();
            boolean zIsEmpty = d().isEmpty();
            h().add(i10, obj);
            d.q(d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = h().addAll(i10, collection);
            if (zAddAll) {
                d.s(d.this, d().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            f();
            return h().get(i10);
        }

        List h() {
            return (List) d();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            f();
            Object objRemove = h().remove(i10);
            d.r(d.this);
            g();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            f();
            return h().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            f();
            return d.this.F(e(), h().subList(i10, i11), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            f();
            return new a(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AbstractC0321d {
        a(d dVar) {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0321d
        Object a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
