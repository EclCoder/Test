package ea;

import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f37334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37335b = new ob.d0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37339f;

    public c0(b0 b0Var) {
        this.f37334a = b0Var;
    }

    @Override // ea.i0
    public void a(n0 n0Var, u9.m mVar, i0.d dVar) {
        this.f37334a.a(n0Var, mVar, dVar);
        this.f37339f = true;
    }

    @Override // ea.i0
    public void b(ob.d0 d0Var, int i10) {
        int iF;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iF = d0Var.f() + d0Var.H();
        } else {
            iF = -1;
        }
        if (this.f37339f) {
            if (!z10) {
                return;
            }
            this.f37339f = false;
            d0Var.U(iF);
            this.f37337d = 0;
        }
        while (d0Var.a() > 0) {
            int i11 = this.f37337d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = d0Var.H();
                    d0Var.U(d0Var.f() - 1);
                    if (iH == 255) {
                        this.f37339f = true;
                        return;
                    }
                }
                int iMin = Math.min(d0Var.a(), 3 - this.f37337d);
                d0Var.l(this.f37335b.e(), this.f37337d, iMin);
                int i12 = this.f37337d + iMin;
                this.f37337d = i12;
                if (i12 == 3) {
                    this.f37335b.U(0);
                    this.f37335b.T(3);
                    this.f37335b.V(1);
                    int iH2 = this.f37335b.H();
                    int iH3 = this.f37335b.H();
                    this.f37338e = (iH2 & 128) != 0;
                    this.f37336c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f37335b.b();
                    int i13 = this.f37336c;
                    if (iB < i13) {
                        this.f37335b.c(Math.min(4098, Math.max(i13, this.f37335b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d0Var.a(), this.f37336c - this.f37337d);
                d0Var.l(this.f37335b.e(), this.f37337d, iMin2);
                int i14 = this.f37337d + iMin2;
                this.f37337d = i14;
                int i15 = this.f37336c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f37338e) {
                        this.f37335b.T(i15);
                    } else {
                        if (r0.t(this.f37335b.e(), 0, this.f37336c, -1) != 0) {
                            this.f37339f = true;
                            return;
                        }
                        this.f37335b.T(this.f37336c - 4);
                    }
                    this.f37335b.U(0);
                    this.f37334a.b(this.f37335b);
                    this.f37337d = 0;
                }
            }
        }
    }

    @Override // ea.i0
    public void seek() {
        this.f37339f = true;
    }
}
