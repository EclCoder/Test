package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.r;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final a Companion = new a(null);
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private zj.b callback;
    private int durationMs;
    private final Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private tl.a mediaPlayerFactory;

    /* JADX INFO: renamed from: mp, reason: collision with root package name */
    private MediaPlayer f35877mp;
    private boolean muted;
    private AtomicBoolean prepared;
    private AtomicBoolean preparing;
    private final b progressUpdater;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Uri sourceUri;
    private Surface surface;
    private TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private c videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements Runnable {
        private final WeakReference<g> weakRef;

        public b(g adVideoView) {
            s.h(adVideoView, "adVideoView");
            this.weakRef = new WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer;
            g gVar = this.weakRef.get();
            if (gVar == null) {
                return;
            }
            gVar.calculateAndNotifyProgress();
            if (!gVar.prepared.get() || (mediaPlayer = gVar.f35877mp) == null || !mediaPlayer.isPlaying() || gVar.videoCompleted) {
                return;
            }
            gVar.handler.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void onVideoTransformed(float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends t implements tl.a {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @Override // tl.a
        public final MediaPlayer invoke() {
            return new MediaPlayer();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        s.h(context, "context");
    }

    private final void applyMute() {
        float f10 = this.muted ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.f35877mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
    }

    private final void applyTransform() {
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        float f13 = this.videoW / this.videoH;
        Matrix matrix = new Matrix();
        float f14 = f12 > f13 ? f11 / this.videoH : f10 / this.videoW;
        matrix.setScale((this.videoW * f14) / f10, (this.videoH * f14) / f11, f10 / 2.0f, f11 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f15 = (f10 - (this.videoW * f14)) / 2.0f;
        float f16 = (f11 - (this.videoH * f14)) / 2.0f;
        c cVar = this.videoTransformCallback;
        if (cVar != null) {
            cVar.onVideoTransformed(this.texture.getX() + f15, this.texture.getY() + f16);
        }
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int i10;
        int i11 = this.durationMs;
        if (i11 <= 0 || !this.prepared.get() || (i10 = yl.g.i((int) ((((long) getCurrentPositionMs()) * ((long) 100)) / ((long) i11)), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = i10;
        notifyProgress(i10);
    }

    private final void checkVisibility() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.autoVisibility) {
            if (!isVisibleEnough() || !this.wantPlay || this.videoPaused) {
                if (this.prepared.get() && (mediaPlayer = this.f35877mp) != null && mediaPlayer.isPlaying()) {
                    q.Companion.d(TAG, "auto-pause: visibility NOT enough");
                    pauseInternal();
                    return;
                }
                return;
            }
            if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid()) {
                prepareIfNeeded();
                return;
            }
            MediaPlayer mediaPlayer2 = this.f35877mp;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.videoCompleted) {
                q.a aVar = q.Companion;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.f35877mp;
                sb2.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                sb2.append(" ms");
                aVar.d(TAG, sb2.toString());
                MediaPlayer mediaPlayer4 = this.f35877mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        }
    }

    private final void detachSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    private final void ensurePlayer() {
        if (this.f35877mp != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.mediaPlayerFactory.invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                g.m160ensurePlayer$lambda14$lambda10(this.f35873a, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.d
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i10, int i11) {
                g.m161ensurePlayer$lambda14$lambda11(this.f35874a, mediaPlayer2, i10, i11);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.e
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                g.m162ensurePlayer$lambda14$lambda12(this.f35875a, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.f
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                return g.m163ensurePlayer$lambda14$lambda13(this.f35876a, mediaPlayer2, i10, i11);
            }
        });
        this.f35877mp = mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m160ensurePlayer$lambda14$lambda10(g this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        s.h(this$0, "this$0");
        zj.b bVar = this$0.callback;
        if (bVar != null) {
            bVar.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i10 = this$0.lastPosMs;
        if (i10 > 0) {
            mediaPlayer.seekTo(i10);
        }
        this$0.applyMute();
        q.a aVar = q.Companion;
        aVar.d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay && (surface = this$0.surface) != null && surface.isValid()) {
            aVar.d(TAG, "start video on prepared.");
            mediaPlayer.start();
            this$0.notifyPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m161ensurePlayer$lambda14$lambda11(g this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        s.h(this$0, "this$0");
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this$0.videoW = i10;
        this$0.videoH = i11;
        SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m162ensurePlayer$lambda14$lambda12(g this$0, MediaPlayer mediaPlayer) {
        s.h(this$0, "this$0");
        q.Companion.d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m163ensurePlayer$lambda14$lambda13(g this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        s.h(this$0, "this$0");
        q.Companion.w(TAG, "onError(): what=" + i10 + ", extra=" + i11);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i10, String.valueOf(i11));
        return true;
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!getGlobalVisibleRect(rect)) {
            return false;
        }
        long jHeight = ((long) rect.height()) * ((long) rect.width());
        long height = ((long) getHeight()) * ((long) getWidth());
        return height > 0 && ((float) jHeight) / ((float) height) >= this.visibilityThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m164layoutListener$lambda1(g this$0) {
        s.h(this$0, "this$0");
        this$0.checkVisibility();
    }

    private final void notifyCompleted() {
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoCompleted();
        }
    }

    private final void notifyError(int i10, String str) {
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoError(i10, str);
        }
    }

    private final void notifyMuted(boolean z10) {
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoMuted(z10);
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoPause();
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoPlay();
        }
    }

    private final void notifyProgress(int i10) {
        zj.b bVar = this.callback;
        if (bVar != null) {
            bVar.onVideoProgress(i10);
        }
    }

    private final void pauseInternal() {
        Object objB;
        MediaPlayer mediaPlayer = this.f35877mp;
        if (mediaPlayer != null && this.prepared.get() && mediaPlayer.isPlaying()) {
            q.Companion.d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            mediaPlayer.pause();
            notifyPause();
        } else {
            q.Companion.d(TAG, "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            r.a aVar = r.f38769b;
            objB = r.b(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (r.h(objB)) {
            objB = numValueOf;
        }
        this.lastPosMs = ((Number) objB).intValue();
    }

    private final void prepareIfNeeded() {
        Object objB;
        try {
            r.a aVar = r.f38769b;
            Uri uri = this.sourceUri;
            if (uri != null && !this.prepared.get() && !this.preparing.get()) {
                ensurePlayer();
                this.preparing.set(true);
                this.prepared.set(false);
                MediaPlayer mediaPlayer = this.f35877mp;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                MediaPlayer mediaPlayer2 = this.f35877mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(this.looping);
                }
                MediaPlayer mediaPlayer3 = this.f35877mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setSurface(this.surface);
                }
                MediaPlayer mediaPlayer4 = this.f35877mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setDataSource(getContext(), uri);
                }
                q.a aVar2 = q.Companion;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("prepareAsync(): uri=");
                sb2.append(uri);
                sb2.append(", surfaceValid=");
                Surface surface = this.surface;
                g0 g0Var = null;
                sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
                aVar2.d(TAG, sb2.toString());
                MediaPlayer mediaPlayer5 = this.f35877mp;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                    g0Var = g0.f38750a;
                }
                objB = r.b(g0Var);
                Throwable thE = r.e(objB);
                if (thE != null) {
                    notifyError(-1, String.valueOf(thE.getLocalizedMessage()));
                }
            }
        } catch (Throwable th2) {
            r.a aVar3 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m165scrollListener$lambda0(g this$0) {
        s.h(this$0, "this$0");
        this$0.checkVisibility();
    }

    public static /* synthetic */ void setAutoVisibility$default(g gVar, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.8f;
        }
        gVar.setAutoVisibility(z10, f10);
    }

    public final int getCurrentPositionMs() {
        Object objB;
        if (!this.prepared.get()) {
            return yl.g.d(this.lastPosMs, 0);
        }
        try {
            r.a aVar = r.f38769b;
            MediaPlayer mediaPlayer = this.f35877mp;
            objB = r.b(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (r.h(objB)) {
            objB = numValueOf;
        }
        return yl.g.d(((Number) objB).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final tl.a getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    public final Surface getSurface$vungle_ads_release() {
        return this.surface;
    }

    public final TextureView getTexture$vungle_ads_release() {
        return this.texture;
    }

    public final boolean isMuted() {
        return this.muted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        q.Companion.d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        q.Companion.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture st, int i10, int i11) {
        Object objB;
        g0 g0Var;
        s.h(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.surface = surface2;
        try {
            r.a aVar = r.f38769b;
            MediaPlayer mediaPlayer = this.f35877mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            objB = r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "Failed to set surface", thE);
        }
        boolean zI = r.i(objB);
        q.a aVar3 = q.Companion;
        aVar3.d(TAG, "onSurfaceTextureAvailable(): " + i10 + " x " + i11 + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + zI);
        if (zI && this.prepared.get() && this.wantPlay) {
            aVar3.d(TAG, "onSurfaceTextureAvailable and videoCompleted=" + this.videoCompleted);
            if (this.videoCompleted) {
                seekTo(this.durationMs);
                MediaPlayer mediaPlayer2 = this.f35877mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
                MediaPlayer mediaPlayer3 = this.f35877mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.pause();
                }
            } else {
                MediaPlayer mediaPlayer4 = this.f35877mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object objB;
        s.h(st, "st");
        q.Companion.d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            r.a aVar = r.f38769b;
            MediaPlayer mediaPlayer = this.f35877mp;
            g0 g0Var = null;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                g0Var = g0.f38750a;
            }
            objB = r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "Failed to clear surface", thE);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int i10, int i11) {
        s.h(st, "st");
        q.Companion.d(TAG, "onSurfaceTextureSizeChanged() width=" + i10 + " height=" + i11);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        s.h(st, "st");
    }

    public final void pause() {
        q.a aVar = q.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pause() at pos=");
        MediaPlayer mediaPlayer = this.f35877mp;
        sb2.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb2.append(" ms");
        aVar.d(TAG, sb2.toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void play() {
        Surface surface;
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        q.a aVar = q.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("play(): prepared=");
        sb2.append(this.prepared);
        sb2.append(", surfaceValid=");
        Surface surface2 = this.surface;
        sb2.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb2.append(", visible=");
        sb2.append(isVisibleEnough());
        aVar.d(TAG, sb2.toString());
        if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid() || !isVisibleEnough()) {
            prepareIfNeeded();
            return;
        }
        MediaPlayer mediaPlayer = this.f35877mp;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("play(): pos=");
            MediaPlayer mediaPlayer2 = this.f35877mp;
            sb3.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            sb3.append(" ms");
            aVar.d(TAG, sb3.toString());
            MediaPlayer mediaPlayer3 = this.f35877mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            notifyPlay();
        }
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void release() {
        Object objB;
        Object objB2;
        Object objB3;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        q.Companion.d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            r.a aVar = r.f38769b;
            MediaPlayer mediaPlayer = this.f35877mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                g0Var3 = g0.f38750a;
            } else {
                g0Var3 = null;
            }
            objB = r.b(g0Var3);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "Failed to clear Surface", thE);
        }
        try {
            MediaPlayer mediaPlayer2 = this.f35877mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
                g0Var2 = g0.f38750a;
            } else {
                g0Var2 = null;
            }
            objB2 = r.b(g0Var2);
        } catch (Throwable th3) {
            r.a aVar3 = r.f38769b;
            objB2 = r.b(fl.s.a(th3));
        }
        Throwable thE2 = r.e(objB2);
        if (thE2 != null) {
            q.Companion.e(TAG, "Failed to stop MediaPlayer", thE2);
        }
        try {
            MediaPlayer mediaPlayer3 = this.f35877mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            objB3 = r.b(g0Var);
        } catch (Throwable th4) {
            r.a aVar4 = r.f38769b;
            objB3 = r.b(fl.s.a(th4));
        }
        Throwable thE3 = r.e(objB3);
        if (thE3 != null) {
            q.Companion.e(TAG, "Failed to release MediaPlayer", thE3);
        }
        this.f35877mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    public final void seekTo(int i10) {
        this.lastPosMs = yl.g.d(i10, 0);
        q.Companion.d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            MediaPlayer mediaPlayer = this.f35877mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setAutoVisibility(boolean z10, float f10) {
        q.Companion.d(TAG, "setAutoVisibility enabled=" + z10 + " threshold=" + f10);
        this.autoVisibility = z10;
        this.visibilityThreshold = yl.g.h(f10, 0.0f, 1.0f);
        if (z10) {
            checkVisibility();
        }
    }

    public final void setLooping(boolean z10) {
        q.Companion.d(TAG, "setLooping to " + this.looping);
        this.looping = z10;
        MediaPlayer mediaPlayer = this.f35877mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z10);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(tl.a aVar) {
        s.h(aVar, "<set-?>");
        this.mediaPlayerFactory = aVar;
    }

    public final void setMuted(boolean z10) {
        q.Companion.d(TAG, "setMuted to " + z10);
        this.muted = z10;
        applyMute();
        notifyMuted(z10);
    }

    public final void setSource(Uri uri) {
        s.h(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.surface = surface;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        s.h(textureView, "<set-?>");
        this.texture = textureView;
    }

    public final void setVideoLifecycleCallback(zj.b lifecycleCallback) {
        s.h(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(c cVar) {
        this.videoTransformCallback = cVar;
    }

    public final void stop() {
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        MediaPlayer mediaPlayer = this.f35877mp;
        q.a aVar = q.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stop(): prepared=");
        sb2.append(this.prepared);
        sb2.append(", surface=");
        Surface surface = this.surface;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        aVar.d(TAG, sb2.toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid() && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer.pause();
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                g.m165scrollListener$lambda0(this.f35871a);
            }
        };
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                g.m164layoutListener$lambda1(this.f35872a);
            }
        };
        this.visibilityThreshold = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new AtomicBoolean(false);
        this.preparing = new AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressUpdater = new b(this);
        this.mediaPlayerFactory = d.INSTANCE;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }
}
