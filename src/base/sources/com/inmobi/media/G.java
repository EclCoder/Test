package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3211p1 f24811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f24812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaInfo f24814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f24816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f24817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContextData f24818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f24821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f24822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f24823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f24824n;

    public G(D adSetContext, String markupType, MetaInfo metaInfo, String creativeId, String tracking, List trackers, List trackingInfo, ContextData contextData, String str, long j10, long j11, JSONObject transactionInfo, F viewability, E mrc50, C3211p1 adManagerContext) {
        kotlin.jvm.internal.s.h(adSetContext, "adSetContext");
        kotlin.jvm.internal.s.h(markupType, "markupType");
        kotlin.jvm.internal.s.h(creativeId, "creativeId");
        kotlin.jvm.internal.s.h(tracking, "tracking");
        kotlin.jvm.internal.s.h(trackers, "trackers");
        kotlin.jvm.internal.s.h(trackingInfo, "trackingInfo");
        kotlin.jvm.internal.s.h(transactionInfo, "transactionInfo");
        kotlin.jvm.internal.s.h(viewability, "viewability");
        kotlin.jvm.internal.s.h(mrc50, "mrc50");
        kotlin.jvm.internal.s.h(adManagerContext, "adManagerContext");
        this.f24811a = adManagerContext;
        this.f24812b = adSetContext;
        this.f24813c = markupType;
        this.f24814d = metaInfo;
        this.f24815e = creativeId;
        this.f24816f = trackers;
        this.f24817g = trackingInfo;
        this.f24818h = contextData;
        this.f24819i = str;
        this.f24820j = j10;
        this.f24821k = j11;
        this.f24822l = transactionInfo;
        this.f24823m = viewability;
        this.f24824n = mrc50;
    }
}
