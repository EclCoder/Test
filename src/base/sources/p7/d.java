package p7;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.a0;
import com.facebook.internal.w;
import com.mbridge.msdk.MBridgeConstans;
import gl.r;
import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49564a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f49565b = e.class.getSimpleName();

    private d() {
    }

    public static final Bundle a(e.a eventType, String applicationId, List appEvents) {
        if (x7.a.c(d.class)) {
            return null;
        }
        try {
            s.h(eventType, "eventType");
            s.h(applicationId, "applicationId");
            s.h(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, eventType.toString());
            bundle.putString(MBridgeConstans.APP_ID, applicationId);
            if (e.a.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayB = f49564a.b(appEvents, applicationId);
            if (jSONArrayB.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayB.toString());
            return bundle;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    private final JSONArray b(List list, String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.appevents.d> listL0 = r.L0(list);
            g7.a.d(listL0);
            boolean zC = c(str);
            for (com.facebook.appevents.d dVar : listL0) {
                if (!dVar.m() || (dVar.m() && zC)) {
                    jSONArray.put(dVar.j());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            w wVarV = a0.v(str, false);
            if (wVarV != null) {
                return wVarV.B();
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
