package f7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38307e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f38310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38311d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(JSONObject component) throws JSONException {
        s.h(component, "component");
        String string = component.getString("name");
        s.g(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f38308a = string;
        String strOptString = component.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        s.g(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f38309b = strOptString;
        String strOptString2 = component.optString("path_type", "absolute");
        s.g(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f38311d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = component.optJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                s.g(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject));
            }
        }
        this.f38310c = arrayList;
    }

    public final String a() {
        return this.f38308a;
    }

    public final List b() {
        return this.f38310c;
    }

    public final String c() {
        return this.f38311d;
    }

    public final String d() {
        return this.f38309b;
    }
}
