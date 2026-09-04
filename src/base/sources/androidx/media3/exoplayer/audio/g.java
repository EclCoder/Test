package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private w1.d J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f5038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f5039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f5042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f5046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f5050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f5054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f5056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f5059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f5061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f5062z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void b(long j10);

        void onInvalidLatency(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public g(a aVar) {
        this.f5037a = (a) w1.a.e(aVar);
        try {
            this.f5050n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f5038b = new long[10];
        this.J = w1.d.f55786a;
    }

    private boolean b() {
        return this.f5044h && ((AudioTrack) w1.a.e(this.f5039c)).getPlayState() == 2 && e() == 0;
    }

    private long e() {
        long jElapsedRealtime = this.J.elapsedRealtime();
        if (this.f5061y != C.TIME_UNSET) {
            if (((AudioTrack) w1.a.e(this.f5039c)).getPlayState() == 2) {
                return this.A;
            }
            return Math.min(this.B, this.A + c0.E(c0.Z(c0.E0(jElapsedRealtime) - this.f5061y, this.f5046j), this.f5043g));
        }
        if (jElapsedRealtime - this.f5055s >= 5) {
            w(jElapsedRealtime);
            this.f5055s = jElapsedRealtime;
        }
        return this.f5056t + this.I + (this.f5057u << 32);
    }

    private long f() {
        return c0.M0(e(), this.f5043g);
    }

    private void l(long j10) {
        f fVar = (f) w1.a.e(this.f5042f);
        if (fVar.f(j10)) {
            long jD = fVar.d();
            long jC = fVar.c();
            long jF = f();
            if (Math.abs(jD - j10) > 5000000) {
                this.f5037a.onSystemTimeUsMismatch(jC, jD, j10, jF);
                fVar.g();
            } else if (Math.abs(c0.M0(jC, this.f5043g) - jF) <= 5000000) {
                fVar.a();
            } else {
                this.f5037a.onPositionFramesMismatch(jC, jD, j10, jF);
                fVar.g();
            }
        }
    }

    private void m() {
        long jNanoTime = this.J.nanoTime() / 1000;
        if (jNanoTime - this.f5049m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long jF = f();
            if (jF != 0) {
                this.f5038b[this.f5059w] = c0.e0(jF, this.f5046j) - jNanoTime;
                this.f5059w = (this.f5059w + 1) % 10;
                int i10 = this.f5060x;
                if (i10 < 10) {
                    this.f5060x = i10 + 1;
                }
                this.f5049m = jNanoTime;
                this.f5048l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f5060x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f5048l += this.f5038b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f5044h) {
            return;
        }
        l(jNanoTime);
        n(jNanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f5053q || (method = this.f5050n) == null || j10 - this.f5054r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) c0.h((Integer) method.invoke(w1.a.e(this.f5039c), null))).intValue()) * 1000) - this.f5045i;
            this.f5051o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f5051o = jMax;
            if (jMax > 5000000) {
                this.f5037a.onInvalidLatency(jMax);
                this.f5051o = 0L;
            }
        } catch (Exception unused) {
            this.f5050n = null;
        }
        this.f5054r = j10;
    }

    private static boolean o(int i10) {
        if (c0.f55769a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void r() {
        this.f5048l = 0L;
        this.f5060x = 0;
        this.f5059w = 0;
        this.f5049m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f5047k = false;
    }

    private void w(long j10) {
        AudioTrack audioTrack = (AudioTrack) w1.a.e(this.f5039c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f5044h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f5058v = this.f5056t;
            }
            playbackHeadPosition += this.f5058v;
        }
        if (c0.f55769a <= 29) {
            if (playbackHeadPosition == 0 && this.f5056t > 0 && playState == 3) {
                if (this.f5062z == C.TIME_UNSET) {
                    this.f5062z = j10;
                    return;
                }
                return;
            }
            this.f5062z = C.TIME_UNSET;
        }
        long j11 = this.f5056t;
        if (j11 > playbackHeadPosition) {
            if (this.H) {
                this.I += j11;
                this.H = false;
            } else {
                this.f5057u++;
            }
        }
        this.f5056t = playbackHeadPosition;
    }

    public void a() {
        this.H = true;
        f fVar = this.f5042f;
        if (fVar != null) {
            fVar.b();
        }
    }

    public int c(long j10) {
        return this.f5041e - ((int) (j10 - (e() * ((long) this.f5040d))));
    }

    public long d(boolean z10) {
        long jF;
        if (((AudioTrack) w1.a.e(this.f5039c)).getPlayState() == 3) {
            m();
        }
        long jNanoTime = this.J.nanoTime() / 1000;
        f fVar = (f) w1.a.e(this.f5042f);
        boolean zE = fVar.e();
        if (zE) {
            jF = c0.M0(fVar.c(), this.f5043g) + c0.Z(jNanoTime - fVar.d(), this.f5046j);
        } else {
            jF = this.f5060x == 0 ? f() : c0.Z(this.f5048l + jNanoTime, this.f5046j);
            if (!z10) {
                jF = Math.max(0L, jF - this.f5051o);
            }
        }
        if (this.E != zE) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = jNanoTime - this.G;
        if (j10 < 1000000) {
            long jZ = this.F + c0.Z(j10, this.f5046j);
            long j11 = (j10 * 1000) / 1000000;
            jF = ((jF * j11) + ((1000 - j11) * jZ)) / 1000;
        }
        if (!this.f5047k) {
            long j12 = this.C;
            if (jF > j12) {
                this.f5047k = true;
                this.f5037a.b(this.J.currentTimeMillis() - c0.c1(c0.e0(c0.c1(jF - j12), this.f5046j)));
            }
        }
        this.D = jNanoTime;
        this.C = jF;
        this.E = zE;
        return jF;
    }

    public void g(long j10) {
        this.A = e();
        this.f5061y = c0.E0(this.J.elapsedRealtime());
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > c0.E(d(false), this.f5043g) || b();
    }

    public boolean i() {
        return ((AudioTrack) w1.a.e(this.f5039c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f5062z != C.TIME_UNSET && j10 > 0 && this.J.elapsedRealtime() - this.f5062z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) w1.a.e(this.f5039c)).getPlayState();
        if (this.f5044h) {
            if (playState == 2) {
                this.f5052p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f5052p;
        boolean zH = h(j10);
        this.f5052p = zH;
        if (z10 && !zH && playState != 1) {
            this.f5037a.onUnderrun(this.f5041e, c0.c1(this.f5045i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f5061y == C.TIME_UNSET) {
            ((f) w1.a.e(this.f5042f)).h();
            return true;
        }
        this.A = e();
        return false;
    }

    public void q() {
        r();
        this.f5039c = null;
        this.f5042f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f5039c = audioTrack;
        this.f5040d = i11;
        this.f5041e = i12;
        this.f5042f = new f(audioTrack);
        this.f5043g = audioTrack.getSampleRate();
        this.f5044h = z10 && o(i10);
        boolean zW0 = c0.w0(i10);
        this.f5053q = zW0;
        this.f5045i = zW0 ? c0.M0(i12 / i11, this.f5043g) : -9223372036854775807L;
        this.f5056t = 0L;
        this.f5057u = 0L;
        this.H = false;
        this.I = 0L;
        this.f5058v = 0L;
        this.f5052p = false;
        this.f5061y = C.TIME_UNSET;
        this.f5062z = C.TIME_UNSET;
        this.f5054r = 0L;
        this.f5051o = 0L;
        this.f5046j = 1.0f;
    }

    public void t(float f10) {
        this.f5046j = f10;
        f fVar = this.f5042f;
        if (fVar != null) {
            fVar.h();
        }
        r();
    }

    public void u(w1.d dVar) {
        this.J = dVar;
    }

    public void v() {
        if (this.f5061y != C.TIME_UNSET) {
            this.f5061y = c0.E0(this.J.elapsedRealtime());
        }
        ((f) w1.a.e(this.f5042f)).h();
    }
}
