package n7;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import fl.w;
import gl.l0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f46886a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f46887b = l0.j(w.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), w.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private i() {
    }

    public static final JSONObject a(a activityType, com.facebook.internal.b bVar, String str, boolean z10, Context context) throws JSONException {
        s.h(activityType, "activityType");
        s.h(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, f46887b.get(activityType));
        String strD = com.facebook.appevents.o.f14964b.d();
        if (strD != null) {
            jSONObject.put("app_user_id", strD);
        }
        e1.F0(jSONObject, bVar, str, z10, context);
        try {
            e1.G0(jSONObject, context);
        } catch (Exception e10) {
            r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject jSONObjectD = e1.D();
        if (jSONObjectD != null) {
            Iterator<String> itKeys = jSONObjectD.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectD.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
