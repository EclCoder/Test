package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC1471Np {
    public static byte[] A01;
    public static final /* synthetic */ EnumC1471Np[] A02;
    public static final EnumC1471Np A03;
    public static final EnumC1471Np A04;
    public static final EnumC1471Np A05;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 101);
        A05 = new EnumC1471Np(strA01, 0, strA01);
        String strA02 = A01(13, 14, 98);
        A04 = new EnumC1471Np(strA02, 1, strA02);
        String strA03 = A01(0, 13, 12);
        A03 = new EnumC1471Np(strA03, 2, strA03);
        A02 = A03();
    }

    public EnumC1471Np(String str, int i10, String str2) {
        super(str, i10);
        this.A00 = str2;
    }

    public static EnumC1471Np A00(String str) {
        for (EnumC1471Np enumC1471Np : values()) {
            if (enumC1471Np.A00.equalsIgnoreCase(str)) {
                return enumC1471Np;
            }
        }
        return A03;
    }

    public static /* synthetic */ EnumC1471Np[] A03() {
        return new EnumC1471Np[]{A05, A04, A03};
    }

    public static EnumC1471Np valueOf(String str) {
        return (EnumC1471Np) Enum.valueOf(EnumC1471Np.class, str);
    }

    public static EnumC1471Np[] values() {
        return (EnumC1471Np[]) A02.clone();
    }
}
