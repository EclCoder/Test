package j$.time.format;

import j$.time.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f41724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.n f41725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.l f41726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.y f41727d;

    public q(j$.time.chrono.b bVar, j$.time.temporal.n nVar, j$.time.chrono.l lVar, j$.time.y yVar) {
        this.f41724a = bVar;
        this.f41725b = nVar;
        this.f41726c = lVar;
        this.f41727d = yVar;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f41724a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.h(rVar);
        }
        return this.f41725b.h(rVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f41724a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.l(rVar);
        }
        return this.f41725b.l(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f41724a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.i(rVar);
        }
        return this.f41725b.i(rVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41803b) {
            return this.f41726c;
        }
        if (a0Var == j$.time.temporal.s.f41802a) {
            return this.f41727d;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return this.f41725b.b(a0Var);
        }
        return a0Var.k(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.f41726c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        j$.time.y yVar = this.f41727d;
        if (yVar != null) {
            str2 = " with zone " + yVar;
        }
        return this.f41725b + str + str2;
    }
}
