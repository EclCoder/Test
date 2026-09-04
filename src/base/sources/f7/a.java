package f7;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f38290j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f38292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0575a f38293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f38295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f38296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f38298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f38299i;

    /* JADX INFO: renamed from: f7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0575a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(JSONObject mapping) throws JSONException {
            s.h(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            s.g(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            s.g(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            s.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            c cVarValueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            s.g(string2, "mapping.getString(\"event_type\")");
            s.g(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            s.g(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            EnumC0575a enumC0575aValueOf = EnumC0575a.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonPath = jSONArray.getJSONObject(i10);
                s.g(jsonPath, "jsonPath");
                arrayList.add(new f7.c(jsonPath));
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i11);
                    s.g(jsonParameter, "jsonParameter");
                    arrayList2.add(new f7.b(jsonParameter));
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            s.g(eventName, "eventName");
            s.g(appVersion, "appVersion");
            s.g(componentId, "componentId");
            s.g(pathType, "pathType");
            s.g(activityName, "activityName");
            return new a(eventName, cVarValueOf, enumC0575aValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        s.g(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        MANUAL,
        INFERENCE
    }

    public a(String eventName, c method, EnumC0575a type, String appVersion, List path, List parameters, String componentId, String pathType, String activityName) {
        s.h(eventName, "eventName");
        s.h(method, "method");
        s.h(type, "type");
        s.h(appVersion, "appVersion");
        s.h(path, "path");
        s.h(parameters, "parameters");
        s.h(componentId, "componentId");
        s.h(pathType, "pathType");
        s.h(activityName, "activityName");
        this.f38291a = eventName;
        this.f38292b = method;
        this.f38293c = type;
        this.f38294d = appVersion;
        this.f38295e = path;
        this.f38296f = parameters;
        this.f38297g = componentId;
        this.f38298h = pathType;
        this.f38299i = activityName;
    }

    public final String a() {
        return this.f38299i;
    }

    public final String b() {
        return this.f38291a;
    }

    public final List c() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f38296f);
        s.g(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    public final List d() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f38295e);
        s.g(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
