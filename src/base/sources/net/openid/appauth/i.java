package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Long f47474g = 1000L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Long f47475h = 600L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f47479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f47480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47481f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public i(String str, String str2, List list, Long l10, Long l11, String str3) {
        this.f47476a = str;
        this.f47477b = str2;
        this.f47478c = list;
        this.f47479d = l10;
        this.f47480e = l11;
        this.f47481f = str3;
    }

    public static i a(String str) throws JSONException, a {
        List listE;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length <= 1) {
            throw new a("ID token must have both header and claims section");
        }
        b(strArrSplit[0]);
        JSONObject jSONObjectB = b(strArrSplit[1]);
        String strC = j.c(jSONObjectB, "iss");
        String strC2 = j.c(jSONObjectB, "sub");
        try {
            listE = j.e(jSONObjectB, "aud");
        } catch (JSONException unused) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(j.c(jSONObjectB, "aud"));
            listE = arrayList;
        }
        return new i(strC, strC2, listE, Long.valueOf(jSONObjectB.getLong("exp")), Long.valueOf(jSONObjectB.getLong("iat")), j.d(jSONObjectB, "nonce"));
    }

    public static JSONObject b(String str) {
        return new JSONObject(new String(Base64.decode(str, 8)));
    }

    void c(m mVar, h hVar) throws AuthorizationException {
        AuthorizationServiceDiscovery authorizationServiceDiscovery = mVar.f47504a.f47473d;
        if (authorizationServiceDiscovery != null) {
            if (!this.f47476a.equals(authorizationServiceDiscovery.d())) {
                throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Issuer mismatch"));
            }
            Uri uri = Uri.parse(this.f47476a);
            if (!uri.getScheme().equals("https")) {
                throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Issuer must be an https URL"));
            }
            if (TextUtils.isEmpty(uri.getHost())) {
                throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Issuer host can not be empty"));
            }
            if (uri.getFragment() != null || uri.getQueryParameterNames().size() > 0) {
                throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Issuer URL should not containt query parameters or fragment components"));
            }
        }
        if (!this.f47478c.contains(mVar.f47506c)) {
            throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Audience mismatch"));
        }
        long jA = hVar.a() / f47474g.longValue();
        if (jA > this.f47479d.longValue()) {
            throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("ID Token expired"));
        }
        if (Math.abs(jA - this.f47480e.longValue()) > f47475h.longValue()) {
            throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Issued at time is more than 10 minutes before or after the current time"));
        }
        if ("authorization_code".equals(mVar.f47507d)) {
            if (!TextUtils.equals(this.f47481f, mVar.f47505b)) {
                throw AuthorizationException.m(AuthorizationException.b.f47337j, new a("Nonce mismatch"));
            }
        }
    }
}
