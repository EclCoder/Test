package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import dd.a0;
import dd.d;
import dd.g;
import dd.q;
import de.e;
import ie.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(a0 a0Var, d dVar) {
        return new c((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.e(a0Var), (f) dVar.a(f.class), (e) dVar.a(e.class), ((com.google.firebase.abt.component.a) dVar.a(com.google.firebase.abt.component.a.class)).b("frc"), dVar.f(bd.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<dd.c> getComponents() {
        final a0 a0VarA = a0.a(cd.b.class, ScheduledExecutorService.class);
        return Arrays.asList(dd.c.f(c.class, le.a.class).g(LIBRARY_NAME).b(q.j(Context.class)).b(q.i(a0VarA)).b(q.j(f.class)).b(q.j(e.class)).b(q.j(com.google.firebase.abt.component.a.class)).b(q.h(bd.a.class)).e(new g() { // from class: je.l
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return RemoteConfigRegistrar.a(a0VarA, dVar);
            }
        }).d().c(), h.b(LIBRARY_NAME, "23.1.0"));
    }
}
