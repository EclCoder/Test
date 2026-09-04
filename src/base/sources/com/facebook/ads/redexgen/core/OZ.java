package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.AdSDKNotificationListener;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class OZ implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{112, 123, 118, 103, 108, 101, 97, 112, 113, 74, 118, 101, 120, 57, 61, 32, 34, 53, 35, 35, 57, 63, 62};
    }

    public OZ(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            for (AdSDKNotificationListener adSDKNotificationListener : this.A01) {
                Bundle data = new Bundle();
                data.putString(A00(0, 13, 63), this.A00);
                adSDKNotificationListener.onAdEvent(A00(13, 10, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE), data);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
