package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Re extends Ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gk f25642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ni f25644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25645f;

    public Re(String url, HashMap map, Gk gk2, Map map2, Ni ni2, boolean z10, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        gk2 = (i10 & 4) != 0 ? null : gk2;
        map2 = (i10 & 8) != 0 ? null : map2;
        ni2 = (i10 & 16) != 0 ? null : ni2;
        z10 = (i10 & 32) != 0 ? true : z10;
        kotlin.jvm.internal.s.h(url, "url");
        this.f25640a = url;
        this.f25641b = map;
        this.f25642c = gk2;
        this.f25643d = map2;
        this.f25644e = ni2;
        this.f25645f = z10;
        String strA = AbstractC2837af.a(url, map2);
        kotlin.jvm.internal.s.h(strA, "<set-?>");
        this.f25640a = strA;
    }

    @Override // com.inmobi.media.Ue
    public final Map a() {
        return this.f25641b;
    }

    @Override // com.inmobi.media.Ue
    public final Ni b() {
        return this.f25644e;
    }

    @Override // com.inmobi.media.Ue
    public final String c() {
        return this.f25640a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Re)) {
            return false;
        }
        Re re2 = (Re) obj;
        return kotlin.jvm.internal.s.c(this.f25640a, re2.f25640a) && kotlin.jvm.internal.s.c(this.f25641b, re2.f25641b) && kotlin.jvm.internal.s.c(this.f25642c, re2.f25642c) && kotlin.jvm.internal.s.c(this.f25643d, re2.f25643d) && kotlin.jvm.internal.s.c(this.f25644e, re2.f25644e) && this.f25645f == re2.f25645f;
    }

    public final int hashCode() {
        int iHashCode = this.f25640a.hashCode() * 31;
        Map map = this.f25641b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Gk gk2 = this.f25642c;
        int iHashCode3 = (iHashCode2 + (gk2 == null ? 0 : gk2.hashCode())) * 31;
        Map map2 = this.f25643d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Ni ni2 = this.f25644e;
        return Boolean.hashCode(this.f25645f) + ((iHashCode4 + (ni2 != null ? ni2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f25640a + "', headers=" + this.f25641b + ", queryParams=" + this.f25643d + ", retryPolicy=" + this.f25644e + ", timeouts=" + this.f25642c + ", followRedirects=" + this.f25645f + ")";
    }
}
