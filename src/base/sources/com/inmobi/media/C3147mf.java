package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3147mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26996b;

    public C3147mf(String hyperId, String spHost) {
        kotlin.jvm.internal.s.h(hyperId, "hyperId");
        kotlin.jvm.internal.s.h("i6i", "sspId");
        kotlin.jvm.internal.s.h(spHost, "spHost");
        kotlin.jvm.internal.s.h("inmobi", "pubId");
        this.f26995a = hyperId;
        this.f26996b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3147mf)) {
            return false;
        }
        C3147mf c3147mf = (C3147mf) obj;
        return kotlin.jvm.internal.s.c(this.f26995a, c3147mf.f26995a) && kotlin.jvm.internal.s.c("i6i", "i6i") && kotlin.jvm.internal.s.c(this.f26996b, c3147mf.f26996b) && kotlin.jvm.internal.s.c("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.f26996b.hashCode() + (((this.f26995a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f26995a + ", sspId=i6i, spHost=" + this.f26996b + ", pubId=inmobi)";
    }
}
