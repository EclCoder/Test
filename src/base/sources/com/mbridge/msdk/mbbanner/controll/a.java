package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f31325x = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBridgeIds f31329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBBannerView f31332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31335j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BannerAdListener f31337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignUnit f31338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f31339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f31340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f31341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f31343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f31344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f31346u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f31336k = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f31347v = new C0413a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f31348w = new b();

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f31332g = mBBannerView;
        if (bannerSize != null) {
            this.f31333h = bannerSize.getHeight();
            this.f31334i = bannerSize.getWidth();
        }
        this.f31326a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f31327b = str;
        this.f31329d = new MBridgeIds(str, this.f31326a);
        f();
    }

    private int a(int i10) {
        if (i10 > 0) {
            if (i10 < 10) {
                return 10;
            }
            if (i10 > 180) {
                return 180;
            }
        }
        return i10;
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31326a);
        this.f31340o = lVarE;
        if (lVarE == null) {
            this.f31340o = l.i(this.f31326a);
        }
        if (this.f31336k == -1) {
            this.f31335j = a(this.f31340o.D());
        }
        if (this.f31331f == 0) {
            boolean z10 = this.f31340o.g() == 1;
            this.f31330e = z10;
            c cVar = this.f31339n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f31338m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f31332g != null) {
                a.this.f31345t = true;
                a.this.j();
            }
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f31344s || !this.f31345t) {
            return;
        }
        if (!a(this.f31332g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f31338m != null) {
            if (this.f31339n == null) {
                this.f31339n = new c(this.f31332g, this.f31347v, this.f31327b, this.f31326a, this.f31330e, this.f31340o);
            }
            this.f31339n.a(this.f31328c);
            this.f31339n.b(this.f31342q);
            this.f31339n.d(this.f31343r);
            this.f31339n.a(this.f31330e, this.f31331f);
            this.f31339n.b(this.f31338m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f31345t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f31332g;
        if (mBBannerView != null) {
            if (!this.f31342q || !this.f31343r || this.f31346u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f31327b, this.f31326a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f31327b, this.f31326a, new com.mbridge.msdk.mbbanner.common.data.a(this.f31334i + "x" + this.f31333h, this.f31335j * 1000), this.f31348w);
            }
            if (this.f31342q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f31327b, this.f31326a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f31326a);
        }
    }

    public void c() {
        if (this.f31344s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f31334i + "x" + this.f31333h, this.f31335j * 1000);
        aVar.c(this.f31327b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f31327b, this.f31326a, aVar, this.f31348w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f31338m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f31338m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f31338m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f31327b, this.f31326a, new com.mbridge.msdk.mbbanner.common.data.a(this.f31334i + "x" + this.f31333h, this.f31335j * 1000), this.f31348w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f31327b, this.f31326a, new com.mbridge.msdk.mbbanner.common.data.a(this.f31334i + "x" + this.f31333h, this.f31335j * 1000), this.f31348w);
    }

    public void i() {
        this.f31344s = true;
        if (this.f31337l != null) {
            this.f31337l = null;
        }
        if (this.f31348w != null) {
            this.f31348w = null;
        }
        if (this.f31347v != null) {
            this.f31347v = null;
        }
        if (this.f31332g != null) {
            this.f31332g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f31327b, this.f31326a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f31326a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f31339n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f31336k = iA;
        this.f31335j = iA;
    }

    private void b(String str, String str2) {
        if (this.f31341p == null) {
            this.f31341p = new j();
        }
        this.f31341p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f31326a);
    }

    public void b(boolean z10) {
        this.f31342q = z10;
        b();
        j();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0413a implements com.mbridge.msdk.mbbanner.common.listener.c {
        C0413a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f31325x, "onShowSuccessed:");
            if (a.this.f31337l != null) {
                a.this.f31337l.onLoadSuccessed(a.this.f31329d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f31326a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f31325x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f31337l != null) {
                a.this.f31337l.onCloseBanner(a.this.f31329d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f31337l != null) {
                a.this.f31337l.onClick(a.this.f31329d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f31337l != null) {
                a.this.f31337l.closeFullScreen(a.this.f31329d);
                a.this.f31346u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f31327b, a.this.f31326a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f31334i + "x" + a.this.f31333h, a.this.f31335j * 1000), a.this.f31348w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f31337l != null) {
                a.this.f31337l.onLeaveApp(a.this.f31329d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f31337l != null) {
                a.this.f31337l.onLogImpression(a.this.f31329d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f31326a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                int i10 = 1;
                cVarA.g(a.this.f31339n != null ? a.this.f31339n.c() : 1);
                if (a.this.f31335j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f31335j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f31325x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f31337l != null) {
                a.this.f31337l.showFullScreen(a.this.f31329d);
                a.this.f31346u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f31327b, a.this.f31326a, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th2) {
                q0.b(f31325x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f31338m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31326a, str);
        CampaignUnit campaignUnit2 = this.f31338m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f31338m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f31338m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f31337l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f31329d, strL);
        }
    }

    public void b() {
        k();
        c cVar = this.f31339n;
        if (cVar != null) {
            cVar.b(this.f31342q);
            this.f31339n.d(this.f31343r);
        }
    }

    public void c(boolean z10) {
        this.f31343r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31326a, bVar == null ? this.f31338m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f31338m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f31338m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f31338m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f31325x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f31333h = bannerSize.getHeight();
            this.f31334i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f31330e = z10;
        this.f31331f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        boolean zB;
        if (this.f31333h >= 1 && this.f31334i >= 1) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f31325x, e10.getMessage());
                zB = false;
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f31328c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f31334i + "x" + this.f31333h, this.f31335j * 1000);
            aVar.a(str);
            aVar.c(this.f31327b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f31327b, this.f31326a, aVar, this.f31348w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f31327b, this.f31326a, aVar, this.f31348w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f31337l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f31328c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f31339n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
