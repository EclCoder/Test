package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1615Ti {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 52, 60, 60, 50, 53, 60, 123, 21, 62, 47, 44, 52, 41, 48, 123, 30, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, 61, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, 27, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static JSONObject A01(T8 t10, long j10, long j11, long j12, long j13, int i10, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j10);
                try {
                    jSONObject.put(A00(21, 8, 54), j11 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j12);
                        try {
                            jSONObject.put(A00(79, 11, 45), j13);
                            try {
                                jSONObject.put(A00(34, 16, 56), i10);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE), exc.getMessage());
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                t10.A08().A4I(e);
                            }
                        } catch (JSONException e11) {
                            e = e11;
                        }
                    } catch (JSONException e12) {
                        e = e12;
                    }
                } catch (JSONException e13) {
                    e = e13;
                }
            } catch (JSONException e14) {
                e = e14;
            }
        } catch (JSONException e15) {
            e = e15;
        }
        return jSONObject;
    }

    public static void A03(T8 t10, long j10, long j11, long j12, long j13, int i10, Exception exc) {
        C1611Te c1611Te = new C1611Te(A00(0, 21, 43));
        c1611Te.A05(1);
        c1611Te.A07(A01(t10, j10, j11, j12, j13, i10, exc));
        t10.A08().ACA(A00(50, 7, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE), AbstractC1610Td.A20, c1611Te);
    }
}
