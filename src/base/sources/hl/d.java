package hl;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Map, Serializable, ul.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f40435n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final d f40436o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f40437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f40438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f40439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f40440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private hl.f f40446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f40447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private hl.e f40448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40449m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(yl.g.d(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f40436o;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends C0612d implements Iterator, ul.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            s.h(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= d().f40442f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            c cVar = new c(d(), c());
            f();
            return cVar;
        }

        public final void j(StringBuilder sb2) {
            s.h(sb2, "sb");
            if (b() >= d().f40442f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f40437a[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = d().f40438b;
            s.e(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        public final int l() {
            if (b() >= d().f40442f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f40437a[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = d().f40438b;
            s.e(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements Map.Entry, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f40450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40452c;

        public c(d map, int i10) {
            s.h(map, "map");
            this.f40450a = map;
            this.f40451b = i10;
            this.f40452c = map.f40444h;
        }

        private final void a() {
            if (this.f40450a.f40444h != this.f40452c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return s.c(entry.getKey(), getKey()) && s.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f40450a.f40437a[this.f40451b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f40450a.f40438b;
            s.e(objArr);
            return objArr[this.f40451b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f40450a.q();
            Object[] objArrO = this.f40450a.o();
            int i10 = this.f40451b;
            Object obj2 = objArrO[i10];
            objArrO[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: hl.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0612d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f40453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40456d;

        public C0612d(d map) {
            s.h(map, "map");
            this.f40453a = map;
            this.f40455c = -1;
            this.f40456d = map.f40444h;
            f();
        }

        public final void a() {
            if (this.f40453a.f40444h != this.f40456d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f40454b;
        }

        public final int c() {
            return this.f40455c;
        }

        public final d d() {
            return this.f40453a;
        }

        public final void f() {
            while (this.f40454b < this.f40453a.f40442f) {
                int[] iArr = this.f40453a.f40439c;
                int i10 = this.f40454b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f40454b = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f40454b = i10;
        }

        public final void h(int i10) {
            this.f40455c = i10;
        }

        public final boolean hasNext() {
            return this.f40454b < this.f40453a.f40442f;
        }

        public final void remove() {
            a();
            if (this.f40455c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f40453a.q();
            this.f40453a.P(this.f40455c);
            this.f40455c = -1;
            this.f40456d = this.f40453a.f40444h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends C0612d implements Iterator, ul.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            s.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f40442f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f40437a[c()];
            f();
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends C0612d implements Iterator, ul.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            s.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f40442f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object[] objArr = d().f40438b;
            s.e(objArr);
            Object obj = objArr[c()];
            f();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f40449m = true;
        f40436o = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f40437a = objArr;
        this.f40438b = objArr2;
        this.f40439c = iArr;
        this.f40440d = iArr2;
        this.f40441e = i10;
        this.f40442f = i11;
        this.f40443g = f40435n.d(C());
    }

    private final int C() {
        return this.f40440d.length;
    }

    private final int G(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f40443g;
    }

    private final boolean J(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (K((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean K(Map.Entry entry) {
        int iN = n(entry.getKey());
        Object[] objArrO = o();
        if (iN >= 0) {
            objArrO[iN] = entry.getValue();
            return true;
        }
        int i10 = (-iN) - 1;
        if (s.c(entry.getValue(), objArrO[i10])) {
            return false;
        }
        objArrO[i10] = entry.getValue();
        return true;
    }

    private final boolean L(int i10) {
        int iG = G(this.f40437a[i10]);
        int i11 = this.f40441e;
        while (true) {
            int[] iArr = this.f40440d;
            if (iArr[iG] == 0) {
                iArr[iG] = i10 + 1;
                this.f40439c[i10] = iG;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iG = iG == 0 ? C() - 1 : iG - 1;
        }
    }

    private final void M() {
        this.f40444h++;
    }

    private final void N(int i10) {
        M();
        int i11 = 0;
        if (this.f40442f > size()) {
            r(false);
        }
        this.f40440d = new int[i10];
        this.f40443g = f40435n.d(i10);
        while (i11 < this.f40442f) {
            int i12 = i11 + 1;
            if (!L(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int i10) {
        hl.c.f(this.f40437a, i10);
        Object[] objArr = this.f40438b;
        if (objArr != null) {
            hl.c.f(objArr, i10);
        }
        Q(this.f40439c[i10]);
        this.f40439c[i10] = -1;
        this.f40445i = size() - 1;
        M();
    }

    private final void Q(int i10) {
        int iF = yl.g.f(this.f40441e * 2, C() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? C() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f40441e) {
                this.f40440d[i12] = 0;
                return;
            }
            int[] iArr = this.f40440d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((G(this.f40437a[i14]) - i10) & (C() - 1)) >= i11) {
                    this.f40440d[i12] = i13;
                    this.f40439c[i14] = i12;
                }
                iF--;
            }
            i12 = i10;
            i11 = 0;
            iF--;
        } while (iF >= 0);
        this.f40440d[i12] = -1;
    }

    private final boolean T(int i10) {
        int iA = A();
        int i11 = this.f40442f;
        int i12 = iA - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= A() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] o() {
        Object[] objArr = this.f40438b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = hl.c.d(A());
        this.f40438b = objArrD;
        return objArrD;
    }

    private final void r(boolean z10) {
        int i10;
        Object[] objArr = this.f40438b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f40442f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f40439c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f40437a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f40440d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        hl.c.g(this.f40437a, i12, i10);
        if (objArr != null) {
            hl.c.g(objArr, i12, this.f40442f);
        }
        this.f40442f = i12;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final boolean u(Map map) {
        return size() == map.size() && s(map.entrySet());
    }

    private final void v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > A()) {
            int iE = gl.d.f39316a.e(A(), i10);
            this.f40437a = hl.c.e(this.f40437a, iE);
            Object[] objArr = this.f40438b;
            this.f40438b = objArr != null ? hl.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f40439c, iE);
            s.g(iArrCopyOf, "copyOf(...)");
            this.f40439c = iArrCopyOf;
            int iC = f40435n.c(iE);
            if (iC > C()) {
                N(iC);
            }
        }
    }

    private final void w(int i10) {
        if (T(i10)) {
            r(true);
        } else {
            v(this.f40442f + i10);
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f40449m) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int y(Object obj) {
        int iG = G(obj);
        int i10 = this.f40441e;
        while (true) {
            int i11 = this.f40440d[iG];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (s.c(this.f40437a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iG = iG == 0 ? C() - 1 : iG - 1;
        }
    }

    private final int z(Object obj) {
        int i10 = this.f40442f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f40439c[i10] >= 0) {
                Object[] objArr = this.f40438b;
                s.e(objArr);
                if (s.c(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public final int A() {
        return this.f40437a.length;
    }

    public Set B() {
        hl.e eVar = this.f40448l;
        if (eVar != null) {
            return eVar;
        }
        hl.e eVar2 = new hl.e(this);
        this.f40448l = eVar2;
        return eVar2;
    }

    public Set D() {
        hl.f fVar = this.f40446j;
        if (fVar != null) {
            return fVar;
        }
        hl.f fVar2 = new hl.f(this);
        this.f40446j = fVar2;
        return fVar2;
    }

    public int E() {
        return this.f40445i;
    }

    public Collection F() {
        g gVar = this.f40447k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f40447k = gVar2;
        return gVar2;
    }

    public final boolean H() {
        return this.f40449m;
    }

    public final e I() {
        return new e(this);
    }

    public final boolean O(Map.Entry entry) {
        s.h(entry, "entry");
        q();
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        Object[] objArr = this.f40438b;
        s.e(objArr);
        if (!s.c(objArr[iY], entry.getValue())) {
            return false;
        }
        P(iY);
        return true;
    }

    public final boolean R(Object obj) {
        q();
        int iY = y(obj);
        if (iY < 0) {
            return false;
        }
        P(iY);
        return true;
    }

    public final boolean S(Object obj) {
        q();
        int iZ = z(obj);
        if (iZ < 0) {
            return false;
        }
        P(iZ);
        return true;
    }

    public final f U() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        q();
        int i10 = this.f40442f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f40439c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f40440d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        hl.c.g(this.f40437a, 0, this.f40442f);
        Object[] objArr = this.f40438b;
        if (objArr != null) {
            hl.c.g(objArr, 0, this.f40442f);
        }
        this.f40445i = 0;
        this.f40442f = 0;
        M();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return y(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && u((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        Object[] objArr = this.f40438b;
        s.e(objArr);
        return objArr[iY];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarX = x();
        int iL = 0;
        while (bVarX.hasNext()) {
            iL += bVarX.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return D();
    }

    public final int n(Object obj) {
        q();
        while (true) {
            int iG = G(obj);
            int iF = yl.g.f(this.f40441e * 2, C() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f40440d[iG];
                if (i11 <= 0) {
                    if (this.f40442f >= A()) {
                        w(1);
                        break;
                    }
                    int i12 = this.f40442f;
                    int i13 = i12 + 1;
                    this.f40442f = i13;
                    this.f40437a[i12] = obj;
                    this.f40439c[i12] = iG;
                    this.f40440d[iG] = i13;
                    this.f40445i = size() + 1;
                    M();
                    if (i10 > this.f40441e) {
                        this.f40441e = i10;
                    }
                    return i12;
                }
                if (s.c(this.f40437a[i11 - 1], obj)) {
                    return -i11;
                }
                i10++;
                if (i10 > iF) {
                    N(C() * 2);
                    break;
                }
                iG = iG == 0 ? C() - 1 : iG - 1;
            }
        }
    }

    public final Map p() {
        q();
        this.f40449m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f40436o;
        s.f(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        q();
        int iN = n(obj);
        Object[] objArrO = o();
        if (iN >= 0) {
            objArrO[iN] = obj2;
            return null;
        }
        int i10 = (-iN) - 1;
        Object obj3 = objArrO[i10];
        objArrO[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        s.h(from, "from");
        q();
        J(from.entrySet());
    }

    public final void q() {
        if (this.f40449m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        q();
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        Object[] objArr = this.f40438b;
        s.e(objArr);
        Object obj2 = objArr[iY];
        P(iY);
        return obj2;
    }

    public final boolean s(Collection m10) {
        s.h(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    public final boolean t(Map.Entry entry) {
        s.h(entry, "entry");
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        Object[] objArr = this.f40438b;
        s.e(objArr);
        return s.c(objArr[iY], entry.getValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarX = x();
        int i10 = 0;
        while (bVarX.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarX.j(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        s.g(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return F();
    }

    public final b x() {
        return new b(this);
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(hl.c.d(i10), null, new int[i10], new int[f40435n.c(i10)], 2, 0);
    }
}
