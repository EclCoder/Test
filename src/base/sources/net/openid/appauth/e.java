package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f47440j = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f47441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f47446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f47449i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f47450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f47455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47456g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47457h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Map f47458i = new LinkedHashMap();

        public b(d dVar) {
            this.f47450a = (d) wm.d.f(dVar, "authorization request cannot be null");
        }

        public e a() {
            return new e(this.f47450a, this.f47451b, this.f47452c, this.f47453d, this.f47454e, this.f47455f, this.f47456g, this.f47457h, Collections.unmodifiableMap(this.f47458i));
        }

        public b b(Uri uri) {
            return c(uri, l.f47502a);
        }

        b c(Uri uri, h hVar) {
            m(uri.getQueryParameter("state"));
            n(uri.getQueryParameter("token_type"));
            h(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            f(zm.b.d(uri, "expires_in"), hVar);
            i(uri.getQueryParameter("id_token"));
            j(uri.getQueryParameter("scope"));
            g(net.openid.appauth.a.c(uri, e.f47440j));
            return this;
        }

        public b d(String str) {
            wm.d.g(str, "accessToken must not be empty");
            this.f47454e = str;
            return this;
        }

        public b e(Long l10) {
            this.f47455f = l10;
            return this;
        }

        public b f(Long l10, h hVar) {
            if (l10 == null) {
                this.f47455f = null;
                return this;
            }
            this.f47455f = Long.valueOf(hVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public b g(Map map) {
            this.f47458i = net.openid.appauth.a.b(map, e.f47440j);
            return this;
        }

        public b h(String str) {
            wm.d.g(str, "authorizationCode must not be empty");
            this.f47453d = str;
            return this;
        }

        public b i(String str) {
            wm.d.g(str, "idToken cannot be empty");
            this.f47456g = str;
            return this;
        }

        public b j(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f47457h = null;
                return this;
            }
            l(str.split(" +"));
            return this;
        }

        public b k(Iterable iterable) {
            this.f47457h = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b l(String... strArr) {
            if (strArr == null) {
                this.f47457h = null;
                return this;
            }
            k(Arrays.asList(strArr));
            return this;
        }

        public b m(String str) {
            wm.d.g(str, "state must not be empty");
            this.f47451b = str;
            return this;
        }

        public b n(String str) {
            wm.d.g(str, "tokenType must not be empty");
            this.f47452c = str;
            return this;
        }
    }

    public static e d(Intent intent) {
        wm.d.f(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return e(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    public static e e(String str) {
        return f(new JSONObject(str));
    }

    public m b() {
        return c(Collections.EMPTY_MAP);
    }

    public m c(Map map) {
        wm.d.f(map, "additionalExchangeParameters cannot be null");
        if (this.f47444d == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        d dVar = this.f47441a;
        return new m.b(dVar.f47410a, dVar.f47411b).h("authorization_code").j(this.f47441a.f47416g).f(this.f47441a.f47420k).d(this.f47444d).c(map).i(this.f47441a.f47419j).a();
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        j.o(jSONObject, com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, this.f47441a.f());
        j.r(jSONObject, "state", this.f47442b);
        j.r(jSONObject, "token_type", this.f47443c);
        j.r(jSONObject, "code", this.f47444d);
        j.r(jSONObject, "access_token", this.f47445e);
        j.q(jSONObject, "expires_at", this.f47446f);
        j.r(jSONObject, "id_token", this.f47447g);
        j.r(jSONObject, "scope", this.f47448h);
        j.o(jSONObject, "additional_parameters", j.k(this.f47449i));
        return jSONObject;
    }

    public String h() {
        return g().toString();
    }

    public Intent i() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", h());
        return intent;
    }

    public e(d dVar, String str, String str2, String str3, String str4, Long l10, String str5, String str6, Map map) {
        this.f47441a = dVar;
        this.f47442b = str;
        this.f47443c = str2;
        this.f47444d = str3;
        this.f47445e = str4;
        this.f47446f = l10;
        this.f47447g = str5;
        this.f47448h = str6;
        this.f47449i = map;
    }

    public static e f(JSONObject jSONObject) {
        if (jSONObject.has(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA)) {
            return new b(d.e(jSONObject.getJSONObject(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA))).n(j.d(jSONObject, "token_type")).d(j.d(jSONObject, "access_token")).h(j.d(jSONObject, mDXVAtwcaFMHJ.LxpNBokRs)).i(j.d(jSONObject, "id_token")).j(j.d(jSONObject, "scope")).m(j.d(jSONObject, "state")).e(j.b(jSONObject, "expires_at")).g(j.g(jSONObject, "additional_parameters")).a();
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }
}
