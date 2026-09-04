package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import dd.q;
import ie.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bd.a lambda$getComponents$0(dd.d dVar) {
        return bd.b.g((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (Context) dVar.a(Context.class), (ae.d) dVar.a(ae.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<dd.c> getComponents() {
        return Arrays.asList(dd.c.e(bd.a.class).b(q.j(com.google.firebase.f.class)).b(q.j(Context.class)).b(q.j(ae.d.class)).e(a.f22082a).d().c(), h.b("fire-analytics", "23.2.0"));
    }
}
