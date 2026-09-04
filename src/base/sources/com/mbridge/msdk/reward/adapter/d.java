package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f32219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f32220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32221c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32222d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32223e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32224f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32225g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32226h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f32219a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f32219a;
    }

    public int c() {
        return this.f32225g;
    }

    public int d() {
        return this.f32224f;
    }

    public boolean e() {
        return this.f32221c;
    }

    public void a(boolean z10) {
        this.f32221c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f32220b = campaignEx;
            this.f32222d = campaignEx.getSecondRequestIndex();
            this.f32223e = campaignEx.getSecondShowIndex();
            this.f32224f = campaignEx.getFilterCallBackState();
            this.f32226h = campaignEx.getFilterAdsShowCallState();
            this.f32225g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f32222d == 1 && this.f32221c;
    }
}
