package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends i implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient e0 f21733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient int f21734f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f21735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21736b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator f21737c = j0.f();

        a() {
            this.f21735a = f0.this.f21733e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f21737c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f21735a.next();
                this.f21736b = entry.getKey();
                this.f21737c = ((a0) entry.getValue()).iterator();
            }
            Object obj = this.f21736b;
            Objects.requireNonNull(obj);
            return n0.d(obj, this.f21737c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21737c.hasNext() || this.f21735a.hasNext();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f21739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator f21740b = j0.f();

        b() {
            this.f21739a = f0.this.f21733e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21740b.hasNext() || this.f21739a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21740b.hasNext()) {
                this.f21740b = ((a0) this.f21739a.next()).iterator();
            }
            return this.f21740b.next();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f21742a = x0.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator f21743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator f21744c;

        public f0 a() {
            Collection collectionEntrySet = this.f21742a.entrySet();
            Comparator comparator = this.f21743b;
            if (comparator != null) {
                collectionEntrySet = w0.b(comparator).g().c(collectionEntrySet);
            }
            return d0.w(collectionEntrySet, this.f21744c);
        }

        Collection b() {
            return new ArrayList();
        }

        public c c(Object obj, Object obj2) {
            l.a(obj, obj2);
            Collection collection = (Collection) this.f21742a.get(obj);
            if (collection == null) {
                Map map = this.f21742a;
                Collection collectionB = b();
                map.put(obj, collectionB);
                collection = collectionB;
            }
            collection.add(obj2);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends a0 {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f0 f21745b;

        d(f0 f0Var) {
            this.f21745b = f0Var;
        }

        @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f21745b.h(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: n */
        public p1 iterator() {
            return this.f21745b.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f21745b.size();
        }

        @Override // com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e1.b f21746a = e1.a(f0.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e1.b f21747b = e1.a(f0.class, "size");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f extends a0 {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient f0 f21748b;

        f(f0 f0Var) {
            this.f21748b = f0Var;
        }

        @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f21748b.a(obj);
        }

        @Override // com.google.common.collect.a0
        int e(Object[] objArr, int i10) {
            p1 it = this.f21748b.f21733e.values().iterator();
            while (it.hasNext()) {
                i10 = ((a0) it.next()).e(objArr, i10);
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: n */
        public p1 iterator() {
            return this.f21748b.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f21748b.size();
        }

        @Override // com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    f0(e0 e0Var, int i10) {
        this.f21733e = e0Var;
        this.f21734f = i10;
    }

    @Override // com.google.common.collect.f
    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // com.google.common.collect.o0
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    public /* bridge */ /* synthetic */ boolean h(Object obj, Object obj2) {
        return super.h(obj, obj2);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.f
    Map i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.f
    Set k() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e0 g() {
        return this.f21733e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0 j() {
        return new d(this);
    }

    @Override // com.google.common.collect.o0
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a0 l() {
        return new f(this);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a0 d() {
        return (a0) super.d();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p1 m() {
        return new a();
    }

    @Override // com.google.common.collect.o0
    public int size() {
        return this.f21734f;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public g0 keySet() {
        return this.f21733e.keySet();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public p1 n() {
        return new b();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a0 values() {
        return (a0) super.values();
    }
}
