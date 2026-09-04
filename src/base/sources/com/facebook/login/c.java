package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.facebook.internal.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends v0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f15565l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f15567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.facebook.l f15570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f15564k = new b(null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new c(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15569i = "custom_tab";
        this.f15570j = com.facebook.l.f15538g;
        this.f15567g = e1.t(20);
        f15565l = false;
        this.f15568h = com.facebook.internal.g.c(E());
    }

    private final String C(String str) {
        return "intent://" + str;
    }

    private final String D() {
        String str = this.f15566f;
        if (str != null) {
            return str;
        }
        String strA = com.facebook.internal.g.a();
        this.f15566f = strA;
        return strA;
    }

    private final String E() {
        return super.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(c this$0, w.e request, Bundle values) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(request, "$request");
        kotlin.jvm.internal.s.h(values, "$values");
        try {
            this$0.z(request, this$0.o(request, values), null);
        } catch (FacebookException e10) {
            this$0.z(request, null, e10);
        }
    }

    private final boolean H(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return kotlin.jvm.internal.s.c(new JSONObject(string).getString("7_challenge"), this.f15567g);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15569i;
    }

    @Override // com.facebook.login.g0
    protected String i() {
        return this.f15568h;
    }

    @Override // com.facebook.login.g0
    public boolean n(int i10, int i11, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14834j, false)) {
            return super.n(i10, i11, intent);
        }
        if (i10 != 1) {
            return super.n(i10, i11, intent);
        }
        w.e eVarU = e().u();
        if (eVarU == null) {
            return false;
        }
        if (i11 == -1) {
            F(intent != null ? intent.getStringExtra(CustomTabMainActivity.f14831g) : null, eVarU);
            return true;
        }
        super.z(eVarU, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.g0
    public void p(JSONObject param) throws JSONException {
        kotlin.jvm.internal.s.h(param, "param");
        param.put("7_challenge", this.f15567g);
    }

    @Override // com.facebook.login.g0
    public int t(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        w wVarE = e();
        if (i().length() == 0) {
            return 0;
        }
        Bundle bundleU = u(v(request), request);
        if (f15565l) {
            bundleU.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.h0.f15098s) {
            if (request.A()) {
                d.f15576b.c(com.facebook.internal.m0.f15312c.a("oauth", bundleU));
            } else {
                d.f15576b.c(com.facebook.internal.f.f15211b.a("oauth", bundleU));
            }
        }
        androidx.fragment.app.s sVarN = wVarE.n();
        if (sVarN == null) {
            return 0;
        }
        Intent intent = new Intent(sVarN, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f14828d, "oauth");
        intent.putExtra(CustomTabMainActivity.f14829e, bundleU);
        intent.putExtra(CustomTabMainActivity.f14830f, D());
        intent.putExtra(CustomTabMainActivity.f14832h, request.s().toString());
        Fragment fragmentP = wVarE.p();
        if (fragmentP != null) {
            fragmentP.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.v0
    protected String w() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.g0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f15567g);
    }

    @Override // com.facebook.login.v0
    public com.facebook.l x() {
        return this.f15570j;
    }

    private final void F(String str, final w.e eVar) {
        int i10;
        if (str != null) {
            if (bm.r.N(str, "fbconnect://cct.", false, 2, null) || bm.r.N(str, super.i(), false, 2, null)) {
                Uri uri = Uri.parse(str);
                final Bundle bundleQ0 = e1.q0(uri.getQuery());
                bundleQ0.putAll(e1.q0(uri.getFragment()));
                if (!H(bundleQ0)) {
                    super.z(eVar, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = bundleQ0.getString("error");
                if (string == null) {
                    string = bundleQ0.getString("error_type");
                }
                String string2 = bundleQ0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleQ0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleQ0.getString("error_description");
                }
                String string3 = bundleQ0.getString("error_code");
                if (string3 != null) {
                    try {
                        i10 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i10 = -1;
                    }
                } else {
                    i10 = -1;
                }
                if (e1.e0(string) && e1.e0(string2) && i10 == -1) {
                    if (bundleQ0.containsKey("access_token")) {
                        super.z(eVar, bundleQ0, null);
                        return;
                    } else {
                        com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.login.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.G(this.f15559a, eVar, bundleQ0);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (kotlin.jvm.internal.s.c(string, "access_denied") || kotlin.jvm.internal.s.c(string, NpmRNZ.xvHBua))) {
                    super.z(eVar, null, new FacebookOperationCanceledException());
                } else if (i10 == 4201) {
                    super.z(eVar, null, new FacebookOperationCanceledException());
                } else {
                    super.z(eVar, null, new FacebookServiceException(new com.facebook.x(i10, string, string2), string2));
                }
            }
        }
    }

    @Override // com.facebook.login.v0
    protected Bundle u(Bundle parameters, w.e eVar) {
        String strI;
        kotlin.jvm.internal.s.h(parameters, "parameters");
        kotlin.jvm.internal.s.h(eVar, UHbHibBvYxKnPE.vrtrkUrv);
        Bundle bundleU = super.u(parameters, eVar);
        String strW = eVar.w();
        if (strW == null || strW.length() == 0) {
            String strP = eVar.p();
            if (strP == null || strP.length() == 0) {
                strI = i();
            } else {
                String strP2 = eVar.p();
                kotlin.jvm.internal.s.e(strP2);
                strI = C(strP2);
            }
        } else {
            strI = eVar.w();
        }
        bundleU.putString("redirect_uri", strI);
        return bundleU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15569i = "custom_tab";
        this.f15570j = com.facebook.l.f15538g;
        this.f15567g = source.readString();
        this.f15568h = com.facebook.internal.g.c(E());
    }
}
