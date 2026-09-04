package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f21797j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f21799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f21800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f21801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f21802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f21803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f21804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f21805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection f21806i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends e {
        a() {
            super(n.this, null);
        }

        @Override // com.google.common.collect.n.e
        Object b(int i10) {
            return n.this.L(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends e {
        b() {
            super(n.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.n.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return n.this.new g(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends e {
        c() {
            super(n.this, null);
        }

        @Override // com.google.common.collect.n.e
        Object b(int i10) {
            return n.this.b0(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapB = n.this.B();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int I = n.this.I(entry.getKey());
                if (I != -1 && sc.l.a(n.this.b0(I), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return n.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iG;
            int iF;
            Map mapB = n.this.B();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (n.this.O() || (iF = o.f(entry.getKey(), entry.getValue(), (iG = n.this.G()), n.this.S(), n.this.Q(), n.this.R(), n.this.T())) == -1) {
                return false;
            }
            n.this.N(iF, iG);
            n.i(n.this);
            n.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return n.this.M();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapB = n.this.B();
            if (mapB != null) {
                return mapB.keySet().remove(obj);
            }
            return n.this.P(obj) != n.f21797j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class g extends com.google.common.collect.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21817b;

        g(int i10) {
            this.f21816a = n.this.L(i10);
            this.f21817b = i10;
        }

        private void d() {
            int i10 = this.f21817b;
            if (i10 == -1 || i10 >= n.this.size() || !sc.l.a(this.f21816a, n.this.L(this.f21817b))) {
                this.f21817b = n.this.I(this.f21816a);
            }
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public Object getKey() {
            return this.f21816a;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public Object getValue() {
            Map mapB = n.this.B();
            if (mapB != null) {
                return u0.a(mapB.get(this.f21816a));
            }
            d();
            int i10 = this.f21817b;
            return i10 == -1 ? u0.b() : n.this.b0(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapB = n.this.B();
            if (mapB != null) {
                return u0.a(mapB.put(this.f21816a, obj));
            }
            d();
            int i10 = this.f21817b;
            if (i10 == -1) {
                n.this.put(this.f21816a, obj);
                return u0.b();
            }
            Object objB0 = n.this.b0(i10);
            n.this.a0(this.f21817b, obj);
            return objB0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return n.this.c0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return n.this.size();
        }
    }

    n() {
        J(3);
    }

    public static n A(int i10) {
        return new n(i10);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G() {
        return (1 << (this.f21802e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int iC = z.c(obj);
        int iG = G();
        int iH = o.h(S(), iC & iG);
        if (iH == 0) {
            return -1;
        }
        int iB = o.b(iC, iG);
        do {
            int i10 = iH - 1;
            int iC2 = C(i10);
            if (o.b(iC2, iG) == iB && sc.l.a(obj, L(i10))) {
                return i10;
            }
            iH = o.c(iC2, iG);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(int i10) {
        return R()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f21797j;
        }
        int iG = G();
        int iF = o.f(obj, null, iG, S(), Q(), R(), null);
        if (iF == -1) {
            return f21797j;
        }
        Object objB0 = b0(iF);
        N(iF, iG);
        this.f21803f--;
        H();
        return objB0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f21799b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f21800c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S() {
        Object obj = this.f21798a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f21801d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void V(int i10) {
        int iMin;
        int length = Q().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        U(iMin);
    }

    private int W(int i10, int i11, int i12, int i13) {
        Object objA = o.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            o.i(objA, i12 & i14, i13 + 1);
        }
        Object objS = S();
        int[] iArrQ = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = o.h(objS, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrQ[i16];
                int iB = o.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = o.h(objA, i18);
                o.i(objA, i18, iH);
                iArrQ[i16] = o.d(iB, iH2, i14);
                iH = o.c(i17, i10);
            }
        }
        this.f21798a = objA;
        Y(i14);
        return i14;
    }

    private void X(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Y(int i10) {
        this.f21802e = o.d(this.f21802e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void Z(int i10, Object obj) {
        R()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i10, Object obj) {
        T()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object b0(int i10) {
        return T()[i10];
    }

    static /* synthetic */ int i(n nVar) {
        int i10 = nVar.f21803f;
        nVar.f21803f = i10 - 1;
        return i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        J(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static n v() {
        return new n();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itD = D();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    Map B() {
        Object obj = this.f21798a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator D() {
        Map mapB = B();
        return mapB != null ? mapB.entrySet().iterator() : new b();
    }

    int E() {
        return isEmpty() ? -1 : 0;
    }

    int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f21803f) {
            return i11;
        }
        return -1;
    }

    void H() {
        this.f21802e += 32;
    }

    void J(int i10) {
        sc.p.e(i10 >= 0, "Expected size must be >= 0");
        this.f21802e = com.google.common.primitives.g.f(i10, 1, 1073741823);
    }

    void K(int i10, Object obj, Object obj2, int i11, int i12) {
        X(i10, o.d(i11, 0, i12));
        Z(i10, obj);
        a0(i10, obj2);
    }

    Iterator M() {
        Map mapB = B();
        return mapB != null ? mapB.keySet().iterator() : new a();
    }

    void N(int i10, int i11) {
        Object objS = S();
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrR[i10] = null;
            objArrT[i10] = null;
            iArrQ[i10] = 0;
            return;
        }
        Object obj = objArrR[i12];
        objArrR[i10] = obj;
        objArrT[i10] = objArrT[i12];
        objArrR[i12] = null;
        objArrT[i12] = null;
        iArrQ[i10] = iArrQ[i12];
        iArrQ[i12] = 0;
        int iC = z.c(obj) & i11;
        int iH = o.h(objS, iC);
        if (iH == size) {
            o.i(objS, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrQ[i13];
            int iC2 = o.c(i14, i11);
            if (iC2 == size) {
                iArrQ[i13] = o.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean O() {
        return this.f21798a == null;
    }

    void U(int i10) {
        this.f21799b = Arrays.copyOf(Q(), i10);
        this.f21800c = Arrays.copyOf(R(), i10);
        this.f21801d = Arrays.copyOf(T(), i10);
    }

    Iterator c0() {
        Map mapB = B();
        return mapB != null ? mapB.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        H();
        Map mapB = B();
        if (mapB != null) {
            this.f21802e = com.google.common.primitives.g.f(size(), 3, 1073741823);
            mapB.clear();
            this.f21798a = null;
            this.f21803f = 0;
            return;
        }
        Arrays.fill(R(), 0, this.f21803f, (Object) null);
        Arrays.fill(T(), 0, this.f21803f, (Object) null);
        o.g(S());
        Arrays.fill(Q(), 0, this.f21803f, 0);
        this.f21803f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return I(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f21803f; i10++) {
            if (sc.l.a(obj, b0(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f21805h;
        if (set != null) {
            return set;
        }
        Set setW = w();
        this.f21805h = setW;
        return setW;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int I = I(obj);
        if (I == -1) {
            return null;
        }
        r(I);
        return b0(I);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f21804g;
        if (set != null) {
            return set;
        }
        Set setY = y();
        this.f21804g = setY;
        return setY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (O()) {
            t();
        }
        Map mapB = B();
        if (mapB != null) {
            return mapB.put(obj, obj2);
        }
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int i10 = this.f21803f;
        int i11 = i10 + 1;
        int iC = z.c(obj);
        int iG = G();
        int i12 = iC & iG;
        int iH = o.h(S(), i12);
        if (iH != 0) {
            int iB = o.b(iC, iG);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrQ[i14];
                if (o.b(i15, iG) == iB && sc.l.a(obj, objArrR[i14])) {
                    Object obj3 = objArrT[i14];
                    objArrT[i14] = obj2;
                    r(i14);
                    return obj3;
                }
                int iC2 = o.c(i15, iG);
                i13++;
                if (iC2 == 0) {
                    if (i13 < 9) {
                        if (i11 <= iG) {
                            iArrQ[i14] = o.d(i15, i11, iG);
                            break;
                        }
                        iG = W(iG, o.e(iG), iC, i10);
                        break;
                    }
                    return u().put(obj, obj2);
                }
                obj = obj;
                obj2 = obj2;
                iH = iC2;
            }
        } else if (i11 > iG) {
            iG = W(iG, o.e(iG), iC, i10);
        } else {
            o.i(S(), i12, i11);
        }
        int i16 = iG;
        V(i11);
        K(i10, obj, obj2, iC, i16);
        this.f21803f = i11;
        H();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objP = P(obj);
        if (objP == f21797j) {
            return null;
        }
        return objP;
    }

    int s(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapB = B();
        return mapB != null ? mapB.size() : this.f21803f;
    }

    int t() {
        sc.p.w(O(), "Arrays already allocated");
        int i10 = this.f21802e;
        int iJ = o.j(i10);
        this.f21798a = o.a(iJ);
        Y(iJ - 1);
        this.f21799b = new int[i10];
        this.f21800c = new Object[i10];
        this.f21801d = new Object[i10];
        return i10;
    }

    Map u() {
        Map mapX = x(G() + 1);
        int iE = E();
        while (iE >= 0) {
            mapX.put(L(iE), b0(iE));
            iE = F(iE);
        }
        this.f21798a = mapX;
        this.f21799b = null;
        this.f21800c = null;
        this.f21801d = null;
        H();
        return mapX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f21806i;
        if (collection != null) {
            return collection;
        }
        Collection collectionZ = z();
        this.f21806i = collectionZ;
        return collectionZ;
    }

    Set w() {
        return new d();
    }

    Map x(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set y() {
        return new f();
    }

    Collection z() {
        return new h();
    }

    n(int i10) {
        J(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21813c;

        private e() {
            this.f21811a = n.this.f21802e;
            this.f21812b = n.this.E();
            this.f21813c = -1;
        }

        private void a() {
            if (n.this.f21802e != this.f21811a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i10);

        void c() {
            this.f21811a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21812b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f21812b;
            this.f21813c = i10;
            Object objB = b(i10);
            this.f21812b = n.this.F(this.f21812b);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            l.c(this.f21813c >= 0);
            c();
            n nVar = n.this;
            nVar.remove(nVar.L(this.f21813c));
            this.f21812b = n.this.s(this.f21812b, this.f21813c);
            this.f21813c = -1;
        }

        /* synthetic */ e(n nVar, a aVar) {
            this();
        }
    }

    void r(int i10) {
    }
}
