package o2;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f48150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48151c;

        public a(String str, String[] strArr, int i10) {
            this.f48149a = str;
            this.f48150b = strArr;
            this.f48151c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f48152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48155d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f48152a = z10;
            this.f48153b = i10;
            this.f48154c = i11;
            this.f48155d = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f48160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f48161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f48162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f48163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f48164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f48165j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f48156a = i10;
            this.f48157b = i11;
            this.f48158c = i12;
            this.f48159d = i13;
            this.f48160e = i14;
            this.f48161f = i15;
            this.f48162g = i16;
            this.f48163h = i17;
            this.f48164i = z10;
            this.f48165j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static t1.u d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] strArrV0 = w1.c0.V0(str, "=");
            if (strArrV0.length != 2) {
                w1.n.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrV0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(a3.a.a(new w1.u(Base64.decode(strArrV0[1], 0))));
                } catch (RuntimeException e10) {
                    w1.n.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new f3.a(strArrV0[0], strArrV0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t1.u(arrayList);
    }

    public static com.google.common.collect.c0 e(byte[] bArr) {
        w1.u uVar = new w1.u(bArr);
        uVar.U(1);
        int i10 = 0;
        while (uVar.a() > 0 && uVar.j() == 255) {
            i10 += 255;
            uVar.U(1);
        }
        int iG = i10 + uVar.G();
        int i11 = 0;
        while (uVar.a() > 0 && uVar.j() == 255) {
            i11 += 255;
            uVar.U(1);
        }
        int iG2 = i11 + uVar.G();
        byte[] bArr2 = new byte[iG];
        int iF = uVar.f();
        System.arraycopy(bArr, iF, bArr2, 0, iG);
        int i12 = iF + iG + iG2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return com.google.common.collect.c0.E(bArr2, bArr3);
    }

    private static void f(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q0Var.d(16);
            if (iD2 == 0) {
                q0Var.e(8);
                q0Var.e(16);
                q0Var.e(16);
                q0Var.e(6);
                q0Var.e(8);
                int iD3 = q0Var.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q0Var.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q0Var.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q0Var.d(3) + 1;
                    int iD6 = q0Var.d(2);
                    if (iD6 > 0) {
                        q0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q0Var.e(8);
                    }
                }
                q0Var.e(2);
                int iD7 = q0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q0Var.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q0Var.d(16);
            if (iD2 != 0) {
                w1.n.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q0Var.c() ? q0Var.d(4) + 1 : 1;
                if (q0Var.c()) {
                    int iD4 = q0Var.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q0Var.e(b(i13));
                        q0Var.e(b(i13));
                    }
                }
                if (q0Var.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q0Var.e(8);
                    q0Var.e(8);
                    q0Var.e(8);
                }
            }
        }
    }

    private static b[] h(q0 q0Var) {
        int iD = q0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q0Var.c(), q0Var.d(16), q0Var.d(16), q0Var.d(8));
        }
        return bVarArr;
    }

    private static void i(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q0Var.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            q0Var.e(24);
            q0Var.e(24);
            q0Var.e(24);
            int iD2 = q0Var.d(6) + 1;
            q0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q0Var.c() ? q0Var.d(5) : 0) * 8) + q0Var.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q0Var.e(8);
                    }
                }
            }
        }
    }

    public static a j(w1.u uVar) {
        return k(uVar, true, true);
    }

    public static a k(w1.u uVar, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            o(3, uVar, false);
        }
        String strD = uVar.D((int) uVar.w());
        int length = strD.length();
        long jW = uVar.w();
        String[] strArr = new String[(int) jW];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jW; i10++) {
            String strD2 = uVar.D((int) uVar.w());
            strArr[i10] = strD2;
            length2 = length2 + 4 + strD2.length();
        }
        if (z11 && (uVar.G() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strD, strArr, length2 + 1);
    }

    public static c l(w1.u uVar) throws ParserException {
        o(1, uVar, false);
        int iX = uVar.x();
        int iG = uVar.G();
        int iX2 = uVar.x();
        int iT = uVar.t();
        if (iT <= 0) {
            iT = -1;
        }
        int iT2 = uVar.t();
        if (iT2 <= 0) {
            iT2 = -1;
        }
        int iT3 = uVar.t();
        if (iT3 <= 0) {
            iT3 = -1;
        }
        int iG2 = uVar.G();
        return new c(iX, iG, iX2, iT, iT2, iT3, (int) Math.pow(2.0d, iG2 & 15), (int) Math.pow(2.0d, (iG2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (uVar.G() & 1) > 0, Arrays.copyOf(uVar.e(), uVar.g()));
    }

    public static b[] m(w1.u uVar, int i10) throws ParserException {
        o(5, uVar, false);
        int iG = uVar.G() + 1;
        q0 q0Var = new q0(uVar.e());
        q0Var.e(uVar.f() * 8);
        for (int i11 = 0; i11 < iG; i11++) {
            n(q0Var);
        }
        int iD = q0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q0Var.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q0Var);
        i(q0Var);
        g(i10, q0Var);
        b[] bVarArrH = h(q0Var);
        if (q0Var.c()) {
            return bVarArrH;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void n(q0 q0Var) throws ParserException {
        long jC;
        if (q0Var.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + q0Var.b(), null);
        }
        int iD = q0Var.d(16);
        int iD2 = q0Var.d(24);
        int iD3 = 0;
        if (q0Var.c()) {
            q0Var.e(5);
            while (iD3 < iD2) {
                iD3 += q0Var.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q0Var.e(5);
                } else if (q0Var.c()) {
                    q0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q0Var.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q0Var.e(32);
            q0Var.e(32);
            int iD5 = q0Var.d(4) + 1;
            q0Var.e(1);
            if (iD4 == 1) {
                jC = iD != 0 ? c(iD2, iD) : 0L;
            } else {
                jC = ((long) iD) * ((long) iD2);
            }
            q0Var.e((int) (jC * ((long) iD5)));
        }
    }

    public static boolean o(int i10, w1.u uVar, boolean z10) throws ParserException {
        if (uVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a("too short header: " + uVar.a(), null);
        }
        if (uVar.G() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (uVar.G() == 118 && uVar.G() == 111 && uVar.G() == 114 && uVar.G() == 98 && uVar.G() == 105 && uVar.G() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
