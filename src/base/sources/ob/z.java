package ob;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f48467a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f48468b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f48469c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f48470d = new int[10];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f48475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f48476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f48477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f48478h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f48479i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f48480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f48482l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f48483m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f48484n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f48485o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f48486p;

        public a(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int i16, int i17, int i18, int i19, float f10, int i20, int i21, int i22) {
            this.f48471a = i10;
            this.f48472b = z10;
            this.f48473c = i11;
            this.f48474d = i12;
            this.f48475e = i13;
            this.f48476f = i14;
            this.f48477g = i15;
            this.f48478h = iArr;
            this.f48479i = i16;
            this.f48480j = i17;
            this.f48481k = i18;
            this.f48482l = i19;
            this.f48483m = f10;
            this.f48484n = i20;
            this.f48485o = i21;
            this.f48486p = i22;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48489c;

        public b(int i10, int i11, boolean z10) {
            this.f48487a = i10;
            this.f48488b = i11;
            this.f48489c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f48494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f48495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f48496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f48497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f48498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f48499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f48501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f48502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f48503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f48504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f48505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f48506q;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12, int i20, int i21, int i22) {
            this.f48490a = i10;
            this.f48491b = i11;
            this.f48492c = i12;
            this.f48493d = i13;
            this.f48494e = i14;
            this.f48495f = i15;
            this.f48496g = i16;
            this.f48497h = f10;
            this.f48498i = z10;
            this.f48499j = z11;
            this.f48500k = i17;
            this.f48501l = i18;
            this.f48502m = i19;
            this.f48503n = z12;
            this.f48504o = i20;
            this.f48505p = i21;
            this.f48506q = i22;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        ob.a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        return (MimeTypes.VIDEO_H264.equals(str) && (b10 & 31) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        e0 e0Var = new e0(bArr, i10, i11);
        e0Var.l(4);
        int iE = e0Var.e(3);
        e0Var.k();
        int iE2 = e0Var.e(2);
        boolean zD = e0Var.d();
        int iE3 = e0Var.e(5);
        int i19 = 0;
        for (int i20 = 0; i20 < 32; i20++) {
            if (e0Var.d()) {
                i19 |= 1 << i20;
            }
        }
        int[] iArr = new int[6];
        for (int i21 = 0; i21 < 6; i21++) {
            iArr[i21] = e0Var.e(8);
        }
        int iE4 = e0Var.e(8);
        int i22 = 0;
        for (int i23 = 0; i23 < iE; i23++) {
            if (e0Var.d()) {
                i22 += 89;
            }
            if (e0Var.d()) {
                i22 += 8;
            }
        }
        e0Var.l(i22);
        if (iE > 0) {
            e0Var.l((8 - iE) * 2);
        }
        int iH = e0Var.h();
        int iH2 = e0Var.h();
        if (iH2 == 3) {
            e0Var.k();
        }
        int iH3 = e0Var.h();
        int iH4 = e0Var.h();
        if (e0Var.d()) {
            int iH5 = e0Var.h();
            int iH6 = e0Var.h();
            int iH7 = e0Var.h();
            int iH8 = e0Var.h();
            iH3 -= ((iH2 == 1 || iH2 == 2) ? 2 : 1) * (iH5 + iH6);
            iH4 -= (iH2 == 1 ? 2 : 1) * (iH7 + iH8);
        }
        int iH9 = e0Var.h();
        int iH10 = e0Var.h();
        int iH11 = e0Var.h();
        for (int i24 = e0Var.d() ? 0 : iE; i24 <= iE; i24++) {
            e0Var.h();
            e0Var.h();
            e0Var.h();
        }
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        if (e0Var.d() && e0Var.d()) {
            n(e0Var);
        }
        e0Var.l(2);
        if (e0Var.d()) {
            e0Var.l(8);
            e0Var.h();
            e0Var.h();
            e0Var.k();
        }
        p(e0Var);
        if (e0Var.d()) {
            int iH12 = e0Var.h();
            for (int i25 = 0; i25 < iH12; i25++) {
                e0Var.l(iH11 + 5);
            }
        }
        e0Var.l(2);
        float f10 = 1.0f;
        if (e0Var.d()) {
            if (e0Var.d()) {
                int iE5 = e0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = e0Var.e(16);
                    int iE7 = e0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = f48468b;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        u.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE5);
                    }
                }
            }
            if (e0Var.d()) {
                e0Var.k();
            }
            if (e0Var.d()) {
                e0Var.l(3);
                i18 = e0Var.d() ? 1 : 2;
                if (e0Var.d()) {
                    int iE8 = e0Var.e(8);
                    int iE9 = e0Var.e(8);
                    e0Var.l(8);
                    int iH13 = pb.c.h(iE8);
                    int i26 = pb.c.i(iE9);
                    i17 = iH13;
                    i16 = i26;
                } else {
                    i16 = -1;
                    i17 = -1;
                }
            } else {
                i16 = -1;
                i17 = -1;
                i18 = -1;
            }
            if (e0Var.d()) {
                e0Var.h();
                e0Var.h();
            }
            e0Var.k();
            if (e0Var.d()) {
                iH4 *= 2;
            }
            i15 = i16;
            i13 = i17;
            i14 = i18;
            i12 = iH4;
        } else {
            i12 = iH4;
            i13 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new a(iE2, zD, iE3, i19, iH2, iH9, iH10, iArr, iE4, iH, iH3, i12, f10, i13, i14, i15);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        e0 e0Var = new e0(bArr, i10, i11);
        int iH = e0Var.h();
        int iH2 = e0Var.h();
        e0Var.k();
        return new b(iH, iH2, e0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b5 A[PHI: r16
      0x01b5: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0139, B:89:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    public static c m(byte[] bArr, int i10, int i11) {
        int iH;
        boolean zD;
        int i12;
        boolean z10;
        int iH2;
        int iH3;
        int i13;
        int i14;
        int i15;
        e0 e0Var = new e0(bArr, i10, i11);
        int iE = e0Var.e(8);
        int iE2 = e0Var.e(8);
        int iE3 = e0Var.e(8);
        int iH4 = e0Var.h();
        int i16 = 1;
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = e0Var.h();
            zD = iH == 3 ? e0Var.d() : false;
            e0Var.h();
            e0Var.h();
            e0Var.k();
            if (e0Var.d()) {
                int i17 = iH != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (e0Var.d()) {
                        o(e0Var, i18 < 6 ? 16 : 64);
                    }
                    i18++;
                }
            }
        } else {
            iH = 1;
            zD = false;
        }
        int iH5 = e0Var.h() + 4;
        int iH6 = e0Var.h();
        if (iH6 == 0) {
            i16 = 1;
            zD = zD;
            iH2 = e0Var.h() + 4;
            i12 = 16;
            z10 = false;
        } else {
            if (iH6 == 1) {
                boolean zD2 = e0Var.d();
                e0Var.g();
                e0Var.g();
                long jH = e0Var.h();
                i12 = 16;
                for (int i19 = 0; i19 < jH; i19++) {
                    e0Var.h();
                }
                z10 = zD2;
            } else {
                i12 = 16;
                z10 = false;
            }
            iH2 = 0;
        }
        int iH7 = e0Var.h();
        e0Var.k();
        int iH8 = e0Var.h() + 1;
        int iH9 = e0Var.h() + 1;
        boolean zD3 = e0Var.d();
        int i20 = (2 - (zD3 ? 1 : 0)) * iH9;
        if (!zD3) {
            e0Var.k();
        }
        e0Var.k();
        int i21 = iH8 * 16;
        int i22 = i20 * 16;
        if (e0Var.d()) {
            int iH10 = e0Var.h();
            int iH11 = e0Var.h();
            int iH12 = e0Var.h();
            int iH13 = e0Var.h();
            if (iH == 0) {
                i15 = 2 - (zD3 ? 1 : 0);
            } else {
                if (iH != 3) {
                    i16 = 2;
                }
                i15 = (iH == i16 ? 2 : i16) * (2 - (zD3 ? 1 : 0));
            }
            i21 -= (iH10 + iH11) * i16;
            i22 -= (iH12 + iH13) * i15;
        }
        float f10 = 1.0f;
        if (e0Var.d()) {
            if (e0Var.d()) {
                int iE4 = e0Var.e(8);
                if (iE4 == 255) {
                    int i23 = i12;
                    int iE5 = e0Var.e(i23);
                    int iE6 = e0Var.e(i23);
                    if (iE5 != 0 && iE6 != 0) {
                        f10 = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f48468b;
                    if (iE4 < fArr.length) {
                        f10 = fArr[iE4];
                    } else {
                        u.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE4);
                    }
                }
            }
            if (e0Var.d()) {
                e0Var.k();
            }
            if (e0Var.d()) {
                e0Var.l(3);
                i13 = e0Var.d() ? 1 : 2;
                if (e0Var.d()) {
                    int iE7 = e0Var.e(8);
                    int iE8 = e0Var.e(8);
                    e0Var.l(8);
                    iH3 = pb.c.h(iE7);
                    i14 = pb.c.i(iE8);
                } else {
                    iH3 = -1;
                }
            } else {
                iH3 = -1;
                i13 = -1;
            }
            i14 = -1;
        } else {
            iH3 = -1;
            i13 = -1;
            i14 = -1;
        }
        return new c(iE, iE2, iE3, iH4, iH7, i21, i22, f10, zD, zD3, iH5, iH6, iH2, z10, iH3, i13, i14);
    }

    private static void n(e0 e0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (e0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        e0Var.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        e0Var.g();
                    }
                } else {
                    e0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(e0 e0Var, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((e0Var.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    private static void p(e0 e0Var) {
        int iH = e0Var.h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < iH; i12++) {
            if (i12 == 0 || !e0Var.d()) {
                int iH2 = e0Var.h();
                int iH3 = e0Var.h();
                int[] iArr2 = new int[iH2];
                int i13 = 0;
                while (i13 < iH2) {
                    iArr2[i13] = (i13 > 0 ? iArr2[i13 - 1] : 0) - (e0Var.h() + 1);
                    e0Var.k();
                    i13++;
                }
                int[] iArr3 = new int[iH3];
                int i14 = 0;
                while (i14 < iH3) {
                    iArr3[i14] = (i14 > 0 ? iArr3[i14 - 1] : 0) + e0Var.h() + 1;
                    e0Var.k();
                    i14++;
                }
                i10 = iH2;
                iArr = iArr2;
                i11 = iH3;
                iArrCopyOf = iArr3;
            } else {
                int i15 = i10 + i11;
                int iH4 = (1 - ((e0Var.d() ? 1 : 0) * 2)) * (e0Var.h() + 1);
                int i16 = i15 + 1;
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 <= i15; i17++) {
                    if (e0Var.d()) {
                        zArr[i17] = true;
                    } else {
                        zArr[i17] = e0Var.d();
                    }
                }
                int[] iArr4 = new int[i16];
                int[] iArr5 = new int[i16];
                int i18 = 0;
                for (int i19 = i11 - 1; i19 >= 0; i19--) {
                    int i20 = iArrCopyOf[i19] + iH4;
                    if (i20 < 0 && zArr[i10 + i19]) {
                        iArr4[i18] = i20;
                        i18++;
                    }
                }
                if (iH4 < 0 && zArr[i15]) {
                    iArr4[i18] = iH4;
                    i18++;
                }
                for (int i21 = 0; i21 < i10; i21++) {
                    int i22 = iArr[i21] + iH4;
                    if (i22 < 0 && zArr[i21]) {
                        iArr4[i18] = i22;
                        i18++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i18);
                int i23 = 0;
                for (int i24 = i10 - 1; i24 >= 0; i24--) {
                    int i25 = iArr[i24] + iH4;
                    if (i25 > 0 && zArr[i24]) {
                        iArr5[i23] = i25;
                        i23++;
                    }
                }
                if (iH4 > 0 && zArr[i15]) {
                    iArr5[i23] = iH4;
                    i23++;
                }
                for (int i26 = 0; i26 < i11; i26++) {
                    int i27 = iArrCopyOf[i26] + iH4;
                    if (i27 > 0 && zArr[i10 + i26]) {
                        iArr5[i23] = i27;
                        i23++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i23);
                iArr = iArrCopyOf2;
                i10 = i18;
                i11 = i23;
            }
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f48469c) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f48470d;
                        if (iArr.length <= i12) {
                            f48470d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f48470d[i12] = iD;
                        iD += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f48470d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }
}
