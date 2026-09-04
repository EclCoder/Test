package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r extends w0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator[] f21863a;

    r(Comparator comparator, Comparator comparator2) {
        this.f21863a = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.w0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f21863a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return Arrays.equals(this.f21863a, ((r) obj).f21863a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21863a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f21863a) + ")";
    }
}
