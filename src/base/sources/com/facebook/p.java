package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f15970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f15972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f15973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f15974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f15976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f15956u = new b(null);
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new p(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(JSONObject jSONObject, String name) {
            kotlin.jvm.internal.s.h(jSONObject, "<this>");
            kotlin.jvm.internal.s.h(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }

        public b() {
        }
    }

    public p(String encodedClaims, String expectedNonce) throws JSONException {
        kotlin.jvm.internal.s.h(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.s.h(expectedNonce, "expectedNonce");
        f1.j(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.s.g(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, bm.d.f9079b));
        if (!a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims");
        }
        String string = jSONObject.getString("jti");
        kotlin.jvm.internal.s.g(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f15957a = string;
        String string2 = jSONObject.getString("iss");
        kotlin.jvm.internal.s.g(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f15958b = string2;
        String string3 = jSONObject.getString("aud");
        kotlin.jvm.internal.s.g(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f15959c = string3;
        String string4 = jSONObject.getString("nonce");
        kotlin.jvm.internal.s.g(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f15960d = string4;
        this.f15961e = jSONObject.getLong("exp");
        this.f15962f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        kotlin.jvm.internal.s.g(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f15963g = string5;
        b bVar = f15956u;
        this.f15964h = bVar.a(jSONObject, "name");
        this.f15965i = bVar.a(jSONObject, "given_name");
        this.f15966j = bVar.a(jSONObject, "middle_name");
        this.f15967k = bVar.a(jSONObject, "family_name");
        this.f15968l = bVar.a(jSONObject, "email");
        this.f15969m = bVar.a(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        this.f15970n = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(e1.h0(jSONArrayOptJSONArray));
        this.f15971o = bVar.a(jSONObject, "user_birthday");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.f15972p = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(e1.o(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.f15973q = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(e1.p(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.f15974r = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(e1.p(jSONObjectOptJSONObject3)) : null;
        this.f15975s = bVar.a(jSONObject, "user_gender");
        this.f15976t = bVar.a(jSONObject, "user_link");
    }

    private final boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String jti = jSONObject.optString("jti");
        kotlin.jvm.internal.s.g(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = jSONObject.optString("iss");
            kotlin.jvm.internal.s.g(iss, "iss");
            if (iss.length() != 0 && (kotlin.jvm.internal.s.c(new URL(iss).getHost(), "facebook.com") || kotlin.jvm.internal.s.c(new URL(iss).getHost(), "www.facebook.com"))) {
                String aud = jSONObject.optString("aud");
                kotlin.jvm.internal.s.g(aud, "aud");
                if (aud.length() == 0 || !kotlin.jvm.internal.s.c(aud, h0.n())) {
                    return false;
                }
                long j10 = 1000;
                if (new Date().after(new Date(jSONObject.optLong("exp") * j10))) {
                    return false;
                }
                if (new Date().after(new Date((jSONObject.optLong("iat") * j10) + TTAdConstant.AD_MAX_EVENT_TIME))) {
                    return false;
                }
                String sub = jSONObject.optString("sub");
                kotlin.jvm.internal.s.g(sub, "sub");
                if (sub.length() == 0) {
                    return false;
                }
                String nonce = jSONObject.optString("nonce");
                kotlin.jvm.internal.s.g(nonce, "nonce");
                return nonce.length() != 0 && kotlin.jvm.internal.s.c(nonce, str);
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f15957a);
        jSONObject.put("iss", this.f15958b);
        jSONObject.put("aud", this.f15959c);
        jSONObject.put("nonce", this.f15960d);
        jSONObject.put("exp", this.f15961e);
        jSONObject.put("iat", this.f15962f);
        String str = this.f15963g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f15964h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f15965i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f15966j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f15967k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f15968l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f15969m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f15970n != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f15970n));
        }
        String str8 = this.f15971o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f15972p != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f15972p));
        }
        if (this.f15973q != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f15973q));
        }
        if (this.f15974r != null) {
            jSONObject.put("user_location", new JSONObject(this.f15974r));
        }
        String str9 = this.f15975s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f15976t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.s.c(this.f15957a, pVar.f15957a) && kotlin.jvm.internal.s.c(this.f15958b, pVar.f15958b) && kotlin.jvm.internal.s.c(this.f15959c, pVar.f15959c) && kotlin.jvm.internal.s.c(this.f15960d, pVar.f15960d) && this.f15961e == pVar.f15961e && this.f15962f == pVar.f15962f && kotlin.jvm.internal.s.c(this.f15963g, pVar.f15963g) && kotlin.jvm.internal.s.c(this.f15964h, pVar.f15964h) && kotlin.jvm.internal.s.c(this.f15965i, pVar.f15965i) && kotlin.jvm.internal.s.c(this.f15966j, pVar.f15966j) && kotlin.jvm.internal.s.c(this.f15967k, pVar.f15967k) && kotlin.jvm.internal.s.c(this.f15968l, pVar.f15968l) && kotlin.jvm.internal.s.c(this.f15969m, pVar.f15969m) && kotlin.jvm.internal.s.c(this.f15970n, pVar.f15970n) && kotlin.jvm.internal.s.c(this.f15971o, pVar.f15971o) && kotlin.jvm.internal.s.c(this.f15972p, pVar.f15972p) && kotlin.jvm.internal.s.c(this.f15973q, pVar.f15973q) && kotlin.jvm.internal.s.c(this.f15974r, pVar.f15974r) && kotlin.jvm.internal.s.c(this.f15975s, pVar.f15975s) && kotlin.jvm.internal.s.c(this.f15976t, pVar.f15976t);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.f15957a.hashCode()) * 31) + this.f15958b.hashCode()) * 31) + this.f15959c.hashCode()) * 31) + this.f15960d.hashCode()) * 31) + Long.hashCode(this.f15961e)) * 31) + Long.hashCode(this.f15962f)) * 31) + this.f15963g.hashCode()) * 31;
        String str = this.f15964h;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15965i;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15966j;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f15967k;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f15968l;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f15969m;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.f15970n;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f15971o;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.f15972p;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f15973q;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.f15974r;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.f15975s;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f15976t;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String string = b().toString();
        kotlin.jvm.internal.s.g(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeString(this.f15957a);
        dest.writeString(this.f15958b);
        dest.writeString(this.f15959c);
        dest.writeString(this.f15960d);
        dest.writeLong(this.f15961e);
        dest.writeLong(this.f15962f);
        dest.writeString(this.f15963g);
        dest.writeString(this.f15964h);
        dest.writeString(this.f15965i);
        dest.writeString(this.f15966j);
        dest.writeString(this.f15967k);
        dest.writeString(this.f15968l);
        dest.writeString(this.f15969m);
        if (this.f15970n == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.f15970n));
        }
        dest.writeString(this.f15971o);
        dest.writeMap(this.f15972p);
        dest.writeMap(this.f15973q);
        dest.writeMap(this.f15974r);
        dest.writeString(this.f15975s);
        dest.writeString(this.f15976t);
    }

    public p(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        this.f15957a = f1.n(parcel.readString(), "jti");
        this.f15958b = f1.n(parcel.readString(), "iss");
        this.f15959c = f1.n(parcel.readString(), "aud");
        this.f15960d = f1.n(parcel.readString(), "nonce");
        this.f15961e = parcel.readLong();
        this.f15962f = parcel.readLong();
        this.f15963g = f1.n(parcel.readString(), "sub");
        this.f15964h = parcel.readString();
        this.f15965i = parcel.readString();
        this.f15966j = parcel.readString();
        this.f15967k = parcel.readString();
        this.f15968l = parcel.readString();
        this.f15969m = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f15970n = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f15971o = parcel.readString();
        HashMap hashMap = parcel.readHashMap(kotlin.jvm.internal.r.f43604a.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f15972p = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        HashMap hashMap2 = parcel.readHashMap(o0Var.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f15973q = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(o0Var.getClass().getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f15974r = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f15975s = parcel.readString();
        this.f15976t = parcel.readString();
    }
}
