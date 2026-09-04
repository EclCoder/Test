package com.facebook.ads.redexgen.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class KO {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static KM A00(KM km2, Map<String, KT> map) {
        while (km2 != null) {
            KT ktA02 = A02(km2.A04, km2.A0H(), map);
            if (ktA02 != null && ktA02.A09() == 1) {
                return km2;
            }
            km2 = km2.A03;
        }
        return null;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, 64, 88, 86, 93, 93, 86, 91, 84, 13, 95, 98, 79, 102, 65, 82, 101, 97, 13, 91, 92, 81, 82, 13, 100, 86, 97, 85, 92, 98, 97, 13, 82, 101, 78, 80, 97, 89, 102, 13, 92, 91, 82, 13, 97, 82, 101, 97, 13, 80, 85, 86, 89, 81, 27, -10, 22, 15, 14, -12, 7, 16, 6, 7, 20, -9, 22, 11, 14, 73, 14, -9, 74, 102, 30, 48, -6, -5, 75, 25};
    }

    static {
        A05();
    }

    public static KM A01(KM km2, Map<String, KT> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(km2);
        while (!arrayDeque.isEmpty()) {
            KM km3 = (KM) arrayDeque.pop();
            KT kt = km3.A04;
            String[] strArrA0H = km3.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            KT ktA02 = A02(kt, strArrA0H, map);
            if (ktA02 != null && ktA02.A09() == 3) {
                return km3;
            }
            for (int iA0C = km3.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(km3.A0D(iA0C));
            }
        }
        return null;
    }

    public static KT A02(KT kt, String[] strArr, Map<String, KT> map) {
        int i10 = 0;
        if (kt == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                KT kt2 = new KT();
                int length = strArr.length;
                while (i10 < length) {
                    kt2.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return kt2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return kt.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i10 < length3) {
                        KT kt3 = map.get(strArr[i10]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        kt.A0O(kt3);
                        i10++;
                    }
                    return kt;
                }
            }
        }
        return kt;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA04 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA04);
        String out = A03(4, 5, 69);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA04);
        String strA05 = A03(3, 1, 6);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA04, strA05);
        String out2 = A03(77, 11, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
        return strReplaceAll3.replaceAll(out2, strA05);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    public static void A06(Spannable spannable, int i10, int i11, KT kt, KM km2, Map<String, KT> map, int i12) {
        KM kmA01;
        KT ktA02;
        int i13;
        int i14;
        int i15;
        if (kt.A0A() != -1) {
            spannable.setSpan(new StyleSpan(kt.A0A()), i10, i11, 33);
        }
        if (kt.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (kt.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (kt.A0a()) {
            AbstractC09773t.A00(spannable, new ForegroundColorSpan(kt.A06()), i10, i11, 33);
        }
        boolean zA0Z = kt.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (zA0Z) {
                AbstractC09773t.A00(spannable, new BackgroundColorSpan(kt.A05()), i10, i11, 33);
            }
            if (kt.A0W() != null) {
                AbstractC09773t.A00(spannable, new TypefaceSpan(kt.A0W()), i10, i11, 33);
            }
            if (kt.A0D() != null) {
                KI ki2 = (KI) AbstractC09823y.A01(kt.A0D());
                if (ki2.A01 == -1) {
                    String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        if (i12 == 2 || i12 == 1) {
                            i13 = 3;
                        } else {
                            i13 = 1;
                        }
                        i14 = 1;
                    }
                } else {
                    i13 = ki2.A01;
                    i14 = ki2.A00;
                }
                if (ki2.A02 == -2) {
                    i15 = 1;
                } else {
                    i15 = ki2.A02;
                }
                AbstractC09773t.A00(spannable, new C2703pO(i13, i14, i15), i10, i11, 33);
            }
            switch (kt.A09()) {
                case 2:
                    KM kmA00 = A00(km2, map);
                    if (kmA00 != null && (kmA01 = A01(kmA00, map)) != null) {
                        if (kmA01.A0C() != 1) {
                            AbstractC09904g.A06(A03(63, 14, 47), A03(9, 54, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE));
                        } else {
                            KM containerNode = kmA01.A0D(0);
                            if (containerNode.A08 != null) {
                                KM containerNode2 = kmA01.A0D(0);
                                String str = (String) C5C.A0f(containerNode2.A08);
                                KT ktA03 = A02(kmA01.A04, kmA01.A0H(), map);
                                int iA08 = ktA03 != null ? ktA03.A08() : -1;
                                if (iA08 == -1 && (ktA02 = A02(kmA00.A04, kmA00.A0H(), map)) != null) {
                                    iA08 = ktA02.A08();
                                }
                                spannable.setSpan(new C2704pP(str, iA08), i10, i11, 33);
                            } else {
                                AbstractC09904g.A06(A03(63, 14, 47), A03(9, 54, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE));
                            }
                        }
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new KF(), i10, i11, 33);
                    break;
            }
            if (kt.A0Y()) {
                AbstractC09773t.A00(spannable, new C2705pQ(), i10, i11, 33);
            }
            switch (kt.A07()) {
                case 1:
                    AbstractC09773t.A00(spannable, new AbsoluteSizeSpan((int) kt.A03(), true), i10, i11, 33);
                    return;
                case 2:
                    AbstractC09773t.A00(spannable, new RelativeSizeSpan(kt.A03()), i10, i11, 33);
                    return;
                case 3:
                    AbstractC09773t.A00(spannable, new RelativeSizeSpan(kt.A03() / 100.0f), i10, i11, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
