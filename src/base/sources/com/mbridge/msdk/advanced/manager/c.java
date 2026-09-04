package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends com.mbridge.msdk.advanced.manager.a {
    public c(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.advanced.manager.a
    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f28125e == null) {
            this.f28125e = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28130j);
        }
        this.f28125e.a(new a(campaignEx));
        if (z10 && !TextUtils.isEmpty(str)) {
            com.mbridge.msdk.advanced.report.a.a(campaignEx, this.f28130j, str);
        }
        campaignEx.setCampaignUnitId(this.f28130j);
        this.f28125e.a(campaignEx);
        if (!this.f28122b.isReportClick()) {
            this.f28122b.setReportClick(true);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.advanced.middle.d dVar = this.f28124d;
        if (dVar != null) {
            dVar.b(this.f28132l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements NativeListener.TrackingExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28218a;

        a(CampaignEx campaignEx) {
            this.f28218a = campaignEx;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, c.this.f28123c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            c cVar = c.this;
            com.mbridge.msdk.advanced.middle.d dVar = cVar.f28124d;
            if (dVar != null) {
                dVar.d(cVar.f28132l);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, c.this.f28123c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(this.f28218a, c.this.f28123c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }
}
