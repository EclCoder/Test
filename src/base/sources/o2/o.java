package o2;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f48119a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f48120b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f48121c = {64, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f48122d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f48123e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f48124f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f48125g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f48126h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f48127i = {5, 8, 10, 12};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f48132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f48133f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f48128a = str;
            this.f48130c = i10;
            this.f48129b = i11;
            this.f48131d = i12;
            this.f48132e = j10;
            this.f48133f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) throws ParserException {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i11] << 8) & 65535)) != w1.c0.u(bArr, 0, i11, 65535)) {
            throw ParserException.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static w1.t d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new w1.t(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        w1.t tVar = new w1.t(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            w1.t tVar2 = new w1.t(bArrCopyOf);
            while (tVar2.b() >= 16) {
                tVar2.r(2);
                tVar.f(tVar2.h(14), 14);
            }
        }
        tVar.n(bArrCopyOf);
        return tVar;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static t1.o h(byte[] bArr, String str, String str2, int i10, t1.k kVar) {
        w1.t tVarD = d(bArr);
        tVarD.r(60);
        int i11 = f48119a[tVarD.h(6)];
        int i12 = f48120b[tVarD.h(4)];
        int iH = tVarD.h(5);
        int[] iArr = f48121c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        tVarD.r(10);
        return new t1.o.b().a0(str).o0(MimeTypes.AUDIO_DTS).M(i13).N(i11 + (tVarD.h(2) > 0 ? 1 : 0)).p0(i12).U(kVar).e0(str2).m0(i10).K();
    }

    public static b i(byte[] bArr) throws ParserException {
        int i10;
        int i11;
        int iH;
        int i12;
        long jN0;
        int i13;
        w1.t tVarD = d(bArr);
        tVarD.r(40);
        int iH2 = tVarD.h(2);
        if (tVarD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        tVarD.r(i11);
        int iH3 = tVarD.h(i10) + 1;
        boolean zG = tVarD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = tVarD.h(2);
            int iH5 = (tVarD.h(3) + 1) * 512;
            if (tVarD.g()) {
                tVarD.r(36);
            }
            int iH6 = tVarD.h(3) + 1;
            int iH7 = tVarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw ParserException.c("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = tVarD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    tVarD.r(8);
                }
            }
            if (tVarD.g()) {
                tVarD.r(2);
                int iH9 = (tVarD.h(2) + 1) << 2;
                int iH10 = tVarD.h(2) + 1;
                while (i14 < iH10) {
                    tVarD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        tVarD.r(i10);
        tVarD.r(12);
        if (zG) {
            if (tVarD.g()) {
                tVarD.r(4);
            }
            if (tVarD.g()) {
                tVarD.r(24);
            }
            if (tVarD.g()) {
                tVarD.s(tVarD.h(10) + 1);
            }
            tVarD.r(5);
            i12 = f48122d[tVarD.h(4)];
            iH4 = tVarD.h(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw ParserException.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jN0 = w1.c0.N0(i14, 1000000L, i13);
        } else {
            jN0 = C.TIME_UNSET;
        }
        return new b(MimeTypes.AUDIO_DTS_EXPRESS, iH4, i17, iH3, jN0, 0);
    }

    public static int j(byte[] bArr) {
        w1.t tVarD = d(bArr);
        tVarD.r(42);
        return tVarD.h(tVarD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iH;
        long jN0;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        w1.t tVarD = d(bArr);
        int i12 = tVarD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(tVarD, f48123e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jN0 = C.TIME_UNSET;
        } else {
            if (!tVarD.g()) {
                throw ParserException.c("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = tVarD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw ParserException.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (tVarD.h(3) + 1);
            int iH4 = tVarD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw ParserException.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (tVarD.g()) {
                tVarD.r(36);
            }
            iH = (1 << tVarD.h(2)) * i11;
            jN0 = w1.c0.N0(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jN0;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(tVarD, f48124f, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(tVarD, f48125g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(tVarD, f48126h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        w1.t tVarD = d(bArr);
        tVarD.r(32);
        return m(tVarD, f48127i, true) + 1;
    }

    private static int m(w1.t tVar, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && tVar.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + tVar.h(iArr[i11]);
    }
}
