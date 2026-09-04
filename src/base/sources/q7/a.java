package q7;

import android.util.Log;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f50417b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50416a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50418c = a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f50419d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f50420e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0776a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f50422b;

        public C0776a(String eventName, Map restrictiveParams) {
            s.h(eventName, "eventName");
            s.h(restrictiveParams, "restrictiveParams");
            this.f50421a = eventName;
            this.f50422b = restrictiveParams;
        }

        public final String a() {
            return this.f50421a;
        }

        public final Map b() {
            return this.f50422b;
        }

        public final void c(Map map) {
            s.h(map, "<set-?>");
            this.f50422b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            f50417b = true;
            f50416a.c();
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    private final String b(String str, String str2) {
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList(f50419d);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C0776a c0776a = (C0776a) obj;
                    if (c0776a != null && s.c(str, c0776a.a())) {
                        for (String str3 : c0776a.b().keySet()) {
                            if (s.c(str2, str3)) {
                                return (String) c0776a.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(f50418c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
        String strS;
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null || (strS = wVarV.s()) == null || strS.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strS);
            f50419d.clear();
            f50420e.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    s.g(key, "key");
                    C0776a c0776a = new C0776a(key, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c0776a.c(e1.p(jSONObjectOptJSONObject));
                        f50419d.add(c0776a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f50420e.add(c0776a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final boolean d(String str) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return f50420e.contains(str);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final String e(String eventName) {
        if (x7.a.c(a.class)) {
            return null;
        }
        try {
            s.h(eventName, "eventName");
            return (f50417b && f50416a.d(eventName)) ? "_removed_" : eventName;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return null;
        }
    }

    public static final void f(Map parameters, String eventName) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            s.h(parameters, "parameters");
            s.h(eventName, "eventName");
            if (f50417b) {
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList(parameters.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    String strB = f50416a.b(eventName, str);
                    if (strB != null) {
                        map.put(str, strB);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }
}
