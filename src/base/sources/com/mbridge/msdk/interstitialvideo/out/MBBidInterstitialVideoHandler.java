package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f31142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f31149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31150i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31151j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31152k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31153l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31154m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31157p;

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
        this.f31143b = str2;
        this.f31144c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f31142a == null) {
                a aVar = new a();
                this.f31142a = aVar;
                aVar.d(true);
                this.f31142a.e(true);
                this.f31142a.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f31142a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getRequestId() {
        a aVar = this.f31142a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f31142a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f31142a != null) {
            this.f31142a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31143b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f31142a != null) {
            this.f31142a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31143b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f31150i = i10;
        a aVar = this.f31142a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f31145d = str;
        this.f31146e = str2;
        this.f31147f = str3;
        this.f31148g = str4;
        this.f31152k = true;
        this.f31153l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f31143b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f31155n = i10;
        this.f31156o = i11;
        this.f31157p = com.mbridge.msdk.foundation.same.a.K;
        this.f31154m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f31149h = interstitialVideoListener;
        this.f31151j = true;
        a aVar = this.f31142a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31142a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f31143b, true));
        this.f31151j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f31149h = interstitialVideoListener;
        this.f31151j = true;
        a aVar = this.f31142a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31142a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f31143b, true));
        this.f31151j = false;
    }

    public void showFromBid() {
        a();
        if (this.f31142a != null) {
            this.f31142a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31143b, false, -1));
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f31142a;
        return aVar != null ? aVar.j() : OGoz.mXUSnNl;
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f31155n = i10;
        this.f31156o = (int) (d10 * 100.0d);
        this.f31157p = com.mbridge.msdk.foundation.same.a.J;
        this.f31154m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f31142a == null) {
            b(this.f31144c, this.f31143b);
        }
        if (this.f31151j) {
            a aVar2 = this.f31142a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f31149h, this.f31143b, true));
            }
            this.f31151j = false;
        }
        if (this.f31152k) {
            a aVar3 = this.f31142a;
            if (aVar3 != null) {
                aVar3.a(this.f31145d, this.f31146e, this.f31147f, this.f31148g);
            }
            this.f31152k = false;
        }
        if (!this.f31154m || (aVar = this.f31142a) == null) {
            return;
        }
        aVar.a(this.f31155n, this.f31157p, this.f31156o);
        this.f31154m = false;
    }

    private void b() {
        a aVar = this.f31142a;
        if (aVar != null) {
            aVar.a(this.f31155n, this.f31157p, this.f31156o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
