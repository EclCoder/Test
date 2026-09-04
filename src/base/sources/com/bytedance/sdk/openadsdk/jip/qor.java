package com.bytedance.sdk.openadsdk.jip;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.as.sk;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static volatile boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile boolean f14555sk;
    private static final HashMap<String, Integer> hnj = new HashMap<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile int f14554hn = 10000;
    private static volatile boolean gjv = true;

    public static boolean hn() {
        return qor;
    }

    public static void hnj() {
        String strHnj = sk.hnj("stats_control", "");
        if (!TextUtils.isEmpty(strHnj)) {
            try {
                JSONObject jSONObject = new JSONObject(strHnj);
                f14554hn = jSONObject.optInt("sampling_def", 10000);
                String strOptString = jSONObject.optString("sampling");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        hnj.put(next, Integer.valueOf(jSONObject2.optInt(next, f14554hn)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        gjv = false;
        qor = false;
        if (f14554hn == 10000 && hnj.isEmpty()) {
            gjv = true;
        } else if (f14554hn == 0 && hnj.isEmpty()) {
            qor = true;
        }
        f14555sk = true;
    }

    public static int hn(String str, int i10) {
        if (qor) {
            return 0;
        }
        if (!f14555sk) {
            return i10;
        }
        Integer numValueOf = hnj.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i10);
        }
        return numValueOf.intValue();
    }

    public static boolean hnj(String str, int i10) {
        if (gjv || !f14555sk) {
            return true;
        }
        if (qor) {
            return false;
        }
        if (i10 < 0) {
            i10 = f14554hn;
        }
        Integer numValueOf = hnj.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i10);
        }
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        return numValueOf.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= numValueOf.intValue();
    }
}
