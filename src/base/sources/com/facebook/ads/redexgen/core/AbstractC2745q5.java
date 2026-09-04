package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2745q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2745q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2745q5(BG bg2) {
        this();
    }

    public static AbstractC2744q4<Object> A00(int expectedKeys) {
        AbstractC2575nJ.A00(expectedKeys, A03(0, 12, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE));
        return new BG(expectedKeys);
    }

    public static <K0> AbstractC2744q4<K0> A01(Comparator<K0> comparator) {
        AbstractC2428ki.A04(comparator);
        return new BF(comparator);
    }

    public static AbstractC2744q4<Comparable> A02() {
        return A01(AbstractC2760qK.A03());
    }
}
