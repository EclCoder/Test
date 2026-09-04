package net.openid.appauth;

import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f47409p = net.openid.appauth.a.a(YSHErhbVu.QkzIDYtRmceJd, "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", XTkUEXuiK.jrhZvXSoKyBCS, "response_type", "scope", "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f47410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f47416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f47420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f47421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f47422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f47423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f47424o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f47425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f47431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f47433i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f47434j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f47435k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f47436l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f47437m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f47438n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Map f47439o = new HashMap();

        public b(g gVar, String str, String str2, Uri uri) {
            c(gVar);
            d(str);
            m(str2);
            k(uri);
            p(d.c());
            i(d.c());
            e(wm.b.c());
        }

        public d a() {
            return new d(this.f47425a, this.f47426b, this.f47430f, this.f47431g, this.f47427c, this.f47428d, this.f47429e, this.f47432h, this.f47433i, this.f47434j, this.f47435k, this.f47436l, this.f47437m, this.f47438n, Collections.unmodifiableMap(new HashMap(this.f47439o)));
        }

        public b b(Map map) {
            this.f47439o = net.openid.appauth.a.b(map, d.f47409p);
            return this;
        }

        public b c(g gVar) {
            this.f47425a = (g) wm.d.f(gVar, "configuration cannot be null");
            return this;
        }

        public b d(String str) {
            this.f47426b = wm.d.d(str, "client ID cannot be null or empty");
            return this;
        }

        public b e(String str) {
            if (str == null) {
                this.f47435k = null;
                this.f47436l = null;
                this.f47437m = null;
                return this;
            }
            wm.b.a(str);
            this.f47435k = str;
            this.f47436l = wm.b.b(str);
            this.f47437m = wm.b.e();
            return this;
        }

        public b f(String str, String str2, String str3) {
            if (str != null) {
                wm.b.a(str);
                wm.d.d(str2, "code verifier challenge cannot be null or empty if verifier is set");
                wm.d.d(str3, "code verifier challenge method cannot be null or empty if verifier is set");
            } else {
                wm.d.a(str2 == null, "code verifier challenge must be null if verifier is null");
                wm.d.a(str3 == null, "code verifier challenge method must be null if verifier is null");
            }
            this.f47435k = str;
            this.f47436l = str2;
            this.f47437m = str3;
            return this;
        }

        public b g(String str) {
            this.f47427c = wm.d.g(str, "display must be null or not empty");
            return this;
        }

        public b h(String str) {
            this.f47428d = wm.d.g(str, "login hint must be null or not empty");
            return this;
        }

        public b i(String str) {
            this.f47434j = wm.d.g(str, "state cannot be empty if defined");
            return this;
        }

        public b j(String str) {
            this.f47429e = wm.d.g(str, "prompt must be null or non-empty");
            return this;
        }

        public b k(Uri uri) {
            this.f47431g = (Uri) wm.d.f(uri, "redirect URI cannot be null or empty");
            return this;
        }

        public b l(String str) {
            wm.d.g(str, "responseMode must not be empty");
            this.f47438n = str;
            return this;
        }

        public b m(String str) {
            this.f47430f = wm.d.d(str, "expected response type cannot be null or empty");
            return this;
        }

        public b n(Iterable iterable) {
            this.f47432h = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b o(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            n(Arrays.asList(strArr));
            return this;
        }

        public b p(String str) {
            this.f47433i = wm.d.g(str, "state cannot be empty if defined");
            return this;
        }
    }

    public static String c() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static d d(String str) {
        wm.d.f(str, "json string cannot be null");
        return e(new JSONObject(str));
    }

    public static d e(JSONObject jSONObject) {
        wm.d.f(jSONObject, "json cannot be null");
        b bVarB = new b(g.a(jSONObject.getJSONObject("configuration")), j.c(jSONObject, "clientId"), j.c(jSONObject, "responseType"), j.h(jSONObject, "redirectUri")).g(j.d(jSONObject, "display")).h(j.d(jSONObject, "login_hint")).j(j.d(jSONObject, "prompt")).p(j.d(jSONObject, "state")).i(j.d(jSONObject, "nonce")).f(j.d(jSONObject, "codeVerifier"), j.d(jSONObject, "codeVerifierChallenge"), j.d(jSONObject, "codeVerifierChallengeMethod")).l(j.d(jSONObject, "responseMode")).b(j.g(jSONObject, "additionalParameters"));
        if (jSONObject.has("scope")) {
            bVarB.n(net.openid.appauth.b.b(j.c(jSONObject, "scope")));
        }
        return bVarB.a();
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        j.o(jSONObject, "configuration", this.f47410a.b());
        j.m(jSONObject, "clientId", this.f47411b);
        j.m(jSONObject, "responseType", this.f47415f);
        j.m(jSONObject, "redirectUri", this.f47416g.toString());
        j.r(jSONObject, "display", this.f47412c);
        j.r(jSONObject, "login_hint", this.f47413d);
        j.r(jSONObject, "scope", this.f47417h);
        j.r(jSONObject, "prompt", this.f47414e);
        j.r(jSONObject, "state", this.f47418i);
        j.r(jSONObject, "nonce", this.f47419j);
        j.r(jSONObject, "codeVerifier", this.f47420k);
        j.r(jSONObject, "codeVerifierChallenge", this.f47421l);
        j.r(jSONObject, "codeVerifierChallengeMethod", this.f47422m);
        j.r(jSONObject, "responseMode", this.f47423n);
        j.o(jSONObject, "additionalParameters", j.k(this.f47424o));
        return jSONObject;
    }

    public String g() {
        return f().toString();
    }

    public Uri h() {
        Uri.Builder builderAppendQueryParameter = this.f47410a.f47470a.buildUpon().appendQueryParameter("redirect_uri", this.f47416g.toString()).appendQueryParameter("client_id", this.f47411b).appendQueryParameter("response_type", this.f47415f);
        zm.b.a(builderAppendQueryParameter, "display", this.f47412c);
        zm.b.a(builderAppendQueryParameter, "login_hint", this.f47413d);
        zm.b.a(builderAppendQueryParameter, "prompt", this.f47414e);
        zm.b.a(builderAppendQueryParameter, "state", this.f47418i);
        zm.b.a(builderAppendQueryParameter, "nonce", this.f47419j);
        zm.b.a(builderAppendQueryParameter, "scope", this.f47417h);
        zm.b.a(builderAppendQueryParameter, "response_mode", this.f47423n);
        if (this.f47420k != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", this.f47421l).appendQueryParameter("code_challenge_method", this.f47422m);
        }
        for (Map.Entry entry : this.f47424o.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderAppendQueryParameter.build();
    }

    public d(g gVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map) {
        this.f47410a = gVar;
        this.f47411b = str;
        this.f47415f = str2;
        this.f47416g = uri;
        this.f47424o = map;
        this.f47412c = str3;
        this.f47413d = str4;
        this.f47414e = str5;
        this.f47417h = str6;
        this.f47418i = str7;
        this.f47419j = str8;
        this.f47420k = str9;
        this.f47421l = str10;
        this.f47422m = str11;
        this.f47423n = str12;
    }
}
