package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2569nD extends AbstractC1247Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C1239Eo A00;

    public abstract Pair<C10807s[], InterfaceC2570nE[]> A0d(C1239Eo c1239Eo, int[][][] iArr, int[] iArr2, C2606no c2606no, Timeline timeline) throws AD;

    public static int A0Y(InterfaceC10777p[] interfaceC10777pArr, C2721pg c2721pg, int[] iArr, boolean z10) throws AD {
        int length = interfaceC10777pArr.length;
        int formatSupportLevel = 0;
        int i10 = 1;
        for (int i11 = 0; i11 < bestRendererIndex; i11++) {
            InterfaceC10777p interfaceC10777p = interfaceC10777pArr[i11];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC10777p.AKM(c2721pg.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC10707i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i11];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z10 && i10 == 0 && bestRendererIndex3 != 0)) {
                length = i11;
                formatSupportLevel = iMax;
                i10 = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC10777p interfaceC10777p, C2721pg c2721pg) throws AD {
        int[] iArr = new int[c2721pg.A01];
        for (int i10 = 0; i10 < c2721pg.A01; i10++) {
            iArr[i10] = interfaceC10777p.AKM(c2721pg.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC10777p[] interfaceC10777pArr) throws AD {
        int[] iArr = new int[interfaceC10777pArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iAKO = interfaceC10777pArr[i10].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i11 = str.charAt(23);
            if (i11 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i10] = iAKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1247Ew
    public final C1248Ex A0b(InterfaceC10777p[] interfaceC10777pArr, C2588nW c2588nW, C2606no c2606no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC10777pArr.length + 1];
        C2721pg[][] c2721pgArr = new C2721pg[interfaceC10777pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC10777pArr.length + 1][][];
        for (int i10 = 0; i10 < c2721pgArr.length; i10++) {
            c2721pgArr[i10] = new C2721pg[c2588nW.A01];
            iArr2[i10] = new int[c2588nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC10777pArr);
        for (int i11 = 0; i11 < c2588nW.A01; i11++) {
            C2721pg c2721pgA05 = c2588nW.A05(i11);
            int groupIndex = A0Y(interfaceC10777pArr, c2721pgA05, iArr, c2721pgA05.A02 == 5);
            if (groupIndex == interfaceC10777pArr.length) {
                rendererTrackGroupCounts = new int[c2721pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC10777pArr[groupIndex], c2721pgA05);
            }
            int i12 = iArr[groupIndex];
            c2721pgArr[groupIndex][i12] = c2721pgA05;
            iArr2[groupIndex][i12] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2588nW[] c2588nWArr = new C2588nW[interfaceC10777pArr.length];
        String[] strArr = new String[interfaceC10777pArr.length];
        int[] iArr3 = new int[interfaceC10777pArr.length];
        int i13 = 0;
        while (true) {
            int length = interfaceC10777pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i13 < length) {
                int i14 = iArr[i13];
                c2588nWArr[i13] = new C2588nW((C2721pg[]) C5C.A1I(c2721pgArr[i13], i14));
                iArr2[i13] = (int[][]) C5C.A1I(iArr2[i13], i14);
                strArr[i13] = interfaceC10777pArr[i13].getName();
                iArr3[i13] = interfaceC10777pArr[i13].A9N();
                i13++;
            } else {
                C1239Eo c1239Eo = new C1239Eo(strArr, iArr3, c2588nWArr, iArrA0a, iArr2, new C2588nW((C2721pg[]) C5C.A1I(c2721pgArr[interfaceC10777pArr.length], iArr[interfaceC10777pArr.length])));
                Pair<C10807s[], InterfaceC2570nE[]> pairA0d = A0d(c1239Eo, iArr2, iArrA0a, c2606no, timeline);
                return new C1248Ex((C10807s[]) pairA0d.first, (InterfaceC2570nE[]) pairA0d.second, AbstractC1244Et.A00(c1239Eo, (InterfaceC1241Eq[]) pairA0d.second), c1239Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1247Ew
    public final void A0c(Object obj) {
        this.A00 = (C1239Eo) obj;
    }
}
