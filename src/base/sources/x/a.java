package x;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends j {
    private int X0 = 0;
    private boolean Y0 = true;
    private int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    boolean f56389a1 = false;

    public int A1() {
        return this.X0;
    }

    public int B1() {
        return this.Z0;
    }

    public int C1() {
        int i10 = this.X0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void D1() {
        for (int i10 = 0; i10 < this.W0; i10++) {
            e eVar = this.V0[i10];
            if (this.Y0 || eVar.h()) {
                int i11 = this.X0;
                if (i11 == 0 || i11 == 1) {
                    eVar.X0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.X0(1, true);
                }
            }
        }
    }

    public void E1(boolean z10) {
        this.Y0 = z10;
    }

    public void F1(int i10) {
        this.X0 = i10;
    }

    public void G1(int i10) {
        this.Z0 = i10;
    }

    @Override // x.e
    public void g(u.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.Y;
        dVarArr2[0] = this.Q;
        dVarArr2[2] = this.R;
        dVarArr2[1] = this.S;
        dVarArr2[3] = this.T;
        int i13 = 0;
        while (true) {
            dVarArr = this.Y;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f56420i = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.X0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        if (!this.f56389a1) {
            y1();
        }
        if (this.f56389a1) {
            this.f56389a1 = false;
            int i15 = this.X0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.Q.f56420i, this.f56446h0);
                dVar.f(this.S.f56420i, this.f56446h0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.R.f56420i, this.f56448i0);
                    dVar.f(this.T.f56420i, this.f56448i0);
                    return;
                }
                return;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.W0) {
                z11 = false;
                break;
            }
            e eVar = this.V0[i16];
            if ((this.Y0 || eVar.h()) && ((((i11 = this.X0) == 0 || i11 == 1) && eVar.C() == e.b.MATCH_CONSTRAINT && eVar.Q.f56417f != null && eVar.S.f56417f != null) || (((i12 = this.X0) == 2 || i12 == 3) && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.R.f56417f != null && eVar.T.f56417f != null))) {
                z11 = true;
                break;
            }
            i16++;
        }
        boolean z12 = this.Q.l() || this.S.l();
        boolean z13 = this.R.l() || this.T.l();
        int i17 = !(!z11 && (((i10 = this.X0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.W0; i18++) {
            e eVar2 = this.V0[i18];
            if (this.Y0 || eVar2.h()) {
                u.i iVarQ = dVar.q(eVar2.Y[this.X0]);
                d[] dVarArr3 = eVar2.Y;
                int i19 = this.X0;
                d dVar4 = dVarArr3[i19];
                dVar4.f56420i = iVarQ;
                d dVar5 = dVar4.f56417f;
                int i20 = (dVar5 == null || dVar5.f56415d != this) ? 0 : dVar4.f56418g;
                if (i19 == 0 || i19 == 2) {
                    dVar.i(dVar3.f56420i, iVarQ, this.Z0 - i20, z11);
                } else {
                    dVar.g(dVar3.f56420i, iVarQ, this.Z0 + i20, z11);
                }
                dVar.e(dVar3.f56420i, iVarQ, this.Z0 + i20, i17);
            }
        }
        int i21 = this.X0;
        if (i21 == 0) {
            dVar.e(this.S.f56420i, this.Q.f56420i, 0, 8);
            dVar.e(this.Q.f56420i, this.f56436c0.S.f56420i, 0, 4);
            dVar.e(this.Q.f56420i, this.f56436c0.Q.f56420i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.Q.f56420i, this.S.f56420i, 0, 8);
            dVar.e(this.Q.f56420i, this.f56436c0.Q.f56420i, 0, 4);
            dVar.e(this.Q.f56420i, this.f56436c0.S.f56420i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.T.f56420i, this.R.f56420i, 0, 8);
            dVar.e(this.R.f56420i, this.f56436c0.T.f56420i, 0, 4);
            dVar.e(this.R.f56420i, this.f56436c0.R.f56420i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.R.f56420i, this.T.f56420i, 0, 8);
            dVar.e(this.R.f56420i, this.f56436c0.R.f56420i, 0, 4);
            dVar.e(this.R.f56420i, this.f56436c0.T.f56420i, 0, 0);
        }
    }

    @Override // x.e
    public boolean h() {
        return true;
    }

    @Override // x.j, x.e
    public void n(e eVar, HashMap map) {
        super.n(eVar, map);
        a aVar = (a) eVar;
        this.X0 = aVar.X0;
        this.Y0 = aVar.Y0;
        this.Z0 = aVar.Z0;
    }

    @Override // x.e
    public boolean p0() {
        return this.f56389a1;
    }

    @Override // x.e
    public boolean q0() {
        return this.f56389a1;
    }

    @Override // x.e
    public String toString() {
        String str = "[Barrier] " + v() + " {";
        for (int i10 = 0; i10 < this.W0; i10++) {
            e eVar = this.V0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.v();
        }
        return str + "}";
    }

    public boolean y1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.W0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.V0[i13];
            if ((this.Y0 || eVar.h()) && ((((i11 = this.X0) == 0 || i11 == 1) && !eVar.p0()) || (((i12 = this.X0) == 2 || i12 == 3) && !eVar.q0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.W0; i14++) {
            e eVar2 = this.V0[i14];
            if (this.Y0 || eVar2.h()) {
                if (!z11) {
                    int i15 = this.X0;
                    if (i15 == 0) {
                        iMax = eVar2.q(d.a.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = eVar2.q(d.a.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = eVar2.q(d.a.TOP).e();
                    } else if (i15 == 3) {
                        iMax = eVar2.q(d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.X0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.q(d.a.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.q(d.a.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.q(d.a.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.q(d.a.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.Z0;
        int i18 = this.X0;
        if (i18 == 0 || i18 == 1) {
            K0(i17, i17);
        } else {
            N0(i17, i17);
        }
        this.f56389a1 = true;
        return true;
    }

    public boolean z1() {
        return this.Y0;
    }
}
