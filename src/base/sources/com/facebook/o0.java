package com.facebook;

import android.util.Log;
import com.facebook.internal.e1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15946i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f15947j = o0.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f15948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f15949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f15951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONArray f15952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f15953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONObject f15954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONArray f15955h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final o0 b(j0 j0Var, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                x xVarA = x.f16086o.a(jSONObject, obj, httpURLConnection);
                if (xVarA != null) {
                    Log.e(o0.f15947j, xVarA.toString());
                    if (xVarA.b() == 190 && e1.a0(j0Var.m())) {
                        if (xVarA.i() != 493) {
                            com.facebook.a.f14853l.i(null);
                        } else {
                            com.facebook.a.c cVar = com.facebook.a.f14853l;
                            com.facebook.a aVarE = cVar.e();
                            if (aVarE != null && !aVarE.s()) {
                                cVar.d();
                            }
                        }
                    }
                    return new o0(j0Var, httpURLConnection, xVarA);
                }
                Object objP = e1.P(jSONObject, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
                if (objP instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objP;
                    return new o0(j0Var, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objP instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objP;
                    return new o0(j0Var, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                kotlin.jvm.internal.s.g(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new o0(j0Var, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + NULL.getClass().getSimpleName());
        }

        private final List c(HttpURLConnection httpURLConnection, List list, Object obj) {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                j0 j0Var = (j0) list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TtmlNode.TAG_BODY, obj);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new o0(j0Var, httpURLConnection, new x(httpURLConnection, e10)));
                    obj2 = obj;
                } catch (JSONException e11) {
                    arrayList.add(new o0(j0Var, httpURLConnection, new x(httpURLConnection, e11)));
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        j0 j0Var2 = (j0) list.get(i10);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i10);
                            kotlin.jvm.internal.s.g(obj3, "obj");
                            arrayList.add(b(j0Var2, httpURLConnection, obj3, obj));
                        } catch (FacebookException e12) {
                            arrayList.add(new o0(j0Var2, httpURLConnection, new x(httpURLConnection, e12)));
                        } catch (JSONException e13) {
                            arrayList.add(new o0(j0Var2, httpURLConnection, new x(httpURLConnection, e13)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        public final List a(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            kotlin.jvm.internal.s.h(requests, "requests");
            List list = requests;
            ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new o0((j0) it.next(), httpURLConnection, new x(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, n0 requests) throws IOException {
            kotlin.jvm.internal.s.h(requests, "requests");
            String strV0 = e1.v0(inputStream);
            com.facebook.internal.r0.f15352e.c(r0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strV0.length()), strV0);
            return e(strV0, httpURLConnection, requests);
        }

        public final List e(String responseString, HttpURLConnection httpURLConnection, n0 requests) throws JSONException {
            kotlin.jvm.internal.s.h(responseString, "responseString");
            kotlin.jvm.internal.s.h(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            kotlin.jvm.internal.s.g(resultObject, "resultObject");
            List listC = c(httpURLConnection, requests, resultObject);
            com.facebook.internal.r0.f15352e.c(r0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.r(), Integer.valueOf(responseString.length()), listC);
            return listC;
        }

        public final List f(HttpURLConnection connection, n0 requests) {
            List listA;
            kotlin.jvm.internal.s.h(connection, "connection");
            kotlin.jvm.internal.s.h(requests, "requests");
            try {
                try {
                    try {
                        if (!h0.J()) {
                            Log.e(o0.f15947j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        List listD = d(errorStream, connection, requests);
                        e1.j(errorStream);
                        return listD;
                    } catch (FacebookException e10) {
                        com.facebook.internal.r0.f15352e.c(r0.REQUESTS, "Response", "Response <Error>: %s", e10);
                        listA = a(requests, connection, e10);
                        e1.j(null);
                        return listA;
                    }
                } catch (Exception e11) {
                    com.facebook.internal.r0.f15352e.c(r0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    listA = a(requests, connection, new FacebookException(e11));
                    e1.j(null);
                    return listA;
                }
            } catch (Throwable th2) {
                e1.j(null);
                throw th2;
            }
        }

        public a() {
        }
    }

    public o0(j0 request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, x xVar) {
        kotlin.jvm.internal.s.h(request, "request");
        this.f15948a = request;
        this.f15949b = httpURLConnection;
        this.f15950c = str;
        this.f15951d = jSONObject;
        this.f15952e = jSONArray;
        this.f15953f = xVar;
        this.f15954g = jSONObject;
        this.f15955h = jSONArray;
    }

    public final x b() {
        return this.f15953f;
    }

    public final JSONObject c() {
        return this.f15951d;
    }

    public final JSONObject d() {
        return this.f15954g;
    }

    public String toString() {
        String str;
        try {
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f15949b;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            kotlin.jvm.internal.s.g(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f15951d + ", error: " + this.f15953f + "}";
        kotlin.jvm.internal.s.g(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(rawResponse, "rawResponse");
        kotlin.jvm.internal.s.h(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, x error) {
        this(request, httpURLConnection, null, null, null, error);
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(error, "error");
    }
}
