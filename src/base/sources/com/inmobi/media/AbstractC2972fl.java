package com.inmobi.media;

import com.inmobi.media.AbstractC2972fl;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2972fl {
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[LOOP:1: B:57:0x0137->B:59:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    public static C2998gl a() throws JSONException {
        JSONArray jSONArray;
        C3484zh c3484zh = AbstractC3229pj.f27269a;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new C2998gl();
        }
        if (c()) {
            return new C2998gl();
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectA = M9.a();
        Iterator<String> itKeys = jSONObjectA != null ? jSONObjectA.keys() : null;
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", jSONObjectA.get(next));
                    map.put(next, jSONObject);
                } catch (JSONException e10) {
                    bm.r.l(" Error in looping through publisher provided unif id " + e10.getMessage() + "\n                                        " + jSONObjectA.get(next) + "\n                    ", null, 1, null);
                }
            }
        }
        JSONObject jSONObjectB = M9.b();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    boolean z11 = false;
                    boolean z12 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            String string = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                            String string2 = jSONArray2.getJSONObject(i10).has("envelope") ? jSONArray2.getJSONObject(i10).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry")) {
                                z11 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                map.put(string, jSONObject2);
                                z12 = true;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            z10 = z12;
                            e.getMessage();
                            jSONObjectB.toString();
                            if (!map.isEmpty()) {
                                return new C2998gl();
                            }
                            jSONArray = new JSONArray();
                            for (Object obj : map.values()) {
                                kotlin.jvm.internal.s.g(obj, "next(...)");
                                jSONArray.put((JSONObject) obj);
                            }
                            return new C2998gl(jSONArray.toString(), z10);
                        }
                    }
                    if (z11) {
                        em.k.d(H9.f24930c, null, null, new C2946el(null), 3, null);
                    }
                    z10 = z12;
                }
            } catch (JSONException e12) {
                e = e12;
            }
        }
        if (!map.isEmpty()) {
            return new C2998gl();
        }
        jSONArray = new JSONArray();
        while (r1.hasNext()) {
            kotlin.jvm.internal.s.g(obj, "next(...)");
            jSONArray.put((JSONObject) obj);
        }
        return new C2998gl(jSONArray.toString(), z10);
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
            return jSONArray == null || jSONArray.length() == 0;
        } catch (JSONException unused) {
        }
    }

    public static boolean c(JSONObject ufids) {
        boolean z10;
        kotlin.jvm.internal.s.h(ufids, "ufids");
        try {
            if (ufids.has("ufids")) {
                JSONArray jSONArray = ufids.getJSONArray("ufids");
                int length = jSONArray.length();
                z10 = true;
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        z10 &= System.currentTimeMillis() <= jSONArray.getJSONObject(i10).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(ufids);
                        return !z10;
                    }
                }
            } else {
                z10 = true;
            }
        } catch (JSONException unused2) {
            z10 = true;
        }
        return !z10;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = M9.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i10).has("signature") ? jSONArray2.getJSONObject(i10).getString("signature") : null;
                        boolean z10 = System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put("signature", string2);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                jSONObjectB.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        C3314t1 c3314t1 = Qk.f25565a;
        Boolean bool = c3314t1 != null ? c3314t1.f27500c : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return zBooleanValue;
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        short s10;
        String message = error != null ? error.getMessage() : null;
        if (kotlin.jvm.internal.s.c(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s10 = 93;
        } else {
            s10 = kotlin.jvm.internal.s.c(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s10 >= 0) {
            Map mapM = gl.l0.m(fl.w.a("errorCode", Short.valueOf(s10)));
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("FetchCallbackFailure", mapM, EnumC3281rk.SDK);
        }
        AbstractC2971fk.a(new Runnable() { // from class: yh.s8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2972fl.b(inMobiUnifiedIdInterface, jSONObject, error);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        map.put(jSONArray2.getJSONObject(i10).getString("src"), jSONArray2.getJSONObject(i10));
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i11 = 0; i11 < length2; i11++) {
                map.put(jSONArray3.getJSONObject(i11).getString("src"), jSONArray3.getJSONObject(i11));
            }
        }
        Collection collectionValues = map.values();
        kotlin.jvm.internal.s.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
