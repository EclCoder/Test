package u;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f53636l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f53638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f53639c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f53637a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53640d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f53641e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f53642f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f53643g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f53644h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53645i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53646j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53647k = false;

    a(b bVar, c cVar) {
        this.f53638b = bVar;
        this.f53639c = cVar;
    }

    @Override // u.b.a
    public boolean a(i iVar) {
        int i10 = this.f53645i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            if (this.f53642f[i10] == iVar.f53698c) {
                return true;
            }
            i10 = this.f53643g[i10];
        }
        return false;
    }

    @Override // u.b.a
    public i b(int i10) {
        int i11 = this.f53645i;
        for (int i12 = 0; i11 != -1 && i12 < this.f53637a; i12++) {
            if (i12 == i10) {
                return this.f53639c.f53657d[this.f53642f[i11]];
            }
            i11 = this.f53643g[i11];
        }
        return null;
    }

    @Override // u.b.a
    public void c() {
        int i10 = this.f53645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            float[] fArr = this.f53644h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f53643g[i10];
        }
    }

    @Override // u.b.a
    public final void clear() {
        int i10 = this.f53645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            i iVar = this.f53639c.f53657d[this.f53642f[i10]];
            if (iVar != null) {
                iVar.d(this.f53638b);
            }
            i10 = this.f53643g[i10];
        }
        this.f53645i = -1;
        this.f53646j = -1;
        this.f53647k = false;
        this.f53637a = 0;
    }

    @Override // u.b.a
    public float d(b bVar, boolean z10) {
        float fI = i(bVar.f53648a);
        g(bVar.f53648a, z10);
        b.a aVar = bVar.f53652e;
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarB = aVar.b(i10);
            h(iVarB, aVar.i(iVarB) * fI, z10);
        }
        return fI;
    }

    @Override // u.b.a
    public int e() {
        return this.f53637a;
    }

    @Override // u.b.a
    public float f(int i10) {
        int i11 = this.f53645i;
        for (int i12 = 0; i11 != -1 && i12 < this.f53637a; i12++) {
            if (i12 == i10) {
                return this.f53644h[i11];
            }
            i11 = this.f53643g[i11];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f53641e == iVar) {
            this.f53641e = null;
        }
        int i10 = this.f53645i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f53637a) {
            if (this.f53642f[i10] == iVar.f53698c) {
                if (i10 == this.f53645i) {
                    this.f53645i = this.f53643g[i10];
                } else {
                    int[] iArr = this.f53643g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.f53638b);
                }
                iVar.f53708m--;
                this.f53637a--;
                this.f53642f[i10] = -1;
                if (this.f53647k) {
                    this.f53646j = i10;
                }
                return this.f53644h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f53643g[i10];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public void h(i iVar, float f10, boolean z10) {
        float f11 = f53636l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f53645i;
            if (i10 == -1) {
                this.f53645i = 0;
                this.f53644h[0] = f10;
                this.f53642f[0] = iVar.f53698c;
                this.f53643g[0] = -1;
                iVar.f53708m++;
                iVar.a(this.f53638b);
                this.f53637a++;
                if (this.f53647k) {
                    return;
                }
                int i11 = this.f53646j + 1;
                this.f53646j = i11;
                int[] iArr = this.f53642f;
                if (i11 >= iArr.length) {
                    this.f53647k = true;
                    this.f53646j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f53637a; i13++) {
                int i14 = this.f53642f[i10];
                int i15 = iVar.f53698c;
                if (i14 == i15) {
                    float[] fArr = this.f53644h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f53636l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f53645i) {
                            this.f53645i = this.f53643g[i10];
                        } else {
                            int[] iArr2 = this.f53643g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.f53638b);
                        }
                        if (this.f53647k) {
                            this.f53646j = i10;
                        }
                        iVar.f53708m--;
                        this.f53637a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f53643g[i10];
            }
            int length = this.f53646j;
            int i16 = length + 1;
            if (this.f53647k) {
                int[] iArr3 = this.f53642f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f53642f;
            if (length >= iArr4.length && this.f53637a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f53642f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f53642f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f53640d * 2;
                this.f53640d = i18;
                this.f53647k = false;
                this.f53646j = length - 1;
                this.f53644h = Arrays.copyOf(this.f53644h, i18);
                this.f53642f = Arrays.copyOf(this.f53642f, this.f53640d);
                this.f53643g = Arrays.copyOf(this.f53643g, this.f53640d);
            }
            this.f53642f[length] = iVar.f53698c;
            this.f53644h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f53643g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f53643g[length] = this.f53645i;
                this.f53645i = length;
            }
            iVar.f53708m++;
            iVar.a(this.f53638b);
            this.f53637a++;
            if (!this.f53647k) {
                this.f53646j++;
            }
            int i19 = this.f53646j;
            int[] iArr8 = this.f53642f;
            if (i19 >= iArr8.length) {
                this.f53647k = true;
                this.f53646j = iArr8.length - 1;
            }
        }
    }

    @Override // u.b.a
    public final float i(i iVar) {
        int i10 = this.f53645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            if (this.f53642f[i10] == iVar.f53698c) {
                return this.f53644h[i10];
            }
            i10 = this.f53643g[i10];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public final void j(i iVar, float f10) {
        if (f10 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f53645i;
        if (i10 == -1) {
            this.f53645i = 0;
            this.f53644h[0] = f10;
            this.f53642f[0] = iVar.f53698c;
            this.f53643g[0] = -1;
            iVar.f53708m++;
            iVar.a(this.f53638b);
            this.f53637a++;
            if (this.f53647k) {
                return;
            }
            int i11 = this.f53646j + 1;
            this.f53646j = i11;
            int[] iArr = this.f53642f;
            if (i11 >= iArr.length) {
                this.f53647k = true;
                this.f53646j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f53637a; i13++) {
            int i14 = this.f53642f[i10];
            int i15 = iVar.f53698c;
            if (i14 == i15) {
                this.f53644h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f53643g[i10];
        }
        int length = this.f53646j;
        int i16 = length + 1;
        if (this.f53647k) {
            int[] iArr2 = this.f53642f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f53642f;
        if (length >= iArr3.length && this.f53637a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f53642f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f53642f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f53640d * 2;
            this.f53640d = i18;
            this.f53647k = false;
            this.f53646j = length - 1;
            this.f53644h = Arrays.copyOf(this.f53644h, i18);
            this.f53642f = Arrays.copyOf(this.f53642f, this.f53640d);
            this.f53643g = Arrays.copyOf(this.f53643g, this.f53640d);
        }
        this.f53642f[length] = iVar.f53698c;
        this.f53644h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f53643g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f53643g[length] = this.f53645i;
            this.f53645i = length;
        }
        iVar.f53708m++;
        iVar.a(this.f53638b);
        int i19 = this.f53637a + 1;
        this.f53637a = i19;
        if (!this.f53647k) {
            this.f53646j++;
        }
        int[] iArr7 = this.f53642f;
        if (i19 >= iArr7.length) {
            this.f53647k = true;
        }
        if (this.f53646j >= iArr7.length) {
            this.f53647k = true;
            this.f53646j = iArr7.length - 1;
        }
    }

    @Override // u.b.a
    public void k(float f10) {
        int i10 = this.f53645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            float[] fArr = this.f53644h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f53643g[i10];
        }
    }

    public String toString() {
        int i10 = this.f53645i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f53637a; i11++) {
            str = ((str + " -> ") + this.f53644h[i10] + " : ") + this.f53639c.f53657d[this.f53642f[i10]];
            i10 = this.f53643g[i10];
        }
        return str;
    }
}
