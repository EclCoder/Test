package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.w1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.c0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d2.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import ob.r0;
import ob.u;
import ob.y;
import p9.s1;
import q9.s;
import q9.t;
import q9.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static boolean f16467h0 = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Object f16468i0 = new Object();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static ExecutorService f16469j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static int f16470k0;
    private i A;
    private i B;
    private w1 C;
    private boolean D;
    private ByteBuffer E;
    private int F;
    private long G;
    private long H;
    private long I;
    private long J;
    private int K;
    private boolean L;
    private boolean M;
    private long N;
    private float O;
    private ByteBuffer P;
    private int Q;
    private ByteBuffer R;
    private byte[] S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private q9.p Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16471a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private d f16472a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.e f16473b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f16474b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16475c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f16476c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.i f16477d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f16478d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f16479e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f16480e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f16481f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f16482f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f16483g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Looper f16484g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ob.g f16485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.g f16486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f16487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f16488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f16489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f16490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f16491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j f16492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f16493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.exoplayer2.k.a f16494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private s1 f16495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AudioSink.a f16496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f16497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f16498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.d f16499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AudioTrack f16500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.b f16501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.c f16502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f16503z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f16504a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static void a(AudioTrack audioTrack, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f16504a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f16504a = audioDeviceInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f16505a = new com.google.android.exoplayer2.audio.j.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f16506a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q9.e f16508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16510e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.android.exoplayer2.k.a f16513h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.audio.b f16507b = com.google.android.exoplayer2.audio.b.f16558c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16511f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e f16512g = e.f16505a;

        public f(Context context) {
            this.f16506a = context;
        }

        public DefaultAudioSink g() {
            if (this.f16508c == null) {
                this.f16508c = new h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public f h(boolean z10) {
            this.f16510e = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f16509d = z10;
            return this;
        }

        public f j(int i10) {
            this.f16511f = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f16514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f16519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f16520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f16521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.d f16522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f16523j;

        public g(v0 v0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, com.google.android.exoplayer2.audio.d dVar, boolean z10) {
            this.f16514a = v0Var;
            this.f16515b = i10;
            this.f16516c = i11;
            this.f16517d = i12;
            this.f16518e = i13;
            this.f16519f = i14;
            this.f16520g = i15;
            this.f16521h = i16;
            this.f16522i = dVar;
            this.f16523j = z10;
        }

        private AudioTrack d(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            int i11 = r0.f48425a;
            if (i11 >= 29) {
                return f(z10, aVar, i10);
            }
            return i11 >= 21 ? e(z10, aVar, i10) : g(aVar, i10);
        }

        private AudioTrack e(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            return new AudioTrack(i(aVar, z10), DefaultAudioSink.C(this.f16518e, this.f16519f, this.f16520g), this.f16521h, 1, i10);
        }

        private AudioTrack f(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(aVar, z10)).setAudioFormat(DefaultAudioSink.C(this.f16518e, this.f16519f, this.f16520g)).setTransferMode(1).setBufferSizeInBytes(this.f16521h).setSessionId(i10).setOffloadedPlayback(this.f16516c == 1).build();
        }

        private AudioTrack g(com.google.android.exoplayer2.audio.a aVar, int i10) {
            int iJ0 = r0.j0(aVar.f16548c);
            return i10 == 0 ? new AudioTrack(iJ0, this.f16518e, this.f16519f, this.f16520g, this.f16521h, 1) : new AudioTrack(iJ0, this.f16518e, this.f16519f, this.f16520g, this.f16521h, 1, i10);
        }

        private static AudioAttributes i(com.google.android.exoplayer2.audio.a aVar, boolean z10) {
            return z10 ? j() : aVar.b().f16552a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(z10, aVar, i10);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f16518e, this.f16519f, this.f16521h, this.f16514a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f16518e, this.f16519f, this.f16521h, this.f16514a, l(), e10);
            }
        }

        public boolean b(g gVar) {
            return gVar.f16516c == this.f16516c && gVar.f16520g == this.f16520g && gVar.f16518e == this.f16518e && gVar.f16519f == this.f16519f && gVar.f16517d == this.f16517d && gVar.f16523j == this.f16523j;
        }

        public g c(int i10) {
            return new g(this.f16514a, this.f16515b, this.f16516c, this.f16517d, this.f16518e, this.f16519f, this.f16520g, i10, this.f16522i, this.f16523j);
        }

        public long h(long j10) {
            return r0.T0(j10, this.f16518e);
        }

        public long k(long j10) {
            return r0.T0(j10, this.f16514a.f18882z);
        }

        public boolean l() {
            return this.f16516c == 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h implements q9.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f16524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.audio.l f16525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f16526c;

        public h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.l(), new n());
        }

        @Override // q9.e
        public boolean a(boolean z10) {
            this.f16525b.q(z10);
            return z10;
        }

        @Override // q9.e
        public w1 b(w1 w1Var) {
            this.f16526c.d(w1Var.f18942a);
            this.f16526c.c(w1Var.f18943b);
            return w1Var;
        }

        @Override // q9.e
        public AudioProcessor[] getAudioProcessors() {
            return this.f16524a;
        }

        @Override // q9.e
        public long getMediaDuration(long j10) {
            return this.f16526c.b(j10);
        }

        @Override // q9.e
        public long getSkippedOutputFrameCount() {
            return this.f16525b.k();
        }

        public h(AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.l lVar, n nVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f16524a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f16525b = lVar;
            this.f16526c = nVar;
            audioProcessorArr2[audioProcessorArr.length] = lVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = nVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f16527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f16528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f16529c;

        private i(w1 w1Var, long j10, long j11) {
            this.f16527a = w1Var;
            this.f16528b = j10;
            this.f16529c = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f16530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f16531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f16532c;

        public j(long j10) {
            this.f16530a = j10;
        }

        public void a() {
            this.f16531b = null;
        }

        public void b(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f16531b == null) {
                this.f16531b = exc;
                this.f16532c = this.f16530a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f16532c) {
                Exception exc2 = this.f16531b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f16531b;
                a();
                throw exc3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class k implements com.google.android.exoplayer2.audio.g.a {
        private k() {
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void b(long j10) {
            if (DefaultAudioSink.this.f16496s != null) {
                DefaultAudioSink.this.f16496s.b(j10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void onInvalidLatency(long j10) {
            u.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.G() + ", " + DefaultAudioSink.this.H();
            if (DefaultAudioSink.f16467h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            u.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.G() + ", " + DefaultAudioSink.this.H();
            if (DefaultAudioSink.f16467h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            u.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.f16496s != null) {
                DefaultAudioSink.this.f16496s.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f16478d0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f16534a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f16535b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f16537a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f16537a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f16500w) && DefaultAudioSink.this.f16496s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.f16496s.e();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f16500w) && DefaultAudioSink.this.f16496s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.f16496s.e();
                }
            }
        }

        public l() {
            this.f16535b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f16534a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new r(handler), this.f16535b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f16535b);
            this.f16534a.removeCallbacksAndMessages(null);
        }
    }

    private boolean A() throws Exception {
        ByteBuffer byteBuffer;
        if (this.f16499v.f()) {
            this.f16499v.h();
            P(Long.MIN_VALUE);
            return this.f16499v.e() && ((byteBuffer = this.R) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.R;
        if (byteBuffer2 == null) {
            return true;
        }
        d0(byteBuffer2, Long.MIN_VALUE);
        return this.R == null;
    }

    private com.google.android.exoplayer2.audio.b B() {
        if (this.f16502y == null && this.f16471a != null) {
            this.f16484g0 = Looper.myLooper();
            com.google.android.exoplayer2.audio.c cVar = new com.google.android.exoplayer2.audio.c(this.f16471a, new com.google.android.exoplayer2.audio.c.f() { // from class: q9.q
                @Override // com.google.android.exoplayer2.audio.c.f
                public final void a(com.google.android.exoplayer2.audio.b bVar) {
                    this.f50488a.N(bVar);
                }
            });
            this.f16502y = cVar;
            this.f16501x = cVar.d();
        }
        return this.f16501x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat C(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private static int D(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        ob.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int E(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return q9.b.e(byteBuffer);
            case 7:
            case 8:
                return s.e(byteBuffer);
            case 9:
                int iM = t.m(r0.J(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return UserVerificationMethods.USER_VERIFY_ALL;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int iB = q9.b.b(byteBuffer);
                if (iB == -1) {
                    return 0;
                }
                return q9.b.i(byteBuffer, iB) * 16;
            case 15:
                return 512;
            case 16:
                return UserVerificationMethods.USER_VERIFY_ALL;
            case 17:
                return q9.c.c(byteBuffer);
            case 20:
                return v.g(byteBuffer);
        }
    }

    private int F(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = r0.f48425a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && r0.f48428d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long G() {
        g gVar = this.f16498u;
        return gVar.f16516c == 0 ? this.G / ((long) gVar.f16515b) : this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long H() {
        g gVar = this.f16498u;
        return gVar.f16516c == 0 ? this.I / ((long) gVar.f16517d) : this.J;
    }

    private boolean I() throws AudioSink.InitializationException {
        s1 s1Var;
        if (!this.f16485h.d()) {
            return false;
        }
        AudioTrack audioTrackZ = z();
        this.f16500w = audioTrackZ;
        if (L(audioTrackZ)) {
            Q(this.f16500w);
            if (this.f16489l != 3) {
                AudioTrack audioTrack = this.f16500w;
                v0 v0Var = this.f16498u.f16514a;
                audioTrack.setOffloadDelayPadding(v0Var.B, v0Var.C);
            }
        }
        int i10 = r0.f48425a;
        if (i10 >= 31 && (s1Var = this.f16495r) != null) {
            c.a(this.f16500w, s1Var);
        }
        this.Y = this.f16500w.getAudioSessionId();
        com.google.android.exoplayer2.audio.g gVar = this.f16486i;
        AudioTrack audioTrack2 = this.f16500w;
        g gVar2 = this.f16498u;
        gVar.r(audioTrack2, gVar2.f16516c == 2, gVar2.f16520g, gVar2.f16517d, gVar2.f16521h);
        V();
        int i11 = this.Z.f50486a;
        if (i11 != 0) {
            this.f16500w.attachAuxEffect(i11);
            this.f16500w.setAuxEffectSendLevel(this.Z.f50487b);
        }
        d dVar = this.f16472a0;
        if (dVar != null && i10 >= 23) {
            b.a(this.f16500w, dVar);
        }
        this.M = true;
        return true;
    }

    private static boolean J(int i10) {
        return (r0.f48425a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean K() {
        return this.f16500w != null;
    }

    private static boolean L(AudioTrack audioTrack) {
        return r0.f48425a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void M() {
        if (this.f16498u.l()) {
            this.f16480e0 = true;
        }
    }

    private void O() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f16486i.f(H());
        this.f16500w.stop();
        this.F = 0;
    }

    private void P(long j10) throws Exception {
        ByteBuffer byteBufferD;
        if (!this.f16499v.f()) {
            ByteBuffer byteBuffer = this.P;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.f16452a;
            }
            d0(byteBuffer, j10);
            return;
        }
        while (!this.f16499v.e()) {
            do {
                byteBufferD = this.f16499v.d();
                if (byteBufferD.hasRemaining()) {
                    d0(byteBufferD, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f16499v.i(this.P);
                    }
                }
            } while (!byteBufferD.hasRemaining());
            return;
        }
    }

    private void Q(AudioTrack audioTrack) {
        if (this.f16490m == null) {
            this.f16490m = new l();
        }
        this.f16490m.a(audioTrack);
    }

    private static void R(final AudioTrack audioTrack, final ob.g gVar) {
        gVar.c();
        synchronized (f16468i0) {
            try {
                if (f16469j0 == null) {
                    f16469j0 = r0.I0("ExoPlayer:AudioTrackReleaseThread");
                }
                f16470k0++;
                f16469j0.execute(new Runnable() { // from class: q9.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.n(audioTrack, gVar);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void S() {
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = 0L;
        this.f16482f0 = false;
        this.K = 0;
        this.B = new i(this.C, 0L, 0L);
        this.N = 0L;
        this.A = null;
        this.f16487j.clear();
        this.P = null;
        this.Q = 0;
        this.R = null;
        this.V = false;
        this.U = false;
        this.E = null;
        this.F = 0;
        this.f16479e.i();
        Y();
    }

    private void T(w1 w1Var) {
        i iVar = new i(w1Var, C.TIME_UNSET, C.TIME_UNSET);
        if (K()) {
            this.A = iVar;
        } else {
            this.B = iVar;
        }
    }

    private void U() {
        if (K()) {
            try {
                this.f16500w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.f18942a).setPitch(this.C.f18943b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                u.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            w1 w1Var = new w1(this.f16500w.getPlaybackParams().getSpeed(), this.f16500w.getPlaybackParams().getPitch());
            this.C = w1Var;
            this.f16486i.s(w1Var.f18942a);
        }
    }

    private void V() {
        if (K()) {
            if (r0.f48425a >= 21) {
                W(this.f16500w, this.O);
            } else {
                X(this.f16500w, this.O);
            }
        }
    }

    private static void W(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void X(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void Y() {
        com.google.android.exoplayer2.audio.d dVar = this.f16498u.f16522i;
        this.f16499v = dVar;
        dVar.b();
    }

    private boolean Z() {
        if (this.f16474b0) {
            return false;
        }
        g gVar = this.f16498u;
        return gVar.f16516c == 0 && !a0(gVar.f16514a.A);
    }

    private boolean a0(int i10) {
        return this.f16475c && r0.A0(i10);
    }

    private boolean b0() {
        g gVar = this.f16498u;
        return gVar != null && gVar.f16523j && r0.f48425a >= 23;
    }

    private boolean c0(v0 v0Var, com.google.android.exoplayer2.audio.a aVar) {
        int iF;
        int iH;
        int iF2;
        if (r0.f48425a < 29 || this.f16489l == 0 || (iF = y.f((String) ob.a.e(v0Var.f18868l), v0Var.f18865i)) == 0 || (iH = r0.H(v0Var.f18881y)) == 0 || (iF2 = F(C(v0Var.f18882z, iH, iF), aVar.b().f16552a)) == 0) {
            return false;
        }
        if (iF2 == 1) {
            return ((v0Var.B != 0 || v0Var.C != 0) && (this.f16489l == 1)) ? false : true;
        }
        if (iF2 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void d0(ByteBuffer byteBuffer, long j10) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iE0;
        AudioSink.a aVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.R;
            if (byteBuffer3 != null) {
                ob.a.a(byteBuffer3 == byteBuffer);
            } else {
                this.R = byteBuffer;
                if (r0.f48425a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (r0.f48425a < 21) {
                int iB = this.f16486i.b(this.I);
                if (iB > 0) {
                    iE0 = this.f16500w.write(this.S, this.T, Math.min(iRemaining2, iB));
                    if (iE0 > 0) {
                        this.T += iE0;
                        byteBuffer.position(byteBuffer.position() + iE0);
                    }
                } else {
                    iE0 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f16474b0) {
                ob.a.g(j10 != C.TIME_UNSET);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f16476c0;
                } else {
                    this.f16476c0 = j10;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iE0 = defaultAudioSink.f0(this.f16500w, byteBuffer2, iRemaining2, j10);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iE0 = e0(defaultAudioSink.f16500w, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.f16478d0 = SystemClock.elapsedRealtime();
            if (iE0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iE0, defaultAudioSink.f16498u.f16514a, J(iE0) && defaultAudioSink.J > 0);
                AudioSink.a aVar2 = defaultAudioSink.f16496s;
                if (aVar2 != null) {
                    aVar2.a(writeException);
                }
                if (writeException.f16465b) {
                    defaultAudioSink.f16501x = com.google.android.exoplayer2.audio.b.f16558c;
                    throw writeException;
                }
                defaultAudioSink.f16492o.b(writeException);
                return;
            }
            defaultAudioSink.f16492o.a();
            if (L(defaultAudioSink.f16500w)) {
                if (defaultAudioSink.J > 0) {
                    defaultAudioSink.f16482f0 = false;
                }
                if (defaultAudioSink.W && (aVar = defaultAudioSink.f16496s) != null && iE0 < iRemaining2 && !defaultAudioSink.f16482f0) {
                    aVar.c();
                }
            }
            int i10 = defaultAudioSink.f16498u.f16516c;
            if (i10 == 0) {
                defaultAudioSink.I += (long) iE0;
            }
            if (iE0 == iRemaining2) {
                if (i10 != 0) {
                    ob.a.g(byteBuffer2 == defaultAudioSink.P);
                    defaultAudioSink.J += ((long) defaultAudioSink.K) * ((long) defaultAudioSink.Q);
                }
                defaultAudioSink.R = null;
            }
        }
    }

    private static int e0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int f0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (r0.f48425a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.E == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.E = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.E.putInt(1431633921);
        }
        if (this.F == 0) {
            this.E.putInt(4, i10);
            this.E.putLong(8, j10 * 1000);
            this.E.position(0);
            this.F = i10;
        }
        int iRemaining = this.E.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.E, iRemaining, 1);
            if (iWrite < 0) {
                this.F = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iE0 = e0(audioTrack, byteBuffer, i10);
        if (iE0 < 0) {
            this.F = 0;
            return iE0;
        }
        this.F -= iE0;
        return iE0;
    }

    public static /* synthetic */ void n(AudioTrack audioTrack, ob.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f16468i0) {
                try {
                    int i10 = f16470k0 - 1;
                    f16470k0 = i10;
                    if (i10 == 0) {
                        f16469j0.shutdown();
                        f16469j0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            gVar.e();
            synchronized (f16468i0) {
                try {
                    int i11 = f16470k0 - 1;
                    f16470k0 = i11;
                    if (i11 == 0) {
                        f16469j0.shutdown();
                        f16469j0 = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private void v(long j10) {
        w1 w1VarB;
        if (b0()) {
            w1VarB = w1.f18938d;
        } else {
            w1VarB = Z() ? this.f16473b.b(this.C) : w1.f18938d;
            this.C = w1VarB;
        }
        w1 w1Var = w1VarB;
        this.D = Z() ? this.f16473b.a(this.D) : false;
        this.f16487j.add(new i(w1Var, Math.max(0L, j10), this.f16498u.h(H())));
        Y();
        AudioSink.a aVar = this.f16496s;
        if (aVar != null) {
            aVar.onSkipSilenceEnabledChanged(this.D);
        }
    }

    private long w(long j10) {
        while (!this.f16487j.isEmpty() && j10 >= ((i) this.f16487j.getFirst()).f16529c) {
            this.B = (i) this.f16487j.remove();
        }
        i iVar = this.B;
        long j11 = j10 - iVar.f16529c;
        if (iVar.f16527a.equals(w1.f18938d)) {
            return this.B.f16528b + j11;
        }
        if (this.f16487j.isEmpty()) {
            return this.B.f16528b + this.f16473b.getMediaDuration(j11);
        }
        i iVar2 = (i) this.f16487j.getFirst();
        return iVar2.f16528b - r0.d0(iVar2.f16529c - j10, this.B.f16527a.f18942a);
    }

    private long x(long j10) {
        return j10 + this.f16498u.h(this.f16473b.getSkippedOutputFrameCount());
    }

    private AudioTrack y(g gVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = gVar.a(this.f16474b0, this.f16503z, this.Y);
            com.google.android.exoplayer2.k.a aVar = this.f16494q;
            if (aVar == null) {
                return audioTrackA;
            }
            aVar.A(L(audioTrackA));
            return audioTrackA;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.a aVar2 = this.f16496s;
            if (aVar2 != null) {
                aVar2.a(e10);
            }
            throw e10;
        }
    }

    private AudioTrack z() throws AudioSink.InitializationException {
        try {
            return y((g) ob.a.e(this.f16498u));
        } catch (AudioSink.InitializationException e10) {
            g gVar = this.f16498u;
            if (gVar.f16521h > 1000000) {
                g gVarC = gVar.c(1000000);
                try {
                    AudioTrack audioTrackY = y(gVarC);
                    this.f16498u = gVarC;
                    return audioTrackY;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    M();
                    throw e10;
                }
            }
            M();
            throw e10;
        }
    }

    public void N(com.google.android.exoplayer2.audio.b bVar) {
        ob.a.g(this.f16484g0 == Looper.myLooper());
        if (bVar.equals(B())) {
            return;
        }
        this.f16501x = bVar;
        AudioSink.a aVar = this.f16496s;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(v0 v0Var) {
        return i(v0Var) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void b(w1 w1Var) {
        this.C = new w1(r0.p(w1Var.f18942a, 0.1f, 8.0f), r0.p(w1Var.f18943b, 0.1f, 8.0f));
        if (b0()) {
            U();
        } else {
            T(w1Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean c(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.P;
        ob.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f16497t != null) {
            if (!A()) {
                return false;
            }
            if (this.f16497t.b(this.f16498u)) {
                this.f16498u = this.f16497t;
                this.f16497t = null;
                if (L(this.f16500w) && this.f16489l != 3) {
                    if (this.f16500w.getPlayState() == 3) {
                        this.f16500w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f16500w;
                    v0 v0Var = this.f16498u.f16514a;
                    audioTrack.setOffloadDelayPadding(v0Var.B, v0Var.C);
                    this.f16482f0 = true;
                }
            } else {
                O();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            v(j10);
        }
        if (!K()) {
            try {
                if (!I()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f16460b) {
                    throw e10;
                }
                this.f16491n.b(e10);
                return false;
            }
        }
        this.f16491n.a();
        if (this.M) {
            this.N = Math.max(0L, j10);
            this.L = false;
            this.M = false;
            if (b0()) {
                U();
            }
            v(j10);
            if (this.W) {
                play();
            }
        }
        if (!this.f16486i.j(H())) {
            return false;
        }
        if (this.P == null) {
            ob.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f16498u;
            if (gVar.f16516c != 0 && this.K == 0) {
                int iE = E(gVar.f16520g, byteBuffer);
                this.K = iE;
                if (iE == 0) {
                    return true;
                }
            }
            if (this.A != null) {
                if (!A()) {
                    return false;
                }
                v(j10);
                this.A = null;
            }
            long jK = this.N + this.f16498u.k(G() - this.f16479e.h());
            if (!this.L && Math.abs(jK - j10) > 200000) {
                AudioSink.a aVar = this.f16496s;
                if (aVar != null) {
                    aVar.a(new AudioSink.UnexpectedDiscontinuityException(j10, jK));
                }
                this.L = true;
            }
            if (this.L) {
                if (!A()) {
                    return false;
                }
                long j11 = j10 - jK;
                this.N += j11;
                this.L = false;
                v(j10);
                AudioSink.a aVar2 = this.f16496s;
                if (aVar2 != null && j11 != 0) {
                    aVar2.onPositionDiscontinuity();
                }
            }
            if (this.f16498u.f16516c == 0) {
                this.G += (long) byteBuffer.remaining();
            } else {
                this.H += ((long) this.K) * ((long) i10);
            }
            this.P = byteBuffer;
            this.Q = i10;
        }
        P(j10);
        if (!this.P.hasRemaining()) {
            this.P = null;
            this.Q = 0;
            return true;
        }
        if (!this.f16486i.i(H())) {
            return false;
        }
        u.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.f16474b0) {
            this.f16474b0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e() {
        ob.a.g(r0.f48425a >= 21);
        ob.a.g(this.X);
        if (this.f16474b0) {
            return;
        }
        this.f16474b0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(boolean z10) {
        this.D = z10;
        T(b0() ? w1.f18938d : this.C);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (K()) {
            S();
            if (this.f16486i.h()) {
                this.f16500w.pause();
            }
            if (L(this.f16500w)) {
                ((l) ob.a.e(this.f16490m)).b(this.f16500w);
            }
            if (r0.f48425a < 21 && !this.X) {
                this.Y = 0;
            }
            g gVar = this.f16497t;
            if (gVar != null) {
                this.f16498u = gVar;
                this.f16497t = null;
            }
            this.f16486i.p();
            R(this.f16500w, this.f16485h);
            this.f16500w = null;
        }
        this.f16492o.a();
        this.f16491n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g(com.google.android.exoplayer2.audio.a aVar) {
        if (this.f16503z.equals(aVar)) {
            return;
        }
        this.f16503z = aVar;
        if (this.f16474b0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!K() || this.M) {
            return Long.MIN_VALUE;
        }
        return x(w(Math.min(this.f16486i.c(z10), this.f16498u.h(H()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public w1 getPlaybackParameters() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h(AudioSink.a aVar) {
        this.f16496s = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.L = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return K() && this.f16486i.g(H());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int i(v0 v0Var) {
        if (!MimeTypes.AUDIO_RAW.equals(v0Var.f18868l)) {
            return ((this.f16480e0 || !c0(v0Var, this.f16503z)) && !B().i(v0Var)) ? 0 : 2;
        }
        if (r0.B0(v0Var.A)) {
            int i10 = v0Var.A;
            return (i10 == 2 || (this.f16475c && i10 == 4)) ? 2 : 1;
        }
        u.i("DefaultAudioSink", "Invalid PCM encoding: " + v0Var.A);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (K()) {
            return this.U && !hasPendingData();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j() {
        if (r0.f48425a < 25) {
            flush();
            return;
        }
        this.f16492o.a();
        this.f16491n.a();
        if (K()) {
            S();
            if (this.f16486i.h()) {
                this.f16500w.pause();
            }
            this.f16500w.flush();
            this.f16486i.p();
            com.google.android.exoplayer2.audio.g gVar = this.f16486i;
            AudioTrack audioTrack = this.f16500w;
            g gVar2 = this.f16498u;
            gVar.r(audioTrack, gVar2.f16516c == 2, gVar2.f16520g, gVar2.f16517d, gVar2.f16521h);
            this.M = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(s1 s1Var) {
        this.f16495r = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x014d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x016a, please report this as an issue */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void l(v0 v0Var, int i10, int[] iArr) throws AudioSink.ConfigurationException {
        int iIntValue;
        int iIntValue2;
        com.google.android.exoplayer2.audio.d dVar;
        int i11;
        boolean z10;
        int i12;
        int iH0;
        int iH1;
        int iF;
        int iH;
        int i13;
        double d10;
        int i14;
        int iA;
        g gVar;
        int[] iArr2;
        if (!MimeTypes.AUDIO_RAW.equals(v0Var.f18868l)) {
            com.google.android.exoplayer2.audio.d dVar2 = new com.google.android.exoplayer2.audio.d(c0.C());
            int i15 = v0Var.f18882z;
            if (c0(v0Var, this.f16503z)) {
                iH0 = -1;
                iH1 = -1;
                i12 = 1;
                dVar = dVar2;
                iF = y.f((String) ob.a.e(v0Var.f18868l), v0Var.f18865i);
                i11 = i15;
                iH = r0.H(v0Var.f18881y);
                z10 = true;
            } else {
                Pair pairF = B().f(v0Var);
                if (pairF == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + v0Var, v0Var);
                }
                iIntValue = ((Integer) pairF.first).intValue();
                iIntValue2 = ((Integer) pairF.second).intValue();
                dVar = dVar2;
                i11 = i15;
                z10 = this.f16488k;
                i12 = 2;
                iH0 = -1;
                iH1 = -1;
            }
            if (iF != 0) {
                throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + v0Var, v0Var);
            }
            if (iH != 0) {
                throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + v0Var, v0Var);
            }
            if (i10 != 0) {
                iA = i10;
                i14 = i11;
            } else {
                e eVar = this.f16493p;
                int iD = D(i11, iH, iF);
                if (iH1 != -1) {
                    i13 = iH1;
                } else {
                    i13 = 1;
                }
                int i16 = v0Var.f18864h;
                if (z10) {
                    d10 = 8.0d;
                } else {
                    d10 = 1.0d;
                }
                double d11 = d10;
                i14 = i11;
                iA = eVar.a(iD, iF, i12, i13, i14, i16, d11);
            }
            this.f16480e0 = false;
            gVar = new g(v0Var, iH0, i12, iH1, i14, iH, iF, iA, dVar, z10);
            if (K()) {
                this.f16497t = gVar;
            } else {
                this.f16498u = gVar;
            }
        }
        ob.a.a(r0.B0(v0Var.A));
        iH0 = r0.h0(v0Var.A, v0Var.f18881y);
        c0.a aVar = new c0.a();
        if (a0(v0Var.A)) {
            aVar.k(this.f16483g);
        } else {
            aVar.k(this.f16481f);
            aVar.j(this.f16473b.getAudioProcessors());
        }
        com.google.android.exoplayer2.audio.d dVar3 = new com.google.android.exoplayer2.audio.d(aVar.m());
        if (dVar3.equals(this.f16499v)) {
            dVar3 = this.f16499v;
        }
        this.f16479e.j(v0Var.B, v0Var.C);
        if (r0.f48425a < 21 && v0Var.f18881y == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i17 = 0; i17 < 6; i17++) {
                iArr2[i17] = i17;
            }
        } else {
            iArr2 = iArr;
        }
        this.f16477d.h(iArr2);
        try {
            AudioProcessor.a aVarA = dVar3.a(new AudioProcessor.a(v0Var.f18882z, v0Var.f18881y, v0Var.A));
            iIntValue = aVarA.f16456c;
            int i18 = aVarA.f16454a;
            iIntValue2 = r0.H(aVarA.f16455b);
            iH1 = r0.h0(iIntValue, aVarA.f16455b);
            dVar = dVar3;
            i11 = i18;
            z10 = this.f16488k;
            i12 = 0;
        } catch (AudioProcessor.UnhandledAudioFormatException e10) {
            throw new AudioSink.ConfigurationException(e10, v0Var);
        }
        iF = iIntValue;
        iH = iIntValue2;
        if (iF != 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + v0Var, v0Var);
        }
        if (iH != 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + v0Var, v0Var);
        }
        if (i10 != 0) {
            iA = i10;
            i14 = i11;
        } else {
            e eVar2 = this.f16493p;
            int iD2 = D(i11, iH, iF);
            if (iH1 != -1) {
                i13 = iH1;
            } else {
                i13 = 1;
            }
            int i19 = v0Var.f18864h;
            if (z10) {
                d10 = 8.0d;
            } else {
                d10 = 1.0d;
            }
            double d12 = d10;
            i14 = i11;
            iA = eVar2.a(iD2, iF, i12, i13, i14, i19, d12);
        }
        this.f16480e0 = false;
        gVar = new g(v0Var, iH0, i12, iH1, i14, iH, iF, iA, dVar, z10);
        if (K()) {
            this.f16497t = gVar;
        } else {
            this.f16498u = gVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m(q9.p pVar) {
        if (this.Z.equals(pVar)) {
            return;
        }
        int i10 = pVar.f50486a;
        float f10 = pVar.f50487b;
        AudioTrack audioTrack = this.f16500w;
        if (audioTrack != null) {
            if (this.Z.f50486a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f16500w.setAuxEffectSendLevel(f10);
            }
        }
        this.Z = pVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.W = false;
        if (K() && this.f16486i.o()) {
            this.f16500w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.W = true;
        if (K()) {
            this.f16486i.t();
            this.f16500w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.U && K() && A()) {
            O();
            this.U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void release() {
        com.google.android.exoplayer2.audio.c cVar = this.f16502y;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        p1 it = this.f16481f.iterator();
        while (it.hasNext()) {
            ((AudioProcessor) it.next()).reset();
        }
        p1 it2 = this.f16483g.iterator();
        while (it2.hasNext()) {
            ((AudioProcessor) it2.next()).reset();
        }
        com.google.android.exoplayer2.audio.d dVar = this.f16499v;
        if (dVar != null) {
            dVar.j();
        }
        this.W = false;
        this.f16480e0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.Y != i10) {
            this.Y = i10;
            this.X = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f16472a0 = dVar;
        AudioTrack audioTrack = this.f16500w;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f10) {
        if (this.O != f10) {
            this.O = f10;
            V();
        }
    }

    private DefaultAudioSink(f fVar) {
        Context context = fVar.f16506a;
        this.f16471a = context;
        this.f16501x = context != null ? com.google.android.exoplayer2.audio.b.c(context) : fVar.f16507b;
        this.f16473b = fVar.f16508c;
        int i10 = r0.f48425a;
        this.f16475c = i10 >= 21 && fVar.f16509d;
        this.f16488k = i10 >= 23 && fVar.f16510e;
        this.f16489l = i10 >= 29 ? fVar.f16511f : 0;
        this.f16493p = fVar.f16512g;
        ob.g gVar = new ob.g(ob.d.f48357a);
        this.f16485h = gVar;
        gVar.e();
        this.f16486i = new com.google.android.exoplayer2.audio.g(new k());
        com.google.android.exoplayer2.audio.i iVar = new com.google.android.exoplayer2.audio.i();
        this.f16477d = iVar;
        q qVar = new q();
        this.f16479e = qVar;
        this.f16481f = c0.F(new p(), iVar, qVar);
        this.f16483g = c0.D(new o());
        this.O = 1.0f;
        this.f16503z = com.google.android.exoplayer2.audio.a.f16539g;
        this.Y = 0;
        this.Z = new q9.p(0, 0.0f);
        w1 w1Var = w1.f18938d;
        this.B = new i(w1Var, 0L, 0L);
        this.C = w1Var;
        this.D = false;
        this.f16487j = new ArrayDeque();
        this.f16491n = new j(100L);
        this.f16492o = new j(100L);
        this.f16494q = fVar.f16513h;
    }
}
