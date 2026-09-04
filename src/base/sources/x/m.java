package x;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends j {
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f56554a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f56555b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f56556c1 = 0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f56557d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f56558e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f56559f1 = false;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f56560g1 = 0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f56561h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    protected y.b.a f56562i1 = new y.b.a();

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    y.b.InterfaceC0875b f56563j1 = null;

    public boolean A1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.W0; i10++) {
            if (hashSet.contains(this.V0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int B1() {
        return this.f56561h1;
    }

    public int C1() {
        return this.f56560g1;
    }

    public int D1() {
        return this.Y0;
    }

    public int E1() {
        return this.f56557d1;
    }

    public int F1() {
        return this.f56558e1;
    }

    public int G1() {
        return this.X0;
    }

    public abstract void H1(int i10, int i11, int i12, int i13);

    protected void I1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f56563j1 == null && M() != null) {
            this.f56563j1 = ((f) M()).O1();
        }
        y.b.a aVar = this.f56562i1;
        aVar.f57051a = bVar;
        aVar.f57052b = bVar2;
        aVar.f57053c = i10;
        aVar.f57054d = i11;
        this.f56563j1.b(eVar, aVar);
        eVar.p1(this.f56562i1.f57055e);
        eVar.Q0(this.f56562i1.f57056f);
        eVar.P0(this.f56562i1.f57058h);
        eVar.F0(this.f56562i1.f57057g);
    }

    protected boolean J1() {
        e eVar = this.f56436c0;
        y.b.InterfaceC0875b interfaceC0875bO1 = eVar != null ? ((f) eVar).O1() : null;
        if (interfaceC0875bO1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.W0; i10++) {
            e eVar2 = this.V0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarW = eVar2.w(0);
                e.b bVarW2 = eVar2.w(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarW != bVar || eVar2.f56475w == 1 || bVarW2 != bVar || eVar2.f56477x == 1) {
                    if (bVarW == bVar) {
                        bVarW = e.b.WRAP_CONTENT;
                    }
                    if (bVarW2 == bVar) {
                        bVarW2 = e.b.WRAP_CONTENT;
                    }
                    y.b.a aVar = this.f56562i1;
                    aVar.f57051a = bVarW;
                    aVar.f57052b = bVarW2;
                    aVar.f57053c = eVar2.Y();
                    this.f56562i1.f57054d = eVar2.z();
                    interfaceC0875bO1.b(eVar2, this.f56562i1);
                    eVar2.p1(this.f56562i1.f57055e);
                    eVar2.Q0(this.f56562i1.f57056f);
                    eVar2.F0(this.f56562i1.f57057g);
                }
            }
        }
        return true;
    }

    public boolean K1() {
        return this.f56559f1;
    }

    protected void L1(boolean z10) {
        this.f56559f1 = z10;
    }

    public void M1(int i10, int i11) {
        this.f56560g1 = i10;
        this.f56561h1 = i11;
    }

    public void N1(int i10) {
        this.Z0 = i10;
        this.X0 = i10;
        this.f56554a1 = i10;
        this.Y0 = i10;
        this.f56555b1 = i10;
        this.f56556c1 = i10;
    }

    public void O1(int i10) {
        this.Y0 = i10;
    }

    public void P1(int i10) {
        this.f56556c1 = i10;
    }

    public void Q1(int i10) {
        this.Z0 = i10;
        this.f56557d1 = i10;
    }

    public void R1(int i10) {
        this.f56554a1 = i10;
        this.f56558e1 = i10;
    }

    public void S1(int i10) {
        this.f56555b1 = i10;
        this.f56557d1 = i10;
        this.f56558e1 = i10;
    }

    public void T1(int i10) {
        this.X0 = i10;
    }

    @Override // x.j, x.i
    public void a(f fVar) {
        z1();
    }

    public void y1(boolean z10) {
        int i10 = this.f56555b1;
        if (i10 > 0 || this.f56556c1 > 0) {
            if (z10) {
                this.f56557d1 = this.f56556c1;
                this.f56558e1 = i10;
            } else {
                this.f56557d1 = i10;
                this.f56558e1 = this.f56556c1;
            }
        }
    }

    public void z1() {
        for (int i10 = 0; i10 < this.W0; i10++) {
            e eVar = this.V0[i10];
            if (eVar != null) {
                eVar.Z0(true);
            }
        }
    }
}
