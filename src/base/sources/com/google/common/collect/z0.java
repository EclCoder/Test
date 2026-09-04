package com.google.common.collect;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class z0 extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final e0 f21888h = new z0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f21889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f21890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f21891g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient e0 f21892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f21893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f21894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f21895f;

        /* JADX INFO: renamed from: com.google.common.collect.z0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0325a extends c0 {
            C0325a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                sc.p.m(i10, a.this.f21895f);
                int i11 = i10 * 2;
                Object obj = a.this.f21893d[a.this.f21894e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f21893d[i11 + (a.this.f21894e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.a0
            public boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f21895f;
            }

            @Override // com.google.common.collect.c0, com.google.common.collect.a0
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        a(e0 e0Var, Object[] objArr, int i10, int i11) {
            this.f21892c = e0Var;
            this.f21893d = objArr;
            this.f21894e = i10;
            this.f21895f = i11;
        }

        @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f21892c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.a0
        int e(Object[] objArr, int i10) {
            return d().e(objArr, i10);
        }

        @Override // com.google.common.collect.a0
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public p1 iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21895f;
        }

        @Override // com.google.common.collect.g0, com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.g0
        c0 x() {
            return new C0325a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient e0 f21897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient c0 f21898d;

        b(e0 e0Var, c0 c0Var) {
            this.f21897c = e0Var;
            this.f21898d = c0Var;
        }

        @Override // com.google.common.collect.a0, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f21897c.get(obj) != null;
        }

        @Override // com.google.common.collect.g0, com.google.common.collect.a0
        public c0 d() {
            return this.f21898d;
        }

        @Override // com.google.common.collect.a0
        int e(Object[] objArr, int i10) {
            return d().e(objArr, i10);
        }

        @Override // com.google.common.collect.a0
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public p1 iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21897c.size();
        }

        @Override // com.google.common.collect.g0, com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f21899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f21900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f21901e;

        c(Object[] objArr, int i10, int i11) {
            this.f21899c = objArr;
            this.f21900d = i10;
            this.f21901e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            sc.p.m(i10, this.f21901e);
            Object obj = this.f21899c[(i10 * 2) + this.f21900d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.a0
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21901e;
        }

        @Override // com.google.common.collect.c0, com.google.common.collect.a0
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private z0(Object obj, Object[] objArr, int i10) {
        this.f21889e = obj;
        this.f21890f = objArr;
        this.f21891g = i10;
    }

    static Object A(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = z.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = z.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = z.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    static z0 x(int i10, Object[] objArr) {
        return y(i10, objArr, null);
    }

    static z0 y(int i10, Object[] objArr, e0.a aVar) {
        if (i10 == 0) {
            return (z0) f21888h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            l.a(obj, obj2);
            return new z0(null, objArr, 1);
        }
        sc.p.s(i10, objArr.length >> 1);
        Object objZ = z(objArr, i10, g0.r(i10), 0);
        if (objZ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objZ;
            e0.a.C0322a c0322a = (e0.a.C0322a) objArr2[2];
            if (aVar == null) {
                throw c0322a.a();
            }
            aVar.f21720e = c0322a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objZ = obj3;
            i10 = iIntValue;
        }
        return new z0(objZ, objArr, i10);
    }

    private static Object z(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        e0.a.C0322a c0322a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            l.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                l.a(obj3, obj4);
                int iB = z.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                        break;
                    }
                    if (obj3.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj5 = objArr[i22];
                        Objects.requireNonNull(obj5);
                        c0322a = new e0.a.C0322a(obj3, obj4, obj5);
                        objArr[i22] = obj4;
                        break;
                    }
                    iB = i20 + 1;
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0322a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                l.a(obj6, obj7);
                int iB2 = z.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                        break;
                    }
                    if (obj6.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj8 = objArr[i29];
                        Objects.requireNonNull(obj8);
                        c0322a = new e0.a.C0322a(obj6, obj7, obj8);
                        objArr[i29] = obj7;
                        break;
                    }
                    iB2 = i27 + 1;
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0322a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            l.a(obj9, obj10);
            int iB3 = z.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                    break;
                }
                i13 = i14;
                if (obj9.equals(objArr[i35])) {
                    int i36 = i35 ^ 1;
                    Object obj11 = objArr[i36];
                    Objects.requireNonNull(obj11);
                    c0322a = new e0.a.C0322a(obj9, obj10, obj11);
                    objArr[i36] = obj10;
                    break;
                }
                iB3 = i34 + 1;
                i14 = i13;
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0322a;
        return objArr2;
    }

    @Override // com.google.common.collect.e0, java.util.Map
    public Object get(Object obj) {
        Object objA = A(this.f21889e, this.f21890f, this.f21891g, 0, obj);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // com.google.common.collect.e0
    g0 k() {
        return new a(this, this.f21890f, 0, this.f21891g);
    }

    @Override // com.google.common.collect.e0
    g0 l() {
        return new b(this, new c(this.f21890f, 0, this.f21891g));
    }

    @Override // com.google.common.collect.e0
    a0 m() {
        return new c(this.f21890f, 1, this.f21891g);
    }

    @Override // com.google.common.collect.e0
    boolean o() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f21891g;
    }

    @Override // com.google.common.collect.e0
    Object writeReplace() {
        return super.writeReplace();
    }
}
