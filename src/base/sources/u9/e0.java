package u9;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f54269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54270c;

        public a(String str, String[] strArr, int i10) {
            this.f54268a = str;
            this.f54269b = strArr;
            this.f54270c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f54271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54274d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f54271a = z10;
            this.f54272b = i10;
            this.f54273c = i11;
            this.f54274d = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f54279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f54280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f54281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f54282h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f54283i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f54284j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f54275a = i10;
            this.f54276b = i11;
            this.f54277c = i12;
            this.f54278d = i13;
            this.f54279e = i14;
            this.f54280f = i15;
            this.f54281g = i16;
            this.f54282h = i17;
            this.f54283i = z10;
            this.f54284j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static ha.a c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] strArrZ0 = r0.Z0(str, "=");
            if (strArrZ0.length != 2) {
                ob.u.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrZ0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ka.a.a(new ob.d0(Base64.decode(strArrZ0[1], 0))));
                } catch (RuntimeException e10) {
                    ob.u.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new pa.a(strArrZ0[0], strArrZ0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ha.a(arrayList);
    }

    private static void d(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = d0Var.d(16);
            if (iD2 == 0) {
                d0Var.e(8);
                d0Var.e(16);
                d0Var.e(16);
                d0Var.e(6);
                d0Var.e(8);
                int iD3 = d0Var.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    d0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = d0Var.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = d0Var.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = d0Var.d(3) + 1;
                    int iD6 = d0Var.d(2);
                    if (iD6 > 0) {
                        d0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        d0Var.e(8);
                    }
                }
                d0Var.e(2);
                int iD7 = d0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        d0Var.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void e(int i10, d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = d0Var.d(16);
            if (iD2 != 0) {
                ob.u.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = d0Var.c() ? d0Var.d(4) + 1 : 1;
                if (d0Var.c()) {
                    int iD4 = d0Var.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        d0Var.e(a(i13));
                        d0Var.e(a(i13));
                    }
                }
                if (d0Var.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        d0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    d0Var.e(8);
                    d0Var.e(8);
                    d0Var.e(8);
                }
            }
        }
    }

    private static b[] f(d0 d0Var) {
        int iD = d0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(d0Var.c(), d0Var.d(16), d0Var.d(16), d0Var.d(8));
        }
        return bVarArr;
    }

    private static void g(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (d0Var.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            d0Var.e(24);
            d0Var.e(24);
            d0Var.e(24);
            int iD2 = d0Var.d(6) + 1;
            d0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((d0Var.c() ? d0Var.d(5) : 0) * 8) + d0Var.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        d0Var.e(8);
                    }
                }
            }
        }
    }

    public static a h(ob.d0 d0Var) {
        return i(d0Var, true, true);
    }

    public static a i(ob.d0 d0Var, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            m(3, d0Var, false);
        }
        String strE = d0Var.E((int) d0Var.x());
        int length = strE.length();
        long jX = d0Var.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jX; i10++) {
            String strE2 = d0Var.E((int) d0Var.x());
            strArr[i10] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z11 && (d0Var.H() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c j(ob.d0 d0Var) throws ParserException {
        m(1, d0Var, false);
        int iY = d0Var.y();
        int iH = d0Var.H();
        int iY2 = d0Var.y();
        int iU = d0Var.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = d0Var.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = d0Var.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = d0Var.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (d0Var.H() & 1) > 0, Arrays.copyOf(d0Var.e(), d0Var.g()));
    }

    public static b[] k(ob.d0 d0Var, int i10) throws ParserException {
        m(5, d0Var, false);
        int iH = d0Var.H() + 1;
        d0 d0Var2 = new d0(d0Var.e());
        d0Var2.e(d0Var.f() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            l(d0Var2);
        }
        int iD = d0Var2.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (d0Var2.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(d0Var2);
        g(d0Var2);
        e(i10, d0Var2);
        b[] bVarArrF = f(d0Var2);
        if (d0Var2.c()) {
            return bVarArrF;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void l(d0 d0Var) throws ParserException {
        long jB;
        if (d0Var.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + d0Var.b(), null);
        }
        int iD = d0Var.d(16);
        int iD2 = d0Var.d(24);
        int iD3 = 0;
        if (d0Var.c()) {
            d0Var.e(5);
            while (iD3 < iD2) {
                iD3 += d0Var.d(a(iD2 - iD3));
            }
        } else {
            boolean zC = d0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    d0Var.e(5);
                } else if (d0Var.c()) {
                    d0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = d0Var.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            d0Var.e(32);
            d0Var.e(32);
            int iD5 = d0Var.d(4) + 1;
            d0Var.e(1);
            if (iD4 == 1) {
                jB = iD != 0 ? b(iD2, iD) : 0L;
            } else {
                jB = ((long) iD) * ((long) iD2);
            }
            d0Var.e((int) (jB * ((long) iD5)));
        }
    }

    public static boolean m(int i10, ob.d0 d0Var, boolean z10) throws ParserException {
        if (d0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a("too short header: " + d0Var.a(), null);
        }
        if (d0Var.H() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (d0Var.H() == 118 && d0Var.H() == 111 && d0Var.H() == 114 && d0Var.H() == 98 && d0Var.H() == 105 && d0Var.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
