package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2173gJ {
    public static String[] A00 = {"GvbI", "ZazQ", "jGVKLNF9IyZZC6yZD7vUdND", "cIibDuYBy4iZiWhBa7aDKVcHYQepg0dA", "kp8Ba6lLXDz7KYAXK4DvfF3NzckJKvFL", "SSvAaaHsDdE6RjWizyVCXkVcp0DozyD6", "SP8di31m2uLOcP53jnkdZfwtPUUyGlI0", "zoV6YIxZR0JxBorwnPIpT"};

    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            EnumC2172gI t10 = EnumC2172gI.A00(jSONArray, i10);
            if (t10 != EnumC2172gI.A00(jSONArray2, i10) || !t10.A06(jSONArray, jSONArray2, i10)) {
                return false;
            }
        }
        String[] strArr = A00;
        if (strArr[5].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[7] = "kAUv4Go12E5I6bj9gVym2";
        strArr2[2] = "RoQebNbND8hZkGW6Dl9KhdG";
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC2172gI enumC2172gIA01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (A00[3].charAt(27) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "ADTX";
            strArr[0] = "wJhB";
            String str = next;
            if (!jSONObject2.has(str) || (enumC2172gIA01 = EnumC2172gI.A01(jSONObject, str)) != EnumC2172gI.A01(jSONObject2, str) || !enumC2172gIA01.A08(jSONObject, jSONObject2, str)) {
                return false;
            }
        }
        String[] strArr2 = A00;
        String key = strArr2[7];
        if (key.length() == strArr2[2].length()) {
            throw new RuntimeException();
        }
        A00[4] = "f4NlNCElPjJB5pPYNhX2WTR6iFmKnfGM";
        return true;
    }
}
