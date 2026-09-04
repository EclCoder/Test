package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExoPlayer f29853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f29855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VideoViewEventListener f29856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SurfaceHolder.Callback f29857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f29858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f29859i;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBVideoView f29860a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29860a.f29856f != null) {
                this.f29860a.f29856f.onBufferingFail(HqKnbV.iPuPptkfIj);
            }
        }
    }

    public MBVideoView(Context context) {
        super(context);
        this.f29851a = "MBVideoView";
        this.f29852b = 1000;
        this.f29854d = 5000L;
        this.f29857g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f29853c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f29858h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f29856f != null) {
                    MBVideoView.this.f29856f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f29859i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f29853c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f29853c.getCurrentPosition();
                    long duration = MBVideoView.this.f29853c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f29856f != null) {
                        MBVideoView.this.f29856f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.f29853c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.f29853c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        if (exoPlaybackException == null) {
            message = "Play error and ExoPlayer have not message.";
        } else {
            int i10 = exoPlaybackException.type;
            if (i10 == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i10 == 1) {
                message = "Play error, because have a RendererException.";
            } else if (i10 != 2) {
                message = "Play error and ExoPlayer have not message.";
            } else {
                message = "Play error, because have a UnexpectedException.";
            }
        }
        if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
            message = exoPlaybackException.getCause().getMessage();
        }
        q0.b("MBVideoView", "onPlayerError : " + message);
        VideoViewEventListener videoViewEventListener = this.f29856f;
        if (videoViewEventListener != null) {
            videoViewEventListener.onPlayerError(exoPlaybackException.type, message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("MBVideoView", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i10 == 3) {
            q0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
        this.f29853c.getCurrentWindowIndex();
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f29855e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f29856f = videoViewEventListener;
    }

    private void a() {
        try {
            this.f29853c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.f29855e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.f29853c.setRepeatMode(0);
            this.f29853c.prepare(concatenatingMediaSource);
            this.f29853c.addListener(this);
        } catch (Throwable th2) {
            q0.b("MBVideoView", th2.getMessage());
            th2.toString();
        }
    }

    public MBVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29851a = "MBVideoView";
        this.f29852b = 1000;
        this.f29854d = 5000L;
        this.f29857g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f29853c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f29858h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f29856f != null) {
                    MBVideoView.this.f29856f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f29859i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f29853c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f29853c.getCurrentPosition();
                    long duration = MBVideoView.this.f29853c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f29856f != null) {
                        MBVideoView.this.f29856f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public MBVideoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29851a = "MBVideoView";
        this.f29852b = 1000;
        this.f29854d = 5000L;
        this.f29857g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f29853c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            }
        };
        this.f29858h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f29856f != null) {
                    MBVideoView.this.f29856f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f29859i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f29853c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f29853c.getCurrentPosition();
                    long duration = MBVideoView.this.f29853c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f29856f != null) {
                        MBVideoView.this.f29856f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    public void pause() {
    }

    public void play() {
    }

    public void stop() {
    }

    public MBVideoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f29851a = "MBVideoView";
        this.f29852b = 1000;
        this.f29854d = 5000L;
        this.f29857g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f29853c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            }
        };
        this.f29858h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f29856f != null) {
                    MBVideoView.this.f29856f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f29859i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f29853c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f29853c.getCurrentPosition();
                    long duration = MBVideoView.this.f29853c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f29856f != null) {
                        MBVideoView.this.f29856f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
    }
}
