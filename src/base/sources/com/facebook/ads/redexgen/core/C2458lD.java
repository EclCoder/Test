package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2458lD implements H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C10054v A00;
    public final AnonymousClass53 A01;

    public C2458lD(AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new C10054v();
    }

    private C1301Gz A00(C10054v c10054v, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA010 = -1;
        long j10 = C.TIME_UNSET;
        while (c10054v.A07() >= 4) {
            if (C2457lC.A00(c10054v.A0l(), c10054v.A09()) != 442) {
                c10054v.A0g(1);
            } else {
                c10054v.A0g(4);
                long jA06 = L6.A06(c10054v);
                if (jA06 != C.TIME_UNSET) {
                    long jA07 = this.A01.A06(jA06);
                    if (jA07 > scrValue) {
                        if (j10 == C.TIME_UNSET) {
                            return C1301Gz.A04(jA07, scrTimeUs);
                        }
                        return C1301Gz.A03(((long) iA09) + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + jA07;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C1301Gz.A03(((long) c10054v.A09()) + scrTimeUs);
                    }
                    j10 = jA07;
                    iA09 = c10054v.A09();
                }
                A01(c10054v);
                iA010 = c10054v.A09();
            }
        }
        if (j10 != C.TIME_UNSET) {
            return C1301Gz.A05(j10, ((long) iA010) + scrTimeUs);
        }
        return C1301Gz.A03;
    }

    public static void A01(C10054v c10054v) {
        int systemHeaderLength = c10054v.A0A();
        if (c10054v.A07() < 10) {
            c10054v.A0f(systemHeaderLength);
            return;
        }
        c10054v.A0g(9);
        int limit = c10054v.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c10054v.A07();
        if (limit2 < packStuffingLength) {
            c10054v.A0f(systemHeaderLength);
            return;
        }
        c10054v.A0g(packStuffingLength);
        int limit3 = c10054v.A07();
        if (limit3 < 4) {
            c10054v.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c10054v.A0l();
        int limit4 = c10054v.A09();
        if (C2457lC.A00(bArrA0l, limit4) == 443) {
            c10054v.A0g(4);
            int packStuffingLength2 = c10054v.A0M();
            int limit5 = c10054v.A07();
            if (limit5 < packStuffingLength2) {
                c10054v.A0f(systemHeaderLength);
                return;
            }
            c10054v.A0g(packStuffingLength2);
        }
        while (limit >= 4) {
            byte[] bArrA0l2 = c10054v.A0l();
            int limit6 = c10054v.A09();
            int packStuffingLength3 = C2457lC.A00(bArrA0l2, limit6);
            if (packStuffingLength3 == 442 || packStuffingLength3 == 441 || (packStuffingLength3 >>> 8) != 1) {
                return;
            }
            c10054v.A0g(4);
            if (c10054v.A07() < 2) {
                c10054v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c10054v.A0M();
            int packStuffingLength4 = c10054v.A0A();
            int limit7 = c10054v.A09();
            c10054v.A0f(Math.min(packStuffingLength4, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AFs() {
        this.A00.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final C1301Gz AIw(InterfaceC2549ms interfaceC2549ms, long j10) throws IOException {
        long jA8n = interfaceC2549ms.A8n();
        int iMin = (int) Math.min(20000L, interfaceC2549ms.A8O() - jA8n);
        this.A00.A0d(iMin);
        interfaceC2549ms.AGt(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j10, jA8n);
    }
}
