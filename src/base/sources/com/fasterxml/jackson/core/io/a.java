package com.fasterxml.jackson.core.io;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f16220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f16221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f16223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f16224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f16225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f16226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f16227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f16228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f16229j;

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0274a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0274a f16230b = new C0274a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[][] f16231a = new int[128][];

        private C0274a() {
        }

        public int[] a(int i10) {
            int[] iArrCopyOf = this.f16231a[i10];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(a.f16228i, 128);
                if (iArrCopyOf[i10] == 0) {
                    iArrCopyOf[i10] = -1;
                }
                this.f16231a[i10] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }

    static {
        int i10;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f16220a = charArray;
        int length = charArray.length;
        f16221b = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            f16221b[i11] = (byte) f16220a[i11];
        }
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f16222c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i13 = 128; i13 < 256; i13++) {
            if ((i13 & 224) == 192) {
                i10 = 2;
            } else if ((i13 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                i10 = 3;
            } else {
                i10 = (i13 & 248) == 240 ? 4 : -1;
            }
            iArr2[i13] = i10;
        }
        f16223d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i14 = 33; i14 < 256; i14++) {
            if (Character.isJavaIdentifierPart((char) i14)) {
                iArr3[i14] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f16224e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f16225f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f16223d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f16226g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f16227h = iArr7;
        int[] iArr8 = new int[128];
        for (int i15 = 0; i15 < 32; i15++) {
            iArr8[i15] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f16228i = iArr8;
        int[] iArr9 = new int[256];
        f16229j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i16 = 0; i16 < 10; i16++) {
            f16229j[i16 + 48] = i16;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int[] iArr10 = f16229j;
            int i18 = i17 + 10;
            iArr10[i17 + 97] = i18;
            iArr10[i17 + 65] = i18;
        }
    }

    public static void b(StringBuilder sb2, String str) {
        int[] iArr = f16228i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append('\\');
                int i11 = iArr[cCharAt];
                if (i11 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f16220a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static int c(int i10) {
        return f16229j[i10 & 255];
    }

    public static byte[] d() {
        return (byte[]) f16221b.clone();
    }

    public static char[] e() {
        return (char[]) f16220a.clone();
    }

    public static int[] f() {
        return f16228i;
    }

    public static int[] g(int i10) {
        return i10 == 34 ? f16228i : C0274a.f16230b.a(i10);
    }

    public static int[] h() {
        return f16226g;
    }

    public static int[] i() {
        return f16222c;
    }

    public static int[] j() {
        return f16224e;
    }

    public static int[] k() {
        return f16223d;
    }

    public static int[] l() {
        return f16225f;
    }
}
