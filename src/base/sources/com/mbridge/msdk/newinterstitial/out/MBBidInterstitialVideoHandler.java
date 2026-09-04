package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f31888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f31889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31890h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31891i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31892j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31893k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31895m;
    public String mUnitId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31896n;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        this.mUnitId = str2;
        this.f31883a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f31888f == null) {
                a aVar = new a();
                this.f31888f = aVar;
                aVar.d(true);
                this.f31888f.e(true);
                this.f31888f.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    private void c() {
        a aVar = this.f31888f;
        if (aVar != null) {
            aVar.a(this.f31894l, this.f31896n, this.f31895m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f31888f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f31888f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f31888f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f31888f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f31888f != null) {
            this.f31888f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f31888f != null) {
            this.f31888f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f31890h = i10;
        a aVar = this.f31888f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f31885c = str;
        this.f31884b = str2;
        this.f31886d = str3;
        this.f31887e = str4;
        this.f31892j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f31894l = i10;
        this.f31895m = i11;
        this.f31896n = com.mbridge.msdk.foundation.same.a.K;
        this.f31893k = true;
        c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f31889g = newInterstitialListener;
        this.f31891i = true;
        a aVar = this.f31888f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31888f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f31891i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f31889g = newInterstitialListener;
        this.f31891i = true;
        a aVar = this.f31888f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31888f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f31891i = false;
    }

    public void showFromBid() {
        a();
        if (this.f31888f != null) {
            this.f31888f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f31894l = i10;
        this.f31895m = (int) (d10 * 100.0d);
        this.f31896n = com.mbridge.msdk.foundation.same.a.J;
        this.f31893k = true;
        c();
    }

    private void a() {
        if (this.f31888f == null) {
            b(this.f31883a, this.mUnitId);
        }
        b();
    }

    private void b() {
        a aVar;
        if (this.f31891i) {
            a aVar2 = this.f31888f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f31889g));
            }
            this.f31891i = false;
        }
        if (this.f31892j) {
            a aVar3 = this.f31888f;
            if (aVar3 != null) {
                aVar3.a(this.f31885c, this.f31884b, this.f31886d, this.f31887e);
            }
            this.f31892j = false;
        }
        if (!this.f31893k || (aVar = this.f31888f) == null) {
            return;
        }
        aVar.a(this.f31894l, this.f31896n, this.f31895m);
        this.f31893k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
