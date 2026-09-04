package com.inmobi.media;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class T4 {
    public static final em.o0 a(em.o0 o0Var) {
        kotlin.jvm.internal.s.h(o0Var, "<this>");
        return em.p0.a(o0Var.i0().plus(em.b2.a((em.z1) o0Var.i0().get(em.z1.f38078x2))));
    }

    public static final em.o0 a(em.o0 o0Var, em.l0 l0Var) {
        kotlin.jvm.internal.s.h(o0Var, "<this>");
        em.z1 z1Var = (em.z1) o0Var.i0().get(em.z1.f38078x2);
        em.b0 b0VarA = z1Var != null ? em.u2.a(z1Var) : em.u2.b(null, 1, null);
        em.o0 o0VarA = em.p0.a(b0VarA.plus(em.c1.c().X0()).plus(l0Var));
        return o0VarA == null ? em.p0.a(b0VarA.plus(em.c1.c().X0())) : o0VarA;
    }

    public static final em.z1 a(em.o0 o0Var, tl.o block) {
        kotlin.jvm.internal.s.h(o0Var, "<this>");
        kotlin.jvm.internal.s.h(block, "block");
        return em.k.d(o0Var, em.c1.c(), null, block, 2, null);
    }

    public static final void a(hm.v vVar, em.o0 scope, AbstractC3066jc abstractC3066jc) {
        kotlin.jvm.internal.s.h(vVar, "<this>");
        kotlin.jvm.internal.s.h(scope, "scope");
        em.k.d(scope, null, null, new S4(vVar, abstractC3066jc, null), 3, null);
    }

    public static final void a(em.q qVar, Object obj) {
        kotlin.jvm.internal.s.h(qVar, "<this>");
        if (qVar.L()) {
            try {
                qVar.resumeWith(fl.r.b(obj));
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void a(List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            em.z1.c0((em.z1) it.next(), null, 1, null);
        }
        list.clear();
    }
}
