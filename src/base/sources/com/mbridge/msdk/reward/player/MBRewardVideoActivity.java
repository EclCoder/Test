package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.impl.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBTempContainer A;
    private MBridgeBTContainer B;
    private WindVaneWebView C;
    private com.mbridge.msdk.video.bt.module.listener.a D;
    private String E;
    private String F;
    private boolean G;
    private String O;
    private com.mbridge.msdk.foundation.same.report.metrics.c P;
    private boolean R;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f32340j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32346p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f32349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f32350t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f32353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CampaignEx f32354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f32355y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<CampaignEx> f32356z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32341k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32342l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32343m = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f32347q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32348r = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f32351u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f32352v = false;
    private int H = 1;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private int N = 0;
    private boolean Q = false;
    private AdSession S = null;
    private MediaEvents T = null;
    private AdEvents U = null;
    private long V = 0;
    private String W = "";
    private Boolean X = null;
    private int Y = 0;
    private boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f32331a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f32332b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f32333c0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f32334d0 = "null";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f32335e0 = new a();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f32336f0 = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements com.mbridge.msdk.video.dynview.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f32341k = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int iIntValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f32356z == null || MBRewardVideoActivity.this.f32356z.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f32354x = (CampaignEx) mBRewardVideoActivity.f32356z.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f32356z.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f32356z.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f32354x.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f32354x.getVideoCompleteTime(), MBRewardVideoActivity.this.H));
                MBRewardVideoActivity.this.f32354x.setShowIndex(MBRewardVideoActivity.this.H);
                MBRewardVideoActivity.this.f32354x.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f32354x);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements com.mbridge.msdk.foundation.feedback.a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f32361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32363c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f32361a = list;
            this.f32362b = str;
            this.f32363c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f32361a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f32361a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx campaignExH = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExH);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f32362b, campaignExH.getRequestId() + campaignExH.getId() + campaignExH.getVideoUrlEncode());
                        if (campaignExH.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExH.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.f32362b + "_" + campaignExH.getId() + "_" + this.f32363c + "_" + campaignExH.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(campaignExH.getAdType(), campaignExH);
                            }
                            if (!TextUtils.isEmpty(campaignExH.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f32362b + "_" + this.f32363c + "_" + campaignExH.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f32362b, campaignExH);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f32364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32365b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f32364a = list;
            this.f32365b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f32364a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f32364a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.f32365b);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.H;
        mBRewardVideoActivity.H = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f32354x;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f32354x.getRewardTemplateMode().g() == 0) {
                if (i10 == 2) {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG2 = v0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG = v0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f32354x.getRewardTemplateMode().g() == 2) {
                iF = (int) (v0.f(this) * 0.6f);
                iG2 = v0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (v0.f(this) * 0.6f);
                iG = v0.g(this);
                f10 = iG * 0.7f;
            }
            int i11 = (int) f10;
            layoutParams.height = iF;
            layoutParams.width = i11;
            this.A.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        this.Z = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32337g);
        if (this.S != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.S.removeAllFriendlyObstructions();
            this.S.finish();
            this.S = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
        this.f32332b0 = true;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.f32331a0 = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.A.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
            this.f32334d0 = com.mbridge.msdk.foundation.controller.c.n().f().getClass().getSimpleName();
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.V = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.W)) {
            str = "onCreate";
        } else {
            str = this.W + "_onCreate";
        }
        this.W = str;
        try {
            Intent intent = getIntent();
            this.f32337g = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f32338h = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f32340j = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f32339i = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f32341k = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.f32342l = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c.n().b(this.f32342l ? 287 : 94);
            this.f32343m = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.F = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            this.Q = intent.getBooleanExtra("is_refactor", false);
            if ((intent.getFlags() & 268435456) != 0) {
                this.f32333c0 = 0;
            } else {
                this.f32333c0 = 1;
            }
            if (this.Q) {
                this.f32349s = MBridgeGlobalCommon.showRewardListenerMap.get(this.f32337g);
            } else {
                this.f32349s = com.mbridge.msdk.reward.controller.a.f32237f0.get(this.f32337g);
            }
            if (this.f32342l) {
                this.f32344n = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f32345o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f32346p = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f32347q = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f32355y = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f32337g);
            this.f32356z = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f32337g);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f32337g)) {
                b("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f32349s;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.Y = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f32338h, this.f32337g);
            this.f32350t = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32337g);
                this.f32350t = cVarC;
                if (cVarC == null) {
                    this.f32350t = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32337g, this.f32342l);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f32350t;
            if (cVar2 != null) {
                this.f32340j.a(cVar2.d());
                this.f32340j.b(this.f32350t.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f32340j;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f32340j.a(1);
            }
            int iA = i0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(iA) && i0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f32352v = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f32347q);
            if (!this.f32347q) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f32355y;
                if (list2 != null && list2.size() > 0) {
                    this.f32353w = this.f32355y.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f32353w;
                if (aVar != null) {
                    this.f32354x = aVar.h();
                    this.f32353w.b(true);
                    this.f32353w.d(false);
                    CampaignEx campaignEx = this.f32354x;
                    if (campaignEx != null) {
                        this.O = campaignEx.getCurrentLocalRid();
                        this.f32354x.setShowIndex(1);
                        this.f32354x.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f32233b0 = this.f32354x.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32354x.getMaitve(), this.f32354x.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f32354x;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f32353w != null && this.f32354x != null && this.f32340j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f32354x);
                    a(arrayList);
                    b(this.f32354x);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f32356z);
            this.E = "";
            List<CampaignEx> list3 = this.f32356z;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f32356z.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.f32356z, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.E = campaignEx3.getRequestId();
                this.O = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f32233b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f32337g + "_" + this.E + "_" + cMPTEntryUrl);
            this.C = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f32353w == null && (list = this.f32355y) != null && list.size() > 0) {
                    this.f32353w = this.f32355y.get(0);
                }
                if (this.f32353w == null) {
                    this.f32353w = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f32342l ? 287 : 94, this.f32337g, this.f32343m);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f32353w;
                if (aVar2 != null) {
                    this.f32354x = aVar2.h();
                    this.f32353w.b(true);
                    this.f32353w.d(false);
                }
                if (this.f32353w != null && this.f32354x != null && this.f32340j != null) {
                    this.f32347q = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f32356z);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f32354x = campaignEx4;
                        if (campaignEx4 != null) {
                            this.O = campaignEx4.getCurrentLocalRid();
                            this.f32354x.setCampaignIsFiltered(true);
                        }
                        c(this.f32354x);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f32356z.get(0));
            WindVaneWebView windVaneWebView = this.C;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.f32356z.get(0).getLocalRequestId(), this.f32356z.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.C.getObject();
                    kVar.setAdEvents(this.U);
                    kVar.setAdSession(this.S);
                    kVar.setVideoEvents(this.T);
                    this.C.setObject(kVar);
                } catch (Exception e11) {
                    q0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th2) {
            a(this.f32356z);
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.W)) {
            str = "onDestroy";
        } else {
            str = this.W + "_onDestroy";
        }
        this.W = str;
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.W) ? "unKnown" : this.W);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.V));
        Boolean bool = this.X;
        int i11 = 0;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.booleanValue() ? 1 : 2;
        }
        eVar.a("is_unexpected_destroy", Integer.valueOf(i10));
        eVar.a("is_listener_null", Integer.valueOf(this.f32349s == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Z ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.f32331a0 ? 1 : 2));
        eVar.a("is_back_dispatcher_invoked", Integer.valueOf(this.f32332b0 ? 1 : 2));
        h hVar = this.f32349s;
        if (hVar != null) {
            i11 = hVar.hashCode() == this.Y ? 1 : 2;
        }
        eVar.a("is_listener_change", Integer.valueOf(i11));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f32354x, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f32337g);
        h();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        this.f32335e0 = null;
        this.f32336f0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32337g + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32337g + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f32355y, this.f32337g, this.E));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (TextUtils.isEmpty(this.W)) {
            str = "onPause";
        } else {
            str = this.W + "_onPause";
        }
        this.W = str;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        String str;
        super.onRestart();
        if (TextUtils.isEmpty(this.W)) {
            str = "onRestart";
        } else {
            str = this.W + "_onRestart";
        }
        this.W = str;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        String str;
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (TextUtils.isEmpty(this.W)) {
            str = "onResume";
        } else {
            str = this.W + "_onResume";
        }
        this.W = str;
        if (com.mbridge.msdk.foundation.feedback.b.f30438f) {
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f32337g, this.f32355y));
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.A;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f32352v);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        String str;
        super.onStart();
        if (TextUtils.isEmpty(this.W)) {
            str = "onStart";
        } else {
            str = this.W + "_onStart";
        }
        this.W = str;
        if (com.mbridge.msdk.foundation.feedback.b.f30438f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f32354x.setCampaignUnitId(this.f32337g);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f32337g + "_1", this.f32354x);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f32356z;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f32356z.get(0);
                campaignEx.setCampaignUnitId(this.f32337g);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f32337g + "_1", campaignEx);
            }
        }
        if (this.G) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f32337g + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32337g + "_2");
        this.G = true;
    }

    @Override // android.app.Activity
    protected void onStop() {
        String str;
        if (TextUtils.isEmpty(this.W)) {
            str = "onStop";
        } else {
            str = this.W + "_onStop";
        }
        this.W = str;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.J = i11;
        this.L = i12;
        this.K = i13;
        this.M = i14;
        this.N = i10;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
            i19 = i14;
            i18 = i13;
            i17 = i12;
            i16 = i11;
            i15 = i10;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = i12;
            i18 = i13;
            i19 = i14;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i15, i16, i17, i18, i19);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i15, i16, i17, i18, i19);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements com.mbridge.msdk.video.bt.module.listener.a {
        c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(MBRewardVideoActivity.this.P);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(MBRewardVideoActivity.this.P, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(MBRewardVideoActivity.this.P, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f32349s != null) {
                MBRewardVideoActivity.this.f32349s.a(i10, str, str2);
            }
        }
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.I - i10;
        mBRewardVideoActivity.I = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExH;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f32355y;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f32355y) {
                    if (aVar != null && (campaignExH = aVar.h()) != null && TextUtils.equals(campaignExH.getId(), campaignEx.getId()) && TextUtils.equals(campaignExH.getRequestId(), campaignEx.getRequestId())) {
                        this.f32353w = aVar;
                    }
                }
            }
            this.f32347q = true;
            j();
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.N, this.J, this.L, this.K, this.M);
            }
        } catch (Exception e10) {
            q0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f32350t, this.f32337g);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f32337g, this.f32342l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.S;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.f32349s;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.X = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.X = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void g() {
        try {
            Boolean bool = this.X;
            if (bool != null && !bool.booleanValue()) {
                return;
            }
            h hVar = this.f32349s;
            if (hVar != null) {
                hVar.a(this.P, "show fail : unexpected destroy");
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f32356z;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f32356z.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f32354x;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.D == null) {
            this.D = new c();
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!i0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.A = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f32356z;
        if (list3 == null || list3.size() <= 0 || !this.f32356z.get(0).isDynamicView()) {
            this.A.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.A, 500L);
        }
        changeHalfScreenPadding(-1);
        this.A.setActivity(this);
        this.A.setBidCampaign(this.f32343m);
        this.A.setBigOffer(this.f32347q);
        this.A.setUnitId(this.f32337g);
        this.A.setCampaign(this.f32354x);
        if (this.f32354x.getDynamicTempCode() == 5 && (list2 = this.f32356z) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID(lkCBSIFlvmyGX.lXLNIMpGDloKKmK));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.A.removeAllViews();
            this.A.setCampOrderViewData(this.f32356z, this.I);
            this.A.setCamPlayOrderCallback(this.f32335e0, this.H);
        }
        this.A.setCampaignDownLoadTask(this.f32353w);
        this.A.setIV(this.f32342l);
        CampaignEx campaignEx2 = this.f32354x;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.A.setIVRewardEnable(this.f32344n, this.f32345o, this.f32346p);
        } else {
            this.A.setIVRewardEnable(0, 0, 0);
        }
        this.A.setMute(this.f32341k);
        CampaignEx campaignEx3 = this.f32354x;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f32356z) != null && list.size() > 0 && this.f32356z.get(0) != null && (rewardPlus = this.f32356z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f32340j = cVar;
        }
        this.A.setReward(this.f32340j);
        this.A.setRewardUnitSetting(this.f32350t);
        this.A.setPlacementId(this.f32338h);
        this.A.setUserId(this.f32339i);
        this.A.setShowRewardListener(this.f32349s);
        this.A.setDeveloperExtraData(this.F);
        this.A.init(this);
        this.A.setAdSession(this.S);
        this.A.setAdEvents(this.U);
        this.A.setVideoEvents(this.T);
        this.A.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f32354x) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!i0.a(iFindID)) {
            b(SVWsZyNSAChGIA.RlBEIbQirxr);
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.B = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.B.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.D = aVarI;
        this.B.setBTContainerCallback(aVarI);
        this.B.setShowRewardVideoListener(this.f32349s);
        this.B.setChoiceOneCallback(this.f32336f0);
        this.B.setCampaigns(this.f32356z);
        this.B.setCampaignDownLoadTasks(this.f32355y);
        this.B.setRewardUnitSetting(this.f32350t);
        this.B.setUnitId(this.f32337g);
        this.B.setPlacementId(this.f32338h);
        this.B.setUserId(this.f32339i);
        this.B.setActivity(this);
        CampaignEx campaignEx = this.f32354x;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f32356z.get(0) != null && (rewardPlus = this.f32356z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f32340j = cVar;
        }
        this.B.setReward(this.f32340j);
        this.B.setIVRewardEnable(this.f32344n, this.f32345o, this.f32346p);
        this.B.setIV(this.f32342l);
        this.B.setMute(this.f32341k);
        this.B.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.B.setDeveloperExtraData(this.F);
        this.B.init(this);
        this.B.setAdSession(this.S);
        this.B.setVideoEvents(this.T);
        this.B.setAdEvents(this.U);
        this.B.onCreate(this.Q);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f32356z) == null || list.size() <= 0 || this.f32356z.get(0) == null) {
            return;
        }
        d(this.f32356z.get(0));
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.S == null) {
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f32337g, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.S = adSessionA;
                    if (adSessionA != null) {
                        this.U = AdEvents.createAdEvents(adSessionA);
                        this.T = MediaEvents.createMediaEvents(this.S);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements com.mbridge.msdk.video.dynview.listener.d {
        b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f32354x = campaignEx;
            MBRewardVideoActivity.this.f32354x.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f32354x);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() {
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f32347q = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.A != null) {
                MBRewardVideoActivity.this.A.setNotchPadding(MBRewardVideoActivity.this.N, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.M);
            }
        }
    }

    private WindVaneWebView a(String str) {
        com.mbridge.msdk.videocommon.a.C0480a c0480aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0480aB != null) {
            return c0480aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f32356z;
        if (list != null && list.size() != 0) {
            int videoLength = 0;
            int videoCompleteTime = 0;
            for (int i12 = 0; i12 < this.f32356z.size(); i12++) {
                if (this.f32356z.get(0) != null) {
                    if (i12 == 0) {
                        videoCompleteTime = this.f32356z.get(0).getVideoCompleteTime();
                    }
                    videoLength += this.f32356z.get(i12).getVideoLength();
                }
            }
            if (i11 == 1) {
                if (i10 == 0) {
                    if (videoLength >= 45) {
                        return 45;
                    }
                } else if (videoLength > i10) {
                    if (i10 > 45) {
                        return 45;
                    }
                }
                return videoLength;
            }
            int videoLength2 = 0;
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                if (this.f32356z.get(i13) != null) {
                    videoLength2 += this.f32356z.get(i13).getVideoLength();
                }
            }
            if (videoCompleteTime > videoLength2) {
                return videoCompleteTime - videoLength2;
            }
            return 0;
        }
        return i10;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int iA = a(campaignEx.getVideoCompleteTime(), this.H);
            this.f32354x = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.H = 1;
            this.f32354x.setVideoCompleteTime(iA);
            this.f32354x.setShowIndex(this.H);
            this.f32354x.setShowType(1);
            c(this.f32354x);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.O = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.I += campaignEx.getVideoLength();
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl());
        }
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.R) {
            return;
        }
        if (list == null) {
            try {
                if (this.f32347q) {
                    list = this.f32356z;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f32355y;
                    if (list2 != null && list2.get(0) != null && this.f32355y.get(0).h() != null) {
                        list.add(this.f32355y.get(0).h());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("context_status", Integer.valueOf(this.f32333c0));
            eVar.a("activity_name", this.f32334d0);
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            this.P = cVarB;
            cVarB.a("2000129", eVar);
        }
        if (this.P == null) {
            this.P = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32337g);
            eVar2.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f32343m ? 1 : 0));
            eVar2.a("adtp", Integer.valueOf(this.f32342l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar2.a("lrid", this.O);
            eVar2.a("his_reason", "show campaign is null");
            eVar2.a("context_status", Integer.valueOf(this.f32333c0));
            eVar2.a("activity_name", this.f32334d0);
            this.P.a("2000129", eVar2);
        }
        if (list != null) {
            this.P.b(list);
        }
        this.R = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.f32356z);
        h hVar = this.f32349s;
        if (hVar != null) {
            hVar.a(this.P, str);
        }
        finish();
    }
}
