package com.inmobi.media;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3331ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3365v0 f27558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3237q1 f27567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3460yi f27568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InlineParams f27570m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3331ti)) {
            return false;
        }
        C3331ti c3331ti = (C3331ti) obj;
        return kotlin.jvm.internal.s.c(this.f27558a, c3331ti.f27558a) && kotlin.jvm.internal.s.c(this.f27559b, c3331ti.f27559b) && kotlin.jvm.internal.s.c(this.f27560c, c3331ti.f27560c) && kotlin.jvm.internal.s.c(this.f27561d, c3331ti.f27561d) && this.f27562e == c3331ti.f27562e && kotlin.jvm.internal.s.c(this.f27563f, c3331ti.f27563f) && kotlin.jvm.internal.s.c(this.f27564g, c3331ti.f27564g) && this.f27565h == c3331ti.f27565h && this.f27566i == c3331ti.f27566i && kotlin.jvm.internal.s.c(this.f27567j, c3331ti.f27567j) && kotlin.jvm.internal.s.c(this.f27568k, c3331ti.f27568k) && kotlin.jvm.internal.s.c(this.f27569l, c3331ti.f27569l) && kotlin.jvm.internal.s.c(this.f27570m, c3331ti.f27570m);
    }

    public final int hashCode() {
        int iA = AbstractC3305si.a(this.f27566i, (Boolean.hashCode(this.f27565h) + ((this.f27564g.hashCode() + ((this.f27563f.hashCode() + AbstractC3305si.a(this.f27562e, (this.f27561d.hashCode() + ((this.f27560c.hashCode() + ((this.f27559b.hashCode() + (this.f27558a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3237q1 c3237q1 = this.f27567j;
        int iHashCode = (iA + (c3237q1 == null ? 0 : c3237q1.hashCode())) * 31;
        C3460yi c3460yi = this.f27568k;
        int iHashCode2 = (iHashCode + (c3460yi == null ? 0 : Integer.hashCode(c3460yi.f27958a))) * 31;
        String str = this.f27569l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.f27570m;
        return iHashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f27558a + ", markupType=" + this.f27559b + ", impressionId=" + this.f27560c + ", telemetryMetadataBlob=" + this.f27561d + ", internetAvailabilityAdRetryCount=" + this.f27562e + ", creativeType=" + this.f27563f + ", creativeId=" + this.f27564g + ", isRewarded=" + this.f27565h + ", adIndex=" + this.f27566i + ", adUnitTelemetryData=" + this.f27567j + ", renderViewTelemetryData=" + this.f27568k + ", renderViewId=" + this.f27569l + ", inlineParams=" + this.f27570m + ")";
    }

    public C3331ti(C3365v0 placement, String str, String impressionId, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, C3237q1 c3237q1, C3460yi c3460yi, String str2, InlineParams inlineParams) {
        kotlin.jvm.internal.s.h(placement, "placement");
        kotlin.jvm.internal.s.h(str, UHbHibBvYxKnPE.oDcuqJDkp);
        kotlin.jvm.internal.s.h(impressionId, "impressionId");
        kotlin.jvm.internal.s.h(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.s.h(creativeType, "creativeType");
        kotlin.jvm.internal.s.h(creativeId, "creativeId");
        this.f27558a = placement;
        this.f27559b = str;
        this.f27560c = impressionId;
        this.f27561d = telemetryMetadataBlob;
        this.f27562e = i10;
        this.f27563f = creativeType;
        this.f27564g = creativeId;
        this.f27565h = z10;
        this.f27566i = i11;
        this.f27567j = c3237q1;
        this.f27568k = c3460yi;
        this.f27569l = str2;
        this.f27570m = inlineParams;
    }
}
