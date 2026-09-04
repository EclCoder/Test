package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h1 extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f21768c;

    h1(Object obj) {
        this.f21768c = sc.p.o(obj);
    }

    @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f21768c.equals(obj);
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    public c0 d() {
        return c0.D(this.f21768c);
    }

    @Override // com.google.common.collect.a0
    int e(Object[] objArr, int i10) {
        objArr[i10] = this.f21768c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.g0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21768c.hashCode();
    }

    @Override // com.google.common.collect.a0
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public p1 iterator() {
        return j0.s(this.f21768c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f21768c.toString() + ']';
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    Object writeReplace() {
        return super.writeReplace();
    }
}
