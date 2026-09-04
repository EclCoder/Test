package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler L = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a F;
    private VideoNativePlayer G;
    private h H;
    private AdSession I;
    private MediaEvents J;
    private boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f31830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextureView f31833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f31834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Surface f31835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ProgressBar f31836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MyImageView f31837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f31838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f31839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f31840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f31841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f31842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AnimationDrawable f31843y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AlphaAnimation f31844z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (MediaViewPlayerView.this.f31829k) {
                    MediaViewPlayerView.this.closeSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.b();
                        return;
                    }
                    return;
                }
                MediaViewPlayerView.this.openSound();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.a();
                }
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.f31838t.setVisibility(0);
                MediaViewPlayerView.this.n();
                MediaViewPlayerView.this.c();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.c();
                }
                MediaViewPlayerView.this.f31823e = true;
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.c();
                MediaViewPlayerView.this.f();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class g extends TimerTask {
        g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f31852a;

        public h(MediaViewPlayerView mediaViewPlayerView) {
            this.f31852a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f31852a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.f31828j) {
                    return;
                }
                q0.c("MediaViewPlayerView", "play end and display endcardView");
                this.f31852a.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private class i implements TextureView.SurfaceTextureListener {
        private i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            try {
                MediaViewPlayerView.this.f31835q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f31825g = true;
                MediaViewPlayerView.this.f31827i = true;
                if (MediaViewPlayerView.this.f31822d) {
                    if (MediaViewPlayerView.this.f31826h) {
                        MediaViewPlayerView.this.f31821c = false;
                        MediaViewPlayerView.this.f31826h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f31823e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m();
                    return;
                }
                if (MediaViewPlayerView.this.f31820b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.G != null && MediaViewPlayerView.this.G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f31821c = true;
                MediaViewPlayerView.this.f31825g = false;
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            q0.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        /* synthetic */ i(MediaViewPlayerView mediaViewPlayerView, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f31819a = false;
        this.f31820b = false;
        this.f31821c = false;
        this.f31822d = false;
        this.f31823e = false;
        this.f31824f = false;
        this.f31825g = false;
        this.f31826h = true;
        this.f31827i = false;
        this.f31828j = true;
        this.f31829k = false;
        this.f31830l = -1;
        this.f31831m = true;
        this.f31832n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    private String getPlayUrl() {
        String str;
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return null;
            }
            try {
                if (this.F == null) {
                    if (campaignEx.getAdType() == 287 || this.C.getAdType() == 94) {
                        str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                    } else {
                        str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                    }
                    this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
                }
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
            com.mbridge.msdk.videocommon.download.a aVar = this.F;
            if (aVar != null && aVar.o() == 5) {
                String strP = this.F.p();
                if (new File(strP).exists()) {
                    return strP;
                }
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                return videoUrlEncode;
            }
        } catch (Exception e11) {
            q0.b("MediaViewPlayerView", e11.getMessage());
        }
        return null;
    }

    public void closeSound() {
        this.f31829k = false;
        try {
            if (this.G != null) {
                this.f31840v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.G.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                }
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f31822d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.f31823e;
    }

    public void gonePauseView() {
        Handler handler = L;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            return videoNativePlayer != null && videoNativePlayer.loadingViewIsVisible();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z10, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
            if (TextUtils.isEmpty(str) || campaignEx == null) {
                return false;
            }
            this.B = str;
            this.f31820b = z10;
            this.C = campaignEx;
            this.F = aVar;
            this.A = str2;
            this.G.initParameter(campaignEx.getVideoUrlEncode(), true, this.f31828j, this.f31837s, videoPlayerStatusListener);
            h();
            this.f31819a = true;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
            this.f31819a = false;
        }
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            e();
            f();
            setIsComplete(false);
            if (this.f31824f) {
                this.G.play();
            } else if (!hasPrepare() || this.f31821c) {
                q0.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.G.replaySameSource(getContext(), this.B, this.f31835q);
            } else {
                q0.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f31821c);
                startOrPlayVideo();
            }
            if (this.f31823e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.f31823e = false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f31837s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.f31839u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.f31844z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.f31844z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.f31844z.setInterpolator(new DecelerateInterpolator());
                this.f31844z.setAnimationListener(new d());
                n();
                this.f31842x.startAnimation(this.f31844z);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            return;
        }
        try {
            if (this.f31828j) {
                return;
            }
            this.f31821c = true;
            m();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f31821c = true;
            m();
            if (this.K) {
                return;
            }
            this.G.play(getContext(), this.B, this.f31835q);
            this.K = true;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        try {
            e();
            l();
            this.f31823e = false;
            this.f31821c = false;
            this.f31830l = i10;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        a(i10, i11);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f31821c = true;
            b();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.b(this.B);
    }

    public void openSound() {
        this.f31829k = true;
        try {
            if (this.G != null) {
                this.f31840v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.G.openSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                    return;
                }
                return;
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
                return;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
        q0.b("MediaViewPlayerView", th2.getMessage());
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f31824f = true;
            }
            if (this.J != null) {
                q0.b("omsdk", "mediaviewplayerview pause");
                this.J.pause();
            }
            d();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void registerView(AdSession adSession) {
        this.I = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            LinearLayout linearLayout = this.f31834p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            adSession.addFriendlyObstruction(linearLayout, friendlyObstructionPurpose, null);
            adSession.addFriendlyObstruction(this.f31836r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.f31837s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            adSession.addFriendlyObstruction(myImageView, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f31838t, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f31839u, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f31840v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.G = null;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f31828j = z10;
    }

    public void setEnterFullScreen() {
        try {
            q0.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f31822d = true;
            this.f31826h = true;
            this.f31840v.setVisibility(0);
            d();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f31822d = false;
            this.f31821c = false;
            this.f31840v.setVisibility(8);
            l();
            e();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setIsActivePause(boolean z10) {
        this.f31823e = z10;
    }

    public void setIsComplete(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z10);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z10);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setMediaViewPlayListener(h hVar) {
        this.H = hVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.J = mediaEvents;
    }

    public void showPlayView() {
        this.f31838t.setVisibility(0);
    }

    public void showProgressView(boolean z10) {
        this.f31832n = z10;
        ProgressBar progressBar = this.f31836r;
        if (progressBar != null) {
            progressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z10) {
        this.f31831m = z10;
        if (z10) {
            l();
        } else {
            d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f31825g) {
                m();
            } else if (hasPrepare()) {
                o();
            } else {
                playVideo();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            d();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void unregisterView() {
        AdSession adSession = this.I;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f31838t.getVisibility() != 0) {
            this.f31842x.setVisibility(8);
        }
    }

    private void g() {
        try {
            j();
            i();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!a1.a(imageUrl) && getContext() != null) {
                if (!com.mbridge.msdk.foundation.same.image.b.a(getContext()).c(imageUrl)) {
                    com.mbridge.msdk.foundation.same.image.b.a(getContext()).a(imageUrl, new f());
                    return;
                }
                Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(imageUrl);
                MyImageView myImageView = this.f31837s;
                if (myImageView == null || bitmapB == null) {
                    return;
                }
                myImageView.setImageUrl(imageUrl);
                this.f31837s.setImageBitmap(bitmapB);
                this.f31837s.setVisibility(0);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void j() {
        try {
            a aVar = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (viewInflate != null) {
                this.f31834p = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(i0.a(getContext(), "mbridge_textureview", "id"));
                this.f31833o = textureView;
                textureView.setKeepScreenOn(true);
                this.f31833o.setSurfaceTextureListener(new i(this, aVar));
                this.f31836r = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_progress", "id"));
                this.f31837s = (MyImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f31838t = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_play", "id"));
                this.f31839u = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_pause", "id"));
                this.f31840v = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound", "id"));
                this.f31842x = viewInflate.findViewById(i0.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f31841w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f31843y = animationDrawable;
                animationDrawable.start();
                k();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void k() {
        this.f31840v.setOnClickListener(new a());
        this.f31839u.setOnClickListener(new b());
        this.f31838t.setOnClickListener(new c());
    }

    private void l() {
        ImageView imageView;
        if (this.f31822d || (imageView = this.f31841w) == null || imageView.getVisibility() == 0 || !this.f31831m) {
            return;
        }
        this.f31841w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f31837s.setVisibility(0);
            this.f31838t.setVisibility(0);
            n();
            c();
            this.f31836r.setVisibility(8);
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f31842x.setVisibility(0);
    }

    private void o() {
        MediaEvents mediaEvents;
        try {
            if (this.G == null) {
                return;
            }
            e();
            if (this.f31827i) {
                this.G.start(this.f31835q);
                this.f31827i = false;
            } else {
                this.G.start();
            }
            if ((this.f31824f || this.f31823e) && (mediaEvents = this.J) != null) {
                this.f31824f = false;
                mediaEvents.resume();
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a();
        this.E = new Timer();
        this.E.schedule(new g(), 2000L);
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.f31819a && this.G != null) {
                if (!this.f31825g) {
                    m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith("https")) {
                    this.B = getPlayUrl();
                }
                e();
                this.G.play(getContext(), this.B, this.f31835q);
                if ((this.f31824f || this.f31823e) && (mediaEvents = this.J) != null) {
                    this.f31824f = false;
                    mediaEvents.resume();
                }
                if (this.f31829k) {
                    this.G.openSound();
                } else {
                    this.G.closeSound();
                }
                this.f31821c = false;
            }
        } catch (Throwable th2) {
            q0.b(mTFeqtajA.nYBYpduHRWYEPV, th2.getMessage());
        }
    }

    private void b() {
        try {
            if (URLUtil.isNetworkUrl(this.B)) {
                return;
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                this.B = videoUrlEncode;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f31839u.setVisibility(8);
    }

    private void d() {
        if (this.f31841w.getVisibility() == 0) {
            this.f31841w.setVisibility(8);
        }
    }

    private void e() {
        try {
            this.f31837s.setVisibility(8);
            this.f31838t.setVisibility(8);
            f();
            showProgressView(this.f31832n);
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a(int i10, int i11) {
        try {
            ProgressBar progressBar = this.f31836r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i11 > 0) {
                this.f31836r.setMax(i11);
            }
            if (i10 >= 0) {
                this.f31836r.setProgress(i10 + 1);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a() {
        try {
            Handler handler = L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31819a = false;
        this.f31820b = false;
        this.f31821c = false;
        this.f31822d = false;
        this.f31823e = false;
        this.f31824f = false;
        this.f31825g = false;
        this.f31826h = true;
        this.f31827i = false;
        this.f31828j = true;
        this.f31829k = false;
        this.f31830l = -1;
        this.f31831m = true;
        this.f31832n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.f31839u.setVisibility(0);
            MediaViewPlayerView.this.p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f implements com.mbridge.msdk.foundation.same.image.c {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.f31837s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.f31837s.setImageUrl(str);
            MediaViewPlayerView.this.f31837s.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
