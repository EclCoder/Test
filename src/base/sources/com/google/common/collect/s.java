package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class s extends w implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Comparator f21864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient NavigableSet f21865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Set f21866c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends s0.d {
        a() {
        }

        @Override // com.google.common.collect.s0.d
        r0 a() {
            return s.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return s.this.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.o().entrySet().size();
        }
    }

    s() {
    }

    @Override // com.google.common.collect.k1, com.google.common.collect.i1
    public Comparator comparator() {
        Comparator comparator = this.f21864a;
        if (comparator != null) {
            return comparator;
        }
        w0 w0VarI = w0.b(o().comparator()).i();
        this.f21864a = w0VarI;
        return w0VarI;
    }

    @Override // com.google.common.collect.k1
    public k1 d0(Object obj, j jVar) {
        return o().i0(obj, jVar).t();
    }

    @Override // com.google.common.collect.r0
    public Set entrySet() {
        Set set = this.f21866c;
        if (set != null) {
            return set;
        }
        Set setM = m();
        this.f21866c = setM;
        return setM;
    }

    @Override // com.google.common.collect.k1
    public r0.a firstEntry() {
        return o().lastEntry();
    }

    @Override // com.google.common.collect.k1
    public k1 i(Object obj, j jVar, Object obj2, j jVar2) {
        return o().i(obj2, jVar2, obj, jVar).t();
    }

    @Override // com.google.common.collect.k1
    public k1 i0(Object obj, j jVar) {
        return o().d0(obj, jVar).t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public r0 f() {
        return o();
    }

    @Override // com.google.common.collect.k1
    public r0.a lastEntry() {
        return o().firstEntry();
    }

    Set m() {
        return new a();
    }

    abstract Iterator n();

    abstract k1 o();

    @Override // com.google.common.collect.k1
    public r0.a pollFirstEntry() {
        return o().pollLastEntry();
    }

    @Override // com.google.common.collect.k1
    public r0.a pollLastEntry() {
        return o().pollFirstEntry();
    }

    @Override // com.google.common.collect.k1
    public k1 t() {
        return o();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return g();
    }

    @Override // com.google.common.collect.x
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.r0
    public NavigableSet l() {
        NavigableSet navigableSet = this.f21865b;
        if (navigableSet != null) {
            return navigableSet;
        }
        l1.b bVar = new l1.b(this);
        this.f21865b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.u, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return h(objArr);
    }
}
