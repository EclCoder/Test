package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f28237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f28238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f28239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f28240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f28241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f28242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f28243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f28244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f28245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f28246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f28248n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f28258x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f28260z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28249o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28250p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28251q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f28252r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28253s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f28254t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28255u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28256v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f28257w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f28259y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0369a implements Runnable {
            RunnableC0369a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f28260z != null) {
                    c.this.f28260z.postDelayed(new RunnableC0369a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f28236b = TextUtils.isEmpty(str) ? "" : str;
        this.f28235a = str2;
        this.f28237c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f28244j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f28244j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    private void j() {
        a(this.f28249o);
        c(this.f28251q);
        g(this.f28253s);
        a(this.f28258x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f28260z;
    }

    public int f() {
        return this.f28249o;
    }

    public boolean g() {
        return this.f28247m;
    }

    public void h(int i10) {
        this.f28254t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f28254t) {
            this.f28253s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f28244j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f28259y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f28237c);
        this.f28240f = bVar;
        bVar.a(this.f28241g);
        this.f28240f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f28241g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f28237c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f28239e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f28247m = z10;
    }

    public boolean b(String str) {
        return (this.f28260z == null || com.mbridge.msdk.advanced.manager.d.a(this.f28243i, this.f28236b, this.f28235a, str, this.f28249o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f28259y) {
            this.f28258x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f28244j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f28250p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f28252r) {
            this.f28251q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f28244j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f28252r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f28239e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f28238d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f28246l == null) {
                this.f28246l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f28235a);
            }
            this.f28242h = new d(this, this.f28241g, campaignEx);
            q0.a(G, QGbBllacZSmHKn.GgWSRrvlev);
            if (this.f28255u != 0 && this.f28256v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f28242h;
            if (dVar != null) {
                dVar.a(this.f28237c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f28243i, this.f28236b, this.f28235a, "", this.f28249o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f28239e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f28241g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f28250p) {
            this.f28249o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f28249o;
            if (i11 == 1) {
                this.f28239e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f28244j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f28239e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f28244j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f28239e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f28238d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f28241g != null) {
            this.f28241g = null;
        }
        if (this.f28240f != null) {
            this.f28240f = null;
        }
        if (this.f28242h != null) {
            this.f28242h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f28238d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f28238d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f28239e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f28243i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f28236b + this.f28235a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f28245k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f28260z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f28260z.removeAllViews();
            this.f28260z = null;
        }
    }

    void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f28260z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f28246l == null) {
                this.f28246l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f28235a);
            }
            this.f28242h = new d(this, this.f28241g, campaignEx);
        }
        if (this.f28239e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28236b, this.f28235a);
            this.f28239e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f28243i, campaignEx, this.f28236b, this.f28235a)) {
            this.f28239e.a(this.f28242h);
            q0.b(G, "start show process");
            this.f28239e.a(campaignEx, this.f28243i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f28257w) {
            try {
                if (this.f28247m) {
                    if (this.f28240f != null) {
                        this.f28240f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f28247m = true;
                    }
                    return;
                }
                this.f28247m = true;
                if (this.f28255u != 0 && this.f28256v != 0) {
                    if (this.f28243i == null) {
                        if (this.f28240f != null) {
                            this.f28240f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f28240f != null) {
                            this.f28240f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f28243i.clearResStateAndRemoveClose();
                    l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f28235a);
                    this.f28246l = lVarA;
                    if (lVarA == null) {
                        this.f28246l = l.k(this.f28235a);
                    }
                    if (this.f28238d == null) {
                        this.f28238d = new com.mbridge.msdk.advanced.manager.b(this.f28236b, this.f28235a, 0L);
                    }
                    b bVar = this.f28240f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f28238d.a(this.f28240f);
                    }
                    this.f28243i.resetLoadState();
                    this.f28238d.a(this.f28243i);
                    this.f28238d.a(this.f28246l);
                    this.f28238d.a(this.f28255u, this.f28256v);
                    this.f28238d.a(this.f28249o);
                    this.f28238d.b(str, i10);
                    return;
                }
                if (this.f28240f != null) {
                    this.f28240f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        Context context;
        if (this.f28239e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28236b, this.f28235a);
            this.f28239e = cVar;
            cVar.a(this);
        }
        if (this.f28244j == null) {
            try {
                this.f28244j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f28245k == null) {
                try {
                    this.f28245k = new com.mbridge.msdk.advanced.view.a(this.f28235a, this.f28239e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28244j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f28245k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f28243i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (activity == null) {
                context = activity;
                context = contextD;
            }
            context = activity;
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f28243i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f28244j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f28244j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f28243i.addView(this.f28244j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f28260z == null) {
            this.f28260z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f28255u != 0 && this.f28256v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f28255u, this.f28256v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f28260z.setLayoutParams(layoutParams);
            this.f28260z.setProvider(this);
            this.f28260z.addView(this.f28243i);
            this.f28260z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f28248n == null) {
            this.f28248n = new j();
        }
        this.f28248n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f28235a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f28238d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f28256v = i10;
        this.f28255u = i11;
        this.f28260z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
