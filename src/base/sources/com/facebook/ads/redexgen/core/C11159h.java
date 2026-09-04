package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11159h extends AbstractC2569nD {
    public static byte[] A07;
    public static String[] A08 = {"yr7s5jzv1addyUjDczkFmKgb3TbXTjPI", "k5bxDF12X7IfueMvpCyLhsS14secbcRr", "A1nn9z9SPvnfAziOnMuSk0GZzxZ0jVfY", "Bn8GSVMc2Ww3cTp6j1ZQIVGuo4fvIYJ3", "KOSGSA", "kbDMqlVGuQuF7sZpY9G1V32bVqx23m", "bfxskyCfRQ3e5JfVyMYK1TBq", "KPf5jweXKATwb3ocWNu711OjnnCWcsTU"};
    public static final AbstractC2760qK<Integer> A09;
    public static final AbstractC2760qK<Integer> A0A;
    public C2764qQ A00;
    public C11169i A01;
    public C1230Ef A02;
    public final Context A03;
    public final InterfaceC1237Em A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    private <T extends AbstractC1232Eh<T>> Pair<C1236El, Integer> A0A(int i10, C1239Eo c1239Eo, int[][][] iArr, InterfaceC1231Eg<T> interfaceC1231Eg, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int iA02 = c1239Eo.A02();
        for (int i11 = 0; i11 < iA02; i11++) {
            if (i10 == c1239Eo.A03(i11)) {
                C2588nW c2588nWA07 = c1239Eo.A07(i11);
                for (int i12 = 0; i12 < c2588nWA07.A01; i12++) {
                    C2721pg c2721pgA05 = c2588nWA07.A05(i12);
                    List<T> listA5F = interfaceC1231Eg.A5F(i11, c2721pgA05, iArr[i11][i12]);
                    boolean[] zArr = new boolean[c2721pgA05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        int i14 = c2721pgA05.A01;
                        if (A08[4].length() != 6) {
                            throw new RuntimeException();
                        }
                        A08[7] = "GGTbcpljDMs4NAqJNauGpoXnSvHOQ6AN";
                        if (i13 < i14) {
                            T t10 = listA5F.get(i13);
                            int iA08 = t10.A08();
                            if (!zArr[i13] && iA08 != 0) {
                                if (iA08 == 1) {
                                    arrayList = BP.A04(t10);
                                    arrayList3.add(t10);
                                } else {
                                    arrayList = new ArrayList();
                                    arrayList.add(t10);
                                    int i15 = i13 + 1;
                                    while (i15 < c2721pgA05.A01) {
                                        T t11 = listA5F.get(i15);
                                        if (t11.A08() == 2 && t10.A09(t11)) {
                                            arrayList.add(t11);
                                            zArr[i15] = true;
                                        }
                                        i15++;
                                        if (A08[1].charAt(16) == 'p') {
                                            A08[7] = "CPvHWQWYEszLaRsxiIiXKw3X1jOClslA";
                                        }
                                    }
                                }
                                arrayList4.add(arrayList);
                            }
                            i13++;
                        }
                    }
                    if (this.A01.A0A && !arrayList3.isEmpty() && arrayList3.size() == c2721pgA05.A01) {
                        arrayList4.clear();
                        if (A08[1].charAt(16) != 'p') {
                            A08[4] = "67hsDi";
                            arrayList4.add(arrayList3);
                        } else {
                            A08[4] = "yJ8LwG";
                            arrayList4.add(arrayList3);
                        }
                    }
                    arrayList2.addAll(arrayList4);
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        if (A08[1].charAt(16) != 'p') {
            throw new RuntimeException();
        }
        A08[4] = "ji0WxR";
        if (zIsEmpty) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((AbstractC1232Eh) list.get(i16)).A01;
        }
        AbstractC1232Eh abstractC1232Eh = (AbstractC1232Eh) list.get(0);
        return Pair.create(new C1236El(abstractC1232Eh.A03, iArr2), Integer.valueOf(abstractC1232Eh.A00));
    }

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[5].length() == 27) {
                throw new RuntimeException();
            }
            A08[4] = "58VoVy";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 10);
            i13++;
        }
    }

    public static void A0M() {
        A07 = new byte[]{91, 92, -112, 127, -124, -118, 59, 126, -125, 124, -119, -119, -128, -121, 59, 126, -118, -112, -119, -113, 59, 126, -118, -119, -114, -113, -115, 124, -124, -119, -113, -114, 59, 126, 124, -119, -119, -118, -113, 59, 125, -128, 59, 124, -117, -117, -121, -124, -128, 127, 59, -110, -124, -113, -125, -118, -112, -113, 59, -115, -128, -127, -128, -115, -128, -119, 126, -128, 59, -113, -118, 59, 94, -118, -119, -113, -128, -109, -113, 73, 59, 93, -112, -124, -121, 127, 59, -113, -125, -128, 59, -113, -115, 124, 126, -122, 59, -114, -128, -121, -128, 126, -113, -118, -115, 59, -124, -119, -114, -113, 124, -119, 126, -128, 59, -110, -124, -113, -125, 59, -118, -119, -128, 59, -118, -127, 59, -113, -125, -128, 59, -119, -118, -119, 72, 127, -128, -117, -115, -128, 126, 124, -113, -128, 127, 59, 126, -118, -119, -114, -113, -115, -112, 126, -113, -118, -115, -114, 59, -113, -125, 124, -113, 59, -113, 124, -122, -128, 59, 124, 59, 94, -118, -119, -113, -128, -109, -113, 59, 124, -115, -126, -112, -120, -128, -119, -113, 73, -103, -70, -69, -74, -54, -63, -55, -87, -57, -74, -72, -64, -88, -70, -63, -70, -72, -55, -60, -57, -57, -37, -54, -49, -43, -107, -57, -55, -103, -83, -63, -80, -75, -69, 123, -83, -81, -128, -49, -29, -46, -41, -35, -99, -45, -49, -47, -95, -70, -50, -67, -62, -56, -120, -66, -70, -68, -116, -122, -61, -56, -68, -54, -61, -71, -119, 124, 119, 120, -126, 66, 116, -119, 67, 68, -98, -111, -116, -115, -105, 87, -119, -98, -117, -33, -46, -51, -50, -40, -104, -51, -40, -43, -53, -30, -106, -33, -46, -36, -46, -40, -41, -92, -105, -110, -109, -99, 93, -106, -109, -92, -111, -11, -24, -29, -28, -18, -82, -9, -84, -11, -19, -29, -83, -18, -19, -79, -83, -11, -17, -72};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C2588nW c2588nW, C2717pc c2717pc, Map<Integer, C2719pe> map) {
        C2719pe c2719pe;
        for (int i10 = 0; i10 < c2588nW.A01; i10++) {
            C2719pe c2719pe2 = c2717pc.A0G.get(c2588nW.A05(i10));
            if (c2719pe2 != null && ((c2719pe = map.get(Integer.valueOf(c2719pe2.A01()))) == null || (c2719pe.A01.isEmpty() && !c2719pe2.A01.isEmpty()))) {
                map.put(Integer.valueOf(c2719pe2.A01()), c2719pe2);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC2760qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.EZ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11159h.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC2760qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Ea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11159h.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C11159h() {
        this(C11169i.A0J, new C2583nR());
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C11159h(InterfaceC1237Em interfaceC1237Em) {
        this(C11169i.A0J, interfaceC1237Em);
    }

    @Deprecated
    public C11159h(C2717pc c2717pc, InterfaceC1237Em interfaceC1237Em) {
        this(c2717pc, interfaceC1237Em, null);
    }

    public C11159h(C2717pc c2717pc, InterfaceC1237Em interfaceC1237Em, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC1237Em;
        if (c2717pc instanceof C11169i) {
            this.A01 = (C11169i) c2717pc;
        } else {
            C11169i defaultParameters = context == null ? C11169i.A0J : C11169i.A02(context);
            this.A01 = defaultParameters.A0P().A0u(c2717pc).A0p();
        }
        this.A00 = C2764qQ.A07;
        this.A06 = context != null && C5C.A18(context);
        if (!this.A06 && context != null && C5C.A02 >= 32) {
            this.A02 = C1230Ef.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC09904g.A07(A0J(188, 20, 75), A0J(1, 187, 17));
        }
    }

    public static int A00(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int A02(C2758qI c2758qI, String str, boolean z10) {
        String strA0K;
        if (TextUtils.isEmpty(str)) {
            String strA0K2 = A0K(str);
            strA0K = A0K(c2758qI.A0V);
            if (strA0K != null) {
            }
            if (z10) {
                return 0;
            }
        }
        String str2 = c2758qI.A0V;
        String[] strArr = A08;
        if (strArr[6].length() != strArr[3].length()) {
            A08[7] = "utaRfuDCbQDIc6IM3a2tNPgwwhECnGgZ";
            if (str.equals(str2)) {
                if (A08[4].length() != 6) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "bdPum8qTTDlHeCQDHcvgSGFt";
                strArr2[3] = "zx28NE7Z14W3AzzAuoWnzSjL1M2eUdTs";
                return 4;
            }
            String strA0K3 = A0K(str);
            strA0K = A0K(c2758qI.A0V);
            if (strA0K != null || strA0K3 == null) {
                return (z10 && strA0K == null) ? 1 : 0;
            }
            if (strA0K.startsWith(strA0K3) || strA0K3.startsWith(strA0K)) {
                return 3;
            }
            String strA0J = A0J(0, 1, 36);
            String str3 = C5C.A1P(strA0K, strA0J)[0];
            String formatMainLanguage = C5C.A1P(strA0K3, strA0J)[0];
            String[] strArr3 = A08;
            String str4 = strArr3[6];
            String formatLanguage = strArr3[3];
            if (str4.length() != formatLanguage.length()) {
                A08[4] = "rXSrCW";
                if (!str3.equals(formatMainLanguage)) {
                    return 0;
                }
                return 2;
            }
        }
        throw new RuntimeException();
    }

    public static int A03(C2721pg c2721pg, int i10, int i11, boolean z10) {
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i12 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < maxVideoPixelsToRetain; videoPixels++) {
            C2758qI c2758qIA08 = c2721pg.A08(videoPixels);
            int maxVideoPixelsToRetain = c2758qIA08.A0L;
            if (maxVideoPixelsToRetain > 0) {
                int maxVideoPixelsToRetain2 = c2758qIA08.A0A;
                if (maxVideoPixelsToRetain2 > 0) {
                    int i13 = c2758qIA08.A0L;
                    int maxVideoPixelsToRetain3 = c2758qIA08.A0A;
                    Point pointA09 = A09(z10, i10, i11, i13, maxVideoPixelsToRetain3);
                    int i14 = c2758qIA08.A0L;
                    int maxVideoPixelsToRetain4 = c2758qIA08.A0A;
                    int i15 = i14 * maxVideoPixelsToRetain4;
                    int i16 = c2758qIA08.A0L;
                    int maxVideoPixelsToRetain5 = pointA09.x;
                    if (i16 >= ((int) (maxVideoPixelsToRetain5 * 0.98f))) {
                        int i17 = c2758qIA08.A0A;
                        int maxVideoPixelsToRetain6 = pointA09.y;
                        if (i17 >= ((int) (maxVideoPixelsToRetain6 * 0.98f)) && i15 < i12) {
                            i12 = i15;
                        }
                    }
                }
            }
        }
        return i12;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (A08[4].length() != 6) {
            throw new RuntimeException();
        }
        A08[1] = "gB7bm57sTKDjvfC8pNahT9wGVNX6TDKL";
        return iIntValue - iIntValue2;
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    public static int A07(String str) {
        byte b10;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(A0J(272, 18, 95))) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case -1662735862:
                String[] strArr = A08;
                if (strArr[6].length() != strArr[3].length()) {
                    A08[1] = "cKYBOGEqW486lDdcpu93NQ9TicEen6vk";
                    if (str.equals(A0J(253, 10, 9))) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    switch (b10) {
                        case 0:
                            return 5;
                        case 1:
                            return 4;
                        case 2:
                            return 3;
                        case 3:
                            return 2;
                        case 4:
                            return 1;
                        default:
                            return 0;
                    }
                }
                throw new RuntimeException();
            case -1662541442:
                if (str.equals(A0J(290, 10, 36))) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case 1331836730:
                if (str.equals(A0J(263, 9, 30))) {
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case 1599127257:
                if (str.equals(A0J(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 19, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE))) {
                    b10 = 3;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            default:
                b10 = -1;
                switch (b10) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        if (i11 * i10 >= i12 * tempViewportWidth) {
            return new Point(tempViewportWidth, C5C.A05(tempViewportWidth * i12, i11));
        }
        return new Point(C5C.A05(i10 * i11, i12), i10);
    }

    private final Pair<C1236El, Integer> A0B(C1239Eo c1239Eo, int[][][] iArr, final C11169i c11169i, final String str) throws AD {
        return A0A(3, c1239Eo, iArr, new InterfaceC1231Eg() { // from class: com.facebook.ads.redexgen.X.nN
            @Override // com.facebook.ads.redexgen.core.InterfaceC1231Eg
            public final List A5F(int i10, C2721pg c2721pg, int[] iArr2) {
                return C2572nG.A02(i10, c2721pg, c11169i, iArr2, str);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EY
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2572nG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1236El, Integer> A0C(C1239Eo c1239Eo, int[][][] iArr, int[] iArr2, final C11169i c11169i) throws AD {
        final boolean z10 = false;
        for (int i10 = 0; i10 < c1239Eo.A02(); i10++) {
            if (2 == c1239Eo.A03(i10) && c1239Eo.A07(i10).A01 > 0) {
                z10 = true;
                break;
            }
        }
        return A0A(1, c1239Eo, iArr, new InterfaceC1231Eg() { // from class: com.facebook.ads.redexgen.X.nO
            @Override // com.facebook.ads.redexgen.core.InterfaceC1231Eg
            public final List A5F(int i11, C2721pg c2721pg, int[] iArr3) {
                return this.A01.A0e(c11169i, z10, i11, c2721pg, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2578nM.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1236El, Integer> A0D(C1239Eo c1239Eo, int[][][] iArr, final int[] iArr2, final C11169i c11169i, final String str) throws AD {
        return A0A(2, c1239Eo, iArr, new InterfaceC1231Eg() { // from class: com.facebook.ads.redexgen.X.nQ
            @Override // com.facebook.ads.redexgen.core.InterfaceC1231Eg
            public final List A5F(int i10, C2721pg c2721pg, int[] iArr3) {
                return C2571nF.A06(i10, c2721pg, c11169i, iArr3, str, iArr2[i10]);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EW
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2571nF.A05((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    private final C1236El A0E(int i10, C2588nW c2588nW, int[][] iArr, C11169i c11169i) throws AD {
        C2721pg c2721pg = null;
        int i11 = 0;
        C1227Ec c1227Ec = null;
        for (int i12 = 0; i12 < c2588nW.A01; i12++) {
            C2721pg trackGroup = c2588nW.A05(i12);
            int[] iArr2 = iArr[i12];
            int groupIndex = 0;
            while (true) {
                int i13 = trackGroup.A01;
                int selectedTrackIndex = A08[7].charAt(4);
                if (selectedTrackIndex != 114) {
                    A08[7] = "eXe48tlcaaFOVphj3tBJsJZ33XViaUIe";
                    if (groupIndex < i13) {
                        int i14 = iArr2[groupIndex];
                        int selectedTrackIndex2 = A08[7].charAt(4);
                        if (selectedTrackIndex2 == 114) {
                            throw new RuntimeException();
                        }
                        A08[7] = "FFBXZuvHsKfXoft1igGzNsuMgLJqlaBK";
                        if (A0S(i14, c11169i.A0B)) {
                            C1227Ec trackScore = new C1227Ec(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                            if (c1227Ec != null) {
                                int iA00 = trackScore.compareTo(c1227Ec);
                                String[] strArr = A08;
                                String str = strArr[0];
                                String str2 = strArr[2];
                                int selectedTrackIndex3 = str.charAt(9);
                                if (selectedTrackIndex3 != str2.charAt(9)) {
                                    A08[1] = "us6BKPnONaHSk6j2pgBHNNPTLKUclzqr";
                                    if (iA00 > 0) {
                                        c2721pg = trackGroup;
                                        i11 = groupIndex;
                                        c1227Ec = trackScore;
                                    }
                                }
                            } else {
                                c2721pg = trackGroup;
                                i11 = groupIndex;
                                c1227Ec = trackScore;
                            }
                        }
                        groupIndex++;
                    }
                }
                throw new RuntimeException();
            }
        }
        if (c2721pg == null) {
            return null;
        }
        return new C1236El(c2721pg, i11);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(250, 3, 75))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z10;
        synchronized (this.A05) {
            z10 = this.A01.A08 && !this.A06 && C5C.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z10) {
            A01();
        }
    }

    public static void A0P(C1239Eo c1239Eo, C2717pc c2717pc, C1236El[] c1236ElArr) {
        C1236El c1236El;
        int iA02 = c1239Eo.A02();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iA02; i10++) {
            A0N(c1239Eo.A07(i10), c2717pc, map);
        }
        A0N(c1239Eo.A06(), c2717pc, map);
        for (int i11 = 0; i11 < iA02; i11++) {
            int rendererCount = c1239Eo.A03(i11);
            C2719pe c2719pe = (C2719pe) map.get(Integer.valueOf(rendererCount));
            if (c2719pe != null) {
                boolean zIsEmpty = c2719pe.A01.isEmpty();
                if (A08[7].charAt(4) == 'r') {
                    throw new RuntimeException();
                }
                A08[4] = "YbaSeo";
                if (!zIsEmpty && c1239Eo.A07(i11).A04(c2719pe.A00) != -1) {
                    c1236El = new C1236El(c2719pe.A00, AbstractC1142As.A0B(c2719pe.A01));
                } else {
                    c1236El = null;
                }
                c1236ElArr[i11] = c1236El;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    public static void A0Q(C1239Eo c1239Eo, C11169i c11169i, C1236El[] c1236ElArr) {
        C1236El c1236El;
        int iA02 = c1239Eo.A02();
        for (int i10 = 0; i10 < iA02; i10++) {
            C2588nW c2588nWA07 = c1239Eo.A07(i10);
            if (c11169i.A0S(i10, c2588nWA07)) {
                C2573nH c2573nHA0Q = c11169i.A0Q(i10, c2588nWA07);
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[3];
                int rendererIndex = str.length();
                int rendererCount = str2.length();
                if (rendererIndex == rendererCount) {
                    throw new RuntimeException();
                }
                A08[5] = "K8f1XF422sl3cXXm";
                if (c2573nHA0Q != null) {
                    int length = c2573nHA0Q.A03.length;
                    String[] strArr2 = A08;
                    String str3 = strArr2[6];
                    String str4 = strArr2[3];
                    int rendererIndex2 = str3.length();
                    int rendererCount2 = str4.length();
                    if (rendererIndex2 == rendererCount2) {
                        throw new RuntimeException();
                    }
                    A08[4] = "KnBpd5";
                    if (length != 0) {
                        int rendererCount3 = c2573nHA0Q.A00;
                        C2721pg c2721pgA05 = c2588nWA07.A05(rendererCount3);
                        int[] iArr = c2573nHA0Q.A03;
                        int rendererIndex3 = c2573nHA0Q.A02;
                        c1236El = new C1236El(c2721pgA05, iArr, rendererIndex3);
                    } else {
                        c1236El = null;
                    }
                } else {
                    c1236El = null;
                }
                c1236ElArr[i10] = c1236El;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0R(com.facebook.ads.redexgen.core.C1239Eo r11, int[][][] r12, com.facebook.ads.redexgen.core.C10807s[] r13, com.facebook.ads.redexgen.core.InterfaceC2570nE[] r14) {
        /*
            r9 = -1
            r8 = -1
            r10 = 1
            r7 = 0
        L4:
            int r3 = r11.A02()
            r6 = -1
            r5 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C11159h.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L1c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C11159h.A08
            java.lang.String r1 = "NZY9D9dgjYLNZ0XYpF4W2GrX5uVEwVhV"
            r0 = 1
            r2[r0] = r1
            if (r7 >= r3) goto L5e
            int r4 = r11.A03(r7)
            r3 = r14[r7]
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C11159h.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L76
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C11159h.A08
            java.lang.String r1 = "nPMicF"
            r0 = 4
            r2[r0] = r1
            if (r4 == r5) goto L4b
        L48:
            r0 = 2
            if (r4 != r0) goto L88
        L4b:
            if (r3 == 0) goto L88
            r1 = r12[r7]
            com.facebook.ads.redexgen.X.nW r0 = r11.A07(r7)
            boolean r0 = A0W(r1, r0, r3)
            if (r0 == 0) goto L88
            if (r4 != r5) goto L72
            if (r9 == r6) goto L85
            r10 = 0
        L5e:
            if (r9 == r6) goto L70
            if (r8 == r6) goto L70
            r0 = 1
        L63:
            r10 = r10 & r0
            if (r10 == 0) goto L6f
            com.facebook.ads.redexgen.X.7s r0 = new com.facebook.ads.redexgen.X.7s
            r0.<init>(r5)
            r13[r9] = r0
            r13[r8] = r0
        L6f:
            return
        L70:
            r0 = 0
            goto L63
        L72:
            if (r8 == r6) goto L87
            r10 = 0
            goto L5e
        L76:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C11159h.A08
            java.lang.String r1 = "5F5ko3NIDU1YMXmZZUDVXdSE"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "1c60xx4jFCOb1nSxKeVAoj10cRAS07b7"
            r0 = 3
            r2[r0] = r1
            if (r4 == r5) goto L4b
            goto L48
        L85:
            r9 = r7
            goto L88
        L87:
            r8 = r7
        L88:
            int r7 = r7 + 1
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C11159h.A0R(com.facebook.ads.redexgen.X.Eo, int[][][], com.facebook.ads.redexgen.X.7s[], com.facebook.ads.redexgen.X.nE[]):void");
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i10, boolean z10) {
        int iA03 = AbstractC10707i.A03(i10);
        return iA03 == 4 || (z10 && iA03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(C2758qI c2758qI) {
        boolean z10;
        synchronized (this.A05) {
            z10 = !this.A01.A08 || this.A06 || c2758qI.A06 <= 2 || (A0U(c2758qI) && (C5C.A02 < 32 || this.A02 == null || !this.A02.A06())) || (C5C.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, c2758qI));
        }
        return z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public static boolean A0U(C2758qI c2758qI) {
        byte b10;
        if (c2758qI.A0W == null) {
            return false;
        }
        String str = c2758qI.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals(A0J(236, 14, 79))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 187078296:
                if (!str.equals(A0J(Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 9, 92))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 187078297:
                if (!str.equals(A0J(Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, 9, 66))) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 1504578661:
                if (!str.equals(A0J(Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 10, 100))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0W(int[][] iArr, C2588nW c2588nW, InterfaceC2570nE interfaceC2570nE) {
        if (interfaceC2570nE == null) {
            return false;
        }
        int iA04 = c2588nW.A04(interfaceC2570nE.A9L());
        for (int i10 = 0; i10 < interfaceC2570nE.length(); i10++) {
            int trackGroupIndex = AbstractC10707i.A05(iArr[iA04][interfaceC2570nE.A8H(i10)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final C1236El[] A0X(C1239Eo c1239Eo, int[][][] iArr, int[] iArr2, C11169i c11169i) throws AD {
        String str;
        int iA02 = c1239Eo.A02();
        C1236El[] c1236ElArr = new C1236El[iA02];
        Pair<C1236El, Integer> pairA0C = A0C(c1239Eo, iArr, iArr2, c11169i);
        if (pairA0C != null) {
            Object obj = pairA0C.second;
            String[] strArr = A08;
            String str2 = strArr[0];
            String str3 = strArr[2];
            int iCharAt = str2.charAt(9);
            int rendererCount = str3.charAt(9);
            if (iCharAt == rendererCount) {
                throw new RuntimeException();
            }
            A08[7] = "yBKbxgl1qoYBYNtasAVV61g1RQWhRN9O";
            c1236ElArr[((Integer) obj).intValue()] = (C1236El) pairA0C.first;
        }
        if (pairA0C == null) {
            str = null;
        } else {
            C2721pg c2721pg = ((C1236El) pairA0C.first).A01;
            int rendererCount2 = ((C1236El) pairA0C.first).A02[0];
            str = c2721pg.A08(rendererCount2).A0V;
        }
        Pair<C1236El, Integer> pairA0D = A0D(c1239Eo, iArr, iArr2, c11169i, str);
        if (pairA0D != null) {
            c1236ElArr[((Integer) pairA0D.second).intValue()] = (C1236El) pairA0D.first;
        }
        Pair<C1236El, Integer> pairA0B = A0B(c1239Eo, iArr, c11169i, str);
        if (pairA0B != null) {
            c1236ElArr[((Integer) pairA0B.second).intValue()] = (C1236El) pairA0B.first;
        }
        for (int i10 = 0; i10 < iA02; i10++) {
            int i11 = c1239Eo.A03(i10);
            if (i11 != 2 && i11 != 1) {
                String[] strArr2 = A08;
                String str4 = strArr2[0];
                String str5 = strArr2[2];
                int iCharAt2 = str4.charAt(9);
                int rendererCount3 = str5.charAt(9);
                if (iCharAt2 == rendererCount3) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A08;
                strArr3[6] = "1xsmyE1OdjkvrsbXr4cEFZBV";
                strArr3[3] = "D4xPicyrc2caIP01Cw6NBhV2pRXBVsmG";
                if (i11 != 3) {
                    c1236ElArr[i10] = A0E(i11, c1239Eo.A07(i10), iArr[i10], c11169i);
                }
            }
        }
        return c1236ElArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1247Ew
    public final boolean A0Y() {
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a3 */
    @Override // com.facebook.ads.redexgen.core.AbstractC2569nD
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.facebook.ads.redexgen.core.C10807s[], com.facebook.ads.redexgen.core.InterfaceC2570nE[]> A0d(com.facebook.ads.redexgen.core.C1239Eo r10, int[][][] r11, int[] r12, com.facebook.ads.redexgen.core.C2606no r13, com.facebook.ads.androidx.media3.common.Timeline r14) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = r9
            java.lang.Object r2 = r8.A05
            monitor-enter(r2)
            com.facebook.ads.redexgen.X.9i r6 = r8.A01     // Catch: java.lang.Throwable -> La0
            boolean r0 = r6.A08     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            int r1 = com.facebook.ads.redexgen.core.C5C.A02     // Catch: java.lang.Throwable -> La0
            r0 = 32
            if (r1 < r0) goto L23
            com.facebook.ads.redexgen.X.Ef r0 = r8.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.Ef r1 = r8.A02     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = com.facebook.ads.redexgen.core.AbstractC09823y.A02(r0)     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = (android.os.Looper) r0     // Catch: java.lang.Throwable -> La0
            r1.A03(r8, r0)     // Catch: java.lang.Throwable -> La0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La0
            int r5 = r10.A02()
            com.facebook.ads.redexgen.X.El[] r7 = r8.A0X(r10, r11, r12, r6)
            A0P(r10, r6, r7)
            A0Q(r10, r6, r7)
            r4 = 0
        L33:
            r3 = 0
            if (r4 >= r5) goto L51
            int r2 = r10.A03(r4)
            boolean r0 = r6.A0R(r4)
            if (r0 != 0) goto L4c
            com.facebook.ads.redexgen.X.BO<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
        L4c:
            r7[r4] = r3
        L4e:
            int r4 = r4 + 1
            goto L33
        L51:
            com.facebook.ads.redexgen.X.Em r1 = r8.A04
            com.facebook.ads.redexgen.X.F6 r0 = r9.A00()
            com.facebook.ads.redexgen.X.nE[] r4 = r1.A5b(r7, r0, r13, r14)
            com.facebook.ads.redexgen.X.7s[] r3 = new com.facebook.ads.redexgen.core.C10807s[r5]
            r2 = 0
        L5e:
            if (r2 >= r5) goto L94
            int r7 = r10.A03(r2)
            boolean r0 = r6.A0R(r2)
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.BO<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L92
        L76:
            r0 = 1
        L77:
            if (r0 != 0) goto L90
            int r1 = r10.A03(r2)
            r0 = -2
            if (r1 == r0) goto L84
            r0 = r4[r2]
            if (r0 == 0) goto L90
        L84:
            r0 = 1
        L85:
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.7s r0 = com.facebook.ads.redexgen.core.C10807s.A01
        L89:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L5e
        L8e:
            r0 = 0
            goto L89
        L90:
            r0 = 0
            goto L85
        L92:
            r0 = 0
            goto L77
        L94:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L9b
            A0R(r10, r11, r3, r4)
        L9b:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        La0:
            r0 = move-exception
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto La1
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C11159h.A0d(com.facebook.ads.redexgen.X.Eo, int[][][], int[], com.facebook.ads.redexgen.X.no, com.facebook.ads.androidx.media3.common.Timeline):android.util.Pair");
    }

    public final /* synthetic */ BP A0e(C11169i c11169i, boolean z10, int i10, C2721pg c2721pg, int[] iArr) {
        return C2578nM.A03(i10, c2721pg, c11169i, iArr, z10, new InterfaceC2429kj() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.facebook.ads.redexgen.core.InterfaceC2429kj
            public final boolean A4C(Object obj) {
                return this.A00.A0T((C2758qI) obj);
            }
        });
    }
}
