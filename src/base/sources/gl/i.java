package gl;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39331d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f39332e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f39334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39335c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f39332e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(Saucuwx.fyK + i10);
            }
            objArr = new Object[i10];
        }
        this.f39334b = objArr;
    }

    private final void A(int i10, int i11) {
        int iW = w(this.f39333a + (i10 - 1));
        int iW2 = w(this.f39333a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iW + 1;
            int iMin = Math.min(i10, Math.min(i12, iW2 + 1));
            Object[] objArr = this.f39334b;
            int i13 = iW2 - iMin;
            int i14 = iW - iMin;
            m.k(objArr, objArr, i13 + 1, i14 + 1, i12);
            iW = u(i14);
            iW2 = u(i13);
            i10 -= iMin;
        }
    }

    private final void B(int i10, int i11) {
        int iW = w(this.f39333a + i11);
        int iW2 = w(this.f39333a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f39334b;
            i11 = Math.min(size, Math.min(objArr.length - iW, objArr.length - iW2));
            Object[] objArr2 = this.f39334b;
            int i12 = iW + i11;
            m.k(objArr2, objArr2, iW2, iW, i12);
            iW = w(i12);
            iW2 = w(iW2 + i11);
        }
    }

    private final void h(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f39334b.length;
        while (i10 < length && it.hasNext()) {
            this.f39334b[i10] = it.next();
            i10++;
        }
        int i11 = this.f39333a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f39334b[i12] = it.next();
        }
        this.f39335c = size() + collection.size();
    }

    private final void k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f39334b;
        m.k(objArr2, objArr, 0, this.f39333a, objArr2.length);
        Object[] objArr3 = this.f39334b;
        int length = objArr3.length;
        int i11 = this.f39333a;
        m.k(objArr3, objArr, length - i11, 0, i11);
        this.f39333a = 0;
        this.f39334b = objArr;
    }

    private final int m(int i10) {
        return i10 == 0 ? o.W(this.f39334b) : i10 - 1;
    }

    private final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f39334b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f39332e) {
            this.f39334b = new Object[yl.g.d(i10, 10)];
        } else {
            k(d.f39316a.e(objArr.length, i10));
        }
    }

    private final int p(int i10) {
        if (i10 == o.W(this.f39334b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int u(int i10) {
        return i10 < 0 ? i10 + this.f39334b.length : i10;
    }

    private final void v(int i10, int i11) {
        if (i10 < i11) {
            m.u(this.f39334b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f39334b;
        m.u(objArr, null, i10, objArr.length);
        m.u(this.f39334b, null, 0, i11);
    }

    private final int w(int i10) {
        Object[] objArr = this.f39334b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void x() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        x();
        n(size() + elements.size());
        h(w(this.f39333a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        x();
        n(size() + 1);
        int iM = m(this.f39333a);
        this.f39333a = iM;
        this.f39334b[iM] = obj;
        this.f39335c = size() + 1;
    }

    public final void addLast(Object obj) {
        x();
        n(size() + 1);
        this.f39334b[w(this.f39333a + size())] = obj;
        this.f39335c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            x();
            v(this.f39333a, w(this.f39333a + size()));
        }
        this.f39333a = 0;
        this.f39335c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // gl.f
    public int d() {
        return this.f39335c;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f39334b[this.f39333a];
    }

    @Override // gl.f
    public Object g(int i10) {
        d.f39316a.b(i10, size());
        if (i10 == t.n(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        x();
        int iW = w(this.f39333a + i10);
        Object obj = this.f39334b[iW];
        if (i10 < (size() >> 1)) {
            int i11 = this.f39333a;
            if (iW >= i11) {
                Object[] objArr = this.f39334b;
                m.k(objArr, objArr, i11 + 1, i11, iW);
            } else {
                Object[] objArr2 = this.f39334b;
                m.k(objArr2, objArr2, 1, 0, iW);
                Object[] objArr3 = this.f39334b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f39333a;
                m.k(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f39334b;
            int i13 = this.f39333a;
            objArr4[i13] = null;
            this.f39333a = p(i13);
        } else {
            int iW2 = w(this.f39333a + t.n(this));
            if (iW <= iW2) {
                Object[] objArr5 = this.f39334b;
                m.k(objArr5, objArr5, iW, iW + 1, iW2 + 1);
            } else {
                Object[] objArr6 = this.f39334b;
                m.k(objArr6, objArr6, iW, iW + 1, objArr6.length);
                Object[] objArr7 = this.f39334b;
                objArr7[objArr7.length - 1] = objArr7[0];
                m.k(objArr7, objArr7, 0, 1, iW2 + 1);
            }
            this.f39334b[iW2] = null;
        }
        this.f39335c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d.f39316a.b(i10, size());
        return this.f39334b[w(this.f39333a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iW = w(this.f39333a + size());
        int length = this.f39333a;
        if (length < iW) {
            while (length < iW) {
                if (kotlin.jvm.internal.s.c(obj, this.f39334b[length])) {
                    i10 = this.f39333a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iW) {
            return -1;
        }
        int length2 = this.f39334b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.s.c(obj, this.f39334b[length])) {
                i10 = this.f39333a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iW; i11++) {
            if (kotlin.jvm.internal.s.c(obj, this.f39334b[i11])) {
                length = i11 + this.f39334b.length;
                i10 = this.f39333a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f39334b[w(this.f39333a + t.n(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iW;
        int i10;
        int iW2 = w(this.f39333a + size());
        int i11 = this.f39333a;
        if (i11 < iW2) {
            iW = iW2 - 1;
            if (i11 <= iW) {
                while (!kotlin.jvm.internal.s.c(obj, this.f39334b[iW])) {
                    if (iW != i11) {
                        iW--;
                    }
                }
                i10 = this.f39333a;
                return iW - i10;
            }
            return -1;
        }
        if (i11 > iW2) {
            for (int i12 = iW2 - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.s.c(obj, this.f39334b[i12])) {
                    iW = i12 + this.f39334b.length;
                    i10 = this.f39333a;
                    return iW - i10;
                }
            }
            iW = o.W(this.f39334b);
            int i13 = this.f39333a;
            if (i13 <= iW) {
                while (!kotlin.jvm.internal.s.c(obj, this.f39334b[iW])) {
                    if (iW != i13) {
                        iW--;
                    }
                }
                i10 = this.f39333a;
                return iW - i10;
            }
        }
        return -1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f39334b[this.f39333a];
    }

    public final Object r() {
        if (isEmpty()) {
            return null;
        }
        return this.f39334b[w(this.f39333a + t.n(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iW;
        kotlin.jvm.internal.s.h(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f39334b.length != 0) {
            int iW2 = w(this.f39333a + size());
            int i10 = this.f39333a;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f39334b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f39334b[iW] = obj;
                        iW++;
                    }
                    i10++;
                }
                m.u(this.f39334b, null, iW, iW2);
            } else {
                int length = this.f39334b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f39334b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f39334b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f39334b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f39334b[iW] = obj3;
                        iW = p(iW);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                x();
                this.f39335c = u(iW - this.f39333a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        Object[] objArr = this.f39334b;
        int i10 = this.f39333a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f39333a = p(i10);
        this.f39335c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        int iW = w(this.f39333a + t.n(this));
        Object[] objArr = this.f39334b;
        Object obj = objArr[iW];
        objArr[iW] = null;
        this.f39335c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d.f39316a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            g(i10);
            return;
        }
        x();
        if (i10 < size() - i11) {
            A(i10, i11);
            int iW = w(this.f39333a + i12);
            v(this.f39333a, iW);
            this.f39333a = iW;
        } else {
            B(i10, i11);
            int iW2 = w(this.f39333a + size());
            v(u(iW2 - i12), iW2);
        }
        this.f39335c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iW;
        kotlin.jvm.internal.s.h(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f39334b.length != 0) {
            int iW2 = w(this.f39333a + size());
            int i10 = this.f39333a;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f39334b[i10];
                    if (elements.contains(obj)) {
                        this.f39334b[iW] = obj;
                        iW++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                m.u(this.f39334b, null, iW, iW2);
            } else {
                int length = this.f39334b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f39334b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f39334b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f39334b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f39334b[iW] = obj3;
                        iW = p(iW);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                x();
                this.f39335c = u(iW - this.f39333a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        d.f39316a.b(i10, size());
        int iW = w(this.f39333a + i10);
        Object[] objArr = this.f39334b;
        Object obj2 = objArr[iW];
        objArr[iW] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        if (array.length < size()) {
            array = k.a(array, size());
        }
        Object[] objArr = array;
        int iW = w(this.f39333a + size());
        int i10 = this.f39333a;
        if (i10 < iW) {
            m.o(this.f39334b, objArr, 0, i10, iW, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f39334b;
            m.k(objArr2, objArr, 0, this.f39333a, objArr2.length);
            Object[] objArr3 = this.f39334b;
            m.k(objArr3, objArr, objArr3.length - this.f39333a, 0, iW);
        }
        return s.f(size(), objArr);
    }

    public final Object y() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        d.f39316a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        x();
        n(size() + 1);
        int iW = w(this.f39333a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iM = m(iW);
            int iM2 = m(this.f39333a);
            int i11 = this.f39333a;
            if (iM >= i11) {
                Object[] objArr = this.f39334b;
                objArr[iM2] = objArr[i11];
                m.k(objArr, objArr, i11, i11 + 1, iM + 1);
            } else {
                Object[] objArr2 = this.f39334b;
                m.k(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f39334b;
                objArr3[objArr3.length - 1] = objArr3[0];
                m.k(objArr3, objArr3, 0, 1, iM + 1);
            }
            this.f39334b[iM] = obj;
            this.f39333a = iM2;
        } else {
            int iW2 = w(this.f39333a + size());
            if (iW < iW2) {
                Object[] objArr4 = this.f39334b;
                m.k(objArr4, objArr4, iW + 1, iW, iW2);
            } else {
                Object[] objArr5 = this.f39334b;
                m.k(objArr5, objArr5, 1, 0, iW2);
                Object[] objArr6 = this.f39334b;
                objArr6[0] = objArr6[objArr6.length - 1];
                m.k(objArr6, objArr6, iW + 1, iW, objArr6.length - 1);
            }
            this.f39334b[iW] = obj;
        }
        this.f39335c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.s.h(elements, "elements");
        d.f39316a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        x();
        n(size() + elements.size());
        int iW = w(this.f39333a + size());
        int iW2 = w(this.f39333a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f39333a;
            int length = i11 - size;
            if (iW2 < i11) {
                Object[] objArr = this.f39334b;
                m.k(objArr, objArr, length, i11, objArr.length);
                if (size >= iW2) {
                    Object[] objArr2 = this.f39334b;
                    m.k(objArr2, objArr2, objArr2.length - size, 0, iW2);
                } else {
                    Object[] objArr3 = this.f39334b;
                    m.k(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f39334b;
                    m.k(objArr4, objArr4, 0, size, iW2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f39334b;
                m.k(objArr5, objArr5, length, i11, iW2);
            } else {
                Object[] objArr6 = this.f39334b;
                length += objArr6.length;
                int i12 = iW2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.k(objArr6, objArr6, length, i11, iW2);
                } else {
                    m.k(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f39334b;
                    m.k(objArr7, objArr7, 0, this.f39333a + length2, iW2);
                }
            }
            this.f39333a = length;
            h(u(iW2 - size), elements);
        } else {
            int i13 = iW2 + size;
            if (iW2 < iW) {
                int i14 = size + iW;
                Object[] objArr8 = this.f39334b;
                if (i14 <= objArr8.length) {
                    m.k(objArr8, objArr8, i13, iW2, iW);
                } else if (i13 >= objArr8.length) {
                    m.k(objArr8, objArr8, i13 - objArr8.length, iW2, iW);
                } else {
                    int length3 = iW - (i14 - objArr8.length);
                    m.k(objArr8, objArr8, 0, length3, iW);
                    Object[] objArr9 = this.f39334b;
                    m.k(objArr9, objArr9, i13, iW2, length3);
                }
            } else {
                Object[] objArr10 = this.f39334b;
                m.k(objArr10, objArr10, size, 0, iW);
                Object[] objArr11 = this.f39334b;
                if (i13 >= objArr11.length) {
                    m.k(objArr11, objArr11, i13 - objArr11.length, iW2, objArr11.length);
                } else {
                    m.k(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f39334b;
                    m.k(objArr12, objArr12, i13, iW2, objArr12.length - size);
                }
            }
            h(iW2, elements);
        }
        return true;
    }

    public i() {
        this.f39334b = f39332e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
