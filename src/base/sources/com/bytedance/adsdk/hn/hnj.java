package com.bytedance.adsdk.hn;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class hnj<E> implements Collection<E>, Set<E> {
    private static int aq;
    private static int dkl;
    private static Object[] dse;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static Object[] f11960sk;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    int f11961hn;
    Object[] hnj;
    private int[] ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private fc<E, E> f11962ta;
    private static final int[] qor = new int[0];
    private static final Object[] gjv = new Object[0];

    public hnj() {
        this(0);
    }

    private void gjv(int i10) {
        if (i10 == 8) {
            synchronized (hnj.class) {
                Object[] objArr = dse;
                if (objArr != null) {
                    this.hnj = objArr;
                    dse = (Object[]) objArr[0];
                    this.ojm = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    aq--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (hnj.class) {
                Object[] objArr2 = f11960sk;
                if (objArr2 != null) {
                    this.hnj = objArr2;
                    f11960sk = (Object[]) objArr2[0];
                    this.ojm = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    dkl--;
                    return;
                }
            }
        }
        this.ojm = new int[i10];
        this.hnj = new Object[i10];
    }

    private int hnj(Object obj, int i10) {
        int i11 = this.f11961hn;
        if (i11 == 0) {
            return -1;
        }
        int iHnj = hn.hnj(this.ojm, i11, i10);
        if (iHnj < 0 || obj.equals(this.hnj[iHnj])) {
            return iHnj;
        }
        int i12 = iHnj + 1;
        while (i12 < i11 && this.ojm[i12] == i10) {
            if (obj.equals(this.hnj[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iHnj - 1; i13 >= 0 && this.ojm[i13] == i10; i13--) {
            if (obj.equals(this.hnj[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iHnj;
        if (e10 == null) {
            iHnj = hnj();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iHnj = hnj(e10, iHashCode);
        }
        if (iHnj >= 0) {
            return false;
        }
        int i11 = ~iHnj;
        int i12 = this.f11961hn;
        int[] iArr = this.ojm;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.hnj;
            gjv(i13);
            int[] iArr2 = this.ojm;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.hnj, 0, objArr.length);
            }
            hnj(iArr, objArr, this.f11961hn);
        }
        int i14 = this.f11961hn;
        if (i11 < i14) {
            int[] iArr3 = this.ojm;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.hnj;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f11961hn - i11);
        }
        this.ojm[i11] = i10;
        this.hnj[i11] = e10;
        this.f11961hn++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        hnj(this.f11961hn + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f11961hn;
        if (i10 != 0) {
            hnj(this.ojm, this.hnj, i10);
            this.ojm = qor;
            this.hnj = gjv;
            this.f11961hn = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return hnj(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f11961hn; i10++) {
                try {
                    if (!set.contains(hn(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.ojm;
        int i10 = this.f11961hn;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public E hn(int i10) {
        return (E) this.hnj[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f11961hn <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return hn().gjv().iterator();
    }

    public E qor(int i10) {
        Object[] objArr = this.hnj;
        E e10 = (E) objArr[i10];
        int i11 = this.f11961hn;
        if (i11 <= 1) {
            hnj(this.ojm, objArr, i11);
            this.ojm = qor;
            this.hnj = gjv;
            this.f11961hn = 0;
            return e10;
        }
        int[] iArr = this.ojm;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f11961hn = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.hnj;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f11961hn - i10);
            }
            this.hnj[this.f11961hn] = null;
            return e10;
        }
        gjv(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f11961hn--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.ojm, 0, i10);
            System.arraycopy(objArr, 0, this.hnj, 0, i10);
        }
        int i14 = this.f11961hn;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.ojm, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.hnj, i10, this.f11961hn - i10);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iHnj = hnj(obj);
        if (iHnj < 0) {
            return false;
        }
        qor(iHnj);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f11961hn - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.hnj[i10])) {
                qor(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f11961hn;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f11961hn;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.hnj, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f11961hn * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f11961hn; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eHn = hn(i10);
            if (eHn != this) {
                sb2.append(eHn);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public hnj(int i10) {
        if (i10 == 0) {
            this.ojm = qor;
            this.hnj = gjv;
        } else {
            gjv(i10);
        }
        this.f11961hn = 0;
    }

    private fc<E, E> hn() {
        if (this.f11962ta == null) {
            this.f11962ta = new fc<E, E>() { // from class: com.bytedance.adsdk.hn.hnj.1
                @Override // com.bytedance.adsdk.hn.fc
                protected Map<E, E> hn() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.hn.fc
                protected int hnj() {
                    return hnj.this.f11961hn;
                }

                @Override // com.bytedance.adsdk.hn.fc
                protected void qor() {
                    hnj.this.clear();
                }

                @Override // com.bytedance.adsdk.hn.fc
                protected Object hnj(int i10, int i11) {
                    return hnj.this.hnj[i10];
                }

                @Override // com.bytedance.adsdk.hn.fc
                protected int hnj(Object obj) {
                    return hnj.this.hnj(obj);
                }

                @Override // com.bytedance.adsdk.hn.fc
                protected void hnj(int i10) {
                    hnj.this.qor(i10);
                }
            };
        }
        return this.f11962ta;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f11961hn) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f11961hn));
        }
        System.arraycopy(this.hnj, 0, tArr, 0, this.f11961hn);
        int length = tArr.length;
        int i10 = this.f11961hn;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int hnj() {
        int i10 = this.f11961hn;
        if (i10 == 0) {
            return -1;
        }
        int iHnj = hn.hnj(this.ojm, i10, 0);
        if (iHnj < 0 || this.hnj[iHnj] == null) {
            return iHnj;
        }
        int i11 = iHnj + 1;
        while (i11 < i10 && this.ojm[i11] == 0) {
            if (this.hnj[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iHnj - 1; i12 >= 0 && this.ojm[i12] == 0; i12--) {
            if (this.hnj[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void hnj(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (hnj.class) {
                try {
                    if (aq < 10) {
                        objArr[0] = dse;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        dse = objArr;
                        aq++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (hnj.class) {
                try {
                    if (dkl < 10) {
                        objArr[0] = f11960sk;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f11960sk = objArr;
                        dkl++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void hnj(int i10) {
        int[] iArr = this.ojm;
        if (iArr.length < i10) {
            Object[] objArr = this.hnj;
            gjv(i10);
            int i11 = this.f11961hn;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.ojm, 0, i11);
                System.arraycopy(objArr, 0, this.hnj, 0, this.f11961hn);
            }
            hnj(iArr, objArr, this.f11961hn);
        }
    }

    public int hnj(Object obj) {
        return obj == null ? hnj() : hnj(obj, obj.hashCode());
    }
}
