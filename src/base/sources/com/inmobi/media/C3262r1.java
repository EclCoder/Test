package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3262r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3107l1 f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3462yk f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3237q1 f27370j;

    public C3262r1(AbstractC3107l1 adUnit) {
        kotlin.jvm.internal.s.h(adUnit, "adUnit");
        this.f27361a = adUnit;
        this.f27362b = new C3462yk();
        this.f27370j = new C3237q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        AdSet adSetS = this.f27361a.s();
        return (adSetS == null || (ads = adSetS.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) gl.r.d0(ads)) == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
