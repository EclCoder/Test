package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f34655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f34656b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f34655a = activity;
        this.f34656b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (i10 != 106 || this.f34655a == null || this.f34656b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strA = com.mbridge.msdk.click.c.a(this.f34656b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strA)) {
                intent.setData(Uri.parse(strA));
                this.f34655a.startActivity(intent);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
        this.f34655a.finish();
    }
}
