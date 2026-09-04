package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f16962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f16963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f16964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f16967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f16968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f16969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f16970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f16971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f16972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f16973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f16974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f16975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f16976s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f16977a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f16978b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f16979c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f16980d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f16981e = ob.r0.H0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f16982f = ob.r0.H0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f16983g = 0.999f;

        public h a() {
            return new h(this.f16977a, this.f16978b, this.f16979c, this.f16980d, this.f16981e, this.f16982f, this.f16983g);
        }
    }

    private void f(long j10) {
        long j11 = this.f16975r + (this.f16976s * 3);
        if (this.f16970m > j11) {
            float fH0 = ob.r0.H0(this.f16960c);
            this.f16970m = com.google.common.primitives.i.c(j11, this.f16967j, this.f16970m - (((long) ((this.f16973p - 1.0f) * fH0)) + ((long) ((this.f16971n - 1.0f) * fH0))));
            return;
        }
        long jR = ob.r0.r(j10 - ((long) (Math.max(0.0f, this.f16973p - 1.0f) / this.f16961d)), this.f16970m, j11);
        this.f16970m = jR;
        long j12 = this.f16969l;
        if (j12 == C.TIME_UNSET || jR <= j12) {
            return;
        }
        this.f16970m = j12;
    }

    private void g() {
        long j10 = this.f16965h;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f16966i;
            if (j11 != C.TIME_UNSET) {
                j10 = j11;
            }
            long j12 = this.f16968k;
            if (j12 != C.TIME_UNSET && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f16969l;
            if (j13 != C.TIME_UNSET && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f16967j == j10) {
            return;
        }
        this.f16967j = j10;
        this.f16970m = j10;
        this.f16975r = C.TIME_UNSET;
        this.f16976s = C.TIME_UNSET;
        this.f16974q = C.TIME_UNSET;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f16975r;
        if (j13 == C.TIME_UNSET) {
            this.f16975r = j12;
            this.f16976s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f16964g));
            this.f16975r = jMax;
            this.f16976s = h(this.f16976s, Math.abs(j12 - jMax), this.f16964g);
        }
    }

    @Override // com.google.android.exoplayer2.x0
    public float a(long j10, long j11) {
        if (this.f16965h == C.TIME_UNSET) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f16974q != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f16974q < this.f16960c) {
            return this.f16973p;
        }
        this.f16974q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f16970m;
        if (Math.abs(j12) < this.f16962e) {
            this.f16973p = 1.0f;
        } else {
            this.f16973p = ob.r0.p((this.f16961d * j12) + 1.0f, this.f16972o, this.f16971n);
        }
        return this.f16973p;
    }

    @Override // com.google.android.exoplayer2.x0
    public long b() {
        return this.f16970m;
    }

    @Override // com.google.android.exoplayer2.x0
    public void c() {
        long j10 = this.f16970m;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f16963f;
        this.f16970m = j11;
        long j12 = this.f16969l;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f16970m = j12;
        }
        this.f16974q = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.x0
    public void d(long j10) {
        this.f16966i = j10;
        g();
    }

    @Override // com.google.android.exoplayer2.x0
    public void e(y0.g gVar) {
        this.f16965h = ob.r0.H0(gVar.f19061a);
        this.f16968k = ob.r0.H0(gVar.f19062b);
        this.f16969l = ob.r0.H0(gVar.f19063c);
        float f10 = gVar.f19064d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f16958a;
        }
        this.f16972o = f10;
        float f11 = gVar.f19065e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f16959b;
        }
        this.f16971n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f16965h = C.TIME_UNSET;
        }
        g();
    }

    private h(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f16958a = f10;
        this.f16959b = f11;
        this.f16960c = j10;
        this.f16961d = f12;
        this.f16962e = j11;
        this.f16963f = j12;
        this.f16964g = f13;
        this.f16965h = C.TIME_UNSET;
        this.f16966i = C.TIME_UNSET;
        this.f16968k = C.TIME_UNSET;
        this.f16969l = C.TIME_UNSET;
        this.f16972o = f10;
        this.f16971n = f11;
        this.f16973p = 1.0f;
        this.f16974q = C.TIME_UNSET;
        this.f16967j = C.TIME_UNSET;
        this.f16970m = C.TIME_UNSET;
        this.f16975r = C.TIME_UNSET;
        this.f16976s = C.TIME_UNSET;
    }
}
