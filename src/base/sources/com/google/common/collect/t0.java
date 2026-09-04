package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class t0 extends w0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t0 f21877a = new t0();
    private static final long serialVersionUID = 0;

    private t0() {
    }

    private Object readResolve() {
        return f21877a;
    }

    @Override // com.google.common.collect.w0
    public w0 i() {
        return c1.f21678a;
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        sc.p.o(comparable);
        sc.p.o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
