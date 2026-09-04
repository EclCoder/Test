package net.openid.appauth;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f47400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f47401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f47402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RegistrationResponse f47403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AuthorizationException f47404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f47405h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f47406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47407j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements f.b {
        public a() {
        }

        @Override // net.openid.appauth.f.b
        public void a(n nVar, AuthorizationException authorizationException) {
            String strH;
            AuthorizationException authorizationException2;
            String strF;
            List list;
            c.this.s(nVar, authorizationException);
            if (authorizationException == null) {
                c.this.f47407j = false;
                strF = c.this.f();
                strH = c.this.h();
                authorizationException2 = null;
            } else {
                strH = null;
                authorizationException2 = authorizationException;
                strF = null;
            }
            synchronized (c.this.f47405h) {
                list = c.this.f47406i;
                c.this.f47406i = null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(strF, strH, authorizationException2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(String str, String str2, AuthorizationException authorizationException);
    }

    public c() {
    }

    public static c l(String str) {
        wm.d.d(str, "jsonStr cannot be null or empty");
        return m(new JSONObject(str));
    }

    public static c m(JSONObject jSONObject) {
        wm.d.f(jSONObject, "json cannot be null");
        c cVar = new c();
        cVar.f47398a = j.d(jSONObject, "refreshToken");
        cVar.f47399b = j.d(jSONObject, "scope");
        if (jSONObject.has("config")) {
            cVar.f47400c = g.a(jSONObject.getJSONObject("config"));
        }
        if (jSONObject.has("mAuthorizationException")) {
            cVar.f47404g = AuthorizationException.j(jSONObject.getJSONObject("mAuthorizationException"));
        }
        if (jSONObject.has("lastAuthorizationResponse")) {
            cVar.f47401d = e.f(jSONObject.getJSONObject("lastAuthorizationResponse"));
        }
        if (jSONObject.has("mLastTokenResponse")) {
            cVar.f47402e = n.b(jSONObject.getJSONObject("mLastTokenResponse"));
        }
        if (jSONObject.has("lastRegistrationResponse")) {
            cVar.f47403f = RegistrationResponse.b(jSONObject.getJSONObject("lastRegistrationResponse"));
        }
        return cVar;
    }

    public m e(Map map) {
        if (this.f47398a == null) {
            throw new IllegalStateException("No refresh token available for refresh request");
        }
        e eVar = this.f47401d;
        if (eVar == null) {
            throw new IllegalStateException("No authorization configuration available for refresh request");
        }
        d dVar = eVar.f47441a;
        return new m.b(dVar.f47410a, dVar.f47411b).h("refresh_token").l(this.f47401d.f47441a.f47417h).k(this.f47398a).c(map).a();
    }

    public String f() {
        String str;
        if (this.f47404g != null) {
            return null;
        }
        n nVar = this.f47402e;
        if (nVar != null && (str = nVar.f47527c) != null) {
            return str;
        }
        e eVar = this.f47401d;
        if (eVar != null) {
            return eVar.f47445e;
        }
        return null;
    }

    public Long g() {
        if (this.f47404g != null) {
            return null;
        }
        n nVar = this.f47402e;
        if (nVar != null && nVar.f47527c != null) {
            return nVar.f47528d;
        }
        e eVar = this.f47401d;
        if (eVar == null || eVar.f47445e == null) {
            return null;
        }
        return eVar.f47446f;
    }

    public String h() {
        String str;
        if (this.f47404g != null) {
            return null;
        }
        n nVar = this.f47402e;
        if (nVar != null && (str = nVar.f47529e) != null) {
            return str;
        }
        e eVar = this.f47401d;
        if (eVar != null) {
            return eVar.f47447g;
        }
        return null;
    }

    public boolean i() {
        return j(l.f47502a);
    }

    boolean j(h hVar) {
        if (this.f47407j) {
            return true;
        }
        if (g() == null) {
            return f() == null;
        }
        return g().longValue() <= hVar.a() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    public boolean k() {
        if (this.f47404g == null) {
            return (f() == null && h() == null) ? false : true;
        }
        return false;
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        j.r(jSONObject, "refreshToken", this.f47398a);
        j.r(jSONObject, "scope", this.f47399b);
        g gVar = this.f47400c;
        if (gVar != null) {
            j.o(jSONObject, "config", gVar.b());
        }
        AuthorizationException authorizationException = this.f47404g;
        if (authorizationException != null) {
            j.o(jSONObject, "mAuthorizationException", authorizationException.p());
        }
        e eVar = this.f47401d;
        if (eVar != null) {
            j.o(jSONObject, "lastAuthorizationResponse", eVar.g());
        }
        n nVar = this.f47402e;
        if (nVar != null) {
            j.o(jSONObject, "mLastTokenResponse", nVar.c());
        }
        RegistrationResponse registrationResponse = this.f47403f;
        if (registrationResponse != null) {
            j.o(jSONObject, "lastRegistrationResponse", registrationResponse.c());
        }
        return jSONObject;
    }

    public String o() {
        return n().toString();
    }

    public void p(f fVar, b bVar) {
        q(fVar, wm.c.f56371a, Collections.EMPTY_MAP, l.f47502a, bVar);
    }

    void q(f fVar, ClientAuthentication clientAuthentication, Map map, h hVar, b bVar) {
        wm.d.f(fVar, "service cannot be null");
        wm.d.f(clientAuthentication, "client authentication cannot be null");
        wm.d.f(map, "additional params cannot be null");
        wm.d.f(hVar, "clock cannot be null");
        wm.d.f(bVar, "action cannot be null");
        if (!j(hVar)) {
            bVar.a(f(), h(), null);
            return;
        }
        if (this.f47398a == null) {
            bVar.a(null, null, AuthorizationException.m(AuthorizationException.a.f47324h, new IllegalStateException("No refresh token available and token have expired")));
            return;
        }
        wm.d.f(this.f47405h, "pending actions sync object cannot be null");
        synchronized (this.f47405h) {
            try {
                List list = this.f47406i;
                if (list != null) {
                    list.add(bVar);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                this.f47406i = arrayList;
                arrayList.add(bVar);
                fVar.f(e(map), clientAuthentication, new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(e eVar, AuthorizationException authorizationException) {
        wm.d.a((authorizationException != null) ^ (eVar != null), "exactly one of authResponse or authException should be non-null");
        if (authorizationException != null) {
            if (authorizationException.f47312a == 1) {
                this.f47404g = authorizationException;
                return;
            }
            return;
        }
        this.f47401d = eVar;
        this.f47400c = null;
        this.f47402e = null;
        this.f47398a = null;
        this.f47404g = null;
        String str = eVar.f47448h;
        if (str == null) {
            str = eVar.f47441a.f47417h;
        }
        this.f47399b = str;
    }

    public void s(n nVar, AuthorizationException authorizationException) {
        wm.d.a((authorizationException != null) ^ (nVar != null), "exactly one of tokenResponse or authException should be non-null");
        AuthorizationException authorizationException2 = this.f47404g;
        if (authorizationException2 != null) {
            zm.a.g("AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first", authorizationException2);
            this.f47404g = null;
        }
        if (authorizationException != null) {
            if (authorizationException.f47312a == 2) {
                this.f47404g = authorizationException;
                return;
            }
            return;
        }
        this.f47402e = nVar;
        String str = nVar.f47531g;
        if (str != null) {
            this.f47399b = str;
        }
        String str2 = nVar.f47530f;
        if (str2 != null) {
            this.f47398a = str2;
        }
    }

    public c(e eVar, AuthorizationException authorizationException) {
        wm.d.a((authorizationException != null) ^ (eVar != null), "exactly one of authResponse or authError should be non-null");
        this.f47406i = null;
        r(eVar, authorizationException);
    }
}
