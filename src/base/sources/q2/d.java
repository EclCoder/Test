package q2;

import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50324f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f50319a = i10;
        this.f50320b = i11;
        this.f50321c = i12;
        this.f50322d = i13;
        this.f50323e = i14;
        this.f50324f = i15;
    }

    public static d c(u uVar) {
        int iT = uVar.t();
        uVar.U(12);
        int iT2 = uVar.t();
        int iT3 = uVar.t();
        int iT4 = uVar.t();
        uVar.U(4);
        int iT5 = uVar.t();
        int iT6 = uVar.t();
        uVar.U(8);
        return new d(iT, iT2, iT3, iT4, iT5, iT6);
    }

    public long a() {
        return c0.N0(this.f50323e, ((long) this.f50321c) * 1000000, this.f50322d);
    }

    public int b() {
        int i10 = this.f50319a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        n.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f50319a));
        return -1;
    }

    @Override // q2.a
    public int getType() {
        return 1752331379;
    }
}
