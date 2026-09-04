package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09964m {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(Context context, C09994p c09994p) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC09823y.A01((TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            C09954l callback = new C09954l(c09994p);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c09994p.A07(5);
        }
    }
}
