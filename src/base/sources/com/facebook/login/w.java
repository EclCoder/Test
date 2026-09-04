package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class w implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0[] f15768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Fragment f15770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f15771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f15772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f15774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f15775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f15776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c0 f15777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f15766m = new c(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f15767n = w.class.getSimpleName();
    public static final Parcelable.Creator<w> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new w(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w[] newArray(int i10) {
            return new w[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException e10) {
                e1.m0(w.f15767n, "Failed to create e2e JSON", e10);
            }
            String string = jSONObject.toString();
            kotlin.jvm.internal.s.g(string, "e2e.toString()");
            return string;
        }

        public final int b() {
            return com.facebook.internal.e.c.Login.g();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(f fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f15781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set f15782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.facebook.login.e f15783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f15785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f15786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f15787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f15788h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f15789i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f15790j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f15791k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f15792l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f15793m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final i0 f15794n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f15795o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f15796p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f15797q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f15798r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final String f15799s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f15800t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final String f15801u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final com.facebook.login.a f15802v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f15780w = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.h(source, "source");
                return new e(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ e(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final boolean A() {
            return this.f15794n == i0.INSTAGRAM;
        }

        public final boolean B() {
            return this.f15788h;
        }

        public final void C(String str) {
            this.f15798r = str;
        }

        public final void D(String str) {
            kotlin.jvm.internal.s.h(str, "<set-?>");
            this.f15787g = str;
        }

        public final void E(boolean z10) {
            this.f15795o = z10;
        }

        public final void F(String str) {
            this.f15792l = str;
        }

        public final void G(Set set) {
            kotlin.jvm.internal.s.h(set, "<set-?>");
            this.f15782b = set;
        }

        public final void H(boolean z10) {
            this.f15788h = z10;
        }

        public final void I(boolean z10) {
            this.f15793m = z10;
        }

        public final void J(boolean z10) {
            this.f15796p = z10;
        }

        public final boolean K() {
            return this.f15796p;
        }

        public final String a() {
            return this.f15798r;
        }

        public final String b() {
            return this.f15784d;
        }

        public final String c() {
            return this.f15787g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f15790j;
        }

        public final String f() {
            return this.f15801u;
        }

        public final com.facebook.login.a g() {
            return this.f15802v;
        }

        public final String i() {
            return this.f15800t;
        }

        public final com.facebook.login.e j() {
            return this.f15783c;
        }

        public final String l() {
            return this.f15791k;
        }

        public final String n() {
            return this.f15789i;
        }

        public final boolean o() {
            return this.f15797q;
        }

        public final String p() {
            return this.f15786f;
        }

        public final v q() {
            return this.f15781a;
        }

        public final i0 s() {
            return this.f15794n;
        }

        public final String t() {
            return this.f15792l;
        }

        public final String u() {
            return this.f15799s;
        }

        public final Set v() {
            return this.f15782b;
        }

        public final String w() {
            return this.f15785e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.s.h(dest, "dest");
            dest.writeString(this.f15781a.name());
            dest.writeStringList(new ArrayList(this.f15782b));
            dest.writeString(this.f15783c.name());
            dest.writeString(this.f15784d);
            dest.writeString(this.f15785e);
            dest.writeString(this.f15786f);
            dest.writeString(this.f15787g);
            dest.writeByte(this.f15788h ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15789i);
            dest.writeString(this.f15790j);
            dest.writeString(this.f15791k);
            dest.writeString(this.f15792l);
            dest.writeByte(this.f15793m ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15794n.name());
            dest.writeByte(this.f15795o ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f15796p ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f15797q ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15798r);
            dest.writeString(this.f15799s);
            dest.writeString(this.f15800t);
            dest.writeString(this.f15801u);
            com.facebook.login.a aVar = this.f15802v;
            dest.writeString(aVar != null ? aVar.name() : null);
        }

        public final boolean x() {
            return this.f15793m;
        }

        public final boolean y() {
            Iterator it = this.f15782b.iterator();
            while (it.hasNext()) {
                if (f0.f15590j.e((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean z() {
            return this.f15795o;
        }

        public e(v loginBehavior, Set set, com.facebook.login.e defaultAudience, String authType, String applicationId, String authId, i0 i0Var, String str, String str2, String str3, com.facebook.login.a aVar, String str4, String str5) {
            kotlin.jvm.internal.s.h(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.s.h(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.s.h(authType, "authType");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            kotlin.jvm.internal.s.h(authId, "authId");
            this.f15781a = loginBehavior;
            this.f15782b = set == null ? new HashSet() : set;
            this.f15783c = defaultAudience;
            this.f15790j = authType;
            this.f15784d = applicationId;
            this.f15785e = str4;
            this.f15786f = str5;
            this.f15787g = authId;
            this.f15794n = i0Var == null ? i0.FACEBOOK : i0Var;
            if (str == null || str.length() == 0) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.g(string, "randomUUID().toString()");
                this.f15799s = string;
            } else {
                this.f15799s = str;
            }
            this.f15800t = str2;
            this.f15801u = str3;
            this.f15802v = aVar;
        }

        private e(Parcel parcel) {
            com.facebook.login.e eVarValueOf;
            i0 i0VarValueOf;
            this.f15781a = v.valueOf(f1.n(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f15782b = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                eVarValueOf = com.facebook.login.e.valueOf(string);
            } else {
                eVarValueOf = com.facebook.login.e.NONE;
            }
            this.f15783c = eVarValueOf;
            this.f15784d = f1.n(parcel.readString(), "applicationId");
            this.f15785e = parcel.readString();
            this.f15786f = parcel.readString();
            this.f15787g = f1.n(parcel.readString(), "authId");
            this.f15788h = parcel.readByte() != 0;
            this.f15789i = parcel.readString();
            this.f15790j = f1.n(parcel.readString(), "authType");
            this.f15791k = parcel.readString();
            this.f15792l = parcel.readString();
            this.f15793m = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                i0VarValueOf = i0.valueOf(string2);
            } else {
                i0VarValueOf = i0.FACEBOOK;
            }
            this.f15794n = i0VarValueOf;
            this.f15795o = parcel.readByte() != 0;
            this.f15796p = parcel.readByte() != 0;
            this.f15797q = parcel.readByte() != 0;
            this.f15798r = parcel.readString();
            this.f15799s = f1.n(parcel.readString(), "nonce");
            this.f15800t = parcel.readString();
            this.f15801u = parcel.readString();
            String string3 = parcel.readString();
            this.f15802v = string3 != null ? com.facebook.login.a.valueOf(string3) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f15804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.facebook.a f15805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.facebook.n f15806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f15808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f15809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f15810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f15811h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f15803i = new c(null);
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f15816a;

            a(String str) {
                this.f15816a = str;
            }

            public final String g() {
                return this.f15816a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b implements Parcelable.Creator {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.h(source, "source");
                return new f(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            public final f b(e eVar, com.facebook.a aVar, com.facebook.n nVar) {
                return new f(eVar, a.SUCCESS, aVar, nVar, null, null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, com.facebook.a token) {
                kotlin.jvm.internal.s.h(token, "token");
                return new f(eVar, a.SUCCESS, token, null, null);
            }

            private c() {
            }
        }

        public /* synthetic */ f(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.s.h(dest, "dest");
            dest.writeString(this.f15804a.name());
            dest.writeParcelable(this.f15805b, i10);
            dest.writeParcelable(this.f15806c, i10);
            dest.writeString(this.f15807d);
            dest.writeString(this.f15808e);
            dest.writeParcelable(this.f15809f, i10);
            e1.J0(dest, this.f15810g);
            e1.J0(dest, this.f15811h);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(e eVar, a code, com.facebook.a aVar, String str, String str2) {
            this(eVar, code, aVar, null, str, str2);
            kotlin.jvm.internal.s.h(code, "code");
        }

        public f(e eVar, a code, com.facebook.a aVar, com.facebook.n nVar, String str, String str2) {
            kotlin.jvm.internal.s.h(code, "code");
            this.f15809f = eVar;
            this.f15805b = aVar;
            this.f15806c = nVar;
            this.f15807d = str;
            this.f15804a = code;
            this.f15808e = str2;
        }

        private f(Parcel parcel) {
            String string = parcel.readString();
            this.f15804a = a.valueOf(string == null ? "error" : string);
            this.f15805b = (com.facebook.a) parcel.readParcelable(com.facebook.a.class.getClassLoader());
            this.f15806c = (com.facebook.n) parcel.readParcelable(com.facebook.n.class.getClassLoader());
            this.f15807d = parcel.readString();
            this.f15808e = parcel.readString();
            this.f15809f = (e) parcel.readParcelable(e.class.getClassLoader());
            this.f15810g = e1.u0(parcel);
            this.f15811h = e1.u0(parcel);
        }
    }

    public w(Fragment fragment) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        this.f15769b = -1;
        C(fragment);
    }

    private final void b(String str, String str2, boolean z10) {
        Map map = this.f15775h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f15775h == null) {
            this.f15775h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void l() {
        i(f.c.d(f.f15803i, this.f15774g, "Login attempt failed.", null, null, 8, null));
    }

    private final c0 t() {
        String strN;
        c0 c0Var = this.f15777j;
        if (c0Var != null) {
            String strB = c0Var.b();
            e eVar = this.f15774g;
            if (kotlin.jvm.internal.s.c(strB, eVar != null ? eVar.b() : null)) {
                return c0Var;
            }
        }
        Context contextN = n();
        if (contextN == null) {
            contextN = com.facebook.h0.m();
        }
        e eVar2 = this.f15774g;
        if (eVar2 == null || (strN = eVar2.b()) == null) {
            strN = com.facebook.h0.n();
        }
        c0 c0Var2 = new c0(contextN, strN);
        this.f15777j = c0Var2;
        return c0Var2;
    }

    private final void v(String str, f fVar, Map map) {
        w(str, fVar.f15804a.g(), fVar.f15807d, fVar.f15808e, map);
    }

    private final void w(String str, String str2, String str3, String str4, Map map) {
        e eVar = this.f15774g;
        if (eVar == null) {
            t().k("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            t().d(eVar.c(), str, str2, str3, str4, map, eVar.z() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void z(f fVar) {
        d dVar = this.f15771d;
        if (dVar != null) {
            dVar.a(fVar);
        }
    }

    public final boolean A(int i10, int i11, Intent intent) {
        this.f15778k++;
        if (this.f15774g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14834j, false)) {
                G();
                return false;
            }
            g0 g0VarO = o();
            if (g0VarO != null && (!g0VarO.s() || intent != null || this.f15778k >= this.f15779l)) {
                return g0VarO.n(i10, i11, intent);
            }
        }
        return false;
    }

    public final void B(a aVar) {
        this.f15772e = aVar;
    }

    public final void C(Fragment fragment) {
        if (this.f15770c != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.f15770c = fragment;
    }

    public final void D(d dVar) {
        this.f15771d = dVar;
    }

    public final void E(e eVar) {
        if (s()) {
            return;
        }
        c(eVar);
    }

    public final boolean F() {
        g0 g0VarO = o();
        if (g0VarO == null) {
            return false;
        }
        if (g0VarO.l() && !f()) {
            b("no_internet_permission", "1", false);
            return false;
        }
        e eVar = this.f15774g;
        if (eVar == null) {
            return false;
        }
        int iT = g0VarO.t(eVar);
        this.f15778k = 0;
        if (iT > 0) {
            t().f(eVar.c(), g0VarO.g(), eVar.z() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f15779l = iT;
        } else {
            t().e(eVar.c(), g0VarO.g(), eVar.z() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            b("not_tried", g0VarO.g(), true);
        }
        return iT > 0;
    }

    public final void G() {
        w wVar;
        g0 g0VarO = o();
        if (g0VarO != null) {
            wVar = this;
            wVar.w(g0VarO.g(), "skipped", null, null, g0VarO.f());
        } else {
            wVar = this;
        }
        g0[] g0VarArr = wVar.f15768a;
        while (g0VarArr != null) {
            int i10 = wVar.f15769b;
            if (i10 >= g0VarArr.length - 1) {
                break;
            }
            wVar.f15769b = i10 + 1;
            if (F()) {
                return;
            }
        }
        if (wVar.f15774g != null) {
            l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:6:0x0013, B:8:0x0021, B:12:0x0040, B:11:0x0031), top: B:18:0x0013 }] */
    public final void H(f pendingResult) {
        f fVarB;
        kotlin.jvm.internal.s.h(pendingResult, "pendingResult");
        if (pendingResult.f15805b == null) {
            throw new FacebookException("Can't validate without a token");
        }
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        com.facebook.a aVar = pendingResult.f15805b;
        if (aVarE != null) {
            try {
                if (kotlin.jvm.internal.s.c(aVarE.q(), aVar.q())) {
                    fVarB = f.f15803i.b(this.f15774g, pendingResult.f15805b, pendingResult.f15806c);
                } else {
                    fVarB = f.c.d(f.f15803i, this.f15774g, "User logged in as different Facebook user.", null, null, 8, null);
                }
            } catch (Exception e10) {
                i(f.c.d(f.f15803i, this.f15774g, "Caught exception", e10.getMessage(), null, 8, null));
                return;
            }
        } else {
            fVarB = f.c.d(f.f15803i, this.f15774g, "User logged in as different Facebook user.", null, null, 8, null);
        }
        i(fVarB);
    }

    public final void c(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f15774g != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!com.facebook.a.f14853l.g() || f()) {
            this.f15774g = eVar;
            this.f15768a = q(eVar);
            G();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e() {
        g0 g0VarO = o();
        if (g0VarO != null) {
            g0VarO.b();
        }
    }

    public final boolean f() {
        if (this.f15773f) {
            return true;
        }
        if (g("android.permission.INTERNET") == 0) {
            this.f15773f = true;
            return true;
        }
        androidx.fragment.app.s sVarN = n();
        i(f.c.d(f.f15803i, this.f15774g, sVarN != null ? sVarN.getString(com.facebook.common.e.f15054c) : null, sVarN != null ? sVarN.getString(com.facebook.common.e.f15053b) : null, null, 8, null));
        return false;
    }

    public final int g(String permission) {
        kotlin.jvm.internal.s.h(permission, "permission");
        androidx.fragment.app.s sVarN = n();
        if (sVarN != null) {
            return sVarN.checkCallingOrSelfPermission(permission);
        }
        return -1;
    }

    public final void i(f outcome) {
        kotlin.jvm.internal.s.h(outcome, "outcome");
        g0 g0VarO = o();
        if (g0VarO != null) {
            v(g0VarO.g(), outcome, g0VarO.f());
        }
        Map map = this.f15775h;
        if (map != null) {
            outcome.f15810g = map;
        }
        Map map2 = this.f15776i;
        if (map2 != null) {
            outcome.f15811h = map2;
        }
        this.f15768a = null;
        this.f15769b = -1;
        this.f15774g = null;
        this.f15775h = null;
        this.f15778k = 0;
        this.f15779l = 0;
        z(outcome);
    }

    public final void j(f outcome) {
        kotlin.jvm.internal.s.h(outcome, "outcome");
        if (outcome.f15805b == null || !com.facebook.a.f14853l.g()) {
            i(outcome);
        } else {
            H(outcome);
        }
    }

    public final androidx.fragment.app.s n() {
        Fragment fragment = this.f15770c;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final g0 o() {
        g0[] g0VarArr;
        int i10 = this.f15769b;
        if (i10 < 0 || (g0VarArr = this.f15768a) == null) {
            return null;
        }
        return g0VarArr[i10];
    }

    public final Fragment p() {
        return this.f15770c;
    }

    public g0[] q(e request) {
        kotlin.jvm.internal.s.h(request, "request");
        ArrayList arrayList = new ArrayList();
        v vVarQ = request.q();
        if (!request.A()) {
            if (vVarQ.i()) {
                arrayList.add(new s(this));
            }
            if (!com.facebook.h0.f15100u && vVarQ.k()) {
                arrayList.add(new u(this));
            }
        } else if (!com.facebook.h0.f15100u && vVarQ.j()) {
            arrayList.add(new t(this));
        }
        if (vVarQ.g()) {
            arrayList.add(new com.facebook.login.c(this));
        }
        if (vVarQ.l()) {
            arrayList.add(new w0(this));
        }
        if (!request.A() && vVarQ.h()) {
            arrayList.add(new n(this));
        }
        return (g0[]) arrayList.toArray(new g0[0]);
    }

    public final boolean s() {
        return this.f15774g != null && this.f15769b >= 0;
    }

    public final e u() {
        return this.f15774g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeParcelableArray(this.f15768a, i10);
        dest.writeInt(this.f15769b);
        dest.writeParcelable(this.f15774g, i10);
        e1.J0(dest, this.f15775h);
        e1.J0(dest, this.f15776i);
    }

    public final void x() {
        a aVar = this.f15772e;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void y() {
        a aVar = this.f15772e;
        if (aVar != null) {
            aVar.b();
        }
    }

    public w(Parcel source) {
        kotlin.jvm.internal.s.h(source, "source");
        this.f15769b = -1;
        Parcelable[] parcelableArray = source.readParcelableArray(g0.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            g0 g0Var = parcelable instanceof g0 ? (g0) parcelable : null;
            if (g0Var != null) {
                g0Var.q(this);
            }
            if (g0Var != null) {
                arrayList.add(g0Var);
            }
            i10++;
        }
        this.f15768a = (g0[]) arrayList.toArray(new g0[0]);
        this.f15769b = source.readInt();
        this.f15774g = (e) source.readParcelable(e.class.getClassLoader());
        Map mapU0 = e1.u0(source);
        this.f15775h = mapU0 != null ? gl.l0.v(mapU0) : null;
        Map mapU1 = e1.u0(source);
        this.f15776i = mapU1 != null ? gl.l0.v(mapU1) : null;
    }
}
