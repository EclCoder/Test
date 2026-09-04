package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.e1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONObject f16094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f16095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HttpURLConnection f16097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FacebookException f16099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f16100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f16101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f16086o = new c(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f16087p = new d(200, 299);
    public static final Parcelable.Creator<x> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.h(parcel, "parcel");
            return new x(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i10) {
            return new x[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            String strOptString;
            int iOptInt;
            String str;
            boolean zOptBoolean;
            String strOptString2;
            String strOptString3;
            String str2 = TtmlNode.TAG_BODY;
            kotlin.jvm.internal.s.h(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i10 = singleResult.getInt("code");
                    Object objP = e1.P(singleResult, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
                    if (objP == null || !(objP instanceof JSONObject)) {
                        str2 = TtmlNode.TAG_BODY;
                    } else {
                        boolean z10 = true;
                        int iOptInt2 = -1;
                        if (((JSONObject) objP).has("error")) {
                            JSONObject jSONObject = (JSONObject) e1.P((JSONObject) objP, "error", null);
                            String strOptString4 = jSONObject != null ? jSONObject.optString("type", null) : null;
                            strOptString = jSONObject != null ? jSONObject.optString(PglCryptUtils.KEY_MESSAGE, null) : null;
                            int iOptInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            strOptString3 = jSONObject != null ? jSONObject.optString("error_user_msg", null) : null;
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                            str = strOptString4;
                            strOptString2 = jSONObject != null ? jSONObject.optString("error_user_title", null) : null;
                            zOptBoolean = jSONObject != null ? jSONObject.optBoolean("is_transient", false) : false;
                        } else if (((JSONObject) objP).has("error_code") || ((JSONObject) objP).has("error_msg") || ((JSONObject) objP).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objP).optString("error_reason", null);
                            strOptString = ((JSONObject) objP).optString("error_msg", null);
                            iOptInt2 = ((JSONObject) objP).optInt("error_code", -1);
                            iOptInt = ((JSONObject) objP).optInt("error_subcode", -1);
                            str = strOptString5;
                            zOptBoolean = false;
                            strOptString2 = null;
                            strOptString3 = null;
                        } else {
                            z10 = false;
                            zOptBoolean = false;
                            iOptInt = -1;
                            str = null;
                            strOptString2 = null;
                            strOptString = null;
                            strOptString3 = null;
                        }
                        if (z10) {
                            return new x(i10, iOptInt2, iOptInt, str, strOptString, strOptString2, strOptString3, (JSONObject) objP, singleResult, obj, httpURLConnection, null, zOptBoolean, null);
                        }
                    }
                    if (!c().a(i10)) {
                        return new x(i10, -1, -1, null, null, null, null, singleResult.has(str2) ? (JSONObject) e1.P(singleResult, str2, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final synchronized com.facebook.internal.o b() {
            com.facebook.internal.w wVarF = com.facebook.internal.a0.f(h0.n());
            if (wVarF == null) {
                return com.facebook.internal.o.f15331g.b();
            }
            return wVarF.h();
        }

        public final d c() {
            return x.f16087p;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16107b;

        public d(int i10, int i11) {
            this.f16106a = i10;
            this.f16107b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f16107b && this.f16106a <= i10;
        }
    }

    public /* synthetic */ x(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z10);
    }

    public final int b() {
        return this.f16089b;
    }

    public final String c() {
        String str = this.f16098k;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f16099l;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f16091d;
    }

    public final FacebookException f() {
        return this.f16099l;
    }

    public final int g() {
        return this.f16088a;
    }

    public final int i() {
        return this.f16090c;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f16088a + ", errorCode: " + this.f16089b + ", subErrorCode: " + this.f16090c + ", errorType: " + this.f16091d + ", errorMessage: " + c() + "}";
        kotlin.jvm.internal.s.g(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.s.h(out, "out");
        out.writeInt(this.f16088a);
        out.writeInt(this.f16089b);
        out.writeInt(this.f16090c);
        out.writeString(this.f16091d);
        out.writeString(c());
        out.writeString(this.f16092e);
        out.writeString(this.f16093f);
    }

    public /* synthetic */ x(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public x(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10) {
        a aVarC;
        this.f16088a = i10;
        this.f16089b = i11;
        this.f16090c = i12;
        this.f16091d = str;
        this.f16092e = str3;
        this.f16093f = str4;
        this.f16094g = jSONObject;
        this.f16095h = jSONObject2;
        this.f16096i = obj;
        this.f16097j = httpURLConnection;
        this.f16098k = str2;
        if (facebookException != null) {
            this.f16099l = facebookException;
            aVarC = a.OTHER;
        } else {
            this.f16099l = new FacebookServiceException(this, c());
            aVarC = f16086o.b().c(i11, i12, z10);
        }
        this.f16100m = aVarC;
        this.f16101n = f16086o.b().d(aVarC);
    }

    public x(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public x(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public x(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
