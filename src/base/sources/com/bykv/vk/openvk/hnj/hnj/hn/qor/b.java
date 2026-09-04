package com.bykv.vk.openvk.hnj.hnj.hn.qor;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaPlayer f11623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f11624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r6.a f11625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Surface f11626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f11627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f11628n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f11629a;

        public a(b bVar) {
            this.f11629a = new WeakReference(bVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                b bVar = (b) this.f11629a.get();
                if (bVar != null) {
                    bVar.p(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f11629a.get();
                if (bVar != null) {
                    bVar.s();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                b bVar = (b) this.f11629a.get();
                return bVar != null && bVar.r(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                b bVar = (b) this.f11629a.get();
                return bVar != null && bVar.n(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f11629a.get();
                if (bVar != null) {
                    bVar.m();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f11629a.get();
                if (bVar != null) {
                    bVar.l();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                b bVar = (b) this.f11629a.get();
                if (bVar != null) {
                    bVar.q(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f11627m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f11623i = mediaPlayer;
        }
        t(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f11624j = new a(this);
        w();
    }

    private void t(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(u6.c.c(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void u() {
        r6.a aVar = this.f11625k;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (Throwable unused) {
            }
            this.f11625k = null;
        }
    }

    private void v() {
        try {
            Surface surface = this.f11626l;
            if (surface != null) {
                surface.release();
                this.f11626l = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void w() {
        this.f11623i.setOnPreparedListener(this.f11624j);
        this.f11623i.setOnBufferingUpdateListener(this.f11624j);
        this.f11623i.setOnCompletionListener(this.f11624j);
        this.f11623i.setOnSeekCompleteListener(this.f11624j);
        this.f11623i.setOnVideoSizeChangedListener(this.f11624j);
        this.f11623i.setOnErrorListener(this.f11624j);
        this.f11623i.setOnInfoListener(this.f11624j);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void a(u6.a aVar) {
        this.f11623i.setPlaybackParams(this.f11623i.getPlaybackParams().setSpeed(aVar.a()));
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void aq() {
        this.f11623i.pause();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void bug() {
        synchronized (this.f11627m) {
            try {
                if (!this.f11628n) {
                    this.f11623i.release();
                    this.f11628n = true;
                    v();
                    u();
                    o();
                    w();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void d(Surface surface) {
        v();
        this.f11626l = surface;
        this.f11623i.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void dkl() {
        this.f11623i.start();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public long dnm() {
        try {
            return this.f11623i.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void dse() {
        this.f11623i.stop();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void f(boolean z10) {
        this.f11623i.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public int fc() {
        MediaPlayer mediaPlayer = this.f11623i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        v();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void gjv(boolean z10) {
        MediaPlayer mediaPlayer = this.f11623i;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void h(FileDescriptor fileDescriptor) throws IOException {
        this.f11623i.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void hn(boolean z10) {
        this.f11623i.setScreenOnWhilePlaying(z10);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void hnj(SurfaceHolder surfaceHolder) {
        synchronized (this.f11627m) {
            try {
                if (!this.f11628n && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f11637h) {
                    this.f11623i.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public int mjg() {
        MediaPlayer mediaPlayer = this.f11623i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void ojm() {
        MediaPlayer mediaPlayer = this.f11623i;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void orl() {
        try {
            this.f11623i.reset();
        } catch (Throwable unused) {
        }
        u();
        o();
        w();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public PlaybackParams sk() {
        return this.f11623i.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public long ta() {
        try {
            return this.f11623i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void hnj(String str) throws IOException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f11623i.setDataSource(uri.getPath());
        } else {
            this.f11623i.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public synchronized void hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        this.f11625k = r6.a.h(u6.c.c(), cVar);
        s6.c.b(cVar);
        this.f11623i.setDataSource(this.f11625k);
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void hnj(long j10, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            this.f11623i.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f11623i.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f11623i.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f11623i.seekTo((int) j10, 2);
        } else if (i10 != 3) {
            this.f11623i.seekTo((int) j10);
        } else {
            this.f11623i.seekTo((int) j10, 3);
        }
    }
}
