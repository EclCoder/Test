package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f6957a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f6960a - dVar2.f6960a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public abstract Object c(int i10, int i11);

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f6958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6959b;

        c(int i10) {
            int[] iArr = new int[i10];
            this.f6958a = iArr;
            this.f6959b = iArr.length / 2;
        }

        int[] a() {
            return this.f6958a;
        }

        int b(int i10) {
            return this.f6958a[i10 + this.f6959b];
        }

        void c(int i10, int i11) {
            this.f6958a[i10 + this.f6959b] = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6962c;

        d(int i10, int i11, int i12) {
            this.f6960a = i10;
            this.f6961b = i11;
            this.f6962c = i12;
        }

        int a() {
            return this.f6960a + this.f6962c;
        }

        int b() {
            return this.f6961b + this.f6962c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f6963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f6964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f6965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f6966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f6967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f6968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f6969g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z10) {
            this.f6963a = list;
            this.f6964b = iArr;
            this.f6965c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f6966d = bVar;
            this.f6967e = bVar.e();
            this.f6968f = bVar.d();
            this.f6969g = z10;
            a();
            d();
        }

        private void a() {
            d dVar = this.f6963a.isEmpty() ? null : (d) this.f6963a.get(0);
            if (dVar == null || dVar.f6960a != 0 || dVar.f6961b != 0) {
                this.f6963a.add(0, new d(0, 0, 0));
            }
            this.f6963a.add(new d(this.f6967e, this.f6968f, 0));
        }

        private void c(int i10) {
            int size = this.f6963a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) this.f6963a.get(i11);
                while (iB < dVar.f6961b) {
                    if (this.f6965c[iB] == 0 && this.f6966d.b(i10, iB)) {
                        int i12 = this.f6966d.a(i10, iB) ? 8 : 4;
                        this.f6964b[i10] = (iB << 4) | i12;
                        this.f6965c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void d() {
            for (d dVar : this.f6963a) {
                for (int i10 = 0; i10 < dVar.f6962c; i10++) {
                    int i11 = dVar.f6960a + i10;
                    int i12 = dVar.f6961b + i10;
                    int i13 = this.f6966d.a(i11, i12) ? 1 : 2;
                    this.f6964b[i11] = (i12 << 4) | i13;
                    this.f6965c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f6969g) {
                e();
            }
        }

        private void e() {
            int iA = 0;
            for (d dVar : this.f6963a) {
                while (iA < dVar.f6960a) {
                    if (this.f6964b[iA] == 0) {
                        c(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static g f(Collection collection, int i10, boolean z10) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f6970a == i10 && gVar.f6972c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z10) {
                    gVar2.f6971b--;
                } else {
                    gVar2.f6971b++;
                }
            }
            return gVar;
        }

        public void b(p pVar) {
            int i10;
            androidx.recyclerview.widget.e eVar = pVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) pVar : new androidx.recyclerview.widget.e(pVar);
            int i11 = this.f6967e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f6967e;
            int i13 = this.f6968f;
            for (int size = this.f6963a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f6963a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f6964b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarF = f(arrayDeque, i15, false);
                        if (gVarF != null) {
                            int i16 = (i11 - gVarF.f6971b) - 1;
                            eVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                eVar.c(i16, 1, this.f6966d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        eVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f6965c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarF2 = f(arrayDeque, i18, true);
                        if (gVarF2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            eVar.d((i11 - gVarF2.f6971b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                eVar.c(i12, 1, this.f6966d.c(i18, i13));
                            }
                        }
                    } else {
                        eVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f6960a;
                int i20 = dVar.f6961b;
                for (i10 = 0; i10 < dVar.f6962c; i10++) {
                    if ((this.f6964b[i19] & 15) == 2) {
                        eVar.c(i19, 1, this.f6966d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f6960a;
                i13 = dVar.f6961b;
            }
            eVar.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6972c;

        g(int i10, int i11, boolean z10) {
            this.f6970a = i10;
            this.f6971b = i11;
            this.f6972c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6976d;

        public h() {
        }

        int a() {
            return this.f6976d - this.f6975c;
        }

        int b() {
            return this.f6974b - this.f6973a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f6973a = i10;
            this.f6974b = i11;
            this.f6975c = i12;
            this.f6976d = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6981e;

        i() {
        }

        int a() {
            return Math.min(this.f6979c - this.f6977a, this.f6980d - this.f6978b);
        }

        boolean b() {
            return this.f6980d - this.f6978b != this.f6979c - this.f6977a;
        }

        boolean c() {
            return this.f6980d - this.f6978b > this.f6979c - this.f6977a;
        }

        d d() {
            if (!b()) {
                int i10 = this.f6977a;
                return new d(i10, this.f6978b, this.f6979c - i10);
            }
            if (this.f6981e) {
                return new d(this.f6977a, this.f6978b, a());
            }
            return c() ? new d(this.f6977a, this.f6978b + 1, a()) : new d(this.f6977a + 1, this.f6978b, a());
        }
    }

    private static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int iB2 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                iB = cVar2.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar2.b(i14 - 1);
                i11 = iB - 1;
            }
            int i15 = hVar.f6976d - ((hVar.f6974b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 + 1;
            while (i11 > hVar.f6973a && i15 > hVar.f6975c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                i iVar = new i();
                iVar.f6977a = i11;
                iVar.f6978b = i15;
                iVar.f6979c = iB;
                iVar.f6980d = i16;
                iVar.f6981e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iE, 0, iD));
        int i10 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(hVar, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f6973a = hVar.f6973a;
                hVar2.f6975c = hVar.f6975c;
                hVar2.f6974b = iVarE.f6977a;
                hVar2.f6976d = iVarE.f6978b;
                arrayList2.add(hVar2);
                hVar.f6974b = hVar.f6974b;
                hVar.f6976d = hVar.f6976d;
                hVar.f6973a = iVarE.f6979c;
                hVar.f6975c = iVarE.f6980d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f6957a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    private static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int iB2 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                iB = cVar.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar.b(i14 - 1);
                i11 = iB + 1;
            }
            int i15 = (hVar.f6975c + (i11 - hVar.f6973a)) - i14;
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 - 1;
            while (i11 < hVar.f6974b && i15 < hVar.f6976d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f6977a = iB;
                iVar.f6978b = i16;
                iVar.f6979c = i11;
                iVar.f6980d = i15;
                iVar.f6981e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int iB = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f6973a);
            cVar2.c(1, hVar.f6974b);
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = d(hVar, bVar, cVar, cVar2, i10);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(hVar, bVar, cVar, cVar2, i10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
