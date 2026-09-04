package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.f1;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f15933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f15934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f15930f = new b(null);
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(n nVar) {
            AuthenticationTokenManager.f14817d.a().e(nVar);
        }

        public b() {
        }
    }

    public n(String token, String expectedNonce) {
        kotlin.jvm.internal.s.h(token, "token");
        kotlin.jvm.internal.s.h(expectedNonce, "expectedNonce");
        f1.j(token, BidResponsed.KEY_TOKEN);
        f1.j(expectedNonce, "expectedNonce");
        List listF0 = bm.r.F0(token, new String[]{"."}, false, 0, 6, null);
        if (listF0.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str = (String) listF0.get(0);
        String str2 = (String) listF0.get(1);
        String str3 = (String) listF0.get(2);
        this.f15931a = token;
        this.f15932b = expectedNonce;
        q qVar = new q(str);
        this.f15933c = qVar;
        this.f15934d = new p(str2, expectedNonce);
        if (!a(str, str2, str3, qVar.a())) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f15935e = str3;
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String strC = b8.b.c(str4);
            if (strC == null) {
                return false;
            }
            return b8.b.e(b8.b.b(strC), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f15931a);
        jSONObject.put("expected_nonce", this.f15932b);
        jSONObject.put("header", this.f15933c.c());
        jSONObject.put("claims", this.f15934d.b());
        jSONObject.put("signature", this.f15935e);
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.s.c(this.f15931a, nVar.f15931a) && kotlin.jvm.internal.s.c(this.f15932b, nVar.f15932b) && kotlin.jvm.internal.s.c(this.f15933c, nVar.f15933c) && kotlin.jvm.internal.s.c(this.f15934d, nVar.f15934d) && kotlin.jvm.internal.s.c(this.f15935e, nVar.f15935e);
    }

    public int hashCode() {
        return ((((((((527 + this.f15931a.hashCode()) * 31) + this.f15932b.hashCode()) * 31) + this.f15933c.hashCode()) * 31) + this.f15934d.hashCode()) * 31) + this.f15935e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeString(this.f15931a);
        dest.writeString(this.f15932b);
        dest.writeParcelable(this.f15933c, i10);
        dest.writeParcelable(this.f15934d, i10);
        dest.writeString(this.f15935e);
    }

    public n(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        this.f15931a = f1.n(parcel.readString(), BidResponsed.KEY_TOKEN);
        this.f15932b = f1.n(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(q.class.getClassLoader());
        if (parcelable != null) {
            this.f15933c = (q) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(p.class.getClassLoader());
            if (parcelable2 != null) {
                this.f15934d = (p) parcelable2;
                this.f15935e = f1.n(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
