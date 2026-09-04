package u;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f53719n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53720a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53721b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53722c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f53723d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f53724e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f53725f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f53726g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f53727h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f53728i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f53729j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f53730k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f53731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f53732m;

    j(b bVar, c cVar) {
        this.f53731l = bVar;
        this.f53732m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f53698c % this.f53722c;
        int[] iArr2 = this.f53723d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f53724e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f53724e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f53725f[i10] = iVar.f53698c;
        this.f53726g[i10] = f10;
        this.f53727h[i10] = -1;
        this.f53728i[i10] = -1;
        iVar.a(this.f53731l);
        iVar.f53708m++;
        this.f53729j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f53721b; i10++) {
            if (this.f53725f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f53721b * 2;
        this.f53725f = Arrays.copyOf(this.f53725f, i10);
        this.f53726g = Arrays.copyOf(this.f53726g, i10);
        this.f53727h = Arrays.copyOf(this.f53727h, i10);
        this.f53728i = Arrays.copyOf(this.f53728i, i10);
        this.f53724e = Arrays.copyOf(this.f53724e, i10);
        for (int i11 = this.f53721b; i11 < i10; i11++) {
            this.f53725f[i11] = -1;
            this.f53724e[i11] = -1;
        }
        this.f53721b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f53727h[iN] = i10;
            int[] iArr = this.f53728i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f53727h[iN] = -1;
            if (this.f53729j > 0) {
                this.f53728i[iN] = this.f53730k;
                this.f53730k = iN;
            } else {
                this.f53728i[iN] = -1;
            }
        }
        int i11 = this.f53728i[iN];
        if (i11 != -1) {
            this.f53727h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f53698c;
        int i12 = i11 % this.f53722c;
        int[] iArr2 = this.f53723d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f53725f[i13] == i11) {
            int[] iArr3 = this.f53724e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f53724e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f53725f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f53725f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // u.b.a
    public boolean a(i iVar) {
        return p(iVar) != -1;
    }

    @Override // u.b.a
    public i b(int i10) {
        int i11 = this.f53729j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f53730k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f53732m.f53657d[this.f53725f[i12]];
            }
            i12 = this.f53728i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // u.b.a
    public void c() {
        int i10 = this.f53729j;
        int i11 = this.f53730k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f53726g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f53728i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // u.b.a
    public void clear() {
        int i10 = this.f53729j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                iVarB.d(this.f53731l);
            }
        }
        for (int i12 = 0; i12 < this.f53721b; i12++) {
            this.f53725f[i12] = -1;
            this.f53724e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f53722c; i13++) {
            this.f53723d[i13] = -1;
        }
        this.f53729j = 0;
        this.f53730k = -1;
    }

    @Override // u.b.a
    public float d(b bVar, boolean z10) {
        float fI = i(bVar.f53648a);
        g(bVar.f53648a, z10);
        j jVar = (j) bVar.f53652e;
        int iE = jVar.e();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iE) {
            int i12 = jVar.f53725f[i11];
            if (i12 != -1) {
                h(this.f53732m.f53657d[i12], jVar.f53726g[i11] * fI, z10);
                i10++;
            }
            i11++;
        }
        return fI;
    }

    @Override // u.b.a
    public int e() {
        return this.f53729j;
    }

    @Override // u.b.a
    public float f(int i10) {
        int i11 = this.f53729j;
        int i12 = this.f53730k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f53726g[i12];
            }
            i12 = this.f53728i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // u.b.a
    public float g(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f53726g[iP];
        if (this.f53730k == iP) {
            this.f53730k = this.f53728i[iP];
        }
        this.f53725f[iP] = -1;
        int[] iArr = this.f53727h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f53728i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f53728i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f53729j--;
        iVar.f53708m--;
        if (z10) {
            iVar.d(this.f53731l);
        }
        return f10;
    }

    @Override // u.b.a
    public void h(i iVar, float f10, boolean z10) {
        float f11 = f53719n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                j(iVar, f10);
                return;
            }
            float[] fArr = this.f53726g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f53719n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z10);
        }
    }

    @Override // u.b.a
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f53726g[iP];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public void j(i iVar, float f10) {
        float f11 = f53719n;
        if (f10 > (-f11) && f10 < f11) {
            g(iVar, true);
            return;
        }
        if (this.f53729j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f53730k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f53726g[iP] = f10;
            return;
        }
        if (this.f53729j + 1 >= this.f53721b) {
            o();
        }
        int i10 = this.f53729j;
        int i11 = this.f53730k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f53725f[i11];
            int i15 = iVar.f53698c;
            if (i14 == i15) {
                this.f53726g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f53728i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // u.b.a
    public void k(float f10) {
        int i10 = this.f53729j;
        int i11 = this.f53730k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f53726g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f53728i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f53729j != 0 && iVar != null) {
            int i10 = iVar.f53698c;
            int i11 = this.f53723d[i10 % this.f53722c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f53725f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f53724e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f53725f[i11] != i10);
            if (i11 != -1 && this.f53725f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f53729j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + f(i11) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f53727h[iP] != -1 ? str3 + this.f53732m.f53657d[this.f53725f[this.f53727h[iP]]] : str3 + DevicePublicKeyStringDef.NONE) + ", n: ";
                str = (this.f53728i[iP] != -1 ? str4 + this.f53732m.f53657d[this.f53725f[this.f53728i[iP]]] : str4 + DevicePublicKeyStringDef.NONE) + "]";
            }
        }
        return str + " }";
    }
}
