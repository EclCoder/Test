package w9;

import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55992d;

    private c(int i10, int i11, int i12, int i13) {
        this.f55989a = i10;
        this.f55990b = i11;
        this.f55991c = i12;
        this.f55992d = i13;
    }

    public static c b(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.V(8);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        d0Var.V(4);
        int iU4 = d0Var.u();
        d0Var.V(12);
        return new c(iU, iU2, iU3, iU4);
    }

    public boolean a() {
        return (this.f55990b & 16) == 16;
    }

    @Override // w9.a
    public int getType() {
        return 1751742049;
    }
}
