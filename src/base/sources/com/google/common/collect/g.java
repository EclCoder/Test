package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class g extends AbstractCollection implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f21749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f21750b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends s0.d {
        a() {
        }

        @Override // com.google.common.collect.s0.d
        r0 a() {
            return g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return g.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.h();
        }
    }

    g() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.r0
    public final boolean add(Object obj) {
        s(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return s0.b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.r0
    public boolean contains(Object obj) {
        return g0(obj) > 0;
    }

    abstract Set d();

    @Override // com.google.common.collect.r0
    public Set entrySet() {
        Set set = this.f21750b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f21750b = setG;
        return setG;
    }

    @Override // java.util.Collection, com.google.common.collect.r0
    public final boolean equals(Object obj) {
        return s0.e(this, obj);
    }

    Set g() {
        return new a();
    }

    abstract int h();

    @Override // java.util.Collection, com.google.common.collect.r0
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    abstract Iterator k();

    @Override // com.google.common.collect.r0
    public Set l() {
        Set set = this.f21749a;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f21749a = setD;
        return setD;
    }

    @Override // com.google.common.collect.r0
    public abstract int q(Object obj, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.r0
    public final boolean remove(Object obj) {
        return q(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return s0.h(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return s0.i(this, collection);
    }

    @Override // com.google.common.collect.r0
    public abstract int s(Object obj, int i10);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
