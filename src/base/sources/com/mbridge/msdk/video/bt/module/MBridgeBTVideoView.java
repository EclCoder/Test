package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean P = false;
    private static long Q;
    private AdSession A;
    private AdEvents B;
    private MediaEvents C;
    private d D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private RelativeLayout N;
    private ProgressBar O;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PlayerView f34111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SoundImageView f34112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f34113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f34114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f34115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f34116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private WebView f34117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f34118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f34120y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34121z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zIsSilent = MBridgeBTVideoView.this.f34111p.isSilent();
            if (MBridgeBTVideoView.this.f34117v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f34016n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f34021d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f34117v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    q0.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.E);
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f34117v, e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.f34117v != null) {
                BTBaseView.a(MBridgeBTVideoView.this.f34117v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f34021d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.C != null) {
                try {
                    MBridgeBTVideoView.this.C.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "btv adUserInteraction click");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.f34117v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f34016n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f34021d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f34117v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f34117v, "onClicked", MBridgeBTVideoView.this.f34021d);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f34125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WebView f34126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaEvents f34127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f34128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f34129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f34130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f34131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f34132h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f34136l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f34137m;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f34133i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f34134j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f34135k = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f34138n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f34139o = false;

        public d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f34125a = mBridgeBTVideoView;
            this.f34126b = webView;
            this.f34127c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f34128d = mBridgeBTVideoView.f34021d;
                this.f34129e = mBridgeBTVideoView.f34020c;
            }
        }

        public void b(int i10, int i11) {
            this.f34136l = i10;
            this.f34137m = i11;
            a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f34127c == null || !this.f34139o) {
                    return;
                }
                q0.b("omsdk", "bt onBufferingEnd");
                this.f34139o = false;
                this.f34127c.bufferFinish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                q0.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f34127c != null) {
                    q0.b("omsdk", "bt onBufferingStart");
                    this.f34127c.bufferStart();
                    this.f34139o = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) {
                    return;
                }
                if (this.f34126b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f34016n);
                        jSONObject.put("id", this.f34128d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        f.a().a(this.f34126b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.mbridge.msdk.video.bt.component.d.c().a(this.f34126b, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f34125a;
            CampaignEx campaignEx = mBridgeBTVideoView.f34019b;
            if (campaignEx == null) {
                mBridgeBTVideoView.f34113r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            } else if (campaignEx.getVideoCompleteTime() > 0) {
                this.f34125a.f34113r.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
            } else {
                this.f34125a.f34113r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.f34125a.f34111p.setClickable(false);
            WebView webView = this.f34126b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f34128d);
            }
            MediaEvents mediaEvents = this.f34127c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f34130f = this.f34131g;
            boolean unused = MBridgeBTVideoView.P = true;
            this.f34125a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f34126b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f34017o);
                    jSONObject.put("id", this.f34128d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f34128d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(this.f34126b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f34126b, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) {
            int videoCompleteTime;
            StringBuilder sb2;
            String str;
            String string;
            super.onPlayProgress(i10, i11);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.f34125a;
            if (mBridgeBTVideoView.f34025h) {
                CampaignEx campaignEx = mBridgeBTVideoView.f34019b;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f34125a.f34019b.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                if (videoCompleteTime > i11 || videoCompleteTime <= 0) {
                    videoCompleteTime = i11;
                }
                int i12 = videoCompleteTime <= 0 ? i11 - i10 : videoCompleteTime - i10;
                if (i12 <= 0) {
                    string = videoCompleteTime <= 0 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : (String) this.f34125a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    if (videoCompleteTime <= 0) {
                        sb2 = new StringBuilder();
                        sb2.append(i12);
                        str = "";
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(i12);
                        str = (String) this.f34125a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", "string"));
                    }
                    sb2.append(str);
                    string = sb2.toString();
                }
                CampaignEx campaignEx2 = this.f34125a.f34019b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f34125a.f34019b.getVst(), i11);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i13 = videoCompleteTime - i10;
                        if (this.f34125a.f34019b.getAdType() == 287) {
                            if (i13 > 0) {
                                string = i13 + ((String) this.f34125a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                            } else if (i13 == 0) {
                                this.f34125a.f34113r.setVisibility(4);
                            }
                        }
                    } else {
                        int i14 = iMin - i10;
                        if (i14 > 0) {
                            string = i14 + ((String) this.f34125a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                        } else if (this.f34125a.f34019b.getAdType() == 287 && i14 == 0) {
                            this.f34125a.f34113r.setVisibility(4);
                        }
                    }
                }
                this.f34125a.f34113r.setText(string);
            }
            this.f34131g = i11;
            this.f34130f = i10;
            this.f34125a.O.setMax(this.f34131g);
            this.f34125a.O.setProgress(this.f34130f);
            if (this.f34126b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f34016n);
                    jSONObject.put("id", this.f34128d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f34128d);
                    jSONObject2.put(NotificationCompat.CATEGORY_PROGRESS, MBridgeBTVideoView.b(i10, i11));
                    jSONObject2.put("time", String.valueOf(i10));
                    jSONObject2.put("duration", String.valueOf(i11));
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(this.f34126b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f34126b, e10.getMessage());
                }
            }
            MediaEvents mediaEvents = this.f34127c;
            if (mediaEvents != null) {
                int i15 = (i10 * 100) / i11;
                int i16 = ((i10 + 1) * 100) / i11;
                if (i15 <= 25 && 25 < i16 && !this.f34133i) {
                    this.f34133i = true;
                    mediaEvents.firstQuartile();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i15 <= 50 && 50 < i16 && !this.f34134j) {
                    this.f34134j = true;
                    mediaEvents.midpoint();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i15 <= 75 && 75 < i16 && !this.f34135k) {
                    this.f34135k = true;
                    mediaEvents.thirdQuartile();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) {
            super.onPlayStarted(i10);
            if (!this.f34132h) {
                this.f34125a.O.setMax(i10);
                WebView webView = this.f34126b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f34128d);
                }
                this.f34132h = true;
                if (this.f34127c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f34125a;
                        this.f34127c.start(i10, (mBridgeBTVideoView == null || mBridgeBTVideoView.f34111p == null) ? 0.0f : this.f34125a.f34111p.getVolume());
                        q0.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e10) {
                        q0.b("omsdk", e10.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.P = false;
        }

        private void a() {
            int i10;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i10 = this.f34136l) == 100 || this.f34137m != 0 || this.f34138n || i10 == 0 || (mBridgeBTVideoView = this.f34125a) == null || (campaignEx = mBridgeBTVideoView.f34019b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f34125a.f34019b.getAdType() == 287) {
                    str = this.f34125a.f34019b.getRequestId() + this.f34125a.f34019b.getId() + this.f34125a.f34019b.getVideoUrlEncode();
                } else {
                    str = this.f34125a.f34019b.getId() + this.f34125a.f34019b.getVideoUrlEncode() + this.f34125a.f34019b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f34129e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f34138n = true;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                }
            }
        }

        private void a(int i10, int i11) {
            int i12;
            int i13;
            String str;
            try {
                int i14 = this.f34136l;
                if (i14 == 100 || this.f34138n || i14 == 0 || (i12 = this.f34137m) < 0 || i10 < (i13 = (i11 * i12) / 100)) {
                    return;
                }
                if (this.f34125a.f34019b.getAdType() != 94 && this.f34125a.f34019b.getAdType() != 287) {
                    str = this.f34125a.f34019b.getId() + this.f34125a.f34019b.getVideoUrlEncode() + this.f34125a.f34019b.getBidToken();
                } else {
                    str = this.f34125a.f34019b.getRequestId() + this.f34125a.f34019b.getId() + this.f34125a.f34019b.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f34129e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f34138n = true;
                    q0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i13 + " and start download !");
                }
            } catch (Exception e10) {
                q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
            }
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f34119x = 0;
        this.f34120y = 0;
        this.f34121z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }

    private int getBufferTimeout() {
        int i10 = 5;
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            i10 = aVarC != null ? (int) aVarC.i() : 5;
            q0.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i10);
            return i10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return i10;
        }
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34020c, false).g();
    }

    private String getPlayURL() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.f34019b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f34118w;
            if (aVar != null) {
                String strP = aVar.p();
                if (!a1.a(strP) && new File(strP).exists()) {
                    return strP;
                }
            }
            return videoUrlEncode;
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return videoUrlEncode;
        }
    }

    public AdEvents getAdEvents() {
        return this.B;
    }

    public AdSession getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public MediaEvents getVideoEvents() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(iFindLayout)) {
            this.f34023f.inflate(iFindLayout, this);
            boolean zE = e();
            this.f34025h = zE;
            if (!zE) {
                q0.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            b();
        }
        P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.M) {
            this.H = com.mbridge.msdk.video.bt.component.d.c().g(this.f34020c);
        }
        View view = this.f34114s;
        if (view != null) {
            view.setVisibility(this.f34120y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f34112q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f34121z == 0 ? 8 : 0);
        }
        CampaignEx campaignEx = this.f34019b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f34020c);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34020c + "_1", this.f34019b);
        }
        TextView textView = this.f34113r;
        if (textView != null) {
            textView.setVisibility(this.f34119x == 0 ? 8 : 0);
            if (this.f34113r.getVisibility() == 0 && com.mbridge.msdk.foundation.feedback.b.b().a()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f34020c + "_1", this.f34115t);
            }
        }
        if (this.A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.A.removeFriendlyObstruction(rootView);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f34111p != null) {
                AdSession adSession = this.A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.f34111p.setOnClickListener(null);
                this.f34111p.release();
                this.f34111p = null;
                if (!TextUtils.isEmpty(this.J)) {
                    e eVar = new e();
                    long jCurrentTimeMillis = Q;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - Q;
                    }
                    eVar.a("duration", Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f34019b, eVar);
                }
            }
            SoundImageView soundImageView = this.f34112q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f34114s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f34117v != null) {
                this.f34117v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.L = zIsPlayIng;
            this.f34111p.setIsBTVideoPlaying(zIsPlayIng);
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                this.f34111p.setVideoEvents(mediaEvents);
            }
            this.f34111p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f34111p.setIsCovered(false);
            if (this.L) {
                this.f34111p.start(true);
            }
            this.f34111p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f34111p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f34117v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f34021d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.M) {
                if (this.G) {
                    this.f34111p.playVideo(0);
                    this.G = false;
                } else {
                    this.f34111p.start(false);
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    q0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f34117v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f34021d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.J = playURL;
            this.f34111p.initVFPData(playURL, this.f34019b.getVideoUrlEncode(), this.D);
            if (this.H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.B != null) {
                    q0.b("omsdk", "bt impressionOccurred");
                    this.B.impressionOccurred();
                }
            } catch (Throwable th3) {
                q0.a(BTBaseView.TAG, th3.getMessage());
            }
            if (!this.f34111p.playVideo() && (dVar = this.D) != null) {
                dVar.onPlayError("play video failed");
            }
            this.M = true;
            return;
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
        q0.b(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f34111p;
            if (playerView != null && this.f34117v != null) {
                playerView.closeSound();
                this.f34112q.setSoundStatus(false);
                this.E = 1;
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e10) {
                    q0.a("OMSDK", e10.getMessage());
                }
                BTBaseView.a(this.f34117v, "onPlayerMute", this.f34021d);
                return true;
            }
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f34111p;
            if (playerView == null || this.f34117v == null) {
                return false;
            }
            playerView.openSound();
            this.f34112q.setSoundStatus(true);
            this.E = 2;
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e10) {
                q0.a("OMSDK", e10.getMessage());
            }
            BTBaseView.a(this.f34117v, "onUnmute", this.f34021d);
            return true;
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        d();
        this.F = getBufferTimeout();
        String playURL = getPlayURL();
        this.J = playURL;
        if (this.f34025h && !TextUtils.isEmpty(playURL) && this.f34019b != null) {
            AdSession adSession = this.A;
            if (adSession != null) {
                adSession.registerAdView(this.f34111p);
                AdSession adSession2 = this.A;
                SoundImageView soundImageView = this.f34112q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession2.addFriendlyObstruction(soundImageView, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f34113r, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f34114s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            d dVar = new d(this, this.f34117v, this.C);
            this.D = dVar;
            dVar.b(a(this.f34019b), getCDRate());
            this.f34111p.setDesk(false);
            this.f34111p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        P = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f34111p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    q0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f34117v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f34021d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.B = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.A = adSession;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f34113r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", "drawable"));
            this.f34113r.setWidth(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
            return;
        }
        this.f34113r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
        int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, 0, 0, 0);
        this.f34113r.setPadding(iA, 0, iA, 0);
        this.f34113r.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i10) {
        this.f34114s.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i10) {
        this.f34113r.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f34117v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.N.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.N.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.N.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.N.getPaddingBottom();
        }
        q0.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.N.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.I = i10;
    }

    public void setPlaybackParams(float f10) {
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            playerView.setPlaybackParams(f10);
        }
    }

    public void setProgressBarState(int i10) {
        ProgressBar progressBar = this.O;
        if (progressBar != null) {
            progressBar.setVisibility(i10 == 0 ? 8 : 0);
            CampaignEx campaignEx = this.f34019b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.O.setVisibility(0);
        }
    }

    public void setShowClose(int i10) {
        this.f34120y = i10;
    }

    public void setShowMute(int i10) {
        this.f34121z = i10;
    }

    public void setShowTime(int i10) {
        this.f34119x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        this.f34112q.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.C = mediaEvents;
        d dVar = this.D;
        if (dVar != null) {
            dVar.f34127c = mediaEvents;
        }
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVolume(float f10, float f11) {
        PlayerView playerView = this.f34111p;
        if (playerView != null) {
            playerView.setVolume(f10, f11);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f34025h) {
            this.E = i10;
            if (i10 == 1) {
                this.f34112q.setSoundStatus(false);
                this.f34111p.closeSound();
            } else if (i10 == 2) {
                this.f34112q.setSoundStatus(true);
                this.f34111p.openSound();
            }
            if (i11 == 1) {
                this.f34112q.setVisibility(8);
            } else if (i11 == 2) {
                this.f34112q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.f34111p.getVolume());
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f34111p;
            if (playerView != null) {
                playerView.pause();
                this.f34111p.stop();
                this.G = true;
                WebView webView = this.f34117v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f34021d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    private void d() {
        String str;
        if (this.f34019b.getAdType() == 94 || this.f34019b.getAdType() == 287) {
            str = this.f34019b.getRequestId() + this.f34019b.getId() + this.f34019b.getVideoUrlEncode();
        } else {
            str = this.f34019b.getId() + this.f34019b.getVideoUrlEncode() + this.f34019b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f34020c, str);
        if (aVarA != null) {
            this.f34118w = aVarA;
        }
    }

    private boolean e() {
        try {
            this.f34111p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f34112q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f34113r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f34114s = findViewById(findID("mbridge_rl_playing_close"));
            this.N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f34111p.setIsBTVideo(true);
            this.f34115t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f34116u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f34111p, this.f34112q, this.f34113r, this.f34114s);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    protected void b() {
        super.b();
        if (this.f34025h) {
            this.f34112q.setOnClickListener(new a());
            this.f34114s.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34020c, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34020c, false).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34119x = 0;
        this.f34120y = 0;
        this.f34121z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }
}
