package g8;

import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g extends f8.b {
    private static final int V = com.fasterxml.jackson.core.e.a.ALLOW_TRAILING_COMMA.i();
    private static final int W = com.fasterxml.jackson.core.e.a.ALLOW_NUMERIC_LEADING_ZEROS.i();
    private static final int X = com.fasterxml.jackson.core.e.a.ALLOW_NON_NUMERIC_NUMBERS.i();
    private static final int Y = com.fasterxml.jackson.core.e.a.ALLOW_MISSING_VALUES.i();
    private static final int Z = com.fasterxml.jackson.core.e.a.ALLOW_SINGLE_QUOTES.i();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f39001a0 = com.fasterxml.jackson.core.e.a.ALLOW_UNQUOTED_FIELD_NAMES.i();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f39002b0 = com.fasterxml.jackson.core.e.a.ALLOW_COMMENTS.i();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f39003c0 = com.fasterxml.jackson.core.e.a.ALLOW_YAML_COMMENTS.i();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected static final int[] f39004d0 = com.fasterxml.jackson.core.io.a.i();
    protected Reader M;
    protected char[] N;
    protected boolean O;
    protected final h8.b P;
    protected final int Q;
    protected boolean R;
    protected long S;
    protected int T;
    protected int U;

    public g(com.fasterxml.jackson.core.io.b bVar, int i10, Reader reader, com.fasterxml.jackson.core.h hVar, h8.b bVar2, char[] cArr, int i11, int i12, boolean z10) {
        super(bVar, i10);
        this.M = reader;
        this.N = cArr;
        this.f38343o = i11;
        this.f38344p = i12;
        this.P = bVar2;
        this.Q = bVar2.p();
        this.O = z10;
    }

    private final int A2() throws JsonParseException {
        if (this.f38343o >= this.f38344p && !a2()) {
            return r1();
        }
        char[] cArr = this.N;
        int i10 = this.f38343o;
        int i11 = i10 + 1;
        this.f38343o = i11;
        char c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this.f38343o = i10;
            return B2();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this.f38346r++;
                this.f38347s = i11;
            } else if (c10 == '\r') {
                t2();
            } else if (c10 != '\t') {
                f1(c10);
            }
        }
        while (true) {
            int i12 = this.f38343o;
            if (i12 >= this.f38344p) {
                return B2();
            }
            char[] cArr2 = this.N;
            int i13 = i12 + 1;
            this.f38343o = i13;
            char c11 = cArr2[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this.f38343o = i12;
                return B2();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this.f38346r++;
                    this.f38347s = i13;
                } else if (c11 == '\r') {
                    t2();
                } else if (c11 != '\t') {
                    f1(c11);
                }
            }
        }
    }

    private int B2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                return r1();
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x2();
                } else if (c10 != '#' || !C2()) {
                    return c10;
                }
            } else if (c10 != ' ') {
                if (c10 == '\n') {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (c10 == '\r') {
                    t2();
                } else if (c10 != '\t') {
                    f1(c10);
                }
            }
        }
    }

    private boolean C2() throws JsonParseException {
        if ((this.f16170a & f39003c0) == 0) {
            return false;
        }
        y2();
        return true;
    }

    private final void D2() {
        int i10 = this.f38343o;
        this.f38348t = this.f38345q + ((long) i10);
        this.f38349u = this.f38346r;
        this.f38350v = i10 - this.f38347s;
    }

    private final void E2() {
        int i10 = this.f38343o;
        this.S = i10;
        this.T = this.f38346r;
        this.U = i10 - this.f38347s;
    }

    private char F2() throws JsonParseException {
        char c10;
        if ((this.f38343o >= this.f38344p && !a2()) || (c10 = this.N[this.f38343o]) < '0' || c10 > '9') {
            return '0';
        }
        if ((this.f16170a & W) == 0) {
            i1("Leading zeroes not allowed");
        }
        this.f38343o++;
        if (c10 != '0') {
            return c10;
        }
        do {
            if (this.f38343o >= this.f38344p && !a2()) {
                return c10;
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            c10 = cArr[i10];
            if (c10 < '0' || c10 > '9') {
                return '0';
            }
            this.f38343o = i10 + 1;
        } while (c10 == '0');
        return c10;
    }

    private final char G2() {
        char c10;
        int i10 = this.f38343o;
        if (i10 >= this.f38344p || ((c10 = this.N[i10]) >= '0' && c10 <= '9')) {
            return F2();
        }
        return '0';
    }

    private final void H2(int i10) throws JsonParseException {
        int i11 = this.f38343o + 1;
        this.f38343o = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this.f38346r++;
                this.f38347s = i11;
            } else if (i10 == 13) {
                t2();
            } else if (i10 != 32) {
                c1(i10);
            }
        }
    }

    private final void P1(String str, int i10, int i11) throws JsonParseException {
        if (Character.isJavaIdentifierPart((char) i11)) {
            p2(str.substring(0, i10));
        }
    }

    private void Q1(int i10) {
        if (i10 == 93) {
            D2();
            if (!this.f38351w.d()) {
                z1(i10, '}');
            }
            this.f38351w = this.f38351w.i();
            this.f38365b = com.fasterxml.jackson.core.g.END_ARRAY;
        }
        if (i10 == 125) {
            D2();
            if (!this.f38351w.e()) {
                z1(i10, ']');
            }
            this.f38351w = this.f38351w.i();
            this.f38365b = com.fasterxml.jackson.core.g.END_OBJECT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[SYNTHETIC] */
    private String Y1(int i10, int i11, int[] iArr) {
        int i12;
        this.f38353y.u(this.N, i10, this.f38343o - i10);
        char[] cArrO = this.f38353y.o();
        int iP = this.f38353y.p();
        int length = iArr.length;
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                break;
            }
            char c10 = this.N[this.f38343o];
            if (c10 < length) {
                if (iArr[c10] != 0) {
                    break;
                }
                this.f38343o++;
                i11 = (i11 * 33) + c10;
                i12 = iP + 1;
                cArrO[iP] = c10;
                if (i12 >= cArrO.length) {
                    cArrO = this.f38353y.n();
                    iP = 0;
                } else {
                    iP = i12;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c10)) {
                    break;
                }
                this.f38343o++;
                i11 = (i11 * 33) + c10;
                i12 = iP + 1;
                cArrO[iP] = c10;
                if (i12 >= cArrO.length) {
                    cArrO = this.f38353y.n();
                    iP = 0;
                } else {
                    iP = i12;
                }
            }
        }
        this.f38353y.y(iP);
        i8.i iVar = this.f38353y;
        return this.P.o(iVar.q(), iVar.r(), iVar.z(), i11);
    }

    private final void b2() throws JsonParseException {
        int i10;
        char c10;
        int i11 = this.f38343o;
        if (i11 + 4 < this.f38344p) {
            char[] cArr = this.N;
            if (cArr[i11] == 'a' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 's' && cArr[i11 + 3] == 'e' && ((c10 = cArr[(i10 = i11 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f38343o = i10;
                return;
            }
        }
        d2("false", 1);
    }

    private final void c2() throws JsonParseException {
        int i10;
        char c10;
        int i11 = this.f38343o;
        if (i11 + 3 < this.f38344p) {
            char[] cArr = this.N;
            if (cArr[i11] == 'u' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 'l' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f38343o = i10;
                return;
            }
        }
        d2("null", 1);
    }

    private final void e2(String str, int i10) throws JsonParseException {
        int i11;
        char c10;
        int length = str.length();
        do {
            if ((this.f38343o >= this.f38344p && !a2()) || this.N[this.f38343o] != str.charAt(i10)) {
                p2(str.substring(0, i10));
            }
            i11 = this.f38343o + 1;
            this.f38343o = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.f38344p || a2()) && (c10 = this.N[this.f38343o]) >= '0' && c10 != ']' && c10 != '}') {
            P1(str, i10, c10);
        }
    }

    private final void f2() throws JsonParseException {
        int i10;
        char c10;
        int i11 = this.f38343o;
        if (i11 + 3 < this.f38344p) {
            char[] cArr = this.N;
            if (cArr[i11] == 'r' && cArr[i11 + 1] == 'u' && cArr[i11 + 2] == 'e' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f38343o = i10;
                return;
            }
        }
        d2("true", 1);
    }

    private final com.fasterxml.jackson.core.g g2() {
        this.A = false;
        com.fasterxml.jackson.core.g gVar = this.f38352x;
        this.f38352x = null;
        if (gVar == com.fasterxml.jackson.core.g.START_ARRAY) {
            this.f38351w = this.f38351w.j(this.f38349u, this.f38350v);
        } else if (gVar == com.fasterxml.jackson.core.g.START_OBJECT) {
            this.f38351w = this.f38351w.k(this.f38349u, this.f38350v);
        }
        this.f38365b = gVar;
        return gVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.g i2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private String l2(int i10, int i11, int i12) throws JsonParseException {
        this.f38353y.u(this.N, i10, this.f38343o - i10);
        char[] cArrO = this.f38353y.o();
        int iP = this.f38353y.p();
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                a1(" in field name", com.fasterxml.jackson.core.g.FIELD_NAME);
            }
            char[] cArr = this.N;
            int i13 = this.f38343o;
            this.f38343o = i13 + 1;
            char cR1 = cArr[i13];
            if (cR1 <= '\\') {
                if (cR1 == '\\') {
                    cR1 = R1();
                } else if (cR1 <= i12) {
                    if (cR1 == i12) {
                        this.f38353y.y(iP);
                        i8.i iVar = this.f38353y;
                        return this.P.o(iVar.q(), iVar.r(), iVar.z(), i11);
                    }
                    if (cR1 < ' ') {
                        B1(cR1, "name");
                    }
                }
            }
            i11 = (i11 * 33) + cR1;
            int i14 = iP + 1;
            cArrO[iP] = cR1;
            if (i14 >= cArrO.length) {
                cArrO = this.f38353y.n();
                iP = 0;
            } else {
                iP = i14;
            }
        }
    }

    private final com.fasterxml.jackson.core.g n2(boolean z10, int i10) throws JsonParseException {
        int i11;
        char cJ2;
        boolean z11;
        int i12;
        char cI2;
        if (z10) {
            i10++;
        }
        this.f38343o = i10;
        char[] cArrK = this.f38353y.k();
        int i13 = 0;
        if (z10) {
            cArrK[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = this.f38343o;
        if (i14 < this.f38344p) {
            char[] cArr = this.N;
            this.f38343o = i14 + 1;
            cJ2 = cArr[i14];
        } else {
            cJ2 = J2("No digit following minus sign", com.fasterxml.jackson.core.g.VALUE_NUMBER_INT);
        }
        if (cJ2 == '0') {
            cJ2 = G2();
        }
        int i15 = 0;
        while (true) {
            if (cJ2 >= '0' && cJ2 <= '9') {
                i15++;
                if (i11 >= cArrK.length) {
                    cArrK = this.f38353y.n();
                    i11 = 0;
                }
                int i16 = i11 + 1;
                cArrK[i11] = cJ2;
                if (this.f38343o >= this.f38344p && !a2()) {
                    cJ2 = 0;
                    i11 = i16;
                    z11 = true;
                    break;
                }
                char[] cArr2 = this.N;
                int i17 = this.f38343o;
                this.f38343o = i17 + 1;
                cJ2 = cArr2[i17];
                i11 = i16;
            } else {
                z11 = false;
                break;
            }
        }
        if (i15 == 0) {
            return W1(cJ2, z10);
        }
        if (cJ2 == '.') {
            if (i11 >= cArrK.length) {
                cArrK = this.f38353y.n();
                i11 = 0;
            }
            cArrK[i11] = cJ2;
            i11++;
            i12 = 0;
            while (true) {
                if (this.f38343o >= this.f38344p && !a2()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this.N;
                int i18 = this.f38343o;
                this.f38343o = i18 + 1;
                cJ2 = cArr3[i18];
                if (cJ2 < '0' || cJ2 > '9') {
                    break;
                }
                i12++;
                if (i11 >= cArrK.length) {
                    cArrK = this.f38353y.n();
                    i11 = 0;
                }
                cArrK[i11] = cJ2;
                i11++;
            }
            if (i12 == 0) {
                p1(cJ2, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (cJ2 == 'e' || cJ2 == 'E') {
            if (i11 >= cArrK.length) {
                cArrK = this.f38353y.n();
                i11 = 0;
            }
            int i19 = i11 + 1;
            cArrK[i11] = cJ2;
            int i20 = this.f38343o;
            if (i20 < this.f38344p) {
                char[] cArr4 = this.N;
                this.f38343o = i20 + 1;
                cI2 = cArr4[i20];
            } else {
                cI2 = I2("expected a digit for number exponent");
            }
            if (cI2 == '-' || cI2 == '+') {
                if (i19 >= cArrK.length) {
                    cArrK = this.f38353y.n();
                    i19 = 0;
                }
                int i21 = i19 + 1;
                cArrK[i19] = cI2;
                int i22 = this.f38343o;
                if (i22 < this.f38344p) {
                    char[] cArr5 = this.N;
                    this.f38343o = i22 + 1;
                    cI2 = cArr5[i22];
                } else {
                    cI2 = I2("expected a digit for number exponent");
                }
                i19 = i21;
            }
            int i23 = 0;
            cJ2 = cI2;
            while (true) {
                if (cJ2 <= '9' && cJ2 >= '0') {
                    i23++;
                    if (i19 >= cArrK.length) {
                        cArrK = this.f38353y.n();
                        i19 = 0;
                    }
                    i11 = i19 + 1;
                    cArrK[i19] = cJ2;
                    if (this.f38343o >= this.f38344p && !a2()) {
                        z11 = true;
                        break;
                    }
                    char[] cArr6 = this.N;
                    int i24 = this.f38343o;
                    this.f38343o = i24 + 1;
                    cJ2 = cArr6[i24];
                    i19 = i11;
                } else {
                    i11 = i19;
                    break;
                }
            }
            i13 = i23;
            if (i13 == 0) {
                p1(cJ2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.f38343o--;
            if (this.f38351w.f()) {
                H2(cJ2);
            }
        }
        this.f38353y.y(i11);
        return L1(z10, i15, i12, i13);
    }

    private final int r2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                throw c("Unexpected end-of-input within/between " + this.f38351w.g() + " entries");
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x2();
                } else if (c10 != '#' || !C2()) {
                    return c10;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (c10 == '\r') {
                    t2();
                } else if (c10 != '\t') {
                    f1(c10);
                }
            }
        }
    }

    private void s2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                break;
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c10 = cArr[i10];
            if (c10 <= '*') {
                if (c10 == '*') {
                    if (i11 >= this.f38344p && !a2()) {
                        break;
                    }
                    char[] cArr2 = this.N;
                    int i12 = this.f38343o;
                    if (cArr2[i12] == '/') {
                        this.f38343o = i12 + 1;
                        return;
                    }
                } else if (c10 < ' ') {
                    if (c10 == '\n') {
                        this.f38346r++;
                        this.f38347s = i11;
                    } else if (c10 == '\r') {
                        t2();
                    } else if (c10 != '\t') {
                        f1(c10);
                    }
                }
            }
        }
        a1(" in a comment", null);
    }

    private final int u2() {
        int i10 = this.f38343o;
        if (i10 + 4 >= this.f38344p) {
            return v2(false);
        }
        char[] cArr = this.N;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return v2(true);
                }
                this.f38343o = i10 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i12 = i10 + 2;
                this.f38343o = i12;
                char c12 = cArr[i12];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return v2(true);
                    }
                    this.f38343o = i10 + 3;
                    return c12;
                }
            }
            return v2(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i13 = i10 + 1;
            this.f38343o = i13;
            c10 = cArr[i13];
        }
        if (c10 != ':') {
            return v2(false);
        }
        int i14 = this.f38343o;
        int i15 = i14 + 1;
        this.f38343o = i15;
        char c13 = cArr[i15];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return v2(true);
            }
            this.f38343o = i14 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i16 = i14 + 2;
            this.f38343o = i16;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                if (c14 == '/' || c14 == '#') {
                    return v2(true);
                }
                this.f38343o = i14 + 3;
                return c14;
            }
        }
        return v2(true);
    }

    private final int v2(boolean z10) throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                a1(" within/between " + this.f38351w.g() + " entries", null);
                return -1;
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x2();
                } else if (c10 != '#' || !C2()) {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        d1(c10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f38346r++;
                    this.f38347s = i11;
                } else if (c10 == '\r') {
                    t2();
                } else if (c10 != '\t') {
                    f1(c10);
                }
            }
        }
    }

    private final int w2(int i10) throws JsonParseException {
        if (i10 != 44) {
            d1(i10, "was expecting comma to separate " + this.f38351w.g() + " entries");
        }
        while (true) {
            int i11 = this.f38343o;
            if (i11 >= this.f38344p) {
                return r2();
            }
            char[] cArr = this.N;
            int i12 = i11 + 1;
            this.f38343o = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this.f38343o = i11;
                return r2();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f38346r++;
                    this.f38347s = i12;
                } else if (c10 == '\r') {
                    t2();
                } else if (c10 != '\t') {
                    f1(c10);
                }
            }
        }
    }

    private void x2() throws JsonParseException {
        if ((this.f16170a & f39002b0) == 0) {
            d1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f38343o >= this.f38344p && !a2()) {
            a1(" in a comment", null);
        }
        char[] cArr = this.N;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            y2();
        } else if (c10 == '*') {
            s2();
        } else {
            d1(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    private void y2() throws JsonParseException {
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                return;
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            int i11 = i10 + 1;
            this.f38343o = i11;
            char c10 = cArr[i10];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f38346r++;
                    this.f38347s = i11;
                    return;
                } else if (c10 == '\r') {
                    t2();
                    return;
                } else if (c10 != '\t') {
                    f1(c10);
                }
            }
        }
    }

    protected char I2(String str) {
        return J2(str, null);
    }

    protected char J2(String str, com.fasterxml.jackson.core.g gVar) throws JsonEOFException {
        if (this.f38343o >= this.f38344p && !a2()) {
            a1(str, gVar);
        }
        char[] cArr = this.N;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        return cArr[i10];
    }

    protected char R1() throws JsonParseException {
        if (this.f38343o >= this.f38344p && !a2()) {
            a1(" in character escape sequence", com.fasterxml.jackson.core.g.VALUE_STRING);
        }
        char[] cArr = this.N;
        int i10 = this.f38343o;
        this.f38343o = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return t1(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.f38343o >= this.f38344p && !a2()) {
                a1(" in character escape sequence", com.fasterxml.jackson.core.g.VALUE_STRING);
            }
            char[] cArr2 = this.N;
            int i13 = this.f38343o;
            this.f38343o = i13 + 1;
            char c11 = cArr2[i13];
            int iC = com.fasterxml.jackson.core.io.a.c(c11);
            if (iC < 0) {
                d1(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iC;
        }
        return (char) i11;
    }

    protected final void S1() throws JsonParseException {
        int i10 = this.f38343o;
        int i11 = this.f38344p;
        if (i10 < i11) {
            int[] iArr = f39004d0;
            int length = iArr.length;
            do {
                char[] cArr = this.N;
                char c10 = cArr[i10];
                if (c10 < length && iArr[c10] != 0) {
                    if (c10 != '\"') {
                        break;
                    }
                    i8.i iVar = this.f38353y;
                    int i12 = this.f38343o;
                    iVar.u(cArr, i12, i10 - i12);
                    this.f38343o = i10 + 1;
                    return;
                }
                i10++;
            } while (i10 < i11);
        }
        i8.i iVar2 = this.f38353y;
        char[] cArr2 = this.N;
        int i13 = this.f38343o;
        iVar2.t(cArr2, i13, i10 - i13);
        this.f38343o = i10;
        T1();
    }

    protected final String U1(com.fasterxml.jackson.core.g gVar) {
        if (gVar == null) {
            return null;
        }
        int iG = gVar.g();
        if (iG != 5) {
            return (iG == 6 || iG == 7 || iG == 8) ? this.f38353y.j() : gVar.d();
        }
        return this.f38351w.b();
    }

    protected com.fasterxml.jackson.core.g V1() throws JsonParseException {
        char[] cArrK = this.f38353y.k();
        int iP = this.f38353y.p();
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                a1(": was expecting closing quote for a string value", com.fasterxml.jackson.core.g.VALUE_STRING);
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            this.f38343o = i10 + 1;
            char cR1 = cArr[i10];
            if (cR1 <= '\\') {
                if (cR1 == '\\') {
                    cR1 = R1();
                } else if (cR1 <= '\'') {
                    if (cR1 == '\'') {
                        this.f38353y.y(iP);
                        return com.fasterxml.jackson.core.g.VALUE_STRING;
                    }
                    if (cR1 < ' ') {
                        B1(cR1, "string value");
                    }
                }
            }
            if (iP >= cArrK.length) {
                cArrK = this.f38353y.n();
                iP = 0;
            }
            cArrK[iP] = cR1;
            iP++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.g W1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected String X1(int i10) throws JsonParseException {
        boolean zIsJavaIdentifierPart;
        if (i10 == 39 && (this.f16170a & Z) != 0) {
            return h2();
        }
        if ((this.f16170a & f39001a0) == 0) {
            d1(i10, "was expecting double-quote to start field name");
        }
        int[] iArrJ = com.fasterxml.jackson.core.io.a.j();
        int length = iArrJ.length;
        if (i10 < length) {
            zIsJavaIdentifierPart = iArrJ[i10] == 0;
        } else {
            zIsJavaIdentifierPart = Character.isJavaIdentifierPart((char) i10);
        }
        if (!zIsJavaIdentifierPart) {
            d1(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i11 = this.f38343o;
        int i12 = this.Q;
        int i13 = this.f38344p;
        if (i11 < i13) {
            do {
                char[] cArr = this.N;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (iArrJ[c10] != 0) {
                        int i14 = this.f38343o - 1;
                        this.f38343o = i11;
                        return this.P.o(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i15 = this.f38343o - 1;
                    this.f38343o = i11;
                    return this.P.o(this.N, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
        }
        int i16 = this.f38343o - 1;
        this.f38343o = i11;
        return Y1(i16, i12, iArrJ);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    protected com.fasterxml.jackson.core.g Z1(int i10) throws JsonParseException {
        if (i10 != 39) {
            if (i10 == 73) {
                d2("Infinity", 1);
                if ((this.f16170a & X) != 0) {
                    return M1("Infinity", Double.POSITIVE_INFINITY);
                }
                V0("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 == 78) {
                d2("NaN", 1);
                if ((this.f16170a & X) != 0) {
                    return M1("NaN", Double.NaN);
                }
                V0("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 != 93) {
                if (i10 == 43) {
                    if (this.f38343o >= this.f38344p && !a2()) {
                        b1(com.fasterxml.jackson.core.g.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.N;
                    int i11 = this.f38343o;
                    this.f38343o = i11 + 1;
                    return W1(cArr[i11], false);
                }
                if (i10 == 44) {
                    if (!this.f38351w.f() && (this.f16170a & Y) != 0) {
                        this.f38343o--;
                        return com.fasterxml.jackson.core.g.VALUE_NULL;
                    }
                }
            } else if (this.f38351w.d()) {
                if (!this.f38351w.f()) {
                    this.f38343o--;
                    return com.fasterxml.jackson.core.g.VALUE_NULL;
                }
            }
        } else if ((this.f16170a & Z) != 0) {
            return V1();
        }
        if (Character.isJavaIdentifierStart(i10)) {
            q2("" + ((char) i10), C1());
        }
        d1(i10, "expected a valid value " + D1());
        return null;
    }

    protected boolean a2() throws IOException {
        Reader reader = this.M;
        if (reader != null) {
            char[] cArr = this.N;
            int i10 = reader.read(cArr, 0, cArr.length);
            if (i10 > 0) {
                int i11 = this.f38344p;
                long j10 = i11;
                this.f38345q += j10;
                this.f38347s -= i11;
                this.S -= j10;
                this.f38343o = 0;
                this.f38344p = i10;
                return true;
            }
            q1();
            if (i10 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f38344p);
            }
        }
        return false;
    }

    protected final void d2(String str, int i10) throws JsonParseException {
        int i11;
        int length = str.length();
        if (this.f38343o + length >= this.f38344p) {
            e2(str, i10);
            return;
        }
        do {
            if (this.N[this.f38343o] != str.charAt(i10)) {
                p2(str.substring(0, i10));
            }
            i11 = this.f38343o + 1;
            this.f38343o = i11;
            i10++;
        } while (i10 < length);
        char c10 = this.N[i11];
        if (c10 < '0' || c10 == ']' || c10 == '}') {
            return;
        }
        P1(str, i10, c10);
    }

    @Override // f8.c, com.fasterxml.jackson.core.e
    public final String g0() throws JsonParseException {
        com.fasterxml.jackson.core.g gVar = this.f38365b;
        if (gVar != com.fasterxml.jackson.core.g.VALUE_STRING) {
            return U1(gVar);
        }
        if (this.R) {
            this.R = false;
            S1();
        }
        return this.f38353y.j();
    }

    protected String h2() {
        int i10 = this.f38343o;
        int i11 = this.Q;
        int i12 = this.f38344p;
        if (i10 < i12) {
            int[] iArr = f39004d0;
            int length = iArr.length;
            do {
                char[] cArr = this.N;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this.f38343o;
                    this.f38343o = i10 + 1;
                    return this.P.o(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this.f38343o;
        this.f38343o = i10;
        return l2(i14, i11, 39);
    }

    protected final com.fasterxml.jackson.core.g j2() {
        if (!i0(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.d())) {
            return Z1(46);
        }
        int i10 = this.f38343o;
        return i2(46, i10 - 1, i10, false, 0);
    }

    @Override // com.fasterxml.jackson.core.e
    public com.fasterxml.jackson.core.d k() {
        int i10 = (this.f38343o - this.f38347s) + 1;
        return new com.fasterxml.jackson.core.d(s1(), -1L, ((long) this.f38343o) + this.f38345q, this.f38346r, i10);
    }

    protected final String k2() {
        int i10 = this.f38343o;
        int i11 = this.Q;
        int[] iArr = f39004d0;
        while (i10 < this.f38344p) {
            char[] cArr = this.N;
            char c10 = cArr[i10];
            if (c10 < iArr.length && iArr[c10] != 0) {
                if (c10 != '\"') {
                    break;
                }
                int i12 = this.f38343o;
                this.f38343o = i10 + 1;
                return this.P.o(cArr, i12, i10 - i12, i11);
            }
            i11 = (i11 * 33) + c10;
            i10++;
        }
        int i13 = this.f38343o;
        this.f38343o = i10;
        return l2(i13, i11, 34);
    }

    @Override // f8.c, com.fasterxml.jackson.core.e
    public final com.fasterxml.jackson.core.g m0() throws JsonParseException {
        com.fasterxml.jackson.core.g gVarM2;
        com.fasterxml.jackson.core.g gVar = this.f38365b;
        com.fasterxml.jackson.core.g gVar2 = com.fasterxml.jackson.core.g.FIELD_NAME;
        if (gVar == gVar2) {
            return g2();
        }
        this.C = 0;
        if (this.R) {
            z2();
        }
        int iA2 = A2();
        if (iA2 < 0) {
            close();
            this.f38365b = null;
            return null;
        }
        this.B = null;
        if (iA2 == 93 || iA2 == 125) {
            Q1(iA2);
            return this.f38365b;
        }
        if (this.f38351w.m()) {
            iA2 = w2(iA2);
            if ((this.f16170a & V) != 0 && (iA2 == 93 || iA2 == 125)) {
                Q1(iA2);
                return this.f38365b;
            }
        }
        boolean zE = this.f38351w.e();
        if (zE) {
            E2();
            this.f38351w.q(iA2 == 34 ? k2() : X1(iA2));
            this.f38365b = gVar2;
            iA2 = u2();
        }
        D2();
        if (iA2 == 34) {
            this.R = true;
            gVarM2 = com.fasterxml.jackson.core.g.VALUE_STRING;
        } else if (iA2 == 91) {
            if (!zE) {
                this.f38351w = this.f38351w.j(this.f38349u, this.f38350v);
            }
            gVarM2 = com.fasterxml.jackson.core.g.START_ARRAY;
        } else if (iA2 == 102) {
            b2();
            gVarM2 = com.fasterxml.jackson.core.g.VALUE_FALSE;
        } else if (iA2 == 110) {
            c2();
            gVarM2 = com.fasterxml.jackson.core.g.VALUE_NULL;
        } else if (iA2 == 116) {
            f2();
            gVarM2 = com.fasterxml.jackson.core.g.VALUE_TRUE;
        } else if (iA2 == 123) {
            if (!zE) {
                this.f38351w = this.f38351w.k(this.f38349u, this.f38350v);
            }
            gVarM2 = com.fasterxml.jackson.core.g.START_OBJECT;
        } else if (iA2 == 125) {
            d1(iA2, "expected a value");
            f2();
            gVarM2 = com.fasterxml.jackson.core.g.VALUE_TRUE;
        } else if (iA2 == 45) {
            gVarM2 = m2();
        } else if (iA2 != 46) {
            switch (iA2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case AD_VISIBILITY_VALUE:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    gVarM2 = o2(iA2);
                    break;
                default:
                    gVarM2 = Z1(iA2);
                    break;
            }
        } else {
            gVarM2 = j2();
        }
        if (zE) {
            this.f38352x = gVarM2;
            return this.f38365b;
        }
        this.f38365b = gVarM2;
        return gVarM2;
    }

    protected final com.fasterxml.jackson.core.g m2() throws JsonParseException {
        int i10 = this.f38343o;
        int i11 = i10 - 1;
        int i12 = this.f38344p;
        if (i10 >= i12) {
            return n2(true, i11);
        }
        int i13 = i10 + 1;
        char c10 = this.N[i10];
        char c11 = '9';
        if (c10 > '9' || c10 < '0') {
            this.f38343o = i13;
            return W1(c10, true);
        }
        if (c10 == '0') {
            return n2(true, i11);
        }
        int i14 = 1;
        while (i13 < i12) {
            char c12 = c11;
            int i15 = i13 + 1;
            char c13 = this.N[i13];
            if (c13 < '0' || c13 > c12) {
                if (c13 == '.' || c13 == 'e' || c13 == 'E') {
                    this.f38343o = i15;
                    return i2(c13, i11, i15, true, i14);
                }
                this.f38343o = i13;
                if (this.f38351w.f()) {
                    H2(c13);
                }
                this.f38353y.u(this.N, i11, i13 - i11);
                return O1(true, i14);
            }
            i14++;
            i13 = i15;
            c11 = c12;
        }
        return n2(true, i11);
    }

    protected final com.fasterxml.jackson.core.g o2(int i10) throws JsonParseException {
        int i11 = this.f38343o;
        int i12 = i11 - 1;
        int i13 = this.f38344p;
        char c10 = '0';
        if (i10 == 48) {
            return n2(false, i12);
        }
        int i14 = 1;
        while (i11 < i13) {
            char c11 = c10;
            int i15 = i11 + 1;
            char c12 = this.N[i11];
            if (c12 < c11 || c12 > '9') {
                if (c12 == '.' || c12 == 'e' || c12 == 'E') {
                    this.f38343o = i15;
                    return i2(c12, i12, i15, false, i14);
                }
                this.f38343o = i11;
                if (this.f38351w.f()) {
                    H2(c12);
                }
                this.f38353y.u(this.N, i12, i11 - i12);
                return O1(false, i14);
            }
            i14++;
            i11 = i15;
            c10 = c11;
        }
        this.f38343o = i12;
        return n2(false, i12);
    }

    protected void p2(String str) throws JsonParseException {
        q2(str, C1());
    }

    @Override // f8.b
    protected void q1() throws IOException {
        if (this.M != null) {
            if (this.f38341m.l() || i0(com.fasterxml.jackson.core.e.a.AUTO_CLOSE_SOURCE)) {
                this.M.close();
            }
            this.M = null;
        }
    }

    protected void q2(String str, String str2) throws JsonParseException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.f38343o < this.f38344p || a2()) {
                char c10 = this.N[this.f38343o];
                if (Character.isJavaIdentifierPart(c10)) {
                    this.f38343o++;
                    sb2.append(c10);
                }
            }
            X0("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        X0("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    protected final void t2() {
        if (this.f38343o < this.f38344p || a2()) {
            char[] cArr = this.N;
            int i10 = this.f38343o;
            if (cArr[i10] == '\n') {
                this.f38343o = i10 + 1;
            }
        }
        this.f38346r++;
        this.f38347s = this.f38343o;
    }

    @Override // f8.b
    protected void y1() {
        char[] cArr;
        super.y1();
        this.P.u();
        if (!this.O || (cArr = this.N) == null) {
            return;
        }
        this.N = null;
        this.f38341m.p(cArr);
    }

    protected final void z2() throws JsonParseException {
        this.R = false;
        int i10 = this.f38343o;
        int i11 = this.f38344p;
        char[] cArr = this.N;
        while (true) {
            if (i10 >= i11) {
                this.f38343o = i10;
                if (!a2()) {
                    a1(": was expecting closing quote for a string value", com.fasterxml.jackson.core.g.VALUE_STRING);
                }
                i10 = this.f38343o;
                i11 = this.f38344p;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this.f38343o = i12;
                    R1();
                    i10 = this.f38343o;
                    i11 = this.f38344p;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this.f38343o = i12;
                        return;
                    } else if (c10 < ' ') {
                        this.f38343o = i12;
                        B1(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    protected void T1() throws JsonParseException {
        char[] cArrO = this.f38353y.o();
        int iP = this.f38353y.p();
        int[] iArr = f39004d0;
        int length = iArr.length;
        while (true) {
            if (this.f38343o >= this.f38344p && !a2()) {
                a1(NhHRaDJCHtCTJR.wWSFhiHTNo, com.fasterxml.jackson.core.g.VALUE_STRING);
            }
            char[] cArr = this.N;
            int i10 = this.f38343o;
            this.f38343o = i10 + 1;
            char cR1 = cArr[i10];
            if (cR1 < length && iArr[cR1] != 0) {
                if (cR1 == '\"') {
                    this.f38353y.y(iP);
                    return;
                } else if (cR1 == '\\') {
                    cR1 = R1();
                } else if (cR1 < ' ') {
                    B1(cR1, "string value");
                }
            }
            if (iP >= cArrO.length) {
                cArrO = this.f38353y.n();
                iP = 0;
            }
            cArrO[iP] = cR1;
            iP++;
        }
    }

    public g(com.fasterxml.jackson.core.io.b bVar, int i10, Reader reader, com.fasterxml.jackson.core.h hVar, h8.b bVar2) {
        super(bVar, i10);
        this.M = reader;
        this.N = bVar.f();
        this.f38343o = 0;
        this.f38344p = 0;
        this.P = bVar2;
        this.Q = bVar2.p();
        this.O = true;
    }
}
