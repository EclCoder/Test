package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import com.facebook.internal.j1;
import com.facebook.internal.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class w0 extends v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j1 f15818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f15819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.facebook.l f15821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f15817j = new c(null);
    public static final Parcelable.Creator<w0> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends j1.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f15822h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private v f15823i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private i0 f15824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f15825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f15826l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private w.e f15827m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f15828n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f15829o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w0 f15830p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, Context context, String applicationId, Bundle parameters, w.e request) {
            super(context, applicationId, "oauth", parameters);
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            kotlin.jvm.internal.s.h(parameters, "parameters");
            kotlin.jvm.internal.s.h(request, "request");
            this.f15830p = w0Var;
            this.f15822h = "fbconnect://success";
            this.f15823i = v.NATIVE_WITH_FALLBACK;
            this.f15824j = i0.FACEBOOK;
            this.f15827m = request;
        }

        @Override // com.facebook.internal.j1.a
        public j1 a() {
            Bundle bundleF = f();
            kotlin.jvm.internal.s.f(bundleF, "null cannot be cast to non-null type android.os.Bundle");
            String strW = this.f15827m.w();
            boolean z10 = strW == null || strW.length() == 0;
            if (!bundleF.containsKey("redirect_uri")) {
                bundleF.putString("redirect_uri", this.f15822h);
            }
            bundleF.putString("client_id", c());
            bundleF.putString("e2e", j());
            bundleF.putString("response_type", this.f15824j == i0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundleF.putString("return_scopes", "true");
            bundleF.putString("auth_type", i());
            bundleF.putString("login_behavior", this.f15823i.name());
            if (this.f15825k) {
                bundleF.putString("fx_app", this.f15824j.toString());
            }
            if (this.f15826l) {
                bundleF.putString("skip_dedupe", "true");
            }
            if (z10) {
                j1.b bVar = j1.f15259m;
                Context contextD = d();
                kotlin.jvm.internal.s.f(contextD, "null cannot be cast to non-null type android.content.Context");
                return bVar.d(contextD, "oauth", bundleF, g(), this.f15824j, e());
            }
            d.a aVar = d.f15831q;
            Context contextD2 = d();
            kotlin.jvm.internal.s.f(contextD2, "null cannot be cast to non-null type android.content.Context");
            int iG = g();
            i0 i0Var = this.f15824j;
            j1.d dVarE = e();
            String strW2 = this.f15827m.w();
            kotlin.jvm.internal.s.e(strW2);
            return aVar.a(contextD2, "oauth", bundleF, iG, i0Var, dVarE, strW2);
        }

        public final String i() {
            String str = this.f15829o;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.s.w("authType");
            return null;
        }

        public final String j() {
            String str = this.f15828n;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.s.w("e2e");
            return null;
        }

        public final a k(String authType) {
            kotlin.jvm.internal.s.h(authType, "authType");
            l(authType);
            return this;
        }

        public final a m(String e2e) {
            kotlin.jvm.internal.s.h(e2e, "e2e");
            n(e2e);
            return this;
        }

        public final void n(String str) {
            kotlin.jvm.internal.s.h(str, "<set-?>");
            this.f15828n = str;
        }

        public final a o(boolean z10) {
            this.f15825k = z10;
            return this;
        }

        public final a p(boolean z10) {
            this.f15822h = z10 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(v loginBehavior) {
            kotlin.jvm.internal.s.h(loginBehavior, "loginBehavior");
            this.f15823i = loginBehavior;
            return this;
        }

        public final a r(i0 targetApp) {
            kotlin.jvm.internal.s.h(targetApp, "targetApp");
            this.f15824j = targetApp;
            return this;
        }

        public final a s(boolean z10) {
            this.f15826l = z10;
            return this;
        }

        public final void l(String str) {
            kotlin.jvm.internal.s.h(str, UHbHibBvYxKnPE.MtUrogMjRWjvAZD);
            this.f15829o = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new w0(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w0[] newArray(int i10) {
            return new w0[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends j1 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f15831q = new a(null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f15832p;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: com.facebook.login.w0$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public /* synthetic */ class C0269a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f15833a;

                static {
                    int[] iArr = new int[i0.values().length];
                    try {
                        iArr[i0.INSTAGRAM.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f15833a = iArr;
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final j1 a(Context context, String str, Bundle bundle, int i10, i0 targetApp, j1.d dVar, String customRedirectUri) {
                Uri uriG;
                kotlin.jvm.internal.s.h(context, "context");
                kotlin.jvm.internal.s.h(targetApp, "targetApp");
                kotlin.jvm.internal.s.h(customRedirectUri, "customRedirectUri");
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putString("display", "touch");
                bundle2.putString("client_id", com.facebook.h0.n());
                bundle2.putString("sdk", "android-" + com.facebook.h0.F());
                if (C0269a.f15833a[targetApp.ordinal()] == 1) {
                    uriG = e1.g(x0.k(), "oauth/authorize", bundle2);
                } else {
                    uriG = e1.g(x0.b(), com.facebook.h0.y() + "/dialog/" + str, bundle2);
                }
                j1.b bVar = j1.f15259m;
                j1.s(context);
                String string = uriG.toString();
                kotlin.jvm.internal.s.g(string, "uri.toString()");
                d dVar2 = new d(context, string, customRedirectUri);
                dVar2.B(dVar);
                return dVar2;
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String url, String customRedirectUri) {
            super(context, url);
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(customRedirectUri, "customRedirectUri");
            this.f15832p = customRedirectUri;
            A(customRedirectUri);
        }

        @Override // com.facebook.internal.j1
        public Bundle w(String str) {
            if (str == null || this.f15832p.length() <= 0 || !bm.r.N(str, this.f15832p, false, 2, null)) {
                return super.w(str);
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                getContext().startActivity(intent);
                dismiss();
            } catch (Exception e10) {
                y(new FacebookDialogException("Failed to launch custom redirect: " + e10.getMessage(), -1, str));
            }
            return new Bundle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements j1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.e f15835b;

        e(w.e eVar) {
            this.f15835b = eVar;
        }

        @Override // com.facebook.internal.j1.d
        public void a(Bundle bundle, FacebookException facebookException) {
            w0.this.B(this.f15835b, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15820h = "web_view";
        this.f15821i = com.facebook.l.WEB_VIEW;
    }

    public final void B(w.e request, Bundle bundle, FacebookException facebookException) {
        kotlin.jvm.internal.s.h(request, "request");
        super.z(request, bundle, facebookException);
    }

    @Override // com.facebook.login.g0
    public void b() {
        j1 j1Var = this.f15818f;
        if (j1Var != null) {
            if (j1Var != null) {
                j1Var.cancel();
            }
            this.f15818f = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15820h;
    }

    @Override // com.facebook.login.g0
    public boolean l() {
        return true;
    }

    @Override // com.facebook.login.g0
    public int t(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        Bundle bundleU = u(v(request), request);
        e eVar = new e(request);
        String strA = w.f15766m.a();
        this.f15819g = strA;
        a("e2e", strA);
        androidx.fragment.app.s sVarN = e().n();
        if (sVarN == null) {
            return 0;
        }
        boolean zY = e1.Y(sVarN);
        a aVar = new a(this, sVarN, request.b(), bundleU, request);
        String str = this.f15819g;
        kotlin.jvm.internal.s.f(str, "null cannot be cast to non-null type kotlin.String");
        this.f15818f = aVar.m(str).p(zY).k(request.e()).q(request.q()).r(request.s()).o(request.z()).s(request.K()).h(eVar).a();
        com.facebook.internal.n nVar = new com.facebook.internal.n();
        nVar.setRetainInstance(true);
        nVar.A(this.f15818f);
        nVar.show(sVarN.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.g0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f15819g);
    }

    @Override // com.facebook.login.v0
    public com.facebook.l x() {
        return this.f15821i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15820h = "web_view";
        this.f15821i = com.facebook.l.WEB_VIEW;
        this.f15819g = source.readString();
    }
}
