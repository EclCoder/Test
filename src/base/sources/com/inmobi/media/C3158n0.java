package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3158n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27023h;

    public C3158n0(String clientRequestId, Map map, long j10, String monetizationContext, String str, Map map2, String str2, boolean z10) {
        kotlin.jvm.internal.s.h(clientRequestId, "clientRequestId");
        kotlin.jvm.internal.s.h("im", "integrationTypeString");
        kotlin.jvm.internal.s.h(monetizationContext, "monetizationContext");
        kotlin.jvm.internal.s.h("unifiedSdkJson", "adFormat");
        this.f27016a = clientRequestId;
        this.f27017b = map;
        this.f27018c = j10;
        this.f27019d = monetizationContext;
        this.f27020e = str;
        this.f27021f = map2;
        this.f27022g = str2;
        this.f27023h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3158n0)) {
            return false;
        }
        C3158n0 c3158n0 = (C3158n0) obj;
        return kotlin.jvm.internal.s.c(this.f27016a, c3158n0.f27016a) && kotlin.jvm.internal.s.c("im", "im") && kotlin.jvm.internal.s.c(this.f27017b, c3158n0.f27017b) && this.f27018c == c3158n0.f27018c && kotlin.jvm.internal.s.c(this.f27019d, c3158n0.f27019d) && kotlin.jvm.internal.s.c(this.f27020e, c3158n0.f27020e) && kotlin.jvm.internal.s.c("unifiedSdkJson", "unifiedSdkJson") && kotlin.jvm.internal.s.c(this.f27021f, c3158n0.f27021f) && kotlin.jvm.internal.s.c(this.f27022g, c3158n0.f27022g) && this.f27023h == c3158n0.f27023h && kotlin.jvm.internal.s.c(null, null);
    }

    public final int hashCode() {
        int iHashCode = ((this.f27016a.hashCode() * 31) + 3364) * 31;
        Map map = this.f27017b;
        int iHashCode2 = (this.f27019d.hashCode() + ((Long.hashCode(this.f27018c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.f27020e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f27021f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.f27022g;
        return (Boolean.hashCode(this.f27023h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.f27016a + ", integrationTypeString=im, extras=" + this.f27017b + ", imPlacementId=" + this.f27018c + ", monetizationContext=" + this.f27019d + ", adType=" + this.f27020e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f27021f + ", keywords=" + this.f27022g + ", isApplicationMutedByPub=" + this.f27023h + ", extraInfo=" + ((Object) null) + ")";
    }
}
