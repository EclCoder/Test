package jm;

import em.v2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl.j f42673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f42674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v2[] f42675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42676d;

    public o0(kl.j jVar, int i10) {
        this.f42673a = jVar;
        this.f42674b = new Object[i10];
        this.f42675c = new v2[i10];
    }

    public final void a(v2 v2Var, Object obj) {
        Object[] objArr = this.f42674b;
        int i10 = this.f42676d;
        objArr[i10] = obj;
        v2[] v2VarArr = this.f42675c;
        this.f42676d = i10 + 1;
        kotlin.jvm.internal.s.f(v2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v2VarArr[i10] = v2Var;
    }

    public final void b(kl.j jVar) {
        int length = this.f42675c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            v2 v2Var = this.f42675c[length];
            kotlin.jvm.internal.s.e(v2Var);
            v2Var.m0(jVar, this.f42674b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
