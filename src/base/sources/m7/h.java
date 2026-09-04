package m7;

import android.os.Bundle;
import bm.o;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45318b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f45317a = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f45319c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f45320d = new HashMap();

    private h() {
    }

    private final void a(JSONArray jSONArray) {
        if (x7.a.c(this) || jSONArray == null) {
            return;
        }
        try {
            if (f45318b) {
                return;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String key = jSONObject.getString("key");
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            boolean z10 = jSONArray2.getJSONObject(i11).getBoolean("require_exact_match");
                            HashSet hashSetF = f(jSONArray2.getJSONObject(i11).getJSONArray("potential_matches"));
                            if (z10) {
                                Map map = f45320d;
                                s.g(key, "key");
                                HashSet hashSet = (HashSet) f45320d.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetF);
                                    hashSetF = hashSet;
                                }
                                map.put(key, hashSetF);
                            } else {
                                Map map2 = f45319c;
                                s.g(key, "key");
                                HashSet hashSet2 = (HashSet) f45319c.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetF);
                                    hashSetF = hashSet2;
                                }
                                map2.put(key, hashSetF);
                            }
                        }
                    } catch (Exception unused) {
                        f45320d.remove(key);
                        f45319c.remove(key);
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void b() {
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            if (f45318b) {
                return;
            }
            f45317a.e();
            f45318b = (f45319c.isEmpty() && f45320d.isEmpty()) ? false : true;
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }

    private final boolean c(String str, Set set) {
        if (!x7.a.c(this) && set != null) {
            try {
                if (set.isEmpty()) {
                    return false;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = str.toLowerCase(locale);
                    s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (s.c(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }
        return false;
    }

    private final boolean d(String str, Set set) {
        if (!x7.a.c(this) && set != null) {
            try {
                if (set.isEmpty()) {
                    return false;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (new o((String) it.next()).h(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }
        return false;
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null) {
                return;
            }
            a(wVarV.t());
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final HashSet f(JSONArray jSONArray) {
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                HashSet hashSetM = e1.m(jSONArray);
                return hashSetM == null ? new HashSet() : hashSetM;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void g(Bundle bundle) {
        int i10;
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            if (f45318b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    String key = it.next();
                    String strValueOf = String.valueOf(bundle.get(key));
                    boolean z10 = f45319c.get(key) != null;
                    i10 = f45320d.get(key) != null ? 1 : 0;
                    if (z10 || i10 != 0) {
                        h hVar = f45317a;
                        boolean zD = hVar.d(strValueOf, (Set) f45319c.get(key));
                        boolean zC = hVar.c(strValueOf, (Set) f45320d.get(key));
                        if (!zD && !zC) {
                            s.g(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bundle.remove((String) obj);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }
}
