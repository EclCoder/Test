package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3184o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3107l1 f27091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f27093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f27094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WatermarkData f27095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdQualityControl f27096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f27097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f27098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f27099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f27100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3331ti f27101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3348u9 f27102t;

    public C3184o0(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, AbstractC3107l1 abstractC3107l1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, LinkedHashSet linkedHashSet, String str7, String landingScheme, C3331ti c3331ti, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(landingScheme, "landingScheme");
        this.f27083a = str;
        this.f27084b = z10;
        this.f27085c = j10;
        this.f27086d = z11;
        this.f27087e = str2;
        this.f27088f = str3;
        this.f27089g = str4;
        this.f27090h = str5;
        this.f27091i = abstractC3107l1;
        this.f27092j = str6;
        this.f27093k = linkedHashMap;
        this.f27094l = bool;
        this.f27095m = watermarkData;
        this.f27096n = adQualityControl;
        this.f27097o = b10;
        this.f27098p = linkedHashSet;
        this.f27099q = str7;
        this.f27100r = landingScheme;
        this.f27101s = c3331ti;
        this.f27102t = c3348u9;
    }

    public static C3184o0 a(C3184o0 c3184o0, C3331ti c3331ti, int i10) {
        String str = c3184o0.f27083a;
        boolean z10 = c3184o0.f27084b;
        long j10 = c3184o0.f27085c;
        boolean z11 = c3184o0.f27086d;
        String str2 = c3184o0.f27087e;
        String str3 = c3184o0.f27088f;
        String str4 = c3184o0.f27089g;
        String str5 = c3184o0.f27090h;
        String str6 = c3184o0.f27092j;
        LinkedHashMap linkedHashMap = c3184o0.f27093k;
        Boolean bool = c3184o0.f27094l;
        WatermarkData watermarkData = (i10 & 4096) != 0 ? c3184o0.f27095m : null;
        AdQualityControl adQualityControl = c3184o0.f27096n;
        byte b10 = c3184o0.f27097o;
        LinkedHashSet linkedHashSet = c3184o0.f27098p;
        String str7 = c3184o0.f27099q;
        String landingScheme = c3184o0.f27100r;
        C3331ti c3331ti2 = (i10 & 524288) != 0 ? c3184o0.f27101s : c3331ti;
        C3348u9 c3348u9 = c3184o0.f27102t;
        kotlin.jvm.internal.s.h(landingScheme, "landingScheme");
        return new C3184o0(str, z10, j10, z11, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b10, linkedHashSet, str7, landingScheme, c3331ti2, c3348u9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3184o0)) {
            return false;
        }
        C3184o0 c3184o0 = (C3184o0) obj;
        return kotlin.jvm.internal.s.c(this.f27083a, c3184o0.f27083a) && this.f27084b == c3184o0.f27084b && this.f27085c == c3184o0.f27085c && this.f27086d == c3184o0.f27086d && kotlin.jvm.internal.s.c(this.f27087e, c3184o0.f27087e) && kotlin.jvm.internal.s.c(this.f27088f, c3184o0.f27088f) && kotlin.jvm.internal.s.c(this.f27089g, c3184o0.f27089g) && kotlin.jvm.internal.s.c(this.f27090h, c3184o0.f27090h) && kotlin.jvm.internal.s.c(this.f27091i, c3184o0.f27091i) && kotlin.jvm.internal.s.c(this.f27092j, c3184o0.f27092j) && kotlin.jvm.internal.s.c(this.f27093k, c3184o0.f27093k) && kotlin.jvm.internal.s.c(this.f27094l, c3184o0.f27094l) && kotlin.jvm.internal.s.c(this.f27095m, c3184o0.f27095m) && kotlin.jvm.internal.s.c(this.f27096n, c3184o0.f27096n) && this.f27097o == c3184o0.f27097o && kotlin.jvm.internal.s.c(this.f27098p, c3184o0.f27098p) && kotlin.jvm.internal.s.c(this.f27099q, c3184o0.f27099q) && kotlin.jvm.internal.s.c(this.f27100r, c3184o0.f27100r) && kotlin.jvm.internal.s.c(this.f27101s, c3184o0.f27101s) && kotlin.jvm.internal.s.c(this.f27102t, c3184o0.f27102t);
    }

    public final int hashCode() {
        String str = this.f27083a;
        int iHashCode = (Boolean.hashCode(this.f27086d) + ((Long.hashCode(this.f27085c) + ((Boolean.hashCode(this.f27084b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f27087e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27088f;
        int iHashCode3 = (this.f27089g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f27090h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3107l1 abstractC3107l1 = this.f27091i;
        int iHashCode5 = (iHashCode4 + (abstractC3107l1 == null ? 0 : abstractC3107l1.hashCode())) * 31;
        String str5 = this.f27092j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.f27093k;
        int iHashCode7 = (this.f27094l.hashCode() + ((iHashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.f27095m;
        int iHashCode8 = (iHashCode7 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f27096n;
        int iHashCode9 = (this.f27098p.hashCode() + ((Byte.hashCode(this.f27097o) + ((iHashCode8 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.f27099q;
        int iHashCode10 = (this.f27100r.hashCode() + ((Boolean.hashCode(false) + ((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        C3331ti c3331ti = this.f27101s;
        int iHashCode11 = (iHashCode10 + (c3331ti == null ? 0 : c3331ti.hashCode())) * 31;
        C3348u9 c3348u9 = this.f27102t;
        return Long.hashCode(-1L) + ((iHashCode11 + (c3348u9 != null ? c3348u9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f27083a;
        boolean z10 = this.f27084b;
        long j10 = this.f27085c;
        boolean z11 = this.f27086d;
        String str2 = this.f27087e;
        String str3 = this.f27088f;
        String str4 = this.f27089g;
        String str5 = this.f27090h;
        AbstractC3107l1 abstractC3107l1 = this.f27091i;
        String str6 = this.f27092j;
        LinkedHashMap linkedHashMap = this.f27093k;
        Boolean bool = this.f27094l;
        WatermarkData watermarkData = this.f27095m;
        AdQualityControl adQualityControl = this.f27096n;
        byte b10 = this.f27097o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z10 + ", placementId=" + j10 + ", allowAutoRedirection=" + z11 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC3107l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b10) + ", viewabilityTrackers=" + this.f27098p + ", impressionId=" + this.f27099q + ", isInAppBrowser=false, landingScheme=" + this.f27100r + ", renderViewMetaData=" + this.f27101s + ", logger=" + this.f27102t + ", viewTouchTimestamp=-1)";
    }
}
