package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k1 extends i1 {
    k1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public j1 g(Object obj) {
        return ((v) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(j1 j1Var) {
        return j1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(j1 j1Var) {
        return j1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j1 k(j1 j1Var, j1 j1Var2) {
        if (j1.c().equals(j1Var2)) {
            return j1Var;
        }
        return j1.c().equals(j1Var) ? j1.j(j1Var, j1Var2) : j1Var.i(j1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public j1 n() {
        return j1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, j1 j1Var) {
        p(obj, j1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, j1 j1Var) {
        ((v) obj).unknownFields = j1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public j1 r(j1 j1Var) {
        j1Var.h();
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(j1 j1Var, o1 o1Var) {
        j1Var.p(o1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(j1 j1Var, o1 o1Var) {
        j1Var.r(o1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    boolean q(b1 b1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(j1 j1Var, int i10, int i11) {
        j1Var.n(n1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(j1 j1Var, int i10, long j10) {
        j1Var.n(n1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(j1 j1Var, int i10, j1 j1Var2) {
        j1Var.n(n1.c(i10, 3), j1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(j1 j1Var, int i10, g gVar) {
        j1Var.n(n1.c(i10, 2), gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(j1 j1Var, int i10, long j10) {
        j1Var.n(n1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public j1 f(Object obj) {
        j1 j1VarG = g(obj);
        if (j1VarG != j1.c()) {
            return j1VarG;
        }
        j1 j1VarK = j1.k();
        p(obj, j1VarK);
        return j1VarK;
    }
}
