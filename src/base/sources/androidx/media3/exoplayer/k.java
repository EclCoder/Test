package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f5415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f5419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f5420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f5427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f5428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f5429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f5431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5432s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f5433a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f5434b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5435c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f5436d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5437e = w1.c0.E0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5438f = w1.c0.E0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f5439g = 0.999f;

        public k a() {
            return new k(this.f5433a, this.f5434b, this.f5435c, this.f5436d, this.f5437e, this.f5438f, this.f5439g);
        }
    }

    private void f(long j10) {
        long j11 = this.f5431r + (this.f5432s * 3);
        if (this.f5426m > j11) {
            float fE0 = w1.c0.E0(this.f5416c);
            this.f5426m = com.google.common.primitives.i.c(j11, this.f5423j, this.f5426m - (((long) ((this.f5429p - 1.0f) * fE0)) + ((long) ((this.f5427n - 1.0f) * fE0))));
            return;
        }
        long jP = w1.c0.p(j10 - ((long) (Math.max(0.0f, this.f5429p - 1.0f) / this.f5417d)), this.f5426m, j11);
        this.f5426m = jP;
        long j12 = this.f5425l;
        if (j12 == C.TIME_UNSET || jP <= j12) {
            return;
        }
        this.f5426m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f5421h;
        if (j11 != C.TIME_UNSET) {
            j10 = this.f5422i;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.f5424k;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f5425l;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f5423j == j10) {
            return;
        }
        this.f5423j = j10;
        this.f5426m = j10;
        this.f5431r = C.TIME_UNSET;
        this.f5432s = C.TIME_UNSET;
        this.f5430q = C.TIME_UNSET;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f5431r;
        if (j13 == C.TIME_UNSET) {
            this.f5431r = j12;
            this.f5432s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f5420g));
            this.f5431r = jMax;
            this.f5432s = h(this.f5432s, Math.abs(j12 - jMax), this.f5420g);
        }
    }

    @Override // androidx.media3.exoplayer.g1
    public float a(long j10, long j11) {
        if (this.f5421h == C.TIME_UNSET) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f5430q != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f5430q < this.f5416c) {
            return this.f5429p;
        }
        this.f5430q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f5426m;
        if (Math.abs(j12) < this.f5418e) {
            this.f5429p = 1.0f;
        } else {
            this.f5429p = w1.c0.n((this.f5417d * j12) + 1.0f, this.f5428o, this.f5427n);
        }
        return this.f5429p;
    }

    @Override // androidx.media3.exoplayer.g1
    public long b() {
        return this.f5426m;
    }

    @Override // androidx.media3.exoplayer.g1
    public void c() {
        long j10 = this.f5426m;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f5419f;
        this.f5426m = j11;
        long j12 = this.f5425l;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f5426m = j12;
        }
        this.f5430q = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.g1
    public void d(long j10) {
        this.f5422i = j10;
        g();
    }

    @Override // androidx.media3.exoplayer.g1
    public void e(t1.r.g gVar) {
        this.f5421h = w1.c0.E0(gVar.f52892a);
        this.f5424k = w1.c0.E0(gVar.f52893b);
        this.f5425l = w1.c0.E0(gVar.f52894c);
        float f10 = gVar.f52895d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f5414a;
        }
        this.f5428o = f10;
        float f11 = gVar.f52896e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f5415b;
        }
        this.f5427n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f5421h = C.TIME_UNSET;
        }
        g();
    }

    private k(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f5414a = f10;
        this.f5415b = f11;
        this.f5416c = j10;
        this.f5417d = f12;
        this.f5418e = j11;
        this.f5419f = j12;
        this.f5420g = f13;
        this.f5421h = C.TIME_UNSET;
        this.f5422i = C.TIME_UNSET;
        this.f5424k = C.TIME_UNSET;
        this.f5425l = C.TIME_UNSET;
        this.f5428o = f10;
        this.f5427n = f11;
        this.f5429p = 1.0f;
        this.f5430q = C.TIME_UNSET;
        this.f5423j = C.TIME_UNSET;
        this.f5426m = C.TIME_UNSET;
        this.f5431r = C.TIME_UNSET;
        this.f5432s = C.TIME_UNSET;
    }
}
