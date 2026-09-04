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
import com.mbridge.msdk.setting.h;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MBInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f31159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f31165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31166i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31167j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31168k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31169l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31172o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
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
        this.f31160c = str2;
        this.f31158a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f31159b == null) {
                a aVar = new a();
                this.f31159b = aVar;
                aVar.d(true);
                this.f31159b.c(str, str2);
                h.b().k(str2);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f31159b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f31159b;
        return aVar != null ? aVar.j() : "";
    }

    public boolean isReady() {
        a();
        a aVar = this.f31159b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f31159b != null) {
            this.f31159b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31160c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f31159b != null) {
            this.f31159b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31160c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f31166i = i10;
        a aVar = this.f31159b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f31161d = str;
        this.f31162e = str2;
        this.f31163f = str3;
        this.f31164g = str4;
        this.f31168k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f31160c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f31170m = i10;
        this.f31171n = i11;
        this.f31172o = com.mbridge.msdk.foundation.same.a.K;
        this.f31169l = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f31165h = interstitialVideoListener;
        this.f31167j = true;
        a aVar = this.f31159b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31159b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f31167j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f31165h = interstitialVideoListener;
        this.f31167j = true;
        a aVar = this.f31159b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f31159b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f31167j = false;
    }

    public void show() {
        a();
        if (this.f31159b != null) {
            this.f31159b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f31160c, false, -1));
        }
    }

    public String getRequestId() {
        a aVar = this.f31159b;
        return aVar != null ? aVar.m() : OGoz.SUSgivLlFaMsZaM;
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f31170m = i10;
        this.f31171n = (int) (d10 * 100.0d);
        this.f31172o = com.mbridge.msdk.foundation.same.a.J;
        this.f31169l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f31159b == null) {
            b(this.f31158a, this.f31160c);
        }
        if (this.f31167j) {
            this.f31159b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f31165h, this.f31160c, false));
            this.f31167j = false;
        }
        if (this.f31168k) {
            this.f31159b.a(this.f31161d, this.f31162e, this.f31163f, this.f31164g);
            this.f31168k = false;
        }
        if (!this.f31169l || (aVar = this.f31159b) == null) {
            return;
        }
        aVar.a(this.f31170m, this.f31172o, this.f31171n);
        this.f31169l = false;
    }

    private void b() {
        a aVar = this.f31159b;
        if (aVar != null) {
            aVar.a(this.f31170m, this.f31172o, this.f31171n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
