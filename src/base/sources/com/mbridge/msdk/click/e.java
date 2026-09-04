package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28367e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f28370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f28371i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    JumpLoaderResult f28364b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28365c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28366d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f28368f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28369g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f28372j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f28370h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f28371i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f28366d = str2;
        this.f28368f = gVar;
        this.f28364b = null;
        this.f28367e = i10;
        boolean z12 = false;
        if (campaignEx != null) {
            z12 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f28371i.a(str2, gVar, z12, id2, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f28366d = new String(campaignEx.getClickURL());
        this.f28368f = gVar;
        this.f28364b = null;
        this.f28371i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f28483p);
    }

    public void a() {
        this.f28369g = false;
    }
}
