package w9;

import ob.d0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55998f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f55993a = i10;
        this.f55994b = i11;
        this.f55995c = i12;
        this.f55996d = i13;
        this.f55997e = i14;
        this.f55998f = i15;
    }

    public static d c(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.V(12);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        int iU4 = d0Var.u();
        d0Var.V(4);
        int iU5 = d0Var.u();
        int iU6 = d0Var.u();
        d0Var.V(8);
        return new d(iU, iU2, iU3, iU4, iU5, iU6);
    }

    public long a() {
        return r0.U0(this.f55997e, ((long) this.f55995c) * 1000000, this.f55996d);
    }

    public int b() {
        int i10 = this.f55993a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        u.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f55993a));
        return -1;
    }

    @Override // w9.a
    public int getType() {
        return 1752331379;
    }
}
