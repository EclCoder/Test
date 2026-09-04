package com.vungle.ads.internal.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private Long adLoadType;
    private Boolean adPoddingEnabled;
    private String adSource;
    private com.vungle.ads.internal.a.EnumC0494a adState;
    private String adapterAdFormat;
    private Boolean adoEnabled;
    private String creativeId;
    private String eventId;
    private String experiments;
    private String mediationName;
    private Boolean partialDownloadEnabled;
    private String placementRefId;
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.s.c(p.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        p pVar = (p) obj;
        return kotlin.jvm.internal.s.c(this.placementRefId, pVar.placementRefId) && kotlin.jvm.internal.s.c(this.creativeId, pVar.creativeId) && kotlin.jvm.internal.s.c(this.eventId, pVar.eventId) && kotlin.jvm.internal.s.c(this.adSource, pVar.adSource) && kotlin.jvm.internal.s.c(this.mediationName, pVar.mediationName) && kotlin.jvm.internal.s.c(this.vmVersion, pVar.vmVersion) && kotlin.jvm.internal.s.c(this.partialDownloadEnabled, pVar.partialDownloadEnabled) && kotlin.jvm.internal.s.c(this.adoEnabled, pVar.adoEnabled) && this.adState == pVar.adState && kotlin.jvm.internal.s.c(this.adPoddingEnabled, pVar.adPoddingEnabled) && kotlin.jvm.internal.s.c(this.experiments, pVar.experiments) && kotlin.jvm.internal.s.c(this.adLoadType, pVar.adLoadType) && kotlin.jvm.internal.s.c(this.adapterAdFormat, pVar.adapterAdFormat);
    }

    public final Long getAdLoadType$vungle_ads_release() {
        return this.adLoadType;
    }

    public final Boolean getAdPoddingEnabled$vungle_ads_release() {
        return this.adPoddingEnabled;
    }

    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    public final com.vungle.ads.internal.a.EnumC0494a getAdState$vungle_ads_release() {
        return this.adState;
    }

    public final String getAdapterAdFormat$vungle_ads_release() {
        return this.adapterAdFormat;
    }

    public final Boolean getAdoEnabled$vungle_ads_release() {
        return this.adoEnabled;
    }

    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    public final String getExperiments$vungle_ads_release() {
        return this.experiments;
    }

    public final String getMediationName$vungle_ads_release() {
        return this.mediationName;
    }

    public final Boolean getPartialDownloadEnabled$vungle_ads_release() {
        return this.partialDownloadEnabled;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    public final String getVmVersion$vungle_ads_release() {
        return this.vmVersion;
    }

    public final void setAdLoadType$vungle_ads_release(Long l10) {
        this.adLoadType = l10;
    }

    public final void setAdPoddingEnabled$vungle_ads_release(Boolean bool) {
        this.adPoddingEnabled = bool;
    }

    public final void setAdSource$vungle_ads_release(String str) {
        this.adSource = str;
    }

    public final void setAdState$vungle_ads_release(com.vungle.ads.internal.a.EnumC0494a enumC0494a) {
        this.adState = enumC0494a;
    }

    public final void setAdapterAdFormat$vungle_ads_release(String str) {
        this.adapterAdFormat = str;
    }

    public final void setAdoEnabled$vungle_ads_release(Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(String str) {
        this.eventId = str;
    }

    public final void setExperiments$vungle_ads_release(String str) {
        this.experiments = str;
    }

    public final void setMediationName$vungle_ads_release(String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(String str) {
        this.vmVersion = str;
    }

    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ", adState=" + this.adState + " adPoddingEnabled=" + this.adPoddingEnabled + ", experiments=" + this.experiments + ", adLoadType=" + this.adLoadType + ", adapterAdFormat=" + this.adapterAdFormat + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        com.vungle.ads.internal.a.EnumC0494a enumC0494a = this.adState;
        int iHashCode4 = (iHashCode3 + (enumC0494a != null ? enumC0494a.hashCode() : 0)) * 31;
        Boolean bool3 = this.adPoddingEnabled;
        int iHashCode5 = (((iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + hashCode(this.experiments)) * 31;
        Long l10 = this.adLoadType;
        return ((iHashCode5 + (l10 != null ? l10.hashCode() : 0)) * 31) + hashCode(this.adapterAdFormat);
    }
}
