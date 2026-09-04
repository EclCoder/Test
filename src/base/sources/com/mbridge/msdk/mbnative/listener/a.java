package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f31558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31559b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f31561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31562e;

    public a() {
    }

    public void a(boolean z10) {
        this.f31562e = z10;
    }

    public void b() {
        this.f31559b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f31558a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f31558a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f31559b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f31558a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f31561d == null) {
                this.f31561d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f31560c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f31561d, str, this.f31560c, this.f31562e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f31559b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f31558a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f31558a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f31558a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f31558a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public void a(String str) {
        this.f31560c = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f31558a = nativeAdListener;
    }

    public boolean a() {
        return this.f31559b;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f31559b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f31558a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f31561d == null) {
                this.f31561d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f31560c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f31561d, str, this.f31560c, this.f31562e, campaignEx);
        }
    }
}
