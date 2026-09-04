package ca;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ob.d0;
import ob.n0;
import ob.r0;
import ob.u;
import u9.b0;
import u9.v;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g implements u9.k {
    public static final u9.p I = new u9.p() { // from class: ca.e
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return g.a();
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final v0 K = new v0.b().g0(MimeTypes.APPLICATION_EMSG).G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private u9.m E;
    private b0[] F;
    private b0[] G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f9742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f9743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f9744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f9745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f9746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f9747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f9748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ja.c f9749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f9750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayDeque f9751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f9752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b0 f9753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f9756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d0 f9758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f9759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f9761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f9762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f9763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f9764z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9767c;

        public a(long j10, boolean z10, int i10) {
            this.f9765a = j10;
            this.f9766b = z10;
            this.f9767c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f9768a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f9771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f9772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9775h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9776i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f9779l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f9769b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f9770c = new d0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final d0 f9777j = new d0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final d0 f9778k = new d0();

        public b(b0 b0Var, r rVar, c cVar) {
            this.f9768a = b0Var;
            this.f9771d = rVar;
            this.f9772e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (this.f9779l) {
                i10 = this.f9769b.f9849k[this.f9773f] ? 1 : 0;
            } else {
                i10 = this.f9771d.f9863g[this.f9773f];
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f9779l ? this.f9771d.f9859c[this.f9773f] : this.f9769b.f9845g[this.f9775h];
        }

        public long e() {
            return !this.f9779l ? this.f9771d.f9862f[this.f9773f] : this.f9769b.c(this.f9773f);
        }

        public int f() {
            return !this.f9779l ? this.f9771d.f9860d[this.f9773f] : this.f9769b.f9847i[this.f9773f];
        }

        public p g() {
            if (!this.f9779l) {
                return null;
            }
            int i10 = ((c) r0.j(this.f9769b.f9839a)).f9728a;
            p pVarA = this.f9769b.f9852n;
            if (pVarA == null) {
                pVarA = this.f9771d.f9857a.a(i10);
            }
            if (pVarA == null || !pVarA.f9834a) {
                return null;
            }
            return pVarA;
        }

        public boolean h() {
            this.f9773f++;
            if (!this.f9779l) {
                return false;
            }
            int i10 = this.f9774g + 1;
            this.f9774g = i10;
            int[] iArr = this.f9769b.f9846h;
            int i11 = this.f9775h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f9775h = i11 + 1;
            this.f9774g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            d0 d0Var;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f9837d;
            if (length != 0) {
                d0Var = this.f9769b.f9853o;
            } else {
                byte[] bArr = (byte[]) r0.j(pVarG.f9838e);
                this.f9778k.S(bArr, bArr.length);
                d0 d0Var2 = this.f9778k;
                length = bArr.length;
                d0Var = d0Var2;
            }
            boolean zG = this.f9769b.g(this.f9773f);
            boolean z10 = zG || i11 != 0;
            this.f9777j.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f9777j.U(0);
            this.f9768a.b(this.f9777j, 1, 1);
            this.f9768a.b(d0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f9770c.Q(8);
                byte[] bArrE = this.f9770c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f9768a.b(this.f9770c, 8, 1);
                return length + 9;
            }
            d0 d0Var3 = this.f9769b.f9853o;
            int iN = d0Var3.N();
            d0Var3.V(-2);
            int i12 = (iN * 6) + 2;
            if (i11 != 0) {
                this.f9770c.Q(i12);
                byte[] bArrE2 = this.f9770c.e();
                d0Var3.l(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrE2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                d0Var3 = this.f9770c;
            }
            this.f9768a.b(d0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(r rVar, c cVar) {
            this.f9771d = rVar;
            this.f9772e = cVar;
            this.f9768a.e(rVar.f9857a.f9828f);
            k();
        }

        public void k() {
            this.f9769b.f();
            this.f9773f = 0;
            this.f9775h = 0;
            this.f9774g = 0;
            this.f9776i = 0;
            this.f9779l = false;
        }

        public void l(long j10) {
            int i10 = this.f9773f;
            while (true) {
                q qVar = this.f9769b;
                if (i10 >= qVar.f9844f || qVar.c(i10) > j10) {
                    return;
                }
                if (this.f9769b.f9849k[i10]) {
                    this.f9776i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            d0 d0Var = this.f9769b.f9853o;
            int i10 = pVarG.f9837d;
            if (i10 != 0) {
                d0Var.V(i10);
            }
            if (this.f9769b.g(this.f9773f)) {
                d0Var.V(d0Var.N() * 6);
            }
        }

        public void n(com.google.android.exoplayer2.drm.h hVar) {
            p pVarA = this.f9771d.f9857a.a(((c) r0.j(this.f9769b.f9839a)).f9728a);
            this.f9768a.e(this.f9771d.f9857a.f9828f.b().O(hVar.c(pVarA != null ? pVarA.f9835b : null)).G());
        }
    }

    public g() {
        this(0);
    }

    private static long A(d0 d0Var) {
        d0Var.U(8);
        return ca.a.c(d0Var.q()) == 1 ? d0Var.M() : d0Var.J();
    }

    private static b B(d0 d0Var, SparseArray sparseArray, boolean z10) {
        d0Var.U(8);
        int iB = ca.a.b(d0Var.q());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(d0Var.q()));
        if (bVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jM = d0Var.M();
            q qVar = bVar.f9769b;
            qVar.f9841c = jM;
            qVar.f9842d = jM;
        }
        c cVar = bVar.f9772e;
        bVar.f9769b.f9839a = new c((iB & 2) != 0 ? d0Var.q() - 1 : cVar.f9728a, (iB & 8) != 0 ? d0Var.q() : cVar.f9729b, (iB & 16) != 0 ? d0Var.q() : cVar.f9730c, (iB & 32) != 0 ? d0Var.q() : cVar.f9731d);
        return bVar;
    }

    private static void C(ca.a.C0132a c0132a, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        b bVarB = B(((ca.a.b) ob.a.e(c0132a.g(1952868452))).f9693b, sparseArray, z10);
        if (bVarB == null) {
            return;
        }
        q qVar = bVarB.f9769b;
        long j10 = qVar.f9855q;
        boolean z11 = qVar.f9856r;
        bVarB.k();
        bVarB.f9779l = true;
        ca.a.b bVarG = c0132a.g(1952867444);
        if (bVarG == null || (i10 & 2) != 0) {
            qVar.f9855q = j10;
            qVar.f9856r = z11;
        } else {
            qVar.f9855q = A(bVarG.f9693b);
            qVar.f9856r = true;
        }
        F(c0132a, bVarB, i10);
        p pVarA = bVarB.f9771d.f9857a.a(((c) ob.a.e(qVar.f9839a)).f9728a);
        ca.a.b bVarG2 = c0132a.g(1935763834);
        if (bVarG2 != null) {
            v((p) ob.a.e(pVarA), bVarG2.f9693b, qVar);
        }
        ca.a.b bVarG3 = c0132a.g(1935763823);
        if (bVarG3 != null) {
            u(bVarG3.f9693b, qVar);
        }
        ca.a.b bVarG4 = c0132a.g(1936027235);
        if (bVarG4 != null) {
            y(bVarG4.f9693b, qVar);
        }
        w(c0132a, pVarA != null ? pVarA.f9835b : null, qVar);
        int size = c0132a.f9691c.size();
        for (int i11 = 0; i11 < size; i11++) {
            ca.a.b bVar = (ca.a.b) c0132a.f9691c.get(i11);
            if (bVar.f9689a == 1970628964) {
                G(bVar.f9693b, qVar, bArr);
            }
        }
    }

    private static Pair D(d0 d0Var) {
        d0Var.U(12);
        return Pair.create(Integer.valueOf(d0Var.q()), new c(d0Var.q() - 1, d0Var.q(), d0Var.q(), d0Var.q()));
    }

    private static int E(b bVar, int i10, int i11, d0 d0Var, int i12) throws ParserException {
        int iQ;
        d0Var.U(8);
        int iB = ca.a.b(d0Var.q());
        o oVar = bVar.f9771d.f9857a;
        q qVar = bVar.f9769b;
        c cVar = (c) r0.j(qVar.f9839a);
        qVar.f9846h[i10] = d0Var.L();
        long[] jArr = qVar.f9845g;
        long j10 = qVar.f9841c;
        jArr[i10] = j10;
        if ((iB & 1) != 0) {
            jArr[i10] = j10 + ((long) d0Var.q());
        }
        boolean z10 = (iB & 4) != 0;
        int iQ2 = cVar.f9731d;
        if (z10) {
            iQ2 = d0Var.q();
        }
        boolean z11 = (iB & 256) != 0;
        boolean z12 = (iB & 512) != 0;
        boolean z13 = (iB & UserVerificationMethods.USER_VERIFY_ALL) != 0;
        boolean z14 = (iB & 2048) != 0;
        long j11 = k(oVar) ? ((long[]) r0.j(oVar.f9831i))[0] : 0L;
        int[] iArr = qVar.f9847i;
        long[] jArr2 = qVar.f9848j;
        boolean[] zArr = qVar.f9849k;
        boolean z15 = z14;
        boolean z16 = oVar.f9824b == 2 && (i11 & 1) != 0;
        int i13 = i12 + qVar.f9846h[i10];
        boolean z17 = z10;
        long j12 = oVar.f9825c;
        long j13 = qVar.f9855q;
        int i14 = i12;
        while (i14 < i13) {
            int iE = e(z11 ? d0Var.q() : cVar.f9729b);
            int iE2 = e(z12 ? d0Var.q() : cVar.f9730c);
            if (z13) {
                iQ = d0Var.q();
            } else {
                iQ = (i14 == 0 && z17) ? iQ2 : cVar.f9731d;
            }
            int i15 = i14;
            long jU0 = r0.U0((((long) (z15 ? d0Var.q() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i15] = jU0;
            if (!qVar.f9856r) {
                jArr2[i15] = jU0 + bVar.f9771d.f9864h;
            }
            iArr[i15] = iE2;
            zArr[i15] = ((iQ >> 16) & 1) == 0 && (!z16 || i15 == 0);
            j13 += (long) iE;
            i14 = i15 + 1;
            i13 = i13;
            z16 = z16;
        }
        int i16 = i13;
        qVar.f9855q = j13;
        return i16;
    }

    private static void F(ca.a.C0132a c0132a, b bVar, int i10) throws ParserException {
        List list = c0132a.f9691c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            ca.a.b bVar2 = (ca.a.b) list.get(i13);
            if (bVar2.f9689a == 1953658222) {
                d0 d0Var = bVar2.f9693b;
                d0Var.U(12);
                int iL = d0Var.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar.f9775h = 0;
        bVar.f9774g = 0;
        bVar.f9773f = 0;
        bVar.f9769b.e(i11, i12);
        int i14 = 0;
        int iE = 0;
        for (int i15 = 0; i15 < size; i15++) {
            ca.a.b bVar3 = (ca.a.b) list.get(i15);
            if (bVar3.f9689a == 1953658222) {
                iE = E(bVar, i14, i10, bVar3.f9693b, iE);
                i14++;
            }
        }
    }

    private static void G(d0 d0Var, q qVar, byte[] bArr) throws ParserException {
        d0Var.U(8);
        d0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            x(d0Var, 16, qVar);
        }
    }

    private void H(long j10) throws ParserException {
        while (!this.f9751m.isEmpty() && ((ca.a.C0132a) this.f9751m.peek()).f9690b == j10) {
            m((ca.a.C0132a) this.f9751m.pop());
        }
        f();
    }

    private boolean I(u9.l lVar) throws ParserException {
        if (this.f9757s == 0) {
            if (!lVar.readFully(this.f9750l.e(), 0, 8, true)) {
                return false;
            }
            this.f9757s = 8;
            this.f9750l.U(0);
            this.f9756r = this.f9750l.J();
            this.f9755q = this.f9750l.q();
        }
        long j10 = this.f9756r;
        if (j10 == 1) {
            lVar.readFully(this.f9750l.e(), 8, 8);
            this.f9757s += 8;
            this.f9756r = this.f9750l.M();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && !this.f9751m.isEmpty()) {
                length = ((ca.a.C0132a) this.f9751m.peek()).f9690b;
            }
            if (length != -1) {
                this.f9756r = (length - lVar.getPosition()) + ((long) this.f9757s);
            }
        }
        if (this.f9756r < this.f9757s) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        long position = lVar.getPosition() - ((long) this.f9757s);
        int i10 = this.f9755q;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
            this.E.c(new z.b(this.f9762x, position));
            this.H = true;
        }
        if (this.f9755q == 1836019558) {
            int size = this.f9742d.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = ((b) this.f9742d.valueAt(i11)).f9769b;
                qVar.f9840b = position;
                qVar.f9842d = position;
                qVar.f9841c = position;
            }
        }
        int i12 = this.f9755q;
        if (i12 == 1835295092) {
            this.f9764z = null;
            this.f9759u = position + this.f9756r;
            this.f9754p = 2;
            return true;
        }
        if (M(i12)) {
            long position2 = (lVar.getPosition() + this.f9756r) - 8;
            this.f9751m.push(new ca.a.C0132a(this.f9755q, position2));
            if (this.f9756r == this.f9757s) {
                H(position2);
            } else {
                f();
            }
        } else if (N(this.f9755q)) {
            if (this.f9757s != 8) {
                throw ParserException.e("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f9756r > 2147483647L) {
                throw ParserException.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            d0 d0Var = new d0((int) this.f9756r);
            System.arraycopy(this.f9750l.e(), 0, d0Var.e(), 0, 8);
            this.f9758t = d0Var;
            this.f9754p = 1;
        } else {
            if (this.f9756r > 2147483647L) {
                throw ParserException.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f9758t = null;
            this.f9754p = 1;
        }
        return true;
    }

    private void J(u9.l lVar) throws ParserException {
        int i10 = ((int) this.f9756r) - this.f9757s;
        d0 d0Var = this.f9758t;
        if (d0Var != null) {
            lVar.readFully(d0Var.e(), 8, i10);
            o(new ca.a.b(this.f9755q, d0Var), lVar.getPosition());
        } else {
            lVar.skipFully(i10);
        }
        H(lVar.getPosition());
    }

    private void K(u9.l lVar) throws ParserException {
        int size = this.f9742d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = ((b) this.f9742d.valueAt(i10)).f9769b;
            if (qVar.f9854p) {
                long j11 = qVar.f9842d;
                if (j11 < j10) {
                    bVar = (b) this.f9742d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f9754p = 3;
            return;
        }
        int position = (int) (j10 - lVar.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        lVar.skipFully(position);
        bVar.f9769b.b(lVar);
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
    private boolean L(u9.l lVar) throws ParserException {
        boolean z10;
        int iA;
        b bVarI = this.f9764z;
        Throwable th2 = null;
        if (bVarI == null) {
            bVarI = i(this.f9742d);
            if (bVarI == null) {
                int position = (int) (this.f9759u - lVar.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                lVar.skipFully(position);
                f();
                return false;
            }
            int iD = (int) (bVarI.d() - lVar.getPosition());
            if (iD < 0) {
                u.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            lVar.skipFully(iD);
            this.f9764z = bVarI;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f9754p == 3) {
            int iF = bVarI.f();
            this.A = iF;
            if (bVarI.f9773f < bVarI.f9776i) {
                lVar.skipFully(iF);
                bVarI.m();
                if (!bVarI.h()) {
                    this.f9764z = null;
                }
                this.f9754p = 3;
                return true;
            }
            if (bVarI.f9771d.f9857a.f9829g == 1) {
                this.A = iF - 8;
                lVar.skipFully(8);
            }
            if ("audio/ac4".equals(bVarI.f9771d.f9857a.f9828f.f18868l)) {
                this.B = bVarI.i(this.A, 7);
                q9.c.a(this.A, this.f9747i);
                bVarI.f9768a.c(this.f9747i, 7);
                this.B += 7;
            } else {
                this.B = bVarI.i(this.A, 0);
            }
            this.A += this.B;
            this.f9754p = 4;
            this.C = 0;
        }
        o oVar = bVarI.f9771d.f9857a;
        b0 b0Var = bVarI.f9768a;
        long jE = bVarI.e();
        n0 n0Var = this.f9748j;
        if (n0Var != null) {
            jE = n0Var.a(jE);
        }
        if (oVar.f9832j == 0) {
            z10 = 1;
            while (true) {
                int i12 = this.B;
                int i13 = this.A;
                if (i12 >= i13) {
                    break;
                }
                this.B += b0Var.a(lVar, i13 - i12, false);
            }
        } else {
            byte[] bArrE = this.f9744f.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = oVar.f9832j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.B < this.A) {
                int i17 = this.C;
                if (i17 == 0) {
                    lVar.readFully(bArrE, i16, i15);
                    this.f9744f.U(0);
                    int iQ = this.f9744f.q();
                    if (iQ < i11) {
                        throw ParserException.a("Invalid NAL length", th2);
                    }
                    this.C = iQ - 1;
                    this.f9743e.U(0);
                    b0Var.c(this.f9743e, i10);
                    b0Var.c(this.f9744f, i11);
                    this.D = (this.G.length <= 0 || !ob.z.g(oVar.f9828f.f18868l, bArrE[i10])) ? 0 : i11;
                    this.B += 5;
                    this.A += i16;
                } else {
                    if (this.D) {
                        this.f9745g.Q(i17);
                        lVar.readFully(this.f9745g.e(), 0, this.C);
                        b0Var.c(this.f9745g, this.C);
                        iA = this.C;
                        int iQ2 = ob.z.q(this.f9745g.e(), this.f9745g.g());
                        this.f9745g.U(MimeTypes.VIDEO_H265.equals(oVar.f9828f.f18868l) ? 1 : 0);
                        this.f9745g.T(iQ2);
                        u9.b.a(jE, this.f9745g, this.G);
                    } else {
                        iA = b0Var.a(lVar, i17, false);
                    }
                    this.B += iA;
                    this.C -= iA;
                    i11 = i11;
                    th2 = null;
                    i10 = 4;
                }
            }
            z10 = i11;
        }
        int iC = bVarI.c();
        p pVarG = bVarI.g();
        b0Var.f(jE, iC, this.A, 0, pVarG != null ? pVarG.f9836c : null);
        r(jE);
        if (!bVarI.h()) {
            this.f9764z = null;
        }
        this.f9754p = 3;
        return z10;
    }

    private static boolean M(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean N(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ u9.k[] a() {
        return new u9.k[]{new g()};
    }

    private static int e(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.a("Unexpected negative value: " + i10, null);
    }

    private void f() {
        this.f9754p = 0;
        this.f9757s = 0;
    }

    private c g(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (c) sparseArray.valueAt(0) : (c) ob.a.e((c) sparseArray.get(i10));
    }

    private static com.google.android.exoplayer2.drm.h h(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ca.a.b bVar = (ca.a.b) list.get(i10);
            if (bVar.f9689a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = bVar.f9693b.e();
                UUID uuidF = l.f(bArrE);
                if (uuidF == null) {
                    u.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.google.android.exoplayer2.drm.h.b(uuidF, MimeTypes.VIDEO_MP4, bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.h(arrayList);
    }

    private static b i(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f9779l || bVar2.f9773f != bVar2.f9771d.f9858b) && (!bVar2.f9779l || bVar2.f9775h != bVar2.f9769b.f9843e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void j() {
        int i10;
        b0[] b0VarArr = new b0[2];
        this.F = b0VarArr;
        b0 b0Var = this.f9753o;
        int i11 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f9739a & 4) != 0) {
            b0VarArr[i10] = this.E.track(100, 5);
            i12 = 101;
            i10++;
        }
        b0[] b0VarArr2 = (b0[]) r0.M0(this.F, i10);
        this.F = b0VarArr2;
        for (b0 b0Var2 : b0VarArr2) {
            b0Var2.e(K);
        }
        this.G = new b0[this.f9741c.size()];
        while (i11 < this.G.length) {
            b0 b0VarTrack = this.E.track(i12, 3);
            b0VarTrack.e((v0) this.f9741c.get(i11));
            this.G[i11] = b0VarTrack;
            i11++;
            i12++;
        }
    }

    private static boolean k(o oVar) {
        long[] jArr;
        long[] jArr2 = oVar.f9830h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = oVar.f9831i) != null) {
            long j10 = jArr2[0];
            if (j10 == 0 || r0.U0(j10 + jArr[0], 1000000L, oVar.f9826d) >= oVar.f9827e) {
                return true;
            }
        }
        return false;
    }

    private void m(ca.a.C0132a c0132a) throws ParserException {
        int i10 = c0132a.f9689a;
        if (i10 == 1836019574) {
            q(c0132a);
        } else if (i10 == 1836019558) {
            p(c0132a);
        } else {
            if (this.f9751m.isEmpty()) {
                return;
            }
            ((ca.a.C0132a) this.f9751m.peek()).d(c0132a);
        }
    }

    private void n(d0 d0Var) {
        String str;
        String str2;
        long jU0;
        long jU1;
        long J2;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        if (iC == 0) {
            str = (String) ob.a.e(d0Var.B());
            str2 = (String) ob.a.e(d0Var.B());
            long J3 = d0Var.J();
            jU0 = r0.U0(d0Var.J(), 1000000L, J3);
            long j10 = this.f9763y;
            long j11 = j10 != C.TIME_UNSET ? j10 + jU0 : -9223372036854775807L;
            jU1 = r0.U0(d0Var.J(), 1000L, J3);
            J2 = d0Var.J();
            jA = j11;
        } else {
            if (iC != 1) {
                u.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long J4 = d0Var.J();
            jA = r0.U0(d0Var.M(), 1000000L, J4);
            long jU2 = r0.U0(d0Var.J(), 1000L, J4);
            long J5 = d0Var.J();
            str = (String) ob.a.e(d0Var.B());
            str2 = (String) ob.a.e(d0Var.B());
            jU1 = jU2;
            J2 = J5;
            jU0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d0Var.a()];
        d0Var.l(bArr, 0, d0Var.a());
        d0 d0Var2 = new d0(this.f9749k.a(new ja.a(str3, str4, jU1, J2, bArr)));
        int iA = d0Var2.a();
        for (b0 b0Var : this.F) {
            d0Var2.U(0);
            b0Var.c(d0Var2, iA);
        }
        if (jA == C.TIME_UNSET) {
            this.f9752n.addLast(new a(jU0, true, iA));
            this.f9760v += iA;
            return;
        }
        if (!this.f9752n.isEmpty()) {
            this.f9752n.addLast(new a(jA, false, iA));
            this.f9760v += iA;
            return;
        }
        n0 n0Var = this.f9748j;
        if (n0Var != null && !n0Var.f()) {
            this.f9752n.addLast(new a(jA, false, iA));
            this.f9760v += iA;
            return;
        }
        n0 n0Var2 = this.f9748j;
        if (n0Var2 != null) {
            jA = n0Var2.a(jA);
        }
        long j12 = jA;
        for (b0 b0Var2 : this.F) {
            b0Var2.f(j12, 1, iA, 0, null);
        }
    }

    private void o(ca.a.b bVar, long j10) throws ParserException {
        if (!this.f9751m.isEmpty()) {
            ((ca.a.C0132a) this.f9751m.peek()).e(bVar);
            return;
        }
        int i10 = bVar.f9689a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                n(bVar.f9693b);
            }
        } else {
            Pair pairZ = z(bVar.f9693b, j10);
            this.f9763y = ((Long) pairZ.first).longValue();
            this.E.c((z) pairZ.second);
            this.H = true;
        }
    }

    private void p(ca.a.C0132a c0132a) throws ParserException {
        t(c0132a, this.f9742d, this.f9740b != null, this.f9739a, this.f9746h);
        com.google.android.exoplayer2.drm.h hVarH = h(c0132a.f9691c);
        if (hVarH != null) {
            int size = this.f9742d.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f9742d.valueAt(i10)).n(hVarH);
            }
        }
        if (this.f9761w != C.TIME_UNSET) {
            int size2 = this.f9742d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f9742d.valueAt(i11)).l(this.f9761w);
            }
            this.f9761w = C.TIME_UNSET;
        }
    }

    private void q(ca.a.C0132a c0132a) {
        int i10 = 0;
        ob.a.h(this.f9740b == null, "Unexpected moov box.");
        com.google.android.exoplayer2.drm.h hVarH = h(c0132a.f9691c);
        ca.a.C0132a c0132a2 = (ca.a.C0132a) ob.a.e(c0132a.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = c0132a2.f9691c.size();
        long jS = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            ca.a.b bVar = (ca.a.b) c0132a2.f9691c.get(i11);
            int i12 = bVar.f9689a;
            if (i12 == 1953654136) {
                Pair pairD = D(bVar.f9693b);
                sparseArray.put(((Integer) pairD.first).intValue(), (c) pairD.second);
            } else if (i12 == 1835362404) {
                jS = s(bVar.f9693b);
            }
        }
        List listB = ca.b.B(c0132a, new v(), jS, hVarH, (this.f9739a & 16) != 0, false, new sc.g() { // from class: ca.f
            @Override // sc.g
            public final Object apply(Object obj) {
                return this.f9738a.l((o) obj);
            }
        });
        int size2 = listB.size();
        if (this.f9742d.size() != 0) {
            ob.a.g(this.f9742d.size() == size2);
            while (i10 < size2) {
                r rVar = (r) listB.get(i10);
                o oVar = rVar.f9857a;
                ((b) this.f9742d.get(oVar.f9823a)).j(rVar, g(sparseArray, oVar.f9823a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = (r) listB.get(i10);
            o oVar2 = rVar2.f9857a;
            this.f9742d.put(oVar2.f9823a, new b(this.E.track(i10, oVar2.f9824b), rVar2, g(sparseArray, oVar2.f9823a)));
            this.f9762x = Math.max(this.f9762x, oVar2.f9827e);
            i10++;
        }
        this.E.endTracks();
    }

    private void r(long j10) {
        while (!this.f9752n.isEmpty()) {
            a aVar = (a) this.f9752n.removeFirst();
            this.f9760v -= aVar.f9767c;
            long jA = aVar.f9765a;
            if (aVar.f9766b) {
                jA += j10;
            }
            n0 n0Var = this.f9748j;
            if (n0Var != null) {
                jA = n0Var.a(jA);
            }
            long j11 = jA;
            for (b0 b0Var : this.F) {
                b0Var.f(j11, 1, aVar.f9767c, this.f9760v, null);
            }
        }
    }

    private static long s(d0 d0Var) {
        d0Var.U(8);
        return ca.a.c(d0Var.q()) == 0 ? d0Var.J() : d0Var.M();
    }

    private static void t(ca.a.C0132a c0132a, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0132a.f9692d.size();
        for (int i11 = 0; i11 < size; i11++) {
            ca.a.C0132a c0132a2 = (ca.a.C0132a) c0132a.f9692d.get(i11);
            if (c0132a2.f9689a == 1953653094) {
                C(c0132a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void u(d0 d0Var, q qVar) throws ParserException {
        d0Var.U(8);
        int iQ = d0Var.q();
        if ((ca.a.b(iQ) & 1) == 1) {
            d0Var.V(8);
        }
        int iL = d0Var.L();
        if (iL == 1) {
            qVar.f9842d += ca.a.c(iQ) == 0 ? d0Var.J() : d0Var.M();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void v(p pVar, d0 d0Var, q qVar) throws ParserException {
        int i10;
        int i11 = pVar.f9837d;
        d0Var.U(8);
        if ((ca.a.b(d0Var.q()) & 1) == 1) {
            d0Var.V(8);
        }
        int iH = d0Var.H();
        int iL = d0Var.L();
        if (iL > qVar.f9844f) {
            throw ParserException.a("Saiz sample count " + iL + " is greater than fragment sample count" + qVar.f9844f, null);
        }
        if (iH == 0) {
            boolean[] zArr = qVar.f9851m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = d0Var.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = iH * iL;
            Arrays.fill(qVar.f9851m, 0, iL, iH > i11);
        }
        Arrays.fill(qVar.f9851m, iL, qVar.f9844f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    private static void w(ca.a.C0132a c0132a, String str, q qVar) throws ParserException {
        byte[] bArr = null;
        d0 d0Var = null;
        d0 d0Var2 = null;
        for (int i10 = 0; i10 < c0132a.f9691c.size(); i10++) {
            ca.a.b bVar = (ca.a.b) c0132a.f9691c.get(i10);
            d0 d0Var3 = bVar.f9693b;
            int i11 = bVar.f9689a;
            if (i11 == 1935828848) {
                d0Var3.U(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var = d0Var3;
                }
            } else if (i11 == 1936158820) {
                d0Var3.U(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var2 = d0Var3;
                }
            }
        }
        if (d0Var == null || d0Var2 == null) {
            return;
        }
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        d0Var.V(4);
        if (iC == 1) {
            d0Var.V(4);
        }
        if (d0Var.q() != 1) {
            throw ParserException.e("Entry count in sbgp != 1 (unsupported).");
        }
        d0Var2.U(8);
        int iC2 = ca.a.c(d0Var2.q());
        d0Var2.V(4);
        if (iC2 == 1) {
            if (d0Var2.J() == 0) {
                throw ParserException.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            d0Var2.V(4);
        }
        if (d0Var2.J() != 1) {
            throw ParserException.e("Entry count in sgpd != 1 (unsupported).");
        }
        d0Var2.V(1);
        int iH = d0Var2.H();
        int i12 = (iH & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i13 = iH & 15;
        boolean z10 = d0Var2.H() == 1;
        if (z10) {
            int iH2 = d0Var2.H();
            byte[] bArr2 = new byte[16];
            d0Var2.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = d0Var2.H();
                bArr = new byte[iH3];
                d0Var2.l(bArr, 0, iH3);
            }
            qVar.f9850l = true;
            qVar.f9852n = new p(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    private static void x(d0 d0Var, int i10, q qVar) throws ParserException {
        d0Var.U(i10 + 8);
        int iB = ca.a.b(d0Var.q());
        if ((iB & 1) != 0) {
            throw ParserException.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iL = d0Var.L();
        if (iL == 0) {
            Arrays.fill(qVar.f9851m, 0, qVar.f9844f, false);
            return;
        }
        if (iL == qVar.f9844f) {
            Arrays.fill(qVar.f9851m, 0, iL, z10);
            qVar.d(d0Var.a());
            qVar.a(d0Var);
        } else {
            throw ParserException.a("Senc sample count " + iL + " is different from fragment sample count" + qVar.f9844f, null);
        }
    }

    private static void y(d0 d0Var, q qVar) throws ParserException {
        x(d0Var, 0, qVar);
    }

    private static Pair z(d0 d0Var, long j10) throws ParserException {
        long jM;
        long jM2;
        d0Var.U(8);
        int iC = ca.a.c(d0Var.q());
        d0Var.V(4);
        long J2 = d0Var.J();
        if (iC == 0) {
            jM = d0Var.J();
            jM2 = d0Var.J();
        } else {
            jM = d0Var.M();
            jM2 = d0Var.M();
        }
        long j11 = j10 + jM2;
        long jU0 = r0.U0(jM, 1000000L, J2);
        d0Var.V(2);
        int iN = d0Var.N();
        int[] iArr = new int[iN];
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        long[] jArr3 = new long[iN];
        long j12 = j11;
        long jU1 = jU0;
        int i10 = 0;
        while (i10 < iN) {
            int iQ = d0Var.q();
            if ((Integer.MIN_VALUE & iQ) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long J3 = d0Var.J();
            iArr[i10] = iQ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jU1;
            jM += J3;
            long[] jArr4 = jArr3;
            jU1 = r0.U0(jM, 1000000L, J2);
            jArr2[i10] = jU1 - jArr4[i10];
            d0Var.V(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jU0), new u9.c(iArr, jArr, jArr2, jArr3));
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.E = mVar;
        f();
        j();
        o oVar = this.f9740b;
        if (oVar != null) {
            this.f9742d.put(0, new b(mVar.track(0, oVar.f9824b), new r(this.f9740b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    @Override // u9.k
    public int c(u9.l lVar, y yVar) throws ParserException {
        while (true) {
            int i10 = this.f9754p;
            if (i10 != 0) {
                if (i10 == 1) {
                    J(lVar);
                } else if (i10 == 2) {
                    K(lVar);
                } else if (L(lVar)) {
                    return 0;
                }
            } else if (!I(lVar)) {
                return -1;
            }
        }
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        return n.b(lVar);
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        int size = this.f9742d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f9742d.valueAt(i10)).k();
        }
        this.f9752n.clear();
        this.f9760v = 0;
        this.f9761w = j11;
        this.f9751m.clear();
        f();
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, n0 n0Var) {
        this(i10, n0Var, null, Collections.EMPTY_LIST);
    }

    public g(int i10, n0 n0Var, o oVar) {
        this(i10, n0Var, oVar, Collections.EMPTY_LIST);
    }

    public g(int i10, n0 n0Var, o oVar, List list) {
        this(i10, n0Var, oVar, list, null);
    }

    public g(int i10, n0 n0Var, o oVar, List list, b0 b0Var) {
        this.f9739a = i10;
        this.f9748j = n0Var;
        this.f9740b = oVar;
        this.f9741c = Collections.unmodifiableList(list);
        this.f9753o = b0Var;
        this.f9749k = new ja.c();
        this.f9750l = new d0(16);
        this.f9743e = new d0(ob.z.f48467a);
        this.f9744f = new d0(5);
        this.f9745g = new d0();
        byte[] bArr = new byte[16];
        this.f9746h = bArr;
        this.f9747i = new d0(bArr);
        this.f9751m = new ArrayDeque();
        this.f9752n = new ArrayDeque();
        this.f9742d = new SparseArray();
        this.f9762x = C.TIME_UNSET;
        this.f9761w = C.TIME_UNSET;
        this.f9763y = C.TIME_UNSET;
        this.E = u9.m.B2;
        this.F = new b0[0];
        this.G = new b0[0];
    }

    @Override // u9.k
    public void release() {
    }

    protected o l(o oVar) {
        return oVar;
    }
}
