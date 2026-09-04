package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class f implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection f21727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f21728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f21729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map f21730d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends q0.b {
        a() {
        }

        @Override // com.google.common.collect.q0.b
        o0 a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AbstractCollection {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    public boolean a(Object obj) {
        Iterator it = g().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.o0
    public Collection d() {
        Collection collection = this.f21727a;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ = j();
        this.f21727a = collectionJ;
        return collectionJ;
    }

    public boolean equals(Object obj) {
        return q0.a(this, obj);
    }

    @Override // com.google.common.collect.o0
    public Map g() {
        Map map = this.f21730d;
        if (map != null) {
            return map;
        }
        Map mapI = i();
        this.f21730d = mapI;
        return mapI;
    }

    @Override // com.google.common.collect.o0
    public boolean h(Object obj, Object obj2) {
        Collection collection = (Collection) g().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public int hashCode() {
        return g().hashCode();
    }

    abstract Map i();

    abstract Collection j();

    abstract Set k();

    @Override // com.google.common.collect.o0
    public Set keySet() {
        Set set = this.f21728b;
        if (set != null) {
            return set;
        }
        Set setK = k();
        this.f21728b = setK;
        return setK;
    }

    abstract Collection l();

    abstract Iterator m();

    abstract Iterator n();

    @Override // com.google.common.collect.o0
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) g().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return g().toString();
    }

    @Override // com.google.common.collect.o0
    public Collection values() {
        Collection collection = this.f21729c;
        if (collection != null) {
            return collection;
        }
        Collection collectionL = l();
        this.f21729c = collectionL;
        return collectionL;
    }
}
