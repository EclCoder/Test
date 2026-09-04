package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2431kl {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> InterfaceC2429kj<T> A00(InterfaceC2429kj<? super T> first, InterfaceC2429kj<? super T> second) {
        return new C9(A04((InterfaceC2429kj) AbstractC2428ki.A04(first), (InterfaceC2429kj) AbstractC2428ki.A04(second)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A02(String methodName, Iterable<?> components) {
        StringBuilder sbAppend = new StringBuilder(A01(0, 11, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE)).append(methodName).append('(');
        boolean z10 = true;
        for (Object obj : components) {
            if (!z10) {
                sbAppend.append(',');
            }
            sbAppend.append(obj);
            z10 = false;
        }
        return sbAppend.append(')').toString();
    }

    public static void A05() {
        A00 = new byte[]{59, 93, 80, 79, 84, 78, 76, 95, 80, 94, 25};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> List<InterfaceC2429kj<? super T>> A04(InterfaceC2429kj<? super T> first, InterfaceC2429kj<? super T> second) {
        return Arrays.asList(first, second);
    }
}
