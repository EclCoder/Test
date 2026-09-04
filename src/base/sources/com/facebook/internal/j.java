package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f15247a = new j();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Bundle a();

        Bundle getParameters();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends g.a {
        b() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Intent input) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(input, "input");
            return input;
        }

        @Override // g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Pair c(int i10, Intent intent) {
            Pair pairCreate = Pair.create(Integer.valueOf(i10), intent);
            kotlin.jvm.internal.s.g(pairCreate, "create(resultCode, intent)");
            return pairCreate;
        }
    }

    private j() {
    }

    public static final boolean b(h feature) {
        kotlin.jvm.internal.s.h(feature, "feature");
        return c(feature).d() != -1;
    }

    public static final u0.f c(h feature) {
        kotlin.jvm.internal.s.h(feature, "feature");
        String strN = com.facebook.h0.n();
        String strG = feature.g();
        return u0.w(strG, f15247a.d(strN, strG, feature));
    }

    private final int[] d(String str, String str2, h hVar) {
        int[] iArrC;
        w.b bVarA = w.H.a(str, str2, hVar.name());
        return (bVarA == null || (iArrC = bVarA.c()) == null) ? new int[]{hVar.d()} : iArrC;
    }

    public static final void e(com.facebook.internal.a appCall, Activity activity) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        kotlin.jvm.internal.s.h(activity, "activity");
        activity.startActivityForResult(appCall.e(), appCall.d());
        appCall.f();
    }

    public static final void f(com.facebook.internal.a appCall, f0 fragmentWrapper) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        kotlin.jvm.internal.s.h(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.d(appCall.e(), appCall.d());
        appCall.f();
    }

    public static final void g(com.facebook.internal.a appCall, f.f registry, com.facebook.r rVar) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        kotlin.jvm.internal.s.h(registry, "registry");
        Intent intentE = appCall.e();
        if (intentE == null) {
            return;
        }
        m(registry, rVar, intentE, appCall.d());
        appCall.f();
    }

    public static final void h(com.facebook.internal.a appCall) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        k(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void i(com.facebook.internal.a appCall, FacebookException facebookException) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        if (facebookException == null) {
            return;
        }
        f1.f(com.facebook.h0.m());
        Intent intent = new Intent();
        intent.setClass(com.facebook.h0.m(), FacebookActivity.class);
        intent.setAction("PassThrough");
        u0.F(intent, appCall.c().toString(), null, u0.z(), u0.j(facebookException));
        appCall.g(intent);
    }

    public static final void j(com.facebook.internal.a appCall, a parameterProvider, h feature) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        kotlin.jvm.internal.s.h(parameterProvider, "parameterProvider");
        kotlin.jvm.internal.s.h(feature, "feature");
        Context contextM = com.facebook.h0.m();
        String strG = feature.g();
        u0.f fVarC = c(feature);
        int iD = fVarC.d();
        if (iD == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = u0.E(iD) ? parameterProvider.getParameters() : parameterProvider.a();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent intentN = u0.n(contextM, appCall.c().toString(), strG, fVarC, parameters);
        if (intentN == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.g(intentN);
    }

    public static final void k(com.facebook.internal.a appCall, FacebookException facebookException) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        i(appCall, facebookException);
    }

    public static final void l(com.facebook.internal.a appCall, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(appCall, "appCall");
        f1.f(com.facebook.h0.m());
        f1.h(com.facebook.h0.m());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        u0.F(intent, appCall.c().toString(), str, u0.z(), bundle2);
        intent.setClass(com.facebook.h0.m(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.g(intent);
    }

    public static final void m(f.f registry, final com.facebook.r rVar, Intent intent, final int i10) {
        kotlin.jvm.internal.s.h(registry, "registry");
        kotlin.jvm.internal.s.h(intent, "intent");
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        f.c cVarO = registry.o("facebook-dialog-request-" + i10, new b(), new f.b() { // from class: com.facebook.internal.i
            @Override // f.b
            public final void a(Object obj) {
                j.n(rVar, i10, k0Var, (Pair) obj);
            }
        });
        k0Var.f43597a = cVarO;
        if (cVarO != null) {
            cVarO.b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(com.facebook.r rVar, int i10, kotlin.jvm.internal.k0 launcher, Pair pair) {
        kotlin.jvm.internal.s.h(launcher, "$launcher");
        if (rVar == null) {
            rVar = new e();
        }
        Object obj = pair.first;
        kotlin.jvm.internal.s.g(obj, "result.first");
        rVar.onActivityResult(i10, ((Number) obj).intValue(), (Intent) pair.second);
        f.c cVar = (f.c) launcher.f43597a;
        if (cVar != null) {
            synchronized (cVar) {
                cVar.d();
                launcher.f43597a = null;
                fl.g0 g0Var = fl.g0.f38750a;
            }
        }
    }
}
