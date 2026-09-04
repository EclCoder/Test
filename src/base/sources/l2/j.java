package l2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f43834h = new Comparator() { // from class: l2.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return j.b((j.b) obj, (j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f43835i = new Comparator() { // from class: l2.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((j.b) obj).f43845c, ((j.b) obj2).f43845c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43836a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43842g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f43838c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f43837b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43839d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f43845c;

        private b() {
        }
    }

    public j(int i10) {
        this.f43836a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f43843a - bVar2.f43843a;
    }

    private void d() {
        if (this.f43839d != 1) {
            Collections.sort(this.f43837b, f43834h);
            this.f43839d = 1;
        }
    }

    private void e() {
        if (this.f43839d != 0) {
            Collections.sort(this.f43837b, f43835i);
            this.f43839d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f43842g;
        if (i11 > 0) {
            b[] bVarArr = this.f43838c;
            int i12 = i11 - 1;
            this.f43842g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f43840e;
        this.f43840e = i13 + 1;
        bVar.f43843a = i13;
        bVar.f43844b = i10;
        bVar.f43845c = f10;
        this.f43837b.add(bVar);
        this.f43841f += i10;
        while (true) {
            int i14 = this.f43841f;
            int i15 = this.f43836a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f43837b.get(0);
            int i17 = bVar2.f43844b;
            if (i17 <= i16) {
                this.f43841f -= i17;
                this.f43837b.remove(0);
                int i18 = this.f43842g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f43838c;
                    this.f43842g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f43844b = i17 - i16;
                this.f43841f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f43841f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f43837b.size(); i11++) {
            b bVar = (b) this.f43837b.get(i11);
            i10 += bVar.f43844b;
            if (i10 >= f11) {
                return bVar.f43845c;
            }
        }
        if (this.f43837b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f43837b;
        return ((b) arrayList.get(arrayList.size() - 1)).f43845c;
    }

    public void g() {
        this.f43837b.clear();
        this.f43839d = -1;
        this.f43840e = 0;
        this.f43841f = 0;
    }
}
