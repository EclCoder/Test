package j$.time.format;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f41691f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.r f41692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f41695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41696e;

    public h(j$.time.temporal.r rVar, int i10, int i11, x xVar) {
        this.f41692a = rVar;
        this.f41693b = i10;
        this.f41694c = i11;
        this.f41695d = xVar;
        this.f41696e = 0;
    }

    public h(j$.time.temporal.r rVar, int i10, int i11, x xVar, int i12) {
        this.f41692a = rVar;
        this.f41693b = i10;
        this.f41694c = i11;
        this.f41695d = xVar;
        this.f41696e = i12;
    }

    public h b() {
        if (this.f41696e == -1) {
            return this;
        }
        return new h(this.f41692a, this.f41693b, this.f41694c, this.f41695d, -1);
    }

    public h c(int i10) {
        return new h(this.f41692a, this.f41693b, this.f41694c, this.f41695d, this.f41696e + i10);
    }

    @Override // j$.time.format.e
    public boolean s(r rVar, StringBuilder sb2) {
        j$.time.temporal.r rVar2 = this.f41692a;
        Long lA = rVar.a(rVar2);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        u uVar = rVar.f41729b.f41678c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i10 = this.f41694c;
        if (length > i10) {
            throw new j$.time.c("Field " + rVar2 + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i10);
        }
        uVar.getClass();
        int i11 = this.f41693b;
        x xVar = this.f41695d;
        if (jLongValue >= 0) {
            int i12 = b.f41683a[xVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jLongValue >= f41691f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = b.f41683a[xVar.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new j$.time.c("Field " + rVar2 + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public boolean a(p pVar) {
        int i10 = this.f41696e;
        if (i10 != -1) {
            return i10 > 0 && this.f41693b == this.f41694c && this.f41695d == x.NOT_NEGATIVE;
        }
        return true;
    }

    @Override // j$.time.format.e
    public int A(p pVar, CharSequence charSequence, int i10) {
        boolean z10;
        boolean z11;
        BigInteger bigIntegerAdd;
        boolean z12;
        boolean z13;
        int i11;
        long j10;
        int i12;
        int i13 = i10;
        int length = charSequence.length();
        if (i13 == length) {
            return ~i13;
        }
        char cCharAt = charSequence.charAt(i10);
        DateTimeFormatter dateTimeFormatter = pVar.f41720a;
        dateTimeFormatter.f41678c.getClass();
        int i14 = this.f41694c;
        x xVar = this.f41695d;
        int i15 = this.f41693b;
        int i16 = 0;
        boolean z14 = true;
        if (cCharAt == '+') {
            boolean z15 = pVar.f41722c;
            boolean z16 = i15 == i14;
            int iOrdinal = xVar.ordinal();
            if (iOrdinal == 0 ? z15 : !(iOrdinal == 1 || iOrdinal == 4 || (!z15 && !z16))) {
                return ~i13;
            }
            i13++;
            z10 = false;
            z11 = true;
        } else {
            dateTimeFormatter.f41678c.getClass();
            if (cCharAt == '-') {
                boolean z17 = pVar.f41722c;
                boolean z18 = i15 == i14;
                int iOrdinal2 = xVar.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z17 || z18)) {
                    return ~i13;
                }
                i13++;
                z11 = false;
                z10 = true;
            } else {
                if (xVar == x.ALWAYS && pVar.f41722c) {
                    return ~i13;
                }
                z10 = false;
                z11 = false;
            }
        }
        int i17 = (pVar.f41722c || a(pVar)) ? i15 : 1;
        int i18 = i13 + i17;
        if (i18 > length) {
            return ~i13;
        }
        if (!pVar.f41722c && !a(pVar)) {
            i14 = 9;
        }
        int i19 = this.f41696e;
        int iMax = Math.max(i19, 0) + i14;
        while (true) {
            bigIntegerAdd = null;
            if (i16 >= 2) {
                z12 = z10;
                z13 = z11;
                i11 = i13;
                j10 = 0;
                break;
            }
            int iMin = Math.min(i13 + iMax, length);
            boolean z19 = z14;
            long j11 = 0;
            int i20 = i13;
            while (true) {
                if (i20 >= iMin) {
                    i12 = length;
                    z12 = z10;
                    break;
                }
                int i21 = i20 + 1;
                char cCharAt2 = charSequence.charAt(i20);
                i12 = length;
                dateTimeFormatter.f41678c.getClass();
                int i22 = cCharAt2 - '0';
                z12 = z10;
                if (i22 < 0 || i22 > 9) {
                    i22 = -1;
                }
                if (i22 < 0) {
                    if (i20 >= i18) {
                        break;
                    }
                    return ~i13;
                }
                if (i21 - i13 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j11);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i22));
                } else {
                    j11 = (j11 * 10) + ((long) i22);
                }
                i20 = i21;
                z10 = z12;
                length = i12;
                dateTimeFormatter = dateTimeFormatter;
                z11 = z11;
            }
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            z13 = z11;
            if (i19 <= 0 || i16 != 0) {
                i11 = i20;
                j10 = j11;
                break;
            }
            int iMax2 = Math.max(i17, (i20 - i13) - i19);
            i16++;
            z14 = z19;
            z10 = z12;
            dateTimeFormatter = dateTimeFormatter2;
            z11 = z13;
            iMax = iMax2;
            length = i12;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z12) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && pVar.f41722c) {
                    return ~(i13 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j10 == 0 && pVar.f41722c) {
                    return ~(i13 - 1);
                }
                j10 = -j10;
            }
        } else if (xVar == x.EXCEEDS_PAD && pVar.f41722c) {
            int i23 = i11 - i13;
            if (z13) {
                if (i23 <= i15) {
                    return ~(i13 - 1);
                }
            } else if (i23 > i15) {
                return ~i13;
            }
        }
        if (bigIntegerDivide == null) {
            return pVar.f(this.f41692a, j10, i13, i11);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i11--;
        }
        return pVar.f(this.f41692a, bigIntegerDivide.longValue(), i13, i11);
    }

    public String toString() {
        int i10 = this.f41694c;
        j$.time.temporal.r rVar = this.f41692a;
        x xVar = this.f41695d;
        int i11 = this.f41693b;
        if (i11 == 1 && i10 == 19 && xVar == x.NORMAL) {
            return "Value(" + rVar + ")";
        }
        if (i11 == i10 && xVar == x.NOT_NEGATIVE) {
            return "Value(" + rVar + "," + i11 + ")";
        }
        return "Value(" + rVar + "," + i11 + "," + i10 + "," + xVar + ")";
    }
}
