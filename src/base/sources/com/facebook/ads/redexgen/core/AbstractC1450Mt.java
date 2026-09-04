package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1450Mt {
    public static byte[] A04;
    public InterfaceC1448Mr A00;
    public final C2198gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC1447Mq A0G(String str);

    public AbstractC1450Mt(C2198gi c2198gi, VA va2, String str) {
        this.A01 = c2198gi;
        this.A02 = va2;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
    }

    public static String A0C(AbstractC1450Mt abstractC1450Mt) {
        if (abstractC1450Mt instanceof AnonymousClass84) {
            return A0B(6, 10, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC1448Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC1448Mr interfaceC1448Mr) {
        this.A00 = interfaceC1448Mr;
    }
}
