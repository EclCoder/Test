package te;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f53328e = new f(g.f53333b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f53330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53332d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f53330b = gVar;
        this.f53329a = i10;
        this.f53331c = i11;
        this.f53332d = i12;
    }

    f a(int i10) {
        int i11;
        g gVarA = this.f53330b;
        int i12 = this.f53329a;
        int i13 = this.f53332d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f53321c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f53331c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i12, i17 + 1, i13 + i11);
        return fVar.f53331c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    f b(int i10) {
        int i11 = this.f53331c;
        return i11 == 0 ? this : new f(this.f53330b.b(i10 - i11, i11), this.f53329a, 0, this.f53332d);
    }

    int c() {
        return this.f53331c;
    }

    int d() {
        return this.f53332d;
    }

    int e() {
        return this.f53329a;
    }

    boolean f(f fVar) {
        int i10;
        int i11 = this.f53332d + (d.f53321c[this.f53329a][fVar.f53329a] >> 16);
        int i12 = fVar.f53331c;
        if (i12 > 0 && ((i10 = this.f53331c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f53332d;
    }

    f g(int i10, int i11) {
        int i12 = this.f53332d;
        g gVarA = this.f53330b;
        int i13 = this.f53329a;
        if (i10 != i13) {
            int i14 = d.f53321c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    f h(int i10, int i11) {
        g gVar = this.f53330b;
        int i12 = this.f53329a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f53323e[i12][i10], i13).a(i11, 5), this.f53329a, 0, this.f53332d + i13 + 5);
    }

    ue.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = b(bArr.length).f53330b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        ue.a aVar = new ue.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f53320b[this.f53329a], Integer.valueOf(this.f53332d), Integer.valueOf(this.f53331c));
    }
}
