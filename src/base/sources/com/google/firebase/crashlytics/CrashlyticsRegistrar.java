package com.google.firebase.crashlytics;

import cd.b;
import cd.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import dd.a0;
import dd.q;
import de.e;
import gd.g;
import ie.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kd.i;
import oe.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f22154a = a0.a(cd.a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f22155b = a0.a(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f22156c = a0.a(c.class, ExecutorService.class);

    static {
        oe.c.b(d.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(dd.d dVar) {
        i.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarC = a.c((f) dVar.a(f.class), (e) dVar.a(e.class), dVar.i(gd.a.class), dVar.i(bd.a.class), dVar.i(le.a.class), (ExecutorService) dVar.e(this.f22154a), (ExecutorService) dVar.e(this.f22155b), (ExecutorService) dVar.e(this.f22156c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarC;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(dd.c.e(a.class).g("fire-cls").b(q.j(f.class)).b(q.j(e.class)).b(q.i(this.f22154a)).b(q.i(this.f22155b)).b(q.i(this.f22156c)).b(q.a(gd.a.class)).b(q.a(bd.a.class)).b(q.a(le.a.class)).e(new dd.g() { // from class: fd.f
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return this.f38465a.b(dVar);
            }
        }).d().c(), h.b("fire-cls", "20.1.0"));
    }
}
