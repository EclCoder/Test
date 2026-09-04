package com.googlecode.mp4parser.h264;

import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Debug {
    public static final boolean debug = false;

    public static void print(int i10) {
    }

    public static final void print8x8(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                System.out.printf("%3d, ", Integer.valueOf(iArr[i10]));
                i10++;
            }
            System.out.println();
        }
    }

    public static void print(String str) {
    }

    public static void print(short[] sArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                System.out.printf("%3d, ", Short.valueOf(sArr[i10]));
                i10++;
            }
            System.out.println();
        }
    }

    public static final void print8x8(short[] sArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                System.out.printf("%3d, ", Short.valueOf(sArr[i10]));
                i10++;
            }
            System.out.println();
        }
    }

    public static final void print8x8(ShortBuffer shortBuffer) {
        for (int i10 = 0; i10 < 8; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                System.out.printf("%3d, ", Short.valueOf(shortBuffer.get()));
            }
            System.out.println();
        }
    }

    public static void println(String str) {
    }

    public static void trace(String str, Object... objArr) {
    }
}
