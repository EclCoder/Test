package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c1 extends w0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c1 f21678a = new c1();
    private static final long serialVersionUID = 0;

    private c1() {
    }

    private Object readResolve() {
        return f21678a;
    }

    @Override // com.google.common.collect.w0
    public w0 i() {
        return w0.d();
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        sc.p.o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
