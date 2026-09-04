package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.f34668a) {
            try {
                CampaignEx campaignEx = this.f34669b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 == 122) {
                    g();
                    return;
                }
                switch (i10) {
                    case 109:
                        a(2);
                        b(2);
                        break;
                    case 110:
                        a(1);
                        b(1);
                        break;
                    case 111:
                        b(1);
                        break;
                }
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
            if (i10 != 105) {
                String noticeUrl = this.f34669b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f30491m)) {
                        noticeUrl = noticeUrl.replace(com.mbridge.msdk.foundation.same.a.f30491m + "=" + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f30491m), com.mbridge.msdk.foundation.same.a.f30491m + "=2");
                    } else {
                        noticeUrl = noticeUrl + "&" + com.mbridge.msdk.foundation.same.a.f30491m + "=2";
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b, this.f34674g, noticeUrl, true, false, com.mbridge.msdk.click.retry.a.f28482o);
            }
        }
    }
}
