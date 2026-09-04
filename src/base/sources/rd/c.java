package rd;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jd.g0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final od.b f51281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gd.g f51282c;

    public c(String str, od.b bVar) {
        this(str, bVar, gd.g.f());
    }

    private od.a b(od.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f51313a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", g0.m());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f51314b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f51315c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f51316d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f51317e.a().c());
        return aVar;
    }

    private void c(od.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f51282c.l("Failed to parse settings JSON from " + this.f51280a, e10);
            this.f51282c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f51320h);
        map.put("display_version", kVar.f51319g);
        map.put("source", Integer.toString(kVar.f51321i));
        String str = kVar.f51318f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // rd.l
    public JSONObject a(k kVar, boolean z10) {
        kd.i.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            od.a aVarB = b(d(mapF), kVar);
            this.f51282c.b("Requesting settings from " + this.f51280a);
            this.f51282c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f51282c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected od.a d(Map map) {
        return this.f51281b.a(this.f51280a, map).d(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + g0.m()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(od.c cVar) {
        int iB = cVar.b();
        this.f51282c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f51282c.d("Settings request failed; (status: " + iB + ") from " + this.f51280a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, od.b bVar, gd.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f51282c = gVar;
        this.f51281b = bVar;
        this.f51280a = str;
    }
}
