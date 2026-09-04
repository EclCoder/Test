package lp;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f44897w = {4, 2, 3, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f44902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private vp.f f44903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f44904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private vp.b f44905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f44907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f44910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private vp.b f44911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f44912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private vp.b f44913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float[] f44914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private vp.b f44915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float[] f44916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private vp.b f44917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p f44918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44919v;

    /* JADX INFO: renamed from: lp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0682a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f44923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vp.b f44924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ vp.b f44925f;

        RunnableC0682a(int i10, long j10, long j11, long j12, vp.b bVar, vp.b bVar2) {
            this.f44920a = i10;
            this.f44921b = j10;
            this.f44922c = j11;
            this.f44923d = j12;
            this.f44924e = bVar;
            this.f44925f = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10 = 2;
            long j11 = 1;
            if (this.f44920a <= 0) {
                for (long j12 = this.f44921b; j12 < this.f44922c; j12++) {
                    long j13 = j12 * 2;
                    long j14 = j13 + 1;
                    long j15 = this.f44923d;
                    this.f44924e.r(j15 + j13, (a.this.f44915r.p(j13) * this.f44925f.p(j13)) + (a.this.f44915r.p(j14) * this.f44925f.p(j14)));
                    this.f44924e.r(j15 + j14, ((-a.this.f44915r.p(j14)) * this.f44925f.p(j13)) + (a.this.f44915r.p(j13) * this.f44925f.p(j14)));
                }
                return;
            }
            long j16 = this.f44921b;
            while (j16 < this.f44922c) {
                long j17 = j16 * j10;
                long j18 = j17 + j11;
                long j19 = this.f44923d;
                long j20 = j11;
                this.f44924e.r(j19 + j17, (a.this.f44915r.p(j17) * this.f44925f.p(j17)) - (a.this.f44915r.p(j18) * this.f44925f.p(j18)));
                this.f44924e.r(j19 + j18, (a.this.f44915r.p(j18) * this.f44925f.p(j17)) + (a.this.f44915r.p(j17) * this.f44925f.p(j18)));
                j16 += j20;
                j10 = j10;
                j11 = j20;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float[] f44930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f44931e;

        b(int i10, int i11, int i12, float[] fArr, float[] fArr2) {
            this.f44927a = i10;
            this.f44928b = i11;
            this.f44929c = i12;
            this.f44930d = fArr;
            this.f44931e = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = this.f44927a; i10 < this.f44928b; i10++) {
                int i11 = i10 * 2;
                int i12 = i11 + 1;
                int i13 = this.f44929c + i10;
                this.f44930d[i11] = this.f44931e[i13] * a.this.f44914q[i11];
                this.f44930d[i12] = (-this.f44931e[i13]) * a.this.f44914q[i12];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f44935c;

        c(int i10, int i11, float[] fArr) {
            this.f44933a = i10;
            this.f44934b = i11;
            this.f44935c = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = this.f44933a; i10 < this.f44934b; i10++) {
                int i11 = i10 * 2;
                int i12 = i11 + 1;
                float f10 = (this.f44935c[i11] * a.this.f44916s[i12]) + (this.f44935c[i12] * a.this.f44916s[i11]);
                float[] fArr = this.f44935c;
                fArr[i11] = (fArr[i11] * a.this.f44916s[i11]) - (this.f44935c[i12] * a.this.f44916s[i12]);
                this.f44935c[i12] = f10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ vp.b f44940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vp.b f44941e;

        d(long j10, long j11, long j12, vp.b bVar, vp.b bVar2) {
            this.f44937a = j10;
            this.f44938b = j11;
            this.f44939c = j12;
            this.f44940d = bVar;
            this.f44941e = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f44937a; j10 < this.f44938b; j10++) {
                long j11 = 2 * j10;
                long j12 = j11 + 1;
                long j13 = this.f44939c + j10;
                this.f44940d.r(j11, this.f44941e.p(j13) * a.this.f44915r.p(j11));
                this.f44940d.r(j12, (-this.f44941e.p(j13)) * a.this.f44915r.p(j12));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vp.b f44945c;

        e(long j10, long j11, vp.b bVar) {
            this.f44943a = j10;
            this.f44944b = j11;
            this.f44945c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f44943a; j10 < this.f44944b; j10++) {
                long j11 = 2 * j10;
                long j12 = j11 + 1;
                float fP = (this.f44945c.p(j11) * a.this.f44917t.p(j12)) + (this.f44945c.p(j12) * a.this.f44917t.p(j11));
                vp.b bVar = this.f44945c;
                bVar.r(j11, (bVar.p(j11) * a.this.f44917t.p(j11)) - (this.f44945c.p(j12) * a.this.f44917t.p(j12)));
                this.f44945c.r(j12, fP);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f44949c;

        f(int i10, int i11, float[] fArr) {
            this.f44947a = i10;
            this.f44948b = i11;
            this.f44949c = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = this.f44947a; i10 < this.f44948b; i10++) {
                int i11 = i10 * 2;
                int i12 = i11 + 1;
                float f10 = ((-this.f44949c[i11]) * a.this.f44916s[i12]) + (this.f44949c[i12] * a.this.f44916s[i11]);
                float[] fArr = this.f44949c;
                fArr[i11] = (fArr[i11] * a.this.f44916s[i11]) + (this.f44949c[i12] * a.this.f44916s[i12]);
                this.f44949c[i12] = f10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f44953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f44955e;

        g(int i10, int i11, float[] fArr, int i12, float[] fArr2) {
            this.f44951a = i10;
            this.f44952b = i11;
            this.f44953c = fArr;
            this.f44954d = i12;
            this.f44955e = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = this.f44951a; i10 < this.f44952b; i10++) {
                int i11 = i10 * 2;
                int i12 = i11 + 1;
                this.f44953c[this.f44954d + i10] = (a.this.f44914q[i11] * this.f44955e[i11]) - (a.this.f44914q[i12] * this.f44955e[i12]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vp.b f44959c;

        h(long j10, long j11, vp.b bVar) {
            this.f44957a = j10;
            this.f44958b = j11;
            this.f44959c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f44957a; j10 < this.f44958b; j10++) {
                long j11 = 2 * j10;
                long j12 = j11 + 1;
                float fP = ((-this.f44959c.p(j11)) * a.this.f44917t.p(j12)) + (this.f44959c.p(j12) * a.this.f44917t.p(j11));
                vp.b bVar = this.f44959c;
                bVar.r(j11, (bVar.p(j11) * a.this.f44917t.p(j11)) + (this.f44959c.p(j12) * a.this.f44917t.p(j12)));
                this.f44959c.r(j12, fP);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vp.b f44963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f44964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vp.b f44965e;

        i(long j10, long j11, vp.b bVar, long j12, vp.b bVar2) {
            this.f44961a = j10;
            this.f44962b = j11;
            this.f44963c = bVar;
            this.f44964d = j12;
            this.f44965e = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f44961a; j10 < this.f44962b; j10++) {
                long j11 = 2 * j10;
                long j12 = j11 + 1;
                this.f44963c.r(this.f44964d + j10, (a.this.f44915r.p(j11) * this.f44965e.p(j11)) - (a.this.f44915r.p(j12) * this.f44965e.p(j12)));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44967a;

        static {
            int[] iArr = new int[p.values().length];
            f44967a = iArr;
            try {
                iArr[p.SPLIT_RADIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44967a[p.MIXED_RADIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44967a[p.BLUESTEIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f44972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float[] f44973f;

        k(int i10, int i11, int i12, int i13, float[] fArr, float[] fArr2) {
            this.f44968a = i10;
            this.f44969b = i11;
            this.f44970c = i12;
            this.f44971d = i13;
            this.f44972e = fArr;
            this.f44973f = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44968a > 0) {
                for (int i10 = this.f44969b; i10 < this.f44970c; i10++) {
                    int i11 = i10 * 2;
                    int i12 = i11 + 1;
                    int i13 = this.f44971d;
                    int i14 = i13 + i11;
                    int i15 = i13 + i12;
                    this.f44972e[i11] = (this.f44973f[i14] * a.this.f44914q[i11]) - (this.f44973f[i15] * a.this.f44914q[i12]);
                    this.f44972e[i12] = (this.f44973f[i14] * a.this.f44914q[i12]) + (this.f44973f[i15] * a.this.f44914q[i11]);
                }
                return;
            }
            for (int i16 = this.f44969b; i16 < this.f44970c; i16++) {
                int i17 = i16 * 2;
                int i18 = i17 + 1;
                int i19 = this.f44971d;
                int i20 = i19 + i17;
                int i21 = i19 + i18;
                this.f44972e[i17] = (this.f44973f[i20] * a.this.f44914q[i17]) + (this.f44973f[i21] * a.this.f44914q[i18]);
                this.f44972e[i18] = ((-this.f44973f[i20]) * a.this.f44914q[i18]) + (this.f44973f[i21] * a.this.f44914q[i17]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float[] f44978d;

        l(int i10, int i11, int i12, float[] fArr) {
            this.f44975a = i10;
            this.f44976b = i11;
            this.f44977c = i12;
            this.f44978d = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44975a > 0) {
                for (int i10 = this.f44976b; i10 < this.f44977c; i10++) {
                    int i11 = i10 * 2;
                    int i12 = i11 + 1;
                    float f10 = ((-this.f44978d[i11]) * a.this.f44916s[i12]) + (this.f44978d[i12] * a.this.f44916s[i11]);
                    float[] fArr = this.f44978d;
                    fArr[i11] = (fArr[i11] * a.this.f44916s[i11]) + (this.f44978d[i12] * a.this.f44916s[i12]);
                    this.f44978d[i12] = f10;
                }
                return;
            }
            for (int i13 = this.f44976b; i13 < this.f44977c; i13++) {
                int i14 = i13 * 2;
                int i15 = i14 + 1;
                float f11 = (this.f44978d[i14] * a.this.f44916s[i15]) + (this.f44978d[i15] * a.this.f44916s[i14]);
                float[] fArr2 = this.f44978d;
                fArr2[i14] = (fArr2[i14] * a.this.f44916s[i14]) - (this.f44978d[i15] * a.this.f44916s[i15]);
                this.f44978d[i15] = f11;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f44984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float[] f44985f;

        m(int i10, int i11, int i12, int i13, float[] fArr, float[] fArr2) {
            this.f44980a = i10;
            this.f44981b = i11;
            this.f44982c = i12;
            this.f44983d = i13;
            this.f44984e = fArr;
            this.f44985f = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44980a > 0) {
                for (int i10 = this.f44981b; i10 < this.f44982c; i10++) {
                    int i11 = i10 * 2;
                    int i12 = i11 + 1;
                    int i13 = this.f44983d;
                    this.f44984e[i13 + i11] = (a.this.f44914q[i11] * this.f44985f[i11]) - (a.this.f44914q[i12] * this.f44985f[i12]);
                    this.f44984e[i13 + i12] = (a.this.f44914q[i12] * this.f44985f[i11]) + (a.this.f44914q[i11] * this.f44985f[i12]);
                }
                return;
            }
            for (int i14 = this.f44981b; i14 < this.f44982c; i14++) {
                int i15 = i14 * 2;
                int i16 = i15 + 1;
                int i17 = this.f44983d;
                this.f44984e[i17 + i15] = (a.this.f44914q[i15] * this.f44985f[i15]) + (a.this.f44914q[i16] * this.f44985f[i16]);
                this.f44984e[i17 + i16] = ((-a.this.f44914q[i16]) * this.f44985f[i15]) + (a.this.f44914q[i15] * this.f44985f[i16]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f44990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vp.b f44991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ vp.b f44992f;

        n(int i10, long j10, long j11, long j12, vp.b bVar, vp.b bVar2) {
            this.f44987a = i10;
            this.f44988b = j10;
            this.f44989c = j11;
            this.f44990d = j12;
            this.f44991e = bVar;
            this.f44992f = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10 = 2;
            long j11 = 1;
            if (this.f44987a <= 0) {
                for (long j12 = this.f44988b; j12 < this.f44989c; j12++) {
                    long j13 = j12 * 2;
                    long j14 = j13 + 1;
                    long j15 = this.f44990d;
                    long j16 = j15 + j13;
                    long j17 = j15 + j14;
                    this.f44991e.r(j13, (this.f44992f.p(j16) * a.this.f44915r.p(j13)) + (this.f44992f.p(j17) * a.this.f44915r.p(j14)));
                    this.f44991e.r(j14, ((-this.f44992f.p(j16)) * a.this.f44915r.p(j14)) + (this.f44992f.p(j17) * a.this.f44915r.p(j13)));
                }
                return;
            }
            long j18 = this.f44988b;
            while (j18 < this.f44989c) {
                long j19 = j18 * j10;
                long j20 = j19 + j11;
                long j21 = this.f44990d;
                long j22 = j21 + j19;
                long j23 = j21 + j20;
                long j24 = j11;
                this.f44991e.r(j19, (this.f44992f.p(j22) * a.this.f44915r.p(j19)) - (this.f44992f.p(j23) * a.this.f44915r.p(j20)));
                this.f44991e.r(j20, (this.f44992f.p(j22) * a.this.f44915r.p(j20)) + (this.f44992f.p(j23) * a.this.f44915r.p(j19)));
                j18 += j24;
                j10 = j10;
                j11 = j24;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ vp.b f44997d;

        o(int i10, long j10, long j11, vp.b bVar) {
            this.f44994a = i10;
            this.f44995b = j10;
            this.f44996c = j11;
            this.f44997d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44994a > 0) {
                for (long j10 = this.f44995b; j10 < this.f44996c; j10++) {
                    long j11 = j10 * 2;
                    long j12 = j11 + 1;
                    float fP = ((-this.f44997d.p(j11)) * a.this.f44917t.p(j12)) + (this.f44997d.p(j12) * a.this.f44917t.p(j11));
                    vp.b bVar = this.f44997d;
                    bVar.r(j11, (bVar.p(j11) * a.this.f44917t.p(j11)) + (this.f44997d.p(j12) * a.this.f44917t.p(j12)));
                    this.f44997d.r(j12, fP);
                }
                return;
            }
            for (long j13 = this.f44995b; j13 < this.f44996c; j13++) {
                long j14 = j13 * 2;
                long j15 = j14 + 1;
                float fP2 = (this.f44997d.p(j14) * a.this.f44917t.p(j15)) + (this.f44997d.p(j15) * a.this.f44917t.p(j14));
                vp.b bVar2 = this.f44997d;
                bVar2.r(j14, (bVar2.p(j14) * a.this.f44917t.p(j14)) - (this.f44997d.p(j15) * a.this.f44917t.p(j15)));
                this.f44997d.r(j15, fP2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum p {
        SPLIT_RADIX,
        MIXED_RADIX,
        BLUESTEIN
    }

    public a(long j10) {
        if (j10 < 1) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        boolean z10 = mp.a.f0() || j10 * 2 > ((long) vp.c.g());
        this.f44919v = z10;
        this.f44898a = (int) j10;
        this.f44899b = j10;
        if (z10) {
            if (mp.a.e0(j10)) {
                this.f44918u = p.SPLIT_RADIX;
                this.f44903f = new vp.f(((long) bo.a.a((1 << ((int) (((long) (bo.a.e(this.f44899b + 0.5f) / bo.a.e(2.0d))) / 2))) + 2)) + 2);
                vp.b bVar = new vp.b(this.f44899b);
                this.f44905h = bVar;
                long j11 = (this.f44899b * 2) >> 2;
                this.f44907j = j11;
                mp.a.l0(j11, this.f44903f, bVar);
                long j12 = this.f44899b >> 2;
                this.f44909l = j12;
                mp.a.h0(j12, this.f44905h, this.f44907j, this.f44903f);
                return;
            }
            if (mp.a.a0(this.f44899b, f44897w) < 211) {
                this.f44918u = p.MIXED_RADIX;
                this.f44911n = new vp.b((this.f44899b * 4) + 15);
                this.f44913p = new vp.b((this.f44899b * 2) + 15);
                p();
                l0();
                return;
            }
            this.f44918u = p.BLUESTEIN;
            this.f44901d = mp.a.n0((this.f44899b * 2) - 1);
            this.f44915r = new vp.b(this.f44901d * 2);
            this.f44917t = new vp.b(this.f44901d * 2);
            this.f44903f = new vp.f(((long) bo.a.a((1 << ((int) (((long) (bo.a.e(this.f44901d + 0.5f) / bo.a.e(2.0d))) / 2))) + 2)) + 2);
            vp.b bVar2 = new vp.b(this.f44901d);
            this.f44905h = bVar2;
            long j13 = (this.f44901d * 2) >> 2;
            this.f44907j = j13;
            mp.a.l0(j13, this.f44903f, bVar2);
            long j14 = this.f44901d >> 2;
            this.f44909l = j14;
            mp.a.h0(j14, this.f44905h, this.f44907j, this.f44903f);
            l();
            return;
        }
        if (mp.a.e0(j10)) {
            this.f44918u = p.SPLIT_RADIX;
            int[] iArr = new int[((int) bo.a.a((1 << (((int) (bo.a.e(j10 + 0.5f) / bo.a.e(2.0d))) / 2)) + 2)) + 2];
            this.f44902e = iArr;
            int i10 = this.f44898a;
            float[] fArr = new float[i10];
            this.f44904g = fArr;
            int i11 = (i10 * 2) >> 2;
            this.f44906i = i11;
            mp.a.k0(i11, iArr, fArr);
            int i12 = this.f44898a >> 2;
            this.f44908k = i12;
            mp.a.g0(i12, this.f44904g, this.f44906i, this.f44902e);
            return;
        }
        if (mp.a.a0(j10, f44897w) < 211) {
            this.f44918u = p.MIXED_RADIX;
            int i13 = this.f44898a;
            this.f44910m = new float[(i13 * 4) + 15];
            this.f44912o = new float[(i13 * 2) + 15];
            o();
            k0();
            return;
        }
        this.f44918u = p.BLUESTEIN;
        int iM0 = mp.a.m0((this.f44898a * 2) - 1);
        this.f44900c = iM0;
        this.f44914q = new float[iM0 * 2];
        this.f44916s = new float[iM0 * 2];
        int[] iArr2 = new int[((int) bo.a.a((1 << (((int) (bo.a.e(iM0 + 0.5f) / bo.a.e(2.0d))) / 2)) + 2)) + 2];
        this.f44902e = iArr2;
        int i14 = this.f44900c;
        float[] fArr2 = new float[i14];
        this.f44904g = fArr2;
        int i15 = (i14 * 2) >> 2;
        this.f44906i = i15;
        mp.a.k0(i15, iArr2, fArr2);
        int i16 = this.f44900c >> 2;
        this.f44908k = i16;
        mp.a.g0(i16, this.f44904g, this.f44906i, this.f44902e);
        k();
    }

    private void e(vp.b bVar, long j10, int i10) {
        long j11;
        Class<a> cls = a.class;
        long j12 = 2;
        vp.b bVar2 = new vp.b(this.f44901d * 2);
        int iC = vp.a.c();
        if (iC <= 1 || this.f44899b <= mp.a.b0()) {
            if (i10 > 0) {
                long j13 = 0;
                while (j13 < this.f44899b) {
                    long j14 = j13 * j12;
                    long j15 = j14 + 1;
                    long j16 = j10 + j14;
                    long j17 = j12;
                    long j18 = j10 + j15;
                    bVar2.r(j14, (bVar.p(j16) * this.f44915r.p(j14)) - (bVar.p(j18) * this.f44915r.p(j15)));
                    bVar2.r(j15, (bVar.p(j16) * this.f44915r.p(j15)) + (bVar.p(j18) * this.f44915r.p(j14)));
                    j13++;
                    j12 = j17;
                }
                j11 = j12;
            } else {
                j11 = 2;
                for (long j19 = 0; j19 < this.f44899b; j19++) {
                    long j20 = j19 * 2;
                    long j21 = j20 + 1;
                    long j22 = j10 + j20;
                    long j23 = j10 + j21;
                    bVar2.r(j20, (bVar.p(j22) * this.f44915r.p(j20)) + (bVar.p(j23) * this.f44915r.p(j21)));
                    bVar2.r(j21, ((-bVar.p(j22)) * this.f44915r.p(j21)) + (bVar.p(j23) * this.f44915r.p(j20)));
                }
            }
            mp.a.r(this.f44901d * j11, bVar2, 0L, this.f44903f, this.f44907j, this.f44905h);
            if (i10 > 0) {
                for (long j24 = 0; j24 < this.f44901d; j24++) {
                    long j25 = j24 * j11;
                    long j26 = j25 + 1;
                    float fP = ((-bVar2.p(j25)) * this.f44917t.p(j26)) + (bVar2.p(j26) * this.f44917t.p(j25));
                    bVar2.r(j25, (bVar2.p(j25) * this.f44917t.p(j25)) + (bVar2.p(j26) * this.f44917t.p(j26)));
                    bVar2.r(j26, fP);
                }
            } else {
                for (long j27 = 0; j27 < this.f44901d; j27++) {
                    long j28 = j27 * j11;
                    long j29 = j28 + 1;
                    float fP2 = (bVar2.p(j28) * this.f44917t.p(j29)) + (bVar2.p(j29) * this.f44917t.p(j28));
                    bVar2.r(j28, (bVar2.p(j28) * this.f44917t.p(j28)) - (bVar2.p(j29) * this.f44917t.p(j29)));
                    bVar2.r(j29, fP2);
                }
            }
            mp.a.F(this.f44901d * j11, bVar2, 0L, this.f44903f, this.f44907j, this.f44905h);
            if (i10 > 0) {
                for (long j30 = 0; j30 < this.f44899b; j30++) {
                    long j31 = j30 * j11;
                    long j32 = j31 + 1;
                    bVar.r(j10 + j31, (this.f44915r.p(j31) * bVar2.p(j31)) - (this.f44915r.p(j32) * bVar2.p(j32)));
                    bVar.r(j10 + j32, (this.f44915r.p(j32) * bVar2.p(j31)) + (this.f44915r.p(j31) * bVar2.p(j32)));
                }
                return;
            }
            for (long j33 = 0; j33 < this.f44899b; j33++) {
                long j34 = j33 * j11;
                long j35 = j34 + 1;
                bVar.r(j10 + j34, (this.f44915r.p(j34) * bVar2.p(j34)) + (this.f44915r.p(j35) * bVar2.p(j35)));
                bVar.r(j10 + j35, ((-this.f44915r.p(j35)) * bVar2.p(j34)) + (this.f44915r.p(j34) * bVar2.p(j35)));
            }
            return;
        }
        int i11 = (iC < 4 || this.f44899b <= mp.a.c0()) ? 2 : 4;
        Future[] futureArr = new Future[i11];
        long j36 = i11;
        long j37 = this.f44899b / j36;
        int i12 = 0;
        while (i12 < i11) {
            long j38 = ((long) i12) * j37;
            int i13 = i12;
            vp.b bVar3 = bVar2;
            bVar2 = bVar3;
            futureArr[i13] = vp.a.d(new n(i10, j38, i12 == i11 + (-1) ? this.f44899b : j38 + j37, j10, bVar3, bVar));
            i12 = i13 + 1;
            j36 = j36;
        }
        a aVar = this;
        long j39 = j36;
        String str = null;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e10) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
        } catch (ExecutionException e11) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
        }
        mp.a.r(aVar.f44901d * 2, bVar2, 0L, aVar.f44903f, aVar.f44907j, aVar.f44905h);
        long j40 = aVar.f44901d / j39;
        int i14 = 0;
        while (i14 < i11) {
            long j41 = ((long) i14) * j40;
            vp.b bVar4 = bVar2;
            bVar2 = bVar4;
            futureArr[i14] = vp.a.d(aVar.new o(i10, j41, i14 == i11 + (-1) ? aVar.f44901d : j41 + j40, bVar4));
            i14++;
        }
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e12) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
        } catch (ExecutionException e13) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
        }
        mp.a.F(aVar.f44901d * 2, bVar2, 0L, aVar.f44903f, aVar.f44907j, aVar.f44905h);
        long j42 = aVar.f44899b / j39;
        int i15 = 0;
        while (i15 < i11) {
            long j43 = ((long) i15) * j42;
            long j44 = i15 == i11 + (-1) ? aVar.f44899b : j43 + j42;
            int i16 = i15;
            a aVar2 = aVar;
            Class<a> cls2 = cls;
            String str2 = str;
            vp.b bVar5 = bVar2;
            bVar2 = bVar5;
            aVar = aVar2;
            futureArr[i16] = vp.a.d(aVar2.new RunnableC0682a(i10, j43, j44, j10, bVar, bVar5));
            i15 = i16 + 1;
            str = str2;
            cls = cls2;
        }
        Class<a> cls3 = cls;
        String str3 = str;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e14) {
            Logger.getLogger(cls3.getName()).log(Level.SEVERE, str3, (Throwable) e14);
        } catch (ExecutionException e15) {
            Logger.getLogger(cls3.getName()).log(Level.SEVERE, str3, (Throwable) e15);
        }
    }

    private void f(float[] fArr, int i10, int i11) {
        float[] fArr2 = new float[this.f44900c * 2];
        int iC = vp.a.c();
        int i12 = 0;
        if (iC > 1 && this.f44898a >= mp.a.b0()) {
            int i13 = (iC < 4 || ((long) this.f44898a) < mp.a.c0()) ? 2 : 4;
            Future[] futureArr = new Future[i13];
            int i14 = this.f44898a / i13;
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 * i14;
                float[] fArr3 = fArr2;
                fArr2 = fArr3;
                futureArr[i15] = vp.a.d(new k(i11, i16, i15 == i13 + (-1) ? this.f44898a : i16 + i14, i10, fArr3, fArr));
                i15++;
            }
            try {
                vp.a.e(futureArr);
            } catch (InterruptedException e10) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
            } catch (ExecutionException e11) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
            }
            mp.a.q(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
            int i17 = this.f44900c / i13;
            int i18 = 0;
            while (i18 < i13) {
                int i19 = i18 * i17;
                float[] fArr4 = fArr2;
                fArr2 = fArr4;
                futureArr[i18] = vp.a.d(new l(i11, i19, i18 == i13 + (-1) ? this.f44900c : i19 + i17, fArr4));
                i18++;
            }
            try {
                vp.a.e(futureArr);
            } catch (InterruptedException e12) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
            } catch (ExecutionException e13) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
            }
            mp.a.E(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
            int i20 = this.f44898a / i13;
            while (i12 < i13) {
                int i21 = i12 * i20;
                float[] fArr5 = fArr2;
                fArr2 = fArr5;
                futureArr[i12] = vp.a.d(new m(i11, i21, i12 == i13 + (-1) ? this.f44898a : i21 + i20, i10, fArr, fArr5));
                i12++;
            }
            try {
                vp.a.e(futureArr);
                return;
            } catch (InterruptedException e14) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e14);
                return;
            } catch (ExecutionException e15) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e15);
                return;
            }
        }
        if (i11 > 0) {
            for (int i22 = 0; i22 < this.f44898a; i22++) {
                int i23 = i22 * 2;
                int i24 = i23 + 1;
                int i25 = i10 + i23;
                int i26 = i10 + i24;
                float f10 = fArr[i25];
                float[] fArr6 = this.f44914q;
                fArr2[i23] = (f10 * fArr6[i23]) - (fArr[i26] * fArr6[i24]);
                fArr2[i24] = (fArr[i25] * fArr6[i24]) + (fArr[i26] * fArr6[i23]);
            }
        } else {
            for (int i27 = 0; i27 < this.f44898a; i27++) {
                int i28 = i27 * 2;
                int i29 = i28 + 1;
                int i30 = i10 + i28;
                int i31 = i10 + i29;
                float f11 = fArr[i30];
                float[] fArr7 = this.f44914q;
                fArr2[i28] = (f11 * fArr7[i28]) + (fArr[i31] * fArr7[i29]);
                fArr2[i29] = ((-fArr[i30]) * fArr7[i29]) + (fArr[i31] * fArr7[i28]);
            }
        }
        mp.a.q(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
        if (i11 > 0) {
            for (int i32 = 0; i32 < this.f44900c; i32++) {
                int i33 = i32 * 2;
                int i34 = i33 + 1;
                float f12 = fArr2[i33];
                float[] fArr8 = this.f44916s;
                float f13 = fArr8[i34];
                float f14 = fArr2[i34];
                float f15 = fArr8[i33];
                fArr2[i33] = (f12 * f15) + (f14 * f13);
                fArr2[i34] = ((-f12) * f13) + (f14 * f15);
            }
        } else {
            for (int i35 = 0; i35 < this.f44900c; i35++) {
                int i36 = i35 * 2;
                int i37 = i36 + 1;
                float f16 = fArr2[i36];
                float[] fArr9 = this.f44916s;
                float f17 = fArr9[i37];
                float f18 = fArr2[i37];
                float f19 = fArr9[i36];
                fArr2[i36] = (f16 * f19) - (f18 * f17);
                fArr2[i37] = (f16 * f17) + (f18 * f19);
            }
        }
        mp.a.E(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
        if (i11 > 0) {
            while (i12 < this.f44898a) {
                int i38 = i12 * 2;
                int i39 = i38 + 1;
                float[] fArr10 = this.f44914q;
                fArr[i10 + i38] = (fArr10[i38] * fArr2[i38]) - (fArr10[i39] * fArr2[i39]);
                fArr[i10 + i39] = (fArr10[i39] * fArr2[i38]) + (fArr10[i38] * fArr2[i39]);
                i12++;
            }
            return;
        }
        while (i12 < this.f44898a) {
            int i40 = i12 * 2;
            int i41 = i40 + 1;
            float[] fArr11 = this.f44914q;
            fArr[i10 + i40] = (fArr11[i40] * fArr2[i40]) + (fArr11[i41] * fArr2[i41]);
            fArr[i10 + i41] = ((-fArr11[i41]) * fArr2[i40]) + (fArr11[i40] * fArr2[i41]);
            i12++;
        }
    }

    private void g(vp.b bVar, long j10) {
        long j11;
        a aVar;
        long j12;
        long j13;
        long j14;
        vp.b bVar2;
        long j15 = 2;
        vp.b bVar3 = new vp.b(this.f44901d * 2);
        int iC = vp.a.c();
        if (iC <= 1 || this.f44899b <= mp.a.b0()) {
            j11 = j10;
            aVar = this;
            j12 = 2;
            j13 = 0;
            j14 = 1;
            bVar2 = bVar;
            for (long j16 = 0; j16 < aVar.f44899b; j16++) {
                long j17 = j16 * 2;
                long j18 = j17 + 1;
                long j19 = j11 + j16;
                bVar3.r(j17, bVar2.p(j19) * aVar.f44915r.p(j17));
                bVar3.r(j18, (-bVar2.p(j19)) * aVar.f44915r.p(j18));
            }
            mp.a.r(aVar.f44901d * 2, bVar3, 0L, aVar.f44903f, aVar.f44907j, aVar.f44905h);
            for (long j20 = 0; j20 < aVar.f44901d; j20++) {
                long j21 = j20 * 2;
                long j22 = j21 + 1;
                float fP = (bVar3.p(j21) * aVar.f44917t.p(j22)) + (bVar3.p(j22) * aVar.f44917t.p(j21));
                bVar3.r(j21, (bVar3.p(j21) * aVar.f44917t.p(j21)) - (bVar3.p(j22) * aVar.f44917t.p(j22)));
                bVar3.r(j22, fP);
            }
        } else {
            int i10 = (iC < 4 || this.f44899b <= mp.a.c0()) ? 2 : 4;
            Future[] futureArr = new Future[i10];
            long j23 = i10;
            long j24 = this.f44899b / j23;
            int i11 = 0;
            while (i11 < i10) {
                long j25 = ((long) i11) * j24;
                int i12 = i11;
                Future[] futureArr2 = futureArr;
                long j26 = j23;
                vp.b bVar4 = bVar3;
                bVar3 = bVar4;
                futureArr2[i12] = vp.a.d(new d(j25, i11 == i10 + (-1) ? this.f44899b : j25 + j24, j10, bVar4, bVar));
                i11 = i12 + 1;
                futureArr = futureArr2;
                j23 = j26;
                j15 = j15;
            }
            Future[] futureArr3 = futureArr;
            long j27 = j23;
            j12 = j15;
            aVar = this;
            try {
                vp.a.e(futureArr3);
            } catch (InterruptedException e10) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
            } catch (ExecutionException e11) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
            }
            j11 = j10;
            j14 = 1;
            j13 = 0;
            bVar2 = bVar;
            mp.a.r(aVar.f44901d * j12, bVar3, 0L, aVar.f44903f, aVar.f44907j, aVar.f44905h);
            long j28 = aVar.f44901d / j27;
            int i13 = 0;
            while (i13 < i10) {
                long j29 = ((long) i13) * j28;
                int i14 = i13;
                vp.b bVar5 = bVar3;
                bVar3 = bVar5;
                futureArr3[i14] = vp.a.d(aVar.new e(j29, i13 == i10 + (-1) ? aVar.f44901d : j29 + j28, bVar5));
                i13 = i14 + 1;
            }
            try {
                vp.a.e(futureArr3);
            } catch (InterruptedException e12) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
            } catch (ExecutionException e13) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
            }
        }
        mp.a.F(aVar.f44901d * j12, bVar3, 0L, aVar.f44903f, aVar.f44907j, aVar.f44905h);
        if (aVar.f44899b % j12 == j13) {
            long j30 = j13;
            float fP2 = aVar.f44915r.p(j30) * bVar3.p(j30);
            long j31 = j14;
            bVar2.r(j11, fP2 + (aVar.f44915r.p(j31) * bVar3.p(j31)));
            bVar2.r(j11 + j31, (aVar.f44915r.p(aVar.f44899b) * bVar3.p(aVar.f44899b)) + (aVar.f44915r.p(aVar.f44899b + j31) * bVar3.p(aVar.f44899b + j31)));
            for (long j32 = j31; j32 < aVar.f44899b / j12; j32++) {
                long j33 = j32 * j12;
                long j34 = j33 + j31;
                bVar2.r(j11 + j33, (aVar.f44915r.p(j33) * bVar3.p(j33)) + (aVar.f44915r.p(j34) * bVar3.p(j34)));
                bVar2.r(j11 + j34, ((-aVar.f44915r.p(j34)) * bVar3.p(j33)) + (aVar.f44915r.p(j33) * bVar3.p(j34)));
                j31 = 1;
            }
            return;
        }
        long j35 = j14;
        bVar2.r(j11, (aVar.f44915r.p(0L) * bVar3.p(0L)) + (aVar.f44915r.p(j35) * bVar3.p(j35)));
        bVar2.r(j11 + j35, ((-aVar.f44915r.p(aVar.f44899b)) * bVar3.p(aVar.f44899b - j35)) + (aVar.f44915r.p(aVar.f44899b - j35) * bVar3.p(aVar.f44899b)));
        long j36 = j35;
        while (true) {
            long j37 = aVar.f44899b;
            if (j36 >= (j37 - j35) / j12) {
                long j38 = j35;
                bVar2.r((j11 + j37) - j38, (aVar.f44915r.p(j37 - j38) * bVar3.p(aVar.f44899b - j38)) + (aVar.f44915r.p(aVar.f44899b) * bVar3.p(aVar.f44899b)));
                return;
            }
            long j39 = j36 * j12;
            long j40 = j39 + j35;
            bVar2.r(j11 + j39, (aVar.f44915r.p(j39) * bVar3.p(j39)) + (aVar.f44915r.p(j40) * bVar3.p(j40)));
            bVar2.r(j11 + j40, ((-aVar.f44915r.p(j40)) * bVar3.p(j39)) + (aVar.f44915r.p(j39) * bVar3.p(j40)));
            j36++;
            j35 = 1;
        }
    }

    private void h(float[] fArr, int i10) {
        a aVar;
        float[] fArr2 = new float[this.f44900c * 2];
        int iC = vp.a.c();
        if (iC <= 1 || this.f44898a < mp.a.b0()) {
            aVar = this;
            for (int i11 = 0; i11 < aVar.f44898a; i11++) {
                int i12 = i11 * 2;
                int i13 = i12 + 1;
                int i14 = i10 + i11;
                float f10 = fArr[i14];
                float[] fArr3 = aVar.f44914q;
                fArr2[i12] = f10 * fArr3[i12];
                fArr2[i13] = (-fArr[i14]) * fArr3[i13];
            }
            mp.a.q(aVar.f44900c * 2, fArr2, 0, aVar.f44902e, aVar.f44906i, aVar.f44904g);
            for (int i15 = 0; i15 < aVar.f44900c; i15++) {
                int i16 = i15 * 2;
                int i17 = i16 + 1;
                float f11 = fArr2[i16];
                float[] fArr4 = aVar.f44916s;
                float f12 = fArr4[i17];
                float f13 = fArr2[i17];
                float f14 = fArr4[i16];
                fArr2[i16] = (f11 * f14) - (f13 * f12);
                fArr2[i17] = (f11 * f12) + (f13 * f14);
            }
        } else {
            int i18 = (iC < 4 || ((long) this.f44898a) < mp.a.c0()) ? 2 : 4;
            Future[] futureArr = new Future[i18];
            int i19 = this.f44898a / i18;
            int i20 = 0;
            while (i20 < i18) {
                float[] fArr5 = fArr2;
                int i21 = i20 * i19;
                b bVar = new b(i21, i20 == i18 + (-1) ? this.f44898a : i21 + i19, i10, fArr5, fArr);
                fArr2 = fArr5;
                futureArr[i20] = vp.a.d(bVar);
                i20++;
            }
            aVar = this;
            try {
                vp.a.e(futureArr);
            } catch (InterruptedException e10) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
            } catch (ExecutionException e11) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
            }
            mp.a.q(aVar.f44900c * 2, fArr2, 0, aVar.f44902e, aVar.f44906i, aVar.f44904g);
            int i22 = aVar.f44900c / i18;
            int i23 = 0;
            while (i23 < i18) {
                int i24 = i23 * i22;
                futureArr[i23] = vp.a.d(aVar.new c(i24, i23 == i18 + (-1) ? aVar.f44900c : i24 + i22, fArr2));
                i23++;
            }
            try {
                vp.a.e(futureArr);
            } catch (InterruptedException e12) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
            } catch (ExecutionException e13) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
            }
        }
        mp.a.E(aVar.f44900c * 2, fArr2, 0, aVar.f44902e, aVar.f44906i, aVar.f44904g);
        int i25 = aVar.f44898a;
        if (i25 % 2 == 0) {
            float[] fArr6 = aVar.f44914q;
            fArr[i10] = (fArr6[0] * fArr2[0]) + (fArr6[1] * fArr2[1]);
            fArr[i10 + 1] = (fArr6[i25] * fArr2[i25]) + (fArr6[i25 + 1] * fArr2[i25 + 1]);
            for (int i26 = 1; i26 < aVar.f44898a / 2; i26++) {
                int i27 = i26 * 2;
                int i28 = i27 + 1;
                float[] fArr7 = aVar.f44914q;
                fArr[i10 + i27] = (fArr7[i27] * fArr2[i27]) + (fArr7[i28] * fArr2[i28]);
                fArr[i10 + i28] = ((-fArr7[i28]) * fArr2[i27]) + (fArr7[i27] * fArr2[i28]);
            }
            return;
        }
        float[] fArr8 = aVar.f44914q;
        fArr[i10] = (fArr8[0] * fArr2[0]) + (fArr8[1] * fArr2[1]);
        fArr[i10 + 1] = ((-fArr8[i25]) * fArr2[i25 - 1]) + (fArr8[i25 - 1] * fArr2[i25]);
        int i29 = 1;
        while (true) {
            int i30 = aVar.f44898a;
            if (i29 >= (i30 - 1) / 2) {
                float[] fArr9 = aVar.f44914q;
                fArr[(i10 + i30) - 1] = (fArr9[i30 - 1] * fArr2[i30 - 1]) + (fArr9[i30] * fArr2[i30]);
                return;
            }
            int i31 = i29 * 2;
            int i32 = i31 + 1;
            float[] fArr10 = aVar.f44914q;
            fArr[i10 + i31] = (fArr10[i31] * fArr2[i31]) + (fArr10[i32] * fArr2[i32]);
            fArr[i10 + i32] = ((-fArr10[i32]) * fArr2[i31]) + (fArr10[i31] * fArr2[i32]);
            i29++;
        }
    }

    private void i(vp.b bVar, long j10) {
        long j11;
        long j12;
        long j13;
        vp.b bVar2 = bVar;
        Class<a> cls = a.class;
        vp.b bVar3 = new vp.b(this.f44901d * 2);
        long j14 = 1;
        if (this.f44899b % 2 != 0) {
            bVar3.r(0L, bVar.p(j10) * this.f44915r.p(0L));
            long j15 = 1;
            bVar3.r(1L, bVar.p(j10) * this.f44915r.p(1L));
            long j16 = 1;
            while (true) {
                j11 = this.f44899b;
                if (j16 >= (j11 - j15) / 2) {
                    break;
                }
                long j17 = j16 * 2;
                long j18 = j17 + j15;
                long j19 = j10 + j17;
                long j20 = j10 + j18;
                bVar3.r(j17, (bVar2.p(j19) * this.f44915r.p(j17)) - (bVar2.p(j20) * this.f44915r.p(j18)));
                bVar3.r(j18, (bVar2.p(j19) * this.f44915r.p(j18)) + (bVar2.p(j20) * this.f44915r.p(j17)));
                j16++;
                j15 = 1;
            }
            long j21 = j15;
            long j22 = j10 + j21;
            bVar3.r(j11 - j21, (bVar2.p((j10 + j11) - j21) * this.f44915r.p(this.f44899b - j21)) - (bVar2.p(j22) * this.f44915r.p(this.f44899b)));
            long j23 = this.f44899b;
            bVar3.r(j23, (bVar2.p((j10 + j23) - j21) * this.f44915r.p(this.f44899b)) + (bVar2.p(j22) * this.f44915r.p(this.f44899b - j21)));
            long j24 = this.f44899b;
            bVar3.r(j24 + j21, (bVar2.p((j10 + j24) - j21) * this.f44915r.p(this.f44899b + j21)) + (bVar2.p(j22) * this.f44915r.p(this.f44899b + 2)));
            long j25 = this.f44899b;
            long j26 = 1;
            bVar3.r(j25 + 2, (bVar2.p((j10 + j25) - 1) * this.f44915r.p(this.f44899b + 2)) - (bVar2.p(j22) * this.f44915r.p(this.f44899b + 1)));
            long j27 = ((this.f44899b - 1) / 2) + 2;
            while (true) {
                long j28 = this.f44899b;
                if (j27 >= j28) {
                    break;
                }
                long j29 = j27 * 2;
                long j30 = j29 + j26;
                long j31 = (j10 + (j28 * 2)) - j29;
                long j32 = j31 + j26;
                bVar3.r(j29, (bVar2.p(j31) * this.f44915r.p(j29)) + (bVar2.p(j32) * this.f44915r.p(j30)));
                bVar3.r(j30, (bVar2.p(j31) * this.f44915r.p(j30)) - (bVar2.p(j32) * this.f44915r.p(j29)));
                j27++;
                j26 = 1;
            }
        } else {
            bVar3.r(0L, bVar.p(j10) * this.f44915r.p(0L));
            bVar3.r(1L, bVar.p(j10) * this.f44915r.p(1L));
            long j33 = 1;
            while (true) {
                j13 = this.f44899b;
                if (j33 >= j13 / 2) {
                    break;
                }
                long j34 = j33 * 2;
                long j35 = j34 + j14;
                long j36 = j14;
                long j37 = j10 + j34;
                long j38 = j10 + j35;
                bVar3.r(j34, (bVar2.p(j37) * this.f44915r.p(j34)) - (bVar2.p(j38) * this.f44915r.p(j35)));
                bVar3.r(j35, (bVar2.p(j37) * this.f44915r.p(j35)) + (bVar2.p(j38) * this.f44915r.p(j34)));
                j33 += j36;
                j14 = j36;
            }
            long j39 = j14;
            long j40 = j10 + j39;
            bVar3.r(j13, bVar2.p(j40) * this.f44915r.p(this.f44899b));
            bVar3.r(this.f44899b + j39, bVar2.p(j40) * this.f44915r.p(this.f44899b + j39));
            long j41 = this.f44899b / 2;
            while (true) {
                j41 += j39;
                long j42 = this.f44899b;
                if (j41 >= j42) {
                    break;
                }
                long j43 = j41 * 2;
                long j44 = j43 + j39;
                long j45 = (j10 + (j42 * 2)) - j43;
                long j46 = j45 + j39;
                bVar3.r(j43, (bVar2.p(j45) * this.f44915r.p(j43)) + (bVar2.p(j46) * this.f44915r.p(j44)));
                bVar3.r(j44, (bVar2.p(j45) * this.f44915r.p(j44)) - (bVar2.p(j46) * this.f44915r.p(j43)));
            }
        }
        mp.a.r(this.f44901d * 2, bVar3, 0L, this.f44903f, this.f44907j, this.f44905h);
        int iC = vp.a.c();
        if (iC <= 1 || this.f44899b <= mp.a.b0()) {
            long j47 = 0;
            while (true) {
                j12 = this.f44901d;
                if (j47 >= j12) {
                    break;
                }
                long j48 = j47 * 2;
                long j49 = j48 + 1;
                float fP = ((-bVar3.p(j48)) * this.f44917t.p(j49)) + (bVar3.p(j49) * this.f44917t.p(j48));
                bVar3.r(j48, (bVar3.p(j48) * this.f44917t.p(j48)) + (bVar3.p(j49) * this.f44917t.p(j49)));
                bVar3.r(j49, fP);
                j47++;
            }
            mp.a.F(j12 * 2, bVar3, 0L, this.f44903f, this.f44907j, this.f44905h);
            for (long j50 = 0; j50 < this.f44899b; j50++) {
                long j51 = j50 * 2;
                long j52 = j51 + 1;
                bVar.r(j10 + j50, (this.f44915r.p(j51) * bVar3.p(j51)) - (this.f44915r.p(j52) * bVar3.p(j52)));
            }
            return;
        }
        int i10 = (iC < 4 || this.f44899b <= mp.a.c0()) ? 2 : 4;
        Future[] futureArr = new Future[i10];
        long j53 = i10;
        long j54 = this.f44901d / j53;
        int i11 = 0;
        while (i11 < i10) {
            long j55 = ((long) i11) * j54;
            int i12 = i11;
            vp.b bVar4 = bVar3;
            futureArr[i12] = vp.a.d(new h(j55, i11 == i10 + (-1) ? this.f44901d : j55 + j54, bVar4));
            i11 = i12 + 1;
            bVar3 = bVar4;
        }
        vp.b bVar5 = bVar3;
        String str = null;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e10) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
        } catch (ExecutionException e11) {
            Logger.getLogger(cls.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
        }
        vp.b bVar6 = bVar5;
        mp.a.F(this.f44901d * 2, bVar6, 0L, this.f44903f, this.f44907j, this.f44905h);
        long j56 = this.f44899b / j53;
        int i13 = 0;
        while (i13 < i10) {
            long j57 = ((long) i13) * j56;
            Future[] futureArr2 = futureArr;
            vp.b bVar7 = bVar6;
            futureArr2[i13] = vp.a.d(new i(j57, i13 == i10 + (-1) ? this.f44899b : j57 + j56, bVar2, j10, bVar7));
            i13++;
            bVar2 = bVar;
            str = null;
            i10 = i10;
            futureArr = futureArr2;
            cls = cls;
            bVar6 = bVar7;
        }
        Class<a> cls2 = cls;
        String str2 = str;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e12) {
            Logger.getLogger(cls2.getName()).log(Level.SEVERE, str2, (Throwable) e12);
        } catch (ExecutionException e13) {
            Logger.getLogger(cls2.getName()).log(Level.SEVERE, str2, (Throwable) e13);
        }
    }

    private void j(float[] fArr, int i10) {
        int i11;
        int i12;
        int i13;
        float[] fArr2 = new float[this.f44900c * 2];
        if (this.f44898a % 2 != 0) {
            float f10 = fArr[i10];
            float[] fArr3 = this.f44914q;
            fArr2[0] = f10 * fArr3[0];
            fArr2[1] = fArr[i10] * fArr3[1];
            int i14 = 1;
            while (true) {
                i11 = this.f44898a;
                if (i14 >= (i11 - 1) / 2) {
                    break;
                }
                int i15 = i14 * 2;
                int i16 = i15 + 1;
                int i17 = i10 + i15;
                int i18 = i10 + i16;
                float f11 = fArr[i17];
                float[] fArr4 = this.f44914q;
                fArr2[i15] = (f11 * fArr4[i15]) - (fArr[i18] * fArr4[i16]);
                fArr2[i16] = (fArr[i17] * fArr4[i16]) + (fArr[i18] * fArr4[i15]);
                i14++;
            }
            float f12 = fArr[(i10 + i11) - 1];
            float[] fArr5 = this.f44914q;
            int i19 = i10 + 1;
            fArr2[i11 - 1] = (f12 * fArr5[i11 - 1]) - (fArr[i19] * fArr5[i11]);
            fArr2[i11] = (fArr[(i10 + i11) - 1] * fArr5[i11]) + (fArr[i19] * fArr5[i11 - 1]);
            fArr2[i11 + 1] = (fArr[(i10 + i11) - 1] * fArr5[i11 + 1]) + (fArr[i19] * fArr5[i11 + 2]);
            fArr2[i11 + 2] = (fArr[(i10 + i11) - 1] * fArr5[i11 + 2]) - (fArr[i19] * fArr5[i11 + 1]);
            int i20 = ((i11 - 1) / 2) + 2;
            while (true) {
                int i21 = this.f44898a;
                if (i20 >= i21) {
                    break;
                }
                int i22 = i20 * 2;
                int i23 = i22 + 1;
                int i24 = (i10 + (i21 * 2)) - i22;
                int i25 = i24 + 1;
                float f13 = fArr[i24];
                float[] fArr6 = this.f44914q;
                fArr2[i22] = (f13 * fArr6[i22]) + (fArr[i25] * fArr6[i23]);
                fArr2[i23] = (fArr[i24] * fArr6[i23]) - (fArr[i25] * fArr6[i22]);
                i20++;
            }
        } else {
            float f14 = fArr[i10];
            float[] fArr7 = this.f44914q;
            fArr2[0] = f14 * fArr7[0];
            fArr2[1] = fArr[i10] * fArr7[1];
            int i26 = 1;
            while (true) {
                i13 = this.f44898a;
                if (i26 >= i13 / 2) {
                    break;
                }
                int i27 = i26 * 2;
                int i28 = i27 + 1;
                int i29 = i10 + i27;
                int i30 = i10 + i28;
                float f15 = fArr[i29];
                float[] fArr8 = this.f44914q;
                fArr2[i27] = (f15 * fArr8[i27]) - (fArr[i30] * fArr8[i28]);
                fArr2[i28] = (fArr[i29] * fArr8[i28]) + (fArr[i30] * fArr8[i27]);
                i26++;
            }
            int i31 = i10 + 1;
            float f16 = fArr[i31];
            float[] fArr9 = this.f44914q;
            fArr2[i13] = f16 * fArr9[i13];
            fArr2[i13 + 1] = fArr[i31] * fArr9[i13 + 1];
            int i32 = (i13 / 2) + 1;
            while (true) {
                int i33 = this.f44898a;
                if (i32 >= i33) {
                    break;
                }
                int i34 = i32 * 2;
                int i35 = i34 + 1;
                int i36 = (i10 + (i33 * 2)) - i34;
                int i37 = i36 + 1;
                float f17 = fArr[i36];
                float[] fArr10 = this.f44914q;
                fArr2[i34] = (f17 * fArr10[i34]) + (fArr[i37] * fArr10[i35]);
                fArr2[i35] = (fArr[i36] * fArr10[i35]) - (fArr[i37] * fArr10[i34]);
                i32++;
            }
        }
        mp.a.q(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
        int iC = vp.a.c();
        if (iC <= 1 || this.f44898a < mp.a.b0()) {
            int i38 = 0;
            while (true) {
                i12 = this.f44900c;
                if (i38 >= i12) {
                    break;
                }
                int i39 = i38 * 2;
                int i40 = i39 + 1;
                float f18 = fArr2[i39];
                float[] fArr11 = this.f44916s;
                float f19 = fArr11[i40];
                float f20 = fArr2[i40];
                float f21 = fArr11[i39];
                fArr2[i39] = (f18 * f21) + (f20 * f19);
                fArr2[i40] = ((-f18) * f19) + (f20 * f21);
                i38++;
            }
            mp.a.E(i12 * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
            for (int i41 = 0; i41 < this.f44898a; i41++) {
                int i42 = i41 * 2;
                int i43 = i42 + 1;
                float[] fArr12 = this.f44914q;
                fArr[i10 + i41] = (fArr12[i42] * fArr2[i42]) - (fArr12[i43] * fArr2[i43]);
            }
            return;
        }
        int i44 = (iC < 4 || ((long) this.f44898a) < mp.a.c0()) ? 2 : 4;
        Future[] futureArr = new Future[i44];
        int i45 = this.f44900c / i44;
        int i46 = 0;
        while (i46 < i44) {
            int i47 = i46 * i45;
            futureArr[i46] = vp.a.d(new f(i47, i46 == i44 + (-1) ? this.f44900c : i47 + i45, fArr2));
            i46++;
        }
        String str = null;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e10) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
        } catch (ExecutionException e11) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
        }
        mp.a.E(this.f44900c * 2, fArr2, 0, this.f44902e, this.f44906i, this.f44904g);
        int i48 = this.f44898a / i44;
        int i49 = 0;
        while (i49 < i44) {
            int i50 = i49 * i48;
            float[] fArr13 = fArr2;
            futureArr[i49] = vp.a.d(new g(i50, i49 == i44 + (-1) ? this.f44898a : i50 + i48, fArr, i10, fArr13));
            i49++;
            str = str;
            fArr2 = fArr13;
        }
        String str2 = str;
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e12) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, str2, (Throwable) e12);
        } catch (ExecutionException e13) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, str2, (Throwable) e13);
        }
    }

    private void k() {
        float f10 = 3.1415927f / this.f44898a;
        float[] fArr = this.f44914q;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            int i12 = this.f44898a;
            if (i11 >= i12) {
                break;
            }
            int i13 = i11 * 2;
            i10 += i13 - 1;
            if (i10 >= i12 * 2) {
                i10 -= i12 * 2;
            }
            double d10 = i10 * f10;
            this.f44914q[i13] = (float) bo.a.b(d10);
            this.f44914q[i13 + 1] = (float) bo.a.l(d10);
            i11++;
        }
        float f11 = 1.0f / this.f44900c;
        float[] fArr2 = this.f44916s;
        float[] fArr3 = this.f44914q;
        fArr2[0] = fArr3[0] * f11;
        fArr2[1] = fArr3[1] * f11;
        for (int i14 = 2; i14 < this.f44898a * 2; i14 += 2) {
            float[] fArr4 = this.f44916s;
            float[] fArr5 = this.f44914q;
            fArr4[i14] = fArr5[i14] * f11;
            int i15 = i14 + 1;
            fArr4[i15] = fArr5[i15] * f11;
            int i16 = this.f44900c;
            fArr4[(i16 * 2) - i14] = fArr4[i14];
            fArr4[((i16 * 2) - i14) + 1] = fArr4[i15];
        }
        mp.a.q(this.f44900c * 2, this.f44916s, 0, this.f44902e, this.f44906i, this.f44904g);
    }

    private void l() {
        float f10 = 3.1415927f / this.f44899b;
        float f11 = 1.0f;
        this.f44915r.r(0L, 1.0f);
        this.f44915r.r(1L, 0.0f);
        int i10 = 1;
        long j10 = 0;
        while (true) {
            long j11 = i10;
            long j12 = this.f44899b;
            if (j11 >= j12) {
                break;
            }
            int i11 = i10 * 2;
            j10 += (long) (i11 - 1);
            if (j10 >= j12 * 2) {
                j10 -= j12 * 2;
            }
            float f12 = f11;
            double d10 = j10 * f10;
            this.f44915r.r(i11, (float) bo.a.b(d10));
            this.f44915r.r(i11 + 1, (float) bo.a.l(d10));
            i10++;
            f11 = f12;
        }
        float f13 = f11 / this.f44901d;
        this.f44917t.r(0L, this.f44915r.p(0L) * f13);
        this.f44917t.r(1L, this.f44915r.p(1L) * f13);
        int i12 = 2;
        while (true) {
            long j13 = i12;
            if (j13 >= this.f44899b * 2) {
                mp.a.r(this.f44901d * 2, this.f44917t, 0L, this.f44903f, this.f44907j, this.f44905h);
                return;
            }
            this.f44917t.r(j13, this.f44915r.p(j13) * f13);
            long j14 = i12 + 1;
            this.f44917t.r(j14, this.f44915r.p(j14) * f13);
            vp.b bVar = this.f44917t;
            bVar.r((this.f44901d * 2) - j13, bVar.p(j13));
            vp.b bVar2 = this.f44917t;
            bVar2.r(((this.f44901d * 2) - j13) + 1, bVar2.p(j14));
            i12 += 2;
        }
    }

    void A(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14, int i15) {
        int i16 = i10;
        int i17 = i11;
        int i18 = i14 + i16;
        int i19 = i18 + i16;
        int i20 = i17 * i16;
        if (i16 == 2) {
            for (int i21 = 0; i21 < i17; i21++) {
                int i22 = i21 * i16;
                int i23 = i12 + (i22 * 4);
                int i24 = i23 + 1;
                int i25 = i24 + i16;
                int i26 = i25 + i16;
                int i27 = i26 + i16;
                float f10 = fArr[i23];
                float f11 = fArr[i24];
                float f12 = fArr[i25 - 1];
                float f13 = fArr[i25];
                float f14 = fArr[i26 - 1];
                float f15 = fArr[i26];
                float f16 = fArr[i27 - 1];
                float f17 = fArr[i27];
                float f18 = f11 - f15;
                float f19 = f11 + f15;
                float f20 = f17 - f13;
                float f21 = f13 + f17;
                float f22 = f10 - f14;
                float f23 = f10 + f14;
                float f24 = f12 - f16;
                float f25 = f12 + f16;
                int i28 = i13 + i22;
                int i29 = i28 + i20;
                int i30 = i29 + i20;
                int i31 = i30 + i20;
                fArr2[i28] = f23 + f25;
                fArr2[i28 + 1] = f19 + f21;
                float f26 = i15;
                float f27 = f20 * f26;
                fArr2[i29] = f22 + f27;
                float f28 = f26 * f24;
                fArr2[i29 + 1] = f18 + f28;
                fArr2[i30] = f23 - f25;
                fArr2[i30 + 1] = f19 - f21;
                fArr2[i31] = f22 - f27;
                fArr2[i31 + 1] = f18 - f28;
            }
        } else {
            int i32 = 0;
            while (i32 < i17) {
                int i33 = i32 * i16;
                int i34 = i12 + 1 + (i33 * 4);
                int i35 = 0;
                while (i35 < i16 - 1) {
                    int i36 = i35 + i34;
                    int i37 = i36 + i16;
                    int i38 = i37 + i16;
                    int i39 = i38 + i16;
                    float f29 = fArr[i36 - 1];
                    float f30 = fArr[i36];
                    float f31 = fArr[i37 - 1];
                    float f32 = fArr[i37];
                    float f33 = fArr[i38 - 1];
                    float f34 = fArr[i38];
                    float f35 = fArr[i39 - 1];
                    float f36 = fArr[i39];
                    float f37 = f30 - f34;
                    float f38 = f30 + f34;
                    float f39 = f32 + f36;
                    float f40 = f36 - f32;
                    float f41 = f29 - f33;
                    float f42 = f29 + f33;
                    float f43 = f31 - f35;
                    float f44 = f31 + f35;
                    float f45 = f42 - f44;
                    float f46 = f38 - f39;
                    float f47 = i15;
                    float f48 = f40 * f47;
                    float f49 = f41 + f48;
                    float f50 = f41 - f48;
                    float f51 = f43 * f47;
                    float f52 = f37 + f51;
                    float f53 = f37 - f51;
                    int i40 = i35 + i14;
                    int i41 = i35 + i18;
                    int i42 = i35 + i19;
                    float[] fArr3 = this.f44910m;
                    float f54 = fArr3[i40];
                    float f55 = fArr3[i40 + 1] * f47;
                    float f56 = fArr3[i41];
                    float f57 = fArr3[i41 + 1] * f47;
                    float f58 = fArr3[i42];
                    float f59 = f47 * fArr3[i42 + 1];
                    int i43 = i13 + i35 + i33;
                    int i44 = i43 + i20;
                    int i45 = i44 + i20;
                    int i46 = i45 + i20;
                    fArr2[i43] = f42 + f44;
                    fArr2[i43 + 1] = f38 + f39;
                    fArr2[i44] = (f54 * f49) - (f55 * f52);
                    fArr2[i44 + 1] = (f54 * f52) + (f55 * f49);
                    fArr2[i45] = (f56 * f45) - (f57 * f46);
                    fArr2[i45 + 1] = (f56 * f46) + (f57 * f45);
                    fArr2[i46] = (f58 * f50) - (f59 * f53);
                    fArr2[i46 + 1] = (f58 * f53) + (f59 * f50);
                    i35 += 2;
                    i16 = i10;
                }
                i32++;
                i16 = i10;
                i17 = i11;
            }
        }
    }

    void B(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14, int i10) {
        vp.b bVar3 = bVar;
        int i11 = i10;
        long j15 = j14 + j10;
        long j16 = j15 + j10;
        long j17 = j11 * j10;
        long j18 = 2;
        long j19 = 4;
        if (j10 == 2) {
            long j20 = 0;
            while (j20 < j11) {
                long j21 = j20 * j10;
                long j22 = j12 + (j21 * j19);
                long j23 = j22 + 1;
                long j24 = j19;
                long j25 = j23 + j10;
                long j26 = j25 + j10;
                long j27 = j17;
                long j28 = j26 + j10;
                float fP = bVar3.p(j22);
                float fP2 = bVar3.p(j23);
                float fP3 = bVar3.p(j25 - 1);
                float fP4 = bVar3.p(j25);
                float fP5 = bVar3.p(j26 - 1);
                float fP6 = bVar3.p(j26);
                float fP7 = bVar3.p(j28 - 1);
                float fP8 = bVar3.p(j28);
                float f10 = fP2 - fP6;
                float f11 = fP2 + fP6;
                float f12 = fP8 - fP4;
                float f13 = fP4 + fP8;
                float f14 = fP - fP5;
                float f15 = fP + fP5;
                float f16 = fP3 - fP7;
                float f17 = fP3 + fP7;
                long j29 = j13 + j21;
                long j30 = j29 + j27;
                long j31 = j30 + j27;
                long j32 = j31 + j27;
                bVar2.r(j29, f15 + f17);
                bVar2.r(j29 + 1, f11 + f13);
                float f18 = i11;
                float f19 = f18 * f12;
                bVar2.r(j30, f14 + f19);
                float f20 = f18 * f16;
                bVar2.r(j30 + 1, f10 + f20);
                bVar2.r(j31, f15 - f17);
                bVar2.r(j31 + 1, f11 - f13);
                bVar2.r(j32, f14 - f19);
                bVar2.r(j32 + 1, f10 - f20);
                j20++;
                j19 = j24;
                j17 = j27;
            }
            return;
        }
        long j33 = 0;
        while (j33 < j11) {
            long j34 = j33 * j10;
            long j35 = j12 + 1 + (j34 * 4);
            long j36 = 0;
            while (j36 < j10 - 1) {
                long j37 = j18;
                long j38 = j36 + j35;
                long j39 = j15;
                long j40 = j38 + j10;
                long j41 = j16;
                long j42 = j40 + j10;
                long j43 = j33;
                long j44 = j42 + j10;
                long j45 = j34;
                float fP9 = bVar3.p(j38 - 1);
                float fP10 = bVar3.p(j38);
                float fP11 = bVar3.p(j40 - 1);
                float fP12 = bVar3.p(j40);
                float fP13 = bVar3.p(j42 - 1);
                float fP14 = bVar3.p(j42);
                float fP15 = bVar3.p(j44 - 1);
                float fP16 = bVar3.p(j44);
                float f21 = fP10 - fP14;
                float f22 = fP10 + fP14;
                float f23 = fP12 + fP16;
                float f24 = fP16 - fP12;
                float f25 = fP9 - fP13;
                float f26 = fP9 + fP13;
                float f27 = fP11 - fP15;
                float f28 = fP11 + fP15;
                float f29 = f26 - f28;
                float f30 = f22 - f23;
                float f31 = i11;
                float f32 = f24 * f31;
                float f33 = f25 + f32;
                float f34 = f25 - f32;
                float f35 = f27 * f31;
                float f36 = f21 + f35;
                float f37 = f21 - f35;
                long j46 = j36 + j14;
                long j47 = j36 + j39;
                long j48 = j36 + j41;
                float fP17 = this.f44911n.p(j46);
                float fP18 = this.f44911n.p(j46 + 1) * f31;
                float fP19 = this.f44911n.p(j47);
                float fP20 = this.f44911n.p(j47 + 1) * f31;
                float fP21 = this.f44911n.p(j48);
                float fP22 = f31 * this.f44911n.p(j48 + 1);
                long j49 = j13 + j36 + j45;
                long j50 = j49 + j17;
                long j51 = j50 + j17;
                long j52 = j51 + j17;
                bVar2.r(j49, f26 + f28);
                bVar2.r(j49 + 1, f22 + f23);
                bVar2.r(j50, (fP17 * f33) - (fP18 * f36));
                bVar2.r(j50 + 1, (fP17 * f36) + (fP18 * f33));
                bVar2.r(j51, (fP19 * f29) - (fP20 * f30));
                bVar2.r(j51 + 1, (fP19 * f30) + (fP20 * f29));
                bVar2.r(j52, (fP21 * f34) - (fP22 * f37));
                bVar2.r(j52 + 1, (fP21 * f37) + (fP22 * f34));
                j36 += j37;
                this = this;
                bVar3 = bVar;
                i11 = i10;
                j18 = j37;
                j15 = j39;
                j16 = j41;
                j33 = j43;
                j34 = j45;
            }
            j33++;
            bVar3 = bVar;
            i11 = i10;
        }
    }

    void C(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14, int i15) {
        int i16 = i14 + i10;
        int i17 = i16 + i10;
        int i18 = i17 + i10;
        int i19 = i11 * i10;
        float f10 = 0.95105654f;
        float f11 = -0.809017f;
        float f12 = 0.309017f;
        if (i10 == 2) {
            for (int i20 = 1; i20 <= i11; i20++) {
                int i21 = i12 + (((i20 * 5) - 4) * i10);
                int i22 = i21 + 1;
                int i23 = i22 + i10;
                int i24 = i22 - i10;
                int i25 = i23 + i10;
                int i26 = i25 + i10;
                float f13 = fArr[i21];
                float f14 = fArr[i22];
                float f15 = fArr[i23 - 1];
                float f16 = fArr[i23];
                float f17 = fArr[i24 - 1];
                float f18 = fArr[i24];
                float f19 = fArr[i25 - 1];
                float f20 = fArr[i25];
                float f21 = fArr[i26 - 1];
                float f22 = fArr[i26];
                float f23 = f14 - f22;
                float f24 = f14 + f22;
                float f25 = f16 - f20;
                float f26 = f16 + f20;
                float f27 = f13 - f21;
                float f28 = f13 + f21;
                float f29 = f15 - f19;
                float f30 = f15 + f19;
                float f31 = f17 + (f28 * 0.309017f) + (f30 * (-0.809017f));
                float f32 = f18 + (f24 * 0.309017f) + (f26 * (-0.809017f));
                float f33 = f17 + (f28 * (-0.809017f)) + (f30 * 0.309017f);
                float f34 = f18 + (f24 * (-0.809017f)) + (f26 * 0.309017f);
                float f35 = i15;
                float f36 = ((f27 * 0.95105654f) + (f29 * 0.58778524f)) * f35;
                float f37 = ((f23 * 0.95105654f) + (f25 * 0.58778524f)) * f35;
                float f38 = ((f27 * 0.58778524f) - (f29 * 0.95105654f)) * f35;
                float f39 = f35 * ((f23 * 0.58778524f) - (f25 * 0.95105654f));
                int i27 = i13 + ((i20 - 1) * i10);
                int i28 = i27 + i19;
                int i29 = i28 + i19;
                int i30 = i29 + i19;
                int i31 = i30 + i19;
                fArr2[i27] = f17 + f28 + f30;
                fArr2[i27 + 1] = f18 + f24 + f26;
                fArr2[i28] = f31 - f37;
                fArr2[i28 + 1] = f32 + f36;
                fArr2[i29] = f33 - f39;
                fArr2[i29 + 1] = f34 + f38;
                fArr2[i30] = f33 + f39;
                fArr2[i30 + 1] = f34 - f38;
                fArr2[i31] = f31 + f37;
                fArr2[i31 + 1] = f32 - f36;
            }
        } else {
            int i32 = 1;
            while (i32 <= i11) {
                int i33 = i12 + 1 + (((i32 * 5) - 4) * i10);
                int i34 = i13 + ((i32 - 1) * i10);
                int i35 = 0;
                while (i35 < i10 - 1) {
                    int i36 = i35 + i33;
                    int i37 = i36 + i10;
                    int i38 = i36 - i10;
                    int i39 = i37 + i10;
                    int i40 = i39 + i10;
                    float f40 = fArr[i36 - 1];
                    float f41 = fArr[i36];
                    float f42 = fArr[i37 - 1];
                    float f43 = fArr[i37];
                    float f44 = fArr[i38 - 1];
                    float f45 = fArr[i38];
                    float f46 = fArr[i39 - 1];
                    float f47 = fArr[i39];
                    float f48 = fArr[i40 - 1];
                    float f49 = fArr[i40];
                    float f50 = f41 - f49;
                    float f51 = f41 + f49;
                    float f52 = f43 - f47;
                    float f53 = f43 + f47;
                    float f54 = f40 - f48;
                    float f55 = f40 + f48;
                    float f56 = f42 - f46;
                    float f57 = f42 + f46;
                    float f58 = f44 + (f55 * f12) + (f57 * f11);
                    float f59 = f45 + (f51 * f12) + (f53 * f11);
                    float f60 = f44 + (f55 * f11) + (f57 * f12);
                    float f61 = f45 + (f51 * f11) + (f53 * f12);
                    float f62 = f10;
                    float f63 = i15;
                    float f64 = ((f54 * f62) + (f56 * 0.58778524f)) * f63;
                    float f65 = ((f50 * f62) + (f52 * 0.58778524f)) * f63;
                    float f66 = ((f54 * 0.58778524f) - (f56 * f62)) * f63;
                    float f67 = ((f50 * 0.58778524f) - (f52 * f62)) * f63;
                    float f68 = f60 - f67;
                    float f69 = f60 + f67;
                    float f70 = f61 + f66;
                    float f71 = f61 - f66;
                    float f72 = f58 + f65;
                    float f73 = f58 - f65;
                    float f74 = f59 - f64;
                    float f75 = f59 + f64;
                    int i41 = i35 + i14;
                    int i42 = i35 + i16;
                    int i43 = i35 + i17;
                    int i44 = i35 + i18;
                    float[] fArr3 = this.f44910m;
                    float f76 = fArr3[i41];
                    float f77 = fArr3[i41 + 1] * f63;
                    float f78 = fArr3[i42];
                    float f79 = fArr3[i42 + 1] * f63;
                    float f80 = fArr3[i43];
                    float f81 = fArr3[i43 + 1] * f63;
                    float f82 = fArr3[i44];
                    float f83 = f63 * fArr3[i44 + 1];
                    int i45 = i35 + i34;
                    int i46 = i45 + i19;
                    int i47 = i46 + i19;
                    int i48 = i47 + i19;
                    int i49 = i48 + i19;
                    fArr2[i45] = f44 + f55 + f57;
                    fArr2[i45 + 1] = f45 + f51 + f53;
                    fArr2[i46] = (f76 * f73) - (f77 * f75);
                    fArr2[i46 + 1] = (f76 * f75) + (f77 * f73);
                    fArr2[i47] = (f78 * f68) - (f79 * f70);
                    fArr2[i47 + 1] = (f78 * f70) + (f79 * f68);
                    fArr2[i48] = (f80 * f69) - (f81 * f71);
                    fArr2[i48 + 1] = (f80 * f71) + (f81 * f69);
                    fArr2[i49] = (f82 * f72) - (f83 * f74);
                    fArr2[i49 + 1] = (f82 * f74) + (f83 * f72);
                    i35 += 2;
                    f10 = f62;
                    f11 = -0.809017f;
                    f12 = 0.309017f;
                }
                i32++;
                f11 = -0.809017f;
                f12 = 0.309017f;
            }
        }
    }

    void D(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14, long j15) {
        vp.b bVar3 = bVar;
        long j16 = j14 + j10;
        long j17 = j16 + j10;
        long j18 = j17 + j10;
        long j19 = j11 * j10;
        long j20 = 2;
        if (j10 == 2) {
            long j21 = 1;
            while (j21 <= j11) {
                long j22 = j12 + (((j21 * 5) - 4) * j10);
                long j23 = j22 + 1;
                long j24 = j23 + j10;
                long j25 = j21;
                long j26 = j23 - j10;
                long j27 = j19;
                long j28 = j24 + j10;
                long j29 = j28 + j10;
                float fP = bVar3.p(j22);
                float fP2 = bVar3.p(j23);
                float fP3 = bVar3.p(j24 - 1);
                float fP4 = bVar3.p(j24);
                float fP5 = bVar3.p(j26 - 1);
                float fP6 = bVar3.p(j26);
                float fP7 = bVar3.p(j28 - 1);
                float fP8 = bVar3.p(j28);
                float fP9 = bVar3.p(j29 - 1);
                float fP10 = bVar3.p(j29);
                float f10 = fP2 - fP10;
                float f11 = fP2 + fP10;
                float f12 = fP4 - fP8;
                float f13 = fP4 + fP8;
                float f14 = fP - fP9;
                float f15 = fP + fP9;
                float f16 = fP3 - fP7;
                float f17 = fP3 + fP7;
                float f18 = (f15 * 0.309017f) + fP5 + (f17 * (-0.809017f));
                float f19 = (f11 * 0.309017f) + fP6 + (f13 * (-0.809017f));
                float f20 = (f15 * (-0.809017f)) + fP5 + (f17 * 0.309017f);
                float f21 = (f11 * (-0.809017f)) + fP6 + (f13 * 0.309017f);
                float f22 = j15;
                float f23 = ((f14 * 0.95105654f) + (f16 * 0.58778524f)) * f22;
                float f24 = ((f10 * 0.95105654f) + (f12 * 0.58778524f)) * f22;
                float f25 = ((f14 * 0.58778524f) - (f16 * 0.95105654f)) * f22;
                float f26 = f22 * ((f10 * 0.58778524f) - (f12 * 0.95105654f));
                long j30 = j13 + ((j25 - 1) * j10);
                long j31 = j30 + j27;
                long j32 = j31 + j27;
                long j33 = j32 + j27;
                long j34 = j33 + j27;
                bVar2.r(j30, fP5 + f15 + f17);
                bVar2.r(j30 + 1, fP6 + f11 + f13);
                bVar2.r(j31, f18 - f24);
                bVar2.r(j31 + 1, f19 + f23);
                bVar2.r(j32, f20 - f26);
                bVar2.r(j32 + 1, f21 + f25);
                bVar2.r(j33, f20 + f26);
                bVar2.r(j33 + 1, f21 - f25);
                bVar2.r(j34, f18 + f24);
                bVar2.r(j34 + 1, f19 - f23);
                j21 = j25 + 1;
                j19 = j27;
            }
            return;
        }
        long j35 = 1;
        while (j35 <= j11) {
            long j36 = j12 + 1 + (((j35 * 5) - 4) * j10);
            long j37 = j13 + ((j35 - 1) * j10);
            long j38 = 0;
            while (j38 < j10 - 1) {
                long j39 = j20;
                long j40 = j38 + j36;
                long j41 = j16;
                long j42 = j40 + j10;
                long j43 = j17;
                long j44 = j40 - j10;
                long j45 = j18;
                long j46 = j42 + j10;
                long j47 = j35;
                long j48 = j46 + j10;
                float fP11 = bVar3.p(j40 - 1);
                float fP12 = bVar3.p(j40);
                float fP13 = bVar3.p(j42 - 1);
                float fP14 = bVar3.p(j42);
                float fP15 = bVar3.p(j44 - 1);
                float fP16 = bVar3.p(j44);
                float fP17 = bVar3.p(j46 - 1);
                float fP18 = bVar3.p(j46);
                float fP19 = bVar3.p(j48 - 1);
                float fP20 = bVar3.p(j48);
                float f27 = fP12 - fP20;
                float f28 = fP12 + fP20;
                float f29 = fP14 - fP18;
                float f30 = fP14 + fP18;
                float f31 = fP11 - fP19;
                float f32 = fP11 + fP19;
                float f33 = fP13 - fP17;
                float f34 = fP13 + fP17;
                float f35 = (f32 * 0.309017f) + fP15 + (f34 * (-0.809017f));
                float f36 = (f28 * 0.309017f) + fP16 + (f30 * (-0.809017f));
                float f37 = (f32 * (-0.809017f)) + fP15 + (f34 * 0.309017f);
                float f38 = fP16 + (f28 * (-0.809017f)) + (f30 * 0.309017f);
                float f39 = j15;
                float f40 = ((f31 * 0.95105654f) + (f33 * 0.58778524f)) * f39;
                float f41 = ((f27 * 0.95105654f) + (f29 * 0.58778524f)) * f39;
                float f42 = ((f31 * 0.58778524f) - (f33 * 0.95105654f)) * f39;
                float f43 = ((f27 * 0.58778524f) - (f29 * 0.95105654f)) * f39;
                float f44 = f37 - f43;
                float f45 = f37 + f43;
                float f46 = f38 + f42;
                float f47 = f38 - f42;
                float f48 = f35 + f41;
                float f49 = f35 - f41;
                float f50 = f36 - f40;
                float f51 = f36 + f40;
                long j49 = j38 + j14;
                long j50 = j38 + j41;
                long j51 = j38 + j43;
                long j52 = j38 + j45;
                float fP21 = this.f44911n.p(j49);
                float fP22 = this.f44911n.p(j49 + 1) * f39;
                float fP23 = this.f44911n.p(j50);
                float fP24 = this.f44911n.p(j50 + 1) * f39;
                float fP25 = this.f44911n.p(j51);
                float fP26 = this.f44911n.p(j51 + 1) * f39;
                float fP27 = this.f44911n.p(j52);
                float fP28 = this.f44911n.p(j52 + 1) * f39;
                long j53 = j38 + j37;
                long j54 = j53 + j19;
                long j55 = j54 + j19;
                long j56 = j55 + j19;
                long j57 = j56 + j19;
                bVar2.r(j53, fP15 + f32 + f34);
                bVar2.r(j53 + 1, fP16 + f28 + f30);
                bVar2.r(j54, (fP21 * f49) - (fP22 * f51));
                bVar2.r(j54 + 1, (fP21 * f51) + (fP22 * f49));
                bVar2.r(j55, (fP23 * f44) - (fP24 * f46));
                bVar2.r(j55 + 1, (fP23 * f46) + (fP24 * f44));
                bVar2.r(j56, (fP25 * f45) - (fP26 * f47));
                bVar2.r(j56 + 1, (fP25 * f47) + (fP26 * f45));
                bVar2.r(j57, (fP27 * f48) - (fP28 * f50));
                bVar2.r(j57 + 1, (fP27 * f50) + (fP28 * f48));
                j38 += j39;
                this = this;
                bVar3 = bVar;
                j20 = j39;
                j16 = j41;
                j17 = j43;
                j18 = j45;
                j35 = j47;
            }
            j35++;
            bVar3 = bVar;
        }
    }

    void E(int[] iArr, int i10, int i11, int i12, int i13, float[] fArr, int i14, float[] fArr2, int i15, int i16, int i17) {
        int i18;
        int i19;
        a aVar = this;
        int i20 = i10;
        int i21 = i20 / 2;
        int i22 = (i11 + 1) / 2;
        int i23 = i11 * i20;
        if (i20 >= i12) {
            i18 = 0;
            for (int i24 = 1; i24 < i22; i24++) {
                int i25 = i24 * i20;
                int i26 = (i11 - i24) * i20;
                for (int i27 = 0; i27 < i12; i27++) {
                    int i28 = i27 * i20;
                    int i29 = i28 + (i25 * i12);
                    int i30 = i28 + (i26 * i12);
                    int i31 = i28 * i11;
                    for (int i32 = 0; i32 < i20; i32++) {
                        int i33 = i15 + i32;
                        int i34 = i14 + i32;
                        float f10 = fArr[i34 + i25 + i31];
                        float f11 = fArr[i34 + i26 + i31];
                        fArr2[i33 + i29] = f10 + f11;
                        fArr2[i33 + i30] = f10 - f11;
                    }
                }
            }
            i19 = 1;
            int i35 = 0;
            while (i35 < i12) {
                int i36 = i35 * i20;
                int i37 = i36 * i11;
                int i38 = i35;
                for (int i39 = 0; i39 < i20; i39++) {
                    fArr2[i15 + i39 + i36] = fArr[i14 + i39 + i37];
                }
                i35 = i38 + 1;
            }
        } else {
            i18 = 0;
            i19 = 1;
            int i40 = 1;
            while (i40 < i22) {
                int i41 = i11 - i40;
                int i42 = i40 * i12 * i20;
                int i43 = i41 * i12 * i20;
                int i44 = i40 * i20;
                int i45 = i41 * i20;
                int i46 = i40;
                int i47 = 0;
                while (i47 < i20) {
                    int i48 = i47;
                    for (int i49 = 0; i49 < i12; i49++) {
                        int i50 = i49 * i20;
                        int i51 = i50 * i11;
                        int i52 = i14 + i48;
                        float f12 = fArr[i52 + i44 + i51];
                        float f13 = fArr[i52 + i45 + i51];
                        int i53 = i15 + i48 + i50;
                        fArr2[i53 + i42] = f12 + f13;
                        fArr2[i53 + i43] = f12 - f13;
                    }
                    i47 = i48 + 1;
                }
                i40 = i46 + 1;
            }
            for (int i54 = 0; i54 < i20; i54++) {
                for (int i55 = 0; i55 < i12; i55++) {
                    int i56 = i55 * i20;
                    fArr2[i15 + i54 + i56] = fArr[i14 + i54 + (i56 * i11)];
                }
            }
        }
        int i57 = 2 - i20;
        int i58 = (i11 - 1) * i13;
        int i59 = i57;
        int i60 = i18;
        int i61 = i19;
        while (i61 < i22) {
            i59 += i20;
            int i62 = i61 * i13;
            int i63 = (i11 - i61) * i13;
            int i64 = i59 + i16;
            int i65 = i57;
            float[] fArr3 = aVar.f44910m;
            float f14 = fArr3[i64 - 2];
            float f15 = i17;
            float f16 = fArr3[i64 - 1] * f15;
            for (int i66 = i18; i66 < i13; i66++) {
                int i67 = i14 + i66;
                int i68 = i15 + i66;
                fArr[i67 + i62] = fArr2[i68] + (fArr2[i68 + i13] * f14);
                fArr[i67 + i63] = fArr2[i68 + i58] * f16;
            }
            i60 += i20;
            int i69 = i59;
            int i70 = 2;
            while (i70 < i22) {
                int i71 = i11 - i70;
                int i72 = i70;
                int i73 = i69 + i60;
                if (i73 > i23) {
                    i73 -= i23;
                }
                i69 = i73;
                int i74 = i69 + i16;
                float[] fArr4 = aVar.f44910m;
                float f17 = fArr4[i74 - 2];
                float f18 = fArr4[i74 - 1] * f15;
                int i75 = i72 * i13;
                int i76 = i71 * i13;
                for (int i77 = i18; i77 < i13; i77++) {
                    int i78 = i14 + i77;
                    int i79 = i15 + i77;
                    int i80 = i78 + i62;
                    fArr[i80] = fArr[i80] + (fArr2[i79 + i75] * f17);
                    int i81 = i78 + i63;
                    fArr[i81] = fArr[i81] + (fArr2[i79 + i76] * f18);
                }
                i70 = i72 + 1;
            }
            i61++;
            i57 = i65;
        }
        int i82 = i57;
        for (int i83 = i19; i83 < i22; i83++) {
            int i84 = i83 * i13;
            for (int i85 = i18; i85 < i13; i85++) {
                int i86 = i15 + i85;
                fArr2[i86] = fArr2[i86] + fArr2[i86 + i84];
            }
        }
        for (int i87 = i19; i87 < i22; i87++) {
            int i88 = i87 * i13;
            int i89 = (i11 - i87) * i13;
            for (int i90 = i19; i90 < i13; i90 += 2) {
                int i91 = i15 + i90;
                int i92 = i14 + i90;
                int i93 = i92 + i88;
                int i94 = i92 + i89;
                float f19 = fArr[i93 - 1];
                float f20 = fArr[i93];
                float f21 = fArr[i94 - 1];
                float f22 = fArr[i94];
                int i95 = i91 + i88;
                int i96 = i91 + i89;
                fArr2[i95 - 1] = f19 - f22;
                fArr2[i96 - 1] = f19 + f22;
                fArr2[i95] = f20 + f21;
                fArr2[i96] = f20 - f21;
            }
        }
        iArr[i18] = i19;
        if (i20 == 2) {
            return;
        }
        iArr[i18] = i18;
        System.arraycopy(fArr2, i15, fArr, i14, i13);
        int i97 = i12 * i20;
        for (int i98 = i19; i98 < i11; i98++) {
            int i99 = i98 * i97;
            for (int i100 = i18; i100 < i12; i100++) {
                int i101 = i100 * i20;
                int i102 = i15 + i101 + i99;
                int i103 = i101 + i14 + i99;
                fArr[i103] = fArr2[i102];
                fArr[i103 + 1] = fArr2[i102 + 1];
            }
        }
        if (i21 <= i12) {
            int i104 = i18;
            for (int i105 = i19; i105 < i11; i105++) {
                i104 += 2;
                int i106 = i105 * i12 * i20;
                for (int i107 = 3; i107 < i20; i107 += 2) {
                    i104 += 2;
                    int i108 = i104 + i16;
                    int i109 = i108 - 1;
                    float[] fArr5 = aVar.f44910m;
                    float f23 = fArr5[i108 - 2];
                    float f24 = i17 * fArr5[i109];
                    int i110 = i14 + i107;
                    int i111 = i15 + i107;
                    for (int i112 = i18; i112 < i12; i112++) {
                        int i113 = (i112 * i20) + i106;
                        int i114 = i110 + i113;
                        int i115 = i111 + i113;
                        float f25 = fArr2[i115 - 1];
                        float f26 = fArr2[i115];
                        fArr[i114 - 1] = (f23 * f25) - (f24 * f26);
                        fArr[i114] = (f26 * f23) + (f25 * f24);
                    }
                }
            }
            return;
        }
        int i116 = i19;
        int i117 = i82;
        while (i116 < i11) {
            i117 += i20;
            int i118 = i116 * i12 * i20;
            int i119 = i18;
            while (i119 < i12) {
                int i120 = (i119 * i20) + i118;
                int i121 = i117;
                int i122 = 3;
                while (i122 < i20) {
                    int i123 = i121 + 2;
                    int i124 = i121 + 1 + i16;
                    float[] fArr6 = aVar.f44910m;
                    float f27 = fArr6[i124 - 1];
                    float f28 = i17 * fArr6[i124];
                    int i125 = i14 + i122 + i120;
                    int i126 = i15 + i122 + i120;
                    float f29 = fArr2[i126 - 1];
                    float f30 = fArr2[i126];
                    fArr[i125 - 1] = (f27 * f29) - (f28 * f30);
                    fArr[i125] = (f27 * f30) + (f28 * f29);
                    i122 += 2;
                    aVar = this;
                    i20 = i10;
                    i121 = i123;
                }
                i119++;
                aVar = this;
                i20 = i10;
            }
            i116++;
            aVar = this;
            i20 = i10;
        }
    }

    void F(int[] iArr, long j10, long j11, long j12, long j13, vp.b bVar, long j14, vp.b bVar2, long j15, long j16, long j17) {
        long j18;
        long j19;
        long j20;
        long j21;
        a aVar = this;
        vp.b bVar3 = bVar;
        long j22 = 2;
        long j23 = j10 / 2;
        long j24 = 1;
        long j25 = (j11 + 1) / 2;
        long j26 = j11 * j10;
        if (j10 >= j12) {
            for (long j27 = 1; j27 < j25; j27 += j24) {
                long j28 = j27 * j10;
                long j29 = (j11 - j27) * j10;
                for (long j30 = 0; j30 < j12; j30 += j24) {
                    long j31 = j30 * j10;
                    long j32 = j31 + (j28 * j12);
                    long j33 = j31 + (j29 * j12);
                    long j34 = j31 * j11;
                    long j35 = 0;
                    while (j35 < j10) {
                        long j36 = j15 + j35;
                        long j37 = j14 + j35;
                        long j38 = j22;
                        float fP = bVar3.p(j37 + j28 + j34);
                        long j39 = j25;
                        float fP2 = bVar3.p(j37 + j29 + j34);
                        long j40 = j24;
                        bVar2.r(j36 + j32, fP + fP2);
                        bVar2.r(j36 + j33, fP - fP2);
                        j35 += j40;
                        j24 = j40;
                        j25 = j39;
                        j22 = j38;
                    }
                }
            }
            j18 = j25;
            j20 = j22;
            j21 = j24;
            long j41 = 0;
            while (j41 < j12) {
                long j42 = j41 * j10;
                long j43 = j42 * j11;
                long j44 = 0;
                while (j44 < j10) {
                    bVar2.r(j15 + j44 + j42, bVar3.p(j14 + j44 + j43));
                    j44 += j21;
                    j41 = j41;
                    j26 = j26;
                }
                j41 += j21;
            }
            j19 = j26;
        } else {
            j18 = j25;
            j19 = j26;
            j20 = 2;
            j21 = 1;
            long j45 = 1;
            while (j45 < j18) {
                long j46 = j11 - j45;
                long j47 = j45 * j12 * j10;
                long j48 = j46 * j12 * j10;
                long j49 = j45 * j10;
                long j50 = j46 * j10;
                for (long j51 = 0; j51 < j10; j51++) {
                    long j52 = 0;
                    while (j52 < j12) {
                        long j53 = j52 * j10;
                        long j54 = j53 * j11;
                        long j55 = j14 + j51;
                        long j56 = j45;
                        float fP3 = bVar3.p(j55 + j49 + j54);
                        float fP4 = bVar3.p(j55 + j50 + j54);
                        long j57 = j15 + j51 + j53;
                        bVar2.r(j57 + j47, fP3 + fP4);
                        bVar2.r(j57 + j48, fP3 - fP4);
                        j52++;
                        j50 = j50;
                        j45 = j56;
                    }
                }
                j45++;
            }
            for (long j58 = 0; j58 < j10; j58++) {
                for (long j59 = 0; j59 < j12; j59++) {
                    long j60 = j59 * j10;
                    bVar2.r(j15 + j58 + j60, bVar3.p((j60 * j11) + j14 + j58));
                }
            }
        }
        long j61 = j20 - j10;
        long j62 = (j11 - j21) * j13;
        long j63 = j61;
        long j64 = 0;
        long j65 = j21;
        while (j65 < j18) {
            j63 += j10;
            long j66 = j65 * j13;
            long j67 = (j11 - j65) * j13;
            long j68 = j63 + j16;
            long j69 = j62;
            long j70 = j65;
            float f10 = j17;
            float fP5 = aVar.f44911n.p(j68 - j20);
            float fP6 = f10 * aVar.f44911n.p(j68 - j21);
            long j71 = 0;
            while (j71 < j13) {
                long j72 = j14 + j71;
                float f11 = fP6;
                long j73 = j15 + j71;
                float f12 = fP5;
                bVar3.r(j72 + j66, bVar2.p(j73) + (bVar2.p(j73 + j13) * f12));
                bVar3.r(j72 + j67, bVar2.p(j73 + j69) * f11);
                j71 += j21;
                fP5 = f12;
                fP6 = f11;
            }
            j64 += j10;
            long j74 = j63;
            long j75 = j20;
            while (j75 < j18) {
                long j76 = j11 - j75;
                long j77 = j74 + j64;
                if (j77 > j19) {
                    j77 -= j19;
                }
                long j78 = j77 + j16;
                long j79 = j75;
                long j80 = j77;
                float fP7 = aVar.f44911n.p(j78 - j20);
                float fP8 = aVar.f44911n.p(j78 - j21) * f10;
                long j81 = j79 * j13;
                long j82 = j76 * j13;
                long j83 = 0;
                while (j83 < j13) {
                    long j84 = j14 + j83;
                    long j85 = j15 + j83;
                    float f13 = fP7;
                    float f14 = fP8;
                    long j86 = j84 + j66;
                    long j87 = j81;
                    bVar3.r(j86, bVar3.p(j86) + (bVar2.p(j85 + j87) * f13));
                    long j88 = j84 + j67;
                    bVar3.r(j88, bVar3.p(j88) + (bVar2.p(j85 + j82) * f14));
                    j83 += j21;
                    fP7 = f13;
                    fP8 = f14;
                    j81 = j87;
                }
                j75 = j79 + j21;
                j74 = j80;
            }
            j65 = j70 + j21;
            j62 = j69;
        }
        long j89 = j21;
        while (j89 < j18) {
            long j90 = j89 * j13;
            long j91 = 0;
            while (j91 < j13) {
                long j92 = j89;
                long j93 = j15 + j91;
                long j94 = j90;
                bVar2.r(j93, bVar2.p(j93) + bVar2.p(j93 + j94));
                j91 += j21;
                j89 = j92;
                j90 = j94;
            }
            j89 += j21;
        }
        long j95 = j21;
        while (j95 < j18) {
            long j96 = j95 * j13;
            long j97 = (j11 - j95) * j13;
            long j98 = j21;
            while (j98 < j13) {
                long j99 = j15 + j98;
                long j100 = j14 + j98;
                long j101 = j95;
                long j102 = j100 + j96;
                long j103 = j97;
                long j104 = j100 + j103;
                long j105 = j96;
                float fP9 = bVar3.p(j102 - j21);
                float fP10 = bVar3.p(j102);
                float fP11 = bVar3.p(j104 - j21);
                float fP12 = bVar3.p(j104);
                long j106 = j99 + j105;
                long j107 = j99 + j103;
                bVar2.r(j106 - j21, fP9 - fP12);
                bVar2.r(j107 - j21, fP9 + fP12);
                bVar2.r(j106, fP10 + fP11);
                bVar2.r(j107, fP10 - fP11);
                j98 += j20;
                bVar3 = bVar;
                j96 = j105;
                j95 = j101;
                j97 = j103;
            }
            j95 += j21;
            bVar3 = bVar;
        }
        iArr[0] = 1;
        if (j10 == j20) {
            return;
        }
        iArr[0] = 0;
        vp.e.a(bVar2, j15, bVar, j14, j13);
        long j108 = j12 * j10;
        long j109 = j21;
        while (j109 < j11) {
            long j110 = j109 * j108;
            long j111 = 0;
            while (j111 < j12) {
                long j112 = j111 * j10;
                long j113 = j108;
                long j114 = j15 + j112 + j110;
                long j115 = j109;
                long j116 = j14 + j112 + j110;
                bVar.r(j116, bVar2.p(j114));
                bVar.r(j116 + j21, bVar2.p(j114 + j21));
                j111 += j21;
                j108 = j113;
                j110 = j110;
                j109 = j115;
            }
            j109 += j21;
        }
        if (j23 > j12) {
            long j117 = j21;
            while (j117 < j11) {
                j61 += j10;
                long j118 = j117 * j12 * j10;
                long j119 = 0;
                while (j119 < j12) {
                    long j120 = (j119 * j10) + j118;
                    long j121 = j61;
                    long j122 = 3;
                    while (j122 < j10) {
                        long j123 = j121 + j20;
                        long j124 = j117;
                        long j125 = j121 + j21 + j16;
                        long j126 = j118;
                        long j127 = j119;
                        float fP13 = aVar.f44911n.p(j125 - j21);
                        float fP14 = j17 * aVar.f44911n.p(j125);
                        long j128 = j14 + j122 + j120;
                        long j129 = j15 + j122 + j120;
                        float fP15 = bVar2.p(j129 - j21);
                        float fP16 = bVar2.p(j129);
                        bVar.r(j128 - j21, (fP13 * fP15) - (fP14 * fP16));
                        bVar.r(j128, (fP13 * fP16) + (fP14 * fP15));
                        j122 += j20;
                        aVar = this;
                        j118 = j126;
                        j121 = j123;
                        j117 = j124;
                        j119 = j127;
                    }
                    j119 += j21;
                    aVar = this;
                }
                j117 += j21;
                aVar = this;
            }
            return;
        }
        long j130 = 0;
        long j131 = j21;
        while (j131 < j11) {
            j130 += j20;
            long j132 = j131 * j12 * j10;
            long j133 = 3;
            while (j133 < j10) {
                long j134 = j130 + j20;
                long j135 = j134 + j16;
                long j136 = j131;
                float fP17 = aVar.f44911n.p(j135 - j20);
                float fP18 = j17 * aVar.f44911n.p(j135 - j21);
                long j137 = j14 + j133;
                long j138 = j15 + j133;
                long j139 = 0;
                while (j139 < j12) {
                    long j140 = (j139 * j10) + j132;
                    float f15 = fP17;
                    float f16 = fP18;
                    long j141 = j137 + j140;
                    long j142 = j137;
                    long j143 = j138 + j140;
                    long j144 = j138;
                    float fP19 = bVar2.p(j143 - j21);
                    float fP20 = bVar2.p(j143);
                    bVar.r(j141 - j21, (f15 * fP19) - (f16 * fP20));
                    bVar.r(j141, (f15 * fP20) + (f16 * fP19));
                    j139 += j21;
                    fP17 = f15;
                    j138 = j144;
                    fP18 = f16;
                    j137 = j142;
                }
                j133 += j20;
                j131 = j136;
                j130 = j134;
            }
            j131 += j21;
        }
    }

    void G(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        int i15 = i11 * i10;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 * i10;
            int i18 = i17 * 2;
            int i19 = i13 + i17;
            float f10 = fArr[i12 + i18];
            float f11 = fArr[((i12 + i10) - 1) + i18 + i10];
            fArr2[i19] = f10 + f11;
            fArr2[i19 + i15] = f10 - f11;
        }
        int i20 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i21 = 0;
            while (i21 < i11) {
                int i22 = i21 * i10;
                int i23 = i22 * 2;
                int i24 = i23 + i10;
                int i25 = i22 + i15;
                for (int i26 = i20; i26 < i10; i26 += 2) {
                    int i27 = (i26 - 1) + i14;
                    int i28 = i13 + i26;
                    float[] fArr3 = this.f44912o;
                    float f12 = fArr3[i27 - 1];
                    float f13 = fArr3[i27];
                    int i29 = i12 + i26 + i23;
                    int i30 = i12 + (i10 - i26) + i24;
                    int i31 = i28 + i22;
                    int i32 = i28 + i25;
                    float f14 = fArr[i29 - 1];
                    float f15 = fArr[i30 - 1];
                    float f16 = f14 - f15;
                    float f17 = fArr[i29];
                    float f18 = fArr[i30];
                    float f19 = f17 + f18;
                    fArr2[i31 - 1] = f14 + f15;
                    fArr2[i31] = f17 - f18;
                    fArr2[i32 - 1] = (f12 * f16) - (f13 * f19);
                    fArr2[i32] = (f12 * f19) + (f13 * f16);
                }
                i21++;
                i20 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        for (int i33 = 0; i33 < i11; i33++) {
            int i34 = i33 * i10;
            int i35 = ((i13 + i10) - 1) + i34;
            int i36 = i12 + (i34 * 2) + i10;
            fArr2[i35] = fArr[i36 - 1] * 2.0f;
            fArr2[i35 + i15] = fArr[i36] * (-2.0f);
        }
    }

    void H(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = j11 * j10;
        long j21 = 0;
        while (true) {
            j15 = 2;
            j16 = 1;
            if (j21 >= j11) {
                break;
            }
            long j22 = j21 * j10;
            long j23 = 2 * j22;
            long j24 = j13 + j22;
            float fP = bVar.p(j12 + j23);
            float fP2 = bVar.p(((j12 + j10) - 1) + j23 + j10);
            bVar2.r(j24, fP + fP2);
            bVar2.r(j24 + j20, fP - fP2);
            j21++;
        }
        if (j10 < 2) {
            return;
        }
        if (j10 != 2) {
            long j25 = 0;
            while (j25 < j11) {
                long j26 = j25 * j10;
                long j27 = j26 * j15;
                long j28 = j27 + j10;
                long j29 = j26 + j20;
                long j30 = j15;
                while (j30 < j10) {
                    long j31 = j15;
                    long j32 = (j30 - j16) + j14;
                    long j33 = j13 + j30;
                    long j34 = j16;
                    float fP3 = this.f44913p.p(j32 - j34);
                    float fP4 = this.f44913p.p(j32);
                    long j35 = j12 + j30 + j27;
                    long j36 = j20;
                    long j37 = j12 + (j10 - j30) + j28;
                    long j38 = j25;
                    long j39 = j33 + j26;
                    long j40 = j26;
                    long j41 = j33 + j29;
                    long j42 = j35 - j34;
                    long j43 = j37 - j34;
                    float fP5 = bVar.p(j42) - bVar.p(j43);
                    float fP6 = bVar.p(j35) + bVar.p(j37);
                    float fP7 = bVar.p(j35);
                    float fP8 = bVar.p(j42);
                    float fP9 = bVar.p(j37);
                    bVar2.r(j39 - j34, fP8 + bVar.p(j43));
                    bVar2.r(j39, fP7 - fP9);
                    bVar2.r(j41 - j34, (fP3 * fP5) - (fP4 * fP6));
                    bVar2.r(j41, (fP3 * fP6) + (fP4 * fP5));
                    j30 += j31;
                    j25 = j38;
                    j15 = j31;
                    j20 = j36;
                    j16 = j34;
                    j26 = j40;
                    j27 = j27;
                }
                j25 += j16;
            }
            j17 = j20;
            j18 = j15;
            j19 = j16;
            if (j10 % j18 == j19) {
                return;
            }
        } else {
            j17 = j20;
            j18 = 2;
            j19 = 1;
        }
        for (long j44 = 0; j44 < j11; j44 += j19) {
            long j45 = j44 * j10;
            long j46 = ((j13 + j10) - j19) + j45;
            long j47 = j12 + (j45 * j18) + j10;
            bVar2.r(j46, bVar.p(j47 - j19) * 2.0f);
            bVar2.r(j46 + j17, bVar.p(j47) * (-2.0f));
        }
    }

    void I(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        float f10;
        int i15 = i10;
        int i16 = i14 + i15;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            f10 = -0.5f;
            if (i18 >= i11) {
                break;
            }
            int i19 = i18 * i15;
            int i20 = i12 + (i19 * 3);
            int i21 = (i15 * 2) + i20;
            float f11 = fArr[i20];
            float f12 = fArr[i21 - 1] * 2.0f;
            float f13 = ((-0.5f) * f12) + f11;
            float f14 = fArr[i21] * 1.7320508f;
            fArr2[i13 + i19] = f11 + f12;
            fArr2[i13 + ((i18 + i11) * i15)] = f13 - f14;
            fArr2[i13 + (((i11 * 2) + i18) * i15)] = f13 + f14;
            i18++;
        }
        if (i15 != 1) {
            int i22 = i11 * i15;
            while (i17 < i11) {
                int i23 = i17 * i15;
                int i24 = i23 * 3;
                int i25 = i24 + i15;
                int i26 = i25 + i15;
                int i27 = i23 + i22;
                int i28 = i27 + i22;
                int i29 = 2;
                while (i29 < i15) {
                    int i30 = i12 + i29;
                    int i31 = i13 + i29;
                    int i32 = i30 + i24;
                    int i33 = i30 + i26;
                    int i34 = i12 + (i15 - i29) + i25;
                    float f15 = fArr[i32 - 1];
                    float f16 = fArr[i32];
                    float f17 = fArr[i33 - 1];
                    float f18 = fArr[i33];
                    float f19 = fArr[i34 - 1];
                    float f20 = fArr[i34];
                    float f21 = f17 + f19;
                    float f22 = f15 + (f21 * f10);
                    float f23 = f18 - f20;
                    float f24 = f16 + (f23 * f10);
                    float f25 = (f17 - f19) * 0.8660254f;
                    float f26 = (f18 + f20) * 0.8660254f;
                    float f27 = f22 - f26;
                    float f28 = f22 + f26;
                    float f29 = f24 + f25;
                    float f30 = f24 - f25;
                    int i35 = i29 - 1;
                    int i36 = i35 + i14;
                    int i37 = i35 + i16;
                    float[] fArr3 = this.f44912o;
                    float f31 = fArr3[i36 - 1];
                    float f32 = fArr3[i36];
                    float f33 = fArr3[i37 - 1];
                    float f34 = fArr3[i37];
                    int i38 = i31 + i23;
                    int i39 = i31 + i27;
                    int i40 = i31 + i28;
                    fArr2[i38 - 1] = f15 + f21;
                    fArr2[i38] = f16 + f23;
                    fArr2[i39 - 1] = (f31 * f27) - (f32 * f29);
                    fArr2[i39] = (f31 * f29) + (f32 * f27);
                    fArr2[i40 - 1] = (f33 * f28) - (f34 * f30);
                    fArr2[i40] = (f33 * f30) + (f34 * f28);
                    i29 += 2;
                    i15 = i10;
                    f10 = -0.5f;
                }
                i17++;
                i15 = i10;
                f10 = -0.5f;
            }
        }
    }

    void J(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        long j15;
        float f10;
        long j16;
        vp.b bVar3 = bVar;
        long j17 = j14 + j10;
        long j18 = 0;
        while (true) {
            j15 = 3;
            f10 = -0.5f;
            j16 = 1;
            if (j18 >= j11) {
                break;
            }
            long j19 = j18 * j10;
            long j20 = j12 + (3 * j19);
            long j21 = j20 + (j10 * 2);
            float fP = bVar3.p(j20);
            float fP2 = bVar3.p(j21 - 1) * 2.0f;
            float f11 = ((-0.5f) * fP2) + fP;
            float fP3 = bVar3.p(j21) * 1.7320508f;
            bVar2.r(j13 + j19, fP + fP2);
            bVar2.r(j13 + ((j18 + j11) * j10), f11 - fP3);
            bVar2.r(j13 + (((j11 * 2) + j18) * j10), f11 + fP3);
            j18++;
        }
        if (j10 == 1) {
            return;
        }
        long j22 = j11 * j10;
        long j23 = 0;
        while (j23 < j11) {
            long j24 = j23 * j10;
            long j25 = j24 * j15;
            long j26 = j25 + j10;
            long j27 = j26 + j10;
            long j28 = j24 + j22;
            long j29 = j28 + j22;
            long j30 = 2;
            while (j30 < j10) {
                long j31 = j12 + j30;
                long j32 = j13 + j30;
                long j33 = j31 + j25;
                float f12 = f10;
                long j34 = j25;
                long j35 = j31 + j27;
                long j36 = j12 + (j10 - j30) + j26;
                float fP4 = bVar3.p(j33 - j16);
                float fP5 = bVar3.p(j33);
                float fP6 = bVar3.p(j35 - j16);
                long j37 = j16;
                float fP7 = bVar3.p(j35);
                float fP8 = bVar3.p(j36 - j37);
                float fP9 = bVar3.p(j36);
                float f13 = fP6 + fP8;
                float f14 = (f13 * f12) + fP4;
                float f15 = fP7 - fP9;
                float f16 = fP5 + (f15 * f12);
                float f17 = (fP6 - fP8) * 0.8660254f;
                float f18 = (fP7 + fP9) * 0.8660254f;
                float f19 = f14 - f18;
                float f20 = f14 + f18;
                float f21 = f16 + f17;
                float f22 = f16 - f17;
                long j38 = j30 - j37;
                long j39 = j17;
                long j40 = j38 + j14;
                long j41 = j22;
                long j42 = j38 + j39;
                long j43 = j24;
                float fP10 = this.f44913p.p(j40 - j37);
                float fP11 = this.f44913p.p(j40);
                float fP12 = this.f44913p.p(j42 - j37);
                float fP13 = this.f44913p.p(j42);
                long j44 = j32 + j43;
                long j45 = j32 + j28;
                long j46 = j32 + j29;
                bVar2.r(j44 - j37, fP4 + f13);
                bVar2.r(j44, fP5 + f15);
                bVar2.r(j45 - j37, (fP10 * f19) - (fP11 * f21));
                bVar2.r(j45, (fP10 * f21) + (fP11 * f19));
                bVar2.r(j46 - j37, (fP12 * f20) - (fP13 * f22));
                bVar2.r(j46, (fP12 * f22) + (fP13 * f20));
                j30 += 2;
                this = this;
                bVar3 = bVar;
                f10 = f12;
                j25 = j34;
                j16 = j37;
                j24 = j43;
                j17 = j39;
                j22 = j41;
            }
            long j47 = j16;
            j23 += j47;
            bVar3 = bVar;
            j16 = j47;
            j15 = 3;
        }
    }

    void K(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i11 * i10;
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i18 * i10;
            int i20 = i19 * 4;
            int i21 = i19 + i17;
            int i22 = i21 + i17;
            int i23 = i20 + i10;
            int i24 = i23 + i10;
            int i25 = i24 + i10;
            float f10 = fArr[i12 + i20];
            float f11 = fArr[i12 + i24];
            int i26 = (i12 + i10) - 1;
            float f12 = fArr[i26 + i25];
            float f13 = fArr[i26 + i23];
            float f14 = f10 - f12;
            float f15 = f10 + f12;
            float f16 = f13 + f13;
            float f17 = f11 + f11;
            fArr2[i13 + i19] = f15 + f16;
            fArr2[i13 + i21] = f14 - f17;
            fArr2[i13 + i22] = f15 - f16;
            fArr2[i13 + i22 + i17] = f14 + f17;
        }
        int i27 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i28 = 0;
            while (i28 < i11) {
                int i29 = i28 * i10;
                int i30 = i29 + i17;
                int i31 = i30 + i17;
                int i32 = i31 + i17;
                int i33 = i29 * 4;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                int i36 = i35 + i10;
                for (int i37 = i27; i37 < i10; i37 += 2) {
                    int i38 = i37 - 1;
                    int i39 = i38 + i14;
                    int i40 = i38 + i15;
                    int i41 = i38 + i16;
                    float[] fArr3 = this.f44912o;
                    float f18 = fArr3[i39 - 1];
                    float f19 = fArr3[i39];
                    float f20 = fArr3[i40 - 1];
                    float f21 = fArr3[i40];
                    float f22 = fArr3[i41 - 1];
                    float f23 = fArr3[i41];
                    int i42 = i12 + i37;
                    int i43 = i12 + (i10 - i37);
                    int i44 = i13 + i37;
                    int i45 = i42 + i33;
                    int i46 = i43 + i34;
                    int i47 = i42 + i35;
                    int i48 = i43 + i36;
                    float f24 = fArr[i45 - 1];
                    float f25 = fArr[i45];
                    float f26 = fArr[i46 - 1];
                    float f27 = fArr[i46];
                    float f28 = fArr[i47 - 1];
                    float f29 = fArr[i47];
                    float f30 = fArr[i48 - 1];
                    float f31 = fArr[i48];
                    float f32 = f25 + f31;
                    float f33 = f25 - f31;
                    float f34 = f29 - f27;
                    float f35 = f29 + f27;
                    float f36 = f24 - f30;
                    float f37 = f24 + f30;
                    float f38 = f28 - f26;
                    float f39 = f28 + f26;
                    float f40 = f37 - f39;
                    float f41 = f33 - f34;
                    float f42 = f36 - f35;
                    float f43 = f36 + f35;
                    float f44 = f32 + f38;
                    float f45 = f32 - f38;
                    int i49 = i44 + i29;
                    int i50 = i44 + i30;
                    int i51 = i44 + i31;
                    int i52 = i44 + i32;
                    fArr2[i49 - 1] = f37 + f39;
                    fArr2[i49] = f33 + f34;
                    fArr2[i50 - 1] = (f18 * f42) - (f19 * f44);
                    fArr2[i50] = (f18 * f44) + (f19 * f42);
                    fArr2[i51 - 1] = (f20 * f40) - (f21 * f41);
                    fArr2[i51] = (f20 * f41) + (f21 * f40);
                    fArr2[i52 - 1] = (f22 * f43) - (f23 * f45);
                    fArr2[i52] = (f22 * f45) + (f23 * f43);
                }
                i28++;
                i27 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        for (int i53 = 0; i53 < i11; i53++) {
            int i54 = i53 * i10;
            int i55 = i54 * 4;
            int i56 = i54 + i17;
            int i57 = i56 + i17;
            int i58 = i55 + i10;
            int i59 = i58 + i10;
            int i60 = i59 + i10;
            int i61 = (i12 + i10) - 1;
            float f46 = fArr[i55 + i61];
            float f47 = fArr[i61 + i59];
            float f48 = fArr[i12 + i58];
            float f49 = fArr[i12 + i60];
            float f50 = f48 + f49;
            float f51 = f49 - f48;
            float f52 = f46 - f47;
            float f53 = f46 + f47;
            int i62 = (i13 + i10) - 1;
            fArr2[i54 + i62] = f53 + f53;
            fArr2[i56 + i62] = (f52 - f50) * 1.4142135f;
            fArr2[i57 + i62] = f51 + f51;
            fArr2[i62 + i57 + i17] = (f52 + f50) * (-1.4142135f);
        }
    }

    void L(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        vp.b bVar3 = bVar;
        long j18 = j14 + j10;
        long j19 = j18 + j10;
        long j20 = j11 * j10;
        long j21 = 0;
        while (true) {
            j15 = 4;
            if (j21 >= j11) {
                break;
            }
            long j22 = j21 * j10;
            long j23 = 4 * j22;
            long j24 = j22 + j20;
            long j25 = j24 + j20;
            long j26 = j23 + j10;
            long j27 = j26 + j10;
            long j28 = j27 + j10;
            float fP = bVar3.p(j12 + j23);
            float fP2 = bVar3.p(j12 + j27);
            long j29 = (j12 + j10) - 1;
            float fP3 = bVar3.p(j29 + j28);
            long j30 = j18;
            float fP4 = bVar3.p(j29 + j26);
            float f10 = fP - fP3;
            float f11 = fP + fP3;
            float f12 = fP4 + fP4;
            float f13 = fP2 + fP2;
            bVar2.r(j13 + j22, f11 + f12);
            bVar2.r(j13 + j24, f10 - f13);
            bVar2.r(j13 + j25, f11 - f12);
            bVar2.r(j13 + j25 + j20, f10 + f13);
            j21++;
            j18 = j30;
        }
        long j31 = j18;
        long j32 = 2;
        if (j10 < 2) {
            return;
        }
        if (j10 != 2) {
            long j33 = 0;
            while (j33 < j11) {
                long j34 = j33 * j10;
                long j35 = j34 + j20;
                long j36 = j35 + j20;
                long j37 = j36 + j20;
                long j38 = j34 * j15;
                long j39 = j38 + j10;
                long j40 = j39 + j10;
                long j41 = j40 + j10;
                long j42 = j32;
                while (j42 < j10) {
                    long j43 = j42 - 1;
                    long j44 = j32;
                    long j45 = j43 + j14;
                    long j46 = j15;
                    long j47 = j43 + j31;
                    long j48 = j19;
                    long j49 = j43 + j48;
                    long j50 = j20;
                    float fP5 = this.f44913p.p(j45 - 1);
                    float fP6 = this.f44913p.p(j45);
                    float fP7 = this.f44913p.p(j47 - 1);
                    float fP8 = this.f44913p.p(j47);
                    float fP9 = this.f44913p.p(j49 - 1);
                    float fP10 = this.f44913p.p(j49);
                    long j51 = j12 + j42;
                    long j52 = j12 + (j10 - j42);
                    long j53 = j13 + j42;
                    long j54 = j51 + j38;
                    long j55 = j52 + j39;
                    long j56 = j51 + j40;
                    long j57 = j52 + j41;
                    long j58 = j33;
                    float fP11 = bVar3.p(j54 - 1);
                    float fP12 = bVar3.p(j54);
                    float fP13 = bVar3.p(j55 - 1);
                    float fP14 = bVar3.p(j55);
                    float fP15 = bVar3.p(j56 - 1);
                    float fP16 = bVar3.p(j56);
                    float fP17 = bVar3.p(j57 - 1);
                    float fP18 = bVar3.p(j57);
                    float f14 = fP12 + fP18;
                    float f15 = fP12 - fP18;
                    float f16 = fP16 - fP14;
                    float f17 = fP16 + fP14;
                    float f18 = fP11 - fP17;
                    float f19 = fP11 + fP17;
                    float f20 = fP15 - fP13;
                    float f21 = fP15 + fP13;
                    float f22 = f19 - f21;
                    float f23 = f15 - f16;
                    float f24 = f18 - f17;
                    float f25 = f18 + f17;
                    float f26 = f14 + f20;
                    float f27 = f14 - f20;
                    long j59 = j53 + j34;
                    long j60 = j53 + j35;
                    long j61 = j53 + j36;
                    long j62 = j53 + j37;
                    bVar2.r(j59 - 1, f19 + f21);
                    bVar2.r(j59, f15 + f16);
                    bVar2.r(j60 - 1, (fP5 * f24) - (fP6 * f26));
                    bVar2.r(j60, (fP5 * f26) + (fP6 * f24));
                    bVar2.r(j61 - 1, (fP7 * f22) - (fP8 * f23));
                    bVar2.r(j61, (fP7 * f23) + (fP8 * f22));
                    bVar2.r(j62 - 1, (fP9 * f25) - (fP10 * f27));
                    bVar2.r(j62, (fP9 * f27) + (fP10 * f25));
                    j42 += j44;
                    this = this;
                    j33 = j58;
                    j20 = j50;
                    j32 = j44;
                    j15 = j46;
                    j19 = j48;
                    j34 = j34;
                }
                j33++;
            }
            j16 = j20;
            j17 = j15;
            if (j10 % j32 == 1) {
                return;
            }
        } else {
            j16 = j20;
            j17 = 4;
        }
        long j63 = 0;
        while (j63 < j11) {
            long j64 = j63 * j10;
            long j65 = j64 * j17;
            long j66 = j64 + j16;
            long j67 = j66 + j16;
            long j68 = j65 + j10;
            long j69 = j68 + j10;
            long j70 = (j12 + j10) - 1;
            float fP19 = bVar3.p(j70 + j65);
            float fP20 = bVar3.p(j70 + j69);
            float fP21 = bVar3.p(j12 + j68);
            float fP22 = bVar3.p(j12 + j69 + j10);
            float f28 = fP21 + fP22;
            float f29 = fP22 - fP21;
            float f30 = fP19 - fP20;
            float f31 = fP19 + fP20;
            long j71 = (j13 + j10) - 1;
            bVar2.r(j71 + j64, f31 + f31);
            bVar2.r(j71 + j66, (f30 - f28) * 1.4142135f);
            bVar2.r(j71 + j67, f29 + f29);
            bVar2.r(j71 + j67 + j16, (f30 + f28) * (-1.4142135f));
            j63++;
            bVar3 = bVar;
        }
    }

    void M(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        float f10;
        float f11;
        float f12;
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i16 + i10;
        int i18 = i11 * i10;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            f10 = 0.58778524f;
            f11 = 0.95105654f;
            f12 = -0.809017f;
            if (i20 >= i11) {
                break;
            }
            int i21 = i20 * i10;
            int i22 = i21 * 5;
            int i23 = i22 + i10;
            int i24 = i23 + i10;
            int i25 = i24 + i10;
            int i26 = i21 + i18;
            int i27 = i26 + i18;
            int i28 = i27 + i18;
            int i29 = (i12 + i10) - 1;
            float f13 = fArr[i12 + i22];
            float f14 = fArr[i12 + i24] * 2.0f;
            float f15 = fArr[i12 + i25 + i10] * 2.0f;
            float f16 = fArr[i29 + i23] * 2.0f;
            float f17 = fArr[i29 + i25] * 2.0f;
            float f18 = f13 + (f16 * 0.309017f) + (f17 * (-0.809017f));
            float f19 = ((-0.809017f) * f16) + f13 + (0.309017f * f17);
            float f20 = (f14 * 0.95105654f) + (f15 * 0.58778524f);
            float f21 = (f14 * 0.58778524f) - (f15 * 0.95105654f);
            fArr2[i13 + i21] = f13 + f16 + f17;
            fArr2[i13 + i26] = f18 - f20;
            fArr2[i13 + i27] = f19 - f21;
            fArr2[i13 + i28] = f19 + f21;
            fArr2[i13 + i28 + i18] = f18 + f20;
            i20++;
        }
        if (i10 != 1) {
            while (i19 < i11) {
                int i30 = i19 * i10;
                int i31 = i30 * 5;
                int i32 = i31 + i10;
                int i33 = i32 + i10;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                int i36 = i30 + i18;
                int i37 = i36 + i18;
                int i38 = i37 + i18;
                int i39 = i38 + i18;
                float f22 = f10;
                int i40 = 2;
                while (i40 < i10) {
                    int i41 = i40 - 1;
                    int i42 = i41 + i14;
                    int i43 = i41 + i15;
                    int i44 = i41 + i16;
                    int i45 = i41 + i17;
                    float f23 = f11;
                    float f24 = f12;
                    float[] fArr3 = this.f44912o;
                    float f25 = fArr3[i42 - 1];
                    float f26 = fArr3[i42];
                    float f27 = fArr3[i43 - 1];
                    float f28 = fArr3[i43];
                    float f29 = fArr3[i44 - 1];
                    float f30 = fArr3[i44];
                    float f31 = fArr3[i45 - 1];
                    float f32 = fArr3[i45];
                    int i46 = i12 + i40;
                    int i47 = i12 + (i10 - i40);
                    int i48 = i13 + i40;
                    int i49 = i46 + i31;
                    int i50 = i47 + i32;
                    int i51 = i46 + i33;
                    int i52 = i47 + i34;
                    int i53 = i46 + i35;
                    float f33 = fArr[i49 - 1];
                    float f34 = fArr[i49];
                    float f35 = fArr[i50 - 1];
                    float f36 = fArr[i50];
                    float f37 = fArr[i51 - 1];
                    float f38 = fArr[i51];
                    float f39 = fArr[i52 - 1];
                    float f40 = fArr[i52];
                    float f41 = fArr[i53 - 1];
                    float f42 = fArr[i53];
                    float f43 = f38 + f36;
                    float f44 = f38 - f36;
                    float f45 = f42 + f40;
                    float f46 = f42 - f40;
                    float f47 = f37 - f35;
                    float f48 = f37 + f35;
                    float f49 = f41 - f39;
                    float f50 = f41 + f39;
                    float f51 = f33 + (f48 * 0.309017f) + (f50 * f24);
                    float f52 = f34 + (f44 * 0.309017f) + (f46 * f24);
                    float f53 = f33 + (f48 * f24) + (f50 * 0.309017f);
                    float f54 = f34 + (f44 * f24) + (f46 * 0.309017f);
                    float f55 = (f47 * f23) + (f49 * f22);
                    float f56 = (f43 * f23) + (f45 * f22);
                    float f57 = (f47 * f22) - (f49 * f23);
                    float f58 = (f43 * f22) - (f45 * f23);
                    float f59 = f53 - f58;
                    float f60 = f53 + f58;
                    float f61 = f54 + f57;
                    float f62 = f54 - f57;
                    float f63 = f51 + f56;
                    float f64 = f51 - f56;
                    float f65 = f52 - f55;
                    float f66 = f52 + f55;
                    int i54 = i48 + i30;
                    int i55 = i48 + i36;
                    int i56 = i48 + i37;
                    int i57 = i48 + i38;
                    int i58 = i48 + i39;
                    fArr2[i54 - 1] = f33 + f48 + f50;
                    fArr2[i54] = f34 + f44 + f46;
                    fArr2[i55 - 1] = (f25 * f64) - (f26 * f66);
                    fArr2[i55] = (f25 * f66) + (f26 * f64);
                    fArr2[i56 - 1] = (f27 * f59) - (f28 * f61);
                    fArr2[i56] = (f27 * f61) + (f28 * f59);
                    fArr2[i57 - 1] = (f29 * f60) - (f30 * f62);
                    fArr2[i57] = (f29 * f62) + (f30 * f60);
                    fArr2[i58 - 1] = (f31 * f63) - (f32 * f65);
                    fArr2[i58] = (f31 * f65) + (f32 * f63);
                    i40 += 2;
                    f11 = f23;
                    f12 = f24;
                }
                i19++;
                f10 = f22;
                f11 = f11;
            }
        }
    }

    void N(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        vp.b bVar3 = bVar;
        long j15 = j14 + j10;
        long j16 = j15 + j10;
        long j17 = j16 + j10;
        long j18 = j11 * j10;
        long j19 = 0;
        while (j19 < j11) {
            long j20 = j19 * j10;
            long j21 = 5 * j20;
            long j22 = j21 + j10;
            long j23 = j22 + j10;
            long j24 = j23 + j10;
            long j25 = j20 + j18;
            long j26 = j25 + j18;
            long j27 = j26 + j18;
            long j28 = (j12 + j10) - 1;
            float fP = bVar3.p(j12 + j21);
            long j29 = j15;
            float fP2 = bVar3.p(j12 + j23) * 2.0f;
            long j30 = j16;
            float fP3 = bVar3.p(j12 + j24 + j10) * 2.0f;
            long j31 = j17;
            float fP4 = bVar3.p(j28 + j22) * 2.0f;
            float fP5 = bVar3.p(j28 + j24) * 2.0f;
            float f10 = (fP4 * 0.309017f) + fP + (fP5 * (-0.809017f));
            float f11 = fP + ((-0.809017f) * fP4) + (0.309017f * fP5);
            float f12 = (fP2 * 0.95105654f) + (fP3 * 0.58778524f);
            float f13 = (fP2 * 0.58778524f) - (fP3 * 0.95105654f);
            bVar2.r(j13 + j20, fP + fP4 + fP5);
            bVar2.r(j13 + j25, f10 - f12);
            bVar2.r(j13 + j26, f11 - f13);
            bVar2.r(j13 + j27, f11 + f13);
            bVar2.r(j13 + j27 + j18, f10 + f12);
            j19++;
            j16 = j30;
            j17 = j31;
            j15 = j29;
        }
        long j32 = j15;
        long j33 = j16;
        long j34 = j17;
        if (j10 == 1) {
            return;
        }
        long j35 = 0;
        while (j35 < j11) {
            long j36 = j35 * j10;
            long j37 = j36 * 5;
            long j38 = j37 + j10;
            long j39 = j38 + j10;
            long j40 = j39 + j10;
            long j41 = j40 + j10;
            long j42 = j36 + j18;
            long j43 = j42 + j18;
            long j44 = j43 + j18;
            long j45 = j44 + j18;
            long j46 = 2;
            while (j46 < j10) {
                long j47 = j46 - 1;
                long j48 = j36;
                long j49 = j47 + j14;
                long j50 = j37;
                long j51 = j47 + j32;
                long j52 = j38;
                long j53 = j47 + j33;
                long j54 = j18;
                long j55 = j47 + j34;
                long j56 = j35;
                float fP6 = this.f44913p.p(j49 - 1);
                float fP7 = this.f44913p.p(j49);
                float fP8 = this.f44913p.p(j51 - 1);
                float fP9 = this.f44913p.p(j51);
                float fP10 = this.f44913p.p(j53 - 1);
                float fP11 = this.f44913p.p(j53);
                float fP12 = this.f44913p.p(j55 - 1);
                float fP13 = this.f44913p.p(j55);
                long j57 = j12 + j46;
                long j58 = j12 + (j10 - j46);
                long j59 = j13 + j46;
                long j60 = j57 + j50;
                long j61 = j58 + j52;
                long j62 = j57 + j39;
                long j63 = j58 + j40;
                long j64 = j57 + j41;
                long j65 = j39;
                float fP14 = bVar3.p(j60 - 1);
                float fP15 = bVar3.p(j60);
                float fP16 = bVar3.p(j61 - 1);
                float fP17 = bVar3.p(j61);
                float fP18 = bVar3.p(j62 - 1);
                float fP19 = bVar3.p(j62);
                float fP20 = bVar3.p(j63 - 1);
                float fP21 = bVar3.p(j63);
                float fP22 = bVar3.p(j64 - 1);
                float fP23 = bVar3.p(j64);
                float f14 = fP19 + fP17;
                float f15 = fP19 - fP17;
                float f16 = fP23 + fP21;
                float f17 = fP23 - fP21;
                float f18 = fP18 - fP16;
                float f19 = fP18 + fP16;
                float f20 = fP22 - fP20;
                float f21 = fP22 + fP20;
                float f22 = (f19 * 0.309017f) + fP14 + (f21 * (-0.809017f));
                float f23 = (f15 * 0.309017f) + fP15 + (f17 * (-0.809017f));
                float f24 = fP14 + (f19 * (-0.809017f)) + (f21 * 0.309017f);
                float f25 = fP15 + (f15 * (-0.809017f)) + (f17 * 0.309017f);
                float f26 = (f18 * 0.95105654f) + (f20 * 0.58778524f);
                float f27 = (f14 * 0.95105654f) + (f16 * 0.58778524f);
                float f28 = (f18 * 0.58778524f) - (f20 * 0.95105654f);
                float f29 = (f14 * 0.58778524f) - (f16 * 0.95105654f);
                float f30 = f24 - f29;
                float f31 = f24 + f29;
                float f32 = f25 + f28;
                float f33 = f25 - f28;
                float f34 = f22 + f27;
                float f35 = f22 - f27;
                float f36 = f23 - f26;
                float f37 = f23 + f26;
                long j66 = j59 + j48;
                long j67 = j59 + j42;
                long j68 = j59 + j43;
                long j69 = j59 + j44;
                long j70 = j59 + j45;
                bVar2.r(j66 - 1, fP14 + f19 + f21);
                bVar2.r(j66, fP15 + f15 + f17);
                bVar2.r(j67 - 1, (fP6 * f35) - (fP7 * f37));
                bVar2.r(j67, (fP6 * f37) + (fP7 * f35));
                bVar2.r(j68 - 1, (fP8 * f30) - (fP9 * f32));
                bVar2.r(j68, (fP8 * f32) + (fP9 * f30));
                bVar2.r(j69 - 1, (fP10 * f31) - (fP11 * f33));
                bVar2.r(j69, (fP10 * f33) + (fP11 * f31));
                bVar2.r(j70 - 1, (fP12 * f34) - (fP13 * f36));
                bVar2.r(j70, (fP12 * f36) + (fP13 * f34));
                j46 += 2;
                this = this;
                bVar3 = bVar;
                j35 = j56;
                j36 = j48;
                j37 = j50;
                j38 = j52;
                j18 = j54;
                j39 = j65;
            }
            j35++;
            bVar3 = bVar;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v30 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v32 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v34 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v35 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v36 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v37 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v38 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v39 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v40 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v41 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v43 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v44 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v45 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v46 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r31v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r40v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v30 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v32 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v34 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v35 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v36 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v37 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v38 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v39 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v40 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v41 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v42 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v43 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v44 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v45 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v46 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v47 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v48 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v48 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v49 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v49 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v50 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v52 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v52 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v53 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v53 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v54 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v55 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v55 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v56 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v57 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v58 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v59 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v59 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v60 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v60 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v61 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v61 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v62 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v62 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v63 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v63 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v64 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v64 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v65 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v65 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v66 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v66 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r40v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    void O(int r33, int r34, int r35, int r36, float[] r37, int r38, float[] r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.a.O(int, int, int, int, float[], int, float[], int, int):void");
    }

    void P(long j10, long j11, long j12, long j13, vp.b bVar, long j14, vp.b bVar2, long j15, long j16) {
        long j17;
        int i10;
        float f10;
        long j18;
        float f11;
        long j19;
        int i11;
        a aVar = this;
        long j20 = j10;
        vp.b bVar3 = bVar;
        double d10 = 6.2831855f / j11;
        float fB = (float) bo.a.b(d10);
        float fL = (float) bo.a.l(d10);
        long j21 = 1;
        long j22 = 2;
        long j23 = (j20 - 1) / 2;
        long j24 = (j11 + 1) / 2;
        long j25 = j11 * j20;
        if (j20 >= j12) {
            for (long j26 = 0; j26 < j12; j26 += j21) {
                long j27 = j26 * j20;
                long j28 = j26 * j25;
                long j29 = 0;
                while (j29 < j20) {
                    long j30 = j21;
                    bVar2.r(j15 + j29 + j27, bVar3.p(j14 + j29 + j28));
                    j29 += j30;
                    j21 = j30;
                }
            }
            j17 = j21;
        } else {
            j17 = 1;
            long j31 = 0;
            while (j31 < j20) {
                long j32 = j15 + j31;
                long j33 = j14 + j31;
                long j34 = 0;
                while (j34 < j12) {
                    bVar2.r(j32 + (j34 * j20), bVar3.p(j33 + (j34 * j25)));
                    j34++;
                    fL = fL;
                    j31 = j31;
                }
                j31++;
            }
        }
        float f12 = fL;
        long j35 = (j14 + j20) - j17;
        long j36 = j17;
        while (j36 < j24) {
            long j37 = j36 * j12 * j20;
            long j38 = (j11 - j36) * j12 * j20;
            long j39 = j36 * 2 * j20;
            long j40 = 0;
            while (j40 < j12) {
                long j41 = j40 * j20;
                long j42 = j41 * j11;
                long j43 = j35;
                float fP = bVar3.p(((j35 + j39) + j42) - j20);
                float fP2 = bVar3.p(j14 + j39 + j42);
                long j44 = j15 + j41;
                bVar2.r(j44 + j37, fP + fP);
                bVar2.r(j44 + j38, fP2 + fP2);
                j40 += j17;
                j35 = j43;
                j36 = j36;
            }
            j36 += j17;
        }
        int i12 = (j20 > j17 ? 1 : (j20 == j17 ? 0 : -1));
        if (i12 == 0) {
            i10 = i12;
            f10 = fB;
            j18 = j23;
            f11 = f12;
            j19 = j22;
        } else if (j23 >= j12) {
            long j45 = j17;
            while (j45 < j24) {
                long j46 = j45 * j12 * j20;
                long j47 = (j11 - j45) * j12 * j20;
                long j48 = j45 * j22 * j20;
                for (long j49 = 0; j49 < j12; j49 += j17) {
                    long j50 = j49 * j20;
                    long j51 = j50 + j46;
                    long j52 = j50 + j47;
                    long j53 = (j49 * j11 * j20) + j48;
                    long j54 = j22;
                    while (j54 < j20) {
                        long j55 = j15 + j54;
                        int i13 = i12;
                        long j56 = j55 + j51;
                        long j57 = j45;
                        long j58 = j55 + j52;
                        float f13 = fB;
                        long j59 = j23;
                        long j60 = j14 + j54 + j53;
                        long j61 = ((j14 + (j20 - j54)) + j53) - j20;
                        float fP3 = bVar3.p(j60 - j17);
                        float fP4 = bVar3.p(j60);
                        float fP5 = bVar3.p(j61 - j17);
                        float fP6 = bVar3.p(j61);
                        long j62 = j22;
                        bVar2.r(j56 - j17, fP3 + fP5);
                        bVar2.r(j58 - j17, fP3 - fP5);
                        bVar2.r(j56, fP4 - fP6);
                        bVar2.r(j58, fP4 + fP6);
                        j54 += j62;
                        f12 = f12;
                        fB = f13;
                        j47 = j47;
                        i12 = i13;
                        j45 = j57;
                        j23 = j59;
                        j22 = j62;
                    }
                }
                j45 += j17;
            }
            i10 = i12;
            f10 = fB;
            j18 = j23;
            f11 = f12;
            j19 = j22;
        } else {
            i10 = i12;
            f10 = fB;
            j18 = j23;
            f11 = f12;
            j19 = 2;
            long j63 = j17;
            while (j63 < j24) {
                long j64 = j63 * j12 * j20;
                long j65 = (j11 - j63) * j12 * j20;
                long j66 = j63 * 2 * j20;
                long j67 = 2;
                while (j67 < j20) {
                    long j68 = j15 + j67;
                    long j69 = j14 + (j20 - j67);
                    long j70 = j14 + j67;
                    long j71 = 0;
                    while (j71 < j12) {
                        long j72 = j71 * j20;
                        long j73 = (j71 * j11 * j20) + j66;
                        long j74 = j63;
                        long j75 = j68 + j72 + j64;
                        long j76 = j65;
                        long j77 = j68 + j72 + j65;
                        long j78 = j64;
                        long j79 = j70 + j73;
                        long j80 = j67;
                        long j81 = (j69 + j73) - j20;
                        long j82 = j69;
                        float fP7 = bVar3.p(j79 - j17);
                        float fP8 = bVar3.p(j79);
                        float fP9 = bVar3.p(j81 - j17);
                        float fP10 = bVar3.p(j81);
                        bVar2.r(j75 - j17, fP7 + fP9);
                        bVar2.r(j77 - j17, fP7 - fP9);
                        bVar2.r(j75, fP8 - fP10);
                        bVar2.r(j77, fP8 + fP10);
                        j71 += j17;
                        j64 = j78;
                        j65 = j76;
                        j69 = j82;
                        j63 = j74;
                        j67 = j80;
                    }
                    j67 += 2;
                }
                j63 += j17;
            }
        }
        long j83 = (j11 - j17) * j13;
        float f14 = 1.0f;
        float f15 = 0.0f;
        long j84 = j17;
        while (j84 < j24) {
            float f16 = (f10 * f14) - (f11 * f15);
            float f17 = (f15 * f10) + (f14 * f11);
            long j85 = j84 * j13;
            long j86 = (j11 - j84) * j13;
            long j87 = 0;
            while (j87 < j13) {
                long j88 = j14 + j87;
                long j89 = j83;
                long j90 = j15 + j87;
                float f18 = f17;
                bVar3.r(j88 + j85, bVar2.p(j90) + (bVar2.p(j90 + j13) * f16));
                bVar3.r(j88 + j86, f18 * bVar2.p(j90 + j89));
                j87 += j17;
                f17 = f18;
                j83 = j89;
            }
            long j91 = j83;
            float f19 = f17;
            float f20 = f16;
            long j92 = j19;
            while (j92 < j24) {
                float f21 = (f16 * f20) - (f19 * f17);
                f17 = (f17 * f16) + (f20 * f19);
                long j93 = j92 * j13;
                long j94 = (j11 - j92) * j13;
                long j95 = 0;
                while (j95 < j13) {
                    long j96 = j14 + j95;
                    long j97 = j15 + j95;
                    long j98 = j92;
                    long j99 = j96 + j85;
                    float f22 = f17;
                    bVar3.r(j99, bVar3.p(j99) + (bVar2.p(j97 + j93) * f21));
                    long j100 = j96 + j86;
                    bVar3.r(j100, bVar3.p(j100) + (f22 * bVar2.p(j97 + j94)));
                    j95 += j17;
                    f17 = f22;
                    j92 = j98;
                }
                j92 += j17;
                f20 = f21;
            }
            j84 += j17;
            f14 = f16;
            f15 = f19;
            j83 = j91;
        }
        for (long j101 = j17; j101 < j24; j101 += j17) {
            long j102 = j101 * j13;
            for (long j103 = 0; j103 < j13; j103 += j17) {
                long j104 = j15 + j103;
                bVar2.r(j104, bVar2.p(j104) + bVar2.p(j104 + j102));
            }
        }
        long j105 = j17;
        while (j105 < j24) {
            long j106 = j105 * j12 * j20;
            long j107 = (j11 - j105) * j12 * j20;
            long j108 = 0;
            while (j108 < j12) {
                long j109 = j108 * j20;
                long j110 = j15 + j109;
                long j111 = j14 + j109;
                long j112 = j105;
                float fP11 = bVar3.p(j111 + j106);
                float fP12 = bVar3.p(j111 + j107);
                bVar2.r(j110 + j106, fP11 - fP12);
                bVar2.r(j110 + j107, fP11 + fP12);
                j108 += j17;
                j105 = j112;
            }
            j105 += j17;
        }
        if (i10 == 0) {
            return;
        }
        int i14 = (j18 > j12 ? 1 : (j18 == j12 ? 0 : -1));
        if (i14 >= 0) {
            long j113 = j17;
            while (j113 < j24) {
                long j114 = j113 * j12 * j20;
                long j115 = (j11 - j113) * j12 * j20;
                long j116 = 0;
                while (j116 < j12) {
                    long j117 = j116 * j20;
                    long j118 = j19;
                    while (j118 < j20) {
                        long j119 = j15 + j118 + j117;
                        int i15 = i14;
                        long j120 = j119 + j114;
                        long j121 = j113;
                        long j122 = j119 + j115;
                        long j123 = j14 + j118 + j117;
                        long j124 = j115;
                        long j125 = j123 + j114;
                        long j126 = j114;
                        long j127 = j123 + j124;
                        long j128 = j116;
                        float fP13 = bVar3.p(j125 - j17);
                        float fP14 = bVar3.p(j125);
                        float fP15 = bVar3.p(j127 - j17);
                        float fP16 = bVar3.p(j127);
                        bVar2.r(j120 - j17, fP13 - fP16);
                        bVar2.r(j122 - j17, fP13 + fP16);
                        bVar2.r(j120, fP14 + fP15);
                        bVar2.r(j122, fP14 - fP15);
                        j118 += j19;
                        j115 = j124;
                        j116 = j128;
                        i14 = i15;
                        j113 = j121;
                        j114 = j126;
                    }
                    j116 += j17;
                }
                j113 += j17;
            }
            i11 = i14;
        } else {
            i11 = i14;
            long j129 = j17;
            while (j129 < j24) {
                long j130 = j129 * j12 * j20;
                long j131 = (j11 - j129) * j12 * j20;
                long j132 = j19;
                while (j132 < j20) {
                    long j133 = j15 + j132;
                    long j134 = j14 + j132;
                    long j135 = 0;
                    while (j135 < j12) {
                        long j136 = j135 * j20;
                        long j137 = j133 + j136;
                        long j138 = j129;
                        long j139 = j137 + j130;
                        long j140 = j131;
                        long j141 = j137 + j140;
                        long j142 = j134 + j136;
                        long j143 = j130;
                        long j144 = j142 + j143;
                        long j145 = j132;
                        long j146 = j142 + j140;
                        long j147 = j133;
                        float fP17 = bVar3.p(j144 - j17);
                        float fP18 = bVar3.p(j144);
                        float fP19 = bVar3.p(j146 - j17);
                        float fP20 = bVar3.p(j146);
                        bVar2.r(j139 - j17, fP17 - fP20);
                        bVar2.r(j141 - j17, fP17 + fP20);
                        bVar2.r(j139, fP18 + fP19);
                        bVar2.r(j141, fP18 - fP19);
                        j135 += j17;
                        bVar3 = bVar;
                        j133 = j147;
                        j130 = j143;
                        j129 = j138;
                        j131 = j140;
                        j132 = j145;
                    }
                    j132 += j19;
                    bVar3 = bVar;
                }
                j129 += j17;
                bVar3 = bVar;
            }
            bVar3 = bVar;
        }
        vp.e.a(bVar2, j15, bVar3, j14, j13);
        for (long j148 = j17; j148 < j11; j148 += j17) {
            long j149 = j148 * j12 * j20;
            for (long j150 = 0; j150 < j12; j150 += j17) {
                long j151 = (j150 * j20) + j149;
                bVar3.r(j14 + j151, bVar2.p(j15 + j151));
            }
        }
        if (i11 > 0) {
            long j152 = -j20;
            long j153 = j17;
            while (j153 < j11) {
                j152 += j20;
                long j154 = j153 * j12 * j20;
                long j155 = 0;
                while (j155 < j12) {
                    long j156 = j152 - j17;
                    long j157 = (j155 * j20) + j154;
                    long j158 = j19;
                    while (j158 < j20) {
                        j156 += j19;
                        long j159 = j156 + j16;
                        long j160 = j152;
                        long j161 = j153;
                        float fP21 = aVar.f44913p.p(j159 - j17);
                        float fP22 = aVar.f44913p.p(j159);
                        long j162 = j14 + j158 + j157;
                        long j163 = j15 + j158 + j157;
                        float fP23 = bVar2.p(j163 - j17);
                        float fP24 = bVar2.p(j163);
                        bVar3.r(j162 - j17, (fP21 * fP23) - (fP22 * fP24));
                        bVar3.r(j162, (fP24 * fP21) + (fP22 * fP23));
                        j158 += j19;
                        aVar = this;
                        j20 = j10;
                        j152 = j160;
                        j153 = j161;
                    }
                    j155 += j17;
                    aVar = this;
                    j20 = j10;
                }
                j153 += j17;
                aVar = this;
                j20 = j10;
            }
            return;
        }
        long j164 = -j20;
        long j165 = j17;
        while (j165 < j11) {
            j164 += j20;
            long j166 = j164 - j17;
            long j167 = j165 * j12 * j20;
            long j168 = j19;
            while (j168 < j20) {
                j166 += j19;
                long j169 = j164;
                long j170 = j166 + j16;
                long j171 = j165;
                float fP25 = aVar.f44913p.p(j170 - j17);
                float fP26 = aVar.f44913p.p(j170);
                long j172 = j14 + j168;
                long j173 = j15 + j168;
                long j174 = 0;
                while (j174 < j12) {
                    long j175 = (j174 * j20) + j167;
                    float f23 = fP26;
                    long j176 = j172 + j175;
                    float f24 = fP25;
                    long j177 = j173 + j175;
                    long j178 = j166;
                    float fP27 = bVar2.p(j177 - j17);
                    float fP28 = bVar2.p(j177);
                    bVar3.r(j176 - j17, (f24 * fP27) - (f23 * fP28));
                    bVar3.r(j176, (f24 * fP28) + (f23 * fP27));
                    j174 += j17;
                    fP25 = f24;
                    fP26 = f23;
                    j166 = j178;
                }
                j168 += j19;
                j164 = j169;
                j165 = j171;
            }
            j165 += j17;
        }
    }

    void Q(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        int i15 = i11 * i10;
        int i16 = i10 * 2;
        for (int i17 = 0; i17 < i11; i17++) {
            int i18 = i13 + (i17 * i16);
            int i19 = i12 + (i17 * i10);
            int i20 = i19 + i15;
            float f10 = fArr[i19];
            float f11 = fArr[i20];
            fArr2[i18] = f10 + f11;
            fArr2[(i18 + i16) - 1] = f10 - f11;
        }
        int i21 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            for (int i22 = 0; i22 < i11; i22++) {
                i16 = i22 * i10;
                int i23 = i16 * 2;
                int i24 = i23 + i10;
                int i25 = i16 + i15;
                int i26 = i21;
                while (i26 < i10) {
                    int i27 = (i26 - 1) + i14;
                    int i28 = i13 + i26 + i23;
                    int i29 = i13 + (i10 - i26) + i24;
                    int i30 = i12 + i26;
                    int i31 = i30 + i16;
                    int i32 = i30 + i25;
                    float f12 = fArr[i31 - 1];
                    float f13 = fArr[i31];
                    float f14 = fArr[i32 - 1];
                    float f15 = fArr[i32];
                    int i33 = i21;
                    float[] fArr3 = this.f44912o;
                    float f16 = fArr3[i27 - 1];
                    float f17 = fArr3[i27];
                    float f18 = (f16 * f14) + (f17 * f15);
                    float f19 = (f16 * f15) - (f17 * f14);
                    fArr2[i28] = f13 + f19;
                    fArr2[i28 - 1] = f12 + f18;
                    fArr2[i29] = f19 - f13;
                    fArr2[i29 - 1] = f12 - f18;
                    i26 += 2;
                    i21 = i33;
                }
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        int i34 = i16 * 2;
        for (int i35 = 0; i35 < i11; i35++) {
            int i36 = i13 + i34 + i10;
            int i37 = ((i12 + i10) - 1) + (i35 * i10);
            fArr2[i36] = -fArr[i37 + i15];
            fArr2[i36 - 1] = fArr[i37];
        }
    }

    void R(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        long j15 = j11 * j10;
        long j16 = 2;
        long j17 = j10 * 2;
        long j18 = 0;
        while (j18 < j11) {
            long j19 = j16;
            long j20 = j13 + (j18 * j17);
            long j21 = j12 + (j18 * j10);
            long j22 = j15;
            float fP = bVar.p(j21);
            float fP2 = bVar.p(j21 + j22);
            bVar2.r(j20, fP + fP2);
            bVar2.r((j20 + j17) - 1, fP - fP2);
            j18++;
            j15 = j22;
            j16 = j19;
        }
        long j23 = j15;
        long j24 = j16;
        if (j10 < j24) {
            return;
        }
        if (j10 != j24) {
            long j25 = 0;
            while (j25 < j11) {
                j17 = j25 * j10;
                long j26 = j17 * j24;
                long j27 = j26 + j10;
                long j28 = j17 + j23;
                long j29 = j24;
                while (j29 < j10) {
                    long j30 = j25;
                    long j31 = (j29 - 1) + j14;
                    long j32 = j26;
                    long j33 = j13 + j29 + j32;
                    long j34 = j17;
                    long j35 = j13 + (j10 - j29) + j27;
                    long j36 = j12 + j29;
                    long j37 = j27;
                    long j38 = j36 + j34;
                    long j39 = j28;
                    long j40 = j36 + j39;
                    long j41 = j29;
                    float fP3 = bVar.p(j38 - 1);
                    float fP4 = bVar.p(j38);
                    float fP5 = bVar.p(j40 - 1);
                    float fP6 = bVar.p(j40);
                    float fP7 = this.f44913p.p(j31 - 1);
                    float fP8 = this.f44913p.p(j31);
                    float f10 = (fP7 * fP5) + (fP8 * fP6);
                    float f11 = (fP7 * fP6) - (fP8 * fP5);
                    bVar2.r(j33, fP4 + f11);
                    bVar2.r(j33 - 1, fP3 + f10);
                    bVar2.r(j35, f11 - fP4);
                    bVar2.r(j35 - 1, fP3 - f10);
                    j29 = j41 + j24;
                    j17 = j34;
                    j25 = j30;
                    j26 = j32;
                    j27 = j37;
                    j28 = j39;
                }
                j25++;
            }
            if (j10 % j24 == 1) {
                return;
            }
        }
        long j42 = j17 * j24;
        for (long j43 = 0; j43 < j11; j43++) {
            long j44 = j13 + j42 + j10;
            long j45 = ((j12 + j10) - 1) + (j43 * j10);
            bVar2.r(j44, -bVar.p(j45 + j23));
            bVar2.r(j44 - 1, bVar.p(j45));
        }
    }

    void S(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        float f10;
        float f11;
        int i15 = i14 + i10;
        int i16 = i11 * i10;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            f10 = -0.5f;
            f11 = 0.8660254f;
            if (i18 >= i11) {
                break;
            }
            int i19 = i18 * i10;
            int i20 = ((i18 * 3) + 1) * i10;
            int i21 = i12 + i19;
            int i22 = i21 + i16;
            int i23 = (i16 * 2) + i21;
            float f12 = fArr[i21];
            float f13 = fArr[i22];
            float f14 = fArr[i23];
            float f15 = f13 + f14;
            fArr2[i13 + (i19 * 3)] = f12 + f15;
            fArr2[i13 + i20 + i10] = (f14 - f13) * 0.8660254f;
            fArr2[((i13 + i10) - 1) + i20] = f12 + (f15 * (-0.5f));
            i18++;
        }
        if (i10 != 1) {
            while (i17 < i11) {
                int i24 = i17 * i10;
                int i25 = i24 * 3;
                int i26 = i24 + i16;
                int i27 = i26 + i16;
                int i28 = i25 + i10;
                int i29 = i28 + i10;
                int i30 = 2;
                while (i30 < i10) {
                    int i31 = i30 - 1;
                    int i32 = i31 + i14;
                    int i33 = i31 + i15;
                    float f16 = f10;
                    float f17 = f11;
                    float[] fArr3 = this.f44912o;
                    float f18 = fArr3[i32 - 1];
                    float f19 = fArr3[i32];
                    float f20 = fArr3[i33 - 1];
                    float f21 = fArr3[i33];
                    int i34 = i12 + i30;
                    int i35 = i13 + i30;
                    int i36 = i34 + i24;
                    int i37 = i34 + i26;
                    int i38 = i34 + i27;
                    float f22 = fArr[i36 - 1];
                    float f23 = fArr[i36];
                    float f24 = fArr[i37 - 1];
                    float f25 = fArr[i37];
                    float f26 = fArr[i38 - 1];
                    float f27 = fArr[i38];
                    float f28 = (f18 * f24) + (f19 * f25);
                    float f29 = (f18 * f25) - (f19 * f24);
                    float f30 = (f20 * f26) + (f21 * f27);
                    float f31 = (f20 * f27) - (f21 * f26);
                    float f32 = f28 + f30;
                    float f33 = f29 + f31;
                    float f34 = f22 + (f32 * f16);
                    float f35 = f23 + (f33 * f16);
                    float f36 = (f29 - f31) * f17;
                    float f37 = (f30 - f28) * f17;
                    int i39 = i35 + i25;
                    int i40 = i13 + (i10 - i30) + i28;
                    int i41 = i35 + i29;
                    fArr2[i39 - 1] = f22 + f32;
                    fArr2[i39] = f23 + f33;
                    fArr2[i40 - 1] = f34 - f36;
                    fArr2[i40] = f37 - f35;
                    fArr2[i41 - 1] = f34 + f36;
                    fArr2[i41] = f35 + f37;
                    i30 += 2;
                    f10 = f16;
                    f11 = f17;
                }
                i17++;
                f10 = f10;
            }
        }
    }

    void T(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        vp.b bVar3 = bVar;
        long j15 = j14 + j10;
        long j16 = j11 * j10;
        for (long j17 = 0; j17 < j11; j17++) {
            long j18 = j17 * j10;
            long j19 = ((j17 * 3) + 1) * j10;
            long j20 = j12 + j18;
            long j21 = j20 + j16;
            long j22 = j20 + (2 * j16);
            float fP = bVar3.p(j20);
            float fP2 = bVar3.p(j21);
            float fP3 = bVar3.p(j22);
            float f10 = fP2 + fP3;
            bVar2.r(j13 + (j18 * 3), fP + f10);
            bVar2.r(j13 + j19 + j10, (fP3 - fP2) * 0.8660254f);
            bVar2.r(((j13 + j10) - 1) + j19, fP + (f10 * (-0.5f)));
        }
        if (j10 == 1) {
            return;
        }
        long j23 = 0;
        while (j23 < j11) {
            long j24 = j23 * j10;
            long j25 = j24 * 3;
            long j26 = j24 + j16;
            long j27 = j26 + j16;
            long j28 = j25 + j10;
            long j29 = j28 + j10;
            long j30 = 2;
            while (j30 < j10) {
                long j31 = j30 - 1;
                long j32 = j15;
                long j33 = j31 + j14;
                long j34 = j16;
                long j35 = j31 + j32;
                long j36 = j23;
                float fP4 = this.f44913p.p(j33 - 1);
                float fP5 = this.f44913p.p(j33);
                float fP6 = this.f44913p.p(j35 - 1);
                float fP7 = this.f44913p.p(j35);
                long j37 = j12 + j30;
                long j38 = j13 + j30;
                long j39 = j37 + j24;
                long j40 = j37 + j26;
                long j41 = j37 + j27;
                long j42 = j24;
                float fP8 = bVar3.p(j39 - 1);
                float fP9 = bVar3.p(j39);
                float fP10 = bVar3.p(j40 - 1);
                float fP11 = bVar3.p(j40);
                float fP12 = bVar3.p(j41 - 1);
                float fP13 = bVar3.p(j41);
                float f11 = (fP4 * fP10) + (fP5 * fP11);
                float f12 = (fP11 * fP4) - (fP10 * fP5);
                float f13 = (fP6 * fP12) + (fP7 * fP13);
                float f14 = (fP13 * fP6) - (fP12 * fP7);
                float f15 = f11 + f13;
                float f16 = f12 + f14;
                float f17 = (f15 * (-0.5f)) + fP8;
                float f18 = fP9 + (f16 * (-0.5f));
                float f19 = (f12 - f14) * 0.8660254f;
                float f20 = (f13 - f11) * 0.8660254f;
                long j43 = j38 + j25;
                long j44 = j13 + (j10 - j30) + j28;
                long j45 = j38 + j29;
                bVar2.r(j43 - 1, fP8 + f15);
                bVar2.r(j43, fP9 + f16);
                bVar2.r(j44 - 1, f17 - f19);
                bVar2.r(j44, f20 - f18);
                bVar2.r(j45 - 1, f17 + f19);
                bVar2.r(j45, f18 + f20);
                j30 += 2;
                this = this;
                bVar3 = bVar;
                j23 = j36;
                j15 = j32;
                j16 = j34;
                j24 = j42;
            }
            j23++;
            bVar3 = bVar;
        }
    }

    void U(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i11 * i10;
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i18 * i10;
            int i20 = i19 * 4;
            int i21 = i19 + i17;
            int i22 = i21 + i17;
            int i23 = i22 + i17;
            float f10 = fArr[i12 + i19];
            float f11 = fArr[i12 + i21];
            float f12 = fArr[i12 + i22];
            float f13 = fArr[i12 + i23];
            float f14 = f11 + f13;
            float f15 = f10 + f12;
            int i24 = i13 + i20 + i10 + i10;
            fArr2[i13 + i20] = f14 + f15;
            int i25 = i24 - 1;
            fArr2[i25 + i10 + i10] = f15 - f14;
            fArr2[i25] = f10 - f12;
            fArr2[i24] = f13 - f11;
        }
        int i26 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i27 = 0;
            while (i27 < i11) {
                int i28 = i27 * i10;
                int i29 = i28 + i17;
                int i30 = i29 + i17;
                int i31 = i30 + i17;
                int i32 = i28 * 4;
                int i33 = i32 + i10;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                for (int i36 = i26; i36 < i10; i36 += 2) {
                    int i37 = i36 - 1;
                    int i38 = i37 + i14;
                    int i39 = i37 + i15;
                    int i40 = i37 + i16;
                    float[] fArr3 = this.f44912o;
                    float f16 = fArr3[i38 - 1];
                    float f17 = fArr3[i38];
                    float f18 = fArr3[i39 - 1];
                    float f19 = fArr3[i39];
                    float f20 = fArr3[i40 - 1];
                    float f21 = fArr3[i40];
                    int i41 = i12 + i36;
                    int i42 = i13 + i36;
                    int i43 = i13 + (i10 - i36);
                    int i44 = i41 + i28;
                    int i45 = i41 + i29;
                    int i46 = i41 + i30;
                    int i47 = i41 + i31;
                    float f22 = fArr[i44 - 1];
                    float f23 = fArr[i44];
                    float f24 = fArr[i45 - 1];
                    float f25 = fArr[i45];
                    float f26 = fArr[i46 - 1];
                    float f27 = fArr[i46];
                    float f28 = fArr[i47 - 1];
                    float f29 = fArr[i47];
                    float f30 = (f16 * f24) + (f17 * f25);
                    float f31 = (f16 * f25) - (f17 * f24);
                    float f32 = (f18 * f26) + (f19 * f27);
                    float f33 = (f18 * f27) - (f19 * f26);
                    float f34 = (f20 * f28) + (f21 * f29);
                    float f35 = (f20 * f29) - (f21 * f28);
                    float f36 = f30 + f34;
                    float f37 = f34 - f30;
                    float f38 = f31 + f35;
                    float f39 = f31 - f35;
                    float f40 = f23 + f33;
                    float f41 = f23 - f33;
                    float f42 = f22 + f32;
                    float f43 = f22 - f32;
                    int i48 = i42 + i32;
                    int i49 = i43 + i33;
                    int i50 = i42 + i34;
                    int i51 = i43 + i35;
                    fArr2[i48 - 1] = f36 + f42;
                    fArr2[i51 - 1] = f42 - f36;
                    fArr2[i48] = f38 + f40;
                    fArr2[i51] = f38 - f40;
                    fArr2[i50 - 1] = f39 + f43;
                    fArr2[i49 - 1] = f43 - f39;
                    fArr2[i50] = f37 + f41;
                    fArr2[i49] = f37 - f41;
                }
                i27++;
                i26 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        for (int i52 = 0; i52 < i11; i52++) {
            int i53 = i52 * i10;
            int i54 = i53 * 4;
            int i55 = i53 + i17;
            int i56 = i55 + i17;
            int i57 = i56 + i17;
            int i58 = i54 + i10;
            int i59 = i58 + i10;
            int i60 = (i12 + i10) - 1;
            float f44 = fArr[i53 + i60];
            float f45 = fArr[i55 + i60];
            float f46 = fArr[i56 + i60];
            float f47 = fArr[i60 + i57];
            float f48 = (f45 + f47) * (-0.70710677f);
            float f49 = (f45 - f47) * 0.70710677f;
            int i61 = (i13 + i10) - 1;
            fArr2[i54 + i61] = f49 + f44;
            fArr2[i61 + i59] = f44 - f49;
            fArr2[i13 + i58] = f48 - f46;
            fArr2[i13 + i59 + i10] = f48 + f46;
        }
    }

    void V(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        long j15;
        long j16;
        long j17 = j14 + j10;
        long j18 = j17 + j10;
        long j19 = j11 * j10;
        long j20 = 0;
        while (true) {
            j15 = 4;
            if (j20 >= j11) {
                break;
            }
            long j21 = j20 * j10;
            long j22 = 4 * j21;
            long j23 = j21 + j19;
            long j24 = j23 + j19;
            float fP = bVar.p(j12 + j21);
            long j25 = j17;
            float fP2 = bVar.p(j12 + j23);
            float fP3 = bVar.p(j12 + j24);
            float fP4 = bVar.p(j12 + j24 + j19);
            float f10 = fP2 + fP4;
            float f11 = fP + fP3;
            long j26 = j13 + j22 + j10 + j10;
            long j27 = j18;
            bVar2.r(j13 + j22, f10 + f11);
            long j28 = j26 - 1;
            bVar2.r(j28 + j10 + j10, f11 - f10);
            bVar2.r(j28, fP - fP3);
            bVar2.r(j26, fP4 - fP2);
            j20++;
            j17 = j25;
            j18 = j27;
            j19 = j19;
        }
        long j29 = j17;
        long j30 = j18;
        long j31 = j19;
        long j32 = 2;
        if (j10 < 2) {
            return;
        }
        if (j10 != 2) {
            long j33 = 0;
            while (j33 < j11) {
                long j34 = j33 * j10;
                long j35 = j34 + j31;
                long j36 = j35 + j31;
                long j37 = j36 + j31;
                long j38 = j34 * j15;
                long j39 = j38 + j10;
                long j40 = j39 + j10;
                long j41 = j40 + j10;
                long j42 = j32;
                while (j42 < j10) {
                    long j43 = j42 - 1;
                    long j44 = j32;
                    long j45 = j43 + j14;
                    long j46 = j15;
                    long j47 = j43 + j29;
                    long j48 = j33;
                    long j49 = j43 + j30;
                    long j50 = j34;
                    float fP5 = this.f44913p.p(j45 - 1);
                    float fP6 = this.f44913p.p(j45);
                    float fP7 = this.f44913p.p(j47 - 1);
                    float fP8 = this.f44913p.p(j47);
                    float fP9 = this.f44913p.p(j49 - 1);
                    float fP10 = this.f44913p.p(j49);
                    long j51 = j12 + j42;
                    long j52 = j13 + j42;
                    long j53 = j13 + (j10 - j42);
                    long j54 = j51 + j50;
                    long j55 = j51 + j35;
                    long j56 = j51 + j36;
                    long j57 = j51 + j37;
                    long j58 = j35;
                    float fP11 = bVar.p(j54 - 1);
                    float fP12 = bVar.p(j54);
                    float fP13 = bVar.p(j55 - 1);
                    float fP14 = bVar.p(j55);
                    float fP15 = bVar.p(j56 - 1);
                    float fP16 = bVar.p(j56);
                    float fP17 = bVar.p(j57 - 1);
                    float fP18 = bVar.p(j57);
                    float f12 = (fP5 * fP13) + (fP6 * fP14);
                    float f13 = (fP14 * fP5) - (fP13 * fP6);
                    float f14 = (fP7 * fP15) + (fP8 * fP16);
                    float f15 = (fP16 * fP7) - (fP15 * fP8);
                    float f16 = (fP9 * fP17) + (fP10 * fP18);
                    float f17 = (fP18 * fP9) - (fP17 * fP10);
                    float f18 = f12 + f16;
                    float f19 = f16 - f12;
                    float f20 = f13 + f17;
                    float f21 = f13 - f17;
                    float f22 = fP12 + f15;
                    float f23 = fP12 - f15;
                    float f24 = fP11 + f14;
                    float f25 = fP11 - f14;
                    long j59 = j52 + j38;
                    long j60 = j53 + j39;
                    long j61 = j52 + j40;
                    long j62 = j53 + j41;
                    bVar2.r(j59 - 1, f18 + f24);
                    bVar2.r(j62 - 1, f24 - f18);
                    bVar2.r(j59, f20 + f22);
                    bVar2.r(j62, f20 - f22);
                    bVar2.r(j61 - 1, f21 + f25);
                    bVar2.r(j60 - 1, f25 - f21);
                    bVar2.r(j61, f19 + f23);
                    bVar2.r(j60, f19 - f23);
                    j42 += j44;
                    this = this;
                    j34 = j50;
                    j32 = j44;
                    j15 = j46;
                    j33 = j48;
                    j35 = j58;
                }
                j33++;
            }
            j16 = j15;
            if (j10 % j32 == 1) {
                return;
            }
        } else {
            j16 = 4;
        }
        for (long j63 = 0; j63 < j11; j63++) {
            long j64 = j63 * j10;
            long j65 = j64 * j16;
            long j66 = j64 + j31;
            long j67 = j66 + j31;
            long j68 = j65 + j10;
            long j69 = j68 + j10;
            long j70 = (j12 + j10) - 1;
            float fP19 = bVar.p(j70 + j64);
            float fP20 = bVar.p(j70 + j66);
            float fP21 = bVar.p(j70 + j67);
            float fP22 = bVar.p(j70 + j67 + j31);
            float f26 = (fP20 + fP22) * (-0.70710677f);
            float f27 = (fP20 - fP22) * 0.70710677f;
            long j71 = (j13 + j10) - 1;
            bVar2.r(j71 + j65, f27 + fP19);
            bVar2.r(j71 + j69, fP19 - f27);
            bVar2.r(j13 + j68, f26 - fP21);
            bVar2.r(j13 + j69 + j10, f26 + fP21);
        }
    }

    void W(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14) {
        float f10;
        float f11;
        float f12;
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i16 + i10;
        int i18 = i11 * i10;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            f10 = 0.58778524f;
            f11 = 0.95105654f;
            f12 = -0.809017f;
            if (i20 >= i11) {
                break;
            }
            int i21 = i20 * i10;
            int i22 = i21 * 5;
            int i23 = i22 + i10;
            int i24 = i23 + i10;
            int i25 = i24 + i10;
            int i26 = i21 + i18;
            int i27 = i26 + i18;
            int i28 = i27 + i18;
            int i29 = (i13 + i10) - 1;
            float f13 = fArr[i12 + i21];
            float f14 = fArr[i12 + i26];
            float f15 = fArr[i12 + i27];
            float f16 = fArr[i12 + i28];
            float f17 = fArr[i12 + i28 + i18];
            float f18 = f17 + f14;
            float f19 = f17 - f14;
            float f20 = f16 + f15;
            float f21 = f16 - f15;
            fArr2[i13 + i22] = f13 + f18 + f20;
            fArr2[i29 + i23] = (f18 * 0.309017f) + f13 + (f20 * (-0.809017f));
            fArr2[i13 + i24] = (f19 * 0.95105654f) + (f21 * 0.58778524f);
            fArr2[i29 + i25] = f13 + (f18 * (-0.809017f)) + (f20 * 0.309017f);
            fArr2[i13 + i25 + i10] = (f19 * 0.58778524f) - (f21 * 0.95105654f);
            i20++;
        }
        if (i10 != 1) {
            while (i19 < i11) {
                int i30 = i19 * i10;
                int i31 = i30 * 5;
                int i32 = i31 + i10;
                int i33 = i32 + i10;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                int i36 = i30 + i18;
                int i37 = i36 + i18;
                int i38 = i37 + i18;
                int i39 = i38 + i18;
                float f22 = f10;
                int i40 = 2;
                while (i40 < i10) {
                    int i41 = i40 - 1;
                    int i42 = i41 + i14;
                    int i43 = i41 + i15;
                    int i44 = i41 + i16;
                    int i45 = i41 + i17;
                    float f23 = f11;
                    float f24 = f12;
                    float[] fArr3 = this.f44912o;
                    float f25 = fArr3[i42 - 1];
                    float f26 = fArr3[i42];
                    float f27 = fArr3[i43 - 1];
                    float f28 = fArr3[i43];
                    float f29 = fArr3[i44 - 1];
                    float f30 = fArr3[i44];
                    float f31 = fArr3[i45 - 1];
                    float f32 = fArr3[i45];
                    int i46 = i12 + i40;
                    int i47 = i13 + i40;
                    int i48 = i13 + (i10 - i40);
                    int i49 = i46 + i30;
                    int i50 = i46 + i36;
                    int i51 = i46 + i37;
                    int i52 = i46 + i38;
                    int i53 = i46 + i39;
                    float f33 = fArr[i49 - 1];
                    float f34 = fArr[i49];
                    float f35 = fArr[i50 - 1];
                    float f36 = fArr[i50];
                    float f37 = fArr[i51 - 1];
                    float f38 = fArr[i51];
                    float f39 = fArr[i52 - 1];
                    float f40 = fArr[i52];
                    float f41 = fArr[i53 - 1];
                    float f42 = fArr[i53];
                    float f43 = (f25 * f35) + (f26 * f36);
                    float f44 = (f25 * f36) - (f26 * f35);
                    float f45 = (f27 * f37) + (f28 * f38);
                    float f46 = (f27 * f38) - (f28 * f37);
                    float f47 = (f29 * f39) + (f30 * f40);
                    float f48 = (f29 * f40) - (f30 * f39);
                    float f49 = (f31 * f41) + (f32 * f42);
                    float f50 = (f31 * f42) - (f32 * f41);
                    float f51 = f43 + f49;
                    float f52 = f49 - f43;
                    float f53 = f44 - f50;
                    float f54 = f44 + f50;
                    float f55 = f45 + f47;
                    float f56 = f47 - f45;
                    float f57 = f46 - f48;
                    float f58 = f46 + f48;
                    float f59 = f33 + (f51 * 0.309017f) + (f55 * f24);
                    float f60 = f34 + (f54 * 0.309017f) + (f58 * f24);
                    float f61 = f33 + (f51 * f24) + (f55 * 0.309017f);
                    float f62 = f34 + (f54 * f24) + (f58 * 0.309017f);
                    float f63 = (f53 * f23) + (f57 * f22);
                    float f64 = (f52 * f23) + (f56 * f22);
                    float f65 = (f53 * f22) - (f57 * f23);
                    float f66 = (f52 * f22) - (f56 * f23);
                    int i54 = i47 + i31;
                    int i55 = i48 + i32;
                    int i56 = i47 + i33;
                    int i57 = i48 + i34;
                    int i58 = i47 + i35;
                    fArr2[i54 - 1] = f33 + f51 + f55;
                    fArr2[i54] = f34 + f54 + f58;
                    fArr2[i56 - 1] = f59 + f63;
                    fArr2[i55 - 1] = f59 - f63;
                    fArr2[i56] = f60 + f64;
                    fArr2[i55] = f64 - f60;
                    fArr2[i58 - 1] = f61 + f65;
                    fArr2[i57 - 1] = f61 - f65;
                    fArr2[i58] = f62 + f66;
                    fArr2[i57] = f66 - f62;
                    i40 += 2;
                    f11 = f23;
                    f12 = f24;
                }
                i19++;
                f10 = f22;
                f11 = f11;
            }
        }
    }

    void X(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14) {
        vp.b bVar3 = bVar;
        long j15 = j14 + j10;
        long j16 = j15 + j10;
        long j17 = j16 + j10;
        long j18 = j11 * j10;
        long j19 = 0;
        while (j19 < j11) {
            long j20 = j19 * j10;
            long j21 = 5 * j20;
            long j22 = j21 + j10;
            long j23 = j22 + j10;
            long j24 = j23 + j10;
            long j25 = j20 + j18;
            long j26 = j25 + j18;
            long j27 = j26 + j18;
            long j28 = (j13 + j10) - 1;
            float fP = bVar3.p(j12 + j20);
            long j29 = j15;
            float fP2 = bVar3.p(j12 + j25);
            float fP3 = bVar3.p(j12 + j26);
            float fP4 = bVar3.p(j12 + j27);
            float fP5 = bVar3.p(j12 + j27 + j18);
            float f10 = fP5 + fP2;
            float f11 = fP5 - fP2;
            float f12 = fP4 + fP3;
            float f13 = fP4 - fP3;
            bVar2.r(j13 + j21, fP + f10 + f12);
            bVar2.r(j28 + j22, (f10 * 0.309017f) + fP + (f12 * (-0.809017f)));
            bVar2.r(j13 + j23, (f11 * 0.95105654f) + (f13 * 0.58778524f));
            bVar2.r(j28 + j24, fP + (f10 * (-0.809017f)) + (f12 * 0.309017f));
            bVar2.r(j13 + j24 + j10, (f11 * 0.58778524f) - (f13 * 0.95105654f));
            j19++;
            j15 = j29;
            j16 = j16;
        }
        long j30 = j15;
        long j31 = j16;
        if (j10 == 1) {
            return;
        }
        long j32 = 0;
        while (j32 < j11) {
            long j33 = j32 * j10;
            long j34 = j33 * 5;
            long j35 = j34 + j10;
            long j36 = j35 + j10;
            long j37 = j36 + j10;
            long j38 = j37 + j10;
            long j39 = j33 + j18;
            long j40 = j39 + j18;
            long j41 = j40 + j18;
            long j42 = j41 + j18;
            long j43 = 2;
            while (j43 < j10) {
                long j44 = j43 - 1;
                long j45 = j33;
                long j46 = j44 + j14;
                long j47 = j34;
                long j48 = j44 + j30;
                long j49 = j17;
                long j50 = j44 + j31;
                long j51 = j18;
                long j52 = j44 + j49;
                long j53 = j32;
                float fP6 = this.f44913p.p(j46 - 1);
                float fP7 = this.f44913p.p(j46);
                float fP8 = this.f44913p.p(j48 - 1);
                float fP9 = this.f44913p.p(j48);
                float fP10 = this.f44913p.p(j50 - 1);
                float fP11 = this.f44913p.p(j50);
                float fP12 = this.f44913p.p(j52 - 1);
                float fP13 = this.f44913p.p(j52);
                long j54 = j12 + j43;
                long j55 = j13 + j43;
                long j56 = j13 + (j10 - j43);
                long j57 = j54 + j45;
                long j58 = j54 + j39;
                long j59 = j54 + j40;
                long j60 = j54 + j41;
                long j61 = j54 + j42;
                long j62 = j35;
                float fP14 = bVar3.p(j57 - 1);
                float fP15 = bVar3.p(j57);
                float fP16 = bVar3.p(j58 - 1);
                float fP17 = bVar3.p(j58);
                float fP18 = bVar3.p(j59 - 1);
                float fP19 = bVar3.p(j59);
                float fP20 = bVar3.p(j60 - 1);
                float fP21 = bVar3.p(j60);
                float fP22 = bVar3.p(j61 - 1);
                float fP23 = bVar3.p(j61);
                float f14 = (fP6 * fP16) + (fP7 * fP17);
                float f15 = (fP17 * fP6) - (fP16 * fP7);
                float f16 = (fP8 * fP18) + (fP9 * fP19);
                float f17 = (fP19 * fP8) - (fP18 * fP9);
                float f18 = (fP10 * fP20) + (fP11 * fP21);
                float f19 = (fP21 * fP10) - (fP20 * fP11);
                float f20 = (fP12 * fP22) + (fP13 * fP23);
                float f21 = (fP23 * fP12) - (fP22 * fP13);
                float f22 = f14 + f20;
                float f23 = f20 - f14;
                float f24 = f15 - f21;
                float f25 = f15 + f21;
                float f26 = f16 + f18;
                float f27 = f18 - f16;
                float f28 = f17 - f19;
                float f29 = f17 + f19;
                float f30 = (f22 * 0.309017f) + fP14 + (f26 * (-0.809017f));
                float f31 = (f25 * 0.309017f) + fP15 + (f29 * (-0.809017f));
                float f32 = (f22 * (-0.809017f)) + fP14 + (f26 * 0.309017f);
                float f33 = fP15 + (f25 * (-0.809017f)) + (f29 * 0.309017f);
                float f34 = (f24 * 0.95105654f) + (f28 * 0.58778524f);
                float f35 = (f23 * 0.95105654f) + (f27 * 0.58778524f);
                float f36 = (f24 * 0.58778524f) - (f28 * 0.95105654f);
                float f37 = (f23 * 0.58778524f) - (f27 * 0.95105654f);
                long j63 = j55 + j47;
                long j64 = j56 + j62;
                long j65 = j55 + j36;
                long j66 = j56 + j37;
                long j67 = j55 + j38;
                bVar2.r(j63 - 1, fP14 + f22 + f26);
                bVar2.r(j63, fP15 + f25 + f29);
                bVar2.r(j65 - 1, f30 + f34);
                bVar2.r(j64 - 1, f30 - f34);
                bVar2.r(j65, f31 + f35);
                bVar2.r(j64, f35 - f31);
                bVar2.r(j67 - 1, f32 + f36);
                bVar2.r(j66 - 1, f32 - f36);
                bVar2.r(j67, f33 + f37);
                bVar2.r(j66, f37 - f33);
                j43 += 2;
                this = this;
                bVar3 = bVar;
                j32 = j53;
                j33 = j45;
                j34 = j47;
                j17 = j49;
                j18 = j51;
                j35 = j62;
            }
            j32++;
            bVar3 = bVar;
        }
    }

    void Y(int i10, int i11, int i12, int i13, float[] fArr, int i14, float[] fArr2, int i15, int i16) {
        float f10;
        int i17;
        int i18;
        int i19 = i11;
        double d10 = 6.2831855f / i19;
        float fB = (float) bo.a.b(d10);
        float fL = (float) bo.a.l(d10);
        int i20 = (i19 + 1) / 2;
        int i21 = (i10 - 1) / 2;
        int i22 = 1;
        if (i10 != 1) {
            i17 = 2;
            for (int i23 = 0; i23 < i13; i23++) {
                fArr2[i15 + i23] = fArr[i14 + i23];
            }
            for (int i24 = 1; i24 < i19; i24++) {
                int i25 = i24 * i12 * i10;
                for (int i26 = 0; i26 < i12; i26++) {
                    int i27 = (i26 * i10) + i25;
                    fArr2[i15 + i27] = fArr[i14 + i27];
                }
            }
            if (i21 <= i12) {
                int i28 = -i10;
                int i29 = 1;
                while (i29 < i19) {
                    i28 += i10;
                    int i30 = i28 - 1;
                    int i31 = i29 * i12 * i10;
                    int i32 = i22;
                    int i33 = 2;
                    while (i33 < i10) {
                        i30 += 2;
                        int i34 = i30 + i16;
                        int i35 = i14 + i33;
                        int i36 = i15 + i33;
                        float f11 = fL;
                        float[] fArr3 = this.f44912o;
                        float f12 = fArr3[i34 - 1];
                        float f13 = fArr3[i34];
                        for (int i37 = 0; i37 < i12; i37++) {
                            int i38 = (i37 * i10) + i31;
                            int i39 = i36 + i38;
                            int i40 = i35 + i38;
                            float f14 = fArr[i40 - 1];
                            float f15 = fArr[i40];
                            fArr2[i39 - 1] = (f12 * f14) + (f13 * f15);
                            fArr2[i39] = (f15 * f12) - (f14 * f13);
                        }
                        i33 += 2;
                        fL = f11;
                    }
                    i29++;
                    i22 = i32;
                }
                f10 = fL;
                i18 = i22;
            } else {
                f10 = fL;
                i18 = 1;
                int i41 = -i10;
                int i42 = 1;
                while (i42 < i19) {
                    i41 += i10;
                    int i43 = i42 * i12 * i10;
                    for (int i44 = 0; i44 < i12; i44++) {
                        int i45 = i41 - 1;
                        int i46 = (i44 * i10) + i43;
                        int i47 = 2;
                        while (i47 < i10) {
                            i45 += 2;
                            int i48 = i45 + i16;
                            int i49 = i47;
                            float[] fArr4 = this.f44912o;
                            float f16 = fArr4[i48 - 1];
                            float f17 = fArr4[i48];
                            int i50 = i15 + i49 + i46;
                            int i51 = i14 + i49 + i46;
                            float f18 = fArr[i51 - 1];
                            float f19 = fArr[i51];
                            fArr2[i50 - 1] = (f16 * f18) + (f17 * f19);
                            fArr2[i50] = (f16 * f19) - (f17 * f18);
                            i47 = i49 + 2;
                        }
                    }
                    i42++;
                    i19 = i11;
                }
            }
            if (i21 >= i12) {
                for (int i52 = i18; i52 < i20; i52++) {
                    int i53 = i52 * i12 * i10;
                    int i54 = (i11 - i52) * i12 * i10;
                    for (int i55 = 0; i55 < i12; i55++) {
                        int i56 = i55 * i10;
                        int i57 = i56 + i53;
                        int i58 = i56 + i54;
                        for (int i59 = 2; i59 < i10; i59 += 2) {
                            int i60 = i14 + i59;
                            int i61 = i15 + i59;
                            int i62 = i60 + i57;
                            int i63 = i60 + i58;
                            int i64 = i61 + i57;
                            int i65 = i61 + i58;
                            float f20 = fArr2[i64 - 1];
                            float f21 = fArr2[i64];
                            float f22 = fArr2[i65 - 1];
                            float f23 = fArr2[i65];
                            fArr[i62 - 1] = f20 + f22;
                            fArr[i62] = f21 + f23;
                            fArr[i63 - 1] = f21 - f23;
                            fArr[i63] = f22 - f20;
                        }
                    }
                }
            } else {
                int i66 = i18;
                while (i66 < i20) {
                    int i67 = i66 * i12 * i10;
                    int i68 = (i11 - i66) * i12 * i10;
                    int i69 = 2;
                    while (i69 < i10) {
                        int i70 = i14 + i69;
                        int i71 = i15 + i69;
                        int i72 = i66;
                        for (int i73 = 0; i73 < i12; i73++) {
                            int i74 = i73 * i10;
                            int i75 = i74 + i67;
                            int i76 = i74 + i68;
                            int i77 = i70 + i75;
                            int i78 = i70 + i76;
                            int i79 = i71 + i75;
                            int i80 = i71 + i76;
                            float f24 = fArr2[i79 - 1];
                            float f25 = fArr2[i79];
                            float f26 = fArr2[i80 - 1];
                            float f27 = fArr2[i80];
                            fArr[i77 - 1] = f24 + f26;
                            fArr[i77] = f25 + f27;
                            fArr[i78 - 1] = f25 - f27;
                            fArr[i78] = f26 - f24;
                        }
                        i69 += 2;
                        i66 = i72;
                    }
                    i66++;
                }
            }
        } else {
            f10 = fL;
            i17 = 2;
            i18 = 1;
            System.arraycopy(fArr2, i15, fArr, i14, i13);
        }
        for (int i81 = i18; i81 < i20; i81++) {
            int i82 = i81 * i12 * i10;
            int i83 = (i11 - i81) * i12 * i10;
            for (int i84 = 0; i84 < i12; i84++) {
                int i85 = i84 * i10;
                int i86 = i85 + i82;
                int i87 = i85 + i83;
                float f28 = fArr2[i15 + i86];
                float f29 = fArr2[i15 + i87];
                fArr[i86 + i14] = f28 + f29;
                fArr[i87 + i14] = f29 - f28;
            }
        }
        int i88 = (i11 - 1) * i13;
        float f30 = 1.0f;
        float f31 = 0.0f;
        int i89 = i18;
        while (i89 < i20) {
            float f32 = (fB * f30) - (f10 * f31);
            f31 = (f31 * fB) + (f30 * f10);
            int i90 = i89 * i13;
            int i91 = (i11 - i89) * i13;
            int i92 = i88;
            for (int i93 = 0; i93 < i13; i93++) {
                int i94 = i15 + i93;
                int i95 = i14 + i93;
                fArr2[i94 + i90] = fArr[i95] + (fArr[i95 + i13] * f32);
                fArr2[i94 + i91] = fArr[i95 + i92] * f31;
            }
            float f33 = f31;
            float f34 = f32;
            int i96 = i17;
            while (i96 < i20) {
                float f35 = (f32 * f34) - (f31 * f33);
                f33 = (f33 * f32) + (f34 * f31);
                int i97 = i96 * i13;
                int i98 = (i11 - i96) * i13;
                int i99 = i96;
                for (int i100 = 0; i100 < i13; i100++) {
                    int i101 = i15 + i100;
                    int i102 = i14 + i100;
                    int i103 = i101 + i90;
                    fArr2[i103] = fArr2[i103] + (fArr[i102 + i97] * f35);
                    int i104 = i101 + i91;
                    fArr2[i104] = fArr2[i104] + (fArr[i102 + i98] * f33);
                }
                i96 = i99 + 1;
                f34 = f35;
            }
            i89++;
            i88 = i92;
            f30 = f32;
        }
        for (int i105 = i18; i105 < i20; i105++) {
            int i106 = i105 * i13;
            for (int i107 = 0; i107 < i13; i107++) {
                int i108 = i15 + i107;
                fArr2[i108] = fArr2[i108] + fArr[i14 + i107 + i106];
            }
        }
        if (i10 >= i12) {
            for (int i109 = 0; i109 < i12; i109++) {
                int i110 = i109 * i10;
                int i111 = i110 * i11;
                for (int i112 = 0; i112 < i10; i112++) {
                    fArr[i14 + i112 + i111] = fArr2[i15 + i112 + i110];
                }
            }
        } else {
            for (int i113 = 0; i113 < i10; i113++) {
                for (int i114 = 0; i114 < i12; i114++) {
                    int i115 = i114 * i10;
                    fArr[i14 + i113 + (i115 * i11)] = fArr2[i15 + i113 + i115];
                }
            }
        }
        int i116 = i11 * i10;
        for (int i117 = i18; i117 < i20; i117++) {
            int i118 = i117 * i12 * i10;
            int i119 = (i11 - i117) * i12 * i10;
            int i120 = i117 * 2 * i10;
            for (int i121 = 0; i121 < i12; i121++) {
                int i122 = i121 * i10;
                int i123 = i121 * i116;
                fArr[((((i14 + i10) - 1) + i120) - i10) + i123] = fArr2[i122 + i118 + i15];
                fArr[i14 + i120 + i123] = fArr2[i122 + i119 + i15];
            }
        }
        int i124 = i18;
        if (i10 == i124) {
            return;
        }
        if (i21 >= i12) {
            for (int i125 = i124; i125 < i20; i125++) {
                int i126 = i125 * i12 * i10;
                int i127 = (i11 - i125) * i12 * i10;
                int i128 = i125 * 2 * i10;
                for (int i129 = 0; i129 < i12; i129++) {
                    int i130 = i129 * i116;
                    int i131 = i129 * i10;
                    for (int i132 = i17; i132 < i10; i132 += 2) {
                        int i133 = i14 + i132 + i128 + i130;
                        int i134 = (((i14 + (i10 - i132)) + i128) - i10) + i130;
                        int i135 = i15 + i132 + i131;
                        int i136 = i135 + i126;
                        int i137 = i135 + i127;
                        float f36 = fArr2[i136 - 1];
                        float f37 = fArr2[i136];
                        float f38 = fArr2[i137 - 1];
                        float f39 = fArr2[i137];
                        fArr[i133 - 1] = f36 + f38;
                        fArr[i134 - 1] = f36 - f38;
                        fArr[i133] = f37 + f39;
                        fArr[i134] = f39 - f37;
                    }
                }
            }
            return;
        }
        for (int i138 = i124; i138 < i20; i138++) {
            int i139 = i138 * i12 * i10;
            int i140 = (i11 - i138) * i12 * i10;
            int i141 = i138 * 2 * i10;
            int i142 = i17;
            while (i142 < i10) {
                int i143 = i14 + i142;
                int i144 = (i10 - i142) + i14;
                int i145 = i15 + i142;
                int i146 = i116;
                for (int i147 = 0; i147 < i12; i147++) {
                    int i148 = i147 * i146;
                    int i149 = i143 + i141 + i148;
                    int i150 = ((i144 + i141) - i10) + i148;
                    int i151 = i145 + (i147 * i10);
                    int i152 = i151 + i139;
                    int i153 = i151 + i140;
                    float f40 = fArr2[i152 - 1];
                    float f41 = fArr2[i152];
                    float f42 = fArr2[i153 - 1];
                    float f43 = fArr2[i153];
                    fArr[i149 - 1] = f40 + f42;
                    fArr[i150 - 1] = f40 - f42;
                    fArr[i149] = f41 + f43;
                    fArr[i150] = f43 - f41;
                }
                i142 += 2;
                i116 = i146;
            }
        }
    }

    void Z(long j10, long j11, long j12, long j13, vp.b bVar, long j14, vp.b bVar2, long j15, long j16) {
        long j17;
        int i10;
        a aVar = this;
        long j18 = j10;
        long j19 = j11;
        double d10 = 6.2831855f / j19;
        float fB = (float) bo.a.b(d10);
        float fL = (float) bo.a.l(d10);
        long j20 = 1;
        long j21 = (j19 + 1) / 2;
        long j22 = (j18 - 1) / 2;
        if (j18 != 1) {
            for (long j23 = 0; j23 < j13; j23++) {
                bVar2.r(j15 + j23, bVar.p(j14 + j23));
            }
            long j24 = 1;
            while (j24 < j19) {
                long j25 = j24 * j12 * j18;
                long j26 = 0;
                while (j26 < j12) {
                    long j27 = (j26 * j18) + j25;
                    bVar2.r(j15 + j27, bVar.p(j14 + j27));
                    j26++;
                    j24 = j24;
                }
                j24++;
                j19 = j11;
            }
            int i11 = (j22 > j12 ? 1 : (j22 == j12 ? 0 : -1));
            if (i11 <= 0) {
                long j28 = -j18;
                long j29 = 1;
                while (j29 < j11) {
                    j28 += j18;
                    long j30 = j28 - j20;
                    long j31 = j29 * j12 * j18;
                    long j32 = 2;
                    while (j32 < j18) {
                        j30 += 2;
                        int i12 = i11;
                        long j33 = j30 + j16;
                        long j34 = j14 + j32;
                        long j35 = j15 + j32;
                        long j36 = j20;
                        long j37 = j28;
                        float fP = aVar.f44913p.p(j33 - j36);
                        float fP2 = aVar.f44913p.p(j33);
                        long j38 = 0;
                        while (j38 < j12) {
                            long j39 = (j38 * j18) + j31;
                            float f10 = fP2;
                            long j40 = j35 + j39;
                            float f11 = fP;
                            long j41 = j34 + j39;
                            long j42 = j29;
                            float fP3 = bVar.p(j41 - j36);
                            float fP4 = bVar.p(j41);
                            bVar2.r(j40 - j36, (f11 * fP3) + (f10 * fP4));
                            bVar2.r(j40, (f11 * fP4) - (f10 * fP3));
                            j38 += j36;
                            j29 = j42;
                            fP = f11;
                            fP2 = f10;
                        }
                        j32 += 2;
                        i11 = i12;
                        j20 = j36;
                        j28 = j37;
                    }
                    j29 += j20;
                }
                i10 = i11;
                j17 = j20;
            } else {
                i10 = i11;
                j17 = 1;
                long j43 = -j18;
                long j44 = 1;
                while (j44 < j11) {
                    j43 += j18;
                    long j45 = j44 * j12 * j18;
                    long j46 = 0;
                    while (j46 < j12) {
                        long j47 = j43 - 1;
                        long j48 = (j46 * j18) + j45;
                        long j49 = 2;
                        while (j49 < j18) {
                            j47 += 2;
                            long j50 = j47 + j16;
                            long j51 = j43;
                            long j52 = j44;
                            float fP5 = aVar.f44913p.p(j50 - 1);
                            float fP6 = aVar.f44913p.p(j50);
                            long j53 = j15 + j49 + j48;
                            long j54 = j14 + j49 + j48;
                            float fP7 = bVar.p(j54 - 1);
                            float fP8 = bVar.p(j54);
                            bVar2.r(j53 - 1, (fP5 * fP7) + (fP6 * fP8));
                            bVar2.r(j53, (fP8 * fP5) - (fP6 * fP7));
                            j49 += 2;
                            aVar = this;
                            j18 = j10;
                            j43 = j51;
                            j44 = j52;
                        }
                        j46++;
                        aVar = this;
                        j18 = j10;
                    }
                    j44++;
                    aVar = this;
                    j18 = j10;
                }
            }
            if (i10 >= 0) {
                long j55 = j17;
                while (j55 < j21) {
                    long j56 = j55 * j12 * j10;
                    long j57 = (j11 - j55) * j12 * j10;
                    long j58 = 0;
                    while (j58 < j12) {
                        long j59 = j58 * j10;
                        long j60 = j59 + j56;
                        long j61 = j59 + j57;
                        long j62 = 2;
                        while (j62 < j10) {
                            long j63 = j14 + j62;
                            long j64 = j15 + j62;
                            long j65 = j55;
                            long j66 = j63 + j60;
                            long j67 = j57;
                            long j68 = j63 + j61;
                            long j69 = j56;
                            long j70 = j64 + j60;
                            long j71 = j58;
                            long j72 = j64 + j61;
                            float fP9 = bVar2.p(j70 - j17);
                            float fP10 = bVar2.p(j70);
                            float fP11 = bVar2.p(j72 - j17);
                            float fP12 = bVar2.p(j72);
                            bVar.r(j66 - j17, fP9 + fP11);
                            bVar.r(j66, fP10 + fP12);
                            bVar.r(j68 - j17, fP10 - fP12);
                            bVar.r(j68, fP11 - fP9);
                            j62 += 2;
                            j55 = j65;
                            j56 = j69;
                            j61 = j61;
                            j57 = j67;
                            j58 = j71;
                        }
                        j58 += j17;
                    }
                    j55 += j17;
                }
            } else {
                long j73 = j17;
                while (j73 < j21) {
                    long j74 = j73 * j12 * j10;
                    long j75 = (j11 - j73) * j12 * j10;
                    long j76 = 2;
                    while (j76 < j10) {
                        long j77 = j14 + j76;
                        long j78 = j15 + j76;
                        long j79 = 0;
                        while (j79 < j12) {
                            long j80 = j79 * j10;
                            long j81 = j80 + j74;
                            long j82 = j80 + j75;
                            long j83 = j73;
                            long j84 = j77 + j81;
                            long j85 = j75;
                            long j86 = j77 + j82;
                            long j87 = j74;
                            long j88 = j78 + j81;
                            long j89 = j76;
                            long j90 = j78 + j82;
                            float fP13 = bVar2.p(j88 - j17);
                            float fP14 = bVar2.p(j88);
                            float fP15 = bVar2.p(j90 - j17);
                            float fP16 = bVar2.p(j90);
                            bVar.r(j84 - j17, fP13 + fP15);
                            bVar.r(j84, fP14 + fP16);
                            bVar.r(j86 - j17, fP14 - fP16);
                            bVar.r(j86, fP15 - fP13);
                            j79 += j17;
                            j73 = j83;
                            j77 = j77;
                            j76 = j89;
                            j75 = j85;
                            j74 = j87;
                        }
                        j76 += 2;
                    }
                    j73 += j17;
                }
            }
        } else {
            j17 = 1;
            vp.e.a(bVar2, j15, bVar, j14, j13);
        }
        long j91 = j17;
        while (j91 < j21) {
            long j92 = j91 * j12 * j10;
            long j93 = (j11 - j91) * j12 * j10;
            long j94 = 0;
            while (j94 < j12) {
                long j95 = j94 * j10;
                long j96 = j95 + j92;
                long j97 = j95 + j93;
                long j98 = j91;
                float fP17 = bVar2.p(j15 + j96);
                float fP18 = bVar2.p(j15 + j97);
                bVar.r(j14 + j96, fP17 + fP18);
                bVar.r(j14 + j97, fP18 - fP17);
                j94 += j17;
                j91 = j98;
                j93 = j93;
            }
            j91 += j17;
        }
        long j99 = (j11 - j17) * j13;
        float f12 = 1.0f;
        float f13 = 0.0f;
        long j100 = j17;
        while (j100 < j21) {
            float f14 = (fB * f12) - (fL * f13);
            float f15 = (f13 * fB) + (f12 * fL);
            long j101 = j100 * j13;
            long j102 = (j11 - j100) * j13;
            long j103 = 0;
            while (j103 < j13) {
                long j104 = j15 + j103;
                long j105 = j99;
                long j106 = j14 + j103;
                float f16 = f15;
                bVar2.r(j104 + j101, bVar.p(j106) + (bVar.p(j106 + j13) * f14));
                bVar2.r(j104 + j102, f16 * bVar.p(j106 + j105));
                j103 += j17;
                j99 = j105;
                f15 = f16;
            }
            long j107 = j99;
            float f17 = f15;
            float f18 = f14;
            long j108 = 2;
            while (j108 < j21) {
                float f19 = (f14 * f18) - (f17 * f15);
                f15 = (f15 * f14) + (f18 * f17);
                long j109 = j108 * j13;
                long j110 = (j11 - j108) * j13;
                long j111 = 0;
                while (j111 < j13) {
                    long j112 = j15 + j111;
                    long j113 = j14 + j111;
                    long j114 = j108;
                    long j115 = j112 + j101;
                    float f20 = f15;
                    bVar2.r(j115, bVar2.p(j115) + (bVar.p(j113 + j109) * f19));
                    long j116 = j112 + j102;
                    bVar2.r(j116, bVar2.p(j116) + (f20 * bVar.p(j113 + j110)));
                    j111 += j17;
                    f15 = f20;
                    j108 = j114;
                }
                j108 += j17;
                f18 = f19;
            }
            j100 += j17;
            j99 = j107;
            f12 = f14;
            f13 = f17;
        }
        for (long j117 = j17; j117 < j21; j117 += j17) {
            long j118 = j117 * j13;
            for (long j119 = 0; j119 < j13; j119 += j17) {
                long j120 = j15 + j119;
                bVar2.r(j120, bVar2.p(j120) + bVar.p(j14 + j119 + j118));
            }
        }
        if (j10 >= j12) {
            for (long j121 = 0; j121 < j12; j121 += j17) {
                long j122 = j121 * j10;
                long j123 = j122 * j11;
                for (long j124 = 0; j124 < j10; j124 += j17) {
                    bVar.r(j14 + j124 + j123, bVar2.p(j15 + j124 + j122));
                }
            }
        } else {
            for (long j125 = 0; j125 < j10; j125 += j17) {
                for (long j126 = 0; j126 < j12; j126 += j17) {
                    long j127 = j126 * j10;
                    bVar.r(j14 + j125 + (j127 * j11), bVar2.p(j15 + j125 + j127));
                }
            }
        }
        long j128 = j11 * j10;
        long j129 = j17;
        while (j129 < j21) {
            long j130 = j129 * j12 * j10;
            long j131 = (j11 - j129) * j12 * j10;
            long j132 = j129 * 2 * j10;
            long j133 = 0;
            while (j133 < j12) {
                long j134 = j133 * j10;
                long j135 = j133 * j128;
                bVar.r(((((j14 + j10) - j17) + j132) - j10) + j135, bVar2.p(j15 + j134 + j130));
                bVar.r(j14 + j132 + j135, bVar2.p(j15 + j134 + j131));
                j133 += j17;
                j128 = j128;
                j129 = j129;
            }
            j129 += j17;
        }
        long j136 = j128;
        if (j18 == 1) {
            return;
        }
        if (j22 >= j12) {
            long j137 = j17;
            while (j137 < j21) {
                long j138 = j137 * j12 * j10;
                long j139 = (j11 - j137) * j12 * j10;
                long j140 = j137 * 2 * j10;
                long j141 = 0;
                while (j141 < j12) {
                    long j142 = j141 * j136;
                    long j143 = j141 * j10;
                    long j144 = 2;
                    while (j144 < j10) {
                        long j145 = j137;
                        long j146 = j14 + j144 + j140 + j142;
                        long j147 = j139;
                        long j148 = (((j14 + (j10 - j144)) + j140) - j10) + j142;
                        long j149 = j15 + j144 + j143;
                        long j150 = j140;
                        long j151 = j149 + j138;
                        long j152 = j138;
                        long j153 = j149 + j147;
                        float fP19 = bVar2.p(j151 - j17);
                        float fP20 = bVar2.p(j151);
                        float fP21 = bVar2.p(j153 - j17);
                        float fP22 = bVar2.p(j153);
                        bVar.r(j146 - j17, fP19 + fP21);
                        bVar.r(j148 - j17, fP19 - fP21);
                        bVar.r(j146, fP20 + fP22);
                        bVar.r(j148, fP22 - fP20);
                        j144 += 2;
                        j137 = j145;
                        j140 = j150;
                        j139 = j147;
                        j141 = j141;
                        j138 = j152;
                    }
                    j141 += j17;
                }
                j137 += j17;
            }
            return;
        }
        long j154 = j17;
        while (j154 < j21) {
            long j155 = j154 * j12 * j10;
            long j156 = (j11 - j154) * j12 * j10;
            long j157 = j154 * 2 * j10;
            long j158 = 2;
            while (j158 < j10) {
                long j159 = j14 + j158;
                long j160 = j14 + (j10 - j158);
                long j161 = j15 + j158;
                long j162 = 0;
                while (j162 < j12) {
                    long j163 = j162 * j136;
                    long j164 = j154;
                    long j165 = j159 + j157 + j163;
                    long j166 = j156;
                    long j167 = ((j160 + j157) - j10) + j163;
                    long j168 = j161 + (j162 * j10);
                    long j169 = j157;
                    long j170 = j168 + j155;
                    long j171 = j155;
                    long j172 = j168 + j166;
                    float fP23 = bVar2.p(j170 - j17);
                    float fP24 = bVar2.p(j170);
                    float fP25 = bVar2.p(j172 - j17);
                    float fP26 = bVar2.p(j172);
                    bVar.r(j165 - j17, fP23 + fP25);
                    bVar.r(j167 - j17, fP23 - fP25);
                    bVar.r(j165, fP24 + fP26);
                    bVar.r(j167, fP26 - fP24);
                    j162 += j17;
                    j154 = j164;
                    j157 = j169;
                    j158 = j158;
                    j155 = j171;
                    j156 = j166;
                }
                j158 += 2;
            }
            j154 += j17;
        }
    }

    public void a0(vp.b bVar, long j10) {
        if (!this.f44919v) {
            if (bVar.j() || bVar.i() || j10 >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            c0(bVar.n(), (int) j10);
            return;
        }
        if (this.f44899b == 1) {
            return;
        }
        int i10 = j.f44967a[this.f44918u.ordinal()];
        if (i10 == 1) {
            long j11 = this.f44899b;
            if (j11 > 4) {
                mp.a.F(j11, bVar, j10, this.f44903f, this.f44907j, this.f44905h);
                mp.a.p0(this.f44899b, bVar, j10, this.f44909l, this.f44905h, this.f44907j);
            } else if (j11 == 4) {
                mp.a.U(bVar, j10);
            }
            long j12 = j10 + 1;
            float fP = bVar.p(j10) - bVar.p(j12);
            bVar.r(j10, bVar.p(j10) + bVar.p(j12));
            bVar.r(j12, fP);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            g(bVar, j10);
            return;
        }
        i0(bVar, j10);
        long j13 = this.f44899b;
        while (true) {
            j13--;
            if (j13 < 2) {
                return;
            }
            long j14 = j10 + j13;
            float fP2 = bVar.p(j14);
            long j15 = j14 - 1;
            bVar.r(j14, bVar.p(j15));
            bVar.r(j15, fP2);
        }
    }

    public void b0(float[] fArr) {
        c0(fArr, 0);
    }

    public void c0(float[] fArr, int i10) {
        if (this.f44919v) {
            a0(new vp.b(fArr), i10);
            return;
        }
        if (this.f44898a == 1) {
            return;
        }
        int i11 = j.f44967a[this.f44918u.ordinal()];
        if (i11 == 1) {
            int i12 = this.f44898a;
            if (i12 > 4) {
                mp.a.E(i12, fArr, i10, this.f44902e, this.f44906i, this.f44904g);
                mp.a.o0(this.f44898a, fArr, i10, this.f44908k, this.f44904g, this.f44906i);
            } else if (i12 == 4) {
                mp.a.V(fArr, i10);
            }
            float f10 = fArr[i10];
            int i13 = i10 + 1;
            float f11 = fArr[i13];
            fArr[i10] = f10 + f11;
            fArr[i13] = f10 - f11;
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            h(fArr, i10);
            return;
        }
        j0(fArr, i10);
        for (int i14 = this.f44898a - 1; i14 >= 2; i14--) {
            int i15 = i10 + i14;
            float f12 = fArr[i15];
            int i16 = i15 - 1;
            fArr[i15] = fArr[i16];
            fArr[i16] = f12;
        }
    }

    public void d0(vp.b bVar, long j10, boolean z10) {
        if (!this.f44919v) {
            if (bVar.j() || bVar.i() || j10 >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            e0(bVar.n(), (int) j10, z10);
            return;
        }
        if (this.f44899b == 1) {
            return;
        }
        int i10 = j.f44967a[this.f44918u.ordinal()];
        if (i10 == 1) {
            long j11 = 1 + j10;
            bVar.r(j11, (bVar.p(j10) - bVar.p(j11)) * 0.5f);
            bVar.r(j10, bVar.p(j10) - bVar.p(j11));
            long j12 = this.f44899b;
            if (j12 > 4) {
                mp.a.p0(j12, bVar, j10, this.f44909l, this.f44905h, this.f44907j);
                mp.a.r(this.f44899b, bVar, j10, this.f44903f, this.f44907j, this.f44905h);
            } else if (j12 == 4) {
                mp.a.Y(bVar, j10);
            }
            if (z10) {
                long j13 = this.f44899b;
                mp.a.r0(j13, 1.0f / (j13 / 2.0f), bVar, j10, false);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            i(bVar, j10);
            if (z10) {
                long j14 = this.f44899b;
                mp.a.r0(j14, 1.0f / j14, bVar, j10, false);
                return;
            }
            return;
        }
        for (long j15 = 2; j15 < this.f44899b; j15++) {
            long j16 = j10 + j15;
            long j17 = j16 - 1;
            float fP = bVar.p(j17);
            bVar.r(j17, bVar.p(j16));
            bVar.r(j16, fP);
        }
        g0(bVar, j10);
        if (z10) {
            long j18 = this.f44899b;
            mp.a.r0(j18, 1.0f / j18, bVar, j10, false);
        }
    }

    public void e0(float[] fArr, int i10, boolean z10) {
        if (this.f44919v) {
            d0(new vp.b(fArr), i10, z10);
            return;
        }
        if (this.f44898a == 1) {
            return;
        }
        int i11 = j.f44967a[this.f44918u.ordinal()];
        if (i11 == 1) {
            int i12 = i10 + 1;
            float f10 = (fArr[i10] - fArr[i12]) * 0.5f;
            fArr[i12] = f10;
            fArr[i10] = fArr[i10] - f10;
            int i13 = this.f44898a;
            if (i13 > 4) {
                mp.a.o0(i13, fArr, i10, this.f44908k, this.f44904g, this.f44906i);
                mp.a.q(this.f44898a, fArr, i10, this.f44902e, this.f44906i, this.f44904g);
            } else if (i13 == 4) {
                mp.a.Z(fArr, i10);
            }
            if (z10) {
                int i14 = this.f44898a;
                mp.a.q0(i14, 1.0f / (i14 / 2.0f), fArr, i10, false);
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            j(fArr, i10);
            if (z10) {
                int i15 = this.f44898a;
                mp.a.q0(i15, 1.0f / i15, fArr, i10, false);
                return;
            }
            return;
        }
        for (int i16 = 2; i16 < this.f44898a; i16++) {
            int i17 = i10 + i16;
            int i18 = i17 - 1;
            float f11 = fArr[i18];
            fArr[i18] = fArr[i17];
            fArr[i17] = f11;
        }
        h0(fArr, i10);
        if (z10) {
            int i19 = this.f44898a;
            mp.a.q0(i19, 1.0f / i19, fArr, i10, false);
        }
    }

    public void f0(float[] fArr, boolean z10) {
        e0(fArr, 0, z10);
    }

    void g0(vp.b bVar, long j10) {
        long j11;
        long j12;
        vp.b bVar2;
        a aVar = this;
        if (aVar.f44899b == 1) {
            return;
        }
        vp.b bVar3 = new vp.b(aVar.f44899b);
        long j13 = aVar.f44899b * 2;
        long jP = (long) aVar.f44913p.p(j13 + 1);
        long j14 = aVar.f44899b;
        vp.b bVar4 = bVar3;
        long j15 = 1;
        long j16 = 1;
        long j17 = 0;
        while (j15 <= jP) {
            long j18 = j15 + 1;
            int iP = (int) aVar.f44913p.p(j18 + j13);
            long j19 = iP;
            long j20 = j19 * j16;
            long j21 = aVar.f44899b / j20;
            long j22 = j14;
            vp.b bVar5 = bVar4;
            long j23 = j21 * j16;
            if (iP != 2) {
                if (iP == 3) {
                    jP = jP;
                    iP = iP;
                    long j24 = j16;
                    bVar4 = bVar5;
                    j11 = j21;
                    j12 = j22;
                    if (j17 == 0) {
                        J(j11, j24, bVar, j10, bVar4, 0L, j12);
                    } else {
                        bVar2 = bVar4;
                        J(j11, j24, bVar2, 0L, bVar, j10, j12);
                        bVar4 = bVar2;
                    }
                    j17 = 1 - j17;
                } else if (iP != 4) {
                    if (iP != 5) {
                        if (j17 == 0) {
                            j11 = j21;
                            aVar.P(j11, j19, j16, j23, bVar, j10, bVar5, 0L, j22);
                            bVar4 = bVar5;
                        } else {
                            j11 = j21;
                            P(j11, j19, j16, j23, bVar5, 0L, bVar, j10, j22);
                            bVar4 = bVar5;
                        }
                        j12 = j22;
                        if (j11 == 1) {
                        }
                    } else {
                        jP = jP;
                        iP = iP;
                        long j25 = j16;
                        bVar4 = bVar5;
                        j11 = j21;
                        j12 = j22;
                        if (j17 == 0) {
                            N(j11, j25, bVar, j10, bVar4, 0L, j12);
                        } else {
                            bVar2 = bVar4;
                            N(j11, j25, bVar2, 0L, bVar, j10, j12);
                            bVar4 = bVar2;
                        }
                    }
                    j17 = 1 - j17;
                } else {
                    jP = jP;
                    iP = iP;
                    long j26 = j16;
                    bVar4 = bVar5;
                    j11 = j21;
                    j12 = j22;
                    if (j17 == 0) {
                        L(j11, j26, bVar, j10, bVar4, 0L, j12);
                    } else {
                        bVar2 = bVar4;
                        L(j11, j26, bVar2, 0L, bVar, j10, j12);
                        bVar4 = bVar2;
                    }
                    j17 = 1 - j17;
                }
                aVar = this;
            } else {
                jP = jP;
                iP = iP;
                long j27 = j16;
                bVar4 = bVar5;
                j11 = j21;
                j12 = j22;
                if (j17 == 0) {
                    aVar = this;
                    aVar.H(j11, j27, bVar, j10, bVar4, 0L, j12);
                } else {
                    aVar = this;
                    aVar.H(j11, j27, bVar4, 0L, bVar, j10, j12);
                    bVar4 = bVar4;
                }
                j17 = 1 - j17;
            }
            j14 = j12 + (((long) (iP - 1)) * j11);
            j15 = j18;
            j16 = j20;
            jP = jP;
        }
        if (j17 == 0) {
            return;
        }
        vp.e.a(bVar4, 0L, bVar, j10, aVar.f44899b);
    }

    void h0(float[] fArr, int i10) {
        int i11;
        int i12;
        float[] fArr2;
        int i13;
        int i14;
        a aVar = this;
        int i15 = aVar.f44898a;
        if (i15 == 1) {
            return;
        }
        float[] fArr3 = new float[i15];
        int i16 = i15 * 2;
        int i17 = (int) aVar.f44912o[i16 + 1];
        int i18 = i15;
        int i19 = 1;
        int i20 = 1;
        int i21 = 0;
        while (i19 <= i17) {
            int i22 = i19 + 1;
            int i23 = (int) aVar.f44912o[i22 + i16];
            int i24 = i23 * i20;
            int i25 = aVar.f44898a / i24;
            int i26 = i25 * i20;
            if (i23 != 2) {
                if (i23 == 3) {
                    i11 = i23;
                    i12 = i25;
                    if (i21 == 0) {
                        I(i12, i20, fArr, i10, fArr3, 0, i18);
                    } else {
                        fArr2 = fArr3;
                        I(i12, i20, fArr2, 0, fArr, i10, i18);
                        fArr3 = fArr2;
                    }
                    i21 = 1 - i21;
                } else if (i23 != 4) {
                    if (i23 != 5) {
                        if (i21 == 0) {
                            int i27 = i20;
                            i13 = i23;
                            i12 = i25;
                            i14 = i18;
                            float[] fArr4 = fArr3;
                            aVar.O(i12, i13, i27, i26, fArr, i10, fArr4, 0, i14);
                            fArr3 = fArr4;
                        } else {
                            int i28 = i20;
                            i13 = i23;
                            i12 = i25;
                            i14 = i18;
                            O(i12, i13, i28, i26, fArr3, 0, fArr, i10, i14);
                        }
                        i11 = i13;
                        i18 = i14;
                        if (i12 == 1) {
                        }
                    } else {
                        i11 = i23;
                        i12 = i25;
                        if (i21 == 0) {
                            M(i12, i20, fArr, i10, fArr3, 0, i18);
                        } else {
                            fArr2 = fArr3;
                            M(i12, i20, fArr2, 0, fArr, i10, i18);
                            fArr3 = fArr2;
                        }
                    }
                    i21 = 1 - i21;
                } else {
                    i11 = i23;
                    i12 = i25;
                    if (i21 == 0) {
                        K(i12, i20, fArr, i10, fArr3, 0, i18);
                    } else {
                        fArr2 = fArr3;
                        K(i12, i20, fArr2, 0, fArr, i10, i18);
                        fArr3 = fArr2;
                    }
                    i21 = 1 - i21;
                }
                aVar = this;
            } else {
                i11 = i23;
                i12 = i25;
                if (i21 == 0) {
                    aVar = this;
                    aVar.G(i12, i20, fArr, i10, fArr3, 0, i18);
                } else {
                    aVar = this;
                    float[] fArr5 = fArr3;
                    aVar.G(i12, i20, fArr5, 0, fArr, i10, i18);
                    fArr3 = fArr5;
                }
                i21 = 1 - i21;
            }
            i18 += (i11 - 1) * i12;
            i19 = i22;
            i20 = i24;
        }
        if (i21 == 0) {
            return;
        }
        System.arraycopy(fArr3, 0, fArr, i10, aVar.f44898a);
    }

    void i0(vp.b bVar, long j10) {
        long j11;
        vp.b bVar2;
        a aVar = this;
        if (aVar.f44899b == 1) {
            return;
        }
        vp.b bVar3 = new vp.b(aVar.f44899b);
        long j12 = aVar.f44899b * 2;
        long jP = (long) aVar.f44913p.p(j12 + 1);
        long j13 = aVar.f44899b;
        long j14 = j12 - 1;
        long j15 = 1;
        long j16 = 1;
        while (j16 <= jP) {
            int iP = (int) aVar.f44913p.p((jP - j16) + 2 + j12);
            long j17 = j13;
            long j18 = iP;
            vp.b bVar4 = bVar3;
            long j19 = j17 / j18;
            long j20 = jP;
            long j21 = aVar.f44899b / j17;
            long j22 = j21 * j19;
            long j23 = j14 - (((long) (iP - 1)) * j21);
            long j24 = 1 - j15;
            if (iP == 2) {
                j13 = j19;
                bVar3 = bVar4;
                j11 = j23;
                if (j24 == 0) {
                    aVar = this;
                    bVar2 = bVar3;
                    aVar.R(j21, j13, bVar, j10, bVar2, 0L, j11);
                    bVar3 = bVar2;
                } else {
                    aVar = this;
                    aVar.R(j21, j13, bVar3, 0L, bVar, j10, j11);
                }
                j15 = j24;
            } else if (iP == 3) {
                j13 = j19;
                bVar3 = bVar4;
                j11 = j23;
                if (j24 == 0) {
                    aVar = this;
                    bVar2 = bVar3;
                    aVar.T(j21, j13, bVar, j10, bVar2, 0L, j11);
                    bVar3 = bVar2;
                } else {
                    aVar = this;
                    aVar.T(j21, j13, bVar3, 0L, bVar, j10, j11);
                }
                j15 = j24;
            } else if (iP == 4) {
                j13 = j19;
                bVar3 = bVar4;
                j11 = j23;
                if (j24 == 0) {
                    aVar = this;
                    bVar2 = bVar3;
                    aVar.V(j21, j13, bVar, j10, bVar2, 0L, j11);
                    bVar3 = bVar2;
                } else {
                    aVar = this;
                    aVar.V(j21, j13, bVar3, 0L, bVar, j10, j11);
                }
                j15 = j24;
            } else if (iP != 5) {
                if (j21 == 1) {
                    j24 = 1 - j24;
                }
                if (j24 == 0) {
                    aVar = this;
                    aVar.Z(j21, j18, j19, j22, bVar, j10, bVar4, 0L, j23);
                    j13 = j19;
                    bVar3 = bVar4;
                    j11 = j23;
                    j15 = 1;
                } else {
                    aVar = this;
                    aVar.Z(j21, j18, j19, j22, bVar4, 0L, bVar, j10, j23);
                    j13 = j19;
                    bVar3 = bVar4;
                    j11 = j23;
                    j15 = 0;
                }
            } else {
                j13 = j19;
                bVar3 = bVar4;
                j11 = j23;
                if (j24 == 0) {
                    aVar = this;
                    bVar2 = bVar3;
                    aVar.X(j21, j13, bVar, j10, bVar2, 0L, j11);
                    bVar3 = bVar2;
                } else {
                    aVar = this;
                    aVar.X(j21, j13, bVar3, 0L, bVar, j10, j11);
                }
                j15 = j24;
            }
            j16++;
            j14 = j11;
            jP = j20;
        }
        if (j15 == 1) {
            return;
        }
        vp.e.a(bVar3, 0L, bVar, j10, aVar.f44899b);
    }

    void j0(float[] fArr, int i10) {
        int i11;
        int i12;
        float[] fArr2;
        a aVar = this;
        int i13 = aVar.f44898a;
        if (i13 == 1) {
            return;
        }
        float[] fArr3 = new float[i13];
        int i14 = i13 * 2;
        int i15 = (int) aVar.f44912o[i14 + 1];
        int i16 = i14 - 1;
        int i17 = 1;
        int i18 = 1;
        while (i18 <= i15) {
            int i19 = (int) aVar.f44912o[(i15 - i18) + 2 + i14];
            int i20 = i17;
            int i21 = i13 / i19;
            int i22 = aVar.f44898a / i13;
            int i23 = i22 * i21;
            int i24 = i16 - ((i19 - 1) * i22);
            int i25 = 1 - i20;
            if (i19 == 2) {
                i11 = i21;
                i12 = i24;
                if (i25 == 0) {
                    aVar = this;
                    aVar.Q(i22, i11, fArr, i10, fArr3, 0, i12);
                } else {
                    aVar = this;
                    fArr2 = fArr3;
                    aVar.Q(i22, i11, fArr2, 0, fArr, i10, i12);
                    fArr3 = fArr2;
                }
                i17 = i25;
            } else if (i19 == 3) {
                i11 = i21;
                i12 = i24;
                if (i25 == 0) {
                    aVar = this;
                    aVar.S(i22, i11, fArr, i10, fArr3, 0, i12);
                } else {
                    aVar = this;
                    fArr2 = fArr3;
                    aVar.S(i22, i11, fArr2, 0, fArr, i10, i12);
                    fArr3 = fArr2;
                }
                i17 = i25;
            } else if (i19 == 4) {
                i11 = i21;
                i12 = i24;
                if (i25 == 0) {
                    aVar = this;
                    aVar.U(i22, i11, fArr, i10, fArr3, 0, i12);
                } else {
                    aVar = this;
                    fArr2 = fArr3;
                    aVar.U(i22, i11, fArr2, 0, fArr, i10, i12);
                    fArr3 = fArr2;
                }
                i17 = i25;
            } else if (i19 != 5) {
                if (i22 == 1) {
                    i25 = 1 - i25;
                }
                if (i25 == 0) {
                    float[] fArr4 = fArr3;
                    aVar.Y(i22, i19, i21, i23, fArr, i10, fArr4, 0, i24);
                    fArr3 = fArr4;
                    aVar = this;
                    i11 = i21;
                    i12 = i24;
                    i17 = 1;
                } else {
                    aVar = this;
                    aVar.Y(i22, i19, i21, i23, fArr3, 0, fArr, i10, i24);
                    i11 = i21;
                    i12 = i24;
                    i17 = 0;
                }
            } else {
                i11 = i21;
                i12 = i24;
                if (i25 == 0) {
                    aVar = this;
                    aVar.W(i22, i11, fArr, i10, fArr3, 0, i12);
                } else {
                    aVar = this;
                    fArr2 = fArr3;
                    aVar.W(i22, i11, fArr2, 0, fArr, i10, i12);
                    fArr3 = fArr2;
                }
                i17 = i25;
            }
            i18++;
            i13 = i11;
            i16 = i12;
        }
        if (i17 == 1) {
            return;
        }
        System.arraycopy(fArr3, 0, fArr, i10, aVar.f44898a);
    }

    void k0() {
        int i10;
        a aVar = this;
        int i11 = aVar.f44898a;
        int i12 = 1;
        if (i11 == 1) {
            return;
        }
        int i13 = i11 * 2;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i14 + 1;
            i15 = i17 <= 4 ? f44897w[i14] : i15 + 2;
            while (true) {
                int i18 = i11 / i15;
                if (i11 - (i15 * i18) != 0) {
                    break;
                }
                i10 = i16 + 1;
                aVar.f44912o[i16 + 2 + i13] = i15;
                if (i15 == 2 && i10 != 1) {
                    for (int i19 = 2; i19 <= i10; i19++) {
                        int i20 = (i10 - i19) + 2 + i13;
                        float[] fArr = aVar.f44912o;
                        fArr[i20 + 1] = fArr[i20];
                    }
                    aVar.f44912o[i13 + 2] = 2.0f;
                }
                if (i18 == 1) {
                    break loop0;
                }
                aVar = this;
                i16 = i10;
                i11 = i18;
            }
            i14 = i17;
        }
        float[] fArr2 = aVar.f44912o;
        int i21 = aVar.f44898a;
        fArr2[i13] = i21;
        fArr2[i13 + 1] = i10;
        float f10 = 6.2831855f / i21;
        if (i16 == 0) {
            return;
        }
        int i22 = 1;
        int i23 = 1;
        int i24 = 0;
        while (i22 <= i16) {
            i22++;
            int i25 = (int) aVar.f44912o[i22 + i13];
            int i26 = i23 * i25;
            int i27 = aVar.f44898a / i26;
            int i28 = i25 - i12;
            int i29 = i12;
            int i30 = 0;
            while (i29 <= i28) {
                i30 += i23;
                float f11 = i30 * f10;
                float f12 = 0.0f;
                int i31 = i12;
                int i32 = 3;
                int i33 = i24;
                while (i32 <= i27) {
                    i33 += 2;
                    f12 += 1.0f;
                    int i34 = i33 + aVar.f44898a;
                    float f13 = f10;
                    double d10 = f12 * f11;
                    aVar.f44912o[i34 - 2] = (float) bo.a.b(d10);
                    aVar.f44912o[i34 - 1] = (float) bo.a.l(d10);
                    i32 += 2;
                    aVar = this;
                    f10 = f13;
                }
                i24 += i27;
                i29++;
                aVar = this;
                i12 = i31;
            }
            aVar = this;
            i23 = i26;
        }
    }

    void l0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14 = this.f44899b;
        long j15 = 1;
        if (j14 == 1) {
            return;
        }
        long j16 = 2;
        long j17 = j14 * 2;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        loop0: while (true) {
            long j22 = j19 + j15;
            j20 = j22 <= 4 ? f44897w[(int) j19] : j20 + j16;
            while (true) {
                long j23 = j14 / j20;
                if (j14 - (j20 * j23) != j18) {
                    break;
                }
                j10 = j21 + j15;
                j11 = j15;
                j12 = j16;
                this.f44913p.r(j21 + j16 + j17, j20);
                if (j20 != j12 || j10 == j11) {
                    j13 = j18;
                } else {
                    long j24 = j12;
                    while (j24 <= j10) {
                        long j25 = (j10 - j24) + j12 + j17;
                        long j26 = j18;
                        vp.b bVar = this.f44913p;
                        bVar.r(j25 + j11, bVar.p(j25));
                        j24 += j11;
                        j18 = j26;
                    }
                    j13 = j18;
                    this.f44913p.r(j17 + j12, 2.0f);
                }
                if (j23 == j11) {
                    break loop0;
                }
                j21 = j10;
                j14 = j23;
                j15 = j11;
                j18 = j13;
                j16 = j12;
            }
            j19 = j22;
        }
        this.f44913p.r(j17, this.f44899b);
        this.f44913p.r(j17 + j11, j10);
        float f10 = 6.2831855f / this.f44899b;
        if (j21 == j13) {
            return;
        }
        long j27 = j11;
        long j28 = j27;
        long j29 = j13;
        while (j27 <= j21) {
            j27 += j11;
            long jP = (long) this.f44913p.p(j27 + j17);
            long j30 = j28 * jP;
            float f11 = f10;
            long j31 = this.f44899b / j30;
            long j32 = jP - j11;
            long j33 = j11;
            long j34 = j13;
            while (j33 <= j32) {
                long j35 = j31;
                long j36 = j34 + j28;
                long j37 = j27;
                float f12 = j36 * f11;
                float f13 = 0.0f;
                long j38 = 3;
                long j39 = j29;
                while (j38 <= j35) {
                    j39 += j12;
                    float f14 = f13 + 1.0f;
                    long j40 = j39 + this.f44899b;
                    long j41 = j28;
                    double d10 = f14 * f12;
                    this.f44913p.r(j40 - j12, (float) bo.a.b(d10));
                    this.f44913p.r(j40 - j11, (float) bo.a.l(d10));
                    j38 += j12;
                    f12 = f12;
                    j36 = j36;
                    f13 = f14;
                    j28 = j41;
                }
                long j42 = j36;
                j29 += j35;
                j33 += j11;
                j27 = j37;
                j31 = j35;
                j34 = j42;
            }
            j28 = j30;
            f10 = f11;
        }
    }

    void m(vp.b bVar, long j10, int i10) {
        int i11;
        vp.b bVar2;
        int i12;
        long j11;
        int[] iArr;
        vp.b bVar3;
        int[] iArr2;
        long j12;
        a aVar = this;
        int i13 = i10;
        long j13 = aVar.f44899b * 2;
        vp.b bVar4 = new vp.b(j13);
        long j14 = aVar.f44899b * 4;
        long jP = (long) aVar.f44911n.p(j14 + 1);
        long j15 = j13;
        long j16 = 2;
        int[] iArr3 = {0};
        long j17 = 1;
        long j18 = 0;
        while (j16 <= jP + 1) {
            int iP = (int) aVar.f44911n.p(j16 + j14);
            long j19 = iP;
            long j20 = j19 * j17;
            long j21 = j13;
            long j22 = aVar.f44899b / j20;
            long j23 = j22 + j22;
            long j24 = jP;
            vp.b bVar5 = bVar4;
            long j25 = j23 * j17;
            if (iP == 2) {
                i11 = iP;
                bVar2 = bVar5;
                j21 = j21;
                j24 = j24;
                i12 = i13;
                j11 = j23;
                iArr = iArr3;
                long j26 = j17;
                if (j18 == 0) {
                    bVar3 = bVar2;
                    x(j11, j26, bVar, j10, bVar3, 0L, j15, i12);
                    bVar2 = bVar3;
                } else {
                    x(j11, j26, bVar2, 0L, bVar, j10, j15, i12);
                }
                j18 = 1 - j18;
            } else if (iP == 3) {
                i11 = iP;
                bVar2 = bVar5;
                j21 = j21;
                j24 = j24;
                i12 = i13;
                j11 = j23;
                iArr = iArr3;
                long j27 = j17;
                if (j18 == 0) {
                    bVar3 = bVar2;
                    z(j11, j27, bVar, j10, bVar3, 0L, j15, i12);
                    bVar2 = bVar3;
                } else {
                    z(j11, j27, bVar2, 0L, bVar, j10, j15, i12);
                }
                j18 = 1 - j18;
            } else if (iP == 4) {
                i11 = iP;
                bVar2 = bVar5;
                j21 = j21;
                j24 = j24;
                int i14 = i13;
                j11 = j23;
                iArr = iArr3;
                long j28 = j17;
                if (j18 == 0) {
                    bVar3 = bVar2;
                    B(j11, j28, bVar, j10, bVar3, 0L, j15, i14);
                    i12 = i10;
                    bVar2 = bVar3;
                } else {
                    B(j11, j28, bVar2, 0L, bVar, j10, j15, i10);
                    i12 = i10;
                }
                j18 = 1 - j18;
            } else if (iP != 5) {
                if (j18 == 0) {
                    long j29 = i13;
                    iArr2 = iArr3;
                    i11 = iP;
                    j12 = j15;
                    F(iArr2, j23, j19, j17, j25, bVar, j10, bVar5, 0L, j12, j29);
                    bVar2 = bVar5;
                } else {
                    iArr2 = iArr3;
                    i11 = iP;
                    j12 = j15;
                    F(iArr2, j23, j19, j17, j25, bVar5, 0L, bVar, j10, j12, i10);
                    bVar2 = bVar5;
                }
                int[] iArr4 = iArr2;
                j11 = j23;
                j15 = j12;
                if (iArr4[0] != 0) {
                    j18 = 1 - j18;
                }
                iArr = iArr4;
                i12 = i10;
            } else {
                j11 = j23;
                i11 = iP;
                bVar2 = bVar5;
                j21 = j21;
                j24 = j24;
                int[] iArr5 = iArr3;
                long j30 = j17;
                if (j18 == 0) {
                    bVar3 = bVar2;
                    iArr = iArr5;
                    i12 = i10;
                    D(j11, j30, bVar, j10, bVar3, 0L, j15, i10);
                    bVar2 = bVar3;
                } else {
                    iArr = iArr5;
                    i12 = i10;
                    D(j11, j30, bVar2, 0L, bVar, j10, j15, i12);
                }
                j18 = 1 - j18;
            }
            j15 += ((long) (i11 - 1)) * j11;
            j16++;
            aVar = this;
            bVar4 = bVar2;
            i13 = i12;
            iArr3 = iArr;
            j17 = j20;
            j13 = j21;
            jP = j24;
        }
        long j31 = j13;
        vp.b bVar6 = bVar4;
        if (j18 == 0) {
            return;
        }
        vp.e.a(bVar6, 0L, bVar, j10, j31);
    }

    void n(float[] fArr, int i10, int i11) {
        int[] iArr;
        int i12;
        int i13;
        int i14;
        float[] fArr2;
        int i15;
        a aVar = this;
        int i16 = aVar.f44898a;
        int i17 = i16 * 2;
        float[] fArr3 = new float[i17];
        int i18 = i16 * 4;
        int[] iArr2 = {0};
        int i19 = (int) aVar.f44910m[i18 + 1];
        int i20 = 2;
        int i21 = 2;
        int i22 = i17;
        int i23 = 0;
        int i24 = 1;
        while (i21 <= i19 + 1) {
            int i25 = (int) aVar.f44910m[i21 + i18];
            int i26 = i25 * i24;
            int i27 = aVar.f44898a / i26;
            int i28 = i27 + i27;
            int i29 = i21;
            int i30 = i28 * i24;
            if (i25 == i20) {
                iArr = iArr2;
                i12 = i28;
                i13 = i19;
                i20 = i20;
                int i31 = i24;
                i29 = i29;
                i14 = i25;
                if (i23 == 0) {
                    fArr2 = fArr3;
                    w(i12, i31, fArr, i10, fArr2, 0, i22, i11);
                    fArr3 = fArr2;
                } else {
                    w(i12, i31, fArr3, 0, fArr, i10, i22, i11);
                }
                i23 = 1 - i23;
            } else if (i25 == 3) {
                iArr = iArr2;
                i12 = i28;
                i13 = i19;
                i20 = i20;
                int i32 = i24;
                i29 = i29;
                i14 = i25;
                if (i23 == 0) {
                    fArr2 = fArr3;
                    y(i12, i32, fArr, i10, fArr2, 0, i22, i11);
                    fArr3 = fArr2;
                } else {
                    y(i12, i32, fArr3, 0, fArr, i10, i22, i11);
                }
                i23 = 1 - i23;
            } else if (i25 != 4) {
                if (i25 != 5) {
                    if (i23 == 0) {
                        int i33 = i19;
                        i15 = i28;
                        float[] fArr4 = fArr3;
                        i13 = i33;
                        int i34 = i22;
                        aVar.E(iArr2, i15, i25, i24, i30, fArr, i10, fArr4, 0, i34, i11);
                        i22 = i34;
                        i14 = i25;
                        fArr3 = fArr4;
                    } else {
                        i13 = i19;
                        int i35 = i24;
                        i15 = i28;
                        int i36 = i22;
                        float[] fArr5 = fArr3;
                        E(iArr2, i15, i25, i35, i30, fArr5, 0, fArr, i10, i36, i11);
                        i22 = i36;
                        i14 = i25;
                        fArr3 = fArr5;
                    }
                    iArr = iArr2;
                    i12 = i15;
                    if (iArr[0] != 0) {
                    }
                } else {
                    iArr = iArr2;
                    i12 = i28;
                    i13 = i19;
                    i20 = i20;
                    int i37 = i24;
                    i29 = i29;
                    i14 = i25;
                    if (i23 == 0) {
                        fArr2 = fArr3;
                        C(i12, i37, fArr, i10, fArr2, 0, i22, i11);
                        fArr3 = fArr2;
                    } else {
                        C(i12, i37, fArr3, 0, fArr, i10, i22, i11);
                    }
                }
                i23 = 1 - i23;
            } else {
                iArr = iArr2;
                i12 = i28;
                i13 = i19;
                i20 = i20;
                int i38 = i24;
                i29 = i29;
                i14 = i25;
                if (i23 == 0) {
                    fArr2 = fArr3;
                    A(i12, i38, fArr, i10, fArr2, 0, i22, i11);
                    fArr3 = fArr2;
                } else {
                    A(i12, i38, fArr3, 0, fArr, i10, i22, i11);
                }
                i23 = 1 - i23;
            }
            i22 += (i14 - 1) * i12;
            i21 = i29 + 1;
            aVar = this;
            iArr2 = iArr;
            i24 = i26;
            i19 = i13;
            i20 = i20;
        }
        if (i23 == 0) {
            return;
        }
        System.arraycopy(fArr3, 0, fArr, i10, i17);
    }

    final void o() {
        int i10;
        int i11;
        int i12 = this.f44898a;
        int i13 = 1;
        if (i12 == 1) {
            return;
        }
        int i14 = i12 * 2;
        int i15 = i12 * 4;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i16 + 1;
            i10 = 2;
            i17 = i19 <= 4 ? f44897w[i16] : i17 + 2;
            while (true) {
                int i20 = i12 / i17;
                if (i12 - (i17 * i20) != 0) {
                    break;
                }
                i11 = i18 + 1;
                this.f44910m[i18 + 2 + i15] = i17;
                if (i17 == 2 && i11 != 1) {
                    for (int i21 = 2; i21 <= i11; i21++) {
                        int i22 = (i11 - i21) + 2 + i15;
                        float[] fArr = this.f44910m;
                        fArr[i22 + 1] = fArr[i22];
                    }
                    this.f44910m[i15 + 2] = 2.0f;
                }
                if (i20 == 1) {
                    break loop0;
                }
                i12 = i20;
                i18 = i11;
            }
            i16 = i19;
        }
        float[] fArr2 = this.f44910m;
        int i23 = this.f44898a;
        fArr2[i15] = i23;
        fArr2[i15 + 1] = i11;
        float f10 = 6.2831855f / i23;
        int i24 = 1;
        int i25 = 1;
        int i26 = 1;
        while (i24 <= i11) {
            i24++;
            int i27 = (int) this.f44910m[i24 + i15];
            int i28 = i25 * i27;
            int i29 = this.f44898a / i28;
            int i30 = i29 + i29 + i10;
            int i31 = i27 - 1;
            int i32 = 0;
            while (i13 <= i31) {
                float[] fArr3 = this.f44910m;
                fArr3[(i26 - 1) + i14] = 1.0f;
                int i33 = i26 + i14;
                float f11 = 0.0f;
                fArr3[i33] = 0.0f;
                int i34 = i32 + i25;
                float f12 = i34 * f10;
                int i35 = 4;
                while (i35 <= i30) {
                    i26 += 2;
                    f11 += 1.0f;
                    int i36 = i11;
                    int i37 = i26 + i14;
                    double d10 = f11 * f12;
                    this.f44910m[i37 - 1] = (float) bo.a.b(d10);
                    this.f44910m[i37] = (float) bo.a.l(d10);
                    i35 += 2;
                    i11 = i36;
                    i13 = i13;
                }
                int i38 = i11;
                int i39 = i13;
                if (i27 > 5) {
                    int i40 = i26 + i14;
                    float[] fArr4 = this.f44910m;
                    fArr4[i33 - 1] = fArr4[i40 - 1];
                    fArr4[i33] = fArr4[i40];
                }
                i13 = i39 + 1;
                i32 = i34;
                i11 = i38;
                i10 = 2;
            }
            i25 = i28;
            i13 = 1;
        }
    }

    final void p() {
        long j10;
        long j11;
        long j12;
        long j13 = this.f44899b;
        if (j13 == 1) {
            return;
        }
        long j14 = 2;
        long j15 = j13 * 2;
        long j16 = 4;
        long j17 = j13 * 4;
        long j18 = 0;
        long j19 = 1;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        loop0: while (true) {
            long j23 = j20 + 1;
            long j24 = j23 <= j16 ? f44897w[(int) j20] : j21 + j14;
            while (true) {
                long j25 = j13 / j24;
                if (j13 - (j24 * j25) != j18) {
                    break;
                }
                j10 = j22 + 1;
                j11 = j14;
                this.f44911n.r(j22 + j11 + j17, j24);
                if (j24 != j11 || j10 == 1) {
                    j12 = j24;
                } else {
                    long j26 = j11;
                    while (j26 <= j10) {
                        long j27 = (j10 - j26) + j11 + j17;
                        vp.b bVar = this.f44911n;
                        bVar.r(j27 + 1, bVar.p(j27));
                        j26++;
                        j24 = j24;
                    }
                    j12 = j24;
                    this.f44911n.r(j17 + j11, 2.0f);
                }
                if (j25 == 1) {
                    break loop0;
                }
                j13 = j25;
                j14 = j11;
                j24 = j12;
                j22 = j10;
                j16 = 4;
                j18 = 0;
            }
            j21 = j24;
            j20 = j23;
        }
        this.f44911n.r(j17, this.f44899b);
        this.f44911n.r(j17 + 1, j10);
        float f10 = 6.2831855f / this.f44899b;
        long j28 = 1;
        long j29 = 1;
        long j30 = 1;
        while (j28 <= j10) {
            j28 += j19;
            long j31 = j10;
            long jP = (long) this.f44911n.p(j28 + j17);
            long j32 = j29 * jP;
            long j33 = this.f44899b / j32;
            long j34 = j33 + j33 + j11;
            long j35 = jP - j19;
            long j36 = j19;
            long j37 = 0;
            while (j36 <= j35) {
                long j38 = j34;
                long j39 = j19;
                this.f44911n.r((j30 - j19) + j15, 1.0f);
                long j40 = j30 + j15;
                float f11 = 0.0f;
                this.f44911n.r(j40, 0.0f);
                float f12 = f10;
                long j41 = j28;
                long j42 = j37 + j29;
                float f13 = j42 * f12;
                long j43 = 4;
                while (j43 <= j38) {
                    j30 += j11;
                    f11 += 1.0f;
                    long j44 = j42;
                    long j45 = j30 + j15;
                    long j46 = j29;
                    double d10 = f11 * f13;
                    this.f44911n.r(j45 - j39, (float) bo.a.b(d10));
                    this.f44911n.r(j45, (float) bo.a.l(d10));
                    j43 += j11;
                    f12 = f12;
                    j42 = j44;
                    f13 = f13;
                    j15 = j15;
                    j29 = j46;
                }
                float f14 = f12;
                long j47 = j42;
                long j48 = j15;
                long j49 = j29;
                if (jP > 5) {
                    long j50 = j30 + j48;
                    vp.b bVar2 = this.f44911n;
                    bVar2.r(j40 - j39, bVar2.p(j50 - j39));
                    vp.b bVar3 = this.f44911n;
                    bVar3.r(j40, bVar3.p(j50));
                }
                j36 += j39;
                j19 = j39;
                j34 = j38;
                j28 = j41;
                f10 = f14;
                j37 = j47;
                j15 = j48;
                j29 = j49;
            }
            j29 = j32;
            j10 = j31;
        }
    }

    public void q(vp.b bVar, long j10) {
        if (!this.f44919v) {
            if (bVar.j() || bVar.i() || j10 >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            s(bVar.n(), (int) j10);
            return;
        }
        if (this.f44899b == 1) {
            return;
        }
        int i10 = j.f44967a[this.f44918u.ordinal()];
        if (i10 == 1) {
            mp.a.r(2 * this.f44899b, bVar, j10, this.f44903f, this.f44907j, this.f44905h);
        } else if (i10 == 2) {
            m(bVar, j10, -1);
        } else {
            if (i10 != 3) {
                return;
            }
            e(bVar, j10, -1);
        }
    }

    public void r(float[] fArr) {
        s(fArr, 0);
    }

    public void s(float[] fArr, int i10) {
        if (this.f44919v) {
            q(new vp.b(fArr), i10);
            return;
        }
        if (this.f44898a == 1) {
            return;
        }
        int i11 = j.f44967a[this.f44918u.ordinal()];
        if (i11 == 1) {
            mp.a.q(this.f44898a * 2, fArr, i10, this.f44902e, this.f44906i, this.f44904g);
        } else if (i11 == 2) {
            n(fArr, i10, -1);
        } else {
            if (i11 != 3) {
                return;
            }
            f(fArr, i10, -1);
        }
    }

    public void u(float[] fArr, int i10, boolean z10) {
        float[] fArr2;
        int i11;
        if (this.f44919v) {
            t(new vp.b(fArr), i10, z10);
            return;
        }
        if (this.f44898a == 1) {
            return;
        }
        int i12 = j.f44967a[this.f44918u.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                n(fArr, i10, 1);
            } else if (i12 == 3) {
                f(fArr, i10, 1);
            }
            fArr2 = fArr;
            i11 = i10;
        } else {
            fArr2 = fArr;
            i11 = i10;
            mp.a.E(this.f44898a * 2, fArr2, i11, this.f44902e, this.f44906i, this.f44904g);
        }
        if (z10) {
            int i13 = this.f44898a;
            mp.a.q0(i13, 1.0f / i13, fArr2, i11, true);
        }
    }

    public void v(float[] fArr, boolean z10) {
        u(fArr, 0, z10);
    }

    void w(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14, int i15) {
        int i16 = i10 * i11;
        if (i10 <= 2) {
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = i17 * i10;
                int i19 = i12 + (i18 * 2);
                int i20 = i19 + i10;
                float f10 = fArr[i19];
                float f11 = fArr[i19 + 1];
                float f12 = fArr[i20];
                float f13 = fArr[i20 + 1];
                int i21 = i13 + i18;
                int i22 = i21 + i16;
                fArr2[i21] = f10 + f12;
                fArr2[i21 + 1] = f11 + f13;
                fArr2[i22] = f10 - f12;
                fArr2[i22 + 1] = f11 - f13;
            }
        } else {
            for (int i23 = 0; i23 < i11; i23++) {
                for (int i24 = 0; i24 < i10 - 1; i24 += 2) {
                    int i25 = i23 * i10;
                    int i26 = i12 + i24 + (i25 * 2);
                    int i27 = i26 + i10;
                    float f14 = fArr[i26];
                    float f15 = fArr[i26 + 1];
                    float f16 = fArr[i27];
                    float f17 = fArr[i27 + 1];
                    int i28 = i24 + i14;
                    float[] fArr3 = this.f44910m;
                    float f18 = fArr3[i28];
                    float f19 = i15 * fArr3[i28 + 1];
                    float f20 = f14 - f16;
                    float f21 = f15 - f17;
                    int i29 = i13 + i24 + i25;
                    int i30 = i29 + i16;
                    fArr2[i29] = f14 + f16;
                    fArr2[i29 + 1] = f15 + f17;
                    fArr2[i30] = (f18 * f20) - (f19 * f21);
                    fArr2[i30 + 1] = (f18 * f21) + (f19 * f20);
                }
            }
        }
    }

    void x(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14, long j15) {
        vp.b bVar3 = bVar;
        long j16 = j10 * j11;
        long j17 = 2;
        long j18 = 1;
        if (j10 <= 2) {
            long j19 = 0;
            while (j19 < j11) {
                long j20 = j19 * j10;
                long j21 = j12 + (j20 * j17);
                long j22 = j17;
                long j23 = j21 + j10;
                float fP = bVar3.p(j21);
                float fP2 = bVar3.p(j21 + j18);
                float fP3 = bVar3.p(j23);
                float fP4 = bVar3.p(j23 + j18);
                long j24 = j13 + j20;
                long j25 = j18;
                long j26 = j24 + j16;
                bVar2.r(j24, fP + fP3);
                bVar2.r(j24 + j25, fP2 + fP4);
                bVar2.r(j26, fP - fP3);
                bVar2.r(j26 + j25, fP2 - fP4);
                j19 += j25;
                j17 = j22;
                j18 = j25;
            }
            return;
        }
        long j27 = 0;
        while (j27 < j11) {
            long j28 = 0;
            while (j28 < j10 - 1) {
                long j29 = j27 * j10;
                long j30 = j12 + j28 + (j29 * 2);
                long j31 = j30 + j10;
                float fP5 = bVar3.p(j30);
                float fP6 = bVar3.p(j30 + 1);
                float fP7 = bVar3.p(j31);
                float fP8 = bVar3.p(j31 + 1);
                long j32 = j16;
                long j33 = j28 + j14;
                float fP9 = this.f44911n.p(j33);
                float fP10 = this.f44911n.p(j33 + 1) * j15;
                float f10 = fP5 - fP7;
                float f11 = fP6 - fP8;
                long j34 = j13 + j28 + j29;
                long j35 = j34 + j32;
                bVar2.r(j34, fP5 + fP7);
                bVar2.r(j34 + 1, fP6 + fP8);
                bVar2.r(j35, (fP9 * f10) - (fP10 * f11));
                bVar2.r(j35 + 1, (fP9 * f11) + (f10 * fP10));
                j28 += 2;
                this = this;
                bVar3 = bVar;
                j16 = j32;
            }
            j27++;
            bVar3 = bVar;
        }
    }

    void y(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, int i14, int i15) {
        int i16 = i14 + i10;
        int i17 = i11 * i10;
        float f10 = -0.5f;
        int i18 = 1;
        int i19 = 2;
        if (i10 == 2) {
            for (int i20 = 1; i20 <= i11; i20++) {
                int i21 = i12 + (((i20 * 3) - 2) * i10);
                int i22 = i21 + i10;
                int i23 = i21 - i10;
                float f11 = fArr[i21];
                float f12 = fArr[i21 + 1];
                float f13 = fArr[i22];
                float f14 = fArr[i22 + 1];
                float f15 = fArr[i23];
                float f16 = fArr[i23 + 1];
                float f17 = f11 + f13;
                float f18 = f15 + (f17 * (-0.5f));
                float f19 = f12 + f14;
                float f20 = f16 + (f19 * (-0.5f));
                float f21 = i15 * 0.8660254f;
                float f22 = (f11 - f13) * f21;
                float f23 = f21 * (f12 - f14);
                int i24 = i13 + ((i20 - 1) * i10);
                int i25 = i24 + i17;
                int i26 = i25 + i17;
                fArr2[i24] = f15 + f17;
                fArr2[i24 + 1] = f16 + f19;
                fArr2[i25] = f18 - f23;
                fArr2[i25 + 1] = f20 + f22;
                fArr2[i26] = f18 + f23;
                fArr2[i26 + 1] = f20 - f22;
            }
        } else {
            int i27 = 1;
            while (i27 <= i11) {
                int i28 = i12 + (((i27 * 3) - i19) * i10);
                int i29 = i13 + ((i27 - 1) * i10);
                int i30 = 0;
                while (i30 < i10 - 1) {
                    int i31 = i30 + i28;
                    int i32 = i31 + i10;
                    int i33 = i31 - i10;
                    float f24 = fArr[i31];
                    float f25 = fArr[i31 + i18];
                    float f26 = fArr[i32];
                    float f27 = fArr[i32 + i18];
                    float f28 = fArr[i33];
                    float f29 = fArr[i33 + i18];
                    float f30 = f24 + f26;
                    float f31 = f28 + (f30 * f10);
                    float f32 = f25 + f27;
                    float f33 = f29 + (f32 * f10);
                    float f34 = i15;
                    float f35 = f34 * 0.8660254f;
                    float f36 = (f24 - f26) * f35;
                    float f37 = f35 * (f25 - f27);
                    float f38 = f31 - f37;
                    float f39 = f31 + f37;
                    float f40 = f33 + f36;
                    float f41 = f33 - f36;
                    int i34 = i30 + i14;
                    int i35 = i30 + i16;
                    float[] fArr3 = this.f44910m;
                    float f42 = fArr3[i34];
                    float f43 = fArr3[i34 + 1] * f34;
                    float f44 = fArr3[i35];
                    float f45 = f34 * fArr3[i35 + 1];
                    int i36 = i30 + i29;
                    int i37 = i36 + i17;
                    int i38 = i37 + i17;
                    fArr2[i36] = f28 + f30;
                    fArr2[i36 + 1] = f29 + f32;
                    fArr2[i37] = (f42 * f38) - (f43 * f40);
                    fArr2[i37 + 1] = (f42 * f40) + (f43 * f38);
                    fArr2[i38] = (f44 * f39) - (f45 * f41);
                    fArr2[i38 + 1] = (f44 * f41) + (f45 * f39);
                    i30 += 2;
                    i18 = i18;
                    f10 = -0.5f;
                }
                i27++;
                i18 = i18;
                f10 = -0.5f;
                i19 = 2;
            }
        }
    }

    void z(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13, long j14, long j15) {
        vp.b bVar3 = bVar;
        long j16 = j15;
        long j17 = j14 + j10;
        long j18 = j11 * j10;
        long j19 = 2;
        long j20 = 3;
        if (j10 == 2) {
            long j21 = 1;
            while (j21 <= j11) {
                long j22 = j19;
                long j23 = j12 + (((j21 * j20) - j19) * j10);
                long j24 = j20;
                long j25 = j23 + j10;
                long j26 = j23 - j10;
                float fP = bVar3.p(j23);
                float fP2 = bVar3.p(j23 + 1);
                float fP3 = bVar3.p(j25);
                float fP4 = bVar3.p(j25 + 1);
                float fP5 = bVar3.p(j26);
                float fP6 = bVar3.p(j26 + 1);
                float f10 = fP + fP3;
                float f11 = fP5 + (f10 * (-0.5f));
                float f12 = fP2 + fP4;
                float f13 = fP6 + (f12 * (-0.5f));
                float f14 = j16 * 0.8660254f;
                float f15 = (fP - fP3) * f14;
                float f16 = f14 * (fP2 - fP4);
                long j27 = j21;
                long j28 = j13 + ((j21 - 1) * j10);
                long j29 = j18;
                long j30 = j28 + j29;
                long j31 = j30 + j29;
                bVar2.r(j28, bVar3.p(j26) + f10);
                bVar2.r(j28 + 1, fP6 + f12);
                bVar2.r(j30, f11 - f16);
                bVar2.r(j30 + 1, f13 + f15);
                bVar2.r(j31, f11 + f16);
                bVar2.r(j31 + 1, f13 - f15);
                j21 = j27 + 1;
                j20 = j24;
                j19 = j22;
                j18 = j29;
            }
            return;
        }
        long j32 = 1;
        while (j32 <= j11) {
            long j33 = j12 + (((j32 * 3) - 2) * j10);
            long j34 = j13 + ((j32 - 1) * j10);
            long j35 = 0;
            while (j35 < j10 - 1) {
                long j36 = j17;
                long j37 = j35 + j33;
                long j38 = j32;
                long j39 = j37 + j10;
                long j40 = j34;
                long j41 = j37 - j10;
                float fP7 = bVar3.p(j37);
                float fP8 = bVar3.p(j37 + 1);
                float fP9 = bVar3.p(j39);
                float fP10 = bVar3.p(j39 + 1);
                float fP11 = bVar3.p(j41);
                float fP12 = bVar3.p(j41 + 1);
                float f17 = fP7 + fP9;
                float f18 = fP11 + (f17 * (-0.5f));
                float f19 = fP8 + fP10;
                float f20 = fP12 + (f19 * (-0.5f));
                float f21 = j16;
                float f22 = f21 * 0.8660254f;
                float f23 = (fP7 - fP9) * f22;
                float f24 = f22 * (fP8 - fP10);
                float f25 = f18 - f24;
                float f26 = f18 + f24;
                float f27 = f20 + f23;
                float f28 = f20 - f23;
                long j42 = j35 + j14;
                long j43 = j35 + j36;
                float fP13 = this.f44911n.p(j42);
                float fP14 = this.f44911n.p(j42 + 1) * f21;
                float fP15 = this.f44911n.p(j43);
                float fP16 = this.f44911n.p(j43 + 1) * f21;
                long j44 = j35 + j40;
                long j45 = j44 + j18;
                long j46 = j45 + j18;
                bVar2.r(j44, fP11 + f17);
                bVar2.r(j44 + 1, fP12 + f19);
                bVar2.r(j45, (fP13 * f25) - (fP14 * f27));
                bVar2.r(j45 + 1, (fP13 * f27) + (fP14 * f25));
                bVar2.r(j46, (fP15 * f26) - (fP16 * f28));
                bVar2.r(j46 + 1, (fP15 * f28) + (fP16 * f26));
                j35 += 2;
                this = this;
                bVar3 = bVar;
                j16 = j15;
                j17 = j36;
                j32 = j38;
                j34 = j40;
            }
            j32++;
            bVar3 = bVar;
            j16 = j15;
        }
    }

    public void t(vp.b bVar, long j10, boolean z10) {
        if (!this.f44919v) {
            if (bVar.j() || bVar.i() || j10 >= 2147483647L) {
                throw new IllegalArgumentException(IAoPeRfJn.iOj);
            }
            u(bVar.n(), (int) j10, z10);
            return;
        }
        if (this.f44899b == 1) {
            return;
        }
        int i10 = j.f44967a[this.f44918u.ordinal()];
        if (i10 == 1) {
            mp.a.F(2 * this.f44899b, bVar, j10, this.f44903f, this.f44907j, this.f44905h);
        } else if (i10 == 2) {
            m(bVar, j10, 1);
        } else if (i10 == 3) {
            e(bVar, j10, 1);
        }
        if (z10) {
            long j11 = this.f44899b;
            mp.a.r0(j11, 1.0f / j11, bVar, j10, true);
        }
    }
}
