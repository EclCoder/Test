package u;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f53695r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53697b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f53701f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f53705j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53698c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f53699d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53700e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f53702g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f53703h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f53704i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f53706k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53707l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53708m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f53709n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f53710o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f53711p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    HashSet f53712q = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f53705j = aVar;
    }

    static void c() {
        f53695r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f53707l;
            if (i10 >= i11) {
                b[] bVarArr = this.f53706k;
                if (i11 >= bVarArr.length) {
                    this.f53706k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f53706k;
                int i12 = this.f53707l;
                bVarArr2[i12] = bVar;
                this.f53707l = i12 + 1;
                return;
            }
            if (this.f53706k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f53698c - iVar.f53698c;
    }

    public final void d(b bVar) {
        int i10 = this.f53707l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f53706k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f53706k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f53707l--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.f53697b = null;
        this.f53705j = a.UNKNOWN;
        this.f53700e = 0;
        this.f53698c = -1;
        this.f53699d = -1;
        this.f53701f = 0.0f;
        this.f53702g = false;
        this.f53709n = false;
        this.f53710o = -1;
        this.f53711p = 0.0f;
        int i10 = this.f53707l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53706k[i11] = null;
        }
        this.f53707l = 0;
        this.f53708m = 0;
        this.f53696a = false;
        Arrays.fill(this.f53704i, 0.0f);
    }

    public void f(d dVar, float f10) {
        this.f53701f = f10;
        this.f53702g = true;
        this.f53709n = false;
        this.f53710o = -1;
        this.f53711p = 0.0f;
        int i10 = this.f53707l;
        this.f53699d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53706k[i11].A(dVar, this, false);
        }
        this.f53707l = 0;
    }

    public void g(a aVar, String str) {
        this.f53705j = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i10 = this.f53707l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53706k[i11].B(dVar, bVar, false);
        }
        this.f53707l = 0;
    }

    public String toString() {
        if (this.f53697b != null) {
            return "" + this.f53697b;
        }
        return "" + this.f53698c;
    }
}
