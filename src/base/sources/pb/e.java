package pb;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49845d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49847f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f49842a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f49843b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49846e = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f49848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f49849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f49850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f49851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f49852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f49853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f49854g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49855h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f49852e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f49853f / j10;
        }

        public long b() {
            return this.f49853f;
        }

        public boolean d() {
            long j10 = this.f49851d;
            if (j10 == 0) {
                return false;
            }
            return this.f49854g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f49851d > 15 && this.f49855h == 0;
        }

        public void f(long j10) {
            long j11 = this.f49851d;
            if (j11 == 0) {
                this.f49848a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f49848a;
                this.f49849b = j12;
                this.f49853f = j12;
                this.f49852e = 1L;
            } else {
                long j13 = j10 - this.f49850c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f49849b) <= 1000000) {
                    this.f49852e++;
                    this.f49853f += j13;
                    boolean[] zArr = this.f49854g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f49855h--;
                    }
                } else {
                    boolean[] zArr2 = this.f49854g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f49855h++;
                    }
                }
            }
            this.f49851d++;
            this.f49850c = j10;
        }

        public void g() {
            this.f49851d = 0L;
            this.f49852e = 0L;
            this.f49853f = 0L;
            this.f49855h = 0;
            Arrays.fill(this.f49854g, false);
        }
    }

    public long a() {
        return e() ? this.f49842a.a() : C.TIME_UNSET;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f49842a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f49847f;
    }

    public long d() {
        return e() ? this.f49842a.b() : C.TIME_UNSET;
    }

    public boolean e() {
        return this.f49842a.e();
    }

    public void f(long j10) {
        this.f49842a.f(j10);
        if (this.f49842a.e() && !this.f49845d) {
            this.f49844c = false;
        } else if (this.f49846e != C.TIME_UNSET) {
            if (!this.f49844c || this.f49843b.d()) {
                this.f49843b.g();
                this.f49843b.f(this.f49846e);
            }
            this.f49844c = true;
            this.f49843b.f(j10);
        }
        if (this.f49844c && this.f49843b.e()) {
            a aVar = this.f49842a;
            this.f49842a = this.f49843b;
            this.f49843b = aVar;
            this.f49844c = false;
            this.f49845d = false;
        }
        this.f49846e = j10;
        this.f49847f = this.f49842a.e() ? 0 : this.f49847f + 1;
    }

    public void g() {
        this.f49842a.g();
        this.f49843b.g();
        this.f49844c = false;
        this.f49846e = C.TIME_UNSET;
        this.f49847f = 0;
    }
}
