package com.inmobi.media;

import com.inmobi.media.AbstractC2899d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2899d {
    public static void a(final tl.a execute) {
        kotlin.jvm.internal.s.h(execute, "execute");
        fl.k kVar = E0.f24683a;
        tl.a execute2 = new tl.a() { // from class: yh.y7
            @Override // tl.a
            public final Object invoke() {
                return AbstractC2899d.b(execute);
            }
        };
        kotlin.jvm.internal.s.h(execute2, "execute");
        em.o0 o0VarA = E0.f24688f;
        if (o0VarA == null) {
            kotlin.jvm.internal.s.h("AdQualityComponent-aqBeacon", "name");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new I9("AdQualityComponent-aqBeacon", false));
            kotlin.jvm.internal.s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            o0VarA = em.p0.a(em.r1.b(executorServiceNewSingleThreadExecutor).plus(em.u2.b(null, 1, null)));
            E0.f24688f = o0VarA;
        }
        em.k.d(o0VarA, null, null, new C0(execute2, null), 3, null);
    }

    public static final fl.g0 b(tl.a aVar) {
        aVar.invoke();
        return fl.g0.f38750a;
    }
}
