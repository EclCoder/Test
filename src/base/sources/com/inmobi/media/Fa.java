package com.inmobi.media;

import com.inmobi.media.Fa;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24767c;

    public Fa(em.o0 coroutineScope) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f24765a = coroutineScope;
        this.f24766b = Fa.class.getSimpleName();
        this.f24767c = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(final String id2, tl.o block) {
        kotlin.jvm.internal.s.h(id2, "id");
        kotlin.jvm.internal.s.h(block, "block");
        final em.z1 z1VarD = em.k.d(this.f24765a, null, null, new Ea(block, null), 3, null);
        Map jobMap = this.f24767c;
        kotlin.jvm.internal.s.g(jobMap, "jobMap");
        Object copyOnWriteArrayList = jobMap.get(id2);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            jobMap.put(id2, copyOnWriteArrayList);
        }
        ((List) copyOnWriteArrayList).add(z1VarD);
        z1VarD.q(new Function1() { // from class: yh.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Fa.a(this.f57813a, id2, z1VarD, (Throwable) obj);
            }
        });
    }

    public static final fl.g0 a(Fa fa2, String str, em.z1 z1Var, Throwable th2) {
        String tag = fa2.f24766b;
        kotlin.jvm.internal.s.g(tag, "tag");
        List list = (List) fa2.f24767c.get(str);
        if (list != null) {
            list.remove(z1Var);
        }
        return fl.g0.f38750a;
    }
}
