package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f16010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f16011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f16003h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16004i = s0.class.getSimpleName();
    public static final Parcelable.Creator<s0> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new s0(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0[] newArray(int i10) {
            return new s0[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements e1.a {
            @Override // com.facebook.internal.e1.a
            public void a(JSONObject jSONObject) {
                String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
                if (strOptString == null) {
                    Log.w(s0.f16004i, "No user ID returned on Me request");
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                String strOptString3 = jSONObject.optString("profile_picture", null);
                s0.f16003h.c(new s0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.e1.a
            public void b(FacebookException facebookException) {
                Log.e(s0.f16004i, "Got unexpected exception: " + facebookException);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            com.facebook.a.c cVar = com.facebook.a.f14853l;
            com.facebook.a aVarE = cVar.e();
            if (aVarE == null) {
                return;
            }
            if (cVar.g()) {
                e1.H(aVarE.p(), new a());
            } else {
                c(null);
            }
        }

        public final s0 b() {
            return u0.f16069d.a().c();
        }

        public final void c(s0 s0Var) {
            u0.f16069d.a().f(s0Var);
        }

        public b() {
        }
    }

    public /* synthetic */ s0(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public final String b() {
        return this.f16005a;
    }

    public final String c() {
        return this.f16009e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Uri e(int i10, int i11) {
        String strP;
        Uri uri = this.f16011g;
        if (uri != null) {
            return uri;
        }
        com.facebook.a.c cVar = com.facebook.a.f14853l;
        if (cVar.g()) {
            com.facebook.a aVarE = cVar.e();
            strP = aVarE != null ? aVarE.p() : null;
        } else {
            strP = "";
        }
        return com.facebook.internal.j0.f15248f.a(this.f16005a, i10, i11, strP);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        String str5 = this.f16005a;
        return ((str5 == null && ((s0) obj).f16005a == null) || kotlin.jvm.internal.s.c(str5, ((s0) obj).f16005a)) && (((str = this.f16006b) == null && ((s0) obj).f16006b == null) || kotlin.jvm.internal.s.c(str, ((s0) obj).f16006b)) && ((((str2 = this.f16007c) == null && ((s0) obj).f16007c == null) || kotlin.jvm.internal.s.c(str2, ((s0) obj).f16007c)) && ((((str3 = this.f16008d) == null && ((s0) obj).f16008d == null) || kotlin.jvm.internal.s.c(str3, ((s0) obj).f16008d)) && ((((str4 = this.f16009e) == null && ((s0) obj).f16009e == null) || kotlin.jvm.internal.s.c(str4, ((s0) obj).f16009e)) && ((((uri = this.f16010f) == null && ((s0) obj).f16010f == null) || kotlin.jvm.internal.s.c(uri, ((s0) obj).f16010f)) && (((uri2 = this.f16011g) == null && ((s0) obj).f16011g == null) || kotlin.jvm.internal.s.c(uri2, ((s0) obj).f16011g))))));
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f16005a);
            jSONObject.put("first_name", this.f16006b);
            jSONObject.put("middle_name", this.f16007c);
            jSONObject.put("last_name", this.f16008d);
            jSONObject.put("name", this.f16009e);
            Uri uri = this.f16010f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f16011g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        String str = this.f16005a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f16006b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f16007c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f16008d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f16009e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f16010f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f16011g;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeString(this.f16005a);
        dest.writeString(this.f16006b);
        dest.writeString(this.f16007c);
        dest.writeString(this.f16008d);
        dest.writeString(this.f16009e);
        Uri uri = this.f16010f;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f16011g;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public s0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        f1.n(str, "id");
        this.f16005a = str;
        this.f16006b = str2;
        this.f16007c = str3;
        this.f16008d = str4;
        this.f16009e = str5;
        this.f16010f = uri;
        this.f16011g = uri2;
    }

    public s0(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        this.f16005a = jsonObject.optString("id", null);
        this.f16006b = jsonObject.optString("first_name", null);
        this.f16007c = jsonObject.optString("middle_name", null);
        this.f16008d = jsonObject.optString("last_name", null);
        this.f16009e = jsonObject.optString("name", null);
        String strOptString = jsonObject.optString("link_uri", null);
        this.f16010f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jsonObject.optString(qnwOeeQSSWa.JcMHEmoohbRy, null);
        this.f16011g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public s0(Parcel parcel) {
        this.f16005a = parcel.readString();
        this.f16006b = parcel.readString();
        this.f16007c = parcel.readString();
        this.f16008d = parcel.readString();
        this.f16009e = parcel.readString();
        String string = parcel.readString();
        this.f16010f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f16011g = string2 != null ? Uri.parse(string2) : null;
    }
}
