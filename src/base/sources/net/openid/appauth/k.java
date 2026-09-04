package net.openid.appauth;

import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f47486i = net.openid.appauth.a.a("redirect_uris", "response_types", "grant_types", "application_type", "subject_type", "token_endpoint_auth_method");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f47487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f47488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f47490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f47494h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f47495a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f47497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f47498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47500f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f47496b = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f47501g = Collections.EMPTY_MAP;

        public b(g gVar, List list) {
            c(gVar);
            e(list);
        }

        public k a() {
            g gVar = this.f47495a;
            List listUnmodifiableList = Collections.unmodifiableList(this.f47496b);
            List listUnmodifiableList2 = this.f47497c;
            if (listUnmodifiableList2 != null) {
                listUnmodifiableList2 = Collections.unmodifiableList(listUnmodifiableList2);
            }
            List listUnmodifiableList3 = this.f47498d;
            if (listUnmodifiableList3 != null) {
                listUnmodifiableList3 = Collections.unmodifiableList(listUnmodifiableList3);
            }
            return new k(gVar, listUnmodifiableList, listUnmodifiableList2, listUnmodifiableList3, this.f47499e, this.f47500f, Collections.unmodifiableMap(this.f47501g));
        }

        public b b(Map map) {
            this.f47501g = net.openid.appauth.a.b(map, k.f47486i);
            return this;
        }

        public b c(g gVar) {
            this.f47495a = (g) wm.d.e(gVar);
            return this;
        }

        public b d(List list) {
            this.f47498d = list;
            return this;
        }

        public b e(List list) {
            wm.d.c(list, "redirectUriValues cannot be null");
            this.f47496b = list;
            return this;
        }

        public b f(List list) {
            this.f47497c = list;
            return this;
        }

        public b g(String str) {
            this.f47499e = str;
            return this;
        }
    }

    public static k b(JSONObject jSONObject) throws JSONException {
        wm.d.f(jSONObject, "json must not be null");
        return new b(g.a(jSONObject.getJSONObject("configuration")), j.j(jSONObject, "redirect_uris")).g(j.d(jSONObject, "subject_type")).f(j.f(jSONObject, "response_types")).d(j.f(jSONObject, "grant_types")).b(j.g(jSONObject, "additionalParameters")).a();
    }

    public JSONObject c() {
        JSONObject jSONObjectD = d();
        j.o(jSONObjectD, "configuration", this.f47487a.b());
        j.o(jSONObjectD, "additionalParameters", j.k(this.f47494h));
        return jSONObjectD;
    }

    public k(g gVar, List list, List list2, List list3, String str, String str2, Map map) {
        this.f47487a = gVar;
        this.f47488b = list;
        this.f47490d = list2;
        this.f47491e = list3;
        this.f47492f = str;
        this.f47493g = str2;
        this.f47494h = map;
        this.f47489c = "native";
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        j.n(jSONObject, "redirect_uris", j.s(this.f47488b));
        j.m(jSONObject, jyeoXJ.htVlaxGQgFJilso, this.f47489c);
        List list = this.f47490d;
        if (list != null) {
            j.n(jSONObject, "response_types", j.s(list));
        }
        List list2 = this.f47491e;
        if (list2 != null) {
            j.n(jSONObject, "grant_types", j.s(list2));
        }
        j.r(jSONObject, "subject_type", this.f47492f);
        j.r(jSONObject, "token_endpoint_auth_method", this.f47493g);
        return jSONObject;
    }
}
