package m2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45074d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45076f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f45071a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f45072b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f45075e = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f45077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f45078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f45079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f45080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f45081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f45082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f45083g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45084h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f45081e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f45082f / j10;
        }

        public long b() {
            return this.f45082f;
        }

        public boolean d() {
            long j10 = this.f45080d;
            if (j10 == 0) {
                return false;
            }
            return this.f45083g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f45080d > 15 && this.f45084h == 0;
        }

        public void f(long j10) {
            long j11 = this.f45080d;
            if (j11 == 0) {
                this.f45077a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f45077a;
                this.f45078b = j12;
                this.f45082f = j12;
                this.f45081e = 1L;
            } else {
                long j13 = j10 - this.f45079c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f45078b) <= 1000000) {
                    this.f45081e++;
                    this.f45082f += j13;
                    boolean[] zArr = this.f45083g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f45084h--;
                    }
                } else {
                    boolean[] zArr2 = this.f45083g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f45084h++;
                    }
                }
            }
            this.f45080d++;
            this.f45079c = j10;
        }

        public void g() {
            this.f45080d = 0L;
            this.f45081e = 0L;
            this.f45082f = 0L;
            this.f45084h = 0;
            Arrays.fill(this.f45083g, false);
        }
    }

    public long a() {
        return e() ? this.f45071a.a() : C.TIME_UNSET;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f45071a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f45076f;
    }

    public long d() {
        return e() ? this.f45071a.b() : C.TIME_UNSET;
    }

    public boolean e() {
        return this.f45071a.e();
    }

    public void f(long j10) {
        this.f45071a.f(j10);
        if (this.f45071a.e() && !this.f45074d) {
            this.f45073c = false;
        } else if (this.f45075e != C.TIME_UNSET) {
            if (!this.f45073c || this.f45072b.d()) {
                this.f45072b.g();
                this.f45072b.f(this.f45075e);
            }
            this.f45073c = true;
            this.f45072b.f(j10);
        }
        if (this.f45073c && this.f45072b.e()) {
            a aVar = this.f45071a;
            this.f45071a = this.f45072b;
            this.f45072b = aVar;
            this.f45073c = false;
            this.f45074d = false;
        }
        this.f45075e = j10;
        this.f45076f = this.f45071a.e() ? 0 : this.f45076f + 1;
    }

    public void g() {
        this.f45071a.g();
        this.f45072b.g();
        this.f45073c = false;
        this.f45075e = C.TIME_UNSET;
        this.f45076f = 0;
    }
}
