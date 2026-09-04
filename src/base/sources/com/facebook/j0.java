package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.google.api.client.http.UrlEncodedParser;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f15486n = new c(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f15487o = j0.class.getSimpleName();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f15488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f15489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f15490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile String f15491s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.facebook.a f15492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f15494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f15498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f15501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p0 f15502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f15504m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f15505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f15506b;

        public a(j0 request, Object obj) {
            kotlin.jvm.internal.s.h(request, "request");
            this.f15505a = request;
            this.f15506b = obj;
        }

        public final j0 a() {
            return this.f15505a;
        }

        public final Object b() {
            return this.f15506b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(o0 o0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            kotlin.jvm.internal.s.g(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        public final void D(JSONObject jSONObject, String str, e eVar) {
            boolean z10;
            if (u(str)) {
                int iF0 = bm.r.f0(str, ":", 0, false, 6, null);
                int iF1 = bm.r.f0(str, "?", 0, false, 6, null);
                if (iF0 <= 3 || (iF1 != -1 && iF0 >= iF1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                boolean z11 = z10 && bm.r.A(key, "image", true);
                kotlin.jvm.internal.s.g(key, "key");
                kotlin.jvm.internal.s.g(value, "value");
                E(key, value, eVar, z11);
            }
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        kotlin.jvm.internal.s.g(str2, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        kotlin.jvm.internal.s.g(objOpt, "jsonObject.opt(propertyName)");
                        E(str2, objOpt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    kotlin.jvm.internal.s.g(strOptString, "jsonObject.optString(\"id\")");
                    E(str, strOptString, eVar, z10);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    kotlin.jvm.internal.s.g(strOptString2, "jsonObject.optString(\"url\")");
                    E(str, strOptString2, eVar, z10);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        kotlin.jvm.internal.s.g(string, "jsonObject.toString()");
                        E(str, string, eVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    kotlin.jvm.internal.o0 o0Var2 = kotlin.jvm.internal.o0.f43602a;
                    String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    kotlin.jvm.internal.s.g(str3, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i10);
                    kotlin.jvm.internal.s.g(objOpt2, "jsonArray.opt(i)");
                    E(str3, objOpt2, eVar, z10);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                eVar.a(str, obj.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.util.Date");
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                kotlin.jvm.internal.s.g(str4, "iso8601DateFormat.format(date)");
                eVar.a(str, str4);
                return;
            }
            e1.l0(j0.f15487o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
        }

        private final void F(n0 n0Var, com.facebook.internal.r0 r0Var, int i10, URL url, OutputStream outputStream, boolean z10) throws JSONException, IOException {
            g gVar = new g(outputStream, r0Var, z10);
            if (i10 != 1) {
                String strP = p(n0Var);
                if (strP.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                gVar.a("batch_app_id", strP);
                HashMap map = new HashMap();
                K(gVar, n0Var, map);
                if (r0Var != null) {
                    r0Var.b("  Attachments:\n");
                }
                I(map, gVar);
                return;
            }
            j0 j0VarM = n0Var.get(0);
            HashMap map2 = new HashMap();
            for (String key : j0VarM.u().keySet()) {
                Object obj = j0VarM.u().get(key);
                if (v(obj)) {
                    kotlin.jvm.internal.s.g(key, "key");
                    map2.put(key, new a(j0VarM, obj));
                }
            }
            if (r0Var != null) {
                r0Var.b("  Parameters:\n");
            }
            J(j0VarM.u(), gVar, j0VarM);
            if (r0Var != null) {
                r0Var.b("  Attachments:\n");
            }
            I(map2, gVar);
            JSONObject jSONObjectQ = j0VarM.q();
            if (jSONObjectQ != null) {
                String path = url.getPath();
                kotlin.jvm.internal.s.g(path, "url.path");
                D(jSONObjectQ, path, gVar);
            }
        }

        public static final void H(ArrayList callbacks, n0 requests) {
            kotlin.jvm.internal.s.h(callbacks, "$callbacks");
            kotlin.jvm.internal.s.h(requests, "$requests");
            int size = callbacks.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = callbacks.get(i10);
                i10++;
                Pair pair = (Pair) obj;
                b bVar = (b) pair.first;
                Object obj2 = pair.second;
                kotlin.jvm.internal.s.g(obj2, "pair.second");
                bVar.a((o0) obj2);
            }
            Iterator it = requests.p().iterator();
            while (it.hasNext()) {
                ((n0.a) it.next()).a(requests);
            }
        }

        private final void I(Map map, g gVar) throws IOException {
            for (Map.Entry entry : map.entrySet()) {
                if (j0.f15486n.v(((a) entry.getValue()).b())) {
                    gVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, g gVar, j0 j0Var) throws IOException {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    kotlin.jvm.internal.s.g(key, "key");
                    gVar.j(key, obj, j0Var);
                }
            }
        }

        private final void K(g gVar, Collection collection, Map map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((j0) it.next()).B(jSONArray, map);
            }
            gVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", UrlEncodedParser.CONTENT_TYPE);
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        private final HttpURLConnection g(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            kotlin.jvm.internal.s.f(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(n0 n0Var) {
            String strN = n0Var.n();
            if (strN != null && !n0Var.isEmpty()) {
                return strN;
            }
            Iterator<E> it = n0Var.iterator();
            while (it.hasNext()) {
                com.facebook.a aVarM = ((j0) it.next()).m();
                if (aVarM != null) {
                    return aVarM.c();
                }
            }
            String str = j0.f15489q;
            return (str == null || str.length() <= 0) ? h0.n() : str;
        }

        private final String q() {
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{j0.f15488p}, 1));
            kotlin.jvm.internal.s.g(str, "format(format, *args)");
            return str;
        }

        private final String r() {
            if (j0.f15491s == null) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.3.0"}, 2));
                kotlin.jvm.internal.s.g(str, "format(format, *args)");
                j0.f15491s = str;
                String strA = com.facebook.internal.o0.a();
                if (!e1.e0(strA)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{j0.f15491s, strA}, 2));
                    kotlin.jvm.internal.s.g(str2, "format(locale, format, *args)");
                    j0.f15491s = str2;
                }
            }
            return j0.f15491s;
        }

        private final boolean s(n0 n0Var) {
            for (n0.a aVar : n0Var.p()) {
            }
            Iterator<E> it = n0Var.iterator();
            while (it.hasNext()) {
                ((j0) it.next()).o();
            }
            return false;
        }

        private final boolean t(n0 n0Var) {
            Iterator<E> it = n0Var.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                Iterator<String> it2 = j0Var.u().keySet().iterator();
                while (it2.hasNext()) {
                    if (v(j0Var.u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            Matcher matcher = j0.f15490r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                kotlin.jvm.internal.s.g(str, "matcher.group(1)");
            }
            return bm.r.N(str, "me/", false, 2, null) || bm.r.N(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public static final void z(d dVar, o0 response) {
            kotlin.jvm.internal.s.h(response, "response");
            if (dVar != null) {
                dVar.a(response.c(), response);
            }
        }

        public final j0 A(com.facebook.a aVar, String str, JSONObject jSONObject, b bVar) {
            j0 j0Var = new j0(aVar, str, null, p0.POST, bVar, null, 32, null);
            j0Var.E(jSONObject);
            return j0Var;
        }

        public final j0 B(com.facebook.a aVar, String str, Bundle bundle, b bVar) {
            return new j0(aVar, str, bundle, p0.POST, bVar, null, 32, null);
        }

        public final void G(final n0 requests, List responses) {
            kotlin.jvm.internal.s.h(requests, "requests");
            kotlin.jvm.internal.s.h(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                j0 j0VarM = requests.get(i10);
                if (j0VarM.o() != null) {
                    arrayList.add(new Pair(j0VarM.o(), responses.get(i10)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.c.H(arrayList, requests);
                    }
                };
                Handler handlerO = requests.o();
                if (handlerO != null) {
                    handlerO.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
        public final void L(n0 requests, HttpURLConnection connection) throws Throwable {
            Throwable th2;
            URL url;
            OutputStream x0Var;
            n0 n0Var;
            kotlin.jvm.internal.s.h(requests, "requests");
            kotlin.jvm.internal.s.h(connection, "connection");
            com.facebook.internal.r0 r0Var = new com.facebook.internal.r0(r0.REQUESTS, "Request");
            int size = requests.size();
            boolean zT = t(requests);
            OutputStream outputStream = null;
            p0 p0VarT = size == 1 ? requests.get(0).t() : null;
            if (p0VarT == null) {
                p0VarT = p0.POST;
            }
            connection.setRequestMethod(p0VarT.name());
            M(connection, zT);
            URL url2 = connection.getURL();
            r0Var.b("Request:\n");
            r0Var.d("Id", requests.r());
            kotlin.jvm.internal.s.g(url2, "url");
            r0Var.d("URL", url2);
            Object requestMethod = connection.getRequestMethod();
            kotlin.jvm.internal.s.g(requestMethod, "connection.requestMethod");
            r0Var.d("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT);
            kotlin.jvm.internal.s.g(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            r0Var.d(Command.HTTP_HEADER_USER_AGENT, requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            kotlin.jvm.internal.s.g(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            r0Var.d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.w());
            connection.setReadTimeout(requests.w());
            if (p0VarT != p0.POST) {
                r0Var.e();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zT) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th3) {
                        th2 = th3;
                        outputStream = bufferedOutputStream;
                        if (outputStream == null) {
                            throw th2;
                        }
                        outputStream.close();
                        throw th2;
                    }
                }
                try {
                    if (s(requests)) {
                        w0 w0Var = new w0(requests.o());
                        F(requests, null, size, url2, w0Var, zT);
                        url = url2;
                        OutputStream outputStream2 = bufferedOutputStream;
                        try {
                            x0Var = new x0(outputStream2, requests, w0Var.l(), w0Var.k());
                            zT = zT;
                            size = size;
                            n0Var = requests;
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream2;
                            th2 = th;
                            if (outputStream == null) {
                                throw th2;
                            }
                            outputStream.close();
                            throw th2;
                        }
                    } else {
                        url = url2;
                        x0Var = bufferedOutputStream;
                        n0Var = requests;
                    }
                    try {
                        F(n0Var, r0Var, size, url, x0Var, zT);
                        x0Var.close();
                        r0Var.e();
                    } catch (Throwable th5) {
                        th = th5;
                        outputStream = x0Var;
                        th2 = th;
                        if (outputStream == null) {
                            throw th2;
                        }
                        outputStream.close();
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    outputStream = bufferedOutputStream;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }

        public final HttpURLConnection N(n0 requests) throws Throwable {
            kotlin.jvm.internal.s.h(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnectionG = null;
                try {
                    httpURLConnectionG = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(com.facebook.internal.x0.h()));
                    L(requests, httpURLConnectionG);
                    return httpURLConnectionG;
                } catch (IOException e10) {
                    e1.r(httpURLConnectionG);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    e1.r(httpURLConnectionG);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }

        public final void O(n0 requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            Iterator<E> it = requests.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (p0.GET == j0Var.t() && e1.e0(j0Var.u().getString("fields"))) {
                    com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
                    r0 r0Var = r0.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GET requests for /");
                    String strR = j0Var.r();
                    if (strR == null) {
                        strR = "";
                    }
                    sb2.append(strR);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    aVar.a(r0Var, 5, "Request", sb2.toString());
                }
            }
        }

        public final o0 h(j0 request) {
            kotlin.jvm.internal.s.h(request, "request");
            List listK = k(request);
            if (listK.size() == 1) {
                return (o0) listK.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final List i(n0 requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionN;
            List listO;
            kotlin.jvm.internal.s.h(requests, "requests");
            f1.l(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionN = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionN = null;
            } catch (Throwable th2) {
                th = th2;
                e1.r(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionN != null) {
                    listO = o(httpURLConnectionN, requests);
                } else {
                    List listA = o0.f15946i.a(requests.u(), null, new FacebookException(exc));
                    G(requests, listA);
                    listO = listA;
                }
                e1.r(httpURLConnectionN);
                return listO;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionN;
                e1.r(httpURLConnection);
                throw th;
            }
        }

        public final List j(Collection requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            return i(new n0(requests));
        }

        public final List k(j0... requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            return j(gl.j.x0(requests));
        }

        public final m0 l(n0 requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            f1.l(requests, "requests");
            m0 m0Var = new m0(requests);
            m0Var.executeOnExecutor(h0.v(), new Void[0]);
            return m0Var;
        }

        public final m0 m(Collection requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            return l(new n0(requests));
        }

        public final m0 n(j0... requests) {
            kotlin.jvm.internal.s.h(requests, "requests");
            return m(gl.j.x0(requests));
        }

        public final List o(HttpURLConnection connection, n0 requests) {
            kotlin.jvm.internal.s.h(connection, "connection");
            kotlin.jvm.internal.s.h(requests, "requests");
            List listF = o0.f15946i.f(connection, requests);
            e1.r(connection);
            int size = requests.size();
            if (size == listF.size()) {
                G(requests, listF);
                k.f15515f.e().l();
                return listF;
            }
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listF.size()), Integer.valueOf(size)}, 2));
            kotlin.jvm.internal.s.g(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }

        public final j0 x(com.facebook.a aVar, String str, b bVar) {
            return new j0(aVar, str, null, null, bVar, null, 32, null);
        }

        public final j0 y(com.facebook.a aVar, final d dVar) {
            return new j0(aVar, "me", null, null, new b(dVar) { // from class: com.facebook.l0
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var) {
                    j0.c.z(null, o0Var);
                }
            }, null, 32, null);
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(JSONObject jSONObject, o0 o0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface e {
        void a(String str, String str2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f15509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15507c = new b(null);
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.h(source, "source");
                return new f(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public b() {
            }
        }

        public /* synthetic */ f(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final String a() {
            return this.f15508a;
        }

        public final Parcelable b() {
            return this.f15509b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.s.h(out, "out");
            out.writeString(this.f15508a);
            out.writeParcelable(this.f15509b, i10);
        }

        public f(Parcelable parcelable, String str) {
            this.f15508a = str;
            this.f15509b = parcelable;
        }

        public f(Parcel parcel) {
            this.f15508a = parcel.readString();
            this.f15509b = parcel.readParcelable(h0.m().getClassLoader());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f15510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.facebook.internal.r0 f15511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15513d;

        public g(OutputStream outputStream, com.facebook.internal.r0 r0Var, boolean z10) {
            kotlin.jvm.internal.s.h(outputStream, "outputStream");
            this.f15510a = outputStream;
            this.f15511b = r0Var;
            this.f15512c = true;
            this.f15513d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.j0.e
        public void a(String key, String value) throws IOException {
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                r0Var.d("    " + key, value);
            }
        }

        public final void c(String format, Object... args) throws IOException {
            kotlin.jvm.internal.s.h(format, "format");
            kotlin.jvm.internal.s.h(args, "args");
            if (this.f15513d) {
                OutputStream outputStream = this.f15510a;
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.s.g(str, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, C.UTF8_NAME);
                kotlin.jvm.internal.s.g(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(bm.d.f9079b);
                kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f15512c) {
                OutputStream outputStream2 = this.f15510a;
                Charset charset = bm.d.f9079b;
                byte[] bytes2 = "--".getBytes(charset);
                kotlin.jvm.internal.s.g(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f15510a;
                byte[] bytes3 = j0.f15488p.getBytes(charset);
                kotlin.jvm.internal.s.g(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f15510a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                kotlin.jvm.internal.s.g(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f15512c = false;
            }
            OutputStream outputStream5 = this.f15510a;
            kotlin.jvm.internal.o0 o0Var2 = kotlin.jvm.internal.o0.f43602a;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            kotlin.jvm.internal.s.g(str2, "format(format, *args)");
            byte[] bytes5 = str2.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) throws IOException {
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(bitmap, "bitmap");
            f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f15510a);
            i("", new Object[0]);
            k();
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                r0Var.d("    " + key, "<Image>");
            }
        }

        public final void f(String str, String str2, String str3) throws IOException {
            if (this.f15513d) {
                OutputStream outputStream = this.f15510a;
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                kotlin.jvm.internal.s.g(str4, "format(format, *args)");
                byte[] bytes = str4.getBytes(bm.d.f9079b);
                kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(String key, Uri contentUri, String str) throws IOException {
            int iQ;
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f15510a instanceof w0) {
                ((w0) this.f15510a).h(e1.A(contentUri));
                iQ = 0;
            } else {
                iQ = e1.q(h0.m().getContentResolver().openInputStream(contentUri), this.f15510a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iQ)}, 1));
                kotlin.jvm.internal.s.g(str2, "format(locale, format, *args)");
                r0Var.d("    " + key, str2);
            }
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) throws IOException {
            int iQ;
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f15510a;
            if (outputStream instanceof w0) {
                ((w0) outputStream).h(descriptor.getStatSize());
                iQ = 0;
            } else {
                iQ = e1.q(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.f15510a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iQ)}, 1));
                kotlin.jvm.internal.s.g(str2, "format(locale, format, *args)");
                r0Var.d("    " + key, str2);
            }
        }

        public final void j(String key, Object obj, j0 j0Var) throws IOException {
            kotlin.jvm.internal.s.h(key, "key");
            Closeable closeable = this.f15510a;
            if (closeable instanceof y0) {
                kotlin.jvm.internal.s.f(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((y0) closeable).a(j0Var);
            }
            c cVar = j0.f15486n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof f)) {
                throw b();
            }
            f fVar = (f) obj;
            Parcelable parcelableB = fVar.b();
            String strA = fVar.a();
            if (parcelableB instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) parcelableB, strA);
            } else {
                if (!(parcelableB instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) parcelableB, strA);
            }
        }

        public final void k() throws IOException {
            if (!this.f15513d) {
                i("--%s", j0.f15488p);
                return;
            }
            OutputStream outputStream = this.f15510a;
            byte[] bytes = "&".getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection requests) throws JSONException, IOException {
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(requestJsonArray, "requestJsonArray");
            kotlin.jvm.internal.s.h(requests, "requests");
            Closeable closeable = this.f15510a;
            if (!(closeable instanceof y0)) {
                String string = requestJsonArray.toString();
                kotlin.jvm.internal.s.g(string, "requestJsonArray.toString()");
                a(key, string);
                return;
            }
            kotlin.jvm.internal.s.f(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            y0 y0Var = (y0) closeable;
            f(key, null, null);
            c("[", new Object[0]);
            Iterator it = requests.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                j0 j0Var = (j0) it.next();
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                y0Var.a(j0Var);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                String string2 = requestJsonArray.toString();
                kotlin.jvm.internal.s.g(string2, "requestJsonArray.toString()");
                r0Var.d("    " + key, string2);
            }
        }

        public final void e(String key, byte[] bytes) throws IOException {
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f15510a.write(bytes);
            i("", new Object[0]);
            k();
            com.facebook.internal.r0 r0Var = this.f15511b;
            if (r0Var != null) {
                String str = dOIDCKnIR.DfaCrXau + key;
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                kotlin.jvm.internal.s.g(str2, "format(locale, format, *args)");
                r0Var.d(str, str2);
            }
        }

        public final void i(String str, Object... args) throws IOException {
            kotlin.jvm.internal.s.h(str, UHbHibBvYxKnPE.byEAIGDnVmUk);
            kotlin.jvm.internal.s.h(args, "args");
            c(str, Arrays.copyOf(args, args.length));
            if (this.f15513d) {
                return;
            }
            c("\r\n", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15514a;

        public h(ArrayList arrayList) {
            this.f15514a = arrayList;
        }

        @Override // com.facebook.j0.e
        public void a(String key, String value) {
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            ArrayList arrayList = this.f15514a;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, C.UTF8_NAME)}, 2));
            kotlin.jvm.internal.s.g(str, "format(locale, format, *args)");
            arrayList.add(str);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.s.g(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < iNextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "buffer.toString()");
        f15488p = string;
        f15490r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ j0(com.facebook.a aVar, String str, Bundle bundle, p0 p0Var, b bVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : p0Var, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    private final boolean A() {
        if (kotlin.jvm.internal.s.c(h0.z(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(JSONArray jSONArray, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f15495d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f15497f);
        }
        String str2 = this.f15496e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strV = v();
        jSONObject.put("relative_url", strV);
        jSONObject.put("method", this.f15502k);
        com.facebook.a aVar = this.f15492a;
        if (aVar != null) {
            com.facebook.internal.r0.f15352e.d(aVar.p());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f15498g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f15498g.get(it.next());
            if (f15486n.v(obj)) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                kotlin.jvm.internal.s.g(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f15494c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f15486n.D(jSONObject2, strV, new h(arrayList2));
            jSONObject.put(TtmlNode.TAG_BODY, TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean I() {
        String strN = n();
        boolean zT = strN != null ? bm.r.T(strN, "|", false, 2, null) : false;
        if (strN == null || !bm.r.N(strN, "IG", false, 2, null) || zT || !z()) {
            return (A() || zT) ? false : true;
        }
        return true;
    }

    public static final void b(b bVar, o0 response) {
        kotlin.jvm.internal.s.h(response, "response");
        JSONObject jSONObjectC = response.c();
        JSONObject jSONObjectOptJSONObject = jSONObjectC != null ? jSONObjectC.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(PglCryptUtils.KEY_MESSAGE) : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                if (strOptString != null && strOptString2 != null) {
                    r0 r0Var = r0.GRAPH_API_DEBUG_INFO;
                    if (kotlin.jvm.internal.s.c(strOptString2, "warning")) {
                        r0Var = r0.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!e1.e0(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
                    String TAG = f15487o;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    aVar.b(r0Var, TAG, strOptString);
                }
            }
        }
        if (bVar != null) {
            bVar.a(response);
        }
    }

    private final void i() {
        Bundle bundle = this.f15498g;
        if (I()) {
            bundle.putString("access_token", p());
        } else {
            String strN = n();
            if (strN != null) {
                bundle.putString("access_token", strN);
            }
        }
        if (!bundle.containsKey("access_token") && e1.e0(h0.t())) {
            Log.w(f15487o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (h0.M(r0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (h0.M(r0.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    private final String j(String str, boolean z10) {
        if (!z10 && this.f15502k == p0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f15498g.keySet()) {
            Object obj = this.f15498g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f15486n;
            if (cVar.w(obj)) {
                builderBuildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f15502k != p0.GET) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                kotlin.jvm.internal.s.g(str3, "format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        kotlin.jvm.internal.s.g(string, "uriBuilder.toString()");
        return string;
    }

    private final String n() {
        com.facebook.a aVar = this.f15492a;
        if (aVar != null) {
            if (!this.f15498g.containsKey("access_token")) {
                String strP = aVar.p();
                com.facebook.internal.r0.f15352e.d(strP);
                return strP;
            }
        } else if (!this.f15498g.containsKey("access_token")) {
            return p();
        }
        return this.f15498g.getString("access_token");
    }

    private final String p() {
        String strN = h0.n();
        String strT = h0.t();
        if (strN.length() <= 0 || strT.length() <= 0) {
            e1.l0(f15487o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strN + '|' + strT;
    }

    private final String s() {
        if (f15490r.matcher(this.f15493b).matches()) {
            return this.f15493b;
        }
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f15500i, this.f15493b}, 2));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    private final String y(String str) {
        if (!A()) {
            str = com.facebook.internal.x0.f();
        }
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        kotlin.jvm.internal.s.g(str2, "format(format, *args)");
        return str2;
    }

    private final boolean z() {
        if (this.f15493b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(h0.n());
        sb2.append("/?.*");
        return this.f15503l || Pattern.matches(sb2.toString(), this.f15493b) || Pattern.matches("^/?app/?.*", this.f15493b);
    }

    public final void C(final b bVar) {
        if (h0.M(r0.GRAPH_API_DEBUG_INFO) || h0.M(r0.GRAPH_API_DEBUG_WARNING)) {
            this.f15501j = new b() { // from class: com.facebook.i0
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var) {
                    j0.b(bVar, o0Var);
                }
            };
        } else {
            this.f15501j = bVar;
        }
    }

    public final void D(boolean z10) {
        this.f15503l = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.f15494c = jSONObject;
    }

    public final void F(p0 p0Var) {
        if (this.f15504m != null && p0Var != p0.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (p0Var == null) {
            p0Var = p0.GET;
        }
        this.f15502k = p0Var;
    }

    public final void G(Bundle bundle) {
        kotlin.jvm.internal.s.h(bundle, "<set-?>");
        this.f15498g = bundle;
    }

    public final void H(Object obj) {
        this.f15499h = obj;
    }

    public final o0 k() {
        return f15486n.h(this);
    }

    public final m0 l() {
        return f15486n.n(this);
    }

    public final com.facebook.a m() {
        return this.f15492a;
    }

    public final b o() {
        return this.f15501j;
    }

    public final JSONObject q() {
        return this.f15494c;
    }

    public final String r() {
        return this.f15493b;
    }

    public final p0 t() {
        return this.f15502k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f15492a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f15493b);
        sb2.append(", graphObject: ");
        sb2.append(this.f15494c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f15502k);
        sb2.append(", parameters: ");
        sb2.append(this.f15498g);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    public final Bundle u() {
        return this.f15498g;
    }

    public final String v() {
        if (this.f15504m != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strY = y(com.facebook.internal.x0.h());
        i();
        Uri uri = Uri.parse(j(strY, true));
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public final Object w() {
        return this.f15499h;
    }

    public final String x() {
        String str = this.f15504m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f15493b;
        String strY = y((this.f15502k == p0.POST && str2 != null && bm.r.z(str2, "/videos", false, 2, null)) ? com.facebook.internal.x0.j() : com.facebook.internal.x0.i(h0.z()));
        i();
        return j(strY, false);
    }

    public j0(com.facebook.a aVar, String str, Bundle bundle, p0 p0Var, b bVar, String str2) {
        this.f15497f = true;
        this.f15492a = aVar;
        this.f15493b = str;
        this.f15500i = str2;
        C(bVar);
        F(p0Var);
        if (bundle != null) {
            this.f15498g = new Bundle(bundle);
        } else {
            this.f15498g = new Bundle();
        }
        if (this.f15500i == null) {
            this.f15500i = h0.y();
        }
    }
}
