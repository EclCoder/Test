package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    Handler L;
    private boolean M;
    private boolean N;
    boolean O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View f34480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f34481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ImageView f34482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f34483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Handler f34485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f34486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f34487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f34488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f34492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f34493z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f34483p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        jSONObject.put("startX", v0.b(contextD, iArr[0]));
                        jSONObject.put("startY", v0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f30490l, v0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f34483p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f34483p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34500a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f34500a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                q0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34500a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34502a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f34502a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34502a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f34493z) {
                return;
            }
            this.f34502a.f34493z = true;
            this.f34502a.f34487t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f34502a.notifyListener.a(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34505b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f34504a = mBridgeH5EndCardView;
            this.f34505b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34504a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f34433b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f34492y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f34504a.f34492y = true;
                n nVar = new n("m_download_end", 12, (this.f34505b * 1000) + "", this.f34504a.f34433b.getendcard_url(), this.f34504a.f34433b.getId(), this.f34504a.unitId, "ready timeout", (a1.b(this.f34504a.f34433b.getendcard_url()) && this.f34504a.f34433b.getendcard_url().contains(".zip")) ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
                try {
                    if (this.f34504a.f34433b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f34504a.f34433b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f34504a.f34433b.getAdType() == 42) {
                        nVar.a(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f34504a.f34433b.getRequestId());
                nVar.k(this.f34504a.f34433b.getCurrentLocalRid());
                nVar.o(this.f34504a.f34433b.getRequestIdNotice());
                nVar.a(this.f34504a.f34433b.getAdSpaceT());
                this.f34504a.isLoadSuccess();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34506a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f34506a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34506a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34508a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f34508a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34508a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f34510a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f34510a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f34510a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f34510a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f34484q = false;
        this.f34485r = new Handler();
        this.f34487t = false;
        this.f34488u = false;
        this.f34489v = false;
        this.f34490w = 1;
        this.f34491x = 1;
        this.f34492y = false;
        this.f34493z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = m0.n(getContext());
            float fM = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f34483p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34483p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
        WindVaneWebView windVaneWebView = this.f34483p;
        aVarA.b(windVaneWebView, windVaneWebView.getLeft(), this.f34483p.getTop(), this.f34483p.getWidth(), this.f34483p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
        WindVaneWebView windVaneWebView2 = this.f34483p;
        aVarA2.a(windVaneWebView2, windVaneWebView2.getLeft(), this.f34483p.getTop(), this.f34483p.getWidth(), this.f34483p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34483p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34483p, com.mbridge.msdk.mbsignalcommon.mraid.d.f31667f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34483p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f34482o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f34485r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f34489v || this.f34490w <= -1) {
            return;
        }
        this.f34485r.postDelayed(new k(this), this.f34490w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f34485r.postDelayed(new g(this), i10 * 1000);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f34433b;
    }

    protected String getURL() {
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.f34489v = false;
            String mraid = this.f34433b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f34433b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f34433b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f34433b.getendcard_url();
        if (a1.a(str)) {
            this.f34489v = false;
            return this.f34433b.getEndScreenUrl();
        }
        this.f34489v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            return h5ResAddress + "&native_adtype=" + this.f34433b.getAdType();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.f34433b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f34489v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        return str + "&native_adtype=" + this.f34433b.getAdType();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f34488u) {
            return;
        }
        this.f34488u = true;
        this.f34487t = false;
        if (this.f34433b != null) {
            n nVar = new n();
            nVar.n(this.f34433b.getRequestId());
            nVar.o(this.f34433b.getRequestIdNotice());
            nVar.b(this.f34433b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f34432a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f34434c.inflate(iFindLayout, (ViewGroup) null);
            this.f34480m = viewInflate;
            try {
                this.f34436e = a(viewInflate);
            } catch (Exception unused) {
                this.f34436e = false;
            }
            addView(this.f34480m, getContentLayoutParams());
            d();
            j();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f34487t;
    }

    public boolean isPlayable() {
        return this.f34489v;
    }

    protected void j() {
        if (this.f34436e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.D || (((z10 = this.E) && this.F) || (!(z10 || !this.G || this.O) || (!z10 && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f34483p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f34483p, "onSystemDestory", "");
                new Thread(new f(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.notifyListener.a(103, "");
            this.notifyListener.a(Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, "close webview exception" + e10.getMessage());
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f34433b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f34483p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f34483p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f34483p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f34436e || this.f34433b == null || TextUtils.isEmpty(url) || this.f34483p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            this.notifyListener.a(129, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f34433b);
            aVar.a(this.f34433b.getAppName());
            this.f34483p.setDownloadListener(aVar);
            this.f34483p.setCampaignId(this.f34433b.getId());
            this.f34483p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null) {
                this.f34483p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f34483p.setApiManagerJSFactory(bVar);
            if (this.f34433b.isMraid()) {
                this.f34483p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.f34483p, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
            this.f34483p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f34433b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f34486s)) {
                this.f34483p.loadUrl(url);
            } else {
                this.f34483p.loadDataWithBaseURL(url, this.f34486s, "text/html", C.UTF8_NAME, null);
            }
        }
        this.O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    public void release() {
        Handler handler = this.f34485r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f34485r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f34481n.removeAllViews();
        this.f34483p.release();
        this.f34483p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f34433b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f34433b == null || this.f34488u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f34433b.getRequestId());
        nVar.o(this.f34433b.getRequestIdNotice());
        nVar.b(this.f34433b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        int adType = this.f34433b.getAdType();
        String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
        if (adType == 287) {
            nVar.a("3");
        } else if (this.f34433b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f34433b.getAdType() == 42) {
            nVar.a(MBridgeConstans.API_REUQEST_CATEGORY_APP);
        }
        if (this.f34433b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.f34433b.getendcard_url());
            if (a1.b(this.f34433b.getendcard_url()) && this.f34433b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f34433b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f34490w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f34436e) {
            this.f34482o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f34436e) {
            this.I = true;
            if (i10 == 4) {
                this.f34482o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f34482o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f34482o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f34488u = z10;
    }

    public void setHtmlSource(String str) {
        this.f34486s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f34482o.getLayoutParams();
        int iA = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f34482o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f34491x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f34433b.getendcard_url();
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split("&");
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (a1.b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            iA = v0.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f34482o.getVisibility();
        if (i10 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.D = false;
            if (this.O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34483p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f34483p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34496a;

        c(boolean z10) {
            this.f34496a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            q0.c("WindVaneWebView", "h5EncardView readyStatus:" + i10 + "- isError" + MBridgeH5EndCardView.this.f34488u);
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f34488u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.f34496a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f34433b, eVar);
                } catch (Throwable th2) {
                    q0.b("WindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f34488u) {
                return;
            }
            mBridgeH5EndCardView.f34487t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f34433b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f34433b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f34433b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f34433b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                int adType = MBridgeH5EndCardView.this.f34433b.getAdType();
                String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                if (adType == 287) {
                    nVar.a("3");
                } else if (MBridgeH5EndCardView.this.f34433b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f34433b.getAdType() == 42) {
                    nVar.a(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                }
                if (MBridgeH5EndCardView.this.f34433b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f34433b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.f34433b.getendcard_url()) && MBridgeH5EndCardView.this.f34433b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f34433b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, "");
            if (this.f34496a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f34433b, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f34488u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.f34488u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f34493z) {
                MBridgeH5EndCardView.this.f34493z = true;
                if (i10 == 1) {
                    MBridgeH5EndCardView.this.reportRenderResult("success", 4);
                } else {
                    MBridgeH5EndCardView.this.notifyListener.a(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, CIdIVqKnNZ.xIXwPPpzDKSs);
                    MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
                }
            }
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i10 = this.f34490w;
        if (i10 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i10 > -1) {
            this.f34485r.postDelayed(new i(this), this.f34490w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i10 = this.f34491x;
        if (i10 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i10 > -1) {
            this.f34485r.postDelayed(new j(this), this.f34491x * 1000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:38:0x008e BREAK  A[LOOP:0: B:22:0x0052->B:32:0x007d]] */
    private void h() {
        int iV;
        try {
            this.B = System.currentTimeMillis();
            String str = this.f34433b.getendcard_url();
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.unitId);
            if (this.f34489v && a1.b(str)) {
                if (!str.contains("wfr=1") && (cVarC == null || cVarC.v() <= 0)) {
                    return;
                }
                if (str.contains("wfr=1")) {
                    String[] strArrSplit = str.split("&");
                    if (strArrSplit != null && strArrSplit.length > 0) {
                        int length = strArrSplit.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                iV = 20;
                                break;
                            }
                            String str2 = strArrSplit[i10];
                            if (a1.b(str2) && str2.contains("to") && str2.split("=") != null && str2.split("=").length > 0) {
                                iV = v0.a((Object) str2.split("=")[1]);
                                break;
                            }
                            i10++;
                        }
                    } else {
                        iV = 20;
                        break;
                    }
                } else {
                    if (cVarC == null || cVarC.v() <= 0) {
                        iV = 20;
                        break;
                    }
                    iV = cVarC.v();
                }
                if (iV >= 0) {
                    excuteEndCardShowTask(iV);
                } else {
                    excuteEndCardShowTask(20);
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f34433b);
            }
            CampaignEx campaignEx2 = this.f34433b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f34482o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.f34433b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f34436e) {
            this.f34482o.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.f34482o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f34481n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f34483p = windVaneWebView;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f34483p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f34481n.addView(this.f34483p);
        return isNotNULL(this.f34482o, this.f34483p);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements com.mbridge.msdk.foundation.feedback.a {
        e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f34483p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f34483p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f34483p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x007c A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    public void a(long j10, boolean z10) {
        int i10;
        int i11;
        n nVar;
        try {
            if (this.f34492y) {
                return;
            }
            this.f34492y = true;
            String str = (a1.b(this.f34433b.getendcard_url()) && this.f34433b.getendcard_url().contains(".zip")) ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP;
            String str2 = "ready yes";
            int i12 = 2;
            try {
                if (z10) {
                    str2 = "ready timeout";
                    i10 = 12;
                } else {
                    if (this.A == 2) {
                        str2 = "ready no";
                        i12 = 3;
                        i10 = 11;
                    } else {
                        i10 = 10;
                        i11 = 1;
                    }
                    String str3 = str2;
                    nVar = new n("m_download_end", i10, j10 + "", this.f34433b.getendcard_url(), this.f34433b.getId(), this.unitId, str3, str);
                    if (this.f34433b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f34433b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f34433b.getAdType() == 42) {
                        nVar.a(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    }
                    nVar.n(this.f34433b.getRequestId());
                    nVar.k(this.f34433b.getCurrentLocalRid());
                    nVar.o(this.f34433b.getRequestIdNotice());
                    nVar.a(this.f34433b.getAdSpaceT());
                    a(nVar, this.f34433b);
                    if (isLoadSuccess() && i11 == 1) {
                        nVar.d(i11);
                        nVar.e(String.valueOf(j10));
                        nVar.b(this.f34433b.getId());
                        nVar.m(str3);
                        if (this.f34433b.isMraid()) {
                            nVar.b(n.N);
                        } else {
                            nVar.g(this.f34433b.getendcard_url());
                            nVar.f(str);
                            nVar.b(n.O);
                        }
                        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f34433b);
                        return;
                    }
                }
                if (this.f34433b.getAdType() == 287) {
                    nVar.a("3");
                } else if (this.f34433b.getAdType() == 94) {
                    nVar.a("1");
                } else if (this.f34433b.getAdType() == 42) {
                    nVar.a(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
            i11 = i12;
            String str4 = str2;
            nVar = new n("m_download_end", i10, j10 + "", this.f34433b.getendcard_url(), this.f34433b.getId(), this.unitId, str4, str);
            nVar.n(this.f34433b.getRequestId());
            nVar.k(this.f34433b.getCurrentLocalRid());
            nVar.o(this.f34433b.getRequestIdNotice());
            nVar.a(this.f34433b.getAdSpaceT());
            a(nVar, this.f34433b);
            if (isLoadSuccess()) {
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34484q = false;
        this.f34485r = new Handler();
        this.f34487t = false;
        this.f34488u = false;
        this.f34489v = false;
        this.f34490w = 1;
        this.f34491x = 1;
        this.f34492y = false;
        this.f34493z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b(dmHT.LMhKPeXt, e10.getMessage());
        }
    }
}
