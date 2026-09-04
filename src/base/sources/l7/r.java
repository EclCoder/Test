package l7;

import android.content.SharedPreferences;
import com.facebook.h0;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import gl.l0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f44032a = new r();

    private r() {
    }

    public static final void c() {
        if (x7.a.c(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = h0.m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            h0.m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
        }
    }

    public static final void d(Map purchaseDetailsMap, Map skuDetailsMap, boolean z10, String packageName, u.a billingClientVersion, boolean z11) {
        if (x7.a.c(r.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.s.h(skuDetailsMap, "skuDetailsMap");
            kotlin.jvm.internal.s.h(packageName, "packageName");
            kotlin.jvm.internal.s.h(billingClientVersion, "billingClientVersion");
            r rVar = f44032a;
            rVar.f(rVar.b(rVar.a(purchaseDetailsMap, z10), skuDetailsMap, packageName), z10, billingClientVersion, z11);
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
        }
    }

    public static final boolean e() {
        if (x7.a.c(r.class)) {
            return false;
        }
        try {
            return !h0.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
            return false;
        }
    }

    private final void f(Map map, boolean z10, u.a aVar, boolean z11) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                n7.k.j((String) entry.getKey(), (String) entry.getValue(), z10, aVar, z11);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void h() {
        if (x7.a.c(r.class)) {
            return;
        }
        try {
            try {
                h0.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
        }
    }

    public static final void i() {
        if (x7.a.c(r.class)) {
            return;
        }
        try {
            h();
            try {
                SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
        }
    }

    public final Map a(Map purchaseDetailsMap, boolean z10) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j10 = z10 ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : l0.t(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j11 = jSONObject.getLong("purchaseTime");
                        if (j11 <= j10) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j11);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j10) {
                if (z10) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final Map b(Map purchaseDetailsMap, Map skuDetailsMap, String packageName) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.s.h(skuDetailsMap, "skuDetailsMap");
            kotlin.jvm.internal.s.h(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                try {
                    jSONObject.put("packageName", packageName);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        kotlin.jvm.internal.s.g(string, "purchaseDetail.toString()");
                        String string2 = jSONObject2.toString();
                        kotlin.jvm.internal.s.g(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void g() {
        String str = mTFeqtajA.iQddDgJaV;
        if (x7.a.c(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong(str, 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = h0.m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Set<String> stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j10 = Long.parseLong((String) bm.r.F0((String) it.next(), new String[]{";"}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j10).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j10);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong(str, jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            c();
        } catch (Throwable th2) {
            x7.a.b(th2, r.class);
        }
    }
}
