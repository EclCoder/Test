package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import dd.c;
import dd.d;
import dd.g;
import dd.q;
import ie.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.f(bd.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.e(a.class).g(LIBRARY_NAME).b(q.j(Context.class)).b(q.h(bd.a.class)).e(new g() { // from class: zc.a
            @Override // dd.g
            public final Object a(d dVar) {
                return AbtRegistrar.a(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
