package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d1 extends w0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w0 f21711a;

    d1(w0 w0Var) {
        this.f21711a = (w0) sc.p.o(w0Var);
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f21711a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            return this.f21711a.equals(((d1) obj).f21711a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f21711a.hashCode();
    }

    @Override // com.google.common.collect.w0
    public w0 i() {
        return this.f21711a;
    }

    public String toString() {
        return this.f21711a + ".reverse()";
    }
}
