package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class UA implements Callable<Boolean> {
    public static byte[] A04;
    public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ T8 A01;
    public final /* synthetic */ C1621To A02;
    public final /* synthetic */ String A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
    }

    static {
        A02();
    }

    public UA(T8 t10, C1621To c1621To, SharedPreferences sharedPreferences, String str) {
        this.A01 = t10;
        this.A02 = c1621To;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        String strA0B;
        String checksumApiFingerprint;
        String strA01 = null;
        if (Build.VERSION.SDK_INT < 31) {
            String strA02 = A01(0, 1, 88);
            String checksumApiFingerprint2 = Build.VERSION.CODENAME;
            if (strA02.equals(checksumApiFingerprint2)) {
                if (C1648Up.A2o(this.A01)) {
                    strA0B = this.A02.A0B();
                    checksumApiFingerprint = A01(6, 19, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
                    if (checksumApiFingerprint.equals(strA0B)) {
                        T8 t10 = this.A01;
                        String checksumApiFingerprint3 = this.A01.getPackageName();
                        strA01 = C1706Xa.A01(t10, checksumApiFingerprint3);
                    }
                }
            }
        } else if (C1648Up.A2o(this.A01)) {
            strA0B = this.A02.A0B();
            checksumApiFingerprint = A01(6, 19, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
            if (checksumApiFingerprint.equals(strA0B)) {
                T8 t11 = this.A01;
                String checksumApiFingerprint4 = this.A01.getPackageName();
                strA01 = C1706Xa.A01(t11, checksumApiFingerprint4);
            }
        }
        if (strA01 == null) {
            T8 t12 = this.A01;
            String checksumApiFingerprint5 = this.A01.getPackageName();
            UB.A00 = C1695Wn.A02(t12, checksumApiFingerprint5);
        } else {
            boolean zA1k = C1648Up.A1k(this.A01);
            String[] strArr = A05;
            String str = strArr[7];
            String checksumApiFingerprint6 = strArr[0];
            if (str.length() == checksumApiFingerprint6.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
            strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
            if (zA1k) {
                T8 t13 = this.A01;
                String checksumApiFingerprint7 = this.A01.getPackageName();
                String strA03 = C1695Wn.A02(t13, checksumApiFingerprint7);
                String checksumApiFingerprint8 = A01(1, 5, 36);
                C1611Te c1611Te = new C1611Te(checksumApiFingerprint8);
                c1611Te.A05(1);
                c1611Te.A06(1);
                c1611Te.A0A(false);
                JSONObject jSONObject = new JSONObject();
                String checksumApiFingerprint9 = A01(25, 5, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
                jSONObject.put(checksumApiFingerprint9, strA01);
                String checksumApiFingerprint10 = A01(30, 5, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE);
                jSONObject.put(checksumApiFingerprint10, strA03);
                c1611Te.A07(jSONObject);
                InterfaceC1609Tc interfaceC1609TcA08 = this.A01.A08();
                int i10 = AbstractC1610Td.A1I;
                String checksumApiFingerprint11 = A01(35, 7, 42);
                interfaceC1609TcA08.ABD(checksumApiFingerprint11, i10, c1611Te);
            }
            UB.A00 = strA01;
        }
        SharedPreferences.Editor editorEdit = this.A00.edit();
        String str2 = this.A03;
        String checksumApiFingerprint12 = UB.A00;
        editorEdit.putString(str2, checksumApiFingerprint12).apply();
        UB.A05.set(2);
        return true;
    }
}
