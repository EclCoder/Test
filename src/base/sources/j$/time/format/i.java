package j$.time.format;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f41697d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f41698e = new i("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f41699f = new i("+HH:MM:ss", MBridgeConstans.ENDCARD_URL_TYPE_PL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41702c;

    public i(String str, String str2) {
        for (int i10 = 0; i10 < 22; i10++) {
            if (f41697d[i10].equals(str)) {
                this.f41701b = i10;
                this.f41702c = i10 % 11;
                this.f41700a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        Long lA = rVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.f41700a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : "+");
        if (this.f41701b < 11 || iAbs >= 10) {
            a(false, iAbs, sb2);
        } else {
            sb2.append((char) (iAbs + 48));
        }
        int i10 = this.f41702c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
            a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z10 = true;
                }
                a(z10, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z10, int i10, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    @Override // j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        CharSequence charSequence2;
        int i11;
        int i12;
        int i13;
        int i14;
        int length = charSequence.length();
        int length2 = this.f41700a.length();
        if (length2 == 0) {
            if (i10 == length) {
                return pVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10);
            }
            charSequence2 = charSequence;
        } else {
            if (i10 == length) {
                return ~i10;
            }
            charSequence2 = charSequence;
            if (pVar.g(charSequence2, i10, this.f41700a, 0, length2)) {
                return pVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            int i15 = cCharAt == '-' ? -1 : 1;
            int i16 = this.f41702c;
            boolean z10 = i16 > 0 && i16 % 2 == 0;
            int i17 = this.f41701b;
            boolean z11 = i17 < 11;
            int[] iArr = new int[4];
            iArr[0] = i10 + 1;
            if (!pVar.f41722c) {
                if (z11) {
                    if (z10 || (i17 == 0 && length > (i14 = i10 + 3) && charSequence2.charAt(i14) == ':')) {
                        i17 = 10;
                        z10 = true;
                    } else {
                        i17 = 9;
                    }
                } else if (z10 || (i17 == 11 && length > (i13 = i10 + 3) && (charSequence2.charAt(i10 + 2) == ':' || charSequence2.charAt(i13) == ':'))) {
                    i17 = 21;
                    z10 = true;
                } else {
                    i17 = 20;
                }
            }
            switch (i17) {
                case 0:
                case 11:
                    c(charSequence2, z11, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z11, iArr);
                    d(charSequence2, z10, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z11, iArr);
                    d(charSequence2, z10, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z11, iArr);
                    d(charSequence2, z10, true, iArr);
                    b(charSequence2, z10, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z11, iArr);
                    d(charSequence2, z10, true, iArr);
                    if (!b(charSequence2, z10, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z11, iArr);
                    if (b(charSequence2, z10, 2, iArr)) {
                        b(charSequence2, z10, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i18 = iArr[0];
            if (i18 > 0) {
                int i19 = iArr[1];
                if (i19 > 23 || (i11 = iArr[2]) > 59 || (i12 = iArr[3]) > 59) {
                    throw new j$.time.c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return pVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i11) * 60) + (((long) i19) * 3600) + ((long) i12)) * ((long) i15), i10, i18);
            }
        }
        return length2 == 0 ? pVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10) : ~i10;
    }

    public static void c(CharSequence charSequence, boolean z10, int[] iArr) {
        if (z10) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
        if (b(charSequence, z10, 2, iArr) || !z11) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public static boolean b(CharSequence charSequence, boolean z10, int i10, int[] iArr) {
        int i11;
        char cCharAt;
        char cCharAt2;
        int i12;
        int i13 = iArr[0];
        if (i13 < 0) {
            return true;
        }
        if (z10 && i10 != 1) {
            int i14 = i13 + 1;
            if (i14 <= charSequence.length() && charSequence.charAt(i13) == ':') {
                i13 = i14;
                i11 = i13 + 2;
                if (i11 <= charSequence.length()) {
                    int i15 = i13 + 1;
                    cCharAt = charSequence.charAt(i13);
                    cCharAt2 = charSequence.charAt(i15);
                    if (cCharAt >= '0') {
                        i12 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i12 >= 0) {
                            iArr[i10] = i12;
                            iArr[0] = i11;
                            return true;
                        }
                    }
                }
            }
        } else {
            i11 = i13 + 2;
            if (i11 <= charSequence.length()) {
                int i16 = i13 + 1;
                cCharAt = charSequence.charAt(i13);
                cCharAt2 = charSequence.charAt(i16);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i12 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i12 >= 0 && i12 <= 59) {
                        iArr[i10] = i12;
                        iArr[0] = i11;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void e(CharSequence charSequence, int i10, int i11, int[] iArr) {
        int i12;
        char cCharAt;
        int i13 = iArr[0];
        char[] cArr = new char[i11];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i13)) >= '0' && cCharAt <= '9') {
            cArr[i14] = cCharAt;
            i15++;
            i14++;
            i13 = i12;
        }
        if (i15 < i10) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i15) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i13;
    }

    public final String toString() {
        String strReplace = this.f41700a.replace("'", "''");
        return "Offset(" + f41697d[this.f41701b] + ",'" + strReplace + "')";
    }
}
