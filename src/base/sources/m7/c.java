package m7;

import com.facebook.h0;
import com.facebook.internal.v;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import gl.r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f45298a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f45300c;

    private c() {
    }

    public static final void a() {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            f45299b = true;
            f45300c = v.d("FBSDKFeatureIntegritySample", h0.n(), false);
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    private final String b(String str) {
        String str2;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String[] strArrQ = o7.f.q(o7.f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            return (strArrQ == null || (str2 = strArrQ[0]) == null) ? DevicePublicKeyStringDef.NONE : str2;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void c(Map parameters) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            s.h(parameters, "parameters");
            if (!f45299b || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> listI0 = r.I0(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : listI0) {
                    Object obj = parameters.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = (String) obj;
                    c cVar = f45298a;
                    if (cVar.d(str) || cVar.d(str2)) {
                        parameters.remove(str);
                        if (!f45300c) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    s.g(string, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    private final boolean d(String str) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return !s.c(DevicePublicKeyStringDef.NONE, b(str));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
