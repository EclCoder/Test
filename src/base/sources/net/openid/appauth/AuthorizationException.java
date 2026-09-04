package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.util.ArrayMap;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AuthorizationException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f47316e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthorizationException f47317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AuthorizationException f47318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AuthorizationException f47319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AuthorizationException f47320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AuthorizationException f47321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AuthorizationException f47322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AuthorizationException f47323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AuthorizationException f47324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AuthorizationException f47325i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final AuthorizationException f47326j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Map f47327k;

        static {
            AuthorizationException authorizationExceptionE = AuthorizationException.e(1000, "invalid_request");
            f47317a = authorizationExceptionE;
            AuthorizationException authorizationExceptionE2 = AuthorizationException.e(1001, "unauthorized_client");
            f47318b = authorizationExceptionE2;
            AuthorizationException authorizationExceptionE3 = AuthorizationException.e(1002, "access_denied");
            f47319c = authorizationExceptionE3;
            AuthorizationException authorizationExceptionE4 = AuthorizationException.e(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "unsupported_response_type");
            f47320d = authorizationExceptionE4;
            AuthorizationException authorizationExceptionE5 = AuthorizationException.e(1004, "invalid_scope");
            f47321e = authorizationExceptionE5;
            AuthorizationException authorizationExceptionE6 = AuthorizationException.e(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, "server_error");
            f47322f = authorizationExceptionE6;
            AuthorizationException authorizationExceptionE7 = AuthorizationException.e(1006, "temporarily_unavailable");
            f47323g = authorizationExceptionE7;
            AuthorizationException authorizationExceptionE8 = AuthorizationException.e(1007, null);
            f47324h = authorizationExceptionE8;
            AuthorizationException authorizationExceptionE9 = AuthorizationException.e(1008, null);
            f47325i = authorizationExceptionE9;
            f47326j = AuthorizationException.n(9, "Response state param did not match request state");
            f47327k = AuthorizationException.g(authorizationExceptionE, authorizationExceptionE2, authorizationExceptionE3, authorizationExceptionE4, authorizationExceptionE5, authorizationExceptionE6, authorizationExceptionE7, authorizationExceptionE8, authorizationExceptionE9);
        }

        public static AuthorizationException a(String str) {
            AuthorizationException authorizationException = (AuthorizationException) f47327k.get(str);
            return authorizationException != null ? authorizationException : f47325i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthorizationException f47328a = AuthorizationException.n(0, "Invalid discovery document");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AuthorizationException f47329b = AuthorizationException.n(1, "User cancelled flow");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AuthorizationException f47330c = AuthorizationException.n(2, "Flow cancelled programmatically");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AuthorizationException f47331d = AuthorizationException.n(3, "Network error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AuthorizationException f47332e = AuthorizationException.n(4, "Server error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AuthorizationException f47333f = AuthorizationException.n(5, "JSON deserialization error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AuthorizationException f47334g = AuthorizationException.n(6, "Token response construction error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AuthorizationException f47335h = AuthorizationException.n(7, "Invalid registration response");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AuthorizationException f47336i = AuthorizationException.n(8, "Unable to parse ID Token");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final AuthorizationException f47337j = AuthorizationException.n(9, "Invalid ID Token");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthorizationException f47338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AuthorizationException f47339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AuthorizationException f47340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AuthorizationException f47341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AuthorizationException f47342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AuthorizationException f47343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AuthorizationException f47344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AuthorizationException f47345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Map f47346i;

        static {
            AuthorizationException authorizationExceptionR = AuthorizationException.r(2000, "invalid_request");
            f47338a = authorizationExceptionR;
            AuthorizationException authorizationExceptionR2 = AuthorizationException.r(2001, "invalid_client");
            f47339b = authorizationExceptionR2;
            AuthorizationException authorizationExceptionR3 = AuthorizationException.r(2002, "invalid_grant");
            f47340c = authorizationExceptionR3;
            AuthorizationException authorizationExceptionR4 = AuthorizationException.r(2003, "unauthorized_client");
            f47341d = authorizationExceptionR4;
            AuthorizationException authorizationExceptionR5 = AuthorizationException.r(2004, "unsupported_grant_type");
            f47342e = authorizationExceptionR5;
            AuthorizationException authorizationExceptionR6 = AuthorizationException.r(2005, "invalid_scope");
            f47343f = authorizationExceptionR6;
            AuthorizationException authorizationExceptionR7 = AuthorizationException.r(2006, null);
            f47344g = authorizationExceptionR7;
            AuthorizationException authorizationExceptionR8 = AuthorizationException.r(2007, null);
            f47345h = authorizationExceptionR8;
            f47346i = AuthorizationException.g(authorizationExceptionR, authorizationExceptionR2, authorizationExceptionR3, authorizationExceptionR4, authorizationExceptionR5, authorizationExceptionR6, authorizationExceptionR7, authorizationExceptionR8);
        }

        public static AuthorizationException a(String str) {
            AuthorizationException authorizationException = (AuthorizationException) f47346i.get(str);
            return authorizationException != null ? authorizationException : f47345h;
        }
    }

    public AuthorizationException(int i10, int i11, String str, String str2, Uri uri, Throwable th2) {
        super(str2, th2);
        this.f47312a = i10;
        this.f47313b = i11;
        this.f47314c = str;
        this.f47315d = str2;
        this.f47316e = uri;
    }

    public static AuthorizationException e(int i10, String str) {
        return new AuthorizationException(1, i10, str, null, null, null);
    }

    public static Map g(AuthorizationException... authorizationExceptionArr) {
        ArrayMap arrayMap = new ArrayMap(authorizationExceptionArr != null ? authorizationExceptionArr.length : 0);
        if (authorizationExceptionArr != null) {
            for (AuthorizationException authorizationException : authorizationExceptionArr) {
                String str = authorizationException.f47314c;
                if (str != null) {
                    arrayMap.put(str, authorizationException);
                }
            }
        }
        return Collections.unmodifiableMap(arrayMap);
    }

    public static AuthorizationException h(Intent intent) {
        wm.d.e(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return i(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e10);
        }
    }

    public static AuthorizationException i(String str) {
        wm.d.d(str, "jsonStr cannot be null or empty");
        return j(new JSONObject(str));
    }

    public static AuthorizationException j(JSONObject jSONObject) {
        wm.d.f(jSONObject, "json cannot be null");
        return new AuthorizationException(jSONObject.getInt("type"), jSONObject.getInt("code"), j.d(jSONObject, "error"), j.d(jSONObject, "errorDescription"), j.i(jSONObject, "errorUri"), null);
    }

    public static AuthorizationException k(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        AuthorizationException authorizationExceptionA = a.a(queryParameter);
        int i10 = authorizationExceptionA.f47312a;
        int i11 = authorizationExceptionA.f47313b;
        if (queryParameter2 == null) {
            queryParameter2 = authorizationExceptionA.f47315d;
        }
        return new AuthorizationException(i10, i11, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : authorizationExceptionA.f47316e, null);
    }

    public static AuthorizationException l(AuthorizationException authorizationException, String str, String str2, Uri uri) {
        int i10 = authorizationException.f47312a;
        int i11 = authorizationException.f47313b;
        if (str == null) {
            str = authorizationException.f47314c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = authorizationException.f47315d;
        }
        String str4 = str2;
        if (uri == null) {
            uri = authorizationException.f47316e;
        }
        return new AuthorizationException(i10, i11, str3, str4, uri, null);
    }

    public static AuthorizationException m(AuthorizationException authorizationException, Throwable th2) {
        return new AuthorizationException(authorizationException.f47312a, authorizationException.f47313b, authorizationException.f47314c, authorizationException.f47315d, authorizationException.f47316e, th2);
    }

    public static AuthorizationException n(int i10, String str) {
        return new AuthorizationException(0, i10, null, str, null, null);
    }

    public static AuthorizationException r(int i10, String str) {
        return new AuthorizationException(2, i10, str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof AuthorizationException)) {
            AuthorizationException authorizationException = (AuthorizationException) obj;
            if (this.f47312a == authorizationException.f47312a && this.f47313b == authorizationException.f47313b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47312a + 31) * 31) + this.f47313b;
    }

    public Intent o() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", q());
        return intent;
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        j.l(jSONObject, "type", this.f47312a);
        j.l(jSONObject, "code", this.f47313b);
        j.r(jSONObject, "error", this.f47314c);
        j.r(jSONObject, "errorDescription", this.f47315d);
        j.p(jSONObject, "errorUri", this.f47316e);
        return jSONObject;
    }

    public String q() {
        return p().toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthorizationException: " + q();
    }
}
