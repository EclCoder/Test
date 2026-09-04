package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f35232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f35236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f35237h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f35233d = "";
        this.f35234e = "";
        this.f35235f = "";
        this.f35232c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f35236g = campaignEx;
        g gVarF = h.b().f(c.n().b());
        c(campaignEx, gVarF);
        a(campaignEx, gVarF);
        b(campaignEx, gVarF);
        boolean z10 = (TextUtils.isEmpty(this.f35233d) || TextUtils.isEmpty(this.f35234e) || TextUtils.isEmpty(this.f35235f)) ? false : true;
        setImageUrl(this.f35233d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f35236g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f35234e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f35234e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f35234e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f35234e) && gVar != null) {
                this.f35234e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f35234e)) {
                this.f35234e = d.h().f30624g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f35237h == null) {
            this.f35237h = new a();
        }
        v0.a(this.f35236g, this.f35237h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f35236g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f35236g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f35237h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f35236g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f35235f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f35235f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f35235f) || gVar == null) {
            return;
        }
        this.f35235f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35233d = "";
        this.f35234e = "";
        this.f35235f = "";
        this.f35232c = context;
        b();
    }

    private void a() {
        if (this.f35232c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(c.n().d()).a(this.f35233d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f35236g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f35233d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f35233d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f35233d) || gVar == null) {
            return;
        }
        this.f35233d = gVar.b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35233d = "";
        this.f35234e = "";
        this.f35235f = "";
        this.f35232c = context;
        b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.foundation.same.image.c {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
