package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.audio.AudioSink;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class q0 extends t1.d implements o {
    private final androidx.media3.exoplayer.b A;
    private final androidx.media3.exoplayer.g B;
    private final l2 C;
    private final n2 D;
    private final o2 E;
    private final long F;
    private AudioManager G;
    private final boolean H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private j2 N;
    private i2.r O;
    private o.c P;
    private boolean Q;
    private t1.x.b R;
    private t1.t S;
    private t1.t T;
    private t1.o U;
    private t1.o V;
    private AudioTrack W;
    private Object X;
    private Surface Y;
    private SurfaceHolder Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f5702a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k2.w f5703b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextureView f5704b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final t1.x.b f5705c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f5706c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.g f5707d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f5708d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f5709e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private w1.v f5710e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1.x f5711f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private i f5712f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f2[] f5713g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private i f5714g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k2.v f5715h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f5716h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1.j f5717i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private t1.b f5718i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e1.f f5719j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f5720j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e1 f5721k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f5722k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w1.m f5723l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private v1.b f5724l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet f5725m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f5726m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t1.a0.b f5727n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f5728n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f5729o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f5730o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f5731p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f5732p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.r.a f5733q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f5734q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c2.a f5735r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private t1.j f5736r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Looper f5737s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private t1.g0 f5738s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l2.d f5739t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private t1.t f5740t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f5741u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private c2 f5742u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f5743v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f5744v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f5745w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f5746w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final w1.d f5747x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f5748x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final d f5749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f5750z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!w1.c0.B0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = w1.c0.f55769a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class c {
        public static c2.x1 a(Context context, q0 q0Var, boolean z10, String str) {
            c2.v1 v1VarS0 = c2.v1.s0(context);
            if (v1VarS0 == null) {
                w1.n.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new c2.x1(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z10) {
                q0Var.x0(v1VarS0);
            }
            return new c2.x1(v1VarS0.z0(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    final class d implements androidx.media3.exoplayer.video.i, androidx.media3.exoplayer.audio.e, j2.h, h2.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, androidx.media3.exoplayer.g.b, androidx.media3.exoplayer.b.InterfaceC0060b, l2.b, o.a {
        private d() {
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void a(Exception exc) {
            q0.this.f5735r.a(exc);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void b(String str) {
            q0.this.f5735r.b(str);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void c(String str) {
            q0.this.f5735r.c(str);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void d(long j10) {
            q0.this.f5735r.d(j10);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void e(Exception exc) {
            q0.this.f5735r.e(exc);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void f(Object obj, long j10) {
            q0.this.f5735r.f(obj, j10);
            if (q0.this.X == obj) {
                q0.this.f5723l.k(26, new w1.m.a() { // from class: androidx.media3.exoplayer.a1
                    @Override // w1.m.a
                    public final void invoke(Object obj2) {
                        ((t1.x.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void g(Exception exc) {
            q0.this.f5735r.g(exc);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void h(int i10, long j10, long j11) {
            q0.this.f5735r.h(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void i(long j10, int i10) {
            q0.this.f5735r.i(j10, i10);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void j(AudioSink.a aVar) {
            q0.this.f5735r.j(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void k(AudioSink.a aVar) {
            q0.this.f5735r.k(aVar);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void l(t1.o oVar, j jVar) {
            q0.this.U = oVar;
            q0.this.f5735r.l(oVar, jVar);
        }

        @Override // androidx.media3.exoplayer.l2.b
        public void m(int i10) {
            final t1.j jVarC0 = q0.C0(q0.this.C);
            if (jVarC0.equals(q0.this.f5736r0)) {
                return;
            }
            q0.this.f5736r0 = jVarC0;
            q0.this.f5723l.k(29, new w1.m.a() { // from class: androidx.media3.exoplayer.w0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onDeviceInfoChanged(jVarC0);
                }
            });
        }

        @Override // androidx.media3.exoplayer.b.InterfaceC0060b
        public void n() {
            q0.this.m1(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void o(i iVar) {
            q0.this.f5714g0 = iVar;
            q0.this.f5735r.o(iVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            q0.this.f5735r.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // j2.h
        public void onCues(final List list) {
            q0.this.f5723l.k(27, new w1.m.a() { // from class: androidx.media3.exoplayer.v0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onCues(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.i
        public void onDroppedFrames(int i10, long j10) {
            q0.this.f5735r.onDroppedFrames(i10, j10);
        }

        @Override // h2.b
        public void onMetadata(final t1.u uVar) {
            q0 q0Var = q0.this;
            q0Var.f5740t0 = q0Var.f5740t0.a().M(uVar).I();
            t1.t tVarA0 = q0.this.A0();
            if (!tVarA0.equals(q0.this.S)) {
                q0.this.S = tVarA0;
                q0.this.f5723l.h(14, new w1.m.a() { // from class: androidx.media3.exoplayer.t0
                    @Override // w1.m.a
                    public final void invoke(Object obj) {
                        ((t1.x.d) obj).onMediaMetadataChanged(q0.this.S);
                    }
                });
            }
            q0.this.f5723l.h(28, new w1.m.a() { // from class: androidx.media3.exoplayer.u0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onMetadata(uVar);
                }
            });
            q0.this.f5723l.f();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (q0.this.f5722k0 == z10) {
                return;
            }
            q0.this.f5722k0 = z10;
            q0.this.f5723l.k(23, new w1.m.a() { // from class: androidx.media3.exoplayer.y0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            q0.this.i1(surfaceTexture);
            q0.this.X0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            q0.this.j1(null);
            q0.this.X0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            q0.this.X0(i10, i11);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            q0.this.f5735r.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.i
        public void onVideoSizeChanged(final t1.g0 g0Var) {
            q0.this.f5738s0 = g0Var;
            q0.this.f5723l.k(25, new w1.m.a() { // from class: androidx.media3.exoplayer.z0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onVideoSizeChanged(g0Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.i
        public void p(i iVar) {
            q0.this.f5712f0 = iVar;
            q0.this.f5735r.p(iVar);
        }

        @Override // androidx.media3.exoplayer.l2.b
        public void q(final int i10, final boolean z10) {
            q0.this.f5723l.k(30, new w1.m.a() { // from class: androidx.media3.exoplayer.x0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void r(t1.o oVar, j jVar) {
            q0.this.V = oVar;
            q0.this.f5735r.r(oVar, jVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void s(i iVar) {
            q0.this.f5735r.s(iVar);
            q0.this.V = null;
            q0.this.f5714g0 = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            q0.this.X0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (q0.this.f5702a0) {
                q0.this.j1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (q0.this.f5702a0) {
                q0.this.j1(null);
            }
            q0.this.X0(0, 0);
        }

        @Override // androidx.media3.exoplayer.g.b
        public void t(float f10) {
            q0.this.e1();
        }

        @Override // androidx.media3.exoplayer.g.b
        public void u(int i10) {
            q0.this.m1(q0.this.getPlayWhenReady(), i10, q0.M0(i10));
        }

        @Override // androidx.media3.exoplayer.video.i
        public void v(i iVar) {
            q0.this.f5735r.v(iVar);
            q0.this.U = null;
            q0.this.f5712f0 = null;
        }

        @Override // androidx.media3.exoplayer.o.a
        public void x(boolean z10) {
            q0.this.q1();
        }

        @Override // j2.h
        public void onCues(final v1.b bVar) {
            q0.this.f5724l0 = bVar;
            q0.this.f5723l.k(27, new w1.m.a() { // from class: androidx.media3.exoplayer.s0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onCues(bVar);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class e implements m2.f, n2.a, d2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m2.f f5752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n2.a f5753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m2.f f5754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n2.a f5755d;

        private e() {
        }

        @Override // n2.a
        public void a(long j10, float[] fArr) {
            n2.a aVar = this.f5755d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            n2.a aVar2 = this.f5753b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // n2.a
        public void c() {
            n2.a aVar = this.f5755d;
            if (aVar != null) {
                aVar.c();
            }
            n2.a aVar2 = this.f5753b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // m2.f
        public void d(long j10, long j11, t1.o oVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            t1.o oVar2;
            MediaFormat mediaFormat2;
            m2.f fVar = this.f5754c;
            if (fVar != null) {
                fVar.d(j10, j11, oVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                oVar2 = oVar;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                oVar2 = oVar;
                mediaFormat2 = mediaFormat;
            }
            m2.f fVar2 = this.f5752a;
            if (fVar2 != null) {
                fVar2.d(j12, j13, oVar2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.d2.b
        public void handleMessage(int i10, Object obj) {
            if (i10 == 7) {
                this.f5752a = (m2.f) obj;
                return;
            }
            if (i10 == 8) {
                this.f5753b = (n2.a) obj;
            } else {
                if (i10 != 10000) {
                    return;
                }
                android.support.v4.media.session.b.a(obj);
                this.f5754c = null;
                this.f5755d = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class f implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f5756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.r f5757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t1.a0 f5758c;

        public f(Object obj, androidx.media3.exoplayer.source.p pVar) {
            this.f5756a = obj;
            this.f5757b = pVar;
            this.f5758c = pVar.T();
        }

        @Override // androidx.media3.exoplayer.o1
        public Object a() {
            return this.f5756a;
        }

        @Override // androidx.media3.exoplayer.o1
        public t1.a0 b() {
            return this.f5758c;
        }

        public void c(t1.a0 a0Var) {
            this.f5758c = a0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private final class g extends AudioDeviceCallback {
        private g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (q0.this.S0() && q0.this.f5742u0.f5138n == 3) {
                q0 q0Var = q0.this;
                q0Var.o1(q0Var.f5742u0.f5136l, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (q0.this.S0()) {
                return;
            }
            q0 q0Var = q0.this;
            q0Var.o1(q0Var.f5742u0.f5136l, 1, 3);
        }
    }

    static {
        t1.s.a("media3.exoplayer");
    }

    public q0(o.b bVar, t1.x xVar) {
        w1.g gVar = new w1.g();
        this.f5707d = gVar;
        try {
            w1.n.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + w1.c0.f55773e + "]");
            Context applicationContext = bVar.f5665a.getApplicationContext();
            this.f5709e = applicationContext;
            c2.a aVar = (c2.a) bVar.f5673i.apply(bVar.f5666b);
            this.f5735r = aVar;
            this.f5730o0 = bVar.f5675k;
            this.f5718i0 = bVar.f5676l;
            this.f5706c0 = bVar.f5682r;
            this.f5708d0 = bVar.f5683s;
            this.f5722k0 = bVar.f5680p;
            this.F = bVar.A;
            d dVar = new d();
            this.f5749y = dVar;
            e eVar = new e();
            this.f5750z = eVar;
            Handler handler = new Handler(bVar.f5674j);
            f2[] f2VarArrA = ((i2) bVar.f5668d.get()).a(handler, dVar, dVar, dVar, dVar);
            this.f5713g = f2VarArrA;
            w1.a.g(f2VarArrA.length > 0);
            k2.v vVar = (k2.v) bVar.f5670f.get();
            this.f5715h = vVar;
            this.f5733q = (androidx.media3.exoplayer.source.r.a) bVar.f5669e.get();
            l2.d dVar2 = (l2.d) bVar.f5672h.get();
            this.f5739t = dVar2;
            this.f5731p = bVar.f5684t;
            this.N = bVar.f5685u;
            this.f5741u = bVar.f5686v;
            this.f5743v = bVar.f5687w;
            this.f5745w = bVar.f5688x;
            this.Q = bVar.B;
            Looper looper = bVar.f5674j;
            this.f5737s = looper;
            w1.d dVar3 = bVar.f5666b;
            this.f5747x = dVar3;
            t1.x xVar2 = xVar == null ? this : xVar;
            this.f5711f = xVar2;
            boolean z10 = bVar.F;
            this.H = z10;
            this.f5723l = new w1.m(looper, dVar3, new w1.m.b() { // from class: androidx.media3.exoplayer.d0
                @Override // w1.m.b
                public final void a(Object obj, t1.n nVar) {
                    ((t1.x.d) obj).onEvents(this.f5145a.f5711f, new t1.x.c(nVar));
                }
            });
            this.f5725m = new CopyOnWriteArraySet();
            this.f5729o = new ArrayList();
            this.O = new i2.r.a(0);
            this.P = o.c.f5691b;
            k2.w wVar = new k2.w(new h2[f2VarArrA.length], new k2.q[f2VarArrA.length], t1.d0.f52651b, null);
            this.f5703b = wVar;
            this.f5727n = new t1.a0.b();
            t1.x.b bVarE = new t1.x.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, vVar.g()).d(23, bVar.f5681q).d(25, bVar.f5681q).d(33, bVar.f5681q).d(26, bVar.f5681q).d(34, bVar.f5681q).e();
            this.f5705c = bVarE;
            this.R = new t1.x.b.a().b(bVarE).a(4).a(10).e();
            this.f5717i = dVar3.createHandler(looper, null);
            e1.f fVar = new e1.f() { // from class: androidx.media3.exoplayer.e0
                @Override // androidx.media3.exoplayer.e1.f
                public final void a(e1.e eVar2) {
                    q0 q0Var = this.f5275a;
                    q0Var.f5717i.post(new Runnable() { // from class: androidx.media3.exoplayer.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            q0Var.R0(eVar2);
                        }
                    });
                }
            };
            this.f5719j = fVar;
            this.f5742u0 = c2.k(wVar);
            aVar.C(xVar2, looper);
            int i10 = w1.c0.f55769a;
            e1 e1Var = new e1(f2VarArrA, vVar, wVar, (h1) bVar.f5671g.get(), dVar2, this.I, this.J, aVar, this.N, bVar.f5689y, bVar.f5690z, this.Q, bVar.H, looper, dVar3, fVar, i10 < 31 ? new c2.x1(bVar.G) : c.a(applicationContext, this, bVar.C, bVar.G), bVar.D, this.P);
            this.f5721k = e1Var;
            this.f5720j0 = 1.0f;
            this.I = 0;
            t1.t tVar = t1.t.H;
            this.S = tVar;
            this.T = tVar;
            this.f5740t0 = tVar;
            this.f5744v0 = -1;
            if (i10 < 21) {
                this.f5716h0 = T0(0);
            } else {
                this.f5716h0 = w1.c0.I(applicationContext);
            }
            this.f5724l0 = v1.b.f55092c;
            this.f5726m0 = true;
            q(aVar);
            dVar2.c(new Handler(looper), aVar);
            y0(dVar);
            long j10 = bVar.f5667c;
            if (j10 > 0) {
                e1Var.x(j10);
            }
            androidx.media3.exoplayer.b bVar2 = new androidx.media3.exoplayer.b(bVar.f5665a, handler, dVar);
            this.A = bVar2;
            bVar2.b(bVar.f5679o);
            androidx.media3.exoplayer.g gVar2 = new androidx.media3.exoplayer.g(bVar.f5665a, handler, dVar);
            this.B = gVar2;
            gVar2.m(bVar.f5677m ? this.f5718i0 : null);
            if (z10 && i10 >= 23) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                this.G = audioManager;
                b.b(audioManager, new g(), new Handler(looper));
            }
            if (bVar.f5681q) {
                l2 l2Var = new l2(bVar.f5665a, handler, dVar);
                this.C = l2Var;
                l2Var.h(w1.c0.h0(this.f5718i0.f52560c));
            } else {
                this.C = null;
            }
            n2 n2Var = new n2(bVar.f5665a);
            this.D = n2Var;
            n2Var.a(bVar.f5678n != 0);
            o2 o2Var = new o2(bVar.f5665a);
            this.E = o2Var;
            o2Var.a(bVar.f5678n == 2);
            this.f5736r0 = C0(this.C);
            this.f5738s0 = t1.g0.f52689e;
            this.f5710e0 = w1.v.f55847c;
            vVar.k(this.f5718i0);
            c1(1, 10, Integer.valueOf(this.f5716h0));
            c1(2, 10, Integer.valueOf(this.f5716h0));
            c1(1, 3, this.f5718i0);
            c1(2, 4, Integer.valueOf(this.f5706c0));
            c1(2, 5, Integer.valueOf(this.f5708d0));
            c1(1, 9, Boolean.valueOf(this.f5722k0));
            c1(2, 7, eVar);
            c1(6, 8, eVar);
            d1(16, Integer.valueOf(this.f5730o0));
            gVar.e();
        } catch (Throwable th2) {
            this.f5707d.e();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t1.t A0() {
        t1.a0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return this.f5740t0;
        }
        return this.f5740t0.a().K(currentTimeline.n(l(), this.f52650a).f52538c.f52821e).I();
    }

    public static /* synthetic */ void B(int i10, t1.x.e eVar, t1.x.e eVar2, t1.x.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.onPositionDiscontinuity(eVar, eVar2, i10);
    }

    private int B0(boolean z10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (!this.H) {
            return 0;
        }
        if (!z10 || S0()) {
            return (z10 || this.f5742u0.f5138n != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t1.j C0(l2 l2Var) {
        return new t1.j.b(0).g(l2Var != null ? l2Var.d() : 0).f(l2Var != null ? l2Var.c() : 0).e();
    }

    private t1.a0 D0() {
        return new e2(this.f5729o, this.O);
    }

    private d2 E0(d2.b bVar) {
        int iK0 = K0(this.f5742u0);
        e1 e1Var = this.f5721k;
        t1.a0 a0Var = this.f5742u0.f5125a;
        if (iK0 == -1) {
            iK0 = 0;
        }
        return new d2(e1Var, bVar, a0Var, iK0, this.f5747x, e1Var.E());
    }

    private Pair F0(c2 c2Var, c2 c2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        t1.a0 a0Var = c2Var2.f5125a;
        t1.a0 a0Var2 = c2Var.f5125a;
        if (a0Var2.q() && a0Var.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (a0Var2.q() != a0Var.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (a0Var.n(a0Var.h(c2Var2.f5126b.f6055a, this.f5727n).f52521c, this.f52650a).f52536a.equals(a0Var2.n(a0Var2.h(c2Var.f5126b.f6055a, this.f5727n).f52521c, this.f52650a).f52536a)) {
            if (z10 && i10 == 0 && c2Var2.f5126b.f6058d < c2Var.f5126b.f6058d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    public static /* synthetic */ void I(c2 c2Var, t1.x.d dVar) {
        dVar.onLoadingChanged(c2Var.f5131g);
        dVar.onIsLoadingChanged(c2Var.f5131g);
    }

    private long I0(c2 c2Var) {
        if (!c2Var.f5126b.b()) {
            return w1.c0.c1(J0(c2Var));
        }
        c2Var.f5125a.h(c2Var.f5126b.f6055a, this.f5727n);
        return c2Var.f5127c == C.TIME_UNSET ? c2Var.f5125a.n(K0(c2Var), this.f52650a).b() : this.f5727n.m() + w1.c0.c1(c2Var.f5127c);
    }

    private long J0(c2 c2Var) {
        if (c2Var.f5125a.q()) {
            return w1.c0.E0(this.f5748x0);
        }
        long jM = c2Var.f5140p ? c2Var.m() : c2Var.f5143s;
        return c2Var.f5126b.b() ? jM : Y0(c2Var.f5125a, c2Var.f5126b, jM);
    }

    private int K0(c2 c2Var) {
        return c2Var.f5125a.q() ? this.f5744v0 : c2Var.f5125a.h(c2Var.f5126b.f6055a, this.f5727n).f52521c;
    }

    private Pair L0(t1.a0 a0Var, t1.a0 a0Var2, int i10, long j10) {
        boolean zQ = a0Var.q();
        long j11 = C.TIME_UNSET;
        if (zQ || a0Var2.q()) {
            boolean z10 = !a0Var.q() && a0Var2.q();
            int i11 = z10 ? -1 : i10;
            if (!z10) {
                j11 = j10;
            }
            return W0(a0Var2, i11, j11);
        }
        Pair pairJ = a0Var.j(this.f52650a, this.f5727n, i10, w1.c0.E0(j10));
        Object obj = ((Pair) w1.c0.h(pairJ)).first;
        if (a0Var2.b(obj) != -1) {
            return pairJ;
        }
        int iD0 = e1.D0(this.f52650a, this.f5727n, this.I, this.J, obj, a0Var, a0Var2);
        return iD0 != -1 ? W0(a0Var2, iD0, a0Var2.n(iD0, this.f52650a).b()) : W0(a0Var2, -1, C.TIME_UNSET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M0(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    private t1.x.e O0(long j10) {
        Object obj;
        int iB;
        t1.r rVar;
        Object obj2;
        int iL = l();
        if (this.f5742u0.f5125a.q()) {
            obj = null;
            iB = -1;
            rVar = null;
            obj2 = null;
        } else {
            c2 c2Var = this.f5742u0;
            Object obj3 = c2Var.f5126b.f6055a;
            c2Var.f5125a.h(obj3, this.f5727n);
            iB = this.f5742u0.f5125a.b(obj3);
            obj2 = obj3;
            obj = this.f5742u0.f5125a.n(iL, this.f52650a).f52536a;
            rVar = this.f52650a.f52538c;
        }
        int i10 = iB;
        long jC1 = w1.c0.c1(j10);
        long jC2 = this.f5742u0.f5126b.b() ? w1.c0.c1(Q0(this.f5742u0)) : jC1;
        androidx.media3.exoplayer.source.r.b bVar = this.f5742u0.f5126b;
        return new t1.x.e(obj, iL, rVar, obj2, i10, jC1, jC2, bVar.f6056b, bVar.f6057c);
    }

    private t1.x.e P0(int i10, c2 c2Var, int i11) {
        int i12;
        Object obj;
        t1.r rVar;
        Object obj2;
        int i13;
        long jQ0;
        long jQ1;
        t1.a0.b bVar = new t1.a0.b();
        if (c2Var.f5125a.q()) {
            i12 = i11;
            obj = null;
            rVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = c2Var.f5126b.f6055a;
            c2Var.f5125a.h(obj3, bVar);
            int i14 = bVar.f52521c;
            int iB = c2Var.f5125a.b(obj3);
            Object obj4 = c2Var.f5125a.n(i14, this.f52650a).f52536a;
            rVar = this.f52650a.f52538c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (c2Var.f5126b.b()) {
                androidx.media3.exoplayer.source.r.b bVar2 = c2Var.f5126b;
                jQ0 = bVar.b(bVar2.f6056b, bVar2.f6057c);
                jQ1 = Q0(c2Var);
            } else {
                jQ0 = c2Var.f5126b.f6059e != -1 ? Q0(this.f5742u0) : bVar.f52523e + bVar.f52522d;
                jQ1 = jQ0;
            }
        } else if (c2Var.f5126b.b()) {
            jQ0 = c2Var.f5143s;
            jQ1 = Q0(c2Var);
        } else {
            jQ0 = bVar.f52523e + c2Var.f5143s;
            jQ1 = jQ0;
        }
        long jC1 = w1.c0.c1(jQ0);
        long jC2 = w1.c0.c1(jQ1);
        androidx.media3.exoplayer.source.r.b bVar3 = c2Var.f5126b;
        return new t1.x.e(obj, i12, rVar, obj2, i13, jC1, jC2, bVar3.f6056b, bVar3.f6057c);
    }

    private static long Q0(c2 c2Var) {
        t1.a0.c cVar = new t1.a0.c();
        t1.a0.b bVar = new t1.a0.b();
        c2Var.f5125a.h(c2Var.f5126b.f6055a, bVar);
        return c2Var.f5127c == C.TIME_UNSET ? c2Var.f5125a.n(bVar.f52521c, cVar).c() : bVar.n() + c2Var.f5127c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(e1.e eVar) {
        boolean z10;
        long jY0;
        int i10 = this.K - eVar.f5313c;
        this.K = i10;
        boolean z11 = true;
        if (eVar.f5314d) {
            this.L = eVar.f5315e;
            this.M = true;
        }
        if (i10 == 0) {
            t1.a0 a0Var = eVar.f5312b.f5125a;
            if (!this.f5742u0.f5125a.q() && a0Var.q()) {
                this.f5744v0 = -1;
                this.f5748x0 = 0L;
                this.f5746w0 = 0;
            }
            if (!a0Var.q()) {
                List listF = ((e2) a0Var).F();
                w1.a.g(listF.size() == this.f5729o.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    ((f) this.f5729o.get(i11)).c((t1.a0) listF.get(i11));
                }
            }
            boolean z12 = this.M;
            long j10 = C.TIME_UNSET;
            if (z12) {
                if (eVar.f5312b.f5126b.equals(this.f5742u0.f5126b) && eVar.f5312b.f5128d == this.f5742u0.f5143s) {
                    z11 = false;
                }
                if (z11) {
                    if (a0Var.q() || eVar.f5312b.f5126b.b()) {
                        jY0 = eVar.f5312b.f5128d;
                    } else {
                        c2 c2Var = eVar.f5312b;
                        jY0 = Y0(a0Var, c2Var.f5126b, c2Var.f5128d);
                    }
                    j10 = jY0;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.M = false;
            n1(eVar.f5312b, 1, z10, this.L, j10, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S0() {
        AudioManager audioManager = this.G;
        if (audioManager == null || w1.c0.f55769a < 23) {
            return true;
        }
        return b.a(this.f5709e, audioManager.getDevices(2));
    }

    private int T0(int i10) {
        AudioTrack audioTrack = this.W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.W.release();
            this.W = null;
        }
        if (this.W == null) {
            this.W = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.W.getAudioSessionId();
    }

    private c2 V0(c2 c2Var, t1.a0 a0Var, Pair pair) {
        w1.a.a(a0Var.q() || pair != null);
        t1.a0 a0Var2 = c2Var.f5125a;
        long jI0 = I0(c2Var);
        c2 c2VarJ = c2Var.j(a0Var);
        if (a0Var.q()) {
            androidx.media3.exoplayer.source.r.b bVarL = c2.l();
            long jE0 = w1.c0.E0(this.f5748x0);
            c2 c2VarC = c2VarJ.d(bVarL, jE0, jE0, jE0, 0L, i2.v.f40816d, this.f5703b, com.google.common.collect.c0.C()).c(bVarL);
            c2VarC.f5141q = c2VarC.f5143s;
            return c2VarC;
        }
        Object obj = c2VarJ.f5126b.f6055a;
        boolean zEquals = obj.equals(((Pair) w1.c0.h(pair)).first);
        androidx.media3.exoplayer.source.r.b bVar = !zEquals ? new androidx.media3.exoplayer.source.r.b(pair.first) : c2VarJ.f5126b;
        long jLongValue = ((Long) pair.second).longValue();
        long jE1 = w1.c0.E0(jI0);
        if (!a0Var2.q()) {
            jE1 -= a0Var2.h(obj, this.f5727n).n();
        }
        if (!zEquals || jLongValue < jE1) {
            androidx.media3.exoplayer.source.r.b bVar2 = bVar;
            w1.a.g(!bVar2.b());
            c2 c2VarC2 = c2VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? i2.v.f40816d : c2VarJ.f5132h, !zEquals ? this.f5703b : c2VarJ.f5133i, !zEquals ? com.google.common.collect.c0.C() : c2VarJ.f5134j).c(bVar2);
            c2VarC2.f5141q = jLongValue;
            return c2VarC2;
        }
        if (jLongValue != jE1) {
            androidx.media3.exoplayer.source.r.b bVar3 = bVar;
            w1.a.g(!bVar3.b());
            long jMax = Math.max(0L, c2VarJ.f5142r - (jLongValue - jE1));
            long j10 = c2VarJ.f5141q;
            if (c2VarJ.f5135k.equals(c2VarJ.f5126b)) {
                j10 = jLongValue + jMax;
            }
            c2 c2VarD = c2VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, c2VarJ.f5132h, c2VarJ.f5133i, c2VarJ.f5134j);
            c2VarD.f5141q = j10;
            return c2VarD;
        }
        int iB = a0Var.b(c2VarJ.f5135k.f6055a);
        if (iB != -1 && a0Var.f(iB, this.f5727n).f52521c == a0Var.h(bVar.f6055a, this.f5727n).f52521c) {
            return c2VarJ;
        }
        a0Var.h(bVar.f6055a, this.f5727n);
        long jB = bVar.b() ? this.f5727n.b(bVar.f6056b, bVar.f6057c) : this.f5727n.f52522d;
        androidx.media3.exoplayer.source.r.b bVar4 = bVar;
        c2 c2VarC3 = c2VarJ.d(bVar4, c2VarJ.f5143s, c2VarJ.f5143s, c2VarJ.f5128d, jB - c2VarJ.f5143s, c2VarJ.f5132h, c2VarJ.f5133i, c2VarJ.f5134j).c(bVar4);
        c2VarC3.f5141q = jB;
        return c2VarC3;
    }

    private Pair W0(t1.a0 a0Var, int i10, long j10) {
        if (a0Var.q()) {
            this.f5744v0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f5748x0 = j10;
            this.f5746w0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= a0Var.p()) {
            i10 = a0Var.a(this.J);
            j10 = a0Var.n(i10, this.f52650a).b();
        }
        return a0Var.j(this.f52650a, this.f5727n, i10, w1.c0.E0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(final int i10, final int i11) {
        if (i10 == this.f5710e0.b() && i11 == this.f5710e0.a()) {
            return;
        }
        this.f5710e0 = new w1.v(i10, i11);
        this.f5723l.k(24, new w1.m.a() { // from class: androidx.media3.exoplayer.b0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((t1.x.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        c1(2, 14, new w1.v(i10, i11));
    }

    private long Y0(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, long j10) {
        a0Var.h(bVar.f6055a, this.f5727n);
        return j10 + this.f5727n.n();
    }

    private c2 Z0(c2 c2Var, int i10, int i11) {
        int iK0 = K0(c2Var);
        long jI0 = I0(c2Var);
        t1.a0 a0Var = c2Var.f5125a;
        int size = this.f5729o.size();
        this.K++;
        a1(i10, i11);
        t1.a0 a0VarD0 = D0();
        c2 c2VarV0 = V0(c2Var, a0VarD0, L0(a0Var, a0VarD0, iK0, jI0));
        int i12 = c2VarV0.f5129e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iK0 >= c2VarV0.f5125a.p()) {
            c2VarV0 = c2VarV0.h(4);
        }
        this.f5721k.r0(i10, i11, this.O);
        return c2VarV0;
    }

    private void a1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f5729o.remove(i12);
        }
        this.O = this.O.a(i10, i11);
    }

    private void b1() {
        TextureView textureView = this.f5704b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f5749y) {
                w1.n.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f5704b0.setSurfaceTextureListener(null);
            }
            this.f5704b0 = null;
        }
        SurfaceHolder surfaceHolder = this.Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f5749y);
            this.Z = null;
        }
    }

    private void c1(int i10, int i11, Object obj) {
        for (f2 f2Var : this.f5713g) {
            if (i10 == -1 || f2Var.getTrackType() == i10) {
                E0(f2Var).n(i11).m(obj).l();
            }
        }
    }

    private void d1(int i10, Object obj) {
        c1(-1, i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        c1(1, 2, Float.valueOf(this.f5720j0 * this.B.g()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    private void h1(List list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        c2 c2VarH;
        boolean z11;
        int iA = i10;
        int iK0 = K0(this.f5742u0);
        long currentPosition = getCurrentPosition();
        this.K++;
        if (!this.f5729o.isEmpty()) {
            a1(0, this.f5729o.size());
        }
        List listZ0 = z0(0, list);
        t1.a0 a0VarD0 = D0();
        if (!a0VarD0.q() && iA >= a0VarD0.p()) {
            throw new IllegalSeekPositionException(a0VarD0, iA, j10);
        }
        if (!z10) {
            if (iA == -1) {
                i11 = iK0;
                j11 = currentPosition;
            } else {
                j11 = j10;
            }
            c2 c2VarV0 = V0(this.f5742u0, a0VarD0, W0(a0VarD0, i11, j11));
            i12 = c2VarV0.f5129e;
            if (i11 != -1 && i12 != 1) {
                if (!a0VarD0.q() || i11 >= a0VarD0.p()) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            c2VarH = c2VarV0.h(i12);
            this.f5721k.S0(listZ0, i11, w1.c0.E0(j11), this.O);
            if (!this.f5742u0.f5126b.f6055a.equals(c2VarH.f5126b.f6055a) || this.f5742u0.f5125a.q()) {
                z11 = false;
            } else {
                z11 = true;
            }
            n1(c2VarH, 0, z11, 4, J0(c2VarH), -1, false);
        }
        iA = a0VarD0.a(this.J);
        j11 = C.TIME_UNSET;
        i11 = iA;
        c2 c2VarV1 = V0(this.f5742u0, a0VarD0, W0(a0VarD0, i11, j11));
        i12 = c2VarV1.f5129e;
        if (i11 != -1) {
            if (a0VarD0.q()) {
                i12 = 4;
            } else {
                i12 = 4;
            }
        }
        c2VarH = c2VarV1.h(i12);
        this.f5721k.S0(listZ0, i11, w1.c0.E0(j11), this.O);
        if (this.f5742u0.f5126b.f6055a.equals(c2VarH.f5126b.f6055a)) {
            z11 = false;
        } else {
            z11 = false;
        }
        n1(c2VarH, 0, z11, 4, J0(c2VarH), -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        j1(surface);
        this.Y = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (f2 f2Var : this.f5713g) {
            if (f2Var.getTrackType() == 2) {
                arrayList.add(E0(f2Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.X;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((d2) obj3).a(this.F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj4 = this.X;
            Surface surface = this.Y;
            if (obj4 == surface) {
                surface.release();
                this.Y = null;
            }
        }
        this.X = obj;
        if (z10) {
            k1(ExoPlaybackException.j(new ExoTimeoutException(3), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
        }
    }

    private void k1(ExoPlaybackException exoPlaybackException) {
        c2 c2Var = this.f5742u0;
        c2 c2VarC = c2Var.c(c2Var.f5126b);
        c2VarC.f5141q = c2VarC.f5143s;
        c2VarC.f5142r = 0L;
        c2 c2VarH = c2VarC.h(1);
        if (exoPlaybackException != null) {
            c2VarH = c2VarH.f(exoPlaybackException);
        }
        this.K++;
        this.f5721k.k1();
        n1(c2VarH, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private void l1() {
        t1.x.b bVar = this.R;
        t1.x.b bVarM = w1.c0.M(this.f5711f, this.f5705c);
        this.R = bVarM;
        if (bVarM.equals(bVar)) {
            return;
        }
        this.f5723l.h(13, new w1.m.a() { // from class: androidx.media3.exoplayer.h0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((t1.x.d) obj).onAvailableCommandsChanged(this.f5369a.R);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int iB0 = B0(z11, i10);
        c2 c2Var = this.f5742u0;
        if (c2Var.f5136l == z11 && c2Var.f5138n == iB0 && c2Var.f5137m == i11) {
            return;
        }
        o1(z11, i11, iB0);
    }

    private void n1(final c2 c2Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        c2 c2Var2 = this.f5742u0;
        this.f5742u0 = c2Var;
        boolean zEquals = c2Var2.f5125a.equals(c2Var.f5125a);
        Pair pairF0 = F0(c2Var, c2Var2, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairF0.first).booleanValue();
        final int iIntValue = ((Integer) pairF0.second).intValue();
        final t1.r rVar = null;
        if (zBooleanValue) {
            if (!c2Var.f5125a.q()) {
                rVar = c2Var.f5125a.n(c2Var.f5125a.h(c2Var.f5126b.f6055a, this.f5727n).f52521c, this.f52650a).f52538c;
            }
            this.f5740t0 = t1.t.H;
        }
        if (zBooleanValue || !c2Var2.f5134j.equals(c2Var.f5134j)) {
            this.f5740t0 = this.f5740t0.a().L(c2Var.f5134j).I();
        }
        t1.t tVarA0 = A0();
        boolean zEquals2 = tVarA0.equals(this.S);
        this.S = tVarA0;
        boolean z12 = c2Var2.f5136l != c2Var.f5136l;
        boolean z13 = c2Var2.f5129e != c2Var.f5129e;
        if (z13 || z12) {
            q1();
        }
        boolean z14 = c2Var2.f5131g;
        boolean z15 = c2Var.f5131g;
        boolean z16 = z14 != z15;
        if (z16) {
            p1(z15);
        }
        if (!zEquals) {
            this.f5723l.h(0, new w1.m.a() { // from class: androidx.media3.exoplayer.v
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    t1.x.d dVar = (t1.x.d) obj;
                    dVar.onTimelineChanged(c2Var.f5125a, i10);
                }
            });
        }
        if (z10) {
            final t1.x.e eVarP0 = P0(i11, c2Var2, i12);
            final t1.x.e eVarO0 = O0(j10);
            this.f5723l.h(11, new w1.m.a() { // from class: androidx.media3.exoplayer.l0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    q0.B(i11, eVarP0, eVarO0, (t1.x.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f5723l.h(1, new w1.m.a() { // from class: androidx.media3.exoplayer.m0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onMediaItemTransition(rVar, iIntValue);
                }
            });
        }
        if (c2Var2.f5130f != c2Var.f5130f) {
            this.f5723l.h(10, new w1.m.a() { // from class: androidx.media3.exoplayer.n0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onPlayerErrorChanged(c2Var.f5130f);
                }
            });
            if (c2Var.f5130f != null) {
                this.f5723l.h(10, new w1.m.a() { // from class: androidx.media3.exoplayer.o0
                    @Override // w1.m.a
                    public final void invoke(Object obj) {
                        ((t1.x.d) obj).onPlayerError(c2Var.f5130f);
                    }
                });
            }
        }
        k2.w wVar = c2Var2.f5133i;
        k2.w wVar2 = c2Var.f5133i;
        if (wVar != wVar2) {
            this.f5715h.h(wVar2.f42970e);
            this.f5723l.h(2, new w1.m.a() { // from class: androidx.media3.exoplayer.p0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onTracksChanged(c2Var.f5133i.f42969d);
                }
            });
        }
        if (!zEquals2) {
            final t1.t tVar = this.S;
            this.f5723l.h(14, new w1.m.a() { // from class: androidx.media3.exoplayer.w
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onMediaMetadataChanged(tVar);
                }
            });
        }
        if (z16) {
            this.f5723l.h(3, new w1.m.a() { // from class: androidx.media3.exoplayer.x
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    q0.I(c2Var, (t1.x.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f5723l.h(-1, new w1.m.a() { // from class: androidx.media3.exoplayer.y
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    c2 c2Var3 = c2Var;
                    ((t1.x.d) obj).onPlayerStateChanged(c2Var3.f5136l, c2Var3.f5129e);
                }
            });
        }
        if (z13) {
            this.f5723l.h(4, new w1.m.a() { // from class: androidx.media3.exoplayer.z
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onPlaybackStateChanged(c2Var.f5129e);
                }
            });
        }
        if (z12 || c2Var2.f5137m != c2Var.f5137m) {
            this.f5723l.h(5, new w1.m.a() { // from class: androidx.media3.exoplayer.g0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    c2 c2Var3 = c2Var;
                    ((t1.x.d) obj).onPlayWhenReadyChanged(c2Var3.f5136l, c2Var3.f5137m);
                }
            });
        }
        if (c2Var2.f5138n != c2Var.f5138n) {
            this.f5723l.h(6, new w1.m.a() { // from class: androidx.media3.exoplayer.i0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onPlaybackSuppressionReasonChanged(c2Var.f5138n);
                }
            });
        }
        if (c2Var2.n() != c2Var.n()) {
            this.f5723l.h(7, new w1.m.a() { // from class: androidx.media3.exoplayer.j0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onIsPlayingChanged(c2Var.n());
                }
            });
        }
        if (!c2Var2.f5139o.equals(c2Var.f5139o)) {
            this.f5723l.h(12, new w1.m.a() { // from class: androidx.media3.exoplayer.k0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onPlaybackParametersChanged(c2Var.f5139o);
                }
            });
        }
        l1();
        this.f5723l.f();
        if (c2Var2.f5140p != c2Var.f5140p) {
            Iterator it = this.f5725m.iterator();
            while (it.hasNext()) {
                ((o.a) it.next()).x(c2Var.f5140p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(boolean z10, int i10, int i11) {
        this.K++;
        c2 c2VarA = this.f5742u0;
        if (c2VarA.f5140p) {
            c2VarA = c2VarA.a();
        }
        c2 c2VarE = c2VarA.e(z10, i10, i11);
        this.f5721k.V0(z10, i10, i11);
        n1(c2VarE, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private void p1(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1() {
        int playbackState = getPlaybackState();
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zU0 = U0();
                n2 n2Var = this.D;
                if (getPlayWhenReady() && !zU0) {
                    z10 = true;
                }
                n2Var.b(z10);
                this.E.b(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.b(false);
        this.E.b(false);
    }

    private void r1() {
        this.f5707d.b();
        if (Thread.currentThread() != G0().getThread()) {
            String strF = w1.c0.F("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), G0().getThread().getName());
            if (this.f5726m0) {
                throw new IllegalStateException(strF);
            }
            w1.n.i("ExoPlayerImpl", strF, this.f5728n0 ? null : new IllegalStateException());
            this.f5728n0 = true;
        }
    }

    private List z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b2.c cVar = new b2.c((androidx.media3.exoplayer.source.r) list.get(i11), this.f5731p);
            arrayList.add(cVar);
            this.f5729o.add(i11 + i10, new f(cVar.f5118b, cVar.f5117a));
        }
        this.O = this.O.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    public Looper G0() {
        return this.f5737s;
    }

    public long H0() {
        r1();
        if (this.f5742u0.f5125a.q()) {
            return this.f5748x0;
        }
        c2 c2Var = this.f5742u0;
        if (c2Var.f5135k.f6058d != c2Var.f5126b.f6058d) {
            return c2Var.f5125a.n(l(), this.f52650a).d();
        }
        long j10 = c2Var.f5141q;
        if (this.f5742u0.f5135k.b()) {
            c2 c2Var2 = this.f5742u0;
            t1.a0.b bVarH = c2Var2.f5125a.h(c2Var2.f5135k.f6055a, this.f5727n);
            long jF = bVarH.f(this.f5742u0.f5135k.f6056b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f52522d : jF;
        }
        c2 c2Var3 = this.f5742u0;
        return w1.c0.c1(Y0(c2Var3.f5125a, c2Var3.f5135k, j10));
    }

    @Override // t1.x
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException d() {
        r1();
        return this.f5742u0.f5130f;
    }

    public boolean U0() {
        r1();
        return this.f5742u0.f5140p;
    }

    @Override // t1.x
    public void a() {
        r1();
        boolean playWhenReady = getPlayWhenReady();
        int iP = this.B.p(playWhenReady, 2);
        m1(playWhenReady, iP, M0(iP));
        c2 c2Var = this.f5742u0;
        if (c2Var.f5129e != 1) {
            return;
        }
        c2 c2VarF = c2Var.f(null);
        c2 c2VarH = c2VarF.h(c2VarF.f5125a.q() ? 4 : 2);
        this.K++;
        this.f5721k.l0();
        n1(c2VarH, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // t1.x
    public long c() {
        r1();
        return w1.c0.c1(this.f5742u0.f5142r);
    }

    @Override // t1.x
    public void clearVideoSurface() {
        r1();
        b1();
        j1(null);
        X0(0, 0);
    }

    @Override // t1.x
    public t1.d0 e() {
        r1();
        return this.f5742u0.f5133i.f42969d;
    }

    public void f1(List list) {
        r1();
        g1(list, true);
    }

    public void g1(List list, boolean z10) {
        r1();
        h1(list, -1, C.TIME_UNSET, z10);
    }

    @Override // t1.x
    public long getBufferedPosition() {
        r1();
        if (!isPlayingAd()) {
            return H0();
        }
        c2 c2Var = this.f5742u0;
        return c2Var.f5135k.equals(c2Var.f5126b) ? w1.c0.c1(this.f5742u0.f5141q) : getDuration();
    }

    @Override // t1.x
    public long getContentPosition() {
        r1();
        return I0(this.f5742u0);
    }

    @Override // t1.x
    public int getCurrentAdGroupIndex() {
        r1();
        if (isPlayingAd()) {
            return this.f5742u0.f5126b.f6056b;
        }
        return -1;
    }

    @Override // t1.x
    public int getCurrentAdIndexInAdGroup() {
        r1();
        if (isPlayingAd()) {
            return this.f5742u0.f5126b.f6057c;
        }
        return -1;
    }

    @Override // t1.x
    public int getCurrentPeriodIndex() {
        r1();
        if (this.f5742u0.f5125a.q()) {
            return this.f5746w0;
        }
        c2 c2Var = this.f5742u0;
        return c2Var.f5125a.b(c2Var.f5126b.f6055a);
    }

    @Override // t1.x
    public long getCurrentPosition() {
        r1();
        return w1.c0.c1(J0(this.f5742u0));
    }

    @Override // t1.x
    public t1.a0 getCurrentTimeline() {
        r1();
        return this.f5742u0.f5125a;
    }

    @Override // t1.x
    public long getDuration() {
        r1();
        if (!isPlayingAd()) {
            return r();
        }
        c2 c2Var = this.f5742u0;
        androidx.media3.exoplayer.source.r.b bVar = c2Var.f5126b;
        c2Var.f5125a.h(bVar.f6055a, this.f5727n);
        return w1.c0.c1(this.f5727n.b(bVar.f6056b, bVar.f6057c));
    }

    @Override // t1.x
    public boolean getPlayWhenReady() {
        r1();
        return this.f5742u0.f5136l;
    }

    @Override // t1.x
    public int getPlaybackState() {
        r1();
        return this.f5742u0.f5129e;
    }

    @Override // t1.x
    public int getRepeatMode() {
        r1();
        return this.I;
    }

    @Override // t1.x
    public boolean getShuffleModeEnabled() {
        r1();
        return this.J;
    }

    @Override // t1.x
    public int h() {
        r1();
        return this.f5742u0.f5138n;
    }

    @Override // t1.x
    public t1.g0 i() {
        r1();
        return this.f5738s0;
    }

    @Override // t1.x
    public boolean isPlayingAd() {
        r1();
        return this.f5742u0.f5126b.b();
    }

    @Override // t1.x
    public int l() {
        r1();
        int iK0 = K0(this.f5742u0);
        if (iK0 == -1) {
            return 0;
        }
        return iK0;
    }

    @Override // t1.x
    public void n(t1.x.d dVar) {
        r1();
        this.f5723l.j((t1.x.d) w1.a.e(dVar));
    }

    @Override // t1.x
    public void o(int i10, int i11) {
        r1();
        w1.a.a(i10 >= 0 && i11 >= i10);
        int size = this.f5729o.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        c2 c2VarZ0 = Z0(this.f5742u0, i10, iMin);
        n1(c2VarZ0, 0, !c2VarZ0.f5126b.f6055a.equals(this.f5742u0.f5126b.f6055a), 4, J0(c2VarZ0), -1, false);
    }

    @Override // androidx.media3.exoplayer.o
    public void p(androidx.media3.exoplayer.source.r rVar) {
        r1();
        f1(Collections.singletonList(rVar));
    }

    @Override // t1.x
    public void q(t1.x.d dVar) {
        this.f5723l.c((t1.x.d) w1.a.e(dVar));
    }

    @Override // androidx.media3.exoplayer.o
    public void release() {
        AudioTrack audioTrack;
        w1.n.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + w1.c0.f55773e + "] [" + t1.s.b() + "]");
        r1();
        if (w1.c0.f55769a < 21 && (audioTrack = this.W) != null) {
            audioTrack.release();
            this.W = null;
        }
        this.A.b(false);
        l2 l2Var = this.C;
        if (l2Var != null) {
            l2Var.g();
        }
        this.D.b(false);
        this.E.b(false);
        this.B.i();
        if (!this.f5721k.n0()) {
            this.f5723l.k(10, new w1.m.a() { // from class: androidx.media3.exoplayer.c0
                @Override // w1.m.a
                public final void invoke(Object obj) {
                    ((t1.x.d) obj).onPlayerError(ExoPlaybackException.j(new ExoTimeoutException(1), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                }
            });
        }
        this.f5723l.i();
        this.f5717i.removeCallbacksAndMessages(null);
        this.f5739t.d(this.f5735r);
        c2 c2Var = this.f5742u0;
        if (c2Var.f5140p) {
            this.f5742u0 = c2Var.a();
        }
        c2 c2VarH = this.f5742u0.h(1);
        this.f5742u0 = c2VarH;
        c2 c2VarC = c2VarH.c(c2VarH.f5126b);
        this.f5742u0 = c2VarC;
        c2VarC.f5141q = c2VarC.f5143s;
        this.f5742u0.f5142r = 0L;
        this.f5735r.release();
        this.f5715h.i();
        b1();
        Surface surface = this.Y;
        if (surface != null) {
            surface.release();
            this.Y = null;
        }
        if (this.f5732p0) {
            android.support.v4.media.session.b.a(w1.a.e(null));
            throw null;
        }
        this.f5724l0 = v1.b.f55092c;
        this.f5734q0 = true;
    }

    @Override // t1.x
    public void setPlayWhenReady(boolean z10) {
        r1();
        int iP = this.B.p(z10, getPlaybackState());
        m1(z10, iP, M0(iP));
    }

    @Override // t1.x
    public void setVideoSurface(Surface surface) {
        r1();
        b1();
        j1(surface);
        int i10 = surface == null ? 0 : -1;
        X0(i10, i10);
    }

    @Override // t1.x
    public void setVolume(float f10) {
        r1();
        final float fN = w1.c0.n(f10, 0.0f, 1.0f);
        if (this.f5720j0 == fN) {
            return;
        }
        this.f5720j0 = fN;
        e1();
        this.f5723l.k(22, new w1.m.a() { // from class: androidx.media3.exoplayer.a0
            @Override // w1.m.a
            public final void invoke(Object obj) {
                ((t1.x.d) obj).onVolumeChanged(fN);
            }
        });
    }

    @Override // t1.x
    public void stop() {
        r1();
        this.B.p(getPlayWhenReady(), 1);
        k1(null);
        this.f5724l0 = new v1.b(com.google.common.collect.c0.C(), this.f5742u0.f5143s);
    }

    public void x0(c2.b bVar) {
        this.f5735r.E((c2.b) w1.a.e(bVar));
    }

    public void y0(o.a aVar) {
        this.f5725m.add(aVar);
    }

    @Override // t1.d
    public void v(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        r1();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w1.a.a(z11);
            t1.a0 a0Var = this.f5742u0.f5125a;
            if (!a0Var.q() && i10 >= a0Var.p()) {
                return;
            }
            this.f5735r.m();
            this.K++;
            if (isPlayingAd()) {
                w1.n.h(lkCBSIFlvmyGX.gVdQHsN, "seekTo ignored because an ad is playing");
                e1.e eVar = new e1.e(this.f5742u0);
                eVar.b(1);
                this.f5719j.a(eVar);
                return;
            }
            c2 c2VarH = this.f5742u0;
            int i12 = c2VarH.f5129e;
            if (i12 == 3 || (i12 == 4 && !a0Var.q())) {
                c2VarH = this.f5742u0.h(2);
            }
            int iL = l();
            c2 c2VarV0 = V0(c2VarH, a0Var, W0(a0Var, i10, j10));
            this.f5721k.F0(a0Var, i10, w1.c0.E0(j10));
            n1(c2VarV0, 0, true, 1, J0(c2VarV0), iL, z10);
        }
    }
}
