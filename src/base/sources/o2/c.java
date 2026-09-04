package o2;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f47984a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f47988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f47989e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f47985a = i10;
            this.f47987c = i11;
            this.f47986b = i12;
            this.f47988d = i13;
            this.f47989e = i14;
        }
    }

    public static void a(int i10, w1.u uVar) {
        uVar.P(7);
        byte[] bArrE = uVar.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & 255);
        bArrE[5] = (byte) ((i10 >> 8) & 255);
        bArrE[6] = (byte) (i10 & 255);
    }

    public static t1.o b(w1.u uVar, String str, String str2, t1.k kVar) {
        uVar.U(1);
        return new t1.o.b().a0(str).o0("audio/ac4").N(2).p0(((uVar.G() & 32) >> 5) == 1 ? 48000 : 44100).U(kVar).e0(str2).K();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new w1.t(bArr)).f47989e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static b d(w1.t tVar) {
        int i10;
        int i11;
        int i12;
        int iH = tVar.h(16);
        int iH2 = tVar.h(16);
        if (iH2 == 65535) {
            iH2 = tVar.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i13 = iH2 + i10;
        if (iH == 44097) {
            i13 += 2;
        }
        int i14 = i13;
        int iH3 = tVar.h(2);
        if (iH3 == 3) {
            iH3 += f(tVar, 2);
        }
        int i15 = iH3;
        int iH4 = tVar.h(10);
        if (tVar.g() && tVar.h(3) > 0) {
            tVar.r(2);
        }
        int i16 = 48000;
        if (!tVar.g()) {
            i16 = 44100;
        }
        int iH5 = tVar.h(4);
        if (i16 != 44100 || iH5 != 13) {
            if (i16 == 48000) {
                int[] iArr = f47984a;
                if (iH5 < iArr.length) {
                    int i17 = iArr[iH5];
                    int i18 = iH4 % 5;
                    if (i18 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (i18 != 2) {
                        if (i18 == 3) {
                            if (iH5 != 3) {
                            }
                            i11 = i17 + 1;
                        } else if (i18 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i11 = i17 + 1;
                    } else {
                        i12 = i17;
                    }
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            return new b(i15, 2, i16, i14, i12);
        }
        i11 = f47984a[iH5];
        i12 = i11;
        return new b(i15, 2, i16, i14, i12);
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        if (i12 == 65535) {
            i12 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int f(w1.t tVar, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + tVar.h(i10);
            if (!tVar.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }
}
