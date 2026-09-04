package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f32876u = "MBSplashView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBSplashWebview f32878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f32879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f32880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f32881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f32882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f32887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f32888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f32891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f32892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private DyCountDownListener f32893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f32895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32896t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f32894r;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32898a;

        b(CampaignEx campaignEx) {
            this.f32898a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f32898a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f32876u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f32878b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f32876u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBSplashView.f32876u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f32878b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f32878b, iArr2[0], iArr2[1], MBSplashView.this.f32878b.getWidth(), MBSplashView.this.f32878b.getHeight());
                f.a().a((WebView) MBSplashView.this.f32878b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        q0.b(f32876u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = "landscape";
            } else {
                str = i14 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f32876u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f32881e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f32886j = false;
        this.f32885i = false;
        this.f32884h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f32887k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f32878b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f32878b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f32878b, "onSystemDestory", "");
        this.f32878b.release();
        this.f32878b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f32895s;
    }

    public View getCloseView() {
        return this.f32881e;
    }

    public ViewGroup getDevContainer() {
        return this.f32887k;
    }

    public View getIconVg() {
        return this.f32882f;
    }

    public View getSplashNativeView() {
        return this.f32888l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f32892p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f32878b;
    }

    public boolean isAttach() {
        return this.f32890n;
    }

    public boolean isDynamicView() {
        return this.f32889m;
    }

    public boolean isH5Ready() {
        return this.f32884h;
    }

    public boolean isImageReady() {
        return this.f32886j;
    }

    public boolean isVideoReady() {
        return this.f32885i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32890n = true;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f32888l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f32888l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f32885i = false;
        this.f32884h = false;
    }

    public void setAllowClickSplash(boolean z10) {
        this.f32894r = z10;
        setOnTouchListener(this.f32895s);
    }

    public void setCloseView(View view) {
        this.f32881e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f32887k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f32893q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f32889m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f32884h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f32882f = view;
        this.f32891o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f32886j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f32888l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f32878b != null) {
            f.a().a((WebView) this.f32878b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f32888l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f32892p = bVar;
        MBSplashWebview mBSplashWebview = this.f32878b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f32878b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f32878b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f32892p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f32879c;
                if (aVar != null) {
                    this.f32878b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f32879c = aVar2;
                this.f32878b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                q0.b(f32876u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f32885i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f32892p != null && (viewGroup = this.f32887k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f32892p.a(this.f32887k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f32879c;
            if (aVar != null) {
                aVar.a(this.f32892p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f32877a = getResources().getConfiguration().orientation;
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f32878b != null && !this.f32889m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(qEagQqzJZsd.JktAKx, i10);
                f.a().a((WebView) this.f32878b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f32889m && (view = this.f32888l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f32889m || (dyCountDownListener = this.f32893q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32894r = true;
        this.f32895s = new a();
        this.f32896t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f32896t = true;
        if (this.f32882f == null) {
            if (this.f32889m && (view3 = this.f32888l) != null) {
                if (view3.getParent() != null) {
                    f1.a(this.f32888l);
                }
                addView(this.f32888l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f32878b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f32878b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f32880d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f32880d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f32877a == 2) {
                this.f32883g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f32880d.getId());
                if (this.f32889m && (view2 = this.f32888l) != null) {
                    if (view2.getParent() != null) {
                        f1.a(this.f32888l);
                    }
                    addView(this.f32888l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f32878b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f32878b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f32880d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f32891o.width;
                    f1.a(this.f32882f);
                    int i11 = this.f32883g / 4;
                    if (i10 > i11) {
                        this.f32880d.addView(this.f32882f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f32880d.addView(this.f32882f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f32880d, layoutParams2);
                }
            } else {
                this.f32883g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f32880d.getId());
                if (this.f32889m && (view = this.f32888l) != null) {
                    if (view.getParent() != null) {
                        f1.a(this.f32888l);
                    }
                    addView(this.f32888l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f32878b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f32878b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f32880d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f32891o.height;
                    int i13 = this.f32883g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f32882f);
                    this.f32880d.addView(this.f32882f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f32880d, layoutParams4);
                }
            }
        }
        View view4 = this.f32881e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
                layoutParams5.topMargin = v0.a(getContext(), 10.0f);
                addView(this.f32881e, layoutParams5);
                return;
            }
            bringChildToFront(this.f32881e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f32878b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f32896t) {
                    this.f32896t = false;
                    this.f32878b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f32878b.setObject(this.f32892p);
            this.f32878b.post(new c());
        }
    }
}
