package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.facebook.internal.e1;
import com.mbridge.msdk.MBridgeConstans;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15612c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f15613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f15614b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.facebook.a a(Bundle bundle, com.facebook.l lVar, String applicationId) {
            String string;
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            Date dateY = e1.y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateY2 = e1.y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new com.facebook.a(string2, applicationId, string, stringArrayList, null, null, lVar, dateY, new Date(), dateY2, bundle.getString("graph_domain"));
        }

        public final com.facebook.n c(Bundle bundle, String str) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new com.facebook.n(string, str);
            } catch (Exception e10) {
                throw new FacebookException(e10.getMessage());
            }
        }

        public final com.facebook.n d(Bundle bundle, String str) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new com.facebook.n(string, str);
            } catch (Exception e10) {
                throw new FacebookException(e10.getMessage(), e10);
            }
        }

        public final String e(String str) {
            if (str == null || str.length() == 0) {
                throw new FacebookException("Authorization response does not contain the signed_request");
            }
            try {
                String[] strArr = (String[]) bm.r.F0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                if (strArr.length == 2) {
                    byte[] data = Base64.decode(strArr[1], 0);
                    kotlin.jvm.internal.s.g(data, "data");
                    String string = new JSONObject(new String(data, bm.d.f9079b)).getString("user_id");
                    kotlin.jvm.internal.s.g(string, "jsonObject.getString(\"user_id\")");
                    return string;
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            throw new FacebookException("Failed to retrieve user_id from signed_request");
        }

        private a() {
        }

        public final com.facebook.a b(Collection collection, Bundle bundle, com.facebook.l lVar, String applicationId) {
            Collection collectionG;
            ArrayList arrayListG;
            ArrayList arrayListG2;
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            Date dateY = e1.y(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateY2 = e1.y(bundle, giNWGaNAgVQoO.xkiMJChhiX, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collectionG = collection;
            } else {
                String[] strArr = (String[]) bm.r.F0(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                collectionG = gl.r.g(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListG = null;
            } else {
                String[] strArr2 = (String[]) bm.r.F0(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                arrayListG = gl.r.g(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListG2 = null;
            } else {
                String[] strArr3 = (String[]) bm.r.F0(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                arrayListG2 = gl.r.g(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (e1.e0(string)) {
                return null;
            }
            return new com.facebook.a(string, applicationId, e(bundle.getString("signed_request")), collectionG, arrayListG, arrayListG2, lVar, dateY, new Date(), dateY2, bundle.getString("graph_domain"));
        }
    }

    public g0(w loginClient) {
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        q(loginClient);
    }

    protected void a(String str, Object obj) {
        if (this.f15613a == null) {
            this.f15613a = new HashMap();
        }
        Map map = this.f15613a;
        if (map != null) {
        }
    }

    protected String c(String authId) {
        kotlin.jvm.internal.s.h(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", g());
            p(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "param.toString()");
        return string;
    }

    public final w e() {
        w wVar = this.f15614b;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.s.w("loginClient");
        return null;
    }

    public final Map f() {
        return this.f15613a;
    }

    public abstract String g();

    protected String i() {
        return "fb" + com.facebook.h0.n() + "://authorize/";
    }

    protected void j(String str) {
        String strN;
        w.e eVarU = e().u();
        if (eVarU == null || (strN = eVarU.b()) == null) {
            strN = com.facebook.h0.n();
        }
        com.facebook.appevents.o0 o0Var = new com.facebook.appevents.o0(e().n(), strN);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(MBridgeConstans.APP_ID, strN);
        o0Var.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean l() {
        return false;
    }

    public boolean n(int i10, int i11, Intent intent) {
        return false;
    }

    protected Bundle o(w.e request, Bundle values) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(values, "values");
        String string = values.getString("code");
        if (e1.e0(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string != null) {
            String strI = i();
            String strI2 = request.i();
            if (strI2 == null) {
                strI2 = "";
            }
            com.facebook.j0 j0VarA = m0.a(string, strI, strI2);
            if (j0VarA != null) {
                com.facebook.o0 o0VarK = j0VarA.k();
                com.facebook.x xVarB = o0VarK.b();
                if (xVarB != null) {
                    throw new FacebookServiceException(xVarB, xVarB.c());
                }
                try {
                    JSONObject jSONObjectC = o0VarK.c();
                    String string2 = jSONObjectC != null ? jSONObjectC.getString("access_token") : null;
                    if (jSONObjectC == null || e1.e0(string2)) {
                        throw new FacebookException("No access token found from result");
                    }
                    values.putString("access_token", string2);
                    if (jSONObjectC.has("id_token")) {
                        values.putString("id_token", jSONObjectC.getString("id_token"));
                    }
                    return values;
                } catch (JSONException e10) {
                    throw new FacebookException("Fail to process code exchange response: " + e10.getMessage());
                }
            }
        }
        throw new FacebookException("Failed to create code exchange request");
    }

    public void p(JSONObject param) {
        kotlin.jvm.internal.s.h(param, "param");
    }

    public final void q(w wVar) {
        kotlin.jvm.internal.s.h(wVar, "<set-?>");
        this.f15614b = wVar;
    }

    public boolean s() {
        return false;
    }

    public abstract int t(w.e eVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        e1.K0(dest, this.f15613a);
    }

    protected g0(Parcel source) {
        kotlin.jvm.internal.s.h(source, "source");
        Map mapW0 = e1.w0(source);
        this.f15613a = mapW0 != null ? gl.l0.v(mapW0) : null;
    }

    public void b() {
    }
}
