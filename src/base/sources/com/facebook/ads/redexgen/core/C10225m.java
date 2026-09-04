package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10225m extends E8 {
    public static byte[] A01;
    public final /* synthetic */ C1974d4 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public C10225m(C1974d4 c1974d4) {
        this.A00 = c1974d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e10) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1972d2(this));
        this.A00.A0B.AGR(A00(0, 5, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), this.A00.A03());
    }
}
