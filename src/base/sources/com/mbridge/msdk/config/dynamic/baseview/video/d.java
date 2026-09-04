package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f29411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f29412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f29414e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29410a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f29415f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f29416g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f29417h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f29418i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f29419j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f29420k = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b();
        }
    }

    public d(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f29411b = context;
        this.f29412c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f29413d);
            if (file.exists()) {
                a(file);
                return;
            }
            q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f29415f < this.f29410a) {
                this.f29419j.postDelayed(this.f29420k, 1000L);
            } else {
                a("resource buffer exception file is not found");
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f29415f = 0L;
        this.f29416g = 0L;
        this.f29417h = 0L;
        this.f29418i = 0L;
    }

    private void e() {
        if (this.f29412c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f29414e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f29411b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f29413d));
            this.f29412c.setRepeatMode(0);
            this.f29412c.prepare(extractorMediaSourceCreateMediaSource);
            this.f29412c.seekTo(this.f29416g);
            this.f29412c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.f29416g = 0L;
        this.f29417h = 0L;
        this.f29418i = 0L;
        this.f29411b = null;
        this.f29412c = null;
        this.f29414e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29414e = aVar;
        if (i10 > 0) {
            this.f29410a = i10 * 1000;
        }
        this.f29413d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f29414e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f29415f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f29412c;
        if (simpleExoPlayer != null) {
            this.f29416g = simpleExoPlayer.getCurrentPosition();
        }
        this.f29419j.post(this.f29420k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f29417h;
        boolean z10 = false;
        boolean z11 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f29418i;
        if (j11 != 0 && jLastModified != j11) {
            z10 = true;
        }
        this.f29417h = length;
        this.f29418i = jLastModified;
        if (z11 || z10) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f29415f < this.f29410a) {
            this.f29419j.postDelayed(this.f29420k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f29419j.removeCallbacks(this.f29420k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f29414e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f29414e.onPlayError(str);
        }
    }
}
