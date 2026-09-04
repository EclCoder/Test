package com.google.firebase.datatransport;

import a9.i;
import android.content.Context;
import c9.u;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import dd.a0;
import dd.c;
import dd.d;
import dd.g;
import dd.q;
import ie.h;
import java.util.Arrays;
import java.util.List;
import ud.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f16385g);
    }

    public static /* synthetic */ i b(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f16386h);
    }

    public static /* synthetic */ i c(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f16386h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.e(i.class).g(LIBRARY_NAME).b(q.j(Context.class)).e(new g() { // from class: ud.c
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return TransportRegistrar.c(dVar);
            }
        }).c(), c.c(a0.a(ud.a.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: ud.d
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return TransportRegistrar.b(dVar);
            }
        }).c(), c.c(a0.a(b.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: ud.e
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return TransportRegistrar.a(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
