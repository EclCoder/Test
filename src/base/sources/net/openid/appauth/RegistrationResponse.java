package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RegistrationResponse {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f47379j = new HashSet(Arrays.asList("client_id", "client_secret", "client_secret_expires_at", "registration_access_token", "registration_client_uri", "client_id_issued_at", "token_endpoint_auth_method"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f47380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f47382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f47384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f47386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f47388i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class MissingArgumentException extends Exception {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f47389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f47391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f47393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f47395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47396h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Map f47397i = Collections.EMPTY_MAP;

        public b(k kVar) {
            i(kVar);
        }

        public RegistrationResponse a() {
            return new RegistrationResponse(this.f47389a, this.f47390b, this.f47391c, this.f47392d, this.f47393e, this.f47394f, this.f47395g, this.f47396h, this.f47397i);
        }

        public b b(Map map) {
            this.f47397i = net.openid.appauth.a.b(map, RegistrationResponse.f47379j);
            return this;
        }

        public b c(String str) {
            wm.d.d(str, "client ID cannot be null or empty");
            this.f47390b = str;
            return this;
        }

        public b d(Long l10) {
            this.f47391c = l10;
            return this;
        }

        public b e(String str) {
            this.f47392d = str;
            return this;
        }

        public b f(Long l10) {
            this.f47393e = l10;
            return this;
        }

        public b g(String str) {
            this.f47394f = str;
            return this;
        }

        public b h(Uri uri) {
            this.f47395g = uri;
            return this;
        }

        public b i(k kVar) {
            this.f47389a = (k) wm.d.f(kVar, "request cannot be null");
            return this;
        }

        public b j(String str) {
            this.f47396h = str;
            return this;
        }
    }

    public static RegistrationResponse b(JSONObject jSONObject) {
        wm.d.f(jSONObject, "json cannot be null");
        if (jSONObject.has(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA)) {
            return new b(k.b(jSONObject.getJSONObject(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA))).c(j.c(jSONObject, "client_id")).d(j.b(jSONObject, "client_id_issued_at")).e(j.d(jSONObject, "client_secret")).f(j.b(jSONObject, "client_secret_expires_at")).g(j.d(jSONObject, "registration_access_token")).h(j.i(jSONObject, "registration_client_uri")).j(j.d(jSONObject, "token_endpoint_auth_method")).b(j.g(jSONObject, "additionalParameters")).a();
        }
        throw new IllegalArgumentException("registration request not found in JSON");
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        j.o(jSONObject, com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, this.f47380a.c());
        j.m(jSONObject, "client_id", this.f47381b);
        j.q(jSONObject, "client_id_issued_at", this.f47382c);
        j.r(jSONObject, "client_secret", this.f47383d);
        j.q(jSONObject, "client_secret_expires_at", this.f47384e);
        j.r(jSONObject, "registration_access_token", this.f47385f);
        j.p(jSONObject, "registration_client_uri", this.f47386g);
        j.r(jSONObject, "token_endpoint_auth_method", this.f47387h);
        j.o(jSONObject, "additionalParameters", j.k(this.f47388i));
        return jSONObject;
    }

    public RegistrationResponse(k kVar, String str, Long l10, String str2, Long l11, String str3, Uri uri, String str4, Map map) {
        this.f47380a = kVar;
        this.f47381b = str;
        this.f47382c = l10;
        this.f47383d = str2;
        this.f47384e = l11;
        this.f47385f = str3;
        this.f47386g = uri;
        this.f47387h = str4;
        this.f47388i = map;
    }
}
