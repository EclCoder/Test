package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25222b;

    public Lk(String str, Map map) {
        this.f25221a = str;
        this.f25222b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lk)) {
            return false;
        }
        Lk lk2 = (Lk) obj;
        return kotlin.jvm.internal.s.c(this.f25221a, lk2.f25221a) && kotlin.jvm.internal.s.c(this.f25222b, lk2.f25222b);
    }

    public final int hashCode() {
        String str = this.f25221a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f25222b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f25221a + ", extras=" + this.f25222b + ")";
    }
}
