package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class p extends w0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f21852a;

    p(Comparator comparator) {
        this.f21852a = (Comparator) sc.p.o(comparator);
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f21852a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f21852a.equals(((p) obj).f21852a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21852a.hashCode();
    }

    public String toString() {
        return this.f21852a.toString();
    }
}
