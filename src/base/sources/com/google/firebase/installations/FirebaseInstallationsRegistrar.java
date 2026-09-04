package com.google.firebase.installations;

import be.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import dd.a0;
import dd.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ de.e a(dd.d dVar) {
        return new c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), dVar.f(i.class), (ExecutorService) dVar.e(a0.a(cd.a.class, ExecutorService.class)), ed.i.b((Executor) dVar.e(a0.a(cd.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<dd.c> getComponents() {
        return Arrays.asList(dd.c.e(de.e.class).g(LIBRARY_NAME).b(q.j(com.google.firebase.f.class)).b(q.h(i.class)).b(q.i(a0.a(cd.a.class, ExecutorService.class))).b(q.i(a0.a(cd.b.class, Executor.class))).e(new dd.g() { // from class: de.f
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return FirebaseInstallationsRegistrar.a(dVar);
            }
        }).c(), be.h.a(), ie.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
