package i3;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.c0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o2.b0;
import o2.i0;
import o2.j0;
import o2.n0;
import o2.o0;
import ud.qoRq.WwUgngZLNA;
import w1.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class h implements o2.p {
    public static final o2.u K = new o2.u() { // from class: i3.f
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return h.a();
        }
    };
    private static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final t1.o M = new t1.o.b().o0(MimeTypes.APPLICATION_EMSG).K();
    private long A;
    private b B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private o2.r G;
    private o0[] H;
    private o0[] I;
    private boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3.r.a f40869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f40871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f40872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f40873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.u f40874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w1.u f40875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1.u f40876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f40877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w1.u f40878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z f40879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z2.c f40880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w1.u f40881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f40882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque f40883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o0 f40884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c0 f40885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f40888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w1.u f40890v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f40891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f40892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f40893y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f40894z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40897c;

        public a(long j10, boolean z10, int i10) {
            this.f40895a = j10;
            this.f40896b = z10;
            this.f40897c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f40898a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v f40901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f40902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f40904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f40906i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f40909l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f40899b = new u();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w1.u f40900c = new w1.u();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final w1.u f40907j = new w1.u(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final w1.u f40908k = new w1.u();

        public b(o0 o0Var, v vVar, d dVar) {
            this.f40898a = o0Var;
            this.f40901d = vVar;
            this.f40902e = dVar;
            j(vVar, dVar);
        }

        public int c() {
            int i10;
            if (this.f40909l) {
                i10 = this.f40899b.f40984k[this.f40903f] ? 1 : 0;
            } else {
                i10 = this.f40901d.f40998g[this.f40903f];
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f40909l ? this.f40901d.f40994c[this.f40903f] : this.f40899b.f40980g[this.f40905h];
        }

        public long e() {
            return !this.f40909l ? this.f40901d.f40997f[this.f40903f] : this.f40899b.c(this.f40903f);
        }

        public int f() {
            return !this.f40909l ? this.f40901d.f40995d[this.f40903f] : this.f40899b.f40982i[this.f40903f];
        }

        public t g() {
            if (!this.f40909l) {
                return null;
            }
            int i10 = ((d) w1.c0.h(this.f40899b.f40974a)).f40858a;
            t tVarA = this.f40899b.f40987n;
            if (tVarA == null) {
                tVarA = this.f40901d.f40992a.a(i10);
            }
            if (tVarA == null || !tVarA.f40969a) {
                return null;
            }
            return tVarA;
        }

        public boolean h() {
            this.f40903f++;
            if (!this.f40909l) {
                return false;
            }
            int i10 = this.f40904g + 1;
            this.f40904g = i10;
            int[] iArr = this.f40899b.f40981h;
            int i11 = this.f40905h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f40905h = i11 + 1;
            this.f40904g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            w1.u uVar;
            t tVarG = g();
            if (tVarG == null) {
                return 0;
            }
            int length = tVarG.f40972d;
            if (length != 0) {
                uVar = this.f40899b.f40988o;
            } else {
                byte[] bArr = (byte[]) w1.c0.h(tVarG.f40973e);
                this.f40908k.R(bArr, bArr.length);
                w1.u uVar2 = this.f40908k;
                length = bArr.length;
                uVar = uVar2;
            }
            boolean zG = this.f40899b.g(this.f40903f);
            boolean z10 = zG || i11 != 0;
            this.f40907j.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f40907j.T(0);
            this.f40898a.f(this.f40907j, 1, 1);
            this.f40898a.f(uVar, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f40900c.P(8);
                byte[] bArrE = this.f40900c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f40898a.f(this.f40900c, 8, 1);
                return length + 9;
            }
            w1.u uVar3 = this.f40899b.f40988o;
            int iM = uVar3.M();
            uVar3.U(-2);
            int i12 = (iM * 6) + 2;
            if (i11 != 0) {
                this.f40900c.P(i12);
                byte[] bArrE2 = this.f40900c.e();
                uVar3.l(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrE2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                uVar3 = this.f40900c;
            }
            this.f40898a.f(uVar3, i12, 1);
            return length + 1 + i12;
        }

        public void j(v vVar, d dVar) {
            this.f40901d = vVar;
            this.f40902e = dVar;
            this.f40898a.b(vVar.f40992a.f40963f);
            k();
        }

        public void k() {
            this.f40899b.f();
            this.f40903f = 0;
            this.f40905h = 0;
            this.f40904g = 0;
            this.f40906i = 0;
            this.f40909l = false;
        }

        public void l(long j10) {
            int i10 = this.f40903f;
            while (true) {
                u uVar = this.f40899b;
                if (i10 >= uVar.f40979f || uVar.c(i10) > j10) {
                    return;
                }
                if (this.f40899b.f40984k[i10]) {
                    this.f40906i = i10;
                }
                i10++;
            }
        }

        public void m() {
            t tVarG = g();
            if (tVarG == null) {
                return;
            }
            w1.u uVar = this.f40899b.f40988o;
            int i10 = tVarG.f40972d;
            if (i10 != 0) {
                uVar.U(i10);
            }
            if (this.f40899b.g(this.f40903f)) {
                uVar.U(uVar.M() * 6);
            }
        }

        public void n(t1.k kVar) {
            t tVarA = this.f40901d.f40992a.a(((d) w1.c0.h(this.f40899b.f40974a)).f40858a);
            this.f40898a.b(this.f40901d.f40992a.f40963f.a().U(kVar.b(tVarA != null ? tVarA.f40970b : null)).K());
        }
    }

    public h(l3.r.a aVar, int i10) {
        this(aVar, i10, null, null, c0.C(), null);
    }

    private static void A(w1.u uVar, int i10, u uVar2) throws ParserException {
        uVar.T(i10 + 8);
        int iB = i3.a.b(uVar.p());
        if ((iB & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iK = uVar.K();
        if (iK == 0) {
            Arrays.fill(uVar2.f40986m, 0, uVar2.f40979f, false);
            return;
        }
        if (iK == uVar2.f40979f) {
            Arrays.fill(uVar2.f40986m, 0, iK, z10);
            uVar2.d(uVar.a());
            uVar2.b(uVar);
        } else {
            throw ParserException.a("Senc sample count " + iK + " is different from fragment sample count" + uVar2.f40979f, null);
        }
    }

    private static void B(w1.u uVar, u uVar2) throws ParserException {
        A(uVar, 0, uVar2);
    }

    private static Pair C(w1.u uVar, long j10) throws ParserException {
        long jL;
        long jL2;
        uVar.T(8);
        int iC = i3.a.c(uVar.p());
        uVar.U(4);
        long jI = uVar.I();
        if (iC == 0) {
            jL = uVar.I();
            jL2 = uVar.I();
        } else {
            jL = uVar.L();
            jL2 = uVar.L();
        }
        long j11 = j10 + jL2;
        long jN0 = w1.c0.N0(jL, 1000000L, jI);
        uVar.U(2);
        int iM = uVar.M();
        int[] iArr = new int[iM];
        long[] jArr = new long[iM];
        long[] jArr2 = new long[iM];
        long[] jArr3 = new long[iM];
        long j12 = j11;
        long jN1 = jN0;
        int i10 = 0;
        while (i10 < iM) {
            int iP = uVar.p();
            if ((Integer.MIN_VALUE & iP) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long jI2 = uVar.I();
            iArr[i10] = iP & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jN1;
            jL += jI2;
            long[] jArr4 = jArr3;
            jN1 = w1.c0.N0(jL, 1000000L, jI);
            jArr2[i10] = jN1 - jArr4[i10];
            uVar.U(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jN0), new o2.g(iArr, jArr, jArr2, jArr3));
    }

    private static long D(w1.u uVar) {
        uVar.T(8);
        return i3.a.c(uVar.p()) == 1 ? uVar.L() : uVar.I();
    }

    private static b E(w1.u uVar, SparseArray sparseArray, boolean z10) {
        uVar.T(8);
        int iB = i3.a.b(uVar.p());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(uVar.p()));
        if (bVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jL = uVar.L();
            u uVar2 = bVar.f40899b;
            uVar2.f40976c = jL;
            uVar2.f40977d = jL;
        }
        d dVar = bVar.f40902e;
        bVar.f40899b.f40974a = new d((iB & 2) != 0 ? uVar.p() - 1 : dVar.f40858a, (iB & 8) != 0 ? uVar.p() : dVar.f40859b, (iB & 16) != 0 ? uVar.p() : dVar.f40860c, (iB & 32) != 0 ? uVar.p() : dVar.f40861d);
        return bVar;
    }

    private static void F(i3.a.C0621a c0621a, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        b bVarE = E(((i3.a.b) w1.a.e(c0621a.g(1952868452))).f40825b, sparseArray, z10);
        if (bVarE == null) {
            return;
        }
        u uVar = bVarE.f40899b;
        long j10 = uVar.f40990q;
        boolean z11 = uVar.f40991r;
        bVarE.k();
        bVarE.f40909l = true;
        i3.a.b bVarG = c0621a.g(1952867444);
        if (bVarG == null || (i10 & 2) != 0) {
            uVar.f40990q = j10;
            uVar.f40991r = z11;
        } else {
            uVar.f40990q = D(bVarG.f40825b);
            uVar.f40991r = true;
        }
        I(c0621a, bVarE, i10);
        t tVarA = bVarE.f40901d.f40992a.a(((d) w1.a.e(uVar.f40974a)).f40858a);
        i3.a.b bVarG2 = c0621a.g(1935763834);
        if (bVarG2 != null) {
            y((t) w1.a.e(tVarA), bVarG2.f40825b, uVar);
        }
        i3.a.b bVarG3 = c0621a.g(1935763823);
        if (bVarG3 != null) {
            x(bVarG3.f40825b, uVar);
        }
        i3.a.b bVarG4 = c0621a.g(1936027235);
        if (bVarG4 != null) {
            B(bVarG4.f40825b, uVar);
        }
        z(c0621a, tVarA != null ? tVarA.f40970b : null, uVar);
        int size = c0621a.f40823c.size();
        for (int i11 = 0; i11 < size; i11++) {
            i3.a.b bVar = (i3.a.b) c0621a.f40823c.get(i11);
            if (bVar.f40821a == 1970628964) {
                J(bVar.f40825b, uVar, bArr);
            }
        }
    }

    private static Pair G(w1.u uVar) {
        uVar.T(12);
        return Pair.create(Integer.valueOf(uVar.p()), new d(uVar.p() - 1, uVar.p(), uVar.p(), uVar.p()));
    }

    private static int H(b bVar, int i10, int i11, w1.u uVar, int i12) throws ParserException {
        int iP;
        uVar.T(8);
        int iB = i3.a.b(uVar.p());
        s sVar = bVar.f40901d.f40992a;
        u uVar2 = bVar.f40899b;
        d dVar = (d) w1.c0.h(uVar2.f40974a);
        uVar2.f40981h[i10] = uVar.K();
        long[] jArr = uVar2.f40980g;
        long j10 = uVar2.f40976c;
        jArr[i10] = j10;
        if ((iB & 1) != 0) {
            jArr[i10] = j10 + ((long) uVar.p());
        }
        boolean z10 = (iB & 4) != 0;
        int iP2 = dVar.f40861d;
        if (z10) {
            iP2 = uVar.p();
        }
        boolean z11 = (iB & 256) != 0;
        boolean z12 = (iB & 512) != 0;
        boolean z13 = (iB & UserVerificationMethods.USER_VERIFY_ALL) != 0;
        boolean z14 = (iB & 2048) != 0;
        long j11 = n(sVar) ? ((long[]) w1.c0.h(sVar.f40966i))[0] : 0L;
        int[] iArr = uVar2.f40982i;
        long[] jArr2 = uVar2.f40983j;
        boolean[] zArr = uVar2.f40984k;
        boolean z15 = z14;
        boolean z16 = sVar.f40959b == 2 && (i11 & 1) != 0;
        int i13 = i12 + uVar2.f40981h[i10];
        boolean z17 = z10;
        long j12 = sVar.f40960c;
        long j13 = uVar2.f40990q;
        int i14 = i12;
        while (i14 < i13) {
            int iG = g(z11 ? uVar.p() : dVar.f40859b);
            int iG2 = g(z12 ? uVar.p() : dVar.f40860c);
            if (z13) {
                iP = uVar.p();
            } else {
                iP = (i14 == 0 && z17) ? iP2 : dVar.f40861d;
            }
            int i15 = i14;
            long jN0 = w1.c0.N0((((long) (z15 ? uVar.p() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i15] = jN0;
            if (!uVar2.f40991r) {
                jArr2[i15] = jN0 + bVar.f40901d.f40999h;
            }
            iArr[i15] = iG2;
            zArr[i15] = ((iP >> 16) & 1) == 0 && (!z16 || i15 == 0);
            j13 += (long) iG;
            i14 = i15 + 1;
            i13 = i13;
            z16 = z16;
        }
        int i16 = i13;
        uVar2.f40990q = j13;
        return i16;
    }

    private static void I(i3.a.C0621a c0621a, b bVar, int i10) throws ParserException {
        List list = c0621a.f40823c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i3.a.b bVar2 = (i3.a.b) list.get(i13);
            if (bVar2.f40821a == 1953658222) {
                w1.u uVar = bVar2.f40825b;
                uVar.T(12);
                int iK = uVar.K();
                if (iK > 0) {
                    i12 += iK;
                    i11++;
                }
            }
        }
        bVar.f40905h = 0;
        bVar.f40904g = 0;
        bVar.f40903f = 0;
        bVar.f40899b.e(i11, i12);
        int i14 = 0;
        int iH = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i3.a.b bVar3 = (i3.a.b) list.get(i15);
            if (bVar3.f40821a == 1953658222) {
                iH = H(bVar, i14, i10, bVar3.f40825b, iH);
                i14++;
            }
        }
    }

    private static void J(w1.u uVar, u uVar2, byte[] bArr) throws ParserException {
        uVar.T(8);
        uVar.l(bArr, 0, 16);
        if (Arrays.equals(bArr, L)) {
            A(uVar, 16, uVar2);
        }
    }

    private void K(long j10) throws ParserException {
        while (!this.f40882n.isEmpty() && ((i3.a.C0621a) this.f40882n.peek()).f40822b == j10) {
            p((i3.a.C0621a) this.f40882n.pop());
        }
        h();
    }

    private boolean L(o2.q qVar) throws ParserException {
        if (this.f40889u == 0) {
            if (!qVar.readFully(this.f40881m.e(), 0, 8, true)) {
                return false;
            }
            this.f40889u = 8;
            this.f40881m.T(0);
            this.f40888t = this.f40881m.I();
            this.f40887s = this.f40881m.p();
        }
        long j10 = this.f40888t;
        if (j10 == 1) {
            qVar.readFully(this.f40881m.e(), 8, 8);
            this.f40889u += 8;
            this.f40888t = this.f40881m.L();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && !this.f40882n.isEmpty()) {
                length = ((i3.a.C0621a) this.f40882n.peek()).f40822b;
            }
            if (length != -1) {
                this.f40888t = (length - qVar.getPosition()) + ((long) this.f40889u);
            }
        }
        if (this.f40888t < this.f40889u) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        long position = qVar.getPosition() - ((long) this.f40889u);
        int i10 = this.f40887s;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.J) {
            this.G.d(new j0.b(this.f40894z, position));
            this.J = true;
        }
        if (this.f40887s == 1836019558) {
            int size = this.f40873e.size();
            for (int i11 = 0; i11 < size; i11++) {
                u uVar = ((b) this.f40873e.valueAt(i11)).f40899b;
                uVar.f40975b = position;
                uVar.f40977d = position;
                uVar.f40976c = position;
            }
        }
        int i12 = this.f40887s;
        if (i12 == 1835295092) {
            this.B = null;
            this.f40891w = position + this.f40888t;
            this.f40886r = 2;
            return true;
        }
        if (P(i12)) {
            long position2 = (qVar.getPosition() + this.f40888t) - 8;
            this.f40882n.push(new i3.a.C0621a(this.f40887s, position2));
            if (this.f40888t == this.f40889u) {
                K(position2);
            } else {
                h();
            }
        } else if (Q(this.f40887s)) {
            if (this.f40889u != 8) {
                throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f40888t > 2147483647L) {
                throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
            }
            w1.u uVar2 = new w1.u((int) this.f40888t);
            System.arraycopy(this.f40881m.e(), 0, uVar2.e(), 0, 8);
            this.f40890v = uVar2;
            this.f40886r = 1;
        } else {
            if (this.f40888t > 2147483647L) {
                throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f40890v = null;
            this.f40886r = 1;
        }
        return true;
    }

    private void M(o2.q qVar) throws ParserException {
        int i10 = ((int) this.f40888t) - this.f40889u;
        w1.u uVar = this.f40890v;
        if (uVar != null) {
            qVar.readFully(uVar.e(), 8, i10);
            r(new i3.a.b(this.f40887s, uVar), qVar.getPosition());
        } else {
            qVar.skipFully(i10);
        }
        K(qVar.getPosition());
    }

    private void N(o2.q qVar) throws ParserException {
        int size = this.f40873e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = ((b) this.f40873e.valueAt(i10)).f40899b;
            if (uVar.f40989p) {
                long j11 = uVar.f40977d;
                if (j11 < j10) {
                    bVar = (b) this.f40873e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f40886r = 3;
            return;
        }
        int position = (int) (j10 - qVar.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        qVar.skipFully(position);
        bVar.f40899b.a(qVar);
    }

    private static boolean P(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean Q(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new h(l3.r.a.f43873a, 32)};
    }

    private static int g(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.a("Unexpected negative value: " + i10, null);
    }

    private void h() {
        this.f40886r = 0;
        this.f40889u = 0;
    }

    private d i(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (d) sparseArray.valueAt(0) : (d) w1.a.e((d) sparseArray.get(i10));
    }

    private static t1.k j(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            i3.a.b bVar = (i3.a.b) list.get(i10);
            if (bVar.f40821a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = bVar.f40825b.e();
                UUID uuidF = o.f(bArrE);
                if (uuidF == null) {
                    w1.n.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new t1.k.b(uuidF, MimeTypes.VIDEO_MP4, bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new t1.k(arrayList);
    }

    private static b k(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f40909l || bVar2.f40903f != bVar2.f40901d.f40993b) && (!bVar2.f40909l || bVar2.f40905h != bVar2.f40899b.f40978e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void m() {
        int i10;
        o0[] o0VarArr = new o0[2];
        this.H = o0VarArr;
        o0 o0Var = this.f40884p;
        int i11 = 0;
        if (o0Var != null) {
            o0VarArr[0] = o0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f40870b & 4) != 0) {
            o0VarArr[i10] = this.G.track(100, 5);
            i12 = 101;
            i10++;
        }
        o0[] o0VarArr2 = (o0[]) w1.c0.I0(this.H, i10);
        this.H = o0VarArr2;
        for (o0 o0Var2 : o0VarArr2) {
            o0Var2.b(M);
        }
        this.I = new o0[this.f40872d.size()];
        while (i11 < this.I.length) {
            o0 o0VarTrack = this.G.track(i12, 3);
            o0VarTrack.b((t1.o) this.f40872d.get(i11));
            this.I[i11] = o0VarTrack;
            i11++;
            i12++;
        }
    }

    private static boolean n(s sVar) {
        long[] jArr;
        long[] jArr2 = sVar.f40965h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = sVar.f40966i) != null) {
            long j10 = jArr2[0];
            if (j10 == 0 || w1.c0.N0(j10 + jArr[0], 1000000L, sVar.f40961d) >= sVar.f40962e) {
                return true;
            }
        }
        return false;
    }

    private void p(i3.a.C0621a c0621a) throws ParserException {
        int i10 = c0621a.f40821a;
        if (i10 == 1836019574) {
            t(c0621a);
        } else if (i10 == 1836019558) {
            s(c0621a);
        } else {
            if (this.f40882n.isEmpty()) {
                return;
            }
            ((i3.a.C0621a) this.f40882n.peek()).d(c0621a);
        }
    }

    private void q(w1.u uVar) {
        String str;
        String str2;
        long jN0;
        long jN1;
        long jI;
        long jA;
        if (this.H.length == 0) {
            return;
        }
        uVar.T(8);
        int iC = i3.a.c(uVar.p());
        if (iC == 0) {
            str = (String) w1.a.e(uVar.A());
            str2 = (String) w1.a.e(uVar.A());
            long jI2 = uVar.I();
            jN0 = w1.c0.N0(uVar.I(), 1000000L, jI2);
            long j10 = this.A;
            long j11 = j10 != C.TIME_UNSET ? j10 + jN0 : -9223372036854775807L;
            jN1 = w1.c0.N0(uVar.I(), 1000L, jI2);
            jI = uVar.I();
            jA = j11;
        } else {
            if (iC != 1) {
                w1.n.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jI3 = uVar.I();
            jA = w1.c0.N0(uVar.L(), 1000000L, jI3);
            long jN2 = w1.c0.N0(uVar.I(), 1000L, jI3);
            long jI4 = uVar.I();
            str = (String) w1.a.e(uVar.A());
            str2 = (String) w1.a.e(uVar.A());
            jN1 = jN2;
            jI = jI4;
            jN0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[uVar.a()];
        uVar.l(bArr, 0, uVar.a());
        w1.u uVar2 = new w1.u(this.f40880l.a(new z2.a(str3, str4, jN1, jI, bArr)));
        int iA = uVar2.a();
        for (o0 o0Var : this.H) {
            uVar2.T(0);
            o0Var.c(uVar2, iA);
        }
        if (jA == C.TIME_UNSET) {
            this.f40883o.addLast(new a(jN0, true, iA));
            this.f40892x += iA;
            return;
        }
        if (!this.f40883o.isEmpty()) {
            this.f40883o.addLast(new a(jA, false, iA));
            this.f40892x += iA;
            return;
        }
        z zVar = this.f40879k;
        if (zVar != null && !zVar.g()) {
            this.f40883o.addLast(new a(jA, false, iA));
            this.f40892x += iA;
            return;
        }
        z zVar2 = this.f40879k;
        if (zVar2 != null) {
            jA = zVar2.a(jA);
        }
        long j12 = jA;
        for (o0 o0Var2 : this.H) {
            o0Var2.e(j12, 1, iA, 0, null);
        }
    }

    private void r(i3.a.b bVar, long j10) throws ParserException {
        if (!this.f40882n.isEmpty()) {
            ((i3.a.C0621a) this.f40882n.peek()).e(bVar);
            return;
        }
        int i10 = bVar.f40821a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                q(bVar.f40825b);
            }
        } else {
            Pair pairC = C(bVar.f40825b, j10);
            this.A = ((Long) pairC.first).longValue();
            this.G.d((j0) pairC.second);
            this.J = true;
        }
    }

    private void s(i3.a.C0621a c0621a) throws ParserException {
        w(c0621a, this.f40873e, this.f40871c != null, this.f40870b, this.f40877i);
        t1.k kVarJ = j(c0621a.f40823c);
        if (kVarJ != null) {
            int size = this.f40873e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f40873e.valueAt(i10)).n(kVarJ);
            }
        }
        if (this.f40893y != C.TIME_UNSET) {
            int size2 = this.f40873e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f40873e.valueAt(i11)).l(this.f40893y);
            }
            this.f40893y = C.TIME_UNSET;
        }
    }

    private void t(i3.a.C0621a c0621a) {
        int i10 = 0;
        w1.a.h(this.f40871c == null, "Unexpected moov box.");
        t1.k kVarJ = j(c0621a.f40823c);
        i3.a.C0621a c0621a2 = (i3.a.C0621a) w1.a.e(c0621a.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = c0621a2.f40823c.size();
        long jV = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            i3.a.b bVar = (i3.a.b) c0621a2.f40823c.get(i11);
            int i12 = bVar.f40821a;
            if (i12 == 1953654136) {
                Pair pairG = G(bVar.f40825b);
                sparseArray.put(((Integer) pairG.first).intValue(), (d) pairG.second);
            } else if (i12 == 1835362404) {
                jV = v(bVar.f40825b);
            }
        }
        List listB = i3.b.B(c0621a, new b0(), jV, kVarJ, (this.f40870b & 16) != 0, false, new sc.g() { // from class: i3.g
            @Override // sc.g
            public final Object apply(Object obj) {
                return this.f40868a.o((s) obj);
            }
        });
        int size2 = listB.size();
        if (this.f40873e.size() != 0) {
            w1.a.g(this.f40873e.size() == size2);
            while (i10 < size2) {
                v vVar = (v) listB.get(i10);
                s sVar = vVar.f40992a;
                ((b) this.f40873e.get(sVar.f40958a)).j(vVar, i(sparseArray, sVar.f40958a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            v vVar2 = (v) listB.get(i10);
            s sVar2 = vVar2.f40992a;
            this.f40873e.put(sVar2.f40958a, new b(this.G.track(i10, sVar2.f40959b), vVar2, i(sparseArray, sVar2.f40958a)));
            this.f40894z = Math.max(this.f40894z, sVar2.f40962e);
            i10++;
        }
        this.G.endTracks();
    }

    private void u(long j10) {
        while (!this.f40883o.isEmpty()) {
            a aVar = (a) this.f40883o.removeFirst();
            this.f40892x -= aVar.f40897c;
            long jA = aVar.f40895a;
            if (aVar.f40896b) {
                jA += j10;
            }
            z zVar = this.f40879k;
            if (zVar != null) {
                jA = zVar.a(jA);
            }
            long j11 = jA;
            for (o0 o0Var : this.H) {
                o0Var.e(j11, 1, aVar.f40897c, this.f40892x, null);
            }
        }
    }

    private static long v(w1.u uVar) {
        uVar.T(8);
        return i3.a.c(uVar.p()) == 0 ? uVar.I() : uVar.L();
    }

    private static void w(i3.a.C0621a c0621a, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0621a.f40824d.size();
        for (int i11 = 0; i11 < size; i11++) {
            i3.a.C0621a c0621a2 = (i3.a.C0621a) c0621a.f40824d.get(i11);
            if (c0621a2.f40821a == 1953653094) {
                F(c0621a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void x(w1.u uVar, u uVar2) throws ParserException {
        uVar.T(8);
        int iP = uVar.p();
        if ((i3.a.b(iP) & 1) == 1) {
            uVar.U(8);
        }
        int iK = uVar.K();
        if (iK == 1) {
            uVar2.f40977d += i3.a.c(iP) == 0 ? uVar.I() : uVar.L();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iK, null);
        }
    }

    private static void y(t tVar, w1.u uVar, u uVar2) throws ParserException {
        int i10;
        int i11 = tVar.f40972d;
        uVar.T(8);
        if ((i3.a.b(uVar.p()) & 1) == 1) {
            uVar.U(8);
        }
        int iG = uVar.G();
        int iK = uVar.K();
        if (iK > uVar2.f40979f) {
            throw ParserException.a("Saiz sample count " + iK + " is greater than fragment sample count" + uVar2.f40979f, null);
        }
        if (iG == 0) {
            boolean[] zArr = uVar2.f40986m;
            i10 = 0;
            for (int i12 = 0; i12 < iK; i12++) {
                int iG2 = uVar.G();
                i10 += iG2;
                zArr[i12] = iG2 > i11;
            }
        } else {
            i10 = iG * iK;
            Arrays.fill(uVar2.f40986m, 0, iK, iG > i11);
        }
        Arrays.fill(uVar2.f40986m, iK, uVar2.f40979f, false);
        if (i10 > 0) {
            uVar2.d(i10);
        }
    }

    private static void z(i3.a.C0621a c0621a, String str, u uVar) throws ParserException {
        byte[] bArr = null;
        w1.u uVar2 = null;
        w1.u uVar3 = null;
        for (int i10 = 0; i10 < c0621a.f40823c.size(); i10++) {
            i3.a.b bVar = (i3.a.b) c0621a.f40823c.get(i10);
            w1.u uVar4 = bVar.f40825b;
            int i11 = bVar.f40821a;
            if (i11 == 1935828848) {
                uVar4.T(12);
                if (uVar4.p() == 1936025959) {
                    uVar2 = uVar4;
                }
            } else if (i11 == 1936158820) {
                uVar4.T(12);
                if (uVar4.p() == 1936025959) {
                    uVar3 = uVar4;
                }
            }
        }
        if (uVar2 == null || uVar3 == null) {
            return;
        }
        uVar2.T(8);
        int iC = i3.a.c(uVar2.p());
        uVar2.U(4);
        if (iC == 1) {
            uVar2.U(4);
        }
        if (uVar2.p() != 1) {
            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
        }
        uVar3.T(8);
        int iC2 = i3.a.c(uVar3.p());
        uVar3.U(4);
        if (iC2 == 1) {
            if (uVar3.I() == 0) {
                throw ParserException.c("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            uVar3.U(4);
        }
        if (uVar3.I() != 1) {
            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
        }
        uVar3.U(1);
        int iG = uVar3.G();
        int i12 = (iG & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i13 = iG & 15;
        boolean z10 = uVar3.G() == 1;
        if (z10) {
            int iG2 = uVar3.G();
            byte[] bArr2 = new byte[16];
            uVar3.l(bArr2, 0, 16);
            if (iG2 == 0) {
                int iG3 = uVar3.G();
                bArr = new byte[iG3];
                uVar3.l(bArr, 0, iG3);
            }
            uVar.f40985l = true;
            uVar.f40987n = new t(z10, str, iG2, bArr2, i12, i13, bArr);
        }
    }

    @Override // o2.p
    public int b(o2.q qVar, i0 i0Var) throws ParserException {
        while (true) {
            int i10 = this.f40886r;
            if (i10 != 0) {
                if (i10 == 1) {
                    M(qVar);
                } else if (i10 == 2) {
                    N(qVar);
                } else if (O(qVar)) {
                    return 0;
                }
            } else if (!L(qVar)) {
                return -1;
            }
        }
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.G = (this.f40870b & 32) == 0 ? new l3.t(rVar, this.f40869a) : rVar;
        h();
        m();
        s sVar = this.f40871c;
        if (sVar != null) {
            this.f40873e.put(0, new b(rVar.track(0, sVar.f40959b), new v(this.f40871c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0)));
            this.G.endTracks();
        }
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        n0 n0VarB = r.b(qVar);
        this.f40885q = n0VarB != null ? c0.D(n0VarB) : c0.C();
        return n0VarB == null;
    }

    @Override // o2.p
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0 f() {
        return this.f40885q;
    }

    protected s o(s sVar) {
        return sVar;
    }

    @Override // o2.p
    public void release() {
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        int size = this.f40873e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f40873e.valueAt(i10)).k();
        }
        this.f40883o.clear();
        this.f40892x = 0;
        this.f40893y = j11;
        this.f40882n.clear();
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean O(o2.q qVar) throws ParserException {
        boolean z10;
        int iA;
        b bVarK = this.B;
        Throwable th2 = null;
        if (bVarK == null) {
            bVarK = k(this.f40873e);
            if (bVarK == null) {
                int position = (int) (this.f40891w - qVar.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                qVar.skipFully(position);
                h();
                return false;
            }
            int iD = (int) (bVarK.d() - qVar.getPosition());
            if (iD < 0) {
                w1.n.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            qVar.skipFully(iD);
            this.B = bVarK;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f40886r == 3) {
            int iF = bVarK.f();
            this.C = iF;
            if (bVarK.f40903f < bVarK.f40906i) {
                qVar.skipFully(iF);
                bVarK.m();
                if (!bVarK.h()) {
                    this.B = null;
                }
                this.f40886r = 3;
                return true;
            }
            if (bVarK.f40901d.f40992a.f40964g == 1) {
                this.C = iF - 8;
                qVar.skipFully(8);
            }
            if ("audio/ac4".equals(bVarK.f40901d.f40992a.f40963f.f52757n)) {
                this.D = bVarK.i(this.C, 7);
                o2.c.a(this.C, this.f40878j);
                bVarK.f40898a.c(this.f40878j, 7);
                this.D += 7;
            } else {
                this.D = bVarK.i(this.C, 0);
            }
            this.C += this.D;
            this.f40886r = 4;
            this.E = 0;
        }
        s sVar = bVarK.f40901d.f40992a;
        o0 o0Var = bVarK.f40898a;
        long jE = bVarK.e();
        z zVar = this.f40879k;
        if (zVar != null) {
            jE = zVar.a(jE);
        }
        if (sVar.f40967j == 0) {
            z10 = 1;
            while (true) {
                int i12 = this.D;
                int i13 = this.C;
                if (i12 >= i13) {
                    break;
                }
                this.D += o0Var.a(qVar, i13 - i12, false);
            }
        } else {
            byte[] bArrE = this.f40875g.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = sVar.f40967j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.D < this.C) {
                int i17 = this.E;
                if (i17 == 0) {
                    qVar.readFully(bArrE, i16, i15);
                    this.f40875g.T(0);
                    int iP = this.f40875g.p();
                    if (iP < i11) {
                        throw ParserException.a("Invalid NAL length", th2);
                    }
                    this.E = iP - 1;
                    this.f40874f.T(0);
                    o0Var.c(this.f40874f, i10);
                    o0Var.c(this.f40875g, i11);
                    this.F = (this.I.length <= 0 || !x1.d.g(sVar.f40963f.f52757n, bArrE[i10])) ? 0 : i11;
                    this.D += 5;
                    this.C += i16;
                } else {
                    if (this.F) {
                        this.f40876h.P(i17);
                        qVar.readFully(this.f40876h.e(), 0, this.E);
                        o0Var.c(this.f40876h, this.E);
                        iA = this.E;
                        int iR = x1.d.r(this.f40876h.e(), this.f40876h.g());
                        this.f40876h.T(WwUgngZLNA.KIurUYjfi.equals(sVar.f40963f.f52757n) ? 1 : 0);
                        this.f40876h.S(iR);
                        o2.f.a(jE, this.f40876h, this.I);
                    } else {
                        iA = o0Var.a(qVar, i17, false);
                    }
                    this.D += iA;
                    this.E -= iA;
                    i11 = i11;
                    th2 = null;
                    i10 = 4;
                }
            }
            z10 = i11;
        }
        int iC = bVarK.c();
        t tVarG = bVarK.g();
        o0Var.e(jE, iC, this.C, 0, tVarG != null ? tVarG.f40971c : null);
        u(jE);
        if (!bVarK.h()) {
            this.B = null;
        }
        this.f40886r = 3;
        return z10;
    }

    public h(l3.r.a aVar, int i10, z zVar, s sVar, List list, o0 o0Var) {
        this.f40869a = aVar;
        this.f40870b = i10;
        this.f40879k = zVar;
        this.f40871c = sVar;
        this.f40872d = Collections.unmodifiableList(list);
        this.f40884p = o0Var;
        this.f40880l = new z2.c();
        this.f40881m = new w1.u(16);
        this.f40874f = new w1.u(x1.d.f56574a);
        this.f40875g = new w1.u(5);
        this.f40876h = new w1.u();
        byte[] bArr = new byte[16];
        this.f40877i = bArr;
        this.f40878j = new w1.u(bArr);
        this.f40882n = new ArrayDeque();
        this.f40883o = new ArrayDeque();
        this.f40873e = new SparseArray();
        this.f40885q = c0.C();
        this.f40894z = C.TIME_UNSET;
        this.f40893y = C.TIME_UNSET;
        this.A = C.TIME_UNSET;
        this.G = o2.r.A2;
        this.H = new o0[0];
        this.I = new o0[0];
    }
}
