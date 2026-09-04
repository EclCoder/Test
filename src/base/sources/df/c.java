package df;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.zxing.WriterException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f36724a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36725a;

        static {
            int[] iArr = new int[cf.b.values().length];
            f36725a = iArr;
            try {
                iArr[cf.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36725a[cf.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36725a[cf.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36725a[cf.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, ue.a aVar, String str2) throws WriterException {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.d(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void b(CharSequence charSequence, ue.a aVar) throws WriterException {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iP = p(charSequence.charAt(i10));
            if (iP == -1) {
                throw new WriterException();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iP2 = p(charSequence.charAt(i11));
                if (iP2 == -1) {
                    throw new WriterException();
                }
                aVar.d((iP * 45) + iP2, 11);
                i10 += 2;
            } else {
                aVar.d(iP, 6);
                i10 = i11;
            }
        }
    }

    static void c(String str, cf.b bVar, ue.a aVar, String str2) throws WriterException {
        int i10 = a.f36725a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else {
            if (i10 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
            }
            e(str, aVar);
        }
    }

    private static void d(ue.c cVar, ue.a aVar) {
        aVar.d(cf.b.ECI.d(), 4);
        aVar.d(cVar.d(), 8);
    }

    static void e(String str, ue.a aVar) throws WriterException {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                int i13 = 33088;
                if (i12 >= 33088 && i12 <= 40956) {
                    i10 = i12 - i13;
                } else if (i12 < 57408 || i12 > 60351) {
                    i10 = -1;
                } else {
                    i13 = 49472;
                    i10 = i12 - i13;
                }
                if (i10 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                aVar.d(((i10 >> 8) * PsExtractor.AUDIO_STREAM) + (i10 & 255), 13);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void f(int i10, cf.c cVar, cf.b bVar, ue.a aVar) throws WriterException {
        int iE = bVar.e(cVar);
        int i11 = 1 << iE;
        if (i10 < i11) {
            aVar.d(i10, iE);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(cf.b bVar, ue.a aVar) {
        aVar.d(bVar.d(), 4);
    }

    static void h(CharSequence charSequence, ue.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.d((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.d((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.d(iCharAt, 4);
                }
            }
        }
    }

    private static int i(cf.b bVar, ue.a aVar, ue.a aVar2, cf.c cVar) {
        return aVar.i() + bVar.e(cVar) + aVar2.i();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(ue.a aVar, cf.a aVar2, cf.c cVar, b bVar) throws WriterException {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int iJ = j(bVar);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    private static cf.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return cf.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return cf.b.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return cf.b.ALPHANUMERIC;
        }
        return z11 ? cf.b.NUMERIC : cf.b.BYTE;
    }

    private static cf.c m(int i10, cf.a aVar) throws WriterException {
        for (int i11 = 1; i11 <= 40; i11++) {
            cf.c cVarE = cf.c.e(i11);
            if (v(i10, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public static f n(String str, cf.a aVar, Map map) throws WriterException {
        cf.c cVarT;
        ue.c cVarA;
        boolean z10 = map != null && map.containsKey(com.google.zxing.c.CHARACTER_SET);
        String string = z10 ? map.get(com.google.zxing.c.CHARACTER_SET).toString() : "ISO-8859-1";
        cf.b bVarL = l(str, string);
        ue.a aVar2 = new ue.a();
        cf.b bVar = cf.b.BYTE;
        if (bVarL == bVar && z10 && (cVarA = ue.c.a(string)) != null) {
            d(cVarA, aVar2);
        }
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.GS1_FORMAT;
            if (map.containsKey(cVar) && Boolean.valueOf(map.get(cVar).toString()).booleanValue()) {
                g(cf.b.FNC1_FIRST_POSITION, aVar2);
            }
        }
        g(bVarL, aVar2);
        ue.a aVar3 = new ue.a();
        c(str, bVarL, aVar3, string);
        if (map != null) {
            com.google.zxing.c cVar2 = com.google.zxing.c.QR_VERSION;
            if (map.containsKey(cVar2)) {
                cVarT = cf.c.e(Integer.parseInt(map.get(cVar2).toString()));
                if (!v(i(bVarL, aVar2, aVar3, cVarT), cVarT, aVar)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                cVarT = t(aVar, bVarL, aVar2, aVar3);
            }
        } else {
            cVarT = t(aVar, bVarL, aVar2, aVar3);
        }
        ue.a aVar4 = new ue.a();
        aVar4.c(aVar2);
        f(bVarL == bVar ? aVar3.j() : str.length(), cVarT, bVarL, aVar4);
        aVar4.c(aVar3);
        cf.c.b bVarC = cVarT.c(aVar);
        int iD = cVarT.d() - bVarC.d();
        u(iD, aVar4);
        ue.a aVarR = r(aVar4, cVarT.d(), iD, bVarC.c());
        f fVar = new f();
        fVar.c(aVar);
        fVar.f(bVarL);
        fVar.g(cVarT);
        int iB = cVarT.b();
        b bVar2 = new b(iB, iB);
        int iK = k(aVarR, aVar, cVarT, bVar2);
        fVar.d(iK);
        e.a(aVarR, aVar, cVarT, iK, bVar2);
        fVar.e(bVar2);
        return fVar;
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        new ve.c(ve.a.f55405l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f36724a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws WriterException {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static cf.c t(cf.a aVar, cf.b bVar, ue.a aVar2, ue.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, cf.c.e(1)), aVar)), aVar);
    }

    private static boolean v(int i10, cf.c cVar, cf.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }

    static void u(int i10, ue.a aVar) throws WriterException {
        int i11 = i10 << 3;
        if (aVar.i() > i11) {
            throw new WriterException(jyeoXJ.zQG + aVar.i() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.i() < i11; i12++) {
            aVar.b(false);
        }
        int i13 = aVar.i() & 7;
        if (i13 > 0) {
            while (i13 < 8) {
                aVar.b(false);
                i13++;
            }
        }
        int iJ = i10 - aVar.j();
        for (int i14 = 0; i14 < iJ; i14++) {
            aVar.d((i14 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.i() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static ue.a r(ue.a aVar, int i10, int i11, int i12) throws WriterException {
        if (aVar.j() == i11) {
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int iMax = 0;
            int iMax2 = 0;
            while (i13 < i12) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i15 = i10;
                int i16 = i11;
                int i17 = i12;
                q(i15, i16, i17, i13, iArr, iArr2);
                int i18 = iArr[0];
                byte[] bArr = new byte[i18];
                aVar.l(i14 << 3, bArr, 0, i18);
                byte[] bArrO = o(bArr, iArr2[0]);
                arrayList.add(new df.a(bArr, bArrO));
                iMax = Math.max(iMax, i18);
                iMax2 = Math.max(iMax2, bArrO.length);
                i14 += iArr[0];
                i13++;
                i10 = i15;
                i11 = i16;
                i12 = i17;
            }
            int i19 = i10;
            if (i11 == i14) {
                ue.a aVar2 = new ue.a();
                for (int i20 = 0; i20 < iMax; i20++) {
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        byte[] bArrA = ((df.a) obj).a();
                        if (i20 < bArrA.length) {
                            aVar2.d(bArrA[i20], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < iMax2; i22++) {
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj2 = arrayList.get(i23);
                        i23++;
                        byte[] bArrB = ((df.a) obj2).b();
                        if (i22 < bArrB.length) {
                            aVar2.d(bArrB[i22], 8);
                        }
                    }
                }
                if (i19 == aVar2.j()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i19 + " and " + aVar2.j() + giNWGaNAgVQoO.yRMSHEA);
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }
}
