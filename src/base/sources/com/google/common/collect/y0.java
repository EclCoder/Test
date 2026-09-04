package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class y0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final c0 f21885e = new y0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f21886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f21887d;

    y0(Object[] objArr, int i10) {
        this.f21886c = objArr;
        this.f21887d = i10;
    }

    @Override // com.google.common.collect.c0, com.google.common.collect.a0
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f21886c, 0, objArr, i10, this.f21887d);
        return i10 + this.f21887d;
    }

    @Override // com.google.common.collect.a0
    Object[] g() {
        return this.f21886c;
    }

    @Override // java.util.List
    public Object get(int i10) {
        sc.p.m(i10, this.f21887d);
        Object obj = this.f21886c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.a0
    int h() {
        return this.f21887d;
    }

    @Override // com.google.common.collect.a0
    int k() {
        return 0;
    }

    @Override // com.google.common.collect.a0
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21887d;
    }

    @Override // com.google.common.collect.c0, com.google.common.collect.a0
    Object writeReplace() {
        return super.writeReplace();
    }
}
