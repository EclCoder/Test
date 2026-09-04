package r7;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.h0;
import com.facebook.internal.e1;
import gl.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f51118c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f51116a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f51117b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f51119d = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String pathID, String predictedEvent) {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            s.h(pathID, "pathID");
            s.h(predictedEvent, "predictedEvent");
            if (!f51119d.get()) {
                f51116a.c();
            }
            Map map = f51117b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f51118c;
            if (sharedPreferences == null) {
                s.w("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", e1.n0(l0.t(map))).apply();
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            s.h(view, "view");
            s.h(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = f7.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return e1.I0(jSONObject.toString());
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (x7.a.c(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f51119d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            s.g(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            f51118c = sharedPreferences;
            Map map = f51117b;
            if (sharedPreferences == null) {
                s.w("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(e1.j0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final String d(String pathID) {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            s.h(pathID, "pathID");
            Map map = f51117b;
            if (map.containsKey(pathID)) {
                return (String) map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }
}
