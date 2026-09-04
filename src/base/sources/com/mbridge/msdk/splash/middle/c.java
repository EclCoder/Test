package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f32723c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f32726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f32727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f32728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f32729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f32730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBSplashView f32731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f32732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f32733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f32734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f32736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f32737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32738r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f32745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f32746z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32724d = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f32739s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f32740t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f32741u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f32742v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f32743w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f32744x = false;
    private boolean C = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32749c;

        a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f32747a = campaignEx;
            this.f32748b = i10;
            this.f32749c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f32747a, this.f32748b - 1, this.f32749c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f32722b = TextUtils.isEmpty(str) ? "" : str;
        this.f32721a = str2;
        this.f32723c = new MBridgeIds(str, str2);
        this.f32745y = activity;
        b(activity);
    }

    public void b(boolean z10) {
        this.f32735o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f32728h != null) {
            this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f32724d;
    }

    public long e() {
        return this.f32725e;
    }

    public boolean f() {
        return this.f32738r;
    }

    public boolean g() {
        return this.f32735o;
    }

    public void h() {
        f fVar = this.f32727g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f32727g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f32729i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f32722b, this.f32721a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f32736p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f32729i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f32723c, "activity is except,please check it");
        }
    }

    public void a(int i10) {
        this.f32739s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f32728h != null) {
                this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f32725e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f32728h == null) {
            this.f32728h = new b(this, this.f32723c);
        }
        this.f32728h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f32738r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f32729i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f32723c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f32744x) {
            e eVar = this.f32726f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.f32727g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f32729i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f32728h != null) {
                this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f32728h != null) {
                this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f32746z = z10;
    }

    public void b(int i10) {
        this.f32724d = i10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f32729i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f32723c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f32732l = viewGroup;
        MBSplashView mBSplashView = this.f32731k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f32744x) {
            e eVar = this.f32726f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.f32727g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f32732l = viewGroup;
        MBSplashView mBSplashView = this.f32731k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f32731k, this.f32722b, this.f32721a, str, this.f32738r, this.f32724d, true, false);
        if (campaignExA != null) {
            if (this.f32734n == null) {
                this.f32734n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32721a);
            }
            d dVar = new d(this, this.f32729i, campaignExA);
            this.f32730j = dVar;
            if (this.f32740t != 0 && this.f32741u != 0) {
                int i10 = this.f32724d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f32734n.E(), false);
                    return;
                }
                dVar.a(this.f32723c, "countDownTime must in 2 - 10 ,but now is " + this.f32724d);
                return;
            }
            dVar.a(this.f32723c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f32729i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f32723c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f32731k, this.f32722b, this.f32721a, str, this.f32738r, this.f32724d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f32731k, campaignEx)) {
            if (i10 > 0) {
                this.f32727g.f32622y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f32730j;
            if (dVar != null) {
                dVar.a(this.f32723c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f32732l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f32732l.setLayoutParams(layoutParams);
        this.f32732l.removeAllViews();
        this.f32727g.c(this.f32724d);
        this.f32727g.a(this.f32736p);
        this.f32727g.a(this.f32730j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.f32732l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f32731k);
            this.f32732l.addView(this.f32731k);
        }
        this.f32727g.a(this.f32738r);
        this.f32727g.a(campaignEx, this.f32731k);
    }

    void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f32734n == null) {
                this.f32734n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32721a);
            }
            this.f32730j = new d(this, this.f32729i, campaignEx);
        }
        ViewGroup viewGroup = this.f32732l;
        if (viewGroup == null) {
            d dVar = this.f32730j;
            if (dVar != null) {
                dVar.a(this.f32723c, "container is null");
                return;
            }
            return;
        }
        if (this.f32727g == null) {
            this.f32727g = new f(viewGroup.getContext(), this.f32722b, this.f32721a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f32727g == null) {
            if (activity != null) {
                this.f32727g = new f(activity, this.f32722b, this.f32721a);
            } else {
                this.f32727g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32722b, this.f32721a);
            }
        }
        if (this.f32731k == null) {
            if (activity != null) {
                this.f32731k = new MBSplashView(activity);
            } else {
                this.f32731k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f32737q == null) {
            this.f32737q = new j();
        }
        this.f32737q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f32721a);
    }

    private void a(String str, int i10) {
        boolean zB;
        synchronized (this.f32742v) {
            try {
                if (this.f32735o) {
                    if (this.f32728h != null) {
                        this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f32735o = true;
                    }
                    return;
                }
                this.f32735o = true;
                int i11 = this.f32724d;
                if (i11 >= 2 && i11 <= 10) {
                    if (this.f32740t != 0 && this.f32741u != 0) {
                        try {
                            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                        } catch (Exception unused) {
                            zB = false;
                        }
                        if (!zB) {
                            if (this.f32728h != null) {
                                this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                                return;
                            }
                            return;
                        }
                        this.f32731k.clearResState();
                        this.f32734n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32721a);
                        if (this.f32726f == null) {
                            this.f32726f = new e(this.f32722b, this.f32721a, this.f32725e * 1000);
                        }
                        b bVar = this.f32728h;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f32726f.a(this.f32728h);
                        }
                        this.f32731k.resetLoadState();
                        this.f32726f.a(this.f32724d);
                        this.f32726f.a(this.f32731k);
                        this.f32726f.a(this.f32734n);
                        this.f32726f.a(this.f32740t, this.f32741u);
                        this.f32726f.a(this.f32738r);
                        this.f32726f.b(this.f32739s);
                        this.f32726f.a(str, i10);
                        return;
                    }
                    if (this.f32728h != null) {
                        this.f32728h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                        return;
                    }
                    return;
                }
                if (this.f32728h != null) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar2.c("countDownTime must in 2 - 10");
                    this.f32728h.a(bVar2, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f32733m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f32731k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f32722b, this.f32721a, zoomOutTypeEnum.getIndex(), this.A), this.f32730j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f32739s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f32741u = iM - i11;
                this.f32740t = iN;
                return;
            } else {
                this.f32741u = 0;
                this.f32740t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f32740t = iN - i10;
                this.f32741u = iM;
            } else {
                this.f32741u = 0;
                this.f32740t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f32731k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return viewGroup;
                }
            } catch (Throwable th3) {
                th2 = th3;
                th2.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            th2 = th4;
            viewGroup = null;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f32731k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            q0.b(D, th2.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f32729i != null) {
            this.f32729i = null;
        }
        if (this.f32728h != null) {
            this.f32728h = null;
        }
        if (this.f32730j != null) {
            this.f32730j = null;
        }
        e eVar = this.f32726f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f32727g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f32745y != null) {
            this.f32745y = null;
        }
    }
}
