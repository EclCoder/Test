package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f29262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceHolder f29268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f29269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f29270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f29271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MediaEvents f29273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f29274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AudioManager f29276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f29277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f29279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AspectRatioFrameLayout f29281t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.mbridge.msdk.config.dynamic.baseview.video.c f29282u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements SurfaceHolder.Callback {
        private c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f29262a != null && surfaceHolder != null && CusPlayerView.this.f29268g != surfaceHolder) {
                    CusPlayerView.this.f29268g = surfaceHolder;
                    CusPlayerView.this.f29262a.a(surfaceHolder);
                }
                CusPlayerView.this.f29265d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f29262a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f29268g = surfaceHolder;
                CusPlayerView.this.f29262a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f29265d = true;
                CusPlayerView.this.f29267f = true;
                CusPlayerView.this.f29262a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        /* synthetic */ c(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29264c = false;
        this.f29265d = false;
        this.f29266e = false;
        this.f29267f = false;
        this.f29271j = 1;
        this.f29272k = false;
        this.f29274m = "";
        this.f29275n = 1;
        this.f29278q = false;
        this.f29279r = false;
        this.f29280s = true;
        this.f29282u = new b();
        b();
    }

    private void d() {
        this.f29281t = new AspectRatioFrameLayout(getContext());
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f29268g = holder;
        holder.setKeepScreenOn(true);
        this.f29268g.addCallback(new c(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f29262a = bVar;
        bVar.a(getContext(), this.f29268g);
        this.f29262a.a(this.f29282u);
        this.f29281t.addView(surfaceView, -1, -1);
        setGravity(17);
        this.f29281t.setVisibility(4);
        addView(this.f29281t, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f29276o == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f29279r) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f29276o.requestAudioFocus(this.f29277p, 3, i10) != 1) {
                z10 = false;
            }
            this.f29278q = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f29262a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f29262a.f() && !this.f29267f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public int getCurPosition() {
        long jC;
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            jC = bVar != null ? bVar.c() : 0L;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        return Math.toIntExact(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f29274m;
    }

    public MediaEvents getVideoEvents() {
        return this.f29273l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f29263b = str;
        this.f29262a.a(aVar);
        this.f29262a.c(this.f29263b);
        this.f29264c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            return bVar != null && bVar.g();
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f29279r;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f29280s;
    }

    public boolean isSilent() {
        return this.f29262a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f29269h = motionEvent.getRawX();
        this.f29270i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f29262a == null || this.f29265d || isComplete() || this.f29266e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f29262a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f29273l == null || this.f29272k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f29272k = true;
            this.f29273l.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f29262a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f29264c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f29262a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f29280s) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f29262a.j();
                }
            }
            this.f29262a.a(i10);
            this.f29267f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f29273l != null) {
                this.f29273l = null;
            }
            a();
            if (this.f29268g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f29268g.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f29273l;
            if (mediaEvents != null) {
                this.f29272k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f29262a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f29266e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f29279r = i10 == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f29280s = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29274m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f29273l = mediaEvents;
    }

    public void setVideoGravity(int i10) {
        if (this.f29275n == i10) {
            return;
        }
        this.f29275n = i10;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f29281t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i10);
        }
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f29262a != null) {
                if (z10) {
                    if (e()) {
                        this.f29262a.t();
                    } else {
                        this.f29262a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
                if (bVar == null || this.f29266e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f29273l != null) {
                this.f29273l = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void c() {
        try {
            this.f29276o = (AudioManager) getContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            this.f29277p = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f29262a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f29278q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f29262a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f29262a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f29278q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f29262a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f29262a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f29278q = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f29262a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f29262a.h()) {
                    return;
                }
                this.f29262a.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.config.dynamic.baseview.video.c {
        b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void a(float f10) {
            if (CusPlayerView.this.f29281t != null) {
                CusPlayerView.this.f29281t.setAspectRatio(f10);
                if (CusPlayerView.this.f29281t.getVisibility() != 0) {
                    CusPlayerView.this.f29281t.setVisibility(0);
                }
            }
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void onRenderedFirstFrame() {
        }
    }

    private void a() {
        try {
            AudioManager audioManager = this.f29276o;
            if (audioManager == null || !this.f29278q) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f29277p);
            this.f29278q = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }
}
