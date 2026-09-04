package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Activity f34989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f34990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f34991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected c f34992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f34993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f34994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f34995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f34996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f34997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f34998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f34999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f35000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f35001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f35002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected IJSFactory f35003q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f34987a = 0;
        this.f34988b = 1;
        this.f34996j = 2;
        this.f34997k = false;
        this.f34998l = false;
        this.f35002p = false;
        this.f35003q = new a();
    }

    private boolean i(int i10) {
        try {
            if (i10 == 1) {
                this.f34989c.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    return false;
                }
                this.f34989c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("AbstractJSContainer", th2.getMessage(), th2);
            return false;
        }
    }

    protected void a(Object obj) {
        f.a().b(obj, h(this.f34987a));
    }

    protected void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f35003q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f35003q.getIJSRewardVideoV1();
    }

    protected String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f34991e) || (cVar = this.f34992f) == null || TextUtils.isEmpty(cVar.t())) ? this.f34991e : this.f34992f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f35003q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f35003q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f35003q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f35003q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f35003q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f34991e;
    }

    public String getUnitId() {
        return this.f34990d;
    }

    protected String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f30438f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f35003q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f34989c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f34998l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f35002p = z10;
    }

    public void setIV(boolean z10) {
        this.f34997k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f34999m = i10;
        this.f35000n = i11;
        this.f35001o = i12;
    }

    public void setMute(int i10) {
        this.f34996j = i10;
    }

    public void setPlacementId(String str) {
        this.f34991e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f34994h = cVar;
    }

    public void setRewardId(String str) {
        this.f34995i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f34992f = cVar;
    }

    public void setUnitId(String str) {
        this.f34990d = str;
    }

    public void setUserId(String str) {
        this.f34993g = str;
    }

    protected void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    protected void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f34989c;
        if (activity != null) {
            activity.finish();
        }
    }

    protected int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    protected void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : i(rewardTemplateMode.g())) || cVar == null) {
            return;
        }
        i(this.f34992f.y());
    }

    protected k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.a.C0480a c0480aA = com.mbridge.msdk.videocommon.a.a(this.f34997k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0480aA != null && c0480aA.c()) {
            WindVaneWebView windVaneWebViewB = c0480aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34987a = 0;
        this.f34988b = 1;
        this.f34996j = 2;
        this.f34997k = false;
        this.f34998l = false;
        this.f35002p = false;
        this.f35003q = new a();
    }
}
