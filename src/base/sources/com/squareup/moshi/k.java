package com.squareup.moshi;

import f8.Ygx.FuoITeVPeXAj;
import java.io.EOFException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class k extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final xn.h f35488m = xn.h.h("'\\");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final xn.h f35489n = xn.h.h("\"\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final xn.h f35490o = xn.h.h("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final xn.h f35491p = xn.h.h("\n\r");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final xn.h f35492q = xn.h.h("*/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xn.g f35493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xn.e f35494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35495i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f35496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35498l;

    k(xn.g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f35493g = gVar;
        this.f35494h = gVar.u();
        K0(6);
    }

    private void a1() throws JsonEncodingException {
        if (!this.f35473e) {
            throw Y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int c1(String str, i.a aVar) {
        int length = aVar.f35475a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f35475a[i10])) {
                this.f35495i = 0;
                this.f35471c[this.f35469a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int d1(String str, i.a aVar) {
        int length = aVar.f35475a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f35475a[i10])) {
                this.f35495i = 0;
                int[] iArr = this.f35472d;
                int i11 = this.f35469a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    private boolean e1(int i10) throws JsonEncodingException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a1();
        return false;
    }

    private int g1(boolean z10) throws EOFException, JsonEncodingException {
        byte bC0;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f35493g.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bC0 = this.f35494h.c0(i10);
                if (bC0 == 10 || bC0 == 32 || bC0 == 13 || bC0 == 9) {
                    i10 = i11;
                }
            }
            this.f35494h.skip(i10);
            if (bC0 == 47) {
                if (this.f35493g.request(2L)) {
                    a1();
                    byte bC1 = this.f35494h.c0(1L);
                    if (bC1 == 42) {
                        this.f35494h.readByte();
                        this.f35494h.readByte();
                        if (!n1()) {
                            throw Y0("Unterminated comment");
                        }
                    } else if (bC1 == 47) {
                        this.f35494h.readByte();
                        this.f35494h.readByte();
                        o1();
                    }
                }
                return bC0;
            }
            if (bC0 != 35) {
                return bC0;
            }
            a1();
            o1();
        }
    }

    private String h1(xn.h hVar) throws EOFException, JsonEncodingException {
        StringBuilder sb2 = null;
        while (true) {
            long jO0 = this.f35493g.o0(hVar);
            if (jO0 == -1) {
                throw Y0("Unterminated string");
            }
            if (this.f35494h.c0(jO0) != 92) {
                if (sb2 == null) {
                    String strE0 = this.f35494h.e0(jO0);
                    this.f35494h.readByte();
                    return strE0;
                }
                sb2.append(this.f35494h.e0(jO0));
                this.f35494h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f35494h.e0(jO0));
            this.f35494h.readByte();
            sb2.append(l1());
        }
    }

    private String i1() {
        long jO0 = this.f35493g.o0(f35490o);
        return jO0 != -1 ? this.f35494h.e0(jO0) : this.f35494h.X0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int j1() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bC0 = this.f35494h.c0(0L);
        if (bC0 == 116 || bC0 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bC0 == 102 || bC0 == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bC0 != 110 && bC0 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f35493g.request(i12)) {
                return 0;
            }
            byte bC1 = this.f35494h.c0(i11);
            if (bC1 != str.charAt(i11) && bC1 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f35493g.request(length + 1) && e1(this.f35494h.c0(length))) {
            return 0;
        }
        this.f35494h.skip(length);
        this.f35495i = i10;
        return i10;
    }

    private int k1() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f35493g.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bC0 = this.f35494h.c0(i11);
            i10 = 0;
            if (bC0 != 43) {
                if (bC0 == 69 || bC0 == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (bC0 != 45) {
                    if (bC0 != 46) {
                        if (bC0 < 48 || bC0 > 57) {
                            if (!e1(bC0)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bC0 - 48);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bC0 - 48));
                            z10 &= j11 > -922337203685477580L || (j11 == -922337203685477580L && j12 < j11);
                            j11 = j12;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return 0;
                        }
                        c10 = 3;
                    }
                } else if (c10 == 0) {
                    c10 = 1;
                    z11 = true;
                } else if (c10 != 5) {
                    return 0;
                }
                i11 = i12;
            } else if (c10 != 5) {
                return 0;
            }
            c10 = 6;
            i11 = i12;
        }
        if (c10 == 2 && z10 && ((j11 != Long.MIN_VALUE || z11) && (j11 != j10 || !z11))) {
            if (!z11) {
                j11 = -j11;
            }
            this.f35496j = j11;
            this.f35494h.skip(i11);
            this.f35495i = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f35497k = i11;
        this.f35495i = 17;
        return 17;
    }

    private char l1() throws EOFException, JsonEncodingException {
        int i10;
        if (!this.f35493g.request(1L)) {
            throw Y0("Unterminated escape sequence");
        }
        byte b10 = this.f35494h.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f35473e) {
                return (char) b10;
            }
            throw Y0("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f35493g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + w());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bC0 = this.f35494h.c0(i11);
            char c11 = (char) (c10 << 4);
            if (bC0 >= 48 && bC0 <= 57) {
                i10 = bC0 - 48;
            } else if (bC0 >= 97 && bC0 <= 102) {
                i10 = bC0 - 87;
            } else {
                if (bC0 < 65 || bC0 > 70) {
                    throw Y0("\\u" + this.f35494h.e0(4L));
                }
                i10 = bC0 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f35494h.skip(4L);
        return c10;
    }

    private void m1(xn.h hVar) throws EOFException, JsonEncodingException {
        while (true) {
            long jO0 = this.f35493g.o0(hVar);
            if (jO0 == -1) {
                throw Y0("Unterminated string");
            }
            if (this.f35494h.c0(jO0) != 92) {
                this.f35494h.skip(jO0 + 1);
                return;
            } else {
                this.f35494h.skip(jO0 + 1);
                l1();
            }
        }
    }

    private boolean n1() throws EOFException {
        xn.g gVar = this.f35493g;
        xn.h hVar = f35492q;
        long jX = gVar.X(hVar);
        boolean z10 = jX != -1;
        xn.e eVar = this.f35494h;
        eVar.skip(z10 ? jX + ((long) hVar.D()) : eVar.size());
        return z10;
    }

    private void o1() throws EOFException {
        long jO0 = this.f35493g.o0(f35491p);
        xn.e eVar = this.f35494h;
        eVar.skip(jO0 != -1 ? jO0 + 1 : eVar.size());
    }

    private void p1() throws EOFException {
        long jO0 = this.f35493g.o0(f35490o);
        xn.e eVar = this.f35494h;
        if (jO0 == -1) {
            jO0 = eVar.size();
        }
        eVar.skip(jO0);
    }

    @Override // com.squareup.moshi.i
    public void F0() {
        if (q()) {
            this.f35498l = f1();
            this.f35495i = 11;
        }
    }

    @Override // com.squareup.moshi.i
    public int N0(i.a aVar) throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 < 12 || iB1 > 15) {
            return -1;
        }
        if (iB1 == 15) {
            return c1(this.f35498l, aVar);
        }
        int iF = this.f35493g.f(aVar.f35476b);
        if (iF != -1) {
            this.f35495i = 0;
            this.f35471c[this.f35469a - 1] = aVar.f35475a[iF];
            return iF;
        }
        String str = this.f35471c[this.f35469a - 1];
        String strF1 = f1();
        int iC1 = c1(strF1, aVar);
        if (iC1 == -1) {
            this.f35495i = 15;
            this.f35498l = strF1;
            this.f35471c[this.f35469a - 1] = str;
        }
        return iC1;
    }

    @Override // com.squareup.moshi.i
    public int T0(i.a aVar) throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 < 8 || iB1 > 11) {
            return -1;
        }
        if (iB1 == 11) {
            return d1(this.f35498l, aVar);
        }
        int iF = this.f35493g.f(aVar.f35476b);
        if (iF != -1) {
            this.f35495i = 0;
            int[] iArr = this.f35472d;
            int i10 = this.f35469a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iF;
        }
        String strI0 = i0();
        int iD1 = d1(strI0, aVar);
        if (iD1 == -1) {
            this.f35495i = 11;
            this.f35498l = strI0;
            int[] iArr2 = this.f35472d;
            int i11 = this.f35469a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iD1;
    }

    @Override // com.squareup.moshi.i
    public void W0() throws EOFException, JsonEncodingException {
        if (this.f35474f) {
            i.b bVarP0 = p0();
            f1();
            throw new JsonDataException("Cannot skip unexpected " + bVarP0 + " at " + w());
        }
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 14) {
            p1();
        } else if (iB1 == 13) {
            m1(f35489n);
        } else if (iB1 == 12) {
            m1(f35488m);
        } else if (iB1 != 15) {
            throw new JsonDataException("Expected a name but was " + p0() + " at path " + w());
        }
        this.f35495i = 0;
        this.f35471c[this.f35469a - 1] = "null";
    }

    @Override // com.squareup.moshi.i
    public void X0() throws EOFException, JsonEncodingException {
        if (this.f35474f) {
            throw new JsonDataException("Cannot skip unexpected " + p0() + " at " + w());
        }
        int i10 = 0;
        do {
            int iB1 = this.f35495i;
            if (iB1 == 0) {
                iB1 = b1();
            }
            if (iB1 == 3) {
                K0(1);
            } else {
                if (iB1 == 1) {
                    K0(3);
                } else if (iB1 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + p0() + " at path " + w());
                    }
                    this.f35469a--;
                } else if (iB1 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + p0() + " at path " + w());
                    }
                    this.f35469a--;
                } else if (iB1 == 14 || iB1 == 10) {
                    p1();
                } else if (iB1 == 9 || iB1 == 13) {
                    m1(f35489n);
                } else if (iB1 == 8 || iB1 == 12) {
                    m1(f35488m);
                } else if (iB1 == 17) {
                    this.f35494h.skip(this.f35497k);
                } else if (iB1 == 18) {
                    throw new JsonDataException("Expected a value but was " + p0() + " at path " + w());
                }
                this.f35495i = 0;
            }
            i10++;
            this.f35495i = 0;
        } while (i10 != 0);
        int[] iArr = this.f35472d;
        int i11 = this.f35469a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f35471c[i11 - 1] = "null";
    }

    @Override // com.squareup.moshi.i
    public int c0() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 16) {
            long j10 = this.f35496j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f35495i = 0;
                int[] iArr = this.f35472d;
                int i11 = this.f35469a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f35496j + " at path " + w());
        }
        if (iB1 == 17) {
            this.f35498l = this.f35494h.e0(this.f35497k);
        } else if (iB1 == 9 || iB1 == 8) {
            String strH1 = iB1 == 9 ? h1(f35489n) : h1(f35488m);
            this.f35498l = strH1;
            try {
                int i12 = Integer.parseInt(strH1);
                this.f35495i = 0;
                int[] iArr2 = this.f35472d;
                int i13 = this.f35469a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iB1 != 11) {
            throw new JsonDataException("Expected an int but was " + p0() + " at path " + w());
        }
        this.f35495i = 11;
        try {
            double d10 = Double.parseDouble(this.f35498l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f35498l = null;
                this.f35495i = 0;
                int[] iArr3 = this.f35472d;
                int i15 = this.f35469a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f35498l + " at path " + w());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f35498l + " at path " + w());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f35495i = 0;
        this.f35470b[0] = 8;
        this.f35469a = 1;
        this.f35494h.k();
        this.f35493g.close();
    }

    @Override // com.squareup.moshi.i
    public void d() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 3) {
            K0(1);
            this.f35472d[this.f35469a - 1] = 0;
            this.f35495i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + p0() + " at path " + w());
        }
    }

    @Override // com.squareup.moshi.i
    public long d0() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 16) {
            this.f35495i = 0;
            int[] iArr = this.f35472d;
            int i10 = this.f35469a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f35496j;
        }
        if (iB1 == 17) {
            this.f35498l = this.f35494h.e0(this.f35497k);
        } else if (iB1 == 9 || iB1 == 8) {
            String strH1 = iB1 == 9 ? h1(f35489n) : h1(f35488m);
            this.f35498l = strH1;
            try {
                long j10 = Long.parseLong(strH1);
                this.f35495i = 0;
                int[] iArr2 = this.f35472d;
                int i11 = this.f35469a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iB1 != 11) {
            throw new JsonDataException("Expected a long but was " + p0() + " at path " + w());
        }
        this.f35495i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f35498l).longValueExact();
            this.f35498l = null;
            this.f35495i = 0;
            int[] iArr3 = this.f35472d;
            int i12 = this.f35469a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f35498l + " at path " + w());
        }
    }

    public String f1() throws EOFException, JsonEncodingException {
        String strH1;
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 14) {
            strH1 = i1();
        } else if (iB1 == 13) {
            strH1 = h1(f35489n);
        } else if (iB1 == 12) {
            strH1 = h1(f35488m);
        } else {
            if (iB1 != 15) {
                throw new JsonDataException("Expected a name but was " + p0() + " at path " + w());
            }
            strH1 = this.f35498l;
            this.f35498l = null;
        }
        this.f35495i = 0;
        this.f35471c[this.f35469a - 1] = strH1;
        return strH1;
    }

    @Override // com.squareup.moshi.i
    public Object g0() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 7) {
            this.f35495i = 0;
            int[] iArr = this.f35472d;
            int i10 = this.f35469a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + p0() + " at path " + w());
    }

    @Override // com.squareup.moshi.i
    public void h() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 1) {
            K0(3);
            this.f35495i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + p0() + " at path " + w());
    }

    @Override // com.squareup.moshi.i
    public String i0() throws EOFException, JsonEncodingException {
        String strE0;
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 10) {
            strE0 = i1();
        } else if (iB1 == 9) {
            strE0 = h1(f35489n);
        } else if (iB1 == 8) {
            strE0 = h1(f35488m);
        } else if (iB1 == 11) {
            strE0 = this.f35498l;
            this.f35498l = null;
        } else if (iB1 == 16) {
            strE0 = Long.toString(this.f35496j);
        } else {
            if (iB1 != 17) {
                throw new JsonDataException("Expected a string but was " + p0() + " at path " + w());
            }
            strE0 = this.f35494h.e0(this.f35497k);
        }
        this.f35495i = 0;
        int[] iArr = this.f35472d;
        int i10 = this.f35469a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strE0;
    }

    @Override // com.squareup.moshi.i
    public void k() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + p0() + " at path " + w());
        }
        int i10 = this.f35469a;
        this.f35469a = i10 - 1;
        int[] iArr = this.f35472d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f35495i = 0;
    }

    @Override // com.squareup.moshi.i
    public void l() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + p0() + " at path " + w());
        }
        int i10 = this.f35469a;
        int i11 = i10 - 1;
        this.f35469a = i11;
        this.f35471c[i11] = null;
        int[] iArr = this.f35472d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f35495i = 0;
    }

    @Override // com.squareup.moshi.i
    public i.b p0() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        switch (iB1) {
            case 1:
                return i.b.BEGIN_OBJECT;
            case 2:
                return i.b.END_OBJECT;
            case 3:
                return i.b.BEGIN_ARRAY;
            case 4:
                return i.b.END_ARRAY;
            case 5:
            case 6:
                return i.b.BOOLEAN;
            case 7:
                return i.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return i.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return i.b.NAME;
            case 16:
            case 17:
                return i.b.NUMBER;
            case 18:
                return i.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.i
    public boolean q() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        return (iB1 == 2 || iB1 == 4 || iB1 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.i
    public boolean s() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 5) {
            this.f35495i = 0;
            int[] iArr = this.f35472d;
            int i10 = this.f35469a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iB1 == 6) {
            this.f35495i = 0;
            int[] iArr2 = this.f35472d;
            int i11 = this.f35469a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + p0() + " at path " + w());
    }

    @Override // com.squareup.moshi.i
    public double t() throws EOFException, JsonEncodingException {
        int iB1 = this.f35495i;
        if (iB1 == 0) {
            iB1 = b1();
        }
        if (iB1 == 16) {
            this.f35495i = 0;
            int[] iArr = this.f35472d;
            int i10 = this.f35469a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f35496j;
        }
        if (iB1 == 17) {
            this.f35498l = this.f35494h.e0(this.f35497k);
        } else if (iB1 == 9) {
            this.f35498l = h1(f35489n);
        } else if (iB1 == 8) {
            this.f35498l = h1(f35488m);
        } else if (iB1 == 10) {
            this.f35498l = i1();
        } else if (iB1 != 11) {
            throw new JsonDataException("Expected a double but was " + p0() + " at path " + w());
        }
        this.f35495i = 11;
        try {
            double d10 = Double.parseDouble(this.f35498l);
            if (this.f35473e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f35498l = null;
                this.f35495i = 0;
                int[] iArr2 = this.f35472d;
                int i11 = this.f35469a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + w());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f35498l + " at path " + w());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f35493g + ")";
    }

    private int b1() throws EOFException, JsonEncodingException {
        int[] iArr = this.f35470b;
        int i10 = this.f35469a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iG1 = g1(true);
            this.f35494h.readByte();
            if (iG1 != 44) {
                if (iG1 != 59) {
                    if (iG1 != 93) {
                        throw Y0("Unterminated array");
                    }
                    this.f35495i = 4;
                    return 4;
                }
                a1();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iG2 = g1(true);
                    this.f35494h.readByte();
                    if (iG2 != 44) {
                        if (iG2 != 59) {
                            if (iG2 != 125) {
                                throw Y0("Unterminated object");
                            }
                            this.f35495i = 2;
                            return 2;
                        }
                        a1();
                    }
                }
                int iG3 = g1(true);
                if (iG3 == 34) {
                    this.f35494h.readByte();
                    this.f35495i = 13;
                    return 13;
                }
                if (iG3 == 39) {
                    this.f35494h.readByte();
                    a1();
                    this.f35495i = 12;
                    return 12;
                }
                if (iG3 != 125) {
                    a1();
                    if (!e1((char) iG3)) {
                        throw Y0("Expected name");
                    }
                    this.f35495i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw Y0("Expected name");
                }
                this.f35494h.readByte();
                this.f35495i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iG4 = g1(true);
                this.f35494h.readByte();
                if (iG4 != 58) {
                    if (iG4 != 61) {
                        throw Y0(FuoITeVPeXAj.EzvhO);
                    }
                    a1();
                    if (this.f35493g.request(1L) && this.f35494h.c0(0L) == 62) {
                        this.f35494h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (g1(false) == -1) {
                    this.f35495i = 18;
                    return 18;
                }
                a1();
            } else {
                if (i11 == 9) {
                    throw null;
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iG5 = g1(true);
        if (iG5 == 34) {
            this.f35494h.readByte();
            this.f35495i = 9;
            return 9;
        }
        if (iG5 == 39) {
            a1();
            this.f35494h.readByte();
            this.f35495i = 8;
            return 8;
        }
        if (iG5 != 44 && iG5 != 59) {
            if (iG5 == 91) {
                this.f35494h.readByte();
                this.f35495i = 3;
                return 3;
            }
            if (iG5 != 93) {
                if (iG5 == 123) {
                    this.f35494h.readByte();
                    this.f35495i = 1;
                    return 1;
                }
                int iJ1 = j1();
                if (iJ1 != 0) {
                    return iJ1;
                }
                int iK1 = k1();
                if (iK1 != 0) {
                    return iK1;
                }
                if (!e1(this.f35494h.c0(0L))) {
                    throw Y0("Expected value");
                }
                a1();
                this.f35495i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f35494h.readByte();
                this.f35495i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw Y0("Unexpected value");
        }
        a1();
        this.f35495i = 7;
        return 7;
    }
}
