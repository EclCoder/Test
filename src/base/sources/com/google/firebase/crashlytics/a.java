package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.f;
import de.e;
import gd.d;
import gd.g;
import gd.k;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import jd.g0;
import jd.m;
import jd.m0;
import jd.r0;
import kd.i;
import od.b;
import oe.c;
import pd.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final g0 f22157a;

    private a(g0 g0Var) {
        this.f22157a = g0Var;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, e eVar, ce.a aVar, ce.a aVar2, ce.a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + g0.m() + " for " + packageName);
        i iVar = new i(executorService, executorService2);
        j jVar = new j(contextK);
        m0 m0Var = new m0(fVar);
        r0 r0Var = new r0(contextK, packageName, eVar, m0Var);
        d dVar = new d(aVar);
        fd.d dVar2 = new fd.d(aVar2);
        m mVar = new m(m0Var, jVar);
        c.g(mVar);
        g0 g0Var = new g0(fVar, r0Var, dVar, m0Var, dVar2.e(), dVar2.d(), jVar, mVar, new k(aVar3), iVar);
        String strC = fVar.n().c();
        String strM = jd.i.m(contextK);
        List<jd.f> listJ = jd.i.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (jd.f fVar2 : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", fVar2.c(), fVar2.a(), fVar2.b()));
        }
        try {
            jd.a aVarA = jd.a.a(contextK, r0Var, strC, strM, listJ, new gd.f(contextK));
            g.f().i("Installer package name is: " + aVarA.f42244d);
            rd.g gVarL = rd.g.l(contextK, strC, r0Var, new b(), aVarA.f42246f, aVarA.f42247g, jVar, m0Var);
            gVarL.o(iVar).addOnFailureListener(executorService3, new OnFailureListener() { // from class: fd.g
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    gd.g.f().e("Error fetching settings.", exc);
                }
            });
            if (g0Var.s(aVarA, gVarL)) {
                g0Var.k(gVarL);
            }
            return new a(g0Var);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public void d(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f22157a.p(th2, Collections.EMPTY_MAP);
        }
    }

    public void e(String str, String str2) {
        this.f22157a.t(str, str2);
    }
}
