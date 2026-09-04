package u3;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f54110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f54111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54112c;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f54116d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f54113a = i10;
            this.f54114b = i11;
            this.f54115c = i12;
            this.f54116d = bArr;
        }
    }

    private static int a(int i10) throws ParserException {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) throws ParserException {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.c("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws ParserException {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.c("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i10) throws ParserException {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(w1.t tVar) {
        if (!tVar.g()) {
            return 0;
        }
        tVar.r(2);
        return tVar.h(13);
    }

    public static boolean g(w1.t tVar, b bVar) throws ParserException {
        tVar.d();
        int iK = k(tVar, 3, 8, 8);
        bVar.f54110a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(tVar, 2, 8, 32);
        bVar.f54111b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw ParserException.c("Contains sub-stream with an invalid packet label " + bVar.f54111b);
        }
        if (jL == 0) {
            int i10 = bVar.f54110a;
            if (i10 == 1) {
                throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(tVar, 11, 24, 24);
        bVar.f54112c = iK2;
        return iK2 != -1;
    }

    public static c h(w1.t tVar) throws ParserException {
        int iH = tVar.h(8);
        int iH2 = tVar.h(5);
        int iH3 = iH2 == 31 ? tVar.h(24) : c(iH2);
        int iH4 = tVar.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        tVar.r(2);
        p(tVar);
        m(tVar, j(tVar), iD);
        byte[] bArr = null;
        if (tVar.g()) {
            int iK = k(tVar, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(tVar, 4, 8, 16);
                int iK3 = k(tVar, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = tVar.h(4) + 1;
                    tVar.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) tVar.h(8);
                    }
                    bArr = bArr2;
                } else {
                    tVar.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(w1.t tVar) {
        tVar.r(3);
        boolean zG = tVar.g();
        if (zG) {
            tVar.r(13);
        }
        return zG;
    }

    private static int j(w1.t tVar) {
        int iH = tVar.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = tVar.h(3);
            iK += k(tVar, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && tVar.g()) {
                p(tVar);
            }
        }
        return iK;
    }

    private static int k(w1.t tVar, int i10, int i11, int i12) {
        w1.a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        wc.d.a(wc.d.a(i13, i14), 1 << i12);
        if (tVar.b() < i10) {
            return -1;
        }
        int iH = tVar.h(i10);
        if (iH != i13) {
            return iH;
        }
        if (tVar.b() < i11) {
            return -1;
        }
        int iH2 = tVar.h(i11);
        int i15 = iH + iH2;
        if (iH2 != i14) {
            return i15;
        }
        if (tVar.b() < i12) {
            return -1;
        }
        return i15 + tVar.h(i12);
    }

    private static long l(w1.t tVar, int i10, int i11, int i12) {
        w1.a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        wc.e.a(wc.e.a(j10, j11), 1 << i12);
        if (tVar.b() < i10) {
            return -1L;
        }
        long j12 = tVar.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (tVar.b() < i11) {
            return -1L;
        }
        long j13 = tVar.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (tVar.b() < i12) {
            return -1L;
        }
        return j14 + tVar.j(i12);
    }

    private static void m(w1.t tVar, int i10, int i11) {
        int iH;
        int iK = k(tVar, 4, 8, 16) + 1;
        tVar.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = tVar.h(2);
            if (iH2 == 0) {
                i(tVar);
                if (i11 > 0) {
                    o(tVar);
                }
            } else if (iH2 == 1) {
                if (i(tVar)) {
                    tVar.q();
                }
                if (i11 > 0) {
                    o(tVar);
                    iH = tVar.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    tVar.r(6);
                    int iH3 = tVar.h(2);
                    tVar.r(4);
                    if (tVar.g()) {
                        tVar.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        tVar.r(6);
                    }
                    if (iH3 == 2) {
                        tVar.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = tVar.h(2);
                if (iH4 > 0 && tVar.g()) {
                    tVar.r(iFloor);
                }
                if (tVar.g()) {
                    tVar.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    tVar.q();
                }
            } else if (iH2 == 3) {
                k(tVar, 4, 8, 16);
                int iK2 = k(tVar, 4, 8, 16);
                if (tVar.g()) {
                    k(tVar, 8, 16, 0);
                }
                tVar.q();
                if (iK2 > 0) {
                    tVar.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(w1.t tVar, int i10) {
        int iH;
        boolean zG = tVar.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (tVar.g()) {
                tVar.r(7);
                iH = 0;
            } else {
                if (tVar.h(2) == 3 && tVar.h(i12) * i11 != 0) {
                    tVar.q();
                }
                iH = tVar.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    tVar.q();
                }
                tVar.q();
            }
            if (iH != 0 && iH != 180 && tVar.g()) {
                i14++;
            }
            i14++;
        }
    }

    private static void o(w1.t tVar) {
        tVar.r(3);
        tVar.r(8);
        boolean zG = tVar.g();
        boolean zG2 = tVar.g();
        if (zG) {
            tVar.r(5);
        }
        if (zG2) {
            tVar.r(6);
        }
    }

    private static void p(w1.t tVar) {
        int iH = tVar.h(2);
        if (iH == 0) {
            tVar.r(6);
            return;
        }
        int iK = k(tVar, 5, 8, 16) + 1;
        if (iH == 1) {
            tVar.r(iK * 7);
        } else if (iH == 2) {
            n(tVar, iK);
        }
    }
}
