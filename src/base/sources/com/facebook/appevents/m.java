package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.inmobi.unification.sdk.InitializationStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ScheduledFuture f14953f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14948a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14949b = m.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14950c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile e f14951d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ScheduledExecutorService f14952e = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Runnable f14954g = new Runnable() { // from class: com.facebook.appevents.g
        @Override // java.lang.Runnable
        public final void run() {
            m.o();
        }
    };

    private m() {
    }

    public static final void g(final a accessTokenAppId, final d appEvent) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.s.h(appEvent, "appEvent");
            f14952e.execute(new Runnable() { // from class: com.facebook.appevents.h
                @Override // java.lang.Runnable
                public final void run() {
                    m.h(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a accessTokenAppId, d appEvent) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.s.h(appEvent, "$appEvent");
            f14951d.a(accessTokenAppId, appEvent);
            if (o.f14964b.c() != o.b.EXPLICIT_ONLY && f14951d.d() > f14950c) {
                n(l0.EVENT_THRESHOLD);
            } else if (f14953f == null) {
                f14953f = f14952e.schedule(f14954g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final com.facebook.j0 i(final a accessTokenAppId, final t0 appEvents, boolean z10, final n0 flushState) {
        if (x7.a.c(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.s.h(appEvents, "appEvents");
            kotlin.jvm.internal.s.h(flushState, "flushState");
            String strG = accessTokenAppId.g();
            com.facebook.internal.w wVarV = com.facebook.internal.a0.v(strG, false);
            com.facebook.j0.c cVar = com.facebook.j0.f15486n;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strG}, 1));
            kotlin.jvm.internal.s.g(str, "format(format, *args)");
            final com.facebook.j0 j0VarA = cVar.A(null, str, null, null);
            j0VarA.D(true);
            Bundle bundleU = j0VarA.u();
            if (bundleU == null) {
                bundleU = new Bundle();
            }
            String strD = accessTokenAppId.d();
            if (strD == null) {
                com.facebook.a aVarE = com.facebook.a.f14853l.e();
                strD = aVarE != null ? aVarE.p() : null;
            }
            if (strD != null) {
                bundleU.putString("access_token", strD);
            }
            String strE = o0.f14970b.e();
            if (strE != null) {
                bundleU.putString("device_token", strE);
            }
            String strL = s.f14988c.l();
            if (strL != null) {
                bundleU.putString("install_referrer", strL);
            }
            j0VarA.G(bundleU);
            int iE = appEvents.e(j0VarA, com.facebook.h0.m(), wVarV != null ? wVarV.B() : false, z10);
            if (iE == 0) {
                return null;
            }
            flushState.c(flushState.a() + iE);
            j0VarA.C(new com.facebook.j0.b() { // from class: com.facebook.appevents.j
                @Override // com.facebook.j0.b
                public final void a(com.facebook.o0 o0Var2) {
                    m.j(accessTokenAppId, j0VarA, appEvents, flushState, o0Var2);
                }
            });
            return j0VarA;
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a accessTokenAppId, com.facebook.j0 postRequest, t0 appEvents, n0 flushState, com.facebook.o0 response) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.s.h(postRequest, "$postRequest");
            kotlin.jvm.internal.s.h(appEvents, "$appEvents");
            kotlin.jvm.internal.s.h(flushState, "$flushState");
            kotlin.jvm.internal.s.h(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final List k(e appEventCollection, n0 flushResults) {
        if (x7.a.c(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(appEventCollection, "appEventCollection");
            kotlin.jvm.internal.s.h(flushResults, "flushResults");
            boolean zC = com.facebook.h0.C(com.facebook.h0.m());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                t0 t0VarC = appEventCollection.c(aVar);
                if (t0VarC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                com.facebook.j0 j0VarI = i(aVar, t0VarC, zC, flushResults);
                if (j0VarI != null) {
                    arrayList.add(j0VarI);
                    if (d7.d.f36281a.f()) {
                        d7.g.l(j0VarI);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
            return null;
        }
    }

    public static final void l(final l0 reason) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(reason, "reason");
            f14952e.execute(new Runnable() { // from class: com.facebook.appevents.i
                @Override // java.lang.Runnable
                public final void run() {
                    m.m(reason);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l0 reason) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(reason, "$reason");
            n(reason);
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final void n(l0 reason) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(reason, "reason");
            f14951d.b(f.a());
            try {
                n0 n0VarU = u(reason, f14951d);
                if (n0VarU != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", n0VarU.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", n0VarU.b());
                    s1.a.b(com.facebook.h0.m()).d(intent);
                }
            } catch (Exception e10) {
                Log.w(f14949b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            f14953f = null;
            if (o.f14964b.c() != o.b.EXPLICIT_ONLY) {
                n(l0.TIMER);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final Set p() {
        if (x7.a.c(m.class)) {
            return null;
        }
        try {
            return f14951d.f();
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
            return null;
        }
    }

    public static final void q(final a accessTokenAppId, com.facebook.j0 request, com.facebook.o0 response, final t0 appEvents, n0 flushState) {
        String string;
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.s.h(request, "request");
            kotlin.jvm.internal.s.h(response, "response");
            kotlin.jvm.internal.s.h(appEvents, "appEvents");
            kotlin.jvm.internal.s.h(flushState, "flushState");
            com.facebook.x xVarB = response.b();
            String str = InitializationStatus.SUCCESS;
            m0 m0Var = m0.SUCCESS;
            if (xVarB != null) {
                if (xVarB.b() == -1) {
                    str = "Failed: No Connectivity";
                    m0Var = m0.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), xVarB.toString()}, 2));
                    kotlin.jvm.internal.s.g(str, "format(format, *args)");
                    m0Var = m0.SERVER_ERROR;
                }
            }
            if (com.facebook.h0.M(com.facebook.r0.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.w()).toString(2);
                    kotlin.jvm.internal.s.g(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
                com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
                String TAG = f14949b;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                aVar.c(r0Var, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str, string);
            }
            appEvents.b(xVarB != null);
            m0 m0Var2 = m0.NO_CONNECTIVITY;
            if (m0Var == m0Var2) {
                com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.appevents.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.r(accessTokenAppId, appEvents);
                    }
                });
            }
            if (m0Var == m0.SUCCESS || flushState.b() == m0Var2) {
                return;
            }
            flushState.d(m0Var);
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a accessTokenAppId, t0 appEvents) {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.s.h(appEvents, "$appEvents");
            n.a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final void s() {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            f14952e.execute(new Runnable() { // from class: com.facebook.appevents.k
                @Override // java.lang.Runnable
                public final void run() {
                    m.t();
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (x7.a.c(m.class)) {
            return;
        }
        try {
            n.b(f14951d);
            f14951d = new e();
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
        }
    }

    public static final n0 u(l0 reason, e appEventCollection) {
        if (x7.a.c(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(reason, "reason");
            kotlin.jvm.internal.s.h(appEventCollection, "appEventCollection");
            n0 n0Var = new n0();
            List listK = k(appEventCollection, n0Var);
            if (listK.isEmpty()) {
                return null;
            }
            com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
            com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
            String TAG = f14949b;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            aVar.c(r0Var, TAG, "Flushing %d events due to %s.", Integer.valueOf(n0Var.a()), reason.toString());
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                ((com.facebook.j0) it.next()).k();
            }
            return n0Var;
        } catch (Throwable th2) {
            x7.a.b(th2, m.class);
            return null;
        }
    }
}
