package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f16597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f16598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f16601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f16605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f16607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f16608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f16609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f16613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f16614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f16615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f16616u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f16617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f16620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f16621z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void b(long j10);

        void onInvalidLatency(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public g(a aVar) {
        this.f16596a = (a) ob.a.e(aVar);
        if (r0.f48425a >= 18) {
            try {
                this.f16609n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f16597b = new long[10];
    }

    private boolean a() {
        return this.f16603h && ((AudioTrack) ob.a.e(this.f16598c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f16620y;
        if (j10 != C.TIME_UNSET) {
            return Math.min(this.B, this.A + r0.B(r0.d0((jElapsedRealtime * 1000) - j10, this.f16605j), this.f16602g));
        }
        if (jElapsedRealtime - this.f16614s >= 5) {
            u(jElapsedRealtime);
            this.f16614s = jElapsedRealtime;
        }
        return this.f16615t + (this.f16616u << 32);
    }

    private long e() {
        return r0.T0(d(), this.f16602g);
    }

    private void k(long j10) {
        f fVar = (f) ob.a.e(this.f16601f);
        if (fVar.e(j10)) {
            long jC = fVar.c();
            long jB = fVar.b();
            long jE = e();
            if (Math.abs(jC - j10) > 5000000) {
                this.f16596a.onSystemTimeUsMismatch(jB, jC, j10, jE);
                fVar.f();
            } else if (Math.abs(r0.T0(jB, this.f16602g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f16596a.onPositionFramesMismatch(jB, jC, j10, jE);
                fVar.f();
            }
        }
    }

    private void l() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f16608m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long jE = e();
            if (jE != 0) {
                this.f16597b[this.f16618w] = r0.i0(jE, this.f16605j) - jNanoTime;
                this.f16618w = (this.f16618w + 1) % 10;
                int i10 = this.f16619x;
                if (i10 < 10) {
                    this.f16619x = i10 + 1;
                }
                this.f16608m = jNanoTime;
                this.f16607l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f16619x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f16607l += this.f16597b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f16603h) {
            return;
        }
        k(jNanoTime);
        m(jNanoTime);
    }

    private void m(long j10) {
        Method method;
        if (!this.f16612q || (method = this.f16609n) == null || j10 - this.f16613r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) r0.j((Integer) method.invoke(ob.a.e(this.f16598c), null))).intValue()) * 1000) - this.f16604i;
            this.f16610o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f16610o = jMax;
            if (jMax > 5000000) {
                this.f16596a.onInvalidLatency(jMax);
                this.f16610o = 0L;
            }
        } catch (Exception unused) {
            this.f16609n = null;
        }
        this.f16613r = j10;
    }

    private static boolean n(int i10) {
        if (r0.f48425a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void q() {
        this.f16607l = 0L;
        this.f16619x = 0;
        this.f16618w = 0;
        this.f16608m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f16606k = false;
    }

    private void u(long j10) {
        AudioTrack audioTrack = (AudioTrack) ob.a.e(this.f16598c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f16603h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f16617v = this.f16615t;
            }
            playbackHeadPosition += this.f16617v;
        }
        if (r0.f48425a <= 29) {
            if (playbackHeadPosition == 0 && this.f16615t > 0 && playState == 3) {
                if (this.f16621z == C.TIME_UNSET) {
                    this.f16621z = j10;
                    return;
                }
                return;
            }
            this.f16621z = C.TIME_UNSET;
        }
        if (this.f16615t > playbackHeadPosition) {
            this.f16616u++;
        }
        this.f16615t = playbackHeadPosition;
    }

    public int b(long j10) {
        return this.f16600e - ((int) (j10 - (d() * ((long) this.f16599d))));
    }

    public long c(boolean z10) {
        long jE;
        if (((AudioTrack) ob.a.e(this.f16598c)).getPlayState() == 3) {
            l();
        }
        long jNanoTime = System.nanoTime() / 1000;
        f fVar = (f) ob.a.e(this.f16601f);
        boolean zD = fVar.d();
        if (zD) {
            jE = r0.T0(fVar.b(), this.f16602g) + r0.d0(jNanoTime - fVar.c(), this.f16605j);
        } else {
            jE = this.f16619x == 0 ? e() : r0.d0(this.f16607l + jNanoTime, this.f16605j);
            if (!z10) {
                jE = Math.max(0L, jE - this.f16610o);
            }
        }
        if (this.E != zD) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = jNanoTime - this.G;
        if (j10 < 1000000) {
            long jD0 = this.F + r0.d0(j10, this.f16605j);
            long j11 = (j10 * 1000) / 1000000;
            jE = ((jE * j11) + ((1000 - j11) * jD0)) / 1000;
        }
        if (!this.f16606k) {
            long j12 = this.C;
            if (jE > j12) {
                this.f16606k = true;
                this.f16596a.b(System.currentTimeMillis() - r0.i1(r0.i0(r0.i1(jE - j12), this.f16605j)));
            }
        }
        this.D = jNanoTime;
        this.C = jE;
        this.E = zD;
        return jE;
    }

    public void f(long j10) {
        this.A = d();
        this.f16620y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public boolean g(long j10) {
        return j10 > r0.B(c(false), this.f16602g) || a();
    }

    public boolean h() {
        return ((AudioTrack) ob.a.e(this.f16598c)).getPlayState() == 3;
    }

    public boolean i(long j10) {
        return this.f16621z != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.f16621z >= 200;
    }

    public boolean j(long j10) {
        int playState = ((AudioTrack) ob.a.e(this.f16598c)).getPlayState();
        if (this.f16603h) {
            if (playState == 2) {
                this.f16611p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f16611p;
        boolean zG = g(j10);
        this.f16611p = zG;
        if (z10 && !zG && playState != 1) {
            this.f16596a.onUnderrun(this.f16600e, r0.i1(this.f16604i));
        }
        return true;
    }

    public boolean o() {
        q();
        if (this.f16620y != C.TIME_UNSET) {
            return false;
        }
        ((f) ob.a.e(this.f16601f)).g();
        return true;
    }

    public void p() {
        q();
        this.f16598c = null;
        this.f16601f = null;
    }

    public void r(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f16598c = audioTrack;
        this.f16599d = i11;
        this.f16600e = i12;
        this.f16601f = new f(audioTrack);
        this.f16602g = audioTrack.getSampleRate();
        this.f16603h = z10 && n(i10);
        boolean zB0 = r0.B0(i10);
        this.f16612q = zB0;
        this.f16604i = zB0 ? r0.T0(i12 / i11, this.f16602g) : -9223372036854775807L;
        this.f16615t = 0L;
        this.f16616u = 0L;
        this.f16617v = 0L;
        this.f16611p = false;
        this.f16620y = C.TIME_UNSET;
        this.f16621z = C.TIME_UNSET;
        this.f16613r = 0L;
        this.f16610o = 0L;
        this.f16605j = 1.0f;
    }

    public void s(float f10) {
        this.f16605j = f10;
        f fVar = this.f16601f;
        if (fVar != null) {
            fVar.g();
        }
        q();
    }

    public void t() {
        ((f) ob.a.e(this.f16601f)).g();
    }
}
