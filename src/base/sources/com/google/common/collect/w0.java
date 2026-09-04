package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 implements Comparator {
    protected w0() {
    }

    public static w0 b(Comparator comparator) {
        return comparator instanceof w0 ? (w0) comparator : new p(comparator);
    }

    public static w0 d() {
        return t0.f21877a;
    }

    public w0 a(Comparator comparator) {
        return new r(this, (Comparator) sc.p.o(comparator));
    }

    public c0 c(Iterable iterable) {
        return c0.K(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    w0 g() {
        return h(n0.e());
    }

    public w0 h(sc.g gVar) {
        return new k(gVar, this);
    }

    public w0 i() {
        return new d1(this);
    }
}
