package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f14853l = new c(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Date f14854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Date f14855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Date f14856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f14857p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f14858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f14859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f14860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f14861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f14863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f14864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f14867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14868k;

    /* JADX INFO: renamed from: com.facebook.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0259a {
        void a(FacebookException facebookException);

        void b(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new a(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(a current) {
            kotlin.jvm.internal.s.h(current, "current");
            return new a(current.p(), current.c(), current.q(), current.n(), current.f(), current.g(), current.o(), new Date(), new Date(), current.e(), null, UserVerificationMethods.USER_VERIFY_ALL, null);
        }

        public final a b(JSONObject jsonObject) throws JSONException {
            kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString(BidResponsed.KEY_TOKEN);
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            kotlin.jvm.internal.s.g(string, "jsonObject.getString(SOURCE_KEY)");
            l lVarValueOf = l.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jsonObject.optString("graph_domain", null);
            kotlin.jvm.internal.s.g(token, "token");
            kotlin.jvm.internal.s.g(applicationId, "applicationId");
            kotlin.jvm.internal.s.g(userId, "userId");
            kotlin.jvm.internal.s.g(permissionsArray, "permissionsArray");
            List listI0 = e1.i0(permissionsArray);
            kotlin.jvm.internal.s.g(declinedPermissionsArray, "declinedPermissionsArray");
            return new a(token, applicationId, userId, listI0, e1.i0(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : e1.i0(jSONArrayOptJSONArray), lVarValueOf, date, date2, date3, strOptString);
        }

        public final a c(Bundle bundle) throws JSONException {
            String string;
            kotlin.jvm.internal.s.h(bundle, "bundle");
            List listF = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List listF2 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List listF3 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            q0.a aVar = q0.f15985c;
            String strA = aVar.a(bundle);
            if (e1.e0(strA)) {
                strA = h0.n();
            }
            String str = strA;
            String strF = aVar.f(bundle);
            if (strF == null) {
                return null;
            }
            JSONObject jSONObjectF = e1.f(strF);
            if (jSONObjectF != null) {
                try {
                    string = jSONObjectF.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
            }
            if (str == null || string == null) {
                return null;
            }
            return new a(strF, str, string, listF, listF2, listF3, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, UserVerificationMethods.USER_VERIFY_ALL, null);
        }

        public final void d() {
            a aVarM = k.f15515f.e().m();
            if (aVarM != null) {
                i(a(aVarM));
            }
        }

        public final a e() {
            return k.f15515f.e().m();
        }

        public final List f(Bundle bundle, String str) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return gl.r.l();
            }
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            kotlin.jvm.internal.s.g(listUnmodifiableList, "{\n            Collection…Permissions))\n          }");
            return listUnmodifiableList;
        }

        public final boolean g() {
            a aVarM = k.f15515f.e().m();
            return (aVarM == null || aVarM.s()) ? false : true;
        }

        public final boolean h() {
            a aVarM = k.f15515f.e().m();
            return (aVarM == null || aVarM.s() || !aVarM.t()) ? false : true;
        }

        public final void i(a aVar) {
            k.f15515f.e().y(aVar);
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14869a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f15538g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14869a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f14854m = date;
        f14855n = date;
        f14856o = new Date();
        f14857p = l.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, l lVar, Date date, Date date2, Date date3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, lVar, date, date2, date3, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "facebook" : str4);
    }

    private final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f14859b));
        sb2.append("]");
    }

    private final l b(l lVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return lVar;
        }
        int i10 = d.f14869a[lVar.ordinal()];
        if (i10 == 1) {
            return l.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 != 2) {
            return i10 != 3 ? lVar : l.INSTAGRAM_WEB_VIEW;
        }
        return l.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    private final String v() {
        return h0.M(r0.f15994b) ? this.f14862e : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f14865h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Date e() {
        return this.f14867j;
    }

    public boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.s.c(this.f14858a, aVar.f14858a) && kotlin.jvm.internal.s.c(this.f14859b, aVar.f14859b) && kotlin.jvm.internal.s.c(this.f14860c, aVar.f14860c) && kotlin.jvm.internal.s.c(this.f14861d, aVar.f14861d) && kotlin.jvm.internal.s.c(this.f14862e, aVar.f14862e) && this.f14863f == aVar.f14863f && kotlin.jvm.internal.s.c(this.f14864g, aVar.f14864g) && kotlin.jvm.internal.s.c(this.f14865h, aVar.f14865h) && kotlin.jvm.internal.s.c(this.f14866i, aVar.f14866i) && kotlin.jvm.internal.s.c(this.f14867j, aVar.f14867j)) {
            String str = this.f14868k;
            String str2 = aVar.f14868k;
            if (str == null) {
                zC = str2 == null;
            } else {
                zC = kotlin.jvm.internal.s.c(str, str2);
            }
            if (zC) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.f14860c;
    }

    public final Set g() {
        return this.f14861d;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.f14858a.hashCode()) * 31) + this.f14859b.hashCode()) * 31) + this.f14860c.hashCode()) * 31) + this.f14861d.hashCode()) * 31) + this.f14862e.hashCode()) * 31) + this.f14863f.hashCode()) * 31) + this.f14864g.hashCode()) * 31) + this.f14865h.hashCode()) * 31) + this.f14866i.hashCode()) * 31) + this.f14867j.hashCode()) * 31;
        String str = this.f14868k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final Date i() {
        return this.f14858a;
    }

    public final String j() {
        return this.f14868k;
    }

    public final Date l() {
        return this.f14864g;
    }

    public final Set n() {
        return this.f14859b;
    }

    public final l o() {
        return this.f14863f;
    }

    public final String p() {
        return this.f14862e;
    }

    public final String q() {
        return this.f14866i;
    }

    public final boolean s() {
        return new Date().after(this.f14858a);
    }

    public final boolean t() {
        String str = this.f14868k;
        return str != null && str.equals("instagram");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(v());
        a(sb2);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "builder.toString()");
        return string;
    }

    public final JSONObject u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(BidResponsed.KEY_TOKEN, this.f14862e);
        jSONObject.put("expires_at", this.f14858a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f14859b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f14860c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f14861d));
        jSONObject.put("last_refresh", this.f14864g.getTime());
        jSONObject.put("source", this.f14863f.name());
        jSONObject.put("application_id", this.f14865h);
        jSONObject.put("user_id", this.f14866i);
        jSONObject.put("data_access_expiration_time", this.f14867j.getTime());
        String str = this.f14868k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeLong(this.f14858a.getTime());
        dest.writeStringList(new ArrayList(this.f14859b));
        dest.writeStringList(new ArrayList(this.f14860c));
        dest.writeStringList(new ArrayList(this.f14861d));
        dest.writeString(this.f14862e);
        dest.writeString(this.f14863f.name());
        dest.writeLong(this.f14864g.getTime());
        dest.writeString(this.f14865h);
        dest.writeString(this.f14866i);
        dest.writeLong(this.f14867j.getTime());
        dest.writeString(this.f14868k);
    }

    public a(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, l lVar, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        kotlin.jvm.internal.s.h(userId, "userId");
        f1.j(accessToken, "accessToken");
        f1.j(applicationId, "applicationId");
        f1.j(userId, "userId");
        this.f14858a = date == null ? f14855n : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.s.g(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f14859b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.s.g(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f14860c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.s.g(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f14861d = setUnmodifiableSet3;
        this.f14862e = accessToken;
        this.f14863f = b(lVar == null ? f14857p : lVar, str);
        this.f14864g = date2 == null ? f14856o : date2;
        this.f14865h = applicationId;
        this.f14866i = userId;
        this.f14867j = (date3 == null || date3.getTime() == 0) ? f14855n : date3;
        this.f14868k = str == null ? "facebook" : str;
    }

    public a(Parcel parcel) {
        l lVarValueOf;
        kotlin.jvm.internal.s.h(parcel, "parcel");
        this.f14858a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.s.g(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f14859b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.s.g(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f14860c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.s.g(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f14861d = setUnmodifiableSet3;
        this.f14862e = f1.n(parcel.readString(), BidResponsed.KEY_TOKEN);
        String string = parcel.readString();
        if (string != null) {
            lVarValueOf = l.valueOf(string);
        } else {
            lVarValueOf = f14857p;
        }
        this.f14863f = lVarValueOf;
        this.f14864g = new Date(parcel.readLong());
        this.f14865h = f1.n(parcel.readString(), "applicationId");
        this.f14866i = f1.n(parcel.readString(), "userId");
        this.f14867j = new Date(parcel.readLong());
        this.f14868k = parcel.readString();
    }
}
