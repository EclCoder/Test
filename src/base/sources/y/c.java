package y;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList f57061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f57062l;

    public c(x.e eVar, int i10) {
        super(eVar);
        this.f57061k = new ArrayList();
        this.f57129f = i10;
        q();
    }

    private void q() {
        x.e eVar;
        x.e eVar2 = this.f57125b;
        x.e eVarN = eVar2.N(this.f57129f);
        while (true) {
            x.e eVar3 = eVarN;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarN = eVar2.N(this.f57129f);
            }
        }
        this.f57125b = eVar;
        this.f57061k.add(eVar.P(this.f57129f));
        x.e eVarL = eVar.L(this.f57129f);
        while (eVarL != null) {
            this.f57061k.add(eVarL.P(this.f57129f));
            eVarL = eVarL.L(this.f57129f);
        }
        ArrayList arrayList = this.f57061k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p pVar = (p) obj;
            int i11 = this.f57129f;
            if (i11 == 0) {
                pVar.f57125b.f56435c = this;
            } else if (i11 == 1) {
                pVar.f57125b.f56437d = this;
            }
        }
        if (this.f57129f == 0 && ((x.f) this.f57125b.M()).V1() && this.f57061k.size() > 1) {
            ArrayList arrayList2 = this.f57061k;
            this.f57125b = ((p) arrayList2.get(arrayList2.size() - 1)).f57125b;
        }
        this.f57062l = this.f57129f == 0 ? this.f57125b.B() : this.f57125b.U();
    }

    private x.e r() {
        for (int i10 = 0; i10 < this.f57061k.size(); i10++) {
            p pVar = (p) this.f57061k.get(i10);
            if (pVar.f57125b.X() != 8) {
                return pVar.f57125b;
            }
        }
        return null;
    }

    private x.e s() {
        for (int size = this.f57061k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f57061k.get(size);
            if (pVar.f57125b.X() != 8) {
                return pVar.f57125b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // y.p, y.d
    public void a(d dVar) {
        int i10;
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        if (this.f57131h.f57081j && this.f57132i.f57081j) {
            x.e eVarM = this.f57125b.M();
            boolean zV1 = eVarM instanceof x.f ? ((x.f) eVarM).V1() : false;
            int i20 = this.f57132i.f57078g - this.f57131h.f57078g;
            int size = this.f57061k.size();
            int i21 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i21 >= size) {
                    i21 = -1;
                    break;
                } else if (((p) this.f57061k.get(i21)).f57125b.X() != 8) {
                    break;
                } else {
                    i21++;
                }
            }
            int i22 = size - 1;
            for (int i23 = i22; i23 >= 0; i23--) {
                if (((p) this.f57061k.get(i23)).f57125b.X() != 8) {
                    i10 = i23;
                    break;
                }
            }
            int i24 = 0;
            while (true) {
                if (i24 >= 2) {
                    z10 = zV1;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    break;
                }
                int i25 = 0;
                i13 = 0;
                i14 = 0;
                int i26 = 0;
                f11 = 0.0f;
                while (i25 < size) {
                    p pVar = (p) this.f57061k.get(i25);
                    if (pVar.f57125b.X() == i11) {
                        z11 = zV1;
                    } else {
                        i26++;
                        if (i25 > 0 && i25 >= i21) {
                            i13 += pVar.f57131h.f57077f;
                        }
                        g gVar = pVar.f57128e;
                        int i27 = gVar.f57078g;
                        boolean z12 = pVar.f57127d != x.e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i28 = this.f57129f;
                            if (i28 == 0 && !pVar.f57125b.f56439e.f57128e.f57081j) {
                                return;
                            }
                            if (i28 == 1 && !pVar.f57125b.f56441f.f57128e.f57081j) {
                                return;
                            } else {
                                z11 = zV1;
                            }
                        } else {
                            z11 = zV1;
                            if (pVar.f57124a == 1 && i24 == 0) {
                                i27 = gVar.f57093m;
                                i14++;
                            } else if (gVar.f57081j) {
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i27;
                        } else {
                            i14++;
                            float f13 = pVar.f57125b.N0[this.f57129f];
                            if (f13 >= 0.0f) {
                                f11 += f13;
                            }
                        }
                        if (i25 < i22 && i25 < i10) {
                            i13 += -pVar.f57132i.f57077f;
                        }
                    }
                    i25++;
                    zV1 = z11;
                    i11 = 8;
                }
                z10 = zV1;
                f10 = 0.0f;
                if (i13 < i20 || i14 == 0) {
                    i12 = i26;
                    break;
                } else {
                    i24++;
                    zV1 = z10;
                    i11 = 8;
                }
            }
            int i29 = this.f57131h.f57078g;
            if (z10) {
                i29 = this.f57132i.f57078g;
            }
            float f14 = 0.5f;
            if (i13 > i20) {
                i29 = z10 ? i29 + ((int) (((i13 - i20) / 2.0f) + 0.5f)) : i29 - ((int) (((i13 - i20) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f15 = i20 - i13;
                int i30 = (int) ((f15 / i14) + 0.5f);
                int i31 = 0;
                int i32 = 0;
                while (i31 < size) {
                    p pVar2 = (p) this.f57061k.get(i31);
                    float f16 = f14;
                    int i33 = i29;
                    if (pVar2.f57125b.X() != 8 && pVar2.f57127d == x.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f57128e;
                        if (gVar2.f57081j) {
                            i30 = i30;
                            i32 = i32;
                        } else {
                            int i34 = f11 > f10 ? (int) (((pVar2.f57125b.N0[this.f57129f] * f15) / f11) + f16) : i30;
                            if (this.f57129f == 0) {
                                x.e eVar = pVar2.f57125b;
                                i18 = eVar.A;
                                i19 = eVar.f56481z;
                            } else {
                                x.e eVar2 = pVar2.f57125b;
                                i18 = eVar2.D;
                                i19 = eVar2.C;
                            }
                            int i35 = i32;
                            int iMax = Math.max(i19, pVar2.f57124a == 1 ? Math.min(i34, gVar2.f57093m) : i34);
                            if (i18 > 0) {
                                iMax = Math.min(i18, iMax);
                            }
                            if (iMax != i34) {
                                i32 = i35 + 1;
                                i34 = iMax;
                            } else {
                                i32 = i35;
                            }
                            pVar2.f57128e.d(i34);
                        }
                    } else {
                        i30 = i30;
                        i32 = i32;
                    }
                    i31++;
                    f14 = f16;
                    i29 = i33;
                    f15 = f15;
                    i30 = i30;
                }
                i15 = i29;
                f12 = f14;
                int i36 = i32;
                if (i36 > 0) {
                    i14 -= i36;
                    i13 = 0;
                    for (int i37 = 0; i37 < size; i37++) {
                        p pVar3 = (p) this.f57061k.get(i37);
                        if (pVar3.f57125b.X() != 8) {
                            if (i37 > 0 && i37 >= i21) {
                                i13 += pVar3.f57131h.f57077f;
                            }
                            i13 += pVar3.f57128e.f57078g;
                            if (i37 < i22 && i37 < i10) {
                                i13 += -pVar3.f57132i.f57077f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f57062l == 2 && i36 == 0) {
                    i16 = 0;
                    this.f57062l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                i15 = i29;
                f12 = 0.5f;
                i16 = 0;
                i17 = 2;
            }
            if (i13 > i20) {
                this.f57062l = i17;
            }
            if (i12 > 0 && i14 == 0 && i21 == i10) {
                this.f57062l = i17;
            }
            int i38 = this.f57062l;
            if (i38 == 1) {
                int i39 = i12 > 1 ? (i20 - i13) / (i12 - 1) : i12 == 1 ? (i20 - i13) / 2 : i16;
                if (i14 > 0) {
                    i39 = i16;
                }
                int i40 = i15;
                while (i16 < size) {
                    p pVar4 = (p) this.f57061k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar4.f57125b.X() == 8) {
                        pVar4.f57131h.d(i40);
                        pVar4.f57132i.d(i40);
                    } else {
                        if (i16 > 0) {
                            i40 = z10 ? i40 - i39 : i40 + i39;
                        }
                        if (i16 > 0 && i16 >= i21) {
                            i40 = z10 ? i40 - pVar4.f57131h.f57077f : i40 + pVar4.f57131h.f57077f;
                        }
                        if (z10) {
                            pVar4.f57132i.d(i40);
                        } else {
                            pVar4.f57131h.d(i40);
                        }
                        g gVar3 = pVar4.f57128e;
                        int i41 = gVar3.f57078g;
                        if (pVar4.f57127d == x.e.b.MATCH_CONSTRAINT && pVar4.f57124a == 1) {
                            i41 = gVar3.f57093m;
                        }
                        i40 = z10 ? i40 - i41 : i40 + i41;
                        if (z10) {
                            pVar4.f57131h.d(i40);
                        } else {
                            pVar4.f57132i.d(i40);
                        }
                        pVar4.f57130g = true;
                        if (i16 < i22 && i16 < i10) {
                            i40 = z10 ? i40 - (-pVar4.f57132i.f57077f) : i40 + (-pVar4.f57132i.f57077f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 0) {
                int i42 = (i20 - i13) / (i12 + 1);
                if (i14 > 0) {
                    i42 = i16;
                }
                int i43 = i15;
                while (i16 < size) {
                    p pVar5 = (p) this.f57061k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar5.f57125b.X() == 8) {
                        pVar5.f57131h.d(i43);
                        pVar5.f57132i.d(i43);
                    } else {
                        int i44 = z10 ? i43 - i42 : i43 + i42;
                        if (i16 > 0 && i16 >= i21) {
                            i44 = z10 ? i44 - pVar5.f57131h.f57077f : i44 + pVar5.f57131h.f57077f;
                        }
                        if (z10) {
                            pVar5.f57132i.d(i44);
                        } else {
                            pVar5.f57131h.d(i44);
                        }
                        g gVar4 = pVar5.f57128e;
                        int iMin = gVar4.f57078g;
                        if (pVar5.f57127d == x.e.b.MATCH_CONSTRAINT && pVar5.f57124a == 1) {
                            iMin = Math.min(iMin, gVar4.f57093m);
                        }
                        i43 = z10 ? i44 - iMin : i44 + iMin;
                        if (z10) {
                            pVar5.f57131h.d(i43);
                        } else {
                            pVar5.f57132i.d(i43);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i43 = z10 ? i43 - (-pVar5.f57132i.f57077f) : i43 + (-pVar5.f57132i.f57077f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 2) {
                float fA = this.f57129f == 0 ? this.f57125b.A() : this.f57125b.T();
                if (z10) {
                    fA = 1.0f - fA;
                }
                int i45 = (int) (((i20 - i13) * fA) + f12);
                if (i45 < 0 || i14 > 0) {
                    i45 = i16;
                }
                int i46 = z10 ? i15 - i45 : i15 + i45;
                while (i16 < size) {
                    p pVar6 = (p) this.f57061k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar6.f57125b.X() == 8) {
                        pVar6.f57131h.d(i46);
                        pVar6.f57132i.d(i46);
                    } else {
                        if (i16 > 0 && i16 >= i21) {
                            i46 = z10 ? i46 - pVar6.f57131h.f57077f : i46 + pVar6.f57131h.f57077f;
                        }
                        if (z10) {
                            pVar6.f57132i.d(i46);
                        } else {
                            pVar6.f57131h.d(i46);
                        }
                        g gVar5 = pVar6.f57128e;
                        int i47 = gVar5.f57078g;
                        if (pVar6.f57127d == x.e.b.MATCH_CONSTRAINT && pVar6.f57124a == 1) {
                            i47 = gVar5.f57093m;
                        }
                        i46 = z10 ? i46 - i47 : i46 + i47;
                        if (z10) {
                            pVar6.f57131h.d(i46);
                        } else {
                            pVar6.f57132i.d(i46);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i46 = z10 ? i46 - (-pVar6.f57132i.f57077f) : i46 + (-pVar6.f57132i.f57077f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // y.p
    void d() {
        ArrayList arrayList = this.f57061k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p) obj).d();
        }
        int size2 = this.f57061k.size();
        if (size2 < 1) {
            return;
        }
        x.e eVar = ((p) this.f57061k.get(0)).f57125b;
        x.e eVar2 = ((p) this.f57061k.get(size2 - 1)).f57125b;
        if (this.f57129f == 0) {
            x.d dVar = eVar.Q;
            x.d dVar2 = eVar2.S;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            x.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.Q.f();
            }
            if (fVarI != null) {
                b(this.f57131h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            x.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.S.f();
            }
            if (fVarI2 != null) {
                b(this.f57132i, fVarI2, -iF2);
            }
        } else {
            x.d dVar3 = eVar.R;
            x.d dVar4 = eVar2.T;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            x.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.R.f();
            }
            if (fVarI3 != null) {
                b(this.f57131h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            x.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.T.f();
            }
            if (fVarI4 != null) {
                b(this.f57132i, fVarI4, -iF4);
            }
        }
        this.f57131h.f57072a = this;
        this.f57132i.f57072a = this;
    }

    @Override // y.p
    public void e() {
        for (int i10 = 0; i10 < this.f57061k.size(); i10++) {
            ((p) this.f57061k.get(i10)).e();
        }
    }

    @Override // y.p
    void f() {
        this.f57126c = null;
        ArrayList arrayList = this.f57061k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p) obj).f();
        }
    }

    @Override // y.p
    public long j() {
        int size = this.f57061k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f57061k.get(i10);
            j10 = j10 + ((long) pVar.f57131h.f57077f) + pVar.j() + ((long) pVar.f57132i.f57077f);
        }
        return j10;
    }

    @Override // y.p
    boolean m() {
        int size = this.f57061k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f57061k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f57129f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f57061k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb2.append(IAoPeRfJn.cUwVrV);
            sb2.append((p) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
