package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k extends w0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sc.g f21781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w0 f21782b;

    k(sc.g gVar, w0 w0Var) {
        this.f21781a = (sc.g) sc.p.o(gVar);
        this.f21782b = (w0) sc.p.o(w0Var);
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f21782b.compare(this.f21781a.apply(obj), this.f21781a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f21781a.equals(kVar.f21781a) && this.f21782b.equals(kVar.f21782b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return sc.l.b(this.f21781a, this.f21782b);
    }

    public String toString() {
        return this.f21782b + ".onResultOf(" + this.f21781a + ")";
    }
}
