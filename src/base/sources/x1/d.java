package x1;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t1.f;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f56574a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f56575b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f56576c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f56577d = new int[10];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f56579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f56584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f56585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f56586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f56587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f56588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f56589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f56590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f56591n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f56592o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f56593p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f56594q;

        public a(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int i16, int i17, int i18, int i19, float f10, int i20, int i21, int i22, int i23) {
            this.f56578a = i10;
            this.f56579b = z10;
            this.f56580c = i11;
            this.f56581d = i12;
            this.f56582e = i13;
            this.f56583f = i14;
            this.f56584g = i15;
            this.f56585h = iArr;
            this.f56586i = i16;
            this.f56587j = i17;
            this.f56588k = i18;
            this.f56589l = i19;
            this.f56590m = f10;
            this.f56591n = i20;
            this.f56592o = i21;
            this.f56593p = i22;
            this.f56594q = i23;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f56597c;

        public b(int i10, int i11, boolean z10) {
            this.f56595a = i10;
            this.f56596b = i11;
            this.f56597c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f56604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f56605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f56606i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f56607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f56608k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f56609l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f56610m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f56611n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f56612o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f56613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f56614q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f56615r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f56616s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f56617t;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f56598a = i10;
            this.f56599b = i11;
            this.f56600c = i12;
            this.f56601d = i13;
            this.f56602e = i14;
            this.f56603f = i15;
            this.f56604g = i16;
            this.f56605h = f10;
            this.f56606i = i17;
            this.f56607j = i18;
            this.f56608k = z10;
            this.f56609l = z11;
            this.f56610m = i19;
            this.f56611n = i20;
            this.f56612o = i21;
            this.f56613p = z12;
            this.f56614q = i22;
            this.f56615r = i23;
            this.f56616s = i24;
            this.f56617t = i25;
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
        w1.a.g(i12 >= 0);
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
        int iK;
        int i16;
        e eVar = new e(bArr, i10, i11);
        eVar.l(4);
        int iE = eVar.e(3);
        eVar.k();
        int iE2 = eVar.e(2);
        boolean zD = eVar.d();
        int iE3 = eVar.e(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (eVar.d()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = eVar.e(8);
        }
        int iE4 = eVar.e(8);
        int i20 = 0;
        for (int i21 = 0; i21 < iE; i21++) {
            if (eVar.d()) {
                i20 += 89;
            }
            if (eVar.d()) {
                i20 += 8;
            }
        }
        eVar.l(i20);
        if (iE > 0) {
            eVar.l((8 - iE) * 2);
        }
        int iH = eVar.h();
        int iH2 = eVar.h();
        if (iH2 == 3) {
            eVar.k();
        }
        int iH3 = eVar.h();
        int iH4 = eVar.h();
        if (eVar.d()) {
            int iH5 = eVar.h();
            int iH6 = eVar.h();
            int iH7 = eVar.h();
            int iH8 = eVar.h();
            iH3 -= ((iH2 == 1 || iH2 == 2) ? 2 : 1) * (iH5 + iH6);
            iH4 -= (iH2 == 1 ? 2 : 1) * (iH7 + iH8);
        }
        int iH9 = eVar.h();
        int iH10 = eVar.h();
        int iH11 = eVar.h();
        int iJ = -1;
        int iMax = -1;
        for (int i22 = eVar.d() ? 0 : iE; i22 <= iE; i22++) {
            eVar.h();
            iMax = Math.max(eVar.h(), iMax);
            eVar.h();
        }
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        if (eVar.d() && eVar.d()) {
            n(eVar);
        }
        eVar.l(2);
        if (eVar.d()) {
            eVar.l(8);
            eVar.h();
            eVar.h();
            eVar.k();
        }
        q(eVar);
        if (eVar.d()) {
            int iH12 = eVar.h();
            for (int i23 = 0; i23 < iH12; i23++) {
                eVar.l(iH11 + 5);
            }
        }
        eVar.l(2);
        float f10 = 1.0f;
        if (eVar.d()) {
            if (eVar.d()) {
                int iE5 = eVar.e(8);
                if (iE5 == 255) {
                    int iE6 = eVar.e(16);
                    int iE7 = eVar.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = f56575b;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        n.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE5);
                    }
                }
            }
            if (eVar.d()) {
                eVar.k();
            }
            if (eVar.d()) {
                eVar.l(3);
                i16 = eVar.d() ? 1 : 2;
                if (eVar.d()) {
                    int iE8 = eVar.e(8);
                    int iE9 = eVar.e(8);
                    eVar.l(8);
                    iJ = f.j(iE8);
                    iK = f.k(iE9);
                } else {
                    iK = -1;
                }
            } else {
                iK = -1;
                i16 = -1;
            }
            if (eVar.d()) {
                eVar.h();
                eVar.h();
            }
            eVar.k();
            if (eVar.d()) {
                iH4 *= 2;
            }
            i15 = iK;
            i14 = i16;
            i12 = iH4;
            i13 = iJ;
        } else {
            i12 = iH4;
            i13 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new a(iE2, zD, iE3, i17, iH2, iH9, iH10, iArr, iE4, iH, iH3, i12, f10, iMax, i13, i14, i15);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        e eVar = new e(bArr, i10, i11);
        int iH = eVar.h();
        int iH2 = eVar.h();
        eVar.k();
        return new b(iH, iH2, eVar.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0213  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    public static c m(byte[] bArr, int i10, int i11) {
        int iH;
        boolean zD;
        int iH2;
        int i12;
        int i13;
        boolean z10;
        int iH3;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zD2;
        boolean zD3;
        int i21;
        int i22;
        e eVar = new e(bArr, i10, i11);
        int iE = eVar.e(8);
        int iE2 = eVar.e(8);
        int iE3 = eVar.e(8);
        int iH4 = eVar.h();
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = eVar.h();
            zD = iH == 3 ? eVar.d() : false;
            iH2 = eVar.h();
            int iH5 = eVar.h();
            eVar.k();
            if (eVar.d()) {
                int i23 = iH != 3 ? 8 : 12;
                i12 = 16;
                int i24 = 0;
                while (i24 < i23) {
                    if (eVar.d()) {
                        p(eVar, i24 < 6 ? 16 : 64);
                    }
                    i24++;
                }
            } else {
                i12 = 16;
            }
            i13 = iH5;
        } else {
            iH = 1;
            i12 = 16;
            i13 = 0;
            zD = false;
            iH2 = 0;
        }
        int iH6 = eVar.h() + 4;
        int iH7 = eVar.h();
        if (iH7 == 0) {
            iH3 = eVar.h() + 4;
            iE = iE;
            iH7 = iH7;
            z10 = false;
        } else {
            if (iH7 == 1) {
                boolean zD4 = eVar.d();
                eVar.g();
                eVar.g();
                long jH = eVar.h();
                for (int i25 = 0; i25 < jH; i25++) {
                    eVar.h();
                }
                z10 = zD4;
            } else {
                z10 = false;
            }
            iH3 = 0;
        }
        int iH8 = eVar.h();
        eVar.k();
        int iH9 = eVar.h() + 1;
        int iH10 = eVar.h() + 1;
        boolean zD5 = eVar.d();
        int i26 = (2 - (zD5 ? 1 : 0)) * iH10;
        if (!zD5) {
            eVar.k();
        }
        eVar.k();
        int i27 = iH9 * 16;
        int i28 = i26 * 16;
        if (eVar.d()) {
            int iH11 = eVar.h();
            int iH12 = eVar.h();
            int iH13 = eVar.h();
            int iH14 = eVar.h();
            if (iH == 0) {
                i22 = 2 - (zD5 ? 1 : 0);
                i21 = 1;
            } else {
                i21 = iH == 3 ? 1 : 2;
                i22 = (iH == 1 ? 2 : 1) * (2 - (zD5 ? 1 : 0));
            }
            i27 -= (iH11 + iH12) * i21;
            i28 -= (iH13 + iH14) * i22;
        }
        int i29 = i27;
        int i30 = iE;
        int iH15 = ((i30 == 44 || i30 == 86 || i30 == 100 || i30 == 110 || i30 == 122 || i30 == 244) && (iE2 & 16) != 0) ? 0 : i12;
        float f11 = 1.0f;
        if (eVar.d()) {
            if (eVar.d()) {
                int iE4 = eVar.e(8);
                if (iE4 == 255) {
                    int i31 = i12;
                    int iE5 = eVar.e(i31);
                    int iE6 = eVar.e(i31);
                    if (iE5 != 0 && iE6 != 0) {
                        f11 = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f56575b;
                    if (iE4 < fArr.length) {
                        f11 = fArr[iE4];
                    } else {
                        n.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE4);
                    }
                }
            }
            if (eVar.d()) {
                eVar.k();
            }
            if (eVar.d()) {
                eVar.l(3);
                i19 = eVar.d() ? 1 : 2;
                if (eVar.d()) {
                    int iE7 = eVar.e(8);
                    int iE8 = eVar.e(8);
                    eVar.l(8);
                    int iJ = f.j(iE7);
                    int iK = f.k(iE8);
                    i20 = iJ;
                    i18 = iK;
                } else {
                    i18 = -1;
                }
                if (eVar.d()) {
                    eVar.h();
                    eVar.h();
                }
                if (eVar.d()) {
                    eVar.l(65);
                }
                zD2 = eVar.d();
                if (zD2) {
                    o(eVar);
                }
                zD3 = eVar.d();
                if (zD3) {
                    o(eVar);
                }
                if (zD2 || zD3) {
                    eVar.k();
                }
                eVar.k();
                if (eVar.d()) {
                    eVar.k();
                    eVar.h();
                    eVar.h();
                    eVar.h();
                    eVar.h();
                    iH15 = eVar.h();
                    eVar.h();
                }
                i17 = i18;
                i16 = i19;
                i14 = iH15;
                f10 = f11;
                i15 = i20;
            } else {
                i18 = -1;
                i19 = -1;
            }
            i20 = -1;
            if (eVar.d()) {
                eVar.h();
                eVar.h();
            }
            if (eVar.d()) {
                eVar.l(65);
            }
            zD2 = eVar.d();
            if (zD2) {
                o(eVar);
            }
            zD3 = eVar.d();
            if (zD3) {
                o(eVar);
            }
            if (zD2) {
                eVar.k();
            } else {
                eVar.k();
            }
            eVar.k();
            if (eVar.d()) {
                eVar.k();
                eVar.h();
                eVar.h();
                eVar.h();
                eVar.h();
                iH15 = eVar.h();
                eVar.h();
            }
            i17 = i18;
            i16 = i19;
            i14 = iH15;
            f10 = f11;
            i15 = i20;
        } else {
            i14 = iH15;
            f10 = 1.0f;
            i15 = -1;
            i16 = -1;
            i17 = -1;
        }
        return new c(i30, iE2, iE3, iH4, iH8, i29, i28, f10, iH2, i13, zD, zD5, iH6, iH7, iH3, z10, i15, i16, i17, i14);
    }

    private static void n(e eVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (eVar.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        eVar.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        eVar.g();
                    }
                } else {
                    eVar.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(e eVar) {
        int iH = eVar.h() + 1;
        eVar.l(8);
        for (int i10 = 0; i10 < iH; i10++) {
            eVar.h();
            eVar.h();
            eVar.k();
        }
        eVar.l(20);
    }

    private static void p(e eVar, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((eVar.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    private static void q(e eVar) {
        int iH = eVar.h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < iH; i12++) {
            if (i12 == 0 || !eVar.d()) {
                int iH2 = eVar.h();
                int iH3 = eVar.h();
                int[] iArr2 = new int[iH2];
                int i13 = 0;
                while (i13 < iH2) {
                    iArr2[i13] = (i13 > 0 ? iArr2[i13 - 1] : 0) - (eVar.h() + 1);
                    eVar.k();
                    i13++;
                }
                int[] iArr3 = new int[iH3];
                int i14 = 0;
                while (i14 < iH3) {
                    iArr3[i14] = (i14 > 0 ? iArr3[i14 - 1] : 0) + eVar.h() + 1;
                    eVar.k();
                    i14++;
                }
                i10 = iH2;
                iArr = iArr2;
                i11 = iH3;
                iArrCopyOf = iArr3;
            } else {
                int i15 = i10 + i11;
                int iH4 = (1 - ((eVar.d() ? 1 : 0) * 2)) * (eVar.h() + 1);
                int i16 = i15 + 1;
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 <= i15; i17++) {
                    if (eVar.d()) {
                        zArr[i17] = true;
                    } else {
                        zArr[i17] = eVar.d();
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

    public static int r(byte[] bArr, int i10) {
        int i11;
        synchronized (f56576c) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f56577d;
                        if (iArr.length <= i12) {
                            f56577d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f56577d[i12] = iD;
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
                int i16 = f56577d[i15] - i14;
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
