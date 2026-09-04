package m7;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45311b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f45310a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f45312c = new HashMap();

    private f() {
    }

    public static final void a() {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            f45310a.c();
            if (f45312c.isEmpty()) {
                return;
            }
            f45311b = true;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    private final String b(String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            for (String str2 : f45312c.keySet()) {
                HashSet hashSet = (HashSet) f45312c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
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
                f45312c = new HashMap();
                JSONArray jSONArrayR = wVarV.r();
                if (jSONArrayR == null || jSONArrayR.length() == 0) {
                    return;
                }
                int length = jSONArrayR.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArrayR.getJSONObject(i10);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        if (string != null && (hashSetM = e1.m(jSONArray)) != null) {
                            f45312c.put(string, hashSetM);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final String d(String str) {
        String strB;
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            s.h(str, obFGmWgqyy.ODVRlbWBZE);
            return (!f45311b || (strB = f45310a.b(str)) == null) ? str : strB;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }
}
