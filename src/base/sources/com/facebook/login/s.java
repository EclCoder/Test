package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import com.google.android.gms.common.Scopes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f15707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f15706f = new b(null);
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new s(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i10) {
            return new s[i10];
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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements e1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f15709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f15710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.e f15711c;

        c(Bundle bundle, s sVar, w.e eVar) {
            this.f15709a = bundle;
            this.f15710b = sVar;
            this.f15711c = eVar;
        }

        @Override // com.facebook.internal.e1.a
        public void a(JSONObject jSONObject) {
            try {
                this.f15709a.putString("com.facebook.platform.extra.USER_ID", jSONObject != null ? jSONObject.getString("id") : null);
                this.f15710b.x(this.f15711c, this.f15709a);
            } catch (JSONException e10) {
                this.f15710b.e().i(w.f.c.d(w.f.f15803i, this.f15710b.e().u(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.e1.a
        public void b(FacebookException facebookException) {
            this.f15710b.e().i(w.f.c.d(w.f.f15803i, this.f15710b.e().u(), "Caught exception", facebookException != null ? facebookException.getMessage() : null, null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15708e = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(s this$0, w.e request, Bundle bundle) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(request, "$request");
        this$0.w(request, bundle);
    }

    @Override // com.facebook.login.g0
    public void b() {
        q qVar = this.f15707d;
        if (qVar != null) {
            qVar.b();
            qVar.f(null);
            this.f15707d = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15708e;
    }

    @Override // com.facebook.login.g0
    public int t(final w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        Context contextN = e().n();
        if (contextN == null) {
            contextN = com.facebook.h0.m();
        }
        q qVar = new q(contextN, request);
        this.f15707d = qVar;
        if (!qVar.g()) {
            return 0;
        }
        e().x();
        com.facebook.internal.v0.b bVar = new com.facebook.internal.v0.b() { // from class: com.facebook.login.r
            @Override // com.facebook.internal.v0.b
            public final void a(Bundle bundle) {
                s.y(this.f15696a, request, bundle);
            }
        };
        q qVar2 = this.f15707d;
        if (qVar2 == null) {
            return 1;
        }
        qVar2.f(bVar);
        return 1;
    }

    public final void v(w.e request, Bundle result) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            x(request, result);
            return;
        }
        e().x();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        kotlin.jvm.internal.s.g(string2, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
        e1.H(string2, new c(result, this, request));
    }

    public final void w(w.e request, Bundle bundle) {
        kotlin.jvm.internal.s.h(request, "request");
        q qVar = this.f15707d;
        if (qVar != null) {
            qVar.f(null);
        }
        this.f15707d = null;
        e().y();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = gl.r.l();
            }
            Set<String> setV = request.v();
            if (setV == null) {
                setV = gl.s0.d();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setV.contains(Scopes.OPEN_ID) && (string == null || string.length() == 0)) {
                e().G();
                return;
            }
            if (stringArrayList.containsAll(setV)) {
                v(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setV) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.G(hashSet);
        }
        e().G();
    }

    public final void x(w.e request, Bundle result) {
        w.f fVarD;
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(result, "result");
        try {
            g0.a aVar = g0.f15612c;
            fVarD = w.f.f15803i.b(request, aVar.a(result, com.facebook.l.FACEBOOK_APPLICATION_SERVICE, request.b()), aVar.c(result, request.u()));
        } catch (FacebookException e10) {
            fVarD = w.f.c.d(w.f.f15803i, e().u(), null, e10.getMessage(), null, 8, null);
        }
        e().j(fVarD);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15708e = "get_token";
    }
}
