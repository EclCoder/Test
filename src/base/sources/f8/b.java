package f8;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.io.JsonEOFException;
import g8.d;
import i8.i;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends c {
    protected boolean A;
    protected byte[] B;
    protected int C;
    protected int D;
    protected long E;
    protected double F;
    protected BigInteger G;
    protected BigDecimal H;
    protected boolean I;
    protected int J;
    protected int K;
    protected int L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.io.b f38341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f38342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f38343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f38344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f38345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f38346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f38347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected long f38348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f38349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f38350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected d f38351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected g f38352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final i f38353y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected char[] f38354z;

    protected b(com.fasterxml.jackson.core.io.b bVar, int i10) {
        super(i10);
        this.f38346r = 1;
        this.f38349u = 1;
        this.C = 0;
        this.f38341m = bVar;
        this.f38353y = bVar.i();
        this.f38351w = d.l(e.a.STRICT_DUPLICATE_DETECTION.h(i10) ? g8.b.f(this) : null);
    }

    protected static int[] K1(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    private void w1(int i10) throws JsonParseException {
        try {
            if (i10 == 16) {
                this.H = this.f38353y.f();
                this.C = 16;
            } else {
                this.F = this.f38353y.g();
                this.C = 8;
            }
        } catch (NumberFormatException e10) {
            g1("Malformed numeric value (" + U0(this.f38353y.j()) + ")", e10);
        }
    }

    private void x1(int i10) throws JsonParseException, InputCoercionException {
        String strJ = this.f38353y.j();
        try {
            int i11 = this.J;
            char[] cArrQ = this.f38353y.q();
            int iR = this.f38353y.r();
            boolean z10 = this.I;
            if (z10) {
                iR++;
            }
            if (com.fasterxml.jackson.core.io.e.b(cArrQ, iR, i11, z10)) {
                this.E = Long.parseLong(strJ);
                this.C = 2;
                return;
            }
            if (i10 == 1 || i10 == 2) {
                A1(i10, strJ);
            }
            if (i10 != 8 && i10 != 32) {
                this.G = new BigInteger(strJ);
                this.C = 4;
                return;
            }
            this.F = com.fasterxml.jackson.core.io.e.f(strJ);
            this.C = 8;
        } catch (NumberFormatException e10) {
            g1("Malformed numeric value (" + U0(strJ) + ")", e10);
        }
    }

    protected void A1(int i10, String str) throws InputCoercionException {
        if (i10 == 1) {
            k1(str);
        } else {
            n1(str);
        }
    }

    protected void B1(int i10, String str) {
        if (!i0(e.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            V0("Illegal unquoted character (" + c.K0((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected String C1() {
        return D1();
    }

    protected String D1() {
        return i0(e.a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected void E1() {
        int i10 = this.C;
        if ((i10 & 8) != 0) {
            this.H = com.fasterxml.jackson.core.io.e.c(g0());
        } else if ((i10 & 4) != 0) {
            this.H = new BigDecimal(this.G);
        } else if ((i10 & 2) != 0) {
            this.H = BigDecimal.valueOf(this.E);
        } else if ((i10 & 1) != 0) {
            this.H = BigDecimal.valueOf(this.D);
        } else {
            e1();
        }
        this.C |= 16;
    }

    protected void F1() {
        int i10 = this.C;
        if ((i10 & 16) != 0) {
            this.G = this.H.toBigInteger();
        } else if ((i10 & 2) != 0) {
            this.G = BigInteger.valueOf(this.E);
        } else if ((i10 & 1) != 0) {
            this.G = BigInteger.valueOf(this.D);
        } else if ((i10 & 8) != 0) {
            this.G = BigDecimal.valueOf(this.F).toBigInteger();
        } else {
            e1();
        }
        this.C |= 4;
    }

    protected void G1() {
        int i10 = this.C;
        if ((i10 & 16) != 0) {
            this.F = this.H.doubleValue();
        } else if ((i10 & 4) != 0) {
            this.F = this.G.doubleValue();
        } else if ((i10 & 2) != 0) {
            this.F = this.E;
        } else if ((i10 & 1) != 0) {
            this.F = this.D;
        } else {
            e1();
        }
        this.C |= 8;
    }

    protected void H1() throws InputCoercionException {
        int i10 = this.C;
        if ((i10 & 2) != 0) {
            long j10 = this.E;
            int i11 = (int) j10;
            if (i11 != j10) {
                l1(g0(), h1());
            }
            this.D = i11;
        } else if ((i10 & 4) != 0) {
            if (c.f38357e.compareTo(this.G) > 0 || c.f38358f.compareTo(this.G) < 0) {
                j1();
            }
            this.D = this.G.intValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this.F;
            if (d10 < -2.147483648E9d || d10 > 2.147483647E9d) {
                j1();
            }
            this.D = (int) this.F;
        } else if ((i10 & 16) != 0) {
            if (c.f38363k.compareTo(this.H) > 0 || c.f38364l.compareTo(this.H) < 0) {
                j1();
            }
            this.D = this.H.intValue();
        } else {
            e1();
        }
        this.C |= 1;
    }

    protected void I1() throws InputCoercionException {
        int i10 = this.C;
        if ((i10 & 1) != 0) {
            this.E = this.D;
        } else if ((i10 & 4) != 0) {
            if (c.f38359g.compareTo(this.G) > 0 || c.f38360h.compareTo(this.G) < 0) {
                m1();
            }
            this.E = this.G.longValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this.F;
            if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
                m1();
            }
            this.E = (long) this.F;
        } else if ((i10 & 16) != 0) {
            if (c.f38361i.compareTo(this.H) > 0 || c.f38362j.compareTo(this.H) < 0) {
                m1();
            }
            this.E = this.H.longValue();
        } else {
            e1();
        }
        this.C |= 2;
    }

    public d J1() {
        return this.f38351w;
    }

    protected final g L1(boolean z10, int i10, int i11, int i12) {
        return (i11 >= 1 || i12 >= 1) ? N1(z10, i10, i11, i12) : O1(z10, i10);
    }

    protected final g M1(String str, double d10) {
        this.f38353y.v(str);
        this.F = d10;
        this.C = 8;
        return g.VALUE_NUMBER_FLOAT;
    }

    @Override // f8.c
    protected void N0() throws JsonEOFException {
        if (this.f38351w.f()) {
            return;
        }
        a1(String.format(": expected close marker for %s (start marker at %s)", this.f38351w.d() ? "Array" : "Object", this.f38351w.o(s1())), null);
    }

    protected final g N1(boolean z10, int i10, int i11, int i12) {
        this.I = z10;
        this.J = i10;
        this.K = i11;
        this.L = i12;
        this.C = 0;
        return g.VALUE_NUMBER_FLOAT;
    }

    protected final g O1(boolean z10, int i10) {
        this.I = z10;
        this.J = i10;
        this.K = 0;
        this.L = 0;
        this.C = 0;
        return g.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.e
    public long c0() throws JsonParseException, InputCoercionException {
        int i10 = this.C;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                v1(2);
            }
            if ((this.C & 2) == 0) {
                I1();
            }
        }
        return this.E;
    }

    @Override // com.fasterxml.jackson.core.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38342n) {
            return;
        }
        this.f38343o = Math.max(this.f38343o, this.f38344p);
        this.f38342n = true;
        try {
            q1();
        } finally {
            y1();
        }
    }

    @Override // com.fasterxml.jackson.core.e
    public BigInteger d() throws JsonParseException, InputCoercionException {
        int i10 = this.C;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                v1(4);
            }
            if ((this.C & 4) == 0) {
                F1();
            }
        }
        return this.G;
    }

    @Override // com.fasterxml.jackson.core.e
    public String l() {
        d dVarN;
        g gVar = this.f38365b;
        return ((gVar == g.START_OBJECT || gVar == g.START_ARRAY) && (dVarN = this.f38351w.n()) != null) ? dVarN.b() : this.f38351w.b();
    }

    @Override // com.fasterxml.jackson.core.e
    public BigDecimal q() throws JsonParseException, InputCoercionException {
        int i10 = this.C;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                v1(16);
            }
            if ((this.C & 16) == 0) {
                E1();
            }
        }
        return this.H;
    }

    protected abstract void q1();

    @Override // com.fasterxml.jackson.core.e
    public double r() throws JsonParseException, InputCoercionException {
        int i10 = this.C;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                v1(8);
            }
            if ((this.C & 8) == 0) {
                G1();
            }
        }
        return this.F;
    }

    protected final int r1() throws JsonEOFException {
        N0();
        return -1;
    }

    @Override // com.fasterxml.jackson.core.e
    public float s() {
        return (float) r();
    }

    protected Object s1() {
        if (e.a.INCLUDE_SOURCE_IN_LOCATION.h(this.f16170a)) {
            return this.f38341m.k();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.e
    public int t() throws InputCoercionException {
        int i10 = this.C;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return u1();
            }
            if ((i10 & 1) == 0) {
                H1();
            }
        }
        return this.D;
    }

    protected char t1(char c10) throws JsonParseException {
        if (i0(e.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c10 == '\'' && i0(e.a.ALLOW_SINGLE_QUOTES))) {
            return c10;
        }
        V0("Unrecognized character escape " + c.K0(c10));
        return c10;
    }

    protected int u1() throws JsonParseException, InputCoercionException {
        if (this.f38365b != g.VALUE_NUMBER_INT || this.J > 9) {
            v1(1);
            if ((this.C & 1) == 0) {
                H1();
            }
            return this.D;
        }
        int iH = this.f38353y.h(this.I);
        this.D = iH;
        this.C = 1;
        return iH;
    }

    protected void v1(int i10) throws JsonParseException, InputCoercionException {
        g gVar = this.f38365b;
        if (gVar != g.VALUE_NUMBER_INT) {
            if (gVar == g.VALUE_NUMBER_FLOAT) {
                w1(i10);
                return;
            } else {
                W0("Current token (%s) not numeric, can not use numeric value accessors", gVar);
                return;
            }
        }
        int i11 = this.J;
        if (i11 <= 9) {
            this.D = this.f38353y.h(this.I);
            this.C = 1;
            return;
        }
        if (i11 > 18) {
            x1(i10);
            return;
        }
        long jI = this.f38353y.i(this.I);
        if (i11 == 10) {
            if (this.I) {
                if (jI >= -2147483648L) {
                    this.D = (int) jI;
                    this.C = 1;
                    return;
                }
            } else if (jI <= 2147483647L) {
                this.D = (int) jI;
                this.C = 1;
                return;
            }
        }
        this.E = jI;
        this.C = 2;
    }

    protected void y1() {
        this.f38353y.s();
        char[] cArr = this.f38354z;
        if (cArr != null) {
            this.f38354z = null;
            this.f38341m.n(cArr);
        }
    }

    protected void z1(int i10, char c10) {
        d dVarJ1 = J1();
        V0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i10), Character.valueOf(c10), dVarJ1.g(), dVarJ1.o(s1())));
    }
}
