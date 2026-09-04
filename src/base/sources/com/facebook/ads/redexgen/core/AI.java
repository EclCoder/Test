package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AI implements InterfaceC2694pF {
    public static byte[] A00;
    public static final C5Y A01;
    public static final AI A02;

    public static /* synthetic */ AI A00() {
        return new AI();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, 20, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    static {
        A02();
        A02 = new AI();
        A01 = new C5Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.facebook.ads.redexgen.core.C5Y
            public final InterfaceC2694pF A5I() {
                return AI.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final void A43(InterfaceC10295t interfaceC10295t) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final long AGi(C10185i c10185i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09382c
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
