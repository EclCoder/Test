package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set, ul.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f1900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1901c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends k {
        public a() {
            super(b.this.g());
        }

        @Override // androidx.collection.k
        protected Object a(int i10) {
            return b.this.o(i10);
        }

        @Override // androidx.collection.k
        protected void b(int i10) {
            b.this.h(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int iG = g();
        if (d().length < i10) {
            int[] iArrD = d();
            Object[] objArrB = b();
            d.a(this, i10);
            if (g() > 0) {
                gl.j.n(iArrD, d(), 0, 0, g(), 6, null);
                gl.j.o(objArrB, b(), 0, 0, g(), 6, null);
            }
        }
        if (g() != iG) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iG = g();
        if (obj == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iG >= d().length) {
            int i12 = 8;
            if (iG >= 8) {
                i12 = (iG >> 1) + iG;
            } else if (iG < 4) {
                i12 = 4;
            }
            int[] iArrD = d();
            Object[] objArrB = b();
            d.a(this, i12);
            if (iG != g()) {
                throw new ConcurrentModificationException();
            }
            if (!(d().length == 0)) {
                gl.j.n(iArrD, d(), 0, 0, iArrD.length, 6, null);
                gl.j.o(objArrB, b(), 0, 0, objArrB.length, 6, null);
            }
        }
        if (i11 < iG) {
            int i13 = i11 + 1;
            gl.j.i(d(), d(), i13, i11, iG);
            gl.j.k(b(), b(), i13, i11, iG);
        }
        if (iG != g() || i11 >= d().length) {
            throw new ConcurrentModificationException();
        }
        d()[i11] = i10;
        b()[i11] = obj;
        n(g() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        a(g() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object[] b() {
        return this.f1900b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (g() != 0) {
            m(s.a.f51434a);
            k(s.a.f51436c);
            n(0);
        }
        if (g() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int[] d() {
        return this.f1899a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iG = g();
            for (int i10 = 0; i10 < iG; i10++) {
                if (!((Set) obj).contains(o(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int f() {
        return this.f1901c;
    }

    public final int g() {
        return this.f1901c;
    }

    public final Object h(int i10) {
        int i11;
        Object[] objArr;
        int iG = g();
        Object obj = b()[i10];
        if (iG <= 1) {
            clear();
            return obj;
        }
        int i12 = iG - 1;
        if (d().length <= 8 || g() >= d().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                gl.j.i(d(), d(), i10, i13, iG);
                gl.j.k(b(), b(), i10, i13, iG);
            }
            b()[i12] = null;
        } else {
            int iG2 = g() > 8 ? g() + (g() >> 1) : 8;
            int[] iArrD = d();
            Object[] objArrB = b();
            d.a(this, iG2);
            if (i10 > 0) {
                gl.j.n(iArrD, d(), 0, 0, i10, 6, null);
                objArr = objArrB;
                gl.j.o(objArr, b(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrB;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                gl.j.i(iArrD, d(), i11, i14, iG);
                gl.j.k(objArr, b(), i11, i14, iG);
            }
        }
        if (iG != g()) {
            throw new ConcurrentModificationException();
        }
        n(i12);
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrD = d();
        int iG = g();
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            i10 += iArrD[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return g() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void k(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<set-?>");
        this.f1900b = objArr;
    }

    public final void m(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<set-?>");
        this.f1899a = iArr;
    }

    public final void n(int i10) {
        this.f1901c = i10;
    }

    public final Object o(int i10) {
        return b()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        boolean z10 = false;
        for (int iG = g() - 1; -1 < iG; iG--) {
            if (!gl.r.U(elements, b()[iG])) {
                h(iG);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return gl.j.q(this.f1900b, 0, this.f1901c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(g() * 14);
        sb2.append('{');
        int iG = g();
        for (int i10 = 0; i10 < iG; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objO = o(i10);
            if (objO != this) {
                sb2.append(objO);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public b(int i10) {
        this.f1899a = s.a.f51434a;
        this.f1900b = s.a.f51436c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        Object[] objArrA = c.a(array, this.f1901c);
        gl.j.k(this.f1900b, objArrA, 0, 0, this.f1901c);
        kotlin.jvm.internal.s.e(objArrA);
        return objArrA;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public b(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
