package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.f1;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15981d = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public q(String encodedHeaderString) throws JSONException {
        kotlin.jvm.internal.s.h(encodedHeaderString, "encodedHeaderString");
        if (!b(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header");
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.s.g(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, bm.d.f9079b));
        String string = jSONObject.getString("alg");
        kotlin.jvm.internal.s.g(string, "jsonObj.getString(\"alg\")");
        this.f15982a = string;
        String string2 = jSONObject.getString(ClientData.KEY_TYPE);
        kotlin.jvm.internal.s.g(string2, "jsonObj.getString(\"typ\")");
        this.f15983b = string2;
        String string3 = jSONObject.getString("kid");
        kotlin.jvm.internal.s.g(string3, "jsonObj.getString(\"kid\")");
        this.f15984c = string3;
    }

    private final boolean b(String str) {
        f1.j(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        kotlin.jvm.internal.s.g(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, bm.d.f9079b));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.s.g(alg, "alg");
            boolean z10 = alg.length() > 0 && kotlin.jvm.internal.s.c(alg, "RS256");
            String strOptString = jSONObject.optString("kid");
            kotlin.jvm.internal.s.g(strOptString, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString(ClientData.KEY_TYPE);
            kotlin.jvm.internal.s.g(strOptString2, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (strOptString2.length() > 0);
        } catch (JSONException unused) {
        }
    }

    public final String a() {
        return this.f15984c;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f15982a);
        jSONObject.put(ClientData.KEY_TYPE, this.f15983b);
        jSONObject.put("kid", this.f15984c);
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.s.c(this.f15982a, qVar.f15982a) && kotlin.jvm.internal.s.c(this.f15983b, qVar.f15983b) && kotlin.jvm.internal.s.c(this.f15984c, qVar.f15984c);
    }

    public int hashCode() {
        return ((((527 + this.f15982a.hashCode()) * 31) + this.f15983b.hashCode()) * 31) + this.f15984c.hashCode();
    }

    public String toString() {
        String string = c().toString();
        kotlin.jvm.internal.s.g(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeString(this.f15982a);
        dest.writeString(this.f15983b);
        dest.writeString(this.f15984c);
    }

    public q(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        this.f15982a = f1.n(parcel.readString(), "alg");
        this.f15983b = f1.n(parcel.readString(), ClientData.KEY_TYPE);
        this.f15984c = f1.n(parcel.readString(), "kid");
    }
}
