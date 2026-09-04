package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.o;
import c2.x1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.c0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d2.r;
import d2.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import o2.f0;
import o2.h0;
import t1.v;
import t1.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static boolean f4907n0 = false;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Object f4908o0 = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static ExecutorService f4909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static int f4910q0;
    private j A;
    private t1.b B;
    private i C;
    private i D;
    private w E;
    private boolean F;
    private ByteBuffer G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private boolean N;
    private boolean O;
    private long P;
    private float Q;
    private ByteBuffer R;
    private int S;
    private ByteBuffer T;
    private byte[] U;
    private int V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4911a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f4912a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1.a f4913b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f4914b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4915c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private t1.c f4916c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.h f4917d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f4918d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f4919e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f4920e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f4921f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private long f4922f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f4923g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private long f4924g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1.g f4925h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f4926h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.g f4927i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f4928i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f4929j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Looper f4930j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f4931k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private long f4932k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4933l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f4934l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f4935m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Handler f4936m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f4937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f4938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f4939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f4940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o.a f4941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private x1 f4942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AudioSink.b f4943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f4944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g f4945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.media3.common.audio.a f4946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AudioTrack f4947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f4948y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.b f4949z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static void a(AudioTrack audioTrack, androidx.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f5014a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static void a(AudioTrack audioTrack, x1 x1Var) {
            LogSessionId logSessionIdA = x1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        androidx.media3.exoplayer.audio.d a(t1.o oVar, t1.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4950a = new androidx.media3.exoplayer.audio.k.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4951a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u1.a f4953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4956f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f4958h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private o.a f4959i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.a f4952b = androidx.media3.exoplayer.audio.a.f4990c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f4957g = e.f4950a;

        public f(Context context) {
            this.f4951a = context;
        }

        public DefaultAudioSink i() {
            w1.a.g(!this.f4956f);
            this.f4956f = true;
            if (this.f4953c == null) {
                this.f4953c = new h(new AudioProcessor[0]);
            }
            if (this.f4958h == null) {
                this.f4958h = new androidx.media3.exoplayer.audio.i(this.f4951a);
            }
            return new DefaultAudioSink(this);
        }

        public f j(boolean z10) {
            this.f4955e = z10;
            return this;
        }

        public f k(boolean z10) {
            this.f4954d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t1.o f4960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f4966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f4967h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f4968i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f4969j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f4970k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f4971l;

        public g(t1.o oVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f4960a = oVar;
            this.f4961b = i10;
            this.f4962c = i11;
            this.f4963d = i12;
            this.f4964e = i13;
            this.f4965f = i14;
            this.f4966g = i15;
            this.f4967h = i16;
            this.f4968i = aVar;
            this.f4969j = z10;
            this.f4970k = z11;
            this.f4971l = z12;
        }

        private AudioTrack e(t1.b bVar, int i10) {
            int i11 = w1.c0.f55769a;
            if (i11 >= 29) {
                return g(bVar, i10);
            }
            return i11 >= 21 ? f(bVar, i10) : h(bVar, i10);
        }

        private AudioTrack f(t1.b bVar, int i10) {
            return new AudioTrack(j(bVar, this.f4971l), w1.c0.K(this.f4964e, this.f4965f, this.f4966g), this.f4967h, 1, i10);
        }

        private AudioTrack g(t1.b bVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(j(bVar, this.f4971l)).setAudioFormat(w1.c0.K(this.f4964e, this.f4965f, this.f4966g)).setTransferMode(1).setBufferSizeInBytes(this.f4967h).setSessionId(i10).setOffloadedPlayback(this.f4962c == 1).build();
        }

        private AudioTrack h(t1.b bVar, int i10) {
            int iH0 = w1.c0.h0(bVar.f52560c);
            return i10 == 0 ? new AudioTrack(iH0, this.f4964e, this.f4965f, this.f4966g, this.f4967h, 1) : new AudioTrack(iH0, this.f4964e, this.f4965f, this.f4966g, this.f4967h, 1, i10);
        }

        private static AudioAttributes j(t1.b bVar, boolean z10) {
            return z10 ? k() : bVar.a().f52564a;
        }

        private static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(t1.b bVar, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackE = e(bVar, i10);
                int state = audioTrackE.getState();
                if (state == 1) {
                    return audioTrackE;
                }
                try {
                    audioTrackE.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f4964e, this.f4965f, this.f4967h, this.f4960a, m(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f4964e, this.f4965f, this.f4967h, this.f4960a, m(), e10);
            }
        }

        public AudioSink.a b() {
            return new AudioSink.a(this.f4966g, this.f4964e, this.f4965f, this.f4971l, this.f4962c == 1, this.f4967h);
        }

        public boolean c(g gVar) {
            return gVar.f4962c == this.f4962c && gVar.f4966g == this.f4966g && gVar.f4964e == this.f4964e && gVar.f4965f == this.f4965f && gVar.f4963d == this.f4963d && gVar.f4969j == this.f4969j && gVar.f4970k == this.f4970k;
        }

        public g d(int i10) {
            return new g(this.f4960a, this.f4961b, this.f4962c, this.f4963d, this.f4964e, this.f4965f, this.f4966g, i10, this.f4968i, this.f4969j, this.f4970k, this.f4971l);
        }

        public long i(long j10) {
            return w1.c0.M0(j10, this.f4964e);
        }

        public long l(long j10) {
            return w1.c0.M0(j10, this.f4960a.C);
        }

        public boolean m() {
            return this.f4962c == 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h implements u1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f4972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f4973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.d f4974c;

        public h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new t(), new androidx.media3.common.audio.d());
        }

        @Override // u1.a
        public boolean a(boolean z10) {
            this.f4973b.y(z10);
            return z10;
        }

        @Override // u1.a
        public w b(w wVar) {
            this.f4974c.d(wVar.f53030a);
            this.f4974c.c(wVar.f53031b);
            return wVar;
        }

        @Override // u1.a
        public AudioProcessor[] getAudioProcessors() {
            return this.f4972a;
        }

        @Override // u1.a
        public long getMediaDuration(long j10) {
            return this.f4974c.isActive() ? this.f4974c.b(j10) : j10;
        }

        @Override // u1.a
        public long getSkippedOutputFrameCount() {
            return this.f4973b.p();
        }

        public h(AudioProcessor[] audioProcessorArr, t tVar, androidx.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f4972a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f4973b = tVar;
            this.f4974c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = tVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f4975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4977c;

        private i(w wVar, long j10, long j11) {
            this.f4975a = wVar;
            this.f4976b = j10;
            this.f4977c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f4978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.b f4979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f4980c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f5067a.b(audioRouting);
            }
        };

        public j(AudioTrack audioTrack, androidx.media3.exoplayer.audio.b bVar) {
            this.f4978a = audioTrack;
            this.f4979b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f4980c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f4980c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.f4979b.i(audioRouting.getRoutedDevice());
        }

        public void c() {
            this.f4978a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) w1.a.e(this.f4980c));
            this.f4980c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f4981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f4982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4983c;

        public k(long j10) {
            this.f4981a = j10;
        }

        public void a() {
            this.f4982b = null;
        }

        public void b(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f4982b == null) {
                this.f4982b = exc;
                this.f4983c = this.f4981a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f4983c) {
                Exception exc2 = this.f4982b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f4982b;
                a();
                throw exc3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class l implements androidx.media3.exoplayer.audio.g.a {
        private l() {
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void b(long j10) {
            if (DefaultAudioSink.this.f4943t != null) {
                DefaultAudioSink.this.f4943t.b(j10);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void onInvalidLatency(long j10) {
            w1.n.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.I() + ", " + DefaultAudioSink.this.J();
            if (DefaultAudioSink.f4907n0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            w1.n.h("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.I() + ", " + DefaultAudioSink.this.J();
            if (DefaultAudioSink.f4907n0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            w1.n.h("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.f4943t != null) {
                DefaultAudioSink.this.f4943t.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f4924g0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f4985a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f4986b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f4988a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f4988a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f4947x) && DefaultAudioSink.this.f4943t != null && DefaultAudioSink.this.Z) {
                    DefaultAudioSink.this.f4943t.e();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f4947x)) {
                    DefaultAudioSink.this.Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f4947x) && DefaultAudioSink.this.f4943t != null && DefaultAudioSink.this.Z) {
                    DefaultAudioSink.this.f4943t.e();
                }
            }
        }

        public m() {
            this.f4986b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f4985a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new r(handler), this.f4986b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f4986b);
            this.f4985a.removeCallbacksAndMessages(null);
        }
    }

    private void A(long j10) {
        w wVarB;
        if (g0()) {
            wVarB = w.f53027d;
        } else {
            wVarB = e0() ? this.f4913b.b(this.E) : w.f53027d;
            this.E = wVarB;
        }
        w wVar = wVarB;
        this.F = e0() ? this.f4913b.a(this.F) : false;
        this.f4929j.add(new i(wVar, Math.max(0L, j10), this.f4945v.i(J())));
        d0();
        AudioSink.b bVar = this.f4943t;
        if (bVar != null) {
            bVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    private long B(long j10) {
        while (!this.f4929j.isEmpty() && j10 >= ((i) this.f4929j.getFirst()).f4977c) {
            this.D = (i) this.f4929j.remove();
        }
        long j11 = j10 - this.D.f4977c;
        if (this.f4929j.isEmpty()) {
            return this.D.f4976b + this.f4913b.getMediaDuration(j11);
        }
        i iVar = (i) this.f4929j.getFirst();
        return iVar.f4976b - w1.c0.Z(iVar.f4977c - j10, this.D.f4975a.f53030a);
    }

    private long C(long j10) {
        long skippedOutputFrameCount = this.f4913b.getSkippedOutputFrameCount();
        long jI = j10 + this.f4945v.i(skippedOutputFrameCount);
        long j11 = this.f4932k0;
        if (skippedOutputFrameCount > j11) {
            long jI2 = this.f4945v.i(skippedOutputFrameCount - j11);
            this.f4932k0 = skippedOutputFrameCount;
            K(jI2);
        }
        return jI;
    }

    private AudioTrack D(g gVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = gVar.a(this.B, this.f4914b0);
            o.a aVar = this.f4941r;
            if (aVar == null) {
                return audioTrackA;
            }
            aVar.w(O(audioTrackA));
            return audioTrackA;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.b bVar = this.f4943t;
            if (bVar != null) {
                bVar.a(e10);
            }
            throw e10;
        }
    }

    private AudioTrack E() throws AudioSink.InitializationException {
        try {
            return D((g) w1.a.e(this.f4945v));
        } catch (AudioSink.InitializationException e10) {
            g gVar = this.f4945v;
            if (gVar.f4967h > 1000000) {
                g gVarD = gVar.d(1000000);
                try {
                    AudioTrack audioTrackD = D(gVarD);
                    this.f4945v = gVarD;
                    return audioTrackD;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    P();
                    throw e10;
                }
            }
            P();
            throw e10;
        }
    }

    private boolean F() throws Exception {
        ByteBuffer byteBuffer;
        if (this.f4946w.f()) {
            this.f4946w.h();
            U(Long.MIN_VALUE);
            return this.f4946w.e() && ((byteBuffer = this.T) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.T;
        if (byteBuffer2 == null) {
            return true;
        }
        h0(byteBuffer2, Long.MIN_VALUE);
        return this.T == null;
    }

    private static int G(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        w1.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int H(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return h0.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = f0.m(w1.c0.N(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return UserVerificationMethods.USER_VERIFY_ALL;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = o2.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return o2.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return UserVerificationMethods.USER_VERIFY_ALL;
                        case 17:
                            return o2.c.c(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return o2.b.e(byteBuffer);
        }
        return o2.o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long I() {
        g gVar = this.f4945v;
        return gVar.f4962c == 0 ? this.I / ((long) gVar.f4961b) : this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long J() {
        g gVar = this.f4945v;
        return gVar.f4962c == 0 ? w1.c0.k(this.K, gVar.f4963d) : this.L;
    }

    private void K(long j10) {
        this.f4934l0 += j10;
        if (this.f4936m0 == null) {
            this.f4936m0 = new Handler(Looper.myLooper());
        }
        this.f4936m0.removeCallbacksAndMessages(null);
        this.f4936m0.postDelayed(new Runnable() { // from class: d2.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f36141a.Q();
            }
        }, 100L);
    }

    private boolean L() throws AudioSink.InitializationException {
        androidx.media3.exoplayer.audio.b bVar;
        x1 x1Var;
        if (!this.f4925h.d()) {
            return false;
        }
        AudioTrack audioTrackE = E();
        this.f4947x = audioTrackE;
        if (O(audioTrackE)) {
            V(this.f4947x);
            g gVar = this.f4945v;
            if (gVar.f4970k) {
                AudioTrack audioTrack = this.f4947x;
                t1.o oVar = gVar.f4960a;
                audioTrack.setOffloadDelayPadding(oVar.E, oVar.F);
            }
        }
        int i10 = w1.c0.f55769a;
        if (i10 >= 31 && (x1Var = this.f4942s) != null) {
            c.a(this.f4947x, x1Var);
        }
        this.f4914b0 = this.f4947x.getAudioSessionId();
        androidx.media3.exoplayer.audio.g gVar2 = this.f4927i;
        AudioTrack audioTrack2 = this.f4947x;
        g gVar3 = this.f4945v;
        gVar2.s(audioTrack2, gVar3.f4962c == 2, gVar3.f4966g, gVar3.f4963d, gVar3.f4967h);
        a0();
        int i11 = this.f4916c0.f52577a;
        if (i11 != 0) {
            this.f4947x.attachAuxEffect(i11);
            this.f4947x.setAuxEffectSendLevel(this.f4916c0.f52578b);
        }
        androidx.media3.exoplayer.audio.c cVar = this.f4918d0;
        if (cVar != null && i10 >= 23) {
            b.a(this.f4947x, cVar);
            androidx.media3.exoplayer.audio.b bVar2 = this.f4949z;
            if (bVar2 != null) {
                bVar2.i(this.f4918d0.f5014a);
            }
        }
        if (i10 >= 24 && (bVar = this.f4949z) != null) {
            this.A = new j(this.f4947x, bVar);
        }
        this.O = true;
        AudioSink.b bVar3 = this.f4943t;
        if (bVar3 != null) {
            bVar3.j(this.f4945v.b());
        }
        return true;
    }

    private static boolean M(int i10) {
        return (w1.c0.f55769a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean N() {
        return this.f4947x != null;
    }

    private static boolean O(AudioTrack audioTrack) {
        return w1.c0.f55769a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void P() {
        if (this.f4945v.m()) {
            this.f4926h0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (this.f4934l0 >= 300000) {
            this.f4943t.f();
            this.f4934l0 = 0L;
        }
    }

    private void R() {
        if (this.f4949z != null || this.f4911a == null) {
            return;
        }
        this.f4930j0 = Looper.myLooper();
        androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(this.f4911a, new androidx.media3.exoplayer.audio.b.f() { // from class: d2.p
            @Override // androidx.media3.exoplayer.audio.b.f
            public final void a(androidx.media3.exoplayer.audio.a aVar) {
                this.f36142a.S(aVar);
            }
        }, this.B, this.f4918d0);
        this.f4949z = bVar;
        this.f4948y = bVar.g();
    }

    private void T() {
        if (this.X) {
            return;
        }
        this.X = true;
        this.f4927i.g(J());
        if (O(this.f4947x)) {
            this.Y = false;
        }
        this.f4947x.stop();
        this.H = 0;
    }

    private void U(long j10) throws Exception {
        ByteBuffer byteBufferD;
        if (!this.f4946w.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.f4623a;
            }
            h0(byteBuffer, j10);
            return;
        }
        while (!this.f4946w.e()) {
            do {
                byteBufferD = this.f4946w.d();
                if (byteBufferD.hasRemaining()) {
                    h0(byteBufferD, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f4946w.i(this.R);
                    }
                }
            } while (!byteBufferD.hasRemaining());
            return;
        }
    }

    private void V(AudioTrack audioTrack) {
        if (this.f4935m == null) {
            this.f4935m = new m();
        }
        this.f4935m.a(audioTrack);
    }

    private static void W(final AudioTrack audioTrack, final w1.g gVar, final AudioSink.b bVar, final AudioSink.a aVar) {
        gVar.c();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f4908o0) {
            try {
                if (f4909p0 == null) {
                    f4909p0 = w1.c0.F0("ExoPlayer:AudioTrackReleaseThread");
                }
                f4910q0++;
                f4909p0.execute(new Runnable() { // from class: d2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.b(audioTrack, bVar, handler, aVar, gVar);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void X() {
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.f4928i0 = false;
        this.M = 0;
        this.D = new i(this.E, 0L, 0L);
        this.P = 0L;
        this.C = null;
        this.f4929j.clear();
        this.R = null;
        this.S = 0;
        this.T = null;
        this.X = false;
        this.W = false;
        this.Y = false;
        this.G = null;
        this.H = 0;
        this.f4919e.i();
        d0();
    }

    private void Y(w wVar) {
        i iVar = new i(wVar, C.TIME_UNSET, C.TIME_UNSET);
        if (N()) {
            this.C = iVar;
        } else {
            this.D = iVar;
        }
    }

    private void Z() {
        if (N()) {
            try {
                this.f4947x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f53030a).setPitch(this.E.f53031b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                w1.n.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            w wVar = new w(this.f4947x.getPlaybackParams().getSpeed(), this.f4947x.getPlaybackParams().getPitch());
            this.E = wVar;
            this.f4927i.t(wVar.f53030a);
        }
    }

    private void a0() {
        if (N()) {
            if (w1.c0.f55769a >= 21) {
                b0(this.f4947x, this.Q);
            } else {
                c0(this.f4947x, this.Q);
            }
        }
    }

    public static /* synthetic */ void b(AudioTrack audioTrack, final AudioSink.b bVar, Handler handler, final AudioSink.a aVar, w1.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: d2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.k(aVar);
                    }
                });
            }
            gVar.e();
            synchronized (f4908o0) {
                try {
                    int i10 = f4910q0 - 1;
                    f4910q0 = i10;
                    if (i10 == 0) {
                        f4909p0.shutdown();
                        f4909p0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: d2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.k(aVar);
                    }
                });
            }
            gVar.e();
            synchronized (f4908o0) {
                try {
                    int i11 = f4910q0 - 1;
                    f4910q0 = i11;
                    if (i11 == 0) {
                        f4909p0.shutdown();
                        f4909p0 = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private static void b0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void c0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void d0() {
        androidx.media3.common.audio.a aVar = this.f4945v.f4968i;
        this.f4946w = aVar;
        aVar.b();
    }

    private boolean e0() {
        if (this.f4920e0) {
            return false;
        }
        g gVar = this.f4945v;
        return gVar.f4962c == 0 && !f0(gVar.f4960a.D);
    }

    private boolean f0(int i10) {
        return this.f4915c && w1.c0.v0(i10);
    }

    private boolean g0() {
        g gVar = this.f4945v;
        return gVar != null && gVar.f4969j && w1.c0.f55769a >= 23;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    private void h0(ByteBuffer byteBuffer, long j10) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iI0;
        AudioSink.b bVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.T;
            boolean z10 = true;
            if (byteBuffer3 != null) {
                w1.a.a(byteBuffer3 == byteBuffer);
            } else {
                this.T = byteBuffer;
                if (w1.c0.f55769a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.U;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.U = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.U, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.V = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (w1.c0.f55769a < 21) {
                int iC = this.f4927i.c(this.K);
                if (iC > 0) {
                    iI0 = this.f4947x.write(this.U, this.V, Math.min(iRemaining2, iC));
                    if (iI0 > 0) {
                        this.V += iI0;
                        byteBuffer.position(byteBuffer.position() + iI0);
                    }
                } else {
                    iI0 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f4920e0) {
                w1.a.g(j10 != C.TIME_UNSET);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f4922f0;
                } else {
                    this.f4922f0 = j10;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iI0 = defaultAudioSink.j0(this.f4947x, byteBuffer2, iRemaining2, j10);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iI0 = i0(defaultAudioSink.f4947x, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.f4924g0 = SystemClock.elapsedRealtime();
            if (iI0 < 0) {
                if (!M(iI0)) {
                    z10 = false;
                } else if (J() <= 0) {
                    if (O(defaultAudioSink.f4947x)) {
                        P();
                    } else {
                        z10 = false;
                    }
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iI0, defaultAudioSink.f4945v.f4960a, z10);
                AudioSink.b bVar2 = defaultAudioSink.f4943t;
                if (bVar2 != null) {
                    bVar2.a(writeException);
                }
                if (writeException.f4899b) {
                    defaultAudioSink.f4948y = androidx.media3.exoplayer.audio.a.f4990c;
                    throw writeException;
                }
                defaultAudioSink.f4938o.b(writeException);
                return;
            }
            defaultAudioSink.f4938o.a();
            if (O(defaultAudioSink.f4947x)) {
                if (defaultAudioSink.L > 0) {
                    defaultAudioSink.f4928i0 = false;
                }
                if (defaultAudioSink.Z && (bVar = defaultAudioSink.f4943t) != null && iI0 < iRemaining2 && !defaultAudioSink.f4928i0) {
                    bVar.c();
                }
            }
            int i10 = defaultAudioSink.f4945v.f4962c;
            if (i10 == 0) {
                defaultAudioSink.K += (long) iI0;
            }
            if (iI0 == iRemaining2) {
                if (i10 != 0) {
                    w1.a.g(byteBuffer2 == defaultAudioSink.R);
                    defaultAudioSink.L += ((long) defaultAudioSink.M) * ((long) defaultAudioSink.S);
                }
                defaultAudioSink.T = null;
            }
        }
    }

    private static int i0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int j0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (w1.c0.f55769a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.G.putInt(1431633921);
        }
        if (this.H == 0) {
            this.G.putInt(4, i10);
            this.G.putLong(8, j10 * 1000);
            this.G.position(0);
            this.H = i10;
        }
        int iRemaining = this.G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.G, iRemaining, 1);
            if (iWrite < 0) {
                this.H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iI0 = i0(audioTrack, byteBuffer, i10);
        if (iI0 < 0) {
            this.H = 0;
            return iI0;
        }
        this.H -= iI0;
        return iI0;
    }

    public void S(androidx.media3.exoplayer.audio.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f4930j0;
        if (looper == looperMyLooper) {
            if (aVar.equals(this.f4948y)) {
                return;
            }
            this.f4948y = aVar;
            AudioSink.b bVar = this.f4943t;
            if (bVar != null) {
                bVar.d();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean a(t1.o oVar) {
        return k(oVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean c(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.R;
        w1.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f4944u != null) {
            if (!F()) {
                return false;
            }
            if (this.f4944u.c(this.f4945v)) {
                this.f4945v = this.f4944u;
                this.f4944u = null;
                AudioTrack audioTrack = this.f4947x;
                if (audioTrack != null && O(audioTrack) && this.f4945v.f4970k) {
                    if (this.f4947x.getPlayState() == 3) {
                        this.f4947x.setOffloadEndOfStream();
                        this.f4927i.a();
                    }
                    AudioTrack audioTrack2 = this.f4947x;
                    t1.o oVar = this.f4945v.f4960a;
                    audioTrack2.setOffloadDelayPadding(oVar.E, oVar.F);
                    this.f4928i0 = true;
                }
            } else {
                T();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            A(j10);
        }
        if (!N()) {
            try {
                if (!L()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f4894b) {
                    throw e10;
                }
                this.f4937n.b(e10);
                return false;
            }
        }
        this.f4937n.a();
        if (this.O) {
            this.P = Math.max(0L, j10);
            this.N = false;
            this.O = false;
            if (g0()) {
                Z();
            }
            A(j10);
            if (this.Z) {
                play();
            }
        }
        if (!this.f4927i.k(J())) {
            return false;
        }
        if (this.R == null) {
            w1.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f4945v;
            if (gVar.f4962c != 0 && this.M == 0) {
                int iH = H(gVar.f4966g, byteBuffer);
                this.M = iH;
                if (iH == 0) {
                    return true;
                }
            }
            if (this.C != null) {
                if (!F()) {
                    return false;
                }
                A(j10);
                this.C = null;
            }
            long jL = this.P + this.f4945v.l(I() - this.f4919e.h());
            if (!this.N && Math.abs(jL - j10) > 200000) {
                AudioSink.b bVar = this.f4943t;
                if (bVar != null) {
                    bVar.a(new AudioSink.UnexpectedDiscontinuityException(j10, jL));
                }
                this.N = true;
            }
            if (this.N) {
                if (!F()) {
                    return false;
                }
                long j11 = j10 - jL;
                this.P += j11;
                this.N = false;
                A(j10);
                AudioSink.b bVar2 = this.f4943t;
                if (bVar2 != null && j11 != 0) {
                    bVar2.onPositionDiscontinuity();
                }
            }
            if (this.f4945v.f4962c == 0) {
                this.I += (long) byteBuffer.remaining();
            } else {
                this.J += ((long) this.M) * ((long) i10);
            }
            this.R = byteBuffer;
            this.S = i10;
        }
        U(j10);
        if (!this.R.hasRemaining()) {
            this.R = null;
            this.S = 0;
            return true;
        }
        if (!this.f4927i.j(J())) {
            return false;
        }
        w1.n.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.f4920e0) {
            this.f4920e0 = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void e() {
        w1.a.g(w1.c0.f55769a >= 21);
        w1.a.g(this.f4912a0);
        if (this.f4920e0) {
            return;
        }
        this.f4920e0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void f(boolean z10) {
        this.F = z10;
        Y(g0() ? w.f53027d : this.E);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        j jVar;
        if (N()) {
            X();
            if (this.f4927i.i()) {
                this.f4947x.pause();
            }
            if (O(this.f4947x)) {
                ((m) w1.a.e(this.f4935m)).b(this.f4947x);
            }
            int i10 = w1.c0.f55769a;
            if (i10 < 21 && !this.f4912a0) {
                this.f4914b0 = 0;
            }
            AudioSink.a aVarB = this.f4945v.b();
            g gVar = this.f4944u;
            if (gVar != null) {
                this.f4945v = gVar;
                this.f4944u = null;
            }
            this.f4927i.q();
            if (i10 >= 24 && (jVar = this.A) != null) {
                jVar.c();
                this.A = null;
            }
            W(this.f4947x, this.f4925h, this.f4943t, aVarB);
            this.f4947x = null;
        }
        this.f4938o.a();
        this.f4937n.a();
        this.f4932k0 = 0L;
        this.f4934l0 = 0L;
        Handler handler = this.f4936m0;
        if (handler != null) {
            ((Handler) w1.a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void g(w1.d dVar) {
        this.f4927i.u(dVar);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!N() || this.O) {
            return Long.MIN_VALUE;
        }
        return C(B(Math.min(this.f4927i.d(z10), this.f4945v.i(J()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public w getPlaybackParameters() {
        return this.E;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void h(AudioSink.b bVar) {
        this.f4943t = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.N = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (N()) {
            return !(w1.c0.f55769a >= 29 && this.f4947x.isOffloadedPlayback() && this.Y) && this.f4927i.h(J());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void i(w wVar) {
        this.E = new w(w1.c0.n(wVar.f53030a, 0.1f, 8.0f), w1.c0.n(wVar.f53031b, 0.1f, 8.0f));
        if (g0()) {
            Z();
        } else {
            Y(wVar);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (N()) {
            return this.W && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void j(int i10) {
        w1.a.g(w1.c0.f55769a >= 29);
        this.f4933l = i10;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int k(t1.o oVar) {
        R();
        if (!MimeTypes.AUDIO_RAW.equals(oVar.f52757n)) {
            return this.f4948y.k(oVar, this.B) ? 2 : 0;
        }
        if (w1.c0.w0(oVar.D)) {
            int i10 = oVar.D;
            return (i10 == 2 || (this.f4915c && i10 == 4)) ? 2 : 1;
        }
        w1.n.h("DefaultAudioSink", "Invalid PCM encoding: " + oVar.D);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void l(x1 x1Var) {
        this.f4942s = x1Var;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void m(int i10, int i11) {
        g gVar;
        AudioTrack audioTrack = this.f4947x;
        if (audioTrack == null || !O(audioTrack) || (gVar = this.f4945v) == null || !gVar.f4970k) {
            return;
        }
        this.f4947x.setOffloadDelayPadding(i10, i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.d n(t1.o oVar) {
        return this.f4926h0 ? androidx.media3.exoplayer.audio.d.f5015d : this.f4940q.a(oVar, this.B);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void o(t1.b bVar) {
        if (this.B.equals(bVar)) {
            return;
        }
        this.B = bVar;
        if (this.f4920e0) {
            return;
        }
        androidx.media3.exoplayer.audio.b bVar2 = this.f4949z;
        if (bVar2 != null) {
            bVar2.h(bVar);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void p(t1.c cVar) {
        if (this.f4916c0.equals(cVar)) {
            return;
        }
        int i10 = cVar.f52577a;
        float f10 = cVar.f52578b;
        AudioTrack audioTrack = this.f4947x;
        if (audioTrack != null) {
            if (this.f4916c0.f52577a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f4947x.setAuxEffectSendLevel(f10);
            }
        }
        this.f4916c0 = cVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.Z = false;
        if (N()) {
            if (this.f4927i.p() || O(this.f4947x)) {
                this.f4947x.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.Z = true;
        if (N()) {
            this.f4927i.v();
            this.f4947x.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.W && N() && F()) {
            T();
            this.W = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void q(t1.o oVar, int i10, int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.a aVar;
        int i11;
        int i12;
        boolean z10;
        int iIntValue;
        int iIntValue2;
        boolean z11;
        int i13;
        int i14;
        int iA;
        int[] iArr2;
        R();
        int iD0 = -1;
        if (MimeTypes.AUDIO_RAW.equals(oVar.f52757n)) {
            w1.a.a(w1.c0.w0(oVar.D));
            iD0 = w1.c0.d0(oVar.D, oVar.B);
            c0.a aVar2 = new c0.a();
            if (f0(oVar.D)) {
                aVar2.k(this.f4923g);
            } else {
                aVar2.k(this.f4921f);
                aVar2.j(this.f4913b.getAudioProcessors());
            }
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(aVar2.m());
            if (aVar3.equals(this.f4946w)) {
                aVar3 = this.f4946w;
            }
            this.f4919e.j(oVar.E, oVar.F);
            if (w1.c0.f55769a < 21 && oVar.B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i15 = 0; i15 < 6; i15++) {
                    iArr2[i15] = i15;
                }
            } else {
                iArr2 = iArr;
            }
            this.f4917d.h(iArr2);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(oVar));
                int i16 = aVarA.f4628c;
                i11 = aVarA.f4626a;
                int iL = w1.c0.L(aVarA.f4627b);
                int iD1 = w1.c0.d0(i16, aVarA.f4627b);
                i12 = 0;
                iIntValue = i16;
                iIntValue2 = iL;
                z11 = this.f4931k;
                aVar = aVar3;
                i13 = iD1;
                z10 = false;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, oVar);
            }
        } else {
            aVar = new androidx.media3.common.audio.a(c0.C());
            i11 = oVar.C;
            androidx.media3.exoplayer.audio.d dVarN = this.f4933l != 0 ? n(oVar) : androidx.media3.exoplayer.audio.d.f5015d;
            if (this.f4933l == 0 || !dVarN.f5016a) {
                Pair pairI = this.f4948y.i(oVar, this.B);
                if (pairI == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + oVar, oVar);
                }
                i12 = 2;
                z10 = false;
                iIntValue = ((Integer) pairI.first).intValue();
                iIntValue2 = ((Integer) pairI.second).intValue();
                z11 = this.f4931k;
            } else {
                int iB = v.b((String) w1.a.e(oVar.f52757n), oVar.f52753j);
                int iL2 = w1.c0.L(oVar.B);
                z10 = dVarN.f5017b;
                iIntValue = iB;
                iIntValue2 = iL2;
                z11 = true;
                i12 = 1;
            }
            i13 = iD0;
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + oVar, oVar);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + oVar, oVar);
        }
        int i17 = oVar.f52752i;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(oVar.f52757n) && i17 == -1) {
            i17 = 768000;
        }
        int i18 = i17;
        if (i10 != 0) {
            iA = i10;
            i14 = i11;
        } else {
            i14 = i11;
            iA = this.f4939p.a(G(i11, iIntValue2, iIntValue), iIntValue, i12, i13 != -1 ? i13 : 1, i14, i18, z11 ? 8.0d : 1.0d);
        }
        this.f4926h0 = false;
        boolean z12 = z10;
        int i19 = i12;
        g gVar = new g(oVar, iD0, i19, i13, i14, iIntValue2, iIntValue, iA, aVar, z11, z12, this.f4920e0);
        if (N()) {
            this.f4944u = gVar;
        } else {
            this.f4945v = gVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.b bVar = this.f4949z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        p1 it = this.f4921f.iterator();
        while (it.hasNext()) {
            ((AudioProcessor) it.next()).reset();
        }
        p1 it2 = this.f4923g.iterator();
        while (it2.hasNext()) {
            ((AudioProcessor) it2.next()).reset();
        }
        androidx.media3.common.audio.a aVar = this.f4946w;
        if (aVar != null) {
            aVar.j();
        }
        this.Z = false;
        this.f4926h0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.f4914b0 != i10) {
            this.f4914b0 = i10;
            this.f4912a0 = i10 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f4918d0 = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo);
        androidx.media3.exoplayer.audio.b bVar = this.f4949z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f4947x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f4918d0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            a0();
        }
    }

    private DefaultAudioSink(f fVar) {
        Context context = fVar.f4951a;
        this.f4911a = context;
        t1.b bVar = t1.b.f52552g;
        this.B = bVar;
        this.f4948y = context != null ? androidx.media3.exoplayer.audio.a.e(context, bVar, null) : fVar.f4952b;
        this.f4913b = fVar.f4953c;
        int i10 = w1.c0.f55769a;
        this.f4915c = i10 >= 21 && fVar.f4954d;
        this.f4931k = i10 >= 23 && fVar.f4955e;
        this.f4933l = 0;
        this.f4939p = fVar.f4957g;
        this.f4940q = (d) w1.a.e(fVar.f4958h);
        w1.g gVar = new w1.g(w1.d.f55786a);
        this.f4925h = gVar;
        gVar.e();
        this.f4927i = new androidx.media3.exoplayer.audio.g(new l());
        androidx.media3.exoplayer.audio.h hVar = new androidx.media3.exoplayer.audio.h();
        this.f4917d = hVar;
        n nVar = new n();
        this.f4919e = nVar;
        this.f4921f = c0.F(new androidx.media3.common.audio.e(), hVar, nVar);
        this.f4923g = c0.D(new androidx.media3.exoplayer.audio.m());
        this.Q = 1.0f;
        this.f4914b0 = 0;
        this.f4916c0 = new t1.c(0, 0.0f);
        w wVar = w.f53027d;
        this.D = new i(wVar, 0L, 0L);
        this.E = wVar;
        this.F = false;
        this.f4929j = new ArrayDeque();
        this.f4937n = new k(100L);
        this.f4938o = new k(100L);
        this.f4941r = fVar.f4959i;
    }
}
