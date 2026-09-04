package gk;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f39301a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f39302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f39303b;

        a(Object obj, Object obj2, Object obj3, Object obj4) {
            this(new Object[]{obj, obj3}, new Object[]{obj2, obj4});
        }

        private int c(Object obj) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f39302a;
                if (i10 >= objArr.length) {
                    return -1;
                }
                if (objArr[i10] == obj) {
                    return i10;
                }
                i10++;
            }
        }

        @Override // gk.c.d
        public Object a(Object obj, int i10, int i11) {
            int i12 = 0;
            while (true) {
                Object[] objArr = this.f39302a;
                if (i12 >= objArr.length) {
                    return null;
                }
                if (objArr[i12] == obj) {
                    return this.f39303b[i12];
                }
                i12++;
            }
        }

        @Override // gk.c.d
        public d b(Object obj, Object obj2, int i10, int i11) {
            int iHashCode = this.f39302a[0].hashCode();
            if (iHashCode != i10) {
                return b.c(new C0590c(obj, obj2), i10, this, iHashCode, i11);
            }
            int iC = c(obj);
            if (iC != -1) {
                Object[] objArr = this.f39302a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f39303b, this.f39302a.length);
                objArrCopyOf[iC] = obj;
                objArrCopyOf2[iC] = obj2;
                return new a(objArrCopyOf, objArrCopyOf2);
            }
            Object[] objArr2 = this.f39302a;
            Object[] objArrCopyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f39303b, this.f39302a.length + 1);
            Object[] objArr3 = this.f39302a;
            objArrCopyOf3[objArr3.length] = obj;
            objArrCopyOf4[objArr3.length] = obj2;
            return new a(objArrCopyOf3, objArrCopyOf4);
        }

        @Override // gk.c.d
        public int size() {
            return this.f39303b.length;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CollisionLeaf(");
            for (int i10 = 0; i10 < this.f39303b.length; i10++) {
                sb2.append("(key=");
                sb2.append(this.f39302a[i10]);
                sb2.append(" value=");
                sb2.append(this.f39303b[i10]);
                sb2.append(") ");
            }
            sb2.append(")");
            return sb2.toString();
        }

        private a(Object[] objArr, Object[] objArr2) {
            this.f39302a = objArr;
            this.f39303b = objArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f39304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d[] f39305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f39306c;

        private b(int i10, d[] dVarArr, int i11) {
            this.f39304a = i10;
            this.f39305b = dVarArr;
            this.f39306c = i11;
        }

        static d c(d dVar, int i10, d dVar2, int i11, int i12) {
            int iE = e(i10, i12);
            int iE2 = e(i11, i12);
            if (iE == iE2) {
                d dVarC = c(dVar, i10, dVar2, i11, i12 + 5);
                return new b(iE, new d[]{dVarC}, dVarC.size());
            }
            if (f(i10, i12) > f(i11, i12)) {
                dVar2 = dVar;
                dVar = dVar2;
            }
            return new b(iE | iE2, new d[]{dVar, dVar2}, dVar.size() + dVar2.size());
        }

        private int d(int i10) {
            return Integer.bitCount((i10 - 1) & this.f39304a);
        }

        private static int e(int i10, int i11) {
            return 1 << f(i10, i11);
        }

        private static int f(int i10, int i11) {
            return (i10 >>> i11) & 31;
        }

        @Override // gk.c.d
        public Object a(Object obj, int i10, int i11) {
            int iE = e(i10, i11);
            if ((this.f39304a & iE) == 0) {
                return null;
            }
            return this.f39305b[d(iE)].a(obj, i10, i11 + 5);
        }

        @Override // gk.c.d
        public d b(Object obj, Object obj2, int i10, int i11) {
            int iE = e(i10, i11);
            int iD = d(iE);
            int i12 = this.f39304a;
            if ((i12 & iE) != 0) {
                d[] dVarArr = this.f39305b;
                d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                dVarArr2[iD] = this.f39305b[iD].b(obj, obj2, i10, i11 + 5);
                return new b(this.f39304a, dVarArr2, (size() + dVarArr2[iD].size()) - this.f39305b[iD].size());
            }
            int i13 = i12 | iE;
            d[] dVarArr3 = this.f39305b;
            d[] dVarArr4 = new d[dVarArr3.length + 1];
            System.arraycopy(dVarArr3, 0, dVarArr4, 0, iD);
            dVarArr4[iD] = new C0590c(obj, obj2);
            d[] dVarArr5 = this.f39305b;
            System.arraycopy(dVarArr5, iD, dVarArr4, iD + 1, dVarArr5.length - iD);
            return new b(i13, dVarArr4, size() + 1);
        }

        @Override // gk.c.d
        public int size() {
            return this.f39306c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CompressedIndex(");
            sb2.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f39304a)));
            for (d dVar : this.f39305b) {
                sb2.append(dVar);
                sb2.append(" ");
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: gk.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0590c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f39307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f39308b;

        public C0590c(Object obj, Object obj2) {
            this.f39307a = obj;
            this.f39308b = obj2;
        }

        @Override // gk.c.d
        public Object a(Object obj, int i10, int i11) {
            if (this.f39307a == obj) {
                return this.f39308b;
            }
            return null;
        }

        @Override // gk.c.d
        public d b(Object obj, Object obj2, int i10, int i11) {
            int iHashCode = this.f39307a.hashCode();
            if (iHashCode != i10) {
                return b.c(new C0590c(obj, obj2), i10, this, iHashCode, i11);
            }
            return this.f39307a == obj ? new C0590c(obj, obj2) : new a(this.f39307a, this.f39308b, obj, obj2);
        }

        @Override // gk.c.d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f39307a, this.f39308b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface d {
        Object a(Object obj, int i10, int i11);

        d b(Object obj, Object obj2, int i10, int i11);

        int size();
    }

    c() {
        this(null);
    }

    public Object a(Object obj) {
        d dVar = this.f39301a;
        if (dVar == null) {
            return null;
        }
        return dVar.a(obj, obj.hashCode(), 0);
    }

    public c b(Object obj, Object obj2) {
        d dVar = this.f39301a;
        return dVar == null ? new c(new C0590c(obj, obj2)) : new c(dVar.b(obj, obj2, obj.hashCode(), 0));
    }

    private c(d dVar) {
        this.f39301a = dVar;
    }
}
