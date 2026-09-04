package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2853b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26247c;

    public AbstractC2853b5(String str) {
        this.f26245a = str + CampaignEx.JSON_KEY_ST_TS;
        this.f26246b = str + "ivl";
        this.f26247c = str + "count";
    }
}
