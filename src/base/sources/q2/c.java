package q2;

import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50318d;

    private c(int i10, int i11, int i12, int i13) {
        this.f50315a = i10;
        this.f50316b = i11;
        this.f50317c = i12;
        this.f50318d = i13;
    }

    public static c b(u uVar) {
        int iT = uVar.t();
        uVar.U(8);
        int iT2 = uVar.t();
        int iT3 = uVar.t();
        uVar.U(4);
        int iT4 = uVar.t();
        uVar.U(12);
        return new c(iT, iT2, iT3, iT4);
    }

    public boolean a() {
        return (this.f50316b & 16) == 16;
    }

    @Override // q2.a
    public int getType() {
        return 1751742049;
    }
}
