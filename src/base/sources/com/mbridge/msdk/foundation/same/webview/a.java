package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f30800b;

    public a(CampaignEx campaignEx) {
        this.f30800b = campaignEx;
    }

    public void a(String str) {
        this.f30799a = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
    }
}
