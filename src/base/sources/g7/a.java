package g7;

import com.facebook.appevents.d;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f38950b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38949a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f38951c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f38952d = new HashSet();

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0585a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f38954b;

        public C0585a(String eventName, List deprecateParams) {
            s.h(eventName, "eventName");
            s.h(deprecateParams, "deprecateParams");
            this.f38953a = eventName;
            this.f38954b = deprecateParams;
        }

        public final List a() {
            return this.f38954b;
        }

        public final String b() {
            return this.f38953a;
        }

        public final void c(List list) {
            s.h(list, "<set-?>");
            this.f38954b = list;
        }
    }

    private a() {
    }

    public static final void a() {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            f38950b = true;
            f38949a.b();
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    private final synchronized void b() {
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                w wVarV = a0.v(h0.n(), false);
                if (wVarV == null) {
                    return;
                }
                String strS = wVarV.s();
                if (strS != null && strS.length() > 0) {
                    JSONObject jSONObject = new JSONObject(strS);
                    f38951c.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String key = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set set = f38952d;
                                s.g(key, "key");
                                set.add(key);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                s.g(key, "key");
                                C0585a c0585a = new C0585a(key, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    c0585a.c(e1.n(jSONArrayOptJSONArray));
                                }
                                f38951c.add(c0585a);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final void c(Map parameters, String eventName) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            s.h(parameters, "parameters");
            s.h(eventName, "eventName");
            if (f38950b) {
                ArrayList arrayList = new ArrayList(parameters.keySet());
                ArrayList arrayList2 = new ArrayList(f38951c);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    C0585a c0585a = (C0585a) obj;
                    if (s.c(c0585a.b(), eventName)) {
                        int size2 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            String str = (String) obj2;
                            if (c0585a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    public static final void d(List events) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            s.h(events, "events");
            if (f38950b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f38952d.contains(((d) it.next()).k())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }
}
