package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1433Mc implements XN {
    public static byte[] A01;
    public final /* synthetic */ MW A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, 38, 41, 44, 38, 46};
    }

    public C1433Mc(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0V(false, A00(0, 9, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE));
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f10) {
    }
}
