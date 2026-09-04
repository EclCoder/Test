package f7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f38312i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f38320h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38327a;

        b(int i10) {
            this.f38327a = i10;
        }

        public final int g() {
            return this.f38327a;
        }
    }

    public c(JSONObject component) throws JSONException {
        s.h(component, "component");
        String string = component.getString("class_name");
        s.g(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f38313a = string;
        this.f38314b = component.optInt("index", -1);
        this.f38315c = component.optInt("id");
        String strOptString = component.optString("text");
        s.g(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f38316d = strOptString;
        String strOptString2 = component.optString("tag");
        s.g(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f38317e = strOptString2;
        String strOptString3 = component.optString("description");
        s.g(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f38318f = strOptString3;
        String strOptString4 = component.optString("hint");
        s.g(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f38319g = strOptString4;
        this.f38320h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f38313a;
    }

    public final String b() {
        return this.f38318f;
    }

    public final String c() {
        return this.f38319g;
    }

    public final int d() {
        return this.f38315c;
    }

    public final int e() {
        return this.f38314b;
    }

    public final int f() {
        return this.f38320h;
    }

    public final String g() {
        return this.f38317e;
    }

    public final String h() {
        return this.f38316d;
    }
}
