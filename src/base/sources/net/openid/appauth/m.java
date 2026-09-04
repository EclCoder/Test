package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f47503k = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", mTFeqtajA.CLJPJm)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f47504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f47508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f47513j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f47514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f47518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f47522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map f47523j;

        public b(g gVar, String str) {
            g(gVar);
            e(str);
            this.f47523j = new LinkedHashMap();
        }

        private String b() {
            String str = this.f47517d;
            if (str != null) {
                return str;
            }
            if (this.f47520g != null) {
                return "authorization_code";
            }
            if (this.f47521h != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        public m a() {
            String strB = b();
            if ("authorization_code".equals(strB)) {
                wm.d.f(this.f47520g, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(strB)) {
                wm.d.f(this.f47521h, "refresh token must be specified for grant_type = refresh_token");
            }
            if (strB.equals("authorization_code") && this.f47518e == null) {
                throw new IllegalStateException("no redirect URI specified on token request for code exchange");
            }
            return new m(this.f47514a, this.f47515b, this.f47516c, strB, this.f47518e, this.f47519f, this.f47520g, this.f47521h, this.f47522i, Collections.unmodifiableMap(this.f47523j));
        }

        public b c(Map map) {
            this.f47523j = net.openid.appauth.a.b(map, m.f47503k);
            return this;
        }

        public b d(String str) {
            wm.d.g(str, "authorization code must not be empty");
            this.f47520g = str;
            return this;
        }

        public b e(String str) {
            this.f47515b = wm.d.d(str, "clientId cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (str != null) {
                wm.b.a(str);
            }
            this.f47522i = str;
            return this;
        }

        public b g(g gVar) {
            this.f47514a = (g) wm.d.e(gVar);
            return this;
        }

        public b h(String str) {
            this.f47517d = wm.d.d(str, "grantType cannot be null or empty");
            return this;
        }

        public b i(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f47516c = null;
                return this;
            }
            this.f47516c = str;
            return this;
        }

        public b j(Uri uri) {
            if (uri != null) {
                wm.d.f(uri.getScheme(), "redirectUri must have a scheme");
            }
            this.f47518e = uri;
            return this;
        }

        public b k(String str) {
            if (str != null) {
                wm.d.d(str, "refresh token cannot be empty if defined");
            }
            this.f47521h = str;
            return this;
        }

        public b l(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f47519f = null;
                return this;
            }
            n(str.split(" +"));
            return this;
        }

        public b m(Iterable iterable) {
            this.f47519f = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b n(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m(Arrays.asList(strArr));
            return this;
        }
    }

    public static m c(JSONObject jSONObject) {
        wm.d.f(jSONObject, "json object cannot be null");
        b bVarI = new b(g.a(jSONObject.getJSONObject("configuration")), j.c(jSONObject, "clientId")).j(j.i(jSONObject, "redirectUri")).h(j.c(jSONObject, "grantType")).k(j.d(jSONObject, "refreshToken")).d(j.d(jSONObject, "authorizationCode")).c(j.g(jSONObject, "additionalParameters")).i(j.d(jSONObject, "nonce"));
        if (jSONObject.has("scope")) {
            bVarI.m(net.openid.appauth.b.b(j.c(jSONObject, "scope")));
        }
        return bVarI.a();
    }

    private void e(Map map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        j.o(jSONObject, "configuration", this.f47504a.b());
        j.m(jSONObject, "clientId", this.f47506c);
        j.r(jSONObject, "nonce", this.f47505b);
        j.m(jSONObject, "grantType", this.f47507d);
        j.p(jSONObject, "redirectUri", this.f47508e);
        j.r(jSONObject, "scope", this.f47510g);
        j.r(jSONObject, "authorizationCode", this.f47509f);
        j.r(jSONObject, "refreshToken", this.f47511h);
        j.o(jSONObject, "additionalParameters", j.k(this.f47513j));
        return jSONObject;
    }

    public m(g gVar, String str, String str2, String str3, Uri uri, String str4, String str5, String str6, String str7, Map map) {
        this.f47504a = gVar;
        this.f47506c = str;
        this.f47505b = str2;
        this.f47507d = str3;
        this.f47508e = uri;
        this.f47510g = str4;
        this.f47509f = str5;
        this.f47511h = str6;
        this.f47512i = str7;
        this.f47513j = map;
    }

    public Map b() {
        HashMap map = new HashMap();
        map.put("grant_type", this.f47507d);
        e(map, mTFeqtajA.NHYRAsRxMaIME, this.f47508e);
        e(map, "code", this.f47509f);
        e(map, "refresh_token", this.f47511h);
        e(map, "code_verifier", this.f47512i);
        e(map, "scope", this.f47510g);
        for (Map.Entry entry : this.f47513j.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map;
    }
}
