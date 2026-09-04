package d8;

import fl.w;
import gl.l0;
import java.util.HashMap;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36416a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f36417b = l0.j(w.a(String.class, new a()), w.a(String[].class, new C0549b()), w.a(JSONArray.class, new c()));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements d {
        a() {
        }

        @Override // d8.b.d
        public void a(JSONObject json, String key, Object obj) throws JSONException {
            s.h(json, "json");
            s.h(key, "key");
            json.put(key, obj);
        }
    }

    /* JADX INFO: renamed from: d8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0549b implements d {
        C0549b() {
        }

        @Override // d8.b.d
        public void a(JSONObject json, String key, Object obj) throws JSONException {
            s.h(json, "json");
            s.h(key, "key");
            JSONArray jSONArray = new JSONArray();
            s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            for (String str : (String[]) obj) {
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements d {
        c() {
        }

        @Override // d8.b.d
        public void a(JSONObject json, String key, Object obj) {
            s.h(json, "json");
            s.h(key, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    private b() {
    }

    public static final JSONObject a(e8.a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : aVar.c()) {
            Object objB = aVar.b(str);
            if (objB != null) {
                d dVar = (d) f36417b.get(objB.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException("Unsupported type: " + objB.getClass());
                }
                dVar.a(jSONObject, str, objB);
            }
        }
        return jSONObject;
    }
}
