package net.openid.appauth;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends b {
        public a(String str, boolean z10) {
            super(str, Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f47483b;

        public b(String str, Object obj) {
            this.f47482a = str;
            this.f47483b = obj;
        }

        abstract Object a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f47485b;

        public c(String str, List list) {
            this.f47484a = str;
            this.f47485b = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends b {
        public d(String str, String str2) {
            super(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }

        public d(String str) {
            this(str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends c {
        public e(String str) {
            super(str, null);
        }

        public e(String str, List list) {
            super(str, list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends b {
        public f(String str, Uri uri) {
            super(str, uri);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri a(String str) {
            return Uri.parse(str);
        }

        public f(String str) {
            this(str, null);
        }
    }

    public static Object a(JSONObject jSONObject, b bVar) {
        try {
            return !jSONObject.has(bVar.f47482a) ? bVar.f47483b : bVar.a(jSONObject.getString(bVar.f47482a));
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    public static Long b(JSONObject jSONObject, String str) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String c(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static String d(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List e(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (jSONObject.has(str)) {
            return t(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static List f(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            return t(jSONArray);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Map g(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, (String) wm.d.f(jSONObject2.getString(next), "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static Uri h(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri i(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List j(JSONObject jSONObject, String str) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (jSONObject.has(str)) {
            return u(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static JSONObject k(Map map) {
        wm.d.e(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            wm.d.f((String) entry.getKey(), "map entries must not have null keys");
            wm.d.f((String) entry.getValue(), "map entries must not have null values");
            m(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    public static void l(JSONObject jSONObject, String str, int i10) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        wm.d.f(Integer.valueOf(i10), "value must not be null");
        try {
            jSONObject.put(str, i10);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void m(JSONObject jSONObject, String str, String str2) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        wm.d.f(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void n(JSONObject jSONObject, String str, JSONArray jSONArray) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        wm.d.f(jSONArray, "value must not be null");
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void o(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        wm.d.f(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void q(JSONObject jSONObject, String str, Long l10) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (l10 == null) {
            return;
        }
        try {
            jSONObject.put(str, l10);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void r(JSONObject jSONObject, String str, String str2) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static JSONArray s(Iterable iterable) {
        wm.d.f(iterable, "objects cannot be null");
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    public static List t(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(wm.d.e(jSONArray.get(i10)).toString());
            }
        }
        return arrayList;
    }

    public static List u(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(Uri.parse(wm.d.e(jSONArray.get(i10)).toString()));
            }
        }
        return arrayList;
    }

    public static void p(JSONObject jSONObject, String str, Uri uri) {
        wm.d.f(jSONObject, "json must not be null");
        wm.d.f(str, SVWsZyNSAChGIA.RmDzphqd);
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }
}
