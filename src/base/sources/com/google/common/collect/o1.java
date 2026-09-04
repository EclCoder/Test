package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends h implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient g f21827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient y f21828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient f f21829g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends s0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f21830a;

        a(f fVar) {
            this.f21830a = fVar;
        }

        @Override // com.google.common.collect.r0.a
        public Object d() {
            return this.f21830a.x();
        }

        @Override // com.google.common.collect.r0.a
        public int getCount() {
            int iW = this.f21830a.w();
            return iW == 0 ? o1.this.g0(d()) : iW;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f21832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r0.a f21833b;

        b() {
            this.f21832a = o1.this.E();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0.a next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            o1 o1Var = o1.this;
            f fVar = this.f21832a;
            Objects.requireNonNull(fVar);
            r0.a aVarJ = o1Var.J(fVar);
            this.f21833b = aVarJ;
            if (this.f21832a.L() == o1.this.f21829g) {
                this.f21832a = null;
                return aVarJ;
            }
            this.f21832a = this.f21832a.L();
            return aVarJ;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21832a == null) {
                return false;
            }
            if (!o1.this.f21828f.o(this.f21832a.x())) {
                return true;
            }
            this.f21832a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            sc.p.w(this.f21833b != null, "no calls to next() since the last call to remove()");
            o1.this.G(this.f21833b.d(), 0);
            this.f21833b = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f21835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r0.a f21836b = null;

        c() {
            this.f21835a = o1.this.F();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0.a next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f21835a);
            r0.a aVarJ = o1.this.J(this.f21835a);
            this.f21836b = aVarJ;
            if (this.f21835a.z() == o1.this.f21829g) {
                this.f21835a = null;
                return aVarJ;
            }
            this.f21835a = this.f21835a.z();
            return aVarJ;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21835a == null) {
                return false;
            }
            if (!o1.this.f21828f.p(this.f21835a.x())) {
                return true;
            }
            this.f21835a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            sc.p.w(this.f21836b != null, "no calls to next() since the last call to remove()");
            o1.this.G(this.f21836b.d(), 0);
            this.f21836b = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21838a;

        static {
            int[] iArr = new int[j.values().length];
            f21838a = iArr;
            try {
                iArr[j.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21838a[j.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f21839a = new a("SIZE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21840b = new b("DISTINCT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ e[] f21841c = d();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum a extends e {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o1.e
            int e(f fVar) {
                return fVar.f21843b;
            }

            @Override // com.google.common.collect.o1.e
            long g(f fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return fVar.f21845d;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum b extends e {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o1.e
            int e(f fVar) {
                return 1;
            }

            @Override // com.google.common.collect.o1.e
            long g(f fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return fVar.f21844c;
            }
        }

        private e(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ e[] d() {
            return new e[]{f21839a, f21840b};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f21841c.clone();
        }

        abstract int e(f fVar);

        abstract long g(f fVar);

        /* synthetic */ e(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f21851a;

        private g() {
        }

        public void a(Object obj, Object obj2) {
            if (this.f21851a != obj) {
                throw new ConcurrentModificationException();
            }
            this.f21851a = obj2;
        }

        void b() {
            this.f21851a = null;
        }

        public Object c() {
            return this.f21851a;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    o1(g gVar, y yVar, f fVar) {
        super(yVar.d());
        this.f21827e = gVar;
        this.f21828f = yVar;
        this.f21829g = fVar;
    }

    private long A(e eVar, f fVar) {
        long jG;
        long jA;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(u0.a(this.f21828f.i()), fVar.x());
        if (iCompare < 0) {
            return A(eVar, fVar.f21847f);
        }
        if (iCompare == 0) {
            int i10 = d.f21838a[this.f21828f.h().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return eVar.g(fVar.f21847f);
                }
                throw new AssertionError();
            }
            jG = eVar.e(fVar);
            jA = eVar.g(fVar.f21847f);
        } else {
            jG = eVar.g(fVar.f21847f) + ((long) eVar.e(fVar));
            jA = A(eVar, fVar.f21848g);
        }
        return jG + jA;
    }

    private long B(e eVar) {
        f fVar = (f) this.f21827e.c();
        long jG = eVar.g(fVar);
        if (this.f21828f.l()) {
            jG -= A(eVar, fVar);
        }
        return this.f21828f.m() ? jG - z(eVar, fVar) : jG;
    }

    public static o1 C() {
        return new o1(w0.d());
    }

    static int D(f fVar) {
        if (fVar == null) {
            return 0;
        }
        return fVar.f21844c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f E() {
        f fVarL;
        f fVar = (f) this.f21827e.c();
        if (fVar == null) {
            return null;
        }
        if (this.f21828f.l()) {
            Object objA = u0.a(this.f21828f.i());
            fVarL = fVar.s(comparator(), objA);
            if (fVarL == null) {
                return null;
            }
            if (this.f21828f.h() == j.OPEN && comparator().compare(objA, fVarL.x()) == 0) {
                fVarL = fVarL.L();
            }
        } else {
            fVarL = this.f21829g.L();
        }
        if (fVarL == this.f21829g || !this.f21828f.e(fVarL.x())) {
            return null;
        }
        return fVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f F() {
        f fVarZ;
        f fVar = (f) this.f21827e.c();
        if (fVar == null) {
            return null;
        }
        if (this.f21828f.m()) {
            Object objA = u0.a(this.f21828f.k());
            fVarZ = fVar.v(comparator(), objA);
            if (fVarZ == null) {
                return null;
            }
            if (this.f21828f.j() == j.OPEN && comparator().compare(objA, fVarZ.x()) == 0) {
                fVarZ = fVarZ.z();
            }
        } else {
            fVarZ = this.f21829g.z();
        }
        if (fVarZ == this.f21829g || !this.f21828f.e(fVarZ.x())) {
            return null;
        }
        return fVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(f fVar, f fVar2) {
        fVar.f21850i = fVar2;
        fVar2.f21849h = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(f fVar, f fVar2, f fVar3) {
        H(fVar, fVar2);
        H(fVar2, fVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r0.a J(f fVar) {
        return new a(fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        e1.a(h.class, "comparator").b(this, comparator);
        e1.a(o1.class, "range").b(this, y.a(comparator));
        e1.a(o1.class, "rootReference").b(this, new g(null));
        f fVar = new f();
        e1.a(o1.class, "header").b(this, fVar);
        H(fVar, fVar);
        e1.b(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(l().comparator());
        e1.e(this, objectOutputStream);
    }

    private long z(e eVar, f fVar) {
        long jG;
        long jZ;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(u0.a(this.f21828f.k()), fVar.x());
        if (iCompare > 0) {
            return z(eVar, fVar.f21848g);
        }
        if (iCompare == 0) {
            int i10 = d.f21838a[this.f21828f.j().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return eVar.g(fVar.f21848g);
                }
                throw new AssertionError();
            }
            jG = eVar.e(fVar);
            jZ = eVar.g(fVar.f21848g);
        } else {
            jG = eVar.g(fVar.f21848g) + ((long) eVar.e(fVar));
            jZ = z(eVar, fVar.f21847f);
        }
        return jG + jZ;
    }

    public int G(Object obj, int i10) {
        l.b(i10, "count");
        if (!this.f21828f.e(obj)) {
            sc.p.d(i10 == 0);
            return 0;
        }
        f fVar = (f) this.f21827e.c();
        if (fVar == null) {
            if (i10 > 0) {
                s(obj, i10);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f21827e.a(fVar, fVar.K(comparator(), obj, i10, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.r0
    public boolean c0(Object obj, int i10, int i11) {
        l.b(i11, "newCount");
        l.b(i10, "oldCount");
        sc.p.d(this.f21828f.e(obj));
        f fVar = (f) this.f21827e.c();
        if (fVar != null) {
            int[] iArr = new int[1];
            this.f21827e.a(fVar, fVar.J(comparator(), obj, i10, i11, iArr));
            return iArr[0] == i10;
        }
        if (i10 != 0) {
            return false;
        }
        if (i11 > 0) {
            s(obj, i11);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f21828f.l() || this.f21828f.m()) {
            j0.c(k());
            return;
        }
        f fVarL = this.f21829g.L();
        while (true) {
            f fVar = this.f21829g;
            if (fVarL == fVar) {
                H(fVar, fVar);
                this.f21827e.b();
                return;
            }
            f fVarL2 = fVarL.L();
            fVarL.f21843b = 0;
            fVarL.f21847f = null;
            fVarL.f21848g = null;
            fVarL.f21849h = null;
            fVarL.f21850i = null;
            fVarL = fVarL2;
        }
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1, com.google.common.collect.i1
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.g, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.k1
    public k1 d0(Object obj, j jVar) {
        return new o1(this.f21827e, this.f21828f.n(y.q(comparator(), obj, jVar)), this.f21829g);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ r0.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.r0
    public int g0(Object obj) {
        try {
            f fVar = (f) this.f21827e.c();
            if (this.f21828f.e(obj) && fVar != null) {
                return fVar.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.g
    int h() {
        return com.google.common.primitives.g.m(B(e.f21840b));
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ k1 i(Object obj, j jVar, Object obj2, j jVar2) {
        return super.i(obj, jVar, obj2, jVar2);
    }

    @Override // com.google.common.collect.k1
    public k1 i0(Object obj, j jVar) {
        return new o1(this.f21827e, this.f21828f.n(y.g(comparator(), obj, jVar)), this.f21829g);
    }

    @Override // com.google.common.collect.g, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return s0.g(this);
    }

    @Override // com.google.common.collect.g
    Iterator k() {
        return new b();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.g, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ NavigableSet l() {
        return super.l();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ r0.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.h
    Iterator o() {
        return new c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ r0.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ r0.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.r0
    public int q(Object obj, int i10) {
        l.b(i10, "occurrences");
        if (i10 == 0) {
            return g0(obj);
        }
        f fVar = (f) this.f21827e.c();
        int[] iArr = new int[1];
        try {
            if (this.f21828f.e(obj) && fVar != null) {
                this.f21827e.a(fVar, fVar.E(comparator(), obj, i10, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.r0
    public int s(Object obj, int i10) {
        l.b(i10, "occurrences");
        if (i10 == 0) {
            return g0(obj);
        }
        sc.p.d(this.f21828f.e(obj));
        f fVar = (f) this.f21827e.c();
        if (fVar != null) {
            int[] iArr = new int[1];
            this.f21827e.a(fVar, fVar.o(comparator(), obj, i10, iArr));
            return iArr[0];
        }
        comparator().compare(obj, obj);
        f fVar2 = new f(obj, i10);
        f fVar3 = this.f21829g;
        I(fVar3, fVar2, fVar3);
        this.f21827e.a(fVar, fVar2);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.r0
    public int size() {
        return com.google.common.primitives.g.m(B(e.f21839a));
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k1
    public /* bridge */ /* synthetic */ k1 t() {
        return super.t();
    }

    o1(Comparator comparator) {
        super(comparator);
        this.f21828f = y.a(comparator);
        f fVar = new f();
        this.f21829g = fVar;
        H(fVar, fVar);
        this.f21827e = new g(null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f21845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f f21847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f f21848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f21849h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f f21850i;

        f(Object obj, int i10) {
            sc.p.d(i10 > 0);
            this.f21842a = obj;
            this.f21843b = i10;
            this.f21845d = i10;
            this.f21844c = 1;
            this.f21846e = 1;
            this.f21847f = null;
            this.f21848g = null;
        }

        private f A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.f21848g);
                if (this.f21848g.r() > 0) {
                    this.f21848g = this.f21848g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f21847f);
            if (this.f21847f.r() < 0) {
                this.f21847f = this.f21847f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.f21846e = Math.max(y(this.f21847f), y(this.f21848g)) + 1;
        }

        private void D() {
            this.f21844c = o1.D(this.f21847f) + 1 + o1.D(this.f21848g);
            this.f21845d = ((long) this.f21843b) + M(this.f21847f) + M(this.f21848g);
        }

        private f F(f fVar) {
            f fVar2 = this.f21848g;
            if (fVar2 == null) {
                return this.f21847f;
            }
            this.f21848g = fVar2.F(fVar);
            this.f21844c--;
            this.f21845d -= (long) fVar.f21843b;
            return A();
        }

        private f G(f fVar) {
            f fVar2 = this.f21847f;
            if (fVar2 == null) {
                return this.f21848g;
            }
            this.f21847f = fVar2.G(fVar);
            this.f21844c--;
            this.f21845d -= (long) fVar.f21843b;
            return A();
        }

        private f H() {
            sc.p.v(this.f21848g != null);
            f fVar = this.f21848g;
            this.f21848g = fVar.f21847f;
            fVar.f21847f = this;
            fVar.f21845d = this.f21845d;
            fVar.f21844c = this.f21844c;
            B();
            fVar.C();
            return fVar;
        }

        private f I() {
            sc.p.v(this.f21847f != null);
            f fVar = this.f21847f;
            this.f21847f = fVar.f21848g;
            fVar.f21848g = this;
            fVar.f21845d = this.f21845d;
            fVar.f21844c = this.f21844c;
            B();
            fVar.C();
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f L() {
            f fVar = this.f21850i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        private static long M(f fVar) {
            if (fVar == null) {
                return 0L;
            }
            return fVar.f21845d;
        }

        private f p(Object obj, int i10) {
            this.f21847f = new f(obj, i10);
            o1.I(z(), this.f21847f, this);
            this.f21846e = Math.max(2, this.f21846e);
            this.f21844c++;
            this.f21845d += (long) i10;
            return this;
        }

        private f q(Object obj, int i10) {
            f fVar = new f(obj, i10);
            this.f21848g = fVar;
            o1.I(this, fVar, L());
            this.f21846e = Math.max(2, this.f21846e);
            this.f21844c++;
            this.f21845d += (long) i10;
            return this;
        }

        private int r() {
            return y(this.f21847f) - y(this.f21848g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f s(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar != null) {
                    return (f) sc.j.a(fVar.s(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                f fVar2 = this.f21848g;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.s(comparator, obj);
            }
            return this;
        }

        private f u() {
            int i10 = this.f21843b;
            this.f21843b = 0;
            o1.H(z(), L());
            f fVar = this.f21847f;
            if (fVar == null) {
                return this.f21848g;
            }
            f fVar2 = this.f21848g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.f21846e >= fVar2.f21846e) {
                f fVarZ = z();
                fVarZ.f21847f = this.f21847f.F(fVarZ);
                fVarZ.f21848g = this.f21848g;
                fVarZ.f21844c = this.f21844c - 1;
                fVarZ.f21845d = this.f21845d - ((long) i10);
                return fVarZ.A();
            }
            f fVarL = L();
            fVarL.f21848g = this.f21848g.G(fVarL);
            fVarL.f21847f = this.f21847f;
            fVarL.f21844c = this.f21844c - 1;
            fVarL.f21845d = this.f21845d - ((long) i10);
            return fVarL.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f v(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare > 0) {
                f fVar = this.f21848g;
                if (fVar != null) {
                    return (f) sc.j.a(fVar.v(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                f fVar2 = this.f21847f;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.v(comparator, obj);
            }
            return this;
        }

        private static int y(f fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.f21846e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f z() {
            f fVar = this.f21849h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        f E(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f21847f = fVar.E(comparator, obj, i10, iArr);
                int i11 = iArr[0];
                if (i11 > 0) {
                    if (i10 >= i11) {
                        this.f21844c--;
                        this.f21845d -= (long) i11;
                    } else {
                        this.f21845d -= (long) i10;
                    }
                }
                return i11 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i12 = this.f21843b;
                iArr[0] = i12;
                if (i10 >= i12) {
                    return u();
                }
                this.f21843b = i12 - i10;
                this.f21845d -= (long) i10;
                return this;
            }
            f fVar2 = this.f21848g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f21848g = fVar2.E(comparator, obj, i10, iArr);
            int i13 = iArr[0];
            if (i13 > 0) {
                if (i10 >= i13) {
                    this.f21844c--;
                    this.f21845d -= (long) i13;
                } else {
                    this.f21845d -= (long) i10;
                }
            }
            return A();
        }

        f J(Comparator comparator, Object obj, int i10, int i11, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar != null) {
                    this.f21847f = fVar.J(comparator, obj, i10, i11, iArr);
                    int i12 = iArr[0];
                    if (i12 == i10) {
                        if (i11 == 0 && i12 != 0) {
                            this.f21844c--;
                        } else if (i11 > 0 && i12 == 0) {
                            this.f21844c++;
                        }
                        this.f21845d += (long) (i11 - i12);
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return p(obj, i11);
                }
            } else if (iCompare > 0) {
                f fVar2 = this.f21848g;
                if (fVar2 != null) {
                    this.f21848g = fVar2.J(comparator, obj, i10, i11, iArr);
                    int i13 = iArr[0];
                    if (i13 == i10) {
                        if (i11 == 0 && i13 != 0) {
                            this.f21844c--;
                        } else if (i11 > 0 && i13 == 0) {
                            this.f21844c++;
                        }
                        this.f21845d += (long) (i11 - i13);
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return q(obj, i11);
                }
            } else {
                int i14 = this.f21843b;
                iArr[0] = i14;
                if (i10 == i14) {
                    if (i11 == 0) {
                        return u();
                    }
                    this.f21845d += (long) (i11 - i14);
                    this.f21843b = i11;
                }
            }
            return this;
        }

        f K(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar != null) {
                    this.f21847f = fVar.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f21844c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f21844c++;
                    }
                    this.f21845d += (long) (i10 - iArr[0]);
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return p(obj, i10);
                }
            } else {
                if (iCompare <= 0) {
                    int i11 = this.f21843b;
                    iArr[0] = i11;
                    if (i10 == 0) {
                        return u();
                    }
                    this.f21845d += (long) (i10 - i11);
                    this.f21843b = i10;
                    return this;
                }
                f fVar2 = this.f21848g;
                if (fVar2 != null) {
                    this.f21848g = fVar2.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f21844c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f21844c++;
                    }
                    this.f21845d += (long) (i10 - iArr[0]);
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return q(obj, i10);
                }
            }
            return this;
        }

        f o(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return p(obj, i10);
                }
                int i11 = fVar.f21846e;
                f fVarO = fVar.o(comparator, obj, i10, iArr);
                this.f21847f = fVarO;
                if (iArr[0] == 0) {
                    this.f21844c++;
                }
                this.f21845d += (long) i10;
                if (fVarO.f21846e != i11) {
                    return A();
                }
            } else {
                if (iCompare <= 0) {
                    int i12 = this.f21843b;
                    iArr[0] = i12;
                    long j10 = i10;
                    sc.p.d(((long) i12) + j10 <= 2147483647L);
                    this.f21843b += i10;
                    this.f21845d += j10;
                    return this;
                }
                f fVar2 = this.f21848g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return q(obj, i10);
                }
                int i13 = fVar2.f21846e;
                f fVarO2 = fVar2.o(comparator, obj, i10, iArr);
                this.f21848g = fVarO2;
                if (iArr[0] == 0) {
                    this.f21844c++;
                }
                this.f21845d += (long) i10;
                if (fVarO2.f21846e != i13) {
                    return A();
                }
            }
            return this;
        }

        int t(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                f fVar = this.f21847f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, obj);
            }
            if (iCompare <= 0) {
                return this.f21843b;
            }
            f fVar2 = this.f21848g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.t(comparator, obj);
        }

        public String toString() {
            return s0.f(x(), w()).toString();
        }

        int w() {
            return this.f21843b;
        }

        Object x() {
            return u0.a(this.f21842a);
        }

        f() {
            this.f21842a = null;
            this.f21843b = 1;
        }
    }
}
