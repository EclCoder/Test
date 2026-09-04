package kk;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f43445a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f43446b = a();

    private static byte[] a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 16; i10++) {
            bArr["0123456789abcdef".charAt(i10)] = (byte) i10;
        }
        return bArr;
    }

    private static char[] b() {
        char[] cArr = new char[512];
        for (int i10 = 0; i10 < 256; i10++) {
            cArr[i10] = "0123456789abcdef".charAt(i10 >>> 4);
            cArr[i10 | 256] = "0123456789abcdef".charAt(i10 & 15);
        }
        return cArr;
    }

    private static void c(byte b10, char[] cArr, int i10) {
        int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        char[] cArr2 = f43445a;
        cArr[i10] = cArr2[i11];
        cArr[i10 + 1] = cArr2[i11 | 256];
    }

    static void d(long j10, char[] cArr, int i10) {
        c((byte) ((j10 >> 56) & 255), cArr, i10);
        c((byte) ((j10 >> 48) & 255), cArr, i10 + 2);
        c((byte) ((j10 >> 40) & 255), cArr, i10 + 4);
        c((byte) ((j10 >> 32) & 255), cArr, i10 + 6);
        c((byte) ((j10 >> 24) & 255), cArr, i10 + 8);
        c((byte) ((j10 >> 16) & 255), cArr, i10 + 10);
        c((byte) ((j10 >> 8) & 255), cArr, i10 + 12);
        c((byte) (j10 & 255), cArr, i10 + 14);
    }

    static void e(long j10, byte[] bArr, int i10) {
        jk.b.a(bArr.length >= i10 + 8, "array too small");
        bArr[i10 + 7] = (byte) (j10 & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 48) & 255);
        bArr[i10] = (byte) ((j10 >> 56) & 255);
    }
}
