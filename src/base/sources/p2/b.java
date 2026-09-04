package p2;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;
import o2.h;
import o2.i0;
import o2.j0;
import o2.o0;
import o2.p;
import o2.q;
import o2.r;
import o2.u;
import t1.o;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f49447r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49450u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f49458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f49461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f49462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f49463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j0 f49464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f49465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f49445p = new u() { // from class: p2.a
        @Override // o2.u
        public final p[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f49446q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f49448s = c0.n0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f49449t = c0.n0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f49447r = iArr;
        f49450u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ p[] a() {
        return new p[]{new b()};
    }

    private void g() {
        w1.a.i(this.f49463m);
        c0.h(this.f49462l);
    }

    private static int h(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private j0 i(long j10, boolean z10) {
        return new h(j10, this.f49458h, h(this.f49459i, 20000L), this.f49459i, z10);
    }

    private int j(int i10) throws ParserException {
        if (l(i10)) {
            return this.f49453c ? f49447r[i10] : f49446q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f49453c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean k(int i10) {
        if (this.f49453c) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean l(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return m(i10) || k(i10);
    }

    private boolean m(int i10) {
        if (this.f49453c) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void n() {
        if (this.f49465o) {
            return;
        }
        this.f49465o = true;
        boolean z10 = this.f49453c;
        this.f49463m.b(new o.b().o0(z10 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).f0(f49450u).N(1).p0(z10 ? 16000 : 8000).K());
    }

    private void o(long j10, int i10) {
        int i11;
        if (this.f49457g) {
            return;
        }
        int i12 = this.f49452b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f49459i) == -1 || i11 == this.f49455e)) {
            j0.b bVar = new j0.b(C.TIME_UNSET);
            this.f49464n = bVar;
            this.f49462l.d(bVar);
            this.f49457g = true;
            return;
        }
        if (this.f49460j >= 20 || i10 == -1) {
            j0 j0VarI = i(j10, (i12 & 2) != 0);
            this.f49464n = j0VarI;
            this.f49462l.d(j0VarI);
            this.f49457g = true;
        }
    }

    private static boolean p(q qVar, byte[] bArr) {
        qVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        qVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(q qVar) throws ParserException {
        qVar.resetPeekPosition();
        qVar.peekFully(this.f49451a, 0, 1);
        byte b10 = this.f49451a[0];
        if ((b10 & 131) <= 0) {
            return j((b10 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean r(q qVar) {
        byte[] bArr = f49448s;
        if (p(qVar, bArr)) {
            this.f49453c = false;
            qVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f49449t;
        if (!p(qVar, bArr2)) {
            return false;
        }
        this.f49453c = true;
        qVar.skipFully(bArr2.length);
        return true;
    }

    private int s(q qVar) throws ParserException {
        if (this.f49456f == 0) {
            try {
                int iQ = q(qVar);
                this.f49455e = iQ;
                this.f49456f = iQ;
                if (this.f49459i == -1) {
                    this.f49458h = qVar.getPosition();
                    this.f49459i = this.f49455e;
                }
                if (this.f49459i == this.f49455e) {
                    this.f49460j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f49463m.a(qVar, this.f49456f, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f49456f - iA;
        this.f49456f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f49463m.e(this.f49461k + this.f49454d, 1, this.f49455e, 0, null);
        this.f49454d += 20000;
        return 0;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws ParserException {
        g();
        if (qVar.getPosition() == 0 && !r(qVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        n();
        int iS = s(qVar);
        o(qVar.getLength(), iS);
        return iS;
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f49462l = rVar;
        this.f49463m = rVar.track(0, 1);
        rVar.endTracks();
    }

    @Override // o2.p
    public boolean d(q qVar) {
        return r(qVar);
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f49454d = 0L;
        this.f49455e = 0;
        this.f49456f = 0;
        if (j10 != 0) {
            j0 j0Var = this.f49464n;
            if (j0Var instanceof h) {
                this.f49461k = ((h) j0Var).c(j10);
                return;
            }
        }
        this.f49461k = 0L;
    }

    public b(int i10) {
        this.f49452b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f49451a = new byte[1];
        this.f49459i = -1;
    }

    @Override // o2.p
    public void release() {
    }
}
