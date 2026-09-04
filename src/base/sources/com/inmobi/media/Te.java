package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Te extends Ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gk f25758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hi f25759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ni f25760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25761f;

    public Te(String url, Map map, Gk gk2, Hi hi2, Ni ni2, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        gk2 = (i10 & 4) != 0 ? null : gk2;
        ni2 = (i10 & 16) != 0 ? null : ni2;
        kotlin.jvm.internal.s.h(url, "url");
        this.f25756a = url;
        this.f25757b = map;
        this.f25758c = gk2;
        this.f25759d = hi2;
        this.f25760e = ni2;
        this.f25761f = true;
    }

    @Override // com.inmobi.media.Ue
    public final Map a() {
        return this.f25757b;
    }

    @Override // com.inmobi.media.Ue
    public final Ni b() {
        return this.f25760e;
    }

    @Override // com.inmobi.media.Ue
    public final String c() {
        return this.f25756a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Te)) {
            return false;
        }
        Te te2 = (Te) obj;
        return kotlin.jvm.internal.s.c(this.f25756a, te2.f25756a) && kotlin.jvm.internal.s.c(this.f25757b, te2.f25757b) && kotlin.jvm.internal.s.c(this.f25758c, te2.f25758c) && kotlin.jvm.internal.s.c(this.f25759d, te2.f25759d) && kotlin.jvm.internal.s.c(this.f25760e, te2.f25760e) && this.f25761f == te2.f25761f;
    }

    public final int hashCode() {
        int iHashCode = this.f25756a.hashCode() * 31;
        Map map = this.f25757b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Gk gk2 = this.f25758c;
        int iHashCode3 = (iHashCode2 + (gk2 == null ? 0 : gk2.hashCode())) * 31;
        Hi hi2 = this.f25759d;
        int iHashCode4 = (iHashCode3 + (hi2 == null ? 0 : hi2.hashCode())) * 31;
        Ni ni2 = this.f25760e;
        return Boolean.hashCode(this.f25761f) + ((iHashCode4 + (ni2 != null ? ni2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f25756a + "', headers=" + this.f25757b + ", body=" + this.f25759d + ", retryPolicy=" + this.f25760e + ", timeouts=" + this.f25758c + ", followRedirects=" + this.f25761f + ")";
    }
}
