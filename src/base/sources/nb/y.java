package nb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f47061h = new Comparator() { // from class: nb.w
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y.a((y.b) obj, (y.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f47062i = new Comparator() { // from class: nb.x
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((y.b) obj).f47072c, ((y.b) obj2).f47072c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47063a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47069g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f47065c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f47064b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47066d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f47072c;

        private b() {
        }
    }

    public y(int i10) {
        this.f47063a = i10;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f47070a - bVar2.f47070a;
    }

    private void d() {
        if (this.f47066d != 1) {
            Collections.sort(this.f47064b, f47061h);
            this.f47066d = 1;
        }
    }

    private void e() {
        if (this.f47066d != 0) {
            Collections.sort(this.f47064b, f47062i);
            this.f47066d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f47069g;
        if (i11 > 0) {
            b[] bVarArr = this.f47065c;
            int i12 = i11 - 1;
            this.f47069g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f47067e;
        this.f47067e = i13 + 1;
        bVar.f47070a = i13;
        bVar.f47071b = i10;
        bVar.f47072c = f10;
        this.f47064b.add(bVar);
        this.f47068f += i10;
        while (true) {
            int i14 = this.f47068f;
            int i15 = this.f47063a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f47064b.get(0);
            int i17 = bVar2.f47071b;
            if (i17 <= i16) {
                this.f47068f -= i17;
                this.f47064b.remove(0);
                int i18 = this.f47069g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f47065c;
                    this.f47069g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f47071b = i17 - i16;
                this.f47068f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f47068f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f47064b.size(); i11++) {
            b bVar = (b) this.f47064b.get(i11);
            i10 += bVar.f47071b;
            if (i10 >= f11) {
                return bVar.f47072c;
            }
        }
        if (this.f47064b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f47064b;
        return ((b) arrayList.get(arrayList.size() - 1)).f47072c;
    }

    public void g() {
        this.f47064b.clear();
        this.f47066d = -1;
        this.f47067e = 0;
        this.f47068f = 0;
    }
}
