package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f15590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f15591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f15592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile f0 f15593m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f15596c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15599f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15602i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f15594a = v.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.login.e f15595b = com.facebook.login.e.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15597d = "rerequest";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i0 f15600g = i0.FACEBOOK;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f15603a;

        public a(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            this.f15603a = activity;
        }

        @Override // com.facebook.login.u0
        public Activity a() {
            return this.f15603a;
        }

        @Override // com.facebook.login.u0
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.s.h(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set d() {
            return gl.s0.h("ads_management", "create_event", "rsvp_event");
        }

        public final h0 b(w.e request, com.facebook.a newToken, com.facebook.n nVar) {
            kotlin.jvm.internal.s.h(request, "request");
            kotlin.jvm.internal.s.h(newToken, "newToken");
            Set setV = request.v();
            Set setM0 = gl.r.M0(gl.r.Y(newToken.n()));
            if (request.B()) {
                setM0.retainAll(setV);
            }
            Set setM1 = gl.r.M0(gl.r.Y(setV));
            setM1.removeAll(setM0);
            return new h0(newToken, nVar, setM0, setM1);
        }

        public f0 c() {
            if (f0.f15593m == null) {
                synchronized (this) {
                    f0.f15593m = new f0();
                    fl.g0 g0Var = fl.g0.f38750a;
                }
            }
            f0 f0Var = f0.f15593m;
            if (f0Var != null) {
                return f0Var;
            }
            kotlin.jvm.internal.s.w("instance");
            return null;
        }

        public final boolean e(String str) {
            return str != null && (bm.r.N(str, "publish", false, 2, null) || bm.r.N(str, "manage", false, 2, null) || f0.f15591k.contains(str));
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.facebook.r f15604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15605b;

        public c(com.facebook.r rVar, String str) {
            this.f15604a = rVar;
            this.f15605b = str;
        }

        @Override // g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Collection permissions) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(permissions, "permissions");
            w.e eVarJ = f0.this.j(new x(permissions, null, 2, null));
            String str = this.f15605b;
            if (str != null) {
                eVarJ.D(str);
            }
            f0.this.v(context, eVarJ);
            Intent intentL = f0.this.l(eVarJ);
            if (f0.this.B(intentL)) {
                return intentL;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            f0.this.m(context, w.f.a.ERROR, null, facebookException, false, eVarJ);
            throw facebookException;
        }

        @Override // g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.r.a c(int i10, Intent intent) {
            f0.y(f0.this, i10, intent, null, 4, null);
            int iG = com.facebook.internal.e.c.Login.g();
            com.facebook.r rVar = this.f15604a;
            if (rVar != null) {
                rVar.onActivityResult(iG, i10, intent);
            }
            return new com.facebook.r.a(iG, i10, intent);
        }

        public final void f(com.facebook.r rVar) {
            this.f15604a = rVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.facebook.internal.f0 f15607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Activity f15608b;

        public d(com.facebook.internal.f0 fragment) {
            kotlin.jvm.internal.s.h(fragment, "fragment");
            this.f15607a = fragment;
            this.f15608b = fragment.a();
        }

        @Override // com.facebook.login.u0
        public Activity a() {
            return this.f15608b;
        }

        @Override // com.facebook.login.u0
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.s.h(intent, "intent");
            this.f15607a.d(intent, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f15609a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static c0 f15610b;

        private e() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
        public final synchronized c0 a(Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (f15610b == null) {
                    f15610b = new c0(context, com.facebook.h0.n());
                }
                return f15610b;
            }
            context = com.facebook.h0.m();
            if (context == null) {
                return null;
            }
            if (f15610b == null) {
                f15610b = new c0(context, com.facebook.h0.n());
            }
            return f15610b;
            throw th;
        }
    }

    static {
        b bVar = new b(null);
        f15590j = bVar;
        f15591k = bVar.d();
        String string = f0.class.toString();
        kotlin.jvm.internal.s.g(string, "LoginManager::class.java.toString()");
        f15592l = string;
    }

    public f0() {
        f1.o();
        SharedPreferences sharedPreferences = com.facebook.h0.m().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.s.g(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.f15596c = sharedPreferences;
        if (!com.facebook.h0.f15098s || com.facebook.internal.g.a() == null) {
            return;
        }
        androidx.browser.customtabs.c.a(com.facebook.h0.m(), "com.android.chrome", new com.facebook.login.d());
        androidx.browser.customtabs.c.b(com.facebook.h0.m(), com.facebook.h0.m().getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(f0 this$0, com.facebook.u uVar, int i10, Intent intent) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        return this$0.x(i10, intent, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B(Intent intent) {
        return com.facebook.h0.m().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void E(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f15596c.edit();
        editorEdit.putBoolean("express_login_allowed", z10);
        editorEdit.apply();
    }

    private final void L(u0 u0Var, w.e eVar) {
        v(u0Var.a(), eVar);
        e1.l0(f15592l, "auth_logger_id: " + eVar.c());
        com.facebook.internal.e.f15151b.c(com.facebook.internal.e.c.Login.g(), new com.facebook.internal.e.a() { // from class: com.facebook.login.e0
            @Override // com.facebook.internal.e.a
            public final boolean a(int i10, Intent intent) {
                return f0.M(this.f15588a, i10, intent);
            }
        });
        if (N(u0Var, eVar)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m(u0Var.a(), w.f.a.ERROR, null, facebookException, false, eVar);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(f0 this$0, int i10, Intent intent) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        return y(this$0, i10, intent, null, 4, null);
    }

    private final boolean N(u0 u0Var, w.e eVar) {
        Intent intentL = l(eVar);
        if (!B(intentL)) {
            return false;
        }
        try {
            u0Var.startActivityForResult(intentL, w.f15766m.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void O(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!f15590j.e(str)) {
                throw new FacebookException("Cannot pass a read permission (" + str + ") to a request for publish authorization");
            }
        }
    }

    private final void k(com.facebook.a aVar, com.facebook.n nVar, w.e eVar, FacebookException facebookException, boolean z10, com.facebook.u uVar) {
        if (aVar != null) {
            com.facebook.a.f14853l.i(aVar);
            com.facebook.s0.f16003h.a();
        }
        if (nVar != null) {
            com.facebook.n.f15930f.a(nVar);
        }
        if (uVar != null) {
            h0 h0VarB = (aVar == null || eVar == null) ? null : f15590j.b(eVar, aVar, nVar);
            if (z10 || (h0VarB != null && h0VarB.a().isEmpty())) {
                uVar.onCancel();
                return;
            }
            if (facebookException != null) {
                uVar.a(facebookException);
            } else {
                if (aVar == null || h0VarB == null) {
                    return;
                }
                E(true);
                uVar.onSuccess(h0VarB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Context context, w.f.a aVar, Map map, Exception exc, boolean z10, w.e eVar) {
        c0 c0VarA = e.f15609a.a(context);
        if (c0VarA == null) {
            return;
        }
        if (eVar == null) {
            c0.l(c0VarA, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        map2.put("from_sso", "false");
        c0VarA.g(eVar.c(), map2, aVar, map, exc, eVar.z() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    private final void t(com.facebook.internal.f0 f0Var, Collection collection) {
        O(collection);
        w(f0Var, new x(collection, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Context context, w.e eVar) {
        c0 c0VarA = e.f15609a.a(context);
        if (c0VarA == null || eVar == null) {
            return;
        }
        c0VarA.j(eVar, eVar.z() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    private final void w(com.facebook.internal.f0 f0Var, x xVar) {
        q(f0Var, xVar);
    }

    public static /* synthetic */ boolean y(f0 f0Var, int i10, Intent intent, com.facebook.u uVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            uVar = null;
        }
        return f0Var.x(i10, intent, uVar);
    }

    public final f0 C(String authType) {
        kotlin.jvm.internal.s.h(authType, "authType");
        this.f15597d = authType;
        return this;
    }

    public final f0 D(com.facebook.login.e defaultAudience) {
        kotlin.jvm.internal.s.h(defaultAudience, "defaultAudience");
        this.f15595b = defaultAudience;
        return this;
    }

    public final f0 F(boolean z10) {
        this.f15601h = z10;
        return this;
    }

    public final f0 G(v loginBehavior) {
        kotlin.jvm.internal.s.h(loginBehavior, "loginBehavior");
        this.f15594a = loginBehavior;
        return this;
    }

    public final f0 H(i0 targetApp) {
        kotlin.jvm.internal.s.h(targetApp, "targetApp");
        this.f15600g = targetApp;
        return this;
    }

    public final f0 I(String str) {
        this.f15598e = str;
        return this;
    }

    public final f0 J(boolean z10) {
        this.f15599f = z10;
        return this;
    }

    public final f0 K(boolean z10) {
        this.f15602i = z10;
        return this;
    }

    public final c i(com.facebook.r rVar, String str) {
        return new c(rVar, str);
    }

    protected w.e j(x loginConfig) {
        String strA;
        kotlin.jvm.internal.s.h(loginConfig, "loginConfig");
        com.facebook.login.a aVar = com.facebook.login.a.S256;
        try {
            strA = m0.b(loginConfig.a(), aVar);
        } catch (FacebookException unused) {
            aVar = com.facebook.login.a.PLAIN;
            strA = loginConfig.a();
        }
        com.facebook.login.a aVar2 = aVar;
        String str = strA;
        v vVar = this.f15594a;
        Set setN0 = gl.r.N0(loginConfig.c());
        com.facebook.login.e eVar = this.f15595b;
        String str2 = this.f15597d;
        String strN = com.facebook.h0.n();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "randomUUID().toString()");
        w.e eVar2 = new w.e(vVar, setN0, eVar, str2, strN, string, this.f15600g, loginConfig.b(), loginConfig.a(), str, aVar2, com.facebook.h0.E(), com.facebook.h0.B());
        eVar2.H(com.facebook.a.f14853l.g());
        eVar2.F(this.f15598e);
        eVar2.I(this.f15599f);
        eVar2.E(this.f15601h);
        eVar2.J(this.f15602i);
        p.a aVar3 = p.f15688a;
        String strA2 = aVar3.a();
        if (strA2 != null) {
            eVar2.C(strA2);
            aVar3.b(null);
        }
        return eVar2;
    }

    protected Intent l(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        Intent intent = new Intent();
        intent.setClass(com.facebook.h0.m(), FacebookActivity.class);
        intent.setAction(request.q().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void n(Activity activity, Collection collection, String str) {
        kotlin.jvm.internal.s.h(activity, "activity");
        w.e eVarJ = j(new x(collection, null, 2, null));
        if (str != null) {
            eVarJ.D(str);
        }
        L(new a(activity), eVarJ);
    }

    public final void o(Fragment fragment, Collection collection, String str) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        r(new com.facebook.internal.f0(fragment), collection, str);
    }

    public final void p(androidx.fragment.app.Fragment fragment, Collection collection, String str) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        r(new com.facebook.internal.f0(fragment), collection, str);
    }

    public final void q(com.facebook.internal.f0 fragment, x loginConfig) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        kotlin.jvm.internal.s.h(loginConfig, "loginConfig");
        L(new d(fragment), j(loginConfig));
    }

    public final void r(com.facebook.internal.f0 fragment, Collection collection, String str) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        w.e eVarJ = j(new x(collection, null, 2, null));
        if (str != null) {
            eVarJ.D(str);
        }
        L(new d(fragment), eVarJ);
    }

    public final void s(androidx.fragment.app.Fragment fragment, Collection permissions) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        kotlin.jvm.internal.s.h(permissions, "permissions");
        t(new com.facebook.internal.f0(fragment), permissions);
    }

    public void u() {
        com.facebook.a.f14853l.i(null);
        com.facebook.n.f15930f.a(null);
        com.facebook.s0.f16003h.c(null);
        E(false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public boolean x(int i10, Intent intent, com.facebook.u uVar) {
        w.f.a aVar;
        boolean z10;
        com.facebook.a aVar2;
        com.facebook.n nVar;
        Map map;
        w.e eVar;
        com.facebook.n nVar2;
        w.f.a aVar3 = w.f.a.ERROR;
        FacebookException facebookException = null;
        boolean z11 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(w.f.class.getClassLoader());
            w.f fVar = (w.f) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (fVar != null) {
                w.e eVar2 = fVar.f15809f;
                w.f.a aVar4 = fVar.f15804a;
                if (i10 != -1) {
                    z11 = i10 == 0;
                    aVar2 = null;
                    nVar2 = null;
                } else if (aVar4 == w.f.a.SUCCESS) {
                    aVar2 = fVar.f15805b;
                    nVar2 = fVar.f15806c;
                } else {
                    nVar2 = null;
                    facebookException = new FacebookAuthorizationException(fVar.f15807d);
                    aVar2 = null;
                }
                map = fVar.f15810g;
                eVar = eVar2;
                z10 = z11;
                nVar = nVar2;
                aVar = aVar4;
            } else {
                aVar = aVar3;
                aVar2 = null;
                nVar = null;
                map = null;
                eVar = null;
                z10 = false;
            }
        } else if (i10 == 0) {
            aVar = w.f.a.CANCEL;
            z10 = true;
            aVar2 = null;
            nVar = null;
            map = null;
            eVar = null;
        } else {
            aVar = aVar3;
            aVar2 = null;
            nVar = null;
            map = null;
            eVar = null;
            z10 = false;
        }
        if (facebookException == null && aVar2 == null && !z10) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        m(null, aVar, map, facebookException2, true, eVar);
        k(aVar2, nVar, eVar, facebookException2, z10, uVar);
        return true;
    }

    public final void z(com.facebook.r rVar, final com.facebook.u uVar) {
        if (!(rVar instanceof com.facebook.internal.e)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.e) rVar).b(com.facebook.internal.e.c.Login.g(), new com.facebook.internal.e.a() { // from class: com.facebook.login.d0
            @Override // com.facebook.internal.e.a
            public final boolean a(int i10, Intent intent) {
                return f0.A(this.f15580a, uVar, i10, intent);
            }
        });
    }
}
