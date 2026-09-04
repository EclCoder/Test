package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass53 A07 = new AnonymousClass53(0);
    public long A01 = C.TIME_UNSET;
    public long A02 = C.TIME_UNSET;
    public long A00 = C.TIME_UNSET;
    public final C10054v A06 = new C10054v();

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, 63, 42, 53, 50, 45, -23, 45, 62, 59, 42, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC2549ms interfaceC2549ms) {
        this.A06.A0i(C5C.A07);
        this.A03 = true;
        interfaceC2549ms.AIl();
        return 0;
    }

    private int A01(InterfaceC2549ms interfaceC2549ms, HV hv) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC2549ms.A8O());
        if (interfaceC2549ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        C10054v c10054v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c10054v.A0d(iMin);
        interfaceC2549ms.AIl();
        interfaceC2549ms.AGt(this.A06.A0l(), 0, iMin);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2549ms interfaceC2549ms, HV hv) throws IOException {
        long jA8O = interfaceC2549ms.A8O();
        int iMin = (int) Math.min(20000L, jA8O);
        long j10 = jA8O - ((long) iMin);
        long searchStartPosition = interfaceC2549ms.A8n();
        if (searchStartPosition != j10) {
            hv.A00 = j10;
            return 1;
        }
        this.A06.A0d(iMin);
        interfaceC2549ms.AIl();
        interfaceC2549ms.AGt(this.A06.A0l(), 0, iMin);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i10) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private long A04(C10054v c10054v) {
        int iA0A = c10054v.A0A();
        for (int iA09 = c10054v.A09(); iA09 < searchStartPosition; iA09++) {
            int searchEndPosition = A03(c10054v.A0l(), iA09);
            if (searchEndPosition == 442) {
                int searchStartPosition = iA09 + 4;
                c10054v.A0f(searchStartPosition);
                long jA06 = A06(c10054v);
                if (jA06 != C.TIME_UNSET) {
                    return jA06;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private long A05(C10054v c10054v) {
        int iA09 = c10054v.A09();
        int searchStartPosition = c10054v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= iA09; nextStartCode--) {
            int searchEndPosition = A03(c10054v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c10054v.A0f(searchStartPosition2);
                long jA06 = A06(c10054v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (jA06 != C.TIME_UNSET) {
                    return jA06;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long A06(C10054v c10054v) {
        int iA09 = c10054v.A09();
        if (c10054v.A07() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c10054v.A0k(bArr, 0, originalPosition);
        c10054v.A0f(iA09);
        return !A0A(bArr) ? C.TIME_UNSET : A07(bArr);
    }

    public static long A07(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC2549ms interfaceC2549ms, HV hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC2549ms, hv);
        }
        if (this.A02 == C.TIME_UNSET) {
            return A00(interfaceC2549ms);
        }
        if (!this.A04) {
            return A01(interfaceC2549ms, hv);
        }
        if (this.A01 == C.TIME_UNSET) {
            return A00(interfaceC2549ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC09904g.A07(A08(45, 16, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE), A08(27, 18, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE) + this.A00 + A08(0, 27, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE));
            this.A00 = C.TIME_UNSET;
        }
        return A00(interfaceC2549ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final AnonymousClass53 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
