package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Date f22298h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f22300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f22301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f22302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f22303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f22305g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f22306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f22307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f22308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f22309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f22310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f22311f;

        public g a() {
            return new g(this.f22306a, this.f22307b, this.f22308c, this.f22309d, this.f22310e, this.f22311f);
        }

        public b b(Map map) {
            this.f22306a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f22306a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f22308c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f22307b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f22309d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f22311f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j10) {
            this.f22310e = j10;
            return this;
        }

        private b() {
            this.f22306a = new JSONObject();
            this.f22307b = g.f22298h;
            this.f22308c = new JSONArray();
            this.f22309d = new JSONObject();
            this.f22310e = 0L;
            this.f22311f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map c() throws JSONException {
        HashMap map = new HashMap();
        JSONArray jSONArrayF = f();
        for (int i10 = 0; i10 < jSONArrayF.length(); i10++) {
            JSONObject jSONObject = jSONArrayF.getJSONObject(i10);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    map.put(jSONArray.getString(i11), jSONObject);
                }
            }
        }
        return map;
    }

    private Map d() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < k().length(); i10++) {
            JSONObject jSONObject = k().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g e(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b m() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f22299a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public JSONArray f() {
        return this.f22302d;
    }

    public Set g(g gVar) throws JSONException {
        JSONObject jSONObjectH = e(gVar.f22299a).h();
        Map mapD = d();
        Map mapD2 = gVar.d();
        Map mapC = c();
        Map mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = h().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.h().has(next)) {
                hashSet.add(next);
            } else if (!h().get(next).equals(gVar.h().get(next))) {
                hashSet.add(next);
            } else if ((j().has(next) && !gVar.j().has(next)) || (!j().has(next) && gVar.j().has(next))) {
                hashSet.add(next);
            } else if (j().has(next) && gVar.j().has(next) && !j().getJSONObject(next).toString().equals(gVar.j().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapD.containsKey(next) != mapD2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapD.containsKey(next) && mapD2.containsKey(next) && !((Map) mapD.get(next)).equals(mapD2.get(next))) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC2.containsKey(next) && mapC.containsKey(next) && !((JSONObject) mapC2.get(next)).toString().equals(((JSONObject) mapC.get(next)).toString())) {
                hashSet.add(next);
            } else {
                jSONObjectH.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectH.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject h() {
        return this.f22300b;
    }

    public int hashCode() {
        return this.f22299a.hashCode();
    }

    public Date i() {
        return this.f22301c;
    }

    public JSONObject j() {
        return this.f22303e;
    }

    public JSONArray k() {
        return this.f22305g;
    }

    public long l() {
        return this.f22304f;
    }

    public String toString() {
        return this.f22299a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f22300b = jSONObject;
        this.f22301c = date;
        this.f22302d = jSONArray;
        this.f22303e = jSONObject2;
        this.f22304f = j10;
        this.f22305g = jSONArray2;
        this.f22299a = jSONObject3;
    }
}
