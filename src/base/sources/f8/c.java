package f8;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.io.JsonEOFException;
import i8.k;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final byte[] f38355c = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final int[] f38356d = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final BigInteger f38357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final BigInteger f38358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final BigInteger f38359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final BigInteger f38360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final BigDecimal f38361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final BigDecimal f38362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final BigDecimal f38363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final BigDecimal f38364l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected g f38365b;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f38357e = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f38358f = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f38359g = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f38360h = bigIntegerValueOf4;
        f38361i = new BigDecimal(bigIntegerValueOf3);
        f38362j = new BigDecimal(bigIntegerValueOf4);
        f38363k = new BigDecimal(bigIntegerValueOf);
        f38364l = new BigDecimal(bigIntegerValueOf2);
    }

    protected c(int i10) {
        super(i10);
    }

    protected static final String K0(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        }
        if (i10 <= 255) {
            return "'" + c10 + "' (code " + i10 + ")";
        }
        return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
    }

    protected final JsonParseException F0(String str, Throwable th2) {
        return new JsonParseException(this, str, th2);
    }

    protected abstract void N0();

    protected String T0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    protected String U0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    protected final void V0(String str) throws JsonParseException {
        throw c(str);
    }

    protected final void W0(String str, Object obj) throws JsonParseException {
        throw c(String.format(str, obj));
    }

    protected final void X0(String str, Object obj, Object obj2) throws JsonParseException {
        throw c(String.format(str, obj, obj2));
    }

    protected void Y0(String str, g gVar, Class cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, gVar, cls);
    }

    protected void Z0() throws JsonEOFException {
        a1(" in " + this.f38365b, this.f38365b);
    }

    protected void a1(String str, g gVar) throws JsonEOFException {
        throw new JsonEOFException(this, gVar, "Unexpected end-of-input" + str);
    }

    protected void b1(g gVar) throws JsonEOFException {
        String str;
        if (gVar == g.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (gVar == g.VALUE_NUMBER_INT || gVar == g.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        a1(str, gVar);
    }

    protected void c1(int i10) throws JsonParseException {
        d1(i10, "Expected space separating root-level values");
    }

    protected void d1(int i10, String str) throws JsonParseException {
        if (i10 < 0) {
            Z0();
        }
        String str2 = String.format("Unexpected character (%s)", K0(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        V0(str2);
    }

    protected final void e1() {
        k.a();
    }

    protected void f1(int i10) throws JsonParseException {
        V0("Illegal character (" + K0((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    @Override // com.fasterxml.jackson.core.e
    public abstract String g0();

    protected final void g1(String str, Throwable th2) throws JsonParseException {
        throw F0(str, th2);
    }

    public g h1() {
        return this.f38365b;
    }

    protected void i1(String str) throws JsonParseException {
        V0("Invalid numeric value: " + str);
    }

    protected void j1() throws InputCoercionException {
        k1(g0());
    }

    protected void k1(String str) throws InputCoercionException {
        l1(str, h1());
    }

    protected void l1(String str, g gVar) throws InputCoercionException {
        Y0(String.format("Numeric value (%s) out of range of int (%d - %s)", T0(str), Integer.MIN_VALUE, Integer.MAX_VALUE), gVar, Integer.TYPE);
    }

    @Override // com.fasterxml.jackson.core.e
    public g m() {
        return this.f38365b;
    }

    @Override // com.fasterxml.jackson.core.e
    public abstract g m0();

    protected void m1() throws InputCoercionException {
        n1(g0());
    }

    protected void n1(String str) throws InputCoercionException {
        o1(str, h1());
    }

    protected void o1(String str, g gVar) throws InputCoercionException {
        Y0(String.format("Numeric value (%s) out of range of long (%d - %s)", T0(str), Long.MIN_VALUE, Long.MAX_VALUE), gVar, Long.TYPE);
    }

    @Override // com.fasterxml.jackson.core.e
    public e p0() throws JsonParseException {
        g gVar = this.f38365b;
        if (gVar == g.START_OBJECT || gVar == g.START_ARRAY) {
            int i10 = 1;
            while (true) {
                g gVarM0 = m0();
                if (gVarM0 == null) {
                    N0();
                    return this;
                }
                if (gVarM0.i()) {
                    i10++;
                } else if (gVarM0.h()) {
                    i10--;
                    if (i10 == 0) {
                    }
                } else if (gVarM0 == g.NOT_AVAILABLE) {
                    W0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    protected void p1(int i10, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", K0(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        V0(str2);
    }
}
