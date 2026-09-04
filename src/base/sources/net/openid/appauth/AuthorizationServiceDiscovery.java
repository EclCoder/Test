package net.openid.appauth;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationServiceDiscovery {
    public static final j.e A;
    public static final j.f B;
    public static final j.e C;
    public static final j.e D;
    public static final j.a E;
    public static final j.a F;
    public static final j.a G;
    public static final j.a H;
    public static final j.f I;
    public static final j.f J;
    public static final List K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j.d f47352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j.f f47353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j.f f47354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j.f f47355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j.f f47356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j.f f47357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j.e f47358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j.e f47359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j.e f47360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j.e f47361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j.e f47362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j.e f47363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j.e f47364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j.e f47365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j.e f47366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j.e f47367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j.e f47368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j.e f47369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j.e f47370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j.e f47371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j.e f47372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j.e f47373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j.e f47374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j.e f47375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j.e f47376z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f47377a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class MissingArgumentException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47378a;

        public MissingArgumentException(String str) {
            super("Missing mandatory configuration field: " + str);
            this.f47378a = str;
        }

        public String d() {
            return this.f47378a;
        }
    }

    public AuthorizationServiceDiscovery(JSONObject jSONObject) throws MissingArgumentException {
        this.f47377a = (JSONObject) wm.d.e(jSONObject);
        for (String str : K) {
            if (!this.f47377a.has(str) || this.f47377a.get(str) == null) {
                throw new MissingArgumentException(str);
            }
        }
    }

    public static j.a a(String str, boolean z10) {
        return new j.a(str, z10);
    }

    private Object b(j.b bVar) {
        return j.a(this.f47377a, bVar);
    }

    public static j.d g(String str) {
        return new j.d(str);
    }

    public static j.e h(String str) {
        return new j.e(str);
    }

    public static j.e i(String str, List list) {
        return new j.e(str, list);
    }

    public static j.f j(String str) {
        return new j.f(str);
    }

    public Uri c() {
        return (Uri) b(f47353c);
    }

    public String d() {
        return (String) b(f47352b);
    }

    public Uri e() {
        return (Uri) b(f47357g);
    }

    public Uri f() {
        return (Uri) b(f47354d);
    }

    static {
        j.d dVarG = g("issuer");
        f47352b = dVarG;
        j.f fVarJ = j("authorization_endpoint");
        f47353c = fVarJ;
        f47354d = j("token_endpoint");
        f47355e = j("userinfo_endpoint");
        j.f fVarJ2 = j("jwks_uri");
        f47356f = fVarJ2;
        f47357g = j("registration_endpoint");
        f47358h = h("scopes_supported");
        j.e eVarH = h("response_types_supported");
        f47359i = eVarH;
        f47360j = h("response_modes_supported");
        f47361k = i(NhHRaDJCHtCTJR.gKHxcbNjcmfnsTD, Arrays.asList("authorization_code", "implicit"));
        f47362l = h("acr_values_supported");
        j.e eVarH2 = h("subject_types_supported");
        f47363m = eVarH2;
        j.e eVarH3 = h("id_token_signing_alg_values_supported");
        f47364n = eVarH3;
        f47365o = h("id_token_encryption_enc_values_supported");
        f47366p = h("id_token_encryption_enc_values_supported");
        f47367q = h("userinfo_signing_alg_values_supported");
        f47368r = h("userinfo_encryption_alg_values_supported");
        f47369s = h("userinfo_encryption_enc_values_supported");
        f47370t = h("request_object_signing_alg_values_supported");
        f47371u = h("request_object_encryption_alg_values_supported");
        f47372v = h("request_object_encryption_enc_values_supported");
        f47373w = i("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
        f47374x = h("token_endpoint_auth_signing_alg_values_supported");
        f47375y = h("display_values_supported");
        f47376z = i("claim_types_supported", Collections.singletonList("normal"));
        A = h("claims_supported");
        B = j("service_documentation");
        C = h("claims_locales_supported");
        D = h("ui_locales_supported");
        E = a("claims_parameter_supported", false);
        F = a("request_parameter_supported", false);
        G = a("request_uri_parameter_supported", true);
        H = a("require_request_uri_registration", false);
        I = j("op_policy_uri");
        J = j("op_tos_uri");
        K = Arrays.asList(dVarG.f47482a, fVarJ.f47482a, fVarJ2.f47482a, eVarH.f47484a, eVarH2.f47484a, eVarH3.f47484a);
    }
}
