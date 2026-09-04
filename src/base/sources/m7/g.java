package m7;

import android.os.Bundle;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45314b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f45313a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashSet f45315c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f45316d = new HashMap();

    private g() {
    }

    public static final void a() {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            f45313a.b();
            if (f45315c.isEmpty() && f45316d.isEmpty()) {
                f45314b = false;
            } else {
                f45314b = true;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    private final void b() {
        HashSet hashSetM;
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null) {
                return;
            }
            try {
                f45315c = new HashSet();
                f45316d = new HashMap();
                JSONArray jSONArrayV = wVarV.v();
                if (jSONArrayV == null || jSONArrayV.length() == 0) {
                    return;
                }
                int length = jSONArrayV.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArrayV.getJSONObject(i10);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    if (zHas && zHas2) {
                        String sensitiveParamsScope = jSONObject.getString("key");
                        JSONArray jSONArray = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        if (jSONArray != null && (hashSetM = e1.m(jSONArray)) != null) {
                            if (sensitiveParamsScope.equals("_MTSDK_Default_")) {
                                f45315c = hashSetM;
                            } else {
                                Map map = f45316d;
                                s.g(sensitiveParamsScope, "sensitiveParamsScope");
                                map.put(sensitiveParamsScope, hashSetM);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void c(Bundle bundle, String eventName) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            s.h(eventName, "eventName");
            if (f45314b && bundle != null) {
                if (!f45315c.isEmpty() || f45316d.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f45316d.get(eventName);
                        ArrayList arrayList = new ArrayList(bundle.keySet());
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String key = (String) obj;
                            g gVar = f45313a;
                            s.g(key, "key");
                            if (gVar.d(key, hashSet)) {
                                bundle.remove(key);
                                jSONArray.put(key);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    private final boolean d(String str, HashSet hashSet) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            if (f45315c.contains(str)) {
                return true;
            }
            return (hashSet == null || hashSet.isEmpty() || !hashSet.contains(str)) ? false : true;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
