package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.facebook.internal.e1;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15764e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15765d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
    }

    private final void A(String str) {
        Context contextN = e().n();
        if (contextN == null) {
            contextN = com.facebook.h0.m();
        }
        contextN.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    private final String y() {
        Context contextN = e().n();
        if (contextN == null) {
            contextN = com.facebook.h0.m();
        }
        return contextN.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    protected Bundle u(Bundle parameters, w.e request) {
        kotlin.jvm.internal.s.h(parameters, "parameters");
        kotlin.jvm.internal.s.h(request, "request");
        String strW = request.w();
        parameters.putString("redirect_uri", (strW == null || strW.length() == 0) ? i() : request.w());
        if (request.A()) {
            parameters.putString(MBridgeConstans.APP_ID, request.b());
        } else {
            parameters.putString("client_id", request.b());
        }
        parameters.putString("e2e", w.f15766m.a());
        if (request.A()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.v().contains(Scopes.OPEN_ID)) {
                parameters.putString("nonce", request.u());
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.f());
        com.facebook.login.a aVarG = request.g();
        parameters.putString("code_challenge_method", aVarG != null ? aVarG.name() : null);
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.e());
        parameters.putString("login_behavior", request.q().name());
        parameters.putString("sdk", "android-" + com.facebook.h0.F());
        if (w() != null) {
            parameters.putString("sso", w());
        }
        boolean z10 = com.facebook.h0.f15098s;
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        parameters.putString("cct_prefetching", z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        if (request.z()) {
            parameters.putString("fx_app", request.s().toString());
        }
        if (request.K()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.o()) {
            parameters.putString("force_confirmation", "true");
        }
        String strA = request.a();
        if (strA != null && strA.length() != 0) {
            parameters.putString("android_sso_context", request.a());
        }
        if (request.t() != null) {
            parameters.putString("messenger_page_id", request.t());
            if (request.x()) {
                str = "1";
            }
            parameters.putString("reset_messenger_state", str);
        }
        return parameters;
    }

    protected Bundle v(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        Bundle bundle = new Bundle();
        if (!e1.f0(request.v())) {
            String strJoin = TextUtils.join(",", request.v());
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        e eVarJ = request.j();
        if (eVarJ == null) {
            eVarJ = e.NONE;
        }
        bundle.putString("default_audience", eVarJ.g());
        bundle.putString("state", c(request.c()));
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        String strP = aVarE != null ? aVarE.p() : null;
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        if (strP == null || !kotlin.jvm.internal.s.c(strP, y())) {
            androidx.fragment.app.s sVarN = e().n();
            if (sVarN != null) {
                e1.i(sVarN);
            }
            a("access_token", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        } else {
            bundle.putString("access_token", strP);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (com.facebook.h0.q()) {
            str = "1";
        }
        bundle.putString("ies", str);
        return bundle;
    }

    protected String w() {
        return null;
    }

    public abstract com.facebook.l x();

    public void z(w.e request, Bundle bundle, FacebookException facebookException) {
        String strValueOf;
        w.f fVarC;
        String strValueOf2;
        kotlin.jvm.internal.s.h(request, "request");
        w wVarE = e();
        this.f15765d = null;
        String strW = request.w();
        if (strW != null && strW.length() != 0 && !kotlin.jvm.internal.s.c(request.w(), i())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                wVarE.j(w.f.f15803i.a(wVarE.u(), "User canceled log in."));
                return;
            }
            if (facebookException != null) {
                this.f15765d = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    com.facebook.x requestError = ((FacebookServiceException) facebookException).getRequestError();
                    strValueOf2 = String.valueOf(requestError.b());
                    message = requestError.toString();
                } else {
                    strValueOf2 = null;
                }
                wVarE.j(w.f.f15803i.c(wVarE.u(), null, message, strValueOf2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f15765d = bundle.getString("e2e");
            }
            try {
                g0.a aVar = g0.f15612c;
                com.facebook.a aVarB = aVar.b(request.v(), bundle, x(), request.b());
                fVarC = w.f.f15803i.b(wVarE.u(), aVarB, aVar.d(bundle, request.u()));
                if (wVarE.n() != null) {
                    try {
                        CookieSyncManager.createInstance(wVarE.n()).sync();
                    } catch (Exception unused) {
                    }
                    if (aVarB != null) {
                        A(aVarB.p());
                    }
                }
            } catch (FacebookException e10) {
                fVarC = w.f.c.d(w.f.f15803i, wVarE.u(), null, e10.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            fVarC = w.f.f15803i.a(wVarE.u(), "User canceled log in.");
        } else {
            this.f15765d = null;
            String message2 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                com.facebook.x requestError2 = ((FacebookServiceException) facebookException).getRequestError();
                strValueOf = String.valueOf(requestError2.b());
                message2 = requestError2.toString();
            } else {
                strValueOf = null;
            }
            fVarC = w.f.f15803i.c(wVarE.u(), null, message2, strValueOf);
        }
        if (!e1.e0(this.f15765d)) {
            j(this.f15765d);
        }
        wVarE.j(fVarC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
    }
}
