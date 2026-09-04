package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f34160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f34161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f34165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34166i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34167j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34168k = false;

    public d(Context context, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx, h hVar, String str, String str2) {
        this.f34160c = hVar;
        this.f34161d = cVar;
        this.f34162e = str2;
        this.f34163f = str;
        this.f34164g = z10;
        this.f34165h = context;
        a(cVar, campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private void a(com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx) {
        long jC0;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            if (TextUtils.isEmpty(strB)) {
                jC0 = 0;
            } else {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(strB);
                if (gVarF == null) {
                    gVarF = com.mbridge.msdk.setting.h.b().a();
                }
                if (gVarF != null) {
                    jC0 = gVarF.c0() * 1000;
                } else {
                    jC0 = 0;
                }
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                if (!campaignEx.isSpareOffer(jE, jC0)) {
                    campaignEx.setSpareOfferFlag(0);
                    campaignEx.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (cVar.A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f34160c;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f34160c.a(5, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        super.a(cVar);
        if (this.f34160c == null || this.f34166i) {
            return;
        }
        this.f34166i = true;
        b();
        this.f34160c.a(cVar);
        this.f34160c.a(2, this.f34163f, this.f34162e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        super.a(cVar, z10, cVar2);
        h hVar = this.f34160c;
        if (hVar == null || this.f34168k) {
            return;
        }
        this.f34168k = true;
        hVar.a(7, this.f34163f, this.f34162e);
        this.f34160c.a(cVar, z10, cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        super.a(z10, i10);
        h hVar = this.f34160c;
        if (hVar == null || this.f34168k) {
            return;
        }
        hVar.a(z10, i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        super.a(cVar, str);
        if (this.f34160c == null || this.f34167j) {
            return;
        }
        this.f34167j = true;
        a();
        this.f34160c.a(cVar, str);
        this.f34160c.a(4, this.f34163f, this.f34162e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        super.a(z10, str, str2);
        h hVar = this.f34160c;
        if (hVar != null) {
            hVar.a(z10, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f34160c;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f34160c.a(6, str, str2);
        }
    }
}
