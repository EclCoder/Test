package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f47524i = new HashSet(Arrays.asList("token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f47525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f47528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f47532h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f47533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f47536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f47540h;

        public a(m mVar) {
            j(mVar);
            this.f47540h = Collections.EMPTY_MAP;
        }

        public n a() {
            return new n(this.f47533a, this.f47534b, this.f47535c, this.f47536d, this.f47537e, this.f47538f, this.f47539g, this.f47540h);
        }

        public a b(JSONObject jSONObject) {
            n(j.c(jSONObject, "token_type"));
            c(j.d(jSONObject, "access_token"));
            d(j.b(jSONObject, "expires_at"));
            if (jSONObject.has("expires_in")) {
                e(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            i(j.d(jSONObject, "refresh_token"));
            h(j.d(jSONObject, "id_token"));
            k(j.d(jSONObject, "scope"));
            g(net.openid.appauth.a.d(jSONObject, n.f47524i));
            return this;
        }

        public a c(String str) {
            this.f47535c = wm.d.g(str, "access token cannot be empty if specified");
            return this;
        }

        public a d(Long l10) {
            this.f47536d = l10;
            return this;
        }

        public a e(Long l10) {
            return f(l10, l.f47502a);
        }

        a f(Long l10, h hVar) {
            if (l10 == null) {
                this.f47536d = null;
                return this;
            }
            this.f47536d = Long.valueOf(hVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public a g(Map map) {
            this.f47540h = net.openid.appauth.a.b(map, n.f47524i);
            return this;
        }

        public a h(String str) {
            this.f47537e = wm.d.g(str, "id token must not be empty if defined");
            return this;
        }

        public a i(String str) {
            this.f47538f = wm.d.g(str, "refresh token must not be empty if defined");
            return this;
        }

        public a j(m mVar) {
            this.f47533a = (m) wm.d.f(mVar, "request cannot be null");
            return this;
        }

        public a k(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f47539g = null;
                return this;
            }
            m(str.split(" +"));
            return this;
        }

        public a l(Iterable iterable) {
            this.f47539g = b.a(iterable);
            return this;
        }

        public a m(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            l(Arrays.asList(strArr));
            return this;
        }

        public a n(String str) {
            this.f47534b = wm.d.g(str, "token type must not be empty if defined");
            return this;
        }
    }

    public n(m mVar, String str, String str2, Long l10, String str3, String str4, String str5, Map map) {
        this.f47525a = mVar;
        this.f47526b = str;
        this.f47527c = str2;
        this.f47528d = l10;
        this.f47529e = str3;
        this.f47530f = str4;
        this.f47531g = str5;
        this.f47532h = map;
    }

    public static n b(JSONObject jSONObject) {
        if (jSONObject.has(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA)) {
            return new a(m.c(jSONObject.getJSONObject(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA))).n(j.d(jSONObject, "token_type")).c(j.d(jSONObject, "access_token")).d(j.b(jSONObject, "expires_at")).h(j.d(jSONObject, "id_token")).i(j.d(jSONObject, "refresh_token")).k(j.d(jSONObject, "scope")).g(j.g(jSONObject, "additionalParameters")).a();
        }
        throw new IllegalArgumentException("token request not provided and not found in JSON");
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        j.o(jSONObject, com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, this.f47525a.d());
        j.r(jSONObject, "token_type", this.f47526b);
        j.r(jSONObject, "access_token", this.f47527c);
        j.q(jSONObject, "expires_at", this.f47528d);
        j.r(jSONObject, "id_token", this.f47529e);
        j.r(jSONObject, "refresh_token", this.f47530f);
        j.r(jSONObject, "scope", this.f47531g);
        j.o(jSONObject, "additionalParameters", j.k(this.f47532h));
        return jSONObject;
    }
}
