package net.openid.appauth;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f47470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f47471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f47472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AuthorizationServiceDiscovery f47473d;

    public g(Uri uri, Uri uri2, Uri uri3) {
        this.f47470a = (Uri) wm.d.e(uri);
        this.f47471b = (Uri) wm.d.e(uri2);
        this.f47472c = uri3;
        this.f47473d = null;
    }

    public static g a(JSONObject jSONObject) throws JSONException {
        wm.d.f(jSONObject, "json object cannot be null");
        if (!jSONObject.has("discoveryDoc")) {
            wm.d.a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            wm.d.a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new g(j.h(jSONObject, "authorizationEndpoint"), j.h(jSONObject, "tokenEndpoint"), j.i(jSONObject, "registrationEndpoint"));
        }
        try {
            return new g(new AuthorizationServiceDiscovery(jSONObject.optJSONObject("discoveryDoc")));
        } catch (AuthorizationServiceDiscovery.MissingArgumentException e10) {
            throw new JSONException("Missing required field in discovery doc: " + e10.d());
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        j.m(jSONObject, "authorizationEndpoint", this.f47470a.toString());
        j.m(jSONObject, "tokenEndpoint", this.f47471b.toString());
        Uri uri = this.f47472c;
        if (uri != null) {
            j.m(jSONObject, "registrationEndpoint", uri.toString());
        }
        AuthorizationServiceDiscovery authorizationServiceDiscovery = this.f47473d;
        if (authorizationServiceDiscovery != null) {
            j.o(jSONObject, "discoveryDoc", authorizationServiceDiscovery.f47377a);
        }
        return jSONObject;
    }

    public g(AuthorizationServiceDiscovery authorizationServiceDiscovery) {
        wm.d.f(authorizationServiceDiscovery, "docJson cannot be null");
        this.f47473d = authorizationServiceDiscovery;
        this.f47470a = authorizationServiceDiscovery.c();
        this.f47471b = authorizationServiceDiscovery.f();
        this.f47472c = authorizationServiceDiscovery.e();
    }
}
