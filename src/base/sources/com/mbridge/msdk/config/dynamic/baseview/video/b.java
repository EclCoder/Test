package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Player.EventListener, VideoListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f29398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f29400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f29401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaSource f29402i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f29404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f29405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SurfaceHolder f29406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f29407n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29394a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29395b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29396c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29397d = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f29403j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f29408o = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f29401h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f29398e = bVar.f29401h.getCurrentPosition();
                float f10 = b.this.f29398e / 1000.0f;
                float f11 = b.this.f29398e % 1000;
                int iRound = Math.round(f10);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f29398e);
                if (b.this.f29401h == null || b.this.f29401h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f29401h.getDuration() / 1000;
                    if (f11 > 0.0f && f11 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f29404k != null) {
                        b.this.f29404k.a(j10, duration);
                    }
                }
                b.this.f29394a = false;
                b.this.f29403j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    private void r() {
        try {
            a();
            this.f29403j.post(this.f29408o);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f29401h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.f29395b;
    }

    public boolean g() {
        return this.f29394a;
    }

    public boolean h() {
        return this.f29401h != null && b();
    }

    public boolean i() {
        return this.f29399f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f29401h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f29399f = true;
    }

    public void k() {
        try {
            this.f29394a = true;
            this.f29398e = 0L;
            if (this.f29404k != null) {
                this.f29404k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f29395b = true;
            if (this.f29401h != null && !this.f29396c) {
                this.f29396c = true;
                if (this.f29404k != null) {
                    this.f29404k.a(this.f29401h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void m() {
        try {
            if (this.f29395b && this.f29401h != null && b()) {
                this.f29401h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f29395b) {
                r();
            } else {
                this.f29401h.prepare(this.f29402i);
            }
            this.f29401h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f29395b || (simpleExoPlayer = this.f29401h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f29402i);
            this.f29395b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        d dVar = this.f29407n;
        if ((dVar == null || !dVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            if (i10 == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i10 != 1) {
                message = i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException.";
            } else {
                message = "Play error, because have a RendererException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onRenderedFirstFrame() {
        c cVar = this.f29405l;
        if (cVar != null) {
            cVar.onRenderedFirstFrame();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        c cVar = this.f29405l;
        if (cVar != null) {
            cVar.a(i11 == 0 ? 1.0f : (i10 * f10) / i11);
        }
    }

    public void p() {
        try {
            a();
            if (this.f29401h != null) {
                s();
                this.f29401h.removeListener(this);
                this.f29401h.release();
                this.f29404k = null;
            }
            d dVar = this.f29407n;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f29401h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f29395b && this.f29401h != null && b()) {
                this.f29401h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f29401h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f29399f = false;
    }

    public void b(int i10) {
        this.f29397d = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f29401h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f29400g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f29402i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f29400g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f29401h.setRepeatMode(0);
            this.f29401h.prepare(this.f29402i);
            this.f29401h.addListener(this);
            this.f29401h.addVideoListener(this);
            SurfaceHolder surfaceHolder = this.f29406m;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            d dVar = new d(this.f29400g, this.f29401h);
            this.f29407n = dVar;
            dVar.a(str, this.f29404k, this.f29397d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f29401h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    private void b(String str) {
        if (this.f29404k != null) {
            this.f29404k.onPlayError(str);
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f29400g = context;
            this.f29406m = surfaceHolder;
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public boolean b() {
        return this.f29401h.getPlaybackState() == 3 && this.f29401h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f29401h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
            b(th2.toString());
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f29405l = cVar;
        }
    }

    public void a(long j10) {
        try {
            if (!this.f29395b) {
                this.f29401h.prepare(this.f29402i);
            } else {
                r();
            }
            this.f29401h.seekTo(j10);
            this.f29401h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.f29398e;
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f29398e = j10;
            if (!this.f29395b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f29401h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void a() {
        try {
            this.f29403j.removeCallbacks(this.f29408o);
        } catch (Exception e10) {
            q0.b(Saucuwx.DUTWXTLy, e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f29404k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f29395b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f29401h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f29401h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f29401h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f29401h.stop();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }
}
