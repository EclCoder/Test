package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3313t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3262r1 f27492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f27494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f27496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27497f;

    public C3313t0(C3262r1 adUnitTelemetry, String str, Boolean bool, String str2, byte b10, String str3) {
        kotlin.jvm.internal.s.h(adUnitTelemetry, "adUnitTelemetry");
        this.f27492a = adUnitTelemetry;
        this.f27493b = str;
        this.f27494c = bool;
        this.f27495d = str2;
        this.f27496e = b10;
        this.f27497f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3313t0)) {
            return false;
        }
        C3313t0 c3313t0 = (C3313t0) obj;
        return kotlin.jvm.internal.s.c(this.f27492a, c3313t0.f27492a) && kotlin.jvm.internal.s.c(this.f27493b, c3313t0.f27493b) && kotlin.jvm.internal.s.c(this.f27494c, c3313t0.f27494c) && kotlin.jvm.internal.s.c(this.f27495d, c3313t0.f27495d) && this.f27496e == c3313t0.f27496e && kotlin.jvm.internal.s.c(this.f27497f, c3313t0.f27497f);
    }

    public final int hashCode() {
        int iHashCode = this.f27492a.hashCode() * 31;
        String str = this.f27493b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f27494c;
        int iHashCode3 = (Byte.hashCode(this.f27496e) + ((this.f27495d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f27497f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3262r1 c3262r1 = this.f27492a;
        String str = this.f27493b;
        Boolean bool = this.f27494c;
        String str2 = this.f27495d;
        byte b10 = this.f27496e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3262r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b10) + ", impressionId=" + this.f27497f + ")";
    }
}
