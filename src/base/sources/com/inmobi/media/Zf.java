package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f26150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3331ti f26151k;

    public Zf(String url, String id2, Map headers, boolean z10, String priority, boolean z11, int i10, String ownerId, long j10, Long l10, C3331ti c3331ti) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(id2, "id");
        kotlin.jvm.internal.s.h(headers, "headers");
        kotlin.jvm.internal.s.h(priority, "priority");
        kotlin.jvm.internal.s.h(ownerId, "ownerId");
        this.f26141a = url;
        this.f26142b = id2;
        this.f26143c = headers;
        this.f26144d = z10;
        this.f26145e = priority;
        this.f26146f = z11;
        this.f26147g = i10;
        this.f26148h = ownerId;
        this.f26149i = j10;
        this.f26150j = l10;
        this.f26151k = c3331ti;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zf)) {
            return false;
        }
        Zf zf2 = (Zf) obj;
        return kotlin.jvm.internal.s.c(this.f26141a, zf2.f26141a) && kotlin.jvm.internal.s.c(this.f26142b, zf2.f26142b) && kotlin.jvm.internal.s.c(this.f26143c, zf2.f26143c) && this.f26144d == zf2.f26144d && kotlin.jvm.internal.s.c(this.f26145e, zf2.f26145e) && this.f26146f == zf2.f26146f && this.f26147g == zf2.f26147g && kotlin.jvm.internal.s.c(this.f26148h, zf2.f26148h) && this.f26149i == zf2.f26149i && kotlin.jvm.internal.s.c(this.f26150j, zf2.f26150j) && kotlin.jvm.internal.s.c(this.f26151k, zf2.f26151k);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f26149i) + ((this.f26148h.hashCode() + AbstractC3305si.a(this.f26147g, (Boolean.hashCode(this.f26146f) + ((this.f26145e.hashCode() + ((Boolean.hashCode(this.f26144d) + ((this.f26143c.hashCode() + ((this.f26142b.hashCode() + (this.f26141a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l10 = this.f26150j;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        C3331ti c3331ti = this.f26151k;
        return iHashCode2 + (c3331ti != null ? c3331ti.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f26141a + ", id=" + this.f26142b + ", headers=" + this.f26143c + ", allowRedirects=" + this.f26144d + ", priority=" + this.f26145e + ", ackRequired=" + this.f26146f + ", retryCount=" + this.f26147g + ", ownerId=" + this.f26148h + ", createdAt=" + this.f26149i + ", retryAfterTimestamp=" + this.f26150j + ", telemetryData=" + this.f26151k + ")";
    }
}
