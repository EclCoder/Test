package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3230pk f25707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f25708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25709c;

    public Si(C3230pk telemetryConfigMetaData, double d10, List samplingEvents) {
        kotlin.jvm.internal.s.h(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.s.h(samplingEvents, "samplingEvents");
        this.f25707a = telemetryConfigMetaData;
        this.f25708b = d10;
        this.f25709c = samplingEvents;
        kotlin.jvm.internal.s.g(Si.class.getSimpleName(), "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        kotlin.jvm.internal.s.h(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.s.h(eventType, "eventType");
        C3230pk c3230pk = this.f25707a;
        if (c3230pk.f27275e && !c3230pk.f27276f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !kotlin.jvm.internal.s.c(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (kotlin.jvm.internal.s.c("image", keyValueMap.get("assetType")) && !this.f25707a.f27272b) {
            C3178nk c3178nk = C3178nk.f27064a;
            return false;
        }
        if (kotlin.jvm.internal.s.c("gif", keyValueMap.get("assetType")) && !this.f25707a.f27273c) {
            C3178nk c3178nk2 = C3178nk.f27064a;
            return false;
        }
        if (!kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, keyValueMap.get("assetType")) || this.f25707a.f27274d) {
            return true;
        }
        C3178nk c3178nk3 = C3178nk.f27064a;
        return false;
    }

    public final int a(String eventType) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        if (!this.f25709c.contains(eventType)) {
            return 1;
        }
        if (this.f25708b < this.f25707a.f27277g) {
            C3178nk c3178nk = C3178nk.f27064a;
            return 2;
        }
        C3178nk c3178nk2 = C3178nk.f27064a;
        return 0;
    }
}
