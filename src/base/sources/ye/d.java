package ye;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int f(CharSequence charSequence, int i10, int i11) {
        a aVarG;
        a aVarG2;
        char cCharAt;
        a aVarG3 = g(charSequence, i10);
        a aVar = a.ONE_DIGIT;
        if (aVarG3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (aVarG3 == aVar2) {
            return (i10 >= charSequence.length() || ((cCharAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 != 100) {
            if (aVarG3 == a.FNC_1) {
                aVarG3 = g(charSequence, i10 + 1);
            }
            return aVarG3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (aVarG3 == aVar3 || (aVarG = g(charSequence, i10 + 2)) == aVar2 || aVarG == aVar) {
            return 100;
        }
        if (aVarG == aVar3) {
            return g(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i12 = i10 + 4;
        while (true) {
            aVarG2 = g(charSequence, i12);
            if (aVarG2 != a.TWO_DIGITS) {
                break;
            }
            i12 += 2;
        }
        return aVarG2 == a.ONE_DIGIT ? 100 : 99;
    }

    private static a g(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i11);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // ye.n, com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.CODE_128) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    @Override // ye.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iB = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                    }
                    break;
                    break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            int i15 = 103;
            if (i11 >= length) {
                int[][] iArr = c.f57510a;
                arrayList.add(iArr[i12 % 103]);
                arrayList.add(iArr[106]);
                int size = arrayList.size();
                int i16 = 0;
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    for (int i18 : (int[]) obj) {
                        i16 += i18;
                    }
                }
                boolean[] zArr = new boolean[i16];
                int size2 = arrayList.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj2 = arrayList.get(i19);
                    i19++;
                    iB += n.b(zArr, iB, (int[]) obj2, true);
                }
                return zArr;
            }
            int iF = f(str, i11, i13);
            int iCharAt = 100;
            if (iF == i13) {
                switch (str.charAt(i11)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i13 == 101) {
                            iCharAt = 101;
                        }
                        break;
                    default:
                        if (i13 == 100) {
                            iCharAt = str.charAt(i11) - ' ';
                        } else if (i13 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i11, i11 + 2));
                            i11++;
                        } else {
                            char cCharAt2 = str.charAt(i11);
                            iCharAt = cCharAt2 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt2 + '@';
                            }
                        }
                        break;
                }
                i11++;
            } else {
                if (i13 != 0) {
                    i15 = iF;
                } else if (iF == 100) {
                    i15 = 104;
                } else if (iF != 101) {
                    i15 = 105;
                }
                iCharAt = i15;
                i13 = iF;
            }
            arrayList.add(c.f57510a[iCharAt]);
            i12 += iCharAt * i14;
            if (i11 != 0) {
                i14++;
            }
        }
    }
}
