package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a1 extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f21652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a1 f21653i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f21654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f21655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f21656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f21657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f21658g;

    static {
        Object[] objArr = new Object[0];
        f21652h = objArr;
        f21653i = new a1(objArr, 0, objArr, 0, 0);
    }

    a1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f21654c = objArr;
        this.f21655d = i10;
        this.f21656e = objArr2;
        this.f21657f = i11;
        this.f21658g = i12;
    }

    @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f21656e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = z.c(obj);
        while (true) {
            int i10 = iC & this.f21657f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // com.google.common.collect.a0
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f21654c, 0, objArr, i10, this.f21658g);
        return i10 + this.f21658g;
    }

    @Override // com.google.common.collect.a0
    Object[] g() {
        return this.f21654c;
    }

    @Override // com.google.common.collect.a0
    int h() {
        return this.f21658g;
    }

    @Override // com.google.common.collect.g0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f21655d;
    }

    @Override // com.google.common.collect.a0
    int k() {
        return 0;
    }

    @Override // com.google.common.collect.a0
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public p1 iterator() {
        return d().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21658g;
    }

    @Override // com.google.common.collect.g0, com.google.common.collect.a0
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.g0
    c0 x() {
        return c0.p(this.f21654c, this.f21658g);
    }

    @Override // com.google.common.collect.g0
    boolean y() {
        return true;
    }
}
