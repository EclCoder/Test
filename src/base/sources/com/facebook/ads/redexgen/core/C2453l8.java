package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2453l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C10054v A02 = new C10054v();
    public final AnonymousClass53 A03;

    public C2453l8(int i10, AnonymousClass53 anonymousClass53, int i11) {
        this.A00 = i10;
        this.A03 = anonymousClass53;
        this.A01 = i11;
    }

    private C1301Gz A00(C10054v c10054v, long j10, long j11) {
        int iA00;
        int iA01;
        int iA0A = c10054v.A0A();
        long j12 = -1;
        long j13 = -1;
        long lastPcrTimeUsInRange = C.TIME_UNSET;
        while (c10054v.A07() >= 188 && (iA01 = (iA00 = LI.A00(c10054v.A0l(), c10054v.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = LI.A01(c10054v, iA00, this.A00);
            if (jA01 != C.TIME_UNSET) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j10) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == C.TIME_UNSET) {
                        return C1301Gz.A04(jA06, j11);
                    }
                    return C1301Gz.A03(j11 + j12);
                }
                long j14 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j14 > j10) {
                        return C1301Gz.A03(((long) iA00) + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j14 > j10) {
                        return C1301Gz.A03(((long) iA00) + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c10054v.A0f(iA01);
            j13 = iA01;
        }
        if (lastPcrTimeUsInRange != C.TIME_UNSET) {
            return C1301Gz.A05(lastPcrTimeUsInRange, j11 + j13);
        }
        return C1301Gz.A03;
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final C1301Gz AIw(InterfaceC2549ms interfaceC2549ms, long j10) throws IOException {
        long jA8n = interfaceC2549ms.A8n();
        int iMin = (int) Math.min(this.A01, interfaceC2549ms.A8O() - jA8n);
        this.A02.A0d(iMin);
        interfaceC2549ms.AGt(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j10, jA8n);
    }
}
