package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1341In extends AbstractC2142fo {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1337Ij A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C1341In(AbstractC1337Ij abstractC1337Ij) {
        this.A00 = abstractC1337Ij;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2142fo
    public final void A03() {
        if (!this.A00.A0A.A07()) {
            this.A00.A0A.A05();
            if (!TextUtils.isEmpty(this.A00.A06.A2E())) {
                Map<String, String> mapA05 = new C1855b9().A03(this.A00.A0D).A02(this.A00.A0A).A04(this.A00.A06.A0z()).A05();
                mapA05.put(A00(0, 16, 42), A00(0, 0, 96) + this.A00.A02);
                this.A00.A08.ABJ(this.A00.A06.A2E(), mapA05);
                C1694Wl.A00(this.A00.A07).A0E(this.A00.A0C.A8l(), this.A00.A06.A2E());
                C1462Ng.A07(this.A00.A06.A2A(), this.A00.A07);
                this.A00.A07.A0F().A3L();
                if (!this.A00.A04) {
                    AbstractC1482Oa.A02(this.A00.A06.A0y(), AbstractC1718Xm.A00(this.A00.A06.A10()));
                }
                if (!this.A00.A05) {
                    this.A00.A0B.A4j(this.A00.A0C.A8G());
                }
            }
        }
    }
}
