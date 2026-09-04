package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1457Nb implements Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = 6010729991575063286L;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{25, 22, 26, 24, 25, 37, 89, 86, 80, 2, -12, -17, -1, -13};
    }

    public C1457Nb(String str, int i10, int i11) {
        this.A02 = str;
        this.A01 = i10;
        this.A00 = i11;
    }

    public static C1457Nb A00(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(A01(6, 3, 111))) == null) {
            return null;
        }
        return new C1457Nb(strOptString, jSONObject.optInt(A01(9, 5, 22), 0), jSONObject.optInt(A01(0, 6, 60), 0));
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }
}
