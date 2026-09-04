package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1476Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1604Sx A00;
    public EnumC1859bD A01 = EnumC1859bD.A05;
    public ArrayList<C1982dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1475Nt A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C1476Nu(C2198gi c2198gi, O8 o10, InterfaceC1475Nt interfaceC1475Nt, String str) {
        JSONObject dataObject = o10.A03();
        this.A03 = A01(c2198gi, o10, str, dataObject);
        this.A04 = interfaceC1475Nt;
    }

    private AdError A00(C2198gi c2198gi, AbstractC2363jd abstractC2363jd) {
        if (abstractC2363jd == null || abstractC2363jd.A2G().isEmpty()) {
            c2198gi.A08().ABC(A04(62, 3, 33), AbstractC1610Td.A0Z, new C1611Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C2198gi c2198gi, O8 o10, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C2357jT.A01(jSONObject, c2198gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C10757n.A00(jSONObject, c2198gi);
        }
        nqA00.A1M(str);
        C1630Tx c1630TxA01 = o10.A01();
        if (c1630TxA01 != null) {
            nqA00.A1I(c1630TxA01.A06());
        }
        return nqA00;
    }

    private C1604Sx A03(C2198gi c2198gi) {
        return this.A00 != null ? this.A00 : new C1604Sx(c2198gi);
    }

    private void A08(C2198gi c2198gi, C10757n c10757n) {
        C1470No playableData = c10757n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1859bD.A05);
        C2343jC c2343jC = new C2343jC(this);
        C1604Sx c1604Sx = new C1604Sx(c2198gi);
        boolean z10 = C1648Up.A2H(c2198gi) && SN.A0A(c10757n.A1H());
        if (z10) {
            SN unifiedAssetsLoader = new SN(c1604Sx, c10757n.A1H(), c10757n.A10(), c10757n.A1D(), z10, new C2342jB(this));
            c1604Sx.A0e(new VI(c10757n.A2E(), c2198gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c2198gi, c10757n, true, c2343jC);
    }

    private void A09(C2198gi c2198gi, EnumSet<CacheFlag> enumSet, AbstractC2363jd abstractC2363jd, int i10, InterfaceC1475Nt interfaceC1475Nt) {
        boolean isDSL = abstractC2363jd.A1g();
        C1604Sx c1604SxA03 = A03(c2198gi);
        c1604SxA03.A0e(new VI(abstractC2363jd.A2E(), c2198gi.A0A()));
        boolean z10 = C1648Up.A2H(c2198gi) && SN.A0A(abstractC2363jd.A1H());
        if (z10) {
            new SN(c1604SxA03, abstractC2363jd.A1H(), abstractC2363jd.A10(), abstractC2363jd.A1D(), z10, new C2346jF(this, c2198gi, isDSL, abstractC2363jd, interfaceC1475Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE);
        if (isDSL) {
            C1600St c1600St = new C1600St(abstractC2363jd.A0x(), abstractC2363jd.A1D(), strA04);
            c1600St.A04 = true;
            c1600St.A03 = A04(0, 5, 78);
            c1604SxA03.A0Y(c1600St);
        }
        c1604SxA03.A0d(new C1602Sv(abstractC2363jd.A2C().A01(), C2035e4.A04, C2035e4.A04, abstractC2363jd.A1D(), A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean zA30 = C1648Up.A30(c2198gi, C2125fX.A03());
        for (NR nr : abstractC2363jd.A2G()) {
            C1602Sv c1602Sv = new C1602Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2363jd.A1D(), A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE));
            if (i11 == 0) {
                c1604SxA03.A0c(c1602Sv);
            } else {
                c1604SxA03.A0d(c1602Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1604SxA03.A0d(new C1602Sv(it.next(), -1, -1, abstractC2363jd.A1D(), A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1600St c1600St2 = new C1600St(nr.A0H().A09(), abstractC2363jd.A1D(), A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE), nr.A0H().A06());
                c1600St2.A04 = false;
                if (i11 == 0) {
                    if (isDSL && !zA30) {
                        c1604SxA03.A0Y(c1600St2);
                    } else {
                        c1604SxA03.A0b(c1600St2);
                    }
                } else if (isDSL && !zA30) {
                    c1604SxA03.A0Z(c1600St2);
                } else {
                    c1604SxA03.A0a(c1600St2);
                }
            }
            i11++;
        }
        if (abstractC2363jd.A1W() && !TextUtils.isEmpty(abstractC2363jd.A11())) {
            c1604SxA03.A0d(new C1602Sv(abstractC2363jd.A11(), C1512Pe.A0A, C1512Pe.A0A, abstractC2363jd.A1D(), A04(96, 12, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE)));
        }
        O0.A00(abstractC2363jd, c1604SxA03, strA04);
        c1604SxA03.A0X(new C2344jD(this, c2198gi, isDSL, abstractC2363jd, interfaceC1475Nt), new C1597Sq(abstractC2363jd.A1D(), strA04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2198gi c2198gi, EnumSet<CacheFlag> enumSet, C2357jT c2357jT, AbstractC2363jd abstractC2363jd, int i10, InterfaceC1475Nt interfaceC1475Nt) {
        A09(c2198gi, enumSet, abstractC2363jd, i10, new C2348jH(this, c2198gi, abstractC2363jd, c2357jT, i10, interfaceC1475Nt, enumSet));
    }

    private void A0B(EnumC1859bD enumC1859bD) {
        this.A01 = enumC1859bD;
    }

    private boolean A0C(C2198gi c2198gi, AbstractC2363jd abstractC2363jd) {
        AdError adErrorA00 = A00(c2198gi, abstractC2363jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.facebook.ads.redexgen.core.AbstractC2363jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1476Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1476Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1476Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1476Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1476Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1476Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1476Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1859bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2357jT) this.A03).A2A();
        }
        return ((AbstractC2363jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2198gi c2198gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2357jT c2357jT = (C2357jT) this.A03;
            AbstractC2363jd abstractC2363jdA26 = c2357jT.A26();
            if (A0C(c2198gi, abstractC2363jdA26) || abstractC2363jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c2198gi, enumSet, c2357jT, abstractC2363jdA26, 0, this.A04);
            return;
        }
        AbstractC2363jd abstractC2363jd = (AbstractC2363jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2198gi, abstractC2363jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C10757n c10757n = (C10757n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2198gi, c10757n);
                return;
            } else {
                A08(c2198gi, c10757n);
                return;
            }
        }
        A09(c2198gi, enumSet, (C10757n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2363jd abstractC2363jd) {
        return !TextUtils.isEmpty(abstractC2363jd.A29().A0H().A09());
    }
}
