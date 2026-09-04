package d7;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import com.facebook.j0;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import fl.g0;
import fl.w;
import gl.l0;
import gl.r;
import gl.s0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f36307a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f36308b = s0.e(200, 202);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet f36309c = s0.e(503, Integer.valueOf(PglCryptUtils.BASE64_FAILED), 429);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f36310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List f36311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f36312f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36315c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            s.h(datasetID, "datasetID");
            s.h(cloudBridgeURL, "cloudBridgeURL");
            s.h(accessKey, "accessKey");
            this.f36313a = datasetID;
            this.f36314b = cloudBridgeURL;
            this.f36315c = accessKey;
        }

        public final String a() {
            return this.f36315c;
        }

        public final String b() {
            return this.f36314b;
        }

        public final String c() {
            return this.f36313a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.c(this.f36313a, aVar.f36313a) && s.c(this.f36314b, aVar.f36314b) && s.c(this.f36315c, aVar.f36315c);
        }

        public int hashCode() {
            return (((this.f36313a.hashCode() * 31) + this.f36314b.hashCode()) * 31) + this.f36315c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f36313a + ", cloudBridgeURL=" + this.f36314b + ", accessKey=" + this.f36315c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements tl.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(2);
            this.f36316a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Integer num, List processedEvents) {
            s.h(processedEvents, "$processedEvents");
            if (r.U(g.f36308b, num)) {
                return;
            }
            g.f36307a.g(num, processedEvents, 5);
        }

        public final void b(String str, final Integer num) {
            final List list = this.f36316a;
            e1.E0(new Runnable() { // from class: d7.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(num, list);
                }
            });
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (Integer) obj2);
            return g0.f38750a;
        }
    }

    private g() {
    }

    public static final void d(String datasetID, String url, String accessKey) {
        s.h(datasetID, "datasetID");
        s.h(url, "url");
        s.h(accessKey, "accessKey");
        g gVar = f36307a;
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    private final List k(j0 j0Var) {
        JSONObject jSONObjectQ = j0Var.q();
        if (jSONObjectQ == null) {
            return null;
        }
        Map mapV = l0.v(e1.o(jSONObjectQ));
        Object objW = j0Var.w();
        s.f(objW, "null cannot be cast to non-null type kotlin.Any");
        mapV.put("custom_events", objW);
        StringBuilder sb2 = new StringBuilder();
        for (String str : mapV.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(mapV.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        r0.f15352e.c(com.facebook.r0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f36284a.e(mapV);
    }

    public static final void l(final j0 request) {
        s.h(request, "request");
        e1.E0(new Runnable() { // from class: d7.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(request);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(j0 request) {
        s.h(request, "$request");
        String strR = request.r();
        List listF0 = strR != null ? bm.r.F0(strR, new String[]{"/"}, false, 0, 6, null) : null;
        if (listF0 == null || listF0.size() != 2) {
            r0.f15352e.c(com.facebook.r0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f36307a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List listK = gVar.k(request);
            if (listK == null) {
                return;
            }
            gVar.c(listK);
            int iMin = Math.min(gVar.f().size(), 10);
            List listY0 = r.y0(gVar.f(), new yl.f(0, iMin - 1));
            gVar.f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listY0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(DataSchemeDataSource.SCHEME_DATA, jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            gVar.h(str, HttpMethods.POST, new JSONObject(linkedHashMap).toString(), l0.f(w.a("Content-Type", "application/json")), 60000, new b(listY0));
        } catch (UninitializedPropertyAccessException e10) {
            r0.f15352e.c(com.facebook.r0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List list) {
        if (list != null) {
            f().addAll(list);
        }
        int iMax = Math.max(0, f().size() - 1000);
        if (iMax > 0) {
            List listW = r.W(f(), iMax);
            s.f(listW, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            j(p0.c(listW));
        }
    }

    public final a e() {
        a aVar = f36310d;
        if (aVar != null) {
            return aVar;
        }
        s.w("credentials");
        return null;
    }

    public final List f() {
        List list = f36311e;
        if (list != null) {
            return list;
        }
        s.w("transformedEvents");
        return null;
    }

    public final void g(Integer num, List processedEvents, int i10) {
        s.h(processedEvents, "processedEvents");
        if (r.U(f36309c, num)) {
            if (f36312f >= i10) {
                f().clear();
                f36312f = 0;
            } else {
                f().addAll(0, processedEvents);
                f36312f++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final void h(String urlStr, String requestMethod, String str, Map map, int i10, tl.o oVar) {
        Set<String> setKeySet;
        s.h(urlStr, "urlStr");
        s.h(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            s.f(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str2 : setKeySet) {
                    httpURLConnection.setRequestProperty(str2, (String) map.get(str2));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals(HttpMethods.POST) || httpURLConnection.getRequestMethod().equals(HttpMethods.PUT));
            httpURLConnection.setConnectTimeout(i10);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, C.UTF8_NAME));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (f36308b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C.UTF8_NAME));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ql.b.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                    r0.f15352e.c(com.facebook.r0.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e.toString());
                    if (oVar != null) {
                        oVar.invoke(null, 503);
                    }
                }
                g0 g0Var = g0.f38750a;
                ql.b.a(bufferedReader, null);
            }
            String string = sb2.toString();
            s.g(string, "connResponseSB.toString()");
            r0.f15352e.c(com.facebook.r0.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (oVar != null) {
                oVar.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            r0.f15352e.c(com.facebook.r0.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e10.toString());
            if (oVar != null) {
                oVar.invoke(null, 503);
            }
        } catch (IOException e11) {
            r0.f15352e.c(com.facebook.r0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void i(a aVar) {
        s.h(aVar, "<set-?>");
        f36310d = aVar;
    }

    public final void j(List list) {
        s.h(list, "<set-?>");
        f36311e = list;
    }
}
