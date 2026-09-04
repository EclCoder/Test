package com.inmobi.media;

import com.inmobi.media.AbstractC2924e;

/* JADX INFO: renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2924e {
    public static final boolean a() {
        return true;
    }

    public static void a(final M0 process, final Ng ng2, Long l10, final tl.a shouldProcess) {
        kotlin.jvm.internal.s.h(process, "process");
        kotlin.jvm.internal.s.h(shouldProcess, "shouldProcess");
        fl.k kVar = E0.f24683a;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        tl.a execute = new tl.a() { // from class: yh.j8
            @Override // tl.a
            public final Object invoke() {
                return AbstractC2924e.a(shouldProcess, process, ng2);
            }
        };
        kotlin.jvm.internal.s.h(execute, "execute");
        em.o0 o0VarA = E0.f24687e;
        if (o0VarA == null) {
            o0VarA = em.p0.a(em.c1.a().plus(em.u2.b(null, 1, null)));
            E0.f24687e = o0VarA;
        }
        em.k.d(o0VarA, null, null, new D0(jLongValue, execute, null), 3, null);
    }

    public static final fl.g0 a(tl.a aVar, M0 m10, Ng ng2) {
        try {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                Object objA = m10.a();
                if (ng2 != null) {
                    ng2.a(objA);
                }
            } else if (ng2 != null) {
                ng2.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e10) {
            if (ng2 != null) {
                ng2.onError(e10);
            }
        }
        return fl.g0.f38750a;
    }
}
