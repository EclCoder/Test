package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainLink f25127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25128c;

    public Ki(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        kotlin.jvm.internal.s.h(assetIdToLinkMap, "assetIdToLinkMap");
        kotlin.jvm.internal.s.h(responseClickTrackers, "responseClickTrackers");
        this.f25126a = assetIdToLinkMap;
        this.f25127b = mainLink;
        this.f25128c = responseClickTrackers;
    }
}
