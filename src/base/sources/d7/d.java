package d7;

import android.content.SharedPreferences;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import com.facebook.j0;
import com.facebook.o0;
import com.facebook.p0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36281a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36282b = d.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f36283c;

    private d() {
    }

    public static final void b() {
        try {
            j0 j0Var = new j0(null, h0.n() + "/cloudbridge_settings", null, p0.GET, new j0.b() { // from class: d7.c
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var) {
                    d.c(o0Var);
                }
            }, null, 32, null);
            r0.a aVar = r0.f15352e;
            com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
            String str = f36282b;
            s.f(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(r0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", j0Var);
            j0Var.l();
        } catch (JSONException e10) {
            r0.a aVar2 = r0.f15352e;
            com.facebook.r0 r0Var2 = com.facebook.r0.APP_EVENTS;
            String str2 = f36282b;
            s.f(str2, "null cannot be cast to non-null type kotlin.String");
            aVar2.c(r0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", fl.e.b(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(o0 response) {
        s.h(response, "response");
        f36281a.d(response);
    }

    public static final Map e() {
        if (x7.a.c(d.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.g(), null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.g(), null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.g(), null);
            if (string != null && !r.h0(string) && string2 != null && !r.h0(string2) && string3 != null && !r.h0(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(oVar2.g(), string2);
                linkedHashMap.put(oVar.g(), string);
                linkedHashMap.put(oVar3.g(), string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    public final void d(o0 response) {
        Object obj;
        boolean zBooleanValue;
        s.h(response, "response");
        if (response.b() != null) {
            r0.a aVar = r0.f15352e;
            com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
            String str = f36282b;
            s.f(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(r0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().f()));
            Map mapE = e();
            if (mapE != null) {
                URL url = new URL(String.valueOf(mapE.get(o.URL.g())));
                g.d(String.valueOf(mapE.get(o.DATASETID.g())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapE.get(o.ACCESSKEY.g())));
                f36283c = true;
                return;
            }
            return;
        }
        r0.a aVar2 = r0.f15352e;
        com.facebook.r0 r0Var2 = com.facebook.r0.APP_EVENTS;
        String TAG = f36282b;
        s.f(TAG, "null cannot be cast to non-null type kotlin.String");
        aVar2.c(r0Var2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObjectC = response.c();
        if (jSONObjectC != null) {
            try {
                obj = jSONObjectC.get(DataSchemeDataSource.SCHEME_DATA);
            } catch (NullPointerException e10) {
                r0.a aVar3 = r0.f15352e;
                com.facebook.r0 r0Var3 = com.facebook.r0.APP_EVENTS;
                String TAG2 = f36282b;
                s.g(TAG2, "TAG");
                aVar3.c(r0Var3, TAG2, "CloudBridge Settings API response is not a valid json: \n%s ", fl.e.b(e10));
                return;
            } catch (JSONException e11) {
                r0.a aVar4 = r0.f15352e;
                com.facebook.r0 r0Var4 = com.facebook.r0.APP_EVENTS;
                String TAG3 = f36282b;
                s.g(TAG3, "TAG");
                aVar4.c(r0Var4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", fl.e.b(e11));
                return;
            }
        } else {
            obj = null;
        }
        s.f(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map mapO = e1.o(new JSONObject((String) gl.r.d0(e1.n((JSONArray) obj))));
        String str2 = (String) mapO.get(o.URL.g());
        String str3 = (String) mapO.get(o.DATASETID.g());
        String str4 = (String) mapO.get(o.ACCESSKEY.g());
        if (str2 == null || str3 == null || str4 == null) {
            s.g(TAG, "TAG");
            aVar2.b(r0Var2, TAG, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            g.d(str3, str2, str4);
            g(mapO);
            o oVar = o.ENABLED;
            if (mapO.get(oVar.g()) != null) {
                Object obj2 = mapO.get(oVar.g());
                s.f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                zBooleanValue = ((Boolean) obj2).booleanValue();
            } else {
                zBooleanValue = false;
            }
            f36283c = zBooleanValue;
        } catch (MalformedURLException e12) {
            r0.a aVar5 = r0.f15352e;
            com.facebook.r0 r0Var5 = com.facebook.r0.APP_EVENTS;
            String TAG4 = f36282b;
            s.g(TAG4, "TAG");
            aVar5.c(r0Var5, TAG4, "CloudBridge Settings API response doesn't have valid url\n %s ", fl.e.b(e12));
        }
    }

    public final boolean f() {
        return f36283c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.g());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.g());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.g());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(oVar.g(), obj.toString());
        editorEdit2.putString(oVar2.g(), obj2.toString());
        editorEdit2.putString(oVar3.g(), obj3.toString());
        editorEdit2.apply();
        r0.f15352e.c(com.facebook.r0.APP_EVENTS, f36282b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
