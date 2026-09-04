package u;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h extends u.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f53686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f53687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f53689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f53690l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f53698c - iVar2.f53698c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f53692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f53693b;

        b(h hVar) {
            this.f53693b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f53692a.f53696a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f53704i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f53692a.f53704i[i10] = f12;
                    } else {
                        this.f53692a.f53704i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f53692a.f53704i;
                float f13 = fArr[i11] + (iVar.f53704i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f53692a.f53704i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f53692a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f53692a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f53692a.f53704i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f53704i[i10];
                float f11 = this.f53692a.f53704i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f53692a.f53704i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f53692a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f53692a.f53704i[i10] + " ";
                }
            }
            return str + "] " + this.f53692a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f53685g = 128;
        this.f53686h = new i[128];
        this.f53687i = new i[128];
        this.f53688j = 0;
        this.f53689k = new b(this);
        this.f53690l = cVar;
    }

    private void F(i iVar) {
        int i10;
        int i11 = this.f53688j + 1;
        i[] iVarArr = this.f53686h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f53686h = iVarArr2;
            this.f53687i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f53686h;
        int i12 = this.f53688j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f53688j = i13;
        if (i13 > 1 && iVarArr3[i12].f53698c > iVar.f53698c) {
            int i14 = 0;
            while (true) {
                i10 = this.f53688j;
                if (i14 >= i10) {
                    break;
                }
                this.f53687i[i14] = this.f53686h[i14];
                i14++;
            }
            Arrays.sort(this.f53687i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f53688j; i15++) {
                this.f53686h[i15] = this.f53687i[i15];
            }
        }
        iVar.f53696a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f53688j) {
            if (this.f53686h[i10] == iVar) {
                while (true) {
                    int i11 = this.f53688j;
                    if (i10 >= i11 - 1) {
                        this.f53688j = i11 - 1;
                        iVar.f53696a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f53686h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // u.b
    public void B(d dVar, u.b bVar, boolean z10) {
        i iVar = bVar.f53648a;
        if (iVar == null) {
            return;
        }
        u.b.a aVar = bVar.f53652e;
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarB = aVar.b(i10);
            float f10 = aVar.f(i10);
            this.f53689k.b(iVarB);
            if (this.f53689k.a(iVar, f10)) {
                F(iVarB);
            }
            this.f53649b += bVar.f53649b * f10;
        }
        G(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // u.b, u.d.a
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f53688j; i11++) {
            i iVar = this.f53686h[i11];
            if (!zArr[iVar.f53698c]) {
                this.f53689k.b(iVar);
                if (i10 == -1) {
                    if (this.f53689k.c()) {
                        i10 = i11;
                    }
                } else if (this.f53689k.d(this.f53686h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f53686h[i10];
    }

    @Override // u.b, u.d.a
    public void c(i iVar) {
        this.f53689k.b(iVar);
        this.f53689k.e();
        iVar.f53704i[iVar.f53700e] = 1.0f;
        F(iVar);
    }

    @Override // u.b, u.d.a
    public void clear() {
        this.f53688j = 0;
        this.f53649b = 0.0f;
    }

    @Override // u.b, u.d.a
    public boolean isEmpty() {
        return this.f53688j == 0;
    }

    @Override // u.b
    public String toString() {
        String str = " goal -> (" + this.f53649b + ") : ";
        for (int i10 = 0; i10 < this.f53688j; i10++) {
            this.f53689k.b(this.f53686h[i10]);
            str = str + this.f53689k + " ";
        }
        return str;
    }
}
