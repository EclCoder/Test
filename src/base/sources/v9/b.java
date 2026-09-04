package v9;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;
import ob.r0;
import u9.b0;
import u9.d;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f55274r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f55277u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f55278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f55284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f55285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f55286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m f55289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b0 f55290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private z f55291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f55292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f55272p = new p() { // from class: v9.a
        @Override // u9.p
        public final k[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f55273q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f55275s = r0.q0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f55276t = r0.q0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f55274r = iArr;
        f55277u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ k[] a() {
        return new k[]{new b()};
    }

    private void e() {
        ob.a.i(this.f55290m);
        r0.j(this.f55289l);
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private z g(long j10, boolean z10) {
        return new d(j10, this.f55285h, f(this.f55286i, 20000L), this.f55286i, z10);
    }

    private int h(int i10) throws ParserException {
        if (j(i10)) {
            return this.f55280c ? f55274r[i10] : f55273q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f55280c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean i(int i10) {
        if (this.f55280c) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean j(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return k(i10) || i(i10);
    }

    private boolean k(int i10) {
        if (this.f55280c) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void l() {
        if (this.f55292o) {
            return;
        }
        this.f55292o = true;
        boolean z10 = this.f55280c;
        this.f55290m.e(new v0.b().g0(z10 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).Y(f55277u).J(1).h0(z10 ? 16000 : 8000).G());
    }

    private void m(long j10, int i10) {
        int i11;
        if (this.f55284g) {
            return;
        }
        int i12 = this.f55279b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f55286i) == -1 || i11 == this.f55282e)) {
            z.b bVar = new z.b(C.TIME_UNSET);
            this.f55291n = bVar;
            this.f55289l.c(bVar);
            this.f55284g = true;
            return;
        }
        if (this.f55287j >= 20 || i10 == -1) {
            z zVarG = g(j10, (i12 & 2) != 0);
            this.f55291n = zVarG;
            this.f55289l.c(zVarG);
            this.f55284g = true;
        }
    }

    private static boolean n(l lVar, byte[] bArr) {
        lVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        lVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int o(l lVar) throws ParserException {
        lVar.resetPeekPosition();
        lVar.peekFully(this.f55278a, 0, 1);
        byte b10 = this.f55278a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean p(l lVar) {
        byte[] bArr = f55275s;
        if (n(lVar, bArr)) {
            this.f55280c = false;
            lVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f55276t;
        if (!n(lVar, bArr2)) {
            return false;
        }
        this.f55280c = true;
        lVar.skipFully(bArr2.length);
        return true;
    }

    private int q(l lVar) throws ParserException {
        if (this.f55283f == 0) {
            try {
                int iO = o(lVar);
                this.f55282e = iO;
                this.f55283f = iO;
                if (this.f55286i == -1) {
                    this.f55285h = lVar.getPosition();
                    this.f55286i = this.f55282e;
                }
                if (this.f55286i == this.f55282e) {
                    this.f55287j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f55290m.a(lVar, this.f55283f, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f55283f - iA;
        this.f55283f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f55290m.f(this.f55288k + this.f55281d, 1, this.f55282e, 0, null);
        this.f55281d += 20000;
        return 0;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f55289l = mVar;
        this.f55290m = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // u9.k
    public int c(l lVar, y yVar) throws ParserException {
        e();
        if (lVar.getPosition() == 0 && !p(lVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        l();
        int iQ = q(lVar);
        m(lVar.getLength(), iQ);
        return iQ;
    }

    @Override // u9.k
    public boolean d(l lVar) {
        return p(lVar);
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f55281d = 0L;
        this.f55282e = 0;
        this.f55283f = 0;
        if (j10 != 0) {
            z zVar = this.f55291n;
            if (zVar instanceof d) {
                this.f55288k = ((d) zVar).c(j10);
                return;
            }
        }
        this.f55288k = 0L;
    }

    public b(int i10) {
        this.f55279b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f55278a = new byte[1];
        this.f55286i = -1;
    }

    @Override // u9.k
    public void release() {
    }
}
