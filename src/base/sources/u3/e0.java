package u3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f53784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53785b = new w1.u(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53789f;

    public e0(d0 d0Var) {
        this.f53784a = d0Var;
    }

    @Override // u3.k0
    public void a(w1.z zVar, o2.r rVar, k0.d dVar) {
        this.f53784a.a(zVar, rVar, dVar);
        this.f53789f = true;
    }

    @Override // u3.k0
    public void b(w1.u uVar, int i10) {
        int iF;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iF = uVar.f() + uVar.G();
        } else {
            iF = -1;
        }
        if (this.f53789f) {
            if (!z10) {
                return;
            }
            this.f53789f = false;
            uVar.T(iF);
            this.f53787d = 0;
        }
        while (uVar.a() > 0) {
            int i11 = this.f53787d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iG = uVar.G();
                    uVar.T(uVar.f() - 1);
                    if (iG == 255) {
                        this.f53789f = true;
                        return;
                    }
                }
                int iMin = Math.min(uVar.a(), 3 - this.f53787d);
                uVar.l(this.f53785b.e(), this.f53787d, iMin);
                int i12 = this.f53787d + iMin;
                this.f53787d = i12;
                if (i12 == 3) {
                    this.f53785b.T(0);
                    this.f53785b.S(3);
                    this.f53785b.U(1);
                    int iG2 = this.f53785b.G();
                    int iG3 = this.f53785b.G();
                    this.f53788e = (iG2 & 128) != 0;
                    this.f53786c = (((iG2 & 15) << 8) | iG3) + 3;
                    int iB = this.f53785b.b();
                    int i13 = this.f53786c;
                    if (iB < i13) {
                        this.f53785b.c(Math.min(4098, Math.max(i13, this.f53785b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(uVar.a(), this.f53786c - this.f53787d);
                uVar.l(this.f53785b.e(), this.f53787d, iMin2);
                int i14 = this.f53787d + iMin2;
                this.f53787d = i14;
                int i15 = this.f53786c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f53788e) {
                        this.f53785b.S(i15);
                    } else {
                        if (w1.c0.w(this.f53785b.e(), 0, this.f53786c, -1) != 0) {
                            this.f53789f = true;
                            return;
                        }
                        this.f53785b.S(this.f53786c - 4);
                    }
                    this.f53785b.T(0);
                    this.f53784a.b(this.f53785b);
                    this.f53787d = 0;
                }
            }
        }
    }

    @Override // u3.k0
    public void seek() {
        this.f53789f = true;
    }
}
