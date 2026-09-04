package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41687g;

    @Override // j$.time.format.h, j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        boolean z10 = pVar.f41722c;
        DateTimeFormatter dateTimeFormatter = pVar.f41720a;
        int i11 = (z10 || a(pVar)) ? this.f41693b : 0;
        int i12 = (pVar.f41722c || a(pVar)) ? this.f41694c : 9;
        int length = charSequence.length();
        if (i10 != length) {
            if (this.f41687g) {
                char cCharAt = charSequence.charAt(i10);
                dateTimeFormatter.f41678c.getClass();
                if (cCharAt == '.') {
                    i10++;
                } else if (i11 > 0) {
                    return ~i10;
                }
            }
            int i13 = i10;
            int i14 = i11 + i13;
            if (i14 > length) {
                return ~i13;
            }
            int iMin = Math.min(i12 + i13, length);
            int i15 = 0;
            int i16 = i13;
            while (i16 < iMin) {
                int i17 = i16 + 1;
                char cCharAt2 = charSequence.charAt(i16);
                dateTimeFormatter.f41678c.getClass();
                int i18 = cCharAt2 - '0';
                if (i18 < 0 || i18 > 9) {
                    i18 = -1;
                }
                if (i18 < 0) {
                    if (i17 >= i14) {
                        break;
                    }
                    return ~i13;
                }
                i15 = (i15 * 10) + i18;
                i16 = i17;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
            j$.time.temporal.v vVarI = this.f41692a.I();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(vVarI.f41809a);
            return pVar.f(this.f41692a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(vVarI.f41812d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i13, i16);
        }
        if (i11 > 0) {
            return ~i10;
        }
        return i10;
    }

    @Override // j$.time.format.h
    public final boolean a(p pVar) {
        return pVar.f41722c && this.f41693b == this.f41694c && !this.f41687g;
    }

    public f(j$.time.temporal.r rVar) {
        this(rVar, 0, 9, true, 0);
        Objects.requireNonNull(rVar, "field");
        j$.time.temporal.v vVarI = rVar.I();
        if (vVarI.f41809a != vVarI.f41810b || vVarI.f41811c != vVarI.f41812d) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", rVar));
        }
    }

    public f(j$.time.temporal.r rVar, int i10, int i11, boolean z10, int i12) {
        super(rVar, i10, i11, x.NOT_NEGATIVE, i12);
        this.f41687g = z10;
    }

    @Override // j$.time.format.h
    public final h b() {
        if (this.f41696e == -1) {
            return this;
        }
        return new f(this.f41692a, this.f41693b, this.f41694c, this.f41687g, -1);
    }

    @Override // j$.time.format.h
    public final h c(int i10) {
        return new f(this.f41692a, this.f41693b, this.f41694c, this.f41687g, this.f41696e + i10);
    }

    @Override // j$.time.format.h, j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        j$.time.temporal.r rVar2 = this.f41692a;
        Long lA = rVar.a(rVar2);
        if (lA == null) {
            return false;
        }
        u uVar = rVar.f41729b.f41678c;
        long jLongValue = lA.longValue();
        j$.time.temporal.v vVarI = rVar2.I();
        vVarI.b(jLongValue, rVar2);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(vVarI.f41809a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(vVarI.f41812d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.f41687g;
        int i10 = this.f41693b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f41694c), roundingMode).toPlainString().substring(2);
            uVar.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 > 0) {
            if (z10) {
                uVar.getClass();
                sb2.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                uVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.h
    public final String toString() {
        return "Fraction(" + this.f41692a + "," + this.f41693b + "," + this.f41694c + (this.f41687g ? ",DecimalPoint" : "") + ")";
    }
}
