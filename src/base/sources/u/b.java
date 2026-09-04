package u;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f53652e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f53648a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f53649b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f53650c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f53651d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f53653f = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean a(i iVar);

        i b(int i10);

        void c();

        void clear();

        float d(b bVar, boolean z10);

        int e();

        float f(int i10);

        float g(i iVar, boolean z10);

        void h(i iVar, float f10, boolean z10);

        float i(i iVar);

        void j(i iVar, float f10);

        void k(float f10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f53708m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iE = this.f53652e.e();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iE; i10++) {
            float f11 = this.f53652e.f(i10);
            if (f11 < 0.0f) {
                i iVarB = this.f53652e.b(i10);
                if ((zArr == null || !zArr[iVarB.f53698c]) && iVarB != iVar && (((aVar = iVarB.f53705j) == i.a.SLACK || aVar == i.a.ERROR) && f11 < f10)) {
                    f10 = f11;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f53702g) {
            return;
        }
        this.f53649b += iVar.f53701f * this.f53652e.i(iVar);
        this.f53652e.g(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (d.f53660u && this.f53652e.e() == 0) {
            this.f53653f = true;
            dVar.f53666b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f53649b += bVar.f53649b * this.f53652e.d(bVar, z10);
        if (z10) {
            bVar.f53648a.d(this);
        }
        if (d.f53660u && this.f53648a != null && this.f53652e.e() == 0) {
            this.f53653f = true;
            dVar.f53666b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f53709n) {
            return;
        }
        float fI = this.f53652e.i(iVar);
        this.f53649b += iVar.f53711p * fI;
        this.f53652e.g(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        this.f53652e.h(dVar.f53679o.f53657d[iVar.f53710o], fI, z10);
        if (d.f53660u && this.f53652e.e() == 0) {
            this.f53653f = true;
            dVar.f53666b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f53672h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iE = this.f53652e.e();
            for (int i10 = 0; i10 < iE; i10++) {
                i iVarB = this.f53652e.b(i10);
                if (iVarB.f53699d != -1 || iVarB.f53702g || iVarB.f53709n) {
                    this.f53651d.add(iVarB);
                }
            }
            int size = this.f53651d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f53651d.get(i11);
                    if (iVar.f53702g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f53709n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f53672h[iVar.f53699d], true);
                    }
                }
                this.f53651d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f53660u && this.f53648a != null && this.f53652e.e() == 0) {
            this.f53653f = true;
            dVar.f53666b = true;
        }
    }

    @Override // u.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f53648a = null;
            this.f53652e.clear();
            for (int i10 = 0; i10 < bVar.f53652e.e(); i10++) {
                this.f53652e.h(bVar.f53652e.b(i10), bVar.f53652e.f(i10), true);
            }
        }
    }

    @Override // u.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // u.d.a
    public void c(i iVar) {
        int i10 = iVar.f53700e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f53652e.j(iVar, f10);
    }

    @Override // u.d.a
    public void clear() {
        this.f53652e.clear();
        this.f53648a = null;
        this.f53649b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f53652e.j(dVar.o(i10, "ep"), 1.0f);
        this.f53652e.j(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f53652e.j(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f53652e.e() == 0) {
            this.f53653f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iE = this.f53652e.e();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iE; i10++) {
            float f12 = this.f53652e.f(i10);
            i iVarB = this.f53652e.b(i10);
            if (iVarB.f53705j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > f12) {
                    boolean zU = u(iVarB, dVar);
                    z10 = zU;
                    f10 = f12;
                    iVar = iVarB;
                } else if (!z10 && u(iVarB, dVar)) {
                    f10 = f12;
                    iVar = iVarB;
                    z10 = true;
                }
            } else if (iVar == null && f12 < 0.0f) {
                if (iVar2 == null || f11 > f12) {
                    boolean zU2 = u(iVarB, dVar);
                    z11 = zU2;
                    f11 = f12;
                    iVar2 = iVarB;
                } else if (!z11 && u(iVarB, dVar)) {
                    f11 = f12;
                    iVar2 = iVarB;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // u.d.a
    public i getKey() {
        return this.f53648a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar4, 1.0f);
            this.f53652e.j(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            this.f53652e.j(iVar3, -1.0f);
            this.f53652e.j(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f53649b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f53652e.j(iVar, -1.0f);
                this.f53652e.j(iVar2, 1.0f);
                this.f53649b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f53652e.j(iVar4, -1.0f);
                this.f53652e.j(iVar3, 1.0f);
                this.f53649b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f53652e.j(iVar, f11 * 1.0f);
            this.f53652e.j(iVar2, f11 * (-1.0f));
            this.f53652e.j(iVar3, (-1.0f) * f10);
            this.f53652e.j(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f53649b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f53648a = iVar;
        float f10 = i10;
        iVar.f53701f = f10;
        this.f53649b = f10;
        this.f53653f = true;
        return this;
    }

    @Override // u.d.a
    public boolean isEmpty() {
        return this.f53648a == null && this.f53649b == 0.0f && this.f53652e.e() == 0;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f53652e.j(iVar, -1.0f);
        this.f53652e.j(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f53652e.j(iVar, -1.0f);
        this.f53652e.j(iVar2, 1.0f);
        this.f53652e.j(iVar3, f10);
        this.f53652e.j(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f53649b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            this.f53652e.j(iVar4, 1.0f);
            this.f53652e.j(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f53652e.j(iVar3, 1.0f);
            this.f53652e.j(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f53652e.j(iVar, 1.0f);
        this.f53652e.j(iVar2, -1.0f);
        this.f53652e.j(iVar4, f13);
        this.f53652e.j(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f53649b = i10 * (-1);
            this.f53652e.j(iVar, 1.0f);
            return this;
        }
        this.f53649b = i10;
        this.f53652e.j(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f53649b = i10;
        }
        if (z10) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            return this;
        }
        this.f53652e.j(iVar, -1.0f);
        this.f53652e.j(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f53649b = i10;
        }
        if (z10) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            this.f53652e.j(iVar3, -1.0f);
            return this;
        }
        this.f53652e.j(iVar, -1.0f);
        this.f53652e.j(iVar2, 1.0f);
        this.f53652e.j(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f53649b = i10;
        }
        if (z10) {
            this.f53652e.j(iVar, 1.0f);
            this.f53652e.j(iVar2, -1.0f);
            this.f53652e.j(iVar3, 1.0f);
            return this;
        }
        this.f53652e.j(iVar, -1.0f);
        this.f53652e.j(iVar2, 1.0f);
        this.f53652e.j(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f53652e.j(iVar3, 0.5f);
        this.f53652e.j(iVar4, 0.5f);
        this.f53652e.j(iVar, -0.5f);
        this.f53652e.j(iVar2, -0.5f);
        this.f53649b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f53649b;
        if (f10 < 0.0f) {
            this.f53649b = f10 * (-1.0f);
            this.f53652e.c();
        }
    }

    boolean s() {
        i iVar = this.f53648a;
        if (iVar != null) {
            return iVar.f53705j == i.a.UNRESTRICTED || this.f53649b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f53652e.a(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f53648a;
        if (iVar2 != null) {
            this.f53652e.j(iVar2, -1.0f);
            this.f53648a.f53699d = -1;
            this.f53648a = null;
        }
        float fG = this.f53652e.g(iVar, true) * (-1.0f);
        this.f53648a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f53649b /= fG;
        this.f53652e.k(fG);
    }

    public void y() {
        this.f53648a = null;
        this.f53652e.clear();
        this.f53649b = 0.0f;
        this.f53653f = false;
    }

    String z() {
        boolean z10;
        String str = (this.f53648a == null ? "" + MBridgeConstans.ENDCARD_URL_TYPE_PL : "" + this.f53648a) + " = ";
        if (this.f53649b != 0.0f) {
            str = str + this.f53649b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iE = this.f53652e.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarB = this.f53652e.b(i10);
            if (iVarB != null) {
                float f10 = this.f53652e.f(i10);
                if (f10 != 0.0f) {
                    String string = iVarB.toString();
                    if (z10) {
                        if (f10 > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            f10 *= -1.0f;
                        }
                    } else if (f10 < 0.0f) {
                        str = str + "- ";
                        f10 *= -1.0f;
                    }
                    str = f10 == 1.0f ? str + string : str + f10 + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.f53652e = new u.a(this, cVar);
    }
}
