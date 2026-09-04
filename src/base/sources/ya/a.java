package ya;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.d0;
import ob.r0;
import wc.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f57451l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f57452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f57455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f57457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f57459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f57460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f57461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f57462k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f57463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f57464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f57465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f57466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f57467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f57468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f57469g = a.f57451l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f57470h = a.f57451l;

        public a i() {
            return new a(this);
        }

        public b j(byte[] bArr) {
            ob.a.e(bArr);
            this.f57469g = bArr;
            return this;
        }

        public b k(boolean z10) {
            this.f57464b = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f57463a = z10;
            return this;
        }

        public b m(byte[] bArr) {
            ob.a.e(bArr);
            this.f57470h = bArr;
            return this;
        }

        public b n(byte b10) {
            this.f57465c = b10;
            return this;
        }

        public b o(int i10) {
            ob.a.a(i10 >= 0 && i10 <= 65535);
            this.f57466d = i10 & 65535;
            return this;
        }

        public b p(int i10) {
            this.f57468f = i10;
            return this;
        }

        public b q(long j10) {
            this.f57467e = j10;
            return this;
        }
    }

    public static int b(int i10) {
        return d.f(i10 + 1, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static int c(int i10) {
        return d.f(i10 - 1, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static a d(d0 d0Var) {
        byte[] bArr;
        if (d0Var.a() < 12) {
            return null;
        }
        int iH = d0Var.H();
        byte b10 = (byte) (iH >> 6);
        boolean z10 = ((iH >> 5) & 1) == 1;
        byte b11 = (byte) (iH & 15);
        if (b10 != 2) {
            return null;
        }
        int iH2 = d0Var.H();
        boolean z11 = ((iH2 >> 7) & 1) == 1;
        byte b12 = (byte) (iH2 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int iN = d0Var.N();
        long J = d0Var.J();
        int iQ = d0Var.q();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                d0Var.l(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f57451l;
        }
        byte[] bArr2 = new byte[d0Var.a()];
        d0Var.l(bArr2, 0, d0Var.a());
        return new b().l(z10).k(z11).n(b12).o(iN).q(J).p(iQ).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f57457f == aVar.f57457f && this.f57458g == aVar.f57458g && this.f57456e == aVar.f57456e && this.f57459h == aVar.f57459h && this.f57460i == aVar.f57460i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f57457f) * 31) + this.f57458g) * 31) + (this.f57456e ? 1 : 0)) * 31;
        long j10 = this.f57459h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f57460i;
    }

    public String toString() {
        return r0.D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f57457f), Integer.valueOf(this.f57458g), Long.valueOf(this.f57459h), Integer.valueOf(this.f57460i), Boolean.valueOf(this.f57456e));
    }

    private a(b bVar) {
        this.f57452a = (byte) 2;
        this.f57453b = bVar.f57463a;
        this.f57454c = false;
        this.f57456e = bVar.f57464b;
        this.f57457f = bVar.f57465c;
        this.f57458g = bVar.f57466d;
        this.f57459h = bVar.f57467e;
        this.f57460i = bVar.f57468f;
        byte[] bArr = bVar.f57469g;
        this.f57461j = bArr;
        this.f57455d = (byte) (bArr.length / 4);
        this.f57462k = bVar.f57470h;
    }
}
